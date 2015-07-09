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

/**
 * CacheClusterSize
 */
public enum CacheClusterSize {

    GB_0_5("0.5"),
    GB_1_6("1.6"),
    GB_6_1("6.1"),
    GB_13_5("13.5"),
    GB_28_4("28.4"),
    GB_58_2("58.2"),
    GB_118("118"),
    GB_237("237");

    private String value;

    private CacheClusterSize(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
    * Use this in place of valueOf.
    *
    * @param value real value
    * @return CacheClusterSize corresponding to the value
    */
    public static CacheClusterSize fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("0.5".equals(value)) {
            return CacheClusterSize.GB_0_5;
        } else if ("1.6".equals(value)) {
            return CacheClusterSize.GB_1_6;
        } else if ("6.1".equals(value)) {
            return CacheClusterSize.GB_6_1;
        } else if ("13.5".equals(value)) {
            return CacheClusterSize.GB_13_5;
        } else if ("28.4".equals(value)) {
            return CacheClusterSize.GB_28_4;
        } else if ("58.2".equals(value)) {
            return CacheClusterSize.GB_58_2;
        } else if ("118".equals(value)) {
            return CacheClusterSize.GB_118;
        } else if ("237".equals(value)) {
            return CacheClusterSize.GB_237;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}