// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Job's execution template, containing container configuration for a job's execution. */
@Fluent
public final class JobExecutionTemplate {
    /*
     * List of container definitions for the Container Apps Job.
     */
    @JsonProperty(value = "containers")
    private List<JobExecutionContainer> containers;

    /*
     * List of specialized containers that run before job containers.
     */
    @JsonProperty(value = "initContainers")
    private List<JobExecutionContainer> initContainers;

    /** Creates an instance of JobExecutionTemplate class. */
    public JobExecutionTemplate() {
    }

    /**
     * Get the containers property: List of container definitions for the Container Apps Job.
     *
     * @return the containers value.
     */
    public List<JobExecutionContainer> containers() {
        return this.containers;
    }

    /**
     * Set the containers property: List of container definitions for the Container Apps Job.
     *
     * @param containers the containers value to set.
     * @return the JobExecutionTemplate object itself.
     */
    public JobExecutionTemplate withContainers(List<JobExecutionContainer> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Get the initContainers property: List of specialized containers that run before job containers.
     *
     * @return the initContainers value.
     */
    public List<JobExecutionContainer> initContainers() {
        return this.initContainers;
    }

    /**
     * Set the initContainers property: List of specialized containers that run before job containers.
     *
     * @param initContainers the initContainers value to set.
     * @return the JobExecutionTemplate object itself.
     */
    public JobExecutionTemplate withInitContainers(List<JobExecutionContainer> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containers() != null) {
            containers().forEach(e -> e.validate());
        }
        if (initContainers() != null) {
            initContainers().forEach(e -> e.validate());
        }
    }
}