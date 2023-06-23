// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.resourcemanager.managementgroups.fluent.models.CheckNameAvailabilityResultInner;

/** An immutable client-side representation of CheckNameAvailabilityResult. */
public interface CheckNameAvailabilityResult {
    /**
     * Gets the nameAvailable property: Required. True indicates name is valid and available. False indicates the name
     * is invalid, unavailable, or both.
     *
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: Required if nameAvailable == false. Invalid indicates the name provided does not match
     * the resource provider's naming requirements (incorrect length, unsupported characters, etc.) AlreadyExists
     * indicates that the name is already in use and is therefore unavailable.
     *
     * @return the reason value.
     */
    Reason reason();

    /**
     * Gets the message property: Required if nameAvailable == false. Localized. If reason == invalid, provide the user
     * with the reason why the given name is invalid, and provide the resource naming requirements so that the user can
     * select a valid name. If reason == AlreadyExists, explain that is already in use, and direct them to select a
     * different name.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.managementgroups.fluent.models.CheckNameAvailabilityResultInner object.
     *
     * @return the inner object.
     */
    CheckNameAvailabilityResultInner innerModel();
}