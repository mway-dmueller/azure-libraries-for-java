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
 * Defines values for AutoUserScope.
 */
public enum AutoUserScope {
    /** Specifies that the service should create a new user for the task. */
    TASK("Task"),

    /** Specifies that the task runs as the common auto user account which is created on every node in a pool. */
    POOL("Pool");

    /** The actual serialized value for a AutoUserScope instance. */
    private String value;

    AutoUserScope(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutoUserScope instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AutoUserScope object, or null if unable to parse.
     */
    @JsonCreator
    public static AutoUserScope fromString(String value) {
        AutoUserScope[] items = AutoUserScope.values();
        for (AutoUserScope item : items) {
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
