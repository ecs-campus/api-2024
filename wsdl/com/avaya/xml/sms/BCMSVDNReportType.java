
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BCMSVDNReportType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BCMSVDNReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switch_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acceptable_Service_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calls_Offered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Speed_Answered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abandoned_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Abandoned_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Talk_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flow_Out" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calls_Busy_Disconnected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pct_In_Svc_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCMSVDNReportType", propOrder = {
    "switchName",
    "date",
    "vdn",
    "vdnName",
    "acceptableServiceLevel",
    "reportType",
    "callsOffered",
    "acdCalls",
    "avgSpeedAnswered",
    "abandonedCalls",
    "avgAbandonedTime",
    "avgTalkHold",
    "connectedCalls",
    "flowOut",
    "callsBusyDisconnected",
    "pctInSvcLevel"
})
public class BCMSVDNReportType {

    @XmlElement(name = "Switch_Name")
    protected String switchName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "VDN")
    protected String vdn;
    @XmlElement(name = "VDN_Name")
    protected String vdnName;
    @XmlElement(name = "Acceptable_Service_Level")
    protected String acceptableServiceLevel;
    @XmlElement(name = "Report_Type")
    protected String reportType;
    @XmlElement(name = "Calls_Offered")
    protected String callsOffered;
    @XmlElement(name = "ACD_Calls")
    protected String acdCalls;
    @XmlElement(name = "Avg_Speed_Answered")
    protected String avgSpeedAnswered;
    @XmlElement(name = "Abandoned_Calls")
    protected String abandonedCalls;
    @XmlElement(name = "Avg_Abandoned_Time")
    protected String avgAbandonedTime;
    @XmlElement(name = "Avg_Talk_Hold")
    protected String avgTalkHold;
    @XmlElement(name = "Connected_Calls")
    protected String connectedCalls;
    @XmlElement(name = "Flow_Out")
    protected String flowOut;
    @XmlElement(name = "Calls_Busy_Disconnected")
    protected String callsBusyDisconnected;
    @XmlElement(name = "Pct_In_Svc_Level")
    protected String pctInSvcLevel;

    /**
     * switchName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchName() {
        return switchName;
    }

    /**
     * switchName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchName(String value) {
        this.switchName = value;
    }

    /**
     * date 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * date 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * vdn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDN() {
        return vdn;
    }

    /**
     * vdn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDN(String value) {
        this.vdn = value;
    }

    /**
     * vdnName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNName() {
        return vdnName;
    }

    /**
     * vdnName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNName(String value) {
        this.vdnName = value;
    }

    /**
     * acceptableServiceLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptableServiceLevel() {
        return acceptableServiceLevel;
    }

    /**
     * acceptableServiceLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptableServiceLevel(String value) {
        this.acceptableServiceLevel = value;
    }

    /**
     * reportType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * reportType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * callsOffered 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsOffered() {
        return callsOffered;
    }

    /**
     * callsOffered 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsOffered(String value) {
        this.callsOffered = value;
    }

    /**
     * acdCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDCalls() {
        return acdCalls;
    }

    /**
     * acdCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDCalls(String value) {
        this.acdCalls = value;
    }

    /**
     * avgSpeedAnswered 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgSpeedAnswered() {
        return avgSpeedAnswered;
    }

    /**
     * avgSpeedAnswered 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgSpeedAnswered(String value) {
        this.avgSpeedAnswered = value;
    }

    /**
     * abandonedCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbandonedCalls() {
        return abandonedCalls;
    }

    /**
     * abandonedCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbandonedCalls(String value) {
        this.abandonedCalls = value;
    }

    /**
     * avgAbandonedTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgAbandonedTime() {
        return avgAbandonedTime;
    }

    /**
     * avgAbandonedTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgAbandonedTime(String value) {
        this.avgAbandonedTime = value;
    }

    /**
     * avgTalkHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgTalkHold() {
        return avgTalkHold;
    }

    /**
     * avgTalkHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgTalkHold(String value) {
        this.avgTalkHold = value;
    }

    /**
     * connectedCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedCalls() {
        return connectedCalls;
    }

    /**
     * connectedCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedCalls(String value) {
        this.connectedCalls = value;
    }

    /**
     * flowOut 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowOut() {
        return flowOut;
    }

    /**
     * flowOut 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowOut(String value) {
        this.flowOut = value;
    }

    /**
     * callsBusyDisconnected 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsBusyDisconnected() {
        return callsBusyDisconnected;
    }

    /**
     * callsBusyDisconnected 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsBusyDisconnected(String value) {
        this.callsBusyDisconnected = value;
    }

    /**
     * pctInSvcLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctInSvcLevel() {
        return pctInSvcLevel;
    }

    /**
     * pctInSvcLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctInSvcLevel(String value) {
        this.pctInSvcLevel = value;
    }

}
