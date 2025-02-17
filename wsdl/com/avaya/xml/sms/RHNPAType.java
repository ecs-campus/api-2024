
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RHNPAType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RHNPAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}RHNPAArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RHNPAType", propOrder = {
    "patternChoices",
    "patternChoiceAssignments"
})
public class RHNPAType {

    @XmlElement(name = "Pattern_Choices")
    protected List<ArrayType> patternChoices;
    @XmlElement(name = "Pattern_Choice_Assignments")
    protected List<ArrayType> patternChoiceAssignments;

    /**
     * Gets the value of the patternChoices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternChoices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatternChoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPatternChoices() {
        if (patternChoices == null) {
            patternChoices = new ArrayList<ArrayType>();
        }
        return this.patternChoices;
    }

    /**
     * Gets the value of the patternChoiceAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternChoiceAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatternChoiceAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPatternChoiceAssignments() {
        if (patternChoiceAssignments == null) {
            patternChoiceAssignments = new ArrayList<ArrayType>();
        }
        return this.patternChoiceAssignments;
    }

}
