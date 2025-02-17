
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbbreviatedDialingSystemType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AbbreviatedDialingSystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List_Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priveleged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numbering_Scheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abr_Dial_Lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}AbbreviatedDialingSystemArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbbreviatedDialingSystemType", propOrder = {
    "listSize",
    "priveleged",
    "numberingScheme",
    "abrDialLang",
    "abbreviatedDialEntry",
    "abbreviatedDialEntry1",
    "abbreviatedDialEntryLabel",
    "abbreviatedDialEntryLabel1"
})
public class AbbreviatedDialingSystemType {

    @XmlElement(name = "List_Size")
    protected String listSize;
    @XmlElement(name = "Priveleged")
    protected String priveleged;
    @XmlElement(name = "Numbering_Scheme")
    protected String numberingScheme;
    @XmlElement(name = "Abr_Dial_Lang")
    protected String abrDialLang;
    @XmlElement(name = "Abbreviated_Dial_Entry")
    protected List<ArrayType> abbreviatedDialEntry;
    @XmlElement(name = "Abbreviated_Dial_Entry_1")
    protected List<ArrayType> abbreviatedDialEntry1;
    @XmlElement(name = "Abbreviated_Dial_Entry_Label")
    protected List<ArrayType> abbreviatedDialEntryLabel;
    @XmlElement(name = "Abbreviated_Dial_Entry_Label_1")
    protected List<ArrayType> abbreviatedDialEntryLabel1;

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
     * numberingScheme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingScheme() {
        return numberingScheme;
    }

    /**
     * numberingScheme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingScheme(String value) {
        this.numberingScheme = value;
    }

    /**
     * abrDialLang 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrDialLang() {
        return abrDialLang;
    }

    /**
     * abrDialLang 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbrDialLang(String value) {
        this.abrDialLang = value;
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
     * Gets the value of the abbreviatedDialEntry1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntry1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntry1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntry1() {
        if (abbreviatedDialEntry1 == null) {
            abbreviatedDialEntry1 = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntry1;
    }

    /**
     * Gets the value of the abbreviatedDialEntryLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntryLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntryLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntryLabel() {
        if (abbreviatedDialEntryLabel == null) {
            abbreviatedDialEntryLabel = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntryLabel;
    }

    /**
     * Gets the value of the abbreviatedDialEntryLabel1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntryLabel1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntryLabel1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntryLabel1() {
        if (abbreviatedDialEntryLabel1 == null) {
            abbreviatedDialEntryLabel1 = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntryLabel1;
    }

}
