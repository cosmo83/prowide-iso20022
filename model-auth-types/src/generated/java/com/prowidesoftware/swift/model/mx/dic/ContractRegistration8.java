
package com.prowidesoftware.swift.model.mx.dic;

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
 * Document that a user must file with an authorized servicer for each contract that involves foreign currency transactions with non residents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistration8", propOrder = {
    "ctrctRegnOpngId",
    "prty",
    "ctrct",
    "ctrctBal",
    "pmtSchdlTp",
    "prvsRegnId",
    "addtlInf",
    "attchmnt",
    "splmtryData"
})
public class ContractRegistration8 {

    @XmlElement(name = "CtrctRegnOpngId", required = true)
    protected String ctrctRegnOpngId;
    @XmlElement(name = "Prty", required = true)
    @XmlSchemaType(name = "string")
    protected Priority2Code prty;
    @XmlElement(name = "Ctrct", required = true)
    protected UnderlyingContract4Choice ctrct;
    @XmlElement(name = "CtrctBal")
    protected List<ContractBalance1> ctrctBal;
    @XmlElement(name = "PmtSchdlTp")
    protected PaymentScheduleType2Choice pmtSchdlTp;
    @XmlElement(name = "PrvsRegnId")
    protected List<DocumentIdentification22> prvsRegnId;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ctrctRegnOpngId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctRegnOpngId() {
        return ctrctRegnOpngId;
    }

    /**
     * Sets the value of the ctrctRegnOpngId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractRegistration8 setCtrctRegnOpngId(String value) {
        this.ctrctRegnOpngId = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public ContractRegistration8 setPrty(Priority2Code value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the ctrct property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingContract4Choice }
     *     
     */
    public UnderlyingContract4Choice getCtrct() {
        return ctrct;
    }

    /**
     * Sets the value of the ctrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingContract4Choice }
     *     
     */
    public ContractRegistration8 setCtrct(UnderlyingContract4Choice value) {
        this.ctrct = value;
        return this;
    }

    /**
     * Gets the value of the ctrctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractBalance1 }
     * 
     * 
     */
    public List<ContractBalance1> getCtrctBal() {
        if (ctrctBal == null) {
            ctrctBal = new ArrayList<ContractBalance1>();
        }
        return this.ctrctBal;
    }

    /**
     * Gets the value of the pmtSchdlTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentScheduleType2Choice }
     *     
     */
    public PaymentScheduleType2Choice getPmtSchdlTp() {
        return pmtSchdlTp;
    }

    /**
     * Sets the value of the pmtSchdlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentScheduleType2Choice }
     *     
     */
    public ContractRegistration8 setPmtSchdlTp(PaymentScheduleType2Choice value) {
        this.pmtSchdlTp = value;
        return this;
    }

    /**
     * Gets the value of the prvsRegnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prvsRegnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsRegnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification22 }
     * 
     * 
     */
    public List<DocumentIdentification22> getPrvsRegnId() {
        if (prvsRegnId == null) {
            prvsRegnId = new ArrayList<DocumentIdentification22>();
        }
        return this.prvsRegnId;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractRegistration8 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<DocumentGeneralInformation5>();
        }
        return this.attchmnt;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the ctrctBal list.
     * @see #getCtrctBal()
     * 
     */
    public ContractRegistration8 addCtrctBal(ContractBalance1 ctrctBal) {
        getCtrctBal().add(ctrctBal);
        return this;
    }

    /**
     * Adds a new item to the prvsRegnId list.
     * @see #getPrvsRegnId()
     * 
     */
    public ContractRegistration8 addPrvsRegnId(DocumentIdentification22 prvsRegnId) {
        getPrvsRegnId().add(prvsRegnId);
        return this;
    }

    /**
     * Adds a new item to the attchmnt list.
     * @see #getAttchmnt()
     * 
     */
    public ContractRegistration8 addAttchmnt(DocumentGeneralInformation5 attchmnt) {
        getAttchmnt().add(attchmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ContractRegistration8 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
