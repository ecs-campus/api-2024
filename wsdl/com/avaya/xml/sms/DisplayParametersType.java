
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DisplayParametersType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DisplayParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Six_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Six_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seven_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seven_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eight_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eight_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nine_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nine_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ten_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ten_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eleven_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eleven_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Twelve_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Twelve_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Thirteen_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Thirteen_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayParametersType", propOrder = {
    "sixDigitExtensionInter",
    "sixDigitExtensionIntra",
    "sevenDigitExtensionInter",
    "sevenDigitExtensionIntra",
    "eightDigitExtensionInter",
    "eightDigitExtensionIntra",
    "nineDigitExtensionInter",
    "nineDigitExtensionIntra",
    "tenDigitExtensionInter",
    "tenDigitExtensionIntra",
    "elevenDigitExtensionInter",
    "elevenDigitExtensionIntra",
    "twelveDigitExtensionInter",
    "twelveDigitExtensionIntra",
    "thirteenDigitExtensionInter",
    "thirteenDigitExtensionIntra"
})
public class DisplayParametersType {

    @XmlElement(name = "Six_Digit_Extension_Inter")
    protected String sixDigitExtensionInter;
    @XmlElement(name = "Six_Digit_Extension_Intra")
    protected String sixDigitExtensionIntra;
    @XmlElement(name = "Seven_Digit_Extension_Inter")
    protected String sevenDigitExtensionInter;
    @XmlElement(name = "Seven_Digit_Extension_Intra")
    protected String sevenDigitExtensionIntra;
    @XmlElement(name = "Eight_Digit_Extension_Inter")
    protected String eightDigitExtensionInter;
    @XmlElement(name = "Eight_Digit_Extension_Intra")
    protected String eightDigitExtensionIntra;
    @XmlElement(name = "Nine_Digit_Extension_Inter")
    protected String nineDigitExtensionInter;
    @XmlElement(name = "Nine_Digit_Extension_Intra")
    protected String nineDigitExtensionIntra;
    @XmlElement(name = "Ten_Digit_Extension_Inter")
    protected String tenDigitExtensionInter;
    @XmlElement(name = "Ten_Digit_Extension_Intra")
    protected String tenDigitExtensionIntra;
    @XmlElement(name = "Eleven_Digit_Extension_Inter")
    protected String elevenDigitExtensionInter;
    @XmlElement(name = "Eleven_Digit_Extension_Intra")
    protected String elevenDigitExtensionIntra;
    @XmlElement(name = "Twelve_Digit_Extension_Inter")
    protected String twelveDigitExtensionInter;
    @XmlElement(name = "Twelve_Digit_Extension_Intra")
    protected String twelveDigitExtensionIntra;
    @XmlElement(name = "Thirteen_Digit_Extension_Inter")
    protected String thirteenDigitExtensionInter;
    @XmlElement(name = "Thirteen_Digit_Extension_Intra")
    protected String thirteenDigitExtensionIntra;

    /**
     * sixDigitExtensionInter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSixDigitExtensionInter() {
        return sixDigitExtensionInter;
    }

    /**
     * sixDigitExtensionInter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSixDigitExtensionInter(String value) {
        this.sixDigitExtensionInter = value;
    }

    /**
     * sixDigitExtensionIntra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSixDigitExtensionIntra() {
        return sixDigitExtensionIntra;
    }

    /**
     * sixDigitExtensionIntra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSixDigitExtensionIntra(String value) {
        this.sixDigitExtensionIntra = value;
    }

    /**
     * sevenDigitExtensionInter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSevenDigitExtensionInter() {
        return sevenDigitExtensionInter;
    }

    /**
     * sevenDigitExtensionInter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSevenDigitExtensionInter(String value) {
        this.sevenDigitExtensionInter = value;
    }

    /**
     * sevenDigitExtensionIntra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSevenDigitExtensionIntra() {
        return sevenDigitExtensionIntra;
    }

    /**
     * sevenDigitExtensionIntra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSevenDigitExtensionIntra(String value) {
        this.sevenDigitExtensionIntra = value;
    }

    /**
     * eightDigitExtensionInter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEightDigitExtensionInter() {
        return eightDigitExtensionInter;
    }

    /**
     * eightDigitExtensionInter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEightDigitExtensionInter(String value) {
        this.eightDigitExtensionInter = value;
    }

    /**
     * eightDigitExtensionIntra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEightDigitExtensionIntra() {
        return eightDigitExtensionIntra;
    }

    /**
     * eightDigitExtensionIntra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEightDigitExtensionIntra(String value) {
        this.eightDigitExtensionIntra = value;
    }

    /**
     * nineDigitExtensionInter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNineDigitExtensionInter() {
        return nineDigitExtensionInter;
    }

    /**
     * nineDigitExtensionInter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNineDigitExtensionInter(String value) {
        this.nineDigitExtensionInter = value;
    }

    /**
     * nineDigitExtensionIntra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNineDigitExtensionIntra() {
        return nineDigitExtensionIntra;
    }

    /**
     * nineDigitExtensionIntra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNineDigitExtensionIntra(String value) {
        this.nineDigitExtensionIntra = value;
    }

    /**
     * tenDigitExtensionInter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenDigitExtensionInter() {
        return tenDigitExtensionInter;
    }

    /**
     * tenDigitExtensionInter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenDigitExtensionInter(String value) {
        this.tenDigitExtensionInter = value;
    }

    /**
     * tenDigitExtensionIntra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenDigitExtensionIntra() {
        return tenDigitExtensionIntra;
    }

    /**
     * tenDigitExtensionIntra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenDigitExtensionIntra(String value) {
        this.tenDigitExtensionIntra = value;
    }

    /**
     * elevenDigitExtensionInter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevenDigitExtensionInter() {
        return elevenDigitExtensionInter;
    }

    /**
     * elevenDigitExtensionInter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevenDigitExtensionInter(String value) {
        this.elevenDigitExtensionInter = value;
    }

    /**
     * elevenDigitExtensionIntra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevenDigitExtensionIntra() {
        return elevenDigitExtensionIntra;
    }

    /**
     * elevenDigitExtensionIntra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevenDigitExtensionIntra(String value) {
        this.elevenDigitExtensionIntra = value;
    }

    /**
     * twelveDigitExtensionInter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwelveDigitExtensionInter() {
        return twelveDigitExtensionInter;
    }

    /**
     * twelveDigitExtensionInter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwelveDigitExtensionInter(String value) {
        this.twelveDigitExtensionInter = value;
    }

    /**
     * twelveDigitExtensionIntra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwelveDigitExtensionIntra() {
        return twelveDigitExtensionIntra;
    }

    /**
     * twelveDigitExtensionIntra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwelveDigitExtensionIntra(String value) {
        this.twelveDigitExtensionIntra = value;
    }

    /**
     * thirteenDigitExtensionInter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirteenDigitExtensionInter() {
        return thirteenDigitExtensionInter;
    }

    /**
     * thirteenDigitExtensionInter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirteenDigitExtensionInter(String value) {
        this.thirteenDigitExtensionInter = value;
    }

    /**
     * thirteenDigitExtensionIntra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirteenDigitExtensionIntra() {
        return thirteenDigitExtensionIntra;
    }

    /**
     * thirteenDigitExtensionIntra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirteenDigitExtensionIntra(String value) {
        this.thirteenDigitExtensionIntra = value;
    }

}
