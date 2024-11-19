
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The SaleToPOISessionManagementRequest message is sent by a sale system to select an administrative service related to session management.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOISessionManagementRequestV06", propOrder = {
    "hdr",
    "ssnMgmtReq",
    "sctyTrlr"
})
public class SaleToPOISessionManagementRequestV06 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "SsnMgmtReq", required = true)
    protected SessionManagementRequest7 ssnMgmtReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType38 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header41 }
     *     
     */
    public Header41 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header41 }
     *     
     */
    public SaleToPOISessionManagementRequestV06 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ssnMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link SessionManagementRequest7 }
     *     
     */
    public SessionManagementRequest7 getSsnMgmtReq() {
        return ssnMgmtReq;
    }

    /**
     * Sets the value of the ssnMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionManagementRequest7 }
     *     
     */
    public SaleToPOISessionManagementRequestV06 setSsnMgmtReq(SessionManagementRequest7 value) {
        this.ssnMgmtReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType38 }
     *     
     */
    public ContentInformationType38 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType38 }
     *     
     */
    public SaleToPOISessionManagementRequestV06 setSctyTrlr(ContentInformationType38 value) {
        this.sctyTrlr = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
