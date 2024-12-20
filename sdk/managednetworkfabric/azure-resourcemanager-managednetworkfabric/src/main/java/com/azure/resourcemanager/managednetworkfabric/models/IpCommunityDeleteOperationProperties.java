// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * IP Community delete operation properties.
 */
@Fluent
public class IpCommunityDeleteOperationProperties implements JsonSerializable<IpCommunityDeleteOperationProperties> {
    /*
     * List of IP Community IDs.
     */
    private IpCommunityIdList delete;

    /**
     * Creates an instance of IpCommunityDeleteOperationProperties class.
     */
    public IpCommunityDeleteOperationProperties() {
    }

    /**
     * Get the delete property: List of IP Community IDs.
     * 
     * @return the delete value.
     */
    public IpCommunityIdList delete() {
        return this.delete;
    }

    /**
     * Set the delete property: List of IP Community IDs.
     * 
     * @param delete the delete value to set.
     * @return the IpCommunityDeleteOperationProperties object itself.
     */
    public IpCommunityDeleteOperationProperties withDelete(IpCommunityIdList delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (delete() != null) {
            delete().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("delete", this.delete);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpCommunityDeleteOperationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpCommunityDeleteOperationProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IpCommunityDeleteOperationProperties.
     */
    public static IpCommunityDeleteOperationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpCommunityDeleteOperationProperties deserializedIpCommunityDeleteOperationProperties
                = new IpCommunityDeleteOperationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("delete".equals(fieldName)) {
                    deserializedIpCommunityDeleteOperationProperties.delete = IpCommunityIdList.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpCommunityDeleteOperationProperties;
        });
    }
}
