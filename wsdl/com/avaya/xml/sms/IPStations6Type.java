
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IPStations6Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IPStations6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reset_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reset_Type_Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Starting_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ending_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Network_Region_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPStations6Type", propOrder = {
    "resetType",
    "phoneType",
    "resetTypeOption",
    "startingIPAddress",
    "endingIPAddress",
    "ipNetworkRegionNumber"
})
public class IPStations6Type {

    @XmlElement(name = "Reset_Type")
    protected String resetType;
    @XmlElement(name = "Phone_Type")
    protected String phoneType;
    @XmlElement(name = "Reset_Type_Option")
    protected String resetTypeOption;
    @XmlElement(name = "Starting_IP_Address")
    protected String startingIPAddress;
    @XmlElement(name = "Ending_IP_Address")
    protected String endingIPAddress;
    @XmlElement(name = "IP_Network_Region_Number")
    protected String ipNetworkRegionNumber;

    /**
     * resetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetType() {
        return resetType;
    }

    /**
     * resetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetType(String value) {
        this.resetType = value;
    }

    /**
     * phoneType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * phoneType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * resetTypeOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetTypeOption() {
        return resetTypeOption;
    }

    /**
     * resetTypeOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetTypeOption(String value) {
        this.resetTypeOption = value;
    }

    /**
     * startingIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingIPAddress() {
        return startingIPAddress;
    }

    /**
     * startingIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingIPAddress(String value) {
        this.startingIPAddress = value;
    }

    /**
     * endingIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingIPAddress() {
        return endingIPAddress;
    }

    /**
     * endingIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingIPAddress(String value) {
        this.endingIPAddress = value;
    }

    /**
     * ipNetworkRegionNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPNetworkRegionNumber() {
        return ipNetworkRegionNumber;
    }

    /**
     * ipNetworkRegionNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPNetworkRegionNumber(String value) {
        this.ipNetworkRegionNumber = value;
    }

}
