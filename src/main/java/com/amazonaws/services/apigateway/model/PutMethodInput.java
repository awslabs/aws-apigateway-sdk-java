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

public class PutMethodInput {

    private String authorizationType;

    private Boolean apiKeyRequired;

    private java.util.Map<String, Boolean> requestParameters;

    private java.util.Map<String, String> requestModels;



    /**
     * Returns the value of the authorizationType property for this object.
     *
     * @return The value of the authorizationType property for this object.
     */
    public String getAuthorizationType() {
        return authorizationType;
    }

    /**
     * Sets the value of the authorizationType property for this object.
     *
     * @param authorizationType The new value for the authorizationType property for this object.
     */
    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * Sets the value of the authorizationType property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param authorizationType The new value for the authorizationType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutMethodInput withAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }


    /**
     * Returns the value of the apiKeyRequired property for this object.
     *
     * @return The value of the apiKeyRequired property for this object.
     */
    public Boolean getApiKeyRequired() {
        return apiKeyRequired;
    }

    /**
     * Sets the value of the apiKeyRequired property for this object.
     *
     * @param apiKeyRequired The new value for the apiKeyRequired property for this object.
     */
    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * Sets the value of the apiKeyRequired property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param apiKeyRequired The new value for the apiKeyRequired property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutMethodInput withApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
        return this;
    }


    /**
     * Returns the value of the requestParameters property for this object.
     *
     * @return The value of the requestParameters property for this object.
     */
    public java.util.Map<String, Boolean> getRequestParameters() {
        return requestParameters;
    }

    /**
     * Sets the value of the requestParameters property for this object.
     *
     * @param requestParameters The new value for the requestParameters property for this object.
     */
    public void setRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * Sets the value of the requestParameters property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestParameters The new value for the requestParameters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutMethodInput withRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }


    /**
     * Returns the value of the requestModels property for this object.
     *
     * @return The value of the requestModels property for this object.
     */
    public java.util.Map<String, String> getRequestModels() {
        return requestModels;
    }

    /**
     * Sets the value of the requestModels property for this object.
     *
     * @param requestModels The new value for the requestModels property for this object.
     */
    public void setRequestModels(java.util.Map<String, String> requestModels) {
        this.requestModels = requestModels;
    }

    /**
     * Sets the value of the requestModels property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestModels The new value for the requestModels property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutMethodInput withRequestModels(java.util.Map<String, String> requestModels) {
        this.requestModels = requestModels;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAuthorizationType() != null) sb.append("authorizationType: " + getAuthorizationType() + ",");
        if (getApiKeyRequired() != null) sb.append("apiKeyRequired: " + getApiKeyRequired() + ",");
        if (getRequestParameters() != null) sb.append("requestParameters: " + getRequestParameters() + ",");
        if (getRequestModels() != null) sb.append("requestModels: " + getRequestModels() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestModels() == null) ? 0 : getRequestModels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutMethodInput == false) return false;
        PutMethodInput other = (PutMethodInput)obj;

        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null) return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false) return false;
        if (other.getApiKeyRequired() == null ^ this.getApiKeyRequired() == null) return false;
        if (other.getApiKeyRequired() != null && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false) return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null) return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false) return false;
        if (other.getRequestModels() == null ^ this.getRequestModels() == null) return false;
        if (other.getRequestModels() != null && other.getRequestModels().equals(this.getRequestModels()) == false) return false;
        return true;
    }

}
