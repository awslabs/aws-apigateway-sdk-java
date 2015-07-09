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

public interface Stage extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "stage:update", method = HttpMethodName.PATCH)
    Stage updateStage(PatchDocument updateStageInput);

    /**
     *
     */
    @Link(relation = "stage:delete", method = HttpMethodName.DELETE)
    void deleteStage();

    /**
     *
     */
    @Link(relation = "stage:flush-cache", method = HttpMethodName.DELETE)
    void flushStageCache();


    /**
     *
     */
    String getDeploymentId();

    /**
     *
     */
    String getStageName();

    /**
     *
     */
    String getDescription();

    /**
     *
     */
    Boolean getCacheClusterEnabled();

    /**
     *
     */
    String getCacheClusterSize();

    /**
     *
     */
    String getCacheClusterStatus();

    /**
     *
     */
    java.util.Map<String, MethodSetting> getMethodSettings();

    /**
     *
     */
    java.util.Date getCreatedDate();

    /**
     *
     */
    java.util.Date getLastUpdatedDate();


}
