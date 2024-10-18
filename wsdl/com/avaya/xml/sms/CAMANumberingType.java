
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CAMANumberingType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CAMANumberingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sys_CESID_Default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}CAMANumberingArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAMANumberingType", propOrder = {
    "sysCESIDDefault",
    "extLen",
    "extCode",
    "cesid",
    "totalLength"
})
public class CAMANumberingType {

    @XmlElement(name = "Sys_CESID_Default")
    protected String sysCESIDDefault;
    @XmlElement(name = "Ext_Len")
    protected List<ArrayType> extLen;
    @XmlElement(name = "Ext_Code")
    protected List<ArrayType> extCode;
    @XmlElement(name = "CESID")
    protected List<ArrayType> cesid;
    @XmlElement(name = "Total_Length")
    protected List<ArrayType> totalLength;

    /**
     * sysCESIDDefault 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCESIDDefault() {
        return sysCESIDDefault;
    }

    /**
     * sysCESIDDefault 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCESIDDefault(String value) {
        this.sysCESIDDefault = value;
    }

    /**
     * Gets the value of the extLen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extLen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtLen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtLen() {
        if (extLen == null) {
            extLen = new ArrayList<ArrayType>();
        }
        return this.extLen;
    }

    /**
     * Gets the value of the extCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtCode() {
        if (extCode == null) {
            extCode = new ArrayList<ArrayType>();
        }
        return this.extCode;
    }

    /**
     * Gets the value of the cesid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cesid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCESID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCESID() {
        if (cesid == null) {
            cesid = new ArrayList<ArrayType>();
        }
        return this.cesid;
    }

    /**
     * Gets the value of the totalLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTotalLength() {
        if (totalLength == null) {
            totalLength = new ArrayList<ArrayType>();
        }
        return this.totalLength;
    }

}
