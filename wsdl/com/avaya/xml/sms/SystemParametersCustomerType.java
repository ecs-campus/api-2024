
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SystemParametersCustomerType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SystemParametersCustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="G3_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFA_Enterprise_System_ID_ESID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFA_System_ID_SID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFA_Module_ID_MID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_Maximum_Ports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_Maximum_Ports_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_Maximum_Ports_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_Maximum_Ports_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_XMOBILE_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_XMOBILE_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_XMOBILE_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_XMOBILE_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_EC500" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_EC500_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_EC500_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_EC500_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_OPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_OPS_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_OPS_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_OPS_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_SCCAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_SCCAN_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_SCCAN_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_SCCAN_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_H_323_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_H_323_Trunks_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_H_323_Trunks_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_H_323_Trunks_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_Remote_Office_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_Remote_Office_Trunks_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_Remote_Office_Trunks_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_Remote_Office_Trunks_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_Remote_Office_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_Remote_Office_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_Remote_Office_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_Remote_Office_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_ECons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_ECons_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_ECons_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_ECons_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Concur_Registered_Unauthenticated_H_323_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Concur_Registered_Unauthenticated_H_323_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Concur_Registered_Unauthenticated_H_323_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Concur_Registered_Unauthenticated_H_323_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_H_323_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_H_323_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_H_323_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_H_323_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_IP_Softphones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_IP_Softphones_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_IP_Softphones_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_IP_Softphones_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_SIP_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_SIP_Trunks_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_SIP_Trunks_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_SIP_Trunks_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2501_VAL_Boards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2501_VAL_Boards_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2501_VAL_Boards_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2501_VAL_Boards_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_G250_G350_G700_VAL_Sources" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_G250_G350_G700_VAL_Sources_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_G250_G350_G700_VAL_Sources_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_G250_G350_G700_VAL_Sources_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_80_VoIP_Channels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_80_VoIP_Channels_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_80_VoIP_Channels_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_80_VoIP_Channels_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_320_VoIP_Channels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_320_VoIP_Channels_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_320_VoIP_Channels_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_320_VoIP_Channels_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_Expanded_Meet_me_Conference_Ports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abbreviated_Dialing_Enhanced_List" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Access_Security_Gateway_ASG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Trunk_Incoming_Call_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A_D_Grp_Sys_List_Dialing_Start_At_01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answer_Supervision_by_Call_Classifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARS_AAR_Partitioning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARS_AAR_Dialing_Without_FAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Link_Core_Capabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Proprietary_Adjunct_Links" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Link_Plus_Capabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Async_Transfer_Mode_ATM_PNC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Async_Transfer_Mode_ATM_Trunking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATM_WAN_Spare_Processor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Vectoring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audible_Message_Waiting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authorization_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Backup_Cluster_Automatic_Takeover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAS_Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAS_Main" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Change_COR_by_FAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Computer_Telephony_Adjunct_Links" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cvg_Of_Calls_Redirected_Off_Net" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCS_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCS_Call_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCS_With_Rerouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCS_Global" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digital_Loss_Plan_Modification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_MSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Echo_Cancellation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emergency_Access_to_Attendant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enable_dadmin_Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enhanced_Conferencing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enhanced_EC500" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Survivable_Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Wide_Licensing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESS_Administration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extended_Cvg_Fwd_Admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External_Device_Alarm_Admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Five_Port_Networks_Max_Per_MCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flexible_Billing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forced_Entry_of_Account_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_Call_Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hospitality_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hospitality_G3V3_Enhancements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hospitality_Parameter_Reduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Attendant_Consoles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internet_Protocol_IP_PNC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_Feature_Plus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_Network_Call_Redirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_BRI_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_PRI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Survivable_Processor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Malicious_Call_Trace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Encryption_Over_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode_Code_For_Centralized_Voice_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode_Code_Interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multifrequency_Signaling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Appl_Server_Interface_MASI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Call_Handling_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Call_Handling_Enhanced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_IP_SIP_Trunking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multinational_Locations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Level_Precedence_And_Preemption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Locations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Personal_Station_Access" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_License_Mode_Disabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Posted_Messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNC_Duplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port_Network_Support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Premier_Business_Package" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Processor_And_System_MSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Private_Networking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Processor_Ethernet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R9_5_Capabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restrict_Call_Forward_Off_Net" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary_Data_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_And_Trunk_MSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_As_Virtual_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="System_Management_Data_Transfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenant_Partitioning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal_Trans_Init_TTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Of_Day_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Uniform_Dialing_Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage_Allocation_Enhancements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2501_VAL_Maximum_Capacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voice_Mail_Application_Support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wideband_Switching" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wireless" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Center_Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_VuStats_Service_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_Local_Treatment_For_IP_and_ISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Business_Advocate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Work_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTMF_Feedback_Signals_For_VRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Advocate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expert_Agent_Selection_EAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAS_PHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forced_ACD_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Least_Occupied_Agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lookahead_Interflow_LAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Call_Handling_On_Request" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Call_Handling_Forced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASTE_Display_PBX_Data_On_Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Level_Maximizer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Observing_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Observing_Remote_By_FAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Observing_VDNs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timed_ACW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Prompting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_G3V4_Enhanced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_3_0_Enhanced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_ANI_II_Digits_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_G3V4_Advanced_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_CINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Best_Service_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Holidays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Variables" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Of_Origin_Announcement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Return_Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VuStats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VuStats_G3V4_Enhanced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACD_Agents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACD_Agents_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACD_Agents_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACD_Agents_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocate_Agents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocate_Agents_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocate_Agents_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocate_Agents_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IP_Softphone_Agents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IP_Softphone_Agents_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IP_Softphone_Agents_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IP_Softphone_Agents_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Basic_Call_Setup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Basic_Supplementary_Services" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Centralized_Attendant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interworking_With_DCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supplementary_Services_with_Rerouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer_into_QSIG_Voice_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value_Added_VALU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adjunct_Call_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adjunct_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domain_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Notification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Request_Feature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Set_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answering_Machine_Detection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Selective_Listening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Switch_Classified_Outbound_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proprietary_Applications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTI_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Increased_Adjunct_Route_Capacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phantom_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agent_States" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}SystemParametersCustomerArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParametersCustomerType", propOrder = {
    "g3Version",
    "location",
    "platform",
    "rfaEnterpriseSystemIDESID",
    "rfaSystemIDSID",
    "rfaModuleIDMID",
    "platformMaximumPorts",
    "platformMaximumPortsUSED",
    "platformMaximumPortsLOW",
    "platformMaximumPortsHIGH",
    "maximumStations",
    "maximumStationsUSED",
    "maximumStationsLOW",
    "maximumStationsHIGH",
    "maximumXMOBILEStations",
    "maximumXMOBILEStationsUSED",
    "maximumXMOBILEStationsLOW",
    "maximumXMOBILEStationsHIGH",
    "maximumOffPBXTelephonesEC500",
    "maximumOffPBXTelephonesEC500USED",
    "maximumOffPBXTelephonesEC500LOW",
    "maximumOffPBXTelephonesEC500HIGH",
    "maximumOffPBXTelephonesOPS",
    "maximumOffPBXTelephonesOPSUSED",
    "maximumOffPBXTelephonesOPSLOW",
    "maximumOffPBXTelephonesOPSHIGH",
    "maximumOffPBXTelephonesSCCAN",
    "maximumOffPBXTelephonesSCCANUSED",
    "maximumOffPBXTelephonesSCCANLOW",
    "maximumOffPBXTelephonesSCCANHIGH",
    "maximumAdministeredH323Trunks",
    "maximumAdministeredH323TrunksUSED",
    "maximumAdministeredH323TrunksLOW",
    "maximumAdministeredH323TrunksHIGH",
    "maximumConcurrentlyRegisteredIPStations",
    "maximumConcurrentlyRegisteredIPStationsUSED",
    "maximumConcurrentlyRegisteredIPStationsLOW",
    "maximumConcurrentlyRegisteredIPStationsHIGH",
    "maximumAdministeredRemoteOfficeTrunks",
    "maximumAdministeredRemoteOfficeTrunksUSED",
    "maximumAdministeredRemoteOfficeTrunksLOW",
    "maximumAdministeredRemoteOfficeTrunksHIGH",
    "maximumConcurrentlyRegisteredRemoteOfficeStations",
    "maximumConcurrentlyRegisteredRemoteOfficeStationsUSED",
    "maximumConcurrentlyRegisteredRemoteOfficeStationsLOW",
    "maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH",
    "maximumConcurrentlyRegisteredIPECons",
    "maximumConcurrentlyRegisteredIPEConsUSED",
    "maximumConcurrentlyRegisteredIPEConsLOW",
    "maximumConcurrentlyRegisteredIPEConsHIGH",
    "maxConcurRegisteredUnauthenticatedH323Stations",
    "maxConcurRegisteredUnauthenticatedH323StationsUSED",
    "maxConcurRegisteredUnauthenticatedH323StationsLOW",
    "maxConcurRegisteredUnauthenticatedH323StationsHIGH",
    "maximumVideoCapableH323Stations",
    "maximumVideoCapableH323StationsUSED",
    "maximumVideoCapableH323StationsLOW",
    "maximumVideoCapableH323StationsHIGH",
    "maximumVideoCapableIPSoftphones",
    "maximumVideoCapableIPSoftphonesUSED",
    "maximumVideoCapableIPSoftphonesLOW",
    "maximumVideoCapableIPSoftphonesHIGH",
    "maximumAdministeredSIPTrunks",
    "maximumAdministeredSIPTrunksUSED",
    "maximumAdministeredSIPTrunksLOW",
    "maximumAdministeredSIPTrunksHIGH",
    "maximumNumberOfDS1BoardsWithEchoCancellation",
    "maximumNumberOfDS1BoardsWithEchoCancellationUSED",
    "maximumNumberOfDS1BoardsWithEchoCancellationLOW",
    "maximumNumberOfDS1BoardsWithEchoCancellationHIGH",
    "maximumTN2501VALBoards",
    "maximumTN2501VALBoardsUSED",
    "maximumTN2501VALBoardsLOW",
    "maximumTN2501VALBoardsHIGH",
    "maximumG250G350G700VALSources",
    "maximumG250G350G700VALSourcesUSED",
    "maximumG250G350G700VALSourcesLOW",
    "maximumG250G350G700VALSourcesHIGH",
    "maximumTN2602BoardsWith80VoIPChannels",
    "maximumTN2602BoardsWith80VoIPChannelsUSED",
    "maximumTN2602BoardsWith80VoIPChannelsLOW",
    "maximumTN2602BoardsWith80VoIPChannelsHIGH",
    "maximumTN2602BoardsWith320VoIPChannels",
    "maximumTN2602BoardsWith320VoIPChannelsUSED",
    "maximumTN2602BoardsWith320VoIPChannelsLOW",
    "maximumTN2602BoardsWith320VoIPChannelsHIGH",
    "maximumNumberOfExpandedMeetMeConferencePorts",
    "maximumNumberOfExpandedMeetMeConferencePortsUSED",
    "maximumNumberOfExpandedMeetMeConferencePortsLOW",
    "maximumNumberOfExpandedMeetMeConferencePortsHIGH",
    "abbreviatedDialingEnhancedList",
    "accessSecurityGatewayASG",
    "analogTrunkIncomingCallID",
    "adGrpSysListDialingStartAt01",
    "answerSupervisionByCallClassifier",
    "ars",
    "arsaarPartitioning",
    "arsaarDialingWithoutFAC",
    "asaiInterface",
    "asaiLinkCoreCapabilities",
    "asaiProprietaryAdjunctLinks",
    "asaiLinkPlusCapabilities",
    "asyncTransferModeATMPNC",
    "asyncTransferModeATMTrunking",
    "atmwanSpareProcessor",
    "atms",
    "attendantVectoring",
    "audibleMessageWaiting",
    "authorizationCodes",
    "backupClusterAutomaticTakeover",
    "casBranch",
    "casMain",
    "changeCORByFAC",
    "computerTelephonyAdjunctLinks",
    "cvgOfCallsRedirectedOffNet",
    "dcsBasic",
    "dcsCallCoverage",
    "dcsWithRerouting",
    "dcsGlobal",
    "digitalLossPlanModification",
    "ds1MSP",
    "ds1EchoCancellation",
    "emergencyAccessToAttendant",
    "enableDadminLogin",
    "enhancedConferencing",
    "enhancedEC500",
    "enterpriseSurvivableServer",
    "enterpriseWideLicensing",
    "essAdministration",
    "extendedCvgFwdAdmin",
    "externalDeviceAlarmAdmin",
    "fivePortNetworksMaxPerMCC",
    "flexibleBilling",
    "forcedEntryOfAccountCodes",
    "globalCallClassification",
    "hospitalityBasic",
    "hospitalityG3V3Enhancements",
    "hospitalityParameterReduction",
    "ipTrunks",
    "ipAttendantConsoles",
    "ipStations",
    "internetProtocolIPPNC",
    "isdnFeaturePlus",
    "isdnNetworkCallRedirection",
    "isdnbriTrunks",
    "isdnpri",
    "localSurvivableProcessor",
    "maliciousCallTrace",
    "mediaEncryptionOverIP",
    "modeCodeForCentralizedVoiceMail",
    "modeCodeInterface",
    "multifrequencySignaling",
    "multimediaApplServerInterfaceMASI",
    "multimediaCallHandlingBasic",
    "multimediaCallHandlingEnhanced",
    "multimediaIPSIPTrunking",
    "multinationalLocations",
    "multipleLevelPrecedenceAndPreemption",
    "multipleLocations",
    "personalStationAccess",
    "noLicenseModeDisabled",
    "postedMessages",
    "pncDuplication",
    "portNetworkSupport",
    "premierBusinessPackage",
    "processorAndSystemMSP",
    "privateNetworking",
    "processorEthernet",
    "r95Capabilities",
    "remoteOffice",
    "restrictCallForwardOffNet",
    "secondaryDataModule",
    "stationAndTrunkMSP",
    "stationAsVirtualExtension",
    "systemManagementDataTransfer",
    "tenantPartitioning",
    "terminalTransInitTTI",
    "timeOfDayRouting",
    "uniformDialingPlan",
    "usageAllocationEnhancements",
    "tn2501VALMaximumCapacity",
    "voiceMailApplicationSupport",
    "widebandSwitching",
    "wireless",
    "callCenterRelease",
    "acd",
    "bcmsBasic",
    "bcmsVuStatsServiceLevel",
    "bsrLocalTreatmentForIPAndISDN",
    "businessAdvocate",
    "callWorkCodes",
    "dtmfFeedbackSignalsForVRU",
    "dynamicAdvocate",
    "expertAgentSelectionEAS",
    "easphd",
    "forcedACDCalls",
    "leastOccupiedAgent",
    "lookaheadInterflowLAI",
    "multipleCallHandlingOnRequest",
    "multipleCallHandlingForced",
    "pasteDisplayPBXDataOnPhone",
    "reasonCodes",
    "serviceLevelMaximizer",
    "serviceObservingBasic",
    "serviceObservingRemoteByFAC",
    "serviceObservingVDNs",
    "timedACW",
    "vectoringBasic",
    "vectoringPrompting",
    "vectoringG3V4Enhanced",
    "vectoring30Enhanced",
    "vectoringANIIIDigitsRouting",
    "vectoringG3V4AdvancedRouting",
    "vectoringCINFO",
    "vectoringBestServiceRouting",
    "vectoringHolidays",
    "vectoringVariables",
    "vdnOfOriginAnnouncement",
    "vdnReturnDestination",
    "vuStats",
    "vuStatsG3V4Enhanced",
    "loggedInACDAgents",
    "loggedInACDAgentsUSED",
    "loggedInACDAgentsLOW",
    "loggedInACDAgentsHIGH",
    "loggedInAdvocateAgents",
    "loggedInAdvocateAgentsUSED",
    "loggedInAdvocateAgentsLOW",
    "loggedInAdvocateAgentsHIGH",
    "loggedInIPSoftphoneAgents",
    "loggedInIPSoftphoneAgentsUSED",
    "loggedInIPSoftphoneAgentsLOW",
    "loggedInIPSoftphoneAgentsHIGH",
    "basicCallSetup",
    "basicSupplementaryServices",
    "centralizedAttendant",
    "interworkingWithDCS",
    "supplementaryServicesWithRerouting",
    "transferIntoQSIGVoiceMail",
    "valueAddedVALU",
    "adjunctCallControl",
    "adjunctRouting",
    "domainControl",
    "eventNotification",
    "requestFeature",
    "setValue",
    "answeringMachineDetection",
    "selectiveListening",
    "switchClassifiedOutboundCalls",
    "proprietaryApplications",
    "ctiStations",
    "increasedAdjunctRouteCapacity",
    "phantomCalls",
    "agentStates",
    "productID",
    "limit",
    "used",
    "release"
})
public class SystemParametersCustomerType {

