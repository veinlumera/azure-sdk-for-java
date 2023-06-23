// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The generic properties of a management group. */
@Fluent
public final class ManagementGroupInfoProperties {
    /*
     * The AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The friendly name of the management group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /** Creates an instance of ManagementGroupInfoProperties class. */
    public ManagementGroupInfoProperties() {
    }

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagementGroupInfoProperties object itself.
     */
    public ManagementGroupInfoProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the displayName property: The friendly name of the management group.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The friendly name of the management group.
     *
     * @param displayName the displayName value to set.
     * @return the ManagementGroupInfoProperties object itself.
     */
    public ManagementGroupInfoProperties withDisplayName(String displayName) {
        this.displayName = displayName;
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