
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AESvcsCTILinkType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AESvcsCTILinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CTI_Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mnt_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Msgs_Sent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Msgs_Received" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AESvcsCTILinkType", propOrder = {
    "ctiLink",
    "version",
    "mntBusy",
    "server",
    "serviceState",
    "msgsSent",
    "msgsReceived"
})
public class AESvcsCTILinkType {

    @XmlElement(name = "CTI_Link")
    protected String ctiLink;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Mnt_Busy")
    protected String mntBusy;
    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "Service_State")
    protected String serviceState;
    @XmlElement(name = "Msgs_Sent")
    protected String msgsSent;
    @XmlElement(name = "Msgs_Received")
    protected String msgsReceived;

    /**
     * ctiLink 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTILink() {
        return ctiLink;
    }

    /**
     * ctiLink 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTILink(String value) {
        this.ctiLink = value;
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * mntBusy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntBusy() {
        return mntBusy;
    }

    /**
     * mntBusy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntBusy(String value) {
        this.mntBusy = value;
    }

    /**
     * server 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * server 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
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
     * msgsSent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgsSent() {
        return msgsSent;
    }

    /**
     * msgsSent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgsSent(String value) {
        this.msgsSent = value;
    }

    /**
     * msgsReceived 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgsReceived() {
        return msgsReceived;
    }

    /**
     * msgsReceived 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgsReceived(String value) {
        this.msgsReceived = value;
    }

}
