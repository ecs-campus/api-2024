
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SoftwareVersionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SoftwareVersionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version_On_Disk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Translation_Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Translation_Date_On_Disk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disk_Second_Copy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareVersionType", propOrder = {
    "version",
    "versionOnDisk",
    "translationDate",
    "translationDateOnDisk",
    "diskSecondCopy"
})
public class SoftwareVersionType {

    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Version_On_Disk")
    protected String versionOnDisk;
    @XmlElement(name = "Translation_Date")
    protected String translationDate;
    @XmlElement(name = "Translation_Date_On_Disk")
    protected String translationDateOnDisk;
    @XmlElement(name = "Disk_Second_Copy")
    protected String diskSecondCopy;

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * versionOnDisk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionOnDisk() {
        return versionOnDisk;
    }

    /**
     * versionOnDisk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionOnDisk(String value) {
        this.versionOnDisk = value;
    }

    /**
     * translationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationDate() {
        return translationDate;
    }

    /**
     * translationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationDate(String value) {
        this.translationDate = value;
    }

    /**
     * translationDateOnDisk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationDateOnDisk() {
        return translationDateOnDisk;
    }

    /**
     * translationDateOnDisk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationDateOnDisk(String value) {
        this.translationDateOnDisk = value;
    }

    /**
     * diskSecondCopy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskSecondCopy() {
        return diskSecondCopy;
    }

    /**
     * diskSecondCopy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskSecondCopy(String value) {
        this.diskSecondCopy = value;
    }

}
