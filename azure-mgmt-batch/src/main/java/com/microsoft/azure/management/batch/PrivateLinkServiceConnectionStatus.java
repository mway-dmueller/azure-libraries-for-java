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
 * Defines values for PrivateLinkServiceConnectionStatus.
 */
public enum PrivateLinkServiceConnectionStatus {
    /** The private endpoint connection is approved and can be used to access Batch account. */
    APPROVED("Approved"),

    /** The private endpoint connection is pending and cannot be used to access Batch account. */
    PENDING("Pending"),

    /** The private endpoint connection is rejected and cannot be used to access Batch account. */
    REJECTED("Rejected"),

    /** The private endpoint connection is disconnected and cannot be used to access Batch account. */
    DISCONNECTED("Disconnected");

    /** The actual serialized value for a PrivateLinkServiceConnectionStatus instance. */
    private String value;

    PrivateLinkServiceConnectionStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PrivateLinkServiceConnectionStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PrivateLinkServiceConnectionStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static PrivateLinkServiceConnectionStatus fromString(String value) {
        PrivateLinkServiceConnectionStatus[] items = PrivateLinkServiceConnectionStatus.values();
        for (PrivateLinkServiceConnectionStatus item : items) {
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
