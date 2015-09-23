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

public interface ApiGateway extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "apigateway:rest-apis")
    RestApis getRestApis();

    /**
     *
     */
    @Link(relation = "apigateway:rest-apis")
    RestApis getRestApis(
        @UriVariable(name = "limit") Integer limit);

    /**
     *
     */
    @Link(relation = "apigateway:domain-names")
    DomainNames getDomainNames();

    /**
     *
     */
    @Link(relation = "apigateway:domain-names")
    DomainNames getDomainNames(
        @UriVariable(name = "limit") Integer limit);

    /**
     *
     */
    @Link(relation = "apigateway:api-keys")
    ApiKeys getApiKeys();

    /**
     *
     */
    @Link(relation = "apigateway:client-certificates")
    ClientCertificates getClientCertificates();

    /**
     *
     */
    @Link(relation = "restapi:by-id")
    RestApi getRestApiById(
        @UriVariable(name = "restapi_id") String restApiId);

    /**
     *
     */
    @Link(relation = "restapi:create", method = HttpMethodName.POST)
    RestApi createRestApi(CreateRestApiInput createRestApiInput);

    /**
     *
     */
    @Link(relation = "domainname:by-name")
    DomainName getDomainNameByName(
        @UriVariable(name = "domain_name") String domainName);

    /**
     *
     */
    @Link(relation = "domainname:create", method = HttpMethodName.POST)
    DomainName createDomainName(CreateDomainNameInput createDomainNameInput);

    /**
     *
     */
    @Link(relation = "apikey:by-key")
    ApiKey getApiKeyByKey(
        @UriVariable(name = "api_Key") String apiKey);

    /**
     *
     */
    @Link(relation = "apikey:create", method = HttpMethodName.POST)
    ApiKey createApiKey(CreateApiKeyInput createApiKeyInput);

    /**
     *
     */
    @Link(relation = "account:update", method = HttpMethodName.PATCH)
    Account updateAccount(PatchDocument updateAccountInput);


}
