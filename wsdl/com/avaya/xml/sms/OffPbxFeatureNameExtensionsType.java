
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OffPbxFeatureNameExtensionsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OffPbxFeatureNameExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Set_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active_Appearance_Select" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automatic_Call_Back" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automatic_Call_Back_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Forward_All" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Forward_Busy_No_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Forward_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Park" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Park_Answer_Back" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Pick_Up" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calling_Number_Block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calling_Number_Unblock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conditional_Call_Extend_Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conditional_Call_Extend_Disable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conference_Complete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conference_on_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Directed_Call_Pick_Up" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Drop_Last_Added_Party" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exclusion_Toggle_On_Off" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extended_Group_Call_Pickup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Held_Appearance_Select" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idle_Appearance_Select" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Number_Dialed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Malicious_Call_Trace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Malicious_Call_Trace_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Off_Pbx_Call_Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Off_Pbx_Call_Disable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Send_All_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Send_All_Calls_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer_Complete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer_On_Hang_Up" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer_to_Voice_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Whisper_Page_Activation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffPbxFeatureNameExtensionsType", propOrder = {
    "setName",
    "activeAppearanceSelect",
    "automaticCallBack",
    "automaticCallBackCancel",
    "callForwardAll",
    "callForwardBusyNoAnswer",
    "callForwardCancel",
    "callPark",
    "callParkAnswerBack",
    "callPickUp",
    "callingNumberBlock",
    "callingNumberUnblock",
    "conditionalCallExtendEnable",
    "conditionalCallExtendDisable",
    "conferenceComplete",
    "conferenceOnAnswer",
    "directedCallPickUp",
    "dropLastAddedParty",
    "exclusionToggleOnOff",
    "extendedGroupCallPickup",
    "heldAppearanceSelect",
    "idleAppearanceSelect",
    "lastNumberDialed",
    "maliciousCallTrace",
    "maliciousCallTraceCancel",
    "offPbxCallEnable",
    "offPbxCallDisable",
    "priorityCall",
    "recall",
    "sendAllCalls",
    "sendAllCallsCancel",
    "transferComplete",
    "transferOnHangUp",
    "transferToVoiceMail",
    "whisperPageActivation"
})
public class OffPbxFeatureNameExtensionsType {

    @XmlElement(name = "Set_Name")
    protected String setName;
    @XmlElement(name = "Active_Appearance_Select")
    protected String activeAppearanceSelect;
    @XmlElement(name = "Automatic_Call_Back")
    protected String automaticCallBack;
    @XmlElement(name = "Automatic_Call_Back_Cancel")
    protected String automaticCallBackCancel;
    @XmlElement(name = "Call_Forward_All")
    protected String callForwardAll;
    @XmlElement(name = "Call_Forward_Busy_No_Answer")
    protected String callForwardBusyNoAnswer;
    @XmlElement(name = "Call_Forward_Cancel")
    protected String callForwardCancel;
    @XmlElement(name = "Call_Park")
    protected String callPark;
    @XmlElement(name = "Call_Park_Answer_Back")
    protected String callParkAnswerBack;
    @XmlElement(name = "Call_Pick_Up")
    protected String callPickUp;
    @XmlElement(name = "Calling_Number_Block")
    protected String callingNumberBlock;
    @XmlElement(name = "Calling_Number_Unblock")
    protected String callingNumberUnblock;
    @XmlElement(name = "Conditional_Call_Extend_Enable")
    protected String conditionalCallExtendEnable;
    @XmlElement(name = "Conditional_Call_Extend_Disable")
    protected String conditionalCallExtendDisable;
    @XmlElement(name = "Conference_Complete")
    protected String conferenceComplete;
    @XmlElement(name = "Conference_on_Answer")
    protected String conferenceOnAnswer;
    @XmlElement(name = "Directed_Call_Pick_Up")
    protected String directedCallPickUp;
    @XmlElement(name = "Drop_Last_Added_Party")
    protected String dropLastAddedParty;
    @XmlElement(name = "Exclusion_Toggle_On_Off")
    protected String exclusionToggleOnOff;
    @XmlElement(name = "Extended_Group_Call_Pickup")
    protected String extendedGroupCallPickup;
    @XmlElement(name = "Held_Appearance_Select")
    protected String heldAppearanceSelect;
    @XmlElement(name = "Idle_Appearance_Select")
    protected String idleAppearanceSelect;
    @XmlElement(name = "Last_Number_Dialed")
    protected String lastNumberDialed;
    @XmlElement(name = "Malicious_Call_Trace")
    protected String maliciousCallTrace;
    @XmlElement(name = "Malicious_Call_Trace_Cancel")
    protected String maliciousCallTraceCancel;
    @XmlElement(name = "Off_Pbx_Call_Enable")
    protected String offPbxCallEnable;
    @XmlElement(name = "Off_Pbx_Call_Disable")
    protected String offPbxCallDisable;
    @XmlElement(name = "Priority_Call")
    protected String priorityCall;
    @XmlElement(name = "Recall")
    protected String recall;
    @XmlElement(name = "Send_All_Calls")
    protected String sendAllCalls;
    @XmlElement(name = "Send_All_Calls_Cancel")
    protected String sendAllCallsCancel;
    @XmlElement(name = "Transfer_Complete")
    protected String transferComplete;
    @XmlElement(name = "Transfer_On_Hang_Up")
    protected String transferOnHangUp;
    @XmlElement(name = "Transfer_to_Voice_Mail")
    protected String transferToVoiceMail;
    @XmlElement(name = "Whisper_Page_Activation")
    protected String whisperPageActivation;

