
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HuntGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="HuntGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Administered_Members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Measured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Reception" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audix_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Center_AUDIX_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Externally_Controlled_Distribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administered_Members_Min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administered_Members_Max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Class_of_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_SIP_Caller_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM_Early_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supervisor_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Agent_Preference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SLM_Max_Auto_Reserve_Agents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SLM_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SLM_Count_Abandoned_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Controlling_Adjunct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adjunct_CTI_Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forced_Entry_of_Stroke_Counts_or_Call_Work_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timed_ACW_Interval_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="After_Xfer_or_Held_Call_Drops" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Objective_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Level_Supervisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level_1_Threshold_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level_2_Threshold_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activate_on_Oldest_Call_Waiting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Selection_Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Threshold_Adjustment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Percentage_Adjustment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Queue_Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Level_Target_Perct_In_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Level_Target_Seconds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expected_Call_Handling_Time_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VuStats_Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Call_Handling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Redirect_on_No_Answer_Rings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Redirect_to_VDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Redirect_on_IP_OPTIM_Fail_to_VDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Retain_Active_VDN_Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Warning_Threshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Warning_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Warning_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Warning_Threshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Warning_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Warning_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Night_Service_Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inflow_Threshold_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority_On_Intraflow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_Announcement_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_Announcement_Delay_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Second_Announcement_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Second_Announcement_Delay_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Second_Announcement_Recurring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calling_Party_Number_to_INTUITY_AUDIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voice_Mail_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Routing_Digits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voice_Mail_Number_Rem_Vm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voice_Mail_Handle_Rem_Vm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Routing_Digits_Rem_Vm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provide_Ringback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSC_per_MWI_Interrogation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Send_Reroute_Request" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voice_Mail_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interruptible_Aux_Threshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interruptible_Aux_Deactivation_Threshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_Scripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}HuntGroupArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HuntGroupType", propOrder = {
    "groupNumber",
    "groupName",
    "groupExtension",
    "groupType",
    "totalAdministeredMembers",
    "acd",
    "measured",
    "queue",
    "vector",
    "skill",
    "coveragePath",
    "lwcReception",
    "messageCenter",
    "audixName",
    "messageCenterAUDIXName",
    "externallyControlledDistribution",
    "administeredMembersMin",
    "administeredMembersMax",
    "tn",
    "classOfRestriction",
    "securityCode",
    "isdnsipCallerDisplay",
    "mmEarlyAnswer",
    "aas",
    "supervisorExtension",
    "localAgentPreference",
    "slmMaxAutoReserveAgents",
    "slmInterval",
    "slmCountAbandonedCalls",
    "controllingAdjunct",
    "adjunctCTILink",
    "forcedEntryOfStrokeCountsOrCallWorkCodes",
    "timedACWIntervalSec",
    "afterXferOrHeldCallDrops",
    "serviceObjectiveSec",
    "serviceLevelSupervisor",
    "level1ThresholdSec",
    "level2ThresholdSec",
    "activateOnOldestCallWaiting",
    "callSelectionOverride",
    "dynamicThresholdAdjustment",
    "dynamicPercentageAdjustment",
    "dynamicQueuePosition",
    "serviceLevelTargetPerctInSec",
    "serviceLevelTargetSeconds",
    "expectedCallHandlingTimeSec",
    "vuStatsObjective",
    "multipleCallHandling",
    "redirectOnNoAnswerRings",
    "redirectToVDN",
    "redirectOnIPOPTIMFailToVDN",
    "retainActiveVDNContext",
    "queueLimit",
    "callWarningThreshold",
    "callWarningPort",
    "callWarningExtension",
    "timeWarningThreshold",
    "timeWarningPort",
    "timeWarningExtension",
    "nightServiceDestination",
    "inflowThresholdSec",
    "priorityOnIntraflow",
    "firstAnnouncementExtension",
    "firstAnnouncementDelaySec",
    "secondAnnouncementExtension",
    "secondAnnouncementDelaySec",
    "secondAnnouncementRecurring",
    "primary",
    "callingPartyNumberToINTUITYAUDIX",
    "voiceMailNumber",
    "routingDigits",
    "voiceMailNumberRemVm",
    "voiceMailHandleRemVm",
    "routingDigitsRemVm",
    "provideRingback",
    "tscPerMWIInterrogation",
    "sendRerouteRequest",
    "voiceMailExtension",
    "interruptibleAuxThreshold",
    "interruptibleAuxDeactivationThreshold",
    "nativeName1",
    "nativeName2",
    "nativeName3",
    "nativeName4",
    "nativeName5",
    "nativeNameScripts",
    "assignedExtension",
    "assignedExtension201",
    "assignedExtension401",
    "assignedExtension601",
    "assignedExtension801",
    "assignedExtension1001",
    "assignedExtension1201",
    "assignedExtension1401",
    "assignedExtensionName",
    "assignedExtensionName201",
    "assignedExtensionName401",
    "assignedExtensionName601",
    "assignedExtensionName801",
    "assignedExtensionName1001",
    "assignedExtensionName1201",
    "assignedExtensionName1401"
})
public class HuntGroupType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "Group_Name")
    protected String groupName;
    @XmlElement(name = "Group_Extension")
    protected String groupExtension;
    @XmlElement(name = "Group_Type")
    protected String groupType;
    @XmlElement(name = "Total_Administered_Members")
    protected String totalAdministeredMembers;
    @XmlElement(name = "ACD")
    protected String acd;
    @XmlElement(name = "Measured")
    protected String measured;
    @XmlElement(name = "Queue")
    protected String queue;
    @XmlElement(name = "Vector")
    protected String vector;
    @XmlElement(name = "Skill")
    protected String skill;
    @XmlElement(name = "Coverage_Path")
    protected String coveragePath;
    @XmlElement(name = "LWC_Reception")
    protected String lwcReception;
    @XmlElement(name = "Message_Center")
    protected String messageCenter;
    @XmlElement(name = "Audix_Name")
    protected String audixName;
    @XmlElement(name = "Message_Center_AUDIX_Name")
    protected String messageCenterAUDIXName;
    @XmlElement(name = "Externally_Controlled_Distribution")
    protected String externallyControlledDistribution;
    @XmlElement(name = "Administered_Members_Min")
    protected String administeredMembersMin;
    @XmlElement(name = "Administered_Members_Max")
    protected String administeredMembersMax;
    @XmlElement(name = "TN")
    protected String tn;
    @XmlElement(name = "Class_of_Restriction")
    protected String classOfRestriction;
    @XmlElement(name = "Security_Code")
    protected String securityCode;
    @XmlElement(name = "ISDN_SIP_Caller_Display")
    protected String isdnsipCallerDisplay;
    @XmlElement(name = "MM_Early_Answer")
    protected String mmEarlyAnswer;
    @XmlElement(name = "AAS")
    protected String aas;
    @XmlElement(name = "Supervisor_Extension")
    protected String supervisorExtension;
    @XmlElement(name = "Local_Agent_Preference")
    protected String localAgentPreference;
    @XmlElement(name = "SLM_Max_Auto_Reserve_Agents")
    protected String slmMaxAutoReserveAgents;
    @XmlElement(name = "SLM_Interval")
    protected String slmInterval;
    @XmlElement(name = "SLM_Count_Abandoned_Calls")
    protected String slmCountAbandonedCalls;
    @XmlElement(name = "Controlling_Adjunct")
    protected String controllingAdjunct;
    @XmlElement(name = "Adjunct_CTI_Link")
    protected String adjunctCTILink;
    @XmlElement(name = "Forced_Entry_of_Stroke_Counts_or_Call_Work_Codes")
    protected String forcedEntryOfStrokeCountsOrCallWorkCodes;
    @XmlElement(name = "Timed_ACW_Interval_Sec")
    protected String timedACWIntervalSec;
    @XmlElement(name = "After_Xfer_or_Held_Call_Drops")
    protected String afterXferOrHeldCallDrops;
    @XmlElement(name = "Service_Objective_Sec")
    protected String serviceObjectiveSec;
    @XmlElement(name = "Service_Level_Supervisor")
    protected String serviceLevelSupervisor;
    @XmlElement(name = "Level_1_Threshold_Sec")
    protected String level1ThresholdSec;
    @XmlElement(name = "Level_2_Threshold_Sec")
    protected String level2ThresholdSec;
    @XmlElement(name = "Activate_on_Oldest_Call_Waiting")
    protected String activateOnOldestCallWaiting;
    @XmlElement(name = "Call_Selection_Override")
    protected String callSelectionOverride;
    @XmlElement(name = "Dynamic_Threshold_Adjustment")
    protected String dynamicThresholdAdjustment;
    @XmlElement(name = "Dynamic_Percentage_Adjustment")
    protected String dynamicPercentageAdjustment;
    @XmlElement(name = "Dynamic_Queue_Position")
    protected String dynamicQueuePosition;
    @XmlElement(name = "Service_Level_Target_Perct_In_Sec")
    protected String serviceLevelTargetPerctInSec;
    @XmlElement(name = "Service_Level_Target_Seconds")
    protected String serviceLevelTargetSeconds;
    @XmlElement(name = "Expected_Call_Handling_Time_Sec")
    protected String expectedCallHandlingTimeSec;
    @XmlElement(name = "VuStats_Objective")
    protected String vuStatsObjective;
    @XmlElement(name = "Multiple_Call_Handling")
    protected String multipleCallHandling;
    @XmlElement(name = "Redirect_on_No_Answer_Rings")
    protected String redirectOnNoAnswerRings;
    @XmlElement(name = "Redirect_to_VDN")
    protected String redirectToVDN;
    @XmlElement(name = "Redirect_on_IP_OPTIM_Fail_to_VDN")
    protected String redirectOnIPOPTIMFailToVDN;
    @XmlElement(name = "Retain_Active_VDN_Context")
    protected String retainActiveVDNContext;
    @XmlElement(name = "Queue_Limit")
    protected String queueLimit;
    @XmlElement(name = "Call_Warning_Threshold")
    protected String callWarningThreshold;
    @XmlElement(name = "Call_Warning_Port")
    protected String callWarningPort;
    @XmlElement(name = "Call_Warning_Extension")
    protected String callWarningExtension;
    @XmlElement(name = "Time_Warning_Threshold")
    protected String timeWarningThreshold;
    @XmlElement(name = "Time_Warning_Port")
    protected String timeWarningPort;
    @XmlElement(name = "Time_Warning_Extension")
    protected String timeWarningExtension;
    @XmlElement(name = "Night_Service_Destination")
    protected String nightServiceDestination;
    @XmlElement(name = "Inflow_Threshold_Sec")
    protected String inflowThresholdSec;
    @XmlElement(name = "Priority_On_Intraflow")
    protected String priorityOnIntraflow;
    @XmlElement(name = "First_Announcement_Extension")
    protected String firstAnnouncementExtension;
    @XmlElement(name = "First_Announcement_Delay_Sec")
    protected String firstAnnouncementDelaySec;
    @XmlElement(name = "Second_Announcement_Extension")
    protected String secondAnnouncementExtension;
    @XmlElement(name = "Second_Announcement_Delay_Sec")
    protected String secondAnnouncementDelaySec;
    @XmlElement(name = "Second_Announcement_Recurring")
    protected String secondAnnouncementRecurring;
    @XmlElement(name = "Primary")
    protected String primary;
    @XmlElement(name = "Calling_Party_Number_to_INTUITY_AUDIX")
    protected String callingPartyNumberToINTUITYAUDIX;
    @XmlElement(name = "Voice_Mail_Number")
    protected String voiceMailNumber;
    @XmlElement(name = "Routing_Digits")
    protected String routingDigits;
    @XmlElement(name = "Voice_Mail_Number_Rem_Vm")
    protected String voiceMailNumberRemVm;
    @XmlElement(name = "Voice_Mail_Handle_Rem_Vm")
    protected String voiceMailHandleRemVm;
    @XmlElement(name = "Routing_Digits_Rem_Vm")
    protected String routingDigitsRemVm;
    @XmlElement(name = "Provide_Ringback")
    protected String provideRingback;
    @XmlElement(name = "TSC_per_MWI_Interrogation")
    protected String tscPerMWIInterrogation;
    @XmlElement(name = "Send_Reroute_Request")
    protected String sendRerouteRequest;
    @XmlElement(name = "Voice_Mail_Extension")
    protected String voiceMailExtension;
    @XmlElement(name = "Interruptible_Aux_Threshold")
    protected String interruptibleAuxThreshold;
    @XmlElement(name = "Interruptible_Aux_Deactivation_Threshold")
    protected String interruptibleAuxDeactivationThreshold;
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
    @XmlElement(name = "Assigned_Extension")
    protected List<ArrayType> assignedExtension;
    @XmlElement(name = "Assigned_Extension201")
    protected List<ArrayType> assignedExtension201;
    @XmlElement(name = "Assigned_Extension401")
    protected List<ArrayType> assignedExtension401;
    @XmlElement(name = "Assigned_Extension601")
    protected List<ArrayType> assignedExtension601;
    @XmlElement(name = "Assigned_Extension801")
    protected List<ArrayType> assignedExtension801;
    @XmlElement(name = "Assigned_Extension1001")
    protected List<ArrayType> assignedExtension1001;
    @XmlElement(name = "Assigned_Extension1201")
    protected List<ArrayType> assignedExtension1201;
    @XmlElement(name = "Assigned_Extension1401")
    protected List<ArrayType> assignedExtension1401;
    @XmlElement(name = "Assigned_Extension_Name")
    protected List<ArrayType> assignedExtensionName;
    @XmlElement(name = "Assigned_Extension_Name201")
    protected List<ArrayType> assignedExtensionName201;
    @XmlElement(name = "Assigned_Extension_Name401")
    protected List<ArrayType> assignedExtensionName401;
    @XmlElement(name = "Assigned_Extension_Name601")
    protected List<ArrayType> assignedExtensionName601;
    @XmlElement(name = "Assigned_Extension_Name801")
    protected List<ArrayType> assignedExtensionName801;
    @XmlElement(name = "Assigned_Extension_Name1001")
    protected List<ArrayType> assignedExtensionName1001;
    @XmlElement(name = "Assigned_Extension_Name1201")
    protected List<ArrayType> assignedExtensionName1201;
    @XmlElement(name = "Assigned_Extension_Name1401")
    protected List<ArrayType> assignedExtensionName1401;

    /**
     * groupNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNumber() {
        return groupNumber;
    }

    /**
     * groupNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNumber(String value) {
        this.groupNumber = value;
    }

    /**
     * groupName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * groupName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * groupExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupExtension() {
        return groupExtension;
    }

    /**
     * groupExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupExtension(String value) {
        this.groupExtension = value;
    }

    /**
     * groupType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * groupType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * totalAdministeredMembers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAdministeredMembers() {
        return totalAdministeredMembers;
    }

    /**
     * totalAdministeredMembers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAdministeredMembers(String value) {
        this.totalAdministeredMembers = value;
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
     * measured 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasured() {
        return measured;
    }

    /**
     * measured 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasured(String value) {
        this.measured = value;
    }

    /**
     * queue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * queue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * vector 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVector() {
        return vector;
    }

    /**
     * vector 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVector(String value) {
        this.vector = value;
    }

    /**
     * skill 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkill() {
        return skill;
    }

    /**
     * skill 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkill(String value) {
        this.skill = value;
    }

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
     * messageCenter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCenter() {
        return messageCenter;
    }

    /**
     * messageCenter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCenter(String value) {
        this.messageCenter = value;
    }

    /**
     * audixName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudixName() {
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
    public void setAudixName(String value) {
        this.audixName = value;
    }

    /**
     * messageCenterAUDIXName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCenterAUDIXName() {
        return messageCenterAUDIXName;
    }

    /**
     * messageCenterAUDIXName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCenterAUDIXName(String value) {
        this.messageCenterAUDIXName = value;
    }

    /**
     * externallyControlledDistribution 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternallyControlledDistribution() {
        return externallyControlledDistribution;
    }

    /**
     * externallyControlledDistribution 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternallyControlledDistribution(String value) {
        this.externallyControlledDistribution = value;
    }

    /**
     * administeredMembersMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredMembersMin() {
        return administeredMembersMin;
    }

    /**
     * administeredMembersMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredMembersMin(String value) {
        this.administeredMembersMin = value;
    }

    /**
     * administeredMembersMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredMembersMax() {
        return administeredMembersMax;
    }

    /**
     * administeredMembersMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredMembersMax(String value) {
        this.administeredMembersMax = value;
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
     * classOfRestriction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfRestriction() {
        return classOfRestriction;
    }

    /**
     * classOfRestriction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfRestriction(String value) {
        this.classOfRestriction = value;
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
     * isdnsipCallerDisplay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNSIPCallerDisplay() {
        return isdnsipCallerDisplay;
    }

    /**
     * isdnsipCallerDisplay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNSIPCallerDisplay(String value) {
        this.isdnsipCallerDisplay = value;
    }

    /**
     * mmEarlyAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMEarlyAnswer() {
        return mmEarlyAnswer;
    }

    /**
     * mmEarlyAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMEarlyAnswer(String value) {
        this.mmEarlyAnswer = value;
    }

    /**
     * aas 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAAS() {
        return aas;
    }

    /**
     * aas 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAAS(String value) {
        this.aas = value;
    }

    /**
     * supervisorExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorExtension() {
        return supervisorExtension;
    }

    /**
     * supervisorExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorExtension(String value) {
        this.supervisorExtension = value;
    }

    /**
     * localAgentPreference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAgentPreference() {
        return localAgentPreference;
    }

    /**
     * localAgentPreference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAgentPreference(String value) {
        this.localAgentPreference = value;
    }

    /**
     * slmMaxAutoReserveAgents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLMMaxAutoReserveAgents() {
        return slmMaxAutoReserveAgents;
    }

    /**
     * slmMaxAutoReserveAgents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLMMaxAutoReserveAgents(String value) {
        this.slmMaxAutoReserveAgents = value;
    }

    /**
     * slmInterval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLMInterval() {
        return slmInterval;
    }

    /**
     * slmInterval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLMInterval(String value) {
        this.slmInterval = value;
    }

    /**
     * slmCountAbandonedCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLMCountAbandonedCalls() {
        return slmCountAbandonedCalls;
    }

    /**
     * slmCountAbandonedCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLMCountAbandonedCalls(String value) {
        this.slmCountAbandonedCalls = value;
    }

    /**
     * controllingAdjunct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllingAdjunct() {
        return controllingAdjunct;
    }

    /**
     * controllingAdjunct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllingAdjunct(String value) {
        this.controllingAdjunct = value;
    }

    /**
     * adjunctCTILink 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctCTILink() {
        return adjunctCTILink;
    }

    /**
     * adjunctCTILink 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctCTILink(String value) {
        this.adjunctCTILink = value;
    }

    /**
     * forcedEntryOfStrokeCountsOrCallWorkCodes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedEntryOfStrokeCountsOrCallWorkCodes() {
        return forcedEntryOfStrokeCountsOrCallWorkCodes;
    }

    /**
     * forcedEntryOfStrokeCountsOrCallWorkCodes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedEntryOfStrokeCountsOrCallWorkCodes(String value) {
        this.forcedEntryOfStrokeCountsOrCallWorkCodes = value;
    }

    /**
     * timedACWIntervalSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimedACWIntervalSec() {
        return timedACWIntervalSec;
    }

    /**
     * timedACWIntervalSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimedACWIntervalSec(String value) {
        this.timedACWIntervalSec = value;
    }

    /**
     * afterXferOrHeldCallDrops 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterXferOrHeldCallDrops() {
        return afterXferOrHeldCallDrops;
    }

    /**
     * afterXferOrHeldCallDrops 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterXferOrHeldCallDrops(String value) {
        this.afterXferOrHeldCallDrops = value;
    }

    /**
     * serviceObjectiveSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObjectiveSec() {
        return serviceObjectiveSec;
    }

    /**
     * serviceObjectiveSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObjectiveSec(String value) {
        this.serviceObjectiveSec = value;
    }

    /**
     * serviceLevelSupervisor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevelSupervisor() {
        return serviceLevelSupervisor;
    }

    /**
     * serviceLevelSupervisor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevelSupervisor(String value) {
        this.serviceLevelSupervisor = value;
    }

    /**
     * level1ThresholdSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel1ThresholdSec() {
        return level1ThresholdSec;
    }

    /**
     * level1ThresholdSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel1ThresholdSec(String value) {
        this.level1ThresholdSec = value;
    }

    /**
     * level2ThresholdSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel2ThresholdSec() {
        return level2ThresholdSec;
    }

    /**
     * level2ThresholdSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel2ThresholdSec(String value) {
        this.level2ThresholdSec = value;
    }

    /**
     * activateOnOldestCallWaiting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateOnOldestCallWaiting() {
        return activateOnOldestCallWaiting;
    }

    /**
     * activateOnOldestCallWaiting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateOnOldestCallWaiting(String value) {
        this.activateOnOldestCallWaiting = value;
    }

    /**
     * callSelectionOverride 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSelectionOverride() {
        return callSelectionOverride;
    }

    /**
     * callSelectionOverride 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSelectionOverride(String value) {
        this.callSelectionOverride = value;
    }

    /**
     * dynamicThresholdAdjustment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicThresholdAdjustment() {
        return dynamicThresholdAdjustment;
    }

    /**
     * dynamicThresholdAdjustment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicThresholdAdjustment(String value) {
        this.dynamicThresholdAdjustment = value;
    }

    /**
     * dynamicPercentageAdjustment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicPercentageAdjustment() {
        return dynamicPercentageAdjustment;
    }

    /**
     * dynamicPercentageAdjustment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicPercentageAdjustment(String value) {
        this.dynamicPercentageAdjustment = value;
    }

    /**
     * dynamicQueuePosition 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicQueuePosition() {
        return dynamicQueuePosition;
    }

    /**
     * dynamicQueuePosition 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicQueuePosition(String value) {
        this.dynamicQueuePosition = value;
    }

    /**
     * serviceLevelTargetPerctInSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevelTargetPerctInSec() {
        return serviceLevelTargetPerctInSec;
    }

    /**
     * serviceLevelTargetPerctInSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevelTargetPerctInSec(String value) {
        this.serviceLevelTargetPerctInSec = value;
    }

    /**
     * serviceLevelTargetSeconds 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevelTargetSeconds() {
        return serviceLevelTargetSeconds;
    }

    /**
     * serviceLevelTargetSeconds 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevelTargetSeconds(String value) {
        this.serviceLevelTargetSeconds = value;
    }

    /**
     * expectedCallHandlingTimeSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedCallHandlingTimeSec() {
        return expectedCallHandlingTimeSec;
    }

    /**
     * expectedCallHandlingTimeSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedCallHandlingTimeSec(String value) {
        this.expectedCallHandlingTimeSec = value;
    }

    /**
     * vuStatsObjective 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuStatsObjective() {
        return vuStatsObjective;
    }

    /**
     * vuStatsObjective 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuStatsObjective(String value) {
        this.vuStatsObjective = value;
    }

    /**
     * multipleCallHandling 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleCallHandling() {
        return multipleCallHandling;
    }

    /**
     * multipleCallHandling 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleCallHandling(String value) {
        this.multipleCallHandling = value;
    }

    /**
     * redirectOnNoAnswerRings 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectOnNoAnswerRings() {
        return redirectOnNoAnswerRings;
    }

    /**
     * redirectOnNoAnswerRings 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectOnNoAnswerRings(String value) {
        this.redirectOnNoAnswerRings = value;
    }

    /**
     * redirectToVDN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectToVDN() {
        return redirectToVDN;
    }

    /**
     * redirectToVDN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectToVDN(String value) {
        this.redirectToVDN = value;
    }

    /**
     * redirectOnIPOPTIMFailToVDN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectOnIPOPTIMFailToVDN() {
        return redirectOnIPOPTIMFailToVDN;
    }

    /**
     * redirectOnIPOPTIMFailToVDN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectOnIPOPTIMFailToVDN(String value) {
        this.redirectOnIPOPTIMFailToVDN = value;
    }

    /**
     * retainActiveVDNContext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetainActiveVDNContext() {
        return retainActiveVDNContext;
    }

    /**
     * retainActiveVDNContext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetainActiveVDNContext(String value) {
        this.retainActiveVDNContext = value;
    }

    /**
     * queueLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueLimit() {
        return queueLimit;
    }

    /**
     * queueLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueLimit(String value) {
        this.queueLimit = value;
    }

    /**
     * callWarningThreshold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWarningThreshold() {
        return callWarningThreshold;
    }

    /**
     * callWarningThreshold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWarningThreshold(String value) {
        this.callWarningThreshold = value;
    }

    /**
     * callWarningPort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWarningPort() {
        return callWarningPort;
    }

    /**
     * callWarningPort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWarningPort(String value) {
        this.callWarningPort = value;
    }

    /**
     * callWarningExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWarningExtension() {
        return callWarningExtension;
    }

    /**
     * callWarningExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWarningExtension(String value) {
        this.callWarningExtension = value;
    }

    /**
     * timeWarningThreshold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeWarningThreshold() {
        return timeWarningThreshold;
    }

    /**
     * timeWarningThreshold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWarningThreshold(String value) {
        this.timeWarningThreshold = value;
    }

    /**
     * timeWarningPort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeWarningPort() {
        return timeWarningPort;
    }

    /**
     * timeWarningPort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWarningPort(String value) {
        this.timeWarningPort = value;
    }

    /**
     * timeWarningExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeWarningExtension() {
        return timeWarningExtension;
    }

    /**
     * timeWarningExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWarningExtension(String value) {
        this.timeWarningExtension = value;
    }

    /**
     * nightServiceDestination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNightServiceDestination() {
        return nightServiceDestination;
    }

    /**
     * nightServiceDestination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNightServiceDestination(String value) {
        this.nightServiceDestination = value;
    }

    /**
     * inflowThresholdSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInflowThresholdSec() {
        return inflowThresholdSec;
    }

    /**
     * inflowThresholdSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInflowThresholdSec(String value) {
        this.inflowThresholdSec = value;
    }

    /**
     * priorityOnIntraflow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityOnIntraflow() {
        return priorityOnIntraflow;
    }

    /**
     * priorityOnIntraflow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityOnIntraflow(String value) {
        this.priorityOnIntraflow = value;
    }

    /**
     * firstAnnouncementExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstAnnouncementExtension() {
        return firstAnnouncementExtension;
    }

    /**
     * firstAnnouncementExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAnnouncementExtension(String value) {
        this.firstAnnouncementExtension = value;
    }

    /**
     * firstAnnouncementDelaySec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstAnnouncementDelaySec() {
        return firstAnnouncementDelaySec;
    }

    /**
     * firstAnnouncementDelaySec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAnnouncementDelaySec(String value) {
        this.firstAnnouncementDelaySec = value;
    }

    /**
     * secondAnnouncementExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondAnnouncementExtension() {
        return secondAnnouncementExtension;
    }

    /**
     * secondAnnouncementExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondAnnouncementExtension(String value) {
        this.secondAnnouncementExtension = value;
    }

    /**
     * secondAnnouncementDelaySec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondAnnouncementDelaySec() {
        return secondAnnouncementDelaySec;
    }

    /**
     * secondAnnouncementDelaySec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondAnnouncementDelaySec(String value) {
        this.secondAnnouncementDelaySec = value;
    }

    /**
     * secondAnnouncementRecurring 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondAnnouncementRecurring() {
        return secondAnnouncementRecurring;
    }

    /**
     * secondAnnouncementRecurring 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondAnnouncementRecurring(String value) {
        this.secondAnnouncementRecurring = value;
    }

    /**
     * primary 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * primary 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary(String value) {
        this.primary = value;
    }

    /**
     * callingPartyNumberToINTUITYAUDIX 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNumberToINTUITYAUDIX() {
        return callingPartyNumberToINTUITYAUDIX;
    }

    /**
     * callingPartyNumberToINTUITYAUDIX 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNumberToINTUITYAUDIX(String value) {
        this.callingPartyNumberToINTUITYAUDIX = value;
    }

    /**
     * voiceMailNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailNumber() {
        return voiceMailNumber;
    }

    /**
     * voiceMailNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailNumber(String value) {
        this.voiceMailNumber = value;
    }

    /**
     * routingDigits 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingDigits() {
        return routingDigits;
    }

    /**
     * routingDigits 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingDigits(String value) {
        this.routingDigits = value;
    }

    /**
     * voiceMailNumberRemVm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailNumberRemVm() {
        return voiceMailNumberRemVm;
    }

    /**
     * voiceMailNumberRemVm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailNumberRemVm(String value) {
        this.voiceMailNumberRemVm = value;
    }

    /**
     * voiceMailHandleRemVm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailHandleRemVm() {
        return voiceMailHandleRemVm;
    }

    /**
     * voiceMailHandleRemVm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailHandleRemVm(String value) {
        this.voiceMailHandleRemVm = value;
    }

    /**
     * routingDigitsRemVm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingDigitsRemVm() {
        return routingDigitsRemVm;
    }

    /**
     * routingDigitsRemVm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingDigitsRemVm(String value) {
        this.routingDigitsRemVm = value;
    }

    /**
     * provideRingback 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvideRingback() {
        return provideRingback;
    }

    /**
     * provideRingback 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvideRingback(String value) {
        this.provideRingback = value;
    }

    /**
     * tscPerMWIInterrogation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCPerMWIInterrogation() {
        return tscPerMWIInterrogation;
    }

    /**
     * tscPerMWIInterrogation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCPerMWIInterrogation(String value) {
        this.tscPerMWIInterrogation = value;
    }

    /**
     * sendRerouteRequest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendRerouteRequest() {
        return sendRerouteRequest;
    }

    /**
     * sendRerouteRequest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendRerouteRequest(String value) {
        this.sendRerouteRequest = value;
    }

    /**
     * voiceMailExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailExtension() {
        return voiceMailExtension;
    }

    /**
     * voiceMailExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailExtension(String value) {
        this.voiceMailExtension = value;
    }

    /**
     * interruptibleAuxThreshold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterruptibleAuxThreshold() {
        return interruptibleAuxThreshold;
    }

    /**
     * interruptibleAuxThreshold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterruptibleAuxThreshold(String value) {
        this.interruptibleAuxThreshold = value;
    }

    /**
     * interruptibleAuxDeactivationThreshold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterruptibleAuxDeactivationThreshold() {
        return interruptibleAuxDeactivationThreshold;
    }

    /**
     * interruptibleAuxDeactivationThreshold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterruptibleAuxDeactivationThreshold(String value) {
        this.interruptibleAuxDeactivationThreshold = value;
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
     * Gets the value of the assignedExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtension() {
        if (assignedExtension == null) {
            assignedExtension = new ArrayList<ArrayType>();
        }
        return this.assignedExtension;
    }

    /**
     * Gets the value of the assignedExtension201 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtension201 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtension201().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtension201() {
        if (assignedExtension201 == null) {
            assignedExtension201 = new ArrayList<ArrayType>();
        }
        return this.assignedExtension201;
    }

    /**
     * Gets the value of the assignedExtension401 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtension401 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtension401().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtension401() {
        if (assignedExtension401 == null) {
            assignedExtension401 = new ArrayList<ArrayType>();
        }
        return this.assignedExtension401;
    }

    /**
     * Gets the value of the assignedExtension601 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtension601 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtension601().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtension601() {
        if (assignedExtension601 == null) {
            assignedExtension601 = new ArrayList<ArrayType>();
        }
        return this.assignedExtension601;
    }

    /**
     * Gets the value of the assignedExtension801 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtension801 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtension801().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtension801() {
        if (assignedExtension801 == null) {
            assignedExtension801 = new ArrayList<ArrayType>();
        }
        return this.assignedExtension801;
    }

    /**
     * Gets the value of the assignedExtension1001 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtension1001 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtension1001().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtension1001() {
        if (assignedExtension1001 == null) {
            assignedExtension1001 = new ArrayList<ArrayType>();
        }
        return this.assignedExtension1001;
    }

    /**
     * Gets the value of the assignedExtension1201 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtension1201 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtension1201().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtension1201() {
        if (assignedExtension1201 == null) {
            assignedExtension1201 = new ArrayList<ArrayType>();
        }
        return this.assignedExtension1201;
    }

    /**
     * Gets the value of the assignedExtension1401 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtension1401 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtension1401().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtension1401() {
        if (assignedExtension1401 == null) {
            assignedExtension1401 = new ArrayList<ArrayType>();
        }
        return this.assignedExtension1401;
    }

    /**
     * Gets the value of the assignedExtensionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtensionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtensionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtensionName() {
        if (assignedExtensionName == null) {
            assignedExtensionName = new ArrayList<ArrayType>();
        }
        return this.assignedExtensionName;
    }

    /**
     * Gets the value of the assignedExtensionName201 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtensionName201 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtensionName201().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtensionName201() {
        if (assignedExtensionName201 == null) {
            assignedExtensionName201 = new ArrayList<ArrayType>();
        }
        return this.assignedExtensionName201;
    }

    /**
     * Gets the value of the assignedExtensionName401 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtensionName401 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtensionName401().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtensionName401() {
        if (assignedExtensionName401 == null) {
            assignedExtensionName401 = new ArrayList<ArrayType>();
        }
        return this.assignedExtensionName401;
    }

    /**
     * Gets the value of the assignedExtensionName601 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtensionName601 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtensionName601().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtensionName601() {
        if (assignedExtensionName601 == null) {
            assignedExtensionName601 = new ArrayList<ArrayType>();
        }
        return this.assignedExtensionName601;
    }

    /**
     * Gets the value of the assignedExtensionName801 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtensionName801 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtensionName801().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtensionName801() {
        if (assignedExtensionName801 == null) {
            assignedExtensionName801 = new ArrayList<ArrayType>();
        }
        return this.assignedExtensionName801;
    }

    /**
     * Gets the value of the assignedExtensionName1001 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtensionName1001 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtensionName1001().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtensionName1001() {
        if (assignedExtensionName1001 == null) {
            assignedExtensionName1001 = new ArrayList<ArrayType>();
        }
        return this.assignedExtensionName1001;
    }

    /**
     * Gets the value of the assignedExtensionName1201 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtensionName1201 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtensionName1201().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtensionName1201() {
        if (assignedExtensionName1201 == null) {
            assignedExtensionName1201 = new ArrayList<ArrayType>();
        }
        return this.assignedExtensionName1201;
    }

    /**
     * Gets the value of the assignedExtensionName1401 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedExtensionName1401 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedExtensionName1401().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignedExtensionName1401() {
        if (assignedExtensionName1401 == null) {
            assignedExtensionName1401 = new ArrayList<ArrayType>();
        }
        return this.assignedExtensionName1401;
    }

}
