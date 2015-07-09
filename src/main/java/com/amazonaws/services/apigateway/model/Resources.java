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

public interface Resources extends ResourceInfo {

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
    @Link(relation = "resource:create", method = HttpMethodName.POST)
    Resource createResource(CreateResourceInput createResourceInput, 
        @UriVariable(name = "parent_id") String parentId);

    /**
     *
     */
    @Link(relation = "next")
    Resources getNext();

    /**
     *
     */
    @Link(relation = "first")
    Resources getFirst();

    /**
     *
     */
    @Link(relation = "item")
    java.util.List<Resource> getItem();



}
