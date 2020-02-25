// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VirtualMachineSizes.
 */
public final class VirtualMachineSizesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualMachineSizesService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineSizesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineSizesInner(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(VirtualMachineSizesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ComputeManagementClientVirtualMachineSizes to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementClientVirtualMachineSizes")
    private interface VirtualMachineSizesService {
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/vmSizes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineSizeListResultInner>> list(@HostParam("$host") String host, @PathParam("location") String location, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);
    }

    /**
     * This API is deprecated. Use [Resources Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     * 
     * @param location 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualMachineSizeInner>> listSinglePageAsync(String location) {
        final String apiVersion = "2019-03-01";
        return service.list(this.client.getHost(), location, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            null,
            null));
    }

    /**
     * This API is deprecated. Use [Resources Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     * 
     * @param location 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualMachineSizeInner> listAsync(String location) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location));
    }

    /**
     * This API is deprecated. Use [Resources Skus](https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list).
     * 
     * @param location 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualMachineSizeInner> list(String location) {
        return new PagedIterable<>(listAsync(location));
    }
}