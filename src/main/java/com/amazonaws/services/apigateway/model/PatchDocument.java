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

public class PatchDocument {

    private java.util.List<PatchOperation> patchOperations;



    /**
     * Returns the value of the patchOperations property for this object.
     *
     * @return The value of the patchOperations property for this object.
     */
    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * Sets the value of the patchOperations property for this object.
     *
     * @param patchOperations The new value for the patchOperations property for this object.
     */
    public void setPatchOperations(java.util.List<PatchOperation> patchOperations) {
        this.patchOperations = patchOperations;
    }

    /**
     * Sets the value of the patchOperations property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param patchOperations The new value for the patchOperations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PatchDocument withPatchOperations(java.util.List<PatchOperation> patchOperations) {
        this.patchOperations = patchOperations;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPatchOperations() != null) sb.append("patchOperations: " + getPatchOperations() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getPatchOperations() == null) ? 0 : getPatchOperations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PatchDocument == false) return false;
        PatchDocument other = (PatchDocument)obj;

        if (other.getPatchOperations() == null ^ this.getPatchOperations() == null) return false;
        if (other.getPatchOperations() != null && other.getPatchOperations().equals(this.getPatchOperations()) == false) return false;
        return true;
    }

}
