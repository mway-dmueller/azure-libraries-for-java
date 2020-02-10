// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The RouteFilterRuleListResult model.
 */
@Fluent
public final class RouteFilterRuleListResultInner {
    /*
     * Gets a list of RouteFilterRules in a resource group.
     */
    @JsonProperty(value = "value")
    private List<RouteFilterRuleInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets a list of RouteFilterRules in a resource
     * group.
     * 
     * @return the value value.
     */
    public List<RouteFilterRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a list of RouteFilterRules in a resource
     * group.
     * 
     * @param value the value value to set.
     * @return the RouteFilterRuleListResultInner object itself.
     */
    public RouteFilterRuleListResultInner withValue(List<RouteFilterRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the RouteFilterRuleListResultInner object itself.
     */
    public RouteFilterRuleListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
