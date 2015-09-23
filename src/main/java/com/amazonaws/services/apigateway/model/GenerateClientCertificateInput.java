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

public class GenerateClientCertificateInput {

    private String description;


    /**
     * Returns the value of the description property for this object.
     *
     * @return The value of the description property for this object.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property for this object.
     *
     * @param description The new value for the description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the value of the description property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateClientCertificateInput withDescription(String description) {
        this.description = description;
        return this;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDescription() != null) sb.append("description: " + getDescription() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GenerateClientCertificateInput == false) return false;
        GenerateClientCertificateInput other = (GenerateClientCertificateInput)obj;

        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        return true;
    }
}
