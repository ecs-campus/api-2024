
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RegisteredIPStationsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RegisteredIPStationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Orig_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredIPStationsType", propOrder = {
    "stationExtension",
    "setType",
    "productID",
    "productRel",
    "stationIPAddress",
    "networkRegion",
    "gatekeeperIPAddress",
    "tcpSkt",
    "origPort",
    "shared1StationExtension",
    "shared1SetType",
    "shared1ProductID",
    "shared1ProductRel",
    "shared1StationIPAddress",
    "shared1NetworkRegion",
    "shared1GatekeeperIPAddress",
    "shared1TCPSkt",
    "shared2StationExtension",
    "shared2SetType",
    "shared2ProductID",
    "shared2ProductRel",
    "shared2StationIPAddress",
    "shared2NetworkRegion",
    "shared2GatekeeperIPAddress",
    "shared2TCPSkt",
    "shared3StationExtension",
    "shared3SetType",
    "shared3ProductID",
    "shared3ProductRel",
    "shared3StationIPAddress",
    "shared3NetworkRegion",
    "shared3GatekeeperIPAddress",
    "shared3TCPSkt",
    "shared4StationExtension",
    "shared4SetType",
    "shared4ProductID",
    "shared4ProductRel",
    "shared4StationIPAddress",
    "shared4NetworkRegion",
    "shared4GatekeeperIPAddress",
    "shared4TCPSkt",
    "shared5StationExtension",
    "shared5SetType",
    "shared5ProductID",
    "shared5ProductRel",
    "shared5StationIPAddress",
    "shared5NetworkRegion",
    "shared5GatekeeperIPAddress",
    "shared5TCPSkt",
    "shared6StationExtension",
    "shared6SetType",
    "shared6ProductID",
    "shared6ProductRel",
    "shared6StationIPAddress",
    "shared6NetworkRegion",
    "shared6GatekeeperIPAddress",
    "shared6TCPSkt",
    "shared7StationExtension",
    "shared7SetType",
    "shared7ProductID",
    "shared7ProductRel",
    "shared7StationIPAddress",
    "shared7NetworkRegion",
    "shared7GatekeeperIPAddress",
    "shared7TCPSkt",
    "shared8StationExtension",
    "shared8SetType",
    "shared8ProductID",
    "shared8ProductRel",
    "shared8StationIPAddress",
    "shared8NetworkRegion",
    "shared8GatekeeperIPAddress",
    "shared8TCPSkt",
    "shared9StationExtension",
    "shared9SetType",
    "shared9ProductID",
    "shared9ProductRel",
    "shared9StationIPAddress",
    "shared9NetworkRegion",
    "shared9GatekeeperIPAddress",
    "shared9TCPSkt",
    "shared10StationExtension",
    "shared10SetType",
    "shared10ProductID",
    "shared10ProductRel",
    "shared10StationIPAddress",
    "shared10NetworkRegion",
    "shared10GatekeeperIPAddress",
    "shared10TCPSkt",
    "shared11StationExtension",
    "shared11SetType",
    "shared11ProductID",
    "shared11ProductRel",
    "shared11StationIPAddress",
    "shared11NetworkRegion",
    "shared11GatekeeperIPAddress",
    "shared11TCPSkt",
    "shared12StationExtension",
    "shared12SetType",
    "shared12ProductID",
    "shared12ProductRel",
    "shared12StationIPAddress",
    "shared12NetworkRegion",
    "shared12GatekeeperIPAddress",
    "shared12TCPSkt"
})
public class RegisteredIPStationsType {

