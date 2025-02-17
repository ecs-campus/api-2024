
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IPInterfaceType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IPInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubnetMask1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubnetMask2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubnetMask3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubnetMask4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enable_Ethernet_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPInterfaceType", propOrder = {
    "type",
    "name",
    "ipAddress1",
    "ipAddress2",
    "ipAddress3",
    "ipAddress4",
    "subnetMask1",
    "subnetMask2",
    "subnetMask3",
    "subnetMask4",
    "enableEthernetPort",
    "networkRegion"
})
public class IPInterfaceType {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IP_Address1")
    protected String ipAddress1;
    @XmlElement(name = "IP_Address2")
    protected String ipAddress2;
    @XmlElement(name = "IP_Address3")
    protected String ipAddress3;
    @XmlElement(name = "IP_Address4")
    protected String ipAddress4;
    @XmlElement(name = "SubnetMask1")
    protected String subnetMask1;
    @XmlElement(name = "SubnetMask2")
    protected String subnetMask2;
    @XmlElement(name = "SubnetMask3")
    protected String subnetMask3;
    @XmlElement(name = "SubnetMask4")
    protected String subnetMask4;
    @XmlElement(name = "Enable_Ethernet_Port")
    protected String enableEthernetPort;
    @XmlElement(name = "Network_Region")
    protected String networkRegion;

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * ipAddress1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress1() {
        return ipAddress1;
    }

    /**
     * ipAddress1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress1(String value) {
        this.ipAddress1 = value;
    }

    /**
     * ipAddress2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress2() {
        return ipAddress2;
    }

    /**
     * ipAddress2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress2(String value) {
        this.ipAddress2 = value;
    }

    /**
     * ipAddress3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress3() {
        return ipAddress3;
    }

    /**
     * ipAddress3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress3(String value) {
        this.ipAddress3 = value;
    }

    /**
     * ipAddress4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress4() {
        return ipAddress4;
    }

    /**
     * ipAddress4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress4(String value) {
        this.ipAddress4 = value;
    }

    /**
     * subnetMask1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetMask1() {
        return subnetMask1;
    }

    /**
     * subnetMask1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetMask1(String value) {
        this.subnetMask1 = value;
    }

    /**
     * subnetMask2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetMask2() {
        return subnetMask2;
    }

    /**
     * subnetMask2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetMask2(String value) {
        this.subnetMask2 = value;
    }

    /**
     * subnetMask3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetMask3() {
        return subnetMask3;
    }

    /**
     * subnetMask3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetMask3(String value) {
        this.subnetMask3 = value;
    }

    /**
     * subnetMask4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetMask4() {
        return subnetMask4;
    }

    /**
     * subnetMask4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetMask4(String value) {
        this.subnetMask4 = value;
    }

    /**
     * enableEthernetPort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableEthernetPort() {
        return enableEthernetPort;
    }

    /**
     * enableEthernetPort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableEthernetPort(String value) {
        this.enableEthernetPort = value;
    }

    /**
     * networkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkRegion() {
        return networkRegion;
    }

    /**
     * networkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkRegion(String value) {
        this.networkRegion = value;
    }

}
