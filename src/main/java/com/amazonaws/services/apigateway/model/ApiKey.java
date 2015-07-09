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

public interface ApiKey extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "apikey:update", method = HttpMethodName.PATCH)
    ApiKey updateApiKey(PatchDocument updateApiKeyInput);

    /**
     *
     */
    @Link(relation = "apikey:delete", method = HttpMethodName.DELETE)
    void deleteApiKey();


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
    Boolean getEnabled();

    /**
     *
     */
    java.util.List<String> getStageKeys();

    /**
     *
     */
    java.util.Date getCreatedDate();

    /**
     *
     */
    java.util.Date getLastUpdatedDate();


}
