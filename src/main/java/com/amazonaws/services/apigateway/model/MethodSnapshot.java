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

public class MethodSnapshot {

    private String resourceId;

    private String authorizationType;

    private Boolean apiKeyRequired;



    /**
     * Returns the value of the resourceId property for this object.
     *
     * @return The value of the resourceId property for this object.
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property for this object.
     *
     * @param resourceId The new value for the resourceId property for this object.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Sets the value of the resourceId property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The new value for the resourceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSnapshot withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


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
    public MethodSnapshot withAuthorizationType(String authorizationType) {
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
    public MethodSnapshot withApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceId() != null) sb.append("resourceId: " + getResourceId() + ",");
        if (getAuthorizationType() != null) sb.append("authorizationType: " + getAuthorizationType() + ",");
        if (getApiKeyRequired() != null) sb.append("apiKeyRequired: " + getApiKeyRequired() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MethodSnapshot == false) return false;
        MethodSnapshot other = (MethodSnapshot)obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null) return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false) return false;
        if (other.getApiKeyRequired() == null ^ this.getApiKeyRequired() == null) return false;
        if (other.getApiKeyRequired() != null && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false) return false;
        return true;
    }

}
