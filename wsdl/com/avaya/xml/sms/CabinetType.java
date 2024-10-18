
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CabinetType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CabinetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survivable_Remote_EPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survivable_Remote_Processor_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Port_Network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNC_Duplication_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}CabinetArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinetType", propOrder = {
    "number",
    "layout",
    "room",
    "rack",
    "floor",
    "building",
    "location",
    "ipNetworkRegion",
    "survivableRemoteEPN",
    "type",
    "survivableRemoteProcessorID",
    "numberPortNetwork",
    "pncDuplicationState",
    "state",
    "carrierID",
    "carrierType",
    "carrierNumberType",
    "carrierNumber",
    "carrierDuplicate",
    "carrierID2",
    "carrierType2",
    "carrierNumberType2",
    "carrierNumber2",
    "carrierID3",
    "carrierType3",
    "carrierNumberType3",
    "carrierNumber3",
    "carrierID4",
    "carrierType4"
})
public class CabinetType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Layout")
    protected String layout;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "Rack")
    protected String rack;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "IP_Network_Region")
    protected String ipNetworkRegion;
    @XmlElement(name = "Survivable_Remote_EPN")
    protected String survivableRemoteEPN;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Survivable_Remote_Processor_ID")
    protected String survivableRemoteProcessorID;
    @XmlElement(name = "Number_Port_Network")
    protected String numberPortNetwork;
    @XmlElement(name = "PNC_Duplication_State")
    protected String pncDuplicationState;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Carrier_ID")
    protected List<ArrayType> carrierID;
    @XmlElement(name = "Carrier_Type")
    protected List<ArrayType> carrierType;
    @XmlElement(name = "Carrier_Number_Type")
    protected List<ArrayType> carrierNumberType;
    @XmlElement(name = "Carrier_Number")
    protected List<ArrayType> carrierNumber;
    @XmlElement(name = "Carrier_Duplicate")
    protected List<ArrayType> carrierDuplicate;
    @XmlElement(name = "Carrier_ID_2")
    protected List<ArrayType> carrierID2;
    @XmlElement(name = "Carrier_Type_2")
    protected List<ArrayType> carrierType2;
    @XmlElement(name = "Carrier_Number_Type_2")
    protected List<ArrayType> carrierNumberType2;
    @XmlElement(name = "Carrier_Number_2")
    protected List<ArrayType> carrierNumber2;
    @XmlElement(name = "Carrier_ID_3")
    protected List<ArrayType> carrierID3;
    @XmlElement(name = "Carrier_Type_3")
    protected List<ArrayType> carrierType3;
    @XmlElement(name = "Carrier_Number_Type_3")
    protected List<ArrayType> carrierNumberType3;
    @XmlElement(name = "Carrier_Number_3")
    protected List<ArrayType> carrierNumber3;
    @XmlElement(name = "Carrier_ID_4")
    protected List<ArrayType> carrierID4;
    @XmlElement(name = "Carrier_Type_4")
    protected List<ArrayType> carrierType4;

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
     * layout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * layout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * room 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * room 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * rack 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRack() {
        return rack;
    }

    /**
     * rack 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRack(String value) {
        this.rack = value;
    }

    /**
     * floor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * floor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * building 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * building 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * location 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * location 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * ipNetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPNetworkRegion() {
        return ipNetworkRegion;
    }

    /**
     * ipNetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPNetworkRegion(String value) {
        this.ipNetworkRegion = value;
    }

    /**
     * survivableRemoteEPN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvivableRemoteEPN() {
        return survivableRemoteEPN;
    }

    /**
     * survivableRemoteEPN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvivableRemoteEPN(String value) {
        this.survivableRemoteEPN = value;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * survivableRemoteProcessorID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvivableRemoteProcessorID() {
        return survivableRemoteProcessorID;
    }

    /**
     * survivableRemoteProcessorID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvivableRemoteProcessorID(String value) {
        this.survivableRemoteProcessorID = value;
    }

    /**
     * numberPortNetwork 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPortNetwork() {
        return numberPortNetwork;
    }

    /**
     * numberPortNetwork 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPortNetwork(String value) {
        this.numberPortNetwork = value;
    }

    /**
     * pncDuplicationState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNCDuplicationState() {
        return pncDuplicationState;
    }

    /**
     * pncDuplicationState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNCDuplicationState(String value) {
        this.pncDuplicationState = value;
    }

    /**
     * state 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * state 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the carrierID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierID() {
        if (carrierID == null) {
            carrierID = new ArrayList<ArrayType>();
        }
        return this.carrierID;
    }

    /**
     * Gets the value of the carrierType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierType() {
        if (carrierType == null) {
            carrierType = new ArrayList<ArrayType>();
        }
        return this.carrierType;
    }

    /**
     * Gets the value of the carrierNumberType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierNumberType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierNumberType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierNumberType() {
        if (carrierNumberType == null) {
            carrierNumberType = new ArrayList<ArrayType>();
        }
        return this.carrierNumberType;
    }

    /**
     * Gets the value of the carrierNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierNumber() {
        if (carrierNumber == null) {
            carrierNumber = new ArrayList<ArrayType>();
        }
        return this.carrierNumber;
    }

    /**
     * Gets the value of the carrierDuplicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierDuplicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierDuplicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierDuplicate() {
        if (carrierDuplicate == null) {
            carrierDuplicate = new ArrayList<ArrayType>();
        }
        return this.carrierDuplicate;
    }

    /**
     * Gets the value of the carrierID2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierID2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierID2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierID2() {
        if (carrierID2 == null) {
            carrierID2 = new ArrayList<ArrayType>();
        }
        return this.carrierID2;
    }

    /**
     * Gets the value of the carrierType2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierType2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierType2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierType2() {
        if (carrierType2 == null) {
            carrierType2 = new ArrayList<ArrayType>();
        }
        return this.carrierType2;
    }

    /**
     * Gets the value of the carrierNumberType2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierNumberType2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierNumberType2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierNumberType2() {
        if (carrierNumberType2 == null) {
            carrierNumberType2 = new ArrayList<ArrayType>();
        }
        return this.carrierNumberType2;
    }

    /**
     * Gets the value of the carrierNumber2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierNumber2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierNumber2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierNumber2() {
        if (carrierNumber2 == null) {
            carrierNumber2 = new ArrayList<ArrayType>();
        }
        return this.carrierNumber2;
    }

    /**
     * Gets the value of the carrierID3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierID3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierID3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierID3() {
        if (carrierID3 == null) {
            carrierID3 = new ArrayList<ArrayType>();
        }
        return this.carrierID3;
    }

    /**
     * Gets the value of the carrierType3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierType3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierType3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierType3() {
        if (carrierType3 == null) {
            carrierType3 = new ArrayList<ArrayType>();
        }
        return this.carrierType3;
    }

    /**
     * Gets the value of the carrierNumberType3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierNumberType3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierNumberType3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierNumberType3() {
        if (carrierNumberType3 == null) {
            carrierNumberType3 = new ArrayList<ArrayType>();
        }
        return this.carrierNumberType3;
    }

    /**
     * Gets the value of the carrierNumber3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierNumber3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierNumber3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierNumber3() {
        if (carrierNumber3 == null) {
            carrierNumber3 = new ArrayList<ArrayType>();
        }
        return this.carrierNumber3;
    }

    /**
     * Gets the value of the carrierID4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierID4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierID4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierID4() {
        if (carrierID4 == null) {
            carrierID4 = new ArrayList<ArrayType>();
        }
        return this.carrierID4;
    }

    /**
     * Gets the value of the carrierType4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierType4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierType4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCarrierType4() {
        if (carrierType4 == null) {
            carrierType4 = new ArrayList<ArrayType>();
        }
        return this.carrierType4;
    }

}
