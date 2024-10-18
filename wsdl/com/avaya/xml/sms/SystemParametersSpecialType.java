
package com.avaya.xml.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SystemParametersSpecialType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SystemParametersSpecialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Password_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Change_Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reenter_Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7474_Cover_Itrnl_Nit_Ser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7483_Enha_Emerg_Alert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7487_Cov_Ext_Trk_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7578_Int_Dir_Serv_DCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7666_COS_Conf_Tone_Check" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7710_Enh_Disp_Redir_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7776_Dis_Inc_Dig_ISDNi_Tr_Gr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7777_Night_Serv_DID_Tr_Grp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7778_Display_UUI_Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7779_Enhanc_DID_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7852_Pound_Star_Vec_Co_Stp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7880_ASAI_Intrn_Msr_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7900_Ser_Obsrv_Phys_Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7933_Bsy_Tn_SAC_No_Avl_Cg_Po" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7963_Dial_By_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7991_Var_Len_Account_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8052_ISDN_Redirct_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8077_Russian_Pwr_Inry_Fea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8122_QSIG_CPC_Conv_Cd_Set_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8140_Att_Dialzero_Redrct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8141_LDN_Attdt_Que_Prioty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8143_Omit_Dsgntd_Ext_Disp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8146_Disp_Updt_Redr_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8156_Att_Priority_Que_COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8157_Toll_Free_Vec_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8201_Srt_Tm_4_Dig_Yr_CD_Cs_Fl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8202_Intraswitch_CDR_COS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8211_Prime_Apprnc_Prfrnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8240_Station_Usr_Adm_FBI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8312_Meet_Me_Paging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8323_Idle_Call_Prfrnc_Dis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8339_PHSX_Station_Moblty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8348_Map_NCID_Uvrsl_Cal_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8428_Stat_Usr_But_Rng_Cntl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8434_Dly_PSTN_Con_Agt_Ansr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8439_Fwd_Held_Call_CPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8440_Unmodfd_QSIG_Rer_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8481_Rep_Cal_Prty_ASAI_ANI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8500_Exp_UUI_Disp_Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8506_Altura_Inter_FIPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7161_NORTSL1PRIDMSNaDi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8507_H245_Sup_Othr_Vendrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8508_Mult_Emrg_Acces_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8510_NTT_Map_ISDN_CP_Sub_IE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8517_Auth_Code_By_COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8518_Auto_Cl_BCll_Prty_Que" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8520_Hotel_Apl_IP_Trmnals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8558_Incr_Auto_MWIVu_Stat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8567_PH_Sx_Stat_Mobil_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8569_No_Srv_Obs_Tn_Herd_Agt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8573_Clxfer_ASAI_CAS_Main" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7291_TAAS_Pckp_During_Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8582_PSA_Loc_Disp_Enhance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8587_Netrkd_PSA_QSIG_Dvsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8589_Background_BSR_Poll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8601_Two_Dig_AUX_Reasn_Cod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8621_SCH_Feature_Enhance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8622_Enh_Call_Pickp_Alert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8623_Chained_Call_Frward" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8661_Incr_Aut_oWakup_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8662_Exp_PMS_Name_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8684_PMS_Wakeup_Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7311_CDR_Recrd_Ansr_Party" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7088_Call_Frd_Busy_DA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7088_Call_Forward_Ovrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7268_Prgrm_Grp_AD_List" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7448_Auto_Excl_COS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7491_Exp_DS1_Crc_Pk_332_G3r" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7665_Astrla_ISDN_pb_Nt_MCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7710_Enh_Brg_Apr_Disply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7948_80000_UDP_Ext_Rec_G3r" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7994_Icr_Sta_Ind_25000G3r" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7409_a_Flash_Ansr_CW_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8467_Incr_Cov_Pat_Rem_Co_Ps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8475_Russian_SOSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8601_2_Dig_Aux_Reason_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8608_Inc_Crisis_Alert_Buttons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8693_Conn_Check_4_Direct_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8694_Enh_Redirect_Notif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8697_3rd_Party_H323_end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8702_CDR_Enh_4_Net" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8744_Block_Name_4_Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8749_Inc_To_2000_Vectors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA8758_Auto_Excl_Anolog_Brd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA7409_b_Cancel_ARS_Pound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA9137_CTI_ECD_for_CC_Elite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cvg_hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParametersSpecialType", propOrder = {
    "password1",
    "password2",
    "changeKey",
    "reenterKey",
    "sa7474CoverItrnlNitSer",
    "sa7483EnhaEmergAlert",
    "sa7487CovExtTrkHold",
    "sa7578IntDirServDCS",
    "sa7666COSConfToneCheck",
    "sa7710EnhDispRedirCalls",
    "sa7776DisIncDigISDNiTrGr",
    "sa7777NightServDIDTrGrp",
    "sa7778DisplayUUIInfo",
    "sa7779EnhancDIDRouting",
    "sa7852PoundStarVecCoStp",
    "sa7880ASAIIntrnMsrData",
    "sa7900SerObsrvPhysSet",
    "sa7933BsyTnSACNoAvlCgPo",
    "sa7963DialByName",
    "sa7991VarLenAccountCode",
    "sa8052ISDNRedirctNumber",
    "sa8077RussianPwrInryFea",
    "sa8122QSIGCPCConvCdSet5",
    "sa8140AttDialzeroRedrct",
    "sa8141LDNAttdtQuePrioty",
    "sa8143OmitDsgntdExtDisp",
    "sa8146DispUpdtRedrCalls",
    "sa8156AttPriorityQueCOR",
    "sa8157TollFreeVecAnswer",
    "sa8201SrtTm4DigYrCDCsFl",
    "sa8202IntraswitchCDRCOS",
    "sa8211PrimeApprncPrfrnc",
    "sa8240StationUsrAdmFBI",
    "sa8312MeetMePaging",
    "sa8323IdleCallPrfrncDis",
    "sa8339PHSXStationMoblty",
    "sa8348MapNCIDUvrslCalID",
    "sa8428StatUsrButRngCntl",
    "sa8434DlyPSTNConAgtAnsr",
    "sa8439FwdHeldCallCPN",
    "sa8440UnmodfdQSIGRerNum",
    "sa8481RepCalPrtyASAIANI",
    "sa8500ExpUUIDispInfo",
    "sa8506AlturaInterFIPN",
    "sa7161NORTSL1PRIDMSNaDi",
    "sa8507H245SupOthrVendrs",
    "sa8508MultEmrgAccesCode",
    "sa8510NTTMapISDNCPSubIE",
    "sa8517AuthCodeByCOR",
    "sa8518AutoClBCllPrtyQue",
    "sa8520HotelAplIPTrmnals",
    "sa8558IncrAutoMWIVuStat",
    "sa8567PHSxStatMobilIP",
    "sa8569NoSrvObsTnHerdAgt",
    "sa8573ClxferASAICASMain",
    "sa7291TAASPckpDuringDay",
    "sa8582PSALocDispEnhance",
    "sa8587NetrkdPSAQSIGDvsn",
    "sa8589BackgroundBSRPoll",
    "sa8601TwoDigAUXReasnCod",
    "sa8621SCHFeatureEnhance",
    "sa8622EnhCallPickpAlert",
    "sa8623ChainedCallFrward",
    "sa8661IncrAutOWakupCall",
    "sa8662ExpPMSNameNumber",
    "sa8684PMSWakeupMessage",
    "sa7311CDRRecrdAnsrParty",
    "sa7088CallFrdBusyDA",
    "sa7088CallForwardOvrd",
    "sa7268PrgrmGrpADList",
    "sa7448AutoExclCOS",
    "sa7491ExpDS1CrcPk332G3R",
    "sa7665AstrlaISDNPbNtMCT",
    "sa7710EnhBrgAprDisply",
    "sa794880000UDPExtRecG3R",
    "sa7994IcrStaInd25000G3R",
    "sa7409AFlashAnsrCWHold",
    "sa8467IncrCovPatRemCoPs",
    "sa8475RussianSOSM",
    "sa86012DigAuxReasonCode",
    "sa8608IncCrisisAlertButtons",
    "sa8693ConnCheck4DirectIP",
    "sa8694EnhRedirectNotif",
    "sa86973RdPartyH323End",
    "sa8702CDREnh4Net",
    "sa8744BlockName4Room",
    "sa8749IncTo2000Vectors",
    "sa8758AutoExclAnologBrd",
    "sa7409BCancelARSPound",
    "sa9137CTIECDForCCElite",
    "cvgHold"
})
public class SystemParametersSpecialType {

