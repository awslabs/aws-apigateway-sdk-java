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

public class ThrottleSettings {

    private Integer burstLimit;

    private Double rateLimit;



    /**
     * Returns the value of the burstLimit property for this object.
     *
     * @return The value of the burstLimit property for this object.
     */
    public Integer getBurstLimit() {
        return burstLimit;
    }

    /**
     * Sets the value of the burstLimit property for this object.
     *
     * @param burstLimit The new value for the burstLimit property for this object.
     */
    public void setBurstLimit(Integer burstLimit) {
        this.burstLimit = burstLimit;
    }

    /**
     * Sets the value of the burstLimit property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param burstLimit The new value for the burstLimit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ThrottleSettings withBurstLimit(Integer burstLimit) {
        this.burstLimit = burstLimit;
        return this;
    }


    /**
     * Returns the value of the rateLimit property for this object.
     *
     * @return The value of the rateLimit property for this object.
     */
    public Double getRateLimit() {
        return rateLimit;
    }

    /**
     * Sets the value of the rateLimit property for this object.
     *
     * @param rateLimit The new value for the rateLimit property for this object.
     */
    public void setRateLimit(Double rateLimit) {
        this.rateLimit = rateLimit;
    }

    /**
     * Sets the value of the rateLimit property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rateLimit The new value for the rateLimit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ThrottleSettings withRateLimit(Double rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBurstLimit() != null) sb.append("burstLimit: " + getBurstLimit() + ",");
        if (getRateLimit() != null) sb.append("rateLimit: " + getRateLimit() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getBurstLimit() == null) ? 0 : getBurstLimit().hashCode());
        hashCode = prime * hashCode + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ThrottleSettings == false) return false;
        ThrottleSettings other = (ThrottleSettings)obj;

        if (other.getBurstLimit() == null ^ this.getBurstLimit() == null) return false;
        if (other.getBurstLimit() != null && other.getBurstLimit().equals(this.getBurstLimit()) == false) return false;
        if (other.getRateLimit() == null ^ this.getRateLimit() == null) return false;
        if (other.getRateLimit() != null && other.getRateLimit().equals(this.getRateLimit()) == false) return false;
        return true;
    }

}
