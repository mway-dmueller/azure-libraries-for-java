/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for IPAddressProvisioningType.
 */
public enum IPAddressProvisioningType {
    /** A public IP will be created and managed by Batch. There may be multiple public IPs depending on the size of the Pool. */
    BATCH_MANAGED("BatchManaged"),

    /** Public IPs are provided by the user and will be used to provision the Compute Nodes. */
    USER_MANAGED("UserManaged"),

    /** No public IP Address will be created for the Compute Nodes in the Pool. */
    NO_PUBLIC_IPADDRESSES("NoPublicIPAddresses");

    /** The actual serialized value for a IPAddressProvisioningType instance. */
    private String value;

    IPAddressProvisioningType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IPAddressProvisioningType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IPAddressProvisioningType object, or null if unable to parse.
     */
    @JsonCreator
    public static IPAddressProvisioningType fromString(String value) {
        IPAddressProvisioningType[] items = IPAddressProvisioningType.values();
        for (IPAddressProvisioningType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}