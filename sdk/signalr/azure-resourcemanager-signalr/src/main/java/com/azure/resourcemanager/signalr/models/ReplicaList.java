// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.signalr.fluent.models.ReplicaInner;
import java.io.IOException;
import java.util.List;

/**
 * The ReplicaList model.
 */
@Fluent
public final class ReplicaList implements JsonSerializable<ReplicaList> {
    /*
     * List of the replica
     */
    private List<ReplicaInner> value;

    /*
     * The URL the client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    private String nextLink;

    /**
     * Creates an instance of ReplicaList class.
     */
    public ReplicaList() {
    }

    /**
     * Get the value property: List of the replica.
     * 
     * @return the value value.
     */
    public List<ReplicaInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of the replica.
     * 
     * @param value the value value to set.
     * @return the ReplicaList object itself.
     */
    public ReplicaList withValue(List<ReplicaInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL the client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL the client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ReplicaList object itself.
     */
    public ReplicaList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReplicaList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReplicaList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReplicaList.
     */
    public static ReplicaList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReplicaList deserializedReplicaList = new ReplicaList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ReplicaInner> value = reader.readArray(reader1 -> ReplicaInner.fromJson(reader1));
                    deserializedReplicaList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedReplicaList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReplicaList;
        });
    }
}
