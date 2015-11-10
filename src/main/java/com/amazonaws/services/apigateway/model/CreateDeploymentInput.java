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

public class CreateDeploymentInput {

    private String stageName;

    private String stageDescription;

    private String description;

    private Boolean cacheClusterEnabled;

    private String cacheClusterSize;

    private java.util.Map<String, String> variables;


    /**
     * Returns the value of the stageName property for this object.
     *
     * @return The value of the stageName property for this object.
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * Sets the value of the stageName property for this object.
     *
     * @param stageName The new value for the stageName property for this object.
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * Sets the value of the stageName property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stageName The new value for the stageName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentInput withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }


    /**
     * Returns the value of the stageDescription property for this object.
     *
     * @return The value of the stageDescription property for this object.
     */
    public String getStageDescription() {
        return stageDescription;
    }

    /**
     * Sets the value of the stageDescription property for this object.
     *
     * @param stageDescription The new value for the stageDescription property for this object.
     */
    public void setStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
    }

    /**
     * Sets the value of the stageDescription property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stageDescription The new value for the stageDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentInput withStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
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
    public CreateDeploymentInput withDescription(String description) {
        this.description = description;
        return this;
    }


    /**
     * Returns the value of the cacheClusterEnabled property for this object.
     *
     * @return The value of the cacheClusterEnabled property for this object.
     */
    public Boolean getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * Sets the value of the cacheClusterEnabled property for this object.
     *
     * @param cacheClusterEnabled The new value for the cacheClusterEnabled property for this object.
     */
    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    /**
     * Sets the value of the cacheClusterEnabled property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterEnabled The new value for the cacheClusterEnabled property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentInput withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
        return this;
    }


    /**
     * Returns the value of the cacheClusterSize property for this object.
     *
     * @return The value of the cacheClusterSize property for this object.
     */
    public String getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * Sets the value of the cacheClusterSize property for this object.
     *
     * @param cacheClusterSize The new value for the cacheClusterSize property for this object.
     */
    public void setCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    /**
     * Sets the value of the cacheClusterSize property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterSize The new value for the cacheClusterSize property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentInput withCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * Sets the value of the cacheClusterSize property for this object.
     *
     * @param cacheClusterSize The new value for the cacheClusterSize property for this object.
     */
    public void setCacheClusterSize(CacheClusterSize cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize.toString();
    }

    /**
     * Sets the value of the cacheClusterSize property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterSize The new value for the cacheClusterSize property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentInput withCacheClusterSize(CacheClusterSize cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize.toString();
        return this;
    }

    /**
     * Returns the value of the variables property for this object.
     *
     * @return The value of the variables property for this object.
     */
    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property for this object.
     *
     * @param variables The new value for the variables property for this object.
     */
    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * Sets the value of the variables property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param variables The new value for the variables property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDeploymentInput withVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
        return this;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStageName() != null) sb.append("stageName: " + getStageName() + ",");
        if (getStageDescription() != null) sb.append("stageDescription: " + getStageDescription() + ",");
        if (getDescription() != null) sb.append("description: " + getDescription() + ",");
        if (getCacheClusterEnabled() != null) sb.append("cacheClusterEnabled: " + getCacheClusterEnabled() + ",");
        if (getCacheClusterSize() != null) sb.append("cacheClusterSize: " + getCacheClusterSize() + ",");
        if (getVariables() != null) sb.append("variables: " + getVariables() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getStageDescription() == null) ? 0 : getStageDescription().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterEnabled() == null) ? 0 : getCacheClusterEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterSize() == null) ? 0 : getCacheClusterSize().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDeploymentInput == false) return false;
        CreateDeploymentInput other = (CreateDeploymentInput)obj;

        if (other.getStageName() == null ^ this.getStageName() == null) return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false) return false;
        if (other.getStageDescription() == null ^ this.getStageDescription() == null) return false;
        if (other.getStageDescription() != null && other.getStageDescription().equals(this.getStageDescription()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getCacheClusterEnabled() == null ^ this.getCacheClusterEnabled() == null) return false;
        if (other.getCacheClusterEnabled() != null && other.getCacheClusterEnabled().equals(this.getCacheClusterEnabled()) == false) return false;
        if (other.getCacheClusterSize() == null ^ this.getCacheClusterSize() == null) return false;
        if (other.getCacheClusterSize() != null && other.getCacheClusterSize().equals(this.getCacheClusterSize()) == false) return false;
        if (other.getVariables() == null ^ this.getVariables() == null) return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false) return false;
        return true;
    }

}
