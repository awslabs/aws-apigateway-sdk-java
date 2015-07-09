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

public interface Deployments extends ResourceInfo {

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
    @Link(relation = "deployment:create", method = HttpMethodName.POST)
    Deployment createDeployment(CreateDeploymentInput createDeploymentInput);

    /**
     *
     */
    @Link(relation = "next")
    Deployments getNext();

    /**
     *
     */
    @Link(relation = "first")
    Deployments getFirst();

    /**
     *
     */
    @Link(relation = "item")
    java.util.List<Deployment> getItem();



}
