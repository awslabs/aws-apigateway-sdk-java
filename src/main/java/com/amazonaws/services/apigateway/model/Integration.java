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

public interface Integration extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "integration:update", method = HttpMethodName.PATCH)
    Integration updateIntegration(PatchDocument updateIntegrationInput);

    /**
     *
     */
    @Link(relation = "integration:delete", method = HttpMethodName.DELETE)
    void deleteIntegration();

    /**
     *
     */
    @Link(relation = "integrationresponse:put", method = HttpMethodName.PUT)
    IntegrationResponse putIntegrationResponse(PutIntegrationResponseInput putIntegrationResponseInput, 
        @UriVariable(name = "status_code") String statusCode);

    /**
     *
     */
    @Link(relation = "integration:responses")
    java.util.Map<String, IntegrationResponse> getIntegrationResponses();


    /**
     *
     */
    String getType();

    /**
     *
     */
    String getHttpMethod();

    /**
     *
     */
    String getUri();

    /**
     *
     */
    String getCredentials();

    /**
     *
     */
    java.util.Map<String, String> getRequestParameters();

    /**
     *
     */
    java.util.Map<String, String> getRequestTemplates();

    /**
     *
     */
    String getCacheNamespace();

    /**
     *
     */
    java.util.List<String> getCacheKeyParameters();


}