    @XmlElement(name = "G3_Version")
    protected String g3Version;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Platform")
    protected String platform;
    @XmlElement(name = "RFA_Enterprise_System_ID_ESID")
    protected String rfaEnterpriseSystemIDESID;
    @XmlElement(name = "RFA_System_ID_SID")
    protected String rfaSystemIDSID;
    @XmlElement(name = "RFA_Module_ID_MID")
    protected String rfaModuleIDMID;
    @XmlElement(name = "Platform_Maximum_Ports")
    protected String platformMaximumPorts;
    @XmlElement(name = "Platform_Maximum_Ports_USED")
    protected String platformMaximumPortsUSED;
    @XmlElement(name = "Platform_Maximum_Ports_LOW")
    protected String platformMaximumPortsLOW;
    @XmlElement(name = "Platform_Maximum_Ports_HIGH")
    protected String platformMaximumPortsHIGH;
    @XmlElement(name = "Maximum_Stations")
    protected String maximumStations;
    @XmlElement(name = "Maximum_Stations_USED")
    protected String maximumStationsUSED;
    @XmlElement(name = "Maximum_Stations_LOW")
    protected String maximumStationsLOW;
    @XmlElement(name = "Maximum_Stations_HIGH")
    protected String maximumStationsHIGH;
    @XmlElement(name = "Maximum_XMOBILE_Stations")
    protected String maximumXMOBILEStations;
    @XmlElement(name = "Maximum_XMOBILE_Stations_USED")
    protected String maximumXMOBILEStationsUSED;
    @XmlElement(name = "Maximum_XMOBILE_Stations_LOW")
    protected String maximumXMOBILEStationsLOW;
    @XmlElement(name = "Maximum_XMOBILE_Stations_HIGH")
    protected String maximumXMOBILEStationsHIGH;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_EC500")
    protected String maximumOffPBXTelephonesEC500;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_EC500_USED")
    protected String maximumOffPBXTelephonesEC500USED;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_EC500_LOW")
    protected String maximumOffPBXTelephonesEC500LOW;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_EC500_HIGH")
    protected String maximumOffPBXTelephonesEC500HIGH;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_OPS")
    protected String maximumOffPBXTelephonesOPS;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_OPS_USED")
    protected String maximumOffPBXTelephonesOPSUSED;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_OPS_LOW")
    protected String maximumOffPBXTelephonesOPSLOW;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_OPS_HIGH")
    protected String maximumOffPBXTelephonesOPSHIGH;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_SCCAN")
    protected String maximumOffPBXTelephonesSCCAN;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_SCCAN_USED")
    protected String maximumOffPBXTelephonesSCCANUSED;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_SCCAN_LOW")
    protected String maximumOffPBXTelephonesSCCANLOW;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_SCCAN_HIGH")
    protected String maximumOffPBXTelephonesSCCANHIGH;
    @XmlElement(name = "Maximum_Administered_H_323_Trunks")
    protected String maximumAdministeredH323Trunks;
    @XmlElement(name = "Maximum_Administered_H_323_Trunks_USED")
    protected String maximumAdministeredH323TrunksUSED;
    @XmlElement(name = "Maximum_Administered_H_323_Trunks_LOW")
    protected String maximumAdministeredH323TrunksLOW;
    @XmlElement(name = "Maximum_Administered_H_323_Trunks_HIGH")
    protected String maximumAdministeredH323TrunksHIGH;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations")
    protected String maximumConcurrentlyRegisteredIPStations;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations_USED")
    protected String maximumConcurrentlyRegisteredIPStationsUSED;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations_LOW")
    protected String maximumConcurrentlyRegisteredIPStationsLOW;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations_HIGH")
    protected String maximumConcurrentlyRegisteredIPStationsHIGH;
    @XmlElement(name = "Maximum_Administered_Remote_Office_Trunks")
    protected String maximumAdministeredRemoteOfficeTrunks;
    @XmlElement(name = "Maximum_Administered_Remote_Office_Trunks_USED")
    protected String maximumAdministeredRemoteOfficeTrunksUSED;
    @XmlElement(name = "Maximum_Administered_Remote_Office_Trunks_LOW")
    protected String maximumAdministeredRemoteOfficeTrunksLOW;
    @XmlElement(name = "Maximum_Administered_Remote_Office_Trunks_HIGH")
    protected String maximumAdministeredRemoteOfficeTrunksHIGH;
    @XmlElement(name = "Maximum_Concurrently_Registered_Remote_Office_Stations")
    protected String maximumConcurrentlyRegisteredRemoteOfficeStations;
    @XmlElement(name = "Maximum_Concurrently_Registered_Remote_Office_Stations_USED")
    protected String maximumConcurrentlyRegisteredRemoteOfficeStationsUSED;
    @XmlElement(name = "Maximum_Concurrently_Registered_Remote_Office_Stations_LOW")
    protected String maximumConcurrentlyRegisteredRemoteOfficeStationsLOW;
    @XmlElement(name = "Maximum_Concurrently_Registered_Remote_Office_Stations_HIGH")
    protected String maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_ECons")
    protected String maximumConcurrentlyRegisteredIPECons;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_ECons_USED")
    protected String maximumConcurrentlyRegisteredIPEConsUSED;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_ECons_LOW")
    protected String maximumConcurrentlyRegisteredIPEConsLOW;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_ECons_HIGH")
    protected String maximumConcurrentlyRegisteredIPEConsHIGH;
    @XmlElement(name = "Max_Concur_Registered_Unauthenticated_H_323_Stations")
    protected String maxConcurRegisteredUnauthenticatedH323Stations;
    @XmlElement(name = "Max_Concur_Registered_Unauthenticated_H_323_Stations_USED")
    protected String maxConcurRegisteredUnauthenticatedH323StationsUSED;
    @XmlElement(name = "Max_Concur_Registered_Unauthenticated_H_323_Stations_LOW")
    protected String maxConcurRegisteredUnauthenticatedH323StationsLOW;
    @XmlElement(name = "Max_Concur_Registered_Unauthenticated_H_323_Stations_HIGH")
    protected String maxConcurRegisteredUnauthenticatedH323StationsHIGH;
    @XmlElement(name = "Maximum_Video_Capable_H_323_Stations")
    protected String maximumVideoCapableH323Stations;
    @XmlElement(name = "Maximum_Video_Capable_H_323_Stations_USED")
    protected String maximumVideoCapableH323StationsUSED;
    @XmlElement(name = "Maximum_Video_Capable_H_323_Stations_LOW")
    protected String maximumVideoCapableH323StationsLOW;
    @XmlElement(name = "Maximum_Video_Capable_H_323_Stations_HIGH")
    protected String maximumVideoCapableH323StationsHIGH;
    @XmlElement(name = "Maximum_Video_Capable_IP_Softphones")
    protected String maximumVideoCapableIPSoftphones;
    @XmlElement(name = "Maximum_Video_Capable_IP_Softphones_USED")
    protected String maximumVideoCapableIPSoftphonesUSED;
    @XmlElement(name = "Maximum_Video_Capable_IP_Softphones_LOW")
    protected String maximumVideoCapableIPSoftphonesLOW;
    @XmlElement(name = "Maximum_Video_Capable_IP_Softphones_HIGH")
    protected String maximumVideoCapableIPSoftphonesHIGH;
    @XmlElement(name = "Maximum_Administered_SIP_Trunks")
    protected String maximumAdministeredSIPTrunks;
    @XmlElement(name = "Maximum_Administered_SIP_Trunks_USED")
    protected String maximumAdministeredSIPTrunksUSED;
    @XmlElement(name = "Maximum_Administered_SIP_Trunks_LOW")
    protected String maximumAdministeredSIPTrunksLOW;
    @XmlElement(name = "Maximum_Administered_SIP_Trunks_HIGH")
    protected String maximumAdministeredSIPTrunksHIGH;
    @XmlElement(name = "Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation")
    protected String maximumNumberOfDS1BoardsWithEchoCancellation;
    @XmlElement(name = "Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_USED")
    protected String maximumNumberOfDS1BoardsWithEchoCancellationUSED;
    @XmlElement(name = "Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_LOW")
    protected String maximumNumberOfDS1BoardsWithEchoCancellationLOW;
    @XmlElement(name = "Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_HIGH")
    protected String maximumNumberOfDS1BoardsWithEchoCancellationHIGH;
    @XmlElement(name = "Maximum_TN2501_VAL_Boards")
    protected String maximumTN2501VALBoards;
    @XmlElement(name = "Maximum_TN2501_VAL_Boards_USED")
    protected String maximumTN2501VALBoardsUSED;
    @XmlElement(name = "Maximum_TN2501_VAL_Boards_LOW")
    protected String maximumTN2501VALBoardsLOW;
    @XmlElement(name = "Maximum_TN2501_VAL_Boards_HIGH")
    protected String maximumTN2501VALBoardsHIGH;
    @XmlElement(name = "Maximum_G250_G350_G700_VAL_Sources")
    protected String maximumG250G350G700VALSources;
    @XmlElement(name = "Maximum_G250_G350_G700_VAL_Sources_USED")
    protected String maximumG250G350G700VALSourcesUSED;
    @XmlElement(name = "Maximum_G250_G350_G700_VAL_Sources_LOW")
    protected String maximumG250G350G700VALSourcesLOW;
    @XmlElement(name = "Maximum_G250_G350_G700_VAL_Sources_HIGH")
    protected String maximumG250G350G700VALSourcesHIGH;
    @XmlElement(name = "Maximum_TN2602_Boards_With_80_VoIP_Channels")
    protected String maximumTN2602BoardsWith80VoIPChannels;
    @XmlElement(name = "Maximum_TN2602_Boards_With_80_VoIP_Channels_USED")
    protected String maximumTN2602BoardsWith80VoIPChannelsUSED;
    @XmlElement(name = "Maximum_TN2602_Boards_With_80_VoIP_Channels_LOW")
    protected String maximumTN2602BoardsWith80VoIPChannelsLOW;
    @XmlElement(name = "Maximum_TN2602_Boards_With_80_VoIP_Channels_HIGH")
    protected String maximumTN2602BoardsWith80VoIPChannelsHIGH;
    @XmlElement(name = "Maximum_TN2602_Boards_With_320_VoIP_Channels")
    protected String maximumTN2602BoardsWith320VoIPChannels;
    @XmlElement(name = "Maximum_TN2602_Boards_With_320_VoIP_Channels_USED")
    protected String maximumTN2602BoardsWith320VoIPChannelsUSED;
    @XmlElement(name = "Maximum_TN2602_Boards_With_320_VoIP_Channels_LOW")
    protected String maximumTN2602BoardsWith320VoIPChannelsLOW;
    @XmlElement(name = "Maximum_TN2602_Boards_With_320_VoIP_Channels_HIGH")
    protected String maximumTN2602BoardsWith320VoIPChannelsHIGH;
    @XmlElement(name = "Maximum_Number_Of_Expanded_Meet_me_Conference_Ports")
    protected String maximumNumberOfExpandedMeetMeConferencePorts;
    @XmlElement(name = "Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_USED")
    protected String maximumNumberOfExpandedMeetMeConferencePortsUSED;
    @XmlElement(name = "Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_LOW")
    protected String maximumNumberOfExpandedMeetMeConferencePortsLOW;
    @XmlElement(name = "Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_HIGH")
    protected String maximumNumberOfExpandedMeetMeConferencePortsHIGH;
    @XmlElement(name = "Abbreviated_Dialing_Enhanced_List")
    protected String abbreviatedDialingEnhancedList;
    @XmlElement(name = "Access_Security_Gateway_ASG")
    protected String accessSecurityGatewayASG;
    @XmlElement(name = "Analog_Trunk_Incoming_Call_ID")
    protected String analogTrunkIncomingCallID;
    @XmlElement(name = "A_D_Grp_Sys_List_Dialing_Start_At_01")
    protected String adGrpSysListDialingStartAt01;
    @XmlElement(name = "Answer_Supervision_by_Call_Classifier")
    protected String answerSupervisionByCallClassifier;
    @XmlElement(name = "ARS")
    protected String ars;
    @XmlElement(name = "ARS_AAR_Partitioning")
    protected String arsaarPartitioning;
    @XmlElement(name = "ARS_AAR_Dialing_Without_FAC")
    protected String arsaarDialingWithoutFAC;
    @XmlElement(name = "ASAI_Interface")
    protected String asaiInterface;
    @XmlElement(name = "ASAI_Link_Core_Capabilities")
    protected String asaiLinkCoreCapabilities;
    @XmlElement(name = "ASAI_Proprietary_Adjunct_Links")
    protected String asaiProprietaryAdjunctLinks;
    @XmlElement(name = "ASAI_Link_Plus_Capabilities")
    protected String asaiLinkPlusCapabilities;
    @XmlElement(name = "Async_Transfer_Mode_ATM_PNC")
    protected String asyncTransferModeATMPNC;
    @XmlElement(name = "Async_Transfer_Mode_ATM_Trunking")
    protected String asyncTransferModeATMTrunking;
    @XmlElement(name = "ATM_WAN_Spare_Processor")
    protected String atmwanSpareProcessor;
    @XmlElement(name = "ATMS")
    protected String atms;
    @XmlElement(name = "Attendant_Vectoring")
    protected String attendantVectoring;
    @XmlElement(name = "Audible_Message_Waiting")
    protected String audibleMessageWaiting;
    @XmlElement(name = "Authorization_Codes")
    protected String authorizationCodes;
    @XmlElement(name = "Backup_Cluster_Automatic_Takeover")
    protected String backupClusterAutomaticTakeover;
    @XmlElement(name = "CAS_Branch")
    protected String casBranch;
    @XmlElement(name = "CAS_Main")
    protected String casMain;
    @XmlElement(name = "Change_COR_by_FAC")
    protected String changeCORByFAC;
    @XmlElement(name = "Computer_Telephony_Adjunct_Links")
    protected String computerTelephonyAdjunctLinks;
    @XmlElement(name = "Cvg_Of_Calls_Redirected_Off_Net")
    protected String cvgOfCallsRedirectedOffNet;
    @XmlElement(name = "DCS_Basic")
    protected String dcsBasic;
    @XmlElement(name = "DCS_Call_Coverage")
    protected String dcsCallCoverage;
    @XmlElement(name = "DCS_With_Rerouting")
    protected String dcsWithRerouting;
    @XmlElement(name = "DCS_Global")
    protected String dcsGlobal;
    @XmlElement(name = "Digital_Loss_Plan_Modification")
    protected String digitalLossPlanModification;
    @XmlElement(name = "DS1_MSP")
    protected String ds1MSP;
    @XmlElement(name = "DS1_Echo_Cancellation")
    protected String ds1EchoCancellation;
    @XmlElement(name = "Emergency_Access_to_Attendant")
    protected String emergencyAccessToAttendant;
    @XmlElement(name = "Enable_dadmin_Login")
    protected String enableDadminLogin;
    @XmlElement(name = "Enhanced_Conferencing")
    protected String enhancedConferencing;
    @XmlElement(name = "Enhanced_EC500")
    protected String enhancedEC500;
    @XmlElement(name = "Enterprise_Survivable_Server")
    protected String enterpriseSurvivableServer;
    @XmlElement(name = "Enterprise_Wide_Licensing")
    protected String enterpriseWideLicensing;
    @XmlElement(name = "ESS_Administration")
    protected String essAdministration;
    @XmlElement(name = "Extended_Cvg_Fwd_Admin")
    protected String extendedCvgFwdAdmin;
    @XmlElement(name = "External_Device_Alarm_Admin")
    protected String externalDeviceAlarmAdmin;
    @XmlElement(name = "Five_Port_Networks_Max_Per_MCC")
    protected String fivePortNetworksMaxPerMCC;
    @XmlElement(name = "Flexible_Billing")
    protected String flexibleBilling;
    @XmlElement(name = "Forced_Entry_of_Account_Codes")
    protected String forcedEntryOfAccountCodes;
    @XmlElement(name = "Global_Call_Classification")
    protected String globalCallClassification;
    @XmlElement(name = "Hospitality_Basic")
    protected String hospitalityBasic;
    @XmlElement(name = "Hospitality_G3V3_Enhancements")
    protected String hospitalityG3V3Enhancements;
    @XmlElement(name = "Hospitality_Parameter_Reduction")
    protected String hospitalityParameterReduction;
    @XmlElement(name = "IP_Trunks")
    protected String ipTrunks;
    @XmlElement(name = "IP_Attendant_Consoles")
    protected String ipAttendantConsoles;
    @XmlElement(name = "IP_Stations")
    protected String ipStations;
    @XmlElement(name = "Internet_Protocol_IP_PNC")
    protected String internetProtocolIPPNC;
    @XmlElement(name = "ISDN_Feature_Plus")
    protected String isdnFeaturePlus;
    @XmlElement(name = "ISDN_Network_Call_Redirection")
    protected String isdnNetworkCallRedirection;
    @XmlElement(name = "ISDN_BRI_Trunks")
    protected String isdnbriTrunks;
    @XmlElement(name = "ISDN_PRI")
    protected String isdnpri;
    @XmlElement(name = "Local_Survivable_Processor")
    protected String localSurvivableProcessor;
    @XmlElement(name = "Malicious_Call_Trace")
    protected String maliciousCallTrace;
    @XmlElement(name = "Media_Encryption_Over_IP")
    protected String mediaEncryptionOverIP;
    @XmlElement(name = "Mode_Code_For_Centralized_Voice_Mail")
    protected String modeCodeForCentralizedVoiceMail;
    @XmlElement(name = "Mode_Code_Interface")
    protected String modeCodeInterface;
    @XmlElement(name = "Multifrequency_Signaling")
    protected String multifrequencySignaling;
    @XmlElement(name = "Multimedia_Appl_Server_Interface_MASI")
    protected String multimediaApplServerInterfaceMASI;
    @XmlElement(name = "Multimedia_Call_Handling_Basic")
    protected String multimediaCallHandlingBasic;
    @XmlElement(name = "Multimedia_Call_Handling_Enhanced")
    protected String multimediaCallHandlingEnhanced;
    @XmlElement(name = "Multimedia_IP_SIP_Trunking")
    protected String multimediaIPSIPTrunking;
    @XmlElement(name = "Multinational_Locations")
    protected String multinationalLocations;
    @XmlElement(name = "Multiple_Level_Precedence_And_Preemption")
    protected String multipleLevelPrecedenceAndPreemption;
    @XmlElement(name = "Multiple_Locations")
    protected String multipleLocations;
    @XmlElement(name = "Personal_Station_Access")
    protected String personalStationAccess;
    @XmlElement(name = "No_License_Mode_Disabled")
    protected String noLicenseModeDisabled;
    @XmlElement(name = "Posted_Messages")
    protected String postedMessages;
    @XmlElement(name = "PNC_Duplication")
    protected String pncDuplication;
    @XmlElement(name = "Port_Network_Support")
    protected String portNetworkSupport;
    @XmlElement(name = "Premier_Business_Package")
    protected String premierBusinessPackage;
    @XmlElement(name = "Processor_And_System_MSP")
    protected String processorAndSystemMSP;
    @XmlElement(name = "Private_Networking")
    protected String privateNetworking;
    @XmlElement(name = "Processor_Ethernet")
    protected String processorEthernet;
    @XmlElement(name = "R9_5_Capabilities")
    protected String r95Capabilities;
    @XmlElement(name = "Remote_Office")
    protected String remoteOffice;
    @XmlElement(name = "Restrict_Call_Forward_Off_Net")
    protected String restrictCallForwardOffNet;
    @XmlElement(name = "Secondary_Data_Module")
    protected String secondaryDataModule;
    @XmlElement(name = "Station_And_Trunk_MSP")
    protected String stationAndTrunkMSP;
    @XmlElement(name = "Station_As_Virtual_Extension")
    protected String stationAsVirtualExtension;
    @XmlElement(name = "System_Management_Data_Transfer")
    protected String systemManagementDataTransfer;
    @XmlElement(name = "Tenant_Partitioning")
    protected String tenantPartitioning;
    @XmlElement(name = "Terminal_Trans_Init_TTI")
    protected String terminalTransInitTTI;
    @XmlElement(name = "Time_Of_Day_Routing")
    protected String timeOfDayRouting;
    @XmlElement(name = "Uniform_Dialing_Plan")
    protected String uniformDialingPlan;
    @XmlElement(name = "Usage_Allocation_Enhancements")
    protected String usageAllocationEnhancements;
    @XmlElement(name = "TN2501_VAL_Maximum_Capacity")
    protected String tn2501VALMaximumCapacity;
    @XmlElement(name = "Voice_Mail_Application_Support")
    protected String voiceMailApplicationSupport;
    @XmlElement(name = "Wideband_Switching")
    protected String widebandSwitching;
    @XmlElement(name = "Wireless")
    protected String wireless;
    @XmlElement(name = "Call_Center_Release")
    protected String callCenterRelease;
    @XmlElement(name = "ACD")
    protected String acd;
    @XmlElement(name = "BCMS_Basic")
    protected String bcmsBasic;
    @XmlElement(name = "BCMS_VuStats_Service_Level")
    protected String bcmsVuStatsServiceLevel;
    @XmlElement(name = "BSR_Local_Treatment_For_IP_and_ISDN")
    protected String bsrLocalTreatmentForIPAndISDN;
    @XmlElement(name = "Business_Advocate")
    protected String businessAdvocate;
    @XmlElement(name = "Call_Work_Codes")
    protected String callWorkCodes;
    @XmlElement(name = "DTMF_Feedback_Signals_For_VRU")
    protected String dtmfFeedbackSignalsForVRU;
    @XmlElement(name = "Dynamic_Advocate")
    protected String dynamicAdvocate;
    @XmlElement(name = "Expert_Agent_Selection_EAS")
    protected String expertAgentSelectionEAS;
    @XmlElement(name = "EAS_PHD")
    protected String easphd;
    @XmlElement(name = "Forced_ACD_Calls")
    protected String forcedACDCalls;
    @XmlElement(name = "Least_Occupied_Agent")
    protected String leastOccupiedAgent;
    @XmlElement(name = "Lookahead_Interflow_LAI")
    protected String lookaheadInterflowLAI;
    @XmlElement(name = "Multiple_Call_Handling_On_Request")
    protected String multipleCallHandlingOnRequest;
    @XmlElement(name = "Multiple_Call_Handling_Forced")
    protected String multipleCallHandlingForced;
    @XmlElement(name = "PASTE_Display_PBX_Data_On_Phone")
    protected String pasteDisplayPBXDataOnPhone;
    @XmlElement(name = "Reason_Codes")
    protected String reasonCodes;
    @XmlElement(name = "Service_Level_Maximizer")
    protected String serviceLevelMaximizer;
    @XmlElement(name = "Service_Observing_Basic")
    protected String serviceObservingBasic;
    @XmlElement(name = "Service_Observing_Remote_By_FAC")
    protected String serviceObservingRemoteByFAC;
    @XmlElement(name = "Service_Observing_VDNs")
    protected String serviceObservingVDNs;
    @XmlElement(name = "Timed_ACW")
    protected String timedACW;
    @XmlElement(name = "Vectoring_Basic")
    protected String vectoringBasic;
    @XmlElement(name = "Vectoring_Prompting")
    protected String vectoringPrompting;
    @XmlElement(name = "Vectoring_G3V4_Enhanced")
    protected String vectoringG3V4Enhanced;
    @XmlElement(name = "Vectoring_3_0_Enhanced")
    protected String vectoring30Enhanced;
    @XmlElement(name = "Vectoring_ANI_II_Digits_Routing")
    protected String vectoringANIIIDigitsRouting;
    @XmlElement(name = "Vectoring_G3V4_Advanced_Routing")
    protected String vectoringG3V4AdvancedRouting;
    @XmlElement(name = "Vectoring_CINFO")
    protected String vectoringCINFO;
    @XmlElement(name = "Vectoring_Best_Service_Routing")
    protected String vectoringBestServiceRouting;
    @XmlElement(name = "Vectoring_Holidays")
    protected String vectoringHolidays;
    @XmlElement(name = "Vectoring_Variables")
    protected String vectoringVariables;
    @XmlElement(name = "VDN_Of_Origin_Announcement")
    protected String vdnOfOriginAnnouncement;
    @XmlElement(name = "VDN_Return_Destination")
    protected String vdnReturnDestination;
    @XmlElement(name = "VuStats")
    protected String vuStats;
    @XmlElement(name = "VuStats_G3V4_Enhanced")
    protected String vuStatsG3V4Enhanced;
    @XmlElement(name = "Logged_In_ACD_Agents")
    protected String loggedInACDAgents;
    @XmlElement(name = "Logged_In_ACD_Agents_USED")
    protected String loggedInACDAgentsUSED;
    @XmlElement(name = "Logged_In_ACD_Agents_LOW")
    protected String loggedInACDAgentsLOW;
    @XmlElement(name = "Logged_In_ACD_Agents_HIGH")
    protected String loggedInACDAgentsHIGH;
    @XmlElement(name = "Logged_In_Advocate_Agents")
    protected String loggedInAdvocateAgents;
    @XmlElement(name = "Logged_In_Advocate_Agents_USED")
    protected String loggedInAdvocateAgentsUSED;
    @XmlElement(name = "Logged_In_Advocate_Agents_LOW")
    protected String loggedInAdvocateAgentsLOW;
    @XmlElement(name = "Logged_In_Advocate_Agents_HIGH")
    protected String loggedInAdvocateAgentsHIGH;
    @XmlElement(name = "Logged_In_IP_Softphone_Agents")
    protected String loggedInIPSoftphoneAgents;
    @XmlElement(name = "Logged_In_IP_Softphone_Agents_USED")
    protected String loggedInIPSoftphoneAgentsUSED;
    @XmlElement(name = "Logged_In_IP_Softphone_Agents_LOW")
    protected String loggedInIPSoftphoneAgentsLOW;
    @XmlElement(name = "Logged_In_IP_Softphone_Agents_HIGH")
    protected String loggedInIPSoftphoneAgentsHIGH;
    @XmlElement(name = "Basic_Call_Setup")
    protected String basicCallSetup;
    @XmlElement(name = "Basic_Supplementary_Services")
    protected String basicSupplementaryServices;
    @XmlElement(name = "Centralized_Attendant")
    protected String centralizedAttendant;
    @XmlElement(name = "Interworking_With_DCS")
    protected String interworkingWithDCS;
    @XmlElement(name = "Supplementary_Services_with_Rerouting")
    protected String supplementaryServicesWithRerouting;
    @XmlElement(name = "Transfer_into_QSIG_Voice_Mail")
    protected String transferIntoQSIGVoiceMail;
    @XmlElement(name = "Value_Added_VALU")
    protected String valueAddedVALU;
    @XmlElement(name = "Adjunct_Call_Control")
    protected String adjunctCallControl;
    @XmlElement(name = "Adjunct_Routing")
    protected String adjunctRouting;
    @XmlElement(name = "Domain_Control")
    protected String domainControl;
    @XmlElement(name = "Event_Notification")
    protected String eventNotification;
    @XmlElement(name = "Request_Feature")
    protected String requestFeature;
    @XmlElement(name = "Set_Value")
    protected String setValue;
    @XmlElement(name = "Answering_Machine_Detection")
    protected String answeringMachineDetection;
    @XmlElement(name = "Selective_Listening")
    protected String selectiveListening;
    @XmlElement(name = "Switch_Classified_Outbound_Calls")
    protected String switchClassifiedOutboundCalls;
    @XmlElement(name = "Proprietary_Applications")
    protected String proprietaryApplications;
    @XmlElement(name = "CTI_Stations")
    protected String ctiStations;
    @XmlElement(name = "Increased_Adjunct_Route_Capacity")
    protected String increasedAdjunctRouteCapacity;
    @XmlElement(name = "Phantom_Calls")
    protected String phantomCalls;
    @XmlElement(name = "Agent_States")
    protected String agentStates;
    @XmlElement(name = "ProductID")
    protected List<ArrayType> productID;
    @XmlElement(name = "Limit")
    protected List<ArrayType> limit;
    @XmlElement(name = "Used")
    protected List<ArrayType> used;
    @XmlElement(name = "Release")
    protected List<ArrayType> release;

