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

public interface Method extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "method:update", method = HttpMethodName.PATCH)
    Method updateMethod(PatchDocument updateMethodInput);

    /**
     *
     */
    @Link(relation = "method:delete", method = HttpMethodName.DELETE)
    void deleteMethod();

    /**
     *
     */
    @Link(relation = "methodresponse:put", method = HttpMethodName.PUT)
    MethodResponse putMethodResponse(PutMethodResponseInput PutMethodResponseInput, 
        @UriVariable(name = "status_code") String statusCode);

    /**
     *
     */
    @Link(relation = "integration:put", method = HttpMethodName.PUT)
    Integration putIntegration(PutIntegrationInput putIntegrationInput);

    /**
     *
     */
    @Link(relation = "method:responses")
    java.util.Map<String, MethodResponse> getMethodResponses();

    /**
     *
     */
    @Link(relation = "method:integration")
    Integration getMethodIntegration();


    /**
     *
     */
    String getHttpMethod();

    /**
     *
     */
    String getAuthorizationType();

    /**
     *
     */
    Boolean getApiKeyRequired();

    /**
     *
     */
    java.util.Map<String, Boolean> getRequestParameters();

    /**
     *
     */
    java.util.Map<String, String> getRequestModels();


}
