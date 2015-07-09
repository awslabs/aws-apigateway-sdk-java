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

public class CreateApiKeyInput {

    private String name;

    private String description;

    private Boolean enabled;

    private java.util.List<StageKey> stageKeys;



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
    public CreateApiKeyInput withName(String name) {
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
    public CreateApiKeyInput withDescription(String description) {
        this.description = description;
        return this;
    }


    /**
     * Returns the value of the enabled property for this object.
     *
     * @return The value of the enabled property for this object.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property for this object.
     *
     * @param enabled The new value for the enabled property for this object.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets the value of the enabled property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled The new value for the enabled property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateApiKeyInput withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }


    /**
     * Returns the value of the stageKeys property for this object.
     *
     * @return The value of the stageKeys property for this object.
     */
    public java.util.List<StageKey> getStageKeys() {
        return stageKeys;
    }

    /**
     * Sets the value of the stageKeys property for this object.
     *
     * @param stageKeys The new value for the stageKeys property for this object.
     */
    public void setStageKeys(java.util.List<StageKey> stageKeys) {
        this.stageKeys = stageKeys;
    }

    /**
     * Sets the value of the stageKeys property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stageKeys The new value for the stageKeys property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateApiKeyInput withStageKeys(java.util.List<StageKey> stageKeys) {
        this.stageKeys = stageKeys;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("name: " + getName() + ",");
        if (getDescription() != null) sb.append("description: " + getDescription() + ",");
        if (getEnabled() != null) sb.append("enabled: " + getEnabled() + ",");
        if (getStageKeys() != null) sb.append("stageKeys: " + getStageKeys() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getStageKeys() == null) ? 0 : getStageKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateApiKeyInput == false) return false;
        CreateApiKeyInput other = (CreateApiKeyInput)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null) return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false) return false;
        if (other.getStageKeys() == null ^ this.getStageKeys() == null) return false;
        if (other.getStageKeys() != null && other.getStageKeys().equals(this.getStageKeys()) == false) return false;
        return true;
    }

}
