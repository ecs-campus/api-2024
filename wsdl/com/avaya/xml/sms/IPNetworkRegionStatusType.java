
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IPNetworkRegionStatusType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IPNetworkRegionStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connection_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connection_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BW_Limit_A" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BW_Limit_B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KBits_Tx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KBits_Rx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connections_Tx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connections_Rx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Times_BW_Limit_Hit_Today" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IGAR_Now" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IGAR_Today" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPNetworkRegionStatusType", propOrder = {
    "sourceRegion",
    "destinationRegion",
    "connectionType",
    "connectionStatus",
    "bwLimitA",
    "bwLimitB",
    "kBitsTx",
    "kBitsRx",
    "connectionsTx",
    "connectionsRx",
    "timesBWLimitHitToday",
    "igarNow",
    "igarToday"
})
public class IPNetworkRegionStatusType {

    @XmlElement(name = "Source_Region")
    protected String sourceRegion;
    @XmlElement(name = "Destination_Region")
    protected String destinationRegion;
    @XmlElement(name = "Connection_Type")
    protected String connectionType;
    @XmlElement(name = "Connection_Status")
    protected String connectionStatus;
    @XmlElement(name = "BW_Limit_A")
    protected String bwLimitA;
    @XmlElement(name = "BW_Limit_B")
    protected String bwLimitB;
    @XmlElement(name = "KBits_Tx")
    protected String kBitsTx;
    @XmlElement(name = "KBits_Rx")
    protected String kBitsRx;
    @XmlElement(name = "Connections_Tx")
    protected String connectionsTx;
    @XmlElement(name = "Connections_Rx")
    protected String connectionsRx;
    @XmlElement(name = "Times_BW_Limit_Hit_Today")
    protected String timesBWLimitHitToday;
    @XmlElement(name = "IGAR_Now")
    protected String igarNow;
    @XmlElement(name = "IGAR_Today")
    protected String igarToday;

    /**
     * sourceRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * sourceRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRegion(String value) {
        this.sourceRegion = value;
    }

    /**
     * destinationRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    /**
     * destinationRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationRegion(String value) {
        this.destinationRegion = value;
    }

    /**
     * connectionType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * connectionType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    /**
     * connectionStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * connectionStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionStatus(String value) {
        this.connectionStatus = value;
    }

    /**
     * bwLimitA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBWLimitA() {
        return bwLimitA;
    }

    /**
     * bwLimitA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBWLimitA(String value) {
        this.bwLimitA = value;
    }

    /**
     * bwLimitB 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBWLimitB() {
        return bwLimitB;
    }

    /**
     * bwLimitB 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBWLimitB(String value) {
        this.bwLimitB = value;
    }

    /**
     * kBitsTx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBitsTx() {
        return kBitsTx;
    }

    /**
     * kBitsTx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBitsTx(String value) {
        this.kBitsTx = value;
    }

    /**
     * kBitsRx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBitsRx() {
        return kBitsRx;
    }

    /**
     * kBitsRx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBitsRx(String value) {
        this.kBitsRx = value;
    }

    /**
     * connectionsTx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionsTx() {
        return connectionsTx;
    }

    /**
     * connectionsTx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionsTx(String value) {
        this.connectionsTx = value;
    }

    /**
     * connectionsRx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionsRx() {
        return connectionsRx;
    }

    /**
     * connectionsRx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionsRx(String value) {
        this.connectionsRx = value;
    }

    /**
     * timesBWLimitHitToday 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimesBWLimitHitToday() {
        return timesBWLimitHitToday;
    }

    /**
     * timesBWLimitHitToday 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimesBWLimitHitToday(String value) {
        this.timesBWLimitHitToday = value;
    }

    /**
     * igarNow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIGARNow() {
        return igarNow;
    }

    /**
     * igarNow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIGARNow(String value) {
        this.igarNow = value;
    }

    /**
     * igarToday 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIGARToday() {
        return igarToday;
    }

    /**
     * igarToday 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIGARToday(String value) {
        this.igarToday = value;
    }

}
