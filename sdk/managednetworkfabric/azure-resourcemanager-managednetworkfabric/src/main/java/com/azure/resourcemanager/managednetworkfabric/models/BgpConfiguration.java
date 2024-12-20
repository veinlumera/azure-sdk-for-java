// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * BGP configuration properties.
 */
@Fluent
public class BgpConfiguration extends AnnotationResource {
    /*
     * BFD configuration properties
     */
    private BfdConfiguration bfdConfiguration;

    /*
     * Originate a defaultRoute. Ex: "True" | "False".
     */
    private BooleanEnumProperty defaultRouteOriginate;

    /*
     * Allows for routes to be received and processed even if the router detects its own ASN in the AS-Path. 0 is
     * disable, Possible values are 1-10, default is 2.
     */
    private Integer allowAS;

    /*
     * Enable Or Disable state.
     */
    private AllowASOverride allowASOverride;

    /*
     * ASN of Network Fabric. Example: 65048.
     */
    private Long fabricAsn;

    /*
     * Peer ASN. Example: 65047.
     */
    private Long peerAsn;

    /*
     * List of BGP IPv4 Listen Range prefixes.
     */
    private List<String> ipv4ListenRangePrefixes;

    /*
     * List of BGP IPv6 Listen Ranges prefixes.
     */
    private List<String> ipv6ListenRangePrefixes;

    /*
     * List with stringified IPv4 Neighbor Addresses.
     */
    private List<NeighborAddress> ipv4NeighborAddress;

    /*
     * List with stringified IPv6 Neighbor Address.
     */
    private List<NeighborAddress> ipv6NeighborAddress;

    /**
     * Creates an instance of BgpConfiguration class.
     */
    public BgpConfiguration() {
    }

    /**
     * Get the bfdConfiguration property: BFD configuration properties.
     * 
     * @return the bfdConfiguration value.
     */
    public BfdConfiguration bfdConfiguration() {
        return this.bfdConfiguration;
    }

    /**
     * Set the bfdConfiguration property: BFD configuration properties.
     * 
     * @param bfdConfiguration the bfdConfiguration value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withBfdConfiguration(BfdConfiguration bfdConfiguration) {
        this.bfdConfiguration = bfdConfiguration;
        return this;
    }

    /**
     * Get the defaultRouteOriginate property: Originate a defaultRoute. Ex: "True" | "False".
     * 
     * @return the defaultRouteOriginate value.
     */
    public BooleanEnumProperty defaultRouteOriginate() {
        return this.defaultRouteOriginate;
    }

    /**
     * Set the defaultRouteOriginate property: Originate a defaultRoute. Ex: "True" | "False".
     * 
     * @param defaultRouteOriginate the defaultRouteOriginate value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withDefaultRouteOriginate(BooleanEnumProperty defaultRouteOriginate) {
        this.defaultRouteOriginate = defaultRouteOriginate;
        return this;
    }

    /**
     * Get the allowAS property: Allows for routes to be received and processed even if the router detects its own ASN
     * in the AS-Path. 0 is disable, Possible values are 1-10, default is 2.
     * 
     * @return the allowAS value.
     */
    public Integer allowAS() {
        return this.allowAS;
    }

    /**
     * Set the allowAS property: Allows for routes to be received and processed even if the router detects its own ASN
     * in the AS-Path. 0 is disable, Possible values are 1-10, default is 2.
     * 
     * @param allowAS the allowAS value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withAllowAS(Integer allowAS) {
        this.allowAS = allowAS;
        return this;
    }

    /**
     * Get the allowASOverride property: Enable Or Disable state.
     * 
     * @return the allowASOverride value.
     */
    public AllowASOverride allowASOverride() {
        return this.allowASOverride;
    }

    /**
     * Set the allowASOverride property: Enable Or Disable state.
     * 
     * @param allowASOverride the allowASOverride value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withAllowASOverride(AllowASOverride allowASOverride) {
        this.allowASOverride = allowASOverride;
        return this;
    }

    /**
     * Get the fabricAsn property: ASN of Network Fabric. Example: 65048.
     * 
     * @return the fabricAsn value.
     */
    public Long fabricAsn() {
        return this.fabricAsn;
    }

    /**
     * Set the fabricAsn property: ASN of Network Fabric. Example: 65048.
     * 
     * @param fabricAsn the fabricAsn value to set.
     * @return the BgpConfiguration object itself.
     */
    BgpConfiguration withFabricAsn(Long fabricAsn) {
        this.fabricAsn = fabricAsn;
        return this;
    }

    /**
     * Get the peerAsn property: Peer ASN. Example: 65047.
     * 
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: Peer ASN. Example: 65047.
     * 
     * @param peerAsn the peerAsn value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the ipv4ListenRangePrefixes property: List of BGP IPv4 Listen Range prefixes.
     * 
     * @return the ipv4ListenRangePrefixes value.
     */
    public List<String> ipv4ListenRangePrefixes() {
        return this.ipv4ListenRangePrefixes;
    }

    /**
     * Set the ipv4ListenRangePrefixes property: List of BGP IPv4 Listen Range prefixes.
     * 
     * @param ipv4ListenRangePrefixes the ipv4ListenRangePrefixes value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withIpv4ListenRangePrefixes(List<String> ipv4ListenRangePrefixes) {
        this.ipv4ListenRangePrefixes = ipv4ListenRangePrefixes;
        return this;
    }

    /**
     * Get the ipv6ListenRangePrefixes property: List of BGP IPv6 Listen Ranges prefixes.
     * 
     * @return the ipv6ListenRangePrefixes value.
     */
    public List<String> ipv6ListenRangePrefixes() {
        return this.ipv6ListenRangePrefixes;
    }

