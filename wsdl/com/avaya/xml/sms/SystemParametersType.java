
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SystemParametersType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SystemParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authorization_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Hoteling_Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParametersType", propOrder = {
    "authorizationCodes",
    "ipHotelingApplication"
})
public class SystemParametersType {

    @XmlElement(name = "Authorization_Codes")
    protected String authorizationCodes;
    @XmlElement(name = "IP_Hoteling_Application")
    protected String ipHotelingApplication;

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
     * ipHotelingApplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPHotelingApplication() {
        return ipHotelingApplication;
    }

    /**
     * ipHotelingApplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPHotelingApplication(String value) {
        this.ipHotelingApplication = value;
    }

}
