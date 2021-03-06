/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.implementation;

import com.microsoft.azure.management.batch.PrivateEndpointConnectionProvisioningState;
import com.microsoft.azure.management.batch.PrivateEndpoint;
import com.microsoft.azure.management.batch.PrivateLinkServiceConnectionState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Contains information about a private link resource.
 */
@JsonFlatten
public class PrivateEndpointConnectionInner extends ProxyResource {
    /**
     * The provisioning state of the private endpoint connection.
     * Possible values include: 'Succeeded', 'Updating', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointConnectionProvisioningState provisioningState;

    /**
     * The ARM resource identifier of the private endpoint.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /**
     * The private link service connection state of the private endpoint
     * connection.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * The ETag of the resource, used for concurrency statements.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get possible values include: 'Succeeded', 'Updating', 'Failed'.
     *
     * @return the provisioningState value
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpoint value.
     *
     * @return the privateEndpoint value
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint value.
     *
     * @param privateEndpoint the privateEndpoint value to set
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState value.
     *
     * @return the privateLinkServiceConnectionState value
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState value.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the ETag of the resource, used for concurrency statements.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
