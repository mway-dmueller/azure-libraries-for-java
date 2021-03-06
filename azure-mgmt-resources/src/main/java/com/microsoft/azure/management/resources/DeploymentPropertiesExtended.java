/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.resources.implementation.ProviderInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment properties with additional details.
 */
public class DeploymentPropertiesExtended {
    /**
     * Denotes the state of provisioning. Possible values include:
     * 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created',
     * 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The correlation ID of the deployment.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * The timestamp of the template deployment.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * The duration of the template deployment.
     */
    @JsonProperty(value = "duration", access = JsonProperty.Access.WRITE_ONLY)
    private String duration;

    /**
     * Key/value pairs that represent deployment output.
     */
    @JsonProperty(value = "outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /**
     * The list of resource providers needed for the deployment.
     */
    @JsonProperty(value = "providers", access = JsonProperty.Access.WRITE_ONLY)
    private List<ProviderInner> providers;

    /**
     * The list of deployment dependencies.
     */
    @JsonProperty(value = "dependencies", access = JsonProperty.Access.WRITE_ONLY)
    private List<Dependency> dependencies;

    /**
     * The URI referencing the template.
     */
    @JsonProperty(value = "templateLink", access = JsonProperty.Access.WRITE_ONLY)
    private TemplateLink templateLink;

    /**
     * Deployment parameters.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private Object parameters;

    /**
     * The URI referencing the parameters.
     */
    @JsonProperty(value = "parametersLink", access = JsonProperty.Access.WRITE_ONLY)
    private ParametersLink parametersLink;

    /**
     * The deployment mode. Possible values are Incremental and Complete.
     * Possible values include: 'Incremental', 'Complete'.
     */
    @JsonProperty(value = "mode", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentMode mode;

    /**
     * The debug setting of the deployment.
     */
    @JsonProperty(value = "debugSetting", access = JsonProperty.Access.WRITE_ONLY)
    private DebugSetting debugSetting;

    /**
     * The deployment on error behavior.
     */
    @JsonProperty(value = "onErrorDeployment", access = JsonProperty.Access.WRITE_ONLY)
    private OnErrorDeploymentExtended onErrorDeployment;

    /**
     * The hash produced for the template.
     */
    @JsonProperty(value = "templateHash", access = JsonProperty.Access.WRITE_ONLY)
    private String templateHash;

    /**
     * Array of provisioned resources.
     */
    @JsonProperty(value = "outputResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceReference> outputResources;

    /**
     * Array of validated resources.
     */
    @JsonProperty(value = "validatedResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceReference> validatedResources;

    /**
     * The deployment error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ErrorResponse error;

    /**
     * Get denotes the state of provisioning. Possible values include: 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the correlation ID of the deployment.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get the timestamp of the template deployment.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the duration of the template deployment.
     *
     * @return the duration value
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Get key/value pairs that represent deployment output.
     *
     * @return the outputs value
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get the list of resource providers needed for the deployment.
     *
     * @return the providers value
     */
    public List<ProviderInner> providers() {
        return this.providers;
    }

    /**
     * Get the list of deployment dependencies.
     *
     * @return the dependencies value
     */
    public List<Dependency> dependencies() {
        return this.dependencies;
    }

    /**
     * Get the URI referencing the template.
     *
     * @return the templateLink value
     */
    public TemplateLink templateLink() {
        return this.templateLink;
    }

    /**
     * Get deployment parameters.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Get the URI referencing the parameters.
     *
     * @return the parametersLink value
     */
    public ParametersLink parametersLink() {
        return this.parametersLink;
    }

    /**
     * Get the deployment mode. Possible values are Incremental and Complete. Possible values include: 'Incremental', 'Complete'.
     *
     * @return the mode value
     */
    public DeploymentMode mode() {
        return this.mode;
    }

    /**
     * Get the debug setting of the deployment.
     *
     * @return the debugSetting value
     */
    public DebugSetting debugSetting() {
        return this.debugSetting;
    }

    /**
     * Get the deployment on error behavior.
     *
     * @return the onErrorDeployment value
     */
    public OnErrorDeploymentExtended onErrorDeployment() {
        return this.onErrorDeployment;
    }

    /**
     * Get the hash produced for the template.
     *
     * @return the templateHash value
     */
    public String templateHash() {
        return this.templateHash;
    }

    /**
     * Get array of provisioned resources.
     *
     * @return the outputResources value
     */
    public List<ResourceReference> outputResources() {
        return this.outputResources;
    }

    /**
     * Get array of validated resources.
     *
     * @return the validatedResources value
     */
    public List<ResourceReference> validatedResources() {
        return this.validatedResources;
    }

    /**
     * Get the deployment error.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

}
