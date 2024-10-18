
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AnnouncementType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AnnouncementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Announcement_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Num_Files" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Board" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Announcement_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenant_Partition_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hide_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Announcement_Queue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Integ_Announcement_Queue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Protect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Compression_Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnouncementType", propOrder = {
    "extension",
    "announcementType",
    "name",
    "port",
    "numFiles",
    "board",
    "announcementNumber",
    "tenantPartitionNumber",
    "hideVersion",
    "cor",
    "analogAnnouncementQueue",
    "integAnnouncementQueue",
    "queueLength",
    "protect",
    "compressionRate"
})
public class AnnouncementType {

    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Announcement_Type")
    protected String announcementType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Num_Files")
    protected String numFiles;
    @XmlElement(name = "Board")
    protected String board;
    @XmlElement(name = "Announcement_Number")
    protected String announcementNumber;
    @XmlElement(name = "Tenant_Partition_Number")
    protected String tenantPartitionNumber;
    @XmlElement(name = "Hide_Version")
    protected String hideVersion;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "Analog_Announcement_Queue")
    protected String analogAnnouncementQueue;
    @XmlElement(name = "Integ_Announcement_Queue")
    protected String integAnnouncementQueue;
    @XmlElement(name = "Queue_Length")
    protected String queueLength;
    @XmlElement(name = "Protect")
    protected String protect;
    @XmlElement(name = "Compression_Rate")
    protected String compressionRate;

    /**
     * extension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * extension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * announcementType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementType() {
        return announcementType;
    }

    /**
     * announcementType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementType(String value) {
        this.announcementType = value;
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
     * numFiles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFiles() {
        return numFiles;
    }

    /**
     * numFiles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFiles(String value) {
        this.numFiles = value;
    }

    /**
     * board 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoard() {
        return board;
    }

    /**
     * board 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoard(String value) {
        this.board = value;
    }

    /**
     * announcementNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementNumber() {
        return announcementNumber;
    }

    /**
     * announcementNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementNumber(String value) {
        this.announcementNumber = value;
    }

    /**
     * tenantPartitionNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantPartitionNumber() {
        return tenantPartitionNumber;
    }

    /**
     * tenantPartitionNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantPartitionNumber(String value) {
        this.tenantPartitionNumber = value;
    }

    /**
     * hideVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideVersion() {
        return hideVersion;
    }

    /**
     * hideVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideVersion(String value) {
        this.hideVersion = value;
    }

    /**
     * cor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOR() {
        return cor;
    }

    /**
     * cor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOR(String value) {
        this.cor = value;
    }

    /**
     * analogAnnouncementQueue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogAnnouncementQueue() {
        return analogAnnouncementQueue;
    }

    /**
     * analogAnnouncementQueue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogAnnouncementQueue(String value) {
        this.analogAnnouncementQueue = value;
    }

    /**
     * integAnnouncementQueue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegAnnouncementQueue() {
        return integAnnouncementQueue;
    }

    /**
     * integAnnouncementQueue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegAnnouncementQueue(String value) {
        this.integAnnouncementQueue = value;
    }

    /**
     * queueLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueLength() {
        return queueLength;
    }

    /**
     * queueLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueLength(String value) {
        this.queueLength = value;
    }

    /**
     * protect 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtect() {
        return protect;
    }

    /**
     * protect 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtect(String value) {
        this.protect = value;
    }

    /**
     * compressionRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionRate() {
        return compressionRate;
    }

    /**
     * compressionRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionRate(String value) {
        this.compressionRate = value;
    }

}
