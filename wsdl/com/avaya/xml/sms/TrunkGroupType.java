
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrunkGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TrunkGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Administered_Members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Measured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_of_Members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Carrier_Medium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_Scripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUI_Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_VDN_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Collected_Digits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_LAI_Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Held_Call_UCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECD_UUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prepend_'+'_to_Calling/Alerting/Diverting/Connected_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}TrunkGroupArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrunkGroupType", propOrder = {
    "groupNumber",
    "tac",
    "groupType",
    "groupName",
    "totalAdministeredMembers",
    "tn",
    "cor",
    "cdr",
    "measured",
    "outgoingDisplay",
    "queueLength",
    "numberOfMembers",
    "serviceType",
    "carrierMedium",
    "nativeName1",
    "nativeName2",
    "nativeName3",
    "nativeName4",
    "nativeName5",
    "nativeNameScripts",
    "uuiTreatment",
    "asai",
    "ucid",
    "inVDNTime",
    "vdnName",
    "collectedDigits",
    "otherLAIInformation",
    "heldCallUCID",
    "ecduui",
    "prepend0027002B0027ToCalling002FAlerting002FDiverting002FConnectedNumber",
    "port",
    "code",
    "sfx",
    "name",
    "night",
    "sigGrp"
})
public class TrunkGroupType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "TAC")
    protected String tac;
    @XmlElement(name = "Group_Type")
    protected String groupType;
    @XmlElement(name = "Group_Name")
    protected String groupName;
    @XmlElement(name = "Total_Administered_Members")
    protected String totalAdministeredMembers;
    @XmlElement(name = "TN")
    protected String tn;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "CDR")
    protected String cdr;
    @XmlElement(name = "Measured")
    protected String measured;
    @XmlElement(name = "Outgoing_Display")
    protected String outgoingDisplay;
    @XmlElement(name = "Queue_Length")
    protected String queueLength;
    @XmlElement(name = "Number_of_Members")
    protected String numberOfMembers;
    @XmlElement(name = "Service_Type")
    protected String serviceType;
    @XmlElement(name = "Carrier_Medium")
    protected String carrierMedium;
    @XmlElement(name = "Native_Name_1")
    protected String nativeName1;
    @XmlElement(name = "Native_Name_2")
    protected String nativeName2;
    @XmlElement(name = "Native_Name_3")
    protected String nativeName3;
    @XmlElement(name = "Native_Name_4")
    protected String nativeName4;
    @XmlElement(name = "Native_Name_5")
    protected String nativeName5;
    @XmlElement(name = "Native_Name_Scripts")
    protected String nativeNameScripts;
    @XmlElement(name = "UUI_Treatment")
    protected String uuiTreatment;
    @XmlElement(name = "ASAI")
    protected String asai;
    @XmlElement(name = "UCID")
    protected String ucid;
    @XmlElement(name = "In_VDN_Time")
    protected String inVDNTime;
    @XmlElement(name = "VDN_Name")
    protected String vdnName;
    @XmlElement(name = "Collected_Digits")
    protected String collectedDigits;
    @XmlElement(name = "Other_LAI_Information")
    protected String otherLAIInformation;
    @XmlElement(name = "Held_Call_UCID")
    protected String heldCallUCID;
    @XmlElement(name = "ECD_UUI")
    protected String ecduui;
    @XmlElement(name = "Prepend_'+'_to_Calling/Alerting/Diverting/Connected_Number")
    protected String prepend0027002B0027ToCalling002FAlerting002FDiverting002FConnectedNumber;
    @XmlElement(name = "Port")
    protected List<ArrayType> port;
    @XmlElement(name = "Code")
    protected List<ArrayType> code;
    @XmlElement(name = "Sfx")
    protected List<ArrayType> sfx;
    @XmlElement(name = "Name")
    protected List<ArrayType> name;
    @XmlElement(name = "Night")
    protected List<ArrayType> night;
    @XmlElement(name = "Sig_Grp")
    protected List<ArrayType> sigGrp;

    /**
     * groupNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNumber() {
        return groupNumber;
    }

    /**
     * groupNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNumber(String value) {
        this.groupNumber = value;
    }

    /**
     * tac 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAC() {
        return tac;
    }

    /**
     * tac 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAC(String value) {
        this.tac = value;
    }

    /**
     * groupType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * groupType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * groupName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * groupName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * totalAdministeredMembers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAdministeredMembers() {
        return totalAdministeredMembers;
    }

    /**
     * totalAdministeredMembers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAdministeredMembers(String value) {
        this.totalAdministeredMembers = value;
    }

    /**
     * tn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN() {
        return tn;
    }

    /**
     * tn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN(String value) {
        this.tn = value;
    }

    /**
     * cor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOR() {
        return cor;
    }

    /**
     * cor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOR(String value) {
        this.cor = value;
    }

    /**
     * cdr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDR() {
        return cdr;
    }

    /**
     * cdr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDR(String value) {
        this.cdr = value;
    }

    /**
     * measured 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasured() {
        return measured;
    }

    /**
     * measured 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasured(String value) {
        this.measured = value;
    }

    /**
     * outgoingDisplay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingDisplay() {
        return outgoingDisplay;
    }

    /**
     * outgoingDisplay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingDisplay(String value) {
        this.outgoingDisplay = value;
    }

    /**
     * queueLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueLength() {
        return queueLength;
    }

    /**
     * queueLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueLength(String value) {
        this.queueLength = value;
    }

    /**
     * numberOfMembers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfMembers() {
        return numberOfMembers;
    }

    /**
     * numberOfMembers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfMembers(String value) {
        this.numberOfMembers = value;
    }

    /**
     * serviceType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * serviceType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * carrierMedium 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierMedium() {
        return carrierMedium;
    }

    /**
     * carrierMedium 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierMedium(String value) {
        this.carrierMedium = value;
    }

    /**
     * nativeName1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName1() {
        return nativeName1;
    }

    /**
     * nativeName1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName1(String value) {
        this.nativeName1 = value;
    }

    /**
     * nativeName2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName2() {
        return nativeName2;
    }

    /**
     * nativeName2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName2(String value) {
        this.nativeName2 = value;
    }

    /**
     * nativeName3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName3() {
        return nativeName3;
    }

    /**
     * nativeName3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName3(String value) {
        this.nativeName3 = value;
    }

    /**
     * nativeName4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName4() {
        return nativeName4;
    }

    /**
     * nativeName4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName4(String value) {
        this.nativeName4 = value;
    }

    /**
     * nativeName5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName5() {
        return nativeName5;
    }

    /**
     * nativeName5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName5(String value) {
        this.nativeName5 = value;
    }

    /**
     * nativeNameScripts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeNameScripts() {
        return nativeNameScripts;
    }

    /**
     * nativeNameScripts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeNameScripts(String value) {
        this.nativeNameScripts = value;
    }

    /**
     * uuiTreatment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUITreatment() {
        return uuiTreatment;
    }

    /**
     * uuiTreatment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUITreatment(String value) {
        this.uuiTreatment = value;
    }

    /**
     * asai 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAI() {
        return asai;
    }

    /**
     * asai 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAI(String value) {
        this.asai = value;
    }

    /**
     * ucid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCID() {
        return ucid;
    }

    /**
     * ucid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCID(String value) {
        this.ucid = value;
    }

    /**
     * inVDNTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInVDNTime() {
        return inVDNTime;
    }

    /**
     * inVDNTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInVDNTime(String value) {
        this.inVDNTime = value;
    }

    /**
     * vdnName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNName() {
        return vdnName;
    }

    /**
     * vdnName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNName(String value) {
        this.vdnName = value;
    }

    /**
     * collectedDigits 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectedDigits() {
        return collectedDigits;
    }

    /**
     * collectedDigits 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectedDigits(String value) {
        this.collectedDigits = value;
    }

    /**
     * otherLAIInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLAIInformation() {
        return otherLAIInformation;
    }

    /**
     * otherLAIInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLAIInformation(String value) {
        this.otherLAIInformation = value;
    }

    /**
     * heldCallUCID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeldCallUCID() {
        return heldCallUCID;
    }

    /**
     * heldCallUCID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeldCallUCID(String value) {
        this.heldCallUCID = value;
    }

    /**
     * ecduui 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECDUUI() {
        return ecduui;
    }

    /**
     * ecduui 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECDUUI(String value) {
        this.ecduui = value;
    }

    /**
     * prepend0027002B0027ToCalling002FAlerting002FDiverting002FConnectedNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepend_0027_002b_0027ToCalling_002fAlerting_002fDiverting_002fConnectedNumber() {
        return prepend0027002B0027ToCalling002FAlerting002FDiverting002FConnectedNumber;
    }

    /**
     * prepend0027002B0027ToCalling002FAlerting002FDiverting002FConnectedNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepend_0027_002b_0027ToCalling_002fAlerting_002fDiverting_002fConnectedNumber(String value) {
        this.prepend0027002B0027ToCalling002FAlerting002FDiverting002FConnectedNumber = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the port property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPort() {
        if (port == null) {
            port = new ArrayList<ArrayType>();
        }
        return this.port;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCode() {
        if (code == null) {
            code = new ArrayList<ArrayType>();
        }
        return this.code;
    }

    /**
     * Gets the value of the sfx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sfx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSfx() {
        if (sfx == null) {
            sfx = new ArrayList<ArrayType>();
        }
        return this.sfx;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getName() {
        if (name == null) {
            name = new ArrayList<ArrayType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the night property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the night property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNight() {
        if (night == null) {
            night = new ArrayList<ArrayType>();
        }
        return this.night;
    }

    /**
     * Gets the value of the sigGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sigGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSigGrp() {
        if (sigGrp == null) {
            sigGrp = new ArrayList<ArrayType>();
        }
        return this.sigGrp;
    }

}
