
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CoveragePathType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CoveragePathType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Next_Path_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hunt_After_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_Dont_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_All" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_DND_SAC_GotoCover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_Holiday_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_Dont_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_All" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_DND_SAC_GotoCover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_Holiday_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Of_Rings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Holiday_Table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminate_To_Coverage_Pts_With_Bridged_Appearances" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}CoveragePathArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveragePathType", propOrder = {
    "coveragePath",
    "nextPathNumber",
    "huntAfterCoverage",
    "insideActive",
    "insideBusy",
    "insideDontAnswer",
    "insideAll",
    "insideDNDSACGotoCover",
    "insideHolidayCoverage",
    "outsideActive",
    "outsideBusy",
    "outsideDontAnswer",
    "outsideAll",
    "outsideDNDSACGotoCover",
    "outsideHolidayCoverage",
    "numberOfRings",
    "holidayTable",
    "terminateToCoveragePtsWithBridgedAppearances",
    "point1",
    "point2",
    "point3",
    "point4",
    "point5",
    "point6",
    "rings1",
    "rings2",
    "rings3",
    "rings4",
    "rings5",
    "rings6",
    "linkage"
})
public class CoveragePathType {

    @XmlElement(name = "Coverage_Path")
    protected String coveragePath;
    @XmlElement(name = "Next_Path_Number")
    protected String nextPathNumber;
    @XmlElement(name = "Hunt_After_Coverage")
    protected String huntAfterCoverage;
    @XmlElement(name = "Inside_Active")
    protected String insideActive;
    @XmlElement(name = "Inside_Busy")
    protected String insideBusy;
    @XmlElement(name = "Inside_Dont_Answer")
    protected String insideDontAnswer;
    @XmlElement(name = "Inside_All")
    protected String insideAll;
    @XmlElement(name = "Inside_DND_SAC_GotoCover")
    protected String insideDNDSACGotoCover;
    @XmlElement(name = "Inside_Holiday_Coverage")
    protected String insideHolidayCoverage;
    @XmlElement(name = "Outside_Active")
    protected String outsideActive;
    @XmlElement(name = "Outside_Busy")
    protected String outsideBusy;
    @XmlElement(name = "Outside_Dont_Answer")
    protected String outsideDontAnswer;
    @XmlElement(name = "Outside_All")
    protected String outsideAll;
    @XmlElement(name = "Outside_DND_SAC_GotoCover")
    protected String outsideDNDSACGotoCover;
    @XmlElement(name = "Outside_Holiday_Coverage")
    protected String outsideHolidayCoverage;
    @XmlElement(name = "Number_Of_Rings")
    protected String numberOfRings;
    @XmlElement(name = "Holiday_Table")
    protected String holidayTable;
    @XmlElement(name = "Terminate_To_Coverage_Pts_With_Bridged_Appearances")
    protected String terminateToCoveragePtsWithBridgedAppearances;
    @XmlElement(name = "Point1")
    protected String point1;
    @XmlElement(name = "Point2")
    protected String point2;
    @XmlElement(name = "Point3")
    protected String point3;
    @XmlElement(name = "Point4")
    protected String point4;
    @XmlElement(name = "Point5")
    protected String point5;
    @XmlElement(name = "Point6")
    protected String point6;
    @XmlElement(name = "Rings1")
    protected String rings1;
    @XmlElement(name = "Rings2")
    protected String rings2;
    @XmlElement(name = "Rings3")
    protected String rings3;
    @XmlElement(name = "Rings4")
    protected String rings4;
    @XmlElement(name = "Rings5")
    protected String rings5;
    @XmlElement(name = "Rings6")
    protected String rings6;
    @XmlElement(name = "Linkage")
    protected List<ArrayType> linkage;

