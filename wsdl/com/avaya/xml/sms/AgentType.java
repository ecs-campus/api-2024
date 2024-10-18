
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AgentType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AgentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Login_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_Agent_Skill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Handling_Preference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Check_skill_TNs_to_match_agent_TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Include_Tenant_Calling_Permissions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Reception" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Log_External_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDIX_Name_for_Messaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hears_Service_Observing_Tone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Login_ID_For_ISDN_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIA_Across_Skills" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACW_Agent_Considered_Idle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aux_Work_Reason_Code_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logout_Reason_Code_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Time_In_ACW_Before_Logout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_Agent_Calls_First" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Call_Preference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password_Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forced_Agent_Logout_Time_Hr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forced_Agent_Logout_Time_Min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_Scripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}AgentArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentType", propOrder = {
    "loginID",
    "name",
    "extension",
    "directAgentSkill",
    "aas",
    "audix",
    "cor",
    "callHandlingPreference",
    "serviceObjective",
    "tn",
    "coveragePath",
    "securityCode",
    "checkSkillTNsToMatchAgentTN",
    "includeTenantCallingPermissions",
    "lwcReception",
    "lwcLogExternalCalls",
    "attribute",
    "audixNameForMessaging",
    "hearsServiceObservingTone",
    "loginIDForISDNDisplay",
    "portExtension",
    "autoAnswer",
    "miaAcrossSkills",
    "acwAgentConsideredIdle",
    "auxWorkReasonCodeType",
    "logoutReasonCodeType",
    "maximumTimeInACWBeforeLogout",
    "directAgentCallsFirst",
    "localCallPreference",
    "password",
    "passwordConfirmation",
    "forcedAgentLogoutTimeHr",
    "forcedAgentLogoutTimeMin",
    "nativeName1",
    "nativeName2",
    "nativeName3",
    "nativeName4",
    "nativeName5",
    "nativeNameScripts",
    "sn",
    "rl",
    "rlcm5",
    "sl",
    "pa"
})
public class AgentType {

