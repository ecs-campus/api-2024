
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ListIPNetworkRegionMonitorType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ListIPNetworkRegionMonitorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Monitor_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Monitor_IPv6_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPv6_Port_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codec_Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Port_Min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Port_Max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListIPNetworkRegionMonitorType", propOrder = {
    "region",
    "name",
    "rtcpMonitorIPAddress",
    "portNumber",
    "rtcpMonitorIPv6Address",
    "iPv6PortNumber",
    "reportPeriod",
    "codecSet",
    "udpPortMin",
    "udpPortMax"
})
public class ListIPNetworkRegionMonitorType {

    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RTCP_Monitor_IP_Address")
    protected String rtcpMonitorIPAddress;
    @XmlElement(name = "Port_Number")
    protected String portNumber;
    @XmlElement(name = "RTCP_Monitor_IPv6_Address")
    protected String rtcpMonitorIPv6Address;
    @XmlElement(name = "IPv6_Port_Number")
    protected String iPv6PortNumber;
    @XmlElement(name = "Report_Period")
    protected String reportPeriod;
    @XmlElement(name = "Codec_Set")
    protected String codecSet;
    @XmlElement(name = "UDP_Port_Min")
    protected String udpPortMin;
    @XmlElement(name = "UDP_Port_Max")
    protected String udpPortMax;

    /**
     * region 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * region 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
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
     * rtcpMonitorIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPMonitorIPAddress() {
        return rtcpMonitorIPAddress;
    }

    /**
     * rtcpMonitorIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPMonitorIPAddress(String value) {
        this.rtcpMonitorIPAddress = value;
    }

    /**
     * portNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNumber() {
        return portNumber;
    }

    /**
     * portNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNumber(String value) {
        this.portNumber = value;
    }

    /**
     * rtcpMonitorIPv6Address 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPMonitorIPv6Address() {
        return rtcpMonitorIPv6Address;
    }

    /**
     * rtcpMonitorIPv6Address 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPMonitorIPv6Address(String value) {
        this.rtcpMonitorIPv6Address = value;
    }

    /**
     * iPv6PortNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv6PortNumber() {
        return iPv6PortNumber;
    }

    /**
     * iPv6PortNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPv6PortNumber(String value) {
        this.iPv6PortNumber = value;
    }

    /**
     * reportPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportPeriod() {
        return reportPeriod;
    }

    /**
     * reportPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportPeriod(String value) {
        this.reportPeriod = value;
    }

    /**
     * codecSet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecSet() {
        return codecSet;
    }

    /**
     * codecSet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecSet(String value) {
        this.codecSet = value;
    }

    /**
     * udpPortMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPPortMin() {
        return udpPortMin;
    }

    /**
     * udpPortMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPPortMin(String value) {
        this.udpPortMin = value;
    }

    /**
     * udpPortMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPPortMax() {
        return udpPortMax;
    }

    /**
     * udpPortMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPPortMax(String value) {
        this.udpPortMax = value;
    }

}
