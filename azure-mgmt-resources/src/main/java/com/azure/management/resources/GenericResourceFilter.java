// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GenericResourceFilter model.
 */
@Fluent
public final class GenericResourceFilter {
    /*
     * The resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The tag name.
     */
    @JsonProperty(value = "tagname")
    private String tagname;

    /*
     * The tag value.
     */
    @JsonProperty(value = "tagvalue")
    private String tagvalue;

    /**
     * Get the resourceType property: The resource type.
     * 
     * @return the resourceType value.
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resource type.
     * 
     * @param resourceType the resourceType value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the tagname property: The tag name.
     * 
     * @return the tagname value.
     */
    public String getTagname() {
        return this.tagname;
    }

    /**
     * Set the tagname property: The tag name.
     * 
     * @param tagname the tagname value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter setTagname(String tagname) {
        this.tagname = tagname;
        return this;
    }

    /**
     * Get the tagvalue property: The tag value.
     * 
     * @return the tagvalue value.
     */
    public String getTagvalue() {
        return this.tagvalue;
    }

    /**
     * Set the tagvalue property: The tag value.
     * 
     * @param tagvalue the tagvalue value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter setTagvalue(String tagvalue) {
        this.tagvalue = tagvalue;
        return this;
    }
}
