
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
 * Document that a user must file with an authorised servicer for each contract that involves foreign currency transactions with non residents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContract20", propOrder = {
    "orgnlCtrctRegnReq",
    "rptgPty",
    "regnAgt",
    "issrFI",
    "ctrct",
    "ctrctBal",
    "pmtSchdlTp",
    "regdCtrctId",
    "prvsRegdCtrctId",
    "regdCtrctJrnl",
    "amdmnt",
    "submissn",
    "dlvry",
    "lnPrncplAmt",
    "estmtdDtInd",
    "intrCpnyLn",
    "addtlInf",
    "splmtryData"
})
public class RegisteredContract20 {

    @XmlElement(name = "OrgnlCtrctRegnReq")
    protected String orgnlCtrctRegnReq;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty6 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification8 regnAgt;
    @XmlElement(name = "IssrFI", required = true)
    protected BranchAndFinancialInstitutionIdentification8 issrFI;
    @XmlElement(name = "Ctrct", required = true)
    protected UnderlyingContract4Choice ctrct;
    @XmlElement(name = "CtrctBal")
    protected List<ContractBalance1> ctrctBal;
    @XmlElement(name = "PmtSchdlTp")
    protected PaymentScheduleType2Choice pmtSchdlTp;
    @XmlElement(name = "RegdCtrctId", required = true)
    protected DocumentIdentification29 regdCtrctId;
    @XmlElement(name = "PrvsRegdCtrctId")
    protected DocumentIdentification22 prvsRegdCtrctId;
    @XmlElement(name = "RegdCtrctJrnl")
    protected List<RegisteredContractJournal3> regdCtrctJrnl;
    @XmlElement(name = "Amdmnt")
    protected List<RegisteredContractAmendment1> amdmnt;
    @XmlElement(name = "Submissn", required = true)
    protected RegisteredContractCommunication1 submissn;
    @XmlElement(name = "Dlvry", required = true)
    protected RegisteredContractCommunication1 dlvry;
    @XmlElement(name = "LnPrncplAmt")
    protected ActiveCurrencyAndAmount lnPrncplAmt;
    @XmlElement(name = "EstmtdDtInd")
    protected boolean estmtdDtInd;
    @XmlElement(name = "IntrCpnyLn")
    protected boolean intrCpnyLn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the orgnlCtrctRegnReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlCtrctRegnReq() {
        return orgnlCtrctRegnReq;
    }

    /**
     * Sets the value of the orgnlCtrctRegnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegisteredContract20 setOrgnlCtrctRegnReq(String value) {
        this.orgnlCtrctRegnReq = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty6 }
     *     
     */
    public TradeParty6 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty6 }
     *     
     */
    public RegisteredContract20 setRptgPty(TradeParty6 value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public RegisteredContract20 setRegnAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.regnAgt = value;
        return this;
    }

    /**
     * Gets the value of the issrFI property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getIssrFI() {
        return issrFI;
    }

    /**
     * Sets the value of the issrFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public RegisteredContract20 setIssrFI(BranchAndFinancialInstitutionIdentification8 value) {
        this.issrFI = value;
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
    public RegisteredContract20 setCtrct(UnderlyingContract4Choice value) {
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
    public RegisteredContract20 setPmtSchdlTp(PaymentScheduleType2Choice value) {
        this.pmtSchdlTp = value;
        return this;
    }

    /**
     * Gets the value of the regdCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification29 }
     *     
     */
    public DocumentIdentification29 getRegdCtrctId() {
        return regdCtrctId;
    }

    /**
     * Sets the value of the regdCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification29 }
     *     
     */
    public RegisteredContract20 setRegdCtrctId(DocumentIdentification29 value) {
        this.regdCtrctId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRegdCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getPrvsRegdCtrctId() {
        return prvsRegdCtrctId;
    }

    /**
     * Sets the value of the prvsRegdCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public RegisteredContract20 setPrvsRegdCtrctId(DocumentIdentification22 value) {
        this.prvsRegdCtrctId = value;
        return this;
    }

    /**
     * Gets the value of the regdCtrctJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regdCtrctJrnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdCtrctJrnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredContractJournal3 }
     * 
     * 
     */
    public List<RegisteredContractJournal3> getRegdCtrctJrnl() {
        if (regdCtrctJrnl == null) {
            regdCtrctJrnl = new ArrayList<RegisteredContractJournal3>();
        }
        return this.regdCtrctJrnl;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amdmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmdmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredContractAmendment1 }
     * 
     * 
     */
    public List<RegisteredContractAmendment1> getAmdmnt() {
        if (amdmnt == null) {
            amdmnt = new ArrayList<RegisteredContractAmendment1>();
        }
        return this.amdmnt;
    }

    /**
     * Gets the value of the submissn property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredContractCommunication1 }
     *     
     */
    public RegisteredContractCommunication1 getSubmissn() {
        return submissn;
    }

    /**
     * Sets the value of the submissn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredContractCommunication1 }
     *     
     */
    public RegisteredContract20 setSubmissn(RegisteredContractCommunication1 value) {
        this.submissn = value;
        return this;
    }

    /**
     * Gets the value of the dlvry property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredContractCommunication1 }
     *     
     */
    public RegisteredContractCommunication1 getDlvry() {
        return dlvry;
    }

    /**
     * Sets the value of the dlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredContractCommunication1 }
     *     
     */
    public RegisteredContract20 setDlvry(RegisteredContractCommunication1 value) {
        this.dlvry = value;
        return this;
    }

    /**
     * Gets the value of the lnPrncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLnPrncplAmt() {
        return lnPrncplAmt;
    }

    /**
     * Sets the value of the lnPrncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RegisteredContract20 setLnPrncplAmt(ActiveCurrencyAndAmount value) {
        this.lnPrncplAmt = value;
        return this;
    }

    /**
     * Gets the value of the estmtdDtInd property.
     * 
     */
    public boolean isEstmtdDtInd() {
        return estmtdDtInd;
    }

    /**
     * Sets the value of the estmtdDtInd property.
     * 
     */
    public RegisteredContract20 setEstmtdDtInd(boolean value) {
        this.estmtdDtInd = value;
        return this;
    }

    /**
     * Gets the value of the intrCpnyLn property.
     * 
     */
    public boolean isIntrCpnyLn() {
        return intrCpnyLn;
    }

    /**
     * Sets the value of the intrCpnyLn property.
     * 
     */
    public RegisteredContract20 setIntrCpnyLn(boolean value) {
        this.intrCpnyLn = value;
        return this;
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
    public RegisteredContract20 setAddtlInf(String value) {
        this.addtlInf = value;
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
     * Adds a new item to the ctrctBal list.
     * @see #getCtrctBal()
     * 
     */
    public RegisteredContract20 addCtrctBal(ContractBalance1 ctrctBal) {
        getCtrctBal().add(ctrctBal);
        return this;
    }

    /**
     * Adds a new item to the regdCtrctJrnl list.
     * @see #getRegdCtrctJrnl()
     * 
     */
    public RegisteredContract20 addRegdCtrctJrnl(RegisteredContractJournal3 regdCtrctJrnl) {
        getRegdCtrctJrnl().add(regdCtrctJrnl);
        return this;
    }

    /**
     * Adds a new item to the amdmnt list.
     * @see #getAmdmnt()
     * 
     */
    public RegisteredContract20 addAmdmnt(RegisteredContractAmendment1 amdmnt) {
        getAmdmnt().add(amdmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RegisteredContract20 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
