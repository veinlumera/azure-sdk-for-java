// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.models.Gallery;
import com.azure.resourcemanager.compute.models.GalleryImage;
import com.azure.resourcemanager.compute.fluent.models.GalleryInner;
import com.azure.resourcemanager.compute.models.GalleryUpdate;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import reactor.core.publisher.Mono;

/** The implementation for Gallery and its create and update interfaces. */
class GalleryImpl extends GroupableResourceImpl<Gallery, GalleryInner, GalleryImpl, ComputeManager>
    implements Gallery, Gallery.Definition, Gallery.Update {

    private GalleryUpdate updateParameters = new GalleryUpdate();

    GalleryImpl(String name, GalleryInner inner, ComputeManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Mono<Gallery> createResourceAsync() {
        return manager().serviceClient()
            .getGalleries()
            .createOrUpdateAsync(this.resourceGroupName(), this.name(), this.innerModel())
            .map(innerToFluentMap(this));
    }

    @Override
    public Mono<Gallery> updateResourceAsync() {
        if (this.innerModel().tags() != null) {
            // tags is set by super
            updateParameters.withTags(this.innerModel().tags());
        }

        return manager().serviceClient()
            .getGalleries()
            .updateAsync(this.resourceGroupName(), this.name(), updateParameters)
            .map(innerToFluentMap(this));
    }

    @Override
    public GalleryImpl update() {
        updateParameters = new GalleryUpdate();
        return super.update();
    }

    @Override
    protected Mono<GalleryInner> getInnerAsync() {
        return manager().serviceClient().getGalleries().getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }

    @Override
    public String description() {
        return this.innerModel().description();
    }

    @Override
    public String uniqueName() {
        return this.innerModel().identifier().uniqueName();
    }

    @Override
    public String provisioningState() {
        return this.innerModel().provisioningState().toString();
    }

    @Override
    public Mono<GalleryImage> getImageAsync(String imageName) {
        return this.manager().galleryImages().getByGalleryAsync(this.resourceGroupName(), this.name(), imageName);
    }

    @Override
    public GalleryImage getImage(String imageName) {
        return this.manager().galleryImages().getByGallery(this.resourceGroupName(), this.name(), imageName);
    }

    @Override
    public PagedFlux<GalleryImage> listImagesAsync() {
        return this.manager().galleryImages().listByGalleryAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public PagedIterable<GalleryImage> listImages() {
        return this.manager().galleryImages().listByGallery(this.resourceGroupName(), this.name());
    }

    @Override
    public GalleryImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
        } else {
            updateParameters.withDescription(description);
        }
        return this;
    }
}
