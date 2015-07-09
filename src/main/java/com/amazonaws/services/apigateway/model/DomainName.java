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

public interface DomainName extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "domainname:create", method = HttpMethodName.POST)
    DomainName createDomainName(CreateDomainNameInput createDomainNameInput);

    /**
     *
     */
    @Link(relation = "domainname:update", method = HttpMethodName.PATCH)
    DomainName updateDomainName(PatchDocument updateDomainNameInput);

    /**
     *
     */
    @Link(relation = "domainname:delete", method = HttpMethodName.DELETE)
    void deleteDomainName();

    /**
     *
     */
    @Link(relation = "domainname:basepathmappings")
    BasePathMappings getBasePathMappings();

    /**
     *
     */
    @Link(relation = "domainname:basepathmappings")
    BasePathMappings getBasePathMappings(
        @UriVariable(name = "limit") Integer limit);

    /**
     *
     */
    @Link(relation = "basepathmapping:by-base-path")
    BasePathMapping getBasePathMappingByBasePath(
        @UriVariable(name = "base_path") String basePath);

    /**
     *
     */
    @Link(relation = "basepathmapping:create", method = HttpMethodName.POST)
    BasePathMapping createBasePathMapping(CreateBasePathMappingInput createBasePathMappingInput);


    /**
     *
     */
    String getDomainName();

    /**
     *
     */
    String getCertificateName();

    /**
     *
     */
    java.util.Date getCertificateUploadDate();

    /**
     *
     */
    String getDistributionDomainName();


}
