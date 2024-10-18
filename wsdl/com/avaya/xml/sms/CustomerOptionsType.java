
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerOptionsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authorization_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Encryption_Over_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Personal_Station_Access" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal_Trans_Init" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOptionsType", propOrder = {
    "authorizationCodes",
    "mediaEncryptionOverIP",
    "personalStationAccess",
    "terminalTransInit",
    "maximumConcurrentlyRegisteredIPStations"
})
public class CustomerOptionsType {

    @XmlElement(name = "Authorization_Codes")
    protected String authorizationCodes;
    @XmlElement(name = "Media_Encryption_Over_IP")
    protected String mediaEncryptionOverIP;
    @XmlElement(name = "Personal_Station_Access")
    protected String personalStationAccess;
    @XmlElement(name = "Terminal_Trans_Init")
    protected String terminalTransInit;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations")
    protected String maximumConcurrentlyRegisteredIPStations;

    /**
     * authorizationCodes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCodes() {
        return authorizationCodes;
    }

    /**
     * authorizationCodes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCodes(String value) {
        this.authorizationCodes = value;
    }

    /**
     * mediaEncryptionOverIP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaEncryptionOverIP() {
        return mediaEncryptionOverIP;
    }

    /**
     * mediaEncryptionOverIP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaEncryptionOverIP(String value) {
        this.mediaEncryptionOverIP = value;
    }

    /**
     * personalStationAccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalStationAccess() {
        return personalStationAccess;
    }

    /**
     * personalStationAccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalStationAccess(String value) {
        this.personalStationAccess = value;
    }

    /**
     * terminalTransInit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalTransInit() {
        return terminalTransInit;
    }

    /**
     * terminalTransInit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalTransInit(String value) {
        this.terminalTransInit = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPStations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStations() {
        return maximumConcurrentlyRegisteredIPStations;
    }

    /**
     * maximumConcurrentlyRegisteredIPStations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStations(String value) {
        this.maximumConcurrentlyRegisteredIPStations = value;
    }

}
