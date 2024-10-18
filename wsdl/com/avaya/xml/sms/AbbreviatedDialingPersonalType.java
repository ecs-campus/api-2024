
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbbreviatedDialingPersonalType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AbbreviatedDialingPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Entries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Unused" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}AbbreviatedDialingPersonalArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbbreviatedDialingPersonalType", propOrder = {
    "listType",
    "listExt",
    "listNumber",
    "listName",
    "totalEntries",
    "numberUnused",
    "extension",
    "listSize",
    "number",
    "abbreviatedDialEntry",
    "abbreviatedDialEntry1",
    "abbreviatedDialEntry2",
    "abbreviatedDialEntry3"
})
public class AbbreviatedDialingPersonalType {

    @XmlElement(name = "List_Type")
    protected String listType;
    @XmlElement(name = "List_Ext")
    protected String listExt;
    @XmlElement(name = "List_Number")
    protected String listNumber;
    @XmlElement(name = "List_Name")
    protected String listName;
    @XmlElement(name = "Total_Entries")
    protected String totalEntries;
    @XmlElement(name = "Number_Unused")
    protected String numberUnused;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "List_Size")
    protected String listSize;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Abbreviated_Dial_Entry")
    protected List<ArrayType> abbreviatedDialEntry;
    @XmlElement(name = "Abbreviated_Dial_Entry_1")
    protected List<ArrayType> abbreviatedDialEntry1;
    @XmlElement(name = "Abbreviated_Dial_Entry_2")
    protected List<ArrayType> abbreviatedDialEntry2;
    @XmlElement(name = "Abbreviated_Dial_Entry_3")
    protected List<ArrayType> abbreviatedDialEntry3;

    /**
     * listType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListType() {
        return listType;
    }

    /**
     * listType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListType(String value) {
        this.listType = value;
    }

    /**
     * listExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListExt() {
        return listExt;
    }

    /**
     * listExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListExt(String value) {
        this.listExt = value;
    }

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
     * listName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * listName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * totalEntries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalEntries() {
        return totalEntries;
    }

    /**
     * totalEntries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalEntries(String value) {
        this.totalEntries = value;
    }

    /**
     * numberUnused 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberUnused() {
        return numberUnused;
    }

    /**
     * numberUnused 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberUnused(String value) {
        this.numberUnused = value;
    }

    /**
     * extension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * extension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
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
     * number 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * number 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Gets the value of the abbreviatedDialEntry2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntry2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntry2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntry2() {
        if (abbreviatedDialEntry2 == null) {
            abbreviatedDialEntry2 = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntry2;
    }

    /**
     * Gets the value of the abbreviatedDialEntry3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntry3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntry3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntry3() {
        if (abbreviatedDialEntry3 == null) {
            abbreviatedDialEntry3 = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntry3;
    }

}
