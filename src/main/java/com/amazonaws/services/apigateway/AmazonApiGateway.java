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

package com.amazonaws.services.apigateway;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.hal.client.StatusCodeErrorResponseHandler;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.hal.HalService;
import com.amazonaws.services.apigateway.model.ApiGateway;
import com.amazonaws.services.apigateway.model.BadRequestException;
import com.amazonaws.services.apigateway.model.ConflictException;
import com.amazonaws.services.apigateway.model.LimitExceededException;
import com.amazonaws.services.apigateway.model.NotFoundException;
import com.amazonaws.services.apigateway.model.ServiceUnavailableException;
import com.amazonaws.services.apigateway.model.TooManyRequestsException;
import com.amazonaws.services.apigateway.model.UnauthorizedException;

import java.util.HashMap;
import java.util.Map;

/**
 * Client for accessing AmazonApiGateway.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * 
 */
public class AmazonApiGateway {

    //-------------------------------------------------------------
    // Constants
    //-------------------------------------------------------------

    private static final String DEFAULT_ENDPOINT = "https://apigateway.amazonaws.com";
    private static final String SERVICE_NAME = "apigateway";


    //-------------------------------------------------------------
    // Variables - Private
    //-------------------------------------------------------------

    private HalService<ApiGateway> amazonApiGatewayService;

    //-------------------------------------------------------------
    // Constructors
    //-------------------------------------------------------------

    public AmazonApiGateway() {
        this(DEFAULT_ENDPOINT);
    }


    public AmazonApiGateway(String endpoint) {
        this(endpoint, null);
    }


    public AmazonApiGateway(String endpoint, String regionId) {
        Map<Integer, Class<? extends AmazonServiceException>> exceptionClasses = new HashMap<>();

        exceptionClasses.put(400, BadRequestException.class);
        exceptionClasses.put(401, UnauthorizedException.class);
        exceptionClasses.put(404, NotFoundException.class);
        exceptionClasses.put(409, ConflictException.class);
        exceptionClasses.put(429, TooManyRequestsException.class);
        exceptionClasses.put(503, ServiceUnavailableException.class);

        this.amazonApiGatewayService = new HalService<>(endpoint == null ? DEFAULT_ENDPOINT : endpoint, SERVICE_NAME, regionId, ApiGateway.class, new StatusCodeErrorResponseHandler(exceptionClasses));
    }

    //-------------------------------------------------------------
    // Methods - Configuration
    //-------------------------------------------------------------

    public AmazonApiGateway with(ClientConfiguration clientConfiguration) {
        amazonApiGatewayService.with(clientConfiguration);

        return this;
    }

    public AmazonApiGateway with(AWSCredentialsProvider awsCredentialsProvider) {
        amazonApiGatewayService.with(awsCredentialsProvider);

        return this;
    }

    public AmazonApiGateway with(Map<String, Object> resourceCache) {
        amazonApiGatewayService.with(resourceCache);

        return this;
    }

    //-------------------------------------------------------------
    // Methods
    //-------------------------------------------------------------

    public ApiGateway getApiGateway() {
        return amazonApiGatewayService.getRootResource();
    }
}
        