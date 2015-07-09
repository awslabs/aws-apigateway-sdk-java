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

public class CreateDomainNameInput {

    private String domainName;

    private String certificateName;

    private String certificateBody;

    private String certificatePrivateKey;

    private String certificateChain;



    /**
     * Returns the value of the domainName property for this object.
     *
     * @return The value of the domainName property for this object.
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property for this object.
     *
     * @param domainName The new value for the domainName property for this object.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Sets the value of the domainName property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The new value for the domainName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDomainNameInput withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }


    /**
     * Returns the value of the certificateName property for this object.
     *
     * @return The value of the certificateName property for this object.
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * Sets the value of the certificateName property for this object.
     *
     * @param certificateName The new value for the certificateName property for this object.
     */
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * Sets the value of the certificateName property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificateName The new value for the certificateName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDomainNameInput withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }


    /**
     * Returns the value of the certificateBody property for this object.
     *
     * @return The value of the certificateBody property for this object.
     */
    public String getCertificateBody() {
        return certificateBody;
    }

    /**
     * Sets the value of the certificateBody property for this object.
     *
     * @param certificateBody The new value for the certificateBody property for this object.
     */
    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * Sets the value of the certificateBody property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificateBody The new value for the certificateBody property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDomainNameInput withCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }


    /**
     * Returns the value of the certificatePrivateKey property for this object.
     *
     * @return The value of the certificatePrivateKey property for this object.
     */
    public String getCertificatePrivateKey() {
        return certificatePrivateKey;
    }

    /**
     * Sets the value of the certificatePrivateKey property for this object.
     *
     * @param certificatePrivateKey The new value for the certificatePrivateKey property for this object.
     */
    public void setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
    }

    /**
     * Sets the value of the certificatePrivateKey property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificatePrivateKey The new value for the certificatePrivateKey property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDomainNameInput withCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
        return this;
    }


    /**
     * Returns the value of the certificateChain property for this object.
     *
     * @return The value of the certificateChain property for this object.
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    /**
     * Sets the value of the certificateChain property for this object.
     *
     * @param certificateChain The new value for the certificateChain property for this object.
     */
    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * Sets the value of the certificateChain property for this object.
     *
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificateChain The new value for the certificateChain property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDomainNameInput withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null) sb.append("domainName: " + getDomainName() + ",");
        if (getCertificateName() != null) sb.append("certificateName: " + getCertificateName() + ",");
        if (getCertificateBody() != null) sb.append("certificateBody: " + getCertificateBody() + ",");
        if (getCertificatePrivateKey() != null) sb.append("certificatePrivateKey: " + getCertificatePrivateKey() + ",");
        if (getCertificateChain() != null) sb.append("certificateChain: " + getCertificateChain() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode());
        hashCode = prime * hashCode + ((getCertificatePrivateKey() == null) ? 0 : getCertificatePrivateKey().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDomainNameInput == false) return false;
        CreateDomainNameInput other = (CreateDomainNameInput)obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null) return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false) return false;
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null) return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false) return false;
        if (other.getCertificatePrivateKey() == null ^ this.getCertificatePrivateKey() == null) return false;
        if (other.getCertificatePrivateKey() != null && other.getCertificatePrivateKey().equals(this.getCertificatePrivateKey()) == false) return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null) return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false) return false;
        return true;
    }

}
