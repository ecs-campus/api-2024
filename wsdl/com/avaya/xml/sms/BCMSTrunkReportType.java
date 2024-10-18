
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BCMSTrunkReportType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BCMSTrunkReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switch_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Of_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoming_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoming_Abandoned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoming_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoming_Usage_CCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Completed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Usage_CCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pct_All_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pct_Time_Maintenance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCMSTrunkReportType", propOrder = {
    "switchName",
    "date",
    "group",
    "groupName",
    "numberOfTrunks",
    "reportType",
    "interval",
    "incomingCalls",
    "incomingAbandoned",
    "incomingTime",
    "incomingUsageCCS",
    "outgoingCalls",
    "outgoingCompleted",
    "outgoingTime",
    "outgoingUsageCCS",
    "pctAllBusy",
    "pctTimeMaintenance"
})
public class BCMSTrunkReportType {

    @XmlElement(name = "Switch_Name")
    protected String switchName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Group")
    protected String group;
    @XmlElement(name = "Group_Name")
    protected String groupName;
    @XmlElement(name = "Number_Of_Trunks")
    protected String numberOfTrunks;
    @XmlElement(name = "Report_Type")
    protected String reportType;
    @XmlElement(name = "Interval")
    protected String interval;
    @XmlElement(name = "Incoming_Calls")
    protected String incomingCalls;
    @XmlElement(name = "Incoming_Abandoned")
    protected String incomingAbandoned;
    @XmlElement(name = "Incoming_Time")
    protected String incomingTime;
    @XmlElement(name = "Incoming_Usage_CCS")
    protected String incomingUsageCCS;
    @XmlElement(name = "Outgoing_Calls")
    protected String outgoingCalls;
    @XmlElement(name = "Outgoing_Completed")
    protected String outgoingCompleted;
    @XmlElement(name = "Outgoing_Time")
    protected String outgoingTime;
    @XmlElement(name = "Outgoing_Usage_CCS")
    protected String outgoingUsageCCS;
    @XmlElement(name = "Pct_All_Busy")
    protected String pctAllBusy;
    @XmlElement(name = "Pct_Time_Maintenance")
    protected String pctTimeMaintenance;

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
     * group 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * group 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * groupName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * groupName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * numberOfTrunks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfTrunks() {
        return numberOfTrunks;
    }

    /**
     * numberOfTrunks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfTrunks(String value) {
        this.numberOfTrunks = value;
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
     * incomingCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingCalls() {
        return incomingCalls;
    }

    /**
     * incomingCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingCalls(String value) {
        this.incomingCalls = value;
    }

    /**
     * incomingAbandoned 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingAbandoned() {
        return incomingAbandoned;
    }

    /**
     * incomingAbandoned 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingAbandoned(String value) {
        this.incomingAbandoned = value;
    }

    /**
     * incomingTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingTime() {
        return incomingTime;
    }

    /**
     * incomingTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingTime(String value) {
        this.incomingTime = value;
    }

    /**
     * incomingUsageCCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingUsageCCS() {
        return incomingUsageCCS;
    }

    /**
     * incomingUsageCCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingUsageCCS(String value) {
        this.incomingUsageCCS = value;
    }

    /**
     * outgoingCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingCalls() {
        return outgoingCalls;
    }

    /**
     * outgoingCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingCalls(String value) {
        this.outgoingCalls = value;
    }

    /**
     * outgoingCompleted 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingCompleted() {
        return outgoingCompleted;
    }

    /**
     * outgoingCompleted 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingCompleted(String value) {
        this.outgoingCompleted = value;
    }

    /**
     * outgoingTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingTime() {
        return outgoingTime;
    }

    /**
     * outgoingTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingTime(String value) {
        this.outgoingTime = value;
    }

    /**
     * outgoingUsageCCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingUsageCCS() {
        return outgoingUsageCCS;
    }

    /**
     * outgoingUsageCCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingUsageCCS(String value) {
        this.outgoingUsageCCS = value;
    }

    /**
     * pctAllBusy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctAllBusy() {
        return pctAllBusy;
    }

    /**
     * pctAllBusy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctAllBusy(String value) {
        this.pctAllBusy = value;
    }

    /**
     * pctTimeMaintenance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctTimeMaintenance() {
        return pctTimeMaintenance;
    }

    /**
     * pctTimeMaintenance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctTimeMaintenance(String value) {
        this.pctTimeMaintenance = value;
    }

}
