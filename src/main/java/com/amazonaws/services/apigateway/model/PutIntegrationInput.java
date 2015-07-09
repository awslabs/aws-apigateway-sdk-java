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

public class PutIntegrationInput {

    private String type;

    private String httpMethod;

    private String uri;

    private String credentials;

    private java.util.Map<String, String> requestParameters;

    private java.util.Map<String, String> requestTemplates;

    private String cacheNamespace;

    private java.util.List<String> cacheKeyParameters;



    /**
     * Returns the value of the type property for this object.
     *
     * @return The value of the type property for this object.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property for this object.
     *
     * @param type The new value for the type property for this object.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets the value of the type property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The new value for the type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationInput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Sets the value of the type property for this object.
     *
     * @param type The new value for the type property for this object.
     */
    public void setType(IntegrationType type) {
        this.type = type.toString();
    }

    /**
     * Sets the value of the type property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The new value for the type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationInput withType(IntegrationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Returns the value of the httpMethod property for this object.
     *
     * @return The value of the httpMethod property for this object.
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * Sets the value of the httpMethod property for this object.
     *
     * @param httpMethod The new value for the httpMethod property for this object.
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * Sets the value of the httpMethod property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param httpMethod The new value for the httpMethod property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationInput withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }


    /**
     * Returns the value of the uri property for this object.
     *
     * @return The value of the uri property for this object.
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property for this object.
     *
     * @param uri The new value for the uri property for this object.
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Sets the value of the uri property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uri The new value for the uri property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationInput withUri(String uri) {
        this.uri = uri;
        return this;
    }


    /**
     * Returns the value of the credentials property for this object.
     *
     * @return The value of the credentials property for this object.
     */
    public String getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property for this object.
     *
     * @param credentials The new value for the credentials property for this object.
     */
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    /**
     * Sets the value of the credentials property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param credentials The new value for the credentials property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationInput withCredentials(String credentials) {
        this.credentials = credentials;
        return this;
    }


    /**
     * Returns the value of the requestParameters property for this object.
     *
     * @return The value of the requestParameters property for this object.
     */
    public java.util.Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * Sets the value of the requestParameters property for this object.
     *
     * @param requestParameters The new value for the requestParameters property for this object.
     */
    public void setRequestParameters(java.util.Map<String, String> requestParameters) {
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
    public PutIntegrationInput withRequestParameters(java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }


    /**
     * Returns the value of the requestTemplates property for this object.
     *
     * @return The value of the requestTemplates property for this object.
     */
    public java.util.Map<String, String> getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * Sets the value of the requestTemplates property for this object.
     *
     * @param requestTemplates The new value for the requestTemplates property for this object.
     */
    public void setRequestTemplates(java.util.Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    /**
     * Sets the value of the requestTemplates property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestTemplates The new value for the requestTemplates property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationInput withRequestTemplates(java.util.Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
        return this;
    }


    /**
     * Returns the value of the cacheNamespace property for this object.
     *
     * @return The value of the cacheNamespace property for this object.
     */
    public String getCacheNamespace() {
        return cacheNamespace;
    }

    /**
     * Sets the value of the cacheNamespace property for this object.
     *
     * @param cacheNamespace The new value for the cacheNamespace property for this object.
     */
    public void setCacheNamespace(String cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
    }

    /**
     * Sets the value of the cacheNamespace property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNamespace The new value for the cacheNamespace property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationInput withCacheNamespace(String cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
        return this;
    }


    /**
     * Returns the value of the cacheKeyParameters property for this object.
     *
     * @return The value of the cacheKeyParameters property for this object.
     */
    public java.util.List<String> getCacheKeyParameters() {
        return cacheKeyParameters;
    }

    /**
     * Sets the value of the cacheKeyParameters property for this object.
     *
     * @param cacheKeyParameters The new value for the cacheKeyParameters property for this object.
     */
    public void setCacheKeyParameters(java.util.List<String> cacheKeyParameters) {
        this.cacheKeyParameters = cacheKeyParameters;
    }

    /**
     * Sets the value of the cacheKeyParameters property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheKeyParameters The new value for the cacheKeyParameters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationInput withCacheKeyParameters(java.util.List<String> cacheKeyParameters) {
        this.cacheKeyParameters = cacheKeyParameters;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) sb.append("type: " + getType() + ",");
        if (getHttpMethod() != null) sb.append("httpMethod: " + getHttpMethod() + ",");
        if (getUri() != null) sb.append("uri: " + getUri() + ",");
        if (getCredentials() != null) sb.append("credentials: " + getCredentials() + ",");
        if (getRequestParameters() != null) sb.append("requestParameters: " + getRequestParameters() + ",");
        if (getRequestTemplates() != null) sb.append("requestTemplates: " + getRequestTemplates() + ",");
        if (getCacheNamespace() != null) sb.append("cacheNamespace: " + getCacheNamespace() + ",");
        if (getCacheKeyParameters() != null) sb.append("cacheKeyParameters: " + getCacheKeyParameters() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestTemplates() == null) ? 0 : getRequestTemplates().hashCode());
        hashCode = prime * hashCode + ((getCacheNamespace() == null) ? 0 : getCacheNamespace().hashCode());
        hashCode = prime * hashCode + ((getCacheKeyParameters() == null) ? 0 : getCacheKeyParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutIntegrationInput == false) return false;
        PutIntegrationInput other = (PutIntegrationInput)obj;

        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null) return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false) return false;
        if (other.getUri() == null ^ this.getUri() == null) return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false) return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null) return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false) return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null) return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false) return false;
        if (other.getRequestTemplates() == null ^ this.getRequestTemplates() == null) return false;
        if (other.getRequestTemplates() != null && other.getRequestTemplates().equals(this.getRequestTemplates()) == false) return false;
        if (other.getCacheNamespace() == null ^ this.getCacheNamespace() == null) return false;
        if (other.getCacheNamespace() != null && other.getCacheNamespace().equals(this.getCacheNamespace()) == false) return false;
        if (other.getCacheKeyParameters() == null ^ this.getCacheKeyParameters() == null) return false;
        if (other.getCacheKeyParameters() != null && other.getCacheKeyParameters().equals(this.getCacheKeyParameters()) == false) return false;
        return true;
    }

}
