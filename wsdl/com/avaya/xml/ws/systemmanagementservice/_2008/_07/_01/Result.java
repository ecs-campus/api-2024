
package com.avaya.xml.ws.systemmanagementservice._2008._07._01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.avaya.xml.sms.ModelChoices;


/**
 * <p>Result complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="result_data" type="{http://xml.avaya.com/sms}modelChoices"/>
 *         &lt;element name="message_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {

})
public class Result {

    @XmlElement(name = "result_code")
    protected int resultCode;
    @XmlElement(name = "result_data", required = true)
    protected ModelChoices resultData;
    @XmlElement(name = "message_text", required = true)
    protected String messageText;

    /**
     * resultCode 속성의 값을 가져옵니다.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * resultCode 속성의 값을 설정합니다.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * resultData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ModelChoices }
     *     
     */
    public ModelChoices getResultData() {
        return resultData;
    }

    /**
     * resultData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelChoices }
     *     
     */
    public void setResultData(ModelChoices value) {
        this.resultData = value;
    }

    /**
     * messageText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * messageText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

}
