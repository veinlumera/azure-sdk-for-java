// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Determines if geo-backup is supported in this region. "Enabled" means geo-backup is supported. "Disabled" stands for
 * geo-back is not supported.
 */
public final class GeoBackupSupportedEnum extends ExpandableStringEnum<GeoBackupSupportedEnum> {
    /** Static value Enabled for GeoBackupSupportedEnum. */
    public static final GeoBackupSupportedEnum ENABLED = fromString("Enabled");

    /** Static value Disabled for GeoBackupSupportedEnum. */
    public static final GeoBackupSupportedEnum DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of GeoBackupSupportedEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GeoBackupSupportedEnum() {
    }

    /**
     * Creates or finds a GeoBackupSupportedEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GeoBackupSupportedEnum.
     */
    @JsonCreator
    public static GeoBackupSupportedEnum fromString(String name) {
        return fromString(name, GeoBackupSupportedEnum.class);
    }

    /**
     * Gets known GeoBackupSupportedEnum values.
     *
     * @return known GeoBackupSupportedEnum values.
     */
    public static Collection<GeoBackupSupportedEnum> values() {
        return values(GeoBackupSupportedEnum.class);
    }
}