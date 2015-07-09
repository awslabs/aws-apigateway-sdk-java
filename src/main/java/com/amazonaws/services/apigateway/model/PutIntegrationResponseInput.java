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

public class PutIntegrationResponseInput {

    private String selectionPattern;

    private java.util.Map<String, String> responseParameters;

    private java.util.Map<String, String> responseTemplates;



    /**
     * Returns the value of the selectionPattern property for this object.
     *
     * @return The value of the selectionPattern property for this object.
     */
    public String getSelectionPattern() {
        return selectionPattern;
    }

    /**
     * Sets the value of the selectionPattern property for this object.
     *
     * @param selectionPattern The new value for the selectionPattern property for this object.
     */
    public void setSelectionPattern(String selectionPattern) {
        this.selectionPattern = selectionPattern;
    }

    /**
     * Sets the value of the selectionPattern property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param selectionPattern The new value for the selectionPattern property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationResponseInput withSelectionPattern(String selectionPattern) {
        this.selectionPattern = selectionPattern;
        return this;
    }


    /**
     * Returns the value of the responseParameters property for this object.
     *
     * @return The value of the responseParameters property for this object.
     */
    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property for this object.
     *
     * @param responseParameters The new value for the responseParameters property for this object.
     */
    public void setResponseParameters(java.util.Map<String, String> responseParameters) {
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
    public PutIntegrationResponseInput withResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }


    /**
     * Returns the value of the responseTemplates property for this object.
     *
     * @return The value of the responseTemplates property for this object.
     */
    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * Sets the value of the responseTemplates property for this object.
     *
     * @param responseTemplates The new value for the responseTemplates property for this object.
     */
    public void setResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * Sets the value of the responseTemplates property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responseTemplates The new value for the responseTemplates property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIntegrationResponseInput withResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSelectionPattern() != null) sb.append("selectionPattern: " + getSelectionPattern() + ",");
        if (getResponseParameters() != null) sb.append("responseParameters: " + getResponseParameters() + ",");
        if (getResponseTemplates() != null) sb.append("responseTemplates: " + getResponseTemplates() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getSelectionPattern() == null) ? 0 : getSelectionPattern().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutIntegrationResponseInput == false) return false;
        PutIntegrationResponseInput other = (PutIntegrationResponseInput)obj;

        if (other.getSelectionPattern() == null ^ this.getSelectionPattern() == null) return false;
        if (other.getSelectionPattern() != null && other.getSelectionPattern().equals(this.getSelectionPattern()) == false) return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null) return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false) return false;
        if (other.getResponseTemplates() == null ^ this.getResponseTemplates() == null) return false;
        if (other.getResponseTemplates() != null && other.getResponseTemplates().equals(this.getResponseTemplates()) == false) return false;
        return true;
    }

}
