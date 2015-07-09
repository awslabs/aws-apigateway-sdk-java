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

public class MethodSetting {

    private Boolean metricsEnabled;

    private String loggingLevel;

    private Boolean dataTraceEnabled;

    private Integer throttlingBurstLimit;

    private Double throttlingRateLimit;

    private Boolean cachingEnabled;

    private Integer cacheTtlInSeconds;

    private Boolean cacheDataEncrypted;



    /**
     * Returns the value of the metricsEnabled property for this object.
     *
     * @return The value of the metricsEnabled property for this object.
     */
    public Boolean getMetricsEnabled() {
        return metricsEnabled;
    }

    /**
     * Sets the value of the metricsEnabled property for this object.
     *
     * @param metricsEnabled The new value for the metricsEnabled property for this object.
     */
    public void setMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
    }

    /**
     * Sets the value of the metricsEnabled property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricsEnabled The new value for the metricsEnabled property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSetting withMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
        return this;
    }


    /**
     * Returns the value of the loggingLevel property for this object.
     *
     * @return The value of the loggingLevel property for this object.
     */
    public String getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * Sets the value of the loggingLevel property for this object.
     *
     * @param loggingLevel The new value for the loggingLevel property for this object.
     */
    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    /**
     * Sets the value of the loggingLevel property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loggingLevel The new value for the loggingLevel property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSetting withLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }


    /**
     * Returns the value of the dataTraceEnabled property for this object.
     *
     * @return The value of the dataTraceEnabled property for this object.
     */
    public Boolean getDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * Sets the value of the dataTraceEnabled property for this object.
     *
     * @param dataTraceEnabled The new value for the dataTraceEnabled property for this object.
     */
    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    /**
     * Sets the value of the dataTraceEnabled property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataTraceEnabled The new value for the dataTraceEnabled property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSetting withDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
        return this;
    }


    /**
     * Returns the value of the throttlingBurstLimit property for this object.
     *
     * @return The value of the throttlingBurstLimit property for this object.
     */
    public Integer getThrottlingBurstLimit() {
        return throttlingBurstLimit;
    }

    /**
     * Sets the value of the throttlingBurstLimit property for this object.
     *
     * @param throttlingBurstLimit The new value for the throttlingBurstLimit property for this object.
     */
    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    /**
     * Sets the value of the throttlingBurstLimit property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param throttlingBurstLimit The new value for the throttlingBurstLimit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSetting withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
        return this;
    }


    /**
     * Returns the value of the throttlingRateLimit property for this object.
     *
     * @return The value of the throttlingRateLimit property for this object.
     */
    public Double getThrottlingRateLimit() {
        return throttlingRateLimit;
    }

    /**
     * Sets the value of the throttlingRateLimit property for this object.
     *
     * @param throttlingRateLimit The new value for the throttlingRateLimit property for this object.
     */
    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * Sets the value of the throttlingRateLimit property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param throttlingRateLimit The new value for the throttlingRateLimit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSetting withThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
        return this;
    }


    /**
     * Returns the value of the cachingEnabled property for this object.
     *
     * @return The value of the cachingEnabled property for this object.
     */
    public Boolean getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * Sets the value of the cachingEnabled property for this object.
     *
     * @param cachingEnabled The new value for the cachingEnabled property for this object.
     */
    public void setCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    /**
     * Sets the value of the cachingEnabled property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cachingEnabled The new value for the cachingEnabled property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSetting withCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
        return this;
    }


    /**
     * Returns the value of the cacheTtlInSeconds property for this object.
     *
     * @return The value of the cacheTtlInSeconds property for this object.
     */
    public Integer getCacheTtlInSeconds() {
        return cacheTtlInSeconds;
    }

    /**
     * Sets the value of the cacheTtlInSeconds property for this object.
     *
     * @param cacheTtlInSeconds The new value for the cacheTtlInSeconds property for this object.
     */
    public void setCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
    }

    /**
     * Sets the value of the cacheTtlInSeconds property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheTtlInSeconds The new value for the cacheTtlInSeconds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSetting withCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        return this;
    }


    /**
     * Returns the value of the cacheDataEncrypted property for this object.
     *
     * @return The value of the cacheDataEncrypted property for this object.
     */
    public Boolean getCacheDataEncrypted() {
        return cacheDataEncrypted;
    }

    /**
     * Sets the value of the cacheDataEncrypted property for this object.
     *
     * @param cacheDataEncrypted The new value for the cacheDataEncrypted property for this object.
     */
    public void setCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
    }

    /**
     * Sets the value of the cacheDataEncrypted property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheDataEncrypted The new value for the cacheDataEncrypted property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MethodSetting withCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetricsEnabled() != null) sb.append("metricsEnabled: " + getMetricsEnabled() + ",");
        if (getLoggingLevel() != null) sb.append("loggingLevel: " + getLoggingLevel() + ",");
        if (getDataTraceEnabled() != null) sb.append("dataTraceEnabled: " + getDataTraceEnabled() + ",");
        if (getThrottlingBurstLimit() != null) sb.append("throttlingBurstLimit: " + getThrottlingBurstLimit() + ",");
        if (getThrottlingRateLimit() != null) sb.append("throttlingRateLimit: " + getThrottlingRateLimit() + ",");
        if (getCachingEnabled() != null) sb.append("cachingEnabled: " + getCachingEnabled() + ",");
        if (getCacheTtlInSeconds() != null) sb.append("cacheTtlInSeconds: " + getCacheTtlInSeconds() + ",");
        if (getCacheDataEncrypted() != null) sb.append("cacheDataEncrypted: " + getCacheDataEncrypted() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getMetricsEnabled() == null) ? 0 : getMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        hashCode = prime * hashCode + ((getDataTraceEnabled() == null) ? 0 : getDataTraceEnabled().hashCode());
        hashCode = prime * hashCode + ((getThrottlingBurstLimit() == null) ? 0 : getThrottlingBurstLimit().hashCode());
        hashCode = prime * hashCode + ((getThrottlingRateLimit() == null) ? 0 : getThrottlingRateLimit().hashCode());
        hashCode = prime * hashCode + ((getCachingEnabled() == null) ? 0 : getCachingEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheTtlInSeconds() == null) ? 0 : getCacheTtlInSeconds().hashCode());
        hashCode = prime * hashCode + ((getCacheDataEncrypted() == null) ? 0 : getCacheDataEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MethodSetting == false) return false;
        MethodSetting other = (MethodSetting)obj;

        if (other.getMetricsEnabled() == null ^ this.getMetricsEnabled() == null) return false;
        if (other.getMetricsEnabled() != null && other.getMetricsEnabled().equals(this.getMetricsEnabled()) == false) return false;
        if (other.getLoggingLevel() == null ^ this.getLoggingLevel() == null) return false;
        if (other.getLoggingLevel() != null && other.getLoggingLevel().equals(this.getLoggingLevel()) == false) return false;
        if (other.getDataTraceEnabled() == null ^ this.getDataTraceEnabled() == null) return false;
        if (other.getDataTraceEnabled() != null && other.getDataTraceEnabled().equals(this.getDataTraceEnabled()) == false) return false;
        if (other.getThrottlingBurstLimit() == null ^ this.getThrottlingBurstLimit() == null) return false;
        if (other.getThrottlingBurstLimit() != null && other.getThrottlingBurstLimit().equals(this.getThrottlingBurstLimit()) == false) return false;
        if (other.getThrottlingRateLimit() == null ^ this.getThrottlingRateLimit() == null) return false;
        if (other.getThrottlingRateLimit() != null && other.getThrottlingRateLimit().equals(this.getThrottlingRateLimit()) == false) return false;
        if (other.getCachingEnabled() == null ^ this.getCachingEnabled() == null) return false;
        if (other.getCachingEnabled() != null && other.getCachingEnabled().equals(this.getCachingEnabled()) == false) return false;
        if (other.getCacheTtlInSeconds() == null ^ this.getCacheTtlInSeconds() == null) return false;
        if (other.getCacheTtlInSeconds() != null && other.getCacheTtlInSeconds().equals(this.getCacheTtlInSeconds()) == false) return false;
        if (other.getCacheDataEncrypted() == null ^ this.getCacheDataEncrypted() == null) return false;
        if (other.getCacheDataEncrypted() != null && other.getCacheDataEncrypted().equals(this.getCacheDataEncrypted()) == false) return false;
        return true;
    }

}