    /**
     * g3Version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG3Version() {
        return g3Version;
    }

    /**
     * g3Version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG3Version(String value) {
        this.g3Version = value;
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
     * platform 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * platform 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * rfaEnterpriseSystemIDESID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFAEnterpriseSystemIDESID() {
        return rfaEnterpriseSystemIDESID;
    }

    /**
     * rfaEnterpriseSystemIDESID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFAEnterpriseSystemIDESID(String value) {
        this.rfaEnterpriseSystemIDESID = value;
    }

    /**
     * rfaSystemIDSID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFASystemIDSID() {
        return rfaSystemIDSID;
    }

    /**
     * rfaSystemIDSID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFASystemIDSID(String value) {
        this.rfaSystemIDSID = value;
    }

    /**
     * rfaModuleIDMID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFAModuleIDMID() {
        return rfaModuleIDMID;
    }

    /**
     * rfaModuleIDMID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFAModuleIDMID(String value) {
        this.rfaModuleIDMID = value;
    }

    /**
     * platformMaximumPorts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMaximumPorts() {
        return platformMaximumPorts;
    }

    /**
     * platformMaximumPorts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMaximumPorts(String value) {
        this.platformMaximumPorts = value;
    }

    /**
     * platformMaximumPortsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMaximumPortsUSED() {
        return platformMaximumPortsUSED;
    }

    /**
     * platformMaximumPortsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMaximumPortsUSED(String value) {
        this.platformMaximumPortsUSED = value;
    }

    /**
     * platformMaximumPortsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMaximumPortsLOW() {
        return platformMaximumPortsLOW;
    }

    /**
     * platformMaximumPortsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMaximumPortsLOW(String value) {
        this.platformMaximumPortsLOW = value;
    }

    /**
     * platformMaximumPortsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMaximumPortsHIGH() {
        return platformMaximumPortsHIGH;
    }

    /**
     * platformMaximumPortsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMaximumPortsHIGH(String value) {
        this.platformMaximumPortsHIGH = value;
    }

    /**
     * maximumStations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStations() {
        return maximumStations;
    }

    /**
     * maximumStations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStations(String value) {
        this.maximumStations = value;
    }

    /**
     * maximumStationsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStationsUSED() {
        return maximumStationsUSED;
    }

    /**
     * maximumStationsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStationsUSED(String value) {
        this.maximumStationsUSED = value;
    }

    /**
     * maximumStationsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStationsLOW() {
        return maximumStationsLOW;
    }

    /**
     * maximumStationsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStationsLOW(String value) {
        this.maximumStationsLOW = value;
    }

    /**
     * maximumStationsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStationsHIGH() {
        return maximumStationsHIGH;
    }

    /**
     * maximumStationsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStationsHIGH(String value) {
        this.maximumStationsHIGH = value;
    }

    /**
     * maximumXMOBILEStations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumXMOBILEStations() {
        return maximumXMOBILEStations;
    }

    /**
     * maximumXMOBILEStations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumXMOBILEStations(String value) {
        this.maximumXMOBILEStations = value;
    }

    /**
     * maximumXMOBILEStationsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumXMOBILEStationsUSED() {
        return maximumXMOBILEStationsUSED;
    }

    /**
     * maximumXMOBILEStationsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumXMOBILEStationsUSED(String value) {
        this.maximumXMOBILEStationsUSED = value;
    }

    /**
     * maximumXMOBILEStationsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumXMOBILEStationsLOW() {
        return maximumXMOBILEStationsLOW;
    }

    /**
     * maximumXMOBILEStationsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumXMOBILEStationsLOW(String value) {
        this.maximumXMOBILEStationsLOW = value;
    }

    /**
     * maximumXMOBILEStationsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumXMOBILEStationsHIGH() {
        return maximumXMOBILEStationsHIGH;
    }

    /**
     * maximumXMOBILEStationsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumXMOBILEStationsHIGH(String value) {
        this.maximumXMOBILEStationsHIGH = value;
    }

    /**
     * maximumOffPBXTelephonesEC500 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesEC500() {
        return maximumOffPBXTelephonesEC500;
    }

    /**
     * maximumOffPBXTelephonesEC500 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesEC500(String value) {
        this.maximumOffPBXTelephonesEC500 = value;
    }

    /**
     * maximumOffPBXTelephonesEC500USED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesEC500USED() {
        return maximumOffPBXTelephonesEC500USED;
    }

    /**
     * maximumOffPBXTelephonesEC500USED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesEC500USED(String value) {
        this.maximumOffPBXTelephonesEC500USED = value;
    }

    /**
     * maximumOffPBXTelephonesEC500LOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesEC500LOW() {
        return maximumOffPBXTelephonesEC500LOW;
    }

    /**
     * maximumOffPBXTelephonesEC500LOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesEC500LOW(String value) {
        this.maximumOffPBXTelephonesEC500LOW = value;
    }

    /**
     * maximumOffPBXTelephonesEC500HIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesEC500HIGH() {
        return maximumOffPBXTelephonesEC500HIGH;
    }

    /**
     * maximumOffPBXTelephonesEC500HIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesEC500HIGH(String value) {
        this.maximumOffPBXTelephonesEC500HIGH = value;
    }

    /**
     * maximumOffPBXTelephonesOPS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesOPS() {
        return maximumOffPBXTelephonesOPS;
    }

    /**
     * maximumOffPBXTelephonesOPS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesOPS(String value) {
        this.maximumOffPBXTelephonesOPS = value;
    }

    /**
     * maximumOffPBXTelephonesOPSUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesOPSUSED() {
        return maximumOffPBXTelephonesOPSUSED;
    }

    /**
     * maximumOffPBXTelephonesOPSUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesOPSUSED(String value) {
        this.maximumOffPBXTelephonesOPSUSED = value;
    }

    /**
     * maximumOffPBXTelephonesOPSLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesOPSLOW() {
        return maximumOffPBXTelephonesOPSLOW;
    }

    /**
     * maximumOffPBXTelephonesOPSLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesOPSLOW(String value) {
        this.maximumOffPBXTelephonesOPSLOW = value;
    }

    /**
     * maximumOffPBXTelephonesOPSHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesOPSHIGH() {
        return maximumOffPBXTelephonesOPSHIGH;
    }

    /**
     * maximumOffPBXTelephonesOPSHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesOPSHIGH(String value) {
        this.maximumOffPBXTelephonesOPSHIGH = value;
    }

    /**
     * maximumOffPBXTelephonesSCCAN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesSCCAN() {
        return maximumOffPBXTelephonesSCCAN;
    }

    /**
     * maximumOffPBXTelephonesSCCAN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesSCCAN(String value) {
        this.maximumOffPBXTelephonesSCCAN = value;
    }

    /**
     * maximumOffPBXTelephonesSCCANUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesSCCANUSED() {
        return maximumOffPBXTelephonesSCCANUSED;
    }

    /**
     * maximumOffPBXTelephonesSCCANUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesSCCANUSED(String value) {
        this.maximumOffPBXTelephonesSCCANUSED = value;
    }

    /**
     * maximumOffPBXTelephonesSCCANLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesSCCANLOW() {
        return maximumOffPBXTelephonesSCCANLOW;
    }

    /**
     * maximumOffPBXTelephonesSCCANLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesSCCANLOW(String value) {
        this.maximumOffPBXTelephonesSCCANLOW = value;
    }

    /**
     * maximumOffPBXTelephonesSCCANHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesSCCANHIGH() {
        return maximumOffPBXTelephonesSCCANHIGH;
    }

    /**
     * maximumOffPBXTelephonesSCCANHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesSCCANHIGH(String value) {
        this.maximumOffPBXTelephonesSCCANHIGH = value;
    }

    /**
     * maximumAdministeredH323Trunks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredH323Trunks() {
        return maximumAdministeredH323Trunks;
    }

    /**
     * maximumAdministeredH323Trunks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredH323Trunks(String value) {
        this.maximumAdministeredH323Trunks = value;
    }

    /**
     * maximumAdministeredH323TrunksUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredH323TrunksUSED() {
        return maximumAdministeredH323TrunksUSED;
    }

    /**
     * maximumAdministeredH323TrunksUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredH323TrunksUSED(String value) {
        this.maximumAdministeredH323TrunksUSED = value;
    }

    /**
     * maximumAdministeredH323TrunksLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredH323TrunksLOW() {
        return maximumAdministeredH323TrunksLOW;
    }

    /**
     * maximumAdministeredH323TrunksLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredH323TrunksLOW(String value) {
        this.maximumAdministeredH323TrunksLOW = value;
    }

    /**
     * maximumAdministeredH323TrunksHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredH323TrunksHIGH() {
        return maximumAdministeredH323TrunksHIGH;
    }

    /**
     * maximumAdministeredH323TrunksHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredH323TrunksHIGH(String value) {
        this.maximumAdministeredH323TrunksHIGH = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPStations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStations() {
        return maximumConcurrentlyRegisteredIPStations;
    }

    /**
     * maximumConcurrentlyRegisteredIPStations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStations(String value) {
        this.maximumConcurrentlyRegisteredIPStations = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPStationsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStationsUSED() {
        return maximumConcurrentlyRegisteredIPStationsUSED;
    }

    /**
     * maximumConcurrentlyRegisteredIPStationsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStationsUSED(String value) {
        this.maximumConcurrentlyRegisteredIPStationsUSED = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPStationsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStationsLOW() {
        return maximumConcurrentlyRegisteredIPStationsLOW;
    }

    /**
     * maximumConcurrentlyRegisteredIPStationsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStationsLOW(String value) {
        this.maximumConcurrentlyRegisteredIPStationsLOW = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPStationsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStationsHIGH() {
        return maximumConcurrentlyRegisteredIPStationsHIGH;
    }

    /**
     * maximumConcurrentlyRegisteredIPStationsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStationsHIGH(String value) {
        this.maximumConcurrentlyRegisteredIPStationsHIGH = value;
    }

    /**
     * maximumAdministeredRemoteOfficeTrunks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredRemoteOfficeTrunks() {
        return maximumAdministeredRemoteOfficeTrunks;
    }

    /**
     * maximumAdministeredRemoteOfficeTrunks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredRemoteOfficeTrunks(String value) {
        this.maximumAdministeredRemoteOfficeTrunks = value;
    }

    /**
     * maximumAdministeredRemoteOfficeTrunksUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredRemoteOfficeTrunksUSED() {
        return maximumAdministeredRemoteOfficeTrunksUSED;
    }

    /**
     * maximumAdministeredRemoteOfficeTrunksUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredRemoteOfficeTrunksUSED(String value) {
        this.maximumAdministeredRemoteOfficeTrunksUSED = value;
    }

    /**
     * maximumAdministeredRemoteOfficeTrunksLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredRemoteOfficeTrunksLOW() {
        return maximumAdministeredRemoteOfficeTrunksLOW;
    }

    /**
     * maximumAdministeredRemoteOfficeTrunksLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredRemoteOfficeTrunksLOW(String value) {
        this.maximumAdministeredRemoteOfficeTrunksLOW = value;
    }

    /**
     * maximumAdministeredRemoteOfficeTrunksHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredRemoteOfficeTrunksHIGH() {
        return maximumAdministeredRemoteOfficeTrunksHIGH;
    }

    /**
     * maximumAdministeredRemoteOfficeTrunksHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredRemoteOfficeTrunksHIGH(String value) {
        this.maximumAdministeredRemoteOfficeTrunksHIGH = value;
    }

    /**
     * maximumConcurrentlyRegisteredRemoteOfficeStations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredRemoteOfficeStations() {
        return maximumConcurrentlyRegisteredRemoteOfficeStations;
    }

    /**
     * maximumConcurrentlyRegisteredRemoteOfficeStations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredRemoteOfficeStations(String value) {
        this.maximumConcurrentlyRegisteredRemoteOfficeStations = value;
    }

    /**
     * maximumConcurrentlyRegisteredRemoteOfficeStationsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredRemoteOfficeStationsUSED() {
        return maximumConcurrentlyRegisteredRemoteOfficeStationsUSED;
    }

    /**
     * maximumConcurrentlyRegisteredRemoteOfficeStationsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredRemoteOfficeStationsUSED(String value) {
        this.maximumConcurrentlyRegisteredRemoteOfficeStationsUSED = value;
    }

    /**
     * maximumConcurrentlyRegisteredRemoteOfficeStationsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredRemoteOfficeStationsLOW() {
        return maximumConcurrentlyRegisteredRemoteOfficeStationsLOW;
    }

    /**
     * maximumConcurrentlyRegisteredRemoteOfficeStationsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredRemoteOfficeStationsLOW(String value) {
        this.maximumConcurrentlyRegisteredRemoteOfficeStationsLOW = value;
    }

    /**
     * maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredRemoteOfficeStationsHIGH() {
        return maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH;
    }

    /**
     * maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredRemoteOfficeStationsHIGH(String value) {
        this.maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPECons 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPECons() {
        return maximumConcurrentlyRegisteredIPECons;
    }

    /**
     * maximumConcurrentlyRegisteredIPECons 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPECons(String value) {
        this.maximumConcurrentlyRegisteredIPECons = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPEConsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPEConsUSED() {
        return maximumConcurrentlyRegisteredIPEConsUSED;
    }

    /**
     * maximumConcurrentlyRegisteredIPEConsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPEConsUSED(String value) {
        this.maximumConcurrentlyRegisteredIPEConsUSED = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPEConsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPEConsLOW() {
        return maximumConcurrentlyRegisteredIPEConsLOW;
    }

    /**
     * maximumConcurrentlyRegisteredIPEConsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPEConsLOW(String value) {
        this.maximumConcurrentlyRegisteredIPEConsLOW = value;
    }

    /**
     * maximumConcurrentlyRegisteredIPEConsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPEConsHIGH() {
        return maximumConcurrentlyRegisteredIPEConsHIGH;
    }

    /**
     * maximumConcurrentlyRegisteredIPEConsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPEConsHIGH(String value) {
        this.maximumConcurrentlyRegisteredIPEConsHIGH = value;
    }

    /**
     * maxConcurRegisteredUnauthenticatedH323Stations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurRegisteredUnauthenticatedH323Stations() {
        return maxConcurRegisteredUnauthenticatedH323Stations;
    }

    /**
     * maxConcurRegisteredUnauthenticatedH323Stations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurRegisteredUnauthenticatedH323Stations(String value) {
        this.maxConcurRegisteredUnauthenticatedH323Stations = value;
    }

    /**
     * maxConcurRegisteredUnauthenticatedH323StationsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurRegisteredUnauthenticatedH323StationsUSED() {
        return maxConcurRegisteredUnauthenticatedH323StationsUSED;
    }

    /**
     * maxConcurRegisteredUnauthenticatedH323StationsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurRegisteredUnauthenticatedH323StationsUSED(String value) {
        this.maxConcurRegisteredUnauthenticatedH323StationsUSED = value;
    }

    /**
     * maxConcurRegisteredUnauthenticatedH323StationsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurRegisteredUnauthenticatedH323StationsLOW() {
        return maxConcurRegisteredUnauthenticatedH323StationsLOW;
    }

    /**
     * maxConcurRegisteredUnauthenticatedH323StationsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurRegisteredUnauthenticatedH323StationsLOW(String value) {
        this.maxConcurRegisteredUnauthenticatedH323StationsLOW = value;
    }

    /**
     * maxConcurRegisteredUnauthenticatedH323StationsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurRegisteredUnauthenticatedH323StationsHIGH() {
        return maxConcurRegisteredUnauthenticatedH323StationsHIGH;
    }

    /**
     * maxConcurRegisteredUnauthenticatedH323StationsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurRegisteredUnauthenticatedH323StationsHIGH(String value) {
        this.maxConcurRegisteredUnauthenticatedH323StationsHIGH = value;
    }

    /**
     * maximumVideoCapableH323Stations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableH323Stations() {
        return maximumVideoCapableH323Stations;
    }

    /**
     * maximumVideoCapableH323Stations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableH323Stations(String value) {
        this.maximumVideoCapableH323Stations = value;
    }

    /**
     * maximumVideoCapableH323StationsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableH323StationsUSED() {
        return maximumVideoCapableH323StationsUSED;
    }

    /**
     * maximumVideoCapableH323StationsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableH323StationsUSED(String value) {
        this.maximumVideoCapableH323StationsUSED = value;
    }

    /**
     * maximumVideoCapableH323StationsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableH323StationsLOW() {
        return maximumVideoCapableH323StationsLOW;
    }

    /**
     * maximumVideoCapableH323StationsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableH323StationsLOW(String value) {
        this.maximumVideoCapableH323StationsLOW = value;
    }

    /**
     * maximumVideoCapableH323StationsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableH323StationsHIGH() {
        return maximumVideoCapableH323StationsHIGH;
    }

    /**
     * maximumVideoCapableH323StationsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableH323StationsHIGH(String value) {
        this.maximumVideoCapableH323StationsHIGH = value;
    }

    /**
     * maximumVideoCapableIPSoftphones 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableIPSoftphones() {
        return maximumVideoCapableIPSoftphones;
    }

    /**
     * maximumVideoCapableIPSoftphones 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableIPSoftphones(String value) {
        this.maximumVideoCapableIPSoftphones = value;
    }

    /**
     * maximumVideoCapableIPSoftphonesUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableIPSoftphonesUSED() {
        return maximumVideoCapableIPSoftphonesUSED;
    }

    /**
     * maximumVideoCapableIPSoftphonesUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableIPSoftphonesUSED(String value) {
        this.maximumVideoCapableIPSoftphonesUSED = value;
    }

    /**
     * maximumVideoCapableIPSoftphonesLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableIPSoftphonesLOW() {
        return maximumVideoCapableIPSoftphonesLOW;
    }

    /**
     * maximumVideoCapableIPSoftphonesLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableIPSoftphonesLOW(String value) {
        this.maximumVideoCapableIPSoftphonesLOW = value;
    }

    /**
     * maximumVideoCapableIPSoftphonesHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableIPSoftphonesHIGH() {
        return maximumVideoCapableIPSoftphonesHIGH;
    }

    /**
     * maximumVideoCapableIPSoftphonesHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableIPSoftphonesHIGH(String value) {
        this.maximumVideoCapableIPSoftphonesHIGH = value;
    }

    /**
     * maximumAdministeredSIPTrunks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredSIPTrunks() {
        return maximumAdministeredSIPTrunks;
    }

    /**
     * maximumAdministeredSIPTrunks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredSIPTrunks(String value) {
        this.maximumAdministeredSIPTrunks = value;
    }

    /**
     * maximumAdministeredSIPTrunksUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredSIPTrunksUSED() {
        return maximumAdministeredSIPTrunksUSED;
    }

    /**
     * maximumAdministeredSIPTrunksUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredSIPTrunksUSED(String value) {
        this.maximumAdministeredSIPTrunksUSED = value;
    }

    /**
     * maximumAdministeredSIPTrunksLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredSIPTrunksLOW() {
        return maximumAdministeredSIPTrunksLOW;
    }

    /**
     * maximumAdministeredSIPTrunksLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredSIPTrunksLOW(String value) {
        this.maximumAdministeredSIPTrunksLOW = value;
    }

    /**
     * maximumAdministeredSIPTrunksHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredSIPTrunksHIGH() {
        return maximumAdministeredSIPTrunksHIGH;
    }

    /**
     * maximumAdministeredSIPTrunksHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredSIPTrunksHIGH(String value) {
        this.maximumAdministeredSIPTrunksHIGH = value;
    }

    /**
     * maximumNumberOfDS1BoardsWithEchoCancellation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfDS1BoardsWithEchoCancellation() {
        return maximumNumberOfDS1BoardsWithEchoCancellation;
    }

    /**
     * maximumNumberOfDS1BoardsWithEchoCancellation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfDS1BoardsWithEchoCancellation(String value) {
        this.maximumNumberOfDS1BoardsWithEchoCancellation = value;
    }

    /**
     * maximumNumberOfDS1BoardsWithEchoCancellationUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfDS1BoardsWithEchoCancellationUSED() {
        return maximumNumberOfDS1BoardsWithEchoCancellationUSED;
    }

    /**
     * maximumNumberOfDS1BoardsWithEchoCancellationUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfDS1BoardsWithEchoCancellationUSED(String value) {
        this.maximumNumberOfDS1BoardsWithEchoCancellationUSED = value;
    }

    /**
     * maximumNumberOfDS1BoardsWithEchoCancellationLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfDS1BoardsWithEchoCancellationLOW() {
        return maximumNumberOfDS1BoardsWithEchoCancellationLOW;
    }

    /**
     * maximumNumberOfDS1BoardsWithEchoCancellationLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfDS1BoardsWithEchoCancellationLOW(String value) {
        this.maximumNumberOfDS1BoardsWithEchoCancellationLOW = value;
    }

    /**
     * maximumNumberOfDS1BoardsWithEchoCancellationHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfDS1BoardsWithEchoCancellationHIGH() {
        return maximumNumberOfDS1BoardsWithEchoCancellationHIGH;
    }

    /**
     * maximumNumberOfDS1BoardsWithEchoCancellationHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfDS1BoardsWithEchoCancellationHIGH(String value) {
        this.maximumNumberOfDS1BoardsWithEchoCancellationHIGH = value;
    }

    /**
     * maximumTN2501VALBoards 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2501VALBoards() {
        return maximumTN2501VALBoards;
    }

    /**
     * maximumTN2501VALBoards 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2501VALBoards(String value) {
        this.maximumTN2501VALBoards = value;
    }

    /**
     * maximumTN2501VALBoardsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2501VALBoardsUSED() {
        return maximumTN2501VALBoardsUSED;
    }

    /**
     * maximumTN2501VALBoardsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2501VALBoardsUSED(String value) {
        this.maximumTN2501VALBoardsUSED = value;
    }

    /**
     * maximumTN2501VALBoardsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2501VALBoardsLOW() {
        return maximumTN2501VALBoardsLOW;
    }

    /**
     * maximumTN2501VALBoardsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2501VALBoardsLOW(String value) {
        this.maximumTN2501VALBoardsLOW = value;
    }

    /**
     * maximumTN2501VALBoardsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2501VALBoardsHIGH() {
        return maximumTN2501VALBoardsHIGH;
    }

    /**
     * maximumTN2501VALBoardsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2501VALBoardsHIGH(String value) {
        this.maximumTN2501VALBoardsHIGH = value;
    }

    /**
     * maximumG250G350G700VALSources 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumG250G350G700VALSources() {
        return maximumG250G350G700VALSources;
    }

    /**
     * maximumG250G350G700VALSources 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumG250G350G700VALSources(String value) {
        this.maximumG250G350G700VALSources = value;
    }

    /**
     * maximumG250G350G700VALSourcesUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumG250G350G700VALSourcesUSED() {
        return maximumG250G350G700VALSourcesUSED;
    }

    /**
     * maximumG250G350G700VALSourcesUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumG250G350G700VALSourcesUSED(String value) {
        this.maximumG250G350G700VALSourcesUSED = value;
    }

    /**
     * maximumG250G350G700VALSourcesLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumG250G350G700VALSourcesLOW() {
        return maximumG250G350G700VALSourcesLOW;
    }

    /**
     * maximumG250G350G700VALSourcesLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumG250G350G700VALSourcesLOW(String value) {
        this.maximumG250G350G700VALSourcesLOW = value;
    }

    /**
     * maximumG250G350G700VALSourcesHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumG250G350G700VALSourcesHIGH() {
        return maximumG250G350G700VALSourcesHIGH;
    }

    /**
     * maximumG250G350G700VALSourcesHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumG250G350G700VALSourcesHIGH(String value) {
        this.maximumG250G350G700VALSourcesHIGH = value;
    }

    /**
     * maximumTN2602BoardsWith80VoIPChannels 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith80VoIPChannels() {
        return maximumTN2602BoardsWith80VoIPChannels;
    }

    /**
     * maximumTN2602BoardsWith80VoIPChannels 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith80VoIPChannels(String value) {
        this.maximumTN2602BoardsWith80VoIPChannels = value;
    }

    /**
     * maximumTN2602BoardsWith80VoIPChannelsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith80VoIPChannelsUSED() {
        return maximumTN2602BoardsWith80VoIPChannelsUSED;
    }

    /**
     * maximumTN2602BoardsWith80VoIPChannelsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith80VoIPChannelsUSED(String value) {
        this.maximumTN2602BoardsWith80VoIPChannelsUSED = value;
    }

    /**
     * maximumTN2602BoardsWith80VoIPChannelsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith80VoIPChannelsLOW() {
        return maximumTN2602BoardsWith80VoIPChannelsLOW;
    }

    /**
     * maximumTN2602BoardsWith80VoIPChannelsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith80VoIPChannelsLOW(String value) {
        this.maximumTN2602BoardsWith80VoIPChannelsLOW = value;
    }

    /**
     * maximumTN2602BoardsWith80VoIPChannelsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith80VoIPChannelsHIGH() {
        return maximumTN2602BoardsWith80VoIPChannelsHIGH;
    }

    /**
     * maximumTN2602BoardsWith80VoIPChannelsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith80VoIPChannelsHIGH(String value) {
        this.maximumTN2602BoardsWith80VoIPChannelsHIGH = value;
    }

    /**
     * maximumTN2602BoardsWith320VoIPChannels 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith320VoIPChannels() {
        return maximumTN2602BoardsWith320VoIPChannels;
    }

    /**
     * maximumTN2602BoardsWith320VoIPChannels 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith320VoIPChannels(String value) {
        this.maximumTN2602BoardsWith320VoIPChannels = value;
    }

    /**
     * maximumTN2602BoardsWith320VoIPChannelsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith320VoIPChannelsUSED() {
        return maximumTN2602BoardsWith320VoIPChannelsUSED;
    }

    /**
     * maximumTN2602BoardsWith320VoIPChannelsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith320VoIPChannelsUSED(String value) {
        this.maximumTN2602BoardsWith320VoIPChannelsUSED = value;
    }

    /**
     * maximumTN2602BoardsWith320VoIPChannelsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith320VoIPChannelsLOW() {
        return maximumTN2602BoardsWith320VoIPChannelsLOW;
    }

    /**
     * maximumTN2602BoardsWith320VoIPChannelsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith320VoIPChannelsLOW(String value) {
        this.maximumTN2602BoardsWith320VoIPChannelsLOW = value;
    }

    /**
     * maximumTN2602BoardsWith320VoIPChannelsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith320VoIPChannelsHIGH() {
        return maximumTN2602BoardsWith320VoIPChannelsHIGH;
    }

    /**
     * maximumTN2602BoardsWith320VoIPChannelsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith320VoIPChannelsHIGH(String value) {
        this.maximumTN2602BoardsWith320VoIPChannelsHIGH = value;
    }

    /**
     * maximumNumberOfExpandedMeetMeConferencePorts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfExpandedMeetMeConferencePorts() {
        return maximumNumberOfExpandedMeetMeConferencePorts;
    }

    /**
     * maximumNumberOfExpandedMeetMeConferencePorts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfExpandedMeetMeConferencePorts(String value) {
        this.maximumNumberOfExpandedMeetMeConferencePorts = value;
    }

    /**
     * maximumNumberOfExpandedMeetMeConferencePortsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfExpandedMeetMeConferencePortsUSED() {
        return maximumNumberOfExpandedMeetMeConferencePortsUSED;
    }

    /**
     * maximumNumberOfExpandedMeetMeConferencePortsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfExpandedMeetMeConferencePortsUSED(String value) {
        this.maximumNumberOfExpandedMeetMeConferencePortsUSED = value;
    }

    /**
     * maximumNumberOfExpandedMeetMeConferencePortsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfExpandedMeetMeConferencePortsLOW() {
        return maximumNumberOfExpandedMeetMeConferencePortsLOW;
    }

    /**
     * maximumNumberOfExpandedMeetMeConferencePortsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfExpandedMeetMeConferencePortsLOW(String value) {
        this.maximumNumberOfExpandedMeetMeConferencePortsLOW = value;
    }

    /**
     * maximumNumberOfExpandedMeetMeConferencePortsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfExpandedMeetMeConferencePortsHIGH() {
        return maximumNumberOfExpandedMeetMeConferencePortsHIGH;
    }

    /**
     * maximumNumberOfExpandedMeetMeConferencePortsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfExpandedMeetMeConferencePortsHIGH(String value) {
        this.maximumNumberOfExpandedMeetMeConferencePortsHIGH = value;
    }

    /**
     * abbreviatedDialingEnhancedList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviatedDialingEnhancedList() {
        return abbreviatedDialingEnhancedList;
    }

    /**
     * abbreviatedDialingEnhancedList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviatedDialingEnhancedList(String value) {
        this.abbreviatedDialingEnhancedList = value;
    }

    /**
     * accessSecurityGatewayASG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessSecurityGatewayASG() {
        return accessSecurityGatewayASG;
    }

    /**
     * accessSecurityGatewayASG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessSecurityGatewayASG(String value) {
        this.accessSecurityGatewayASG = value;
    }

    /**
     * analogTrunkIncomingCallID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogTrunkIncomingCallID() {
        return analogTrunkIncomingCallID;
    }

    /**
     * analogTrunkIncomingCallID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogTrunkIncomingCallID(String value) {
        this.analogTrunkIncomingCallID = value;
    }

    /**
     * adGrpSysListDialingStartAt01 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADGrpSysListDialingStartAt01() {
        return adGrpSysListDialingStartAt01;
    }

    /**
     * adGrpSysListDialingStartAt01 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADGrpSysListDialingStartAt01(String value) {
        this.adGrpSysListDialingStartAt01 = value;
    }

    /**
     * answerSupervisionByCallClassifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerSupervisionByCallClassifier() {
        return answerSupervisionByCallClassifier;
    }

    /**
     * answerSupervisionByCallClassifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerSupervisionByCallClassifier(String value) {
        this.answerSupervisionByCallClassifier = value;
    }

    /**
     * ars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARS() {
        return ars;
    }

    /**
     * ars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARS(String value) {
        this.ars = value;
    }

    /**
     * arsaarPartitioning 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARSAARPartitioning() {
        return arsaarPartitioning;
    }

    /**
     * arsaarPartitioning 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARSAARPartitioning(String value) {
        this.arsaarPartitioning = value;
    }

    /**
     * arsaarDialingWithoutFAC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARSAARDialingWithoutFAC() {
        return arsaarDialingWithoutFAC;
    }

    /**
     * arsaarDialingWithoutFAC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARSAARDialingWithoutFAC(String value) {
        this.arsaarDialingWithoutFAC = value;
    }

    /**
     * asaiInterface 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIInterface() {
        return asaiInterface;
    }

    /**
     * asaiInterface 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIInterface(String value) {
        this.asaiInterface = value;
    }

    /**
     * asaiLinkCoreCapabilities 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAILinkCoreCapabilities() {
        return asaiLinkCoreCapabilities;
    }

    /**
     * asaiLinkCoreCapabilities 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAILinkCoreCapabilities(String value) {
        this.asaiLinkCoreCapabilities = value;
    }

    /**
     * asaiProprietaryAdjunctLinks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIProprietaryAdjunctLinks() {
        return asaiProprietaryAdjunctLinks;
    }

    /**
     * asaiProprietaryAdjunctLinks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIProprietaryAdjunctLinks(String value) {
        this.asaiProprietaryAdjunctLinks = value;
    }

    /**
     * asaiLinkPlusCapabilities 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAILinkPlusCapabilities() {
        return asaiLinkPlusCapabilities;
    }

    /**
     * asaiLinkPlusCapabilities 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAILinkPlusCapabilities(String value) {
        this.asaiLinkPlusCapabilities = value;
    }

    /**
     * asyncTransferModeATMPNC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncTransferModeATMPNC() {
        return asyncTransferModeATMPNC;
    }

    /**
     * asyncTransferModeATMPNC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncTransferModeATMPNC(String value) {
        this.asyncTransferModeATMPNC = value;
    }

    /**
     * asyncTransferModeATMTrunking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncTransferModeATMTrunking() {
        return asyncTransferModeATMTrunking;
    }

    /**
     * asyncTransferModeATMTrunking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncTransferModeATMTrunking(String value) {
        this.asyncTransferModeATMTrunking = value;
    }

    /**
     * atmwanSpareProcessor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMWANSpareProcessor() {
        return atmwanSpareProcessor;
    }

    /**
     * atmwanSpareProcessor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMWANSpareProcessor(String value) {
        this.atmwanSpareProcessor = value;
    }

    /**
     * atms 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMS() {
        return atms;
    }

    /**
     * atms 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMS(String value) {
        this.atms = value;
    }

    /**
     * attendantVectoring 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantVectoring() {
        return attendantVectoring;
    }

    /**
     * attendantVectoring 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantVectoring(String value) {
        this.attendantVectoring = value;
    }

    /**
     * audibleMessageWaiting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleMessageWaiting() {
        return audibleMessageWaiting;
    }

    /**
     * audibleMessageWaiting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleMessageWaiting(String value) {
        this.audibleMessageWaiting = value;
    }

    /**
     * authorizationCodes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCodes() {
        return authorizationCodes;
    }

    /**
     * authorizationCodes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCodes(String value) {
        this.authorizationCodes = value;
    }

    /**
     * backupClusterAutomaticTakeover 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupClusterAutomaticTakeover() {
        return backupClusterAutomaticTakeover;
    }

    /**
     * backupClusterAutomaticTakeover 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupClusterAutomaticTakeover(String value) {
        this.backupClusterAutomaticTakeover = value;
    }

    /**
     * casBranch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASBranch() {
        return casBranch;
    }

    /**
     * casBranch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASBranch(String value) {
        this.casBranch = value;
    }

    /**
     * casMain 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMain() {
        return casMain;
    }

    /**
     * casMain 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMain(String value) {
        this.casMain = value;
    }

    /**
     * changeCORByFAC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeCORByFAC() {
        return changeCORByFAC;
    }

    /**
     * changeCORByFAC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeCORByFAC(String value) {
        this.changeCORByFAC = value;
    }

    /**
     * computerTelephonyAdjunctLinks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerTelephonyAdjunctLinks() {
        return computerTelephonyAdjunctLinks;
    }

    /**
     * computerTelephonyAdjunctLinks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerTelephonyAdjunctLinks(String value) {
        this.computerTelephonyAdjunctLinks = value;
    }

    /**
     * cvgOfCallsRedirectedOffNet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvgOfCallsRedirectedOffNet() {
        return cvgOfCallsRedirectedOffNet;
    }

    /**
     * cvgOfCallsRedirectedOffNet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvgOfCallsRedirectedOffNet(String value) {
        this.cvgOfCallsRedirectedOffNet = value;
    }

    /**
     * dcsBasic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSBasic() {
        return dcsBasic;
    }

    /**
     * dcsBasic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSBasic(String value) {
        this.dcsBasic = value;
    }

    /**
     * dcsCallCoverage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSCallCoverage() {
        return dcsCallCoverage;
    }

    /**
     * dcsCallCoverage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSCallCoverage(String value) {
        this.dcsCallCoverage = value;
    }

    /**
     * dcsWithRerouting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSWithRerouting() {
        return dcsWithRerouting;
    }

    /**
     * dcsWithRerouting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSWithRerouting(String value) {
        this.dcsWithRerouting = value;
    }

    /**
     * dcsGlobal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSGlobal() {
        return dcsGlobal;
    }

    /**
     * dcsGlobal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSGlobal(String value) {
        this.dcsGlobal = value;
    }

    /**
     * digitalLossPlanModification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalLossPlanModification() {
        return digitalLossPlanModification;
    }

    /**
     * digitalLossPlanModification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalLossPlanModification(String value) {
        this.digitalLossPlanModification = value;
    }

    /**
     * ds1MSP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1MSP() {
        return ds1MSP;
    }

    /**
     * ds1MSP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1MSP(String value) {
        this.ds1MSP = value;
    }

    /**
     * ds1EchoCancellation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1EchoCancellation() {
        return ds1EchoCancellation;
    }

    /**
     * ds1EchoCancellation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1EchoCancellation(String value) {
        this.ds1EchoCancellation = value;
    }

    /**
     * emergencyAccessToAttendant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyAccessToAttendant() {
        return emergencyAccessToAttendant;
    }

    /**
     * emergencyAccessToAttendant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyAccessToAttendant(String value) {
        this.emergencyAccessToAttendant = value;
    }

    /**
     * enableDadminLogin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableDadminLogin() {
        return enableDadminLogin;
    }

    /**
     * enableDadminLogin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableDadminLogin(String value) {
        this.enableDadminLogin = value;
    }

    /**
     * enhancedConferencing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedConferencing() {
        return enhancedConferencing;
    }

    /**
     * enhancedConferencing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedConferencing(String value) {
        this.enhancedConferencing = value;
    }

    /**
     * enhancedEC500 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedEC500() {
        return enhancedEC500;
    }

    /**
     * enhancedEC500 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedEC500(String value) {
        this.enhancedEC500 = value;
    }

    /**
     * enterpriseSurvivableServer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseSurvivableServer() {
        return enterpriseSurvivableServer;
    }

    /**
     * enterpriseSurvivableServer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseSurvivableServer(String value) {
        this.enterpriseSurvivableServer = value;
    }

    /**
     * enterpriseWideLicensing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseWideLicensing() {
        return enterpriseWideLicensing;
    }

    /**
     * enterpriseWideLicensing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseWideLicensing(String value) {
        this.enterpriseWideLicensing = value;
    }

    /**
     * essAdministration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESSAdministration() {
        return essAdministration;
    }

    /**
     * essAdministration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESSAdministration(String value) {
        this.essAdministration = value;
    }

    /**
     * extendedCvgFwdAdmin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedCvgFwdAdmin() {
        return extendedCvgFwdAdmin;
    }

    /**
     * extendedCvgFwdAdmin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedCvgFwdAdmin(String value) {
        this.extendedCvgFwdAdmin = value;
    }

    /**
     * externalDeviceAlarmAdmin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDeviceAlarmAdmin() {
        return externalDeviceAlarmAdmin;
    }

    /**
     * externalDeviceAlarmAdmin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDeviceAlarmAdmin(String value) {
        this.externalDeviceAlarmAdmin = value;
    }

    /**
     * fivePortNetworksMaxPerMCC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFivePortNetworksMaxPerMCC() {
        return fivePortNetworksMaxPerMCC;
    }

    /**
     * fivePortNetworksMaxPerMCC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFivePortNetworksMaxPerMCC(String value) {
        this.fivePortNetworksMaxPerMCC = value;
    }

    /**
     * flexibleBilling 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexibleBilling() {
        return flexibleBilling;
    }

    /**
     * flexibleBilling 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexibleBilling(String value) {
        this.flexibleBilling = value;
    }

    /**
     * forcedEntryOfAccountCodes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedEntryOfAccountCodes() {
        return forcedEntryOfAccountCodes;
    }

    /**
     * forcedEntryOfAccountCodes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedEntryOfAccountCodes(String value) {
        this.forcedEntryOfAccountCodes = value;
    }

    /**
     * globalCallClassification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCallClassification() {
        return globalCallClassification;
    }

    /**
     * globalCallClassification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCallClassification(String value) {
        this.globalCallClassification = value;
    }

    /**
     * hospitalityBasic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalityBasic() {
        return hospitalityBasic;
    }

    /**
     * hospitalityBasic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalityBasic(String value) {
        this.hospitalityBasic = value;
    }

    /**
     * hospitalityG3V3Enhancements 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalityG3V3Enhancements() {
        return hospitalityG3V3Enhancements;
    }

    /**
     * hospitalityG3V3Enhancements 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalityG3V3Enhancements(String value) {
        this.hospitalityG3V3Enhancements = value;
    }

    /**
     * hospitalityParameterReduction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalityParameterReduction() {
        return hospitalityParameterReduction;
    }

    /**
     * hospitalityParameterReduction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalityParameterReduction(String value) {
        this.hospitalityParameterReduction = value;
    }

    /**
     * ipTrunks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPTrunks() {
        return ipTrunks;
    }

    /**
     * ipTrunks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPTrunks(String value) {
        this.ipTrunks = value;
    }

    /**
     * ipAttendantConsoles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAttendantConsoles() {
        return ipAttendantConsoles;
    }

    /**
     * ipAttendantConsoles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAttendantConsoles(String value) {
        this.ipAttendantConsoles = value;
    }

    /**
     * ipStations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStations() {
        return ipStations;
    }

    /**
     * ipStations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStations(String value) {
        this.ipStations = value;
    }

    /**
     * internetProtocolIPPNC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetProtocolIPPNC() {
        return internetProtocolIPPNC;
    }

    /**
     * internetProtocolIPPNC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetProtocolIPPNC(String value) {
        this.internetProtocolIPPNC = value;
    }

    /**
     * isdnFeaturePlus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNFeaturePlus() {
        return isdnFeaturePlus;
    }

    /**
     * isdnFeaturePlus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNFeaturePlus(String value) {
        this.isdnFeaturePlus = value;
    }

    /**
     * isdnNetworkCallRedirection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNNetworkCallRedirection() {
        return isdnNetworkCallRedirection;
    }

    /**
     * isdnNetworkCallRedirection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNNetworkCallRedirection(String value) {
        this.isdnNetworkCallRedirection = value;
    }

    /**
     * isdnbriTrunks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNBRITrunks() {
        return isdnbriTrunks;
    }

    /**
     * isdnbriTrunks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNBRITrunks(String value) {
        this.isdnbriTrunks = value;
    }

    /**
     * isdnpri 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNPRI() {
        return isdnpri;
    }

    /**
     * isdnpri 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNPRI(String value) {
        this.isdnpri = value;
    }

    /**
     * localSurvivableProcessor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSurvivableProcessor() {
        return localSurvivableProcessor;
    }

    /**
     * localSurvivableProcessor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSurvivableProcessor(String value) {
        this.localSurvivableProcessor = value;
    }

    /**
     * maliciousCallTrace 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaliciousCallTrace() {
        return maliciousCallTrace;
    }

    /**
     * maliciousCallTrace 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaliciousCallTrace(String value) {
        this.maliciousCallTrace = value;
    }

    /**
     * mediaEncryptionOverIP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaEncryptionOverIP() {
        return mediaEncryptionOverIP;
    }

    /**
     * mediaEncryptionOverIP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaEncryptionOverIP(String value) {
        this.mediaEncryptionOverIP = value;
    }

    /**
     * modeCodeForCentralizedVoiceMail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeCodeForCentralizedVoiceMail() {
        return modeCodeForCentralizedVoiceMail;
    }

    /**
     * modeCodeForCentralizedVoiceMail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeCodeForCentralizedVoiceMail(String value) {
        this.modeCodeForCentralizedVoiceMail = value;
    }

    /**
     * modeCodeInterface 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeCodeInterface() {
        return modeCodeInterface;
    }

    /**
     * modeCodeInterface 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeCodeInterface(String value) {
        this.modeCodeInterface = value;
    }

    /**
     * multifrequencySignaling 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultifrequencySignaling() {
        return multifrequencySignaling;
    }

    /**
     * multifrequencySignaling 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultifrequencySignaling(String value) {
        this.multifrequencySignaling = value;
    }

    /**
     * multimediaApplServerInterfaceMASI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaApplServerInterfaceMASI() {
        return multimediaApplServerInterfaceMASI;
    }

    /**
     * multimediaApplServerInterfaceMASI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaApplServerInterfaceMASI(String value) {
        this.multimediaApplServerInterfaceMASI = value;
    }

    /**
     * multimediaCallHandlingBasic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaCallHandlingBasic() {
        return multimediaCallHandlingBasic;
    }

    /**
     * multimediaCallHandlingBasic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaCallHandlingBasic(String value) {
        this.multimediaCallHandlingBasic = value;
    }

    /**
     * multimediaCallHandlingEnhanced 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaCallHandlingEnhanced() {
        return multimediaCallHandlingEnhanced;
    }

    /**
     * multimediaCallHandlingEnhanced 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaCallHandlingEnhanced(String value) {
        this.multimediaCallHandlingEnhanced = value;
    }

    /**
     * multimediaIPSIPTrunking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaIPSIPTrunking() {
        return multimediaIPSIPTrunking;
    }

    /**
     * multimediaIPSIPTrunking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaIPSIPTrunking(String value) {
        this.multimediaIPSIPTrunking = value;
    }

    /**
     * multinationalLocations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultinationalLocations() {
        return multinationalLocations;
    }

    /**
     * multinationalLocations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultinationalLocations(String value) {
        this.multinationalLocations = value;
    }

    /**
     * multipleLevelPrecedenceAndPreemption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleLevelPrecedenceAndPreemption() {
        return multipleLevelPrecedenceAndPreemption;
    }

    /**
     * multipleLevelPrecedenceAndPreemption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleLevelPrecedenceAndPreemption(String value) {
        this.multipleLevelPrecedenceAndPreemption = value;
    }

    /**
     * multipleLocations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleLocations() {
        return multipleLocations;
    }

    /**
     * multipleLocations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleLocations(String value) {
        this.multipleLocations = value;
    }

    /**
     * personalStationAccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalStationAccess() {
        return personalStationAccess;
    }

    /**
     * personalStationAccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalStationAccess(String value) {
        this.personalStationAccess = value;
    }

    /**
     * noLicenseModeDisabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoLicenseModeDisabled() {
        return noLicenseModeDisabled;
    }

    /**
     * noLicenseModeDisabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoLicenseModeDisabled(String value) {
        this.noLicenseModeDisabled = value;
    }

    /**
     * postedMessages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostedMessages() {
        return postedMessages;
    }

    /**
     * postedMessages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostedMessages(String value) {
        this.postedMessages = value;
    }

    /**
     * pncDuplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNCDuplication() {
        return pncDuplication;
    }

    /**
     * pncDuplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNCDuplication(String value) {
        this.pncDuplication = value;
    }

    /**
     * portNetworkSupport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNetworkSupport() {
        return portNetworkSupport;
    }

    /**
     * portNetworkSupport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNetworkSupport(String value) {
        this.portNetworkSupport = value;
    }

    /**
     * premierBusinessPackage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremierBusinessPackage() {
        return premierBusinessPackage;
    }

    /**
     * premierBusinessPackage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremierBusinessPackage(String value) {
        this.premierBusinessPackage = value;
    }

    /**
     * processorAndSystemMSP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorAndSystemMSP() {
        return processorAndSystemMSP;
    }

    /**
     * processorAndSystemMSP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorAndSystemMSP(String value) {
        this.processorAndSystemMSP = value;
    }

    /**
     * privateNetworking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateNetworking() {
        return privateNetworking;
    }

    /**
     * privateNetworking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateNetworking(String value) {
        this.privateNetworking = value;
    }

    /**
     * processorEthernet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorEthernet() {
        return processorEthernet;
    }

    /**
     * processorEthernet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorEthernet(String value) {
        this.processorEthernet = value;
    }

    /**
     * r95Capabilities 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR95Capabilities() {
        return r95Capabilities;
    }

    /**
     * r95Capabilities 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR95Capabilities(String value) {
        this.r95Capabilities = value;
    }

    /**
     * remoteOffice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOffice() {
        return remoteOffice;
    }

    /**
     * remoteOffice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOffice(String value) {
        this.remoteOffice = value;
    }

    /**
     * restrictCallForwardOffNet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictCallForwardOffNet() {
        return restrictCallForwardOffNet;
    }

    /**
     * restrictCallForwardOffNet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictCallForwardOffNet(String value) {
        this.restrictCallForwardOffNet = value;
    }

    /**
     * secondaryDataModule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDataModule() {
        return secondaryDataModule;
    }

    /**
     * secondaryDataModule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDataModule(String value) {
        this.secondaryDataModule = value;
    }

    /**
     * stationAndTrunkMSP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationAndTrunkMSP() {
        return stationAndTrunkMSP;
    }

    /**
     * stationAndTrunkMSP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationAndTrunkMSP(String value) {
        this.stationAndTrunkMSP = value;
    }

    /**
     * stationAsVirtualExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationAsVirtualExtension() {
        return stationAsVirtualExtension;
    }

    /**
     * stationAsVirtualExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationAsVirtualExtension(String value) {
        this.stationAsVirtualExtension = value;
    }

    /**
     * systemManagementDataTransfer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemManagementDataTransfer() {
        return systemManagementDataTransfer;
    }

    /**
     * systemManagementDataTransfer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemManagementDataTransfer(String value) {
        this.systemManagementDataTransfer = value;
    }

    /**
     * tenantPartitioning 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantPartitioning() {
        return tenantPartitioning;
    }

    /**
     * tenantPartitioning 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantPartitioning(String value) {
        this.tenantPartitioning = value;
    }

    /**
     * terminalTransInitTTI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalTransInitTTI() {
        return terminalTransInitTTI;
    }

    /**
     * terminalTransInitTTI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalTransInitTTI(String value) {
        this.terminalTransInitTTI = value;
    }

    /**
     * timeOfDayRouting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfDayRouting() {
        return timeOfDayRouting;
    }

    /**
     * timeOfDayRouting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfDayRouting(String value) {
        this.timeOfDayRouting = value;
    }

    /**
     * uniformDialingPlan 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniformDialingPlan() {
        return uniformDialingPlan;
    }

    /**
     * uniformDialingPlan 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniformDialingPlan(String value) {
        this.uniformDialingPlan = value;
    }

    /**
     * usageAllocationEnhancements 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAllocationEnhancements() {
        return usageAllocationEnhancements;
    }

    /**
     * usageAllocationEnhancements 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAllocationEnhancements(String value) {
        this.usageAllocationEnhancements = value;
    }

    /**
     * tn2501VALMaximumCapacity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2501VALMaximumCapacity() {
        return tn2501VALMaximumCapacity;
    }

    /**
     * tn2501VALMaximumCapacity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2501VALMaximumCapacity(String value) {
        this.tn2501VALMaximumCapacity = value;
    }

    /**
     * voiceMailApplicationSupport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailApplicationSupport() {
        return voiceMailApplicationSupport;
    }

    /**
     * voiceMailApplicationSupport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailApplicationSupport(String value) {
        this.voiceMailApplicationSupport = value;
    }

    /**
     * widebandSwitching 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidebandSwitching() {
        return widebandSwitching;
    }

    /**
     * widebandSwitching 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidebandSwitching(String value) {
        this.widebandSwitching = value;
    }

    /**
     * wireless 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireless() {
        return wireless;
    }

    /**
     * wireless 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireless(String value) {
        this.wireless = value;
    }

    /**
     * callCenterRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCenterRelease() {
        return callCenterRelease;
    }

    /**
     * callCenterRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCenterRelease(String value) {
        this.callCenterRelease = value;
    }

    /**
     * acd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACD() {
        return acd;
    }

    /**
     * acd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACD(String value) {
        this.acd = value;
    }

    /**
     * bcmsBasic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSBasic() {
        return bcmsBasic;
    }

    /**
     * bcmsBasic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSBasic(String value) {
        this.bcmsBasic = value;
    }

    /**
     * bcmsVuStatsServiceLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSVuStatsServiceLevel() {
        return bcmsVuStatsServiceLevel;
    }

    /**
     * bcmsVuStatsServiceLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSVuStatsServiceLevel(String value) {
        this.bcmsVuStatsServiceLevel = value;
    }

    /**
     * bsrLocalTreatmentForIPAndISDN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRLocalTreatmentForIPAndISDN() {
        return bsrLocalTreatmentForIPAndISDN;
    }

    /**
     * bsrLocalTreatmentForIPAndISDN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRLocalTreatmentForIPAndISDN(String value) {
        this.bsrLocalTreatmentForIPAndISDN = value;
    }

    /**
     * businessAdvocate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAdvocate() {
        return businessAdvocate;
    }

    /**
     * businessAdvocate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAdvocate(String value) {
        this.businessAdvocate = value;
    }

    /**
     * callWorkCodes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWorkCodes() {
        return callWorkCodes;
    }

    /**
     * callWorkCodes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWorkCodes(String value) {
        this.callWorkCodes = value;
    }

    /**
     * dtmfFeedbackSignalsForVRU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMFFeedbackSignalsForVRU() {
        return dtmfFeedbackSignalsForVRU;
    }

    /**
     * dtmfFeedbackSignalsForVRU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMFFeedbackSignalsForVRU(String value) {
        this.dtmfFeedbackSignalsForVRU = value;
    }

    /**
     * dynamicAdvocate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicAdvocate() {
        return dynamicAdvocate;
    }

    /**
     * dynamicAdvocate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicAdvocate(String value) {
        this.dynamicAdvocate = value;
    }

    /**
     * expertAgentSelectionEAS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertAgentSelectionEAS() {
        return expertAgentSelectionEAS;
    }

    /**
     * expertAgentSelectionEAS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertAgentSelectionEAS(String value) {
        this.expertAgentSelectionEAS = value;
    }

    /**
     * easphd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEASPHD() {
        return easphd;
    }

    /**
     * easphd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEASPHD(String value) {
        this.easphd = value;
    }

    /**
     * forcedACDCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedACDCalls() {
        return forcedACDCalls;
    }

    /**
     * forcedACDCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedACDCalls(String value) {
        this.forcedACDCalls = value;
    }

    /**
     * leastOccupiedAgent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeastOccupiedAgent() {
        return leastOccupiedAgent;
    }

    /**
     * leastOccupiedAgent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeastOccupiedAgent(String value) {
        this.leastOccupiedAgent = value;
    }

    /**
     * lookaheadInterflowLAI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookaheadInterflowLAI() {
        return lookaheadInterflowLAI;
    }

    /**
     * lookaheadInterflowLAI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookaheadInterflowLAI(String value) {
        this.lookaheadInterflowLAI = value;
    }

    /**
     * multipleCallHandlingOnRequest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleCallHandlingOnRequest() {
        return multipleCallHandlingOnRequest;
    }

    /**
     * multipleCallHandlingOnRequest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleCallHandlingOnRequest(String value) {
        this.multipleCallHandlingOnRequest = value;
    }

    /**
     * multipleCallHandlingForced 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleCallHandlingForced() {
        return multipleCallHandlingForced;
    }

    /**
     * multipleCallHandlingForced 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleCallHandlingForced(String value) {
        this.multipleCallHandlingForced = value;
    }

    /**
     * pasteDisplayPBXDataOnPhone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASTEDisplayPBXDataOnPhone() {
        return pasteDisplayPBXDataOnPhone;
    }

    /**
     * pasteDisplayPBXDataOnPhone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASTEDisplayPBXDataOnPhone(String value) {
        this.pasteDisplayPBXDataOnPhone = value;
    }

    /**
     * reasonCodes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodes() {
        return reasonCodes;
    }

    /**
     * reasonCodes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodes(String value) {
        this.reasonCodes = value;
    }

    /**
     * serviceLevelMaximizer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevelMaximizer() {
        return serviceLevelMaximizer;
    }

    /**
     * serviceLevelMaximizer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevelMaximizer(String value) {
        this.serviceLevelMaximizer = value;
    }

    /**
     * serviceObservingBasic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObservingBasic() {
        return serviceObservingBasic;
    }

    /**
     * serviceObservingBasic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObservingBasic(String value) {
        this.serviceObservingBasic = value;
    }

    /**
     * serviceObservingRemoteByFAC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObservingRemoteByFAC() {
        return serviceObservingRemoteByFAC;
    }

    /**
     * serviceObservingRemoteByFAC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObservingRemoteByFAC(String value) {
        this.serviceObservingRemoteByFAC = value;
    }

    /**
     * serviceObservingVDNs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObservingVDNs() {
        return serviceObservingVDNs;
    }

    /**
     * serviceObservingVDNs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObservingVDNs(String value) {
        this.serviceObservingVDNs = value;
    }

    /**
     * timedACW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimedACW() {
        return timedACW;
    }

    /**
     * timedACW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimedACW(String value) {
        this.timedACW = value;
    }

    /**
     * vectoringBasic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringBasic() {
        return vectoringBasic;
    }

    /**
     * vectoringBasic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringBasic(String value) {
        this.vectoringBasic = value;
    }

    /**
     * vectoringPrompting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringPrompting() {
        return vectoringPrompting;
    }

    /**
     * vectoringPrompting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringPrompting(String value) {
        this.vectoringPrompting = value;
    }

    /**
     * vectoringG3V4Enhanced 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringG3V4Enhanced() {
        return vectoringG3V4Enhanced;
    }

    /**
     * vectoringG3V4Enhanced 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringG3V4Enhanced(String value) {
        this.vectoringG3V4Enhanced = value;
    }

    /**
     * vectoring30Enhanced 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoring30Enhanced() {
        return vectoring30Enhanced;
    }

    /**
     * vectoring30Enhanced 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoring30Enhanced(String value) {
        this.vectoring30Enhanced = value;
    }

    /**
     * vectoringANIIIDigitsRouting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringANIIIDigitsRouting() {
        return vectoringANIIIDigitsRouting;
    }

    /**
     * vectoringANIIIDigitsRouting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringANIIIDigitsRouting(String value) {
        this.vectoringANIIIDigitsRouting = value;
    }

    /**
     * vectoringG3V4AdvancedRouting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringG3V4AdvancedRouting() {
        return vectoringG3V4AdvancedRouting;
    }

    /**
     * vectoringG3V4AdvancedRouting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringG3V4AdvancedRouting(String value) {
        this.vectoringG3V4AdvancedRouting = value;
    }

    /**
     * vectoringCINFO 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringCINFO() {
        return vectoringCINFO;
    }

    /**
     * vectoringCINFO 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringCINFO(String value) {
        this.vectoringCINFO = value;
    }

    /**
     * vectoringBestServiceRouting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringBestServiceRouting() {
        return vectoringBestServiceRouting;
    }

    /**
     * vectoringBestServiceRouting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringBestServiceRouting(String value) {
        this.vectoringBestServiceRouting = value;
    }

    /**
     * vectoringHolidays 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringHolidays() {
        return vectoringHolidays;
    }

    /**
     * vectoringHolidays 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringHolidays(String value) {
        this.vectoringHolidays = value;
    }

    /**
     * vectoringVariables 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringVariables() {
        return vectoringVariables;
    }

    /**
     * vectoringVariables 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringVariables(String value) {
        this.vectoringVariables = value;
    }

    /**
     * vdnOfOriginAnnouncement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNOfOriginAnnouncement() {
        return vdnOfOriginAnnouncement;
    }

    /**
     * vdnOfOriginAnnouncement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNOfOriginAnnouncement(String value) {
        this.vdnOfOriginAnnouncement = value;
    }

    /**
     * vdnReturnDestination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNReturnDestination() {
        return vdnReturnDestination;
    }

    /**
     * vdnReturnDestination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNReturnDestination(String value) {
        this.vdnReturnDestination = value;
    }

    /**
     * vuStats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuStats() {
        return vuStats;
    }

    /**
     * vuStats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuStats(String value) {
        this.vuStats = value;
    }

    /**
     * vuStatsG3V4Enhanced 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuStatsG3V4Enhanced() {
        return vuStatsG3V4Enhanced;
    }

    /**
     * vuStatsG3V4Enhanced 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuStatsG3V4Enhanced(String value) {
        this.vuStatsG3V4Enhanced = value;
    }

    /**
     * loggedInACDAgents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDAgents() {
        return loggedInACDAgents;
    }

    /**
     * loggedInACDAgents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDAgents(String value) {
        this.loggedInACDAgents = value;
    }

    /**
     * loggedInACDAgentsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDAgentsUSED() {
        return loggedInACDAgentsUSED;
    }

    /**
     * loggedInACDAgentsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDAgentsUSED(String value) {
        this.loggedInACDAgentsUSED = value;
    }

    /**
     * loggedInACDAgentsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDAgentsLOW() {
        return loggedInACDAgentsLOW;
    }

    /**
     * loggedInACDAgentsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDAgentsLOW(String value) {
        this.loggedInACDAgentsLOW = value;
    }

    /**
     * loggedInACDAgentsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDAgentsHIGH() {
        return loggedInACDAgentsHIGH;
    }

    /**
     * loggedInACDAgentsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDAgentsHIGH(String value) {
        this.loggedInACDAgentsHIGH = value;
    }

    /**
     * loggedInAdvocateAgents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocateAgents() {
        return loggedInAdvocateAgents;
    }

    /**
     * loggedInAdvocateAgents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocateAgents(String value) {
        this.loggedInAdvocateAgents = value;
    }

    /**
     * loggedInAdvocateAgentsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocateAgentsUSED() {
        return loggedInAdvocateAgentsUSED;
    }

    /**
     * loggedInAdvocateAgentsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocateAgentsUSED(String value) {
        this.loggedInAdvocateAgentsUSED = value;
    }

    /**
     * loggedInAdvocateAgentsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocateAgentsLOW() {
        return loggedInAdvocateAgentsLOW;
    }

    /**
     * loggedInAdvocateAgentsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocateAgentsLOW(String value) {
        this.loggedInAdvocateAgentsLOW = value;
    }

    /**
     * loggedInAdvocateAgentsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocateAgentsHIGH() {
        return loggedInAdvocateAgentsHIGH;
    }

    /**
     * loggedInAdvocateAgentsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocateAgentsHIGH(String value) {
        this.loggedInAdvocateAgentsHIGH = value;
    }

    /**
     * loggedInIPSoftphoneAgents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftphoneAgents() {
        return loggedInIPSoftphoneAgents;
    }

    /**
     * loggedInIPSoftphoneAgents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftphoneAgents(String value) {
        this.loggedInIPSoftphoneAgents = value;
    }

    /**
     * loggedInIPSoftphoneAgentsUSED 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftphoneAgentsUSED() {
        return loggedInIPSoftphoneAgentsUSED;
    }

    /**
     * loggedInIPSoftphoneAgentsUSED 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftphoneAgentsUSED(String value) {
        this.loggedInIPSoftphoneAgentsUSED = value;
    }

    /**
     * loggedInIPSoftphoneAgentsLOW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftphoneAgentsLOW() {
        return loggedInIPSoftphoneAgentsLOW;
    }

    /**
     * loggedInIPSoftphoneAgentsLOW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftphoneAgentsLOW(String value) {
        this.loggedInIPSoftphoneAgentsLOW = value;
    }

    /**
     * loggedInIPSoftphoneAgentsHIGH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftphoneAgentsHIGH() {
        return loggedInIPSoftphoneAgentsHIGH;
    }

    /**
     * loggedInIPSoftphoneAgentsHIGH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftphoneAgentsHIGH(String value) {
        this.loggedInIPSoftphoneAgentsHIGH = value;
    }

    /**
     * basicCallSetup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicCallSetup() {
        return basicCallSetup;
    }

    /**
     * basicCallSetup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicCallSetup(String value) {
        this.basicCallSetup = value;
    }

    /**
     * basicSupplementaryServices 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicSupplementaryServices() {
        return basicSupplementaryServices;
    }

    /**
     * basicSupplementaryServices 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicSupplementaryServices(String value) {
        this.basicSupplementaryServices = value;
    }

    /**
     * centralizedAttendant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralizedAttendant() {
        return centralizedAttendant;
    }

    /**
     * centralizedAttendant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralizedAttendant(String value) {
        this.centralizedAttendant = value;
    }

    /**
     * interworkingWithDCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterworkingWithDCS() {
        return interworkingWithDCS;
    }

    /**
     * interworkingWithDCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterworkingWithDCS(String value) {
        this.interworkingWithDCS = value;
    }

    /**
     * supplementaryServicesWithRerouting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryServicesWithRerouting() {
        return supplementaryServicesWithRerouting;
    }

    /**
     * supplementaryServicesWithRerouting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryServicesWithRerouting(String value) {
        this.supplementaryServicesWithRerouting = value;
    }

    /**
     * transferIntoQSIGVoiceMail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferIntoQSIGVoiceMail() {
        return transferIntoQSIGVoiceMail;
    }

    /**
     * transferIntoQSIGVoiceMail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferIntoQSIGVoiceMail(String value) {
        this.transferIntoQSIGVoiceMail = value;
    }

    /**
     * valueAddedVALU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAddedVALU() {
        return valueAddedVALU;
    }

    /**
     * valueAddedVALU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAddedVALU(String value) {
        this.valueAddedVALU = value;
    }

    /**
     * adjunctCallControl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctCallControl() {
        return adjunctCallControl;
    }

    /**
     * adjunctCallControl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctCallControl(String value) {
        this.adjunctCallControl = value;
    }

    /**
     * adjunctRouting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctRouting() {
        return adjunctRouting;
    }

    /**
     * adjunctRouting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctRouting(String value) {
        this.adjunctRouting = value;
    }

    /**
     * domainControl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainControl() {
        return domainControl;
    }

    /**
     * domainControl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainControl(String value) {
        this.domainControl = value;
    }

    /**
     * eventNotification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventNotification() {
        return eventNotification;
    }

    /**
     * eventNotification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventNotification(String value) {
        this.eventNotification = value;
    }

    /**
     * requestFeature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestFeature() {
        return requestFeature;
    }

    /**
     * requestFeature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestFeature(String value) {
        this.requestFeature = value;
    }

    /**
     * setValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetValue() {
        return setValue;
    }

    /**
     * setValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetValue(String value) {
        this.setValue = value;
    }

    /**
     * answeringMachineDetection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringMachineDetection() {
        return answeringMachineDetection;
    }

    /**
     * answeringMachineDetection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringMachineDetection(String value) {
        this.answeringMachineDetection = value;
    }

    /**
     * selectiveListening 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectiveListening() {
        return selectiveListening;
    }

    /**
     * selectiveListening 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectiveListening(String value) {
        this.selectiveListening = value;
    }

    /**
     * switchClassifiedOutboundCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchClassifiedOutboundCalls() {
        return switchClassifiedOutboundCalls;
    }

    /**
     * switchClassifiedOutboundCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchClassifiedOutboundCalls(String value) {
        this.switchClassifiedOutboundCalls = value;
    }

    /**
     * proprietaryApplications 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryApplications() {
        return proprietaryApplications;
    }

    /**
     * proprietaryApplications 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryApplications(String value) {
        this.proprietaryApplications = value;
    }

    /**
     * ctiStations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTIStations() {
        return ctiStations;
    }

    /**
     * ctiStations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTIStations(String value) {
        this.ctiStations = value;
    }

    /**
     * increasedAdjunctRouteCapacity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncreasedAdjunctRouteCapacity() {
        return increasedAdjunctRouteCapacity;
    }

    /**
     * increasedAdjunctRouteCapacity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncreasedAdjunctRouteCapacity(String value) {
        this.increasedAdjunctRouteCapacity = value;
    }

    /**
     * phantomCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhantomCalls() {
        return phantomCalls;
    }

    /**
     * phantomCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhantomCalls(String value) {
        this.phantomCalls = value;
    }

    /**
     * agentStates 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentStates() {
        return agentStates;
    }

    /**
     * agentStates 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentStates(String value) {
        this.agentStates = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getProductID() {
        if (productID == null) {
            productID = new ArrayList<ArrayType>();
        }
        return this.productID;
    }

    /**
     * Gets the value of the limit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLimit() {
        if (limit == null) {
            limit = new ArrayList<ArrayType>();
        }
        return this.limit;
    }

    /**
     * Gets the value of the used property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the used property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUsed() {
        if (used == null) {
            used = new ArrayList<ArrayType>();
        }
        return this.used;
    }

    /**
     * Gets the value of the release property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the release property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRelease() {
        if (release == null) {
            release = new ArrayList<ArrayType>();
        }
        return this.release;
    }

}