    /**
     * coveragePath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath() {
        return coveragePath;
    }

    /**
     * coveragePath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath(String value) {
        this.coveragePath = value;
    }

    /**
     * nextPathNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPathNumber() {
        return nextPathNumber;
    }

    /**
     * nextPathNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPathNumber(String value) {
        this.nextPathNumber = value;
    }

    /**
     * huntAfterCoverage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntAfterCoverage() {
        return huntAfterCoverage;
    }

    /**
     * huntAfterCoverage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntAfterCoverage(String value) {
        this.huntAfterCoverage = value;
    }

    /**
     * insideActive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideActive() {
        return insideActive;
    }

    /**
     * insideActive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideActive(String value) {
        this.insideActive = value;
    }

    /**
     * insideBusy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideBusy() {
        return insideBusy;
    }

    /**
     * insideBusy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideBusy(String value) {
        this.insideBusy = value;
    }

    /**
     * insideDontAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideDontAnswer() {
        return insideDontAnswer;
    }

    /**
     * insideDontAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideDontAnswer(String value) {
        this.insideDontAnswer = value;
    }

    /**
     * insideAll 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideAll() {
        return insideAll;
    }

    /**
     * insideAll 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideAll(String value) {
        this.insideAll = value;
    }

    /**
     * insideDNDSACGotoCover 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideDNDSACGotoCover() {
        return insideDNDSACGotoCover;
    }

    /**
     * insideDNDSACGotoCover 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideDNDSACGotoCover(String value) {
        this.insideDNDSACGotoCover = value;
    }

    /**
     * insideHolidayCoverage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideHolidayCoverage() {
        return insideHolidayCoverage;
    }

    /**
     * insideHolidayCoverage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideHolidayCoverage(String value) {
        this.insideHolidayCoverage = value;
    }

    /**
     * outsideActive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideActive() {
        return outsideActive;
    }

    /**
     * outsideActive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideActive(String value) {
        this.outsideActive = value;
    }

    /**
     * outsideBusy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideBusy() {
        return outsideBusy;
    }

    /**
     * outsideBusy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideBusy(String value) {
        this.outsideBusy = value;
    }

    /**
     * outsideDontAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideDontAnswer() {
        return outsideDontAnswer;
    }

    /**
     * outsideDontAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideDontAnswer(String value) {
        this.outsideDontAnswer = value;
    }

    /**
     * outsideAll 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideAll() {
        return outsideAll;
    }

    /**
     * outsideAll 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideAll(String value) {
        this.outsideAll = value;
    }

    /**
     * outsideDNDSACGotoCover 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideDNDSACGotoCover() {
        return outsideDNDSACGotoCover;
    }

    /**
     * outsideDNDSACGotoCover 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideDNDSACGotoCover(String value) {
        this.outsideDNDSACGotoCover = value;
    }

    /**
     * outsideHolidayCoverage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideHolidayCoverage() {
        return outsideHolidayCoverage;
    }

    /**
     * outsideHolidayCoverage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideHolidayCoverage(String value) {
        this.outsideHolidayCoverage = value;
    }

    /**
     * numberOfRings 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfRings() {
        return numberOfRings;
    }

    /**
     * numberOfRings 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRings(String value) {
        this.numberOfRings = value;
    }

    /**
     * holidayTable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayTable() {
        return holidayTable;
    }

    /**
     * holidayTable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayTable(String value) {
        this.holidayTable = value;
    }

    /**
     * terminateToCoveragePtsWithBridgedAppearances 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminateToCoveragePtsWithBridgedAppearances() {
        return terminateToCoveragePtsWithBridgedAppearances;
    }

    /**
     * terminateToCoveragePtsWithBridgedAppearances 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminateToCoveragePtsWithBridgedAppearances(String value) {
        this.terminateToCoveragePtsWithBridgedAppearances = value;
    }

    /**
     * point1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint1() {
        return point1;
    }

    /**
     * point1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint1(String value) {
        this.point1 = value;
    }

    /**
     * point2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint2() {
        return point2;
    }

    /**
     * point2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint2(String value) {
        this.point2 = value;
    }

    /**
     * point3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint3() {
        return point3;
    }

    /**
     * point3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint3(String value) {
        this.point3 = value;
    }

    /**
     * point4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint4() {
        return point4;
    }

    /**
     * point4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint4(String value) {
        this.point4 = value;
    }

    /**
     * point5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint5() {
        return point5;
    }

    /**
     * point5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint5(String value) {
        this.point5 = value;
    }

    /**
     * point6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint6() {
        return point6;
    }

    /**
     * point6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint6(String value) {
        this.point6 = value;
    }

    /**
     * rings1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings1() {
        return rings1;
    }

    /**
     * rings1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings1(String value) {
        this.rings1 = value;
    }

    /**
     * rings2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings2() {
        return rings2;
    }

    /**
     * rings2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings2(String value) {
        this.rings2 = value;
    }

    /**
     * rings3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings3() {
        return rings3;
    }

    /**
     * rings3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings3(String value) {
        this.rings3 = value;
    }

    /**
     * rings4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings4() {
        return rings4;
    }

    /**
     * rings4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings4(String value) {
        this.rings4 = value;
    }

    /**
     * rings5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings5() {
        return rings5;
    }

    /**
     * rings5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings5(String value) {
        this.rings5 = value;
    }

    /**
     * rings6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings6() {
        return rings6;
    }

    /**
     * rings6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings6(String value) {
        this.rings6 = value;
    }

    /**
     * Gets the value of the linkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLinkage() {
        if (linkage == null) {
            linkage = new ArrayList<ArrayType>();
        }
        return this.linkage;
    }

}