    @XmlElement(name = "Password_1")
    protected String password1;
    @XmlElement(name = "Password_2")
    protected String password2;
    @XmlElement(name = "Change_Key")
    protected String changeKey;
    @XmlElement(name = "Reenter_Key")
    protected String reenterKey;
    @XmlElement(name = "SA7474_Cover_Itrnl_Nit_Ser")
    protected String sa7474CoverItrnlNitSer;
    @XmlElement(name = "SA7483_Enha_Emerg_Alert")
    protected String sa7483EnhaEmergAlert;
    @XmlElement(name = "SA7487_Cov_Ext_Trk_Hold")
    protected String sa7487CovExtTrkHold;
    @XmlElement(name = "SA7578_Int_Dir_Serv_DCS")
    protected String sa7578IntDirServDCS;
    @XmlElement(name = "SA7666_COS_Conf_Tone_Check")
    protected String sa7666COSConfToneCheck;
    @XmlElement(name = "SA7710_Enh_Disp_Redir_Calls")
    protected String sa7710EnhDispRedirCalls;
    @XmlElement(name = "SA7776_Dis_Inc_Dig_ISDNi_Tr_Gr")
    protected String sa7776DisIncDigISDNiTrGr;
    @XmlElement(name = "SA7777_Night_Serv_DID_Tr_Grp")
    protected String sa7777NightServDIDTrGrp;
    @XmlElement(name = "SA7778_Display_UUI_Info")
    protected String sa7778DisplayUUIInfo;
    @XmlElement(name = "SA7779_Enhanc_DID_Routing")
    protected String sa7779EnhancDIDRouting;
    @XmlElement(name = "SA7852_Pound_Star_Vec_Co_Stp")
    protected String sa7852PoundStarVecCoStp;
    @XmlElement(name = "SA7880_ASAI_Intrn_Msr_Data")
    protected String sa7880ASAIIntrnMsrData;
    @XmlElement(name = "SA7900_Ser_Obsrv_Phys_Set")
    protected String sa7900SerObsrvPhysSet;
    @XmlElement(name = "SA7933_Bsy_Tn_SAC_No_Avl_Cg_Po")
    protected String sa7933BsyTnSACNoAvlCgPo;
    @XmlElement(name = "SA7963_Dial_By_Name")
    protected String sa7963DialByName;
    @XmlElement(name = "SA7991_Var_Len_Account_Code")
    protected String sa7991VarLenAccountCode;
    @XmlElement(name = "SA8052_ISDN_Redirct_Number")
    protected String sa8052ISDNRedirctNumber;
    @XmlElement(name = "SA8077_Russian_Pwr_Inry_Fea")
    protected String sa8077RussianPwrInryFea;
    @XmlElement(name = "SA8122_QSIG_CPC_Conv_Cd_Set_5")
    protected String sa8122QSIGCPCConvCdSet5;
    @XmlElement(name = "SA8140_Att_Dialzero_Redrct")
    protected String sa8140AttDialzeroRedrct;
    @XmlElement(name = "SA8141_LDN_Attdt_Que_Prioty")
    protected String sa8141LDNAttdtQuePrioty;
    @XmlElement(name = "SA8143_Omit_Dsgntd_Ext_Disp")
    protected String sa8143OmitDsgntdExtDisp;
    @XmlElement(name = "SA8146_Disp_Updt_Redr_Calls")
    protected String sa8146DispUpdtRedrCalls;
    @XmlElement(name = "SA8156_Att_Priority_Que_COR")
    protected String sa8156AttPriorityQueCOR;
    @XmlElement(name = "SA8157_Toll_Free_Vec_Answer")
    protected String sa8157TollFreeVecAnswer;
    @XmlElement(name = "SA8201_Srt_Tm_4_Dig_Yr_CD_Cs_Fl")
    protected String sa8201SrtTm4DigYrCDCsFl;
    @XmlElement(name = "SA8202_Intraswitch_CDR_COS")
    protected String sa8202IntraswitchCDRCOS;
    @XmlElement(name = "SA8211_Prime_Apprnc_Prfrnc")
    protected String sa8211PrimeApprncPrfrnc;
    @XmlElement(name = "SA8240_Station_Usr_Adm_FBI")
    protected String sa8240StationUsrAdmFBI;
    @XmlElement(name = "SA8312_Meet_Me_Paging")
    protected String sa8312MeetMePaging;
    @XmlElement(name = "SA8323_Idle_Call_Prfrnc_Dis")
    protected String sa8323IdleCallPrfrncDis;
    @XmlElement(name = "SA8339_PHSX_Station_Moblty")
    protected String sa8339PHSXStationMoblty;
    @XmlElement(name = "SA8348_Map_NCID_Uvrsl_Cal_ID")
    protected String sa8348MapNCIDUvrslCalID;
    @XmlElement(name = "SA8428_Stat_Usr_But_Rng_Cntl")
    protected String sa8428StatUsrButRngCntl;
    @XmlElement(name = "SA8434_Dly_PSTN_Con_Agt_Ansr")
    protected String sa8434DlyPSTNConAgtAnsr;
    @XmlElement(name = "SA8439_Fwd_Held_Call_CPN")
    protected String sa8439FwdHeldCallCPN;
    @XmlElement(name = "SA8440_Unmodfd_QSIG_Rer_Num")
    protected String sa8440UnmodfdQSIGRerNum;
    @XmlElement(name = "SA8481_Rep_Cal_Prty_ASAI_ANI")
    protected String sa8481RepCalPrtyASAIANI;
    @XmlElement(name = "SA8500_Exp_UUI_Disp_Info")
    protected String sa8500ExpUUIDispInfo;
    @XmlElement(name = "SA8506_Altura_Inter_FIPN")
    protected String sa8506AlturaInterFIPN;
    @XmlElement(name = "SA7161_NORTSL1PRIDMSNaDi")
    protected String sa7161NORTSL1PRIDMSNaDi;
    @XmlElement(name = "SA8507_H245_Sup_Othr_Vendrs")
    protected String sa8507H245SupOthrVendrs;
    @XmlElement(name = "SA8508_Mult_Emrg_Acces_Code")
    protected String sa8508MultEmrgAccesCode;
    @XmlElement(name = "SA8510_NTT_Map_ISDN_CP_Sub_IE")
    protected String sa8510NTTMapISDNCPSubIE;
    @XmlElement(name = "SA8517_Auth_Code_By_COR")
    protected String sa8517AuthCodeByCOR;
    @XmlElement(name = "SA8518_Auto_Cl_BCll_Prty_Que")
    protected String sa8518AutoClBCllPrtyQue;
    @XmlElement(name = "SA8520_Hotel_Apl_IP_Trmnals")
    protected String sa8520HotelAplIPTrmnals;
    @XmlElement(name = "SA8558_Incr_Auto_MWIVu_Stat")
    protected String sa8558IncrAutoMWIVuStat;
    @XmlElement(name = "SA8567_PH_Sx_Stat_Mobil_IP")
    protected String sa8567PHSxStatMobilIP;
    @XmlElement(name = "SA8569_No_Srv_Obs_Tn_Herd_Agt")
    protected String sa8569NoSrvObsTnHerdAgt;
    @XmlElement(name = "SA8573_Clxfer_ASAI_CAS_Main")
    protected String sa8573ClxferASAICASMain;
    @XmlElement(name = "SA7291_TAAS_Pckp_During_Day")
    protected String sa7291TAASPckpDuringDay;
    @XmlElement(name = "SA8582_PSA_Loc_Disp_Enhance")
    protected String sa8582PSALocDispEnhance;
    @XmlElement(name = "SA8587_Netrkd_PSA_QSIG_Dvsn")
    protected String sa8587NetrkdPSAQSIGDvsn;
    @XmlElement(name = "SA8589_Background_BSR_Poll")
    protected String sa8589BackgroundBSRPoll;
    @XmlElement(name = "SA8601_Two_Dig_AUX_Reasn_Cod")
    protected String sa8601TwoDigAUXReasnCod;
    @XmlElement(name = "SA8621_SCH_Feature_Enhance")
    protected String sa8621SCHFeatureEnhance;
    @XmlElement(name = "SA8622_Enh_Call_Pickp_Alert")
    protected String sa8622EnhCallPickpAlert;
    @XmlElement(name = "SA8623_Chained_Call_Frward")
    protected String sa8623ChainedCallFrward;
    @XmlElement(name = "SA8661_Incr_Aut_oWakup_Call")
    protected String sa8661IncrAutOWakupCall;
    @XmlElement(name = "SA8662_Exp_PMS_Name_Number")
    protected String sa8662ExpPMSNameNumber;
    @XmlElement(name = "SA8684_PMS_Wakeup_Message")
    protected String sa8684PMSWakeupMessage;
    @XmlElement(name = "SA7311_CDR_Recrd_Ansr_Party")
    protected String sa7311CDRRecrdAnsrParty;
    @XmlElement(name = "SA7088_Call_Frd_Busy_DA")
    protected String sa7088CallFrdBusyDA;
    @XmlElement(name = "SA7088_Call_Forward_Ovrd")
    protected String sa7088CallForwardOvrd;
    @XmlElement(name = "SA7268_Prgrm_Grp_AD_List")
    protected String sa7268PrgrmGrpADList;
    @XmlElement(name = "SA7448_Auto_Excl_COS")
    protected String sa7448AutoExclCOS;
    @XmlElement(name = "SA7491_Exp_DS1_Crc_Pk_332_G3r")
    protected String sa7491ExpDS1CrcPk332G3R;
    @XmlElement(name = "SA7665_Astrla_ISDN_pb_Nt_MCT")
    protected String sa7665AstrlaISDNPbNtMCT;
    @XmlElement(name = "SA7710_Enh_Brg_Apr_Disply")
    protected String sa7710EnhBrgAprDisply;
    @XmlElement(name = "SA7948_80000_UDP_Ext_Rec_G3r")
    protected String sa794880000UDPExtRecG3R;
    @XmlElement(name = "SA7994_Icr_Sta_Ind_25000G3r")
    protected String sa7994IcrStaInd25000G3R;
    @XmlElement(name = "SA7409_a_Flash_Ansr_CW_Hold")
    protected String sa7409AFlashAnsrCWHold;
    @XmlElement(name = "SA8467_Incr_Cov_Pat_Rem_Co_Ps")
    protected String sa8467IncrCovPatRemCoPs;
    @XmlElement(name = "SA8475_Russian_SOSM")
    protected String sa8475RussianSOSM;
    @XmlElement(name = "SA8601_2_Dig_Aux_Reason_Code")
    protected String sa86012DigAuxReasonCode;
    @XmlElement(name = "SA8608_Inc_Crisis_Alert_Buttons")
    protected String sa8608IncCrisisAlertButtons;
    @XmlElement(name = "SA8693_Conn_Check_4_Direct_IP")
    protected String sa8693ConnCheck4DirectIP;
    @XmlElement(name = "SA8694_Enh_Redirect_Notif")
    protected String sa8694EnhRedirectNotif;
    @XmlElement(name = "SA8697_3rd_Party_H323_end")
    protected String sa86973RdPartyH323End;
    @XmlElement(name = "SA8702_CDR_Enh_4_Net")
    protected String sa8702CDREnh4Net;
    @XmlElement(name = "SA8744_Block_Name_4_Room")
    protected String sa8744BlockName4Room;
    @XmlElement(name = "SA8749_Inc_To_2000_Vectors")
    protected String sa8749IncTo2000Vectors;
    @XmlElement(name = "SA8758_Auto_Excl_Anolog_Brd")
    protected String sa8758AutoExclAnologBrd;
    @XmlElement(name = "SA7409_b_Cancel_ARS_Pound")
    protected String sa7409BCancelARSPound;
    @XmlElement(name = "SA9137_CTI_ECD_for_CC_Elite")
    protected String sa9137CTIECDForCCElite;
    @XmlElement(name = "Cvg_hold")
    protected String cvgHold;

