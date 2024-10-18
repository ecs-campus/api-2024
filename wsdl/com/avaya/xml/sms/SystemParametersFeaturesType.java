
package com.avaya.xml.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SystemParametersFeaturesType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SystemParametersFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelfStaDispEnable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutCirAssurEnable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WithoutFlash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecDelayTimerMsec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApyRdyInTnPrtCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntApyPerAltTnSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequireSecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeNISDNTkGpNmCnNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisConNaNmISDNDCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeISDNTkGrNmeTndm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeCusMsgQSIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QSIGTSCExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbrDilPrgrmAsList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MWINoDigitsVMSubs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeaturePlusExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalCPNPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassPrfxCPNASAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unknNumItrnlAUDIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USNICallNaOutgCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PthRplacMeasrment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QSIGPthRplacExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PthRplacQueVector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtoAbrDelTranIntR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpnAniIclidRepRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpnAniIclidRepUna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntrnlAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnEnblcDlWoARSFAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PullTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutplsWithoutTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MisOperatnAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowConfviaFlash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VecDisconTimrMins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProCallerIDAnaTer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HearZpTnFollowVOA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdtTransRingPtrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaitAnswSuprTimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepeCallWaitingTn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntrTrtFailedTrTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaToneForDisconn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LevToneDetection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChgDispUpdtFrqSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateFormatOnTerminals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnHookDialingTerminals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisCallNoRRCalIDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItalanProtEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EASEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinAgtLogIDPwdLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectAgentAnnExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgWtLmpIndStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConFirstDataDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvSignalToneMs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromptTimeoutsecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterflwqposEWTTh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevStrPndDgtColSt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxMsgsPerStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailbleAgtAdjBSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondDataDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PauseMsec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerObsWarningTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalClsAfterAsrSup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendUCIDtoASAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIAAcrsSplitSkill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACWAgtsCnsdrdIdle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallSlectnMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServLvlSprClSelOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxExCallLogStati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoReserveAgents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpyASAIUUIConfTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuxWrkRsnCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoutRsnCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjunctCMSRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACDLgnIdentiLgth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMSVuStatLgnIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMSVuStatMsrtInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMSVuStatAbClTrS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VdBCMSVuStatLgnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgWaitIndExtCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClrVuStatsSftData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemIaBCMSVuStatAg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwHkQryRepnsTimeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutanrIPFailAxReC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAgtOccupPercen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAgtOccupAuxReC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoExclusionCOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoExclnCovrHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoExclnWhispPag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecallRotaryDigit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrnCallTmrDispSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirIpIpAudioConne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAudioHairpinnig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Retry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T2BckSigActnTirSe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProbtBrdgCalDtaPr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnhAbrDialLen34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecSubFailHisLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecPMSADTraHisLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecIPRegHisLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefMulOutTrParSel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTIEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTIState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTISecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOPstAsrFailRryLt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrunkTrunkTransf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConPwdQryTOutsecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOFailRtryItrlMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOOvrlFalreRryLim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusicToneonHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusicToneonHoldMu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCallsLocPr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCallsLocPr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCallsLocPr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCallsRemote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARemotePBXIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACAReferDestinati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACAShtHldTmOrgExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACALngHldTmOrgExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIsdnClBUrACASHTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpnAniPSADisedSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unnamed_Registrations_and_PSA_for_IP_Telephones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTerResDoNtDsA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTerResDoNtDsE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContOutResInrTrtA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContOutResInrTrtE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContStaStaRestricA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContStaStaRestricE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTollResIrtTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTollResIrtTrA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTollResIrtTrE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvldNumDldItrcTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Announcement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VMHuntGroupExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumDigLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepCallWaitInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyInrcptLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnforcePNTPNTRest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumbSessionwAllo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongestionTimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongnClearedTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignalingGroupLt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCSMessageFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Delay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClearCallrInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysParRingerOffwithAuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecCTAPSATTIHisLg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnhPSALocDisIfoEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoCallbNoAnTOIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefCORPSADissSets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTAEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResSlotAttPriQue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimebfrOffhookAlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergAccRedirExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergClsAldAttQue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallPickupAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TempBrgApcClPickU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallPickupIntrcmC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectedCallPckup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallPrkTOInterMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtGroupCallPckup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DxPagCalPkTimOrig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContOutResInrTrmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTerResDoNtDst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContStaStaRestric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthCodesEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthCodeLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthCodeCancelSym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtteTimeOutFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplAuthorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPmTnDctTOInSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContrTollResRepla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysPrinterEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinesPerPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmerExtForwMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwitchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyMCTWarnTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCTVoiceRecTrGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelSendRelSecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendAllCallsAppls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoInspectSACs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AARARSDialToneReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateUCID___" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UCIDNetworkNodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PblcNetTrkCnfCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CnfPrtPubNrkTrk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CnfPrtWoPubNrkTrk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NightSerDisTimeSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShrtInrdgtTimerSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UAnsDIDCalTmrSecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LnItrcptToneTmrSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LngHldRecTmerSecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusicSlnceTraTrnk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RstShftTmrSecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaCallTnsRclTrSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIDBusyTreatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvldNumDldItrcTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlAarArsAcDidDiod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlANIResAARARS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseTrCOROutTrDsct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumericDisplay7405ND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumericDisplay7434ND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMU_Inactivity_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIDTieISDNSIPInTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttendantTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BridgingTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConferenceTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntrusionTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialDialTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModeCodeInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntAtoAnAtdExtTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttOriginateCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTMFTeFbkSglVRUCn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbortTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransfrUponHangUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbtConfUponHangUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoHoldConfTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoDialToneConfrnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelLnApprConfrnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unhold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allow_Two_Observers_in_Same_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Level_Algorithm_for_SLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Externally_Controlled_Distribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ecd_Exception_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECD_Service_Route_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}SystemParametersFeaturesArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParametersFeaturesType", propOrder = {
    "selfStaDispEnable",
    "autCirAssurEnable",
    "withoutFlash",
    "recDelayTimerMsec",
    "apyRdyInTnPrtCall",
    "intApyPerAltTnSec",
    "requireSecCode",
    "seNISDNTkGpNmCnNm",
    "disConNaNmISDNDCS",
    "seISDNTkGrNmeTndm",
    "seCusMsgQSIG",
    "qsigtscExtension",
    "abrDilPrgrmAsList",
    "mwiNoDigitsVMSubs",
    "featurePlusExt",
    "nationalCPNPrefix",
    "passPrfxCPNASAI",
    "unknNumItrnlAUDIX",
    "usniCallNaOutgCal",
    "pthRplacMeasrment",
    "qsigPthRplacExt",
    "pthRplacQueVector",
    "atoAbrDelTranIntR",
    "cpnAniIclidRepRes",
    "cpnAniIclidRepUna",
    "localCountryCode",
    "intrnlAccessCode",
    "enEnblcDlWoARSFAC",
    "pullTransfer",
    "outplsWithoutTone",
    "misOperatnAlert",
    "allowConfviaFlash",
    "vecDisconTimrMins",
    "proCallerIDAnaTer",
    "hearZpTnFollowVOA",
    "updtTransRingPtrn",
    "waitAnswSuprTimer",
    "repeCallWaitingTn",
    "intrTrtFailedTrTr",
    "staToneForDisconn",
    "levToneDetection",
    "chgDispUpdtFrqSec",
    "dateFormatOnTerminals",
    "onHookDialingTerminals",
    "disCallNoRRCalIDC",
    "italanProtEnabled",
    "easEnabled",
    "minAgtLogIDPwdLen",
    "directAgentAnnExt",
    "msgWtLmpIndStatus",
    "conFirstDataDelay",
    "convSignalToneMs",
    "promptTimeoutsecs",
    "interflwqposEWTTh",
    "revStrPndDgtColSt",
    "maxMsgsPerStation",
    "availbleAgtAdjBSR",
    "secondDataDelay",
    "pauseMsec",
    "serObsWarningTone",
    "calClsAfterAsrSup",
    "sendUCIDtoASAI",
    "miaAcrsSplitSkill",
    "acwAgtsCnsdrdIdle",
    "callSlectnMeasure",
    "servLvlSprClSelOv",
    "maxExCallLogStati",
    "autoReserveAgents",
    "cpyASAIUUIConfTra",
    "auxWrkRsnCodeType",
    "logoutRsnCodeType",
    "adjunctCMSRelease",
    "acdLgnIdentiLgth",
    "bcmsVuStatLgnIDs",
    "bcmsVuStatMsrtInt",
    "bcmsVuStatAbClTrS",
    "vdBCMSVuStatLgnID",
    "msgWaitIndExtCall",
    "clrVuStatsSftData",
    "remIaBCMSVuStatAg",
    "swHkQryRepnsTimeo",
    "autanrIPFailAxReC",
    "maxAgtOccupPercen",
    "maxAgtOccupAuxReC",
    "autoExclusionCOS",
    "autoExclnCovrHold",
    "autoExclnWhispPag",
    "recallRotaryDigit",
    "drnCallTmrDispSec",
    "dirIpIpAudioConne",
    "ipAudioHairpinnig",
    "retry",
    "t2BckSigActnTirSe",
    "probtBrdgCalDtaPr",
    "enhAbrDialLen34",
    "recSubFailHisLog",
    "recPMSADTraHisLog",
    "recIPRegHisLog",
    "defMulOutTrParSel",
    "ttiEnabled",
    "ttiState",
    "ttiSecurityCode",
    "doPstAsrFailRryLt",
    "trunkTrunkTransf",
    "conPwdQryTOutsecs",
    "doFailRtryItrlMin",
    "doOvrlFalreRryLim",
    "musicToneonHold",
    "musicToneonHoldMu",
    "port",
    "acaRefCalls",
    "acaRefCallsLocPr1",
    "acaRefCallsLocPr2",
    "acaRefCallsLocPr3",
    "acaRefCallsRemote",
    "acaRemotePBXIdent",
    "acaReferDestinati",
    "acaShtHldTmOrgExt",
    "acaLngHldTmOrgExt",
    "tIsdnClBUrACASHTC",
    "cpnAniPSADisedSet",
    "unnamedRegistrationsAndPSAForIPTelephones",
    "contTerResDoNtDsA",
    "contTerResDoNtDsE",
    "contOutResInrTrtA",
    "contOutResInrTrtE",
    "contStaStaRestricA",
    "contStaStaRestricE",
    "contTollResIrtTr",
    "contTollResIrtTrA",
    "contTollResIrtTrE",
    "invldNumDldItrcTA",
    "announcement",
    "vmHuntGroupExt",
    "maximumLength",
    "minimumDigLength",
    "repCallWaitInterv",
    "applyInrcptLocal",
    "enforcePNTPNTRest",
    "numbSessionwAllo",
    "congestionTimer",
    "sessTimeout",
    "congnClearedTr",
    "signalingGroupLt",
    "dcsMessageFormat",
    "delay",
    "clearCallrInfo",
    "sysParRingerOffwithAuto",
    "recCTAPSATTIHisLg",
    "enhPSALocDisIfoEn",
    "autoCallbNoAnTOIn",
    "defCORPSADissSets",
    "ctaEnabled",
    "resSlotAttPriQue",
    "timebfrOffhookAlt",
    "emergAccRedirExt",
    "emergClsAldAttQue",
    "callPickupAlert",
    "tempBrgApcClPickU",
    "callPickupIntrcmC",
    "directedCallPckup",
    "callPrkTOInterMin",
    "extGroupCallPckup",
    "dxPagCalPkTimOrig",
    "contOutResInrTrmt",
    "contTerResDoNtDst",
    "contStaStaRestric",
    "authCodesEnabled",
    "authCodeLength",
    "authCodeCancelSym",
    "atteTimeOutFlag",
    "displAuthorCode",
    "offPmTnDctTOInSec",
    "contrTollResRepla",
    "sysPrinterEndpoint",
    "linesPerPage",
    "emerExtForwMin",
    "switchName",
    "applyMCTWarnTone",
    "mctVoiceRecTrGrp",
    "delSendRelSecs",
    "sendAllCallsAppls",
    "autoInspectSACs",
    "aararsDialToneReq",
    "createUCID",
    "ucidNetworkNodeID",
    "pblcNetTrkCnfCall",
    "cnfPrtPubNrkTrk",
    "cnfPrtWoPubNrkTrk",
    "nightSerDisTimeSc",
    "shrtInrdgtTimerSc",
    "uAnsDIDCalTmrSecs",
    "lnItrcptToneTmrSc",
    "lngHldRecTmerSecs",
    "musicSlnceTraTrnk",
    "rstShftTmrSecs",
    "staCallTnsRclTrSc",
    "didBusyTreatment",
    "invldNumDldItrcTr",
    "alAarArsAcDidDiod",
    "alANIResAARARS",
    "useTrCOROutTrDsct",
    "numericDisplay7405ND",
    "numericDisplay7434ND",
    "autoStart",
    "autoHold",
    "emuInactivityInterval",
    "didTieISDNSIPInTr",
    "attendantTone",
    "bridgingTone",
    "conferenceTone",
    "intrusionTone",
    "specialDialTone",
    "modeCodeInterface",
    "internal",
    "external",
    "priority",
    "intAtoAnAtdExtTra",
    "attOriginateCalls",
    "dtmfTeFbkSglVRUCn",
    "disconnection",
    "abortTransfer",
    "transfrUponHangUp",
    "abtConfUponHangUp",
    "noHoldConfTimeout",
    "noDialToneConfrnc",
    "selLnApprConfrnc",
    "unhold",
    "allowTwoObserversInSameCall",
    "serviceLevelAlgorithmForSLM",
    "externallyControlledDistribution",
    "ecdExceptionTimer",
    "ecdServiceRouteTimer",
    "stationSysWRetPn1",
    "rdoCoDownlServPn1",
    "dcsMessageFormat1"
})
public class SystemParametersFeaturesType {

