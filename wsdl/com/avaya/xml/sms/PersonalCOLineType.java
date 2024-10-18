
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PersonalCOLineType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PersonalCOLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Group_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Access_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDR_Reports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Dial_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnect_Supervision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Chrarge_Conversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decimal_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charge_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Group_Direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnect_Timing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Termination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Loss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digital_Loss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Still_Held" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Receive_Answer_Supervision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_Disconnect_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_Glare_Guard_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ring_Monitor_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_End_Dial_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Programmed_Dial_Pause_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flash_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Disconnect_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Dial_Gaurd_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Glare_Guard_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Rotary_Dial_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_Seize_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Seize_Response_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnect_Signal_Error_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="End_2_End_Signaling_Tone_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="End_2_End_Signaling_Pause_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answer_Supervision_Timeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Make1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Break" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Break1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periodic_Pulse_Meter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Echo_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}PersonalCOLineArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalCOLineType", propOrder = {
    "groupNumber",
    "trunkGroupType",
    "groupName",
    "trunkAccessCode",
    "numberMembers",
    "coveragePath",
    "cdrReports",
    "outDisplay",
    "dataRestriction",
    "securityCode",
    "trunkType",
    "trunkPort",
    "trunkName",
    "outDialType",
    "prefix1",
    "disconnectSupervision",
    "gain",
    "chrargeConversion",
    "decimalPoint",
    "currencySymbol",
    "chargeType",
    "trunkGroupDirection",
    "disconnectTiming",
    "trunkTermination",
    "analogLoss",
    "digitalLoss",
    "callStillHeld",
    "receiveAnswerSupervision",
    "country",
    "inDisconnectTime",
    "inGlareGuardTime",
    "ringMonitorTime",
    "outEndDialTime",
    "programmedDialPauseTime",
    "flashLength",
    "outDisconnectTime",
    "outDialGaurdTime",
    "outGlareGuardTime",
    "outRotaryDialTime",
    "inSeizeTime",
    "outSeizeResponseTime",
    "disconnectSignalErrorTime",
    "end2EndSignalingToneTime",
    "end2EndSignalingPauseTime",
    "answerSupervisionTimeout",
    "pps",
    "make",
    "make1",
    "_break",
    "break1",
    "periodicPulseMeter",
    "ds1EchoCancel",
    "extension",
    "extName"
})
public class PersonalCOLineType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "Trunk_Group_Type")
    protected String trunkGroupType;
    @XmlElement(name = "Group_Name")
    protected String groupName;
    @XmlElement(name = "Trunk_Access_Code")
    protected String trunkAccessCode;
    @XmlElement(name = "Number_Members")
    protected String numberMembers;
    @XmlElement(name = "Coverage_Path")
    protected String coveragePath;
    @XmlElement(name = "CDR_Reports")
    protected String cdrReports;
    @XmlElement(name = "Out_Display")
    protected String outDisplay;
    @XmlElement(name = "Data_Restriction")
    protected String dataRestriction;
    @XmlElement(name = "Security_Code")
    protected String securityCode;
    @XmlElement(name = "Trunk_Type")
    protected String trunkType;
    @XmlElement(name = "Trunk_Port")
    protected String trunkPort;
    @XmlElement(name = "Trunk_Name")
    protected String trunkName;
    @XmlElement(name = "Out_Dial_Type")
    protected String outDialType;
    @XmlElement(name = "Prefix1")
    protected String prefix1;
    @XmlElement(name = "Disconnect_Supervision")
    protected String disconnectSupervision;
    @XmlElement(name = "Gain")
    protected String gain;
    @XmlElement(name = "Chrarge_Conversion")
    protected String chrargeConversion;
    @XmlElement(name = "Decimal_Point")
    protected String decimalPoint;
    @XmlElement(name = "Currency_Symbol")
    protected String currencySymbol;
    @XmlElement(name = "Charge_Type")
    protected String chargeType;
    @XmlElement(name = "Trunk_Group_Direction")
    protected String trunkGroupDirection;
    @XmlElement(name = "Disconnect_Timing")
    protected String disconnectTiming;
    @XmlElement(name = "Trunk_Termination")
    protected String trunkTermination;
    @XmlElement(name = "Analog_Loss")
    protected String analogLoss;
    @XmlElement(name = "Digital_Loss")
    protected String digitalLoss;
    @XmlElement(name = "Call_Still_Held")
    protected String callStillHeld;
    @XmlElement(name = "Receive_Answer_Supervision")
    protected String receiveAnswerSupervision;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "In_Disconnect_Time")
    protected String inDisconnectTime;
    @XmlElement(name = "In_Glare_Guard_Time")
    protected String inGlareGuardTime;
    @XmlElement(name = "Ring_Monitor_Time")
    protected String ringMonitorTime;
    @XmlElement(name = "Out_End_Dial_Time")
    protected String outEndDialTime;
    @XmlElement(name = "Programmed_Dial_Pause_Time")
    protected String programmedDialPauseTime;
    @XmlElement(name = "Flash_Length")
    protected String flashLength;
    @XmlElement(name = "Out_Disconnect_Time")
    protected String outDisconnectTime;
    @XmlElement(name = "Out_Dial_Gaurd_Time")
    protected String outDialGaurdTime;
    @XmlElement(name = "Out_Glare_Guard_Time")
    protected String outGlareGuardTime;
    @XmlElement(name = "Out_Rotary_Dial_Time")
    protected String outRotaryDialTime;
    @XmlElement(name = "In_Seize_Time")
    protected String inSeizeTime;
    @XmlElement(name = "Out_Seize_Response_Time")
    protected String outSeizeResponseTime;
    @XmlElement(name = "Disconnect_Signal_Error_Time")
    protected String disconnectSignalErrorTime;
    @XmlElement(name = "End_2_End_Signaling_Tone_Time")
    protected String end2EndSignalingToneTime;
    @XmlElement(name = "End_2_End_Signaling_Pause_Time")
    protected String end2EndSignalingPauseTime;
    @XmlElement(name = "Answer_Supervision_Timeout")
    protected String answerSupervisionTimeout;
    @XmlElement(name = "PPS")
    protected String pps;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "Make1")
    protected String make1;
    @XmlElement(name = "Break")
    protected String _break;
    @XmlElement(name = "Break1")
    protected String break1;
    @XmlElement(name = "Periodic_Pulse_Meter")
    protected String periodicPulseMeter;
    @XmlElement(name = "DS1_Echo_Cancel")
    protected String ds1EchoCancel;
    @XmlElement(name = "Extension")
    protected List<ArrayType> extension;
    @XmlElement(name = "Ext_Name")
    protected List<ArrayType> extName;

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
     * trunkGroupType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupType() {
        return trunkGroupType;
    }

    /**
     * trunkGroupType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupType(String value) {
        this.trunkGroupType = value;
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
     * trunkAccessCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkAccessCode() {
        return trunkAccessCode;
    }

    /**
     * trunkAccessCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkAccessCode(String value) {
        this.trunkAccessCode = value;
    }

    /**
     * numberMembers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberMembers() {
        return numberMembers;
    }

    /**
     * numberMembers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberMembers(String value) {
        this.numberMembers = value;
    }

    /**
     * coveragePath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath() {
        return coveragePath;
    }

    /**
     * coveragePath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath(String value) {
        this.coveragePath = value;
    }

    /**
     * cdrReports 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRReports() {
        return cdrReports;
    }

    /**
     * cdrReports 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRReports(String value) {
        this.cdrReports = value;
    }

    /**
     * outDisplay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDisplay() {
        return outDisplay;
    }

    /**
     * outDisplay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDisplay(String value) {
        this.outDisplay = value;
    }

    /**
     * dataRestriction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRestriction() {
        return dataRestriction;
    }

    /**
     * dataRestriction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRestriction(String value) {
        this.dataRestriction = value;
    }

    /**
     * securityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * securityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * trunkType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkType() {
        return trunkType;
    }

    /**
     * trunkType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkType(String value) {
        this.trunkType = value;
    }

    /**
     * trunkPort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPort() {
        return trunkPort;
    }

    /**
     * trunkPort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPort(String value) {
        this.trunkPort = value;
    }

    /**
     * trunkName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkName() {
        return trunkName;
    }

    /**
     * trunkName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkName(String value) {
        this.trunkName = value;
    }

    /**
     * outDialType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDialType() {
        return outDialType;
    }

    /**
     * outDialType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDialType(String value) {
        this.outDialType = value;
    }

    /**
     * prefix1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix1() {
        return prefix1;
    }

    /**
     * prefix1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix1(String value) {
        this.prefix1 = value;
    }

    /**
     * disconnectSupervision 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectSupervision() {
        return disconnectSupervision;
    }

    /**
     * disconnectSupervision 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectSupervision(String value) {
        this.disconnectSupervision = value;
    }

    /**
     * gain 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGain() {
        return gain;
    }

    /**
     * gain 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGain(String value) {
        this.gain = value;
    }

    /**
     * chrargeConversion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrargeConversion() {
        return chrargeConversion;
    }

    /**
     * chrargeConversion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrargeConversion(String value) {
        this.chrargeConversion = value;
    }

    /**
     * decimalPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalPoint() {
        return decimalPoint;
    }

    /**
     * decimalPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalPoint(String value) {
        this.decimalPoint = value;
    }

    /**
     * currencySymbol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * currencySymbol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /**
     * chargeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * chargeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * trunkGroupDirection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupDirection() {
        return trunkGroupDirection;
    }

    /**
     * trunkGroupDirection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupDirection(String value) {
        this.trunkGroupDirection = value;
    }

    /**
     * disconnectTiming 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectTiming() {
        return disconnectTiming;
    }

    /**
     * disconnectTiming 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectTiming(String value) {
        this.disconnectTiming = value;
    }

    /**
     * trunkTermination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkTermination() {
        return trunkTermination;
    }

    /**
     * trunkTermination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkTermination(String value) {
        this.trunkTermination = value;
    }

    /**
     * analogLoss 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogLoss() {
        return analogLoss;
    }

    /**
     * analogLoss 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogLoss(String value) {
        this.analogLoss = value;
    }

    /**
     * digitalLoss 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalLoss() {
        return digitalLoss;
    }

    /**
     * digitalLoss 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalLoss(String value) {
        this.digitalLoss = value;
    }

    /**
     * callStillHeld 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallStillHeld() {
        return callStillHeld;
    }

    /**
     * callStillHeld 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallStillHeld(String value) {
        this.callStillHeld = value;
    }

    /**
     * receiveAnswerSupervision 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAnswerSupervision() {
        return receiveAnswerSupervision;
    }

    /**
     * receiveAnswerSupervision 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAnswerSupervision(String value) {
        this.receiveAnswerSupervision = value;
    }

    /**
     * country 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * country 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * inDisconnectTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDisconnectTime() {
        return inDisconnectTime;
    }

    /**
     * inDisconnectTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDisconnectTime(String value) {
        this.inDisconnectTime = value;
    }

    /**
     * inGlareGuardTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlareGuardTime() {
        return inGlareGuardTime;
    }

    /**
     * inGlareGuardTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlareGuardTime(String value) {
        this.inGlareGuardTime = value;
    }

    /**
     * ringMonitorTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingMonitorTime() {
        return ringMonitorTime;
    }

    /**
     * ringMonitorTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingMonitorTime(String value) {
        this.ringMonitorTime = value;
    }

    /**
     * outEndDialTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEndDialTime() {
        return outEndDialTime;
    }

    /**
     * outEndDialTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEndDialTime(String value) {
        this.outEndDialTime = value;
    }

    /**
     * programmedDialPauseTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgrammedDialPauseTime() {
        return programmedDialPauseTime;
    }

    /**
     * programmedDialPauseTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgrammedDialPauseTime(String value) {
        this.programmedDialPauseTime = value;
    }

    /**
     * flashLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashLength() {
        return flashLength;
    }

    /**
     * flashLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashLength(String value) {
        this.flashLength = value;
    }

    /**
     * outDisconnectTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDisconnectTime() {
        return outDisconnectTime;
    }

    /**
     * outDisconnectTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDisconnectTime(String value) {
        this.outDisconnectTime = value;
    }

    /**
     * outDialGaurdTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDialGaurdTime() {
        return outDialGaurdTime;
    }

    /**
     * outDialGaurdTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDialGaurdTime(String value) {
        this.outDialGaurdTime = value;
    }

    /**
     * outGlareGuardTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlareGuardTime() {
        return outGlareGuardTime;
    }

    /**
     * outGlareGuardTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlareGuardTime(String value) {
        this.outGlareGuardTime = value;
    }

    /**
     * outRotaryDialTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRotaryDialTime() {
        return outRotaryDialTime;
    }

    /**
     * outRotaryDialTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRotaryDialTime(String value) {
        this.outRotaryDialTime = value;
    }

    /**
     * inSeizeTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSeizeTime() {
        return inSeizeTime;
    }

    /**
     * inSeizeTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSeizeTime(String value) {
        this.inSeizeTime = value;
    }

    /**
     * outSeizeResponseTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSeizeResponseTime() {
        return outSeizeResponseTime;
    }

    /**
     * outSeizeResponseTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSeizeResponseTime(String value) {
        this.outSeizeResponseTime = value;
    }

    /**
     * disconnectSignalErrorTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectSignalErrorTime() {
        return disconnectSignalErrorTime;
    }

    /**
     * disconnectSignalErrorTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectSignalErrorTime(String value) {
        this.disconnectSignalErrorTime = value;
    }

    /**
     * end2EndSignalingToneTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd2EndSignalingToneTime() {
        return end2EndSignalingToneTime;
    }

    /**
     * end2EndSignalingToneTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd2EndSignalingToneTime(String value) {
        this.end2EndSignalingToneTime = value;
    }

    /**
     * end2EndSignalingPauseTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd2EndSignalingPauseTime() {
        return end2EndSignalingPauseTime;
    }

    /**
     * end2EndSignalingPauseTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd2EndSignalingPauseTime(String value) {
        this.end2EndSignalingPauseTime = value;
    }

    /**
     * answerSupervisionTimeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerSupervisionTimeout() {
        return answerSupervisionTimeout;
    }

    /**
     * answerSupervisionTimeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerSupervisionTimeout(String value) {
        this.answerSupervisionTimeout = value;
    }

    /**
     * pps 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPS() {
        return pps;
    }

    /**
     * pps 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPS(String value) {
        this.pps = value;
    }

    /**
     * make 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * make 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * make1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake1() {
        return make1;
    }

    /**
     * make1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake1(String value) {
        this.make1 = value;
    }

    /**
     * break 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreak() {
        return _break;
    }

    /**
     * break 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreak(String value) {
        this._break = value;
    }

    /**
     * break1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreak1() {
        return break1;
    }

    /**
     * break1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreak1(String value) {
        this.break1 = value;
    }

    /**
     * periodicPulseMeter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicPulseMeter() {
        return periodicPulseMeter;
    }

    /**
     * periodicPulseMeter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicPulseMeter(String value) {
        this.periodicPulseMeter = value;
    }

    /**
     * ds1EchoCancel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1EchoCancel() {
        return ds1EchoCancel;
    }

    /**
     * ds1EchoCancel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1EchoCancel(String value) {
        this.ds1EchoCancel = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ArrayType>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the extName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtName() {
        if (extName == null) {
            extName = new ArrayList<ArrayType>();
        }
        return this.extName;
    }

}
