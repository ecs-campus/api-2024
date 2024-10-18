
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CapacityType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Current_Sys_Mem_Config" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_Patterns_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_Patterns_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_Pattrn_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_IDS_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_IDS_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_IDS_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Entries_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Entries_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Entries_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Pers_Lists_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Pers_Lists_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Pers_Lists_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_ACont_Assoc_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_ACont_Assoc_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_ACont_Assoc_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Notif_Req_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Notif_Req_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Notif_Req_SysLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_SAACC_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_SAACC_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_SAACC_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Pos_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Pos_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Pos_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Queue_Len_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Queue_Len_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attndant_Que_Len_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attndant_Stat_But_Usd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attndant_Stat_But_Avl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Atndt_Stat_But_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Codes_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Codes_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Codes_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_Agents_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_Agents_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_Agents_SysLim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_ACDm_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_ACDm_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_ACDm_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Split_Skills_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Split_Skills_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Split_Skl_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_VDNS_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_VDNS_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_VDNS_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Ans_Group_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Ans_Group_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Ans_Grp_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Path_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Path_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Path_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Pckp_Grp_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Pckp_Grp_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Pkp_Grp_Sy_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Records_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_VDN_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_VDN_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_VDN_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_VDN_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_VDN_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_VDN_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Conf_Ports_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Conf_Ports_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Cnf_Port_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Vectors_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Vectors_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Vectors_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Vectors_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Vectors_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Vectors_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_App_Loc_Pairs_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_App_Loc_Pairs_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_App_Loc_Pairs_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_BSR_Poll_VDN_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_BSR_Poll_VDN_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_BSR_Poll_VDN_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administered_Cons_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administered_Cons_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administered_Cons_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alpha_Dial_Entries_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alpha_Dial_Entries_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alpha_Dial_Ent_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Plan_Ext_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Plan_Ext_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Plan_Ext_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misc_Dial_Plan_Ext_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misc_Dial_Plan_Ext_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misc_Dl_Pln_Ex_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Ext_Recores_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Ext_Recores_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Ext_Recores_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digital_Data_End_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digital_Data_End_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dig_Data_End_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Port_Net_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Port_Net_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Port_Net_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Facility_Busy_Ind_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Facility_Busy_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Faclty_Bsy_Ind_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Spit_Skills_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Spit_Skills_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Spit_Skills_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Skill_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Skill_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Skl_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACDs_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACDs_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACDs_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocates_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocates_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advcts_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IPSoft_Agt_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IPSoft_Agt_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lgn_IPSft_Agt_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Members_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Members_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Members_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMSACD_Members_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMSACD_Members_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMSACD_Mem_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Queue_Sl_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Queue_Sl_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Quel_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Call_Stat_But_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Call_Stat_But_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Call_Stat_But_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intercom_Groups_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intercom_Groups_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intercom_Grp_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modem_Pool_Groups_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modem_Pool_Groups_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modem_Pool_Grps_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCOL_Trunk_Groups_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCOL_Trunk_Groups_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCOL_Trn_Groups_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Queue_Slots_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Queue_Slots_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Que_Slot_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ext_Source_Combo_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ext_Source_Combo_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ext_Src_Combo_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2501_VAL_Board_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2501_VAL_Board_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2501_VAL_Board_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Gate_vVAL_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Gate_vVAL_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Gate_vVAL_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B80_VOIP_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B80_VOIP_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B80_VOIP_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B320_VOIP_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B320_VOIP_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B320_VOIP_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admins_TSCs_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admins_TSCs_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admins_TSCs_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCATSC_Calls_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCATSC_Calls_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCATSC_Calls_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Circuit_Packs_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Circuit_Packs_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Crct_Pack_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_with_Echo_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_with_Echo_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_with_Echo_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICHTIS_DNS_IP_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICHTIS_DNS_IP_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICHTIS_DNS_IP_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_CBC_Service_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_CBC_Service_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_CBC_ServSys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Groups_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Groups_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Groups_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Ports_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Ports_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Ports_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H323_Trunks_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H323_Trunks_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H323_Trunks_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rem_Ofice_Trks_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rem_Ofice_Trks_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rem_Ofice_Trk_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Trunks_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Trunks_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Trunks_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIP_Trunks_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIP_Trunks_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIP_Trunks_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_But_Mem_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_But_Mem_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_But_Mem_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom_But_Labels_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom_But_Labels_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom_But_Labels_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Records_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Records_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Rec_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Rec_TTI_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Rec_TTI_Shrd_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRI_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stations_With_Port_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stations_WOut_Port_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTI_Ports_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Move_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Move_Stations_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Mve_Station_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adm_IPSoft_Phone_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_H323_Stat_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_H323_Stat_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vid_H323_Sta_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_IPSoftphones_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_IPSoftphones_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vid_IPSft_Ph_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_BRI_End_Trk_Port_Usd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_BRI_End_Trk_Port_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_BRI_End_Trunk_Port_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Trk_Ports_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Trk_Ports_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Trk_Prt_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Capacity_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Capacity_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Capacity_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Stations_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Stations_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Radio_Controllers_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Radio_Controllers_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Radio_Ctrlr_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wireless_Terminals_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wireless_Terminals_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wireless_Terml_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMobile_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMobile_Stations_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMobile_Sta_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EC500_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DECT_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHS_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_EC500_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_EC500_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_EC500_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_OPS_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_OPS_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_OPS_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_SCCAN_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_SCCAN_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_SCCAN_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_Memory_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_Memory_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_Memory_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stations_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stations_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stationsin_TTI_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Attendant_Cons_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Attendant_Cons_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Atdt_Cons_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Offic_Stat_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Offic_Stat_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_OffcS_tat_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnAuth_H323_Stat_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnAuth_H323_Sta_Ava" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnAuth_H323_Stat_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Software_Load" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Memory_Configuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offer_Catagory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Software_Load" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Memory_Config" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Offer_Catagory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}CapacityArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapacityType", propOrder = {
    "currentSysMemConfig",
    "aarArsPatternsUsed",
    "aarArsPatternsAval",
    "aarArsPattrnSysLim",
    "aarArsIDSUsed",
    "aarArsIDSAval",
    "aarArsIDSSysLimit",
    "adEntriesUsed",
    "adEntriesAval",
    "adEntriesSysLimit",
    "adPersListsUsed",
    "adPersListsAval",
    "adPersListsSysLimit",
    "asaiaContAssocUsed",
    "asaiaContAssocAval",
    "asaiaContAssocSysLim",
    "asaiNotifReqUsed",
    "asaiNotifReqAval",
    "asaiNotifReqSysLimit",
    "asaisaaccUsed",
    "asaisaaccAval",
    "asaisaaccSysLimit",
    "attendantPosUsed",
    "attendantPosAval",
    "attendantPosSysLim",
    "attendantQueueLenUsed",
    "attendantQueueLenAval",
    "attndantQueLenSysLim",
    "attndantStatButUsd",
    "attndantStatButAvl",
    "atndtStatButSysLim",
    "authCodesUsed",
    "authCodesAval",
    "authCodesSysLimit",
    "bcmsMeasAgentsUsed",
    "bcmsMeasAgentsAval",
    "bcmsMeasAgentsSysLim",
    "bcmsMeasACDmUsed",
    "bcmsMeasACDmAval",
    "bcmsMeasACDmSysLimit",
    "bcmsSplitSkillsUsed",
    "bcmsSplitSkillsAval",
    "bcmsSplitSklSysLim",
    "bcmsMeasVDNSUsed",
    "bcmsMeasVDNSAval",
    "bcmsMeasVDNSSysLimit",
    "callCovAnsGroupUsed",
    "callCovAnsGroupAval",
    "callCovAnsGrpSysLim",
    "callCovPathUsed",
    "callCovPathAval",
    "callCovPathSysLimit",
    "callCovPckpGrpUsed",
    "callCovPckpGrpAval",
    "callCovPkpGrpSyLim",
    "callRecordsSysLimit",
    "totalVDNUsed",
    "totalVDNAval",
    "totalVDNSysLimit",
    "meetMeVDNUsed",
    "meetMeVDNAval",
    "meetMeVDNSysLimit",
    "meetMeConfPortsUsed",
    "meetMeConfPortsAval",
    "meetMeCnfPortSysLim",
    "totalVectorsUsed",
    "totalVectorsAval",
    "totalVectorsSysLimit",
    "meetMeVectorsUsed",
    "meetMeVectorsAval",
    "meetMeVectorsSysLimit",
    "bsrAppLocPairsUsed",
    "bsrAppLocPairsAval",
    "bsrAppLocPairsSysLim",
    "backBSRPollVDNUsed",
    "backBSRPollVDNAval",
    "backBSRPollVDNSysLim",
    "administeredConsUsed",
    "administeredConsAval",
    "administeredConsSysLim",
    "alphaDialEntriesUsed",
    "alphaDialEntriesAval",
    "alphaDialEntSysLim",
    "dialPlanExtUsed",
    "dialPlanExtAval",
    "dialPlanExtSysLimit",
    "miscDialPlanExtUsed",
    "miscDialPlanExtAval",
    "miscDlPlnExSysLim",
    "udpExtRecoresUsed",
    "udpExtRecoresAval",
    "udpExtRecoresSysLimit",
    "digitalDataEndUsed",
    "digitalDataEndAval",
    "digDataEndSysLim",
    "expPortNetUsed",
    "expPortNetAval",
    "expPortNetSysLimit",
    "facilityBusyIndUsed",
    "facilityBusyAval",
    "facltyBsyIndSysLim",
    "groupSpitSkillsUsed",
    "groupSpitSkillsAval",
    "groupSpitSkillsSysLimit",
    "adminLogAgeUsed",
    "adminLogAgeAval",
    "adminLogAgeSysLimit",
    "adminLogAgeSkillUsed",
    "adminLogAgeSkillAval",
    "adminLogAgeSklSysLim",
    "loggedInACDsUsed",
    "loggedInACDsAval",
    "loggedInACDsSysLimit",
    "loggedInAdvocatesUsed",
    "loggedInAdvocatesAval",
    "loggedInAdvctsSysLim",
    "loggedInIPSoftAgtUsed",
    "loggedInIPSoftAgtAval",
    "lgnIPSftAgtSysLim",
    "groupMembersUsed",
    "groupMembersAval",
    "groupMembersSysLimit",
    "cmsacdMembersUsed",
    "cmsacdMembersAval",
    "cmsacdMemSysLimit",
    "dynamicQueueSlUsed",
    "dynamicQueueSlAval",
    "dynamicQuelSysLim",
    "queueCallStatButUsed",
    "queueCallStatButAval",
    "queueCallStatButSysLim",
    "intercomGroupsUsed",
    "intercomGroupsAval",
    "intercomGrpSysLim",
    "modemPoolGroupsUsed",
    "modemPoolGroupsAval",
    "modemPoolGrpsSysLim",
    "pcolTrunkGroupsUsed",
    "pcolTrunkGroupsAval",
    "pcolTrnGroupsSysLim",
    "analogQueueSlotsUsed",
    "analogQueueSlotsAval",
    "analogQueSlotSysLim",
    "extSourceComboUsed",
    "extSourceComboAval",
    "extSrcComboSysLim",
    "tn2501VALBoardUsed",
    "tn2501VALBoardAval",
    "tn2501VALBoardSysLimit",
    "mediaGateVVALUsed",
    "mediaGateVVALAval",
    "mediaGateVVALSysLimit",
    "tn2602B80VOIPUsed",
    "tn2602B80VOIPAval",
    "tn2602B80VOIPSysLimit",
    "tn2602B320VOIPUsed",
    "tn2602B320VOIPAval",
    "tn2602B320VOIPSysLim",
    "adminsTSCsUsed",
    "adminsTSCsAval",
    "adminsTSCsSysLimit",
    "ncatscCallsUsed",
    "ncatscCallsAval",
    "ncatscCallsSysLimit",
    "ds1CircuitPacksUsed",
    "ds1CircuitPacksAval",
    "ds1CrctPackSysLim",
    "ds1WithEchoUsed",
    "ds1WithEchoAval",
    "ds1WithEchoSysLimit",
    "ichtisdnsipUsed",
    "ichtisdnsipAval",
    "ichtisdnsipSysLimit",
    "isdncbcServiceUsed",
    "isdncbcServiceAval",
    "isdncbcServSysLim",
    "trunkGroupsUsed",
    "trunkGroupsAval",
    "trunkGroupsSysLimit",
    "trunkPortsUsed",
    "trunkPortsAval",
    "trunkPortsSysLimit",
    "h323TrunksUsed",
    "h323TrunksAval",
    "h323TrunksSysLimit",
    "remOficeTrksUsed",
    "remOficeTrksAval",
    "remOficeTrkSysLim",
    "sbsTrunksUsed",
    "sbsTrunksAval",
    "sbsTrunksSysLimit",
    "sipTrunksUsed",
    "sipTrunksAval",
    "sipTrunksSysLimit",
    "stationButMemUsed",
    "stationButMemAval",
    "stationButMemSysLimit",
    "customButLabelsUsed",
    "customButLabelsAval",
    "customButLabelsSysLim",
    "stationRecordsUsed",
    "stationRecordsAval",
    "stationRecSysLim",
    "stationRecTTIUsed",
    "stationRecTTIShrdUsed",
    "briStationsUsed",
    "stationsWithPortUsed",
    "stationsWOutPortUsed",
    "otherStationsUsed",
    "ttiPortsUsed",
    "autoMoveStationsUsed",
    "autoMoveStationsAval",
    "autoMveStationSysLim",
    "admIPSoftPhoneUsed",
    "videoH323StatUsed",
    "videoH323StatAval",
    "vidH323StaSysLim",
    "videoIPSoftphonesUsed",
    "videoIPSoftphonesAval",
    "vidIPSftPhSysLim",
    "isdnbriEndTrkPortUsd",
    "isdnbriEndTrkPortAval",
    "isdnbriEndTrunkPortSysLim",
    "stationTrkPortsUsed",
    "stationTrkPortsAval",
    "stationTrkPrtSysLim",
    "stationCapacityUsed",
    "stationCapacityAval",
    "stationCapacitySysLimit",
    "sbsStationsUsed",
    "sbsStationsAval",
    "sbsStationsSysLimit",
    "radioControllersUsed",
    "radioControllersAval",
    "radioCtrlrSysLim",
    "wirelessTerminalsUsed",
    "wirelessTerminalsAval",
    "wirelessTermlSysLim",
    "xMobileStationsUsed",
    "xMobileStationsAval",
    "xMobileStaSysLim",
    "ec500Used",
    "dectUsed",
    "phsUsed",
    "offPBXEC500Used",
    "offPBXEC500Aval",
    "offPBXEC500SysLimit",
    "offPBXOPSUsed",
    "offPBXOPSAval",
    "offPBXOPSSysLimit",
    "offPBXSCCANUsed",
    "offPBXSCCANAval",
    "offPBXSCCANSysLimit",
    "offPBXMemoryUsed",
    "offPBXMemoryAval",
    "offPBXMemorySysLimit",
    "ipStationsUsed",
    "ipStationsAval",
    "ipStationsSysLimit",
    "ipStationsinTTIUsed",
    "ipAttendantConsUsed",
    "ipAttendantConsAval",
    "ipAtdtConsSysLim",
    "remoteOfficStatUsed",
    "remoteOfficStatAval",
    "remoteOffcSTatSysLim",
    "unAuthH323StatUsed",
    "unAuthH323StaAva",
    "unAuthH323StatSysLim",
    "softwareLoad",
    "memoryConfiguration",
    "offerCatagory",
    "lastSoftwareLoad",
    "lastMemoryConfig",
    "lastOfferCatagory",
    "currentRegID",
    "currentRegRel",
    "currentRegRegist",
    "currentRegAvail",
    "currentRegSysLim"
})
public class CapacityType {

