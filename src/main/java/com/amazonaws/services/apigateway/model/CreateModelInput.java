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

public class CreateModelInput {

    private String name;

    private String description;

    private String schema;

    private String contentType;



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
    public CreateModelInput withName(String name) {
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
    public CreateModelInput withDescription(String description) {
        this.description = description;
        return this;
    }


    /**
     * Returns the value of the schema property for this object.
     *
     * @return The value of the schema property for this object.
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property for this object.
     *
     * @param schema The new value for the schema property for this object.
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * Sets the value of the schema property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param schema The new value for the schema property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateModelInput withSchema(String schema) {
        this.schema = schema;
        return this;
    }


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
    public CreateModelInput withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("name: " + getName() + ",");
        if (getDescription() != null) sb.append("description: " + getDescription() + ",");
        if (getSchema() != null) sb.append("schema: " + getSchema() + ",");
        if (getContentType() != null) sb.append("contentType: " + getContentType() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateModelInput == false) return false;
        CreateModelInput other = (CreateModelInput)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getSchema() == null ^ this.getSchema() == null) return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false) return false;
        if (other.getContentType() == null ^ this.getContentType() == null) return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false) return false;
        return true;
    }

}
