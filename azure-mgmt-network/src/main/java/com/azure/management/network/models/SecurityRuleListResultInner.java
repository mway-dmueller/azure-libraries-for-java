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
 * The SecurityRuleListResult model.
 */
@Fluent
public final class SecurityRuleListResultInner {
    /*
     * The security rules in a network security group.
     */
    @JsonProperty(value = "value")
    private List<SecurityRuleInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The security rules in a network security group.
     * 
     * @return the value value.
     */
    public List<SecurityRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The security rules in a network security group.
     * 
     * @param value the value value to set.
     * @return the SecurityRuleListResultInner object itself.
     */
    public SecurityRuleListResultInner withValue(List<SecurityRuleInner> value) {
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
     * @return the SecurityRuleListResultInner object itself.
     */
    public SecurityRuleListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
