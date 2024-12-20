// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.ReplicationExtensionModelInner;
import java.io.IOException;
import java.util.List;

/**
 * Replication extension model collection.
 */
@Fluent
public final class ReplicationExtensionModelCollection
    implements JsonSerializable<ReplicationExtensionModelCollection> {
    /*
     * Gets or sets the list of replication extensions.
     */
    private List<ReplicationExtensionModelInner> value;

    /*
     * Gets or sets the value of next link.
     */
    private String nextLink;

    /**
     * Creates an instance of ReplicationExtensionModelCollection class.
     */
    public ReplicationExtensionModelCollection() {
    }

    /**
     * Get the value property: Gets or sets the list of replication extensions.
     * 
     * @return the value value.
     */
    public List<ReplicationExtensionModelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets the list of replication extensions.
     * 
     * @param value the value value to set.
     * @return the ReplicationExtensionModelCollection object itself.
     */
    public ReplicationExtensionModelCollection withValue(List<ReplicationExtensionModelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the value of next link.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the value of next link.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ReplicationExtensionModelCollection object itself.
     */
    public ReplicationExtensionModelCollection withNextLink(String nextLink) {
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
     * Reads an instance of ReplicationExtensionModelCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReplicationExtensionModelCollection if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReplicationExtensionModelCollection.
     */
    public static ReplicationExtensionModelCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReplicationExtensionModelCollection deserializedReplicationExtensionModelCollection
                = new ReplicationExtensionModelCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ReplicationExtensionModelInner> value
                        = reader.readArray(reader1 -> ReplicationExtensionModelInner.fromJson(reader1));
                    deserializedReplicationExtensionModelCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedReplicationExtensionModelCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReplicationExtensionModelCollection;
        });
    }
}