    @XmlElement(name = "Current_Sys_Mem_Config")
    protected String currentSysMemConfig;
    @XmlElement(name = "Aar_Ars_Patterns_Used")
    protected String aarArsPatternsUsed;
    @XmlElement(name = "Aar_Ars_Patterns_Aval")
    protected String aarArsPatternsAval;
    @XmlElement(name = "Aar_Ars_Pattrn_Sys_Lim")
    protected String aarArsPattrnSysLim;
    @XmlElement(name = "Aar_Ars_IDS_Used")
    protected String aarArsIDSUsed;
    @XmlElement(name = "Aar_Ars_IDS_Aval")
    protected String aarArsIDSAval;
    @XmlElement(name = "Aar_Ars_IDS_Sys_Limit")
    protected String aarArsIDSSysLimit;
    @XmlElement(name = "AD_Entries_Used")
    protected String adEntriesUsed;
    @XmlElement(name = "AD_Entries_Aval")
    protected String adEntriesAval;
    @XmlElement(name = "AD_Entries_Sys_Limit")
    protected String adEntriesSysLimit;
    @XmlElement(name = "AD_Pers_Lists_Used")
    protected String adPersListsUsed;
    @XmlElement(name = "AD_Pers_Lists_Aval")
    protected String adPersListsAval;
    @XmlElement(name = "AD_Pers_Lists_Sys_Limit")
    protected String adPersListsSysLimit;
    @XmlElement(name = "ASAI_ACont_Assoc_Used")
    protected String asaiaContAssocUsed;
    @XmlElement(name = "ASAI_ACont_Assoc_Aval")
    protected String asaiaContAssocAval;
    @XmlElement(name = "ASAI_ACont_Assoc_Sys_Lim")
    protected String asaiaContAssocSysLim;
    @XmlElement(name = "ASAI_Notif_Req_Used")
    protected String asaiNotifReqUsed;
    @XmlElement(name = "ASAI_Notif_Req_Aval")
    protected String asaiNotifReqAval;
    @XmlElement(name = "ASAI_Notif_Req_SysLimit")
    protected String asaiNotifReqSysLimit;
    @XmlElement(name = "ASAI_SAACC_Used")
    protected String asaisaaccUsed;
    @XmlElement(name = "ASAI_SAACC_Aval")
    protected String asaisaaccAval;
    @XmlElement(name = "ASAI_SAACC_Sys_Limit")
    protected String asaisaaccSysLimit;
    @XmlElement(name = "Attendant_Pos_Used")
    protected String attendantPosUsed;
    @XmlElement(name = "Attendant_Pos_Aval")
    protected String attendantPosAval;
    @XmlElement(name = "Attendant_Pos_Sys_Lim")
    protected String attendantPosSysLim;
    @XmlElement(name = "Attendant_Queue_Len_Used")
    protected String attendantQueueLenUsed;
    @XmlElement(name = "Attendant_Queue_Len_Aval")
    protected String attendantQueueLenAval;
    @XmlElement(name = "Attndant_Que_Len_Sys_Lim")
    protected String attndantQueLenSysLim;
    @XmlElement(name = "Attndant_Stat_But_Usd")
    protected String attndantStatButUsd;
    @XmlElement(name = "Attndant_Stat_But_Avl")
    protected String attndantStatButAvl;
    @XmlElement(name = "Atndt_Stat_But_Sys_Lim")
    protected String atndtStatButSysLim;
    @XmlElement(name = "Auth_Codes_Used")
    protected String authCodesUsed;
    @XmlElement(name = "Auth_Codes_Aval")
    protected String authCodesAval;
    @XmlElement(name = "Auth_Codes_Sys_Limit")
    protected String authCodesSysLimit;
    @XmlElement(name = "BCMS_Meas_Agents_Used")
    protected String bcmsMeasAgentsUsed;
    @XmlElement(name = "BCMS_Meas_Agents_Aval")
    protected String bcmsMeasAgentsAval;
    @XmlElement(name = "BCMS_Meas_Agents_SysLim")
    protected String bcmsMeasAgentsSysLim;
    @XmlElement(name = "BCMS_Meas_ACDm_Used")
    protected String bcmsMeasACDmUsed;
    @XmlElement(name = "BCMS_Meas_ACDm_Aval")
    protected String bcmsMeasACDmAval;
    @XmlElement(name = "BCMS_Meas_ACDm_Sys_Limit")
    protected String bcmsMeasACDmSysLimit;
    @XmlElement(name = "BCMS_Split_Skills_Used")
    protected String bcmsSplitSkillsUsed;
    @XmlElement(name = "BCMS_Split_Skills_Aval")
    protected String bcmsSplitSkillsAval;
    @XmlElement(name = "BCMS_Split_Skl_Sys_Lim")
    protected String bcmsSplitSklSysLim;
    @XmlElement(name = "BCMS_Meas_VDNS_Used")
    protected String bcmsMeasVDNSUsed;
    @XmlElement(name = "BCMS_Meas_VDNS_Aval")
    protected String bcmsMeasVDNSAval;
    @XmlElement(name = "BCMS_Meas_VDNS_Sys_Limit")
    protected String bcmsMeasVDNSSysLimit;
    @XmlElement(name = "Call_Cov_Ans_Group_Used")
    protected String callCovAnsGroupUsed;
    @XmlElement(name = "Call_Cov_Ans_Group_Aval")
    protected String callCovAnsGroupAval;
    @XmlElement(name = "Call_Cov_Ans_Grp_Sys_Lim")
    protected String callCovAnsGrpSysLim;
    @XmlElement(name = "Call_Cov_Path_Used")
    protected String callCovPathUsed;
    @XmlElement(name = "Call_Cov_Path_Aval")
    protected String callCovPathAval;
    @XmlElement(name = "Call_Cov_Path_Sys_Limit")
    protected String callCovPathSysLimit;
    @XmlElement(name = "Call_Cov_Pckp_Grp_Used")
    protected String callCovPckpGrpUsed;
    @XmlElement(name = "Call_Cov_Pckp_Grp_Aval")
    protected String callCovPckpGrpAval;
    @XmlElement(name = "Call_Cov_Pkp_Grp_Sy_Lim")
    protected String callCovPkpGrpSyLim;
    @XmlElement(name = "Call_Records_Sys_Limit")
    protected String callRecordsSysLimit;
    @XmlElement(name = "Total_VDN_Used")
    protected String totalVDNUsed;
    @XmlElement(name = "Total_VDN_Aval")
    protected String totalVDNAval;
    @XmlElement(name = "Total_VDN_Sys_Limit")
    protected String totalVDNSysLimit;
    @XmlElement(name = "Meet_Me_VDN_Used")
    protected String meetMeVDNUsed;
    @XmlElement(name = "Meet_Me_VDN_Aval")
    protected String meetMeVDNAval;
    @XmlElement(name = "Meet_Me_VDN_Sys_Limit")
    protected String meetMeVDNSysLimit;
    @XmlElement(name = "Meet_Me_Conf_Ports_Used")
    protected String meetMeConfPortsUsed;
    @XmlElement(name = "Meet_Me_Conf_Ports_Aval")
    protected String meetMeConfPortsAval;
    @XmlElement(name = "Meet_Me_Cnf_Port_Sys_Lim")
    protected String meetMeCnfPortSysLim;
    @XmlElement(name = "Total_Vectors_Used")
    protected String totalVectorsUsed;
    @XmlElement(name = "Total_Vectors_Aval")
    protected String totalVectorsAval;
    @XmlElement(name = "Total_Vectors_Sys_Limit")
    protected String totalVectorsSysLimit;
    @XmlElement(name = "Meet_Me_Vectors_Used")
    protected String meetMeVectorsUsed;
    @XmlElement(name = "Meet_Me_Vectors_Aval")
    protected String meetMeVectorsAval;
    @XmlElement(name = "Meet_Me_Vectors_Sys_Limit")
    protected String meetMeVectorsSysLimit;
    @XmlElement(name = "BSR_App_Loc_Pairs_Used")
    protected String bsrAppLocPairsUsed;
    @XmlElement(name = "BSR_App_Loc_Pairs_Aval")
    protected String bsrAppLocPairsAval;
    @XmlElement(name = "BSR_App_Loc_Pairs_Sys_Lim")
    protected String bsrAppLocPairsSysLim;
    @XmlElement(name = "Back_BSR_Poll_VDN_Used")
    protected String backBSRPollVDNUsed;
    @XmlElement(name = "Back_BSR_Poll_VDN_Aval")
    protected String backBSRPollVDNAval;
    @XmlElement(name = "Back_BSR_Poll_VDN_Sys_Lim")
    protected String backBSRPollVDNSysLim;
    @XmlElement(name = "Administered_Cons_Used")
    protected String administeredConsUsed;
    @XmlElement(name = "Administered_Cons_Aval")
    protected String administeredConsAval;
    @XmlElement(name = "Administered_Cons_Sys_Lim")
    protected String administeredConsSysLim;
    @XmlElement(name = "Alpha_Dial_Entries_Used")
    protected String alphaDialEntriesUsed;
    @XmlElement(name = "Alpha_Dial_Entries_Aval")
    protected String alphaDialEntriesAval;
    @XmlElement(name = "Alpha_Dial_Ent_Sys_Lim")
    protected String alphaDialEntSysLim;
    @XmlElement(name = "Dial_Plan_Ext_Used")
    protected String dialPlanExtUsed;
    @XmlElement(name = "Dial_Plan_Ext_Aval")
    protected String dialPlanExtAval;
    @XmlElement(name = "Dial_Plan_Ext_Sys_Limit")
    protected String dialPlanExtSysLimit;
    @XmlElement(name = "Misc_Dial_Plan_Ext_Used")
    protected String miscDialPlanExtUsed;
    @XmlElement(name = "Misc_Dial_Plan_Ext_Aval")
    protected String miscDialPlanExtAval;
    @XmlElement(name = "Misc_Dl_Pln_Ex_Sys_Lim")
    protected String miscDlPlnExSysLim;
    @XmlElement(name = "UDP_Ext_Recores_Used")
    protected String udpExtRecoresUsed;
    @XmlElement(name = "UDP_Ext_Recores_Aval")
    protected String udpExtRecoresAval;
    @XmlElement(name = "UDP_Ext_Recores_Sys_Limit")
    protected String udpExtRecoresSysLimit;
    @XmlElement(name = "Digital_Data_End_Used")
    protected String digitalDataEndUsed;
    @XmlElement(name = "Digital_Data_End_Aval")
    protected String digitalDataEndAval;
    @XmlElement(name = "Dig_Data_End_Sys_Lim")
    protected String digDataEndSysLim;
    @XmlElement(name = "Exp_Port_Net_Used")
    protected String expPortNetUsed;
    @XmlElement(name = "Exp_Port_Net_Aval")
    protected String expPortNetAval;
    @XmlElement(name = "Exp_Port_Net_Sys_Limit")
    protected String expPortNetSysLimit;
    @XmlElement(name = "Facility_Busy_Ind_Used")
    protected String facilityBusyIndUsed;
    @XmlElement(name = "Facility_Busy_Aval")
    protected String facilityBusyAval;
    @XmlElement(name = "Faclty_Bsy_Ind_Sys_Lim")
    protected String facltyBsyIndSysLim;
    @XmlElement(name = "Group_Spit_Skills_Used")
    protected String groupSpitSkillsUsed;
    @XmlElement(name = "Group_Spit_Skills_Aval")
    protected String groupSpitSkillsAval;
    @XmlElement(name = "Group_Spit_Skills_Sys_Limit")
    protected String groupSpitSkillsSysLimit;
    @XmlElement(name = "Admin_Log_Age_Used")
    protected String adminLogAgeUsed;
    @XmlElement(name = "Admin_Log_Age_Aval")
    protected String adminLogAgeAval;
    @XmlElement(name = "Admin_Log_Age_Sys_Limit")
    protected String adminLogAgeSysLimit;
    @XmlElement(name = "Admin_Log_Age_Skill_Used")
    protected String adminLogAgeSkillUsed;
    @XmlElement(name = "Admin_Log_Age_Skill_Aval")
    protected String adminLogAgeSkillAval;
    @XmlElement(name = "Admin_Log_Age_Skl_Sys_Lim")
    protected String adminLogAgeSklSysLim;
    @XmlElement(name = "Logged_In_ACDs_Used")
    protected String loggedInACDsUsed;
    @XmlElement(name = "Logged_In_ACDs_Aval")
    protected String loggedInACDsAval;
    @XmlElement(name = "Logged_In_ACDs_Sys_Limit")
    protected String loggedInACDsSysLimit;
    @XmlElement(name = "Logged_In_Advocates_Used")
    protected String loggedInAdvocatesUsed;
    @XmlElement(name = "Logged_In_Advocates_Aval")
    protected String loggedInAdvocatesAval;
    @XmlElement(name = "Logged_In_Advcts_Sys_Lim")
    protected String loggedInAdvctsSysLim;
    @XmlElement(name = "Logged_In_IPSoft_Agt_Used")
    protected String loggedInIPSoftAgtUsed;
    @XmlElement(name = "Logged_In_IPSoft_Agt_Aval")
    protected String loggedInIPSoftAgtAval;
    @XmlElement(name = "Lgn_IPSft_Agt_Sys_Lim")
    protected String lgnIPSftAgtSysLim;
    @XmlElement(name = "Group_Members_Used")
    protected String groupMembersUsed;
    @XmlElement(name = "Group_Members_Aval")
    protected String groupMembersAval;
    @XmlElement(name = "Group_Members_Sys_Limit")
    protected String groupMembersSysLimit;
    @XmlElement(name = "CMSACD_Members_Used")
    protected String cmsacdMembersUsed;
    @XmlElement(name = "CMSACD_Members_Aval")
    protected String cmsacdMembersAval;
    @XmlElement(name = "CMSACD_Mem_Sys_Limit")
    protected String cmsacdMemSysLimit;
    @XmlElement(name = "Dynamic_Queue_Sl_Used")
    protected String dynamicQueueSlUsed;
    @XmlElement(name = "Dynamic_Queue_Sl_Aval")
    protected String dynamicQueueSlAval;
    @XmlElement(name = "Dynamic_Quel_Sys_Lim")
    protected String dynamicQuelSysLim;
    @XmlElement(name = "Queue_Call_Stat_But_Used")
    protected String queueCallStatButUsed;
    @XmlElement(name = "Queue_Call_Stat_But_Aval")
    protected String queueCallStatButAval;
    @XmlElement(name = "Queue_Call_Stat_But_Sys_Lim")
    protected String queueCallStatButSysLim;
    @XmlElement(name = "Intercom_Groups_Used")
    protected String intercomGroupsUsed;
    @XmlElement(name = "Intercom_Groups_Aval")
    protected String intercomGroupsAval;
    @XmlElement(name = "Intercom_Grp_Sys_Lim")
    protected String intercomGrpSysLim;
    @XmlElement(name = "Modem_Pool_Groups_Used")
    protected String modemPoolGroupsUsed;
    @XmlElement(name = "Modem_Pool_Groups_Aval")
    protected String modemPoolGroupsAval;
    @XmlElement(name = "Modem_Pool_Grps_Sys_Lim")
    protected String modemPoolGrpsSysLim;
    @XmlElement(name = "PCOL_Trunk_Groups_Used")
    protected String pcolTrunkGroupsUsed;
    @XmlElement(name = "PCOL_Trunk_Groups_Aval")
    protected String pcolTrunkGroupsAval;
    @XmlElement(name = "PCOL_Trn_Groups_Sys_Lim")
    protected String pcolTrnGroupsSysLim;
    @XmlElement(name = "Analog_Queue_Slots_Used")
    protected String analogQueueSlotsUsed;
    @XmlElement(name = "Analog_Queue_Slots_Aval")
    protected String analogQueueSlotsAval;
    @XmlElement(name = "Analog_Que_Slot_Sys_Lim")
    protected String analogQueSlotSysLim;
    @XmlElement(name = "Ext_Source_Combo_Used")
    protected String extSourceComboUsed;
    @XmlElement(name = "Ext_Source_Combo_Aval")
    protected String extSourceComboAval;
    @XmlElement(name = "Ext_Src_Combo_Sys_Lim")
    protected String extSrcComboSysLim;
    @XmlElement(name = "TN2501_VAL_Board_Used")
    protected String tn2501VALBoardUsed;
    @XmlElement(name = "TN2501_VAL_Board_Aval")
    protected String tn2501VALBoardAval;
    @XmlElement(name = "TN2501_VAL_Board_Sys_Limit")
    protected String tn2501VALBoardSysLimit;
    @XmlElement(name = "Media_Gate_vVAL_Used")
    protected String mediaGateVVALUsed;
    @XmlElement(name = "Media_Gate_vVAL_Aval")
    protected String mediaGateVVALAval;
    @XmlElement(name = "Media_Gate_vVAL_Sys_Limit")
    protected String mediaGateVVALSysLimit;
    @XmlElement(name = "TN2602_B80_VOIP_Used")
    protected String tn2602B80VOIPUsed;
    @XmlElement(name = "TN2602_B80_VOIP_Aval")
    protected String tn2602B80VOIPAval;
    @XmlElement(name = "TN2602_B80_VOIP_Sys_Limit")
    protected String tn2602B80VOIPSysLimit;
    @XmlElement(name = "TN2602_B320_VOIP_Used")
    protected String tn2602B320VOIPUsed;
    @XmlElement(name = "TN2602_B320_VOIP_Aval")
    protected String tn2602B320VOIPAval;
    @XmlElement(name = "TN2602_B320_VOIP_Sys_Lim")
    protected String tn2602B320VOIPSysLim;
    @XmlElement(name = "Admins_TSCs_Used")
    protected String adminsTSCsUsed;
    @XmlElement(name = "Admins_TSCs_Aval")
    protected String adminsTSCsAval;
    @XmlElement(name = "Admins_TSCs_Sys_Limit")
    protected String adminsTSCsSysLimit;
    @XmlElement(name = "NCATSC_Calls_Used")
    protected String ncatscCallsUsed;
    @XmlElement(name = "NCATSC_Calls_Aval")
    protected String ncatscCallsAval;
    @XmlElement(name = "NCATSC_Calls_Sys_Limit")
    protected String ncatscCallsSysLimit;
    @XmlElement(name = "DS1_Circuit_Packs_Used")
    protected String ds1CircuitPacksUsed;
    @XmlElement(name = "DS1_Circuit_Packs_Aval")
    protected String ds1CircuitPacksAval;
    @XmlElement(name = "DS1_Crct_Pack_Sys_Lim")
    protected String ds1CrctPackSysLim;
    @XmlElement(name = "DS1_with_Echo_Used")
    protected String ds1WithEchoUsed;
    @XmlElement(name = "DS1_with_Echo_Aval")
    protected String ds1WithEchoAval;
    @XmlElement(name = "DS1_with_Echo_Sys_Limit")
    protected String ds1WithEchoSysLimit;
    @XmlElement(name = "ICHTIS_DNS_IP_Used")
    protected String ichtisdnsipUsed;
    @XmlElement(name = "ICHTIS_DNS_IP_Aval")
    protected String ichtisdnsipAval;
    @XmlElement(name = "ICHTIS_DNS_IP_Sys_Limit")
    protected String ichtisdnsipSysLimit;
    @XmlElement(name = "ISDN_CBC_Service_Used")
    protected String isdncbcServiceUsed;
    @XmlElement(name = "ISDN_CBC_Service_Aval")
    protected String isdncbcServiceAval;
    @XmlElement(name = "ISDN_CBC_ServSys_Lim")
    protected String isdncbcServSysLim;
    @XmlElement(name = "Trunk_Groups_Used")
    protected String trunkGroupsUsed;
    @XmlElement(name = "Trunk_Groups_Aval")
    protected String trunkGroupsAval;
    @XmlElement(name = "Trunk_Groups_Sys_Limit")
    protected String trunkGroupsSysLimit;
    @XmlElement(name = "Trunk_Ports_Used")
    protected String trunkPortsUsed;
    @XmlElement(name = "Trunk_Ports_Aval")
    protected String trunkPortsAval;
    @XmlElement(name = "Trunk_Ports_Sys_Limit")
    protected String trunkPortsSysLimit;
    @XmlElement(name = "H323_Trunks_Used")
    protected String h323TrunksUsed;
    @XmlElement(name = "H323_Trunks_Aval")
    protected String h323TrunksAval;
    @XmlElement(name = "H323_Trunks_Sys_Limit")
    protected String h323TrunksSysLimit;
    @XmlElement(name = "Rem_Ofice_Trks_Used")
    protected String remOficeTrksUsed;
    @XmlElement(name = "Rem_Ofice_Trks_Aval")
    protected String remOficeTrksAval;
    @XmlElement(name = "Rem_Ofice_Trk_Sys_Lim")
    protected String remOficeTrkSysLim;
    @XmlElement(name = "SBS_Trunks_Used")
    protected String sbsTrunksUsed;
    @XmlElement(name = "SBS_Trunks_Aval")
    protected String sbsTrunksAval;
    @XmlElement(name = "SBS_Trunks_Sys_Limit")
    protected String sbsTrunksSysLimit;
    @XmlElement(name = "SIP_Trunks_Used")
    protected String sipTrunksUsed;
    @XmlElement(name = "SIP_Trunks_Aval")
    protected String sipTrunksAval;
    @XmlElement(name = "SIP_Trunks_Sys_Limit")
    protected String sipTrunksSysLimit;
    @XmlElement(name = "Station_But_Mem_Used")
    protected String stationButMemUsed;
    @XmlElement(name = "Station_But_Mem_Aval")
    protected String stationButMemAval;
    @XmlElement(name = "Station_But_Mem_Sys_Limit")
    protected String stationButMemSysLimit;
    @XmlElement(name = "Custom_But_Labels_Used")
    protected String customButLabelsUsed;
    @XmlElement(name = "Custom_But_Labels_Aval")
    protected String customButLabelsAval;
    @XmlElement(name = "Custom_But_Labels_Sys_Lim")
    protected String customButLabelsSysLim;
    @XmlElement(name = "Station_Records_Used")
    protected String stationRecordsUsed;
    @XmlElement(name = "Station_Records_Aval")
    protected String stationRecordsAval;
    @XmlElement(name = "Station_Rec_Sys_Lim")
    protected String stationRecSysLim;
    @XmlElement(name = "Station_Rec_TTI_Used")
    protected String stationRecTTIUsed;
    @XmlElement(name = "Station_Rec_TTI_Shrd_Used")
    protected String stationRecTTIShrdUsed;
    @XmlElement(name = "BRI_Stations_Used")
    protected String briStationsUsed;
    @XmlElement(name = "Stations_With_Port_Used")
    protected String stationsWithPortUsed;
    @XmlElement(name = "Stations_WOut_Port_Used")
    protected String stationsWOutPortUsed;
    @XmlElement(name = "Other_Stations_Used")
    protected String otherStationsUsed;
    @XmlElement(name = "TTI_Ports_Used")
    protected String ttiPortsUsed;
    @XmlElement(name = "Auto_Move_Stations_Used")
    protected String autoMoveStationsUsed;
    @XmlElement(name = "Auto_Move_Stations_Aval")
    protected String autoMoveStationsAval;
    @XmlElement(name = "Auto_Mve_Station_Sys_Lim")
    protected String autoMveStationSysLim;
    @XmlElement(name = "Adm_IPSoft_Phone_Used")
    protected String admIPSoftPhoneUsed;
    @XmlElement(name = "Video_H323_Stat_Used")
    protected String videoH323StatUsed;
    @XmlElement(name = "Video_H323_Stat_Aval")
    protected String videoH323StatAval;
    @XmlElement(name = "Vid_H323_Sta_Sys_Lim")
    protected String vidH323StaSysLim;
    @XmlElement(name = "Video_IPSoftphones_Used")
    protected String videoIPSoftphonesUsed;
    @XmlElement(name = "Video_IPSoftphones_Aval")
    protected String videoIPSoftphonesAval;
    @XmlElement(name = "Vid_IPSft_Ph_Sys_Lim")
    protected String vidIPSftPhSysLim;
    @XmlElement(name = "ISDN_BRI_End_Trk_Port_Usd")
    protected String isdnbriEndTrkPortUsd;
    @XmlElement(name = "ISDN_BRI_End_Trk_Port_Aval")
    protected String isdnbriEndTrkPortAval;
    @XmlElement(name = "ISDN_BRI_End_Trunk_Port_Sys_Lim")
    protected String isdnbriEndTrunkPortSysLim;
    @XmlElement(name = "Station_Trk_Ports_Used")
    protected String stationTrkPortsUsed;
    @XmlElement(name = "Station_Trk_Ports_Aval")
    protected String stationTrkPortsAval;
    @XmlElement(name = "Station_Trk_Prt_Sys_Lim")
    protected String stationTrkPrtSysLim;
    @XmlElement(name = "Station_Capacity_Used")
    protected String stationCapacityUsed;
    @XmlElement(name = "Station_Capacity_Aval")
    protected String stationCapacityAval;
    @XmlElement(name = "Station_Capacity_Sys_Limit")
    protected String stationCapacitySysLimit;
    @XmlElement(name = "SBS_Stations_Used")
    protected String sbsStationsUsed;
    @XmlElement(name = "SBS_Stations_Aval")
    protected String sbsStationsAval;
    @XmlElement(name = "SBS_Stations_Sys_Limit")
    protected String sbsStationsSysLimit;
    @XmlElement(name = "Radio_Controllers_Used")
    protected String radioControllersUsed;
    @XmlElement(name = "Radio_Controllers_Aval")
    protected String radioControllersAval;
    @XmlElement(name = "Radio_Ctrlr_Sys_Lim")
    protected String radioCtrlrSysLim;
    @XmlElement(name = "Wireless_Terminals_Used")
    protected String wirelessTerminalsUsed;
    @XmlElement(name = "Wireless_Terminals_Aval")
    protected String wirelessTerminalsAval;
    @XmlElement(name = "Wireless_Terml_Sys_Lim")
    protected String wirelessTermlSysLim;
    @XmlElement(name = "XMobile_Stations_Used")
    protected String xMobileStationsUsed;
    @XmlElement(name = "XMobile_Stations_Aval")
    protected String xMobileStationsAval;
    @XmlElement(name = "XMobile_Sta_Sys_Lim")
    protected String xMobileStaSysLim;
    @XmlElement(name = "EC500_Used")
    protected String ec500Used;
    @XmlElement(name = "DECT_Used")
    protected String dectUsed;
    @XmlElement(name = "PHS_Used")
    protected String phsUsed;
    @XmlElement(name = "OffPBX_EC500_Used")
    protected String offPBXEC500Used;
    @XmlElement(name = "OffPBX_EC500_Aval")
    protected String offPBXEC500Aval;
    @XmlElement(name = "OffPBX_EC500_Sys_Limit")
    protected String offPBXEC500SysLimit;
    @XmlElement(name = "OffPBX_OPS_Used")
    protected String offPBXOPSUsed;
    @XmlElement(name = "OffPBX_OPS_Aval")
    protected String offPBXOPSAval;
    @XmlElement(name = "OffPBX_OPS_Sys_Limit")
    protected String offPBXOPSSysLimit;
    @XmlElement(name = "OffPBX_SCCAN_Used")
    protected String offPBXSCCANUsed;
    @XmlElement(name = "OffPBX_SCCAN_Aval")
    protected String offPBXSCCANAval;
    @XmlElement(name = "OffPBX_SCCAN_Sys_Limit")
    protected String offPBXSCCANSysLimit;
    @XmlElement(name = "OffPBX_Memory_Used")
    protected String offPBXMemoryUsed;
    @XmlElement(name = "OffPBX_Memory_Aval")
    protected String offPBXMemoryAval;
    @XmlElement(name = "OffPBX_Memory_Sys_Limit")
    protected String offPBXMemorySysLimit;
    @XmlElement(name = "IP_Stations_Used")
    protected String ipStationsUsed;
    @XmlElement(name = "IP_Stations_Aval")
    protected String ipStationsAval;
    @XmlElement(name = "IP_Stations_Sys_Limit")
    protected String ipStationsSysLimit;
    @XmlElement(name = "IP_Stationsin_TTI_Used")
    protected String ipStationsinTTIUsed;
    @XmlElement(name = "IP_Attendant_Cons_Used")
    protected String ipAttendantConsUsed;
    @XmlElement(name = "IP_Attendant_Cons_Aval")
    protected String ipAttendantConsAval;
    @XmlElement(name = "IP_Atdt_Cons_Sys_Lim")
    protected String ipAtdtConsSysLim;
    @XmlElement(name = "Remote_Offic_Stat_Used")
    protected String remoteOfficStatUsed;
    @XmlElement(name = "Remote_Offic_Stat_Aval")
    protected String remoteOfficStatAval;
    @XmlElement(name = "Remote_OffcS_tat_Sys_Lim")
    protected String remoteOffcSTatSysLim;
    @XmlElement(name = "UnAuth_H323_Stat_Used")
    protected String unAuthH323StatUsed;
    @XmlElement(name = "UnAuth_H323_Sta_Ava")
    protected String unAuthH323StaAva;
    @XmlElement(name = "UnAuth_H323_Stat_Sys_Lim")
    protected String unAuthH323StatSysLim;
    @XmlElement(name = "Software_Load")
    protected String softwareLoad;
    @XmlElement(name = "Memory_Configuration")
    protected String memoryConfiguration;
    @XmlElement(name = "Offer_Catagory")
    protected String offerCatagory;
    @XmlElement(name = "Last_Software_Load")
    protected String lastSoftwareLoad;
    @XmlElement(name = "Last_Memory_Config")
    protected String lastMemoryConfig;
    @XmlElement(name = "Last_Offer_Catagory")
    protected String lastOfferCatagory;
    @XmlElement(name = "Current_Reg_ID")
    protected List<ArrayType> currentRegID;
    @XmlElement(name = "Current_Reg_Rel")
    protected List<ArrayType> currentRegRel;
    @XmlElement(name = "Current_Reg_Regist")
    protected List<ArrayType> currentRegRegist;
    @XmlElement(name = "Current_Reg_Avail")
    protected List<ArrayType> currentRegAvail;
    @XmlElement(name = "Current_Reg_Sys_Lim")
    protected List<ArrayType> currentRegSysLim;

