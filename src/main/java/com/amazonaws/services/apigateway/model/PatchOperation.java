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

public class PatchOperation {

    private String op;

    private String path;

    private String value;

    private String from;



    /**
     * Returns the value of the op property for this object.
     *
     * @return The value of the op property for this object.
     */
    public String getOp() {
        return op;
    }

    /**
     * Sets the value of the op property for this object.
     *
     * @param op The new value for the op property for this object.
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * Sets the value of the op property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param op The new value for the op property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PatchOperation withOp(String op) {
        this.op = op;
        return this;
    }

    /**
     * Sets the value of the op property for this object.
     *
     * @param op The new value for the op property for this object.
     */
    public void setOp(Op op) {
        this.op = op.toString();
    }

    /**
     * Sets the value of the op property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param op The new value for the op property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PatchOperation withOp(Op op) {
        this.op = op.toString();
        return this;
    }

    /**
     * Returns the value of the path property for this object.
     *
     * @return The value of the path property for this object.
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property for this object.
     *
     * @param path The new value for the path property for this object.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Sets the value of the path property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param path The new value for the path property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PatchOperation withPath(String path) {
        this.path = path;
        return this;
    }


    /**
     * Returns the value of the value property for this object.
     *
     * @return The value of the value property for this object.
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property for this object.
     *
     * @param value The new value for the value property for this object.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Sets the value of the value property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The new value for the value property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PatchOperation withValue(String value) {
        this.value = value;
        return this;
    }


    /**
     * Returns the value of the from property for this object.
     *
     * @return The value of the from property for this object.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property for this object.
     *
     * @param from The new value for the from property for this object.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets the value of the from property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param from The new value for the from property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PatchOperation withFrom(String from) {
        this.from = from;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOp() != null) sb.append("op: " + getOp() + ",");
        if (getPath() != null) sb.append("path: " + getPath() + ",");
        if (getValue() != null) sb.append("value: " + getValue() + ",");
        if (getFrom() != null) sb.append("from: " + getFrom() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getOp() == null) ? 0 : getOp().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PatchOperation == false) return false;
        PatchOperation other = (PatchOperation)obj;

        if (other.getOp() == null ^ this.getOp() == null) return false;
        if (other.getOp() != null && other.getOp().equals(this.getOp()) == false) return false;
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false;
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
        if (other.getFrom() == null ^ this.getFrom() == null) return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false) return false;
        return true;
    }

}
