
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hunt_to_Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Jack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survivable_GK_Node_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lock_Messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MASI_Node_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Map_to_Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automatic_Moves" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Access_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ringing_Pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Lamp_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM_Remote_Data_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM_Complex_Data_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="One_Step_Clearing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endpt_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRV_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Reception" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Activation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDR_Privacy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Redirect_Notification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Per_Button_Ring_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bridged_Call_Alerting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active_Station_Ringing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idle_Active_Ringing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H320_Conversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Audio_Hairpinning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prime_Appearance_Preference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expansion_Module_24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_IP_IP_Audio_Connections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loss_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Feature_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Module_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Office_Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_After_Forwarding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Emergency_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emergency_Location_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Configuration_Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMobile_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Log_External_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speakerphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cell_Phone_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mapping_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobility_Trunk_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Switchhook_Flash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distinctive_Audible_Alert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Waiting_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Length_of_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Link_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDIX_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Messaging_Server_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Select_Idle_Appear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conf_Trans_On_Primary_Appearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Msg_Retrieval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idle_Appearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bridged_Idle_Line" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restrict_Last_Appearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flash_for_Answer_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPN___Send_Calling_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Early_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audible_Msg_Waiting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Client_Redirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Select_Last_Used_Appear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restricted_Number_Char" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Headset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mounting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cord_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Set_Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hot_Line_Destination_List_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_BCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_COS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_ITC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Special_Dialing_Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Abbreviated_Dialing_Dial_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Multimedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Private_Line_Emulation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_Duplex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_Speed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_ITC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_Data_Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MWI_Served_User_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Waiting_Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ignore_Rotary_Digits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Waiting_Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Att_Call_Waiting_Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adjunct_Supervision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Hoteling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Softphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Video" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EC500_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_Scripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unconditional_For_Internal_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unconditional_For_Internal_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unconditional_For_External_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unconditional_For_External_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_For_Internal_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_For_Internal_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_For_External_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_For_External_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Reply_For_Internal_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Reply_For_Internal_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Reply_For_External_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Reply_For_External_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Off_Premises_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_Balance_Network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passageway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Cartridge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mute_Button_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customizable_Labels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Caller_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Caller_ID_Message_Waiting_Indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fixed_TEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secure_Terminal_Equipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIM_Support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIM_Maintenance_and_Management" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survivable_COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survivable_Trunk_Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTMF_over_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recall_Rotary_Digit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Always_Use" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMU_Login_Allowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calls_Allowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endpt_Init" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Block_Alerting_if_IP_Principal_Logged_Off" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bridged_Appearance_Origination_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_Auto_Callback_Without_Flash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Button_Modules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Appearance_Display_Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Phone_Group_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Precedence_Call_Waiting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_CF_Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIP_Trunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_of_Day_Lock_Table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type_of_3PCC_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XOIP_Endpoint_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maintenance_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alt_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}StationArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType", propOrder = {
    "extension",
    "type",
    "port",
    "name",
    "coveragePath1",
    "coveragePath2",
    "huntToStation",
    "cor",
    "cos",
    "room",
    "jack",
    "cable",
    "dataExtension",
    "survivableGKNodeName",
    "tn",
    "lockMessages",
    "securityCode",
    "masiNodeNumber",
    "mapToStation",
    "automaticMoves",
    "dataModule",
    "displayModule",
    "displayLanguage",
    "ipei",
    "accessCode",
    "home",
    "ringingPattern",
    "messageLampExt",
    "mmRemoteDataExt",
    "mmComplexDataExt",
    "oneStepClearing",
    "countryProtocol",
    "endptID",
    "crvLength",
    "lwcReception",
    "lwcActivation",
    "cdrPrivacy",
    "redirectNotification",
    "perButtonRingControl",
    "bridgedCallAlerting",
    "activeStationRinging",
    "idleActiveRinging",
    "h320Conversion",
    "ipAudioHairpinning",
    "primeAppearancePreference",
    "expansionModule24",
    "directIPIPAudioConnections",
    "lossGroup",
    "featureModule",
    "coverageModule",
    "coverageModule1",
    "remoteOfficePhone",
    "coverageAfterForwarding",
    "ipEmergencyCalls",
    "emergencyLocationExt",
    "configurationSet",
    "xMobileType",
    "lwcLogExternalCalls",
    "speakerphone",
    "dialPrefix",
    "cellPhoneNumber",
    "mappingMode",
    "mobilityTrunkGroup",
    "switchhookFlash",
    "distinctiveAudibleAlert",
    "messageWaitingType",
    "lengthOfDisplay",
    "serviceLinkMode",
    "multimediaMode",
    "audixName",
    "messagingServerName",
    "autoSelectIdleAppear",
    "confTransOnPrimaryAppearance",
    "coverageMsgRetrieval",
    "autoAnswer",
    "dataRestriction",
    "idleAppearance",
    "bridgedIdleLine",
    "restrictLastAppearance",
    "flashForAnswerHold",
    "cpnSendCallingNo",
    "multimediaEarlyAnswer",
    "audibleMsgWaiting",
    "displayClientRedirection",
    "selectLastUsedAppear",
    "restrictedNumberChar",
    "floor",
    "building",
    "headset",
    "speaker",
    "mounting",
    "cordLength",
    "setColor",
    "hotLineDestinationListNumber",
    "dialCode",
    "info1",
    "info2",
    "dataName",
    "dataBCC",
    "dataCOS",
    "dataCOR",
    "dataITC",
    "dataTN",
    "dataSpecialDialingOption",
    "dataAbbreviatedDialingDialCode",
    "dataMultimedia",
    "dataPrivateLineEmulation",
    "dataDefaultDuplex",
    "dataDefaultMode",
    "dataDefaultSpeed",
    "dataDefaultITC",
    "dataDefaultDataApplication",
    "mwiServedUserType",
    "tests",
    "messageWaitingIndicator",
    "ignoreRotaryDigits",
    "callWaitingIndicator",
    "attCallWaitingIndicator",
    "adjunctSupervision",
    "ipHoteling",
    "ipSoftphone",
    "ipVideo",
    "ec500State",
    "nativeName1",
    "nativeName2",
    "nativeName3",
    "nativeName4",
    "nativeName5",
    "nativeNameScripts",
    "unconditionalForInternalCallsTo",
    "unconditionalForInternalCallsToActive",
    "unconditionalForExternalCallsTo",
    "unconditionalForExternalCallsToActive",
    "busyForInternalCallsTo",
    "busyForInternalCallsToActive",
    "busyForExternalCallsTo",
    "busyForExternalCallsToActive",
    "noReplyForInternalCallsTo",
    "noReplyForInternalCallsToActive",
    "noReplyForExternalCallsTo",
    "noReplyForExternalCallsToActive",
    "set",
    "dataOption",
    "offPremisesStations",
    "rBalanceNetwork",
    "passageway",
    "model",
    "displayCartridge",
    "muteButtonEnabled",
    "customizableLabels",
    "displayCallerID",
    "callerIDMessageWaitingIndication",
    "xid",
    "fixedTEI",
    "tei",
    "secureTerminalEquipment",
    "mimSupport",
    "mimMaintenanceAndManagement",
    "spid",
    "survivableCOR",
    "survivableTrunkDestination",
    "dtmfOverIP",
    "recallRotaryDigit",
    "alwaysUse",
    "emuLoginAllowed",
    "callsAllowed",
    "endptInit",
    "blockAlertingIfIPPrincipalLoggedOff",
    "bridgedAppearanceOriginationRestriction",
    "busyAutoCallbackWithoutFlash",
    "buttonModules",
    "callAppearanceDisplayFormat",
    "ipPhoneGroupID",
    "precedenceCallWaiting",
    "saccfOverride",
    "sipTrunk",
    "timeOfDayLockTable",
    "typeOf3PCCEnabled",
    "xoipEndpointType",
    "resultPort",
    "maintenanceName",
    "altName",
    "result",
    "errorCode",
    "location",
    "abbreviatedDialingListType",
    "abbreviatedDialingListNumber",
    "buttonData1",
    "buttonData2",
    "buttonData3",
    "buttonData4",
    "buttonData5",
    "buttonData6",
    "buttonData7",
    "dataList1",
    "dataPersonalListNumber"
})
public class StationType {

    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Coverage_Path_1")
    protected String coveragePath1;
    @XmlElement(name = "Coverage_Path_2")
    protected String coveragePath2;
    @XmlElement(name = "Hunt_to_Station")
    protected String huntToStation;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "COS")
    protected String cos;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "Jack")
    protected String jack;
    @XmlElement(name = "Cable")
    protected String cable;
    @XmlElement(name = "Data_Extension")
    protected String dataExtension;
    @XmlElement(name = "Survivable_GK_Node_Name")
    protected String survivableGKNodeName;
    @XmlElement(name = "TN")
    protected String tn;
    @XmlElement(name = "Lock_Messages")
    protected String lockMessages;
    @XmlElement(name = "Security_Code")
    protected String securityCode;
    @XmlElement(name = "MASI_Node_Number")
    protected String masiNodeNumber;
    @XmlElement(name = "Map_to_Station")
    protected String mapToStation;
    @XmlElement(name = "Automatic_Moves")
    protected String automaticMoves;
    @XmlElement(name = "Data_Module")
    protected String dataModule;
    @XmlElement(name = "Display_Module")
    protected String displayModule;
    @XmlElement(name = "Display_Language")
    protected String displayLanguage;
    @XmlElement(name = "IPEI")
    protected String ipei;
    @XmlElement(name = "Access_Code")
    protected String accessCode;
    @XmlElement(name = "Home")
    protected String home;
    @XmlElement(name = "Ringing_Pattern")
    protected String ringingPattern;
    @XmlElement(name = "Message_Lamp_Ext")
    protected String messageLampExt;
    @XmlElement(name = "MM_Remote_Data_Ext")
    protected String mmRemoteDataExt;
    @XmlElement(name = "MM_Complex_Data_Ext")
    protected String mmComplexDataExt;
    @XmlElement(name = "One_Step_Clearing")
    protected String oneStepClearing;
    @XmlElement(name = "Country_Protocol")
    protected String countryProtocol;
    @XmlElement(name = "Endpt_ID")
    protected String endptID;
    @XmlElement(name = "CRV_Length")
    protected String crvLength;
    @XmlElement(name = "LWC_Reception")
    protected String lwcReception;
    @XmlElement(name = "LWC_Activation")
    protected String lwcActivation;
    @XmlElement(name = "CDR_Privacy")
    protected String cdrPrivacy;
    @XmlElement(name = "Redirect_Notification")
    protected String redirectNotification;
    @XmlElement(name = "Per_Button_Ring_Control")
    protected String perButtonRingControl;
    @XmlElement(name = "Bridged_Call_Alerting")
    protected String bridgedCallAlerting;
    @XmlElement(name = "Active_Station_Ringing")
    protected String activeStationRinging;
    @XmlElement(name = "Idle_Active_Ringing")
    protected String idleActiveRinging;
    @XmlElement(name = "H320_Conversion")
    protected String h320Conversion;
    @XmlElement(name = "IP_Audio_Hairpinning")
    protected String ipAudioHairpinning;
    @XmlElement(name = "Prime_Appearance_Preference")
    protected String primeAppearancePreference;
    @XmlElement(name = "Expansion_Module_24")
    protected String expansionModule24;
    @XmlElement(name = "Direct_IP_IP_Audio_Connections")
    protected String directIPIPAudioConnections;
    @XmlElement(name = "Loss_Group")
    protected String lossGroup;
    @XmlElement(name = "Feature_Module")
    protected String featureModule;
    @XmlElement(name = "Coverage_Module")
    protected String coverageModule;
    @XmlElement(name = "Coverage_Module_1")
    protected String coverageModule1;
    @XmlElement(name = "Remote_Office_Phone")
    protected String remoteOfficePhone;
    @XmlElement(name = "Coverage_After_Forwarding")
    protected String coverageAfterForwarding;
    @XmlElement(name = "IP_Emergency_Calls")
    protected String ipEmergencyCalls;
    @XmlElement(name = "Emergency_Location_Ext")
    protected String emergencyLocationExt;
    @XmlElement(name = "Configuration_Set")
    protected String configurationSet;
    @XmlElement(name = "XMobile_Type")
    protected String xMobileType;
    @XmlElement(name = "LWC_Log_External_Calls")
    protected String lwcLogExternalCalls;
    @XmlElement(name = "Speakerphone")
    protected String speakerphone;
    @XmlElement(name = "Dial_Prefix")
    protected String dialPrefix;
    @XmlElement(name = "Cell_Phone_Number")
    protected String cellPhoneNumber;
    @XmlElement(name = "Mapping_Mode")
    protected String mappingMode;
    @XmlElement(name = "Mobility_Trunk_Group")
    protected String mobilityTrunkGroup;
    @XmlElement(name = "Switchhook_Flash")
    protected String switchhookFlash;
    @XmlElement(name = "Distinctive_Audible_Alert")
    protected String distinctiveAudibleAlert;
    @XmlElement(name = "Message_Waiting_Type")
    protected String messageWaitingType;
    @XmlElement(name = "Length_of_Display")
    protected String lengthOfDisplay;
    @XmlElement(name = "Service_Link_Mode")
    protected String serviceLinkMode;
    @XmlElement(name = "Multimedia_Mode")
    protected String multimediaMode;
    @XmlElement(name = "AUDIX_Name")
    protected String audixName;
    @XmlElement(name = "Messaging_Server_Name")
    protected String messagingServerName;
    @XmlElement(name = "Auto_Select_Idle_Appear")
    protected String autoSelectIdleAppear;
    @XmlElement(name = "Conf_Trans_On_Primary_Appearance")
    protected String confTransOnPrimaryAppearance;
    @XmlElement(name = "Coverage_Msg_Retrieval")
    protected String coverageMsgRetrieval;
    @XmlElement(name = "Auto_Answer")
    protected String autoAnswer;
    @XmlElement(name = "Data_Restriction")
    protected String dataRestriction;
    @XmlElement(name = "Idle_Appearance")
    protected String idleAppearance;
    @XmlElement(name = "Bridged_Idle_Line")
    protected String bridgedIdleLine;
    @XmlElement(name = "Restrict_Last_Appearance")
    protected String restrictLastAppearance;
    @XmlElement(name = "Flash_for_Answer_Hold")
    protected String flashForAnswerHold;
    @XmlElement(name = "CPN___Send_Calling_No")
    protected String cpnSendCallingNo;
    @XmlElement(name = "Multimedia_Early_Answer")
    protected String multimediaEarlyAnswer;
    @XmlElement(name = "Audible_Msg_Waiting")
    protected String audibleMsgWaiting;
    @XmlElement(name = "Display_Client_Redirection")
    protected String displayClientRedirection;
    @XmlElement(name = "Select_Last_Used_Appear")
    protected String selectLastUsedAppear;
    @XmlElement(name = "Restricted_Number_Char")
    protected String restrictedNumberChar;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Headset")
    protected String headset;
    @XmlElement(name = "Speaker")
    protected String speaker;
    @XmlElement(name = "Mounting")
    protected String mounting;
    @XmlElement(name = "Cord_Length")
    protected String cordLength;
    @XmlElement(name = "Set_Color")
    protected String setColor;
    @XmlElement(name = "Hot_Line_Destination_List_number")
    protected String hotLineDestinationListNumber;
    @XmlElement(name = "Dial_Code")
    protected String dialCode;
    @XmlElement(name = "Info1")
    protected String info1;
    @XmlElement(name = "Info2")
    protected String info2;
    @XmlElement(name = "Data_Name")
    protected String dataName;
    @XmlElement(name = "Data_BCC")
    protected String dataBCC;
    @XmlElement(name = "Data_COS")
    protected String dataCOS;
    @XmlElement(name = "Data_COR")
    protected String dataCOR;
    @XmlElement(name = "Data_ITC")
    protected String dataITC;
    @XmlElement(name = "Data_TN")
    protected String dataTN;
    @XmlElement(name = "Data_Special_Dialing_Option")
    protected String dataSpecialDialingOption;
    @XmlElement(name = "Data_Abbreviated_Dialing_Dial_Code")
    protected String dataAbbreviatedDialingDialCode;
    @XmlElement(name = "Data_Multimedia")
    protected String dataMultimedia;
    @XmlElement(name = "Data_Private_Line_Emulation")
    protected String dataPrivateLineEmulation;
    @XmlElement(name = "Data_Default_Duplex")
    protected String dataDefaultDuplex;
    @XmlElement(name = "Data_Default_Mode")
    protected String dataDefaultMode;
    @XmlElement(name = "Data_Default_Speed")
    protected String dataDefaultSpeed;
    @XmlElement(name = "Data_Default_ITC")
    protected String dataDefaultITC;
    @XmlElement(name = "Data_Default_Data_Application")
    protected String dataDefaultDataApplication;
    @XmlElement(name = "MWI_Served_User_Type")
    protected String mwiServedUserType;
    @XmlElement(name = "Tests")
    protected String tests;
    @XmlElement(name = "Message_Waiting_Indicator")
    protected String messageWaitingIndicator;
    @XmlElement(name = "Ignore_Rotary_Digits")
    protected String ignoreRotaryDigits;
    @XmlElement(name = "Call_Waiting_Indicator")
    protected String callWaitingIndicator;
    @XmlElement(name = "Att_Call_Waiting_Indicator")
    protected String attCallWaitingIndicator;
    @XmlElement(name = "Adjunct_Supervision")
    protected String adjunctSupervision;
    @XmlElement(name = "IP_Hoteling")
    protected String ipHoteling;
    @XmlElement(name = "IP_Softphone")
    protected String ipSoftphone;
    @XmlElement(name = "IP_Video")
    protected String ipVideo;
    @XmlElement(name = "EC500_State")
    protected String ec500State;
    @XmlElement(name = "Native_Name_1")
    protected String nativeName1;
    @XmlElement(name = "Native_Name_2")
    protected String nativeName2;
    @XmlElement(name = "Native_Name_3")
    protected String nativeName3;
    @XmlElement(name = "Native_Name_4")
    protected String nativeName4;
    @XmlElement(name = "Native_Name_5")
    protected String nativeName5;
    @XmlElement(name = "Native_Name_Scripts")
    protected String nativeNameScripts;
    @XmlElement(name = "Unconditional_For_Internal_Calls_To")
    protected String unconditionalForInternalCallsTo;
    @XmlElement(name = "Unconditional_For_Internal_Calls_To_Active")
    protected String unconditionalForInternalCallsToActive;
    @XmlElement(name = "Unconditional_For_External_Calls_To")
    protected String unconditionalForExternalCallsTo;
    @XmlElement(name = "Unconditional_For_External_Calls_To_Active")
    protected String unconditionalForExternalCallsToActive;
    @XmlElement(name = "Busy_For_Internal_Calls_To")
    protected String busyForInternalCallsTo;
    @XmlElement(name = "Busy_For_Internal_Calls_To_Active")
    protected String busyForInternalCallsToActive;
    @XmlElement(name = "Busy_For_External_Calls_To")
    protected String busyForExternalCallsTo;
    @XmlElement(name = "Busy_For_External_Calls_To_Active")
    protected String busyForExternalCallsToActive;
    @XmlElement(name = "No_Reply_For_Internal_Calls_To")
    protected String noReplyForInternalCallsTo;
    @XmlElement(name = "No_Reply_For_Internal_Calls_To_Active")
    protected String noReplyForInternalCallsToActive;
    @XmlElement(name = "No_Reply_For_External_Calls_To")
    protected String noReplyForExternalCallsTo;
    @XmlElement(name = "No_Reply_For_External_Calls_To_Active")
    protected String noReplyForExternalCallsToActive;
    @XmlElement(name = "Set")
    protected String set;
    @XmlElement(name = "Data_Option")
    protected String dataOption;
    @XmlElement(name = "Off_Premises_Stations")
    protected String offPremisesStations;
    @XmlElement(name = "R_Balance_Network")
    protected String rBalanceNetwork;
    @XmlElement(name = "Passageway")
    protected String passageway;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "Display_Cartridge")
    protected String displayCartridge;
    @XmlElement(name = "Mute_Button_Enabled")
    protected String muteButtonEnabled;
    @XmlElement(name = "Customizable_Labels")
    protected String customizableLabels;
    @XmlElement(name = "Display_Caller_ID")
    protected String displayCallerID;
    @XmlElement(name = "Caller_ID_Message_Waiting_Indication")
    protected String callerIDMessageWaitingIndication;
    @XmlElement(name = "XID")
    protected String xid;
    @XmlElement(name = "Fixed_TEI")
    protected String fixedTEI;
    @XmlElement(name = "TEI")
    protected String tei;
    @XmlElement(name = "Secure_Terminal_Equipment")
    protected String secureTerminalEquipment;
    @XmlElement(name = "MIM_Support")
    protected String mimSupport;
    @XmlElement(name = "MIM_Maintenance_and_Management")
    protected String mimMaintenanceAndManagement;
    @XmlElement(name = "SPID")
    protected String spid;
    @XmlElement(name = "Survivable_COR")
    protected String survivableCOR;
    @XmlElement(name = "Survivable_Trunk_Destination")
    protected String survivableTrunkDestination;
    @XmlElement(name = "DTMF_over_IP")
    protected String dtmfOverIP;
    @XmlElement(name = "Recall_Rotary_Digit")
    protected String recallRotaryDigit;
    @XmlElement(name = "Always_Use")
    protected String alwaysUse;
    @XmlElement(name = "EMU_Login_Allowed")
    protected String emuLoginAllowed;
    @XmlElement(name = "Calls_Allowed")
    protected String callsAllowed;
    @XmlElement(name = "Endpt_Init")
    protected String endptInit;
    @XmlElement(name = "Block_Alerting_if_IP_Principal_Logged_Off")
    protected String blockAlertingIfIPPrincipalLoggedOff;
    @XmlElement(name = "Bridged_Appearance_Origination_Restriction")
    protected String bridgedAppearanceOriginationRestriction;
    @XmlElement(name = "Busy_Auto_Callback_Without_Flash")
    protected String busyAutoCallbackWithoutFlash;
    @XmlElement(name = "Button_Modules")
    protected String buttonModules;
    @XmlElement(name = "Call_Appearance_Display_Format")
    protected String callAppearanceDisplayFormat;
    @XmlElement(name = "IP_Phone_Group_ID")
    protected String ipPhoneGroupID;
    @XmlElement(name = "Precedence_Call_Waiting")
    protected String precedenceCallWaiting;
    @XmlElement(name = "SAC_CF_Override")
    protected String saccfOverride;
    @XmlElement(name = "SIP_Trunk")
    protected String sipTrunk;
    @XmlElement(name = "Time_of_Day_Lock_Table")
    protected String timeOfDayLockTable;
    @XmlElement(name = "Type_of_3PCC_Enabled")
    protected String typeOf3PCCEnabled;
    @XmlElement(name = "XOIP_Endpoint_Type")
    protected String xoipEndpointType;
    @XmlElement(name = "Result_Port")
    protected String resultPort;
    @XmlElement(name = "Maintenance_Name")
    protected String maintenanceName;
    @XmlElement(name = "Alt_Name")
    protected String altName;
    @XmlElement(name = "Result")
    protected String result;
    @XmlElement(name = "Error_Code")
    protected String errorCode;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Abbreviated_Dialing_List_Type")
    protected List<ArrayType> abbreviatedDialingListType;
    @XmlElement(name = "Abbreviated_Dialing_List_Number")
    protected List<ArrayType> abbreviatedDialingListNumber;
    @XmlElement(name = "Button_Data_1")
    protected List<ArrayType> buttonData1;
    @XmlElement(name = "Button_Data_2")
    protected List<ArrayType> buttonData2;
    @XmlElement(name = "Button_Data_3")
    protected List<ArrayType> buttonData3;
    @XmlElement(name = "Button_Data_4")
    protected List<ArrayType> buttonData4;
    @XmlElement(name = "Button_Data_5")
    protected List<ArrayType> buttonData5;
    @XmlElement(name = "Button_Data_6")
    protected List<ArrayType> buttonData6;
    @XmlElement(name = "Button_Data_7")
    protected List<ArrayType> buttonData7;
    @XmlElement(name = "Data_List1")
    protected List<ArrayType> dataList1;
    @XmlElement(name = "Data_Personal_List_Number")
    protected List<ArrayType> dataPersonalListNumber;

    /**
     * extension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * extension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
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
     * port 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * port 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
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
     * coveragePath1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath1() {
        return coveragePath1;
    }

    /**
     * coveragePath1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath1(String value) {
        this.coveragePath1 = value;
    }

    /**
     * coveragePath2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath2() {
        return coveragePath2;
    }

    /**
     * coveragePath2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath2(String value) {
        this.coveragePath2 = value;
    }

    /**
     * huntToStation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntToStation() {
        return huntToStation;
    }

    /**
     * huntToStation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntToStation(String value) {
        this.huntToStation = value;
    }

    /**
     * cor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOR() {
        return cor;
    }

    /**
     * cor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOR(String value) {
        this.cor = value;
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
     * jack 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJack() {
        return jack;
    }

    /**
     * jack 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJack(String value) {
        this.jack = value;
    }

    /**
     * cable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCable() {
        return cable;
    }

    /**
     * cable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCable(String value) {
        this.cable = value;
    }

    /**
     * dataExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtension() {
        return dataExtension;
    }

    /**
     * dataExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtension(String value) {
        this.dataExtension = value;
    }

    /**
     * survivableGKNodeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvivableGKNodeName() {
        return survivableGKNodeName;
    }

    /**
     * survivableGKNodeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvivableGKNodeName(String value) {
        this.survivableGKNodeName = value;
    }

    /**
     * tn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN() {
        return tn;
    }

    /**
     * tn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN(String value) {
        this.tn = value;
    }

    /**
     * lockMessages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockMessages() {
        return lockMessages;
    }

    /**
     * lockMessages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockMessages(String value) {
        this.lockMessages = value;
    }

    /**
     * securityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * securityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * masiNodeNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMASINodeNumber() {
        return masiNodeNumber;
    }

    /**
     * masiNodeNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMASINodeNumber(String value) {
        this.masiNodeNumber = value;
    }

    /**
     * mapToStation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapToStation() {
        return mapToStation;
    }

    /**
     * mapToStation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapToStation(String value) {
        this.mapToStation = value;
    }

    /**
     * automaticMoves 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticMoves() {
        return automaticMoves;
    }

    /**
     * automaticMoves 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticMoves(String value) {
        this.automaticMoves = value;
    }

    /**
     * dataModule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataModule() {
        return dataModule;
    }

    /**
     * dataModule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataModule(String value) {
        this.dataModule = value;
    }

    /**
     * displayModule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayModule() {
        return displayModule;
    }

    /**
     * displayModule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayModule(String value) {
        this.displayModule = value;
    }

    /**
     * displayLanguage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLanguage() {
        return displayLanguage;
    }

    /**
     * displayLanguage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLanguage(String value) {
        this.displayLanguage = value;
    }

    /**
     * ipei 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPEI() {
        return ipei;
    }

    /**
     * ipei 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPEI(String value) {
        this.ipei = value;
    }

    /**
     * accessCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCode() {
        return accessCode;
    }

    /**
     * accessCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCode(String value) {
        this.accessCode = value;
    }

    /**
     * home 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome() {
        return home;
    }

    /**
     * home 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome(String value) {
        this.home = value;
    }

    /**
     * ringingPattern 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingingPattern() {
        return ringingPattern;
    }

    /**
     * ringingPattern 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingingPattern(String value) {
        this.ringingPattern = value;
    }

    /**
     * messageLampExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLampExt() {
        return messageLampExt;
    }

    /**
     * messageLampExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLampExt(String value) {
        this.messageLampExt = value;
    }

    /**
     * mmRemoteDataExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMRemoteDataExt() {
        return mmRemoteDataExt;
    }

    /**
     * mmRemoteDataExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMRemoteDataExt(String value) {
        this.mmRemoteDataExt = value;
    }

    /**
     * mmComplexDataExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMComplexDataExt() {
        return mmComplexDataExt;
    }

    /**
     * mmComplexDataExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMComplexDataExt(String value) {
        this.mmComplexDataExt = value;
    }

    /**
     * oneStepClearing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneStepClearing() {
        return oneStepClearing;
    }

    /**
     * oneStepClearing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneStepClearing(String value) {
        this.oneStepClearing = value;
    }

    /**
     * countryProtocol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryProtocol() {
        return countryProtocol;
    }

    /**
     * countryProtocol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryProtocol(String value) {
        this.countryProtocol = value;
    }

    /**
     * endptID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndptID() {
        return endptID;
    }

    /**
     * endptID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndptID(String value) {
        this.endptID = value;
    }

    /**
     * crvLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRVLength() {
        return crvLength;
    }

    /**
     * crvLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRVLength(String value) {
        this.crvLength = value;
    }

    /**
     * lwcReception 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCReception() {
        return lwcReception;
    }

    /**
     * lwcReception 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCReception(String value) {
        this.lwcReception = value;
    }

    /**
     * lwcActivation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCActivation() {
        return lwcActivation;
    }

    /**
     * lwcActivation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCActivation(String value) {
        this.lwcActivation = value;
    }

    /**
     * cdrPrivacy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRPrivacy() {
        return cdrPrivacy;
    }

    /**
     * cdrPrivacy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRPrivacy(String value) {
        this.cdrPrivacy = value;
    }

    /**
     * redirectNotification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectNotification() {
        return redirectNotification;
    }

    /**
     * redirectNotification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectNotification(String value) {
        this.redirectNotification = value;
    }

    /**
     * perButtonRingControl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerButtonRingControl() {
        return perButtonRingControl;
    }

    /**
     * perButtonRingControl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerButtonRingControl(String value) {
        this.perButtonRingControl = value;
    }

    /**
     * bridgedCallAlerting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgedCallAlerting() {
        return bridgedCallAlerting;
    }

    /**
     * bridgedCallAlerting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgedCallAlerting(String value) {
        this.bridgedCallAlerting = value;
    }

    /**
     * activeStationRinging 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStationRinging() {
        return activeStationRinging;
    }

    /**
     * activeStationRinging 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStationRinging(String value) {
        this.activeStationRinging = value;
    }

    /**
     * idleActiveRinging 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleActiveRinging() {
        return idleActiveRinging;
    }

    /**
     * idleActiveRinging 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleActiveRinging(String value) {
        this.idleActiveRinging = value;
    }

    /**
     * h320Conversion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH320Conversion() {
        return h320Conversion;
    }

    /**
     * h320Conversion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH320Conversion(String value) {
        this.h320Conversion = value;
    }

    /**
     * ipAudioHairpinning 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAudioHairpinning() {
        return ipAudioHairpinning;
    }

    /**
     * ipAudioHairpinning 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAudioHairpinning(String value) {
        this.ipAudioHairpinning = value;
    }

    /**
     * primeAppearancePreference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeAppearancePreference() {
        return primeAppearancePreference;
    }

    /**
     * primeAppearancePreference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeAppearancePreference(String value) {
        this.primeAppearancePreference = value;
    }

    /**
     * expansionModule24 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpansionModule24() {
        return expansionModule24;
    }

    /**
     * expansionModule24 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpansionModule24(String value) {
        this.expansionModule24 = value;
    }

    /**
     * directIPIPAudioConnections 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectIPIPAudioConnections() {
        return directIPIPAudioConnections;
    }

    /**
     * directIPIPAudioConnections 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectIPIPAudioConnections(String value) {
        this.directIPIPAudioConnections = value;
    }

    /**
     * lossGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossGroup() {
        return lossGroup;
    }

    /**
     * lossGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossGroup(String value) {
        this.lossGroup = value;
    }

    /**
     * featureModule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureModule() {
        return featureModule;
    }

    /**
     * featureModule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureModule(String value) {
        this.featureModule = value;
    }

    /**
     * coverageModule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageModule() {
        return coverageModule;
    }

    /**
     * coverageModule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageModule(String value) {
        this.coverageModule = value;
    }

    /**
     * coverageModule1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageModule1() {
        return coverageModule1;
    }

    /**
     * coverageModule1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageModule1(String value) {
        this.coverageModule1 = value;
    }

    /**
     * remoteOfficePhone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOfficePhone() {
        return remoteOfficePhone;
    }

    /**
     * remoteOfficePhone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOfficePhone(String value) {
        this.remoteOfficePhone = value;
    }

    /**
     * coverageAfterForwarding 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageAfterForwarding() {
        return coverageAfterForwarding;
    }

    /**
     * coverageAfterForwarding 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageAfterForwarding(String value) {
        this.coverageAfterForwarding = value;
    }

    /**
     * ipEmergencyCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPEmergencyCalls() {
        return ipEmergencyCalls;
    }

    /**
     * ipEmergencyCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPEmergencyCalls(String value) {
        this.ipEmergencyCalls = value;
    }

    /**
     * emergencyLocationExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyLocationExt() {
        return emergencyLocationExt;
    }

    /**
     * emergencyLocationExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyLocationExt(String value) {
        this.emergencyLocationExt = value;
    }

    /**
     * configurationSet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationSet() {
        return configurationSet;
    }

    /**
     * configurationSet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationSet(String value) {
        this.configurationSet = value;
    }

    /**
     * xMobileType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMobileType() {
        return xMobileType;
    }

    /**
     * xMobileType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMobileType(String value) {
        this.xMobileType = value;
    }

    /**
     * lwcLogExternalCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCLogExternalCalls() {
        return lwcLogExternalCalls;
    }

    /**
     * lwcLogExternalCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCLogExternalCalls(String value) {
        this.lwcLogExternalCalls = value;
    }

    /**
     * speakerphone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerphone() {
        return speakerphone;
    }

    /**
     * speakerphone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerphone(String value) {
        this.speakerphone = value;
    }

    /**
     * dialPrefix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPrefix() {
        return dialPrefix;
    }

    /**
     * dialPrefix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPrefix(String value) {
        this.dialPrefix = value;
    }

    /**
     * cellPhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * cellPhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
    }

    /**
     * mappingMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingMode() {
        return mappingMode;
    }

    /**
     * mappingMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingMode(String value) {
        this.mappingMode = value;
    }

    /**
     * mobilityTrunkGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilityTrunkGroup() {
        return mobilityTrunkGroup;
    }

    /**
     * mobilityTrunkGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityTrunkGroup(String value) {
        this.mobilityTrunkGroup = value;
    }

    /**
     * switchhookFlash 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchhookFlash() {
        return switchhookFlash;
    }

    /**
     * switchhookFlash 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchhookFlash(String value) {
        this.switchhookFlash = value;
    }

    /**
     * distinctiveAudibleAlert 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinctiveAudibleAlert() {
        return distinctiveAudibleAlert;
    }

    /**
     * distinctiveAudibleAlert 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinctiveAudibleAlert(String value) {
        this.distinctiveAudibleAlert = value;
    }

    /**
     * messageWaitingType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageWaitingType() {
        return messageWaitingType;
    }

    /**
     * messageWaitingType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageWaitingType(String value) {
        this.messageWaitingType = value;
    }

    /**
     * lengthOfDisplay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthOfDisplay() {
        return lengthOfDisplay;
    }

    /**
     * lengthOfDisplay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthOfDisplay(String value) {
        this.lengthOfDisplay = value;
    }

    /**
     * serviceLinkMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLinkMode() {
        return serviceLinkMode;
    }

    /**
     * serviceLinkMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLinkMode(String value) {
        this.serviceLinkMode = value;
    }

    /**
     * multimediaMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaMode() {
        return multimediaMode;
    }

    /**
     * multimediaMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaMode(String value) {
        this.multimediaMode = value;
    }

    /**
     * audixName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDIXName() {
        return audixName;
    }

    /**
     * audixName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDIXName(String value) {
        this.audixName = value;
    }

    /**
     * messagingServerName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagingServerName() {
        return messagingServerName;
    }

    /**
     * messagingServerName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagingServerName(String value) {
        this.messagingServerName = value;
    }

    /**
     * autoSelectIdleAppear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoSelectIdleAppear() {
        return autoSelectIdleAppear;
    }

    /**
     * autoSelectIdleAppear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoSelectIdleAppear(String value) {
        this.autoSelectIdleAppear = value;
    }

    /**
     * confTransOnPrimaryAppearance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfTransOnPrimaryAppearance() {
        return confTransOnPrimaryAppearance;
    }

    /**
     * confTransOnPrimaryAppearance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfTransOnPrimaryAppearance(String value) {
        this.confTransOnPrimaryAppearance = value;
    }

    /**
     * coverageMsgRetrieval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageMsgRetrieval() {
        return coverageMsgRetrieval;
    }

    /**
     * coverageMsgRetrieval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageMsgRetrieval(String value) {
        this.coverageMsgRetrieval = value;
    }

    /**
     * autoAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * autoAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAnswer(String value) {
        this.autoAnswer = value;
    }

    /**
     * dataRestriction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRestriction() {
        return dataRestriction;
    }

    /**
     * dataRestriction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRestriction(String value) {
        this.dataRestriction = value;
    }

    /**
     * idleAppearance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleAppearance() {
        return idleAppearance;
    }

    /**
     * idleAppearance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleAppearance(String value) {
        this.idleAppearance = value;
    }

    /**
     * bridgedIdleLine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgedIdleLine() {
        return bridgedIdleLine;
    }

    /**
     * bridgedIdleLine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgedIdleLine(String value) {
        this.bridgedIdleLine = value;
    }

    /**
     * restrictLastAppearance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictLastAppearance() {
        return restrictLastAppearance;
    }

    /**
     * restrictLastAppearance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictLastAppearance(String value) {
        this.restrictLastAppearance = value;
    }

    /**
     * flashForAnswerHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashForAnswerHold() {
        return flashForAnswerHold;
    }

    /**
     * flashForAnswerHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashForAnswerHold(String value) {
        this.flashForAnswerHold = value;
    }

    /**
     * cpnSendCallingNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPNSendCallingNo() {
        return cpnSendCallingNo;
    }

    /**
     * cpnSendCallingNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPNSendCallingNo(String value) {
        this.cpnSendCallingNo = value;
    }

    /**
     * multimediaEarlyAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaEarlyAnswer() {
        return multimediaEarlyAnswer;
    }

    /**
     * multimediaEarlyAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaEarlyAnswer(String value) {
        this.multimediaEarlyAnswer = value;
    }

    /**
     * audibleMsgWaiting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleMsgWaiting() {
        return audibleMsgWaiting;
    }

    /**
     * audibleMsgWaiting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleMsgWaiting(String value) {
        this.audibleMsgWaiting = value;
    }

    /**
     * displayClientRedirection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayClientRedirection() {
        return displayClientRedirection;
    }

    /**
     * displayClientRedirection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayClientRedirection(String value) {
        this.displayClientRedirection = value;
    }

    /**
     * selectLastUsedAppear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectLastUsedAppear() {
        return selectLastUsedAppear;
    }

    /**
     * selectLastUsedAppear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectLastUsedAppear(String value) {
        this.selectLastUsedAppear = value;
    }

    /**
     * restrictedNumberChar 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedNumberChar() {
        return restrictedNumberChar;
    }

    /**
     * restrictedNumberChar 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedNumberChar(String value) {
        this.restrictedNumberChar = value;
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
     * headset 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadset() {
        return headset;
    }

    /**
     * headset 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadset(String value) {
        this.headset = value;
    }

    /**
     * speaker 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeaker() {
        return speaker;
    }

    /**
     * speaker 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeaker(String value) {
        this.speaker = value;
    }

    /**
     * mounting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMounting() {
        return mounting;
    }

    /**
     * mounting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMounting(String value) {
        this.mounting = value;
    }

    /**
     * cordLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCordLength() {
        return cordLength;
    }

    /**
     * cordLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCordLength(String value) {
        this.cordLength = value;
    }

    /**
     * setColor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetColor() {
        return setColor;
    }

    /**
     * setColor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetColor(String value) {
        this.setColor = value;
    }

    /**
     * hotLineDestinationListNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotLineDestinationListNumber() {
        return hotLineDestinationListNumber;
    }

    /**
     * hotLineDestinationListNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotLineDestinationListNumber(String value) {
        this.hotLineDestinationListNumber = value;
    }

    /**
     * dialCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialCode() {
        return dialCode;
    }

    /**
     * dialCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialCode(String value) {
        this.dialCode = value;
    }

    /**
     * info1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo1() {
        return info1;
    }

    /**
     * info1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo1(String value) {
        this.info1 = value;
    }

    /**
     * info2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo2() {
        return info2;
    }

    /**
     * info2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo2(String value) {
        this.info2 = value;
    }

    /**
     * dataName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * dataName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataName(String value) {
        this.dataName = value;
    }

    /**
     * dataBCC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataBCC() {
        return dataBCC;
    }

    /**
     * dataBCC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataBCC(String value) {
        this.dataBCC = value;
    }

    /**
     * dataCOS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCOS() {
        return dataCOS;
    }

    /**
     * dataCOS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCOS(String value) {
        this.dataCOS = value;
    }

    /**
     * dataCOR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCOR() {
        return dataCOR;
    }

    /**
     * dataCOR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCOR(String value) {
        this.dataCOR = value;
    }

    /**
     * dataITC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataITC() {
        return dataITC;
    }

    /**
     * dataITC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataITC(String value) {
        this.dataITC = value;
    }

    /**
     * dataTN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTN() {
        return dataTN;
    }

    /**
     * dataTN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTN(String value) {
        this.dataTN = value;
    }

    /**
     * dataSpecialDialingOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSpecialDialingOption() {
        return dataSpecialDialingOption;
    }

    /**
     * dataSpecialDialingOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSpecialDialingOption(String value) {
        this.dataSpecialDialingOption = value;
    }

    /**
     * dataAbbreviatedDialingDialCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAbbreviatedDialingDialCode() {
        return dataAbbreviatedDialingDialCode;
    }

    /**
     * dataAbbreviatedDialingDialCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAbbreviatedDialingDialCode(String value) {
        this.dataAbbreviatedDialingDialCode = value;
    }

    /**
     * dataMultimedia 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMultimedia() {
        return dataMultimedia;
    }

    /**
     * dataMultimedia 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMultimedia(String value) {
        this.dataMultimedia = value;
    }

    /**
     * dataPrivateLineEmulation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrivateLineEmulation() {
        return dataPrivateLineEmulation;
    }

    /**
     * dataPrivateLineEmulation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrivateLineEmulation(String value) {
        this.dataPrivateLineEmulation = value;
    }

    /**
     * dataDefaultDuplex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultDuplex() {
        return dataDefaultDuplex;
    }

    /**
     * dataDefaultDuplex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultDuplex(String value) {
        this.dataDefaultDuplex = value;
    }

    /**
     * dataDefaultMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultMode() {
        return dataDefaultMode;
    }

    /**
     * dataDefaultMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultMode(String value) {
        this.dataDefaultMode = value;
    }

    /**
     * dataDefaultSpeed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultSpeed() {
        return dataDefaultSpeed;
    }

    /**
     * dataDefaultSpeed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultSpeed(String value) {
        this.dataDefaultSpeed = value;
    }

    /**
     * dataDefaultITC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultITC() {
        return dataDefaultITC;
    }

    /**
     * dataDefaultITC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultITC(String value) {
        this.dataDefaultITC = value;
    }

    /**
     * dataDefaultDataApplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultDataApplication() {
        return dataDefaultDataApplication;
    }

    /**
     * dataDefaultDataApplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultDataApplication(String value) {
        this.dataDefaultDataApplication = value;
    }

    /**
     * mwiServedUserType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMWIServedUserType() {
        return mwiServedUserType;
    }

    /**
     * mwiServedUserType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMWIServedUserType(String value) {
        this.mwiServedUserType = value;
    }

    /**
     * tests 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTests() {
        return tests;
    }

    /**
     * tests 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTests(String value) {
        this.tests = value;
    }

    /**
     * messageWaitingIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageWaitingIndicator() {
        return messageWaitingIndicator;
    }

    /**
     * messageWaitingIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageWaitingIndicator(String value) {
        this.messageWaitingIndicator = value;
    }

    /**
     * ignoreRotaryDigits 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreRotaryDigits() {
        return ignoreRotaryDigits;
    }

    /**
     * ignoreRotaryDigits 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreRotaryDigits(String value) {
        this.ignoreRotaryDigits = value;
    }

    /**
     * callWaitingIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWaitingIndicator() {
        return callWaitingIndicator;
    }

    /**
     * callWaitingIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWaitingIndicator(String value) {
        this.callWaitingIndicator = value;
    }

    /**
     * attCallWaitingIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttCallWaitingIndicator() {
        return attCallWaitingIndicator;
    }

    /**
     * attCallWaitingIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttCallWaitingIndicator(String value) {
        this.attCallWaitingIndicator = value;
    }

    /**
     * adjunctSupervision 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctSupervision() {
        return adjunctSupervision;
    }

    /**
     * adjunctSupervision 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctSupervision(String value) {
        this.adjunctSupervision = value;
    }

    /**
     * ipHoteling 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPHoteling() {
        return ipHoteling;
    }

    /**
     * ipHoteling 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPHoteling(String value) {
        this.ipHoteling = value;
    }

    /**
     * ipSoftphone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPSoftphone() {
        return ipSoftphone;
    }

    /**
     * ipSoftphone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPSoftphone(String value) {
        this.ipSoftphone = value;
    }

    /**
     * ipVideo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPVideo() {
        return ipVideo;
    }

    /**
     * ipVideo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPVideo(String value) {
        this.ipVideo = value;
    }

    /**
     * ec500State 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEC500State() {
        return ec500State;
    }

    /**
     * ec500State 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEC500State(String value) {
        this.ec500State = value;
    }

    /**
     * nativeName1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName1() {
        return nativeName1;
    }

    /**
     * nativeName1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName1(String value) {
        this.nativeName1 = value;
    }

    /**
     * nativeName2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName2() {
        return nativeName2;
    }

    /**
     * nativeName2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName2(String value) {
        this.nativeName2 = value;
    }

    /**
     * nativeName3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName3() {
        return nativeName3;
    }

    /**
     * nativeName3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName3(String value) {
        this.nativeName3 = value;
    }

    /**
     * nativeName4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName4() {
        return nativeName4;
    }

    /**
     * nativeName4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName4(String value) {
        this.nativeName4 = value;
    }

    /**
     * nativeName5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName5() {
        return nativeName5;
    }

    /**
     * nativeName5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName5(String value) {
        this.nativeName5 = value;
    }

    /**
     * nativeNameScripts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeNameScripts() {
        return nativeNameScripts;
    }

    /**
     * nativeNameScripts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeNameScripts(String value) {
        this.nativeNameScripts = value;
    }

    /**
     * unconditionalForInternalCallsTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalForInternalCallsTo() {
        return unconditionalForInternalCallsTo;
    }

    /**
     * unconditionalForInternalCallsTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalForInternalCallsTo(String value) {
        this.unconditionalForInternalCallsTo = value;
    }

    /**
     * unconditionalForInternalCallsToActive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalForInternalCallsToActive() {
        return unconditionalForInternalCallsToActive;
    }

    /**
     * unconditionalForInternalCallsToActive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalForInternalCallsToActive(String value) {
        this.unconditionalForInternalCallsToActive = value;
    }

    /**
     * unconditionalForExternalCallsTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalForExternalCallsTo() {
        return unconditionalForExternalCallsTo;
    }

    /**
     * unconditionalForExternalCallsTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalForExternalCallsTo(String value) {
        this.unconditionalForExternalCallsTo = value;
    }

    /**
     * unconditionalForExternalCallsToActive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalForExternalCallsToActive() {
        return unconditionalForExternalCallsToActive;
    }

    /**
     * unconditionalForExternalCallsToActive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalForExternalCallsToActive(String value) {
        this.unconditionalForExternalCallsToActive = value;
    }

    /**
     * busyForInternalCallsTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyForInternalCallsTo() {
        return busyForInternalCallsTo;
    }

    /**
     * busyForInternalCallsTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyForInternalCallsTo(String value) {
        this.busyForInternalCallsTo = value;
    }

    /**
     * busyForInternalCallsToActive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyForInternalCallsToActive() {
        return busyForInternalCallsToActive;
    }

    /**
     * busyForInternalCallsToActive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyForInternalCallsToActive(String value) {
        this.busyForInternalCallsToActive = value;
    }

    /**
     * busyForExternalCallsTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyForExternalCallsTo() {
        return busyForExternalCallsTo;
    }

    /**
     * busyForExternalCallsTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyForExternalCallsTo(String value) {
        this.busyForExternalCallsTo = value;
    }

    /**
     * busyForExternalCallsToActive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyForExternalCallsToActive() {
        return busyForExternalCallsToActive;
    }

    /**
     * busyForExternalCallsToActive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyForExternalCallsToActive(String value) {
        this.busyForExternalCallsToActive = value;
    }

    /**
     * noReplyForInternalCallsTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReplyForInternalCallsTo() {
        return noReplyForInternalCallsTo;
    }

    /**
     * noReplyForInternalCallsTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReplyForInternalCallsTo(String value) {
        this.noReplyForInternalCallsTo = value;
    }

    /**
     * noReplyForInternalCallsToActive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReplyForInternalCallsToActive() {
        return noReplyForInternalCallsToActive;
    }

    /**
     * noReplyForInternalCallsToActive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReplyForInternalCallsToActive(String value) {
        this.noReplyForInternalCallsToActive = value;
    }

    /**
     * noReplyForExternalCallsTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReplyForExternalCallsTo() {
        return noReplyForExternalCallsTo;
    }

    /**
     * noReplyForExternalCallsTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReplyForExternalCallsTo(String value) {
        this.noReplyForExternalCallsTo = value;
    }

    /**
     * noReplyForExternalCallsToActive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReplyForExternalCallsToActive() {
        return noReplyForExternalCallsToActive;
    }

    /**
     * noReplyForExternalCallsToActive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReplyForExternalCallsToActive(String value) {
        this.noReplyForExternalCallsToActive = value;
    }

    /**
     * set 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSet() {
        return set;
    }

    /**
     * set 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSet(String value) {
        this.set = value;
    }

    /**
     * dataOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOption() {
        return dataOption;
    }

    /**
     * dataOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOption(String value) {
        this.dataOption = value;
    }

    /**
     * offPremisesStations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPremisesStations() {
        return offPremisesStations;
    }

    /**
     * offPremisesStations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPremisesStations(String value) {
        this.offPremisesStations = value;
    }

    /**
     * rBalanceNetwork 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBalanceNetwork() {
        return rBalanceNetwork;
    }

    /**
     * rBalanceNetwork 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBalanceNetwork(String value) {
        this.rBalanceNetwork = value;
    }

    /**
     * passageway 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassageway() {
        return passageway;
    }

    /**
     * passageway 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassageway(String value) {
        this.passageway = value;
    }

    /**
     * model 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * model 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * displayCartridge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCartridge() {
        return displayCartridge;
    }

    /**
     * displayCartridge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCartridge(String value) {
        this.displayCartridge = value;
    }

    /**
     * muteButtonEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuteButtonEnabled() {
        return muteButtonEnabled;
    }

    /**
     * muteButtonEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuteButtonEnabled(String value) {
        this.muteButtonEnabled = value;
    }

    /**
     * customizableLabels 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizableLabels() {
        return customizableLabels;
    }

    /**
     * customizableLabels 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizableLabels(String value) {
        this.customizableLabels = value;
    }

    /**
     * displayCallerID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCallerID() {
        return displayCallerID;
    }

    /**
     * displayCallerID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCallerID(String value) {
        this.displayCallerID = value;
    }

    /**
     * callerIDMessageWaitingIndication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIDMessageWaitingIndication() {
        return callerIDMessageWaitingIndication;
    }

    /**
     * callerIDMessageWaitingIndication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIDMessageWaitingIndication(String value) {
        this.callerIDMessageWaitingIndication = value;
    }

    /**
     * xid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXID() {
        return xid;
    }

    /**
     * xid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXID(String value) {
        this.xid = value;
    }

    /**
     * fixedTEI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedTEI() {
        return fixedTEI;
    }

    /**
     * fixedTEI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedTEI(String value) {
        this.fixedTEI = value;
    }

    /**
     * tei 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEI() {
        return tei;
    }

    /**
     * tei 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEI(String value) {
        this.tei = value;
    }

    /**
     * secureTerminalEquipment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureTerminalEquipment() {
        return secureTerminalEquipment;
    }

    /**
     * secureTerminalEquipment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureTerminalEquipment(String value) {
        this.secureTerminalEquipment = value;
    }

    /**
     * mimSupport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMSupport() {
        return mimSupport;
    }

    /**
     * mimSupport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMSupport(String value) {
        this.mimSupport = value;
    }

    /**
     * mimMaintenanceAndManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMMaintenanceAndManagement() {
        return mimMaintenanceAndManagement;
    }

    /**
     * mimMaintenanceAndManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMMaintenanceAndManagement(String value) {
        this.mimMaintenanceAndManagement = value;
    }

    /**
     * spid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPID() {
        return spid;
    }

    /**
     * spid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPID(String value) {
        this.spid = value;
    }

    /**
     * survivableCOR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvivableCOR() {
        return survivableCOR;
    }

    /**
     * survivableCOR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvivableCOR(String value) {
        this.survivableCOR = value;
    }

    /**
     * survivableTrunkDestination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvivableTrunkDestination() {
        return survivableTrunkDestination;
    }

    /**
     * survivableTrunkDestination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvivableTrunkDestination(String value) {
        this.survivableTrunkDestination = value;
    }

    /**
     * dtmfOverIP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMFOverIP() {
        return dtmfOverIP;
    }

    /**
     * dtmfOverIP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMFOverIP(String value) {
        this.dtmfOverIP = value;
    }

    /**
     * recallRotaryDigit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecallRotaryDigit() {
        return recallRotaryDigit;
    }

    /**
     * recallRotaryDigit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecallRotaryDigit(String value) {
        this.recallRotaryDigit = value;
    }

    /**
     * alwaysUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUse() {
        return alwaysUse;
    }

    /**
     * alwaysUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUse(String value) {
        this.alwaysUse = value;
    }

    /**
     * emuLoginAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMULoginAllowed() {
        return emuLoginAllowed;
    }

    /**
     * emuLoginAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMULoginAllowed(String value) {
        this.emuLoginAllowed = value;
    }

    /**
     * callsAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsAllowed() {
        return callsAllowed;
    }

    /**
     * callsAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsAllowed(String value) {
        this.callsAllowed = value;
    }

    /**
     * endptInit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndptInit() {
        return endptInit;
    }

    /**
     * endptInit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndptInit(String value) {
        this.endptInit = value;
    }

    /**
     * blockAlertingIfIPPrincipalLoggedOff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockAlertingIfIPPrincipalLoggedOff() {
        return blockAlertingIfIPPrincipalLoggedOff;
    }

    /**
     * blockAlertingIfIPPrincipalLoggedOff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockAlertingIfIPPrincipalLoggedOff(String value) {
        this.blockAlertingIfIPPrincipalLoggedOff = value;
    }

    /**
     * bridgedAppearanceOriginationRestriction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgedAppearanceOriginationRestriction() {
        return bridgedAppearanceOriginationRestriction;
    }

    /**
     * bridgedAppearanceOriginationRestriction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgedAppearanceOriginationRestriction(String value) {
        this.bridgedAppearanceOriginationRestriction = value;
    }

    /**
     * busyAutoCallbackWithoutFlash 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyAutoCallbackWithoutFlash() {
        return busyAutoCallbackWithoutFlash;
    }

    /**
     * busyAutoCallbackWithoutFlash 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyAutoCallbackWithoutFlash(String value) {
        this.busyAutoCallbackWithoutFlash = value;
    }

    /**
     * buttonModules 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonModules() {
        return buttonModules;
    }

    /**
     * buttonModules 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonModules(String value) {
        this.buttonModules = value;
    }

    /**
     * callAppearanceDisplayFormat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallAppearanceDisplayFormat() {
        return callAppearanceDisplayFormat;
    }

    /**
     * callAppearanceDisplayFormat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallAppearanceDisplayFormat(String value) {
        this.callAppearanceDisplayFormat = value;
    }

    /**
     * ipPhoneGroupID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPPhoneGroupID() {
        return ipPhoneGroupID;
    }

    /**
     * ipPhoneGroupID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPPhoneGroupID(String value) {
        this.ipPhoneGroupID = value;
    }

    /**
     * precedenceCallWaiting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedenceCallWaiting() {
        return precedenceCallWaiting;
    }

    /**
     * precedenceCallWaiting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedenceCallWaiting(String value) {
        this.precedenceCallWaiting = value;
    }

    /**
     * saccfOverride 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACCFOverride() {
        return saccfOverride;
    }

    /**
     * saccfOverride 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACCFOverride(String value) {
        this.saccfOverride = value;
    }

    /**
     * sipTrunk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPTrunk() {
        return sipTrunk;
    }

    /**
     * sipTrunk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPTrunk(String value) {
        this.sipTrunk = value;
    }

    /**
     * timeOfDayLockTable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfDayLockTable() {
        return timeOfDayLockTable;
    }

    /**
     * timeOfDayLockTable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfDayLockTable(String value) {
        this.timeOfDayLockTable = value;
    }

    /**
     * typeOf3PCCEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOf3PCCEnabled() {
        return typeOf3PCCEnabled;
    }

    /**
     * typeOf3PCCEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOf3PCCEnabled(String value) {
        this.typeOf3PCCEnabled = value;
    }

    /**
     * xoipEndpointType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXOIPEndpointType() {
        return xoipEndpointType;
    }

    /**
     * xoipEndpointType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXOIPEndpointType(String value) {
        this.xoipEndpointType = value;
    }

    /**
     * resultPort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultPort() {
        return resultPort;
    }

    /**
     * resultPort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultPort(String value) {
        this.resultPort = value;
    }

    /**
     * maintenanceName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceName() {
        return maintenanceName;
    }

    /**
     * maintenanceName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceName(String value) {
        this.maintenanceName = value;
    }

    /**
     * altName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltName() {
        return altName;
    }

    /**
     * altName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltName(String value) {
        this.altName = value;
    }

    /**
     * result 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * result 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * errorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * errorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
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
     * Gets the value of the abbreviatedDialingListType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialingListType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialingListType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialingListType() {
        if (abbreviatedDialingListType == null) {
            abbreviatedDialingListType = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialingListType;
    }

    /**
     * Gets the value of the abbreviatedDialingListNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialingListNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialingListNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialingListNumber() {
        if (abbreviatedDialingListNumber == null) {
            abbreviatedDialingListNumber = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialingListNumber;
    }

    /**
     * Gets the value of the buttonData1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData1() {
        if (buttonData1 == null) {
            buttonData1 = new ArrayList<ArrayType>();
        }
        return this.buttonData1;
    }

    /**
     * Gets the value of the buttonData2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData2() {
        if (buttonData2 == null) {
            buttonData2 = new ArrayList<ArrayType>();
        }
        return this.buttonData2;
    }

    /**
     * Gets the value of the buttonData3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData3() {
        if (buttonData3 == null) {
            buttonData3 = new ArrayList<ArrayType>();
        }
        return this.buttonData3;
    }

    /**
     * Gets the value of the buttonData4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData4() {
        if (buttonData4 == null) {
            buttonData4 = new ArrayList<ArrayType>();
        }
        return this.buttonData4;
    }

    /**
     * Gets the value of the buttonData5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData5() {
        if (buttonData5 == null) {
            buttonData5 = new ArrayList<ArrayType>();
        }
        return this.buttonData5;
    }

    /**
     * Gets the value of the buttonData6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData6() {
        if (buttonData6 == null) {
            buttonData6 = new ArrayList<ArrayType>();
        }
        return this.buttonData6;
    }

    /**
     * Gets the value of the buttonData7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData7() {
        if (buttonData7 == null) {
            buttonData7 = new ArrayList<ArrayType>();
        }
        return this.buttonData7;
    }

    /**
     * Gets the value of the dataList1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataList1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataList1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDataList1() {
        if (dataList1 == null) {
            dataList1 = new ArrayList<ArrayType>();
        }
        return this.dataList1;
    }

    /**
     * Gets the value of the dataPersonalListNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataPersonalListNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPersonalListNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDataPersonalListNumber() {
        if (dataPersonalListNumber == null) {
            dataPersonalListNumber = new ArrayList<ArrayType>();
        }
        return this.dataPersonalListNumber;
    }

}