    /**
     * currentSysMemConfig 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSysMemConfig() {
        return currentSysMemConfig;
    }

    /**
     * currentSysMemConfig 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSysMemConfig(String value) {
        this.currentSysMemConfig = value;
    }

    /**
     * aarArsPatternsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsPatternsUsed() {
        return aarArsPatternsUsed;
    }

    /**
     * aarArsPatternsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsPatternsUsed(String value) {
        this.aarArsPatternsUsed = value;
    }

    /**
     * aarArsPatternsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsPatternsAval() {
        return aarArsPatternsAval;
    }

    /**
     * aarArsPatternsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsPatternsAval(String value) {
        this.aarArsPatternsAval = value;
    }

    /**
     * aarArsPattrnSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsPattrnSysLim() {
        return aarArsPattrnSysLim;
    }

    /**
     * aarArsPattrnSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsPattrnSysLim(String value) {
        this.aarArsPattrnSysLim = value;
    }

    /**
     * aarArsIDSUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsIDSUsed() {
        return aarArsIDSUsed;
    }

    /**
     * aarArsIDSUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsIDSUsed(String value) {
        this.aarArsIDSUsed = value;
    }

    /**
     * aarArsIDSAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsIDSAval() {
        return aarArsIDSAval;
    }

    /**
     * aarArsIDSAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsIDSAval(String value) {
        this.aarArsIDSAval = value;
    }

    /**
     * aarArsIDSSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsIDSSysLimit() {
        return aarArsIDSSysLimit;
    }

    /**
     * aarArsIDSSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsIDSSysLimit(String value) {
        this.aarArsIDSSysLimit = value;
    }

    /**
     * adEntriesUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEntriesUsed() {
        return adEntriesUsed;
    }

    /**
     * adEntriesUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEntriesUsed(String value) {
        this.adEntriesUsed = value;
    }

    /**
     * adEntriesAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEntriesAval() {
        return adEntriesAval;
    }

    /**
     * adEntriesAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEntriesAval(String value) {
        this.adEntriesAval = value;
    }

    /**
     * adEntriesSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEntriesSysLimit() {
        return adEntriesSysLimit;
    }

    /**
     * adEntriesSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEntriesSysLimit(String value) {
        this.adEntriesSysLimit = value;
    }

    /**
     * adPersListsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPersListsUsed() {
        return adPersListsUsed;
    }

    /**
     * adPersListsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPersListsUsed(String value) {
        this.adPersListsUsed = value;
    }

    /**
     * adPersListsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPersListsAval() {
        return adPersListsAval;
    }

    /**
     * adPersListsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPersListsAval(String value) {
        this.adPersListsAval = value;
    }

    /**
     * adPersListsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPersListsSysLimit() {
        return adPersListsSysLimit;
    }

    /**
     * adPersListsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPersListsSysLimit(String value) {
        this.adPersListsSysLimit = value;
    }

    /**
     * asaiaContAssocUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIAContAssocUsed() {
        return asaiaContAssocUsed;
    }

    /**
     * asaiaContAssocUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIAContAssocUsed(String value) {
        this.asaiaContAssocUsed = value;
    }

    /**
     * asaiaContAssocAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIAContAssocAval() {
        return asaiaContAssocAval;
    }

    /**
     * asaiaContAssocAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIAContAssocAval(String value) {
        this.asaiaContAssocAval = value;
    }

    /**
     * asaiaContAssocSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIAContAssocSysLim() {
        return asaiaContAssocSysLim;
    }

    /**
     * asaiaContAssocSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIAContAssocSysLim(String value) {
        this.asaiaContAssocSysLim = value;
    }

    /**
     * asaiNotifReqUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAINotifReqUsed() {
        return asaiNotifReqUsed;
    }

    /**
     * asaiNotifReqUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAINotifReqUsed(String value) {
        this.asaiNotifReqUsed = value;
    }

    /**
     * asaiNotifReqAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAINotifReqAval() {
        return asaiNotifReqAval;
    }

    /**
     * asaiNotifReqAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAINotifReqAval(String value) {
        this.asaiNotifReqAval = value;
    }

    /**
     * asaiNotifReqSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAINotifReqSysLimit() {
        return asaiNotifReqSysLimit;
    }

    /**
     * asaiNotifReqSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAINotifReqSysLimit(String value) {
        this.asaiNotifReqSysLimit = value;
    }

    /**
     * asaisaaccUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAISAACCUsed() {
        return asaisaaccUsed;
    }

    /**
     * asaisaaccUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAISAACCUsed(String value) {
        this.asaisaaccUsed = value;
    }

    /**
     * asaisaaccAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAISAACCAval() {
        return asaisaaccAval;
    }

    /**
     * asaisaaccAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAISAACCAval(String value) {
        this.asaisaaccAval = value;
    }

    /**
     * asaisaaccSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAISAACCSysLimit() {
        return asaisaaccSysLimit;
    }

    /**
     * asaisaaccSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAISAACCSysLimit(String value) {
        this.asaisaaccSysLimit = value;
    }

    /**
     * attendantPosUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantPosUsed() {
        return attendantPosUsed;
    }

    /**
     * attendantPosUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantPosUsed(String value) {
        this.attendantPosUsed = value;
    }

    /**
     * attendantPosAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantPosAval() {
        return attendantPosAval;
    }

    /**
     * attendantPosAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantPosAval(String value) {
        this.attendantPosAval = value;
    }

    /**
     * attendantPosSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantPosSysLim() {
        return attendantPosSysLim;
    }

    /**
     * attendantPosSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantPosSysLim(String value) {
        this.attendantPosSysLim = value;
    }

    /**
     * attendantQueueLenUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantQueueLenUsed() {
        return attendantQueueLenUsed;
    }

    /**
     * attendantQueueLenUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantQueueLenUsed(String value) {
        this.attendantQueueLenUsed = value;
    }

    /**
     * attendantQueueLenAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantQueueLenAval() {
        return attendantQueueLenAval;
    }

    /**
     * attendantQueueLenAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantQueueLenAval(String value) {
        this.attendantQueueLenAval = value;
    }

    /**
     * attndantQueLenSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndantQueLenSysLim() {
        return attndantQueLenSysLim;
    }

    /**
     * attndantQueLenSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttndantQueLenSysLim(String value) {
        this.attndantQueLenSysLim = value;
    }

    /**
     * attndantStatButUsd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndantStatButUsd() {
        return attndantStatButUsd;
    }

    /**
     * attndantStatButUsd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttndantStatButUsd(String value) {
        this.attndantStatButUsd = value;
    }

    /**
     * attndantStatButAvl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndantStatButAvl() {
        return attndantStatButAvl;
    }

    /**
     * attndantStatButAvl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttndantStatButAvl(String value) {
        this.attndantStatButAvl = value;
    }

    /**
     * atndtStatButSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtndtStatButSysLim() {
        return atndtStatButSysLim;
    }

    /**
     * atndtStatButSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtndtStatButSysLim(String value) {
        this.atndtStatButSysLim = value;
    }

    /**
     * authCodesUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesUsed() {
        return authCodesUsed;
    }

    /**
     * authCodesUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesUsed(String value) {
        this.authCodesUsed = value;
    }

    /**
     * authCodesAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesAval() {
        return authCodesAval;
    }

    /**
     * authCodesAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesAval(String value) {
        this.authCodesAval = value;
    }

    /**
     * authCodesSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesSysLimit() {
        return authCodesSysLimit;
    }

    /**
     * authCodesSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesSysLimit(String value) {
        this.authCodesSysLimit = value;
    }

    /**
     * bcmsMeasAgentsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasAgentsUsed() {
        return bcmsMeasAgentsUsed;
    }

    /**
     * bcmsMeasAgentsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasAgentsUsed(String value) {
        this.bcmsMeasAgentsUsed = value;
    }

    /**
     * bcmsMeasAgentsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasAgentsAval() {
        return bcmsMeasAgentsAval;
    }

    /**
     * bcmsMeasAgentsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasAgentsAval(String value) {
        this.bcmsMeasAgentsAval = value;
    }

    /**
     * bcmsMeasAgentsSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasAgentsSysLim() {
        return bcmsMeasAgentsSysLim;
    }

    /**
     * bcmsMeasAgentsSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasAgentsSysLim(String value) {
        this.bcmsMeasAgentsSysLim = value;
    }

    /**
     * bcmsMeasACDmUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasACDmUsed() {
        return bcmsMeasACDmUsed;
    }

    /**
     * bcmsMeasACDmUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasACDmUsed(String value) {
        this.bcmsMeasACDmUsed = value;
    }

    /**
     * bcmsMeasACDmAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasACDmAval() {
        return bcmsMeasACDmAval;
    }

    /**
     * bcmsMeasACDmAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasACDmAval(String value) {
        this.bcmsMeasACDmAval = value;
    }

    /**
     * bcmsMeasACDmSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasACDmSysLimit() {
        return bcmsMeasACDmSysLimit;
    }

    /**
     * bcmsMeasACDmSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasACDmSysLimit(String value) {
        this.bcmsMeasACDmSysLimit = value;
    }

    /**
     * bcmsSplitSkillsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSSplitSkillsUsed() {
        return bcmsSplitSkillsUsed;
    }

    /**
     * bcmsSplitSkillsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSSplitSkillsUsed(String value) {
        this.bcmsSplitSkillsUsed = value;
    }

    /**
     * bcmsSplitSkillsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSSplitSkillsAval() {
        return bcmsSplitSkillsAval;
    }

    /**
     * bcmsSplitSkillsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSSplitSkillsAval(String value) {
        this.bcmsSplitSkillsAval = value;
    }

    /**
     * bcmsSplitSklSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSSplitSklSysLim() {
        return bcmsSplitSklSysLim;
    }

    /**
     * bcmsSplitSklSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSSplitSklSysLim(String value) {
        this.bcmsSplitSklSysLim = value;
    }

    /**
     * bcmsMeasVDNSUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasVDNSUsed() {
        return bcmsMeasVDNSUsed;
    }

    /**
     * bcmsMeasVDNSUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasVDNSUsed(String value) {
        this.bcmsMeasVDNSUsed = value;
    }

    /**
     * bcmsMeasVDNSAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasVDNSAval() {
        return bcmsMeasVDNSAval;
    }

    /**
     * bcmsMeasVDNSAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasVDNSAval(String value) {
        this.bcmsMeasVDNSAval = value;
    }

    /**
     * bcmsMeasVDNSSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasVDNSSysLimit() {
        return bcmsMeasVDNSSysLimit;
    }

    /**
     * bcmsMeasVDNSSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasVDNSSysLimit(String value) {
        this.bcmsMeasVDNSSysLimit = value;
    }

    /**
     * callCovAnsGroupUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovAnsGroupUsed() {
        return callCovAnsGroupUsed;
    }

    /**
     * callCovAnsGroupUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovAnsGroupUsed(String value) {
        this.callCovAnsGroupUsed = value;
    }

    /**
     * callCovAnsGroupAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovAnsGroupAval() {
        return callCovAnsGroupAval;
    }

    /**
     * callCovAnsGroupAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovAnsGroupAval(String value) {
        this.callCovAnsGroupAval = value;
    }

    /**
     * callCovAnsGrpSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovAnsGrpSysLim() {
        return callCovAnsGrpSysLim;
    }

    /**
     * callCovAnsGrpSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovAnsGrpSysLim(String value) {
        this.callCovAnsGrpSysLim = value;
    }

    /**
     * callCovPathUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPathUsed() {
        return callCovPathUsed;
    }

    /**
     * callCovPathUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPathUsed(String value) {
        this.callCovPathUsed = value;
    }

    /**
     * callCovPathAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPathAval() {
        return callCovPathAval;
    }

    /**
     * callCovPathAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPathAval(String value) {
        this.callCovPathAval = value;
    }

    /**
     * callCovPathSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPathSysLimit() {
        return callCovPathSysLimit;
    }

    /**
     * callCovPathSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPathSysLimit(String value) {
        this.callCovPathSysLimit = value;
    }

    /**
     * callCovPckpGrpUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPckpGrpUsed() {
        return callCovPckpGrpUsed;
    }

    /**
     * callCovPckpGrpUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPckpGrpUsed(String value) {
        this.callCovPckpGrpUsed = value;
    }

    /**
     * callCovPckpGrpAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPckpGrpAval() {
        return callCovPckpGrpAval;
    }

    /**
     * callCovPckpGrpAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPckpGrpAval(String value) {
        this.callCovPckpGrpAval = value;
    }

    /**
     * callCovPkpGrpSyLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPkpGrpSyLim() {
        return callCovPkpGrpSyLim;
    }

    /**
     * callCovPkpGrpSyLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPkpGrpSyLim(String value) {
        this.callCovPkpGrpSyLim = value;
    }

    /**
     * callRecordsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRecordsSysLimit() {
        return callRecordsSysLimit;
    }

    /**
     * callRecordsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRecordsSysLimit(String value) {
        this.callRecordsSysLimit = value;
    }

    /**
     * totalVDNUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVDNUsed() {
        return totalVDNUsed;
    }

    /**
     * totalVDNUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVDNUsed(String value) {
        this.totalVDNUsed = value;
    }

    /**
     * totalVDNAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVDNAval() {
        return totalVDNAval;
    }

    /**
     * totalVDNAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVDNAval(String value) {
        this.totalVDNAval = value;
    }

    /**
     * totalVDNSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVDNSysLimit() {
        return totalVDNSysLimit;
    }

    /**
     * totalVDNSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVDNSysLimit(String value) {
        this.totalVDNSysLimit = value;
    }

    /**
     * meetMeVDNUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVDNUsed() {
        return meetMeVDNUsed;
    }

    /**
     * meetMeVDNUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVDNUsed(String value) {
        this.meetMeVDNUsed = value;
    }

    /**
     * meetMeVDNAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVDNAval() {
        return meetMeVDNAval;
    }

    /**
     * meetMeVDNAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVDNAval(String value) {
        this.meetMeVDNAval = value;
    }

    /**
     * meetMeVDNSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVDNSysLimit() {
        return meetMeVDNSysLimit;
    }

    /**
     * meetMeVDNSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVDNSysLimit(String value) {
        this.meetMeVDNSysLimit = value;
    }

    /**
     * meetMeConfPortsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeConfPortsUsed() {
        return meetMeConfPortsUsed;
    }

    /**
     * meetMeConfPortsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeConfPortsUsed(String value) {
        this.meetMeConfPortsUsed = value;
    }

    /**
     * meetMeConfPortsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeConfPortsAval() {
        return meetMeConfPortsAval;
    }

    /**
     * meetMeConfPortsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeConfPortsAval(String value) {
        this.meetMeConfPortsAval = value;
    }

    /**
     * meetMeCnfPortSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeCnfPortSysLim() {
        return meetMeCnfPortSysLim;
    }

    /**
     * meetMeCnfPortSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeCnfPortSysLim(String value) {
        this.meetMeCnfPortSysLim = value;
    }

    /**
     * totalVectorsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVectorsUsed() {
        return totalVectorsUsed;
    }

    /**
     * totalVectorsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVectorsUsed(String value) {
        this.totalVectorsUsed = value;
    }

    /**
     * totalVectorsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVectorsAval() {
        return totalVectorsAval;
    }

    /**
     * totalVectorsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVectorsAval(String value) {
        this.totalVectorsAval = value;
    }

    /**
     * totalVectorsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVectorsSysLimit() {
        return totalVectorsSysLimit;
    }

    /**
     * totalVectorsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVectorsSysLimit(String value) {
        this.totalVectorsSysLimit = value;
    }

    /**
     * meetMeVectorsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVectorsUsed() {
        return meetMeVectorsUsed;
    }

    /**
     * meetMeVectorsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVectorsUsed(String value) {
        this.meetMeVectorsUsed = value;
    }

    /**
     * meetMeVectorsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVectorsAval() {
        return meetMeVectorsAval;
    }

    /**
     * meetMeVectorsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVectorsAval(String value) {
        this.meetMeVectorsAval = value;
    }

    /**
     * meetMeVectorsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVectorsSysLimit() {
        return meetMeVectorsSysLimit;
    }

    /**
     * meetMeVectorsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVectorsSysLimit(String value) {
        this.meetMeVectorsSysLimit = value;
    }

    /**
     * bsrAppLocPairsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRAppLocPairsUsed() {
        return bsrAppLocPairsUsed;
    }

    /**
     * bsrAppLocPairsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRAppLocPairsUsed(String value) {
        this.bsrAppLocPairsUsed = value;
    }

    /**
     * bsrAppLocPairsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRAppLocPairsAval() {
        return bsrAppLocPairsAval;
    }

    /**
     * bsrAppLocPairsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRAppLocPairsAval(String value) {
        this.bsrAppLocPairsAval = value;
    }

    /**
     * bsrAppLocPairsSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRAppLocPairsSysLim() {
        return bsrAppLocPairsSysLim;
    }

    /**
     * bsrAppLocPairsSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRAppLocPairsSysLim(String value) {
        this.bsrAppLocPairsSysLim = value;
    }

    /**
     * backBSRPollVDNUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackBSRPollVDNUsed() {
        return backBSRPollVDNUsed;
    }

    /**
     * backBSRPollVDNUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackBSRPollVDNUsed(String value) {
        this.backBSRPollVDNUsed = value;
    }

    /**
     * backBSRPollVDNAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackBSRPollVDNAval() {
        return backBSRPollVDNAval;
    }

    /**
     * backBSRPollVDNAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackBSRPollVDNAval(String value) {
        this.backBSRPollVDNAval = value;
    }

    /**
     * backBSRPollVDNSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackBSRPollVDNSysLim() {
        return backBSRPollVDNSysLim;
    }

    /**
     * backBSRPollVDNSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackBSRPollVDNSysLim(String value) {
        this.backBSRPollVDNSysLim = value;
    }

    /**
     * administeredConsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredConsUsed() {
        return administeredConsUsed;
    }

    /**
     * administeredConsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredConsUsed(String value) {
        this.administeredConsUsed = value;
    }

    /**
     * administeredConsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredConsAval() {
        return administeredConsAval;
    }

    /**
     * administeredConsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredConsAval(String value) {
        this.administeredConsAval = value;
    }

    /**
     * administeredConsSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredConsSysLim() {
        return administeredConsSysLim;
    }

    /**
     * administeredConsSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredConsSysLim(String value) {
        this.administeredConsSysLim = value;
    }

    /**
     * alphaDialEntriesUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaDialEntriesUsed() {
        return alphaDialEntriesUsed;
    }

    /**
     * alphaDialEntriesUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaDialEntriesUsed(String value) {
        this.alphaDialEntriesUsed = value;
    }

    /**
     * alphaDialEntriesAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaDialEntriesAval() {
        return alphaDialEntriesAval;
    }

    /**
     * alphaDialEntriesAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaDialEntriesAval(String value) {
        this.alphaDialEntriesAval = value;
    }

    /**
     * alphaDialEntSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaDialEntSysLim() {
        return alphaDialEntSysLim;
    }

    /**
     * alphaDialEntSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaDialEntSysLim(String value) {
        this.alphaDialEntSysLim = value;
    }

    /**
     * dialPlanExtUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanExtUsed() {
        return dialPlanExtUsed;
    }

    /**
     * dialPlanExtUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanExtUsed(String value) {
        this.dialPlanExtUsed = value;
    }

    /**
     * dialPlanExtAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanExtAval() {
        return dialPlanExtAval;
    }

    /**
     * dialPlanExtAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanExtAval(String value) {
        this.dialPlanExtAval = value;
    }

    /**
     * dialPlanExtSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanExtSysLimit() {
        return dialPlanExtSysLimit;
    }

    /**
     * dialPlanExtSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanExtSysLimit(String value) {
        this.dialPlanExtSysLimit = value;
    }

    /**
     * miscDialPlanExtUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscDialPlanExtUsed() {
        return miscDialPlanExtUsed;
    }

    /**
     * miscDialPlanExtUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscDialPlanExtUsed(String value) {
        this.miscDialPlanExtUsed = value;
    }

    /**
     * miscDialPlanExtAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscDialPlanExtAval() {
        return miscDialPlanExtAval;
    }

    /**
     * miscDialPlanExtAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscDialPlanExtAval(String value) {
        this.miscDialPlanExtAval = value;
    }

    /**
     * miscDlPlnExSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscDlPlnExSysLim() {
        return miscDlPlnExSysLim;
    }

    /**
     * miscDlPlnExSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscDlPlnExSysLim(String value) {
        this.miscDlPlnExSysLim = value;
    }

    /**
     * udpExtRecoresUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPExtRecoresUsed() {
        return udpExtRecoresUsed;
    }

    /**
     * udpExtRecoresUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPExtRecoresUsed(String value) {
        this.udpExtRecoresUsed = value;
    }

    /**
     * udpExtRecoresAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPExtRecoresAval() {
        return udpExtRecoresAval;
    }

    /**
     * udpExtRecoresAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPExtRecoresAval(String value) {
        this.udpExtRecoresAval = value;
    }

    /**
     * udpExtRecoresSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPExtRecoresSysLimit() {
        return udpExtRecoresSysLimit;
    }

    /**
     * udpExtRecoresSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPExtRecoresSysLimit(String value) {
        this.udpExtRecoresSysLimit = value;
    }

    /**
     * digitalDataEndUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalDataEndUsed() {
        return digitalDataEndUsed;
    }

    /**
     * digitalDataEndUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalDataEndUsed(String value) {
        this.digitalDataEndUsed = value;
    }

    /**
     * digitalDataEndAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalDataEndAval() {
        return digitalDataEndAval;
    }

    /**
     * digitalDataEndAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalDataEndAval(String value) {
        this.digitalDataEndAval = value;
    }

    /**
     * digDataEndSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigDataEndSysLim() {
        return digDataEndSysLim;
    }

    /**
     * digDataEndSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigDataEndSysLim(String value) {
        this.digDataEndSysLim = value;
    }

    /**
     * expPortNetUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpPortNetUsed() {
        return expPortNetUsed;
    }

    /**
     * expPortNetUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpPortNetUsed(String value) {
        this.expPortNetUsed = value;
    }

    /**
     * expPortNetAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpPortNetAval() {
        return expPortNetAval;
    }

    /**
     * expPortNetAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpPortNetAval(String value) {
        this.expPortNetAval = value;
    }

    /**
     * expPortNetSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpPortNetSysLimit() {
        return expPortNetSysLimit;
    }

    /**
     * expPortNetSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpPortNetSysLimit(String value) {
        this.expPortNetSysLimit = value;
    }

    /**
     * facilityBusyIndUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityBusyIndUsed() {
        return facilityBusyIndUsed;
    }

    /**
     * facilityBusyIndUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityBusyIndUsed(String value) {
        this.facilityBusyIndUsed = value;
    }

    /**
     * facilityBusyAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityBusyAval() {
        return facilityBusyAval;
    }

    /**
     * facilityBusyAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityBusyAval(String value) {
        this.facilityBusyAval = value;
    }

    /**
     * facltyBsyIndSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacltyBsyIndSysLim() {
        return facltyBsyIndSysLim;
    }

    /**
     * facltyBsyIndSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacltyBsyIndSysLim(String value) {
        this.facltyBsyIndSysLim = value;
    }

    /**
     * groupSpitSkillsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSpitSkillsUsed() {
        return groupSpitSkillsUsed;
    }

    /**
     * groupSpitSkillsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSpitSkillsUsed(String value) {
        this.groupSpitSkillsUsed = value;
    }

    /**
     * groupSpitSkillsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSpitSkillsAval() {
        return groupSpitSkillsAval;
    }

    /**
     * groupSpitSkillsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSpitSkillsAval(String value) {
        this.groupSpitSkillsAval = value;
    }

    /**
     * groupSpitSkillsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSpitSkillsSysLimit() {
        return groupSpitSkillsSysLimit;
    }

    /**
     * groupSpitSkillsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSpitSkillsSysLimit(String value) {
        this.groupSpitSkillsSysLimit = value;
    }

    /**
     * adminLogAgeUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeUsed() {
        return adminLogAgeUsed;
    }

    /**
     * adminLogAgeUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeUsed(String value) {
        this.adminLogAgeUsed = value;
    }

    /**
     * adminLogAgeAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeAval() {
        return adminLogAgeAval;
    }

    /**
     * adminLogAgeAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeAval(String value) {
        this.adminLogAgeAval = value;
    }

    /**
     * adminLogAgeSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeSysLimit() {
        return adminLogAgeSysLimit;
    }

    /**
     * adminLogAgeSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeSysLimit(String value) {
        this.adminLogAgeSysLimit = value;
    }

    /**
     * adminLogAgeSkillUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeSkillUsed() {
        return adminLogAgeSkillUsed;
    }

    /**
     * adminLogAgeSkillUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeSkillUsed(String value) {
        this.adminLogAgeSkillUsed = value;
    }

    /**
     * adminLogAgeSkillAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeSkillAval() {
        return adminLogAgeSkillAval;
    }

    /**
     * adminLogAgeSkillAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeSkillAval(String value) {
        this.adminLogAgeSkillAval = value;
    }

    /**
     * adminLogAgeSklSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeSklSysLim() {
        return adminLogAgeSklSysLim;
    }

    /**
     * adminLogAgeSklSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeSklSysLim(String value) {
        this.adminLogAgeSklSysLim = value;
    }

    /**
     * loggedInACDsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDsUsed() {
        return loggedInACDsUsed;
    }

    /**
     * loggedInACDsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDsUsed(String value) {
        this.loggedInACDsUsed = value;
    }

    /**
     * loggedInACDsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDsAval() {
        return loggedInACDsAval;
    }

    /**
     * loggedInACDsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDsAval(String value) {
        this.loggedInACDsAval = value;
    }

    /**
     * loggedInACDsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDsSysLimit() {
        return loggedInACDsSysLimit;
    }

    /**
     * loggedInACDsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDsSysLimit(String value) {
        this.loggedInACDsSysLimit = value;
    }

    /**
     * loggedInAdvocatesUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocatesUsed() {
        return loggedInAdvocatesUsed;
    }

    /**
     * loggedInAdvocatesUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocatesUsed(String value) {
        this.loggedInAdvocatesUsed = value;
    }

    /**
     * loggedInAdvocatesAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocatesAval() {
        return loggedInAdvocatesAval;
    }

    /**
     * loggedInAdvocatesAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocatesAval(String value) {
        this.loggedInAdvocatesAval = value;
    }

    /**
     * loggedInAdvctsSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvctsSysLim() {
        return loggedInAdvctsSysLim;
    }

    /**
     * loggedInAdvctsSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvctsSysLim(String value) {
        this.loggedInAdvctsSysLim = value;
    }

    /**
     * loggedInIPSoftAgtUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftAgtUsed() {
        return loggedInIPSoftAgtUsed;
    }

    /**
     * loggedInIPSoftAgtUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftAgtUsed(String value) {
        this.loggedInIPSoftAgtUsed = value;
    }

    /**
     * loggedInIPSoftAgtAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftAgtAval() {
        return loggedInIPSoftAgtAval;
    }

    /**
     * loggedInIPSoftAgtAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftAgtAval(String value) {
        this.loggedInIPSoftAgtAval = value;
    }

    /**
     * lgnIPSftAgtSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgnIPSftAgtSysLim() {
        return lgnIPSftAgtSysLim;
    }

    /**
     * lgnIPSftAgtSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgnIPSftAgtSysLim(String value) {
        this.lgnIPSftAgtSysLim = value;
    }

    /**
     * groupMembersUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMembersUsed() {
        return groupMembersUsed;
    }

    /**
     * groupMembersUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMembersUsed(String value) {
        this.groupMembersUsed = value;
    }

    /**
     * groupMembersAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMembersAval() {
        return groupMembersAval;
    }

    /**
     * groupMembersAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMembersAval(String value) {
        this.groupMembersAval = value;
    }

    /**
     * groupMembersSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMembersSysLimit() {
        return groupMembersSysLimit;
    }

    /**
     * groupMembersSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMembersSysLimit(String value) {
        this.groupMembersSysLimit = value;
    }

    /**
     * cmsacdMembersUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMSACDMembersUsed() {
        return cmsacdMembersUsed;
    }

    /**
     * cmsacdMembersUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMSACDMembersUsed(String value) {
        this.cmsacdMembersUsed = value;
    }

    /**
     * cmsacdMembersAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMSACDMembersAval() {
        return cmsacdMembersAval;
    }

    /**
     * cmsacdMembersAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMSACDMembersAval(String value) {
        this.cmsacdMembersAval = value;
    }

    /**
     * cmsacdMemSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMSACDMemSysLimit() {
        return cmsacdMemSysLimit;
    }

    /**
     * cmsacdMemSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMSACDMemSysLimit(String value) {
        this.cmsacdMemSysLimit = value;
    }

    /**
     * dynamicQueueSlUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicQueueSlUsed() {
        return dynamicQueueSlUsed;
    }

    /**
     * dynamicQueueSlUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicQueueSlUsed(String value) {
        this.dynamicQueueSlUsed = value;
    }

    /**
     * dynamicQueueSlAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicQueueSlAval() {
        return dynamicQueueSlAval;
    }

    /**
     * dynamicQueueSlAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicQueueSlAval(String value) {
        this.dynamicQueueSlAval = value;
    }

    /**
     * dynamicQuelSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicQuelSysLim() {
        return dynamicQuelSysLim;
    }

    /**
     * dynamicQuelSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicQuelSysLim(String value) {
        this.dynamicQuelSysLim = value;
    }

    /**
     * queueCallStatButUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCallStatButUsed() {
        return queueCallStatButUsed;
    }

    /**
     * queueCallStatButUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueCallStatButUsed(String value) {
        this.queueCallStatButUsed = value;
    }

    /**
     * queueCallStatButAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCallStatButAval() {
        return queueCallStatButAval;
    }

    /**
     * queueCallStatButAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueCallStatButAval(String value) {
        this.queueCallStatButAval = value;
    }

    /**
     * queueCallStatButSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCallStatButSysLim() {
        return queueCallStatButSysLim;
    }

    /**
     * queueCallStatButSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueCallStatButSysLim(String value) {
        this.queueCallStatButSysLim = value;
    }

    /**
     * intercomGroupsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntercomGroupsUsed() {
        return intercomGroupsUsed;
    }

    /**
     * intercomGroupsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntercomGroupsUsed(String value) {
        this.intercomGroupsUsed = value;
    }

    /**
     * intercomGroupsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntercomGroupsAval() {
        return intercomGroupsAval;
    }

    /**
     * intercomGroupsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntercomGroupsAval(String value) {
        this.intercomGroupsAval = value;
    }

    /**
     * intercomGrpSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntercomGrpSysLim() {
        return intercomGrpSysLim;
    }

    /**
     * intercomGrpSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntercomGrpSysLim(String value) {
        this.intercomGrpSysLim = value;
    }

    /**
     * modemPoolGroupsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemPoolGroupsUsed() {
        return modemPoolGroupsUsed;
    }

    /**
     * modemPoolGroupsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemPoolGroupsUsed(String value) {
        this.modemPoolGroupsUsed = value;
    }

    /**
     * modemPoolGroupsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemPoolGroupsAval() {
        return modemPoolGroupsAval;
    }

    /**
     * modemPoolGroupsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemPoolGroupsAval(String value) {
        this.modemPoolGroupsAval = value;
    }

    /**
     * modemPoolGrpsSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemPoolGrpsSysLim() {
        return modemPoolGrpsSysLim;
    }

    /**
     * modemPoolGrpsSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemPoolGrpsSysLim(String value) {
        this.modemPoolGrpsSysLim = value;
    }

    /**
     * pcolTrunkGroupsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOLTrunkGroupsUsed() {
        return pcolTrunkGroupsUsed;
    }

    /**
     * pcolTrunkGroupsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOLTrunkGroupsUsed(String value) {
        this.pcolTrunkGroupsUsed = value;
    }

    /**
     * pcolTrunkGroupsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOLTrunkGroupsAval() {
        return pcolTrunkGroupsAval;
    }

    /**
     * pcolTrunkGroupsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOLTrunkGroupsAval(String value) {
        this.pcolTrunkGroupsAval = value;
    }

    /**
     * pcolTrnGroupsSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOLTrnGroupsSysLim() {
        return pcolTrnGroupsSysLim;
    }

    /**
     * pcolTrnGroupsSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOLTrnGroupsSysLim(String value) {
        this.pcolTrnGroupsSysLim = value;
    }

    /**
     * analogQueueSlotsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogQueueSlotsUsed() {
        return analogQueueSlotsUsed;
    }

    /**
     * analogQueueSlotsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogQueueSlotsUsed(String value) {
        this.analogQueueSlotsUsed = value;
    }

    /**
     * analogQueueSlotsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogQueueSlotsAval() {
        return analogQueueSlotsAval;
    }

    /**
     * analogQueueSlotsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogQueueSlotsAval(String value) {
        this.analogQueueSlotsAval = value;
    }

    /**
     * analogQueSlotSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogQueSlotSysLim() {
        return analogQueSlotSysLim;
    }

    /**
     * analogQueSlotSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogQueSlotSysLim(String value) {
        this.analogQueSlotSysLim = value;
    }

    /**
     * extSourceComboUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSourceComboUsed() {
        return extSourceComboUsed;
    }

    /**
     * extSourceComboUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSourceComboUsed(String value) {
        this.extSourceComboUsed = value;
    }

    /**
     * extSourceComboAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSourceComboAval() {
        return extSourceComboAval;
    }

    /**
     * extSourceComboAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSourceComboAval(String value) {
        this.extSourceComboAval = value;
    }

    /**
     * extSrcComboSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSrcComboSysLim() {
        return extSrcComboSysLim;
    }

    /**
     * extSrcComboSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSrcComboSysLim(String value) {
        this.extSrcComboSysLim = value;
    }

    /**
     * tn2501VALBoardUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2501VALBoardUsed() {
        return tn2501VALBoardUsed;
    }

    /**
     * tn2501VALBoardUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2501VALBoardUsed(String value) {
        this.tn2501VALBoardUsed = value;
    }

    /**
     * tn2501VALBoardAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2501VALBoardAval() {
        return tn2501VALBoardAval;
    }

    /**
     * tn2501VALBoardAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2501VALBoardAval(String value) {
        this.tn2501VALBoardAval = value;
    }

    /**
     * tn2501VALBoardSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2501VALBoardSysLimit() {
        return tn2501VALBoardSysLimit;
    }

    /**
     * tn2501VALBoardSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2501VALBoardSysLimit(String value) {
        this.tn2501VALBoardSysLimit = value;
    }

    /**
     * mediaGateVVALUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGateVVALUsed() {
        return mediaGateVVALUsed;
    }

    /**
     * mediaGateVVALUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGateVVALUsed(String value) {
        this.mediaGateVVALUsed = value;
    }

    /**
     * mediaGateVVALAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGateVVALAval() {
        return mediaGateVVALAval;
    }

    /**
     * mediaGateVVALAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGateVVALAval(String value) {
        this.mediaGateVVALAval = value;
    }

    /**
     * mediaGateVVALSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGateVVALSysLimit() {
        return mediaGateVVALSysLimit;
    }

    /**
     * mediaGateVVALSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGateVVALSysLimit(String value) {
        this.mediaGateVVALSysLimit = value;
    }

    /**
     * tn2602B80VOIPUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B80VOIPUsed() {
        return tn2602B80VOIPUsed;
    }

    /**
     * tn2602B80VOIPUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B80VOIPUsed(String value) {
        this.tn2602B80VOIPUsed = value;
    }

    /**
     * tn2602B80VOIPAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B80VOIPAval() {
        return tn2602B80VOIPAval;
    }

    /**
     * tn2602B80VOIPAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B80VOIPAval(String value) {
        this.tn2602B80VOIPAval = value;
    }

    /**
     * tn2602B80VOIPSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B80VOIPSysLimit() {
        return tn2602B80VOIPSysLimit;
    }

    /**
     * tn2602B80VOIPSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B80VOIPSysLimit(String value) {
        this.tn2602B80VOIPSysLimit = value;
    }

    /**
     * tn2602B320VOIPUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B320VOIPUsed() {
        return tn2602B320VOIPUsed;
    }

    /**
     * tn2602B320VOIPUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B320VOIPUsed(String value) {
        this.tn2602B320VOIPUsed = value;
    }

    /**
     * tn2602B320VOIPAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B320VOIPAval() {
        return tn2602B320VOIPAval;
    }

    /**
     * tn2602B320VOIPAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B320VOIPAval(String value) {
        this.tn2602B320VOIPAval = value;
    }

    /**
     * tn2602B320VOIPSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B320VOIPSysLim() {
        return tn2602B320VOIPSysLim;
    }

    /**
     * tn2602B320VOIPSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B320VOIPSysLim(String value) {
        this.tn2602B320VOIPSysLim = value;
    }

    /**
     * adminsTSCsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminsTSCsUsed() {
        return adminsTSCsUsed;
    }

    /**
     * adminsTSCsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminsTSCsUsed(String value) {
        this.adminsTSCsUsed = value;
    }

    /**
     * adminsTSCsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminsTSCsAval() {
        return adminsTSCsAval;
    }

    /**
     * adminsTSCsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminsTSCsAval(String value) {
        this.adminsTSCsAval = value;
    }

    /**
     * adminsTSCsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminsTSCsSysLimit() {
        return adminsTSCsSysLimit;
    }

    /**
     * adminsTSCsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminsTSCsSysLimit(String value) {
        this.adminsTSCsSysLimit = value;
    }

    /**
     * ncatscCallsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCATSCCallsUsed() {
        return ncatscCallsUsed;
    }

    /**
     * ncatscCallsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCATSCCallsUsed(String value) {
        this.ncatscCallsUsed = value;
    }

    /**
     * ncatscCallsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCATSCCallsAval() {
        return ncatscCallsAval;
    }

    /**
     * ncatscCallsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCATSCCallsAval(String value) {
        this.ncatscCallsAval = value;
    }

    /**
     * ncatscCallsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCATSCCallsSysLimit() {
        return ncatscCallsSysLimit;
    }

    /**
     * ncatscCallsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCATSCCallsSysLimit(String value) {
        this.ncatscCallsSysLimit = value;
    }

    /**
     * ds1CircuitPacksUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1CircuitPacksUsed() {
        return ds1CircuitPacksUsed;
    }

    /**
     * ds1CircuitPacksUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1CircuitPacksUsed(String value) {
        this.ds1CircuitPacksUsed = value;
    }

    /**
     * ds1CircuitPacksAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1CircuitPacksAval() {
        return ds1CircuitPacksAval;
    }

    /**
     * ds1CircuitPacksAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1CircuitPacksAval(String value) {
        this.ds1CircuitPacksAval = value;
    }

    /**
     * ds1CrctPackSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1CrctPackSysLim() {
        return ds1CrctPackSysLim;
    }

    /**
     * ds1CrctPackSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1CrctPackSysLim(String value) {
        this.ds1CrctPackSysLim = value;
    }

    /**
     * ds1WithEchoUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1WithEchoUsed() {
        return ds1WithEchoUsed;
    }

    /**
     * ds1WithEchoUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1WithEchoUsed(String value) {
        this.ds1WithEchoUsed = value;
    }

    /**
     * ds1WithEchoAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1WithEchoAval() {
        return ds1WithEchoAval;
    }

    /**
     * ds1WithEchoAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1WithEchoAval(String value) {
        this.ds1WithEchoAval = value;
    }

    /**
     * ds1WithEchoSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1WithEchoSysLimit() {
        return ds1WithEchoSysLimit;
    }

    /**
     * ds1WithEchoSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1WithEchoSysLimit(String value) {
        this.ds1WithEchoSysLimit = value;
    }

    /**
     * ichtisdnsipUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICHTISDNSIPUsed() {
        return ichtisdnsipUsed;
    }

    /**
     * ichtisdnsipUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICHTISDNSIPUsed(String value) {
        this.ichtisdnsipUsed = value;
    }

    /**
     * ichtisdnsipAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICHTISDNSIPAval() {
        return ichtisdnsipAval;
    }

    /**
     * ichtisdnsipAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICHTISDNSIPAval(String value) {
        this.ichtisdnsipAval = value;
    }

    /**
     * ichtisdnsipSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICHTISDNSIPSysLimit() {
        return ichtisdnsipSysLimit;
    }

    /**
     * ichtisdnsipSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICHTISDNSIPSysLimit(String value) {
        this.ichtisdnsipSysLimit = value;
    }

    /**
     * isdncbcServiceUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNCBCServiceUsed() {
        return isdncbcServiceUsed;
    }

    /**
     * isdncbcServiceUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNCBCServiceUsed(String value) {
        this.isdncbcServiceUsed = value;
    }

    /**
     * isdncbcServiceAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNCBCServiceAval() {
        return isdncbcServiceAval;
    }

    /**
     * isdncbcServiceAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNCBCServiceAval(String value) {
        this.isdncbcServiceAval = value;
    }

    /**
     * isdncbcServSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNCBCServSysLim() {
        return isdncbcServSysLim;
    }

    /**
     * isdncbcServSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNCBCServSysLim(String value) {
        this.isdncbcServSysLim = value;
    }

    /**
     * trunkGroupsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupsUsed() {
        return trunkGroupsUsed;
    }

    /**
     * trunkGroupsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupsUsed(String value) {
        this.trunkGroupsUsed = value;
    }

    /**
     * trunkGroupsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupsAval() {
        return trunkGroupsAval;
    }

    /**
     * trunkGroupsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupsAval(String value) {
        this.trunkGroupsAval = value;
    }

    /**
     * trunkGroupsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupsSysLimit() {
        return trunkGroupsSysLimit;
    }

    /**
     * trunkGroupsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupsSysLimit(String value) {
        this.trunkGroupsSysLimit = value;
    }

    /**
     * trunkPortsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPortsUsed() {
        return trunkPortsUsed;
    }

    /**
     * trunkPortsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPortsUsed(String value) {
        this.trunkPortsUsed = value;
    }

    /**
     * trunkPortsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPortsAval() {
        return trunkPortsAval;
    }

    /**
     * trunkPortsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPortsAval(String value) {
        this.trunkPortsAval = value;
    }

    /**
     * trunkPortsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPortsSysLimit() {
        return trunkPortsSysLimit;
    }

    /**
     * trunkPortsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPortsSysLimit(String value) {
        this.trunkPortsSysLimit = value;
    }

    /**
     * h323TrunksUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH323TrunksUsed() {
        return h323TrunksUsed;
    }

    /**
     * h323TrunksUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH323TrunksUsed(String value) {
        this.h323TrunksUsed = value;
    }

    /**
     * h323TrunksAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH323TrunksAval() {
        return h323TrunksAval;
    }

    /**
     * h323TrunksAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH323TrunksAval(String value) {
        this.h323TrunksAval = value;
    }

    /**
     * h323TrunksSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH323TrunksSysLimit() {
        return h323TrunksSysLimit;
    }

    /**
     * h323TrunksSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH323TrunksSysLimit(String value) {
        this.h323TrunksSysLimit = value;
    }

    /**
     * remOficeTrksUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemOficeTrksUsed() {
        return remOficeTrksUsed;
    }

    /**
     * remOficeTrksUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemOficeTrksUsed(String value) {
        this.remOficeTrksUsed = value;
    }

    /**
     * remOficeTrksAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemOficeTrksAval() {
        return remOficeTrksAval;
    }

    /**
     * remOficeTrksAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemOficeTrksAval(String value) {
        this.remOficeTrksAval = value;
    }

    /**
     * remOficeTrkSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemOficeTrkSysLim() {
        return remOficeTrkSysLim;
    }

    /**
     * remOficeTrkSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemOficeTrkSysLim(String value) {
        this.remOficeTrkSysLim = value;
    }

    /**
     * sbsTrunksUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSTrunksUsed() {
        return sbsTrunksUsed;
    }

    /**
     * sbsTrunksUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSTrunksUsed(String value) {
        this.sbsTrunksUsed = value;
    }

    /**
     * sbsTrunksAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSTrunksAval() {
        return sbsTrunksAval;
    }

    /**
     * sbsTrunksAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSTrunksAval(String value) {
        this.sbsTrunksAval = value;
    }

    /**
     * sbsTrunksSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSTrunksSysLimit() {
        return sbsTrunksSysLimit;
    }

    /**
     * sbsTrunksSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSTrunksSysLimit(String value) {
        this.sbsTrunksSysLimit = value;
    }

    /**
     * sipTrunksUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPTrunksUsed() {
        return sipTrunksUsed;
    }

    /**
     * sipTrunksUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPTrunksUsed(String value) {
        this.sipTrunksUsed = value;
    }

    /**
     * sipTrunksAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPTrunksAval() {
        return sipTrunksAval;
    }

    /**
     * sipTrunksAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPTrunksAval(String value) {
        this.sipTrunksAval = value;
    }

    /**
     * sipTrunksSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPTrunksSysLimit() {
        return sipTrunksSysLimit;
    }

    /**
     * sipTrunksSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPTrunksSysLimit(String value) {
        this.sipTrunksSysLimit = value;
    }

    /**
     * stationButMemUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationButMemUsed() {
        return stationButMemUsed;
    }

    /**
     * stationButMemUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationButMemUsed(String value) {
        this.stationButMemUsed = value;
    }

    /**
     * stationButMemAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationButMemAval() {
        return stationButMemAval;
    }

    /**
     * stationButMemAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationButMemAval(String value) {
        this.stationButMemAval = value;
    }

    /**
     * stationButMemSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationButMemSysLimit() {
        return stationButMemSysLimit;
    }

    /**
     * stationButMemSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationButMemSysLimit(String value) {
        this.stationButMemSysLimit = value;
    }

    /**
     * customButLabelsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomButLabelsUsed() {
        return customButLabelsUsed;
    }

    /**
     * customButLabelsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomButLabelsUsed(String value) {
        this.customButLabelsUsed = value;
    }

    /**
     * customButLabelsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomButLabelsAval() {
        return customButLabelsAval;
    }

    /**
     * customButLabelsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomButLabelsAval(String value) {
        this.customButLabelsAval = value;
    }

    /**
     * customButLabelsSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomButLabelsSysLim() {
        return customButLabelsSysLim;
    }

    /**
     * customButLabelsSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomButLabelsSysLim(String value) {
        this.customButLabelsSysLim = value;
    }

    /**
     * stationRecordsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecordsUsed() {
        return stationRecordsUsed;
    }

    /**
     * stationRecordsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecordsUsed(String value) {
        this.stationRecordsUsed = value;
    }

    /**
     * stationRecordsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecordsAval() {
        return stationRecordsAval;
    }

    /**
     * stationRecordsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecordsAval(String value) {
        this.stationRecordsAval = value;
    }

    /**
     * stationRecSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecSysLim() {
        return stationRecSysLim;
    }

    /**
     * stationRecSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecSysLim(String value) {
        this.stationRecSysLim = value;
    }

    /**
     * stationRecTTIUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecTTIUsed() {
        return stationRecTTIUsed;
    }

    /**
     * stationRecTTIUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecTTIUsed(String value) {
        this.stationRecTTIUsed = value;
    }

    /**
     * stationRecTTIShrdUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecTTIShrdUsed() {
        return stationRecTTIShrdUsed;
    }

    /**
     * stationRecTTIShrdUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecTTIShrdUsed(String value) {
        this.stationRecTTIShrdUsed = value;
    }

    /**
     * briStationsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRIStationsUsed() {
        return briStationsUsed;
    }

    /**
     * briStationsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRIStationsUsed(String value) {
        this.briStationsUsed = value;
    }

    /**
     * stationsWithPortUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationsWithPortUsed() {
        return stationsWithPortUsed;
    }

    /**
     * stationsWithPortUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationsWithPortUsed(String value) {
        this.stationsWithPortUsed = value;
    }

    /**
     * stationsWOutPortUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationsWOutPortUsed() {
        return stationsWOutPortUsed;
    }

    /**
     * stationsWOutPortUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationsWOutPortUsed(String value) {
        this.stationsWOutPortUsed = value;
    }

    /**
     * otherStationsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStationsUsed() {
        return otherStationsUsed;
    }

    /**
     * otherStationsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStationsUsed(String value) {
        this.otherStationsUsed = value;
    }

    /**
     * ttiPortsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIPortsUsed() {
        return ttiPortsUsed;
    }

    /**
     * ttiPortsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIPortsUsed(String value) {
        this.ttiPortsUsed = value;
    }

    /**
     * autoMoveStationsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMoveStationsUsed() {
        return autoMoveStationsUsed;
    }

    /**
     * autoMoveStationsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMoveStationsUsed(String value) {
        this.autoMoveStationsUsed = value;
    }

    /**
     * autoMoveStationsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMoveStationsAval() {
        return autoMoveStationsAval;
    }

    /**
     * autoMoveStationsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMoveStationsAval(String value) {
        this.autoMoveStationsAval = value;
    }

    /**
     * autoMveStationSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMveStationSysLim() {
        return autoMveStationSysLim;
    }

    /**
     * autoMveStationSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMveStationSysLim(String value) {
        this.autoMveStationSysLim = value;
    }

    /**
     * admIPSoftPhoneUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmIPSoftPhoneUsed() {
        return admIPSoftPhoneUsed;
    }

    /**
     * admIPSoftPhoneUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmIPSoftPhoneUsed(String value) {
        this.admIPSoftPhoneUsed = value;
    }

    /**
     * videoH323StatUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoH323StatUsed() {
        return videoH323StatUsed;
    }

    /**
     * videoH323StatUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoH323StatUsed(String value) {
        this.videoH323StatUsed = value;
    }

    /**
     * videoH323StatAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoH323StatAval() {
        return videoH323StatAval;
    }

    /**
     * videoH323StatAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoH323StatAval(String value) {
        this.videoH323StatAval = value;
    }

    /**
     * vidH323StaSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVidH323StaSysLim() {
        return vidH323StaSysLim;
    }

    /**
     * vidH323StaSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVidH323StaSysLim(String value) {
        this.vidH323StaSysLim = value;
    }

    /**
     * videoIPSoftphonesUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoIPSoftphonesUsed() {
        return videoIPSoftphonesUsed;
    }

    /**
     * videoIPSoftphonesUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoIPSoftphonesUsed(String value) {
        this.videoIPSoftphonesUsed = value;
    }

    /**
     * videoIPSoftphonesAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoIPSoftphonesAval() {
        return videoIPSoftphonesAval;
    }

    /**
     * videoIPSoftphonesAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoIPSoftphonesAval(String value) {
        this.videoIPSoftphonesAval = value;
    }

    /**
     * vidIPSftPhSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVidIPSftPhSysLim() {
        return vidIPSftPhSysLim;
    }

    /**
     * vidIPSftPhSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVidIPSftPhSysLim(String value) {
        this.vidIPSftPhSysLim = value;
    }

    /**
     * isdnbriEndTrkPortUsd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNBRIEndTrkPortUsd() {
        return isdnbriEndTrkPortUsd;
    }

    /**
     * isdnbriEndTrkPortUsd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNBRIEndTrkPortUsd(String value) {
        this.isdnbriEndTrkPortUsd = value;
    }

    /**
     * isdnbriEndTrkPortAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNBRIEndTrkPortAval() {
        return isdnbriEndTrkPortAval;
    }

    /**
     * isdnbriEndTrkPortAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNBRIEndTrkPortAval(String value) {
        this.isdnbriEndTrkPortAval = value;
    }

    /**
     * isdnbriEndTrunkPortSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNBRIEndTrunkPortSysLim() {
        return isdnbriEndTrunkPortSysLim;
    }

    /**
     * isdnbriEndTrunkPortSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNBRIEndTrunkPortSysLim(String value) {
        this.isdnbriEndTrunkPortSysLim = value;
    }

    /**
     * stationTrkPortsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTrkPortsUsed() {
        return stationTrkPortsUsed;
    }

    /**
     * stationTrkPortsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTrkPortsUsed(String value) {
        this.stationTrkPortsUsed = value;
    }

    /**
     * stationTrkPortsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTrkPortsAval() {
        return stationTrkPortsAval;
    }

    /**
     * stationTrkPortsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTrkPortsAval(String value) {
        this.stationTrkPortsAval = value;
    }

    /**
     * stationTrkPrtSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTrkPrtSysLim() {
        return stationTrkPrtSysLim;
    }

    /**
     * stationTrkPrtSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTrkPrtSysLim(String value) {
        this.stationTrkPrtSysLim = value;
    }

    /**
     * stationCapacityUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCapacityUsed() {
        return stationCapacityUsed;
    }

    /**
     * stationCapacityUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCapacityUsed(String value) {
        this.stationCapacityUsed = value;
    }

    /**
     * stationCapacityAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCapacityAval() {
        return stationCapacityAval;
    }

    /**
     * stationCapacityAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCapacityAval(String value) {
        this.stationCapacityAval = value;
    }

    /**
     * stationCapacitySysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCapacitySysLimit() {
        return stationCapacitySysLimit;
    }

    /**
     * stationCapacitySysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCapacitySysLimit(String value) {
        this.stationCapacitySysLimit = value;
    }

    /**
     * sbsStationsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSStationsUsed() {
        return sbsStationsUsed;
    }

    /**
     * sbsStationsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSStationsUsed(String value) {
        this.sbsStationsUsed = value;
    }

    /**
     * sbsStationsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSStationsAval() {
        return sbsStationsAval;
    }

    /**
     * sbsStationsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSStationsAval(String value) {
        this.sbsStationsAval = value;
    }

    /**
     * sbsStationsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSStationsSysLimit() {
        return sbsStationsSysLimit;
    }

    /**
     * sbsStationsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSStationsSysLimit(String value) {
        this.sbsStationsSysLimit = value;
    }

    /**
     * radioControllersUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioControllersUsed() {
        return radioControllersUsed;
    }

    /**
     * radioControllersUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioControllersUsed(String value) {
        this.radioControllersUsed = value;
    }

    /**
     * radioControllersAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioControllersAval() {
        return radioControllersAval;
    }

    /**
     * radioControllersAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioControllersAval(String value) {
        this.radioControllersAval = value;
    }

    /**
     * radioCtrlrSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioCtrlrSysLim() {
        return radioCtrlrSysLim;
    }

    /**
     * radioCtrlrSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioCtrlrSysLim(String value) {
        this.radioCtrlrSysLim = value;
    }

    /**
     * wirelessTerminalsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessTerminalsUsed() {
        return wirelessTerminalsUsed;
    }

    /**
     * wirelessTerminalsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessTerminalsUsed(String value) {
        this.wirelessTerminalsUsed = value;
    }

    /**
     * wirelessTerminalsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessTerminalsAval() {
        return wirelessTerminalsAval;
    }

    /**
     * wirelessTerminalsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessTerminalsAval(String value) {
        this.wirelessTerminalsAval = value;
    }

    /**
     * wirelessTermlSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessTermlSysLim() {
        return wirelessTermlSysLim;
    }

    /**
     * wirelessTermlSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessTermlSysLim(String value) {
        this.wirelessTermlSysLim = value;
    }

    /**
     * xMobileStationsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMobileStationsUsed() {
        return xMobileStationsUsed;
    }

    /**
     * xMobileStationsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMobileStationsUsed(String value) {
        this.xMobileStationsUsed = value;
    }

    /**
     * xMobileStationsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMobileStationsAval() {
        return xMobileStationsAval;
    }

    /**
     * xMobileStationsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMobileStationsAval(String value) {
        this.xMobileStationsAval = value;
    }

    /**
     * xMobileStaSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMobileStaSysLim() {
        return xMobileStaSysLim;
    }

    /**
     * xMobileStaSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMobileStaSysLim(String value) {
        this.xMobileStaSysLim = value;
    }

    /**
     * ec500Used 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEC500Used() {
        return ec500Used;
    }

    /**
     * ec500Used 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEC500Used(String value) {
        this.ec500Used = value;
    }

    /**
     * dectUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDECTUsed() {
        return dectUsed;
    }

    /**
     * dectUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDECTUsed(String value) {
        this.dectUsed = value;
    }

    /**
     * phsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHSUsed() {
        return phsUsed;
    }

    /**
     * phsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHSUsed(String value) {
        this.phsUsed = value;
    }

    /**
     * offPBXEC500Used 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXEC500Used() {
        return offPBXEC500Used;
    }

    /**
     * offPBXEC500Used 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXEC500Used(String value) {
        this.offPBXEC500Used = value;
    }

    /**
     * offPBXEC500Aval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXEC500Aval() {
        return offPBXEC500Aval;
    }

    /**
     * offPBXEC500Aval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXEC500Aval(String value) {
        this.offPBXEC500Aval = value;
    }

    /**
     * offPBXEC500SysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXEC500SysLimit() {
        return offPBXEC500SysLimit;
    }

    /**
     * offPBXEC500SysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXEC500SysLimit(String value) {
        this.offPBXEC500SysLimit = value;
    }

    /**
     * offPBXOPSUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXOPSUsed() {
        return offPBXOPSUsed;
    }

    /**
     * offPBXOPSUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXOPSUsed(String value) {
        this.offPBXOPSUsed = value;
    }

    /**
     * offPBXOPSAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXOPSAval() {
        return offPBXOPSAval;
    }

    /**
     * offPBXOPSAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXOPSAval(String value) {
        this.offPBXOPSAval = value;
    }

    /**
     * offPBXOPSSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXOPSSysLimit() {
        return offPBXOPSSysLimit;
    }

    /**
     * offPBXOPSSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXOPSSysLimit(String value) {
        this.offPBXOPSSysLimit = value;
    }

    /**
     * offPBXSCCANUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXSCCANUsed() {
        return offPBXSCCANUsed;
    }

    /**
     * offPBXSCCANUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXSCCANUsed(String value) {
        this.offPBXSCCANUsed = value;
    }

    /**
     * offPBXSCCANAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXSCCANAval() {
        return offPBXSCCANAval;
    }

    /**
     * offPBXSCCANAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXSCCANAval(String value) {
        this.offPBXSCCANAval = value;
    }

    /**
     * offPBXSCCANSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXSCCANSysLimit() {
        return offPBXSCCANSysLimit;
    }

    /**
     * offPBXSCCANSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXSCCANSysLimit(String value) {
        this.offPBXSCCANSysLimit = value;
    }

    /**
     * offPBXMemoryUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXMemoryUsed() {
        return offPBXMemoryUsed;
    }

    /**
     * offPBXMemoryUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXMemoryUsed(String value) {
        this.offPBXMemoryUsed = value;
    }

    /**
     * offPBXMemoryAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXMemoryAval() {
        return offPBXMemoryAval;
    }

    /**
     * offPBXMemoryAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXMemoryAval(String value) {
        this.offPBXMemoryAval = value;
    }

    /**
     * offPBXMemorySysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXMemorySysLimit() {
        return offPBXMemorySysLimit;
    }

    /**
     * offPBXMemorySysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXMemorySysLimit(String value) {
        this.offPBXMemorySysLimit = value;
    }

    /**
     * ipStationsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStationsUsed() {
        return ipStationsUsed;
    }

    /**
     * ipStationsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStationsUsed(String value) {
        this.ipStationsUsed = value;
    }

    /**
     * ipStationsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStationsAval() {
        return ipStationsAval;
    }

    /**
     * ipStationsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStationsAval(String value) {
        this.ipStationsAval = value;
    }

    /**
     * ipStationsSysLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStationsSysLimit() {
        return ipStationsSysLimit;
    }

    /**
     * ipStationsSysLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStationsSysLimit(String value) {
        this.ipStationsSysLimit = value;
    }

    /**
     * ipStationsinTTIUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStationsinTTIUsed() {
        return ipStationsinTTIUsed;
    }

    /**
     * ipStationsinTTIUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStationsinTTIUsed(String value) {
        this.ipStationsinTTIUsed = value;
    }

    /**
     * ipAttendantConsUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAttendantConsUsed() {
        return ipAttendantConsUsed;
    }

    /**
     * ipAttendantConsUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAttendantConsUsed(String value) {
        this.ipAttendantConsUsed = value;
    }

    /**
     * ipAttendantConsAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAttendantConsAval() {
        return ipAttendantConsAval;
    }

    /**
     * ipAttendantConsAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAttendantConsAval(String value) {
        this.ipAttendantConsAval = value;
    }

    /**
     * ipAtdtConsSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAtdtConsSysLim() {
        return ipAtdtConsSysLim;
    }

    /**
     * ipAtdtConsSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAtdtConsSysLim(String value) {
        this.ipAtdtConsSysLim = value;
    }

    /**
     * remoteOfficStatUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOfficStatUsed() {
        return remoteOfficStatUsed;
    }

    /**
     * remoteOfficStatUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOfficStatUsed(String value) {
        this.remoteOfficStatUsed = value;
    }

    /**
     * remoteOfficStatAval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOfficStatAval() {
        return remoteOfficStatAval;
    }

    /**
     * remoteOfficStatAval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOfficStatAval(String value) {
        this.remoteOfficStatAval = value;
    }

    /**
     * remoteOffcSTatSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOffcSTatSysLim() {
        return remoteOffcSTatSysLim;
    }

    /**
     * remoteOffcSTatSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOffcSTatSysLim(String value) {
        this.remoteOffcSTatSysLim = value;
    }

    /**
     * unAuthH323StatUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnAuthH323StatUsed() {
        return unAuthH323StatUsed;
    }

    /**
     * unAuthH323StatUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnAuthH323StatUsed(String value) {
        this.unAuthH323StatUsed = value;
    }

    /**
     * unAuthH323StaAva 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnAuthH323StaAva() {
        return unAuthH323StaAva;
    }

    /**
     * unAuthH323StaAva 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnAuthH323StaAva(String value) {
        this.unAuthH323StaAva = value;
    }

    /**
     * unAuthH323StatSysLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnAuthH323StatSysLim() {
        return unAuthH323StatSysLim;
    }

    /**
     * unAuthH323StatSysLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnAuthH323StatSysLim(String value) {
        this.unAuthH323StatSysLim = value;
    }

    /**
     * softwareLoad 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareLoad() {
        return softwareLoad;
    }

    /**
     * softwareLoad 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareLoad(String value) {
        this.softwareLoad = value;
    }

    /**
     * memoryConfiguration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryConfiguration() {
        return memoryConfiguration;
    }

    /**
     * memoryConfiguration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryConfiguration(String value) {
        this.memoryConfiguration = value;
    }

    /**
     * offerCatagory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCatagory() {
        return offerCatagory;
    }

    /**
     * offerCatagory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCatagory(String value) {
        this.offerCatagory = value;
    }

    /**
     * lastSoftwareLoad 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSoftwareLoad() {
        return lastSoftwareLoad;
    }

    /**
     * lastSoftwareLoad 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSoftwareLoad(String value) {
        this.lastSoftwareLoad = value;
    }

    /**
     * lastMemoryConfig 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMemoryConfig() {
        return lastMemoryConfig;
    }

    /**
     * lastMemoryConfig 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMemoryConfig(String value) {
        this.lastMemoryConfig = value;
    }

    /**
     * lastOfferCatagory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastOfferCatagory() {
        return lastOfferCatagory;
    }

    /**
     * lastOfferCatagory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOfferCatagory(String value) {
        this.lastOfferCatagory = value;
    }

    /**
     * Gets the value of the currentRegID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegID() {
        if (currentRegID == null) {
            currentRegID = new ArrayList<ArrayType>();
        }
        return this.currentRegID;
    }

    /**
     * Gets the value of the currentRegRel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegRel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegRel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegRel() {
        if (currentRegRel == null) {
            currentRegRel = new ArrayList<ArrayType>();
        }
        return this.currentRegRel;
    }

    /**
     * Gets the value of the currentRegRegist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegRegist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegRegist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegRegist() {
        if (currentRegRegist == null) {
            currentRegRegist = new ArrayList<ArrayType>();
        }
        return this.currentRegRegist;
    }

    /**
     * Gets the value of the currentRegAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegAvail() {
        if (currentRegAvail == null) {
            currentRegAvail = new ArrayList<ArrayType>();
        }
        return this.currentRegAvail;
    }

    /**
     * Gets the value of the currentRegSysLim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegSysLim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegSysLim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegSysLim() {
        if (currentRegSysLim == null) {
            currentRegSysLim = new ArrayList<ArrayType>();
        }
        return this.currentRegSysLim;
    }

}
