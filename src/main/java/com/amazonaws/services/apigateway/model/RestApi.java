/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model;

import com.amazonaws.hal.*;
import com.amazonaws.http.*;

import java.util.*;

public interface RestApi extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "restapi:update", method = HttpMethodName.PATCH)
    RestApi updateRestApi(PatchDocument updateRestApiInput);

    /**
     *
     */
    @Link(relation = "restapi:delete", method = HttpMethodName.DELETE)
    void deleteRestApi();

    /**
     *
     */
    @Link(relation = "restapi:resources")
    Resources getResources();

    /**
     *
     */
    @Link(relation = "restapi:resources")
    Resources getResources(
        @UriVariable(name = "limit") Integer limit);

    /**
     *
     */
    @Link(relation = "restapi:resources")
    Resources getResources(
        @UriVariable(name = "embed") java.util.List<String> embed);

    /**
     *
     */
    @Link(relation = "restapi:resources")
    Resources getResources(
        @UriVariable(name = "limit") Integer limit, 
        @UriVariable(name = "embed") java.util.List<String> embed);

    /**
     *
     */
    @Link(relation = "restapi:deployments")
    Deployments getDeployments();

    /**
     *
     */
    @Link(relation = "restapi:deployments")
    Deployments getDeployments(
        @UriVariable(name = "limit") Integer limit);

    /**
     *
     */
    @Link(relation = "restapi:stages")
    Stages getStages();

    /**
     *
     */
    @Link(relation = "restapi:stages")
    Stages getStages(
        @UriVariable(name = "deployment_id") String deploymentId);

    /**
     *
     */
    @Link(relation = "restapi:models")
    Models getModels();

    /**
     *
     */
    @Link(relation = "resource:by-id")
    Resource getResourceById(
        @UriVariable(name = "resource_id") String resourceId);

    /**
     *
     */
    @Link(relation = "resource:by-id")
    Resource getResourceById(
        @UriVariable(name = "embed") java.util.List<String> embed, 
        @UriVariable(name = "resource_id") String resourceId);

    /**
     *
     */
    @Link(relation = "deployment:by-id")
    Deployment getDeploymentById(
        @UriVariable(name = "deployment_id") String deploymentId);

    /**
     *
     */
    @Link(relation = "deployment:by-id")
    Deployment getDeploymentById(
        @UriVariable(name = "embed") java.util.List<String> embed, 
        @UriVariable(name = "deployment_id") String deploymentId);

    /**
     *
     */
    @Link(relation = "stage:by-name")
    Stage getStageByName(
        @UriVariable(name = "stage_name") String stageName);

    /**
     *
     */
    @Link(relation = "model:by-name")
    Model getModelByName(
        @UriVariable(name = "model_name") String modelName);

    /**
     *
     */
    @Link(relation = "model:by-name")
    Model getModelByName(
        @UriVariable(name = "flatten") Boolean flatten, 
        @UriVariable(name = "model_name") String modelName);

    /**
     *
     */
    @Link(relation = "resource:create", method = HttpMethodName.POST)
    Resource createResource(CreateResourceInput createResourceInput);

    /**
     *
     */
    @Link(relation = "deployment:create", method = HttpMethodName.POST)
    Deployment createDeployment(CreateDeploymentInput createDeploymentInput);

    /**
     *
     */
    @Link(relation = "stage:create", method = HttpMethodName.POST)
    Stage createStage(CreateStageInput createStageInput);

    /**
     *
     */
    @Link(relation = "model:create", method = HttpMethodName.POST)
    Model createModel(CreateModelInput createModelInput);


    /**
     *
     */
    String getId();

    /**
     *
     */
    String getName();

    /**
     *
     */
    String getDescription();

    /**
     *
     */
    java.util.Date getCreatedDate();


}
