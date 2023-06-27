// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.resourcemanager.managednetworkfabric.fluent.models.SupportPackagePropertiesInner;

/** An immutable client-side representation of SupportPackageProperties. */
public interface SupportPackageProperties {
    /**
     * Gets the supportPackageUrl property: The URL to fetch the generated support package from.
     *
     * @return the supportPackageUrl value.
     */
    String supportPackageUrl();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.SupportPackagePropertiesInner object.
     *
     * @return the inner object.
     */
    SupportPackagePropertiesInner innerModel();
}