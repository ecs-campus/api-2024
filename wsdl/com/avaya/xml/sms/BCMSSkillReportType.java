
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BCMSSkillReportType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BCMSSkillReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switch_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skill_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acceptable_Service_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Speed_Answered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abandoned_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Abandoned_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Talk_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_After_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flow_In" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flow_Out" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Aux_Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Staff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BCMSSkillReportType", propOrder = {
    "switchName",
    "date",
    "skill",
    "skillName",
    "acceptableServiceLevel",
    "reportType",
    "interval",
    "acdCalls",
    "avgSpeedAnswered",
    "abandonedCalls",
    "avgAbandonedTime",
    "avgTalkTime",
    "totalAfterCall",
    "flowIn",
    "flowOut",
    "totalAuxOther",
    "avgStaff",
    "pctInSvcLevel"
})
public class BCMSSkillReportType {

    @XmlElement(name = "Switch_Name")
    protected String switchName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Skill")
    protected String skill;
    @XmlElement(name = "Skill_Name")
    protected String skillName;
    @XmlElement(name = "Acceptable_Service_Level")
    protected String acceptableServiceLevel;
    @XmlElement(name = "Report_Type")
    protected String reportType;
    @XmlElement(name = "Interval")
    protected String interval;
    @XmlElement(name = "ACD_Calls")
    protected String acdCalls;
    @XmlElement(name = "Avg_Speed_Answered")
    protected String avgSpeedAnswered;
    @XmlElement(name = "Abandoned_Calls")
    protected String abandonedCalls;
    @XmlElement(name = "Avg_Abandoned_Time")
    protected String avgAbandonedTime;
    @XmlElement(name = "Avg_Talk_Time")
    protected String avgTalkTime;
    @XmlElement(name = "Total_After_Call")
    protected String totalAfterCall;
    @XmlElement(name = "Flow_In")
    protected String flowIn;
    @XmlElement(name = "Flow_Out")
    protected String flowOut;
    @XmlElement(name = "Total_Aux_Other")
    protected String totalAuxOther;
    @XmlElement(name = "Avg_Staff")
    protected String avgStaff;
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
     * skill 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkill() {
        return skill;
    }

    /**
     * skill 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkill(String value) {
        this.skill = value;
    }

    /**
     * skillName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * skillName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillName(String value) {
        this.skillName = value;
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
     * flowIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowIn() {
        return flowIn;
    }

    /**
     * flowIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowIn(String value) {
        this.flowIn = value;
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
     * avgStaff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgStaff() {
        return avgStaff;
    }

    /**
     * avgStaff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgStaff(String value) {
        this.avgStaff = value;
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
