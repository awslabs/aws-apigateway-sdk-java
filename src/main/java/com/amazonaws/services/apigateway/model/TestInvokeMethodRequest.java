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

public class TestInvokeMethodRequest {

    private String restApiId;

    private String resourceId;

    private String httpMethod;

    private String pathWithQueryString;

    private String body;

    private java.util.Map<String, String> headers;



    /**
     * Returns the value of the restApiId property for this object.
     *
     * @return The value of the restApiId property for this object.
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * Sets the value of the restApiId property for this object.
     *
     * @param restApiId The new value for the restApiId property for this object.
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * Sets the value of the restApiId property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restApiId The new value for the restApiId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TestInvokeMethodRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }


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
    public TestInvokeMethodRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
    public TestInvokeMethodRequest withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }


    /**
     * Returns the value of the pathWithQueryString property for this object.
     *
     * @return The value of the pathWithQueryString property for this object.
     */
    public String getPathWithQueryString() {
        return pathWithQueryString;
    }

    /**
     * Sets the value of the pathWithQueryString property for this object.
     *
     * @param pathWithQueryString The new value for the pathWithQueryString property for this object.
     */
    public void setPathWithQueryString(String pathWithQueryString) {
        this.pathWithQueryString = pathWithQueryString;
    }

    /**
     * Sets the value of the pathWithQueryString property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pathWithQueryString The new value for the pathWithQueryString property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TestInvokeMethodRequest withPathWithQueryString(String pathWithQueryString) {
        this.pathWithQueryString = pathWithQueryString;
        return this;
    }


    /**
     * Returns the value of the body property for this object.
     *
     * @return The value of the body property for this object.
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property for this object.
     *
     * @param body The new value for the body property for this object.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Sets the value of the body property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param body The new value for the body property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TestInvokeMethodRequest withBody(String body) {
        this.body = body;
        return this;
    }


    /**
     * Returns the value of the headers property for this object.
     *
     * @return The value of the headers property for this object.
     */
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property for this object.
     *
     * @param headers The new value for the headers property for this object.
     */
    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Sets the value of the headers property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param headers The new value for the headers property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TestInvokeMethodRequest withHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestApiId() != null) sb.append("restApiId: " + getRestApiId() + ",");
        if (getResourceId() != null) sb.append("resourceId: " + getResourceId() + ",");
        if (getHttpMethod() != null) sb.append("httpMethod: " + getHttpMethod() + ",");
        if (getPathWithQueryString() != null) sb.append("pathWithQueryString: " + getPathWithQueryString() + ",");
        if (getBody() != null) sb.append("body: " + getBody() + ",");
        if (getHeaders() != null) sb.append("headers: " + getHeaders() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getPathWithQueryString() == null) ? 0 : getPathWithQueryString().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TestInvokeMethodRequest == false) return false;
        TestInvokeMethodRequest other = (TestInvokeMethodRequest)obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null) return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false) return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null) return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false) return false;
        if (other.getPathWithQueryString() == null ^ this.getPathWithQueryString() == null) return false;
        if (other.getPathWithQueryString() != null && other.getPathWithQueryString().equals(this.getPathWithQueryString()) == false) return false;
        if (other.getBody() == null ^ this.getBody() == null) return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false) return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null) return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false) return false;
        return true;
    }

}