    @XmlElement(name = "Login_ID")
    protected String loginID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Direct_Agent_Skill")
    protected String directAgentSkill;
    @XmlElement(name = "AAS")
    protected String aas;
    @XmlElement(name = "AUDIX")
    protected String audix;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "Call_Handling_Preference")
    protected String callHandlingPreference;
    @XmlElement(name = "Service_Objective")
    protected String serviceObjective;
    @XmlElement(name = "TN")
    protected String tn;
    @XmlElement(name = "Coverage_Path")
    protected String coveragePath;
    @XmlElement(name = "Security_Code")
    protected String securityCode;
    @XmlElement(name = "Check_skill_TNs_to_match_agent_TN")
    protected String checkSkillTNsToMatchAgentTN;
    @XmlElement(name = "Include_Tenant_Calling_Permissions")
    protected String includeTenantCallingPermissions;
    @XmlElement(name = "LWC_Reception")
    protected String lwcReception;
    @XmlElement(name = "LWC_Log_External_Calls")
    protected String lwcLogExternalCalls;
    @XmlElement(name = "Attribute")
    protected String attribute;
    @XmlElement(name = "AUDIX_Name_for_Messaging")
    protected String audixNameForMessaging;
    @XmlElement(name = "Hears_Service_Observing_Tone")
    protected String hearsServiceObservingTone;
    @XmlElement(name = "Login_ID_For_ISDN_Display")
    protected String loginIDForISDNDisplay;
    @XmlElement(name = "Port_Extension")
    protected String portExtension;
    @XmlElement(name = "Auto_Answer")
    protected String autoAnswer;
    @XmlElement(name = "MIA_Across_Skills")
    protected String miaAcrossSkills;
    @XmlElement(name = "ACW_Agent_Considered_Idle")
    protected String acwAgentConsideredIdle;
    @XmlElement(name = "Aux_Work_Reason_Code_Type")
    protected String auxWorkReasonCodeType;
    @XmlElement(name = "Logout_Reason_Code_Type")
    protected String logoutReasonCodeType;
    @XmlElement(name = "Maximum_Time_In_ACW_Before_Logout")
    protected String maximumTimeInACWBeforeLogout;
    @XmlElement(name = "Direct_Agent_Calls_First")
    protected String directAgentCallsFirst;
    @XmlElement(name = "Local_Call_Preference")
    protected String localCallPreference;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Password_Confirmation")
    protected String passwordConfirmation;
    @XmlElement(name = "Forced_Agent_Logout_Time_Hr")
    protected String forcedAgentLogoutTimeHr;
    @XmlElement(name = "Forced_Agent_Logout_Time_Min")
    protected String forcedAgentLogoutTimeMin;
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
    @XmlElement(name = "SN")
    protected List<ArrayType> sn;
    @XmlElement(name = "RL")
    protected List<ArrayType> rl;
    @XmlElement(name = "RL_CM5")
    protected List<ArrayType> rlcm5;
    @XmlElement(name = "SL")
    protected List<ArrayType> sl;
    @XmlElement(name = "PA")
    protected List<ArrayType> pa;

    /**
     * loginID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * loginID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginID(String value) {
        this.loginID = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * extension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * extension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * directAgentSkill 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectAgentSkill() {
        return directAgentSkill;
    }

    /**
     * directAgentSkill 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectAgentSkill(String value) {
        this.directAgentSkill = value;
    }

    /**
     * aas 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAAS() {
        return aas;
    }

    /**
     * aas 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAAS(String value) {
        this.aas = value;
    }

    /**
     * audix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDIX() {
        return audix;
    }

    /**
     * audix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDIX(String value) {
        this.audix = value;
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
     * callHandlingPreference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallHandlingPreference() {
        return callHandlingPreference;
    }

    /**
     * callHandlingPreference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallHandlingPreference(String value) {
        this.callHandlingPreference = value;
    }

    /**
     * serviceObjective 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObjective() {
        return serviceObjective;
    }

    /**
     * serviceObjective 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObjective(String value) {
        this.serviceObjective = value;
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
     * checkSkillTNsToMatchAgentTN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSkillTNsToMatchAgentTN() {
        return checkSkillTNsToMatchAgentTN;
    }

    /**
     * checkSkillTNsToMatchAgentTN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSkillTNsToMatchAgentTN(String value) {
        this.checkSkillTNsToMatchAgentTN = value;
    }

    /**
     * includeTenantCallingPermissions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeTenantCallingPermissions() {
        return includeTenantCallingPermissions;
    }

    /**
     * includeTenantCallingPermissions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeTenantCallingPermissions(String value) {
        this.includeTenantCallingPermissions = value;
    }

    /**
     * lwcReception 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCReception() {
        return lwcReception;
    }

    /**
     * lwcReception 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCReception(String value) {
        this.lwcReception = value;
    }

    /**
     * lwcLogExternalCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCLogExternalCalls() {
        return lwcLogExternalCalls;
    }

    /**
     * lwcLogExternalCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCLogExternalCalls(String value) {
        this.lwcLogExternalCalls = value;
    }

    /**
     * attribute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * attribute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * audixNameForMessaging 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDIXNameForMessaging() {
        return audixNameForMessaging;
    }

    /**
     * audixNameForMessaging 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDIXNameForMessaging(String value) {
        this.audixNameForMessaging = value;
    }

    /**
     * hearsServiceObservingTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHearsServiceObservingTone() {
        return hearsServiceObservingTone;
    }

    /**
     * hearsServiceObservingTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHearsServiceObservingTone(String value) {
        this.hearsServiceObservingTone = value;
    }

    /**
     * loginIDForISDNDisplay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginIDForISDNDisplay() {
        return loginIDForISDNDisplay;
    }

    /**
     * loginIDForISDNDisplay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginIDForISDNDisplay(String value) {
        this.loginIDForISDNDisplay = value;
    }

    /**
     * portExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortExtension() {
        return portExtension;
    }

    /**
     * portExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortExtension(String value) {
        this.portExtension = value;
    }

    /**
     * autoAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * autoAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAnswer(String value) {
        this.autoAnswer = value;
    }

    /**
     * miaAcrossSkills 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIAAcrossSkills() {
        return miaAcrossSkills;
    }

    /**
     * miaAcrossSkills 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIAAcrossSkills(String value) {
        this.miaAcrossSkills = value;
    }

    /**
     * acwAgentConsideredIdle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACWAgentConsideredIdle() {
        return acwAgentConsideredIdle;
    }

    /**
     * acwAgentConsideredIdle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACWAgentConsideredIdle(String value) {
        this.acwAgentConsideredIdle = value;
    }

    /**
     * auxWorkReasonCodeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxWorkReasonCodeType() {
        return auxWorkReasonCodeType;
    }

    /**
     * auxWorkReasonCodeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxWorkReasonCodeType(String value) {
        this.auxWorkReasonCodeType = value;
    }

    /**
     * logoutReasonCodeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutReasonCodeType() {
        return logoutReasonCodeType;
    }

    /**
     * logoutReasonCodeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutReasonCodeType(String value) {
        this.logoutReasonCodeType = value;
    }

    /**
     * maximumTimeInACWBeforeLogout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTimeInACWBeforeLogout() {
        return maximumTimeInACWBeforeLogout;
    }

    /**
     * maximumTimeInACWBeforeLogout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTimeInACWBeforeLogout(String value) {
        this.maximumTimeInACWBeforeLogout = value;
    }

    /**
     * directAgentCallsFirst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectAgentCallsFirst() {
        return directAgentCallsFirst;
    }

    /**
     * directAgentCallsFirst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectAgentCallsFirst(String value) {
        this.directAgentCallsFirst = value;
    }

    /**
     * localCallPreference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCallPreference() {
        return localCallPreference;
    }

    /**
     * localCallPreference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCallPreference(String value) {
        this.localCallPreference = value;
    }

    /**
     * password 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * password 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * passwordConfirmation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    /**
     * passwordConfirmation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordConfirmation(String value) {
        this.passwordConfirmation = value;
    }

    /**
     * forcedAgentLogoutTimeHr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedAgentLogoutTimeHr() {
        return forcedAgentLogoutTimeHr;
    }

    /**
     * forcedAgentLogoutTimeHr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedAgentLogoutTimeHr(String value) {
        this.forcedAgentLogoutTimeHr = value;
    }

    /**
     * forcedAgentLogoutTimeMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedAgentLogoutTimeMin() {
        return forcedAgentLogoutTimeMin;
    }

    /**
     * forcedAgentLogoutTimeMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedAgentLogoutTimeMin(String value) {
        this.forcedAgentLogoutTimeMin = value;
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
     * Gets the value of the sn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSN() {
        if (sn == null) {
            sn = new ArrayList<ArrayType>();
        }
        return this.sn;
    }

    /**
     * Gets the value of the rl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRL() {
        if (rl == null) {
            rl = new ArrayList<ArrayType>();
        }
        return this.rl;
    }

    /**
     * Gets the value of the rlcm5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rlcm5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRLCM5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRLCM5() {
        if (rlcm5 == null) {
            rlcm5 = new ArrayList<ArrayType>();
        }
        return this.rlcm5;
    }

    /**
     * Gets the value of the sl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSL() {
        if (sl == null) {
            sl = new ArrayList<ArrayType>();
        }
        return this.sl;
    }

    /**
     * Gets the value of the pa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPA() {
        if (pa == null) {
            pa = new ArrayList<ArrayType>();
        }
        return this.pa;
    }

}
