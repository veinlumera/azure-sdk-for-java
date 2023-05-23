// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.NamespaceTopicUpdateParameterProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the namespace topic update. */
@Fluent
public final class NamespaceTopicUpdateParameters {
    /*
     * Properties of the namespace topic resource.
     */
    @JsonProperty(value = "properties")
    private NamespaceTopicUpdateParameterProperties innerProperties;

    /** Creates an instance of NamespaceTopicUpdateParameters class. */
    public NamespaceTopicUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties of the namespace topic resource.
     *
     * @return the innerProperties value.
     */
    private NamespaceTopicUpdateParameterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the eventRetentionInDays property: Event retention for the namespace topic expressed in days. The property
     * default value is 1 day. Min event retention duration value is 1 day and max event retention duration value is 1
     * day.
     *
     * @return the eventRetentionInDays value.
     */
    public Integer eventRetentionInDays() {
        return this.innerProperties() == null ? null : this.innerProperties().eventRetentionInDays();
    }

    /**
     * Set the eventRetentionInDays property: Event retention for the namespace topic expressed in days. The property
     * default value is 1 day. Min event retention duration value is 1 day and max event retention duration value is 1
     * day.
     *
     * @param eventRetentionInDays the eventRetentionInDays value to set.
     * @return the NamespaceTopicUpdateParameters object itself.
     */
    public NamespaceTopicUpdateParameters withEventRetentionInDays(Integer eventRetentionInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceTopicUpdateParameterProperties();
        }
        this.innerProperties().withEventRetentionInDays(eventRetentionInDays);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}