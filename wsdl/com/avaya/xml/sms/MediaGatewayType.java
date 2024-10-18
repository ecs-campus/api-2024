
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MediaGatewayType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MediaGatewayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serial_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Controller_Ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Registered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recovery_Rule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fw_Vintage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hw_Vintage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Encrypt_Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site_Data_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Survivable_Ip_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}MediaGatewayArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaGatewayType", propOrder = {
    "number",
    "type",
    "name",
    "serialNumber",
    "ip",
    "controllerIp",
    "networkRegion",
    "registered",
    "recoveryRule",
    "fwVintage",
    "hwVintage",
    "encryptLink",
    "location",
    "mac",
    "siteData",
    "siteData2",
    "maxSurvivableIpExt",
    "slot",
    "boardModuleType",
    "boardModuleType1",
    "boardModuleType2",
    "boardModuleName",
    "boardModuleType3",
    "boardModuleType4",
    "dspType",
    "fwhw",
    "version",
    "boardModuleType5",
    "boardModuleType6"
})
public class MediaGatewayType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Serial_Number")
    protected String serialNumber;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "Controller_Ip")
    protected String controllerIp;
    @XmlElement(name = "Network_Region")
    protected String networkRegion;
    @XmlElement(name = "Registered")
    protected String registered;
    @XmlElement(name = "Recovery_Rule")
    protected String recoveryRule;
    @XmlElement(name = "Fw_Vintage")
    protected String fwVintage;
    @XmlElement(name = "Hw_Vintage")
    protected String hwVintage;
    @XmlElement(name = "Encrypt_Link")
    protected String encryptLink;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "Site_Data")
    protected String siteData;
    @XmlElement(name = "Site_Data_2")
    protected String siteData2;
    @XmlElement(name = "Max_Survivable_Ip_Ext")
    protected String maxSurvivableIpExt;
    @XmlElement(name = "Slot")
    protected List<ArrayType> slot;
    @XmlElement(name = "Board_Module_Type")
    protected List<ArrayType> boardModuleType;
    @XmlElement(name = "Board_Module_Type1")
    protected List<ArrayType> boardModuleType1;
    @XmlElement(name = "Board_Module_Type2")
    protected List<ArrayType> boardModuleType2;
    @XmlElement(name = "Board_Module_Name")
    protected List<ArrayType> boardModuleName;
    @XmlElement(name = "Board_Module_Type3")
    protected List<ArrayType> boardModuleType3;
    @XmlElement(name = "Board_Module_Type4")
    protected List<ArrayType> boardModuleType4;
    @XmlElement(name = "DSP_Type")
    protected List<ArrayType> dspType;
    @XmlElement(name = "FW_HW")
    protected List<ArrayType> fwhw;
    @XmlElement(name = "Version")
    protected List<ArrayType> version;
    @XmlElement(name = "Board_Module_Type5")
    protected List<ArrayType> boardModuleType5;
    @XmlElement(name = "Board_Module_Type6")
    protected List<ArrayType> boardModuleType6;

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
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * serialNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * serialNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * ip 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * ip 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

    /**
     * controllerIp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerIp() {
        return controllerIp;
    }

    /**
     * controllerIp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerIp(String value) {
        this.controllerIp = value;
    }

    /**
     * networkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkRegion() {
        return networkRegion;
    }

    /**
     * networkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkRegion(String value) {
        this.networkRegion = value;
    }

    /**
     * registered 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistered() {
        return registered;
    }

    /**
     * registered 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistered(String value) {
        this.registered = value;
    }

    /**
     * recoveryRule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoveryRule() {
        return recoveryRule;
    }

    /**
     * recoveryRule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoveryRule(String value) {
        this.recoveryRule = value;
    }

    /**
     * fwVintage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwVintage() {
        return fwVintage;
    }

    /**
     * fwVintage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwVintage(String value) {
        this.fwVintage = value;
    }

    /**
     * hwVintage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHwVintage() {
        return hwVintage;
    }

    /**
     * hwVintage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHwVintage(String value) {
        this.hwVintage = value;
    }

    /**
     * encryptLink 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptLink() {
        return encryptLink;
    }

    /**
     * encryptLink 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptLink(String value) {
        this.encryptLink = value;
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
     * mac 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * mac 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

    /**
     * siteData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteData() {
        return siteData;
    }

    /**
     * siteData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteData(String value) {
        this.siteData = value;
    }

    /**
     * siteData2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteData2() {
        return siteData2;
    }

    /**
     * siteData2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteData2(String value) {
        this.siteData2 = value;
    }

    /**
     * maxSurvivableIpExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSurvivableIpExt() {
        return maxSurvivableIpExt;
    }

    /**
     * maxSurvivableIpExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSurvivableIpExt(String value) {
        this.maxSurvivableIpExt = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSlot() {
        if (slot == null) {
            slot = new ArrayList<ArrayType>();
        }
        return this.slot;
    }

    /**
     * Gets the value of the boardModuleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardModuleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardModuleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBoardModuleType() {
        if (boardModuleType == null) {
            boardModuleType = new ArrayList<ArrayType>();
        }
        return this.boardModuleType;
    }

    /**
     * Gets the value of the boardModuleType1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardModuleType1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardModuleType1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBoardModuleType1() {
        if (boardModuleType1 == null) {
            boardModuleType1 = new ArrayList<ArrayType>();
        }
        return this.boardModuleType1;
    }

    /**
     * Gets the value of the boardModuleType2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardModuleType2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardModuleType2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBoardModuleType2() {
        if (boardModuleType2 == null) {
            boardModuleType2 = new ArrayList<ArrayType>();
        }
        return this.boardModuleType2;
    }

    /**
     * Gets the value of the boardModuleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardModuleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardModuleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBoardModuleName() {
        if (boardModuleName == null) {
            boardModuleName = new ArrayList<ArrayType>();
        }
        return this.boardModuleName;
    }

    /**
     * Gets the value of the boardModuleType3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardModuleType3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardModuleType3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBoardModuleType3() {
        if (boardModuleType3 == null) {
            boardModuleType3 = new ArrayList<ArrayType>();
        }
        return this.boardModuleType3;
    }

    /**
     * Gets the value of the boardModuleType4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardModuleType4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardModuleType4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBoardModuleType4() {
        if (boardModuleType4 == null) {
            boardModuleType4 = new ArrayList<ArrayType>();
        }
        return this.boardModuleType4;
    }

    /**
     * Gets the value of the dspType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dspType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSPType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDSPType() {
        if (dspType == null) {
            dspType = new ArrayList<ArrayType>();
        }
        return this.dspType;
    }

    /**
     * Gets the value of the fwhw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fwhw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFWHW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFWHW() {
        if (fwhw == null) {
            fwhw = new ArrayList<ArrayType>();
        }
        return this.fwhw;
    }

    /**
     * Gets the value of the version property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the version property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVersion() {
        if (version == null) {
            version = new ArrayList<ArrayType>();
        }
        return this.version;
    }

    /**
     * Gets the value of the boardModuleType5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardModuleType5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardModuleType5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBoardModuleType5() {
        if (boardModuleType5 == null) {
            boardModuleType5 = new ArrayList<ArrayType>();
        }
        return this.boardModuleType5;
    }

    /**
     * Gets the value of the boardModuleType6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardModuleType6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardModuleType6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBoardModuleType6() {
        if (boardModuleType6 == null) {
            boardModuleType6 = new ArrayList<ArrayType>();
        }
        return this.boardModuleType6;
    }

}
