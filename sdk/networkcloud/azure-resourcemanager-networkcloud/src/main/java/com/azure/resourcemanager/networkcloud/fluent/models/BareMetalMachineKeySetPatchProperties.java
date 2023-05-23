// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.models.KeySetUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * BareMetalMachineKeySetPatchProperties represents the properties of bare metal machine key set that can be patched.
 */
@Fluent
public final class BareMetalMachineKeySetPatchProperties {
    /*
     * The date and time after which the users in this key set will be removed from the bare metal machines.
     */
    @JsonProperty(value = "expiration")
    private OffsetDateTime expiration;

    /*
     * The list of IP addresses of jump hosts with management network access from which a login will be allowed for the
     * users.
     */
    @JsonProperty(value = "jumpHostsAllowed")
    private List<String> jumpHostsAllowed;

    /*
     * The unique list of permitted users.
     */
    @JsonProperty(value = "userList")
    private List<KeySetUser> userList;

    /** Creates an instance of BareMetalMachineKeySetPatchProperties class. */
    public BareMetalMachineKeySetPatchProperties() {
    }

    /**
     * Get the expiration property: The date and time after which the users in this key set will be removed from the
     * bare metal machines.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration property: The date and time after which the users in this key set will be removed from the
     * bare metal machines.
     *
     * @param expiration the expiration value to set.
     * @return the BareMetalMachineKeySetPatchProperties object itself.
     */
    public BareMetalMachineKeySetPatchProperties withExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Get the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network access from
     * which a login will be allowed for the users.
     *
     * @return the jumpHostsAllowed value.
     */
    public List<String> jumpHostsAllowed() {
        return this.jumpHostsAllowed;
    }

    /**
     * Set the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network access from
     * which a login will be allowed for the users.
     *
     * @param jumpHostsAllowed the jumpHostsAllowed value to set.
     * @return the BareMetalMachineKeySetPatchProperties object itself.
     */
    public BareMetalMachineKeySetPatchProperties withJumpHostsAllowed(List<String> jumpHostsAllowed) {
        this.jumpHostsAllowed = jumpHostsAllowed;
        return this;
    }

    /**
     * Get the userList property: The unique list of permitted users.
     *
     * @return the userList value.
     */
    public List<KeySetUser> userList() {
        return this.userList;
    }

    /**
     * Set the userList property: The unique list of permitted users.
     *
     * @param userList the userList value to set.
     * @return the BareMetalMachineKeySetPatchProperties object itself.
     */
    public BareMetalMachineKeySetPatchProperties withUserList(List<KeySetUser> userList) {
        this.userList = userList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userList() != null) {
            userList().forEach(e -> e.validate());
        }
    }
}