    /**
     * setName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetName() {
        return setName;
    }

    /**
     * setName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetName(String value) {
        this.setName = value;
    }

    /**
     * activeAppearanceSelect 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveAppearanceSelect() {
        return activeAppearanceSelect;
    }

    /**
     * activeAppearanceSelect 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveAppearanceSelect(String value) {
        this.activeAppearanceSelect = value;
    }

    /**
     * automaticCallBack 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticCallBack() {
        return automaticCallBack;
    }

    /**
     * automaticCallBack 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticCallBack(String value) {
        this.automaticCallBack = value;
    }

    /**
     * automaticCallBackCancel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticCallBackCancel() {
        return automaticCallBackCancel;
    }

    /**
     * automaticCallBackCancel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticCallBackCancel(String value) {
        this.automaticCallBackCancel = value;
    }

    /**
     * callForwardAll 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardAll() {
        return callForwardAll;
    }

    /**
     * callForwardAll 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardAll(String value) {
        this.callForwardAll = value;
    }

    /**
     * callForwardBusyNoAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardBusyNoAnswer() {
        return callForwardBusyNoAnswer;
    }

    /**
     * callForwardBusyNoAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardBusyNoAnswer(String value) {
        this.callForwardBusyNoAnswer = value;
    }

    /**
     * callForwardCancel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardCancel() {
        return callForwardCancel;
    }

    /**
     * callForwardCancel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardCancel(String value) {
        this.callForwardCancel = value;
    }

    /**
     * callPark 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPark() {
        return callPark;
    }

    /**
     * callPark 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPark(String value) {
        this.callPark = value;
    }

    /**
     * callParkAnswerBack 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallParkAnswerBack() {
        return callParkAnswerBack;
    }

    /**
     * callParkAnswerBack 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallParkAnswerBack(String value) {
        this.callParkAnswerBack = value;
    }

    /**
     * callPickUp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPickUp() {
        return callPickUp;
    }

    /**
     * callPickUp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPickUp(String value) {
        this.callPickUp = value;
    }

    /**
     * callingNumberBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNumberBlock() {
        return callingNumberBlock;
    }

    /**
     * callingNumberBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNumberBlock(String value) {
        this.callingNumberBlock = value;
    }

    /**
     * callingNumberUnblock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNumberUnblock() {
        return callingNumberUnblock;
    }

    /**
     * callingNumberUnblock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNumberUnblock(String value) {
        this.callingNumberUnblock = value;
    }

    /**
     * conditionalCallExtendEnable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalCallExtendEnable() {
        return conditionalCallExtendEnable;
    }

    /**
     * conditionalCallExtendEnable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalCallExtendEnable(String value) {
        this.conditionalCallExtendEnable = value;
    }

    /**
     * conditionalCallExtendDisable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalCallExtendDisable() {
        return conditionalCallExtendDisable;
    }

    /**
     * conditionalCallExtendDisable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalCallExtendDisable(String value) {
        this.conditionalCallExtendDisable = value;
    }

    /**
     * conferenceComplete 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceComplete() {
        return conferenceComplete;
    }

    /**
     * conferenceComplete 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceComplete(String value) {
        this.conferenceComplete = value;
    }

    /**
     * conferenceOnAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceOnAnswer() {
        return conferenceOnAnswer;
    }

    /**
     * conferenceOnAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceOnAnswer(String value) {
        this.conferenceOnAnswer = value;
    }

    /**
     * directedCallPickUp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectedCallPickUp() {
        return directedCallPickUp;
    }

    /**
     * directedCallPickUp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectedCallPickUp(String value) {
        this.directedCallPickUp = value;
    }

    /**
     * dropLastAddedParty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropLastAddedParty() {
        return dropLastAddedParty;
    }

    /**
     * dropLastAddedParty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropLastAddedParty(String value) {
        this.dropLastAddedParty = value;
    }

    /**
     * exclusionToggleOnOff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionToggleOnOff() {
        return exclusionToggleOnOff;
    }

    /**
     * exclusionToggleOnOff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionToggleOnOff(String value) {
        this.exclusionToggleOnOff = value;
    }

    /**
     * extendedGroupCallPickup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedGroupCallPickup() {
        return extendedGroupCallPickup;
    }

    /**
     * extendedGroupCallPickup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedGroupCallPickup(String value) {
        this.extendedGroupCallPickup = value;
    }

    /**
     * heldAppearanceSelect 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeldAppearanceSelect() {
        return heldAppearanceSelect;
    }

    /**
     * heldAppearanceSelect 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeldAppearanceSelect(String value) {
        this.heldAppearanceSelect = value;
    }

    /**
     * idleAppearanceSelect 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleAppearanceSelect() {
        return idleAppearanceSelect;
    }

    /**
     * idleAppearanceSelect 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleAppearanceSelect(String value) {
        this.idleAppearanceSelect = value;
    }

    /**
     * lastNumberDialed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNumberDialed() {
        return lastNumberDialed;
    }

    /**
     * lastNumberDialed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNumberDialed(String value) {
        this.lastNumberDialed = value;
    }

    /**
     * maliciousCallTrace 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaliciousCallTrace() {
        return maliciousCallTrace;
    }

    /**
     * maliciousCallTrace 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaliciousCallTrace(String value) {
        this.maliciousCallTrace = value;
    }

    /**
     * maliciousCallTraceCancel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaliciousCallTraceCancel() {
        return maliciousCallTraceCancel;
    }

    /**
     * maliciousCallTraceCancel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaliciousCallTraceCancel(String value) {
        this.maliciousCallTraceCancel = value;
    }

    /**
     * offPbxCallEnable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPbxCallEnable() {
        return offPbxCallEnable;
    }

    /**
     * offPbxCallEnable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPbxCallEnable(String value) {
        this.offPbxCallEnable = value;
    }

    /**
     * offPbxCallDisable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPbxCallDisable() {
        return offPbxCallDisable;
    }

    /**
     * offPbxCallDisable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPbxCallDisable(String value) {
        this.offPbxCallDisable = value;
    }

    /**
     * priorityCall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCall() {
        return priorityCall;
    }

    /**
     * priorityCall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCall(String value) {
        this.priorityCall = value;
    }

    /**
     * recall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecall() {
        return recall;
    }

    /**
     * recall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecall(String value) {
        this.recall = value;
    }

    /**
     * sendAllCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAllCalls() {
        return sendAllCalls;
    }

    /**
     * sendAllCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAllCalls(String value) {
        this.sendAllCalls = value;
    }

    /**
     * sendAllCallsCancel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAllCallsCancel() {
        return sendAllCallsCancel;
    }

    /**
     * sendAllCallsCancel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAllCallsCancel(String value) {
        this.sendAllCallsCancel = value;
    }

    /**
     * transferComplete 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferComplete() {
        return transferComplete;
    }

    /**
     * transferComplete 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferComplete(String value) {
        this.transferComplete = value;
    }

    /**
     * transferOnHangUp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferOnHangUp() {
        return transferOnHangUp;
    }

    /**
     * transferOnHangUp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferOnHangUp(String value) {
        this.transferOnHangUp = value;
    }

    /**
     * transferToVoiceMail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToVoiceMail() {
        return transferToVoiceMail;
    }

    /**
     * transferToVoiceMail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToVoiceMail(String value) {
        this.transferToVoiceMail = value;
    }

    /**
     * whisperPageActivation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhisperPageActivation() {
        return whisperPageActivation;
    }

    /**
     * whisperPageActivation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhisperPageActivation(String value) {
        this.whisperPageActivation = value;
    }

}
