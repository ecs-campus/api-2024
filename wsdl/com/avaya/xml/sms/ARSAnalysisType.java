
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ARSAnalysisType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ARSAnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dialed_String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Route_Pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Node_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARSAnalysisType", propOrder = {
    "dialedString",
    "totalMin",
    "totalMax",
    "routePattern",
    "callType",
    "nodeNumber"
})
public class ARSAnalysisType {

    @XmlElement(name = "Dialed_String")
    protected String dialedString;
    @XmlElement(name = "Total_min")
    protected String totalMin;
    @XmlElement(name = "Total_max")
    protected String totalMax;
    @XmlElement(name = "Route_Pattern")
    protected String routePattern;
    @XmlElement(name = "Call_Type")
    protected String callType;
    @XmlElement(name = "Node_Number")
    protected String nodeNumber;

    /**
     * dialedString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialedString() {
        return dialedString;
    }

    /**
     * dialedString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialedString(String value) {
        this.dialedString = value;
    }

    /**
     * totalMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMin() {
        return totalMin;
    }

    /**
     * totalMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMin(String value) {
        this.totalMin = value;
    }

    /**
     * totalMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMax() {
        return totalMax;
    }

    /**
     * totalMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMax(String value) {
        this.totalMax = value;
    }

    /**
     * routePattern 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePattern() {
        return routePattern;
    }

    /**
     * routePattern 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePattern(String value) {
        this.routePattern = value;
    }

    /**
     * callType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallType() {
        return callType;
    }

    /**
     * callType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallType(String value) {
        this.callType = value;
    }

    /**
     * nodeNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeNumber() {
        return nodeNumber;
    }

    /**
     * nodeNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeNumber(String value) {
        this.nodeNumber = value;
    }

}
