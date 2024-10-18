
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IPServerInterfaceType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IPServerInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Port_Network_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Board_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pri_IP_or_Socket_Encryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pri_Host_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pri_DHCP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Control_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_Of_Health_CPEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ignore_Conn_In_Arbitration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enable_Qos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Second_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Host_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DHCP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qos_CC_8021p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CC_Diff_Serv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPServerInterfaceType", propOrder = {
    "portNetworkNum",
    "boardLocation",
    "priIPOrSocketEncryption",
    "priHostName",
    "priDHCPID",
    "serviceState",
    "controlState",
    "stateOfHealthCPEG",
    "number",
    "ipControl",
    "ignoreConnInArbitration",
    "enableQos",
    "adminSecondIP",
    "location",
    "location2",
    "host",
    "host2",
    "dhcpid",
    "ipAddress",
    "ipAddress1",
    "ipAddress2",
    "ipAddress3",
    "ipAddress4",
    "ip2Address",
    "ip2Address1",
    "ip2Address2",
    "ip2Address3",
    "ip2Address4",
    "qosCC8021P",
    "ccDiffServ",
    "callContDiffServ1",
    "callContDiffServ11",
    "callContDiffServ12",
    "callContDiffServ2",
    "callContDiffServ21",
    "callContDiffServ22"
})
public class IPServerInterfaceType {

