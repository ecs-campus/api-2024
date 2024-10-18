
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BCMSAgentReportType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BCMSAgentReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switch_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agent_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Talk_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_After_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Avail_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Aux_Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extn_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Extn_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Time_Staffed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Hold_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCMSAgentReportType", propOrder = {
    "switchName",
    "date",
    "agent",
    "agentName",
    "reportType",
    "interval",
    "acdCalls",
    "avgTalkTime",
    "totalAfterCall",
    "totalAvailTime",
    "totalAuxOther",
    "extnCalls",
    "avgExtnTime",
    "totalTimeStaffed",
    "totalHoldTime"
})
public class BCMSAgentReportType {

    @XmlElement(name = "Switch_Name")
    protected String switchName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Agent")
    protected String agent;
    @XmlElement(name = "Agent_Name")
    protected String agentName;
    @XmlElement(name = "Report_Type")
    protected String reportType;
    @XmlElement(name = "Interval")
    protected String interval;
    @XmlElement(name = "ACD_Calls")
    protected String acdCalls;
    @XmlElement(name = "Avg_Talk_Time")
    protected String avgTalkTime;
    @XmlElement(name = "Total_After_Call")
    protected String totalAfterCall;
    @XmlElement(name = "Total_Avail_Time")
    protected String totalAvailTime;
    @XmlElement(name = "Total_Aux_Other")
    protected String totalAuxOther;
    @XmlElement(name = "Extn_Calls")
    protected String extnCalls;
    @XmlElement(name = "Avg_Extn_Time")
    protected String avgExtnTime;
    @XmlElement(name = "Total_Time_Staffed")
    protected String totalTimeStaffed;
    @XmlElement(name = "Total_Hold_Time")
    protected String totalHoldTime;

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
     * agent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * agent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
    }

    /**
     * agentName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * agentName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
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
     * interval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterval() {
        return interval;
    }

    /**
     * interval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterval(String value) {
        this.interval = value;
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
     * avgTalkTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgTalkTime() {
        return avgTalkTime;
    }

    /**
     * avgTalkTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgTalkTime(String value) {
        this.avgTalkTime = value;
    }

    /**
     * totalAfterCall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAfterCall() {
        return totalAfterCall;
    }

    /**
     * totalAfterCall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAfterCall(String value) {
        this.totalAfterCall = value;
    }

    /**
     * totalAvailTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvailTime() {
        return totalAvailTime;
    }

    /**
     * totalAvailTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvailTime(String value) {
        this.totalAvailTime = value;
    }

    /**
     * totalAuxOther 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAuxOther() {
        return totalAuxOther;
    }

    /**
     * totalAuxOther 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAuxOther(String value) {
        this.totalAuxOther = value;
    }

    /**
     * extnCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtnCalls() {
        return extnCalls;
    }

    /**
     * extnCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtnCalls(String value) {
        this.extnCalls = value;
    }

    /**
     * avgExtnTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgExtnTime() {
        return avgExtnTime;
    }

    /**
     * avgExtnTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgExtnTime(String value) {
        this.avgExtnTime = value;
    }

    /**
     * totalTimeStaffed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTimeStaffed() {
        return totalTimeStaffed;
    }

    /**
     * totalTimeStaffed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTimeStaffed(String value) {
        this.totalTimeStaffed = value;
    }

    /**
     * totalHoldTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalHoldTime() {
        return totalHoldTime;
    }

    /**
     * totalHoldTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalHoldTime(String value) {
        this.totalHoldTime = value;
    }

}