    @XmlElement(name = "SelfStaDispEnable")
    protected String selfStaDispEnable;
    @XmlElement(name = "AutCirAssurEnable")
    protected String autCirAssurEnable;
    @XmlElement(name = "WithoutFlash")
    protected String withoutFlash;
    @XmlElement(name = "RecDelayTimerMsec")
    protected String recDelayTimerMsec;
    @XmlElement(name = "ApyRdyInTnPrtCall")
    protected String apyRdyInTnPrtCall;
    @XmlElement(name = "IntApyPerAltTnSec")
    protected String intApyPerAltTnSec;
    @XmlElement(name = "RequireSecCode")
    protected String requireSecCode;
    @XmlElement(name = "SeNISDNTkGpNmCnNm")
    protected String seNISDNTkGpNmCnNm;
    @XmlElement(name = "DisConNaNmISDNDCS")
    protected String disConNaNmISDNDCS;
    @XmlElement(name = "SeISDNTkGrNmeTndm")
    protected String seISDNTkGrNmeTndm;
    @XmlElement(name = "SeCusMsgQSIG")
    protected String seCusMsgQSIG;
    @XmlElement(name = "QSIGTSCExtension")
    protected String qsigtscExtension;
    @XmlElement(name = "AbrDilPrgrmAsList")
    protected String abrDilPrgrmAsList;
    @XmlElement(name = "MWINoDigitsVMSubs")
    protected String mwiNoDigitsVMSubs;
    @XmlElement(name = "FeaturePlusExt")
    protected String featurePlusExt;
    @XmlElement(name = "NationalCPNPrefix")
    protected String nationalCPNPrefix;
    @XmlElement(name = "PassPrfxCPNASAI")
    protected String passPrfxCPNASAI;
    protected String unknNumItrnlAUDIX;
    @XmlElement(name = "USNICallNaOutgCal")
    protected String usniCallNaOutgCal;
    @XmlElement(name = "PthRplacMeasrment")
    protected String pthRplacMeasrment;
    @XmlElement(name = "QSIGPthRplacExt")
    protected String qsigPthRplacExt;
    @XmlElement(name = "PthRplacQueVector")
    protected String pthRplacQueVector;
    @XmlElement(name = "AtoAbrDelTranIntR")
    protected String atoAbrDelTranIntR;
    @XmlElement(name = "CpnAniIclidRepRes")
    protected String cpnAniIclidRepRes;
    @XmlElement(name = "CpnAniIclidRepUna")
    protected String cpnAniIclidRepUna;
    @XmlElement(name = "LocalCountryCode")
    protected String localCountryCode;
    @XmlElement(name = "IntrnlAccessCode")
    protected String intrnlAccessCode;
    @XmlElement(name = "EnEnblcDlWoARSFAC")
    protected String enEnblcDlWoARSFAC;
    @XmlElement(name = "PullTransfer")
    protected String pullTransfer;
    @XmlElement(name = "OutplsWithoutTone")
    protected String outplsWithoutTone;
    @XmlElement(name = "MisOperatnAlert")
    protected String misOperatnAlert;
    @XmlElement(name = "AllowConfviaFlash")
    protected String allowConfviaFlash;
    @XmlElement(name = "VecDisconTimrMins")
    protected String vecDisconTimrMins;
    @XmlElement(name = "ProCallerIDAnaTer")
    protected String proCallerIDAnaTer;
    @XmlElement(name = "HearZpTnFollowVOA")
    protected String hearZpTnFollowVOA;
    @XmlElement(name = "UpdtTransRingPtrn")
    protected String updtTransRingPtrn;
    @XmlElement(name = "WaitAnswSuprTimer")
    protected String waitAnswSuprTimer;
    @XmlElement(name = "RepeCallWaitingTn")
    protected String repeCallWaitingTn;
    @XmlElement(name = "IntrTrtFailedTrTr")
    protected String intrTrtFailedTrTr;
    @XmlElement(name = "StaToneForDisconn")
    protected String staToneForDisconn;
    @XmlElement(name = "LevToneDetection")
    protected String levToneDetection;
    @XmlElement(name = "ChgDispUpdtFrqSec")
    protected String chgDispUpdtFrqSec;
    @XmlElement(name = "DateFormatOnTerminals")
    protected String dateFormatOnTerminals;
    @XmlElement(name = "OnHookDialingTerminals")
    protected String onHookDialingTerminals;
    @XmlElement(name = "DisCallNoRRCalIDC")
    protected String disCallNoRRCalIDC;
    @XmlElement(name = "ItalanProtEnabled")
    protected String italanProtEnabled;
    @XmlElement(name = "EASEnabled")
    protected String easEnabled;
    @XmlElement(name = "MinAgtLogIDPwdLen")
    protected String minAgtLogIDPwdLen;
    @XmlElement(name = "DirectAgentAnnExt")
    protected String directAgentAnnExt;
    @XmlElement(name = "MsgWtLmpIndStatus")
    protected String msgWtLmpIndStatus;
    @XmlElement(name = "ConFirstDataDelay")
    protected String conFirstDataDelay;
    @XmlElement(name = "ConvSignalToneMs")
    protected String convSignalToneMs;
    @XmlElement(name = "PromptTimeoutsecs")
    protected String promptTimeoutsecs;
    @XmlElement(name = "InterflwqposEWTTh")
    protected String interflwqposEWTTh;
    @XmlElement(name = "RevStrPndDgtColSt")
    protected String revStrPndDgtColSt;
    @XmlElement(name = "MaxMsgsPerStation")
    protected String maxMsgsPerStation;
    @XmlElement(name = "AvailbleAgtAdjBSR")
    protected String availbleAgtAdjBSR;
    @XmlElement(name = "SecondDataDelay")
    protected String secondDataDelay;
    @XmlElement(name = "PauseMsec")
    protected String pauseMsec;
    @XmlElement(name = "SerObsWarningTone")
    protected String serObsWarningTone;
    @XmlElement(name = "CalClsAfterAsrSup")
    protected String calClsAfterAsrSup;
    @XmlElement(name = "SendUCIDtoASAI")
    protected String sendUCIDtoASAI;
    @XmlElement(name = "MIAAcrsSplitSkill")
    protected String miaAcrsSplitSkill;
    @XmlElement(name = "ACWAgtsCnsdrdIdle")
    protected String acwAgtsCnsdrdIdle;
    @XmlElement(name = "CallSlectnMeasure")
    protected String callSlectnMeasure;
    @XmlElement(name = "ServLvlSprClSelOv")
    protected String servLvlSprClSelOv;
    @XmlElement(name = "MaxExCallLogStati")
    protected String maxExCallLogStati;
    @XmlElement(name = "AutoReserveAgents")
    protected String autoReserveAgents;
    @XmlElement(name = "CpyASAIUUIConfTra")
    protected String cpyASAIUUIConfTra;
    @XmlElement(name = "AuxWrkRsnCodeType")
    protected String auxWrkRsnCodeType;
    @XmlElement(name = "LogoutRsnCodeType")
    protected String logoutRsnCodeType;
    @XmlElement(name = "AdjunctCMSRelease")
    protected String adjunctCMSRelease;
    @XmlElement(name = "ACDLgnIdentiLgth")
    protected String acdLgnIdentiLgth;
    @XmlElement(name = "BCMSVuStatLgnIDs")
    protected String bcmsVuStatLgnIDs;
    @XmlElement(name = "BCMSVuStatMsrtInt")
    protected String bcmsVuStatMsrtInt;
    @XmlElement(name = "BCMSVuStatAbClTrS")
    protected String bcmsVuStatAbClTrS;
    @XmlElement(name = "VdBCMSVuStatLgnID")
    protected String vdBCMSVuStatLgnID;
    @XmlElement(name = "MsgWaitIndExtCall")
    protected String msgWaitIndExtCall;
    @XmlElement(name = "ClrVuStatsSftData")
    protected String clrVuStatsSftData;
    @XmlElement(name = "RemIaBCMSVuStatAg")
    protected String remIaBCMSVuStatAg;
    @XmlElement(name = "SwHkQryRepnsTimeo")
    protected String swHkQryRepnsTimeo;
    @XmlElement(name = "AutanrIPFailAxReC")
    protected String autanrIPFailAxReC;
    @XmlElement(name = "MaxAgtOccupPercen")
    protected String maxAgtOccupPercen;
    @XmlElement(name = "MaxAgtOccupAuxReC")
    protected String maxAgtOccupAuxReC;
    @XmlElement(name = "AutoExclusionCOS")
    protected String autoExclusionCOS;
    @XmlElement(name = "AutoExclnCovrHold")
    protected String autoExclnCovrHold;
    @XmlElement(name = "AutoExclnWhispPag")
    protected String autoExclnWhispPag;
    @XmlElement(name = "RecallRotaryDigit")
    protected String recallRotaryDigit;
    @XmlElement(name = "DrnCallTmrDispSec")
    protected String drnCallTmrDispSec;
    @XmlElement(name = "DirIpIpAudioConne")
    protected String dirIpIpAudioConne;
    @XmlElement(name = "IPAudioHairpinnig")
    protected String ipAudioHairpinnig;
    @XmlElement(name = "Retry")
    protected String retry;
    @XmlElement(name = "T2BckSigActnTirSe")
    protected String t2BckSigActnTirSe;
    @XmlElement(name = "ProbtBrdgCalDtaPr")
    protected String probtBrdgCalDtaPr;
    @XmlElement(name = "EnhAbrDialLen34")
    protected String enhAbrDialLen34;
    @XmlElement(name = "RecSubFailHisLog")
    protected String recSubFailHisLog;
    @XmlElement(name = "RecPMSADTraHisLog")
    protected String recPMSADTraHisLog;
    @XmlElement(name = "RecIPRegHisLog")
    protected String recIPRegHisLog;
    @XmlElement(name = "DefMulOutTrParSel")
    protected String defMulOutTrParSel;
    @XmlElement(name = "TTIEnabled")
    protected String ttiEnabled;
    @XmlElement(name = "TTIState")
    protected String ttiState;
    @XmlElement(name = "TTISecurityCode")
    protected String ttiSecurityCode;
    @XmlElement(name = "DOPstAsrFailRryLt")
    protected String doPstAsrFailRryLt;
    @XmlElement(name = "TrunkTrunkTransf")
    protected String trunkTrunkTransf;
    @XmlElement(name = "ConPwdQryTOutsecs")
    protected String conPwdQryTOutsecs;
    @XmlElement(name = "DOFailRtryItrlMin")
    protected String doFailRtryItrlMin;
    @XmlElement(name = "DOOvrlFalreRryLim")
    protected String doOvrlFalreRryLim;
    @XmlElement(name = "MusicToneonHold")
    protected String musicToneonHold;
    @XmlElement(name = "MusicToneonHoldMu")
    protected String musicToneonHoldMu;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "ACARefCalls")
    protected String acaRefCalls;
    @XmlElement(name = "ACARefCallsLocPr1")
    protected String acaRefCallsLocPr1;
    @XmlElement(name = "ACARefCallsLocPr2")
    protected String acaRefCallsLocPr2;
    @XmlElement(name = "ACARefCallsLocPr3")
    protected String acaRefCallsLocPr3;
    @XmlElement(name = "ACARefCallsRemote")
    protected String acaRefCallsRemote;
    @XmlElement(name = "ACARemotePBXIdent")
    protected String acaRemotePBXIdent;
    @XmlElement(name = "ACAReferDestinati")
    protected String acaReferDestinati;
    @XmlElement(name = "ACAShtHldTmOrgExt")
    protected String acaShtHldTmOrgExt;
    @XmlElement(name = "ACALngHldTmOrgExt")
    protected String acaLngHldTmOrgExt;
    @XmlElement(name = "TIsdnClBUrACASHTC")
    protected String tIsdnClBUrACASHTC;
    @XmlElement(name = "CpnAniPSADisedSet")
    protected String cpnAniPSADisedSet;
    @XmlElement(name = "Unnamed_Registrations_and_PSA_for_IP_Telephones")
    protected String unnamedRegistrationsAndPSAForIPTelephones;
    @XmlElement(name = "ContTerResDoNtDsA")
    protected String contTerResDoNtDsA;
    @XmlElement(name = "ContTerResDoNtDsE")
    protected String contTerResDoNtDsE;
    @XmlElement(name = "ContOutResInrTrtA")
    protected String contOutResInrTrtA;
    @XmlElement(name = "ContOutResInrTrtE")
    protected String contOutResInrTrtE;
    @XmlElement(name = "ContStaStaRestricA")
    protected String contStaStaRestricA;
    @XmlElement(name = "ContStaStaRestricE")
    protected String contStaStaRestricE;
    @XmlElement(name = "ContTollResIrtTr")
    protected String contTollResIrtTr;
    @XmlElement(name = "ContTollResIrtTrA")
    protected String contTollResIrtTrA;
    @XmlElement(name = "ContTollResIrtTrE")
    protected String contTollResIrtTrE;
    @XmlElement(name = "InvldNumDldItrcTA")
    protected String invldNumDldItrcTA;
    @XmlElement(name = "Announcement")
    protected String announcement;
    @XmlElement(name = "VMHuntGroupExt")
    protected String vmHuntGroupExt;
    @XmlElement(name = "MaximumLength")
    protected String maximumLength;
    @XmlElement(name = "MinimumDigLength")
    protected String minimumDigLength;
    @XmlElement(name = "RepCallWaitInterv")
    protected String repCallWaitInterv;
    @XmlElement(name = "ApplyInrcptLocal")
    protected String applyInrcptLocal;
    @XmlElement(name = "EnforcePNTPNTRest")
    protected String enforcePNTPNTRest;
    @XmlElement(name = "NumbSessionwAllo")
    protected String numbSessionwAllo;
    @XmlElement(name = "CongestionTimer")
    protected String congestionTimer;
    @XmlElement(name = "SessTimeout")
    protected String sessTimeout;
    @XmlElement(name = "CongnClearedTr")
    protected String congnClearedTr;
    @XmlElement(name = "SignalingGroupLt")
    protected String signalingGroupLt;
    @XmlElement(name = "DCSMessageFormat")
    protected String dcsMessageFormat;
    @XmlElement(name = "Delay")
    protected String delay;
    @XmlElement(name = "ClearCallrInfo")
    protected String clearCallrInfo;
    @XmlElement(name = "SysParRingerOffwithAuto")
    protected String sysParRingerOffwithAuto;
    @XmlElement(name = "RecCTAPSATTIHisLg")
    protected String recCTAPSATTIHisLg;
    @XmlElement(name = "EnhPSALocDisIfoEn")
    protected String enhPSALocDisIfoEn;
    @XmlElement(name = "AutoCallbNoAnTOIn")
    protected String autoCallbNoAnTOIn;
    @XmlElement(name = "DefCORPSADissSets")
    protected String defCORPSADissSets;
    @XmlElement(name = "CTAEnabled")
    protected String ctaEnabled;
    @XmlElement(name = "ResSlotAttPriQue")
    protected String resSlotAttPriQue;
    @XmlElement(name = "TimebfrOffhookAlt")
    protected String timebfrOffhookAlt;
    @XmlElement(name = "EmergAccRedirExt")
    protected String emergAccRedirExt;
    @XmlElement(name = "EmergClsAldAttQue")
    protected String emergClsAldAttQue;
    @XmlElement(name = "CallPickupAlert")
    protected String callPickupAlert;
    @XmlElement(name = "TempBrgApcClPickU")
    protected String tempBrgApcClPickU;
    @XmlElement(name = "CallPickupIntrcmC")
    protected String callPickupIntrcmC;
    @XmlElement(name = "DirectedCallPckup")
    protected String directedCallPckup;
    @XmlElement(name = "CallPrkTOInterMin")
    protected String callPrkTOInterMin;
    @XmlElement(name = "ExtGroupCallPckup")
    protected String extGroupCallPckup;
    @XmlElement(name = "DxPagCalPkTimOrig")
    protected String dxPagCalPkTimOrig;
    @XmlElement(name = "ContOutResInrTrmt")
    protected String contOutResInrTrmt;
    @XmlElement(name = "ContTerResDoNtDst")
    protected String contTerResDoNtDst;
    @XmlElement(name = "ContStaStaRestric")
    protected String contStaStaRestric;
    @XmlElement(name = "AuthCodesEnabled")
    protected String authCodesEnabled;
    @XmlElement(name = "AuthCodeLength")
    protected String authCodeLength;
    @XmlElement(name = "AuthCodeCancelSym")
    protected String authCodeCancelSym;
    @XmlElement(name = "AtteTimeOutFlag")
    protected String atteTimeOutFlag;
    @XmlElement(name = "DisplAuthorCode")
    protected String displAuthorCode;
    @XmlElement(name = "OffPmTnDctTOInSec")
    protected String offPmTnDctTOInSec;
    @XmlElement(name = "ContrTollResRepla")
    protected String contrTollResRepla;
    @XmlElement(name = "SysPrinterEndpoint")
    protected String sysPrinterEndpoint;
    @XmlElement(name = "LinesPerPage")
    protected String linesPerPage;
    @XmlElement(name = "EmerExtForwMin")
    protected String emerExtForwMin;
    @XmlElement(name = "SwitchName")
    protected String switchName;
    @XmlElement(name = "ApplyMCTWarnTone")
    protected String applyMCTWarnTone;
    @XmlElement(name = "MCTVoiceRecTrGrp")
    protected String mctVoiceRecTrGrp;
    @XmlElement(name = "DelSendRelSecs")
    protected String delSendRelSecs;
    @XmlElement(name = "SendAllCallsAppls")
    protected String sendAllCallsAppls;
    @XmlElement(name = "AutoInspectSACs")
    protected String autoInspectSACs;
    @XmlElement(name = "AARARSDialToneReq")
    protected String aararsDialToneReq;
    @XmlElement(name = "CreateUCID___")
    protected String createUCID;
    @XmlElement(name = "UCIDNetworkNodeID")
    protected String ucidNetworkNodeID;
    @XmlElement(name = "PblcNetTrkCnfCall")
    protected String pblcNetTrkCnfCall;
    @XmlElement(name = "CnfPrtPubNrkTrk")
    protected String cnfPrtPubNrkTrk;
    @XmlElement(name = "CnfPrtWoPubNrkTrk")
    protected String cnfPrtWoPubNrkTrk;
    @XmlElement(name = "NightSerDisTimeSc")
    protected String nightSerDisTimeSc;
    @XmlElement(name = "ShrtInrdgtTimerSc")
    protected String shrtInrdgtTimerSc;
    @XmlElement(name = "UAnsDIDCalTmrSecs")
    protected String uAnsDIDCalTmrSecs;
    @XmlElement(name = "LnItrcptToneTmrSc")
    protected String lnItrcptToneTmrSc;
    @XmlElement(name = "LngHldRecTmerSecs")
    protected String lngHldRecTmerSecs;
    @XmlElement(name = "MusicSlnceTraTrnk")
    protected String musicSlnceTraTrnk;
    @XmlElement(name = "RstShftTmrSecs")
    protected String rstShftTmrSecs;
    @XmlElement(name = "StaCallTnsRclTrSc")
    protected String staCallTnsRclTrSc;
    @XmlElement(name = "DIDBusyTreatment")
    protected String didBusyTreatment;
    @XmlElement(name = "InvldNumDldItrcTr")
    protected String invldNumDldItrcTr;
    @XmlElement(name = "AlAarArsAcDidDiod")
    protected String alAarArsAcDidDiod;
    @XmlElement(name = "AlANIResAARARS")
    protected String alANIResAARARS;
    @XmlElement(name = "UseTrCOROutTrDsct")
    protected String useTrCOROutTrDsct;
    @XmlElement(name = "NumericDisplay7405ND")
    protected String numericDisplay7405ND;
    @XmlElement(name = "NumericDisplay7434ND")
    protected String numericDisplay7434ND;
    @XmlElement(name = "AutoStart")
    protected String autoStart;
    @XmlElement(name = "AutoHold")
    protected String autoHold;
    @XmlElement(name = "EMU_Inactivity_Interval")
    protected String emuInactivityInterval;
    @XmlElement(name = "DIDTieISDNSIPInTr")
    protected String didTieISDNSIPInTr;
    @XmlElement(name = "AttendantTone")
    protected String attendantTone;
    @XmlElement(name = "BridgingTone")
    protected String bridgingTone;
    @XmlElement(name = "ConferenceTone")
    protected String conferenceTone;
    @XmlElement(name = "IntrusionTone")
    protected String intrusionTone;
    @XmlElement(name = "SpecialDialTone")
    protected String specialDialTone;
    @XmlElement(name = "ModeCodeInterface")
    protected String modeCodeInterface;
    @XmlElement(name = "Internal")
    protected String internal;
    @XmlElement(name = "External")
    protected String external;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "IntAtoAnAtdExtTra")
    protected String intAtoAnAtdExtTra;
    @XmlElement(name = "AttOriginateCalls")
    protected String attOriginateCalls;
    @XmlElement(name = "DTMFTeFbkSglVRUCn")
    protected String dtmfTeFbkSglVRUCn;
    @XmlElement(name = "Disconnection")
    protected String disconnection;
    @XmlElement(name = "AbortTransfer")
    protected String abortTransfer;
    @XmlElement(name = "TransfrUponHangUp")
    protected String transfrUponHangUp;
    @XmlElement(name = "AbtConfUponHangUp")
    protected String abtConfUponHangUp;
    @XmlElement(name = "NoHoldConfTimeout")
    protected String noHoldConfTimeout;
    @XmlElement(name = "NoDialToneConfrnc")
    protected String noDialToneConfrnc;
    @XmlElement(name = "SelLnApprConfrnc")
    protected String selLnApprConfrnc;
    @XmlElement(name = "Unhold")
    protected String unhold;
    @XmlElement(name = "Allow_Two_Observers_in_Same_Call")
    protected String allowTwoObserversInSameCall;
    @XmlElement(name = "Service_Level_Algorithm_for_SLM")
    protected String serviceLevelAlgorithmForSLM;
    @XmlElement(name = "Externally_Controlled_Distribution")
    protected String externallyControlledDistribution;
    @XmlElement(name = "Ecd_Exception_Timer")
    protected String ecdExceptionTimer;
    @XmlElement(name = "ECD_Service_Route_Timer")
    protected String ecdServiceRouteTimer;
    @XmlElement(name = "StationSysWRetPn1")
    protected List<ArrayType> stationSysWRetPn1;
    @XmlElement(name = "RdoCoDownlServPn1")
    protected List<ArrayType> rdoCoDownlServPn1;
    @XmlElement(name = "DCSMessageFormat1")
    protected List<ArrayType> dcsMessageFormat1;

    /**
     * selfStaDispEnable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfStaDispEnable() {
        return selfStaDispEnable;
    }

    /**
     * selfStaDispEnable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfStaDispEnable(String value) {
        this.selfStaDispEnable = value;
    }

    /**
     * autCirAssurEnable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutCirAssurEnable() {
        return autCirAssurEnable;
    }

    /**
     * autCirAssurEnable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutCirAssurEnable(String value) {
        this.autCirAssurEnable = value;
    }

    /**
     * withoutFlash 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithoutFlash() {
        return withoutFlash;
    }

    /**
     * withoutFlash 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithoutFlash(String value) {
        this.withoutFlash = value;
    }

    /**
     * recDelayTimerMsec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecDelayTimerMsec() {
        return recDelayTimerMsec;
    }

    /**
     * recDelayTimerMsec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecDelayTimerMsec(String value) {
        this.recDelayTimerMsec = value;
    }

    /**
     * apyRdyInTnPrtCall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApyRdyInTnPrtCall() {
        return apyRdyInTnPrtCall;
    }

    /**
     * apyRdyInTnPrtCall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApyRdyInTnPrtCall(String value) {
        this.apyRdyInTnPrtCall = value;
    }

    /**
     * intApyPerAltTnSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntApyPerAltTnSec() {
        return intApyPerAltTnSec;
    }

    /**
     * intApyPerAltTnSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntApyPerAltTnSec(String value) {
        this.intApyPerAltTnSec = value;
    }

    /**
     * requireSecCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireSecCode() {
        return requireSecCode;
    }

    /**
     * requireSecCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireSecCode(String value) {
        this.requireSecCode = value;
    }

    /**
     * seNISDNTkGpNmCnNm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeNISDNTkGpNmCnNm() {
        return seNISDNTkGpNmCnNm;
    }

    /**
     * seNISDNTkGpNmCnNm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeNISDNTkGpNmCnNm(String value) {
        this.seNISDNTkGpNmCnNm = value;
    }

    /**
     * disConNaNmISDNDCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisConNaNmISDNDCS() {
        return disConNaNmISDNDCS;
    }

    /**
     * disConNaNmISDNDCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisConNaNmISDNDCS(String value) {
        this.disConNaNmISDNDCS = value;
    }

    /**
     * seISDNTkGrNmeTndm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeISDNTkGrNmeTndm() {
        return seISDNTkGrNmeTndm;
    }

    /**
     * seISDNTkGrNmeTndm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeISDNTkGrNmeTndm(String value) {
        this.seISDNTkGrNmeTndm = value;
    }

    /**
     * seCusMsgQSIG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeCusMsgQSIG() {
        return seCusMsgQSIG;
    }

    /**
     * seCusMsgQSIG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeCusMsgQSIG(String value) {
        this.seCusMsgQSIG = value;
    }

    /**
     * qsigtscExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSIGTSCExtension() {
        return qsigtscExtension;
    }

    /**
     * qsigtscExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSIGTSCExtension(String value) {
        this.qsigtscExtension = value;
    }

    /**
     * abrDilPrgrmAsList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrDilPrgrmAsList() {
        return abrDilPrgrmAsList;
    }

    /**
     * abrDilPrgrmAsList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbrDilPrgrmAsList(String value) {
        this.abrDilPrgrmAsList = value;
    }

    /**
     * mwiNoDigitsVMSubs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMWINoDigitsVMSubs() {
        return mwiNoDigitsVMSubs;
    }

    /**
     * mwiNoDigitsVMSubs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMWINoDigitsVMSubs(String value) {
        this.mwiNoDigitsVMSubs = value;
    }

    /**
     * featurePlusExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturePlusExt() {
        return featurePlusExt;
    }

    /**
     * featurePlusExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturePlusExt(String value) {
        this.featurePlusExt = value;
    }

    /**
     * nationalCPNPrefix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalCPNPrefix() {
        return nationalCPNPrefix;
    }

    /**
     * nationalCPNPrefix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalCPNPrefix(String value) {
        this.nationalCPNPrefix = value;
    }

    /**
     * passPrfxCPNASAI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassPrfxCPNASAI() {
        return passPrfxCPNASAI;
    }

    /**
     * passPrfxCPNASAI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassPrfxCPNASAI(String value) {
        this.passPrfxCPNASAI = value;
    }

    /**
     * unknNumItrnlAUDIX 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknNumItrnlAUDIX() {
        return unknNumItrnlAUDIX;
    }

    /**
     * unknNumItrnlAUDIX 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknNumItrnlAUDIX(String value) {
        this.unknNumItrnlAUDIX = value;
    }

    /**
     * usniCallNaOutgCal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSNICallNaOutgCal() {
        return usniCallNaOutgCal;
    }

    /**
     * usniCallNaOutgCal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSNICallNaOutgCal(String value) {
        this.usniCallNaOutgCal = value;
    }

    /**
     * pthRplacMeasrment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPthRplacMeasrment() {
        return pthRplacMeasrment;
    }

    /**
     * pthRplacMeasrment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPthRplacMeasrment(String value) {
        this.pthRplacMeasrment = value;
    }

    /**
     * qsigPthRplacExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSIGPthRplacExt() {
        return qsigPthRplacExt;
    }

    /**
     * qsigPthRplacExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSIGPthRplacExt(String value) {
        this.qsigPthRplacExt = value;
    }

    /**
     * pthRplacQueVector 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPthRplacQueVector() {
        return pthRplacQueVector;
    }

    /**
     * pthRplacQueVector 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPthRplacQueVector(String value) {
        this.pthRplacQueVector = value;
    }

    /**
     * atoAbrDelTranIntR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtoAbrDelTranIntR() {
        return atoAbrDelTranIntR;
    }

    /**
     * atoAbrDelTranIntR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtoAbrDelTranIntR(String value) {
        this.atoAbrDelTranIntR = value;
    }

    /**
     * cpnAniIclidRepRes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAniIclidRepRes() {
        return cpnAniIclidRepRes;
    }

    /**
     * cpnAniIclidRepRes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnAniIclidRepRes(String value) {
        this.cpnAniIclidRepRes = value;
    }

    /**
     * cpnAniIclidRepUna 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAniIclidRepUna() {
        return cpnAniIclidRepUna;
    }

    /**
     * cpnAniIclidRepUna 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnAniIclidRepUna(String value) {
        this.cpnAniIclidRepUna = value;
    }

    /**
     * localCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCountryCode() {
        return localCountryCode;
    }

    /**
     * localCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCountryCode(String value) {
        this.localCountryCode = value;
    }

    /**
     * intrnlAccessCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrnlAccessCode() {
        return intrnlAccessCode;
    }

    /**
     * intrnlAccessCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrnlAccessCode(String value) {
        this.intrnlAccessCode = value;
    }

    /**
     * enEnblcDlWoARSFAC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnEnblcDlWoARSFAC() {
        return enEnblcDlWoARSFAC;
    }

    /**
     * enEnblcDlWoARSFAC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnEnblcDlWoARSFAC(String value) {
        this.enEnblcDlWoARSFAC = value;
    }

    /**
     * pullTransfer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPullTransfer() {
        return pullTransfer;
    }

    /**
     * pullTransfer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPullTransfer(String value) {
        this.pullTransfer = value;
    }

    /**
     * outplsWithoutTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutplsWithoutTone() {
        return outplsWithoutTone;
    }

    /**
     * outplsWithoutTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutplsWithoutTone(String value) {
        this.outplsWithoutTone = value;
    }

    /**
     * misOperatnAlert 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMisOperatnAlert() {
        return misOperatnAlert;
    }

    /**
     * misOperatnAlert 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMisOperatnAlert(String value) {
        this.misOperatnAlert = value;
    }

    /**
     * allowConfviaFlash 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowConfviaFlash() {
        return allowConfviaFlash;
    }

    /**
     * allowConfviaFlash 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowConfviaFlash(String value) {
        this.allowConfviaFlash = value;
    }

    /**
     * vecDisconTimrMins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVecDisconTimrMins() {
        return vecDisconTimrMins;
    }

    /**
     * vecDisconTimrMins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVecDisconTimrMins(String value) {
        this.vecDisconTimrMins = value;
    }

    /**
     * proCallerIDAnaTer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCallerIDAnaTer() {
        return proCallerIDAnaTer;
    }

    /**
     * proCallerIDAnaTer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCallerIDAnaTer(String value) {
        this.proCallerIDAnaTer = value;
    }

    /**
     * hearZpTnFollowVOA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHearZpTnFollowVOA() {
        return hearZpTnFollowVOA;
    }

    /**
     * hearZpTnFollowVOA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHearZpTnFollowVOA(String value) {
        this.hearZpTnFollowVOA = value;
    }

    /**
     * updtTransRingPtrn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdtTransRingPtrn() {
        return updtTransRingPtrn;
    }

    /**
     * updtTransRingPtrn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdtTransRingPtrn(String value) {
        this.updtTransRingPtrn = value;
    }

    /**
     * waitAnswSuprTimer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitAnswSuprTimer() {
        return waitAnswSuprTimer;
    }

    /**
     * waitAnswSuprTimer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitAnswSuprTimer(String value) {
        this.waitAnswSuprTimer = value;
    }

    /**
     * repeCallWaitingTn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeCallWaitingTn() {
        return repeCallWaitingTn;
    }

    /**
     * repeCallWaitingTn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeCallWaitingTn(String value) {
        this.repeCallWaitingTn = value;
    }

    /**
     * intrTrtFailedTrTr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrTrtFailedTrTr() {
        return intrTrtFailedTrTr;
    }

    /**
     * intrTrtFailedTrTr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrTrtFailedTrTr(String value) {
        this.intrTrtFailedTrTr = value;
    }

    /**
     * staToneForDisconn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaToneForDisconn() {
        return staToneForDisconn;
    }

    /**
     * staToneForDisconn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaToneForDisconn(String value) {
        this.staToneForDisconn = value;
    }

    /**
     * levToneDetection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevToneDetection() {
        return levToneDetection;
    }

    /**
     * levToneDetection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevToneDetection(String value) {
        this.levToneDetection = value;
    }

    /**
     * chgDispUpdtFrqSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgDispUpdtFrqSec() {
        return chgDispUpdtFrqSec;
    }

    /**
     * chgDispUpdtFrqSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgDispUpdtFrqSec(String value) {
        this.chgDispUpdtFrqSec = value;
    }

    /**
     * dateFormatOnTerminals 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormatOnTerminals() {
        return dateFormatOnTerminals;
    }

    /**
     * dateFormatOnTerminals 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormatOnTerminals(String value) {
        this.dateFormatOnTerminals = value;
    }

    /**
     * onHookDialingTerminals 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnHookDialingTerminals() {
        return onHookDialingTerminals;
    }

    /**
     * onHookDialingTerminals 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnHookDialingTerminals(String value) {
        this.onHookDialingTerminals = value;
    }

    /**
     * disCallNoRRCalIDC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisCallNoRRCalIDC() {
        return disCallNoRRCalIDC;
    }

    /**
     * disCallNoRRCalIDC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisCallNoRRCalIDC(String value) {
        this.disCallNoRRCalIDC = value;
    }

    /**
     * italanProtEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItalanProtEnabled() {
        return italanProtEnabled;
    }

    /**
     * italanProtEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItalanProtEnabled(String value) {
        this.italanProtEnabled = value;
    }

    /**
     * easEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEASEnabled() {
        return easEnabled;
    }

    /**
     * easEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEASEnabled(String value) {
        this.easEnabled = value;
    }

    /**
     * minAgtLogIDPwdLen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAgtLogIDPwdLen() {
        return minAgtLogIDPwdLen;
    }

    /**
     * minAgtLogIDPwdLen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAgtLogIDPwdLen(String value) {
        this.minAgtLogIDPwdLen = value;
    }

    /**
     * directAgentAnnExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectAgentAnnExt() {
        return directAgentAnnExt;
    }

    /**
     * directAgentAnnExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectAgentAnnExt(String value) {
        this.directAgentAnnExt = value;
    }

    /**
     * msgWtLmpIndStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgWtLmpIndStatus() {
        return msgWtLmpIndStatus;
    }

    /**
     * msgWtLmpIndStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgWtLmpIndStatus(String value) {
        this.msgWtLmpIndStatus = value;
    }

    /**
     * conFirstDataDelay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConFirstDataDelay() {
        return conFirstDataDelay;
    }

    /**
     * conFirstDataDelay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConFirstDataDelay(String value) {
        this.conFirstDataDelay = value;
    }

    /**
     * convSignalToneMs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvSignalToneMs() {
        return convSignalToneMs;
    }

    /**
     * convSignalToneMs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvSignalToneMs(String value) {
        this.convSignalToneMs = value;
    }

    /**
     * promptTimeoutsecs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptTimeoutsecs() {
        return promptTimeoutsecs;
    }

    /**
     * promptTimeoutsecs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptTimeoutsecs(String value) {
        this.promptTimeoutsecs = value;
    }

    /**
     * interflwqposEWTTh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterflwqposEWTTh() {
        return interflwqposEWTTh;
    }

    /**
     * interflwqposEWTTh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterflwqposEWTTh(String value) {
        this.interflwqposEWTTh = value;
    }

    /**
     * revStrPndDgtColSt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevStrPndDgtColSt() {
        return revStrPndDgtColSt;
    }

    /**
     * revStrPndDgtColSt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevStrPndDgtColSt(String value) {
        this.revStrPndDgtColSt = value;
    }

    /**
     * maxMsgsPerStation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxMsgsPerStation() {
        return maxMsgsPerStation;
    }

    /**
     * maxMsgsPerStation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxMsgsPerStation(String value) {
        this.maxMsgsPerStation = value;
    }

    /**
     * availbleAgtAdjBSR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailbleAgtAdjBSR() {
        return availbleAgtAdjBSR;
    }

    /**
     * availbleAgtAdjBSR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailbleAgtAdjBSR(String value) {
        this.availbleAgtAdjBSR = value;
    }

    /**
     * secondDataDelay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondDataDelay() {
        return secondDataDelay;
    }

    /**
     * secondDataDelay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondDataDelay(String value) {
        this.secondDataDelay = value;
    }

    /**
     * pauseMsec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPauseMsec() {
        return pauseMsec;
    }

    /**
     * pauseMsec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauseMsec(String value) {
        this.pauseMsec = value;
    }

    /**
     * serObsWarningTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerObsWarningTone() {
        return serObsWarningTone;
    }

    /**
     * serObsWarningTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerObsWarningTone(String value) {
        this.serObsWarningTone = value;
    }

    /**
     * calClsAfterAsrSup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalClsAfterAsrSup() {
        return calClsAfterAsrSup;
    }

    /**
     * calClsAfterAsrSup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalClsAfterAsrSup(String value) {
        this.calClsAfterAsrSup = value;
    }

    /**
     * sendUCIDtoASAI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendUCIDtoASAI() {
        return sendUCIDtoASAI;
    }

    /**
     * sendUCIDtoASAI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendUCIDtoASAI(String value) {
        this.sendUCIDtoASAI = value;
    }

    /**
     * miaAcrsSplitSkill 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIAAcrsSplitSkill() {
        return miaAcrsSplitSkill;
    }

    /**
     * miaAcrsSplitSkill 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIAAcrsSplitSkill(String value) {
        this.miaAcrsSplitSkill = value;
    }

    /**
     * acwAgtsCnsdrdIdle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACWAgtsCnsdrdIdle() {
        return acwAgtsCnsdrdIdle;
    }

    /**
     * acwAgtsCnsdrdIdle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACWAgtsCnsdrdIdle(String value) {
        this.acwAgtsCnsdrdIdle = value;
    }

    /**
     * callSlectnMeasure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSlectnMeasure() {
        return callSlectnMeasure;
    }

    /**
     * callSlectnMeasure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSlectnMeasure(String value) {
        this.callSlectnMeasure = value;
    }

    /**
     * servLvlSprClSelOv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServLvlSprClSelOv() {
        return servLvlSprClSelOv;
    }

    /**
     * servLvlSprClSelOv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServLvlSprClSelOv(String value) {
        this.servLvlSprClSelOv = value;
    }

    /**
     * maxExCallLogStati 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxExCallLogStati() {
        return maxExCallLogStati;
    }

    /**
     * maxExCallLogStati 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxExCallLogStati(String value) {
        this.maxExCallLogStati = value;
    }

    /**
     * autoReserveAgents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoReserveAgents() {
        return autoReserveAgents;
    }

    /**
     * autoReserveAgents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoReserveAgents(String value) {
        this.autoReserveAgents = value;
    }

    /**
     * cpyASAIUUIConfTra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpyASAIUUIConfTra() {
        return cpyASAIUUIConfTra;
    }

    /**
     * cpyASAIUUIConfTra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpyASAIUUIConfTra(String value) {
        this.cpyASAIUUIConfTra = value;
    }

    /**
     * auxWrkRsnCodeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxWrkRsnCodeType() {
        return auxWrkRsnCodeType;
    }

    /**
     * auxWrkRsnCodeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxWrkRsnCodeType(String value) {
        this.auxWrkRsnCodeType = value;
    }

    /**
     * logoutRsnCodeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutRsnCodeType() {
        return logoutRsnCodeType;
    }

    /**
     * logoutRsnCodeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutRsnCodeType(String value) {
        this.logoutRsnCodeType = value;
    }

    /**
     * adjunctCMSRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctCMSRelease() {
        return adjunctCMSRelease;
    }

    /**
     * adjunctCMSRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctCMSRelease(String value) {
        this.adjunctCMSRelease = value;
    }

    /**
     * acdLgnIdentiLgth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDLgnIdentiLgth() {
        return acdLgnIdentiLgth;
    }

    /**
     * acdLgnIdentiLgth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDLgnIdentiLgth(String value) {
        this.acdLgnIdentiLgth = value;
    }

    /**
     * bcmsVuStatLgnIDs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSVuStatLgnIDs() {
        return bcmsVuStatLgnIDs;
    }

    /**
     * bcmsVuStatLgnIDs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSVuStatLgnIDs(String value) {
        this.bcmsVuStatLgnIDs = value;
    }

    /**
     * bcmsVuStatMsrtInt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSVuStatMsrtInt() {
        return bcmsVuStatMsrtInt;
    }

    /**
     * bcmsVuStatMsrtInt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSVuStatMsrtInt(String value) {
        this.bcmsVuStatMsrtInt = value;
    }

    /**
     * bcmsVuStatAbClTrS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSVuStatAbClTrS() {
        return bcmsVuStatAbClTrS;
    }

    /**
     * bcmsVuStatAbClTrS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSVuStatAbClTrS(String value) {
        this.bcmsVuStatAbClTrS = value;
    }

    /**
     * vdBCMSVuStatLgnID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVdBCMSVuStatLgnID() {
        return vdBCMSVuStatLgnID;
    }

    /**
     * vdBCMSVuStatLgnID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVdBCMSVuStatLgnID(String value) {
        this.vdBCMSVuStatLgnID = value;
    }

    /**
     * msgWaitIndExtCall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgWaitIndExtCall() {
        return msgWaitIndExtCall;
    }

    /**
     * msgWaitIndExtCall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgWaitIndExtCall(String value) {
        this.msgWaitIndExtCall = value;
    }

    /**
     * clrVuStatsSftData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrVuStatsSftData() {
        return clrVuStatsSftData;
    }

    /**
     * clrVuStatsSftData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrVuStatsSftData(String value) {
        this.clrVuStatsSftData = value;
    }

    /**
     * remIaBCMSVuStatAg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemIaBCMSVuStatAg() {
        return remIaBCMSVuStatAg;
    }

    /**
     * remIaBCMSVuStatAg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemIaBCMSVuStatAg(String value) {
        this.remIaBCMSVuStatAg = value;
    }

    /**
     * swHkQryRepnsTimeo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwHkQryRepnsTimeo() {
        return swHkQryRepnsTimeo;
    }

    /**
     * swHkQryRepnsTimeo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwHkQryRepnsTimeo(String value) {
        this.swHkQryRepnsTimeo = value;
    }

    /**
     * autanrIPFailAxReC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutanrIPFailAxReC() {
        return autanrIPFailAxReC;
    }

    /**
     * autanrIPFailAxReC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutanrIPFailAxReC(String value) {
        this.autanrIPFailAxReC = value;
    }

    /**
     * maxAgtOccupPercen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAgtOccupPercen() {
        return maxAgtOccupPercen;
    }

    /**
     * maxAgtOccupPercen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAgtOccupPercen(String value) {
        this.maxAgtOccupPercen = value;
    }

    /**
     * maxAgtOccupAuxReC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAgtOccupAuxReC() {
        return maxAgtOccupAuxReC;
    }

    /**
     * maxAgtOccupAuxReC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAgtOccupAuxReC(String value) {
        this.maxAgtOccupAuxReC = value;
    }

    /**
     * autoExclusionCOS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExclusionCOS() {
        return autoExclusionCOS;
    }

    /**
     * autoExclusionCOS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExclusionCOS(String value) {
        this.autoExclusionCOS = value;
    }

    /**
     * autoExclnCovrHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExclnCovrHold() {
        return autoExclnCovrHold;
    }

    /**
     * autoExclnCovrHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExclnCovrHold(String value) {
        this.autoExclnCovrHold = value;
    }

    /**
     * autoExclnWhispPag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExclnWhispPag() {
        return autoExclnWhispPag;
    }

    /**
     * autoExclnWhispPag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExclnWhispPag(String value) {
        this.autoExclnWhispPag = value;
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
     * drnCallTmrDispSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrnCallTmrDispSec() {
        return drnCallTmrDispSec;
    }

    /**
     * drnCallTmrDispSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrnCallTmrDispSec(String value) {
        this.drnCallTmrDispSec = value;
    }

    /**
     * dirIpIpAudioConne 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirIpIpAudioConne() {
        return dirIpIpAudioConne;
    }

    /**
     * dirIpIpAudioConne 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirIpIpAudioConne(String value) {
        this.dirIpIpAudioConne = value;
    }

    /**
     * ipAudioHairpinnig 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAudioHairpinnig() {
        return ipAudioHairpinnig;
    }

    /**
     * ipAudioHairpinnig 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAudioHairpinnig(String value) {
        this.ipAudioHairpinnig = value;
    }

    /**
     * retry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetry() {
        return retry;
    }

    /**
     * retry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetry(String value) {
        this.retry = value;
    }

    /**
     * t2BckSigActnTirSe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT2BckSigActnTirSe() {
        return t2BckSigActnTirSe;
    }

    /**
     * t2BckSigActnTirSe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT2BckSigActnTirSe(String value) {
        this.t2BckSigActnTirSe = value;
    }

    /**
     * probtBrdgCalDtaPr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbtBrdgCalDtaPr() {
        return probtBrdgCalDtaPr;
    }

    /**
     * probtBrdgCalDtaPr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbtBrdgCalDtaPr(String value) {
        this.probtBrdgCalDtaPr = value;
    }

    /**
     * enhAbrDialLen34 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhAbrDialLen34() {
        return enhAbrDialLen34;
    }

    /**
     * enhAbrDialLen34 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhAbrDialLen34(String value) {
        this.enhAbrDialLen34 = value;
    }

    /**
     * recSubFailHisLog 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecSubFailHisLog() {
        return recSubFailHisLog;
    }

    /**
     * recSubFailHisLog 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecSubFailHisLog(String value) {
        this.recSubFailHisLog = value;
    }

    /**
     * recPMSADTraHisLog 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecPMSADTraHisLog() {
        return recPMSADTraHisLog;
    }

    /**
     * recPMSADTraHisLog 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecPMSADTraHisLog(String value) {
        this.recPMSADTraHisLog = value;
    }

    /**
     * recIPRegHisLog 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecIPRegHisLog() {
        return recIPRegHisLog;
    }

    /**
     * recIPRegHisLog 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecIPRegHisLog(String value) {
        this.recIPRegHisLog = value;
    }

    /**
     * defMulOutTrParSel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefMulOutTrParSel() {
        return defMulOutTrParSel;
    }

    /**
     * defMulOutTrParSel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefMulOutTrParSel(String value) {
        this.defMulOutTrParSel = value;
    }

    /**
     * ttiEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIEnabled() {
        return ttiEnabled;
    }

    /**
     * ttiEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIEnabled(String value) {
        this.ttiEnabled = value;
    }

    /**
     * ttiState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIState() {
        return ttiState;
    }

    /**
     * ttiState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIState(String value) {
        this.ttiState = value;
    }

    /**
     * ttiSecurityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTISecurityCode() {
        return ttiSecurityCode;
    }

    /**
     * ttiSecurityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTISecurityCode(String value) {
        this.ttiSecurityCode = value;
    }

    /**
     * doPstAsrFailRryLt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOPstAsrFailRryLt() {
        return doPstAsrFailRryLt;
    }

    /**
     * doPstAsrFailRryLt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOPstAsrFailRryLt(String value) {
        this.doPstAsrFailRryLt = value;
    }

    /**
     * trunkTrunkTransf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkTrunkTransf() {
        return trunkTrunkTransf;
    }

    /**
     * trunkTrunkTransf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkTrunkTransf(String value) {
        this.trunkTrunkTransf = value;
    }

    /**
     * conPwdQryTOutsecs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConPwdQryTOutsecs() {
        return conPwdQryTOutsecs;
    }

    /**
     * conPwdQryTOutsecs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConPwdQryTOutsecs(String value) {
        this.conPwdQryTOutsecs = value;
    }

    /**
     * doFailRtryItrlMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOFailRtryItrlMin() {
        return doFailRtryItrlMin;
    }

    /**
     * doFailRtryItrlMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOFailRtryItrlMin(String value) {
        this.doFailRtryItrlMin = value;
    }

    /**
     * doOvrlFalreRryLim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOOvrlFalreRryLim() {
        return doOvrlFalreRryLim;
    }

    /**
     * doOvrlFalreRryLim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOOvrlFalreRryLim(String value) {
        this.doOvrlFalreRryLim = value;
    }

    /**
     * musicToneonHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicToneonHold() {
        return musicToneonHold;
    }

    /**
     * musicToneonHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicToneonHold(String value) {
        this.musicToneonHold = value;
    }

    /**
     * musicToneonHoldMu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicToneonHoldMu() {
        return musicToneonHoldMu;
    }

    /**
     * musicToneonHoldMu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicToneonHoldMu(String value) {
        this.musicToneonHoldMu = value;
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
     * acaRefCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCalls() {
        return acaRefCalls;
    }

    /**
     * acaRefCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCalls(String value) {
        this.acaRefCalls = value;
    }

    /**
     * acaRefCallsLocPr1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCallsLocPr1() {
        return acaRefCallsLocPr1;
    }

    /**
     * acaRefCallsLocPr1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCallsLocPr1(String value) {
        this.acaRefCallsLocPr1 = value;
    }

    /**
     * acaRefCallsLocPr2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCallsLocPr2() {
        return acaRefCallsLocPr2;
    }

    /**
     * acaRefCallsLocPr2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCallsLocPr2(String value) {
        this.acaRefCallsLocPr2 = value;
    }

    /**
     * acaRefCallsLocPr3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCallsLocPr3() {
        return acaRefCallsLocPr3;
    }

    /**
     * acaRefCallsLocPr3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCallsLocPr3(String value) {
        this.acaRefCallsLocPr3 = value;
    }

    /**
     * acaRefCallsRemote 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCallsRemote() {
        return acaRefCallsRemote;
    }

    /**
     * acaRefCallsRemote 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCallsRemote(String value) {
        this.acaRefCallsRemote = value;
    }

    /**
     * acaRemotePBXIdent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARemotePBXIdent() {
        return acaRemotePBXIdent;
    }

    /**
     * acaRemotePBXIdent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARemotePBXIdent(String value) {
        this.acaRemotePBXIdent = value;
    }

    /**
     * acaReferDestinati 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACAReferDestinati() {
        return acaReferDestinati;
    }

    /**
     * acaReferDestinati 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACAReferDestinati(String value) {
        this.acaReferDestinati = value;
    }

    /**
     * acaShtHldTmOrgExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACAShtHldTmOrgExt() {
        return acaShtHldTmOrgExt;
    }

    /**
     * acaShtHldTmOrgExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACAShtHldTmOrgExt(String value) {
        this.acaShtHldTmOrgExt = value;
    }

    /**
     * acaLngHldTmOrgExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACALngHldTmOrgExt() {
        return acaLngHldTmOrgExt;
    }

    /**
     * acaLngHldTmOrgExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACALngHldTmOrgExt(String value) {
        this.acaLngHldTmOrgExt = value;
    }

    /**
     * tIsdnClBUrACASHTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIsdnClBUrACASHTC() {
        return tIsdnClBUrACASHTC;
    }

    /**
     * tIsdnClBUrACASHTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIsdnClBUrACASHTC(String value) {
        this.tIsdnClBUrACASHTC = value;
    }

    /**
     * cpnAniPSADisedSet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAniPSADisedSet() {
        return cpnAniPSADisedSet;
    }

    /**
     * cpnAniPSADisedSet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnAniPSADisedSet(String value) {
        this.cpnAniPSADisedSet = value;
    }

    /**
     * unnamedRegistrationsAndPSAForIPTelephones 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnnamedRegistrationsAndPSAForIPTelephones() {
        return unnamedRegistrationsAndPSAForIPTelephones;
    }

    /**
     * unnamedRegistrationsAndPSAForIPTelephones 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnnamedRegistrationsAndPSAForIPTelephones(String value) {
        this.unnamedRegistrationsAndPSAForIPTelephones = value;
    }

    /**
     * contTerResDoNtDsA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTerResDoNtDsA() {
        return contTerResDoNtDsA;
    }

    /**
     * contTerResDoNtDsA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTerResDoNtDsA(String value) {
        this.contTerResDoNtDsA = value;
    }

    /**
     * contTerResDoNtDsE 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTerResDoNtDsE() {
        return contTerResDoNtDsE;
    }

    /**
     * contTerResDoNtDsE 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTerResDoNtDsE(String value) {
        this.contTerResDoNtDsE = value;
    }

    /**
     * contOutResInrTrtA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContOutResInrTrtA() {
        return contOutResInrTrtA;
    }

    /**
     * contOutResInrTrtA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContOutResInrTrtA(String value) {
        this.contOutResInrTrtA = value;
    }

    /**
     * contOutResInrTrtE 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContOutResInrTrtE() {
        return contOutResInrTrtE;
    }

    /**
     * contOutResInrTrtE 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContOutResInrTrtE(String value) {
        this.contOutResInrTrtE = value;
    }

    /**
     * contStaStaRestricA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStaStaRestricA() {
        return contStaStaRestricA;
    }

    /**
     * contStaStaRestricA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStaStaRestricA(String value) {
        this.contStaStaRestricA = value;
    }

    /**
     * contStaStaRestricE 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStaStaRestricE() {
        return contStaStaRestricE;
    }

    /**
     * contStaStaRestricE 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStaStaRestricE(String value) {
        this.contStaStaRestricE = value;
    }

    /**
     * contTollResIrtTr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTollResIrtTr() {
        return contTollResIrtTr;
    }

    /**
     * contTollResIrtTr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTollResIrtTr(String value) {
        this.contTollResIrtTr = value;
    }

    /**
     * contTollResIrtTrA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTollResIrtTrA() {
        return contTollResIrtTrA;
    }

    /**
     * contTollResIrtTrA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTollResIrtTrA(String value) {
        this.contTollResIrtTrA = value;
    }

    /**
     * contTollResIrtTrE 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTollResIrtTrE() {
        return contTollResIrtTrE;
    }

    /**
     * contTollResIrtTrE 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTollResIrtTrE(String value) {
        this.contTollResIrtTrE = value;
    }

    /**
     * invldNumDldItrcTA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvldNumDldItrcTA() {
        return invldNumDldItrcTA;
    }

    /**
     * invldNumDldItrcTA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvldNumDldItrcTA(String value) {
        this.invldNumDldItrcTA = value;
    }

    /**
     * announcement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncement() {
        return announcement;
    }

    /**
     * announcement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncement(String value) {
        this.announcement = value;
    }

    /**
     * vmHuntGroupExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVMHuntGroupExt() {
        return vmHuntGroupExt;
    }

    /**
     * vmHuntGroupExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVMHuntGroupExt(String value) {
        this.vmHuntGroupExt = value;
    }

    /**
     * maximumLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumLength() {
        return maximumLength;
    }

    /**
     * maximumLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumLength(String value) {
        this.maximumLength = value;
    }

    /**
     * minimumDigLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumDigLength() {
        return minimumDigLength;
    }

    /**
     * minimumDigLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumDigLength(String value) {
        this.minimumDigLength = value;
    }

    /**
     * repCallWaitInterv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepCallWaitInterv() {
        return repCallWaitInterv;
    }

    /**
     * repCallWaitInterv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepCallWaitInterv(String value) {
        this.repCallWaitInterv = value;
    }

    /**
     * applyInrcptLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyInrcptLocal() {
        return applyInrcptLocal;
    }

    /**
     * applyInrcptLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyInrcptLocal(String value) {
        this.applyInrcptLocal = value;
    }

    /**
     * enforcePNTPNTRest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnforcePNTPNTRest() {
        return enforcePNTPNTRest;
    }

    /**
     * enforcePNTPNTRest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnforcePNTPNTRest(String value) {
        this.enforcePNTPNTRest = value;
    }

    /**
     * numbSessionwAllo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumbSessionwAllo() {
        return numbSessionwAllo;
    }

    /**
     * numbSessionwAllo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumbSessionwAllo(String value) {
        this.numbSessionwAllo = value;
    }

    /**
     * congestionTimer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongestionTimer() {
        return congestionTimer;
    }

    /**
     * congestionTimer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongestionTimer(String value) {
        this.congestionTimer = value;
    }

    /**
     * sessTimeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessTimeout() {
        return sessTimeout;
    }

    /**
     * sessTimeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessTimeout(String value) {
        this.sessTimeout = value;
    }

    /**
     * congnClearedTr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongnClearedTr() {
        return congnClearedTr;
    }

    /**
     * congnClearedTr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongnClearedTr(String value) {
        this.congnClearedTr = value;
    }

    /**
     * signalingGroupLt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalingGroupLt() {
        return signalingGroupLt;
    }

    /**
     * signalingGroupLt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalingGroupLt(String value) {
        this.signalingGroupLt = value;
    }

    /**
     * dcsMessageFormat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSMessageFormat() {
        return dcsMessageFormat;
    }

    /**
     * dcsMessageFormat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSMessageFormat(String value) {
        this.dcsMessageFormat = value;
    }

    /**
     * delay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelay() {
        return delay;
    }

    /**
     * delay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelay(String value) {
        this.delay = value;
    }

    /**
     * clearCallrInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearCallrInfo() {
        return clearCallrInfo;
    }

    /**
     * clearCallrInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearCallrInfo(String value) {
        this.clearCallrInfo = value;
    }

    /**
     * sysParRingerOffwithAuto 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysParRingerOffwithAuto() {
        return sysParRingerOffwithAuto;
    }

    /**
     * sysParRingerOffwithAuto 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysParRingerOffwithAuto(String value) {
        this.sysParRingerOffwithAuto = value;
    }

    /**
     * recCTAPSATTIHisLg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCTAPSATTIHisLg() {
        return recCTAPSATTIHisLg;
    }

    /**
     * recCTAPSATTIHisLg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCTAPSATTIHisLg(String value) {
        this.recCTAPSATTIHisLg = value;
    }

    /**
     * enhPSALocDisIfoEn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhPSALocDisIfoEn() {
        return enhPSALocDisIfoEn;
    }

    /**
     * enhPSALocDisIfoEn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhPSALocDisIfoEn(String value) {
        this.enhPSALocDisIfoEn = value;
    }

    /**
     * autoCallbNoAnTOIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCallbNoAnTOIn() {
        return autoCallbNoAnTOIn;
    }

    /**
     * autoCallbNoAnTOIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCallbNoAnTOIn(String value) {
        this.autoCallbNoAnTOIn = value;
    }

    /**
     * defCORPSADissSets 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefCORPSADissSets() {
        return defCORPSADissSets;
    }

    /**
     * defCORPSADissSets 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefCORPSADissSets(String value) {
        this.defCORPSADissSets = value;
    }

    /**
     * ctaEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTAEnabled() {
        return ctaEnabled;
    }

    /**
     * ctaEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTAEnabled(String value) {
        this.ctaEnabled = value;
    }

    /**
     * resSlotAttPriQue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResSlotAttPriQue() {
        return resSlotAttPriQue;
    }

    /**
     * resSlotAttPriQue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResSlotAttPriQue(String value) {
        this.resSlotAttPriQue = value;
    }

    /**
     * timebfrOffhookAlt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimebfrOffhookAlt() {
        return timebfrOffhookAlt;
    }

    /**
     * timebfrOffhookAlt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimebfrOffhookAlt(String value) {
        this.timebfrOffhookAlt = value;
    }

    /**
     * emergAccRedirExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergAccRedirExt() {
        return emergAccRedirExt;
    }

    /**
     * emergAccRedirExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergAccRedirExt(String value) {
        this.emergAccRedirExt = value;
    }

    /**
     * emergClsAldAttQue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergClsAldAttQue() {
        return emergClsAldAttQue;
    }

    /**
     * emergClsAldAttQue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergClsAldAttQue(String value) {
        this.emergClsAldAttQue = value;
    }

    /**
     * callPickupAlert 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPickupAlert() {
        return callPickupAlert;
    }

    /**
     * callPickupAlert 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPickupAlert(String value) {
        this.callPickupAlert = value;
    }

    /**
     * tempBrgApcClPickU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempBrgApcClPickU() {
        return tempBrgApcClPickU;
    }

    /**
     * tempBrgApcClPickU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempBrgApcClPickU(String value) {
        this.tempBrgApcClPickU = value;
    }

    /**
     * callPickupIntrcmC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPickupIntrcmC() {
        return callPickupIntrcmC;
    }

    /**
     * callPickupIntrcmC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPickupIntrcmC(String value) {
        this.callPickupIntrcmC = value;
    }

    /**
     * directedCallPckup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectedCallPckup() {
        return directedCallPckup;
    }

    /**
     * directedCallPckup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectedCallPckup(String value) {
        this.directedCallPckup = value;
    }

    /**
     * callPrkTOInterMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPrkTOInterMin() {
        return callPrkTOInterMin;
    }

    /**
     * callPrkTOInterMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPrkTOInterMin(String value) {
        this.callPrkTOInterMin = value;
    }

    /**
     * extGroupCallPckup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtGroupCallPckup() {
        return extGroupCallPckup;
    }

    /**
     * extGroupCallPckup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtGroupCallPckup(String value) {
        this.extGroupCallPckup = value;
    }

    /**
     * dxPagCalPkTimOrig 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDxPagCalPkTimOrig() {
        return dxPagCalPkTimOrig;
    }

    /**
     * dxPagCalPkTimOrig 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDxPagCalPkTimOrig(String value) {
        this.dxPagCalPkTimOrig = value;
    }

    /**
     * contOutResInrTrmt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContOutResInrTrmt() {
        return contOutResInrTrmt;
    }

    /**
     * contOutResInrTrmt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContOutResInrTrmt(String value) {
        this.contOutResInrTrmt = value;
    }

    /**
     * contTerResDoNtDst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTerResDoNtDst() {
        return contTerResDoNtDst;
    }

    /**
     * contTerResDoNtDst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTerResDoNtDst(String value) {
        this.contTerResDoNtDst = value;
    }

    /**
     * contStaStaRestric 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStaStaRestric() {
        return contStaStaRestric;
    }

    /**
     * contStaStaRestric 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStaStaRestric(String value) {
        this.contStaStaRestric = value;
    }

    /**
     * authCodesEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesEnabled() {
        return authCodesEnabled;
    }

    /**
     * authCodesEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesEnabled(String value) {
        this.authCodesEnabled = value;
    }

    /**
     * authCodeLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodeLength() {
        return authCodeLength;
    }

    /**
     * authCodeLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodeLength(String value) {
        this.authCodeLength = value;
    }

    /**
     * authCodeCancelSym 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodeCancelSym() {
        return authCodeCancelSym;
    }

    /**
     * authCodeCancelSym 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodeCancelSym(String value) {
        this.authCodeCancelSym = value;
    }

    /**
     * atteTimeOutFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtteTimeOutFlag() {
        return atteTimeOutFlag;
    }

    /**
     * atteTimeOutFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtteTimeOutFlag(String value) {
        this.atteTimeOutFlag = value;
    }

    /**
     * displAuthorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplAuthorCode() {
        return displAuthorCode;
    }

    /**
     * displAuthorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplAuthorCode(String value) {
        this.displAuthorCode = value;
    }

    /**
     * offPmTnDctTOInSec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPmTnDctTOInSec() {
        return offPmTnDctTOInSec;
    }

    /**
     * offPmTnDctTOInSec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPmTnDctTOInSec(String value) {
        this.offPmTnDctTOInSec = value;
    }

    /**
     * contrTollResRepla 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrTollResRepla() {
        return contrTollResRepla;
    }

    /**
     * contrTollResRepla 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrTollResRepla(String value) {
        this.contrTollResRepla = value;
    }

    /**
     * sysPrinterEndpoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysPrinterEndpoint() {
        return sysPrinterEndpoint;
    }

    /**
     * sysPrinterEndpoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysPrinterEndpoint(String value) {
        this.sysPrinterEndpoint = value;
    }

    /**
     * linesPerPage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinesPerPage() {
        return linesPerPage;
    }

    /**
     * linesPerPage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinesPerPage(String value) {
        this.linesPerPage = value;
    }

    /**
     * emerExtForwMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmerExtForwMin() {
        return emerExtForwMin;
    }

    /**
     * emerExtForwMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmerExtForwMin(String value) {
        this.emerExtForwMin = value;
    }

    /**
     * switchName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchName() {
        return switchName;
    }

    /**
     * switchName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchName(String value) {
        this.switchName = value;
    }

    /**
     * applyMCTWarnTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyMCTWarnTone() {
        return applyMCTWarnTone;
    }

    /**
     * applyMCTWarnTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyMCTWarnTone(String value) {
        this.applyMCTWarnTone = value;
    }

    /**
     * mctVoiceRecTrGrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCTVoiceRecTrGrp() {
        return mctVoiceRecTrGrp;
    }

    /**
     * mctVoiceRecTrGrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCTVoiceRecTrGrp(String value) {
        this.mctVoiceRecTrGrp = value;
    }

    /**
     * delSendRelSecs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelSendRelSecs() {
        return delSendRelSecs;
    }

    /**
     * delSendRelSecs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelSendRelSecs(String value) {
        this.delSendRelSecs = value;
    }

    /**
     * sendAllCallsAppls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAllCallsAppls() {
        return sendAllCallsAppls;
    }

    /**
     * sendAllCallsAppls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAllCallsAppls(String value) {
        this.sendAllCallsAppls = value;
    }

    /**
     * autoInspectSACs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoInspectSACs() {
        return autoInspectSACs;
    }

    /**
     * autoInspectSACs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoInspectSACs(String value) {
        this.autoInspectSACs = value;
    }

    /**
     * aararsDialToneReq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARARSDialToneReq() {
        return aararsDialToneReq;
    }

    /**
     * aararsDialToneReq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARARSDialToneReq(String value) {
        this.aararsDialToneReq = value;
    }

    /**
     * createUCID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUCID() {
        return createUCID;
    }

    /**
     * createUCID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUCID(String value) {
        this.createUCID = value;
    }

    /**
     * ucidNetworkNodeID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCIDNetworkNodeID() {
        return ucidNetworkNodeID;
    }

    /**
     * ucidNetworkNodeID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCIDNetworkNodeID(String value) {
        this.ucidNetworkNodeID = value;
    }

    /**
     * pblcNetTrkCnfCall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPblcNetTrkCnfCall() {
        return pblcNetTrkCnfCall;
    }

    /**
     * pblcNetTrkCnfCall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPblcNetTrkCnfCall(String value) {
        this.pblcNetTrkCnfCall = value;
    }

    /**
     * cnfPrtPubNrkTrk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfPrtPubNrkTrk() {
        return cnfPrtPubNrkTrk;
    }

    /**
     * cnfPrtPubNrkTrk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfPrtPubNrkTrk(String value) {
        this.cnfPrtPubNrkTrk = value;
    }

    /**
     * cnfPrtWoPubNrkTrk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfPrtWoPubNrkTrk() {
        return cnfPrtWoPubNrkTrk;
    }

    /**
     * cnfPrtWoPubNrkTrk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfPrtWoPubNrkTrk(String value) {
        this.cnfPrtWoPubNrkTrk = value;
    }

    /**
     * nightSerDisTimeSc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNightSerDisTimeSc() {
        return nightSerDisTimeSc;
    }

    /**
     * nightSerDisTimeSc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNightSerDisTimeSc(String value) {
        this.nightSerDisTimeSc = value;
    }

    /**
     * shrtInrdgtTimerSc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtInrdgtTimerSc() {
        return shrtInrdgtTimerSc;
    }

    /**
     * shrtInrdgtTimerSc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtInrdgtTimerSc(String value) {
        this.shrtInrdgtTimerSc = value;
    }

    /**
     * uAnsDIDCalTmrSecs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUAnsDIDCalTmrSecs() {
        return uAnsDIDCalTmrSecs;
    }

    /**
     * uAnsDIDCalTmrSecs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUAnsDIDCalTmrSecs(String value) {
        this.uAnsDIDCalTmrSecs = value;
    }

    /**
     * lnItrcptToneTmrSc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnItrcptToneTmrSc() {
        return lnItrcptToneTmrSc;
    }

    /**
     * lnItrcptToneTmrSc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnItrcptToneTmrSc(String value) {
        this.lnItrcptToneTmrSc = value;
    }

    /**
     * lngHldRecTmerSecs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngHldRecTmerSecs() {
        return lngHldRecTmerSecs;
    }

    /**
     * lngHldRecTmerSecs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngHldRecTmerSecs(String value) {
        this.lngHldRecTmerSecs = value;
    }

    /**
     * musicSlnceTraTrnk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicSlnceTraTrnk() {
        return musicSlnceTraTrnk;
    }

    /**
     * musicSlnceTraTrnk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicSlnceTraTrnk(String value) {
        this.musicSlnceTraTrnk = value;
    }

    /**
     * rstShftTmrSecs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstShftTmrSecs() {
        return rstShftTmrSecs;
    }

    /**
     * rstShftTmrSecs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstShftTmrSecs(String value) {
        this.rstShftTmrSecs = value;
    }

    /**
     * staCallTnsRclTrSc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaCallTnsRclTrSc() {
        return staCallTnsRclTrSc;
    }

    /**
     * staCallTnsRclTrSc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaCallTnsRclTrSc(String value) {
        this.staCallTnsRclTrSc = value;
    }

    /**
     * didBusyTreatment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIDBusyTreatment() {
        return didBusyTreatment;
    }

    /**
     * didBusyTreatment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIDBusyTreatment(String value) {
        this.didBusyTreatment = value;
    }

    /**
     * invldNumDldItrcTr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvldNumDldItrcTr() {
        return invldNumDldItrcTr;
    }

    /**
     * invldNumDldItrcTr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvldNumDldItrcTr(String value) {
        this.invldNumDldItrcTr = value;
    }

    /**
     * alAarArsAcDidDiod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlAarArsAcDidDiod() {
        return alAarArsAcDidDiod;
    }

    /**
     * alAarArsAcDidDiod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlAarArsAcDidDiod(String value) {
        this.alAarArsAcDidDiod = value;
    }

    /**
     * alANIResAARARS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlANIResAARARS() {
        return alANIResAARARS;
    }

    /**
     * alANIResAARARS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlANIResAARARS(String value) {
        this.alANIResAARARS = value;
    }

    /**
     * useTrCOROutTrDsct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrCOROutTrDsct() {
        return useTrCOROutTrDsct;
    }

    /**
     * useTrCOROutTrDsct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrCOROutTrDsct(String value) {
        this.useTrCOROutTrDsct = value;
    }

    /**
     * numericDisplay7405ND 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericDisplay7405ND() {
        return numericDisplay7405ND;
    }

    /**
     * numericDisplay7405ND 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericDisplay7405ND(String value) {
        this.numericDisplay7405ND = value;
    }

    /**
     * numericDisplay7434ND 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericDisplay7434ND() {
        return numericDisplay7434ND;
    }

    /**
     * numericDisplay7434ND 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericDisplay7434ND(String value) {
        this.numericDisplay7434ND = value;
    }

    /**
     * autoStart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoStart() {
        return autoStart;
    }

    /**
     * autoStart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoStart(String value) {
        this.autoStart = value;
    }

    /**
     * autoHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoHold() {
        return autoHold;
    }

    /**
     * autoHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoHold(String value) {
        this.autoHold = value;
    }

    /**
     * emuInactivityInterval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMUInactivityInterval() {
        return emuInactivityInterval;
    }

    /**
     * emuInactivityInterval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMUInactivityInterval(String value) {
        this.emuInactivityInterval = value;
    }

    /**
     * didTieISDNSIPInTr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIDTieISDNSIPInTr() {
        return didTieISDNSIPInTr;
    }

    /**
     * didTieISDNSIPInTr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIDTieISDNSIPInTr(String value) {
        this.didTieISDNSIPInTr = value;
    }

    /**
     * attendantTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantTone() {
        return attendantTone;
    }

    /**
     * attendantTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantTone(String value) {
        this.attendantTone = value;
    }

    /**
     * bridgingTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgingTone() {
        return bridgingTone;
    }

    /**
     * bridgingTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgingTone(String value) {
        this.bridgingTone = value;
    }

    /**
     * conferenceTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceTone() {
        return conferenceTone;
    }

    /**
     * conferenceTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceTone(String value) {
        this.conferenceTone = value;
    }

    /**
     * intrusionTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrusionTone() {
        return intrusionTone;
    }

    /**
     * intrusionTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrusionTone(String value) {
        this.intrusionTone = value;
    }

    /**
     * specialDialTone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialDialTone() {
        return specialDialTone;
    }

    /**
     * specialDialTone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialDialTone(String value) {
        this.specialDialTone = value;
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
     * internal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternal() {
        return internal;
    }

    /**
     * internal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternal(String value) {
        this.internal = value;
    }

    /**
     * external 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternal() {
        return external;
    }

    /**
     * external 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternal(String value) {
        this.external = value;
    }

    /**
     * priority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * priority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * intAtoAnAtdExtTra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntAtoAnAtdExtTra() {
        return intAtoAnAtdExtTra;
    }

    /**
     * intAtoAnAtdExtTra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntAtoAnAtdExtTra(String value) {
        this.intAtoAnAtdExtTra = value;
    }

    /**
     * attOriginateCalls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttOriginateCalls() {
        return attOriginateCalls;
    }

    /**
     * attOriginateCalls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttOriginateCalls(String value) {
        this.attOriginateCalls = value;
    }

    /**
     * dtmfTeFbkSglVRUCn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMFTeFbkSglVRUCn() {
        return dtmfTeFbkSglVRUCn;
    }

    /**
     * dtmfTeFbkSglVRUCn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMFTeFbkSglVRUCn(String value) {
        this.dtmfTeFbkSglVRUCn = value;
    }

    /**
     * disconnection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnection() {
        return disconnection;
    }

    /**
     * disconnection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnection(String value) {
        this.disconnection = value;
    }

    /**
     * abortTransfer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbortTransfer() {
        return abortTransfer;
    }

    /**
     * abortTransfer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbortTransfer(String value) {
        this.abortTransfer = value;
    }

    /**
     * transfrUponHangUp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfrUponHangUp() {
        return transfrUponHangUp;
    }

    /**
     * transfrUponHangUp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfrUponHangUp(String value) {
        this.transfrUponHangUp = value;
    }

    /**
     * abtConfUponHangUp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbtConfUponHangUp() {
        return abtConfUponHangUp;
    }

    /**
     * abtConfUponHangUp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbtConfUponHangUp(String value) {
        this.abtConfUponHangUp = value;
    }

    /**
     * noHoldConfTimeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoHoldConfTimeout() {
        return noHoldConfTimeout;
    }

    /**
     * noHoldConfTimeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoHoldConfTimeout(String value) {
        this.noHoldConfTimeout = value;
    }

    /**
     * noDialToneConfrnc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoDialToneConfrnc() {
        return noDialToneConfrnc;
    }

    /**
     * noDialToneConfrnc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoDialToneConfrnc(String value) {
        this.noDialToneConfrnc = value;
    }

    /**
     * selLnApprConfrnc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelLnApprConfrnc() {
        return selLnApprConfrnc;
    }

    /**
     * selLnApprConfrnc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelLnApprConfrnc(String value) {
        this.selLnApprConfrnc = value;
    }

    /**
     * unhold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnhold() {
        return unhold;
    }

    /**
     * unhold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnhold(String value) {
        this.unhold = value;
    }

    /**
     * allowTwoObserversInSameCall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowTwoObserversInSameCall() {
        return allowTwoObserversInSameCall;
    }

    /**
     * allowTwoObserversInSameCall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowTwoObserversInSameCall(String value) {
        this.allowTwoObserversInSameCall = value;
    }

    /**
     * serviceLevelAlgorithmForSLM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevelAlgorithmForSLM() {
        return serviceLevelAlgorithmForSLM;
    }

    /**
     * serviceLevelAlgorithmForSLM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevelAlgorithmForSLM(String value) {
        this.serviceLevelAlgorithmForSLM = value;
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
     * ecdExceptionTimer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcdExceptionTimer() {
        return ecdExceptionTimer;
    }

    /**
     * ecdExceptionTimer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcdExceptionTimer(String value) {
        this.ecdExceptionTimer = value;
    }

    /**
     * ecdServiceRouteTimer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECDServiceRouteTimer() {
        return ecdServiceRouteTimer;
    }

    /**
     * ecdServiceRouteTimer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECDServiceRouteTimer(String value) {
        this.ecdServiceRouteTimer = value;
    }

    /**
     * Gets the value of the stationSysWRetPn1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationSysWRetPn1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationSysWRetPn1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStationSysWRetPn1() {
        if (stationSysWRetPn1 == null) {
            stationSysWRetPn1 = new ArrayList<ArrayType>();
        }
        return this.stationSysWRetPn1;
    }

    /**
     * Gets the value of the rdoCoDownlServPn1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rdoCoDownlServPn1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRdoCoDownlServPn1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRdoCoDownlServPn1() {
        if (rdoCoDownlServPn1 == null) {
            rdoCoDownlServPn1 = new ArrayList<ArrayType>();
        }
        return this.rdoCoDownlServPn1;
    }

    /**
     * Gets the value of the dcsMessageFormat1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcsMessageFormat1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCSMessageFormat1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDCSMessageFormat1() {
        if (dcsMessageFormat1 == null) {
            dcsMessageFormat1 = new ArrayList<ArrayType>();
        }
        return this.dcsMessageFormat1;
    }

}
