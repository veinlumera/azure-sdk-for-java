// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.L2NetworkDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.L2NetworkProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** L2Network represents a network that utilizes a single isolation domain set up for layer-2 resources. */
@Fluent
public final class L2NetworkInner extends Resource {
    /*
     * ExtendedLocation represents the Azure custom location where the resource will be created.
     *
     * The extended location of the cluster associated with the resource.
     */
    @JsonProperty(value = "extendedLocation", required = true)
    private ExtendedLocation extendedLocation;

    /*
     * L2NetworkProperties represents properties of the L2 network.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private L2NetworkProperties innerProperties = new L2NetworkProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of L2NetworkInner class. */
    public L2NetworkInner() {
    }

    /**
     * Get the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the L2NetworkInner object itself.
     */
    public L2NetworkInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: L2NetworkProperties represents properties of the L2 network.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private L2NetworkProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public L2NetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public L2NetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the clusterId property: The resource ID of the Network Cloud cluster this L2 network is associated with.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterId();
    }

    /**
     * Get the detailedStatus property: The more detailed status of the L2 network.
     *
     * @return the detailedStatus value.
     */
    public L2NetworkDetailedStatus detailedStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatus();
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatusMessage();
    }

    /**
     * Get the hybridAksClustersAssociatedIds property: The list of Hybrid AKS cluster resource ID(s) that are
     * associated with this L2 network.
     *
     * @return the hybridAksClustersAssociatedIds value.
     */
    public List<String> hybridAksClustersAssociatedIds() {
        return this.innerProperties() == null ? null : this.innerProperties().hybridAksClustersAssociatedIds();
    }

    /**
     * Get the hybridAksPluginType property: The network plugin type for Hybrid AKS.
     *
     * @return the hybridAksPluginType value.
     */
    public HybridAksPluginType hybridAksPluginType() {
        return this.innerProperties() == null ? null : this.innerProperties().hybridAksPluginType();
    }

    /**
     * Set the hybridAksPluginType property: The network plugin type for Hybrid AKS.
     *
     * @param hybridAksPluginType the hybridAksPluginType value to set.
     * @return the L2NetworkInner object itself.
     */
    public L2NetworkInner withHybridAksPluginType(HybridAksPluginType hybridAksPluginType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L2NetworkProperties();
        }
        this.innerProperties().withHybridAksPluginType(hybridAksPluginType);
        return this;
    }

    /**
     * Get the interfaceName property: The default interface name for this L2 network in the virtual machine. This name
     * can be overridden by the name supplied in the network attachment configuration of that virtual machine.
     *
     * @return the interfaceName value.
     */
    public String interfaceName() {
        return this.innerProperties() == null ? null : this.innerProperties().interfaceName();
    }

    /**
     * Set the interfaceName property: The default interface name for this L2 network in the virtual machine. This name
     * can be overridden by the name supplied in the network attachment configuration of that virtual machine.
     *
     * @param interfaceName the interfaceName value to set.
     * @return the L2NetworkInner object itself.
     */
    public L2NetworkInner withInterfaceName(String interfaceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L2NetworkProperties();
        }
        this.innerProperties().withInterfaceName(interfaceName);
        return this;
    }

    /**
     * Get the l2IsolationDomainId property: The resource ID of the Network Fabric l2IsolationDomain.
     *
     * @return the l2IsolationDomainId value.
     */
    public String l2IsolationDomainId() {
        return this.innerProperties() == null ? null : this.innerProperties().l2IsolationDomainId();
    }

    /**
     * Set the l2IsolationDomainId property: The resource ID of the Network Fabric l2IsolationDomain.
     *
     * @param l2IsolationDomainId the l2IsolationDomainId value to set.
     * @return the L2NetworkInner object itself.
     */
    public L2NetworkInner withL2IsolationDomainId(String l2IsolationDomainId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L2NetworkProperties();
        }
        this.innerProperties().withL2IsolationDomainId(l2IsolationDomainId);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the L2 network.
     *
     * @return the provisioningState value.
     */
    public L2NetworkProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the virtualMachinesAssociatedIds property: The list of virtual machine resource ID(s), excluding any Hybrid
     * AKS virtual machines, that are currently using this L2 network.
     *
     * @return the virtualMachinesAssociatedIds value.
     */
    public List<String> virtualMachinesAssociatedIds() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociatedIds();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property extendedLocation in model L2NetworkInner"));
        } else {
            extendedLocation().validate();
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model L2NetworkInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(L2NetworkInner.class);
}