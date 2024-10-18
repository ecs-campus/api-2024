
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExtensionStationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExtensionStationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension_To_Message_Lamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension_To_Emer_Loc_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionStationType", propOrder = {
    "extensionTo",
    "extensionToMessageLamp",
    "extensionToEmerLocExt"
})
public class ExtensionStationType {

    @XmlElement(name = "Extension_To")
    protected String extensionTo;
    @XmlElement(name = "Extension_To_Message_Lamp")
    protected String extensionToMessageLamp;
    @XmlElement(name = "Extension_To_Emer_Loc_Ext")
    protected String extensionToEmerLocExt;

    /**
     * extensionTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionTo() {
        return extensionTo;
    }

    /**
     * extensionTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionTo(String value) {
        this.extensionTo = value;
    }

    /**
     * extensionToMessageLamp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionToMessageLamp() {
        return extensionToMessageLamp;
    }

    /**
     * extensionToMessageLamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionToMessageLamp(String value) {
        this.extensionToMessageLamp = value;
    }

    /**
     * extensionToEmerLocExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionToEmerLocExt() {
        return extensionToEmerLocExt;
    }

    /**
     * extensionToEmerLocExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionToEmerLocExt(String value) {
        this.extensionToEmerLocExt = value;
    }

}
