
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
 * Choice of instruction type status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionTypeStatus6Choice", propOrder = {
    "instrSts",
    "cxlSts"
})
public class InstructionTypeStatus6Choice {

    @XmlElement(name = "InstrSts")
    protected List<DetailedInstructionStatus20> instrSts;
    @XmlElement(name = "CxlSts")
    protected CancellationStatus27Choice cxlSts;

    /**
     * Gets the value of the instrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionStatus20 }
     * 
     * 
     */
    public List<DetailedInstructionStatus20> getInstrSts() {
        if (instrSts == null) {
            instrSts = new ArrayList<DetailedInstructionStatus20>();
        }
        return this.instrSts;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus27Choice }
     *     
     */
    public CancellationStatus27Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus27Choice }
     *     
     */
    public InstructionTypeStatus6Choice setCxlSts(CancellationStatus27Choice value) {
        this.cxlSts = value;
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
     * Adds a new item to the instrSts list.
     * @see #getInstrSts()
     * 
     */
    public InstructionTypeStatus6Choice addInstrSts(DetailedInstructionStatus20 instrSts) {
        getInstrSts().add(instrSts);
        return this;
    }

}
