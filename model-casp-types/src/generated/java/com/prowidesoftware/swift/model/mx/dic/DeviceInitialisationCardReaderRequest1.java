
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Device Initialisation Card Reader Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInitialisationCardReaderRequest1", propOrder = {
    "warmRstFlg",
    "forceNtryMd",
    "leavCardFlg",
    "maxWtgTm",
    "dispOutpt"
})
public class DeviceInitialisationCardReaderRequest1 {

    @XmlElement(name = "WarmRstFlg")
    protected Boolean warmRstFlg;
    @XmlElement(name = "ForceNtryMd")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading6Code> forceNtryMd;
    @XmlElement(name = "LeavCardFlg")
    protected Boolean leavCardFlg;
    @XmlElement(name = "MaxWtgTm")
    protected BigDecimal maxWtgTm;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage6 dispOutpt;

    /**
     * Gets the value of the warmRstFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarmRstFlg() {
        return warmRstFlg;
    }

    /**
     * Sets the value of the warmRstFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DeviceInitialisationCardReaderRequest1 setWarmRstFlg(Boolean value) {
        this.warmRstFlg = value;
        return this;
    }

    /**
     * Gets the value of the forceNtryMd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forceNtryMd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForceNtryMd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading6Code }
     * 
     * 
     */
    public List<CardDataReading6Code> getForceNtryMd() {
        if (forceNtryMd == null) {
            forceNtryMd = new ArrayList<CardDataReading6Code>();
        }
        return this.forceNtryMd;
    }

    /**
     * Gets the value of the leavCardFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeavCardFlg() {
        return leavCardFlg;
    }

    /**
     * Sets the value of the leavCardFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DeviceInitialisationCardReaderRequest1 setLeavCardFlg(Boolean value) {
        this.leavCardFlg = value;
        return this;
    }

    /**
     * Gets the value of the maxWtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWtgTm() {
        return maxWtgTm;
    }

    /**
     * Sets the value of the maxWtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DeviceInitialisationCardReaderRequest1 setMaxWtgTm(BigDecimal value) {
        this.maxWtgTm = value;
        return this;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage6 }
     *     
     */
    public ActionMessage6 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage6 }
     *     
     */
    public DeviceInitialisationCardReaderRequest1 setDispOutpt(ActionMessage6 value) {
        this.dispOutpt = value;
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

    /**
     * Adds a new item to the forceNtryMd list.
     * @see #getForceNtryMd()
     * 
     */
    public DeviceInitialisationCardReaderRequest1 addForceNtryMd(CardDataReading6Code forceNtryMd) {
        getForceNtryMd().add(forceNtryMd);
        return this;
    }

}
