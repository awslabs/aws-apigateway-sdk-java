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

public interface Resource extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "resource:update", method = HttpMethodName.PATCH)
    Resource updateResource(PatchDocument updateResourceInput);

    /**
     *
     */
    @Link(relation = "resource:delete", method = HttpMethodName.DELETE)
    void deleteResource();

    /**
     *
     */
    @Link(relation = "resource:create-child", method = HttpMethodName.POST)
    Resource createResource(CreateResourceInput createResourceInput);

    /**
     *
     */
    @Link(relation = "method:by-http-method")
    Method getMethodByHttpMethod(
        @UriVariable(name = "httpMethod") String httpMethod);

    /**
     *
     */
    @Link(relation = "method:put", method = HttpMethodName.PUT)
    Method putMethod(PutMethodInput putMethodInput, 
        @UriVariable(name = "httpMethod") String httpMethod);

    /**
     *
     */
    @Link(relation = "resource:methods")
    java.util.Map<String, Method> getResourceMethods();


    /**
     *
     */
    String getId();

    /**
     *
     */
    String getParentId();

    /**
     *
     */
    String getPathPart();

    /**
     *
     */
    String getPath();


}
