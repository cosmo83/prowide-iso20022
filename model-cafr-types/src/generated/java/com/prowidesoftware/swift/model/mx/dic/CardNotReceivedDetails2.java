
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of a non-received card.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardNotReceivedDetails2", propOrder = {
    "dtOfCardMld",
    "mlngAdr",
    "mlngAdrUstrd",
    "mldFrPstlCd",
    "vldFr",
    "cardSctyCdInd",
    "cardSctyCpblty"
})
public class CardNotReceivedDetails2 {

    @XmlElement(name = "DtOfCardMld", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfCardMld;
    @XmlElement(name = "MlngAdr")
    protected Address2 mlngAdr;
    @XmlElement(name = "MlngAdrUstrd")
    protected String mlngAdrUstrd;
    @XmlElement(name = "MldFrPstlCd", required = true)
    protected String mldFrPstlCd;
    @XmlElement(name = "VldFr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldFr;
    @XmlElement(name = "CardSctyCdInd")
    protected Boolean cardSctyCdInd;
    @XmlElement(name = "CardSctyCpblty")
    protected List<CardSecurityCapability1> cardSctyCpblty;

    /**
     * Gets the value of the dtOfCardMld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtOfCardMld() {
        return dtOfCardMld;
    }

    /**
     * Sets the value of the dtOfCardMld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardNotReceivedDetails2 setDtOfCardMld(XMLGregorianCalendar value) {
        this.dtOfCardMld = value;
        return this;
    }

    /**
     * Gets the value of the mlngAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getMlngAdr() {
        return mlngAdr;
    }

    /**
     * Sets the value of the mlngAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public CardNotReceivedDetails2 setMlngAdr(Address2 value) {
        this.mlngAdr = value;
        return this;
    }

    /**
     * Gets the value of the mlngAdrUstrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlngAdrUstrd() {
        return mlngAdrUstrd;
    }

    /**
     * Sets the value of the mlngAdrUstrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardNotReceivedDetails2 setMlngAdrUstrd(String value) {
        this.mlngAdrUstrd = value;
        return this;
    }

    /**
     * Gets the value of the mldFrPstlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMldFrPstlCd() {
        return mldFrPstlCd;
    }

    /**
     * Sets the value of the mldFrPstlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardNotReceivedDetails2 setMldFrPstlCd(String value) {
        this.mldFrPstlCd = value;
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
    public CardNotReceivedDetails2 setVldFr(XMLGregorianCalendar value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the cardSctyCdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardSctyCdInd() {
        return cardSctyCdInd;
    }

    /**
     * Sets the value of the cardSctyCdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardNotReceivedDetails2 setCardSctyCdInd(Boolean value) {
        this.cardSctyCdInd = value;
        return this;
    }

    /**
     * Gets the value of the cardSctyCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardSctyCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardSctyCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardSecurityCapability1 }
     * 
     * 
     */
    public List<CardSecurityCapability1> getCardSctyCpblty() {
        if (cardSctyCpblty == null) {
            cardSctyCpblty = new ArrayList<CardSecurityCapability1>();
        }
        return this.cardSctyCpblty;
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
     * Adds a new item to the cardSctyCpblty list.
     * @see #getCardSctyCpblty()
     * 
     */
    public CardNotReceivedDetails2 addCardSctyCpblty(CardSecurityCapability1 cardSctyCpblty) {
        getCardSctyCpblty().add(cardSctyCpblty);
        return this;
    }

}
