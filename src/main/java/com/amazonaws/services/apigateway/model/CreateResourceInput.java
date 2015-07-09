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

public class CreateResourceInput {

    private String pathPart;



    /**
     * Returns the value of the pathPart property for this object.
     *
     * @return The value of the pathPart property for this object.
     */
    public String getPathPart() {
        return pathPart;
    }

    /**
     * Sets the value of the pathPart property for this object.
     *
     * @param pathPart The new value for the pathPart property for this object.
     */
    public void setPathPart(String pathPart) {
        this.pathPart = pathPart;
    }

    /**
     * Sets the value of the pathPart property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pathPart The new value for the pathPart property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateResourceInput withPathPart(String pathPart) {
        this.pathPart = pathPart;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPathPart() != null) sb.append("pathPart: " + getPathPart() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getPathPart() == null) ? 0 : getPathPart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateResourceInput == false) return false;
        CreateResourceInput other = (CreateResourceInput)obj;

        if (other.getPathPart() == null ^ this.getPathPart() == null) return false;
        if (other.getPathPart() != null && other.getPathPart().equals(this.getPathPart()) == false) return false;
        return true;
    }

}