    @XmlElement(name = "Station_Extension")
    protected String stationExtension;
    @XmlElement(name = "Set_Type")
    protected String setType;
    @XmlElement(name = "Product_ID")
    protected String productID;
    @XmlElement(name = "Product_Rel")
    protected String productRel;
    @XmlElement(name = "Station_IP_Address")
    protected String stationIPAddress;
    @XmlElement(name = "Network_Region")
    protected String networkRegion;
    @XmlElement(name = "Gatekeeper_IP_Address")
    protected String gatekeeperIPAddress;
    @XmlElement(name = "TCP_Skt")
    protected String tcpSkt;
    @XmlElement(name = "Orig_Port")
    protected String origPort;
    @XmlElement(name = "Shared_1_Station_Extension")
    protected String shared1StationExtension;
    @XmlElement(name = "Shared_1_Set_Type")
    protected String shared1SetType;
    @XmlElement(name = "Shared_1_Product_ID")
    protected String shared1ProductID;
    @XmlElement(name = "Shared_1_Product_Rel")
    protected String shared1ProductRel;
    @XmlElement(name = "Shared_1_Station_IP_Address")
    protected String shared1StationIPAddress;
    @XmlElement(name = "Shared_1_Network_Region")
    protected String shared1NetworkRegion;
    @XmlElement(name = "Shared_1_Gatekeeper_IP_Address")
    protected String shared1GatekeeperIPAddress;
    @XmlElement(name = "Shared_1_TCP_Skt")
    protected String shared1TCPSkt;
    @XmlElement(name = "Shared_2_Station_Extension")
    protected String shared2StationExtension;
    @XmlElement(name = "Shared_2_Set_Type")
    protected String shared2SetType;
    @XmlElement(name = "Shared_2_Product_ID")
    protected String shared2ProductID;
    @XmlElement(name = "Shared_2_Product_Rel")
    protected String shared2ProductRel;
    @XmlElement(name = "Shared_2_Station_IP_Address")
    protected String shared2StationIPAddress;
    @XmlElement(name = "Shared_2_Network_Region")
    protected String shared2NetworkRegion;
    @XmlElement(name = "Shared_2_Gatekeeper_IP_Address")
    protected String shared2GatekeeperIPAddress;
    @XmlElement(name = "Shared_2_TCP_Skt")
    protected String shared2TCPSkt;
    @XmlElement(name = "Shared_3_Station_Extension")
    protected String shared3StationExtension;
    @XmlElement(name = "Shared_3_Set_Type")
    protected String shared3SetType;
    @XmlElement(name = "Shared_3_Product_ID")
    protected String shared3ProductID;
    @XmlElement(name = "Shared_3_Product_Rel")
    protected String shared3ProductRel;
    @XmlElement(name = "Shared_3_Station_IP_Address")
    protected String shared3StationIPAddress;
    @XmlElement(name = "Shared_3_Network_Region")
    protected String shared3NetworkRegion;
    @XmlElement(name = "Shared_3_Gatekeeper_IP_Address")
    protected String shared3GatekeeperIPAddress;
    @XmlElement(name = "Shared_3_TCP_Skt")
    protected String shared3TCPSkt;
    @XmlElement(name = "Shared_4_Station_Extension")
    protected String shared4StationExtension;
    @XmlElement(name = "Shared_4_Set_Type")
    protected String shared4SetType;
    @XmlElement(name = "Shared_4_Product_ID")
    protected String shared4ProductID;
    @XmlElement(name = "Shared_4_Product_Rel")
    protected String shared4ProductRel;
    @XmlElement(name = "Shared_4_Station_IP_Address")
    protected String shared4StationIPAddress;
    @XmlElement(name = "Shared_4_Network_Region")
    protected String shared4NetworkRegion;
    @XmlElement(name = "Shared_4_Gatekeeper_IP_Address")
    protected String shared4GatekeeperIPAddress;
    @XmlElement(name = "Shared_4_TCP_Skt")
    protected String shared4TCPSkt;
    @XmlElement(name = "Shared_5_Station_Extension")
    protected String shared5StationExtension;
    @XmlElement(name = "Shared_5_Set_Type")
    protected String shared5SetType;
    @XmlElement(name = "Shared_5_Product_ID")
    protected String shared5ProductID;
    @XmlElement(name = "Shared_5_Product_Rel")
    protected String shared5ProductRel;
    @XmlElement(name = "Shared_5_Station_IP_Address")
    protected String shared5StationIPAddress;
    @XmlElement(name = "Shared_5_Network_Region")
    protected String shared5NetworkRegion;
    @XmlElement(name = "Shared_5_Gatekeeper_IP_Address")
    protected String shared5GatekeeperIPAddress;
    @XmlElement(name = "Shared_5_TCP_Skt")
    protected String shared5TCPSkt;
    @XmlElement(name = "Shared_6_Station_Extension")
    protected String shared6StationExtension;
    @XmlElement(name = "Shared_6_Set_Type")
    protected String shared6SetType;
    @XmlElement(name = "Shared_6_Product_ID")
    protected String shared6ProductID;
    @XmlElement(name = "Shared_6_Product_Rel")
    protected String shared6ProductRel;
    @XmlElement(name = "Shared_6_Station_IP_Address")
    protected String shared6StationIPAddress;
    @XmlElement(name = "Shared_6_Network_Region")
    protected String shared6NetworkRegion;
    @XmlElement(name = "Shared_6_Gatekeeper_IP_Address")
    protected String shared6GatekeeperIPAddress;
    @XmlElement(name = "Shared_6_TCP_Skt")
    protected String shared6TCPSkt;
    @XmlElement(name = "Shared_7_Station_Extension")
    protected String shared7StationExtension;
    @XmlElement(name = "Shared_7_Set_Type")
    protected String shared7SetType;
    @XmlElement(name = "Shared_7_Product_ID")
    protected String shared7ProductID;
    @XmlElement(name = "Shared_7_Product_Rel")
    protected String shared7ProductRel;
    @XmlElement(name = "Shared_7_Station_IP_Address")
    protected String shared7StationIPAddress;
    @XmlElement(name = "Shared_7_Network_Region")
    protected String shared7NetworkRegion;
    @XmlElement(name = "Shared_7_Gatekeeper_IP_Address")
    protected String shared7GatekeeperIPAddress;
    @XmlElement(name = "Shared_7_TCP_Skt")
    protected String shared7TCPSkt;
    @XmlElement(name = "Shared_8_Station_Extension")
    protected String shared8StationExtension;
    @XmlElement(name = "Shared_8_Set_Type")
    protected String shared8SetType;
    @XmlElement(name = "Shared_8_Product_ID")
    protected String shared8ProductID;
    @XmlElement(name = "Shared_8_Product_Rel")
    protected String shared8ProductRel;
    @XmlElement(name = "Shared_8_Station_IP_Address")
    protected String shared8StationIPAddress;
    @XmlElement(name = "Shared_8_Network_Region")
    protected String shared8NetworkRegion;
    @XmlElement(name = "Shared_8_Gatekeeper_IP_Address")
    protected String shared8GatekeeperIPAddress;
    @XmlElement(name = "Shared_8_TCP_Skt")
    protected String shared8TCPSkt;
    @XmlElement(name = "Shared_9_Station_Extension")
    protected String shared9StationExtension;
    @XmlElement(name = "Shared_9_Set_Type")
    protected String shared9SetType;
    @XmlElement(name = "Shared_9_Product_ID")
    protected String shared9ProductID;
    @XmlElement(name = "Shared_9_Product_Rel")
    protected String shared9ProductRel;
    @XmlElement(name = "Shared_9_Station_IP_Address")
    protected String shared9StationIPAddress;
    @XmlElement(name = "Shared_9_Network_Region")
    protected String shared9NetworkRegion;
    @XmlElement(name = "Shared_9_Gatekeeper_IP_Address")
    protected String shared9GatekeeperIPAddress;
    @XmlElement(name = "Shared_9_TCP_Skt")
    protected String shared9TCPSkt;
    @XmlElement(name = "Shared_10_Station_Extension")
    protected String shared10StationExtension;
    @XmlElement(name = "Shared_10_Set_Type")
    protected String shared10SetType;
    @XmlElement(name = "Shared_10_Product_ID")
    protected String shared10ProductID;
    @XmlElement(name = "Shared_10_Product_Rel")
    protected String shared10ProductRel;
    @XmlElement(name = "Shared_10_Station_IP_Address")
    protected String shared10StationIPAddress;
    @XmlElement(name = "Shared_10_Network_Region")
    protected String shared10NetworkRegion;
    @XmlElement(name = "Shared_10_Gatekeeper_IP_Address")
    protected String shared10GatekeeperIPAddress;
    @XmlElement(name = "Shared_10_TCP_Skt")
    protected String shared10TCPSkt;
    @XmlElement(name = "Shared_11_Station_Extension")
    protected String shared11StationExtension;
    @XmlElement(name = "Shared_11_Set_Type")
    protected String shared11SetType;
    @XmlElement(name = "Shared_11_Product_ID")
    protected String shared11ProductID;
    @XmlElement(name = "Shared_11_Product_Rel")
    protected String shared11ProductRel;
    @XmlElement(name = "Shared_11_Station_IP_Address")
    protected String shared11StationIPAddress;
    @XmlElement(name = "Shared_11_Network_Region")
    protected String shared11NetworkRegion;
    @XmlElement(name = "Shared_11_Gatekeeper_IP_Address")
    protected String shared11GatekeeperIPAddress;
    @XmlElement(name = "Shared_11_TCP_Skt")
    protected String shared11TCPSkt;
    @XmlElement(name = "Shared_12_Station_Extension")
    protected String shared12StationExtension;
    @XmlElement(name = "Shared_12_Set_Type")
    protected String shared12SetType;
    @XmlElement(name = "Shared_12_Product_ID")
    protected String shared12ProductID;
    @XmlElement(name = "Shared_12_Product_Rel")
    protected String shared12ProductRel;
    @XmlElement(name = "Shared_12_Station_IP_Address")
    protected String shared12StationIPAddress;
    @XmlElement(name = "Shared_12_Network_Region")
    protected String shared12NetworkRegion;
    @XmlElement(name = "Shared_12_Gatekeeper_IP_Address")
    protected String shared12GatekeeperIPAddress;
    @XmlElement(name = "Shared_12_TCP_Skt")
    protected String shared12TCPSkt;

