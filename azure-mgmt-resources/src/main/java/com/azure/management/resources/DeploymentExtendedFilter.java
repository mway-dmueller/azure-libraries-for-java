// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DeploymentExtendedFilter model.
 */
@Fluent
public final class DeploymentExtendedFilter {
    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the DeploymentExtendedFilter object itself.
     */
    public DeploymentExtendedFilter setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }
}
