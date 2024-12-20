// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.managementgroups.fluent.models.HierarchySettingsProperties;
import java.io.IOException;

/**
 * The hierarchy settings resource.
 */
@Fluent
public final class HierarchySettingsInfo implements JsonSerializable<HierarchySettingsInfo> {
    /*
     * The fully qualified ID for the settings object. For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000/settings/default.
     */
    private String id;

    /*
     * The type of the resource. For example, Microsoft.Management/managementGroups/settings.
     */
    private String type;

    /*
     * The name of the object. In this case, default.
     */
    private String name;

    /*
     * The generic properties of hierarchy settings.
     */
    private HierarchySettingsProperties innerProperties;

    /**
     * Creates an instance of HierarchySettingsInfo class.
     */
    public HierarchySettingsInfo() {
    }

    /**
     * Get the id property: The fully qualified ID for the settings object. For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000/settings/default.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type property: The type of the resource. For example, Microsoft.Management/managementGroups/settings.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the object. In this case, default.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the innerProperties property: The generic properties of hierarchy settings.
     * 
     * @return the innerProperties value.
     */
    private HierarchySettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the hierarchy settings. For example,
     * 00000000-0000-0000-0000-000000000000.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The AAD Tenant ID associated with the hierarchy settings. For example,
     * 00000000-0000-0000-0000-000000000000.
     * 
     * @param tenantId the tenantId value to set.
     * @return the HierarchySettingsInfo object itself.
     */
    public HierarchySettingsInfo withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HierarchySettingsProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the requireAuthorizationForGroupCreation property: Indicates whether RBAC access is required upon group
     * creation under the root Management Group. If set to true, user will require
     * Microsoft.Management/managementGroups/write action on the root Management Group scope in order to create new
     * Groups directly under the root. This will prevent new users from creating new Management Groups, unless they are
     * given access.
     * 
     * @return the requireAuthorizationForGroupCreation value.
     */
    public Boolean requireAuthorizationForGroupCreation() {
        return this.innerProperties() == null ? null : this.innerProperties().requireAuthorizationForGroupCreation();
    }

    /**
     * Set the requireAuthorizationForGroupCreation property: Indicates whether RBAC access is required upon group
     * creation under the root Management Group. If set to true, user will require
     * Microsoft.Management/managementGroups/write action on the root Management Group scope in order to create new
     * Groups directly under the root. This will prevent new users from creating new Management Groups, unless they are
     * given access.
     * 
     * @param requireAuthorizationForGroupCreation the requireAuthorizationForGroupCreation value to set.
     * @return the HierarchySettingsInfo object itself.
     */
    public HierarchySettingsInfo
        withRequireAuthorizationForGroupCreation(Boolean requireAuthorizationForGroupCreation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HierarchySettingsProperties();
        }
        this.innerProperties().withRequireAuthorizationForGroupCreation(requireAuthorizationForGroupCreation);
        return this;
    }

    /**
     * Get the defaultManagementGroup property: Settings that sets the default Management Group under which new
     * subscriptions get added in this tenant. For example,
     * /providers/Microsoft.Management/managementGroups/defaultGroup.
     * 
     * @return the defaultManagementGroup value.
     */
    public String defaultManagementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultManagementGroup();
    }

    /**
     * Set the defaultManagementGroup property: Settings that sets the default Management Group under which new
     * subscriptions get added in this tenant. For example,
     * /providers/Microsoft.Management/managementGroups/defaultGroup.
     * 
     * @param defaultManagementGroup the defaultManagementGroup value to set.
     * @return the HierarchySettingsInfo object itself.
     */
    public HierarchySettingsInfo withDefaultManagementGroup(String defaultManagementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HierarchySettingsProperties();
        }
        this.innerProperties().withDefaultManagementGroup(defaultManagementGroup);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HierarchySettingsInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HierarchySettingsInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HierarchySettingsInfo.
     */
    public static HierarchySettingsInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HierarchySettingsInfo deserializedHierarchySettingsInfo = new HierarchySettingsInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedHierarchySettingsInfo.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedHierarchySettingsInfo.type = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedHierarchySettingsInfo.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedHierarchySettingsInfo.innerProperties = HierarchySettingsProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHierarchySettingsInfo;
        });
    }
}
