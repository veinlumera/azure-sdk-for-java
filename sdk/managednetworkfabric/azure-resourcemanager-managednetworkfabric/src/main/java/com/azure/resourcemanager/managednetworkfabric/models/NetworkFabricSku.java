// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricSkuInner;

/** An immutable client-side representation of NetworkFabricSku. */
public interface NetworkFabricSku {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the typePropertiesType property: Type of Network Fabric Sku.
     *
     * @return the typePropertiesType value.
     */
    String typePropertiesType();

    /**
     * Gets the maxComputeRacks property: Maximum number of compute racks available for this Network Fabric SKU.
     *
     * @return the maxComputeRacks value.
     */
    Integer maxComputeRacks();

    /**
     * Gets the minSupportedVer property: Minimum supported version.
     *
     * @return the minSupportedVer value.
     */
    String minSupportedVer();

    /**
     * Gets the maxSupportedVer property: Maximum supported version.
     *
     * @return the maxSupportedVer value.
     */
    String maxSupportedVer();

    /**
     * Gets the detailsUri property: The URI gives full details of sku.
     *
     * @return the detailsUri value.
     */
    String detailsUri();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricSkuInner object.
     *
     * @return the inner object.
     */
    NetworkFabricSkuInner innerModel();
}