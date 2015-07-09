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

public class CreateRestApiInput {

    private String name;

    private String description;

    private String cloneFrom;



    /**
     * Returns the value of the name property for this object.
     *
     * @return The value of the name property for this object.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property for this object.
     *
     * @param name The new value for the name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the value of the name property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new value for the name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateRestApiInput withName(String name) {
        this.name = name;
        return this;
    }


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
    public CreateRestApiInput withDescription(String description) {
        this.description = description;
        return this;
    }


    /**
     * Returns the value of the cloneFrom property for this object.
     *
     * @return The value of the cloneFrom property for this object.
     */
    public String getCloneFrom() {
        return cloneFrom;
    }

    /**
     * Sets the value of the cloneFrom property for this object.
     *
     * @param cloneFrom The new value for the cloneFrom property for this object.
     */
    public void setCloneFrom(String cloneFrom) {
        this.cloneFrom = cloneFrom;
    }

    /**
     * Sets the value of the cloneFrom property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloneFrom The new value for the cloneFrom property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateRestApiInput withCloneFrom(String cloneFrom) {
        this.cloneFrom = cloneFrom;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("name: " + getName() + ",");
        if (getDescription() != null) sb.append("description: " + getDescription() + ",");
        if (getCloneFrom() != null) sb.append("cloneFrom: " + getCloneFrom() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCloneFrom() == null) ? 0 : getCloneFrom().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateRestApiInput == false) return false;
        CreateRestApiInput other = (CreateRestApiInput)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getCloneFrom() == null ^ this.getCloneFrom() == null) return false;
        if (other.getCloneFrom() != null && other.getCloneFrom().equals(this.getCloneFrom()) == false) return false;
        return true;
    }

}
