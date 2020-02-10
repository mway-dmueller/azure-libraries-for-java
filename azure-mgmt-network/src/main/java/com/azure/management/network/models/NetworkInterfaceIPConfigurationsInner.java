// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

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
 * NetworkInterfaceIPConfigurations.
 */
public final class NetworkInterfaceIPConfigurationsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private NetworkInterfaceIPConfigurationsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of NetworkInterfaceIPConfigurationsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public NetworkInterfaceIPConfigurationsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(NetworkInterfaceIPConfigurationsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientNetworkInterfaceIPConfigurations to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientNetworkInterfaceIPConfigurations")
    private interface NetworkInterfaceIPConfigurationsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces/{networkInterfaceName}/ipConfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<NetworkInterfaceIPConfigurationListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("networkInterfaceName") String networkInterfaceName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces/{networkInterfaceName}/ipConfigurations/{ipConfigurationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<NetworkInterfaceIPConfigurationInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("networkInterfaceName") String networkInterfaceName, @PathParam("ipConfigurationName") String ipConfigurationName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<NetworkInterfaceIPConfigurationListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Get all ip configurations in a network interface.
     * 
     * @param resourceGroupName 
     * @param networkInterfaceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<NetworkInterfaceIPConfigurationInner>> listSinglePageAsync(String resourceGroupName, String networkInterfaceName) {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), resourceGroupName, networkInterfaceName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Get all ip configurations in a network interface.
     * 
     * @param resourceGroupName 
     * @param networkInterfaceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkInterfaceIPConfigurationInner> listAsync(String resourceGroupName, String networkInterfaceName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, networkInterfaceName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get all ip configurations in a network interface.
     * 
     * @param resourceGroupName 
     * @param networkInterfaceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkInterfaceIPConfigurationInner> list(String resourceGroupName, String networkInterfaceName) {
        return new PagedIterable<>(listAsync(resourceGroupName, networkInterfaceName));
    }

    /**
     * Gets the specified network interface ip configuration.
     * 
     * @param resourceGroupName 
     * @param networkInterfaceName 
     * @param ipConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<NetworkInterfaceIPConfigurationInner>> getWithResponseAsync(String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), resourceGroupName, networkInterfaceName, ipConfigurationName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the specified network interface ip configuration.
     * 
     * @param resourceGroupName 
     * @param networkInterfaceName 
     * @param ipConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkInterfaceIPConfigurationInner> getAsync(String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        return getWithResponseAsync(resourceGroupName, networkInterfaceName, ipConfigurationName)
            .flatMap((SimpleResponse<NetworkInterfaceIPConfigurationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified network interface ip configuration.
     * 
     * @param resourceGroupName 
     * @param networkInterfaceName 
     * @param ipConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkInterfaceIPConfigurationInner get(String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        return getAsync(resourceGroupName, networkInterfaceName, ipConfigurationName).block();
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
    public Mono<PagedResponse<NetworkInterfaceIPConfigurationInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
