// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.resourcemanager.managementgroups.fluent.models.HierarchySettingsListInner;
import java.util.List;

/** An immutable client-side representation of HierarchySettingsList. */
public interface HierarchySettingsList {
    /**
     * Gets the value property: The list of hierarchy settings.
     *
     * @return the value value.
     */
    List<HierarchySettingsInfo> value();

    /**
     * Gets the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.managementgroups.fluent.models.HierarchySettingsListInner object.
     *
     * @return the inner object.
     */
    HierarchySettingsListInner innerModel();
}