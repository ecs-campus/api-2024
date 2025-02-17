
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbbreviatedDialingEnhancedType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AbbreviatedDialingEnhancedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priveleged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numbering_Sscheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}AbbreviatedDialingEnhancedArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbbreviatedDialingEnhancedType", propOrder = {
    "listNumber",
    "listSize",
    "priveleged",
    "numberingSscheme",
    "abbreviatedDialEntry",
    "formNumber"
})
public class AbbreviatedDialingEnhancedType {

    @XmlElement(name = "List_Number")
    protected String listNumber;
    @XmlElement(name = "List_Size")
    protected String listSize;
    @XmlElement(name = "Priveleged")
    protected String priveleged;
    @XmlElement(name = "Numbering_Sscheme")
    protected String numberingSscheme;
    @XmlElement(name = "Abbreviated_Dial_Entry")
    protected List<ArrayType> abbreviatedDialEntry;
    @XmlElement(name = "Form_Number")
    protected List<ArrayType> formNumber;

    /**
     * listNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListNumber() {
        return listNumber;
    }

    /**
     * listNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListNumber(String value) {
        this.listNumber = value;
    }

    /**
     * listSize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListSize() {
        return listSize;
    }

    /**
     * listSize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListSize(String value) {
        this.listSize = value;
    }

    /**
     * priveleged 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriveleged() {
        return priveleged;
    }

    /**
     * priveleged 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriveleged(String value) {
        this.priveleged = value;
    }

    /**
     * numberingSscheme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingSscheme() {
        return numberingSscheme;
    }

    /**
     * numberingSscheme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingSscheme(String value) {
        this.numberingSscheme = value;
    }

    /**
     * Gets the value of the abbreviatedDialEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntry() {
        if (abbreviatedDialEntry == null) {
            abbreviatedDialEntry = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntry;
    }

    /**
     * Gets the value of the formNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFormNumber() {
        if (formNumber == null) {
            formNumber = new ArrayList<ArrayType>();
        }
        return this.formNumber;
    }

}
