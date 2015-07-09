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

public class PutMethodResponseInput {

    private java.util.Map<String, Boolean> responseParameters;

    private java.util.Map<String, String> responseModels;



    /**
     * Returns the value of the responseParameters property for this object.
     *
     * @return The value of the responseParameters property for this object.
     */
    public java.util.Map<String, Boolean> getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property for this object.
     *
     * @param responseParameters The new value for the responseParameters property for this object.
     */
    public void setResponseParameters(java.util.Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * Sets the value of the responseParameters property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responseParameters The new value for the responseParameters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutMethodResponseInput withResponseParameters(java.util.Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }


    /**
     * Returns the value of the responseModels property for this object.
     *
     * @return The value of the responseModels property for this object.
     */
    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * Sets the value of the responseModels property for this object.
     *
     * @param responseModels The new value for the responseModels property for this object.
     */
    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * Sets the value of the responseModels property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responseModels The new value for the responseModels property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutMethodResponseInput withResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResponseParameters() != null) sb.append("responseParameters: " + getResponseParameters() + ",");
        if (getResponseModels() != null) sb.append("responseModels: " + getResponseModels() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseModels() == null) ? 0 : getResponseModels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutMethodResponseInput == false) return false;
        PutMethodResponseInput other = (PutMethodResponseInput)obj;

        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null) return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false) return false;
        if (other.getResponseModels() == null ^ this.getResponseModels() == null) return false;
        if (other.getResponseModels() != null && other.getResponseModels().equals(this.getResponseModels()) == false) return false;
        return true;
    }

}
