/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResponseMetaData model.
 */
public class ResponseMetaData {
    /**
     * Source of the Data.
     */
    @JsonProperty(value = "dataSource")
    private DataSource dataSource;

    /**
     * Get source of the Data.
     *
     * @return the dataSource value
     */
    public DataSource dataSource() {
        return this.dataSource;
    }

    /**
     * Set source of the Data.
     *
     * @param dataSource the dataSource value to set
     * @return the ResponseMetaData object itself.
     */
    public ResponseMetaData withDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

}