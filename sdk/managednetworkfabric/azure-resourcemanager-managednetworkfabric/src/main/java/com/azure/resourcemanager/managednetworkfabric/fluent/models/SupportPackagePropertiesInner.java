// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Generate support package post action properties. */
@Fluent
public final class SupportPackagePropertiesInner {
    /*
     * The URL to fetch the generated support package from.
     */
    @JsonProperty(value = "supportPackageURL", required = true)
    private String supportPackageUrl;

    /** Creates an instance of SupportPackagePropertiesInner class. */
    public SupportPackagePropertiesInner() {
    }

    /**
     * Get the supportPackageUrl property: The URL to fetch the generated support package from.
     *
     * @return the supportPackageUrl value.
     */
    public String supportPackageUrl() {
        return this.supportPackageUrl;
    }

    /**
     * Set the supportPackageUrl property: The URL to fetch the generated support package from.
     *
     * @param supportPackageUrl the supportPackageUrl value to set.
     * @return the SupportPackagePropertiesInner object itself.
     */
    public SupportPackagePropertiesInner withSupportPackageUrl(String supportPackageUrl) {
        this.supportPackageUrl = supportPackageUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportPackageUrl() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property supportPackageUrl in model SupportPackagePropertiesInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SupportPackagePropertiesInner.class);
}