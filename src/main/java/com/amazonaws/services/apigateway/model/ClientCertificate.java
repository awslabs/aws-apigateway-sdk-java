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

public interface ClientCertificate extends ResourceInfo {

    /**
     *
     */
    @Link(relation = "clientcertificate:update", method = HttpMethodName.PATCH)
    ClientCertificate updateClientCertificate(PatchDocument updateClientCertificateInput);

    /**
     *
     */
    @Link(relation = "clientcertificate:delete", method = HttpMethodName.DELETE)
    void deleteClientCertificate();


    /**
     *
     */
    String getClientCertificateId();

    /**
     *
     */
    String getDescription();

    /**
     *
     */
    String getPemEncodedCertificate();

    /**
     *
     */
    java.util.Date getCreatedDate();

    /**
     *
     */
    java.util.Date getExpirationDate();

}
