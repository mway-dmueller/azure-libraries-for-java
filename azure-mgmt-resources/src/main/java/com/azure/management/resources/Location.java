// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Location model.
 */
@Immutable
public final class Location {
    /*
     * The fully qualified ID of the location. For example,
     * /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The subscription ID.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The location name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The display name of the location.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The latitude of the location.
     */
    @JsonProperty(value = "latitude", access = JsonProperty.Access.WRITE_ONLY)
    private String latitude;

    /*
     * The longitude of the location.
     */
    @JsonProperty(value = "longitude", access = JsonProperty.Access.WRITE_ONLY)
    private String longitude;

    /**
     * Get the id property: The fully qualified ID of the location. For
     * example,
     * /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the subscriptionId property: The subscription ID.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the name property: The location name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the displayName property: The display name of the location.
     * 
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the latitude property: The latitude of the location.
     * 
     * @return the latitude value.
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * Get the longitude property: The longitude of the location.
     * 
     * @return the longitude value.
     */
    public String getLongitude() {
        return this.longitude;
    }
}
