
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion29", propOrder = {
    "ccyConvsId",
    "trgtCcy",
    "rsltgAmt",
    "xchgRate",
    "nvrtdXchgRate",
    "qtnDt",
    "vldFr",
    "vldUntil",
    "srcCcy",
    "aplblBinRg",
    "orgnlAmt",
    "comssnDtls",
    "mrkUpDtls",
    "dclrtnDtls"
})
public class CurrencyConversion29 {

    @XmlElement(name = "CcyConvsId")
    protected String ccyConvsId;
    @XmlElement(name = "TrgtCcy", required = true)
    protected CurrencyDetails3 trgtCcy;
    @XmlElement(name = "RsltgAmt")
    protected BigDecimal rsltgAmt;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "NvrtdXchgRate")
    protected BigDecimal nvrtdXchgRate;
    @XmlElement(name = "QtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qtnDt;
    @XmlElement(name = "VldFr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldFr;
    @XmlElement(name = "VldUntil", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntil;
    @XmlElement(name = "SrcCcy", required = true)
    protected CurrencyDetails2 srcCcy;
    @XmlElement(name = "AplblBinRg")
    protected List<BinRange1> aplblBinRg;
    @XmlElement(name = "OrgnlAmt")
    protected OriginalAmountDetails1 orgnlAmt;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission19> comssnDtls;
    @XmlElement(name = "MrkUpDtls")
    protected List<Commission18> mrkUpDtls;
    @XmlElement(name = "DclrtnDtls")
    protected List<ActionMessage11> dclrtnDtls;

    /**
     * Gets the value of the ccyConvsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyConvsId() {
        return ccyConvsId;
    }

    /**
     * Sets the value of the ccyConvsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion29 setCcyConvsId(String value) {
        this.ccyConvsId = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetails3 }
     *     
     */
    public CurrencyDetails3 getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetails3 }
     *     
     */
    public CurrencyConversion29 setTrgtCcy(CurrencyDetails3 value) {
        this.trgtCcy = value;
        return this;
    }

    /**
     * Gets the value of the rsltgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsltgAmt() {
        return rsltgAmt;
    }

    /**
     * Sets the value of the rsltgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion29 setRsltgAmt(BigDecimal value) {
        this.rsltgAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion29 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the nvrtdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNvrtdXchgRate() {
        return nvrtdXchgRate;
    }

    /**
     * Sets the value of the nvrtdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion29 setNvrtdXchgRate(BigDecimal value) {
        this.nvrtdXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion29 setQtnDt(XMLGregorianCalendar value) {
        this.qtnDt = value;
        return this;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion29 setVldFr(XMLGregorianCalendar value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion29 setVldUntil(XMLGregorianCalendar value) {
        this.vldUntil = value;
        return this;
    }

    /**
     * Gets the value of the srcCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetails2 }
     *     
     */
    public CurrencyDetails2 getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetails2 }
     *     
     */
    public CurrencyConversion29 setSrcCcy(CurrencyDetails2 value) {
        this.srcCcy = value;
        return this;
    }

    /**
     * Gets the value of the aplblBinRg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aplblBinRg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAplblBinRg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinRange1 }
     * 
     * 
     */
    public List<BinRange1> getAplblBinRg() {
        if (aplblBinRg == null) {
            aplblBinRg = new ArrayList<BinRange1>();
        }
        return this.aplblBinRg;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAmountDetails1 }
     *     
     */
    public OriginalAmountDetails1 getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAmountDetails1 }
     *     
     */
    public CurrencyConversion29 setOrgnlAmt(OriginalAmountDetails1 value) {
        this.orgnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission19 }
     * 
     * 
     */
    public List<Commission19> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<Commission19>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the mrkUpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrkUpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkUpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission18 }
     * 
     * 
     */
    public List<Commission18> getMrkUpDtls() {
        if (mrkUpDtls == null) {
            mrkUpDtls = new ArrayList<Commission18>();
        }
        return this.mrkUpDtls;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dclrtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDclrtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionMessage11 }
     * 
     * 
     */
    public List<ActionMessage11> getDclrtnDtls() {
        if (dclrtnDtls == null) {
            dclrtnDtls = new ArrayList<ActionMessage11>();
        }
        return this.dclrtnDtls;
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
     * Adds a new item to the aplblBinRg list.
     * @see #getAplblBinRg()
     * 
     */
    public CurrencyConversion29 addAplblBinRg(BinRange1 aplblBinRg) {
        getAplblBinRg().add(aplblBinRg);
        return this;
    }

    /**
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public CurrencyConversion29 addComssnDtls(Commission19 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

    /**
     * Adds a new item to the mrkUpDtls list.
     * @see #getMrkUpDtls()
     * 
     */
    public CurrencyConversion29 addMrkUpDtls(Commission18 mrkUpDtls) {
        getMrkUpDtls().add(mrkUpDtls);
        return this;
    }

    /**
     * Adds a new item to the dclrtnDtls list.
     * @see #getDclrtnDtls()
     * 
     */
    public CurrencyConversion29 addDclrtnDtls(ActionMessage11 dclrtnDtls) {
        getDclrtnDtls().add(dclrtnDtls);
        return this;
    }

}
