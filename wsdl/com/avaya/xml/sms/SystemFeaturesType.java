
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SystemFeaturesType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SystemFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth_Codes_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Code_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Code_Cancellation_Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Timeout_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Auth_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTI_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTI_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTI_Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enhanced_PSA_Information_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_COR_for_Dissociated_Sets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPN_ANI_for_Dissociated_Sets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unnamed_Registrations_and_PSA_for_IP_Telephones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_IP_IP_Audio_Connections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Audio_Hairpinning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMU_Inactivity_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemFeaturesType", propOrder = {
    "authCodesEnabled",
    "authCodeLength",
    "authCodeCancellationSymbol",
    "attendantTimeoutFlag",
    "displayAuthCode",
    "ttiEnabled",
    "ttiState",
    "ttiSecurityCode",
    "enhancedPSAInformationEnabled",
    "defaultCORForDissociatedSets",
    "cpnaniForDissociatedSets",
    "unnamedRegistrationsAndPSAForIPTelephones",
    "directIPIPAudioConnections",
    "ipAudioHairpinning",
    "autoHold",
    "emuInactivityInterval"
})
public class SystemFeaturesType {

    @XmlElement(name = "Auth_Codes_Enabled")
    protected String authCodesEnabled;
    @XmlElement(name = "Auth_Code_Length")
    protected String authCodeLength;
    @XmlElement(name = "Auth_Code_Cancellation_Symbol")
    protected String authCodeCancellationSymbol;
    @XmlElement(name = "Attendant_Timeout_Flag")
    protected String attendantTimeoutFlag;
    @XmlElement(name = "Display_Auth_Code")
    protected String displayAuthCode;
    @XmlElement(name = "TTI_Enabled")
    protected String ttiEnabled;
    @XmlElement(name = "TTI_State")
    protected String ttiState;
    @XmlElement(name = "TTI_Security_Code")
    protected String ttiSecurityCode;
    @XmlElement(name = "Enhanced_PSA_Information_Enabled")
    protected String enhancedPSAInformationEnabled;
    @XmlElement(name = "Default_COR_for_Dissociated_Sets")
    protected String defaultCORForDissociatedSets;
    @XmlElement(name = "CPN_ANI_for_Dissociated_Sets")
    protected String cpnaniForDissociatedSets;
    @XmlElement(name = "Unnamed_Registrations_and_PSA_for_IP_Telephones")
    protected String unnamedRegistrationsAndPSAForIPTelephones;
    @XmlElement(name = "Direct_IP_IP_Audio_Connections")
    protected String directIPIPAudioConnections;
    @XmlElement(name = "IP_Audio_Hairpinning")
    protected String ipAudioHairpinning;
    @XmlElement(name = "Auto_Hold")
    protected String autoHold;
    @XmlElement(name = "EMU_Inactivity_Interval")
    protected String emuInactivityInterval;

    /**
     * authCodesEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesEnabled() {
        return authCodesEnabled;
    }

    /**
     * authCodesEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesEnabled(String value) {
        this.authCodesEnabled = value;
    }

    /**
     * authCodeLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodeLength() {
        return authCodeLength;
    }

    /**
     * authCodeLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodeLength(String value) {
        this.authCodeLength = value;
    }

    /**
     * authCodeCancellationSymbol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodeCancellationSymbol() {
        return authCodeCancellationSymbol;
    }

    /**
     * authCodeCancellationSymbol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodeCancellationSymbol(String value) {
        this.authCodeCancellationSymbol = value;
    }

    /**
     * attendantTimeoutFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantTimeoutFlag() {
        return attendantTimeoutFlag;
    }

    /**
     * attendantTimeoutFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantTimeoutFlag(String value) {
        this.attendantTimeoutFlag = value;
    }

    /**
     * displayAuthCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayAuthCode() {
        return displayAuthCode;
    }

    /**
     * displayAuthCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayAuthCode(String value) {
        this.displayAuthCode = value;
    }

    /**
     * ttiEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIEnabled() {
        return ttiEnabled;
    }

    /**
     * ttiEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIEnabled(String value) {
        this.ttiEnabled = value;
    }

    /**
     * ttiState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIState() {
        return ttiState;
    }

    /**
     * ttiState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIState(String value) {
        this.ttiState = value;
    }

    /**
     * ttiSecurityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTISecurityCode() {
        return ttiSecurityCode;
    }

    /**
     * ttiSecurityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTISecurityCode(String value) {
        this.ttiSecurityCode = value;
    }

    /**
     * enhancedPSAInformationEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedPSAInformationEnabled() {
        return enhancedPSAInformationEnabled;
    }

    /**
     * enhancedPSAInformationEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedPSAInformationEnabled(String value) {
        this.enhancedPSAInformationEnabled = value;
    }

    /**
     * defaultCORForDissociatedSets 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCORForDissociatedSets() {
        return defaultCORForDissociatedSets;
    }

    /**
     * defaultCORForDissociatedSets 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCORForDissociatedSets(String value) {
        this.defaultCORForDissociatedSets = value;
    }

    /**
     * cpnaniForDissociatedSets 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPNANIForDissociatedSets() {
        return cpnaniForDissociatedSets;
    }

    /**
     * cpnaniForDissociatedSets 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPNANIForDissociatedSets(String value) {
        this.cpnaniForDissociatedSets = value;
    }

    /**
     * unnamedRegistrationsAndPSAForIPTelephones 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnnamedRegistrationsAndPSAForIPTelephones() {
        return unnamedRegistrationsAndPSAForIPTelephones;
    }

    /**
     * unnamedRegistrationsAndPSAForIPTelephones 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnnamedRegistrationsAndPSAForIPTelephones(String value) {
        this.unnamedRegistrationsAndPSAForIPTelephones = value;
    }

    /**
     * directIPIPAudioConnections 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectIPIPAudioConnections() {
        return directIPIPAudioConnections;
    }

    /**
     * directIPIPAudioConnections 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectIPIPAudioConnections(String value) {
        this.directIPIPAudioConnections = value;
    }

    /**
     * ipAudioHairpinning 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAudioHairpinning() {
        return ipAudioHairpinning;
    }

    /**
     * ipAudioHairpinning 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAudioHairpinning(String value) {
        this.ipAudioHairpinning = value;
    }

    /**
     * autoHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoHold() {
        return autoHold;
    }

    /**
     * autoHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoHold(String value) {
        this.autoHold = value;
    }

    /**
     * emuInactivityInterval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMUInactivityInterval() {
        return emuInactivityInterval;
    }

    /**
     * emuInactivityInterval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMUInactivityInterval(String value) {
        this.emuInactivityInterval = value;
    }

}
