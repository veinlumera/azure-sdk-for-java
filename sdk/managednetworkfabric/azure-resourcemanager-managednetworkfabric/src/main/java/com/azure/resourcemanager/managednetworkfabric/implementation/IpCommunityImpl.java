// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.IpCommunityInner;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.IpCommunity;
import com.azure.resourcemanager.managednetworkfabric.models.IpCommunityPatch;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.WellKnownCommunities;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class IpCommunityImpl implements IpCommunity, IpCommunity.Definition, IpCommunity.Update {
    private IpCommunityInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public CommunityActionTypes action() {
        return this.innerModel().action();
    }

    public List<WellKnownCommunities> wellKnownCommunities() {
        List<WellKnownCommunities> inner = this.innerModel().wellKnownCommunities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> communityMembers() {
        List<String> inner = this.innerModel().communityMembers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String annotation() {
        return this.innerModel().annotation();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public IpCommunityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String ipCommunityName;

    private IpCommunityPatch updateBody;

    public IpCommunityImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public IpCommunity create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpCommunities()
                .create(resourceGroupName, ipCommunityName, this.innerModel(), Context.NONE);
        return this;
    }

    public IpCommunity create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpCommunities()
                .create(resourceGroupName, ipCommunityName, this.innerModel(), context);
        return this;
    }

    IpCommunityImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new IpCommunityInner();
        this.serviceManager = serviceManager;
        this.ipCommunityName = name;
    }

    public IpCommunityImpl update() {
        this.updateBody = new IpCommunityPatch();
        return this;
    }

    public IpCommunity apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpCommunities()
                .update(resourceGroupName, ipCommunityName, updateBody, Context.NONE);
        return this;
    }

    public IpCommunity apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpCommunities()
                .update(resourceGroupName, ipCommunityName, updateBody, context);
        return this;
    }

    IpCommunityImpl(
        IpCommunityInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.ipCommunityName = Utils.getValueFromIdByName(innerObject.id(), "ipCommunities");
    }

    public IpCommunity refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpCommunities()
                .getByResourceGroupWithResponse(resourceGroupName, ipCommunityName, Context.NONE)
                .getValue();
        return this;
    }

    public IpCommunity refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpCommunities()
                .getByResourceGroupWithResponse(resourceGroupName, ipCommunityName, context)
                .getValue();
        return this;
    }

    public IpCommunityImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IpCommunityImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IpCommunityImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public IpCommunityImpl withAction(CommunityActionTypes action) {
        this.innerModel().withAction(action);
        return this;
    }

    public IpCommunityImpl withWellKnownCommunities(List<WellKnownCommunities> wellKnownCommunities) {
        this.innerModel().withWellKnownCommunities(wellKnownCommunities);
        return this;
    }

    public IpCommunityImpl withCommunityMembers(List<String> communityMembers) {
        this.innerModel().withCommunityMembers(communityMembers);
        return this;
    }

    public IpCommunityImpl withAnnotation(String annotation) {
        this.innerModel().withAnnotation(annotation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}