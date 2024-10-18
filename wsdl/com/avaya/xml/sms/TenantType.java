
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TenantType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TenantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tenant_Partition_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenant_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External_Alert_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External_Alert_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Music_Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Night_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audible_Alert_Internal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audible_Alert_External" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audible_Alert_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Vectoring_VDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}TenantArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenantType", propOrder = {
    "tenantPartitionNumber",
    "tenantDescription",
    "attendantGroup",
    "externalAlertPort",
    "externalAlertExtension",
    "musicSource",
    "nightExtension",
    "audibleAlertInternal",
    "audibleAlertExternal",
    "audibleAlertPriority",
    "cos",
    "attendantVectoringVDN",
    "permission"
})
public class TenantType {

    @XmlElement(name = "Tenant_Partition_Number")
    protected String tenantPartitionNumber;
    @XmlElement(name = "Tenant_Description")
    protected String tenantDescription;
    @XmlElement(name = "Attendant_Group")
    protected String attendantGroup;
    @XmlElement(name = "External_Alert_Port")
    protected String externalAlertPort;
    @XmlElement(name = "External_Alert_Extension")
    protected String externalAlertExtension;
    @XmlElement(name = "Music_Source")
    protected String musicSource;
    @XmlElement(name = "Night_Extension")
    protected String nightExtension;
    @XmlElement(name = "Audible_Alert_Internal")
    protected String audibleAlertInternal;
    @XmlElement(name = "Audible_Alert_External")
    protected String audibleAlertExternal;
    @XmlElement(name = "Audible_Alert_Priority")
    protected String audibleAlertPriority;
    @XmlElement(name = "COS")
    protected String cos;
    @XmlElement(name = "Attendant_Vectoring_VDN")
    protected String attendantVectoringVDN;
    @XmlElement(name = "Permission")
    protected List<ArrayType> permission;

    /**
     * tenantPartitionNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantPartitionNumber() {
        return tenantPartitionNumber;
    }

    /**
     * tenantPartitionNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantPartitionNumber(String value) {
        this.tenantPartitionNumber = value;
    }

    /**
     * tenantDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantDescription() {
        return tenantDescription;
    }

    /**
     * tenantDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantDescription(String value) {
        this.tenantDescription = value;
    }

    /**
     * attendantGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantGroup() {
        return attendantGroup;
    }

    /**
     * attendantGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantGroup(String value) {
        this.attendantGroup = value;
    }

    /**
     * externalAlertPort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAlertPort() {
        return externalAlertPort;
    }

    /**
     * externalAlertPort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAlertPort(String value) {
        this.externalAlertPort = value;
    }

    /**
     * externalAlertExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAlertExtension() {
        return externalAlertExtension;
    }

    /**
     * externalAlertExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAlertExtension(String value) {
        this.externalAlertExtension = value;
    }

    /**
     * musicSource 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicSource() {
        return musicSource;
    }

    /**
     * musicSource 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicSource(String value) {
        this.musicSource = value;
    }

    /**
     * nightExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNightExtension() {
        return nightExtension;
    }

    /**
     * nightExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNightExtension(String value) {
        this.nightExtension = value;
    }

    /**
     * audibleAlertInternal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleAlertInternal() {
        return audibleAlertInternal;
    }

    /**
     * audibleAlertInternal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleAlertInternal(String value) {
        this.audibleAlertInternal = value;
    }

    /**
     * audibleAlertExternal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleAlertExternal() {
        return audibleAlertExternal;
    }

    /**
     * audibleAlertExternal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleAlertExternal(String value) {
        this.audibleAlertExternal = value;
    }

    /**
     * audibleAlertPriority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleAlertPriority() {
        return audibleAlertPriority;
    }

    /**
     * audibleAlertPriority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleAlertPriority(String value) {
        this.audibleAlertPriority = value;
    }

    /**
     * cos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOS() {
        return cos;
    }

    /**
     * cos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOS(String value) {
        this.cos = value;
    }

    /**
     * attendantVectoringVDN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantVectoringVDN() {
        return attendantVectoringVDN;
    }

    /**
     * attendantVectoringVDN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantVectoringVDN(String value) {
        this.attendantVectoringVDN = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPermission() {
        if (permission == null) {
            permission = new ArrayList<ArrayType>();
        }
        return this.permission;
    }

}
