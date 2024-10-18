
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AESvcsLinkType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AESvcsLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Server_Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AESvcsLinkType", propOrder = {
    "serverLink",
    "server",
    "remoteIP",
    "remotePort",
    "localNode",
    "msgsSent",
    "msgsReceived"
})
public class AESvcsLinkType {

    @XmlElement(name = "Server_Link")
    protected String serverLink;
    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "Remote_IP")
    protected String remoteIP;
    @XmlElement(name = "Remote_Port")
    protected String remotePort;
    @XmlElement(name = "Local_Node")
    protected String localNode;
    @XmlElement(name = "Msgs_Sent")
    protected String msgsSent;
    @XmlElement(name = "Msgs_Received")
    protected String msgsReceived;

    /**
     * serverLink 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerLink() {
        return serverLink;
    }

    /**
     * serverLink 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerLink(String value) {
        this.serverLink = value;
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
     * remoteIP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIP() {
        return remoteIP;
    }

    /**
     * remoteIP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIP(String value) {
        this.remoteIP = value;
    }

    /**
     * remotePort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemotePort() {
        return remotePort;
    }

    /**
     * remotePort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemotePort(String value) {
        this.remotePort = value;
    }

    /**
     * localNode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNode() {
        return localNode;
    }

    /**
     * localNode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNode(String value) {
        this.localNode = value;
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
