
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SignalingGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SignalingGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Near_End_Node_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Far_End_Node_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Far_End_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Far_End_Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalingGroupType", propOrder = {
    "groupNumber",
    "groupType",
    "nearEndNodeName",
    "farEndNodeName",
    "farEndNetworkRegion",
    "farEndDomain"
})
public class SignalingGroupType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "Group_Type")
    protected String groupType;
    @XmlElement(name = "Near_End_Node_Name")
    protected String nearEndNodeName;
    @XmlElement(name = "Far_End_Node_Name")
    protected String farEndNodeName;
    @XmlElement(name = "Far_End_Network_Region")
    protected String farEndNetworkRegion;
    @XmlElement(name = "Far_End_Domain")
    protected String farEndDomain;

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
     * nearEndNodeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearEndNodeName() {
        return nearEndNodeName;
    }

    /**
     * nearEndNodeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearEndNodeName(String value) {
        this.nearEndNodeName = value;
    }

    /**
     * farEndNodeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarEndNodeName() {
        return farEndNodeName;
    }

    /**
     * farEndNodeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarEndNodeName(String value) {
        this.farEndNodeName = value;
    }

    /**
     * farEndNetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarEndNetworkRegion() {
        return farEndNetworkRegion;
    }

    /**
     * farEndNetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarEndNetworkRegion(String value) {
        this.farEndNetworkRegion = value;
    }

    /**
     * farEndDomain 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarEndDomain() {
        return farEndDomain;
    }

    /**
     * farEndDomain 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarEndDomain(String value) {
        this.farEndDomain = value;
    }

}