    /**
     * Set the ipv6ListenRangePrefixes property: List of BGP IPv6 Listen Ranges prefixes.
     * 
     * @param ipv6ListenRangePrefixes the ipv6ListenRangePrefixes value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withIpv6ListenRangePrefixes(List<String> ipv6ListenRangePrefixes) {
        this.ipv6ListenRangePrefixes = ipv6ListenRangePrefixes;
        return this;
    }

    /**
     * Get the ipv4NeighborAddress property: List with stringified IPv4 Neighbor Addresses.
     * 
     * @return the ipv4NeighborAddress value.
     */
    public List<NeighborAddress> ipv4NeighborAddress() {
        return this.ipv4NeighborAddress;
    }

    /**
     * Set the ipv4NeighborAddress property: List with stringified IPv4 Neighbor Addresses.
     * 
     * @param ipv4NeighborAddress the ipv4NeighborAddress value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withIpv4NeighborAddress(List<NeighborAddress> ipv4NeighborAddress) {
        this.ipv4NeighborAddress = ipv4NeighborAddress;
        return this;
    }

    /**
     * Get the ipv6NeighborAddress property: List with stringified IPv6 Neighbor Address.
     * 
     * @return the ipv6NeighborAddress value.
     */
    public List<NeighborAddress> ipv6NeighborAddress() {
        return this.ipv6NeighborAddress;
    }

    /**
     * Set the ipv6NeighborAddress property: List with stringified IPv6 Neighbor Address.
     * 
     * @param ipv6NeighborAddress the ipv6NeighborAddress value to set.
     * @return the BgpConfiguration object itself.
     */
    public BgpConfiguration withIpv6NeighborAddress(List<NeighborAddress> ipv6NeighborAddress) {
        this.ipv6NeighborAddress = ipv6NeighborAddress;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BgpConfiguration withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (bfdConfiguration() != null) {
            bfdConfiguration().validate();
        }
        if (ipv4NeighborAddress() != null) {
            ipv4NeighborAddress().forEach(e -> e.validate());
        }
        if (ipv6NeighborAddress() != null) {
            ipv6NeighborAddress().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("annotation", annotation());
        jsonWriter.writeJsonField("bfdConfiguration", this.bfdConfiguration);
        jsonWriter.writeStringField("defaultRouteOriginate",
            this.defaultRouteOriginate == null ? null : this.defaultRouteOriginate.toString());
        jsonWriter.writeNumberField("allowAS", this.allowAS);
        jsonWriter.writeStringField("allowASOverride",
            this.allowASOverride == null ? null : this.allowASOverride.toString());
        jsonWriter.writeNumberField("peerASN", this.peerAsn);
        jsonWriter.writeArrayField("ipv4ListenRangePrefixes", this.ipv4ListenRangePrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("ipv6ListenRangePrefixes", this.ipv6ListenRangePrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("ipv4NeighborAddress", this.ipv4NeighborAddress,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("ipv6NeighborAddress", this.ipv6NeighborAddress,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BgpConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BgpConfiguration if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BgpConfiguration.
     */
    public static BgpConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BgpConfiguration deserializedBgpConfiguration = new BgpConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("annotation".equals(fieldName)) {
                    deserializedBgpConfiguration.withAnnotation(reader.getString());
                } else if ("bfdConfiguration".equals(fieldName)) {
                    deserializedBgpConfiguration.bfdConfiguration = BfdConfiguration.fromJson(reader);
                } else if ("defaultRouteOriginate".equals(fieldName)) {
                    deserializedBgpConfiguration.defaultRouteOriginate
                        = BooleanEnumProperty.fromString(reader.getString());
                } else if ("allowAS".equals(fieldName)) {
                    deserializedBgpConfiguration.allowAS = reader.getNullable(JsonReader::getInt);
                } else if ("allowASOverride".equals(fieldName)) {
                    deserializedBgpConfiguration.allowASOverride = AllowASOverride.fromString(reader.getString());
                } else if ("fabricASN".equals(fieldName)) {
                    deserializedBgpConfiguration.fabricAsn = reader.getNullable(JsonReader::getLong);
                } else if ("peerASN".equals(fieldName)) {
                    deserializedBgpConfiguration.peerAsn = reader.getNullable(JsonReader::getLong);
                } else if ("ipv4ListenRangePrefixes".equals(fieldName)) {
                    List<String> ipv4ListenRangePrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedBgpConfiguration.ipv4ListenRangePrefixes = ipv4ListenRangePrefixes;
                } else if ("ipv6ListenRangePrefixes".equals(fieldName)) {
                    List<String> ipv6ListenRangePrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedBgpConfiguration.ipv6ListenRangePrefixes = ipv6ListenRangePrefixes;
                } else if ("ipv4NeighborAddress".equals(fieldName)) {
                    List<NeighborAddress> ipv4NeighborAddress
                        = reader.readArray(reader1 -> NeighborAddress.fromJson(reader1));
                    deserializedBgpConfiguration.ipv4NeighborAddress = ipv4NeighborAddress;
                } else if ("ipv6NeighborAddress".equals(fieldName)) {
                    List<NeighborAddress> ipv6NeighborAddress
                        = reader.readArray(reader1 -> NeighborAddress.fromJson(reader1));
                    deserializedBgpConfiguration.ipv6NeighborAddress = ipv6NeighborAddress;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBgpConfiguration;
        });
    }
}
