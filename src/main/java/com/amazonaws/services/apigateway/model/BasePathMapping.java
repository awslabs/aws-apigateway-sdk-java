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

public interface BasePathMapping extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "basepathmapping:create", method = HttpMethodName.POST)
    BasePathMapping createBasePathMapping(CreateBasePathMappingInput createBasePathMappingInput);

    /**
     *
     */
    @Link(relation = "basepathmapping:update", method = HttpMethodName.PATCH)
    BasePathMapping updateBasePathMapping(PatchDocument updateBasePathMappingInput);

    /**
     *
     */
    @Link(relation = "basepathmapping:delete", method = HttpMethodName.DELETE)
    void deleteBasePathMapping();


    /**
     *
     */
    String getBasePath();

    /**
     *
     */
    String getRestApiId();

    /**
     *
     */
    String getStage();


}
