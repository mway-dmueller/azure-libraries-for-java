/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.management.resources.fluentcore.dag;

import com.azure.management.resources.fluentcore.model.Creatable;
import com.azure.management.resources.fluentcore.model.implementation.CreatableUpdatableImpl;
import com.azure.management.resources.fluentcore.model.implementation.CreateUpdateTask;
import org.junit.Assert;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link IPancake}
 */
class PancakeImpl
        extends CreatableUpdatableImpl<IPancake, PancakeInner, PancakeImpl>
        implements IPancake {
    final List<Creatable<IPancake>> delayedPancakes;
    final long eventDelayInMilliseconds;
    final Throwable errorToThrow;
    boolean prepareCalled = false;

    public PancakeImpl(String name, long eventDelayInMilliseconds) {
        this(name, eventDelayInMilliseconds, false);
    }

    public PancakeImpl(String name, long eventDelayInMilliseconds, boolean fault) {
        super(name, name, new PancakeInner());
        this.eventDelayInMilliseconds = eventDelayInMilliseconds;
        if (fault) {
            this.errorToThrow = new RuntimeException(name);
        } else {
            this.errorToThrow = null;
        }
        delayedPancakes = new ArrayList<>();
    }

    /**
     * a pancake specified via this wither will be added immediately as dependency.
     *
     * @param pancake the pancake
     * @return the next stage of pancake
     */
    @Override
    public PancakeImpl withInstantPancake(Creatable<IPancake> pancake) {
        this.addDependency(pancake);
        return this;
    }

    /**
     * a pancake specified via this wither will not be added immediately as a dependency, will be added only
     * inside beforeGroupCreateOrUpdate {@link CreateUpdateTask.ResourceCreatorUpdater#beforeGroupCreateOrUpdate()}
     *
     * @param pancake the pancake
     * @return the next stage of pancake
     */
    @Override
    public PancakeImpl withDelayedPancake(Creatable<IPancake> pancake) {
        this.delayedPancakes.add(pancake);
        return this;
    }

    @Override
    public void beforeGroupCreateOrUpdate() {
        Assert.assertFalse("PancakeImpl::beforeGroupCreateOrUpdate() should not be called multiple times", this.prepareCalled);
        prepareCalled = true;
        int oldCount = this.getTaskGroup().getNode(this.getKey()).dependencyKeys().size();
        for (Creatable<IPancake> pancake : this.delayedPancakes) {
            this.addDependency(pancake);
        }
        int newCount = this.getTaskGroup().getNode(this.getKey()).dependencyKeys().size();
        System.out.println("Pancake(" + this.getName() + ")::beforeGroupCreateOrUpdate() 'delayedSize':" + this.delayedPancakes.size()
                + " 'dependency count [old, new]': [" + oldCount + "," + newCount + "]");
    }

    @Override
    public Mono<IPancake> createResourceAsync() {
        if (this.errorToThrow == null) {
            System.out.println("Pancake(" + this.getName() + ")::createResourceAsync() 'onNext()'");
            return Mono.just(this)
                    .delayElement(Duration.ofMillis(this.eventDelayInMilliseconds))
                    .map(pancake -> pancake);
        } else {
            System.out.println("Pancake(" + this.getName() + ")::createResourceAsync() 'onError()'");
            return Mono.just(this)
                    .delayElement(Duration.ofMillis(this.eventDelayInMilliseconds))
                    .flatMap(pancake -> toErrorMono(errorToThrow));
        }
    }

    @Override
    public boolean isInCreateMode() {
        return true;
    }

    @Override
    protected Mono<PancakeInner> getInnerAsync() {
        return null;
    }

    private Mono<IPancake> toErrorMono(Throwable throwable) {
        return Mono.error(throwable);
    }
}
