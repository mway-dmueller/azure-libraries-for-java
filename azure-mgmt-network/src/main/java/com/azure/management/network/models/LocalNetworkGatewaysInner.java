// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.management.network.TagsObject;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * LocalNetworkGateways.
 */
public final class LocalNetworkGatewaysInner implements InnerSupportsGet<LocalNetworkGatewayInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private LocalNetworkGatewaysService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LocalNetworkGatewaysInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public LocalNetworkGatewaysInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(LocalNetworkGatewaysService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientLocalNetworkGateways to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientLocalNetworkGateways")
    private interface LocalNetworkGatewaysService {
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LocalNetworkGatewayInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("localNetworkGatewayName") String localNetworkGatewayName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") LocalNetworkGatewayInner parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LocalNetworkGatewayInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("localNetworkGatewayName") String localNetworkGatewayName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("localNetworkGatewayName") String localNetworkGatewayName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LocalNetworkGatewayInner>> updateTags(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("localNetworkGatewayName") String localNetworkGatewayName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LocalNetworkGatewayListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LocalNetworkGatewayInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("localNetworkGatewayName") String localNetworkGatewayName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") LocalNetworkGatewayInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("localNetworkGatewayName") String localNetworkGatewayName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LocalNetworkGatewayInner>> beginUpdateTags(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("localNetworkGatewayName") String localNetworkGatewayName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LocalNetworkGatewayListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Creates or updates a local network gateway in the specified resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param parameters A common class for general resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LocalNetworkGatewayInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, localNetworkGatewayName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a local network gateway in the specified resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param parameters A common class for general resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalNetworkGatewayInner> createOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, localNetworkGatewayName, parameters)
            .flatMap((SimpleResponse<LocalNetworkGatewayInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a local network gateway in the specified resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param parameters A common class for general resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalNetworkGatewayInner createOrUpdate(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) {
        return createOrUpdateAsync(resourceGroupName, localNetworkGatewayName, parameters).block();
    }

    /**
     * Gets the specified local network gateway in a resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LocalNetworkGatewayInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String localNetworkGatewayName) {
        final String apiVersion = "2019-06-01";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, localNetworkGatewayName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the specified local network gateway in a resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalNetworkGatewayInner> getByResourceGroupAsync(String resourceGroupName, String localNetworkGatewayName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, localNetworkGatewayName)
            .flatMap((SimpleResponse<LocalNetworkGatewayInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified local network gateway in a resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalNetworkGatewayInner getByResourceGroup(String resourceGroupName, String localNetworkGatewayName) {
        return getByResourceGroupAsync(resourceGroupName, localNetworkGatewayName).block();
    }

    /**
     * Deletes the specified local network gateway.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String localNetworkGatewayName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, localNetworkGatewayName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified local network gateway.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String localNetworkGatewayName) {
        return deleteWithResponseAsync(resourceGroupName, localNetworkGatewayName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified local network gateway.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String localNetworkGatewayName) {
        deleteAsync(resourceGroupName, localNetworkGatewayName).block();
    }

    /**
     * Updates a local network gateway tags.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LocalNetworkGatewayInner>> updateTagsWithResponseAsync(String resourceGroupName, String localNetworkGatewayName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.updateTags(this.client.getHost(), resourceGroupName, localNetworkGatewayName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a local network gateway tags.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalNetworkGatewayInner> updateTagsAsync(String resourceGroupName, String localNetworkGatewayName, Map<String, String> tags) {
        return updateTagsWithResponseAsync(resourceGroupName, localNetworkGatewayName, tags)
            .flatMap((SimpleResponse<LocalNetworkGatewayInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a local network gateway tags.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalNetworkGatewayInner updateTags(String resourceGroupName, String localNetworkGatewayName, Map<String, String> tags) {
        return updateTagsAsync(resourceGroupName, localNetworkGatewayName, tags).block();
    }

    /**
     * Gets all the local network gateways in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LocalNetworkGatewayInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-06-01";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all the local network gateways in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LocalNetworkGatewayInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the local network gateways in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocalNetworkGatewayInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Creates or updates a local network gateway in the specified resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param parameters A common class for general resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LocalNetworkGatewayInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, localNetworkGatewayName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a local network gateway in the specified resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param parameters A common class for general resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalNetworkGatewayInner> beginCreateOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, localNetworkGatewayName, parameters)
            .flatMap((SimpleResponse<LocalNetworkGatewayInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a local network gateway in the specified resource group.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param parameters A common class for general resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalNetworkGatewayInner beginCreateOrUpdate(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGatewayInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, localNetworkGatewayName, parameters).block();
    }

    /**
     * Deletes the specified local network gateway.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String localNetworkGatewayName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, localNetworkGatewayName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified local network gateway.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String localNetworkGatewayName) {
        return beginDeleteWithResponseAsync(resourceGroupName, localNetworkGatewayName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified local network gateway.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String localNetworkGatewayName) {
        beginDeleteAsync(resourceGroupName, localNetworkGatewayName).block();
    }

    /**
     * Updates a local network gateway tags.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LocalNetworkGatewayInner>> beginUpdateTagsWithResponseAsync(String resourceGroupName, String localNetworkGatewayName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.beginUpdateTags(this.client.getHost(), resourceGroupName, localNetworkGatewayName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a local network gateway tags.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocalNetworkGatewayInner> beginUpdateTagsAsync(String resourceGroupName, String localNetworkGatewayName, Map<String, String> tags) {
        return beginUpdateTagsWithResponseAsync(resourceGroupName, localNetworkGatewayName, tags)
            .flatMap((SimpleResponse<LocalNetworkGatewayInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a local network gateway tags.
     * 
     * @param resourceGroupName 
     * @param localNetworkGatewayName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocalNetworkGatewayInner beginUpdateTags(String resourceGroupName, String localNetworkGatewayName, Map<String, String> tags) {
        return beginUpdateTagsAsync(resourceGroupName, localNetworkGatewayName, tags).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LocalNetworkGatewayInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
