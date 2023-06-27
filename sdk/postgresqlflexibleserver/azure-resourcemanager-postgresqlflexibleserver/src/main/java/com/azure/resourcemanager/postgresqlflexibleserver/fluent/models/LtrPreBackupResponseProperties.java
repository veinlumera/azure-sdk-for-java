// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response for the pre-backup request. */
@Fluent
public final class LtrPreBackupResponseProperties {
    /*
     * Number of storage containers the plugin will use during backup. More than one containers may be used for size
     * limitations, parallelism, or redundancy etc.
     */
    @JsonProperty(value = "numberOfContainers", required = true)
    private int numberOfContainers;

    /** Creates an instance of LtrPreBackupResponseProperties class. */
    public LtrPreBackupResponseProperties() {
    }

    /**
     * Get the numberOfContainers property: Number of storage containers the plugin will use during backup. More than
     * one containers may be used for size limitations, parallelism, or redundancy etc.
     *
     * @return the numberOfContainers value.
     */
    public int numberOfContainers() {
        return this.numberOfContainers;
    }

    /**
     * Set the numberOfContainers property: Number of storage containers the plugin will use during backup. More than
     * one containers may be used for size limitations, parallelism, or redundancy etc.
     *
     * @param numberOfContainers the numberOfContainers value to set.
     * @return the LtrPreBackupResponseProperties object itself.
     */
    public LtrPreBackupResponseProperties withNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}