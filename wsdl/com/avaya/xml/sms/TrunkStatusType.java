
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrunkStatusType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TrunkStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Member" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mtce_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected_Ports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrunkStatusType", propOrder = {
    "member",
    "port",
    "serviceState",
    "mtceBusy",
    "connectedPorts"
})
public class TrunkStatusType {

    @XmlElement(name = "Member")
    protected String member;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Service_State")
    protected String serviceState;
    @XmlElement(name = "Mtce_Busy")
    protected String mtceBusy;
    @XmlElement(name = "Connected_Ports")
    protected String connectedPorts;

    /**
     * member 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMember() {
        return member;
    }

    /**
     * member 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMember(String value) {
        this.member = value;
    }

    /**
     * port 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * port 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
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
     * mtceBusy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtceBusy() {
        return mtceBusy;
    }

    /**
     * mtceBusy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtceBusy(String value) {
        this.mtceBusy = value;
    }

    /**
     * connectedPorts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedPorts() {
        return connectedPorts;
    }

    /**
     * connectedPorts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedPorts(String value) {
        this.connectedPorts = value;
    }

}