    /**
     * stationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationExtension() {
        return stationExtension;
    }

    /**
     * stationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationExtension(String value) {
        this.stationExtension = value;
    }

    /**
     * setType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetType() {
        return setType;
    }

    /**
     * setType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetType(String value) {
        this.setType = value;
    }

    /**
     * productID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * productID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * productRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRel() {
        return productRel;
    }

    /**
     * productRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRel(String value) {
        this.productRel = value;
    }

    /**
     * stationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationIPAddress() {
        return stationIPAddress;
    }

    /**
     * stationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationIPAddress(String value) {
        this.stationIPAddress = value;
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
     * gatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatekeeperIPAddress() {
        return gatekeeperIPAddress;
    }

    /**
     * gatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatekeeperIPAddress(String value) {
        this.gatekeeperIPAddress = value;
    }

    /**
     * tcpSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCPSkt() {
        return tcpSkt;
    }

    /**
     * tcpSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCPSkt(String value) {
        this.tcpSkt = value;
    }

    /**
     * origPort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigPort() {
        return origPort;
    }

    /**
     * origPort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigPort(String value) {
        this.origPort = value;
    }

    /**
     * shared1StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1StationExtension() {
        return shared1StationExtension;
    }

    /**
     * shared1StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1StationExtension(String value) {
        this.shared1StationExtension = value;
    }

    /**
     * shared1SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1SetType() {
        return shared1SetType;
    }

    /**
     * shared1SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1SetType(String value) {
        this.shared1SetType = value;
    }

    /**
     * shared1ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1ProductID() {
        return shared1ProductID;
    }

    /**
     * shared1ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1ProductID(String value) {
        this.shared1ProductID = value;
    }

    /**
     * shared1ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1ProductRel() {
        return shared1ProductRel;
    }

    /**
     * shared1ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1ProductRel(String value) {
        this.shared1ProductRel = value;
    }

    /**
     * shared1StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1StationIPAddress() {
        return shared1StationIPAddress;
    }

    /**
     * shared1StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1StationIPAddress(String value) {
        this.shared1StationIPAddress = value;
    }

    /**
     * shared1NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1NetworkRegion() {
        return shared1NetworkRegion;
    }

    /**
     * shared1NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1NetworkRegion(String value) {
        this.shared1NetworkRegion = value;
    }

    /**
     * shared1GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1GatekeeperIPAddress() {
        return shared1GatekeeperIPAddress;
    }

    /**
     * shared1GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1GatekeeperIPAddress(String value) {
        this.shared1GatekeeperIPAddress = value;
    }

    /**
     * shared1TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1TCPSkt() {
        return shared1TCPSkt;
    }

    /**
     * shared1TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1TCPSkt(String value) {
        this.shared1TCPSkt = value;
    }

    /**
     * shared2StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2StationExtension() {
        return shared2StationExtension;
    }

    /**
     * shared2StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2StationExtension(String value) {
        this.shared2StationExtension = value;
    }

    /**
     * shared2SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2SetType() {
        return shared2SetType;
    }

    /**
     * shared2SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2SetType(String value) {
        this.shared2SetType = value;
    }

    /**
     * shared2ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2ProductID() {
        return shared2ProductID;
    }

    /**
     * shared2ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2ProductID(String value) {
        this.shared2ProductID = value;
    }

    /**
     * shared2ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2ProductRel() {
        return shared2ProductRel;
    }

    /**
     * shared2ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2ProductRel(String value) {
        this.shared2ProductRel = value;
    }

    /**
     * shared2StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2StationIPAddress() {
        return shared2StationIPAddress;
    }

    /**
     * shared2StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2StationIPAddress(String value) {
        this.shared2StationIPAddress = value;
    }

    /**
     * shared2NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2NetworkRegion() {
        return shared2NetworkRegion;
    }

    /**
     * shared2NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2NetworkRegion(String value) {
        this.shared2NetworkRegion = value;
    }

    /**
     * shared2GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2GatekeeperIPAddress() {
        return shared2GatekeeperIPAddress;
    }

    /**
     * shared2GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2GatekeeperIPAddress(String value) {
        this.shared2GatekeeperIPAddress = value;
    }

    /**
     * shared2TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2TCPSkt() {
        return shared2TCPSkt;
    }

    /**
     * shared2TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2TCPSkt(String value) {
        this.shared2TCPSkt = value;
    }

    /**
     * shared3StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3StationExtension() {
        return shared3StationExtension;
    }

    /**
     * shared3StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3StationExtension(String value) {
        this.shared3StationExtension = value;
    }

    /**
     * shared3SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3SetType() {
        return shared3SetType;
    }

    /**
     * shared3SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3SetType(String value) {
        this.shared3SetType = value;
    }

    /**
     * shared3ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3ProductID() {
        return shared3ProductID;
    }

    /**
     * shared3ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3ProductID(String value) {
        this.shared3ProductID = value;
    }

    /**
     * shared3ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3ProductRel() {
        return shared3ProductRel;
    }

    /**
     * shared3ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3ProductRel(String value) {
        this.shared3ProductRel = value;
    }

    /**
     * shared3StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3StationIPAddress() {
        return shared3StationIPAddress;
    }

    /**
     * shared3StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3StationIPAddress(String value) {
        this.shared3StationIPAddress = value;
    }

    /**
     * shared3NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3NetworkRegion() {
        return shared3NetworkRegion;
    }

    /**
     * shared3NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3NetworkRegion(String value) {
        this.shared3NetworkRegion = value;
    }

    /**
     * shared3GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3GatekeeperIPAddress() {
        return shared3GatekeeperIPAddress;
    }

    /**
     * shared3GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3GatekeeperIPAddress(String value) {
        this.shared3GatekeeperIPAddress = value;
    }

    /**
     * shared3TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3TCPSkt() {
        return shared3TCPSkt;
    }

    /**
     * shared3TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3TCPSkt(String value) {
        this.shared3TCPSkt = value;
    }

    /**
     * shared4StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4StationExtension() {
        return shared4StationExtension;
    }

    /**
     * shared4StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4StationExtension(String value) {
        this.shared4StationExtension = value;
    }

    /**
     * shared4SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4SetType() {
        return shared4SetType;
    }

    /**
     * shared4SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4SetType(String value) {
        this.shared4SetType = value;
    }

    /**
     * shared4ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4ProductID() {
        return shared4ProductID;
    }

    /**
     * shared4ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4ProductID(String value) {
        this.shared4ProductID = value;
    }

    /**
     * shared4ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4ProductRel() {
        return shared4ProductRel;
    }

    /**
     * shared4ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4ProductRel(String value) {
        this.shared4ProductRel = value;
    }

    /**
     * shared4StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4StationIPAddress() {
        return shared4StationIPAddress;
    }

    /**
     * shared4StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4StationIPAddress(String value) {
        this.shared4StationIPAddress = value;
    }

    /**
     * shared4NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4NetworkRegion() {
        return shared4NetworkRegion;
    }

    /**
     * shared4NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4NetworkRegion(String value) {
        this.shared4NetworkRegion = value;
    }

    /**
     * shared4GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4GatekeeperIPAddress() {
        return shared4GatekeeperIPAddress;
    }

    /**
     * shared4GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4GatekeeperIPAddress(String value) {
        this.shared4GatekeeperIPAddress = value;
    }

    /**
     * shared4TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4TCPSkt() {
        return shared4TCPSkt;
    }

    /**
     * shared4TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4TCPSkt(String value) {
        this.shared4TCPSkt = value;
    }

    /**
     * shared5StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5StationExtension() {
        return shared5StationExtension;
    }

    /**
     * shared5StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5StationExtension(String value) {
        this.shared5StationExtension = value;
    }

    /**
     * shared5SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5SetType() {
        return shared5SetType;
    }

    /**
     * shared5SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5SetType(String value) {
        this.shared5SetType = value;
    }

    /**
     * shared5ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5ProductID() {
        return shared5ProductID;
    }

    /**
     * shared5ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5ProductID(String value) {
        this.shared5ProductID = value;
    }

    /**
     * shared5ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5ProductRel() {
        return shared5ProductRel;
    }

    /**
     * shared5ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5ProductRel(String value) {
        this.shared5ProductRel = value;
    }

    /**
     * shared5StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5StationIPAddress() {
        return shared5StationIPAddress;
    }

    /**
     * shared5StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5StationIPAddress(String value) {
        this.shared5StationIPAddress = value;
    }

    /**
     * shared5NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5NetworkRegion() {
        return shared5NetworkRegion;
    }

    /**
     * shared5NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5NetworkRegion(String value) {
        this.shared5NetworkRegion = value;
    }

    /**
     * shared5GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5GatekeeperIPAddress() {
        return shared5GatekeeperIPAddress;
    }

    /**
     * shared5GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5GatekeeperIPAddress(String value) {
        this.shared5GatekeeperIPAddress = value;
    }

    /**
     * shared5TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5TCPSkt() {
        return shared5TCPSkt;
    }

    /**
     * shared5TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5TCPSkt(String value) {
        this.shared5TCPSkt = value;
    }

    /**
     * shared6StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6StationExtension() {
        return shared6StationExtension;
    }

    /**
     * shared6StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6StationExtension(String value) {
        this.shared6StationExtension = value;
    }

    /**
     * shared6SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6SetType() {
        return shared6SetType;
    }

    /**
     * shared6SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6SetType(String value) {
        this.shared6SetType = value;
    }

    /**
     * shared6ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6ProductID() {
        return shared6ProductID;
    }

    /**
     * shared6ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6ProductID(String value) {
        this.shared6ProductID = value;
    }

    /**
     * shared6ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6ProductRel() {
        return shared6ProductRel;
    }

    /**
     * shared6ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6ProductRel(String value) {
        this.shared6ProductRel = value;
    }

    /**
     * shared6StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6StationIPAddress() {
        return shared6StationIPAddress;
    }

    /**
     * shared6StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6StationIPAddress(String value) {
        this.shared6StationIPAddress = value;
    }

    /**
     * shared6NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6NetworkRegion() {
        return shared6NetworkRegion;
    }

    /**
     * shared6NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6NetworkRegion(String value) {
        this.shared6NetworkRegion = value;
    }

    /**
     * shared6GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6GatekeeperIPAddress() {
        return shared6GatekeeperIPAddress;
    }

    /**
     * shared6GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6GatekeeperIPAddress(String value) {
        this.shared6GatekeeperIPAddress = value;
    }

    /**
     * shared6TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6TCPSkt() {
        return shared6TCPSkt;
    }

    /**
     * shared6TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6TCPSkt(String value) {
        this.shared6TCPSkt = value;
    }

    /**
     * shared7StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7StationExtension() {
        return shared7StationExtension;
    }

    /**
     * shared7StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7StationExtension(String value) {
        this.shared7StationExtension = value;
    }

    /**
     * shared7SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7SetType() {
        return shared7SetType;
    }

    /**
     * shared7SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7SetType(String value) {
        this.shared7SetType = value;
    }

    /**
     * shared7ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7ProductID() {
        return shared7ProductID;
    }

    /**
     * shared7ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7ProductID(String value) {
        this.shared7ProductID = value;
    }

    /**
     * shared7ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7ProductRel() {
        return shared7ProductRel;
    }

    /**
     * shared7ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7ProductRel(String value) {
        this.shared7ProductRel = value;
    }

    /**
     * shared7StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7StationIPAddress() {
        return shared7StationIPAddress;
    }

    /**
     * shared7StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7StationIPAddress(String value) {
        this.shared7StationIPAddress = value;
    }

    /**
     * shared7NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7NetworkRegion() {
        return shared7NetworkRegion;
    }

    /**
     * shared7NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7NetworkRegion(String value) {
        this.shared7NetworkRegion = value;
    }

    /**
     * shared7GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7GatekeeperIPAddress() {
        return shared7GatekeeperIPAddress;
    }

    /**
     * shared7GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7GatekeeperIPAddress(String value) {
        this.shared7GatekeeperIPAddress = value;
    }

    /**
     * shared7TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7TCPSkt() {
        return shared7TCPSkt;
    }

    /**
     * shared7TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7TCPSkt(String value) {
        this.shared7TCPSkt = value;
    }

    /**
     * shared8StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8StationExtension() {
        return shared8StationExtension;
    }

    /**
     * shared8StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8StationExtension(String value) {
        this.shared8StationExtension = value;
    }

    /**
     * shared8SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8SetType() {
        return shared8SetType;
    }

    /**
     * shared8SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8SetType(String value) {
        this.shared8SetType = value;
    }

    /**
     * shared8ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8ProductID() {
        return shared8ProductID;
    }

    /**
     * shared8ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8ProductID(String value) {
        this.shared8ProductID = value;
    }

    /**
     * shared8ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8ProductRel() {
        return shared8ProductRel;
    }

    /**
     * shared8ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8ProductRel(String value) {
        this.shared8ProductRel = value;
    }

    /**
     * shared8StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8StationIPAddress() {
        return shared8StationIPAddress;
    }

    /**
     * shared8StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8StationIPAddress(String value) {
        this.shared8StationIPAddress = value;
    }

    /**
     * shared8NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8NetworkRegion() {
        return shared8NetworkRegion;
    }

    /**
     * shared8NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8NetworkRegion(String value) {
        this.shared8NetworkRegion = value;
    }

    /**
     * shared8GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8GatekeeperIPAddress() {
        return shared8GatekeeperIPAddress;
    }

    /**
     * shared8GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8GatekeeperIPAddress(String value) {
        this.shared8GatekeeperIPAddress = value;
    }

    /**
     * shared8TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8TCPSkt() {
        return shared8TCPSkt;
    }

    /**
     * shared8TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8TCPSkt(String value) {
        this.shared8TCPSkt = value;
    }

    /**
     * shared9StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9StationExtension() {
        return shared9StationExtension;
    }

    /**
     * shared9StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9StationExtension(String value) {
        this.shared9StationExtension = value;
    }

    /**
     * shared9SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9SetType() {
        return shared9SetType;
    }

    /**
     * shared9SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9SetType(String value) {
        this.shared9SetType = value;
    }

    /**
     * shared9ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9ProductID() {
        return shared9ProductID;
    }

    /**
     * shared9ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9ProductID(String value) {
        this.shared9ProductID = value;
    }

    /**
     * shared9ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9ProductRel() {
        return shared9ProductRel;
    }

    /**
     * shared9ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9ProductRel(String value) {
        this.shared9ProductRel = value;
    }

    /**
     * shared9StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9StationIPAddress() {
        return shared9StationIPAddress;
    }

    /**
     * shared9StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9StationIPAddress(String value) {
        this.shared9StationIPAddress = value;
    }

    /**
     * shared9NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9NetworkRegion() {
        return shared9NetworkRegion;
    }

    /**
     * shared9NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9NetworkRegion(String value) {
        this.shared9NetworkRegion = value;
    }

    /**
     * shared9GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9GatekeeperIPAddress() {
        return shared9GatekeeperIPAddress;
    }

    /**
     * shared9GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9GatekeeperIPAddress(String value) {
        this.shared9GatekeeperIPAddress = value;
    }

    /**
     * shared9TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9TCPSkt() {
        return shared9TCPSkt;
    }

    /**
     * shared9TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9TCPSkt(String value) {
        this.shared9TCPSkt = value;
    }

    /**
     * shared10StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10StationExtension() {
        return shared10StationExtension;
    }

    /**
     * shared10StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10StationExtension(String value) {
        this.shared10StationExtension = value;
    }

    /**
     * shared10SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10SetType() {
        return shared10SetType;
    }

    /**
     * shared10SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10SetType(String value) {
        this.shared10SetType = value;
    }

    /**
     * shared10ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10ProductID() {
        return shared10ProductID;
    }

    /**
     * shared10ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10ProductID(String value) {
        this.shared10ProductID = value;
    }

    /**
     * shared10ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10ProductRel() {
        return shared10ProductRel;
    }

    /**
     * shared10ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10ProductRel(String value) {
        this.shared10ProductRel = value;
    }

    /**
     * shared10StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10StationIPAddress() {
        return shared10StationIPAddress;
    }

    /**
     * shared10StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10StationIPAddress(String value) {
        this.shared10StationIPAddress = value;
    }

    /**
     * shared10NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10NetworkRegion() {
        return shared10NetworkRegion;
    }

    /**
     * shared10NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10NetworkRegion(String value) {
        this.shared10NetworkRegion = value;
    }

    /**
     * shared10GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10GatekeeperIPAddress() {
        return shared10GatekeeperIPAddress;
    }

    /**
     * shared10GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10GatekeeperIPAddress(String value) {
        this.shared10GatekeeperIPAddress = value;
    }

    /**
     * shared10TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10TCPSkt() {
        return shared10TCPSkt;
    }

    /**
     * shared10TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10TCPSkt(String value) {
        this.shared10TCPSkt = value;
    }

    /**
     * shared11StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11StationExtension() {
        return shared11StationExtension;
    }

    /**
     * shared11StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11StationExtension(String value) {
        this.shared11StationExtension = value;
    }

    /**
     * shared11SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11SetType() {
        return shared11SetType;
    }

    /**
     * shared11SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11SetType(String value) {
        this.shared11SetType = value;
    }

    /**
     * shared11ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11ProductID() {
        return shared11ProductID;
    }

    /**
     * shared11ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11ProductID(String value) {
        this.shared11ProductID = value;
    }

    /**
     * shared11ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11ProductRel() {
        return shared11ProductRel;
    }

    /**
     * shared11ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11ProductRel(String value) {
        this.shared11ProductRel = value;
    }

    /**
     * shared11StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11StationIPAddress() {
        return shared11StationIPAddress;
    }

    /**
     * shared11StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11StationIPAddress(String value) {
        this.shared11StationIPAddress = value;
    }

    /**
     * shared11NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11NetworkRegion() {
        return shared11NetworkRegion;
    }

    /**
     * shared11NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11NetworkRegion(String value) {
        this.shared11NetworkRegion = value;
    }

    /**
     * shared11GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11GatekeeperIPAddress() {
        return shared11GatekeeperIPAddress;
    }

    /**
     * shared11GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11GatekeeperIPAddress(String value) {
        this.shared11GatekeeperIPAddress = value;
    }

    /**
     * shared11TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11TCPSkt() {
        return shared11TCPSkt;
    }

    /**
     * shared11TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11TCPSkt(String value) {
        this.shared11TCPSkt = value;
    }

    /**
     * shared12StationExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12StationExtension() {
        return shared12StationExtension;
    }

    /**
     * shared12StationExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12StationExtension(String value) {
        this.shared12StationExtension = value;
    }

    /**
     * shared12SetType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12SetType() {
        return shared12SetType;
    }

    /**
     * shared12SetType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12SetType(String value) {
        this.shared12SetType = value;
    }

    /**
     * shared12ProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12ProductID() {
        return shared12ProductID;
    }

    /**
     * shared12ProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12ProductID(String value) {
        this.shared12ProductID = value;
    }

    /**
     * shared12ProductRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12ProductRel() {
        return shared12ProductRel;
    }

    /**
     * shared12ProductRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12ProductRel(String value) {
        this.shared12ProductRel = value;
    }

    /**
     * shared12StationIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12StationIPAddress() {
        return shared12StationIPAddress;
    }

    /**
     * shared12StationIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12StationIPAddress(String value) {
        this.shared12StationIPAddress = value;
    }

    /**
     * shared12NetworkRegion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12NetworkRegion() {
        return shared12NetworkRegion;
    }

    /**
     * shared12NetworkRegion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12NetworkRegion(String value) {
        this.shared12NetworkRegion = value;
    }

    /**
     * shared12GatekeeperIPAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12GatekeeperIPAddress() {
        return shared12GatekeeperIPAddress;
    }

    /**
     * shared12GatekeeperIPAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12GatekeeperIPAddress(String value) {
        this.shared12GatekeeperIPAddress = value;
    }

    /**
     * shared12TCPSkt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12TCPSkt() {
        return shared12TCPSkt;
    }

    /**
     * shared12TCPSkt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12TCPSkt(String value) {
        this.shared12TCPSkt = value;
    }

}
