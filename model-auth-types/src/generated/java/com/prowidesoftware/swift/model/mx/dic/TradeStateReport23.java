
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details for a trade state report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStateReport23", propOrder = {
    "ctrPtySpcfcData",
    "cmonTradData",
    "techAttrbts",
    "pblcDssmntnData",
    "splmtryData"
})
public class TradeStateReport23 {

    @XmlElement(name = "CtrPtySpcfcData", required = true)
    protected List<CounterpartySpecificData36> ctrPtySpcfcData;
    @XmlElement(name = "CmonTradData", required = true)
    protected CommonTradeDataReport72 cmonTradData;
    @XmlElement(name = "TechAttrbts")
    protected TechnicalAttributes5 techAttrbts;
    @XmlElement(name = "PblcDssmntnData")
    protected DisseminationData1 pblcDssmntnData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ctrPtySpcfcData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrPtySpcfcData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtySpcfcData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartySpecificData36 }
     * 
     * 
     */
    public List<CounterpartySpecificData36> getCtrPtySpcfcData() {
        if (ctrPtySpcfcData == null) {
            ctrPtySpcfcData = new ArrayList<CounterpartySpecificData36>();
        }
        return this.ctrPtySpcfcData;
    }

    /**
     * Gets the value of the cmonTradData property.
     * 
     * @return
     *     possible object is
     *     {@link CommonTradeDataReport72 }
     *     
     */
    public CommonTradeDataReport72 getCmonTradData() {
        return cmonTradData;
    }

    /**
     * Sets the value of the cmonTradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonTradeDataReport72 }
     *     
     */
    public TradeStateReport23 setCmonTradData(CommonTradeDataReport72 value) {
        this.cmonTradData = value;
        return this;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalAttributes5 }
     *     
     */
    public TechnicalAttributes5 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalAttributes5 }
     *     
     */
    public TradeStateReport23 setTechAttrbts(TechnicalAttributes5 value) {
        this.techAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the pblcDssmntnData property.
     * 
     * @return
     *     possible object is
     *     {@link DisseminationData1 }
     *     
     */
    public DisseminationData1 getPblcDssmntnData() {
        return pblcDssmntnData;
    }

    /**
     * Sets the value of the pblcDssmntnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisseminationData1 }
     *     
     */
    public TradeStateReport23 setPblcDssmntnData(DisseminationData1 value) {
        this.pblcDssmntnData = value;
        return this;
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
     * Adds a new item to the ctrPtySpcfcData list.
     * @see #getCtrPtySpcfcData()
     * 
     */
    public TradeStateReport23 addCtrPtySpcfcData(CounterpartySpecificData36 ctrPtySpcfcData) {
        getCtrPtySpcfcData().add(ctrPtySpcfcData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TradeStateReport23 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