    /**
     * password1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword1() {
        return password1;
    }

    /**
     * password1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword1(String value) {
        this.password1 = value;
    }

    /**
     * password2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * password2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword2(String value) {
        this.password2 = value;
    }

    /**
     * changeKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeKey() {
        return changeKey;
    }

    /**
     * changeKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeKey(String value) {
        this.changeKey = value;
    }

    /**
     * reenterKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReenterKey() {
        return reenterKey;
    }

    /**
     * reenterKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReenterKey(String value) {
        this.reenterKey = value;
    }

    /**
     * sa7474CoverItrnlNitSer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7474CoverItrnlNitSer() {
        return sa7474CoverItrnlNitSer;
    }

    /**
     * sa7474CoverItrnlNitSer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7474CoverItrnlNitSer(String value) {
        this.sa7474CoverItrnlNitSer = value;
    }

    /**
     * sa7483EnhaEmergAlert 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7483EnhaEmergAlert() {
        return sa7483EnhaEmergAlert;
    }

    /**
     * sa7483EnhaEmergAlert 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7483EnhaEmergAlert(String value) {
        this.sa7483EnhaEmergAlert = value;
    }

    /**
     * sa7487CovExtTrkHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7487CovExtTrkHold() {
        return sa7487CovExtTrkHold;
    }

    /**
     * sa7487CovExtTrkHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7487CovExtTrkHold(String value) {
        this.sa7487CovExtTrkHold = value;
    }

    /**
     * sa7578IntDirServDCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7578IntDirServDCS() {
        return sa7578IntDirServDCS;
    }

    /**
     * sa7578IntDirServDCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7578IntDirServDCS(String value) {
        this.sa7578IntDirServDCS = value;
    }

    /**
     * sa7666COSConfToneCheck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7666COSConfToneCheck() {
        return sa7666COSConfToneCheck;
    }

    /**
     * sa7666COSConfToneCheck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7666COSConfToneCheck(String value) {
        this.sa7666COSConfToneCheck = value;
    }

    /**
     * sa7710EnhDispRedirCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7710EnhDispRedirCalls() {
        return sa7710EnhDispRedirCalls;
    }

    /**
     * sa7710EnhDispRedirCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7710EnhDispRedirCalls(String value) {
        this.sa7710EnhDispRedirCalls = value;
    }

    /**
     * sa7776DisIncDigISDNiTrGr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7776DisIncDigISDNiTrGr() {
        return sa7776DisIncDigISDNiTrGr;
    }

    /**
     * sa7776DisIncDigISDNiTrGr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7776DisIncDigISDNiTrGr(String value) {
        this.sa7776DisIncDigISDNiTrGr = value;
    }

    /**
     * sa7777NightServDIDTrGrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7777NightServDIDTrGrp() {
        return sa7777NightServDIDTrGrp;
    }

    /**
     * sa7777NightServDIDTrGrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7777NightServDIDTrGrp(String value) {
        this.sa7777NightServDIDTrGrp = value;
    }

    /**
     * sa7778DisplayUUIInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7778DisplayUUIInfo() {
        return sa7778DisplayUUIInfo;
    }

    /**
     * sa7778DisplayUUIInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7778DisplayUUIInfo(String value) {
        this.sa7778DisplayUUIInfo = value;
    }

    /**
     * sa7779EnhancDIDRouting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7779EnhancDIDRouting() {
        return sa7779EnhancDIDRouting;
    }

    /**
     * sa7779EnhancDIDRouting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7779EnhancDIDRouting(String value) {
        this.sa7779EnhancDIDRouting = value;
    }

    /**
     * sa7852PoundStarVecCoStp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7852PoundStarVecCoStp() {
        return sa7852PoundStarVecCoStp;
    }

    /**
     * sa7852PoundStarVecCoStp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7852PoundStarVecCoStp(String value) {
        this.sa7852PoundStarVecCoStp = value;
    }

    /**
     * sa7880ASAIIntrnMsrData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7880ASAIIntrnMsrData() {
        return sa7880ASAIIntrnMsrData;
    }

    /**
     * sa7880ASAIIntrnMsrData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7880ASAIIntrnMsrData(String value) {
        this.sa7880ASAIIntrnMsrData = value;
    }

    /**
     * sa7900SerObsrvPhysSet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7900SerObsrvPhysSet() {
        return sa7900SerObsrvPhysSet;
    }

    /**
     * sa7900SerObsrvPhysSet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7900SerObsrvPhysSet(String value) {
        this.sa7900SerObsrvPhysSet = value;
    }

    /**
     * sa7933BsyTnSACNoAvlCgPo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7933BsyTnSACNoAvlCgPo() {
        return sa7933BsyTnSACNoAvlCgPo;
    }

    /**
     * sa7933BsyTnSACNoAvlCgPo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7933BsyTnSACNoAvlCgPo(String value) {
        this.sa7933BsyTnSACNoAvlCgPo = value;
    }

    /**
     * sa7963DialByName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7963DialByName() {
        return sa7963DialByName;
    }

    /**
     * sa7963DialByName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7963DialByName(String value) {
        this.sa7963DialByName = value;
    }

    /**
     * sa7991VarLenAccountCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7991VarLenAccountCode() {
        return sa7991VarLenAccountCode;
    }

    /**
     * sa7991VarLenAccountCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7991VarLenAccountCode(String value) {
        this.sa7991VarLenAccountCode = value;
    }

    /**
     * sa8052ISDNRedirctNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8052ISDNRedirctNumber() {
        return sa8052ISDNRedirctNumber;
    }

    /**
     * sa8052ISDNRedirctNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8052ISDNRedirctNumber(String value) {
        this.sa8052ISDNRedirctNumber = value;
    }

    /**
     * sa8077RussianPwrInryFea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8077RussianPwrInryFea() {
        return sa8077RussianPwrInryFea;
    }

    /**
     * sa8077RussianPwrInryFea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8077RussianPwrInryFea(String value) {
        this.sa8077RussianPwrInryFea = value;
    }

    /**
     * sa8122QSIGCPCConvCdSet5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8122QSIGCPCConvCdSet5() {
        return sa8122QSIGCPCConvCdSet5;
    }

    /**
     * sa8122QSIGCPCConvCdSet5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8122QSIGCPCConvCdSet5(String value) {
        this.sa8122QSIGCPCConvCdSet5 = value;
    }

    /**
     * sa8140AttDialzeroRedrct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8140AttDialzeroRedrct() {
        return sa8140AttDialzeroRedrct;
    }

    /**
     * sa8140AttDialzeroRedrct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8140AttDialzeroRedrct(String value) {
        this.sa8140AttDialzeroRedrct = value;
    }

    /**
     * sa8141LDNAttdtQuePrioty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8141LDNAttdtQuePrioty() {
        return sa8141LDNAttdtQuePrioty;
    }

    /**
     * sa8141LDNAttdtQuePrioty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8141LDNAttdtQuePrioty(String value) {
        this.sa8141LDNAttdtQuePrioty = value;
    }

    /**
     * sa8143OmitDsgntdExtDisp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8143OmitDsgntdExtDisp() {
        return sa8143OmitDsgntdExtDisp;
    }

    /**
     * sa8143OmitDsgntdExtDisp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8143OmitDsgntdExtDisp(String value) {
        this.sa8143OmitDsgntdExtDisp = value;
    }

    /**
     * sa8146DispUpdtRedrCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8146DispUpdtRedrCalls() {
        return sa8146DispUpdtRedrCalls;
    }

    /**
     * sa8146DispUpdtRedrCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8146DispUpdtRedrCalls(String value) {
        this.sa8146DispUpdtRedrCalls = value;
    }

    /**
     * sa8156AttPriorityQueCOR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8156AttPriorityQueCOR() {
        return sa8156AttPriorityQueCOR;
    }

    /**
     * sa8156AttPriorityQueCOR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8156AttPriorityQueCOR(String value) {
        this.sa8156AttPriorityQueCOR = value;
    }

    /**
     * sa8157TollFreeVecAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8157TollFreeVecAnswer() {
        return sa8157TollFreeVecAnswer;
    }

    /**
     * sa8157TollFreeVecAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8157TollFreeVecAnswer(String value) {
        this.sa8157TollFreeVecAnswer = value;
    }

    /**
     * sa8201SrtTm4DigYrCDCsFl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8201SrtTm4DigYrCDCsFl() {
        return sa8201SrtTm4DigYrCDCsFl;
    }

    /**
     * sa8201SrtTm4DigYrCDCsFl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8201SrtTm4DigYrCDCsFl(String value) {
        this.sa8201SrtTm4DigYrCDCsFl = value;
    }

    /**
     * sa8202IntraswitchCDRCOS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8202IntraswitchCDRCOS() {
        return sa8202IntraswitchCDRCOS;
    }

    /**
     * sa8202IntraswitchCDRCOS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8202IntraswitchCDRCOS(String value) {
        this.sa8202IntraswitchCDRCOS = value;
    }

    /**
     * sa8211PrimeApprncPrfrnc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8211PrimeApprncPrfrnc() {
        return sa8211PrimeApprncPrfrnc;
    }

    /**
     * sa8211PrimeApprncPrfrnc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8211PrimeApprncPrfrnc(String value) {
        this.sa8211PrimeApprncPrfrnc = value;
    }

    /**
     * sa8240StationUsrAdmFBI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8240StationUsrAdmFBI() {
        return sa8240StationUsrAdmFBI;
    }

    /**
     * sa8240StationUsrAdmFBI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8240StationUsrAdmFBI(String value) {
        this.sa8240StationUsrAdmFBI = value;
    }

    /**
     * sa8312MeetMePaging 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8312MeetMePaging() {
        return sa8312MeetMePaging;
    }

    /**
     * sa8312MeetMePaging 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8312MeetMePaging(String value) {
        this.sa8312MeetMePaging = value;
    }

    /**
     * sa8323IdleCallPrfrncDis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8323IdleCallPrfrncDis() {
        return sa8323IdleCallPrfrncDis;
    }

    /**
     * sa8323IdleCallPrfrncDis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8323IdleCallPrfrncDis(String value) {
        this.sa8323IdleCallPrfrncDis = value;
    }

    /**
     * sa8339PHSXStationMoblty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8339PHSXStationMoblty() {
        return sa8339PHSXStationMoblty;
    }

    /**
     * sa8339PHSXStationMoblty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8339PHSXStationMoblty(String value) {
        this.sa8339PHSXStationMoblty = value;
    }

    /**
     * sa8348MapNCIDUvrslCalID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8348MapNCIDUvrslCalID() {
        return sa8348MapNCIDUvrslCalID;
    }

    /**
     * sa8348MapNCIDUvrslCalID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8348MapNCIDUvrslCalID(String value) {
        this.sa8348MapNCIDUvrslCalID = value;
    }

    /**
     * sa8428StatUsrButRngCntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8428StatUsrButRngCntl() {
        return sa8428StatUsrButRngCntl;
    }

    /**
     * sa8428StatUsrButRngCntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8428StatUsrButRngCntl(String value) {
        this.sa8428StatUsrButRngCntl = value;
    }

    /**
     * sa8434DlyPSTNConAgtAnsr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8434DlyPSTNConAgtAnsr() {
        return sa8434DlyPSTNConAgtAnsr;
    }

    /**
     * sa8434DlyPSTNConAgtAnsr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8434DlyPSTNConAgtAnsr(String value) {
        this.sa8434DlyPSTNConAgtAnsr = value;
    }

    /**
     * sa8439FwdHeldCallCPN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8439FwdHeldCallCPN() {
        return sa8439FwdHeldCallCPN;
    }

    /**
     * sa8439FwdHeldCallCPN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8439FwdHeldCallCPN(String value) {
        this.sa8439FwdHeldCallCPN = value;
    }

    /**
     * sa8440UnmodfdQSIGRerNum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8440UnmodfdQSIGRerNum() {
        return sa8440UnmodfdQSIGRerNum;
    }

    /**
     * sa8440UnmodfdQSIGRerNum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8440UnmodfdQSIGRerNum(String value) {
        this.sa8440UnmodfdQSIGRerNum = value;
    }

    /**
     * sa8481RepCalPrtyASAIANI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8481RepCalPrtyASAIANI() {
        return sa8481RepCalPrtyASAIANI;
    }

    /**
     * sa8481RepCalPrtyASAIANI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8481RepCalPrtyASAIANI(String value) {
        this.sa8481RepCalPrtyASAIANI = value;
    }

    /**
     * sa8500ExpUUIDispInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8500ExpUUIDispInfo() {
        return sa8500ExpUUIDispInfo;
    }

    /**
     * sa8500ExpUUIDispInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8500ExpUUIDispInfo(String value) {
        this.sa8500ExpUUIDispInfo = value;
    }

    /**
     * sa8506AlturaInterFIPN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8506AlturaInterFIPN() {
        return sa8506AlturaInterFIPN;
    }

    /**
     * sa8506AlturaInterFIPN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8506AlturaInterFIPN(String value) {
        this.sa8506AlturaInterFIPN = value;
    }

    /**
     * sa7161NORTSL1PRIDMSNaDi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7161NORTSL1PRIDMSNaDi() {
        return sa7161NORTSL1PRIDMSNaDi;
    }

    /**
     * sa7161NORTSL1PRIDMSNaDi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7161NORTSL1PRIDMSNaDi(String value) {
        this.sa7161NORTSL1PRIDMSNaDi = value;
    }

    /**
     * sa8507H245SupOthrVendrs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8507H245SupOthrVendrs() {
        return sa8507H245SupOthrVendrs;
    }

    /**
     * sa8507H245SupOthrVendrs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8507H245SupOthrVendrs(String value) {
        this.sa8507H245SupOthrVendrs = value;
    }

    /**
     * sa8508MultEmrgAccesCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8508MultEmrgAccesCode() {
        return sa8508MultEmrgAccesCode;
    }

    /**
     * sa8508MultEmrgAccesCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8508MultEmrgAccesCode(String value) {
        this.sa8508MultEmrgAccesCode = value;
    }

    /**
     * sa8510NTTMapISDNCPSubIE 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8510NTTMapISDNCPSubIE() {
        return sa8510NTTMapISDNCPSubIE;
    }

    /**
     * sa8510NTTMapISDNCPSubIE 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8510NTTMapISDNCPSubIE(String value) {
        this.sa8510NTTMapISDNCPSubIE = value;
    }

    /**
     * sa8517AuthCodeByCOR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8517AuthCodeByCOR() {
        return sa8517AuthCodeByCOR;
    }

    /**
     * sa8517AuthCodeByCOR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8517AuthCodeByCOR(String value) {
        this.sa8517AuthCodeByCOR = value;
    }

    /**
     * sa8518AutoClBCllPrtyQue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8518AutoClBCllPrtyQue() {
        return sa8518AutoClBCllPrtyQue;
    }

    /**
     * sa8518AutoClBCllPrtyQue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8518AutoClBCllPrtyQue(String value) {
        this.sa8518AutoClBCllPrtyQue = value;
    }

    /**
     * sa8520HotelAplIPTrmnals 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8520HotelAplIPTrmnals() {
        return sa8520HotelAplIPTrmnals;
    }

    /**
     * sa8520HotelAplIPTrmnals 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8520HotelAplIPTrmnals(String value) {
        this.sa8520HotelAplIPTrmnals = value;
    }

    /**
     * sa8558IncrAutoMWIVuStat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8558IncrAutoMWIVuStat() {
        return sa8558IncrAutoMWIVuStat;
    }

    /**
     * sa8558IncrAutoMWIVuStat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8558IncrAutoMWIVuStat(String value) {
        this.sa8558IncrAutoMWIVuStat = value;
    }

    /**
     * sa8567PHSxStatMobilIP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8567PHSxStatMobilIP() {
        return sa8567PHSxStatMobilIP;
    }

    /**
     * sa8567PHSxStatMobilIP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8567PHSxStatMobilIP(String value) {
        this.sa8567PHSxStatMobilIP = value;
    }

    /**
     * sa8569NoSrvObsTnHerdAgt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8569NoSrvObsTnHerdAgt() {
        return sa8569NoSrvObsTnHerdAgt;
    }

    /**
     * sa8569NoSrvObsTnHerdAgt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8569NoSrvObsTnHerdAgt(String value) {
        this.sa8569NoSrvObsTnHerdAgt = value;
    }

    /**
     * sa8573ClxferASAICASMain 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8573ClxferASAICASMain() {
        return sa8573ClxferASAICASMain;
    }

    /**
     * sa8573ClxferASAICASMain 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8573ClxferASAICASMain(String value) {
        this.sa8573ClxferASAICASMain = value;
    }

    /**
     * sa7291TAASPckpDuringDay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7291TAASPckpDuringDay() {
        return sa7291TAASPckpDuringDay;
    }

    /**
     * sa7291TAASPckpDuringDay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7291TAASPckpDuringDay(String value) {
        this.sa7291TAASPckpDuringDay = value;
    }

    /**
     * sa8582PSALocDispEnhance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8582PSALocDispEnhance() {
        return sa8582PSALocDispEnhance;
    }

    /**
     * sa8582PSALocDispEnhance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8582PSALocDispEnhance(String value) {
        this.sa8582PSALocDispEnhance = value;
    }

    /**
     * sa8587NetrkdPSAQSIGDvsn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8587NetrkdPSAQSIGDvsn() {
        return sa8587NetrkdPSAQSIGDvsn;
    }

    /**
     * sa8587NetrkdPSAQSIGDvsn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8587NetrkdPSAQSIGDvsn(String value) {
        this.sa8587NetrkdPSAQSIGDvsn = value;
    }

    /**
     * sa8589BackgroundBSRPoll 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8589BackgroundBSRPoll() {
        return sa8589BackgroundBSRPoll;
    }

    /**
     * sa8589BackgroundBSRPoll 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8589BackgroundBSRPoll(String value) {
        this.sa8589BackgroundBSRPoll = value;
    }

    /**
     * sa8601TwoDigAUXReasnCod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8601TwoDigAUXReasnCod() {
        return sa8601TwoDigAUXReasnCod;
    }

    /**
     * sa8601TwoDigAUXReasnCod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8601TwoDigAUXReasnCod(String value) {
        this.sa8601TwoDigAUXReasnCod = value;
    }

    /**
     * sa8621SCHFeatureEnhance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8621SCHFeatureEnhance() {
        return sa8621SCHFeatureEnhance;
    }

    /**
     * sa8621SCHFeatureEnhance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8621SCHFeatureEnhance(String value) {
        this.sa8621SCHFeatureEnhance = value;
    }

    /**
     * sa8622EnhCallPickpAlert 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8622EnhCallPickpAlert() {
        return sa8622EnhCallPickpAlert;
    }

    /**
     * sa8622EnhCallPickpAlert 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8622EnhCallPickpAlert(String value) {
        this.sa8622EnhCallPickpAlert = value;
    }

    /**
     * sa8623ChainedCallFrward 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8623ChainedCallFrward() {
        return sa8623ChainedCallFrward;
    }

    /**
     * sa8623ChainedCallFrward 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8623ChainedCallFrward(String value) {
        this.sa8623ChainedCallFrward = value;
    }

    /**
     * sa8661IncrAutOWakupCall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8661IncrAutOWakupCall() {
        return sa8661IncrAutOWakupCall;
    }

    /**
     * sa8661IncrAutOWakupCall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8661IncrAutOWakupCall(String value) {
        this.sa8661IncrAutOWakupCall = value;
    }

    /**
     * sa8662ExpPMSNameNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8662ExpPMSNameNumber() {
        return sa8662ExpPMSNameNumber;
    }

    /**
     * sa8662ExpPMSNameNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8662ExpPMSNameNumber(String value) {
        this.sa8662ExpPMSNameNumber = value;
    }

    /**
     * sa8684PMSWakeupMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8684PMSWakeupMessage() {
        return sa8684PMSWakeupMessage;
    }

    /**
     * sa8684PMSWakeupMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8684PMSWakeupMessage(String value) {
        this.sa8684PMSWakeupMessage = value;
    }

    /**
     * sa7311CDRRecrdAnsrParty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7311CDRRecrdAnsrParty() {
        return sa7311CDRRecrdAnsrParty;
    }

    /**
     * sa7311CDRRecrdAnsrParty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7311CDRRecrdAnsrParty(String value) {
        this.sa7311CDRRecrdAnsrParty = value;
    }

    /**
     * sa7088CallFrdBusyDA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7088CallFrdBusyDA() {
        return sa7088CallFrdBusyDA;
    }

    /**
     * sa7088CallFrdBusyDA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7088CallFrdBusyDA(String value) {
        this.sa7088CallFrdBusyDA = value;
    }

    /**
     * sa7088CallForwardOvrd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7088CallForwardOvrd() {
        return sa7088CallForwardOvrd;
    }

    /**
     * sa7088CallForwardOvrd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7088CallForwardOvrd(String value) {
        this.sa7088CallForwardOvrd = value;
    }

    /**
     * sa7268PrgrmGrpADList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7268PrgrmGrpADList() {
        return sa7268PrgrmGrpADList;
    }

    /**
     * sa7268PrgrmGrpADList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7268PrgrmGrpADList(String value) {
        this.sa7268PrgrmGrpADList = value;
    }

    /**
     * sa7448AutoExclCOS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7448AutoExclCOS() {
        return sa7448AutoExclCOS;
    }

    /**
     * sa7448AutoExclCOS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7448AutoExclCOS(String value) {
        this.sa7448AutoExclCOS = value;
    }

    /**
     * sa7491ExpDS1CrcPk332G3R 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7491ExpDS1CrcPk332G3R() {
        return sa7491ExpDS1CrcPk332G3R;
    }

    /**
     * sa7491ExpDS1CrcPk332G3R 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7491ExpDS1CrcPk332G3R(String value) {
        this.sa7491ExpDS1CrcPk332G3R = value;
    }

    /**
     * sa7665AstrlaISDNPbNtMCT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7665AstrlaISDNPbNtMCT() {
        return sa7665AstrlaISDNPbNtMCT;
    }

    /**
     * sa7665AstrlaISDNPbNtMCT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7665AstrlaISDNPbNtMCT(String value) {
        this.sa7665AstrlaISDNPbNtMCT = value;
    }

    /**
     * sa7710EnhBrgAprDisply 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7710EnhBrgAprDisply() {
        return sa7710EnhBrgAprDisply;
    }

    /**
     * sa7710EnhBrgAprDisply 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7710EnhBrgAprDisply(String value) {
        this.sa7710EnhBrgAprDisply = value;
    }

    /**
     * sa794880000UDPExtRecG3R 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA794880000UDPExtRecG3R() {
        return sa794880000UDPExtRecG3R;
    }

    /**
     * sa794880000UDPExtRecG3R 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA794880000UDPExtRecG3R(String value) {
        this.sa794880000UDPExtRecG3R = value;
    }

    /**
     * sa7994IcrStaInd25000G3R 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7994IcrStaInd25000G3R() {
        return sa7994IcrStaInd25000G3R;
    }

    /**
     * sa7994IcrStaInd25000G3R 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7994IcrStaInd25000G3R(String value) {
        this.sa7994IcrStaInd25000G3R = value;
    }

    /**
     * sa7409AFlashAnsrCWHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7409AFlashAnsrCWHold() {
        return sa7409AFlashAnsrCWHold;
    }

    /**
     * sa7409AFlashAnsrCWHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7409AFlashAnsrCWHold(String value) {
        this.sa7409AFlashAnsrCWHold = value;
    }

    /**
     * sa8467IncrCovPatRemCoPs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8467IncrCovPatRemCoPs() {
        return sa8467IncrCovPatRemCoPs;
    }

    /**
     * sa8467IncrCovPatRemCoPs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8467IncrCovPatRemCoPs(String value) {
        this.sa8467IncrCovPatRemCoPs = value;
    }

    /**
     * sa8475RussianSOSM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8475RussianSOSM() {
        return sa8475RussianSOSM;
    }

    /**
     * sa8475RussianSOSM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8475RussianSOSM(String value) {
        this.sa8475RussianSOSM = value;
    }

    /**
     * sa86012DigAuxReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA86012DigAuxReasonCode() {
        return sa86012DigAuxReasonCode;
    }

    /**
     * sa86012DigAuxReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA86012DigAuxReasonCode(String value) {
        this.sa86012DigAuxReasonCode = value;
    }

    /**
     * sa8608IncCrisisAlertButtons 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8608IncCrisisAlertButtons() {
        return sa8608IncCrisisAlertButtons;
    }

    /**
     * sa8608IncCrisisAlertButtons 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8608IncCrisisAlertButtons(String value) {
        this.sa8608IncCrisisAlertButtons = value;
    }

    /**
     * sa8693ConnCheck4DirectIP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8693ConnCheck4DirectIP() {
        return sa8693ConnCheck4DirectIP;
    }

    /**
     * sa8693ConnCheck4DirectIP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8693ConnCheck4DirectIP(String value) {
        this.sa8693ConnCheck4DirectIP = value;
    }

    /**
     * sa8694EnhRedirectNotif 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8694EnhRedirectNotif() {
        return sa8694EnhRedirectNotif;
    }

    /**
     * sa8694EnhRedirectNotif 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8694EnhRedirectNotif(String value) {
        this.sa8694EnhRedirectNotif = value;
    }

    /**
     * sa86973RdPartyH323End 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA86973RdPartyH323End() {
        return sa86973RdPartyH323End;
    }

    /**
     * sa86973RdPartyH323End 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA86973RdPartyH323End(String value) {
        this.sa86973RdPartyH323End = value;
    }

    /**
     * sa8702CDREnh4Net 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8702CDREnh4Net() {
        return sa8702CDREnh4Net;
    }

    /**
     * sa8702CDREnh4Net 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8702CDREnh4Net(String value) {
        this.sa8702CDREnh4Net = value;
    }

    /**
     * sa8744BlockName4Room 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8744BlockName4Room() {
        return sa8744BlockName4Room;
    }

    /**
     * sa8744BlockName4Room 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8744BlockName4Room(String value) {
        this.sa8744BlockName4Room = value;
    }

    /**
     * sa8749IncTo2000Vectors 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8749IncTo2000Vectors() {
        return sa8749IncTo2000Vectors;
    }

    /**
     * sa8749IncTo2000Vectors 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8749IncTo2000Vectors(String value) {
        this.sa8749IncTo2000Vectors = value;
    }

    /**
     * sa8758AutoExclAnologBrd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA8758AutoExclAnologBrd() {
        return sa8758AutoExclAnologBrd;
    }

    /**
     * sa8758AutoExclAnologBrd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA8758AutoExclAnologBrd(String value) {
        this.sa8758AutoExclAnologBrd = value;
    }

    /**
     * sa7409BCancelARSPound 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA7409BCancelARSPound() {
        return sa7409BCancelARSPound;
    }

    /**
     * sa7409BCancelARSPound 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA7409BCancelARSPound(String value) {
        this.sa7409BCancelARSPound = value;
    }

    /**
     * sa9137CTIECDForCCElite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA9137CTIECDForCCElite() {
        return sa9137CTIECDForCCElite;
    }

    /**
     * sa9137CTIECDForCCElite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA9137CTIECDForCCElite(String value) {
        this.sa9137CTIECDForCCElite = value;
    }

    /**
     * cvgHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvgHold() {
        return cvgHold;
    }

    /**
     * cvgHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvgHold(String value) {
        this.cvgHold = value;
    }

}
