
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReasonCodeNamesType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ReasonCodeNamesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Default_Aux_Work_Reason_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Logout_Reason_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}ReasonCodeNamesArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReasonCodeNamesType", propOrder = {
    "defaultAuxWorkReasonCode",
    "defaultLogoutReasonCode",
    "auxWorkReasonCode",
    "logoutReasonCode"
})
public class ReasonCodeNamesType {

    @XmlElement(name = "Default_Aux_Work_Reason_Code")
    protected String defaultAuxWorkReasonCode;
    @XmlElement(name = "Default_Logout_Reason_Code")
    protected String defaultLogoutReasonCode;
    @XmlElement(name = "Aux_Work_Reason_Code")
    protected List<ArrayType> auxWorkReasonCode;
    @XmlElement(name = "Logout_Reason_Code")
    protected List<ArrayType> logoutReasonCode;

    /**
     * defaultAuxWorkReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAuxWorkReasonCode() {
        return defaultAuxWorkReasonCode;
    }

    /**
     * defaultAuxWorkReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAuxWorkReasonCode(String value) {
        this.defaultAuxWorkReasonCode = value;
    }

    /**
     * defaultLogoutReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLogoutReasonCode() {
        return defaultLogoutReasonCode;
    }

    /**
     * defaultLogoutReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLogoutReasonCode(String value) {
        this.defaultLogoutReasonCode = value;
    }

    /**
     * Gets the value of the auxWorkReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxWorkReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxWorkReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuxWorkReasonCode() {
        if (auxWorkReasonCode == null) {
            auxWorkReasonCode = new ArrayList<ArrayType>();
        }
        return this.auxWorkReasonCode;
    }

    /**
     * Gets the value of the logoutReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logoutReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogoutReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLogoutReasonCode() {
        if (logoutReasonCode == null) {
            logoutReasonCode = new ArrayList<ArrayType>();
        }
        return this.logoutReasonCode;
    }

}