    @XmlElement(name = "Port_Network_Num")
    protected String portNetworkNum;
    @XmlElement(name = "Board_Location")
    protected String boardLocation;
    @XmlElement(name = "Pri_IP_or_Socket_Encryption")
    protected String priIPOrSocketEncryption;
    @XmlElement(name = "Pri_Host_Name")
    protected String priHostName;
    @XmlElement(name = "Pri_DHCP_ID")
    protected String priDHCPID;
    @XmlElement(name = "Service_State")
    protected String serviceState;
    @XmlElement(name = "Control_State")
    protected String controlState;
    @XmlElement(name = "State_Of_Health_CPEG")
    protected String stateOfHealthCPEG;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "IP_Control")
    protected String ipControl;
    @XmlElement(name = "Ignore_Conn_In_Arbitration")
    protected String ignoreConnInArbitration;
    @XmlElement(name = "Enable_Qos")
    protected String enableQos;
    @XmlElement(name = "Admin_Second_IP")
    protected String adminSecondIP;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Location_2")
    protected String location2;
    @XmlElement(name = "Host")
    protected String host;
    @XmlElement(name = "Host_2")
    protected String host2;
    @XmlElement(name = "DHCP_ID")
    protected String dhcpid;
    @XmlElement(name = "IP_Address")
    protected String ipAddress;
    @XmlElement(name = "IP_Address_1")
    protected String ipAddress1;
    @XmlElement(name = "IP_Address_2")
    protected String ipAddress2;
    @XmlElement(name = "IP_Address_3")
    protected String ipAddress3;
    @XmlElement(name = "IP_Address_4")
    protected String ipAddress4;
    @XmlElement(name = "IP2_Address")
    protected String ip2Address;
    @XmlElement(name = "IP2_Address_1")
    protected String ip2Address1;
    @XmlElement(name = "IP2_Address_2")
    protected String ip2Address2;
    @XmlElement(name = "IP2_Address_3")
    protected String ip2Address3;
    @XmlElement(name = "IP2_Address_4")
    protected String ip2Address4;
    @XmlElement(name = "Qos_CC_8021p")
    protected String qosCC8021P;
    @XmlElement(name = "CC_Diff_Serv")
    protected String ccDiffServ;
    @XmlElement(name = "Call_Cont_Diff_Serv_1")
    protected String callContDiffServ1;
    @XmlElement(name = "Call_Cont_Diff_Serv_11")
    protected String callContDiffServ11;
    @XmlElement(name = "Call_Cont_Diff_Serv_12")
    protected String callContDiffServ12;
    @XmlElement(name = "Call_Cont_Diff_Serv_2")
    protected String callContDiffServ2;
    @XmlElement(name = "Call_Cont_Diff_Serv_21")
    protected String callContDiffServ21;
    @XmlElement(name = "Call_Cont_Diff_Serv_22")
    protected String callContDiffServ22;

    /**
     * portNetworkNum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNetworkNum() {
        return portNetworkNum;
    }

    /**
     * portNetworkNum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNetworkNum(String value) {
        this.portNetworkNum = value;
    }

    /**
     * boardLocation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardLocation() {
        return boardLocation;
    }

    /**
     * boardLocation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardLocation(String value) {
        this.boardLocation = value;
    }

    /**
     * priIPOrSocketEncryption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriIPOrSocketEncryption() {
        return priIPOrSocketEncryption;
    }

    /**
     * priIPOrSocketEncryption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriIPOrSocketEncryption(String value) {
        this.priIPOrSocketEncryption = value;
    }

    /**
     * priHostName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriHostName() {
        return priHostName;
    }

    /**
     * priHostName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriHostName(String value) {
        this.priHostName = value;
    }

    /**
     * priDHCPID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriDHCPID() {
        return priDHCPID;
    }

    /**
     * priDHCPID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriDHCPID(String value) {
        this.priDHCPID = value;
    }

    /**
     * serviceState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * serviceState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceState(String value) {
        this.serviceState = value;
    }

    /**
     * controlState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlState() {
        return controlState;
    }

    /**
     * controlState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlState(String value) {
        this.controlState = value;
    }

    /**
     * stateOfHealthCPEG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOfHealthCPEG() {
        return stateOfHealthCPEG;
    }

    /**
     * stateOfHealthCPEG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOfHealthCPEG(String value) {
        this.stateOfHealthCPEG = value;
    }

    /**
     * number 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * number 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * ipControl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPControl() {
        return ipControl;
    }

    /**
     * ipControl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPControl(String value) {
        this.ipControl = value;
    }

    /**
     * ignoreConnInArbitration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreConnInArbitration() {
        return ignoreConnInArbitration;
    }

    /**
     * ignoreConnInArbitration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreConnInArbitration(String value) {
        this.ignoreConnInArbitration = value;
    }

    /**
     * enableQos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableQos() {
        return enableQos;
    }

    /**
     * enableQos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableQos(String value) {
        this.enableQos = value;
    }

    /**
     * adminSecondIP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminSecondIP() {
        return adminSecondIP;
    }

    /**
     * adminSecondIP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminSecondIP(String value) {
        this.adminSecondIP = value;
    }

    /**
     * location 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * location 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * location2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation2() {
        return location2;
    }

    /**
     * location2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation2(String value) {
        this.location2 = value;
    }

    /**
     * host 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * host 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * host2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost2() {
        return host2;
    }

    /**
     * host2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost2(String value) {
        this.host2 = value;
    }

    /**
     * dhcpid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHCPID() {
        return dhcpid;
    }

    /**
     * dhcpid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHCPID(String value) {
        this.dhcpid = value;
    }

    /**
     * ipAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * ipAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
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
     * ip2Address 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address() {
        return ip2Address;
    }

    /**
     * ip2Address 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address(String value) {
        this.ip2Address = value;
    }

    /**
     * ip2Address1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address1() {
        return ip2Address1;
    }

    /**
     * ip2Address1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address1(String value) {
        this.ip2Address1 = value;
    }

    /**
     * ip2Address2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address2() {
        return ip2Address2;
    }

    /**
     * ip2Address2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address2(String value) {
        this.ip2Address2 = value;
    }

    /**
     * ip2Address3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address3() {
        return ip2Address3;
    }

    /**
     * ip2Address3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address3(String value) {
        this.ip2Address3 = value;
    }

    /**
     * ip2Address4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address4() {
        return ip2Address4;
    }

    /**
     * ip2Address4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address4(String value) {
        this.ip2Address4 = value;
    }

    /**
     * qosCC8021P 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosCC8021P() {
        return qosCC8021P;
    }

    /**
     * qosCC8021P 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosCC8021P(String value) {
        this.qosCC8021P = value;
    }

    /**
     * ccDiffServ 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDiffServ() {
        return ccDiffServ;
    }

    /**
     * ccDiffServ 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDiffServ(String value) {
        this.ccDiffServ = value;
    }

    /**
     * callContDiffServ1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ1() {
        return callContDiffServ1;
    }

    /**
     * callContDiffServ1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ1(String value) {
        this.callContDiffServ1 = value;
    }

    /**
     * callContDiffServ11 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ11() {
        return callContDiffServ11;
    }

    /**
     * callContDiffServ11 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ11(String value) {
        this.callContDiffServ11 = value;
    }

    /**
     * callContDiffServ12 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ12() {
        return callContDiffServ12;
    }

    /**
     * callContDiffServ12 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ12(String value) {
        this.callContDiffServ12 = value;
    }

    /**
     * callContDiffServ2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ2() {
        return callContDiffServ2;
    }

    /**
     * callContDiffServ2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ2(String value) {
        this.callContDiffServ2 = value;
    }

    /**
     * callContDiffServ21 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ21() {
        return callContDiffServ21;
    }

    /**
     * callContDiffServ21 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ21(String value) {
        this.callContDiffServ21 = value;
    }

    /**
     * callContDiffServ22 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ22() {
        return callContDiffServ22;
    }

    /**
     * callContDiffServ22 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ22(String value) {
        this.callContDiffServ22 = value;
    }

}
