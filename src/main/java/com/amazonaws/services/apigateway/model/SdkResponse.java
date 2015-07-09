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

public class SdkResponse {

    private String contentType;

    private String contentDisposition;

    private byte[] body;



    /**
     * Returns the value of the contentType property for this object.
     *
     * @return The value of the contentType property for this object.
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property for this object.
     *
     * @param contentType The new value for the contentType property for this object.
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets the value of the contentType property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contentType The new value for the contentType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SdkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }


    /**
     * Returns the value of the contentDisposition property for this object.
     *
     * @return The value of the contentDisposition property for this object.
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * Sets the value of the contentDisposition property for this object.
     *
     * @param contentDisposition The new value for the contentDisposition property for this object.
     */
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * Sets the value of the contentDisposition property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contentDisposition The new value for the contentDisposition property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SdkResponse withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }


    /**
     * Returns the value of the body property for this object.
     *
     * @return The value of the body property for this object.
     */
    public byte[] getBody() {
        return body;
    }

    /**
     * Sets the value of the body property for this object.
     *
     * @param body The new value for the body property for this object.
     */
    public void setBody(byte[] body) {
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
    public SdkResponse withBody(byte[] body) {
        this.body = body;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContentType() != null) sb.append("contentType: " + getContentType() + ",");
        if (getContentDisposition() != null) sb.append("contentDisposition: " + getContentDisposition() + ",");
        if (getBody() != null) sb.append("body: " + getBody() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContentDisposition() == null) ? 0 : getContentDisposition().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SdkResponse == false) return false;
        SdkResponse other = (SdkResponse)obj;

        if (other.getContentType() == null ^ this.getContentType() == null) return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false) return false;
        if (other.getContentDisposition() == null ^ this.getContentDisposition() == null) return false;
        if (other.getContentDisposition() != null && other.getContentDisposition().equals(this.getContentDisposition()) == false) return false;
        if (other.getBody() == null ^ this.getBody() == null) return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false) return false;
        return true;
    }

}
