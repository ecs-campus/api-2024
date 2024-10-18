
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ListUsageExtensionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ListUsageExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Member_Of" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Index_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Index_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListUsageExtensionType", propOrder = {
    "memberOf",
    "keyName",
    "keyValue",
    "indexName",
    "indexValue"
})
public class ListUsageExtensionType {

    @XmlElement(name = "Member_Of")
    protected String memberOf;
    @XmlElement(name = "Key_Name")
    protected String keyName;
    @XmlElement(name = "Key_Value")
    protected String keyValue;
    @XmlElement(name = "Index_Name")
    protected String indexName;
    @XmlElement(name = "Index_Value")
    protected String indexValue;

    /**
     * memberOf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberOf() {
        return memberOf;
    }

    /**
     * memberOf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberOf(String value) {
        this.memberOf = value;
    }

    /**
     * keyName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * keyName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }

    /**
     * keyValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * keyValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyValue(String value) {
        this.keyValue = value;
    }

    /**
     * indexName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * indexName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexName(String value) {
        this.indexName = value;
    }

    /**
     * indexValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexValue() {
        return indexValue;
    }

    /**
     * indexValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexValue(String value) {
        this.indexValue = value;
    }

}
