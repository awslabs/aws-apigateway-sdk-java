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

public class CreateBasePathMappingInput {

    private String basePath;

    private String restApiId;

    private String stage;



    /**
     * Returns the value of the basePath property for this object.
     *
     * @return The value of the basePath property for this object.
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Sets the value of the basePath property for this object.
     *
     * @param basePath The new value for the basePath property for this object.
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * Sets the value of the basePath property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param basePath The new value for the basePath property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateBasePathMappingInput withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }


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
    public CreateBasePathMappingInput withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }


    /**
     * Returns the value of the stage property for this object.
     *
     * @return The value of the stage property for this object.
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property for this object.
     *
     * @param stage The new value for the stage property for this object.
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * Sets the value of the stage property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stage The new value for the stage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateBasePathMappingInput withStage(String stage) {
        this.stage = stage;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBasePath() != null) sb.append("basePath: " + getBasePath() + ",");
        if (getRestApiId() != null) sb.append("restApiId: " + getRestApiId() + ",");
        if (getStage() != null) sb.append("stage: " + getStage() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateBasePathMappingInput == false) return false;
        CreateBasePathMappingInput other = (CreateBasePathMappingInput)obj;

        if (other.getBasePath() == null ^ this.getBasePath() == null) return false;
        if (other.getBasePath() != null && other.getBasePath().equals(this.getBasePath()) == false) return false;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null) return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false) return false;
        if (other.getStage() == null ^ this.getStage() == null) return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false) return false;
        return true;
    }

}
