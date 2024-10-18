
package com.avaya.xml.ws.systemmanagementservice._2008._07._01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.avaya.xml.sms.ModelChoices;


/**
 * <p>submitRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="submitRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelFields" type="{http://xml.avaya.com/sms}modelChoices"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitRequestType", propOrder = {
    "modelFields",
    "operation",
    "objectname",
    "qualifier"
})
public class SubmitRequestType {

    @XmlElement(required = true)
    protected ModelChoices modelFields;
    @XmlElement(required = true)
    protected String operation;
    @XmlElement(required = true)
    protected String objectname;
    @XmlElement(required = true)
    protected String qualifier;

    /**
     * modelFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ModelChoices }
     *     
     */
    public ModelChoices getModelFields() {
        return modelFields;
    }

    /**
     * modelFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelChoices }
     *     
     */
    public void setModelFields(ModelChoices value) {
        this.modelFields = value;
    }

    /**
     * operation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * operation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * objectname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectname() {
        return objectname;
    }

    /**
     * objectname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectname(String value) {
        this.objectname = value;
    }

    /**
     * qualifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * qualifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

}
