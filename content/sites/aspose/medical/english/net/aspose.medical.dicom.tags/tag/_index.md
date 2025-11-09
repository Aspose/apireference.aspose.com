---
title: Tag
second_title: Aspose.Medical for .NET API Reference
description: Encapsulates DICOM Tag. https//dicom.nema.org/medical/dicom/current/output/chtml/part06/chapter_6.htmlhttps//dicom.nema.org/medical/dicom/current/output/chtml/part06/chapter_6.html.
type: docs
weight: 1100
url: /net/aspose.medical.dicom.tags/tag/
---

## Tag class

Encapsulates DICOM Tag. [https://dicom.nema.org/medical/dicom/current/output/chtml/part06/chapter_6.html](https://dicom.nema.org/medical/dicom/current/output/chtml/part06/chapter_6.html).

```csharp
public sealed class Tag : IComparable<Tag>, IEquatable<Tag>
```

## Properties

| Name | Description |
| --- | --- |
| [Creator](../../aspose.medical.dicom.tags/tag/creator) { get; set; } | Private creator of this tag. [https://dicom.nema.org/medical/dicom/current/output/chtml/part05/sect_7.8.html#sect_7.8.1](https://dicom.nema.org/medical/dicom/current/output/chtml/part05/sect_7.8.html#sect_7.8.1) Read / Write [`PrivateCreator`](../privatecreator). |
| [Element](../../aspose.medical.dicom.tags/tag/element) { get; set; } | Tag Element. The 2nd 4 numbers in DICOM tag definition (e.g. for DICOM Tag (0028,0010), 0010 - Element). Read-only UInt16. |
| [Group](../../aspose.medical.dicom.tags/tag/group) { get; set; } | Tag Group. The 1st 4 numbers in DICOM tag definition (e.g. for DICOM Tag (0028,0010), 0028 - Group). Read-only UInt16. |
| [IsPrivate](../../aspose.medical.dicom.tags/tag/isprivate) { get; } | Indicates whether the tag is private or not. Read-only Boolean. |
| [Metadata](../../aspose.medical.dicom.tags/tag/metadata) { get; } | Contains additional meta-information about this tag, such as: keyword, description, value multiplicity, default value representation, etc. Read-only [`TagMetadata`](../tagmetadata). |

## Methods

| Name | Description |
| --- | --- |
| static [GetOrCreate](../../aspose.medical.dicom.tags/tag/getorcreate)(ushort, ushort) |  |
| static [Parse](../../aspose.medical.dicom.tags/tag/parse)(ReadOnlySpan&lt;char&gt;, PrivateCreator?) | Converts text representation of a tag to typed value [`Tag`](../tag). The format is: ({Group},{Element}:{Creator}). [Creator] is optional. The parentheses are optional. |
| [CompareTo](../../aspose.medical.dicom.tags/tag/compareto)(Tag) |  |
| override [Equals](../../aspose.medical.dicom.tags/tag/equals#equals_1)(object) |  |
| [Equals](../../aspose.medical.dicom.tags/tag/equals#equals)(Tag) |  |
| override [GetHashCode](../../aspose.medical.dicom.tags/tag/gethashcode)() |  |
| override [ToString](../../aspose.medical.dicom.tags/tag/tostring)() |  |
| [operator ==](../../aspose.medical.dicom.tags/tag/op_equality) | Determines whether two specified tags have the same value. |
| [operator !=](../../aspose.medical.dicom.tags/tag/op_inequality) | Determines whether two specified tags have different values. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [AbortFlagRETIRED](../../aspose.medical.dicom.tags/tag/abortflagretired) | (4010,1024) VR=CS VM=1 Abort Flag (RETIRED). |
| static readonly [AbortReasonRETIRED](../../aspose.medical.dicom.tags/tag/abortreasonretired) | (4010,1021) VR=CS VM=1-n Abort Reason (RETIRED). |
| static readonly [AbsoluteChannelDisplayScale](../../aspose.medical.dicom.tags/tag/absolutechanneldisplayscale) | (003A,0248) VR=FL VM=1 Absolute Channel Display Scale. |
| static readonly [AbsoluteDosimetricObjectiveFlag](../../aspose.medical.dicom.tags/tag/absolutedosimetricobjectiveflag) | (3010,0073) VR=CS VM=1 Absolute Dosimetric Objective Flag. |
| static readonly [AbsorbedDoseToMetersetRatio](../../aspose.medical.dicom.tags/tag/absorbeddosetometersetratio) | (300C,0121) VR=FD VM=1 Absorbed Dose to Meterset Ratio. |
| static readonly [AbstractPriorCodeSequence](../../aspose.medical.dicom.tags/tag/abstractpriorcodesequence) | (0072,003E) VR=SQ VM=1 Abstract Prior Code Sequence. |
| static readonly [AbstractPriorValue](../../aspose.medical.dicom.tags/tag/abstractpriorvalue) | (0072,003C) VR=SS VM=2 Abstract Prior Value. |
| static readonly [Acceleration](../../aspose.medical.dicom.tags/tag/acceleration) | (0016,0034) VR=DS VM=1 Acceleration. |
| static readonly [AccessionNumber](../../aspose.medical.dicom.tags/tag/accessionnumber) | (0008,0050) VR=SH VM=1 Accession Number. |
| static readonly [AccessoryCode](../../aspose.medical.dicom.tags/tag/accessorycode) | (300A,00F9) VR=LO VM=1 Accessory Code. |
| static readonly [AcousticCouplingMediumCodeSequence](../../aspose.medical.dicom.tags/tag/acousticcouplingmediumcodesequence) | (0018,982A) VR=SQ VM=1 Acoustic Coupling Medium Code Sequence. |
| static readonly [AcousticCouplingMediumFlag](../../aspose.medical.dicom.tags/tag/acousticcouplingmediumflag) | (0018,9829) VR=CS VM=1 Acoustic Coupling Medium Flag. |
| static readonly [AcousticCouplingMediumSoundSpeed](../../aspose.medical.dicom.tags/tag/acousticcouplingmediumsoundspeed) | (0018,9834) VR=FD VM=1 Acoustic Coupling Medium Sound Speed. |
| static readonly [AcousticCouplingMediumTemperature](../../aspose.medical.dicom.tags/tag/acousticcouplingmediumtemperature) | (0018,982B) VR=FD VM=1 Acoustic Coupling Medium Temperature. |
| static readonly [AcquiredImageAreaDoseProduct](../../aspose.medical.dicom.tags/tag/acquiredimageareadoseproduct) | (0018,9473) VR=FL VM=1 Acquired Image Area Dose Product. |
| static readonly [AcquiredSoundpathLengthRETIRED](../../aspose.medical.dicom.tags/tag/acquiredsoundpathlengthretired) | (0014,4031) VR=DS VM=1 Acquired Soundpath Length (RETIRED). |
| static readonly [AcquiredSubtractionMaskFlag](../../aspose.medical.dicom.tags/tag/acquiredsubtractionmaskflag) | (0018,11B2) VR=CS VM=1 Acquired Subtraction Mask Flag. |
| static readonly [AcquisitionCommentsRETIRED](../../aspose.medical.dicom.tags/tag/acquisitioncommentsretired) | (0018,4000) VR=LT VM=1 Acquisition Comments (RETIRED). |
| static readonly [AcquisitionCompressionTypeRETIRED](../../aspose.medical.dicom.tags/tag/acquisitioncompressiontyperetired) | (0014,4032) VR=CS VM=1 Acquisition Compression Type (RETIRED). |
| static readonly [AcquisitionContextDescription](../../aspose.medical.dicom.tags/tag/acquisitioncontextdescription) | (0040,0556) VR=ST VM=1 Acquisition Context Description. |
| static readonly [AcquisitionContextSequence](../../aspose.medical.dicom.tags/tag/acquisitioncontextsequence) | (0040,0555) VR=SQ VM=1 Acquisition Context Sequence. |
| static readonly [AcquisitionContrast](../../aspose.medical.dicom.tags/tag/acquisitioncontrast) | (0008,9209) VR=CS VM=1 Acquisition Contrast. |
| static readonly [AcquisitionDate](../../aspose.medical.dicom.tags/tag/acquisitiondate) | (0008,0022) VR=DA VM=1 Acquisition Date. |
| static readonly [AcquisitionDateTime](../../aspose.medical.dicom.tags/tag/acquisitiondatetime) | (0008,002A) VR=DT VM=1 Acquisition DateTime. |
| static readonly [AcquisitionDeviceProcessingCode](../../aspose.medical.dicom.tags/tag/acquisitiondeviceprocessingcode) | (0018,1401) VR=LO VM=1 Acquisition Device Processing Code. |
| static readonly [AcquisitionDeviceProcessingDescription](../../aspose.medical.dicom.tags/tag/acquisitiondeviceprocessingdescription) | (0018,1400) VR=LO VM=1 Acquisition Device Processing Description. |
| static readonly [AcquisitionDeviceSequence](../../aspose.medical.dicom.tags/tag/acquisitiondevicesequence) | (3002,0117) VR=SQ VM=1 Acquisition Device Sequence. |
| static readonly [AcquisitionDeviceTypeCodeSequence](../../aspose.medical.dicom.tags/tag/acquisitiondevicetypecodesequence) | (0022,0015) VR=SQ VM=1 Acquisition Device Type Code Sequence. |
| static readonly [AcquisitionDuration](../../aspose.medical.dicom.tags/tag/acquisitionduration) | (0018,9073) VR=FD VM=1 Acquisition Duration. |
| static readonly [AcquisitionEndLocationSequence](../../aspose.medical.dicom.tags/tag/acquisitionendlocationsequence) | (0018,9932) VR=SQ VM=1 Acquisition End Location Sequence. |
| static readonly [AcquisitionFieldOfViewLabel](../../aspose.medical.dicom.tags/tag/acquisitionfieldofviewlabel) | (0018,11BB) VR=LO VM=1 Acquisition Field of View Label. |
| static readonly [AcquisitionFrameRateRETIRED](../../aspose.medical.dicom.tags/tag/acquisitionframerateretired) | (0014,6002) VR=DS VM=1 Acquisition Frame Rate (RETIRED). |
| static readonly [AcquisitionImageCounterRETIRED](../../aspose.medical.dicom.tags/tag/acquisitionimagecounterretired) | (0014,6020) VR=UV VM=1 Acquisition Image Counter (RETIRED). |
| static readonly [AcquisitionIndex](../../aspose.medical.dicom.tags/tag/acquisitionindex) | (0020,9518) VR=US VM=1-n Acquisition Index. |
| static readonly [AcquisitionInitiationSequence](../../aspose.medical.dicom.tags/tag/acquisitioninitiationsequence) | (3002,0135) VR=SQ VM=1 Acquisition Initiation Sequence. |
| static readonly [AcquisitionMatrix](../../aspose.medical.dicom.tags/tag/acquisitionmatrix) | (0018,1310) VR=US VM=4 Acquisition Matrix. |
| static readonly [AcquisitionMethod](../../aspose.medical.dicom.tags/tag/acquisitionmethod) | (3002,012A) VR=CS VM=1 Acquisition Method. |
| static readonly [AcquisitionMethodAlgorithmSequence](../../aspose.medical.dicom.tags/tag/acquisitionmethodalgorithmsequence) | (0022,1423) VR=SQ VM=1 Acquisition Method Algorithm Sequence. |
| static readonly [AcquisitionMethodCodeSequence](../../aspose.medical.dicom.tags/tag/acquisitionmethodcodesequence) | (0022,1420) VR=SQ VM=1 Acquisition Method Code Sequence. |
| static readonly [AcquisitionMode](../../aspose.medical.dicom.tags/tag/acquisitionmode) | (0018,11B0) VR=LO VM=1 Acquisition Mode. |
| static readonly [AcquisitionMotion](../../aspose.medical.dicom.tags/tag/acquisitionmotion) | (0018,9930) VR=CS VM=1 Acquisition Motion. |
| static readonly [AcquisitionNumber](../../aspose.medical.dicom.tags/tag/acquisitionnumber) | (0020,0012) VR=IS VM=1 Acquisition Number. |
| static readonly [AcquisitionProtocolDescription](../../aspose.medical.dicom.tags/tag/acquisitionprotocoldescription) | (0018,9424) VR=LT VM=1 Acquisition Protocol Description. |
| static readonly [AcquisitionProtocolElementSequence](../../aspose.medical.dicom.tags/tag/acquisitionprotocolelementsequence) | (0018,9920) VR=SQ VM=1 Acquisition Protocol Element Sequence. |
| static readonly [AcquisitionProtocolElementSpecificationSequence](../../aspose.medical.dicom.tags/tag/acquisitionprotocolelementspecificationsequence) | (0018,991F) VR=SQ VM=1 Acquisition Protocol Element Specification Sequence. |
| static readonly [AcquisitionProtocolName](../../aspose.medical.dicom.tags/tag/acquisitionprotocolname) | (0018,9423) VR=LO VM=1 Acquisition Protocol Name. |
| static readonly [AcquisitionSampleSizeRETIRED](../../aspose.medical.dicom.tags/tag/acquisitionsamplesizeretired) | (0014,4033) VR=IS VM=1 Acquisition Sample Size (RETIRED). |
| static readonly [AcquisitionSignalType](../../aspose.medical.dicom.tags/tag/acquisitionsignaltype) | (3002,0129) VR=CS VM=1 Acquisition Signal Type. |
| static readonly [AcquisitionsInSeriesRETIRED](../../aspose.medical.dicom.tags/tag/acquisitionsinseriesretired) | (0020,1001) VR=IS VM=1 Acquisitions in Series (RETIRED). |
| static readonly [AcquisitionsInStudyRETIRED](../../aspose.medical.dicom.tags/tag/acquisitionsinstudyretired) | (0020,1004) VR=IS VM=1 Acquisitions in Study (RETIRED). |
| static readonly [AcquisitionStartCondition](../../aspose.medical.dicom.tags/tag/acquisitionstartcondition) | (0018,0073) VR=CS VM=1 Acquisition Start Condition. |
| static readonly [AcquisitionStartConditionData](../../aspose.medical.dicom.tags/tag/acquisitionstartconditiondata) | (0018,0074) VR=IS VM=1 Acquisition Start Condition Data. |
| static readonly [AcquisitionStartLocationSequence](../../aspose.medical.dicom.tags/tag/acquisitionstartlocationsequence) | (0018,9931) VR=SQ VM=1 Acquisition Start Location Sequence. |
| static readonly [AcquisitionStatusRETIRED](../../aspose.medical.dicom.tags/tag/acquisitionstatusretired) | (4010,1044) VR=CS VM=1 Acquisition Status (RETIRED). |
| static readonly [AcquisitionSubtaskIndex](../../aspose.medical.dicom.tags/tag/acquisitionsubtaskindex) | (3002,011D) VR=US VM=1 Acquisition Subtask Index. |
| static readonly [AcquisitionSubtaskSequence](../../aspose.medical.dicom.tags/tag/acquisitionsubtasksequence) | (3002,011A) VR=SQ VM=1 Acquisition Subtask Sequence. |
| static readonly [AcquisitionTaskApplicabilitySequence](../../aspose.medical.dicom.tags/tag/acquisitiontaskapplicabilitysequence) | (3002,0124) VR=SQ VM=1 Acquisition Task Applicability Sequence. |
| static readonly [AcquisitionTaskIndex](../../aspose.medical.dicom.tags/tag/acquisitiontaskindex) | (3002,011C) VR=US VM=1 Acquisition Task Index. |
| static readonly [AcquisitionTaskSequence](../../aspose.medical.dicom.tags/tag/acquisitiontasksequence) | (3002,0118) VR=SQ VM=1 Acquisition Task Sequence. |
| static readonly [AcquisitionTaskWorkitemCodeSequence](../../aspose.medical.dicom.tags/tag/acquisitiontaskworkitemcodesequence) | (3002,0119) VR=SQ VM=1 Acquisition Task Workitem Code Sequence. |
| static readonly [AcquisitionTerminationCondition](../../aspose.medical.dicom.tags/tag/acquisitionterminationcondition) | (0018,0071) VR=CS VM=1 Acquisition Termination Condition. |
| static readonly [AcquisitionTerminationConditionData](../../aspose.medical.dicom.tags/tag/acquisitionterminationconditiondata) | (0018,0075) VR=IS VM=1 Acquisition Termination Condition Data. |
| static readonly [AcquisitionTime](../../aspose.medical.dicom.tags/tag/acquisitiontime) | (0008,0032) VR=TM VM=1 Acquisition Time. |
| static readonly [AcquisitionTimeSynchronized](../../aspose.medical.dicom.tags/tag/acquisitiontimesynchronized) | (0018,1800) VR=CS VM=1 Acquisition Time Synchronized. |
| static readonly [AcquisitionType](../../aspose.medical.dicom.tags/tag/acquisitiontype) | (0018,9302) VR=CS VM=1 Acquisition Type. |
| static readonly [AcquisitionUID](../../aspose.medical.dicom.tags/tag/acquisitionuid) | (0008,0017) VR=UI VM=1 Acquisition UID. |
| static readonly [AcrossScanSpatialResolution](../../aspose.medical.dicom.tags/tag/acrossscanspatialresolution) | (0022,0048) VR=FL VM=1 Across-scan Spatial Resolution. |
| static readonly [ActionTypeID](../../aspose.medical.dicom.tags/tag/actiontypeid) | (0000,1008) VR=US VM=1 Action Type ID. |
| static readonly [ActiveApertureRETIRED](../../aspose.medical.dicom.tags/tag/activeapertureretired) | (0014,5100) VR=US VM=1 Active Aperture (RETIRED). |
| static readonly [ActiveImageAreaOverlayGroup](../../aspose.medical.dicom.tags/tag/activeimageareaoverlaygroup) | (0018,6070) VR=US VM=1 Active Image Area Overlay Group. |
| static readonly [ActiveSourceDiameter](../../aspose.medical.dicom.tags/tag/activesourcediameter) | (300A,0218) VR=DS VM=1 Active Source Diameter. |
| static readonly [ActiveSourceLength](../../aspose.medical.dicom.tags/tag/activesourcelength) | (300A,021A) VR=DS VM=1 Active Source Length. |
| static readonly [ActualCardiacTriggerDelayTime](../../aspose.medical.dicom.tags/tag/actualcardiactriggerdelaytime) | (0020,9252) VR=FD VM=1 Actual Cardiac Trigger Delay Time. |
| static readonly [ActualCardiacTriggerTimePriorToRPeak](../../aspose.medical.dicom.tags/tag/actualcardiactriggertimepriortorpeak) | (0020,9155) VR=FL VM=1 Actual Cardiac Trigger Time Prior To R-Peak. |
| static readonly [ActualEnvironmentalConditionsRETIRED](../../aspose.medical.dicom.tags/tag/actualenvironmentalconditionsretired) | (0014,1010) VR=ST VM=1 Actual Environmental Conditions (RETIRED). |
| static readonly [ActualFrameDuration](../../aspose.medical.dicom.tags/tag/actualframeduration) | (0018,1242) VR=IS VM=1 Actual Frame Duration. |
| static readonly [ActualHumanPerformersSequence](../../aspose.medical.dicom.tags/tag/actualhumanperformerssequence) | (0040,4035) VR=SQ VM=1 Actual Human Performers Sequence. |
| static readonly [ActualRespiratoryTriggerDelayTime](../../aspose.medical.dicom.tags/tag/actualrespiratorytriggerdelaytime) | (0020,9257) VR=FD VM=1 Actual Respiratory Trigger Delay Time. |
| static readonly [AdaptiveMapFormatRETIRED](../../aspose.medical.dicom.tags/tag/adaptivemapformatretired) | (0028,0730) VR=US VM=1 Adaptive Map Format (RETIRED). |
| static readonly [AddGrayScaleRETIRED](../../aspose.medical.dicom.tags/tag/addgrayscaleretired) | (0000,5150) VR=CS VM=1 Add Gray Scale (RETIRED). |
| static readonly [AddIntermediateSequence](../../aspose.medical.dicom.tags/tag/addintermediatesequence) | (0046,0101) VR=SQ VM=1 Add Intermediate Sequence. |
| static readonly [AdditionalDrugSequence](../../aspose.medical.dicom.tags/tag/additionaldrugsequence) | (0018,002A) VR=SQ VM=1 Additional Drug Sequence. |
| static readonly [AdditionalInspectionMethodSequenceRETIRED](../../aspose.medical.dicom.tags/tag/additionalinspectionmethodsequenceretired) | (4010,106F) VR=SQ VM=1 Additional Inspection Method Sequence (RETIRED). |
| static readonly [AdditionalInspectionSelectionCriteriaRETIRED](../../aspose.medical.dicom.tags/tag/additionalinspectionselectioncriteriaretired) | (4010,106E) VR=CS VM=1 Additional Inspection Selection Criteria (RETIRED). |
| static readonly [AdditionalParameterRecordingInstanceSequence](../../aspose.medical.dicom.tags/tag/additionalparameterrecordinginstancesequence) | (300A,0780) VR=SQ VM=1 Additional Parameter Recording Instance Sequence. |
| static readonly [AdditionalPatientHistory](../../aspose.medical.dicom.tags/tag/additionalpatienthistory) | (0010,21B0) VR=LT VM=1 Additional Patient History. |
| static readonly [AdditionalRTAccessoryDeviceSequence](../../aspose.medical.dicom.tags/tag/additionalrtaccessorydevicesequence) | (3002,0130) VR=SQ VM=1 Additional RT Accessory Device Sequence. |
| static readonly [AdditionalRTROIIdentificationCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/additionalrtroiidentificationcodesequenceretired) | (3006,00B9) VR=SQ VM=1 Additional RT ROI Identification Code Sequence (RETIRED). |
| static readonly [AdditionalScreeningPerformedRETIRED](../../aspose.medical.dicom.tags/tag/additionalscreeningperformedretired) | (4010,106D) VR=CS VM=1 Additional Screening Performed (RETIRED). |
| static readonly [AddNearSequence](../../aspose.medical.dicom.tags/tag/addnearsequence) | (0046,0100) VR=SQ VM=1 Add Near Sequence. |
| static readonly [AddOtherSequence](../../aspose.medical.dicom.tags/tag/addothersequence) | (0046,0102) VR=SQ VM=1 Add Other Sequence. |
| static readonly [AddPower](../../aspose.medical.dicom.tags/tag/addpower) | (0046,0104) VR=FD VM=1 Add Power. |
| static readonly [AddressTrialRETIRED](../../aspose.medical.dicom.tags/tag/addresstrialretired) | (0040,A353) VR=ST VM=1 Address (Trial) (RETIRED). |
| static readonly [AdministrationRouteCodeSequence](../../aspose.medical.dicom.tags/tag/administrationroutecodesequence) | (0054,0302) VR=SQ VM=1 Administration Route Code Sequence. |
| static readonly [AdmissionID](../../aspose.medical.dicom.tags/tag/admissionid) | (0038,0010) VR=LO VM=1 Admission ID. |
| static readonly [AdmittingDate](../../aspose.medical.dicom.tags/tag/admittingdate) | (0038,0020) VR=DA VM=1 Admitting Date. |
| static readonly [AdmittingDiagnosesCodeSequence](../../aspose.medical.dicom.tags/tag/admittingdiagnosescodesequence) | (0008,1084) VR=SQ VM=1 Admitting Diagnoses Code Sequence. |
| static readonly [AdmittingDiagnosesDescription](../../aspose.medical.dicom.tags/tag/admittingdiagnosesdescription) | (0008,1080) VR=LO VM=1-n Admitting Diagnoses Description. |
| static readonly [AdmittingTime](../../aspose.medical.dicom.tags/tag/admittingtime) | (0038,0021) VR=TM VM=1 Admitting Time. |
| static readonly [AdvancedBlendingSequence](../../aspose.medical.dicom.tags/tag/advancedblendingsequence) | (0070,1B01) VR=SQ VM=1 Advanced Blending Sequence. |
| static readonly [AffectedSOPClassUID](../../aspose.medical.dicom.tags/tag/affectedsopclassuid) | (0000,0002) VR=UI VM=1 Affected SOP Class UID. |
| static readonly [AffectedSOPInstanceUID](../../aspose.medical.dicom.tags/tag/affectedsopinstanceuid) | (0000,1000) VR=UI VM=1 Affected SOP Instance UID. |
| static readonly [AfterloaderChannelID](../../aspose.medical.dicom.tags/tag/afterloaderchannelid) | (300A,0273) VR=SH VM=1 Afterloader Channel ID. |
| static readonly [AgeCorrectedSensitivityDeviationAlgorithmSequence](../../aspose.medical.dicom.tags/tag/agecorrectedsensitivitydeviationalgorithmsequence) | (0024,0065) VR=SQ VM=1 Age Corrected Sensitivity Deviation Algorithm Sequence. |
| static readonly [AgeCorrectedSensitivityDeviationProbabilityValue](../../aspose.medical.dicom.tags/tag/agecorrectedsensitivitydeviationprobabilityvalue) | (0024,0100) VR=FL VM=1 Age Corrected Sensitivity Deviation Probability Value. |
| static readonly [AgeCorrectedSensitivityDeviationValue](../../aspose.medical.dicom.tags/tag/agecorrectedsensitivitydeviationvalue) | (0024,0092) VR=FL VM=1 Age Corrected Sensitivity Deviation Value. |
| static readonly [AirCountsRETIRED](../../aspose.medical.dicom.tags/tag/aircountsretired) | (0014,3070) VR=OB or OW VM=1 Air Counts (RETIRED). |
| static readonly [AirGapTemperatureRETIRED](../../aspose.medical.dicom.tags/tag/airgaptemperatureretired) | (0014,6022) VR=DS VM=1 Air Gap Temperature (RETIRED). |
| static readonly [AITDeviceTypeRETIRED](../../aspose.medical.dicom.tags/tag/aitdevicetyperetired) | (4010,1070) VR=CS VM=1 AIT Device Type (RETIRED). |
| static readonly [AlarmDecisionRETIRED](../../aspose.medical.dicom.tags/tag/alarmdecisionretired) | (4010,1031) VR=CS VM=1 Alarm Decision (RETIRED). |
| static readonly [AlarmDecisionTimeRETIRED](../../aspose.medical.dicom.tags/tag/alarmdecisiontimeretired) | (4010,102B) VR=DT VM=1 Alarm Decision Time (RETIRED). |
| static readonly [AlgorithmCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/algorithmcodesequencetrialretired) | (0040,A296) VR=SQ VM=1 Algorithm Code Sequence (Trial) (RETIRED). |
| static readonly [AlgorithmDescription](../../aspose.medical.dicom.tags/tag/algorithmdescription) | (0018,9528) VR=LO VM=1 Algorithm Description. |
| static readonly [AlgorithmDescriptionTrialRETIRED](../../aspose.medical.dicom.tags/tag/algorithmdescriptiontrialretired) | (0040,A297) VR=ST VM=1 Algorithm Description (Trial) (RETIRED). |
| static readonly [AlgorithmFamilyCodeSequence](../../aspose.medical.dicom.tags/tag/algorithmfamilycodesequence) | (0066,002F) VR=SQ VM=1 Algorithm Family Code Sequence. |
| static readonly [AlgorithmName](../../aspose.medical.dicom.tags/tag/algorithmname) | (0066,0036) VR=LO VM=1 Algorithm Name. |
| static readonly [AlgorithmNameCodeSequence](../../aspose.medical.dicom.tags/tag/algorithmnamecodesequence) | (0066,0030) VR=SQ VM=1 Algorithm Name Code Sequence. |
| static readonly [AlgorithmParameters](../../aspose.medical.dicom.tags/tag/algorithmparameters) | (0066,0032) VR=LT VM=1 Algorithm Parameters. |
| static readonly [AlgorithmRoutingCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/algorithmroutingcodesequenceretired) | (4010,1064) VR=SQ VM=1 Algorithm Routing Code Sequence (RETIRED). |
| static readonly [AlgorithmSource](../../aspose.medical.dicom.tags/tag/algorithmsource) | (0024,0202) VR=LO VM=1 Algorithm Source. |
| static readonly [AlgorithmType](../../aspose.medical.dicom.tags/tag/algorithmtype) | (0018,9527) VR=CS VM=1 Algorithm Type. |
| static readonly [AlgorithmVersion](../../aspose.medical.dicom.tags/tag/algorithmversion) | (0066,0031) VR=LO VM=1 Algorithm Version. |
| static readonly [AliasedDataType](../../aspose.medical.dicom.tags/tag/aliaseddatatype) | (0018,980B) VR=CS VM=1 Aliased Data Type. |
| static readonly [ALinePixelSpacing](../../aspose.medical.dicom.tags/tag/alinepixelspacing) | (0052,0014) VR=FD VM=1 A-line Pixel Spacing. |
| static readonly [ALineRate](../../aspose.medical.dicom.tags/tag/alinerate) | (0052,0011) VR=FD VM=1 A-line Rate. |
| static readonly [ALinesPerFrame](../../aspose.medical.dicom.tags/tag/alinesperframe) | (0052,0012) VR=US VM=1 A-lines Per Frame. |
| static readonly [Allergies](../../aspose.medical.dicom.tags/tag/allergies) | (0010,2110) VR=LO VM=1-n Allergies. |
| static readonly [AllowLossyCompression](../../aspose.medical.dicom.tags/tag/allowlossycompression) | (2200,000F) VR=CS VM=1 Allow Lossy Compression. |
| static readonly [AllowMediaSplitting](../../aspose.medical.dicom.tags/tag/allowmediasplitting) | (2200,0007) VR=CS VM=1 Allow Media Splitting. |
| static readonly [AlongScanSpatialResolution](../../aspose.medical.dicom.tags/tag/alongscanspatialresolution) | (0022,0037) VR=FL VM=1 Along-scan Spatial Resolution. |
| static readonly [AlphaLUTTransferFunction](../../aspose.medical.dicom.tags/tag/alphaluttransferfunction) | (0028,1410) VR=CS VM=1 Alpha LUT Transfer Function. |
| static readonly [AlphaPaletteColorLookupTableData](../../aspose.medical.dicom.tags/tag/alphapalettecolorlookuptabledata) | (0028,1204) VR=OW VM=1 Alpha Palette Color Lookup Table Data. |
| static readonly [AlphaPaletteColorLookupTableDescriptor](../../aspose.medical.dicom.tags/tag/alphapalettecolorlookuptabledescriptor) | (0028,1104) VR=US VM=3 Alpha Palette Color Lookup Table Descriptor. |
| static readonly [AlternateBeamDose](../../aspose.medical.dicom.tags/tag/alternatebeamdose) | (300A,0091) VR=DS VM=1 Alternate Beam Dose. |
| static readonly [AlternateBeamDoseType](../../aspose.medical.dicom.tags/tag/alternatebeamdosetype) | (300A,0092) VR=CS VM=1 Alternate Beam Dose Type. |
| static readonly [AlternateContainerIdentifierSequence](../../aspose.medical.dicom.tags/tag/alternatecontaineridentifiersequence) | (0040,0515) VR=SQ VM=1 Alternate Container Identifier Sequence. |
| static readonly [AlternateContentDescriptionSequence](../../aspose.medical.dicom.tags/tag/alternatecontentdescriptionsequence) | (0070,0087) VR=SQ VM=1 Alternate Content Description Sequence. |
| static readonly [AlternateRepresentationSequence](../../aspose.medical.dicom.tags/tag/alternaterepresentationsequence) | (0008,3001) VR=SQ VM=1 Alternate Representation Sequence. |
| static readonly [AlternateValueSequence](../../aspose.medical.dicom.tags/tag/alternatevaluesequence) | (300A,073E) VR=SQ VM=1 Alternate Value Sequence. |
| static readonly [AmbientLightValueSource](../../aspose.medical.dicom.tags/tag/ambientlightvaluesource) | (0028,7025) VR=CS VM=1 Ambient Light Value Source. |
| static readonly [AmbientReflectionIntensity](../../aspose.medical.dicom.tags/tag/ambientreflectionintensity) | (0070,1702) VR=FD VM=1 Ambient Reflection Intensity. |
| static readonly [AmplifierTypeRETIRED](../../aspose.medical.dicom.tags/tag/amplifiertyperetired) | (0014,400A) VR=CS VM=1 Amplifier Type (RETIRED). |
| static readonly [AnalogFilterCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/analogfiltercharacteristicssequence) | (003A,0323) VR=SQ VM=1 Analog Filter Characteristics Sequence. |
| static readonly [AnalogFilterRollOff](../../aspose.medical.dicom.tags/tag/analogfilterrolloff) | (003A,0324) VR=DS VM=1 Analog Filter Roll Off. |
| static readonly [AnalogFilterTypeCodeSequence](../../aspose.medical.dicom.tags/tag/analogfiltertypecodesequence) | (003A,0325) VR=SQ VM=1 Analog Filter Type Code Sequence. |
| static readonly [AnalyzedArea](../../aspose.medical.dicom.tags/tag/analyzedarea) | (0046,0227) VR=FL VM=1 Analyzed Area. |
| static readonly [AnatomicalOrientationType](../../aspose.medical.dicom.tags/tag/anatomicalorientationtype) | (0010,2210) VR=CS VM=1 Anatomical Orientation Type. |
| static readonly [AnatomicApproachDirectionCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/anatomicapproachdirectioncodesequencetrialretired) | (0008,2255) VR=SQ VM=1 Anatomic Approach Direction Code Sequence (Trial) (RETIRED). |
| static readonly [AnatomicLocationOfExaminingInstrumentCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/anatomiclocationofexamininginstrumentcodesequencetrialretired) | (0008,2259) VR=SQ VM=1 Anatomic Location Of Examining Instrument Code Sequence (Trial) (RETIRED). |
| static readonly [AnatomicLocationOfExaminingInstrumentDescriptionTrialRETIRED](../../aspose.medical.dicom.tags/tag/anatomiclocationofexamininginstrumentdescriptiontrialretired) | (0008,2258) VR=ST VM=1 Anatomic Location Of Examining Instrument Description (Trial) (RETIRED). |
| static readonly [AnatomicPerspectiveCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/anatomicperspectivecodesequencetrialretired) | (0008,2257) VR=SQ VM=1 Anatomic Perspective Code Sequence (Trial) (RETIRED). |
| static readonly [AnatomicPerspectiveDescriptionTrialRETIRED](../../aspose.medical.dicom.tags/tag/anatomicperspectivedescriptiontrialretired) | (0008,2256) VR=ST VM=1 Anatomic Perspective Description (Trial) (RETIRED). |
| static readonly [AnatomicPortalOfEntranceCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/anatomicportalofentrancecodesequencetrialretired) | (0008,2253) VR=SQ VM=1 Anatomic Portal Of Entrance Code Sequence (Trial) (RETIRED). |
| static readonly [AnatomicRegionModifierSequence](../../aspose.medical.dicom.tags/tag/anatomicregionmodifiersequence) | (0008,2220) VR=SQ VM=1 Anatomic Region Modifier Sequence. |
| static readonly [AnatomicRegionSequence](../../aspose.medical.dicom.tags/tag/anatomicregionsequence) | (0008,2218) VR=SQ VM=1 Anatomic Region Sequence. |
| static readonly [AnatomicRegionsInStudyCodeSequence](../../aspose.medical.dicom.tags/tag/anatomicregionsinstudycodesequence) | (0008,0063) VR=SQ VM=1 Anatomic Regions in Study Code Sequence. |
| static readonly [AnatomicStructureReferencePoint](../../aspose.medical.dicom.tags/tag/anatomicstructurereferencepoint) | (0022,1463) VR=FL VM=2 Anatomic Structure Reference Point. |
| static readonly [AnatomicStructureRETIRED](../../aspose.medical.dicom.tags/tag/anatomicstructureretired) | (0008,2208) VR=CS VM=1 Anatomic Structure (RETIRED). |
| static readonly [AnatomicStructureSpaceOrRegionCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/anatomicstructurespaceorregioncodesequencetrialretired) | (0008,2251) VR=SQ VM=1 Anatomic Structure Space Or Region Code Sequence (Trial) (RETIRED). |
| static readonly [AnatomicStructureSpaceOrRegionModifierCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/anatomicstructurespaceorregionmodifiercodesequencetrialretired) | (0008,225A) VR=SQ VM=1 Anatomic Structure Space Or Region Modifier Code Sequence (Trial) (RETIRED). |
| static readonly [AnatomicStructureSpaceOrRegionSequenceRETIRED](../../aspose.medical.dicom.tags/tag/anatomicstructurespaceorregionsequenceretired) | (0008,2229) VR=SQ VM=1 Anatomic Structure, Space or Region Sequence (RETIRED). |
| static readonly [AnchorPoint](../../aspose.medical.dicom.tags/tag/anchorpoint) | (0070,0014) VR=FL VM=2 Anchor Point. |
| static readonly [AnchorPointAnnotationUnits](../../aspose.medical.dicom.tags/tag/anchorpointannotationunits) | (0070,0004) VR=CS VM=1 Anchor Point Annotation Units. |
| static readonly [AnchorPointVisibility](../../aspose.medical.dicom.tags/tag/anchorpointvisibility) | (0070,0015) VR=CS VM=1 Anchor Point Visibility. |
| static readonly [AngioFlag](../../aspose.medical.dicom.tags/tag/angioflag) | (0018,0025) VR=CS VM=1 Angio Flag. |
| static readonly [AngleNumberRETIRED](../../aspose.medical.dicom.tags/tag/anglenumberretired) | (0020,0018) VR=IS VM=1 Angle Number (RETIRED). |
| static readonly [AngularPositionRETIRED](../../aspose.medical.dicom.tags/tag/angularpositionretired) | (0018,1141) VR=DS VM=1 Angular Position (RETIRED). |
| static readonly [AngularStep](../../aspose.medical.dicom.tags/tag/angularstep) | (0018,1144) VR=DS VM=1 Angular Step. |
| static readonly [AngularViewVector](../../aspose.medical.dicom.tags/tag/angularviewvector) | (0054,0090) VR=US VM=1-n Angular View Vector. |
| static readonly [AnimationCurveSequence](../../aspose.medical.dicom.tags/tag/animationcurvesequence) | (0070,1A04) VR=SQ VM=1 Animation Curve Sequence. |
| static readonly [AnimationStepSize](../../aspose.medical.dicom.tags/tag/animationstepsize) | (0070,1A05) VR=FD VM=1 Animation Step Size. |
| static readonly [AnnotationAppliesToAllOpticalPaths](../../aspose.medical.dicom.tags/tag/annotationappliestoallopticalpaths) | (006A,000D) VR=CS VM=1 Annotation Applies to All Optical Paths. |
| static readonly [AnnotationAppliesToAllZPlanes](../../aspose.medical.dicom.tags/tag/annotationappliestoallzplanes) | (006A,000F) VR=CS VM=1 Annotation Applies to All Z Planes. |
| static readonly [AnnotationClipping](../../aspose.medical.dicom.tags/tag/annotationclipping) | (0070,1907) VR=CS VM=1 Annotation Clipping. |
| static readonly [AnnotationContentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/annotationcontentsequenceretired) | (2130,0050) VR=SQ VM=1 Annotation Content Sequence (RETIRED). |
| static readonly [AnnotationCoordinateType](../../aspose.medical.dicom.tags/tag/annotationcoordinatetype) | (006A,0001) VR=CS VM=1 Annotation Coordinate Type. |
| static readonly [AnnotationDateTime](../../aspose.medical.dicom.tags/tag/annotationdatetime) | (0040,B034) VR=DT VM=1 Annotation DateTime. |
| static readonly [AnnotationDisplayFormatID](../../aspose.medical.dicom.tags/tag/annotationdisplayformatid) | (2010,0030) VR=CS VM=1 Annotation Display Format ID. |
| static readonly [AnnotationFlagRETIRED](../../aspose.medical.dicom.tags/tag/annotationflagretired) | (2000,0065) VR=CS VM=1 Annotation Flag (RETIRED). |
| static readonly [AnnotationGroupAlgorithmIdentificationSequence](../../aspose.medical.dicom.tags/tag/annotationgroupalgorithmidentificationsequence) | (006A,0008) VR=SQ VM=1 Annotation Group Algorithm Identification Sequence. |
| static readonly [AnnotationGroupDescription](../../aspose.medical.dicom.tags/tag/annotationgroupdescription) | (006A,0006) VR=UT VM=1 Annotation Group Description. |
| static readonly [AnnotationGroupGenerationType](../../aspose.medical.dicom.tags/tag/annotationgroupgenerationtype) | (006A,0007) VR=CS VM=1 Annotation Group Generation Type. |
| static readonly [AnnotationGroupLabel](../../aspose.medical.dicom.tags/tag/annotationgrouplabel) | (006A,0005) VR=LO VM=1 Annotation Group Label. |
| static readonly [AnnotationGroupNumber](../../aspose.medical.dicom.tags/tag/annotationgroupnumber) | (0040,A180) VR=US VM=1 Annotation Group Number. |
| static readonly [AnnotationGroupSequence](../../aspose.medical.dicom.tags/tag/annotationgroupsequence) | (006A,0002) VR=SQ VM=1 Annotation Group Sequence. |
| static readonly [AnnotationGroupUID](../../aspose.medical.dicom.tags/tag/annotationgroupuid) | (006A,0003) VR=UI VM=1 Annotation Group UID. |
| static readonly [AnnotationIndexList](../../aspose.medical.dicom.tags/tag/annotationindexlist) | (006A,0011) VR=OL VM=1 Annotation Index List. |
| static readonly [AnnotationPosition](../../aspose.medical.dicom.tags/tag/annotationposition) | (2030,0010) VR=US VM=1 Annotation Position. |
| static readonly [AnnotationPropertyCategoryCodeSequence](../../aspose.medical.dicom.tags/tag/annotationpropertycategorycodesequence) | (006A,0009) VR=SQ VM=1 Annotation Property Category Code Sequence. |
| static readonly [AnnotationPropertyTypeCodeSequence](../../aspose.medical.dicom.tags/tag/annotationpropertytypecodesequence) | (006A,000A) VR=SQ VM=1 Annotation Property Type Code Sequence. |
| static readonly [AnnotationPropertyTypeModifierCodeSequence](../../aspose.medical.dicom.tags/tag/annotationpropertytypemodifiercodesequence) | (006A,000B) VR=SQ VM=1 Annotation Property Type Modifier Code Sequence. |
| static readonly [AnodeTargetMaterial](../../aspose.medical.dicom.tags/tag/anodetargetmaterial) | (0018,1191) VR=CS VM=1 Anode Target Material. |
| static readonly [AnomalyLocatorIndicatorRETIRED](../../aspose.medical.dicom.tags/tag/anomalylocatorindicatorretired) | (4010,107A) VR=FL VM=3 Anomaly Locator Indicator (RETIRED). |
| static readonly [AnomalyLocatorIndicatorSequenceRETIRED](../../aspose.medical.dicom.tags/tag/anomalylocatorindicatorsequenceretired) | (4010,1079) VR=SQ VM=1 Anomaly Locator Indicator Sequence (RETIRED). |
| static readonly [AnteriorChamberDepth](../../aspose.medical.dicom.tags/tag/anteriorchamberdepth) | (0022,1131) VR=FL VM=1 Anterior Chamber Depth. |
| static readonly [AnteriorChamberDepthDefinitionCodeSequence](../../aspose.medical.dicom.tags/tag/anteriorchamberdepthdefinitioncodesequence) | (0022,1125) VR=SQ VM=1 Anterior Chamber Depth Definition Code Sequence. |
| static readonly [AnteriorChamberDepthSequence](../../aspose.medical.dicom.tags/tag/anteriorchamberdepthsequence) | (0022,1128) VR=SQ VM=1 Anterior Chamber Depth Sequence. |
| static readonly [ApertureElevationRETIRED](../../aspose.medical.dicom.tags/tag/apertureelevationretired) | (0014,5102) VR=DS VM=1 Aperture Elevation (RETIRED). |
| static readonly [ApertureSizeRETIRED](../../aspose.medical.dicom.tags/tag/aperturesizeretired) | (0014,6041) VR=DS VM=1 Aperture Size (RETIRED). |
| static readonly [ApertureValue](../../aspose.medical.dicom.tags/tag/aperturevalue) | (0016,0022) VR=DS VM=1 Aperture Value. |
| static readonly [ApexPosition](../../aspose.medical.dicom.tags/tag/apexposition) | (0020,9308) VR=FD VM=3 Apex Position. |
| static readonly [ApplicableFrameRange](../../aspose.medical.dicom.tags/tag/applicableframerange) | (0028,6102) VR=US VM=2-2n Applicable Frame Range. |
| static readonly [ApplicableSafetyStandardAgency](../../aspose.medical.dicom.tags/tag/applicablesafetystandardagency) | (0018,9174) VR=CS VM=1 Applicable Safety Standard Agency. |
| static readonly [ApplicableSafetyStandardDescription](../../aspose.medical.dicom.tags/tag/applicablesafetystandarddescription) | (0018,9175) VR=LO VM=1 Applicable Safety Standard Description. |
| static readonly [ApplicationManufacturer](../../aspose.medical.dicom.tags/tag/applicationmanufacturer) | (0018,9526) VR=LO VM=1 Application Manufacturer. |
| static readonly [ApplicationMaximumRepaintTime](../../aspose.medical.dicom.tags/tag/applicationmaximumrepainttime) | (0072,010E) VR=US VM=1 Application Maximum Repaint Time. |
| static readonly [ApplicationName](../../aspose.medical.dicom.tags/tag/applicationname) | (0018,9524) VR=LO VM=1 Application Name. |
| static readonly [ApplicationSetupCheck](../../aspose.medical.dicom.tags/tag/applicationsetupcheck) | (3008,0116) VR=CS VM=1 Application Setup Check. |
| static readonly [ApplicationSetupManufacturer](../../aspose.medical.dicom.tags/tag/applicationsetupmanufacturer) | (300A,0238) VR=LO VM=1 Application Setup Manufacturer. |
| static readonly [ApplicationSetupName](../../aspose.medical.dicom.tags/tag/applicationsetupname) | (300A,0236) VR=LO VM=1 Application Setup Name. |
| static readonly [ApplicationSetupNumber](../../aspose.medical.dicom.tags/tag/applicationsetupnumber) | (300A,0234) VR=IS VM=1 Application Setup Number. |
| static readonly [ApplicationSetupSequence](../../aspose.medical.dicom.tags/tag/applicationsetupsequence) | (300A,0230) VR=SQ VM=1 Application Setup Sequence. |
| static readonly [ApplicationSetupType](../../aspose.medical.dicom.tags/tag/applicationsetuptype) | (300A,0232) VR=CS VM=1 Application Setup Type. |
| static readonly [ApplicationVersion](../../aspose.medical.dicom.tags/tag/applicationversion) | (0018,9525) VR=LO VM=1 Application Version. |
| static readonly [ApplicatorApertureShape](../../aspose.medical.dicom.tags/tag/applicatorapertureshape) | (300A,0432) VR=CS VM=1 Applicator Aperture Shape. |
| static readonly [ApplicatorDescription](../../aspose.medical.dicom.tags/tag/applicatordescription) | (300A,010A) VR=LO VM=1 Applicator Description. |
| static readonly [ApplicatorGeometrySequence](../../aspose.medical.dicom.tags/tag/applicatorgeometrysequence) | (300A,0431) VR=SQ VM=1 Applicator Geometry Sequence. |
| static readonly [ApplicatorID](../../aspose.medical.dicom.tags/tag/applicatorid) | (300A,0108) VR=SH VM=1 Applicator ID. |
| static readonly [ApplicatorOpening](../../aspose.medical.dicom.tags/tag/applicatoropening) | (300A,0433) VR=FL VM=1 Applicator Opening. |
| static readonly [ApplicatorOpeningX](../../aspose.medical.dicom.tags/tag/applicatoropeningx) | (300A,0434) VR=FL VM=1 Applicator Opening X. |
| static readonly [ApplicatorOpeningY](../../aspose.medical.dicom.tags/tag/applicatoropeningy) | (300A,0435) VR=FL VM=1 Applicator Opening Y. |
| static readonly [ApplicatorSequence](../../aspose.medical.dicom.tags/tag/applicatorsequence) | (300A,0107) VR=SQ VM=1 Applicator Sequence. |
| static readonly [ApplicatorShapeReferencedROINumber](../../aspose.medical.dicom.tags/tag/applicatorshapereferencedroinumber) | (300A,02A1) VR=IS VM=1 Applicator Shape Referenced ROI Number. |
| static readonly [ApplicatorType](../../aspose.medical.dicom.tags/tag/applicatortype) | (300A,0109) VR=CS VM=1 Applicator Type. |
| static readonly [AppliedMaskSubtractionFlag](../../aspose.medical.dicom.tags/tag/appliedmasksubtractionflag) | (0018,11C0) VR=CS VM=1 Applied Mask Subtraction Flag. |
| static readonly [ApprovalSequence](../../aspose.medical.dicom.tags/tag/approvalsequence) | (0044,0100) VR=SQ VM=1 Approval Sequence. |
| static readonly [ApprovalStatus](../../aspose.medical.dicom.tags/tag/approvalstatus) | (300E,0002) VR=CS VM=1 Approval Status. |
| static readonly [ApprovalStatusDateTime](../../aspose.medical.dicom.tags/tag/approvalstatusdatetime) | (0044,0004) VR=DT VM=1 Approval Status DateTime. |
| static readonly [ApprovalStatusFurtherDescription](../../aspose.medical.dicom.tags/tag/approvalstatusfurtherdescription) | (0044,0003) VR=LT VM=1 Approval Status Further Description. |
| static readonly [ApprovalSubjectSequence](../../aspose.medical.dicom.tags/tag/approvalsubjectsequence) | (0044,0109) VR=SQ VM=1 Approval Subject Sequence. |
| static readonly [ArbitraryRETIRED](../../aspose.medical.dicom.tags/tag/arbitraryretired) | (4000,0010) VR=LT VM=1 Arbitrary (RETIRED). |
| static readonly [ArchiveRequested](../../aspose.medical.dicom.tags/tag/archiverequested) | (0040,A494) VR=CS VM=1 Archive Requested. |
| static readonly [ArterialSpinLabelingContrast](../../aspose.medical.dicom.tags/tag/arterialspinlabelingcontrast) | (0018,9250) VR=CS VM=1 Arterial Spin Labeling Contrast. |
| static readonly [AscanRate](../../aspose.medical.dicom.tags/tag/ascanrate) | (0022,1649) VR=FL VM=1 A-scan Rate. |
| static readonly [ASLBolusCutoffDelayTime](../../aspose.medical.dicom.tags/tag/aslboluscutoffdelaytime) | (0018,925F) VR=UL VM=1 ASL Bolus Cut-off Delay Time. |
| static readonly [ASLBolusCutoffFlag](../../aspose.medical.dicom.tags/tag/aslboluscutoffflag) | (0018,925C) VR=CS VM=1 ASL Bolus Cut-off Flag. |
| static readonly [ASLBolusCutoffTechnique](../../aspose.medical.dicom.tags/tag/aslboluscutofftechnique) | (0018,925E) VR=LO VM=1 ASL Bolus Cut-off Technique. |
| static readonly [ASLBolusCutoffTimingSequence](../../aspose.medical.dicom.tags/tag/aslboluscutofftimingsequence) | (0018,925D) VR=SQ VM=1 ASL Bolus Cut-off Timing Sequence. |
| static readonly [ASLContext](../../aspose.medical.dicom.tags/tag/aslcontext) | (0018,9257) VR=CS VM=1 ASL Context. |
| static readonly [ASLCrusherDescription](../../aspose.medical.dicom.tags/tag/aslcrusherdescription) | (0018,925B) VR=LO VM=1 ASL Crusher Description. |
| static readonly [ASLCrusherFlag](../../aspose.medical.dicom.tags/tag/aslcrusherflag) | (0018,9259) VR=CS VM=1 ASL Crusher Flag. |
| static readonly [ASLCrusherFlowLimit](../../aspose.medical.dicom.tags/tag/aslcrusherflowlimit) | (0018,925A) VR=FD VM=1 ASL Crusher Flow Limit. |
| static readonly [ASLMidSlabPosition](../../aspose.medical.dicom.tags/tag/aslmidslabposition) | (0018,9256) VR=FD VM=3 ASL Mid Slab Position. |
| static readonly [ASLPulseTrainDuration](../../aspose.medical.dicom.tags/tag/aslpulsetrainduration) | (0018,9258) VR=UL VM=1 ASL Pulse Train Duration. |
| static readonly [ASLSlabNumber](../../aspose.medical.dicom.tags/tag/aslslabnumber) | (0018,9253) VR=US VM=1 ASL Slab Number. |
| static readonly [ASLSlabOrientation](../../aspose.medical.dicom.tags/tag/aslslaborientation) | (0018,9255) VR=FD VM=3 ASL Slab Orientation. |
| static readonly [ASLSlabSequence](../../aspose.medical.dicom.tags/tag/aslslabsequence) | (0018,9260) VR=SQ VM=1 ASL Slab Sequence. |
| static readonly [ASLSlabThickness](../../aspose.medical.dicom.tags/tag/aslslabthickness) | (0018,9254) VR=FD VM=1 ASL Slab Thickness. |
| static readonly [ASLTechniqueDescription](../../aspose.medical.dicom.tags/tag/asltechniquedescription) | (0018,9252) VR=LO VM=1 ASL Technique Description. |
| static readonly [AsserterIdentificationSequence](../../aspose.medical.dicom.tags/tag/asserteridentificationsequence) | (0044,0103) VR=SQ VM=1 Asserter Identification Sequence. |
| static readonly [AssertionCodeSequence](../../aspose.medical.dicom.tags/tag/assertioncodesequence) | (0044,0101) VR=SQ VM=1 Assertion Code Sequence. |
| static readonly [AssertionComments](../../aspose.medical.dicom.tags/tag/assertioncomments) | (0044,0106) VR=UT VM=1 Assertion Comments. |
| static readonly [AssertionDateTime](../../aspose.medical.dicom.tags/tag/assertiondatetime) | (0044,0104) VR=DT VM=1 Assertion DateTime. |
| static readonly [AssertionExpirationDateTime](../../aspose.medical.dicom.tags/tag/assertionexpirationdatetime) | (0044,0105) VR=DT VM=1 Assertion Expiration DateTime. |
| static readonly [AssertionUID](../../aspose.medical.dicom.tags/tag/assertionuid) | (0044,0102) VR=UI VM=1 Assertion UID. |
| static readonly [AssessedAttributeValueSequence](../../aspose.medical.dicom.tags/tag/assessedattributevaluesequence) | (0082,0010) VR=SQ VM=1 Assessed Attribute Value Sequence. |
| static readonly [AssessedSOPInstanceSequence](../../aspose.medical.dicom.tags/tag/assessedsopinstancesequence) | (0082,0004) VR=SQ VM=1 Assessed SOP Instance Sequence. |
| static readonly [AssessmentLabel](../../aspose.medical.dicom.tags/tag/assessmentlabel) | (0082,0023) VR=LO VM=1 Assessment Label. |
| static readonly [AssessmentObservationsSequence](../../aspose.medical.dicom.tags/tag/assessmentobservationssequence) | (0082,0007) VR=SQ VM=1 Assessment Observations Sequence. |
| static readonly [AssessmentRequesterSequence](../../aspose.medical.dicom.tags/tag/assessmentrequestersequence) | (0082,0017) VR=SQ VM=1 Assessment Requester Sequence. |
| static readonly [AssessmentSetID](../../aspose.medical.dicom.tags/tag/assessmentsetid) | (0082,0016) VR=LO VM=1 Assessment Set ID. |
| static readonly [AssessmentSummary](../../aspose.medical.dicom.tags/tag/assessmentsummary) | (0082,0001) VR=CS VM=1 Assessment Summary. |
| static readonly [AssessmentSummaryDescription](../../aspose.medical.dicom.tags/tag/assessmentsummarydescription) | (0082,0003) VR=UT VM=1 Assessment Summary Description. |
| static readonly [AssessmentTypeCodeSequence](../../aspose.medical.dicom.tags/tag/assessmenttypecodesequence) | (0082,0021) VR=SQ VM=1 Assessment Type Code Sequence. |
| static readonly [AssignedLocationRETIRED](../../aspose.medical.dicom.tags/tag/assignedlocationretired) | (4010,102A) VR=SH VM=1 Assigned Location (RETIRED). |
| static readonly [AssigningAgencyOrDepartmentCodeSequence](../../aspose.medical.dicom.tags/tag/assigningagencyordepartmentcodesequence) | (0040,003A) VR=SQ VM=1 Assigning Agency or Department Code Sequence. |
| static readonly [AssigningFacilitySequence](../../aspose.medical.dicom.tags/tag/assigningfacilitysequence) | (0040,0036) VR=SQ VM=1 Assigning Facility Sequence. |
| static readonly [AssigningJurisdictionCodeSequence](../../aspose.medical.dicom.tags/tag/assigningjurisdictioncodesequence) | (0040,0039) VR=SQ VM=1 Assigning Jurisdiction Code Sequence. |
| static readonly [ATDAbilityAssessmentRETIRED](../../aspose.medical.dicom.tags/tag/atdabilityassessmentretired) | (4010,1014) VR=CS VM=1 ATD Ability Assessment (RETIRED). |
| static readonly [ATDAssessmentFlagRETIRED](../../aspose.medical.dicom.tags/tag/atdassessmentflagretired) | (4010,1015) VR=CS VM=1 ATD Assessment Flag (RETIRED). |
| static readonly [ATDAssessmentProbabilityRETIRED](../../aspose.medical.dicom.tags/tag/atdassessmentprobabilityretired) | (4010,1016) VR=FL VM=1 ATD Assessment Probability (RETIRED). |
| static readonly [ATDAssessmentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/atdassessmentsequenceretired) | (4010,1038) VR=SQ VM=1 ATD Assessment Sequence (RETIRED). |
| static readonly [AttachedContoursRETIRED](../../aspose.medical.dicom.tags/tag/attachedcontoursretired) | (3006,0049) VR=IS VM=1-n Attached Contours (RETIRED). |
| static readonly [AttenuationCorrected](../../aspose.medical.dicom.tags/tag/attenuationcorrected) | (0018,9759) VR=CS VM=1 Attenuation Corrected. |
| static readonly [AttenuationCorrectionMethod](../../aspose.medical.dicom.tags/tag/attenuationcorrectionmethod) | (0054,1101) VR=LO VM=1 Attenuation Correction Method. |
| static readonly [AttenuationCorrectionSource](../../aspose.medical.dicom.tags/tag/attenuationcorrectionsource) | (0018,9738) VR=CS VM=1 Attenuation Correction Source. |
| static readonly [AttenuationCorrectionTemporalRelationship](../../aspose.medical.dicom.tags/tag/attenuationcorrectiontemporalrelationship) | (0018,9770) VR=CS VM=1 Attenuation Correction Temporal Relationship. |
| static readonly [AttributeIdentifierList](../../aspose.medical.dicom.tags/tag/attributeidentifierlist) | (0000,1005) VR=AT VM=1-n Attribute Identifier List. |
| static readonly [AttributeItemSelector](../../aspose.medical.dicom.tags/tag/attributeitemselector) | (0074,1054) VR=UL VM=1 Attribute Item Selector. |
| static readonly [AttributeModificationDateTime](../../aspose.medical.dicom.tags/tag/attributemodificationdatetime) | (0400,0562) VR=DT VM=1 Attribute Modification DateTime. |
| static readonly [AttributeOccurrencePointer](../../aspose.medical.dicom.tags/tag/attributeoccurrencepointer) | (0074,1052) VR=AT VM=1 Attribute Occurrence Pointer. |
| static readonly [AttributeOccurrencePrivateCreator](../../aspose.medical.dicom.tags/tag/attributeoccurrenceprivatecreator) | (0074,1056) VR=LO VM=1 Attribute Occurrence Private Creator. |
| static readonly [AttributeOccurrenceSequence](../../aspose.medical.dicom.tags/tag/attributeoccurrencesequence) | (0074,1050) VR=SQ VM=1 Attribute Occurrence Sequence. |
| static readonly [AttributeToleranceValuesSequence](../../aspose.medical.dicom.tags/tag/attributetolerancevaluessequence) | (300A,062B) VR=SQ VM=1 Attribute Tolerance Values Sequence. |
| static readonly [AudioCommentsRETIRED](../../aspose.medical.dicom.tags/tag/audiocommentsretired) | (50xx,200E) VR=LT VM=1 Audio Comments (RETIRED). |
| static readonly [AudioSampleDataRETIRED](../../aspose.medical.dicom.tags/tag/audiosampledataretired) | (50xx,200C) VR=OB or OW VM=1 Audio Sample Data (RETIRED). |
| static readonly [AudioSampleFormatRETIRED](../../aspose.medical.dicom.tags/tag/audiosampleformatretired) | (50xx,2002) VR=US VM=1 Audio Sample Format (RETIRED). |
| static readonly [AudioTypeRETIRED](../../aspose.medical.dicom.tags/tag/audiotyperetired) | (50xx,2000) VR=US VM=1 Audio Type (RETIRED). |
| static readonly [AuthorIdentificationSequence](../../aspose.medical.dicom.tags/tag/authoridentificationsequence) | (3010,0019) VR=SQ VM=1 Author Identification Sequence. |
| static readonly [AuthorizationEquipmentCertificationNumber](../../aspose.medical.dicom.tags/tag/authorizationequipmentcertificationnumber) | (0100,0426) VR=LO VM=1 Authorization Equipment Certification Number. |
| static readonly [AuthorObserverSequence](../../aspose.medical.dicom.tags/tag/authorobserversequence) | (0040,A078) VR=SQ VM=1 Author Observer Sequence. |
| static readonly [AutoKVPLowerBound](../../aspose.medical.dicom.tags/tag/autokvplowerbound) | (0018,9946) VR=FD VM=1 Auto KVP Lower Bound. |
| static readonly [AutoKVPSelectionType](../../aspose.medical.dicom.tags/tag/autokvpselectiontype) | (0018,9944) VR=CS VM=1 Auto KVP Selection Type. |
| static readonly [AutoKVPUpperBound](../../aspose.medical.dicom.tags/tag/autokvpupperbound) | (0018,9945) VR=FD VM=1 Auto KVP Upper Bound. |
| static readonly [AutorefractionLeftEyeSequence](../../aspose.medical.dicom.tags/tag/autorefractionlefteyesequence) | (0046,0052) VR=SQ VM=1 Autorefraction Left Eye Sequence. |
| static readonly [AutorefractionRightEyeSequence](../../aspose.medical.dicom.tags/tag/autorefractionrighteyesequence) | (0046,0050) VR=SQ VM=1 Autorefraction Right Eye Sequence. |
| static readonly [AutosequenceFlag](../../aspose.medical.dicom.tags/tag/autosequenceflag) | (0074,1025) VR=CS VM=1 Autosequence Flag. |
| static readonly [AvailableTransferSyntaxUID](../../aspose.medical.dicom.tags/tag/availabletransfersyntaxuid) | (0008,3002) VR=UI VM=1-n Available Transfer Syntax UID. |
| static readonly [AverageBeamDosePointDepthRETIRED](../../aspose.medical.dicom.tags/tag/averagebeamdosepointdepthretired) | (300A,008D) VR=FL VM=1 Average Beam Dose Point Depth (RETIRED). |
| static readonly [AverageBeamDosePointEquivalentDepthRETIRED](../../aspose.medical.dicom.tags/tag/averagebeamdosepointequivalentdepthretired) | (300A,008E) VR=FL VM=1 Average Beam Dose Point Equivalent Depth (RETIRED). |
| static readonly [AverageBeamDosePointSourceToExternalContourDistance](../../aspose.medical.dicom.tags/tag/averagebeamdosepointsourcetoexternalcontourdistance) | (300A,0131) VR=FL VM=1 Average Beam Dose Point Source to External Contour Distance. |
| static readonly [AverageBeamDosePointSSDRETIRED](../../aspose.medical.dicom.tags/tag/averagebeamdosepointssdretired) | (300A,008F) VR=FL VM=1 Average Beam Dose Point SSD (RETIRED). |
| static readonly [AverageCornealPower](../../aspose.medical.dicom.tags/tag/averagecornealpower) | (0046,0220) VR=FL VM=1 Average Corneal Power. |
| static readonly [AveragePulseWidth](../../aspose.medical.dicom.tags/tag/averagepulsewidth) | (0018,1154) VR=DS VM=1 Average Pulse Width. |
| static readonly [AxialAcceptance](../../aspose.medical.dicom.tags/tag/axialacceptance) | (0054,1200) VR=DS VM=1 Axial Acceptance. |
| static readonly [AxialDetectorDimension](../../aspose.medical.dicom.tags/tag/axialdetectordimension) | (0018,9727) VR=FD VM=1 Axial Detector Dimension. |
| static readonly [AxialLengthOfTheEye](../../aspose.medical.dicom.tags/tag/axiallengthoftheeye) | (0022,0030) VR=FL VM=1 Axial Length of the Eye. |
| static readonly [AxialMash](../../aspose.medical.dicom.tags/tag/axialmash) | (0054,1201) VR=IS VM=2 Axial Mash. |
| static readonly [AxialPower](../../aspose.medical.dicom.tags/tag/axialpower) | (0046,0249) VR=FL VM=1 Axial Power. |
| static readonly [AxialResolution](../../aspose.medical.dicom.tags/tag/axialresolution) | (0052,0008) VR=FD VM=1 Axial Resolution. |
| static readonly [AxisLabelsRETIRED](../../aspose.medical.dicom.tags/tag/axislabelsretired) | (50xx,0040) VR=SH VM=1-n Axis Labels (RETIRED). |
| static readonly [AxisOfRotation](../../aspose.medical.dicom.tags/tag/axisofrotation) | (0066,001B) VR=FL VM=3 Axis of Rotation. |
| static readonly [AxisUnitsRETIRED](../../aspose.medical.dicom.tags/tag/axisunitsretired) | (50xx,0030) VR=SH VM=1-n Axis Units (RETIRED). |
| static readonly [B1rms](../../aspose.medical.dicom.tags/tag/b1rms) | (0018,1320) VR=FL VM=1 B1rms. |
| static readonly [BackgroundColor](../../aspose.medical.dicom.tags/tag/backgroundcolor) | (0046,0092) VR=CS VM=1 Background Color. |
| static readonly [BackgroundIlluminationColorCodeSequence](../../aspose.medical.dicom.tags/tag/backgroundilluminationcolorcodesequence) | (0024,0024) VR=SQ VM=1 Background Illumination Color Code Sequence. |
| static readonly [BackgroundLuminance](../../aspose.medical.dicom.tags/tag/backgroundluminance) | (0024,0020) VR=FL VM=1 Background Luminance. |
| static readonly [BadPixelImageRETIRED](../../aspose.medical.dicom.tags/tag/badpixelimageretired) | (0014,3080) VR=OB VM=1 Bad Pixel Image (RETIRED). |
| static readonly [BarcodeSymbology](../../aspose.medical.dicom.tags/tag/barcodesymbology) | (2200,0006) VR=CS VM=1 Barcode Symbology. |
| static readonly [BarcodeValue](../../aspose.medical.dicom.tags/tag/barcodevalue) | (2200,0005) VR=LT VM=1 Barcode Value. |
| static readonly [BaselineCorrection](../../aspose.medical.dicom.tags/tag/baselinecorrection) | (0018,9067) VR=CS VM=1 Baseline Correction. |
| static readonly [BasicColorImageSequence](../../aspose.medical.dicom.tags/tag/basiccolorimagesequence) | (2020,0111) VR=SQ VM=1 Basic Color Image Sequence. |
| static readonly [BasicGrayscaleImageSequence](../../aspose.medical.dicom.tags/tag/basicgrayscaleimagesequence) | (2020,0110) VR=SQ VM=1 Basic Grayscale Image Sequence. |
| static readonly [BasisMaterialsCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/basismaterialscodesequenceretired) | (4010,1045) VR=SQ VM=1 Basis Materials Code Sequence (RETIRED). |
| static readonly [BasisRTTreatmentPhaseIndex](../../aspose.medical.dicom.tags/tag/basisrttreatmentphaseindex) | (3010,003E) VR=US VM=1 Basis RT Treatment Phase Index. |
| static readonly [BatteryLevel](../../aspose.medical.dicom.tags/tag/batterylevel) | (0016,0003) VR=UT VM=1 Battery Level. |
| static readonly [BeamAngle](../../aspose.medical.dicom.tags/tag/beamangle) | (0018,9449) VR=FL VM=1 Beam Angle. |
| static readonly [BeamAreaLimitSequence](../../aspose.medical.dicom.tags/tag/beamarealimitsequence) | (300A,0689) VR=SQ VM=1 Beam Area Limit Sequence. |
| static readonly [BeamCurrentModulationID](../../aspose.medical.dicom.tags/tag/beamcurrentmodulationid) | (300A,034C) VR=SH VM=1 Beam Current Modulation ID. |
| static readonly [BeamDeliveryDurationLimit](../../aspose.medical.dicom.tags/tag/beamdeliverydurationlimit) | (300A,00C5) VR=FD VM=1 Beam Delivery Duration Limit. |
| static readonly [BeamDescription](../../aspose.medical.dicom.tags/tag/beamdescription) | (300A,00C3) VR=ST VM=1 Beam Description. |
| static readonly [BeamDose](../../aspose.medical.dicom.tags/tag/beamdose) | (300A,0084) VR=DS VM=1 Beam Dose. |
| static readonly [BeamDoseMeaning](../../aspose.medical.dicom.tags/tag/beamdosemeaning) | (300A,008B) VR=CS VM=1 Beam Dose Meaning. |
| static readonly [BeamDosePointDepth](../../aspose.medical.dicom.tags/tag/beamdosepointdepth) | (300A,0088) VR=FL VM=1 Beam Dose Point Depth. |
| static readonly [BeamDosePointEquivalentDepth](../../aspose.medical.dicom.tags/tag/beamdosepointequivalentdepth) | (300A,0089) VR=FL VM=1 Beam Dose Point Equivalent Depth. |
| static readonly [BeamDosePointSourceToExternalContourDistance](../../aspose.medical.dicom.tags/tag/beamdosepointsourcetoexternalcontourdistance) | (300A,0094) VR=DS VM=1 Beam Dose Point Source to External Contour Distance. |
| static readonly [BeamDosePointSSD](../../aspose.medical.dicom.tags/tag/beamdosepointssd) | (300A,008A) VR=FL VM=1 Beam Dose Point SSD. |
| static readonly [BeamDoseSpecificationPointRETIRED](../../aspose.medical.dicom.tags/tag/beamdosespecificationpointretired) | (300A,0082) VR=DS VM=3 Beam Dose Specification Point (RETIRED). |
| static readonly [BeamDoseType](../../aspose.medical.dicom.tags/tag/beamdosetype) | (300A,0090) VR=CS VM=1 Beam Dose Type. |
| static readonly [BeamDoseVerificationControlPointSequence](../../aspose.medical.dicom.tags/tag/beamdoseverificationcontrolpointsequence) | (300A,008C) VR=SQ VM=1 Beam Dose Verification Control Point Sequence. |
| static readonly [BeamHardeningCorrectionTechniqueRETIRED](../../aspose.medical.dicom.tags/tag/beamhardeningcorrectiontechniqueretired) | (0014,3101) VR=LT VM=1 Beam Hardening Correction Technique (RETIRED). |
| static readonly [BeamHoldOriginatingDeviceSequence](../../aspose.medical.dicom.tags/tag/beamholdoriginatingdevicesequence) | (300C,0128) VR=SQ VM=1 Beam Hold Originating Device Sequence. |
| static readonly [BeamHoldTransition](../../aspose.medical.dicom.tags/tag/beamholdtransition) | (300C,0126) VR=CS VM=1 Beam Hold Transition. |
| static readonly [BeamHoldTransitionDateTime](../../aspose.medical.dicom.tags/tag/beamholdtransitiondatetime) | (300C,0127) VR=DT VM=1 Beam Hold Transition DateTime. |
| static readonly [BeamHoldTransitionTriggerSource](../../aspose.medical.dicom.tags/tag/beamholdtransitiontriggersource) | (300C,0129) VR=CS VM=1 Beam Hold Transition Trigger Source. |
| static readonly [BeamLimitingDeviceAngle](../../aspose.medical.dicom.tags/tag/beamlimitingdeviceangle) | (300A,0120) VR=DS VM=1 Beam Limiting Device Angle. |
| static readonly [BeamLimitingDeviceAngleTolerance](../../aspose.medical.dicom.tags/tag/beamlimitingdeviceangletolerance) | (300A,0046) VR=DS VM=1 Beam Limiting Device Angle Tolerance. |
| static readonly [BeamLimitingDeviceLeafPairsSequence](../../aspose.medical.dicom.tags/tag/beamlimitingdeviceleafpairssequence) | (3008,00A0) VR=SQ VM=1 Beam Limiting Device Leaf Pairs Sequence. |
| static readonly [BeamLimitingDevicePositionSequence](../../aspose.medical.dicom.tags/tag/beamlimitingdevicepositionsequence) | (300A,011A) VR=SQ VM=1 Beam Limiting Device Position Sequence. |
| static readonly [BeamLimitingDevicePositionTolerance](../../aspose.medical.dicom.tags/tag/beamlimitingdevicepositiontolerance) | (300A,004A) VR=DS VM=1 Beam Limiting Device Position Tolerance. |
| static readonly [BeamLimitingDeviceRotationDirection](../../aspose.medical.dicom.tags/tag/beamlimitingdevicerotationdirection) | (300A,0121) VR=CS VM=1 Beam Limiting Device Rotation Direction. |
| static readonly [BeamLimitingDeviceSequence](../../aspose.medical.dicom.tags/tag/beamlimitingdevicesequence) | (300A,00B6) VR=SQ VM=1 Beam Limiting Device Sequence. |
| static readonly [BeamLimitingDeviceToleranceSequence](../../aspose.medical.dicom.tags/tag/beamlimitingdevicetolerancesequence) | (300A,0048) VR=SQ VM=1 Beam Limiting Device Tolerance Sequence. |
| static readonly [BeamMeterset](../../aspose.medical.dicom.tags/tag/beammeterset) | (300A,0086) VR=DS VM=1 Beam Meterset. |
| static readonly [BeamModifierCoordinatesPresenceFlag](../../aspose.medical.dicom.tags/tag/beammodifiercoordinatespresenceflag) | (3002,0105) VR=CS VM=1 Beam Modifier Coordinates Presence Flag. |
| static readonly [BeamModifierOrientationAngle](../../aspose.medical.dicom.tags/tag/beammodifierorientationangle) | (300A,0645) VR=FD VM=1 Beam Modifier Orientation Angle. |
| static readonly [BeamName](../../aspose.medical.dicom.tags/tag/beamname) | (300A,00C2) VR=LO VM=1 Beam Name. |
| static readonly [BeamNumber](../../aspose.medical.dicom.tags/tag/beamnumber) | (300A,00C0) VR=IS VM=1 Beam Number. |
| static readonly [BeamOrderIndex](../../aspose.medical.dicom.tags/tag/beamorderindex) | (0074,1324) VR=UL VM=1 Beam Order Index. |
| static readonly [BeamOrderIndexTrialRETIRED](../../aspose.medical.dicom.tags/tag/beamorderindextrialretired) | (0074,1024) VR=IS VM=1 Beam Order Index (Trial) (RETIRED). |
| static readonly [BeamSequence](../../aspose.medical.dicom.tags/tag/beamsequence) | (300A,00B0) VR=SQ VM=1 Beam Sequence. |
| static readonly [BeamSpotSize](../../aspose.medical.dicom.tags/tag/beamspotsize) | (0052,0003) VR=FD VM=1 Beam Spot Size. |
| static readonly [BeamStopperPosition](../../aspose.medical.dicom.tags/tag/beamstopperposition) | (3008,0230) VR=CS VM=1 Beam Stopper Position. |
| static readonly [BeamTaskSequence](../../aspose.medical.dicom.tags/tag/beamtasksequence) | (0074,1020) VR=SQ VM=1 Beam Task Sequence. |
| static readonly [BeamTaskType](../../aspose.medical.dicom.tags/tag/beamtasktype) | (0074,1022) VR=CS VM=1 Beam Task Type. |
| static readonly [BeamType](../../aspose.medical.dicom.tags/tag/beamtype) | (300A,00C4) VR=CS VM=1 Beam Type. |
| static readonly [BeatRejectionFlag](../../aspose.medical.dicom.tags/tag/beatrejectionflag) | (0018,1080) VR=CS VM=1 Beat Rejection Flag. |
| static readonly [BeltHeightRETIRED](../../aspose.medical.dicom.tags/tag/beltheightretired) | (4010,1062) VR=FL VM=1 Belt Height (RETIRED). |
| static readonly [BibliographicCitationTrialRETIRED](../../aspose.medical.dicom.tags/tag/bibliographiccitationtrialretired) | (0040,A16A) VR=ST VM=1 Bibliographic Citation (Trial) (RETIRED). |
| static readonly [BillingItemSequence](../../aspose.medical.dicom.tags/tag/billingitemsequence) | (0040,0296) VR=SQ VM=1 Billing Item Sequence. |
| static readonly [BillingProcedureStepSequence](../../aspose.medical.dicom.tags/tag/billingprocedurestepsequence) | (0040,0320) VR=SQ VM=1 Billing Procedure Step Sequence. |
| static readonly [BillingSuppliesAndDevicesSequence](../../aspose.medical.dicom.tags/tag/billingsuppliesanddevicessequence) | (0040,0324) VR=SQ VM=1 Billing Supplies and Devices Sequence. |
| static readonly [BiopsyTargetSequence](../../aspose.medical.dicom.tags/tag/biopsytargetsequence) | (0018,2041) VR=SQ VM=1 Biopsy Target Sequence. |
| static readonly [BiPlaneAcquisitionSequenceRETIRED](../../aspose.medical.dicom.tags/tag/biplaneacquisitionsequenceretired) | (0028,5000) VR=SQ VM=1 Bi-Plane Acquisition Sequence (RETIRED). |
| static readonly [BitsAllocated](../../aspose.medical.dicom.tags/tag/bitsallocated) | (0028,0100) VR=US VM=1 Bits Allocated. |
| static readonly [BitsForCodeWordRETIRED](../../aspose.medical.dicom.tags/tag/bitsforcodewordretired) | (0028,08x4) VR=US VM=1 Bits For Code Word (RETIRED). |
| static readonly [BitsGroupedRETIRED](../../aspose.medical.dicom.tags/tag/bitsgroupedretired) | (0028,0069) VR=US VM=1 Bits Grouped (RETIRED). |
| static readonly [BitsMappedToColorLookupTable](../../aspose.medical.dicom.tags/tag/bitsmappedtocolorlookuptable) | (0028,1403) VR=US VM=1 Bits Mapped to Color Lookup Table. |
| static readonly [BitsStored](../../aspose.medical.dicom.tags/tag/bitsstored) | (0028,0101) VR=US VM=1 Bits Stored. |
| static readonly [BlendingDisplayInputSequence](../../aspose.medical.dicom.tags/tag/blendingdisplayinputsequence) | (0070,1B03) VR=SQ VM=1 Blending Display Input Sequence. |
| static readonly [BlendingDisplaySequence](../../aspose.medical.dicom.tags/tag/blendingdisplaysequence) | (0070,1B04) VR=SQ VM=1 Blending Display Sequence. |
| static readonly [BlendingInputNumber](../../aspose.medical.dicom.tags/tag/blendinginputnumber) | (0070,1B02) VR=US VM=1 Blending Input Number. |
| static readonly [BlendingLookupTableData](../../aspose.medical.dicom.tags/tag/blendinglookuptabledata) | (0028,1408) VR=OW VM=1 Blending Lookup Table Data. |
| static readonly [BlendingLookupTableDescriptor](../../aspose.medical.dicom.tags/tag/blendinglookuptabledescriptor) | (0028,1407) VR=US VM=3 Blending Lookup Table Descriptor. |
| static readonly [BlendingLUT1Sequence](../../aspose.medical.dicom.tags/tag/blendinglut1sequence) | (0028,1404) VR=SQ VM=1 Blending LUT 1 Sequence. |
| static readonly [BlendingLUT1TransferFunction](../../aspose.medical.dicom.tags/tag/blendinglut1transferfunction) | (0028,1405) VR=CS VM=1 Blending LUT 1 Transfer Function. |
| static readonly [BlendingLUT2Sequence](../../aspose.medical.dicom.tags/tag/blendinglut2sequence) | (0028,140C) VR=SQ VM=1 Blending LUT 2 Sequence. |
| static readonly [BlendingLUT2TransferFunction](../../aspose.medical.dicom.tags/tag/blendinglut2transferfunction) | (0028,140D) VR=CS VM=1 Blending LUT 2 Transfer Function. |
| static readonly [BlendingMode](../../aspose.medical.dicom.tags/tag/blendingmode) | (0070,1B06) VR=CS VM=1 Blending Mode. |
| static readonly [BlendingOperationType](../../aspose.medical.dicom.tags/tag/blendingoperationtype) | (0072,0500) VR=CS VM=1 Blending Operation Type. |
| static readonly [BlendingPosition](../../aspose.medical.dicom.tags/tag/blendingposition) | (0070,0405) VR=CS VM=1 Blending Position. |
| static readonly [BlendingSequence](../../aspose.medical.dicom.tags/tag/blendingsequence) | (0070,0402) VR=SQ VM=1 Blending Sequence. |
| static readonly [BlendingWeightConstant](../../aspose.medical.dicom.tags/tag/blendingweightconstant) | (0028,1406) VR=FD VM=1 Blending Weight Constant. |
| static readonly [BlindSpotLocalized](../../aspose.medical.dicom.tags/tag/blindspotlocalized) | (0024,0106) VR=CS VM=1 Blind Spot Localized. |
| static readonly [BlindSpotXCoordinate](../../aspose.medical.dicom.tags/tag/blindspotxcoordinate) | (0024,0107) VR=FL VM=1 Blind Spot X-Coordinate. |
| static readonly [BlindSpotYCoordinate](../../aspose.medical.dicom.tags/tag/blindspotycoordinate) | (0024,0108) VR=FL VM=1 Blind Spot Y-Coordinate. |
| static readonly [BlockColumnsRETIRED](../../aspose.medical.dicom.tags/tag/blockcolumnsretired) | (0028,0092) VR=US VM=1 Block Columns (RETIRED). |
| static readonly [BlockData](../../aspose.medical.dicom.tags/tag/blockdata) | (300A,0106) VR=DS VM=2-2n Block Data. |
| static readonly [BlockDefinitionSequence](../../aspose.medical.dicom.tags/tag/blockdefinitionsequence) | (300A,066A) VR=SQ VM=1 Block Definition Sequence. |
| static readonly [BlockDivergence](../../aspose.medical.dicom.tags/tag/blockdivergence) | (300A,00FA) VR=CS VM=1 Block Divergence. |
| static readonly [BlockEdgeData](../../aspose.medical.dicom.tags/tag/blockedgedata) | (300A,066B) VR=OF VM=1 Block Edge Data. |
| static readonly [BlockEdgeDataSequence](../../aspose.medical.dicom.tags/tag/blockedgedatasequence) | (300A,066F) VR=SQ VM=1 Block Edge Data Sequence. |
| static readonly [BlockedPixelsRETIRED](../../aspose.medical.dicom.tags/tag/blockedpixelsretired) | (0028,0090) VR=CS VM=1 Blocked Pixels (RETIRED). |
| static readonly [BlockIdentifyingInformationStatus](../../aspose.medical.dicom.tags/tag/blockidentifyinginformationstatus) | (0008,0303) VR=CS VM=1 Block Identifying Information Status. |
| static readonly [BlockMountingPosition](../../aspose.medical.dicom.tags/tag/blockmountingposition) | (300A,00FB) VR=CS VM=1 Block Mounting Position. |
| static readonly [BlockName](../../aspose.medical.dicom.tags/tag/blockname) | (300A,00FE) VR=LO VM=1 Block Name. |
| static readonly [BlockNumber](../../aspose.medical.dicom.tags/tag/blocknumber) | (300A,00FC) VR=IS VM=1 Block Number. |
| static readonly [BlockNumberOfPoints](../../aspose.medical.dicom.tags/tag/blocknumberofpoints) | (300A,0104) VR=IS VM=1 Block Number of Points. |
| static readonly [BlockOrientation](../../aspose.medical.dicom.tags/tag/blockorientation) | (300A,066C) VR=CS VM=1 Block Orientation. |
| static readonly [BlockRowsRETIRED](../../aspose.medical.dicom.tags/tag/blockrowsretired) | (0028,0091) VR=US VM=1 Block Rows (RETIRED). |
| static readonly [BlockSequence](../../aspose.medical.dicom.tags/tag/blocksequence) | (300A,00F4) VR=SQ VM=1 Block Sequence. |
| static readonly [BlockSlabNumber](../../aspose.medical.dicom.tags/tag/blockslabnumber) | (300A,0443) VR=US VM=1 Block Slab Number. |
| static readonly [BlockSlabSequence](../../aspose.medical.dicom.tags/tag/blockslabsequence) | (300A,0441) VR=SQ VM=1 Block Slab Sequence. |
| static readonly [BlockSlabThickness](../../aspose.medical.dicom.tags/tag/blockslabthickness) | (300A,0442) VR=DS VM=1 Block Slab Thickness. |
| static readonly [BlockThickness](../../aspose.medical.dicom.tags/tag/blockthickness) | (300A,0100) VR=DS VM=1 Block Thickness. |
| static readonly [BlockTransmission](../../aspose.medical.dicom.tags/tag/blocktransmission) | (300A,0102) VR=DS VM=1 Block Transmission. |
| static readonly [BlockTrayID](../../aspose.medical.dicom.tags/tag/blocktrayid) | (300A,00F5) VR=SH VM=1 Block Tray ID. |
| static readonly [BlockType](../../aspose.medical.dicom.tags/tag/blocktype) | (300A,00F8) VR=CS VM=1 Block Type. |
| static readonly [BloodSignalNulling](../../aspose.medical.dicom.tags/tag/bloodsignalnulling) | (0018,9022) VR=CS VM=1 Blood Signal Nulling. |
| static readonly [BluePaletteColorLookupTableData](../../aspose.medical.dicom.tags/tag/bluepalettecolorlookuptabledata) | (0028,1203) VR=OW VM=1 Blue Palette Color Lookup Table Data. |
| static readonly [BluePaletteColorLookupTableDescriptor](../../aspose.medical.dicom.tags/tag/bluepalettecolorlookuptabledescriptor) | (0028,1103) VR=US or SS VM=3 Blue Palette Color Lookup Table Descriptor. |
| static readonly [BoardingPassIDRETIRED](../../aspose.medical.dicom.tags/tag/boardingpassidretired) | (4010,101A) VR=SH VM=1 Boarding Pass ID (RETIRED). |
| static readonly [BodyPartExamined](../../aspose.medical.dicom.tags/tag/bodypartexamined) | (0018,0015) VR=CS VM=1 Body Part Examined. |
| static readonly [BodyPartThickness](../../aspose.medical.dicom.tags/tag/bodypartthickness) | (0018,11A0) VR=DS VM=1 Body Part Thickness. |
| static readonly [Bold](../../aspose.medical.dicom.tags/tag/bold) | (0070,0249) VR=CS VM=1 Bold. |
| static readonly [BolusDefinitionSequence](../../aspose.medical.dicom.tags/tag/bolusdefinitionsequence) | (300A,0673) VR=SQ VM=1 Bolus Definition Sequence. |
| static readonly [BolusDescription](../../aspose.medical.dicom.tags/tag/bolusdescription) | (300A,00DD) VR=ST VM=1 Bolus Description. |
| static readonly [BolusID](../../aspose.medical.dicom.tags/tag/bolusid) | (300A,00DC) VR=SH VM=1 Bolus ID. |
| static readonly [BoneThermalIndex](../../aspose.medical.dicom.tags/tag/bonethermalindex) | (0018,5024) VR=DS VM=1 Bone Thermal Index. |
| static readonly [BorderDensity](../../aspose.medical.dicom.tags/tag/borderdensity) | (2010,0100) VR=CS VM=1 Border Density. |
| static readonly [BordersRETIRED](../../aspose.medical.dicom.tags/tag/bordersretired) | (0000,5160) VR=CS VM=1 Borders (RETIRED). |
| static readonly [BottomRightHandCornerOfLocalizerAreaRETIRED](../../aspose.medical.dicom.tags/tag/bottomrighthandcorneroflocalizerarearetired) | (0048,0202) VR=US VM=2 Bottom Right Hand Corner of Localizer Area (RETIRED). |
| static readonly [BoundingBoxAnnotationUnits](../../aspose.medical.dicom.tags/tag/boundingboxannotationunits) | (0070,0003) VR=CS VM=1 Bounding Box Annotation Units. |
| static readonly [BoundingBoxBottomRightHandCorner](../../aspose.medical.dicom.tags/tag/boundingboxbottomrighthandcorner) | (0070,0011) VR=FL VM=2 Bounding Box Bottom Right Hand Corner. |
| static readonly [BoundingBoxCrop](../../aspose.medical.dicom.tags/tag/boundingboxcrop) | (0070,1303) VR=FD VM=6 Bounding Box Crop. |
| static readonly [BoundingBoxTextHorizontalJustification](../../aspose.medical.dicom.tags/tag/boundingboxtexthorizontaljustification) | (0070,0012) VR=CS VM=1 Bounding Box Text Horizontal Justification. |
| static readonly [BoundingBoxTopLeftHandCorner](../../aspose.medical.dicom.tags/tag/boundingboxtoplefthandcorner) | (0070,0010) VR=FL VM=2 Bounding Box Top Left Hand Corner. |
| static readonly [BoundingPolygonRETIRED](../../aspose.medical.dicom.tags/tag/boundingpolygonretired) | (4010,101D) VR=FL VM=6-n Bounding Polygon (RETIRED). |
| static readonly [BoundingRectangle](../../aspose.medical.dicom.tags/tag/boundingrectangle) | (0068,6347) VR=FD VM=4 Bounding Rectangle. |
| static readonly [BrachyAccessoryDeviceID](../../aspose.medical.dicom.tags/tag/brachyaccessorydeviceid) | (300A,0263) VR=SH VM=1 Brachy Accessory Device ID. |
| static readonly [BrachyAccessoryDeviceName](../../aspose.medical.dicom.tags/tag/brachyaccessorydevicename) | (300A,0266) VR=LO VM=1 Brachy Accessory Device Name. |
| static readonly [BrachyAccessoryDeviceNominalThickness](../../aspose.medical.dicom.tags/tag/brachyaccessorydevicenominalthickness) | (300A,026A) VR=DS VM=1 Brachy Accessory Device Nominal Thickness. |
| static readonly [BrachyAccessoryDeviceNominalTransmission](../../aspose.medical.dicom.tags/tag/brachyaccessorydevicenominaltransmission) | (300A,026C) VR=DS VM=1 Brachy Accessory Device Nominal Transmission. |
| static readonly [BrachyAccessoryDeviceNumber](../../aspose.medical.dicom.tags/tag/brachyaccessorydevicenumber) | (300A,0262) VR=IS VM=1 Brachy Accessory Device Number. |
| static readonly [BrachyAccessoryDeviceSequence](../../aspose.medical.dicom.tags/tag/brachyaccessorydevicesequence) | (300A,0260) VR=SQ VM=1 Brachy Accessory Device Sequence. |
| static readonly [BrachyAccessoryDeviceType](../../aspose.medical.dicom.tags/tag/brachyaccessorydevicetype) | (300A,0264) VR=CS VM=1 Brachy Accessory Device Type. |
| static readonly [BrachyApplicationSetupDose](../../aspose.medical.dicom.tags/tag/brachyapplicationsetupdose) | (300A,00A4) VR=DS VM=1 Brachy Application Setup Dose. |
| static readonly [BrachyApplicationSetupDoseSpecificationPoint](../../aspose.medical.dicom.tags/tag/brachyapplicationsetupdosespecificationpoint) | (300A,00A2) VR=DS VM=3 Brachy Application Setup Dose Specification Point. |
| static readonly [BrachyControlPointDeliveredSequence](../../aspose.medical.dicom.tags/tag/brachycontrolpointdeliveredsequence) | (3008,0160) VR=SQ VM=1 Brachy Control Point Delivered Sequence. |
| static readonly [BrachyControlPointSequence](../../aspose.medical.dicom.tags/tag/brachycontrolpointsequence) | (300A,02D0) VR=SQ VM=1 Brachy Control Point Sequence. |
| static readonly [BrachyPulseControlPointDeliveredSequence](../../aspose.medical.dicom.tags/tag/brachypulsecontrolpointdeliveredsequence) | (3008,0173) VR=SQ VM=1 Brachy Pulse Control Point Delivered Sequence. |
| static readonly [BrachyReferencedDoseReferenceSequence](../../aspose.medical.dicom.tags/tag/brachyreferenceddosereferencesequence) | (300C,0055) VR=SQ VM=1 Brachy Referenced Dose Reference Sequence. |
| static readonly [BrachyTaskSequence](../../aspose.medical.dicom.tags/tag/brachytasksequence) | (0074,1401) VR=SQ VM=1 Brachy Task Sequence. |
| static readonly [BrachytherapySourceType](../../aspose.medical.dicom.tags/tag/brachytherapysourcetype) | (3010,0048) VR=CS VM=1-n Brachytherapy Source Type. |
| static readonly [BrachyTreatmentTechnique](../../aspose.medical.dicom.tags/tag/brachytreatmenttechnique) | (300A,0200) VR=CS VM=1 Brachy Treatment Technique. |
| static readonly [BrachyTreatmentType](../../aspose.medical.dicom.tags/tag/brachytreatmenttype) | (300A,0202) VR=CS VM=1 Brachy Treatment Type. |
| static readonly [BranchOfService](../../aspose.medical.dicom.tags/tag/branchofservice) | (0010,1081) VR=LO VM=1 Branch of Service. |
| static readonly [BreastImplantPresent](../../aspose.medical.dicom.tags/tag/breastimplantpresent) | (0028,1300) VR=CS VM=1 Breast Implant Present. |
| static readonly [BreastSupportIsocenterPrimaryAngle](../../aspose.medical.dicom.tags/tag/breastsupportisocenterprimaryangle) | (0018,9545) VR=FD VM=1 Breast Support Isocenter Primary Angle. |
| static readonly [BreastSupportIsocenterSecondaryAngle](../../aspose.medical.dicom.tags/tag/breastsupportisocentersecondaryangle) | (0018,9546) VR=FD VM=1 Breast Support Isocenter Secondary Angle. |
| static readonly [BreastSupportXPositionToIsocenter](../../aspose.medical.dicom.tags/tag/breastsupportxpositiontoisocenter) | (0018,9547) VR=FD VM=1 Breast Support X Position to Isocenter. |
| static readonly [BreastSupportYPositionToIsocenter](../../aspose.medical.dicom.tags/tag/breastsupportypositiontoisocenter) | (0018,9548) VR=FD VM=1 Breast Support Y Position to Isocenter. |
| static readonly [BreastSupportZPositionToIsocenter](../../aspose.medical.dicom.tags/tag/breastsupportzpositiontoisocenter) | (0018,9549) VR=FD VM=1 Breast Support Z Position to Isocenter. |
| static readonly [BreedRegistrationNumber](../../aspose.medical.dicom.tags/tag/breedregistrationnumber) | (0010,2295) VR=LO VM=1 Breed Registration Number. |
| static readonly [BreedRegistrationSequence](../../aspose.medical.dicom.tags/tag/breedregistrationsequence) | (0010,2294) VR=SQ VM=1 Breed Registration Sequence. |
| static readonly [BreedRegistryCodeSequence](../../aspose.medical.dicom.tags/tag/breedregistrycodesequence) | (0010,2296) VR=SQ VM=1 Breed Registry Code Sequence. |
| static readonly [BridgeResistorsRETIRED](../../aspose.medical.dicom.tags/tag/bridgeresistorsretired) | (0014,4088) VR=DS VM=1 Bridge Resistors (RETIRED). |
| static readonly [BrightnessValue](../../aspose.medical.dicom.tags/tag/brightnessvalue) | (0016,0023) VR=DS VM=1 Brightness Value. |
| static readonly [BscanCycleTime](../../aspose.medical.dicom.tags/tag/bscancycletime) | (0022,1645) VR=FL VM=1 B-scan Cycle Time. |
| static readonly [BscanCycleTimeVector](../../aspose.medical.dicom.tags/tag/bscancycletimevector) | (0022,1646) VR=FL VM=1-n B-scan Cycle Time Vector. |
| static readonly [BscanRate](../../aspose.medical.dicom.tags/tag/bscanrate) | (0022,1650) VR=FL VM=1 B-scan Rate. |
| static readonly [BscanSlabThickness](../../aspose.medical.dicom.tags/tag/bscanslabthickness) | (0022,1643) VR=FL VM=1 B-scan Slab Thickness. |
| static readonly [BulkMotionCompensationTechnique](../../aspose.medical.dicom.tags/tag/bulkmotioncompensationtechnique) | (0018,9172) VR=CS VM=1 Bulk Motion Compensation Technique. |
| static readonly [BulkMotionSignalSource](../../aspose.medical.dicom.tags/tag/bulkmotionsignalsource) | (0018,9173) VR=CS VM=1 Bulk Motion Signal Source. |
| static readonly [BulkMotionStatusRETIRED](../../aspose.medical.dicom.tags/tag/bulkmotionstatusretired) | (0018,9166) VR=CS VM=1 Bulk Motion Status (RETIRED). |
| static readonly [BurnedInAnnotation](../../aspose.medical.dicom.tags/tag/burnedinannotation) | (0028,0301) VR=CS VM=1 Burned In Annotation. |
| static readonly [CADFileFormatRETIRED](../../aspose.medical.dicom.tags/tag/cadfileformatretired) | (0014,0023) VR=ST VM=1 CAD File Format (RETIRED). |
| static readonly [CalciumScoringMassFactorDevice](../../aspose.medical.dicom.tags/tag/calciumscoringmassfactordevice) | (0018,9352) VR=FL VM=3 Calcium Scoring Mass Factor Device. |
| static readonly [CalciumScoringMassFactorPatient](../../aspose.medical.dicom.tags/tag/calciumscoringmassfactorpatient) | (0018,9351) VR=FL VM=1 Calcium Scoring Mass Factor Patient. |
| static readonly [CalculatedAnatomyThickness](../../aspose.medical.dicom.tags/tag/calculatedanatomythickness) | (0018,9452) VR=FL VM=1 Calculated Anatomy Thickness. |
| static readonly [CalculatedDoseReferenceDescription](../../aspose.medical.dicom.tags/tag/calculateddosereferencedescription) | (3008,0074) VR=ST VM=1 Calculated Dose Reference Description. |
| static readonly [CalculatedDoseReferenceDoseValue](../../aspose.medical.dicom.tags/tag/calculateddosereferencedosevalue) | (3008,0076) VR=DS VM=1 Calculated Dose Reference Dose Value. |
| static readonly [CalculatedDoseReferenceNumber](../../aspose.medical.dicom.tags/tag/calculateddosereferencenumber) | (3008,0072) VR=IS VM=1 Calculated Dose Reference Number. |
| static readonly [CalculatedDoseReferenceSequence](../../aspose.medical.dicom.tags/tag/calculateddosereferencesequence) | (3008,0070) VR=SQ VM=1 Calculated Dose Reference Sequence. |
| static readonly [CalculatedFrameList](../../aspose.medical.dicom.tags/tag/calculatedframelist) | (0008,1162) VR=UL VM=3-3n Calculated Frame List. |
| static readonly [CalculatedTargetPosition](../../aspose.medical.dicom.tags/tag/calculatedtargetposition) | (0018,2044) VR=FL VM=3 Calculated Target Position. |
| static readonly [CalculationComment](../../aspose.medical.dicom.tags/tag/calculationcomment) | (0022,112C) VR=LT VM=1 Calculation Comment. |
| static readonly [CalculationCommentSequence](../../aspose.medical.dicom.tags/tag/calculationcommentsequence) | (0022,112A) VR=SQ VM=1 Calculation Comment Sequence. |
| static readonly [CalculationCommentType](../../aspose.medical.dicom.tags/tag/calculationcommenttype) | (0022,112B) VR=CS VM=1 Calculation Comment Type. |
| static readonly [CalibrationDataSequence](../../aspose.medical.dicom.tags/tag/calibrationdatasequence) | (0054,0306) VR=SQ VM=1 Calibration Data Sequence. |
| static readonly [CalibrationDateRETIRED](../../aspose.medical.dicom.tags/tag/calibrationdateretired) | (0014,407E) VR=DA VM=1-n Calibration Date (RETIRED). |
| static readonly [CalibrationDateTime](../../aspose.medical.dicom.tags/tag/calibrationdatetime) | (0018,1203) VR=DT VM=1 Calibration DateTime. |
| static readonly [CalibrationImage](../../aspose.medical.dicom.tags/tag/calibrationimage) | (0050,0004) VR=CS VM=1 Calibration Image. |
| static readonly [CalibrationNotesRETIRED](../../aspose.medical.dicom.tags/tag/calibrationnotesretired) | (0014,3099) VR=LT VM=1 Calibration Notes (RETIRED). |
| static readonly [CalibrationProcedureRETIRED](../../aspose.medical.dicom.tags/tag/calibrationprocedureretired) | (0014,4072) VR=ST VM=1 Calibration Procedure (RETIRED). |
| static readonly [CalibrationReferencePointDepth](../../aspose.medical.dicom.tags/tag/calibrationreferencepointdepth) | (300C,0124) VR=FD VM=1 Calibration Reference Point Depth. |
| static readonly [CalibrationSequence](../../aspose.medical.dicom.tags/tag/calibrationsequence) | (0018,9455) VR=SQ VM=1 Calibration Sequence. |
| static readonly [CalibrationSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/calibrationsettingssequenceretired) | (0014,4070) VR=SQ VM=1 Calibration Settings Sequence (RETIRED). |
| static readonly [CalibrationTimeRETIRED](../../aspose.medical.dicom.tags/tag/calibrationtimeretired) | (0014,407C) VR=TM VM=1-n Calibration Time (RETIRED). |
| static readonly [CameraAngleOfView](../../aspose.medical.dicom.tags/tag/cameraangleofview) | (0022,001E) VR=FL VM=1 Camera Angle of View. |
| static readonly [CameraElevationAngle](../../aspose.medical.dicom.tags/tag/cameraelevationangle) | (0016,0035) VR=DS VM=1 Camera Elevation Angle. |
| static readonly [CameraOwnerName](../../aspose.medical.dicom.tags/tag/cameraownername) | (0016,004D) VR=UT VM=1 Camera Owner Name. |
| static readonly [CameraPositionGroupSequence](../../aspose.medical.dicom.tags/tag/camerapositiongroupsequence) | (0034,000B) VR=SQ VM=1 Camera Position Group Sequence. |
| static readonly [CardiacBeatRejectionTechnique](../../aspose.medical.dicom.tags/tag/cardiacbeatrejectiontechnique) | (0018,9169) VR=CS VM=1 Cardiac Beat Rejection Technique. |
| static readonly [CardiacCyclePosition](../../aspose.medical.dicom.tags/tag/cardiaccycleposition) | (0018,9236) VR=CS VM=1 Cardiac Cycle Position. |
| static readonly [CardiacFramingType](../../aspose.medical.dicom.tags/tag/cardiacframingtype) | (0018,1064) VR=LO VM=1 Cardiac Framing Type. |
| static readonly [CardiacNumberOfImages](../../aspose.medical.dicom.tags/tag/cardiacnumberofimages) | (0018,1090) VR=IS VM=1 Cardiac Number of Images. |
| static readonly [CardiacRRIntervalSpecified](../../aspose.medical.dicom.tags/tag/cardiacrrintervalspecified) | (0018,9070) VR=FD VM=1 Cardiac R-R Interval Specified. |
| static readonly [CardiacSignalSource](../../aspose.medical.dicom.tags/tag/cardiacsignalsource) | (0018,9085) VR=CS VM=1 Cardiac Signal Source. |
| static readonly [CardiacSynchronizationSequence](../../aspose.medical.dicom.tags/tag/cardiacsynchronizationsequence) | (0018,9118) VR=SQ VM=1 Cardiac Synchronization Sequence. |
| static readonly [CardiacSynchronizationTechnique](../../aspose.medical.dicom.tags/tag/cardiacsynchronizationtechnique) | (0018,9037) VR=CS VM=1 Cardiac Synchronization Technique. |
| static readonly [CArmPhotonElectronControlPointSequence](../../aspose.medical.dicom.tags/tag/carmphotonelectroncontrolpointsequence) | (300A,062F) VR=SQ VM=1 C-Arm Photon-Electron Control Point Sequence. |
| static readonly [CArmPositionerTabletopRelationship](../../aspose.medical.dicom.tags/tag/carmpositionertabletoprelationship) | (0018,9474) VR=CS VM=1 C-arm Positioner Tabletop Relationship. |
| static readonly [CarrierIDAssigningAuthorityRETIRED](../../aspose.medical.dicom.tags/tag/carrieridassigningauthorityretired) | (4010,1059) VR=CS VM=1 Carrier ID Assigning Authority (RETIRED). |
| static readonly [CarrierIDRETIRED](../../aspose.medical.dicom.tags/tag/carrieridretired) | (4010,1058) VR=SH VM=1 Carrier ID (RETIRED). |
| static readonly [CassetteID](../../aspose.medical.dicom.tags/tag/cassetteid) | (0018,1007) VR=LO VM=1 Cassette ID. |
| static readonly [CassetteOrientation](../../aspose.medical.dicom.tags/tag/cassetteorientation) | (0018,1402) VR=CS VM=1 Cassette Orientation. |
| static readonly [CassetteSize](../../aspose.medical.dicom.tags/tag/cassettesize) | (0018,1403) VR=CS VM=1 Cassette Size. |
| static readonly [CatchTrialsDataFlag](../../aspose.medical.dicom.tags/tag/catchtrialsdataflag) | (0024,0055) VR=CS VM=1 Catch Trials Data Flag. |
| static readonly [CatheterDirectionOfRotation](../../aspose.medical.dicom.tags/tag/catheterdirectionofrotation) | (0052,0031) VR=CS VM=1 Catheter Direction of Rotation. |
| static readonly [CatheterRotationalRate](../../aspose.medical.dicom.tags/tag/catheterrotationalrate) | (0052,0013) VR=FD VM=1 Catheter Rotational Rate. |
| static readonly [CellValuesSequence](../../aspose.medical.dicom.tags/tag/cellvaluessequence) | (0040,A808) VR=SQ VM=1 Cell Values Sequence. |
| static readonly [CenterFrequency](../../aspose.medical.dicom.tags/tag/centerfrequency) | (0018,982D) VR=FD VM=1 Center Frequency. |
| static readonly [CenterOfCircularCollimator](../../aspose.medical.dicom.tags/tag/centerofcircularcollimator) | (0018,1710) VR=IS VM=2 Center of Circular Collimator. |
| static readonly [CenterOfCircularExposureControlSensingRegion](../../aspose.medical.dicom.tags/tag/centerofcircularexposurecontrolsensingregion) | (0018,9440) VR=SS VM=2 Center of Circular Exposure Control Sensing Region. |
| static readonly [CenterOfCircularOutline](../../aspose.medical.dicom.tags/tag/centerofcircularoutline) | (0018,1635) VR=FD VM=2 Center of Circular Outline. |
| static readonly [CenterOfCircularShutter](../../aspose.medical.dicom.tags/tag/centerofcircularshutter) | (0018,1610) VR=IS VM=2 Center of Circular Shutter. |
| static readonly [CenterOfMassRETIRED](../../aspose.medical.dicom.tags/tag/centerofmassretired) | (4010,101B) VR=FL VM=3 Center of Mass (RETIRED). |
| static readonly [CenterOfPTORETIRED](../../aspose.medical.dicom.tags/tag/centerofptoretired) | (4010,101C) VR=FL VM=3 Center of PTO (RETIRED). |
| static readonly [CenterOfRotation](../../aspose.medical.dicom.tags/tag/centerofrotation) | (0066,001C) VR=FL VM=3 Center of Rotation. |
| static readonly [CenterOfRotationOffset](../../aspose.medical.dicom.tags/tag/centerofrotationoffset) | (0018,1145) VR=DS VM=1 Center of Rotation Offset. |
| static readonly [CertificateOfSigner](../../aspose.medical.dicom.tags/tag/certificateofsigner) | (0400,0115) VR=OB VM=1 Certificate of Signer. |
| static readonly [CertificateType](../../aspose.medical.dicom.tags/tag/certificatetype) | (0400,0110) VR=CS VM=1 Certificate Type. |
| static readonly [CertifiedTimestamp](../../aspose.medical.dicom.tags/tag/certifiedtimestamp) | (0400,0310) VR=OB VM=1 Certified Timestamp. |
| static readonly [CertifiedTimestampType](../../aspose.medical.dicom.tags/tag/certifiedtimestamptype) | (0400,0305) VR=CS VM=1 Certified Timestamp Type. |
| static readonly [ChairHeadFramePosition](../../aspose.medical.dicom.tags/tag/chairheadframeposition) | (300A,0151) VR=DS VM=1 Chair Head Frame Position. |
| static readonly [ChairHeadFramePositionTolerance](../../aspose.medical.dicom.tags/tag/chairheadframepositiontolerance) | (300A,0153) VR=DS VM=1 Chair Head Frame Position Tolerance. |
| static readonly [ChannelBaseline](../../aspose.medical.dicom.tags/tag/channelbaseline) | (003A,0213) VR=DS VM=1 Channel Baseline. |
| static readonly [ChannelDefinitionSequence](../../aspose.medical.dicom.tags/tag/channeldefinitionsequence) | (003A,0200) VR=SQ VM=1 Channel Definition Sequence. |
| static readonly [ChannelDeliveryContinuationSequence](../../aspose.medical.dicom.tags/tag/channeldeliverycontinuationsequence) | (0074,140D) VR=SQ VM=1 Channel Delivery Continuation Sequence. |
| static readonly [ChannelDeliveryOrderIndex](../../aspose.medical.dicom.tags/tag/channeldeliveryorderindex) | (0074,140C) VR=IS VM=1 Channel Delivery Order Index. |
| static readonly [ChannelDeliveryOrderSequence](../../aspose.medical.dicom.tags/tag/channeldeliveryordersequence) | (0074,1405) VR=SQ VM=1 Channel Delivery Order Sequence. |
| static readonly [ChannelDerivationDescription](../../aspose.medical.dicom.tags/tag/channelderivationdescription) | (003A,020C) VR=LO VM=1 Channel Derivation Description. |
| static readonly [ChannelDescriptionCodeSequence](../../aspose.medical.dicom.tags/tag/channeldescriptioncodesequence) | (0022,001A) VR=SQ VM=1 Channel Description Code Sequence. |
| static readonly [ChannelDisplaySequence](../../aspose.medical.dicom.tags/tag/channeldisplaysequence) | (003A,0242) VR=SQ VM=1 Channel Display Sequence. |
| static readonly [ChannelEffectiveLength](../../aspose.medical.dicom.tags/tag/channeleffectivelength) | (300A,0271) VR=DS VM=1 Channel Effective Length. |
| static readonly [ChannelIdentificationCode](../../aspose.medical.dicom.tags/tag/channelidentificationcode) | (003A,0301) VR=IS VM=1 Channel Identification Code. |
| static readonly [ChannelImpedanceSequence](../../aspose.medical.dicom.tags/tag/channelimpedancesequence) | (003A,0312) VR=SQ VM=1 Channel Impedance Sequence. |
| static readonly [ChannelInnerLength](../../aspose.medical.dicom.tags/tag/channelinnerlength) | (300A,0272) VR=DS VM=1 Channel Inner Length. |
| static readonly [ChannelLabel](../../aspose.medical.dicom.tags/tag/channellabel) | (003A,0203) VR=SH VM=1 Channel Label. |
| static readonly [ChannelLength](../../aspose.medical.dicom.tags/tag/channellength) | (300A,0284) VR=DS VM=1 Channel Length. |
| static readonly [ChannelMaximumValue](../../aspose.medical.dicom.tags/tag/channelmaximumvalue) | (5400,0112) VR=OB or OW VM=1 Channel Maximum Value. |
| static readonly [ChannelMinimumValue](../../aspose.medical.dicom.tags/tag/channelminimumvalue) | (5400,0110) VR=OB or OW VM=1 Channel Minimum Value. |
| static readonly [ChannelMode](../../aspose.medical.dicom.tags/tag/channelmode) | (003A,0302) VR=CS VM=1 Channel Mode. |
| static readonly [ChannelNumber](../../aspose.medical.dicom.tags/tag/channelnumber) | (300A,0282) VR=IS VM=1 Channel Number. |
| static readonly [ChannelOffset](../../aspose.medical.dicom.tags/tag/channeloffset) | (003A,0218) VR=DS VM=1 Channel Offset. |
| static readonly [ChannelOverlapRETIRED](../../aspose.medical.dicom.tags/tag/channeloverlapretired) | (0014,409F) VR=DS VM=1 Channel Overlap (RETIRED). |
| static readonly [ChannelPosition](../../aspose.medical.dicom.tags/tag/channelposition) | (003A,0245) VR=FL VM=1 Channel Position. |
| static readonly [ChannelRecommendedDisplayCIELabValue](../../aspose.medical.dicom.tags/tag/channelrecommendeddisplaycielabvalue) | (003A,0244) VR=US VM=3 Channel Recommended Display CIELab Value. |
| static readonly [ChannelSampleSkew](../../aspose.medical.dicom.tags/tag/channelsampleskew) | (003A,0215) VR=DS VM=1 Channel Sample Skew. |
| static readonly [ChannelSensitivity](../../aspose.medical.dicom.tags/tag/channelsensitivity) | (003A,0210) VR=DS VM=1 Channel Sensitivity. |
| static readonly [ChannelSensitivityCorrectionFactor](../../aspose.medical.dicom.tags/tag/channelsensitivitycorrectionfactor) | (003A,0212) VR=DS VM=1 Channel Sensitivity Correction Factor. |
| static readonly [ChannelSensitivityUnitsSequence](../../aspose.medical.dicom.tags/tag/channelsensitivityunitssequence) | (003A,0211) VR=SQ VM=1 Channel Sensitivity Units Sequence. |
| static readonly [ChannelSequence](../../aspose.medical.dicom.tags/tag/channelsequence) | (300A,0280) VR=SQ VM=1 Channel Sequence. |
| static readonly [ChannelSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/channelsettingssequenceretired) | (0014,4091) VR=SQ VM=1 Channel Settings Sequence (RETIRED). |
| static readonly [ChannelShieldID](../../aspose.medical.dicom.tags/tag/channelshieldid) | (300A,02B3) VR=SH VM=1 Channel Shield ID. |
| static readonly [ChannelShieldName](../../aspose.medical.dicom.tags/tag/channelshieldname) | (300A,02B4) VR=LO VM=1 Channel Shield Name. |
| static readonly [ChannelShieldNominalThickness](../../aspose.medical.dicom.tags/tag/channelshieldnominalthickness) | (300A,02B8) VR=DS VM=1 Channel Shield Nominal Thickness. |
| static readonly [ChannelShieldNominalTransmission](../../aspose.medical.dicom.tags/tag/channelshieldnominaltransmission) | (300A,02BA) VR=DS VM=1 Channel Shield Nominal Transmission. |
| static readonly [ChannelShieldNumber](../../aspose.medical.dicom.tags/tag/channelshieldnumber) | (300A,02B2) VR=IS VM=1 Channel Shield Number. |
| static readonly [ChannelShieldSequence](../../aspose.medical.dicom.tags/tag/channelshieldsequence) | (300A,02B0) VR=SQ VM=1 Channel Shield Sequence. |
| static readonly [ChannelSourceModifiersSequence](../../aspose.medical.dicom.tags/tag/channelsourcemodifierssequence) | (003A,0209) VR=SQ VM=1 Channel Source Modifiers Sequence. |
| static readonly [ChannelSourceSequence](../../aspose.medical.dicom.tags/tag/channelsourcesequence) | (003A,0208) VR=SQ VM=1 Channel Source Sequence. |
| static readonly [ChannelStatus](../../aspose.medical.dicom.tags/tag/channelstatus) | (003A,0205) VR=CS VM=1-n Channel Status. |
| static readonly [ChannelThresholdRETIRED](../../aspose.medical.dicom.tags/tag/channelthresholdretired) | (0014,4092) VR=DS VM=1 Channel Threshold (RETIRED). |
| static readonly [ChannelTimeSkew](../../aspose.medical.dicom.tags/tag/channeltimeskew) | (003A,0214) VR=DS VM=1 Channel Time Skew. |
| static readonly [ChannelTotalTime](../../aspose.medical.dicom.tags/tag/channeltotaltime) | (300A,0286) VR=DS VM=1 Channel Total Time. |
| static readonly [ChannelWeight](../../aspose.medical.dicom.tags/tag/channelweight) | (0040,B042) VR=FL VM=1 Channel Weight. |
| static readonly [ChannelWidth](../../aspose.medical.dicom.tags/tag/channelwidth) | (0046,0042) VR=FD VM=1 Channel Width. |
| static readonly [ChemicalShiftMaximumIntegrationLimitInHzRETIRED](../../aspose.medical.dicom.tags/tag/chemicalshiftmaximumintegrationlimitinhzretired) | (0018,9196) VR=FD VM=1 Chemical Shift Maximum Integration Limit in Hz (RETIRED). |
| static readonly [ChemicalShiftMaximumIntegrationLimitInppm](../../aspose.medical.dicom.tags/tag/chemicalshiftmaximumintegrationlimitinppm) | (0018,9296) VR=FD VM=1 Chemical Shift Maximum Integration Limit in ppm. |
| static readonly [ChemicalShiftMinimumIntegrationLimitInHzRETIRED](../../aspose.medical.dicom.tags/tag/chemicalshiftminimumintegrationlimitinhzretired) | (0018,9195) VR=FD VM=1 Chemical Shift Minimum Integration Limit in Hz (RETIRED). |
| static readonly [ChemicalShiftMinimumIntegrationLimitInppm](../../aspose.medical.dicom.tags/tag/chemicalshiftminimumintegrationlimitinppm) | (0018,9295) VR=FD VM=1 Chemical Shift Minimum Integration Limit in ppm. |
| static readonly [ChemicalShiftReference](../../aspose.medical.dicom.tags/tag/chemicalshiftreference) | (0018,9053) VR=FD VM=1-2 Chemical Shift Reference. |
| static readonly [ChemicalShiftSequence](../../aspose.medical.dicom.tags/tag/chemicalshiftsequence) | (0018,9084) VR=SQ VM=1 Chemical Shift Sequence. |
| static readonly [CIExyWhitePoint](../../aspose.medical.dicom.tags/tag/ciexywhitepoint) | (0028,7018) VR=FL VM=2 CIExy White Point. |
| static readonly [CineRate](../../aspose.medical.dicom.tags/tag/cinerate) | (0018,0040) VR=IS VM=1 Cine Rate. |
| static readonly [CineRelativeToRealTime](../../aspose.medical.dicom.tags/tag/cinerelativetorealtime) | (0072,0330) VR=FD VM=1 Cine Relative to Real-Time. |
| static readonly [ClinicalFractionNumber](../../aspose.medical.dicom.tags/tag/clinicalfractionnumber) | (300A,0705) VR=US VM=1 Clinical Fraction Number. |
| static readonly [ClinicalTrialCoordinatingCenterName](../../aspose.medical.dicom.tags/tag/clinicaltrialcoordinatingcentername) | (0012,0060) VR=LO VM=1 Clinical Trial Coordinating Center Name. |
| static readonly [ClinicalTrialProtocolEthicsCommitteeApprovalNumber](../../aspose.medical.dicom.tags/tag/clinicaltrialprotocolethicscommitteeapprovalnumber) | (0012,0082) VR=LO VM=1 Clinical Trial Protocol Ethics Committee Approval Number. |
| static readonly [ClinicalTrialProtocolEthicsCommitteeName](../../aspose.medical.dicom.tags/tag/clinicaltrialprotocolethicscommitteename) | (0012,0081) VR=LO VM=1 Clinical Trial Protocol Ethics Committee Name. |
| static readonly [ClinicalTrialProtocolID](../../aspose.medical.dicom.tags/tag/clinicaltrialprotocolid) | (0012,0020) VR=LO VM=1 Clinical Trial Protocol ID. |
| static readonly [ClinicalTrialProtocolName](../../aspose.medical.dicom.tags/tag/clinicaltrialprotocolname) | (0012,0021) VR=LO VM=1 Clinical Trial Protocol Name. |
| static readonly [ClinicalTrialSeriesDescription](../../aspose.medical.dicom.tags/tag/clinicaltrialseriesdescription) | (0012,0072) VR=LO VM=1 Clinical Trial Series Description. |
| static readonly [ClinicalTrialSeriesID](../../aspose.medical.dicom.tags/tag/clinicaltrialseriesid) | (0012,0071) VR=LO VM=1 Clinical Trial Series ID. |
| static readonly [ClinicalTrialSiteID](../../aspose.medical.dicom.tags/tag/clinicaltrialsiteid) | (0012,0030) VR=LO VM=1 Clinical Trial Site ID. |
| static readonly [ClinicalTrialSiteName](../../aspose.medical.dicom.tags/tag/clinicaltrialsitename) | (0012,0031) VR=LO VM=1 Clinical Trial Site Name. |
| static readonly [ClinicalTrialSponsorName](../../aspose.medical.dicom.tags/tag/clinicaltrialsponsorname) | (0012,0010) VR=LO VM=1 Clinical Trial Sponsor Name. |
| static readonly [ClinicalTrialSubjectID](../../aspose.medical.dicom.tags/tag/clinicaltrialsubjectid) | (0012,0040) VR=LO VM=1 Clinical Trial Subject ID. |
| static readonly [ClinicalTrialSubjectReadingID](../../aspose.medical.dicom.tags/tag/clinicaltrialsubjectreadingid) | (0012,0042) VR=LO VM=1 Clinical Trial Subject Reading ID. |
| static readonly [ClinicalTrialTimePointDescription](../../aspose.medical.dicom.tags/tag/clinicaltrialtimepointdescription) | (0012,0051) VR=ST VM=1 Clinical Trial Time Point Description. |
| static readonly [ClinicalTrialTimePointID](../../aspose.medical.dicom.tags/tag/clinicaltrialtimepointid) | (0012,0050) VR=LO VM=1 Clinical Trial Time Point ID. |
| static readonly [ClinicalTrialTimePointTypeCodeSequence](../../aspose.medical.dicom.tags/tag/clinicaltrialtimepointtypecodesequence) | (0012,0054) VR=SQ VM=1 Clinical Trial Time Point Type Code Sequence. |
| static readonly [CoatingMaterialsCodeSequence](../../aspose.medical.dicom.tags/tag/coatingmaterialscodesequence) | (0068,63A4) VR=SQ VM=1 Coating Materials Code Sequence. |
| static readonly [CodeLabelRETIRED](../../aspose.medical.dicom.tags/tag/codelabelretired) | (0028,08x0) VR=CS VM=1-n Code Label (RETIRED). |
| static readonly [CodeMeaning](../../aspose.medical.dicom.tags/tag/codemeaning) | (0008,0104) VR=LO VM=1 Code Meaning. |
| static readonly [CodeNumberFormatRETIRED](../../aspose.medical.dicom.tags/tag/codenumberformatretired) | (0028,0740) VR=US VM=1 Code Number Format (RETIRED). |
| static readonly [CodeTableLocationRETIRED](../../aspose.medical.dicom.tags/tag/codetablelocationretired) | (0028,08x3) VR=AT VM=1-n Code Table Location (RETIRED). |
| static readonly [CodeValue](../../aspose.medical.dicom.tags/tag/codevalue) | (0008,0100) VR=SH VM=1 Code Value. |
| static readonly [CodingSchemeDesignator](../../aspose.medical.dicom.tags/tag/codingschemedesignator) | (0008,0102) VR=SH VM=1 Coding Scheme Designator. |
| static readonly [CodingSchemeExternalID](../../aspose.medical.dicom.tags/tag/codingschemeexternalid) | (0008,0114) VR=ST VM=1 Coding Scheme External ID. |
| static readonly [CodingSchemeIdentificationSequence](../../aspose.medical.dicom.tags/tag/codingschemeidentificationsequence) | (0008,0110) VR=SQ VM=1 Coding Scheme Identification Sequence. |
| static readonly [CodingSchemeName](../../aspose.medical.dicom.tags/tag/codingschemename) | (0008,0115) VR=ST VM=1 Coding Scheme Name. |
| static readonly [CodingSchemeRegistry](../../aspose.medical.dicom.tags/tag/codingschemeregistry) | (0008,0112) VR=LO VM=1 Coding Scheme Registry. |
| static readonly [CodingSchemeResourcesSequence](../../aspose.medical.dicom.tags/tag/codingschemeresourcessequence) | (0008,0109) VR=SQ VM=1 Coding Scheme Resources Sequence. |
| static readonly [CodingSchemeResponsibleOrganization](../../aspose.medical.dicom.tags/tag/codingschemeresponsibleorganization) | (0008,0116) VR=ST VM=1 Coding Scheme Responsible Organization. |
| static readonly [CodingSchemeUID](../../aspose.medical.dicom.tags/tag/codingschemeuid) | (0008,010C) VR=UI VM=1 Coding Scheme UID. |
| static readonly [CodingSchemeURL](../../aspose.medical.dicom.tags/tag/codingschemeurl) | (0008,010E) VR=UR VM=1 Coding Scheme URL. |
| static readonly [CodingSchemeURLType](../../aspose.medical.dicom.tags/tag/codingschemeurltype) | (0008,010A) VR=CS VM=1 Coding Scheme URL Type. |
| static readonly [CodingSchemeVersion](../../aspose.medical.dicom.tags/tag/codingschemeversion) | (0008,0103) VR=SH VM=1 Coding Scheme Version. |
| static readonly [CoefficientCodingPointersRETIRED](../../aspose.medical.dicom.tags/tag/coefficientcodingpointersretired) | (0028,04x3) VR=AT VM=1-n Coefficient Coding Pointers (RETIRED). |
| static readonly [CoefficientCodingRETIRED](../../aspose.medical.dicom.tags/tag/coefficientcodingretired) | (0028,04x2) VR=LO VM=1-n Coefficient Coding (RETIRED). |
| static readonly [CoefficientsSDDNRETIRED](../../aspose.medical.dicom.tags/tag/coefficientssddnretired) | (7FE0,0040) VR=OW VM=1 Coefficients SDDN (RETIRED). |
| static readonly [CoefficientsSDHNRETIRED](../../aspose.medical.dicom.tags/tag/coefficientssdhnretired) | (7FE0,0030) VR=OW VM=1 Coefficients SDHN (RETIRED). |
| static readonly [CoefficientsSDVNRETIRED](../../aspose.medical.dicom.tags/tag/coefficientssdvnretired) | (7FE0,0020) VR=OW VM=1 Coefficients SDVN (RETIRED). |
| static readonly [CoilConfigurationIDRETIRED](../../aspose.medical.dicom.tags/tag/coilconfigurationidretired) | (0014,602F) VR=ST VM=1 Coil Configuration ID (RETIRED). |
| static readonly [CoilFrequencyRETIRED](../../aspose.medical.dicom.tags/tag/coilfrequencyretired) | (0014,600D) VR=DS VM=1 Coil Frequency (RETIRED). |
| static readonly [CoincidenceWindowWidth](../../aspose.medical.dicom.tags/tag/coincidencewindowwidth) | (0054,1210) VR=DS VM=1 Coincidence Window Width. |
| static readonly [CollationFlagRETIRED](../../aspose.medical.dicom.tags/tag/collationflagretired) | (2000,0063) VR=CS VM=1 Collation Flag (RETIRED). |
| static readonly [CollimatorGridName](../../aspose.medical.dicom.tags/tag/collimatorgridname) | (0018,1180) VR=SH VM=1 Collimator/grid Name. |
| static readonly [CollimatorLeftVerticalEdge](../../aspose.medical.dicom.tags/tag/collimatorleftverticaledge) | (0018,1702) VR=IS VM=1 Collimator Left Vertical Edge. |
| static readonly [CollimatorLowerHorizontalEdge](../../aspose.medical.dicom.tags/tag/collimatorlowerhorizontaledge) | (0018,1708) VR=IS VM=1 Collimator Lower Horizontal Edge. |
| static readonly [CollimatorRightVerticalEdge](../../aspose.medical.dicom.tags/tag/collimatorrightverticaledge) | (0018,1704) VR=IS VM=1 Collimator Right Vertical Edge. |
| static readonly [CollimatorShape](../../aspose.medical.dicom.tags/tag/collimatorshape) | (0018,1700) VR=CS VM=1-3 Collimator Shape. |
| static readonly [CollimatorShapeSequence](../../aspose.medical.dicom.tags/tag/collimatorshapesequence) | (0018,9407) VR=SQ VM=1 Collimator Shape Sequence. |
| static readonly [CollimatorType](../../aspose.medical.dicom.tags/tag/collimatortype) | (0018,1181) VR=CS VM=1 Collimator Type. |
| static readonly [CollimatorUpperHorizontalEdge](../../aspose.medical.dicom.tags/tag/collimatorupperhorizontaledge) | (0018,1706) VR=IS VM=1 Collimator Upper Horizontal Edge. |
| static readonly [ColorFilterArrayPatternColumns](../../aspose.medical.dicom.tags/tag/colorfilterarraypatterncolumns) | (0016,000F) VR=IS VM=1 Color Filter Array Pattern Columns. |
| static readonly [ColorFilterArrayPatternRows](../../aspose.medical.dicom.tags/tag/colorfilterarraypatternrows) | (0016,000E) VR=IS VM=1 Color Filter Array Pattern Rows. |
| static readonly [ColorFilterArrayPatternValues](../../aspose.medical.dicom.tags/tag/colorfilterarraypatternvalues) | (0016,0010) VR=DS VM=1-n Color Filter Array Pattern Values. |
| static readonly [ColorImagePrintingFlagRETIRED](../../aspose.medical.dicom.tags/tag/colorimageprintingflagretired) | (2000,0062) VR=CS VM=1 Color Image Printing Flag (RETIRED). |
| static readonly [ColorSpace](../../aspose.medical.dicom.tags/tag/colorspace) | (0028,2002) VR=CS VM=1 Color Space. |
| static readonly [ColumnAngulation](../../aspose.medical.dicom.tags/tag/columnangulation) | (0018,1450) VR=DS VM=1 Column Angulation. |
| static readonly [ColumnAngulationPatient](../../aspose.medical.dicom.tags/tag/columnangulationpatient) | (0018,9447) VR=FL VM=1 Column Angulation (Patient). |
| static readonly [ColumnOverlapRETIRED](../../aspose.medical.dicom.tags/tag/columnoverlapretired) | (0028,0094) VR=US VM=1 Column Overlap (RETIRED). |
| static readonly [ColumnPositionInTotalImagePixelMatrix](../../aspose.medical.dicom.tags/tag/columnpositionintotalimagepixelmatrix) | (0048,021E) VR=SL VM=1 Column Position In Total Image Pixel Matrix. |
| static readonly [Columns](../../aspose.medical.dicom.tags/tag/columns) | (0028,0011) VR=US VM=1 Columns. |
| static readonly [ColumnsForNthOrderCoefficientsRETIRED](../../aspose.medical.dicom.tags/tag/columnsfornthordercoefficientsretired) | (0028,04x1) VR=US VM=1 Columns For Nth Order Coefficients (RETIRED). |
| static readonly [CombinationSegmentReferenceSequence](../../aspose.medical.dicom.tags/tag/combinationsegmentreferencesequence) | (3010,0024) VR=SQ VM=1 Combination Segment Reference Sequence. |
| static readonly [CommandDataSetType](../../aspose.medical.dicom.tags/tag/commanddatasettype) | (0000,0800) VR=US VM=1 Command Data Set Type. |
| static readonly [CommandField](../../aspose.medical.dicom.tags/tag/commandfield) | (0000,0100) VR=US VM=1 Command Field. |
| static readonly [CommandGroupLength](../../aspose.medical.dicom.tags/tag/commandgrouplength) | (0000,0000) VR=UL VM=1 Command Group Length. |
| static readonly [CommandLengthToEndRETIRED](../../aspose.medical.dicom.tags/tag/commandlengthtoendretired) | (0000,0001) VR=UL VM=1 Command Length to End (RETIRED). |
| static readonly [CommandMagnificationTypeRETIRED](../../aspose.medical.dicom.tags/tag/commandmagnificationtyperetired) | (0000,5180) VR=CS VM=1 Command Magnification Type (RETIRED). |
| static readonly [CommandRecognitionCodeRETIRED](../../aspose.medical.dicom.tags/tag/commandrecognitioncoderetired) | (0000,0010) VR=SH VM=1 Command Recognition Code (RETIRED). |
| static readonly [CommentsOnPatientPerformanceOfVisualField](../../aspose.medical.dicom.tags/tag/commentsonpatientperformanceofvisualfield) | (0024,0044) VR=LT VM=1 Comments on Patient's Performance of Visual Field. |
| static readonly [CommentsOnRadiationDose](../../aspose.medical.dicom.tags/tag/commentsonradiationdose) | (0040,0310) VR=ST VM=1 Comments on Radiation Dose. |
| static readonly [CommentsOnThePerformedProcedureStep](../../aspose.medical.dicom.tags/tag/commentsontheperformedprocedurestep) | (0040,0280) VR=ST VM=1 Comments on the Performed Procedure Step. |
| static readonly [CommentsOnTheScheduledProcedureStep](../../aspose.medical.dicom.tags/tag/commentsonthescheduledprocedurestep) | (0040,0400) VR=LT VM=1 Comments on the Scheduled Procedure Step. |
| static readonly [CommonZCoordinateValue](../../aspose.medical.dicom.tags/tag/commonzcoordinatevalue) | (006A,0010) VR=FD VM=1-n Common Z Coordinate Value. |
| static readonly [CompensatorBasePlaneOffset](../../aspose.medical.dicom.tags/tag/compensatorbaseplaneoffset) | (300A,0666) VR=FD VM=1 Compensator Base Plane Offset. |
| static readonly [CompensatorColumnOffset](../../aspose.medical.dicom.tags/tag/compensatorcolumnoffset) | (300A,02E5) VR=FL VM=1 Compensator Column Offset. |
| static readonly [CompensatorColumns](../../aspose.medical.dicom.tags/tag/compensatorcolumns) | (300A,00E8) VR=IS VM=1 Compensator Columns. |
| static readonly [CompensatorDefinitionSequence](../../aspose.medical.dicom.tags/tag/compensatordefinitionsequence) | (300A,0662) VR=SQ VM=1 Compensator Definition Sequence. |
| static readonly [CompensatorDescription](../../aspose.medical.dicom.tags/tag/compensatordescription) | (300A,02EB) VR=LT VM=1 Compensator Description. |
| static readonly [CompensatorDistalThicknessMap](../../aspose.medical.dicom.tags/tag/compensatordistalthicknessmap) | (300A,0665) VR=OF VM=1 Compensator Distal Thickness Map. |
| static readonly [CompensatorDivergence](../../aspose.medical.dicom.tags/tag/compensatordivergence) | (300A,02E0) VR=CS VM=1 Compensator Divergence. |
| static readonly [CompensatorID](../../aspose.medical.dicom.tags/tag/compensatorid) | (300A,00E5) VR=SH VM=1 Compensator ID. |
| static readonly [CompensatorMapOrientation](../../aspose.medical.dicom.tags/tag/compensatormaporientation) | (300A,0663) VR=CS VM=1 Compensator Map Orientation. |
| static readonly [CompensatorMillingToolDiameter](../../aspose.medical.dicom.tags/tag/compensatormillingtooldiameter) | (300A,02E8) VR=FL VM=1 Compensator Milling Tool Diameter. |
| static readonly [CompensatorMountingPosition](../../aspose.medical.dicom.tags/tag/compensatormountingposition) | (300A,02E1) VR=CS VM=1 Compensator Mounting Position. |
| static readonly [CompensatorNumber](../../aspose.medical.dicom.tags/tag/compensatornumber) | (300A,00E4) VR=IS VM=1 Compensator Number. |
| static readonly [CompensatorPixelSpacing](../../aspose.medical.dicom.tags/tag/compensatorpixelspacing) | (300A,00E9) VR=DS VM=2 Compensator Pixel Spacing. |
| static readonly [CompensatorPosition](../../aspose.medical.dicom.tags/tag/compensatorposition) | (300A,00EA) VR=DS VM=2 Compensator Position. |
| static readonly [CompensatorProximalThicknessMap](../../aspose.medical.dicom.tags/tag/compensatorproximalthicknessmap) | (300A,0664) VR=OF VM=1 Compensator Proximal Thickness Map. |
| static readonly [CompensatorRelativeStoppingPowerRatio](../../aspose.medical.dicom.tags/tag/compensatorrelativestoppingpowerratio) | (300A,02E7) VR=FL VM=1 Compensator Relative Stopping Power Ratio. |
| static readonly [CompensatorRows](../../aspose.medical.dicom.tags/tag/compensatorrows) | (300A,00E7) VR=IS VM=1 Compensator Rows. |
| static readonly [CompensatorSequence](../../aspose.medical.dicom.tags/tag/compensatorsequence) | (300A,00E3) VR=SQ VM=1 Compensator Sequence. |
| static readonly [CompensatorShapeFabricationCodeSequence](../../aspose.medical.dicom.tags/tag/compensatorshapefabricationcodesequence) | (300A,0667) VR=SQ VM=1 Compensator Shape Fabrication Code Sequence. |
| static readonly [CompensatorShapeSequence](../../aspose.medical.dicom.tags/tag/compensatorshapesequence) | (300A,0668) VR=SQ VM=1 Compensator Shape Sequence. |
| static readonly [CompensatorSurfaceRepresentationFlag](../../aspose.medical.dicom.tags/tag/compensatorsurfacerepresentationflag) | (300A,02EC) VR=CS VM=1 Compensator Surface Representation Flag. |
| static readonly [CompensatorThicknessData](../../aspose.medical.dicom.tags/tag/compensatorthicknessdata) | (300A,00EC) VR=DS VM=1-n Compensator Thickness Data. |
| static readonly [CompensatorTransmissionData](../../aspose.medical.dicom.tags/tag/compensatortransmissiondata) | (300A,00EB) VR=DS VM=1-n Compensator Transmission Data. |
| static readonly [CompensatorTrayID](../../aspose.medical.dicom.tags/tag/compensatortrayid) | (300A,00EF) VR=SH VM=1 Compensator Tray ID. |
| static readonly [CompensatorType](../../aspose.medical.dicom.tags/tag/compensatortype) | (300A,00EE) VR=CS VM=1 Compensator Type. |
| static readonly [CompletionFlag](../../aspose.medical.dicom.tags/tag/completionflag) | (0040,A491) VR=CS VM=1 Completion Flag. |
| static readonly [CompletionFlagDescription](../../aspose.medical.dicom.tags/tag/completionflagdescription) | (0040,A492) VR=LO VM=1 Completion Flag Description. |
| static readonly [ComplexImageComponent](../../aspose.medical.dicom.tags/tag/compleximagecomponent) | (0008,9208) VR=CS VM=1 Complex Image Component. |
| static readonly [Component1ReferencedID](../../aspose.medical.dicom.tags/tag/component1referencedid) | (0076,0070) VR=US VM=1 Component 1 Referenced ID. |
| static readonly [Component1ReferencedMatingFeatureID](../../aspose.medical.dicom.tags/tag/component1referencedmatingfeatureid) | (0076,0090) VR=US VM=1 Component 1 Referenced Mating Feature ID. |
| static readonly [Component1ReferencedMatingFeatureSetID](../../aspose.medical.dicom.tags/tag/component1referencedmatingfeaturesetid) | (0076,0080) VR=US VM=1 Component 1 Referenced Mating Feature Set ID. |
| static readonly [Component2ReferencedID](../../aspose.medical.dicom.tags/tag/component2referencedid) | (0076,00A0) VR=US VM=1 Component 2 Referenced ID. |
| static readonly [Component2ReferencedMatingFeatureID](../../aspose.medical.dicom.tags/tag/component2referencedmatingfeatureid) | (0076,00C0) VR=US VM=1 Component 2 Referenced Mating Feature ID. |
| static readonly [Component2ReferencedMatingFeatureSetID](../../aspose.medical.dicom.tags/tag/component2referencedmatingfeaturesetid) | (0076,00B0) VR=US VM=1 Component 2 Referenced Mating Feature Set ID. |
| static readonly [ComponentAssemblySequence](../../aspose.medical.dicom.tags/tag/componentassemblysequence) | (0076,0060) VR=SQ VM=1 Component Assembly Sequence. |
| static readonly [ComponentID](../../aspose.medical.dicom.tags/tag/componentid) | (0076,0055) VR=US VM=1 Component ID. |
| static readonly [ComponentInputSequence](../../aspose.medical.dicom.tags/tag/componentinputsequence) | (0070,1803) VR=SQ VM=1 Component Input Sequence. |
| static readonly [ComponentManufacturerRETIRED](../../aspose.medical.dicom.tags/tag/componentmanufacturerretired) | (0014,0028) VR=ST VM=1 Component Manufacturer (RETIRED). |
| static readonly [ComponentManufacturingProcedureRETIRED](../../aspose.medical.dicom.tags/tag/componentmanufacturingprocedureretired) | (0014,0025) VR=ST VM=1 Component Manufacturing Procedure (RETIRED). |
| static readonly [ComponentReferenceSystemRETIRED](../../aspose.medical.dicom.tags/tag/componentreferencesystemretired) | (0014,0024) VR=ST VM=1 Component Reference System (RETIRED). |
| static readonly [ComponentSequence](../../aspose.medical.dicom.tags/tag/componentsequence) | (0076,0040) VR=SQ VM=1 Component Sequence. |
| static readonly [ComponentShapeRETIRED](../../aspose.medical.dicom.tags/tag/componentshaperetired) | (0014,0050) VR=CS VM=1 Component Shape (RETIRED). |
| static readonly [ComponentType](../../aspose.medical.dicom.tags/tag/componenttype) | (0070,1802) VR=CS VM=1 Component Type. |
| static readonly [ComponentTypeCodeSequence](../../aspose.medical.dicom.tags/tag/componenttypecodesequence) | (0076,0034) VR=SQ VM=1 Component Type Code Sequence. |
| static readonly [ComponentTypesSequence](../../aspose.medical.dicom.tags/tag/componenttypessequence) | (0076,0032) VR=SQ VM=1 Component Types Sequence. |
| static readonly [ComponentWelderIDsRETIRED](../../aspose.medical.dicom.tags/tag/componentwelderidsretired) | (0014,0100) VR=LO VM=1-n Component Welder IDs (RETIRED). |
| static readonly [CompositingMethodRETIRED](../../aspose.medical.dicom.tags/tag/compositingmethodretired) | (0070,1206) VR=CS VM=1 Compositing Method (RETIRED). |
| static readonly [CompoundGraphicInstanceID](../../aspose.medical.dicom.tags/tag/compoundgraphicinstanceid) | (0070,0226) VR=UL VM=1 Compound Graphic Instance ID. |
| static readonly [CompoundGraphicSequence](../../aspose.medical.dicom.tags/tag/compoundgraphicsequence) | (0070,0209) VR=SQ VM=1 Compound Graphic Sequence. |
| static readonly [CompoundGraphicType](../../aspose.medical.dicom.tags/tag/compoundgraphictype) | (0070,0294) VR=CS VM=1 Compound Graphic Type. |
| static readonly [CompoundGraphicUnits](../../aspose.medical.dicom.tags/tag/compoundgraphicunits) | (0070,0282) VR=CS VM=1 Compound Graphic Units. |
| static readonly [CompressionCodeRETIRED](../../aspose.medical.dicom.tags/tag/compressioncoderetired) | (0028,0060) VR=CS VM=1 Compression Code (RETIRED). |
| static readonly [CompressionContactArea](../../aspose.medical.dicom.tags/tag/compressioncontactarea) | (0018,11A5) VR=DS VM=1 Compression Contact Area. |
| static readonly [CompressionDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/compressiondescriptionretired) | (0028,0063) VR=SH VM=1 Compression Description (RETIRED). |
| static readonly [CompressionForce](../../aspose.medical.dicom.tags/tag/compressionforce) | (0018,11A2) VR=DS VM=1 Compression Force. |
| static readonly [CompressionLabelRETIRED](../../aspose.medical.dicom.tags/tag/compressionlabelretired) | (0028,0062) VR=LO VM=1 Compression Label (RETIRED). |
| static readonly [CompressionOriginatorRETIRED](../../aspose.medical.dicom.tags/tag/compressionoriginatorretired) | (0028,0061) VR=SH VM=1 Compression Originator (RETIRED). |
| static readonly [CompressionPressure](../../aspose.medical.dicom.tags/tag/compressionpressure) | (0018,11A3) VR=DS VM=1 Compression Pressure. |
| static readonly [CompressionRecognitionCodeRETIRED](../../aspose.medical.dicom.tags/tag/compressionrecognitioncoderetired) | (0028,005F) VR=LO VM=1 Compression Recognition Code (RETIRED). |
| static readonly [CompressionSequenceRETIRED](../../aspose.medical.dicom.tags/tag/compressionsequenceretired) | (0028,0065) VR=CS VM=1-n Compression Sequence (RETIRED). |
| static readonly [CompressionStepPointersRETIRED](../../aspose.medical.dicom.tags/tag/compressionsteppointersretired) | (0028,0066) VR=AT VM=1-n Compression Step Pointers (RETIRED). |
| static readonly [ConcatenationFrameOffsetNumber](../../aspose.medical.dicom.tags/tag/concatenationframeoffsetnumber) | (0020,9228) VR=UL VM=1 Concatenation Frame Offset Number. |
| static readonly [ConcatenationUID](../../aspose.medical.dicom.tags/tag/concatenationuid) | (0020,9161) VR=UI VM=1 Concatenation UID. |
| static readonly [ConceptCodeSequence](../../aspose.medical.dicom.tags/tag/conceptcodesequence) | (0040,A168) VR=SQ VM=1 Concept Code Sequence. |
| static readonly [ConceptNameCodeSequence](../../aspose.medical.dicom.tags/tag/conceptnamecodesequence) | (0040,A043) VR=SQ VM=1 Concept Name Code Sequence. |
| static readonly [ConceptualVolumeBlockingConstraint](../../aspose.medical.dicom.tags/tag/conceptualvolumeblockingconstraint) | (3010,0068) VR=CS VM=1 Conceptual Volume Blocking Constraint. |
| static readonly [ConceptualVolumeCategoryCodeSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumecategorycodesequence) | (3010,0067) VR=SQ VM=1 Conceptual Volume Category Code Sequence. |
| static readonly [ConceptualVolumeCombinationDescription](../../aspose.medical.dicom.tags/tag/conceptualvolumecombinationdescription) | (3010,000F) VR=ST VM=1 Conceptual Volume Combination Description. |
| static readonly [ConceptualVolumeCombinationExpression](../../aspose.medical.dicom.tags/tag/conceptualvolumecombinationexpression) | (3010,000C) VR=UT VM=1 Conceptual Volume Combination Expression. |
| static readonly [ConceptualVolumeCombinationFlag](../../aspose.medical.dicom.tags/tag/conceptualvolumecombinationflag) | (3010,000E) VR=CS VM=1 Conceptual Volume Combination Flag. |
| static readonly [ConceptualVolumeConstituentIndex](../../aspose.medical.dicom.tags/tag/conceptualvolumeconstituentindex) | (3010,000D) VR=US VM=1 Conceptual Volume Constituent Index. |
| static readonly [ConceptualVolumeConstituentSegmentationReferenceSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumeconstituentsegmentationreferencesequence) | (3010,0012) VR=SQ VM=1 Conceptual Volume Constituent Segmentation Reference Sequence. |
| static readonly [ConceptualVolumeConstituentSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumeconstituentsequence) | (3010,0008) VR=SQ VM=1 Conceptual Volume Constituent Sequence. |
| static readonly [ConceptualVolumeDerivationAlgorithmSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumederivationalgorithmsequence) | (3010,0016) VR=SQ VM=1 Conceptual Volume Derivation Algorithm Sequence. |
| static readonly [ConceptualVolumeDescription](../../aspose.medical.dicom.tags/tag/conceptualvolumedescription) | (3010,0017) VR=ST VM=1 Conceptual Volume Description. |
| static readonly [ConceptualVolumeIdentificationSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumeidentificationsequence) | (3010,00A0) VR=SQ VM=1 Conceptual Volume Identification Sequence. |
| static readonly [ConceptualVolumeOptimizationPrecedence](../../aspose.medical.dicom.tags/tag/conceptualvolumeoptimizationprecedence) | (3010,0066) VR=US VM=1 Conceptual Volume Optimization Precedence. |
| static readonly [ConceptualVolumeSegmentationDefinedFlag](../../aspose.medical.dicom.tags/tag/conceptualvolumesegmentationdefinedflag) | (3010,0010) VR=CS VM=1 Conceptual Volume Segmentation Defined Flag. |
| static readonly [ConceptualVolumeSegmentationReferenceSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumesegmentationreferencesequence) | (3010,0011) VR=SQ VM=1 Conceptual Volume Segmentation Reference Sequence. |
| static readonly [ConceptualVolumeSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumesequence) | (3010,0025) VR=SQ VM=1 Conceptual Volume Sequence. |
| static readonly [ConceptualVolumeTypeCodeSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumetypecodesequence) | (3010,0069) VR=SQ VM=1 Conceptual Volume Type Code Sequence. |
| static readonly [ConceptualVolumeTypeModifierCodeSequence](../../aspose.medical.dicom.tags/tag/conceptualvolumetypemodifiercodesequence) | (3010,006A) VR=SQ VM=1 Conceptual Volume Type Modifier Code Sequence. |
| static readonly [ConceptualVolumeUID](../../aspose.medical.dicom.tags/tag/conceptualvolumeuid) | (3010,0006) VR=UI VM=1 Conceptual Volume UID. |
| static readonly [CondenserLensPower](../../aspose.medical.dicom.tags/tag/condenserlenspower) | (0048,0111) VR=DS VM=1 Condenser Lens Power. |
| static readonly [ConfidentialityCode](../../aspose.medical.dicom.tags/tag/confidentialitycode) | (0040,1008) VR=LO VM=1 Confidentiality Code. |
| static readonly [ConfidentialityConstraintOnPatientDataDescription](../../aspose.medical.dicom.tags/tag/confidentialityconstraintonpatientdatadescription) | (0040,3001) VR=LO VM=1 Confidentiality Constraint on Patient Data Description. |
| static readonly [ConfigurationDescription](../../aspose.medical.dicom.tags/tag/configurationdescription) | (0028,700D) VR=LO VM=1 Configuration Description. |
| static readonly [ConfigurationID](../../aspose.medical.dicom.tags/tag/configurationid) | (0028,700B) VR=US VM=1 Configuration ID. |
| static readonly [ConfigurationInformation](../../aspose.medical.dicom.tags/tag/configurationinformation) | (2010,0150) VR=ST VM=1 Configuration Information. |
| static readonly [ConfigurationInformationDescription](../../aspose.medical.dicom.tags/tag/configurationinformationdescription) | (2010,0152) VR=LT VM=1 Configuration Information Description. |
| static readonly [ConfigurationName](../../aspose.medical.dicom.tags/tag/configurationname) | (0028,700C) VR=SH VM=1 Configuration Name. |
| static readonly [ConfigurationQAResultsSequence](../../aspose.medical.dicom.tags/tag/configurationqaresultssequence) | (0028,7011) VR=SQ VM=1 Configuration QA Results Sequence. |
| static readonly [ConfirmationSequence](../../aspose.medical.dicom.tags/tag/confirmationsequence) | (300A,073F) VR=SQ VM=1 Confirmation Sequence. |
| static readonly [ConfocalMicroscopyImageFrameTypeSequence](../../aspose.medical.dicom.tags/tag/confocalmicroscopyimageframetypesequence) | (0048,0116) VR=SQ VM=1 Confocal Microscopy Image Frame Type Sequence. |
| static readonly [ConfocalMode](../../aspose.medical.dicom.tags/tag/confocalmode) | (0048,0114) VR=CS VM=1 Confocal Mode. |
| static readonly [ConnectorTypeRETIRED](../../aspose.medical.dicom.tags/tag/connectortyperetired) | (0014,5105) VR=CS VM=1 Connector Type (RETIRED). |
| static readonly [ConsentForClinicalTrialUseSequence](../../aspose.medical.dicom.tags/tag/consentforclinicaltrialusesequence) | (0012,0083) VR=SQ VM=1 Consent for Clinical Trial Use Sequence. |
| static readonly [ConsentForDistributionFlag](../../aspose.medical.dicom.tags/tag/consentfordistributionflag) | (0012,0085) VR=CS VM=1 Consent for Distribution Flag. |
| static readonly [ConstantVolumeFlag](../../aspose.medical.dicom.tags/tag/constantvolumeflag) | (0018,9333) VR=CS VM=1 Constant Volume Flag. |
| static readonly [ConstituentConceptualVolumeUID](../../aspose.medical.dicom.tags/tag/constituentconceptualvolumeuid) | (3010,0013) VR=UI VM=1 Constituent Conceptual Volume UID. |
| static readonly [ConstraintType](../../aspose.medical.dicom.tags/tag/constrainttype) | (0082,0032) VR=CS VM=1 Constraint Type. |
| static readonly [ConstraintValueSequence](../../aspose.medical.dicom.tags/tag/constraintvaluesequence) | (0082,0034) VR=SQ VM=1 Constraint Value Sequence. |
| static readonly [ConstraintViolationCondition](../../aspose.medical.dicom.tags/tag/constraintviolationcondition) | (0082,0037) VR=UT VM=1 Constraint Violation Condition. |
| static readonly [ConstraintViolationSignificance](../../aspose.medical.dicom.tags/tag/constraintviolationsignificance) | (0082,0036) VR=CS VM=1 Constraint Violation Significance. |
| static readonly [ConstraintWeight](../../aspose.medical.dicom.tags/tag/constraintweight) | (300A,0021) VR=DS VM=1 Constraint Weight. |
| static readonly [ConsultingPhysicianIdentificationSequence](../../aspose.medical.dicom.tags/tag/consultingphysicianidentificationsequence) | (0008,009D) VR=SQ VM=1 Consulting Physician Identification Sequence. |
| static readonly [ConsultingPhysicianName](../../aspose.medical.dicom.tags/tag/consultingphysicianname) | (0008,009C) VR=PN VM=1-n Consulting Physician's Name. |
| static readonly [ContactDisplayName](../../aspose.medical.dicom.tags/tag/contactdisplayname) | (0074,100C) VR=LO VM=1 Contact Display Name. |
| static readonly [ContactMethod](../../aspose.medical.dicom.tags/tag/contactmethod) | (0016,1003) VR=CS VM=1 Contact Method. |
| static readonly [ContactURI](../../aspose.medical.dicom.tags/tag/contacturi) | (0074,100A) VR=UR VM=1 Contact URI. |
| static readonly [ContainerComponentDescription](../../aspose.medical.dicom.tags/tag/containercomponentdescription) | (0050,001E) VR=LO VM=1 Container Component Description. |
| static readonly [ContainerComponentDiameter](../../aspose.medical.dicom.tags/tag/containercomponentdiameter) | (0050,001D) VR=FD VM=1 Container Component Diameter. |
| static readonly [ContainerComponentID](../../aspose.medical.dicom.tags/tag/containercomponentid) | (0050,001B) VR=LO VM=1 Container Component ID. |
| static readonly [ContainerComponentLength](../../aspose.medical.dicom.tags/tag/containercomponentlength) | (0050,001C) VR=FD VM=1 Container Component Length. |
| static readonly [ContainerComponentMaterial](../../aspose.medical.dicom.tags/tag/containercomponentmaterial) | (0050,001A) VR=CS VM=1 Container Component Material. |
| static readonly [ContainerComponentSequence](../../aspose.medical.dicom.tags/tag/containercomponentsequence) | (0040,0520) VR=SQ VM=1 Container Component Sequence. |
| static readonly [ContainerComponentThickness](../../aspose.medical.dicom.tags/tag/containercomponentthickness) | (0050,0013) VR=FD VM=1 Container Component Thickness. |
| static readonly [ContainerComponentTypeCodeSequence](../../aspose.medical.dicom.tags/tag/containercomponenttypecodesequence) | (0050,0012) VR=SQ VM=1 Container Component Type Code Sequence. |
| static readonly [ContainerComponentWidth](../../aspose.medical.dicom.tags/tag/containercomponentwidth) | (0050,0015) VR=FD VM=1 Container Component Width. |
| static readonly [ContainerDescription](../../aspose.medical.dicom.tags/tag/containerdescription) | (0040,051A) VR=LO VM=1 Container Description. |
| static readonly [ContainerFileType](../../aspose.medical.dicom.tags/tag/containerfiletype) | (0008,040A) VR=CS VM=1 Container File Type. |
| static readonly [ContainerIdentifier](../../aspose.medical.dicom.tags/tag/containeridentifier) | (0040,0512) VR=LO VM=1 Container Identifier. |
| static readonly [ContainerTypeCodeSequence](../../aspose.medical.dicom.tags/tag/containertypecodesequence) | (0040,0518) VR=SQ VM=1 Container Type Code Sequence. |
| static readonly [ContentCreatorIdentificationCodeSequence](../../aspose.medical.dicom.tags/tag/contentcreatoridentificationcodesequence) | (0070,0086) VR=SQ VM=1 Content Creator's Identification Code Sequence. |
| static readonly [ContentCreatorName](../../aspose.medical.dicom.tags/tag/contentcreatorname) | (0070,0084) VR=PN VM=1 Content Creator's Name. |
| static readonly [ContentDate](../../aspose.medical.dicom.tags/tag/contentdate) | (0008,0023) VR=DA VM=1 Content Date. |
| static readonly [ContentDescription](../../aspose.medical.dicom.tags/tag/contentdescription) | (0070,0081) VR=LO VM=1 Content Description. |
| static readonly [ContentItemModifierSequence](../../aspose.medical.dicom.tags/tag/contentitemmodifiersequence) | (0040,0441) VR=SQ VM=1 Content Item Modifier Sequence. |
| static readonly [ContentLabel](../../aspose.medical.dicom.tags/tag/contentlabel) | (0070,0080) VR=CS VM=1 Content Label. |
| static readonly [ContentQualification](../../aspose.medical.dicom.tags/tag/contentqualification) | (0018,9004) VR=CS VM=1 Content Qualification. |
| static readonly [ContentSequence](../../aspose.medical.dicom.tags/tag/contentsequence) | (0040,A730) VR=SQ VM=1 Content Sequence. |
| static readonly [ContentTemplateSequence](../../aspose.medical.dicom.tags/tag/contenttemplatesequence) | (0040,A504) VR=SQ VM=1 Content Template Sequence. |
| static readonly [ContentTime](../../aspose.medical.dicom.tags/tag/contenttime) | (0008,0033) VR=TM VM=1 Content Time. |
| static readonly [ContextGroupExtensionCreatorUID](../../aspose.medical.dicom.tags/tag/contextgroupextensioncreatoruid) | (0008,010D) VR=UI VM=1 Context Group Extension Creator UID. |
| static readonly [ContextGroupExtensionFlag](../../aspose.medical.dicom.tags/tag/contextgroupextensionflag) | (0008,010B) VR=CS VM=1 Context Group Extension Flag. |
| static readonly [ContextGroupIdentificationSequence](../../aspose.medical.dicom.tags/tag/contextgroupidentificationsequence) | (0008,0123) VR=SQ VM=1 Context Group Identification Sequence. |
| static readonly [ContextGroupLocalVersion](../../aspose.medical.dicom.tags/tag/contextgrouplocalversion) | (0008,0107) VR=DT VM=1 Context Group Local Version. |
| static readonly [ContextGroupVersion](../../aspose.medical.dicom.tags/tag/contextgroupversion) | (0008,0106) VR=DT VM=1 Context Group Version. |
| static readonly [ContextIdentifier](../../aspose.medical.dicom.tags/tag/contextidentifier) | (0008,010F) VR=CS VM=1 Context Identifier. |
| static readonly [ContextUID](../../aspose.medical.dicom.tags/tag/contextuid) | (0008,0117) VR=UI VM=1 Context UID. |
| static readonly [ContinuationEndMeterset](../../aspose.medical.dicom.tags/tag/continuationendmeterset) | (0074,0121) VR=FD VM=1 Continuation End Meterset. |
| static readonly [ContinuationEndTotalReferenceAirKerma](../../aspose.medical.dicom.tags/tag/continuationendtotalreferenceairkerma) | (0074,1403) VR=DS VM=1 Continuation End Total Reference Air Kerma. |
| static readonly [ContinuationPulseNumber](../../aspose.medical.dicom.tags/tag/continuationpulsenumber) | (0074,1404) VR=IS VM=1 Continuation Pulse Number. |
| static readonly [ContinuationStartMeterset](../../aspose.medical.dicom.tags/tag/continuationstartmeterset) | (0074,0120) VR=FD VM=1 Continuation Start Meterset. |
| static readonly [ContinuationStartTotalReferenceAirKerma](../../aspose.medical.dicom.tags/tag/continuationstarttotalreferenceairkerma) | (0074,1402) VR=DS VM=1 Continuation Start Total Reference Air Kerma. |
| static readonly [ContinuityOfContent](../../aspose.medical.dicom.tags/tag/continuityofcontent) | (0040,A050) VR=CS VM=1 Continuity Of Content. |
| static readonly [ContourData](../../aspose.medical.dicom.tags/tag/contourdata) | (3006,0050) VR=DS VM=3-3n Contour Data. |
| static readonly [ContourGeometricType](../../aspose.medical.dicom.tags/tag/contourgeometrictype) | (3006,0042) VR=CS VM=1 Contour Geometric Type. |
| static readonly [ContourImageSequence](../../aspose.medical.dicom.tags/tag/contourimagesequence) | (3006,0016) VR=SQ VM=1 Contour Image Sequence. |
| static readonly [ContourNumber](../../aspose.medical.dicom.tags/tag/contournumber) | (3006,0048) VR=IS VM=1 Contour Number. |
| static readonly [ContourOffsetVectorRETIRED](../../aspose.medical.dicom.tags/tag/contouroffsetvectorretired) | (3006,0045) VR=DS VM=3 Contour Offset Vector (RETIRED). |
| static readonly [ContourSequence](../../aspose.medical.dicom.tags/tag/contoursequence) | (3006,0040) VR=SQ VM=1 Contour Sequence. |
| static readonly [ContourSlabThicknessRETIRED](../../aspose.medical.dicom.tags/tag/contourslabthicknessretired) | (3006,0044) VR=DS VM=1 Contour Slab Thickness (RETIRED). |
| static readonly [ContourUncertaintyRadius](../../aspose.medical.dicom.tags/tag/contouruncertaintyradius) | (0070,0312) VR=FD VM=1 Contour Uncertainty Radius. |
| static readonly [ContraindicationsCodeSequence](../../aspose.medical.dicom.tags/tag/contraindicationscodesequence) | (0018,990B) VR=SQ VM=1 Contraindications Code Sequence. |
| static readonly [Contrast](../../aspose.medical.dicom.tags/tag/contrast) | (0016,0048) VR=US VM=1 Contrast. |
| static readonly [ContrastAdministrationProfileSequence](../../aspose.medical.dicom.tags/tag/contrastadministrationprofilesequence) | (0018,9340) VR=SQ VM=1 Contrast Administration Profile Sequence. |
| static readonly [ContrastBolusAdministrationRouteSequence](../../aspose.medical.dicom.tags/tag/contrastbolusadministrationroutesequence) | (0018,0014) VR=SQ VM=1 Contrast/Bolus Administration Route Sequence. |
| static readonly [ContrastBolusAgent](../../aspose.medical.dicom.tags/tag/contrastbolusagent) | (0018,0010) VR=LO VM=1 Contrast/Bolus Agent. |
| static readonly [ContrastBolusAgentAdministered](../../aspose.medical.dicom.tags/tag/contrastbolusagentadministered) | (0018,9342) VR=CS VM=1 Contrast/Bolus Agent Administered. |
| static readonly [ContrastBolusAgentDetected](../../aspose.medical.dicom.tags/tag/contrastbolusagentdetected) | (0018,9343) VR=CS VM=1 Contrast/Bolus Agent Detected. |
| static readonly [ContrastBolusAgentNumber](../../aspose.medical.dicom.tags/tag/contrastbolusagentnumber) | (0018,9337) VR=US VM=1 Contrast/Bolus Agent Number. |
| static readonly [ContrastBolusAgentPhase](../../aspose.medical.dicom.tags/tag/contrastbolusagentphase) | (0018,9344) VR=CS VM=1 Contrast/Bolus Agent Phase. |
| static readonly [ContrastBolusAgentSequence](../../aspose.medical.dicom.tags/tag/contrastbolusagentsequence) | (0018,0012) VR=SQ VM=1 Contrast/Bolus Agent Sequence. |
| static readonly [ContrastBolusAutoInjectionTriggerFlag](../../aspose.medical.dicom.tags/tag/contrastbolusautoinjectiontriggerflag) | (0018,11B6) VR=CS VM=1 Contrast/Bolus Auto Injection Trigger Flag. |
| static readonly [ContrastBolusIngredient](../../aspose.medical.dicom.tags/tag/contrastbolusingredient) | (0018,1048) VR=CS VM=1 Contrast/Bolus Ingredient. |
| static readonly [ContrastBolusIngredientCodeSequence](../../aspose.medical.dicom.tags/tag/contrastbolusingredientcodesequence) | (0018,9338) VR=SQ VM=1 Contrast/Bolus Ingredient Code Sequence. |
| static readonly [ContrastBolusIngredientConcentration](../../aspose.medical.dicom.tags/tag/contrastbolusingredientconcentration) | (0018,1049) VR=DS VM=1 Contrast/Bolus Ingredient Concentration. |
| static readonly [ContrastBolusIngredientOpaque](../../aspose.medical.dicom.tags/tag/contrastbolusingredientopaque) | (0018,9425) VR=CS VM=1 Contrast/Bolus Ingredient Opaque. |
| static readonly [ContrastBolusIngredientPercentByVolume](../../aspose.medical.dicom.tags/tag/contrastbolusingredientpercentbyvolume) | (0052,0001) VR=FL VM=1 Contrast/Bolus Ingredient Percent by Volume. |
| static readonly [ContrastBolusInjectionDelay](../../aspose.medical.dicom.tags/tag/contrastbolusinjectiondelay) | (0018,11B7) VR=FD VM=1 Contrast/Bolus Injection Delay. |
| static readonly [ContrastBolusRoute](../../aspose.medical.dicom.tags/tag/contrastbolusroute) | (0018,1040) VR=LO VM=1 Contrast/Bolus Route. |
| static readonly [ContrastBolusStartTime](../../aspose.medical.dicom.tags/tag/contrastbolusstarttime) | (0018,1042) VR=TM VM=1 Contrast/Bolus Start Time. |
| static readonly [ContrastBolusStopTime](../../aspose.medical.dicom.tags/tag/contrastbolusstoptime) | (0018,1043) VR=TM VM=1 Contrast/Bolus Stop Time. |
| static readonly [ContrastBolusT1Relaxivity](../../aspose.medical.dicom.tags/tag/contrastbolust1relaxivity) | (0018,0013) VR=FL VM=1 Contrast/Bolus T1 Relaxivity. |
| static readonly [ContrastBolusTotalDose](../../aspose.medical.dicom.tags/tag/contrastbolustotaldose) | (0018,1044) VR=DS VM=1 Contrast/Bolus Total Dose. |
| static readonly [ContrastBolusUsageSequence](../../aspose.medical.dicom.tags/tag/contrastbolususagesequence) | (0018,9341) VR=SQ VM=1 Contrast/Bolus Usage Sequence. |
| static readonly [ContrastBolusVolume](../../aspose.medical.dicom.tags/tag/contrastbolusvolume) | (0018,1041) VR=DS VM=1 Contrast/Bolus Volume. |
| static readonly [ContrastFlowDuration](../../aspose.medical.dicom.tags/tag/contrastflowduration) | (0018,1047) VR=DS VM=1-n Contrast Flow Duration. |
| static readonly [ContrastFlowRate](../../aspose.medical.dicom.tags/tag/contrastflowrate) | (0018,1046) VR=DS VM=1-n Contrast Flow Rate. |
| static readonly [ContrastFrameAveraging](../../aspose.medical.dicom.tags/tag/contrastframeaveraging) | (0028,6112) VR=US VM=1 Contrast Frame Averaging. |
| static readonly [ContributingChannelSourcesSequence](../../aspose.medical.dicom.tags/tag/contributingchannelsourcessequence) | (0040,B041) VR=SQ VM=1 Contributing Channel Sources Sequence. |
| static readonly [ContributingEquipmentSequence](../../aspose.medical.dicom.tags/tag/contributingequipmentsequence) | (0018,A001) VR=SQ VM=1 Contributing Equipment Sequence. |
| static readonly [ContributingSOPInstancesReferenceSequence](../../aspose.medical.dicom.tags/tag/contributingsopinstancesreferencesequence) | (0020,9529) VR=SQ VM=1 Contributing SOP Instances Reference Sequence. |
| static readonly [ContributingSourcesSequence](../../aspose.medical.dicom.tags/tag/contributingsourcessequence) | (0018,9506) VR=SQ VM=1 Contributing Sources Sequence. |
| static readonly [ContributionDateTime](../../aspose.medical.dicom.tags/tag/contributiondatetime) | (0018,A002) VR=DT VM=1 Contribution DateTime. |
| static readonly [ContributionDescription](../../aspose.medical.dicom.tags/tag/contributiondescription) | (0018,A003) VR=ST VM=1 Contribution Description. |
| static readonly [ControlPoint3DPosition](../../aspose.medical.dicom.tags/tag/controlpoint3dposition) | (300A,02D4) VR=DS VM=3 Control Point 3D Position. |
| static readonly [ControlPointDeliverySequence](../../aspose.medical.dicom.tags/tag/controlpointdeliverysequence) | (3008,0040) VR=SQ VM=1 Control Point Delivery Sequence. |
| static readonly [ControlPointIndex](../../aspose.medical.dicom.tags/tag/controlpointindex) | (300A,0112) VR=IS VM=1 Control Point Index. |
| static readonly [ControlPointOrientation](../../aspose.medical.dicom.tags/tag/controlpointorientation) | (300A,0412) VR=FL VM=3 Control Point Orientation. |
| static readonly [ControlPointRelativePosition](../../aspose.medical.dicom.tags/tag/controlpointrelativeposition) | (300A,02D2) VR=DS VM=1 Control Point Relative Position. |
| static readonly [ControlPointSequence](../../aspose.medical.dicom.tags/tag/controlpointsequence) | (300A,0111) VR=SQ VM=1 Control Point Sequence. |
| static readonly [ConventionalControlPointVerificationSequence](../../aspose.medical.dicom.tags/tag/conventionalcontrolpointverificationsequence) | (0074,104C) VR=SQ VM=1 Conventional Control Point Verification Sequence. |
| static readonly [ConventionalMachineVerificationSequence](../../aspose.medical.dicom.tags/tag/conventionalmachineverificationsequence) | (0074,1044) VR=SQ VM=1 Conventional Machine Verification Sequence. |
| static readonly [ConversionSourceAttributesSequence](../../aspose.medical.dicom.tags/tag/conversionsourceattributessequence) | (0020,9172) VR=SQ VM=1 Conversion Source Attributes Sequence. |
| static readonly [ConversionType](../../aspose.medical.dicom.tags/tag/conversiontype) | (0008,0064) VR=CS VM=1 Conversion Type. |
| static readonly [ConvolutionKernel](../../aspose.medical.dicom.tags/tag/convolutionkernel) | (0018,1210) VR=SH VM=1-n Convolution Kernel. |
| static readonly [ConvolutionKernelGroup](../../aspose.medical.dicom.tags/tag/convolutionkernelgroup) | (0018,9316) VR=CS VM=1 Convolution Kernel Group. |
| static readonly [CoordinatesSetGeometricTypeTrialRETIRED](../../aspose.medical.dicom.tags/tag/coordinatessetgeometrictypetrialretired) | (0040,A290) VR=CS VM=1 Coordinates Set Geometric Type (Trial) (RETIRED). |
| static readonly [CoordinateStartValueRETIRED](../../aspose.medical.dicom.tags/tag/coordinatestartvalueretired) | (50xx,0112) VR=US VM=1-n Coordinate Start Value (RETIRED). |
| static readonly [CoordinateStepValueRETIRED](../../aspose.medical.dicom.tags/tag/coordinatestepvalueretired) | (50xx,0114) VR=US VM=1-n Coordinate Step Value (RETIRED). |
| static readonly [CoordinateSystemAxesSequenceRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemaxessequenceretired) | (0014,2204) VR=SQ VM=1 Coordinate System Axes Sequence (RETIRED). |
| static readonly [CoordinateSystemAxisCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemaxiscodesequenceretired) | (0040,08DA) VR=SQ VM=1 Coordinate System Axis Code Sequence (RETIRED). |
| static readonly [CoordinateSystemAxisDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemaxisdescriptionretired) | (0014,2206) VR=ST VM=1 Coordinate System Axis Description (RETIRED). |
| static readonly [CoordinateSystemAxisNumberRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemaxisnumberretired) | (0014,220A) VR=IS VM=1 Coordinate System Axis Number (RETIRED). |
| static readonly [CoordinateSystemAxisTypeRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemaxistyperetired) | (0014,220C) VR=CS VM=1 Coordinate System Axis Type (RETIRED). |
| static readonly [CoordinateSystemAxisUnitsRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemaxisunitsretired) | (0014,220E) VR=CS VM=1 Coordinate System Axis Units (RETIRED). |
| static readonly [CoordinateSystemAxisValuesRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemaxisvaluesretired) | (0014,2210) VR=OB VM=1 Coordinate System Axis Values (RETIRED). |
| static readonly [CoordinateSystemDataSetMappingRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemdatasetmappingretired) | (0014,2208) VR=CS VM=1 Coordinate System Data Set Mapping (RETIRED). |
| static readonly [CoordinateSystemNumberOfAxesRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemnumberofaxesretired) | (0014,2202) VR=IS VM=1 Coordinate System Number of Axes (RETIRED). |
| static readonly [CoordinateSystemTransformRotationAndScaleMatrixRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemtransformrotationandscalematrixretired) | (0014,222A) VR=DS VM=1-n Coordinate System Transform Rotation and Scale Matrix (RETIRED). |
| static readonly [CoordinateSystemTransformSequenceRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemtransformsequenceretired) | (0014,2220) VR=SQ VM=1 Coordinate System Transform Sequence (RETIRED). |
| static readonly [CoordinateSystemTransformTranslationMatrixRETIRED](../../aspose.medical.dicom.tags/tag/coordinatesystemtransformtranslationmatrixretired) | (0014,222C) VR=DS VM=1-n Coordinate System Transform Translation Matrix (RETIRED). |
| static readonly [CopiesRETIRED](../../aspose.medical.dicom.tags/tag/copiesretired) | (0000,5170) VR=IS VM=1 Copies (RETIRED). |
| static readonly [CornealAxis](../../aspose.medical.dicom.tags/tag/cornealaxis) | (0046,0115) VR=FD VM=1 Corneal Axis. |
| static readonly [CornealEccentricityIndex](../../aspose.medical.dicom.tags/tag/cornealeccentricityindex) | (0046,0234) VR=FL VM=1 Corneal Eccentricity Index. |
| static readonly [CornealISValue](../../aspose.medical.dicom.tags/tag/cornealisvalue) | (0046,0224) VR=FL VM=1 Corneal I-S Value. |
| static readonly [CornealPointEstimated](../../aspose.medical.dicom.tags/tag/cornealpointestimated) | (0046,0248) VR=CS VM=1 Corneal Point Estimated. |
| static readonly [CornealPointLocation](../../aspose.medical.dicom.tags/tag/cornealpointlocation) | (0046,0247) VR=FL VM=3 Corneal Point Location. |
| static readonly [CornealPower](../../aspose.medical.dicom.tags/tag/cornealpower) | (0046,0114) VR=FD VM=1 Corneal Power. |
| static readonly [CornealSize](../../aspose.medical.dicom.tags/tag/cornealsize) | (0046,0046) VR=FD VM=1 Corneal Size. |
| static readonly [CornealSizeSequence](../../aspose.medical.dicom.tags/tag/cornealsizesequence) | (0046,0047) VR=SQ VM=1 Corneal Size Sequence. |
| static readonly [CornealTopographyMappingNormalsSequence](../../aspose.medical.dicom.tags/tag/cornealtopographymappingnormalssequence) | (0046,0210) VR=SQ VM=1 Corneal Topography Mapping Normals Sequence. |
| static readonly [CornealTopographyMapQualityEvaluation](../../aspose.medical.dicom.tags/tag/cornealtopographymapqualityevaluation) | (0046,0242) VR=CS VM=1 Corneal Topography Map Quality Evaluation. |
| static readonly [CornealTopographyMapTypeCodeSequence](../../aspose.medical.dicom.tags/tag/cornealtopographymaptypecodesequence) | (0046,0207) VR=SQ VM=1 Corneal Topography Map Type Code Sequence. |
| static readonly [CornealTopographySurface](../../aspose.medical.dicom.tags/tag/cornealtopographysurface) | (0046,0201) VR=CS VM=1 Corneal Topography Surface. |
| static readonly [CornealVertexLocation](../../aspose.medical.dicom.tags/tag/cornealvertexlocation) | (0046,0202) VR=FL VM=2 Corneal Vertex Location. |
| static readonly [CornealWavefront](../../aspose.medical.dicom.tags/tag/cornealwavefront) | (0046,0253) VR=FL VM=1 Corneal Wavefront. |
| static readonly [CorneaMeasurementMethodCodeSequence](../../aspose.medical.dicom.tags/tag/corneameasurementmethodcodesequence) | (0046,0116) VR=SQ VM=1 Cornea Measurement Method Code Sequence. |
| static readonly [CorneaMeasurementsSequence](../../aspose.medical.dicom.tags/tag/corneameasurementssequence) | (0046,0110) VR=SQ VM=1 Cornea Measurements Sequence. |
| static readonly [CorrectedImage](../../aspose.medical.dicom.tags/tag/correctedimage) | (0028,0051) VR=CS VM=1-n Corrected Image. |
| static readonly [CorrectedLocalizedDeviationFromNormal](../../aspose.medical.dicom.tags/tag/correctedlocalizeddeviationfromnormal) | (0024,0079) VR=FL VM=1 Corrected Localized Deviation From Normal. |
| static readonly [CorrectedLocalizedDeviationFromNormalCalculated](../../aspose.medical.dicom.tags/tag/correctedlocalizeddeviationfromnormalcalculated) | (0024,0078) VR=CS VM=1 Corrected Localized Deviation From Normal Calculated. |
| static readonly [CorrectedLocalizedDeviationFromNormalProbability](../../aspose.medical.dicom.tags/tag/correctedlocalizeddeviationfromnormalprobability) | (0024,0081) VR=FL VM=1 Corrected Localized Deviation From Normal Probability. |
| static readonly [CorrectedLocalizedDeviationFromNormalProbabilityCalculated](../../aspose.medical.dicom.tags/tag/correctedlocalizeddeviationfromnormalprobabilitycalculated) | (0024,0080) VR=CS VM=1 Corrected Localized Deviation From Normal Probability Calculated. |
| static readonly [CorrectedParameterSequence](../../aspose.medical.dicom.tags/tag/correctedparametersequence) | (3008,0068) VR=SQ VM=1 Corrected Parameter Sequence. |
| static readonly [CorrectionValue](../../aspose.medical.dicom.tags/tag/correctionvalue) | (3008,006A) VR=FL VM=1 Correction Value. |
| static readonly [CountLossNormalizationCorrected](../../aspose.medical.dicom.tags/tag/countlossnormalizationcorrected) | (0018,9764) VR=CS VM=1 Count Loss Normalization Corrected. |
| static readonly [CountRate](../../aspose.medical.dicom.tags/tag/countrate) | (0018,1243) VR=IS VM=1 Count Rate. |
| static readonly [CountryOfResidence](../../aspose.medical.dicom.tags/tag/countryofresidence) | (0010,2150) VR=LO VM=1 Country of Residence. |
| static readonly [CountsAccumulated](../../aspose.medical.dicom.tags/tag/countsaccumulated) | (0018,0070) VR=IS VM=1 Counts Accumulated. |
| static readonly [CountsIncludedRETIRED](../../aspose.medical.dicom.tags/tag/countsincludedretired) | (0054,1400) VR=CS VM=1-n Counts Included (RETIRED). |
| static readonly [CountsSource](../../aspose.medical.dicom.tags/tag/countssource) | (0054,1002) VR=CS VM=1 Counts Source. |
| static readonly [CouplingMediumRETIRED](../../aspose.medical.dicom.tags/tag/couplingmediumretired) | (0014,4056) VR=ST VM=1 Coupling Medium (RETIRED). |
| static readonly [CouplingTechniqueRETIRED](../../aspose.medical.dicom.tags/tag/couplingtechniqueretired) | (0014,4054) VR=ST VM=1 Coupling Technique (RETIRED). |
| static readonly [CouplingVelocityRETIRED](../../aspose.medical.dicom.tags/tag/couplingvelocityretired) | (0014,4057) VR=DS VM=1 Coupling Velocity (RETIRED). |
| static readonly [CoverageOfKSpace](../../aspose.medical.dicom.tags/tag/coverageofkspace) | (0018,9094) VR=CS VM=1 Coverage of k-Space. |
| static readonly [CranialThermalIndex](../../aspose.medical.dicom.tags/tag/cranialthermalindex) | (0018,5026) VR=DS VM=1 Cranial Thermal Index. |
| static readonly [CreationDate](../../aspose.medical.dicom.tags/tag/creationdate) | (2100,0040) VR=DA VM=1 Creation Date. |
| static readonly [CreationTime](../../aspose.medical.dicom.tags/tag/creationtime) | (2100,0050) VR=TM VM=1 Creation Time. |
| static readonly [CreatorVersionUID](../../aspose.medical.dicom.tags/tag/creatorversionuid) | (0008,9123) VR=UI VM=1 Creator-Version UID. |
| static readonly [Crop](../../aspose.medical.dicom.tags/tag/crop) | (0070,1204) VR=CS VM=1 Crop. |
| static readonly [CroppingSpecificationIndex](../../aspose.medical.dicom.tags/tag/croppingspecificationindex) | (0070,1205) VR=US VM=1-n Cropping Specification Index. |
| static readonly [CroppingSpecificationNumber](../../aspose.medical.dicom.tags/tag/croppingspecificationnumber) | (0070,1309) VR=US VM=1 Cropping Specification Number. |
| static readonly [CSSFontName](../../aspose.medical.dicom.tags/tag/cssfontname) | (0070,0229) VR=LO VM=1 CSS Font Name. |
| static readonly [CTAcquisitionDetailsSequence](../../aspose.medical.dicom.tags/tag/ctacquisitiondetailssequence) | (0018,9304) VR=SQ VM=1 CT Acquisition Details Sequence. |
| static readonly [CTAcquisitionTypeSequence](../../aspose.medical.dicom.tags/tag/ctacquisitiontypesequence) | (0018,9301) VR=SQ VM=1 CT Acquisition Type Sequence. |
| static readonly [CTAdditionalXRaySourceSequence](../../aspose.medical.dicom.tags/tag/ctadditionalxraysourcesequence) | (0018,9360) VR=SQ VM=1 CT Additional X-Ray Source Sequence. |
| static readonly [CTDIPhantomTypeCodeSequence](../../aspose.medical.dicom.tags/tag/ctdiphantomtypecodesequence) | (0018,9346) VR=SQ VM=1 CTDI Phantom Type Code Sequence. |
| static readonly [CTDIvol](../../aspose.medical.dicom.tags/tag/ctdivol) | (0018,9345) VR=FD VM=1 CTDIvol. |
| static readonly [CTDIvolNotificationTrigger](../../aspose.medical.dicom.tags/tag/ctdivolnotificationtrigger) | (0018,9942) VR=FD VM=1 CTDIvol Notification Trigger. |
| static readonly [CTExposureSequence](../../aspose.medical.dicom.tags/tag/ctexposuresequence) | (0018,9321) VR=SQ VM=1 CT Exposure Sequence. |
| static readonly [CTGeometrySequence](../../aspose.medical.dicom.tags/tag/ctgeometrysequence) | (0018,9312) VR=SQ VM=1 CT Geometry Sequence. |
| static readonly [CTImageFrameTypeSequence](../../aspose.medical.dicom.tags/tag/ctimageframetypesequence) | (0018,9329) VR=SQ VM=1 CT Image Frame Type Sequence. |
| static readonly [CTImagingAcquisitionParameterSequence](../../aspose.medical.dicom.tags/tag/ctimagingacquisitionparametersequence) | (3002,0126) VR=SQ VM=1 CT Imaging Acquisition Parameter Sequence. |
| static readonly [CTPositionSequence](../../aspose.medical.dicom.tags/tag/ctpositionsequence) | (0018,9326) VR=SQ VM=1 CT Position Sequence. |
| static readonly [CTReconstructionSequence](../../aspose.medical.dicom.tags/tag/ctreconstructionsequence) | (0018,9314) VR=SQ VM=1 CT Reconstruction Sequence. |
| static readonly [CTTableDynamicsSequence](../../aspose.medical.dicom.tags/tag/cttabledynamicssequence) | (0018,9308) VR=SQ VM=1 CT Table Dynamics Sequence. |
| static readonly [CTXRayDetailsSequence](../../aspose.medical.dicom.tags/tag/ctxraydetailssequence) | (0018,9325) VR=SQ VM=1 CT X-Ray Details Sequence. |
| static readonly [CumulativeDoseReferenceCoefficient](../../aspose.medical.dicom.tags/tag/cumulativedosereferencecoefficient) | (300A,010C) VR=DS VM=1 Cumulative Dose Reference Coefficient. |
| static readonly [CumulativeDoseToDoseReference](../../aspose.medical.dicom.tags/tag/cumulativedosetodosereference) | (3008,0052) VR=DS VM=1 Cumulative Dose to Dose Reference. |
| static readonly [CumulativeMeterset](../../aspose.medical.dicom.tags/tag/cumulativemeterset) | (300A,063C) VR=FD VM=1 Cumulative Meterset. |
| static readonly [CumulativeMetersetWeight](../../aspose.medical.dicom.tags/tag/cumulativemetersetweight) | (300A,0134) VR=DS VM=1 Cumulative Meterset Weight. |
| static readonly [CumulativeTimeWeight](../../aspose.medical.dicom.tags/tag/cumulativetimeweight) | (300A,02D6) VR=DS VM=1 Cumulative Time Weight. |
| static readonly [CurrentAmplitudeAcrossCoilRETIRED](../../aspose.medical.dicom.tags/tag/currentamplitudeacrosscoilretired) | (0014,600E) VR=DS VM=1 Current Amplitude Across Coil (RETIRED). |
| static readonly [CurrentConfigurationID](../../aspose.medical.dicom.tags/tag/currentconfigurationid) | (0028,7002) VR=US VM=1 Current Configuration ID. |
| static readonly [CurrentFractionNumber](../../aspose.medical.dicom.tags/tag/currentfractionnumber) | (3008,0022) VR=IS VM=1 Current Fraction Number. |
| static readonly [CurrentFrameFunctionalGroupsSequence](../../aspose.medical.dicom.tags/tag/currentframefunctionalgroupssequence) | (0006,0001) VR=SQ VM=1 Current Frame Functional Groups Sequence. |
| static readonly [CurrentObserverTrialRETIRED](../../aspose.medical.dicom.tags/tag/currentobservertrialretired) | (0040,A307) VR=PN VM=1 Current Observer (Trial) (RETIRED). |
| static readonly [CurrentPatientLocation](../../aspose.medical.dicom.tags/tag/currentpatientlocation) | (0038,0300) VR=LO VM=1 Current Patient Location. |
| static readonly [CurrentRequestedProcedureEvidenceSequence](../../aspose.medical.dicom.tags/tag/currentrequestedprocedureevidencesequence) | (0040,A375) VR=SQ VM=1 Current Requested Procedure Evidence Sequence. |
| static readonly [CurrentTreatmentStatus](../../aspose.medical.dicom.tags/tag/currenttreatmentstatus) | (3008,0200) VR=CS VM=1 Current Treatment Status. |
| static readonly [CurvatureTypeRETIRED](../../aspose.medical.dicom.tags/tag/curvaturetyperetired) | (0014,0052) VR=CS VM=1 Curvature Type (RETIRED). |
| static readonly [CurveActivationLayerRETIRED](../../aspose.medical.dicom.tags/tag/curveactivationlayerretired) | (50xx,1001) VR=CS VM=1 Curve Activation Layer (RETIRED). |
| static readonly [CurveDataDescriptorRETIRED](../../aspose.medical.dicom.tags/tag/curvedatadescriptorretired) | (50xx,0110) VR=US VM=1-n Curve Data Descriptor (RETIRED). |
| static readonly [CurveDataRETIRED](../../aspose.medical.dicom.tags/tag/curvedataretired) | (50xx,3000) VR=OB or OW VM=1 Curve Data (RETIRED). |
| static readonly [CurveDateRETIRED](../../aspose.medical.dicom.tags/tag/curvedateretired) | (0008,0025) VR=DA VM=1 Curve Date (RETIRED). |
| static readonly [CurveDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/curvedescriptionretired) | (50xx,0022) VR=LO VM=1 Curve Description (RETIRED). |
| static readonly [CurveDimensionsRETIRED](../../aspose.medical.dicom.tags/tag/curvedimensionsretired) | (50xx,0005) VR=US VM=1 Curve Dimensions (RETIRED). |
| static readonly [CurveLabelRETIRED](../../aspose.medical.dicom.tags/tag/curvelabelretired) | (50xx,2500) VR=LO VM=1 Curve Label (RETIRED). |
| static readonly [CurveNumberRETIRED](../../aspose.medical.dicom.tags/tag/curvenumberretired) | (0020,0024) VR=IS VM=1 Curve Number (RETIRED). |
| static readonly [CurveRangeRETIRED](../../aspose.medical.dicom.tags/tag/curverangeretired) | (50xx,0106) VR=SH VM=1-n Curve Range (RETIRED). |
| static readonly [CurveReferencedOverlayGroupRETIRED](../../aspose.medical.dicom.tags/tag/curvereferencedoverlaygroupretired) | (50xx,2610) VR=US VM=1 Curve Referenced Overlay Group (RETIRED). |
| static readonly [CurveReferencedOverlaySequenceRETIRED](../../aspose.medical.dicom.tags/tag/curvereferencedoverlaysequenceretired) | (50xx,2600) VR=SQ VM=1 Curve Referenced Overlay Sequence (RETIRED). |
| static readonly [CurveTimeRETIRED](../../aspose.medical.dicom.tags/tag/curvetimeretired) | (0008,0035) VR=TM VM=1 Curve Time (RETIRED). |
| static readonly [CustodialOrganizationSequence](../../aspose.medical.dicom.tags/tag/custodialorganizationsequence) | (0040,A07C) VR=SQ VM=1 Custodial Organization Sequence. |
| static readonly [CustomRendered](../../aspose.medical.dicom.tags/tag/customrendered) | (0016,0041) VR=US VM=1 Custom Rendered. |
| static readonly [CutoffFilterTypeRETIRED](../../aspose.medical.dicom.tags/tag/cutofffiltertyperetired) | (0014,6029) VR=CS VM=1 Cutoff Filter Type (RETIRED). |
| static readonly [CylinderAxis](../../aspose.medical.dicom.tags/tag/cylinderaxis) | (0022,0009) VR=FL VM=1 Cylinder Axis. |
| static readonly [CylinderLensPower](../../aspose.medical.dicom.tags/tag/cylinderlenspower) | (0022,0008) VR=FL VM=1 Cylinder Lens Power. |
| static readonly [CylinderPower](../../aspose.medical.dicom.tags/tag/cylinderpower) | (0046,0147) VR=FD VM=1 Cylinder Power. |
| static readonly [CylinderSequence](../../aspose.medical.dicom.tags/tag/cylindersequence) | (0046,0018) VR=SQ VM=1 Cylinder Sequence. |
| static readonly [DACAmplitudeRETIRED](../../aspose.medical.dicom.tags/tag/dacamplituderetired) | (0014,403C) VR=DS VM=1-n DAC Amplitude (RETIRED). |
| static readonly [DACGainPointsRETIRED](../../aspose.medical.dicom.tags/tag/dacgainpointsretired) | (0014,4038) VR=DS VM=1-n DAC Gain Points (RETIRED). |
| static readonly [DACSequenceRETIRED](../../aspose.medical.dicom.tags/tag/dacsequenceretired) | (0014,4035) VR=SQ VM=1 DAC Sequence (RETIRED). |
| static readonly [DACTimePointsRETIRED](../../aspose.medical.dicom.tags/tag/dactimepointsretired) | (0014,403A) VR=DS VM=1-n DAC Time Points (RETIRED). |
| static readonly [DACTypeRETIRED](../../aspose.medical.dicom.tags/tag/dactyperetired) | (0014,4036) VR=CS VM=1 DAC Type (RETIRED). |
| static readonly [DampingRETIRED](../../aspose.medical.dicom.tags/tag/dampingretired) | (0014,4028) VR=DS VM=1 Damping (RETIRED). |
| static readonly [DarkCurrentCountsRETIRED](../../aspose.medical.dicom.tags/tag/darkcurrentcountsretired) | (0014,3050) VR=OB or OW VM=1 Dark Current Counts (RETIRED). |
| static readonly [DarkCurrentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/darkcurrentsequenceretired) | (0014,3040) VR=SQ VM=1 Dark Current Sequence (RETIRED). |
| static readonly [DataBlockDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/datablockdescriptionretired) | (0028,0701) VR=CS VM=1-n Data Block Description (RETIRED). |
| static readonly [DataBlockRETIRED](../../aspose.medical.dicom.tags/tag/datablockretired) | (0028,0702) VR=AT VM=1-n Data Block (RETIRED). |
| static readonly [DataCollectionCenterPatient](../../aspose.medical.dicom.tags/tag/datacollectioncenterpatient) | (0018,9313) VR=FD VM=3 Data Collection Center (Patient). |
| static readonly [DataCollectionDiameter](../../aspose.medical.dicom.tags/tag/datacollectiondiameter) | (0018,0090) VR=DS VM=1 Data Collection Diameter. |
| static readonly [DataElementConditionalityRETIRED](../../aspose.medical.dicom.tags/tag/dataelementconditionalityretired) | (0014,0205) VR=CS VM=1 Data Element Conditionality (RETIRED). |
| static readonly [DataElementDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/dataelementdescriptionretired) | (0014,0204) VR=LO VM=1 Data Element Description (RETIRED). |
| static readonly [DataElementLabelItemSequenceRETIRED](../../aspose.medical.dicom.tags/tag/dataelementlabelitemsequenceretired) | (0014,0201) VR=SQ VM=1 Data Element Label Item Sequence (RETIRED). |
| static readonly [DataElementLabelSequenceRETIRED](../../aspose.medical.dicom.tags/tag/dataelementlabelsequenceretired) | (0014,0200) VR=SQ VM=1 Data Element Label Sequence (RETIRED). |
| static readonly [DataElementMaximumCharactersRETIRED](../../aspose.medical.dicom.tags/tag/dataelementmaximumcharactersretired) | (0014,0207) VR=IS VM=1 Data Element Maximum Characters (RETIRED). |
| static readonly [DataElementMinimumCharactersRETIRED](../../aspose.medical.dicom.tags/tag/dataelementminimumcharactersretired) | (0014,0206) VR=IS VM=1 Data Element Minimum Characters (RETIRED). |
| static readonly [DataElementNameRETIRED](../../aspose.medical.dicom.tags/tag/dataelementnameretired) | (0014,0203) VR=LO VM=1 Data Element Name (RETIRED). |
| static readonly [DataElementRETIRED](../../aspose.medical.dicom.tags/tag/dataelementretired) | (0014,0202) VR=AT VM=1 Data Element (RETIRED). |
| static readonly [DataElementsSigned](../../aspose.medical.dicom.tags/tag/dataelementssigned) | (0400,0020) VR=AT VM=1-n Data Elements Signed. |
| static readonly [DataFrameAssignmentSequence](../../aspose.medical.dicom.tags/tag/dataframeassignmentsequence) | (0028,1401) VR=SQ VM=1 Data Frame Assignment Sequence. |
| static readonly [DataInformationSequence](../../aspose.medical.dicom.tags/tag/datainformationsequence) | (0054,0063) VR=SQ VM=1 Data Information Sequence. |
| static readonly [DataObservationSequence](../../aspose.medical.dicom.tags/tag/dataobservationsequence) | (0024,0325) VR=SQ VM=1 Data Observation Sequence. |
| static readonly [DataPathAssignment](../../aspose.medical.dicom.tags/tag/datapathassignment) | (0028,1402) VR=CS VM=1 Data Path Assignment. |
| static readonly [DataPathID](../../aspose.medical.dicom.tags/tag/datapathid) | (0028,140E) VR=CS VM=1 Data Path ID. |
| static readonly [DataPointColumns](../../aspose.medical.dicom.tags/tag/datapointcolumns) | (0028,9002) VR=UL VM=1 Data Point Columns. |
| static readonly [DataPointRows](../../aspose.medical.dicom.tags/tag/datapointrows) | (0028,9001) VR=UL VM=1 Data Point Rows. |
| static readonly [DataRepresentation](../../aspose.medical.dicom.tags/tag/datarepresentation) | (0028,9108) VR=CS VM=1 Data Representation. |
| static readonly [DataSetDescription](../../aspose.medical.dicom.tags/tag/datasetdescription) | (0024,0309) VR=LO VM=1 Data Set Description. |
| static readonly [DataSetName](../../aspose.medical.dicom.tags/tag/datasetname) | (0024,0306) VR=LO VM=1 Data Set Name. |
| static readonly [DataSetSource](../../aspose.medical.dicom.tags/tag/datasetsource) | (0024,0308) VR=LO VM=1 Data Set Source. |
| static readonly [DataSetSubtypeRETIRED](../../aspose.medical.dicom.tags/tag/datasetsubtyperetired) | (0008,0041) VR=LO VM=1 Data Set Subtype (RETIRED). |
| static readonly [DataSetTrailingPadding](../../aspose.medical.dicom.tags/tag/datasettrailingpadding) | (FFFC,FFFC) VR=OB VM=1 Data Set Trailing Padding. |
| static readonly [DataSetTypeRETIRED](../../aspose.medical.dicom.tags/tag/datasettyperetired) | (0008,0040) VR=US VM=1 Data Set Type (RETIRED). |
| static readonly [DataSetVersion](../../aspose.medical.dicom.tags/tag/datasetversion) | (0024,0307) VR=LO VM=1 Data Set Version. |
| static readonly [DataStreamingProtocolRETIRED](../../aspose.medical.dicom.tags/tag/datastreamingprotocolretired) | (0014,6025) VR=ST VM=1-n Data Streaming Protocol (RETIRED). |
| static readonly [DataType](../../aspose.medical.dicom.tags/tag/datatype) | (0018,9808) VR=CS VM=1 Data Type. |
| static readonly [DataValueRepresentationRETIRED](../../aspose.medical.dicom.tags/tag/datavaluerepresentationretired) | (50xx,0103) VR=US VM=1 Data Value Representation (RETIRED). |
| static readonly [Date](../../aspose.medical.dicom.tags/tag/date) | (0040,A121) VR=DA VM=1 Date. |
| static readonly [DateOfDocumentOrVerbalTransactionTrialRETIRED](../../aspose.medical.dicom.tags/tag/dateofdocumentorverbaltransactiontrialretired) | (0040,A110) VR=DA VM=1 Date of Document or Verbal Transaction (Trial) (RETIRED). |
| static readonly [DateOfGainCalibrationRETIRED](../../aspose.medical.dicom.tags/tag/dateofgaincalibrationretired) | (0014,3076) VR=DA VM=1 Date of Gain Calibration (RETIRED). |
| static readonly [DateOfInstallation](../../aspose.medical.dicom.tags/tag/dateofinstallation) | (0018,1205) VR=DA VM=1 Date of Installation. |
| static readonly [DateOfLastCalibration](../../aspose.medical.dicom.tags/tag/dateoflastcalibration) | (0018,1200) VR=DA VM=1-n Date of Last Calibration. |
| static readonly [DateOfLastDetectorCalibration](../../aspose.medical.dicom.tags/tag/dateoflastdetectorcalibration) | (0018,700C) VR=DA VM=1 Date of Last Detector Calibration. |
| static readonly [DateOfManufacture](../../aspose.medical.dicom.tags/tag/dateofmanufacture) | (0018,1204) VR=DA VM=1 Date of Manufacture. |
| static readonly [DateOfSecondaryCapture](../../aspose.medical.dicom.tags/tag/dateofsecondarycapture) | (0018,1012) VR=DA VM=1 Date of Secondary Capture. |
| static readonly [DateTime](../../aspose.medical.dicom.tags/tag/datetime) | (0040,A120) VR=DT VM=1 DateTime. |
| static readonly [DateTimeOfLastCalibration](../../aspose.medical.dicom.tags/tag/datetimeoflastcalibration) | (0018,1202) VR=DT VM=1 DateTime of Last Calibration. |
| static readonly [dBdt](../../aspose.medical.dicom.tags/tag/dbdt) | (0018,1318) VR=DS VM=1 dB/dt. |
| static readonly [DCTLabelRETIRED](../../aspose.medical.dicom.tags/tag/dctlabelretired) | (0028,0700) VR=LO VM=1 DCT Label (RETIRED). |
| static readonly [DDLValue](../../aspose.medical.dicom.tags/tag/ddlvalue) | (0028,7017) VR=US VM=1 DDL Value. |
| static readonly [DeadTimeCorrected](../../aspose.medical.dicom.tags/tag/deadtimecorrected) | (0018,9761) VR=CS VM=1 Dead Time Corrected. |
| static readonly [DeadTimeCorrectionFlagRETIRED](../../aspose.medical.dicom.tags/tag/deadtimecorrectionflagretired) | (0054,1401) VR=CS VM=1 Dead Time Correction Flag (RETIRED). |
| static readonly [DeadTimeFactor](../../aspose.medical.dicom.tags/tag/deadtimefactor) | (0054,1324) VR=DS VM=1 Dead Time Factor. |
| static readonly [DecayCorrected](../../aspose.medical.dicom.tags/tag/decaycorrected) | (0018,9758) VR=CS VM=1 Decay Corrected. |
| static readonly [DecayCorrection](../../aspose.medical.dicom.tags/tag/decaycorrection) | (0054,1102) VR=CS VM=1 Decay Correction. |
| static readonly [DecayCorrectionDateTime](../../aspose.medical.dicom.tags/tag/decaycorrectiondatetime) | (0018,9701) VR=DT VM=1 Decay Correction DateTime. |
| static readonly [DecayFactor](../../aspose.medical.dicom.tags/tag/decayfactor) | (0054,1321) VR=DS VM=1 Decay Factor. |
| static readonly [DecimalPotentialVisualAcuity](../../aspose.medical.dicom.tags/tag/decimalpotentialvisualacuity) | (0046,0238) VR=FL VM=1 Decimal Potential Visual Acuity. |
| static readonly [DecimalVisualAcuity](../../aspose.medical.dicom.tags/tag/decimalvisualacuity) | (0046,0137) VR=FD VM=1 Decimal Visual Acuity. |
| static readonly [DecimateCropResult](../../aspose.medical.dicom.tags/tag/decimatecropresult) | (2020,00A2) VR=CS VM=1 Decimate/Crop Result. |
| static readonly [DecompositionAlgorithmIdentificationSequence](../../aspose.medical.dicom.tags/tag/decompositionalgorithmidentificationsequence) | (0018,9380) VR=SQ VM=1 Decomposition Algorithm Identification Sequence. |
| static readonly [DecompositionDescription](../../aspose.medical.dicom.tags/tag/decompositiondescription) | (0018,937F) VR=UT VM=1 Decomposition Description. |
| static readonly [DecompositionMaterialSequence](../../aspose.medical.dicom.tags/tag/decompositionmaterialsequence) | (0018,9381) VR=SQ VM=1 Decomposition Material Sequence. |
| static readonly [DecompositionMethod](../../aspose.medical.dicom.tags/tag/decompositionmethod) | (0018,937E) VR=CS VM=1 Decomposition Method. |
| static readonly [DecoupledNucleus](../../aspose.medical.dicom.tags/tag/decouplednucleus) | (0018,9060) VR=CS VM=1-2 De-coupled Nucleus. |
| static readonly [Decoupling](../../aspose.medical.dicom.tags/tag/decoupling) | (0018,9059) VR=CS VM=1 De-coupling. |
| static readonly [DecouplingChemicalShiftReference](../../aspose.medical.dicom.tags/tag/decouplingchemicalshiftreference) | (0018,9063) VR=FD VM=1-2 De-coupling Chemical Shift Reference. |
| static readonly [DecouplingFrequency](../../aspose.medical.dicom.tags/tag/decouplingfrequency) | (0018,9061) VR=FD VM=1-2 De-coupling Frequency. |
| static readonly [DecouplingMethod](../../aspose.medical.dicom.tags/tag/decouplingmethod) | (0018,9062) VR=CS VM=1 De-coupling Method. |
| static readonly [DefaultMagnificationType](../../aspose.medical.dicom.tags/tag/defaultmagnificationtype) | (2010,00A6) VR=CS VM=1 Default Magnification Type. |
| static readonly [DefaultPrinterResolutionID](../../aspose.medical.dicom.tags/tag/defaultprinterresolutionid) | (2010,0054) VR=CS VM=1 Default Printer Resolution ID. |
| static readonly [DefaultSmoothingType](../../aspose.medical.dicom.tags/tag/defaultsmoothingtype) | (2010,00A8) VR=CS VM=1 Default Smoothing Type. |
| static readonly [DefinitionSourceSequence](../../aspose.medical.dicom.tags/tag/definitionsourcesequence) | (0008,1156) VR=SQ VM=1 Definition Source Sequence. |
| static readonly [DeformableRegistrationGridSequence](../../aspose.medical.dicom.tags/tag/deformableregistrationgridsequence) | (0064,0005) VR=SQ VM=1 Deformable Registration Grid Sequence. |
| static readonly [DeformableRegistrationSequence](../../aspose.medical.dicom.tags/tag/deformableregistrationsequence) | (0064,0002) VR=SQ VM=1 Deformable Registration Sequence. |
| static readonly [DegreeOfDilation](../../aspose.medical.dicom.tags/tag/degreeofdilation) | (0022,000E) VR=FL VM=1 Degree of Dilation. |
| static readonly [DegreeOfFreedomID](../../aspose.medical.dicom.tags/tag/degreeoffreedomid) | (0068,6410) VR=US VM=1 Degree of Freedom ID. |
| static readonly [DegreeOfFreedomType](../../aspose.medical.dicom.tags/tag/degreeoffreedomtype) | (0068,6420) VR=CS VM=1 Degree of Freedom Type. |
| static readonly [DeidentificationAction](../../aspose.medical.dicom.tags/tag/deidentificationaction) | (0008,0307) VR=CS VM=1 Deidentification Action. |
| static readonly [DeidentificationActionSequence](../../aspose.medical.dicom.tags/tag/deidentificationactionsequence) | (0008,0305) VR=SQ VM=1 Deidentification Action Sequence. |
| static readonly [DeidentificationMethod](../../aspose.medical.dicom.tags/tag/deidentificationmethod) | (0012,0063) VR=LO VM=1-n De-identification Method. |
| static readonly [DeidentificationMethodCodeSequence](../../aspose.medical.dicom.tags/tag/deidentificationmethodcodesequence) | (0012,0064) VR=SQ VM=1 De-identification Method Code Sequence. |
| static readonly [DelayLawIdentifierRETIRED](../../aspose.medical.dicom.tags/tag/delaylawidentifierretired) | (0014,405C) VR=ST VM=1 Delay Law Identifier (RETIRED). |
| static readonly [DeletionLock](../../aspose.medical.dicom.tags/tag/deletionlock) | (0074,1230) VR=LO VM=1 Deletion Lock. |
| static readonly [DelineatedRadiationFieldSize](../../aspose.medical.dicom.tags/tag/delineatedradiationfieldsize) | (300C,0122) VR=FD VM=2 Delineated Radiation Field Size. |
| static readonly [DeliveredChannelTotalTime](../../aspose.medical.dicom.tags/tag/deliveredchanneltotaltime) | (3008,0134) VR=DS VM=1 Delivered Channel Total Time. |
| static readonly [DeliveredDepthDoseParametersSequence](../../aspose.medical.dicom.tags/tag/delivereddepthdoseparameterssequence) | (300A,0506) VR=SQ VM=1 Delivered Depth Dose Parameters Sequence. |
| static readonly [DeliveredDistalDepth](../../aspose.medical.dicom.tags/tag/delivereddistaldepth) | (300A,0508) VR=FL VM=1 Delivered Distal Depth. |
| static readonly [DeliveredDistalDepthFraction](../../aspose.medical.dicom.tags/tag/delivereddistaldepthfraction) | (300A,0507) VR=FL VM=1 Delivered Distal Depth Fraction. |
| static readonly [DeliveredMeterset](../../aspose.medical.dicom.tags/tag/deliveredmeterset) | (3008,0044) VR=DS VM=1 Delivered Meterset. |
| static readonly [DeliveredNominalRangeModulatedRegionDepths](../../aspose.medical.dicom.tags/tag/deliverednominalrangemodulatedregiondepths) | (300A,0510) VR=FL VM=2 Delivered Nominal Range Modulated Region Depths. |
| static readonly [DeliveredNominalRangeModulationFractions](../../aspose.medical.dicom.tags/tag/deliverednominalrangemodulationfractions) | (300A,0509) VR=FL VM=2 Delivered Nominal Range Modulation Fractions. |
| static readonly [DeliveredNumberOfPulses](../../aspose.medical.dicom.tags/tag/deliverednumberofpulses) | (3008,0138) VR=IS VM=1 Delivered Number of Pulses. |
| static readonly [DeliveredPrimaryMeterset](../../aspose.medical.dicom.tags/tag/deliveredprimarymeterset) | (3008,0036) VR=DS VM=1 Delivered Primary Meterset. |
| static readonly [DeliveredPulseRepetitionInterval](../../aspose.medical.dicom.tags/tag/deliveredpulserepetitioninterval) | (3008,013C) VR=DS VM=1 Delivered Pulse Repetition Interval. |
| static readonly [DeliveredReferenceDoseDefinition](../../aspose.medical.dicom.tags/tag/deliveredreferencedosedefinition) | (300A,0511) VR=CS VM=1 Delivered Reference Dose Definition. |
| static readonly [DeliveredSecondaryMeterset](../../aspose.medical.dicom.tags/tag/deliveredsecondarymeterset) | (3008,0037) VR=DS VM=1 Delivered Secondary Meterset. |
| static readonly [DeliveredTreatmentTime](../../aspose.medical.dicom.tags/tag/deliveredtreatmenttime) | (3008,003B) VR=DS VM=1 Delivered Treatment Time. |
| static readonly [DeliveryMaximumDose](../../aspose.medical.dicom.tags/tag/deliverymaximumdose) | (300A,0023) VR=DS VM=1 Delivery Maximum Dose. |
| static readonly [DeliveryRate](../../aspose.medical.dicom.tags/tag/deliveryrate) | (300A,063D) VR=FD VM=1 Delivery Rate. |
| static readonly [DeliveryRateUnitSequence](../../aspose.medical.dicom.tags/tag/deliveryrateunitsequence) | (300A,063E) VR=SQ VM=1 Delivery Rate Unit Sequence. |
| static readonly [DeliveryTimeStructureCodeSequence](../../aspose.medical.dicom.tags/tag/deliverytimestructurecodesequence) | (3010,0088) VR=SQ VM=1 Delivery Time Structure Code Sequence. |
| static readonly [DeliveryVerificationImageSequence](../../aspose.medical.dicom.tags/tag/deliveryverificationimagesequence) | (0074,1030) VR=SQ VM=1 Delivery Verification Image Sequence. |
| static readonly [DeliveryWarningDose](../../aspose.medical.dicom.tags/tag/deliverywarningdose) | (300A,0022) VR=DS VM=1 Delivery Warning Dose. |
| static readonly [DensityRETIRED](../../aspose.medical.dicom.tags/tag/densityretired) | (4010,1018) VR=FL VM=1 Density (RETIRED). |
| static readonly [DepthDoseParametersSequence](../../aspose.medical.dicom.tags/tag/depthdoseparameterssequence) | (300A,0505) VR=SQ VM=1 Depth Dose Parameters Sequence. |
| static readonly [DepthOfScanField](../../aspose.medical.dicom.tags/tag/depthofscanfield) | (0018,5050) VR=IS VM=1 Depth of Scan Field. |
| static readonly [DepthOfTransverseImage](../../aspose.medical.dicom.tags/tag/depthoftransverseimage) | (0022,0041) VR=FL VM=1 Depth of Transverse Image. |
| static readonly [DepthsOfFocus](../../aspose.medical.dicom.tags/tag/depthsoffocus) | (0018,9801) VR=FD VM=1-n Depth(s) of Focus. |
| static readonly [DepthSpatialResolution](../../aspose.medical.dicom.tags/tag/depthspatialresolution) | (0022,0035) VR=FL VM=1 Depth Spatial Resolution. |
| static readonly [DepthValueAveragingFlag](../../aspose.medical.dicom.tags/tag/depthvalueaveragingflag) | (300A,0093) VR=CS VM=1 Depth Value Averaging Flag. |
| static readonly [DerivationAlgorithmSequence](../../aspose.medical.dicom.tags/tag/derivationalgorithmsequence) | (0022,1612) VR=SQ VM=1 Derivation Algorithm Sequence. |
| static readonly [DerivationCodeSequence](../../aspose.medical.dicom.tags/tag/derivationcodesequence) | (0008,9215) VR=SQ VM=1 Derivation Code Sequence. |
| static readonly [DerivationConceptualVolumeSequence](../../aspose.medical.dicom.tags/tag/derivationconceptualvolumesequence) | (3010,0014) VR=SQ VM=1 Derivation Conceptual Volume Sequence. |
| static readonly [DerivationDescription](../../aspose.medical.dicom.tags/tag/derivationdescription) | (0008,2111) VR=ST VM=1 Derivation Description. |
| static readonly [DerivationImageSequence](../../aspose.medical.dicom.tags/tag/derivationimagesequence) | (0008,9124) VR=SQ VM=1 Derivation Image Sequence. |
| static readonly [DerivationImplantAssemblyTemplateSequence](../../aspose.medical.dicom.tags/tag/derivationimplantassemblytemplatesequence) | (0076,000E) VR=SQ VM=1 Derivation Implant Assembly Template Sequence. |
| static readonly [DerivationImplantTemplateSequence](../../aspose.medical.dicom.tags/tag/derivationimplanttemplatesequence) | (0068,6224) VR=SQ VM=1 Derivation Implant Template Sequence. |
| static readonly [DestinationAE](../../aspose.medical.dicom.tags/tag/destinationae) | (2100,0140) VR=AE VM=1 Destination AE. |
| static readonly [DetailsOfCoefficientsRETIRED](../../aspose.medical.dicom.tags/tag/detailsofcoefficientsretired) | (0028,0404) VR=AT VM=1-n Details of Coefficients (RETIRED). |
| static readonly [DetectorActivationOffsetFromExposure](../../aspose.medical.dicom.tags/tag/detectoractivationoffsetfromexposure) | (0018,7016) VR=DS VM=1 Detector Activation Offset From Exposure. |
| static readonly [DetectorActiveAreaOrientation](../../aspose.medical.dicom.tags/tag/detectoractiveareaorientation) | (0018,9558) VR=FD VM=6 Detector Active Area Orientation. |
| static readonly [DetectorActiveAreaTLHCPosition](../../aspose.medical.dicom.tags/tag/detectoractiveareatlhcposition) | (0018,9557) VR=FD VM=3 Detector Active Area TLHC Position. |
| static readonly [DetectorActiveDimensions](../../aspose.medical.dicom.tags/tag/detectoractivedimensions) | (0018,7026) VR=DS VM=1-2 Detector Active Dimension(s). |
| static readonly [DetectorActiveOrigin](../../aspose.medical.dicom.tags/tag/detectoractiveorigin) | (0018,7028) VR=DS VM=2 Detector Active Origin. |
| static readonly [DetectorActiveShape](../../aspose.medical.dicom.tags/tag/detectoractiveshape) | (0018,7024) VR=CS VM=1 Detector Active Shape. |
| static readonly [DetectorActiveTime](../../aspose.medical.dicom.tags/tag/detectoractivetime) | (0018,7014) VR=DS VM=1 Detector Active Time. |
| static readonly [DetectorBinning](../../aspose.medical.dicom.tags/tag/detectorbinning) | (0018,701A) VR=DS VM=2 Detector Binning. |
| static readonly [DetectorCalibrationDataRETIRED](../../aspose.medical.dicom.tags/tag/detectorcalibrationdataretired) | (4010,106C) VR=OB VM=1 Detector Calibration Data (RETIRED). |
| static readonly [DetectorConditionsNominalFlag](../../aspose.medical.dicom.tags/tag/detectorconditionsnominalflag) | (0018,7000) VR=CS VM=1 Detector Conditions Nominal Flag. |
| static readonly [DetectorConfiguration](../../aspose.medical.dicom.tags/tag/detectorconfiguration) | (0018,7005) VR=CS VM=1 Detector Configuration. |
| static readonly [DetectorDescription](../../aspose.medical.dicom.tags/tag/detectordescription) | (0018,7006) VR=LT VM=1 Detector Description. |
| static readonly [DetectorElementPhysicalSize](../../aspose.medical.dicom.tags/tag/detectorelementphysicalsize) | (0018,7020) VR=DS VM=2 Detector Element Physical Size. |
| static readonly [DetectorElementSize](../../aspose.medical.dicom.tags/tag/detectorelementsize) | (0054,1203) VR=DS VM=2 Detector Element Size. |
| static readonly [DetectorElementSpacing](../../aspose.medical.dicom.tags/tag/detectorelementspacing) | (0018,7022) VR=DS VM=2 Detector Element Spacing. |
| static readonly [DetectorGeometry](../../aspose.medical.dicom.tags/tag/detectorgeometry) | (0018,9725) VR=CS VM=1 Detector Geometry. |
| static readonly [DetectorGeometrySequenceRETIRED](../../aspose.medical.dicom.tags/tag/detectorgeometrysequenceretired) | (4010,0004) VR=SQ VM=1 Detector Geometry Sequence (RETIRED). |
| static readonly [DetectorID](../../aspose.medical.dicom.tags/tag/detectorid) | (0018,700A) VR=SH VM=1 Detector ID. |
| static readonly [DetectorInformationSequence](../../aspose.medical.dicom.tags/tag/detectorinformationsequence) | (0054,0022) VR=SQ VM=1 Detector Information Sequence. |
| static readonly [DetectorIsocenterPrimaryAngle](../../aspose.medical.dicom.tags/tag/detectorisocenterprimaryangle) | (0018,9550) VR=FD VM=1 Detector Isocenter Primary Angle. |
| static readonly [DetectorIsocenterSecondaryAngle](../../aspose.medical.dicom.tags/tag/detectorisocentersecondaryangle) | (0018,9551) VR=FD VM=1 Detector Isocenter Secondary Angle. |
| static readonly [DetectorLinesOfResponseUsed](../../aspose.medical.dicom.tags/tag/detectorlinesofresponseused) | (0054,1104) VR=LO VM=1 Detector Lines of Response Used. |
| static readonly [DetectorManufacturerModelName](../../aspose.medical.dicom.tags/tag/detectormanufacturermodelname) | (0018,702B) VR=LO VM=1 Detector Manufacturer's Model Name. |
| static readonly [DetectorManufacturerName](../../aspose.medical.dicom.tags/tag/detectormanufacturername) | (0018,702A) VR=LO VM=1 Detector Manufacturer Name. |
| static readonly [DetectorMode](../../aspose.medical.dicom.tags/tag/detectormode) | (0018,7008) VR=LT VM=1 Detector Mode. |
| static readonly [DetectorNormalizationCorrection](../../aspose.medical.dicom.tags/tag/detectornormalizationcorrection) | (0018,9768) VR=CS VM=1 Detector Normalization Correction. |
| static readonly [DetectorPositioningType](../../aspose.medical.dicom.tags/tag/detectorpositioningtype) | (3002,012F) VR=CS VM=1 Detector Positioning Type. |
| static readonly [DetectorPositionSequence](../../aspose.medical.dicom.tags/tag/detectorpositionsequence) | (0018,9541) VR=SQ VM=1 Detector Position Sequence. |
| static readonly [DetectorPrimaryAngle](../../aspose.medical.dicom.tags/tag/detectorprimaryangle) | (0018,1530) VR=DS VM=1 Detector Primary Angle. |
| static readonly [DetectorSecondaryAngle](../../aspose.medical.dicom.tags/tag/detectorsecondaryangle) | (0018,1531) VR=DS VM=1 Detector Secondary Angle. |
| static readonly [DetectorTemperature](../../aspose.medical.dicom.tags/tag/detectortemperature) | (0018,7001) VR=DS VM=1 Detector Temperature. |
| static readonly [DetectorTemperatureSequenceRETIRED](../../aspose.medical.dicom.tags/tag/detectortemperaturesequenceretired) | (0014,3020) VR=SQ VM=1 Detector Temperature Sequence (RETIRED). |
| static readonly [DetectorTimeSinceLastExposure](../../aspose.medical.dicom.tags/tag/detectortimesincelastexposure) | (0018,7012) VR=DS VM=1 Detector Time Since Last Exposure. |
| static readonly [DetectorType](../../aspose.medical.dicom.tags/tag/detectortype) | (0018,7004) VR=CS VM=1 Detector Type. |
| static readonly [DetectorVector](../../aspose.medical.dicom.tags/tag/detectorvector) | (0054,0020) VR=US VM=1-n Detector Vector. |
| static readonly [DetectorWavelengthRangeRETIRED](../../aspose.medical.dicom.tags/tag/detectorwavelengthrangeretired) | (0014,601E) VR=CS VM=1 Detector Wavelength Range (RETIRED). |
| static readonly [DetectorXPositionToIsocenter](../../aspose.medical.dicom.tags/tag/detectorxpositiontoisocenter) | (0018,9552) VR=FD VM=1 Detector X Position to Isocenter. |
| static readonly [DetectorYPositionToIsocenter](../../aspose.medical.dicom.tags/tag/detectorypositiontoisocenter) | (0018,9553) VR=FD VM=1 Detector Y Position to Isocenter. |
| static readonly [DetectorZPositionToIsocenter](../../aspose.medical.dicom.tags/tag/detectorzpositiontoisocenter) | (0018,9554) VR=FD VM=1 Detector Z Position to Isocenter. |
| static readonly [DeviationIndex](../../aspose.medical.dicom.tags/tag/deviationindex) | (0018,1413) VR=DS VM=1 Deviation Index. |
| static readonly [DeviceAlternateIdentifier](../../aspose.medical.dicom.tags/tag/devicealternateidentifier) | (3010,001B) VR=UC VM=1 Device Alternate Identifier. |
| static readonly [DeviceAlternateIdentifierFormat](../../aspose.medical.dicom.tags/tag/devicealternateidentifierformat) | (3010,001D) VR=LT VM=1 Device Alternate Identifier Format. |
| static readonly [DeviceAlternateIdentifierType](../../aspose.medical.dicom.tags/tag/devicealternateidentifiertype) | (3010,001C) VR=CS VM=1 Device Alternate Identifier Type. |
| static readonly [DeviceDescription](../../aspose.medical.dicom.tags/tag/devicedescription) | (0050,0020) VR=LO VM=1 Device Description. |
| static readonly [DeviceDiameter](../../aspose.medical.dicom.tags/tag/devicediameter) | (0050,0016) VR=DS VM=1 Device Diameter. |
| static readonly [DeviceDiameterUnits](../../aspose.medical.dicom.tags/tag/devicediameterunits) | (0050,0017) VR=CS VM=1 Device Diameter Units. |
| static readonly [DeviceID](../../aspose.medical.dicom.tags/tag/deviceid) | (0018,1003) VR=LO VM=1 Device ID. |
| static readonly [DeviceIndex](../../aspose.medical.dicom.tags/tag/deviceindex) | (3010,0039) VR=US VM=1 Device Index. |
| static readonly [DeviceLabel](../../aspose.medical.dicom.tags/tag/devicelabel) | (3010,002D) VR=LO VM=1 Device Label. |
| static readonly [DeviceLength](../../aspose.medical.dicom.tags/tag/devicelength) | (0050,0014) VR=DS VM=1 Device Length. |
| static readonly [DeviceMotionControlSequence](../../aspose.medical.dicom.tags/tag/devicemotioncontrolsequence) | (300A,0450) VR=SQ VM=1 Device Motion Control Sequence. |
| static readonly [DeviceMotionExecutionMode](../../aspose.medical.dicom.tags/tag/devicemotionexecutionmode) | (300A,0451) VR=CS VM=1 Device Motion Execution Mode. |
| static readonly [DeviceMotionObservationMode](../../aspose.medical.dicom.tags/tag/devicemotionobservationmode) | (300A,0452) VR=CS VM=1 Device Motion Observation Mode. |
| static readonly [DeviceMotionParameterCodeSequence](../../aspose.medical.dicom.tags/tag/devicemotionparametercodesequence) | (300A,0453) VR=SQ VM=1 Device Motion Parameter Code Sequence. |
| static readonly [DeviceOrderIndex](../../aspose.medical.dicom.tags/tag/deviceorderindex) | (300A,065E) VR=US VM=1 Device Order Index. |
| static readonly [DevicePositionParameterSequence](../../aspose.medical.dicom.tags/tag/devicepositionparametersequence) | (3002,0110) VR=SQ VM=1 Device Position Parameter Sequence. |
| static readonly [DevicePositionToEquipmentMappingMatrix](../../aspose.medical.dicom.tags/tag/devicepositiontoequipmentmappingmatrix) | (3002,010F) VR=FD VM=16 Device Position to Equipment Mapping Matrix. |
| static readonly [DeviceSequence](../../aspose.medical.dicom.tags/tag/devicesequence) | (0050,0010) VR=SQ VM=1 Device Sequence. |
| static readonly [DeviceSerialNumber](../../aspose.medical.dicom.tags/tag/deviceserialnumber) | (0018,1000) VR=LO VM=1 Device Serial Number. |
| static readonly [DeviceSettingDescription](../../aspose.medical.dicom.tags/tag/devicesettingdescription) | (0016,004B) VR=OB VM=1 Device Setting Description. |
| static readonly [DeviceSpecificAcquisitionParameterSequence](../../aspose.medical.dicom.tags/tag/devicespecificacquisitionparametersequence) | (3002,0131) VR=SQ VM=1 Device-Specific Acquisition Parameter Sequence. |
| static readonly [DeviceTypeCodeSequence](../../aspose.medical.dicom.tags/tag/devicetypecodesequence) | (3010,002E) VR=SQ VM=1 Device Type Code Sequence. |
| static readonly [DeviceUID](../../aspose.medical.dicom.tags/tag/deviceuid) | (0018,1002) VR=UI VM=1 Device UID. |
| static readonly [DeviceVolume](../../aspose.medical.dicom.tags/tag/devicevolume) | (0050,0018) VR=DS VM=1 Device Volume. |
| static readonly [DialogReceiverRETIRED](../../aspose.medical.dicom.tags/tag/dialogreceiverretired) | (0000,4000) VR=LT VM=1 Dialog Receiver (RETIRED). |
| static readonly [DiameterOfCircularOutline](../../aspose.medical.dicom.tags/tag/diameterofcircularoutline) | (0018,1636) VR=FD VM=1 Diameter of Circular Outline. |
| static readonly [DiameterOfVisibility](../../aspose.medical.dicom.tags/tag/diameterofvisibility) | (0070,0262) VR=FL VM=1 Diameter of Visibility. |
| static readonly [DiaphragmPosition](../../aspose.medical.dicom.tags/tag/diaphragmposition) | (3002,0034) VR=DS VM=4 Diaphragm Position. |
| static readonly [DICOMMediaRetrievalSequence](../../aspose.medical.dicom.tags/tag/dicommediaretrievalsequence) | (0040,E022) VR=SQ VM=1 DICOM Media Retrieval Sequence. |
| static readonly [DICOMRetrievalSequence](../../aspose.medical.dicom.tags/tag/dicomretrievalsequence) | (0040,E021) VR=SQ VM=1 DICOM Retrieval Sequence. |
| static readonly [DICOMStorageSequence](../../aspose.medical.dicom.tags/tag/dicomstoragesequence) | (0040,4071) VR=SQ VM=1 DICOM Storage Sequence. |
| static readonly [DICOSVersionRETIRED](../../aspose.medical.dicom.tags/tag/dicosversionretired) | (4010,103A) VR=CS VM=1 DICOS Version (RETIRED). |
| static readonly [DiffuseReflectionIntensity](../../aspose.medical.dicom.tags/tag/diffusereflectionintensity) | (0070,1704) VR=FD VM=1 Diffuse Reflection Intensity. |
| static readonly [DiffusionAcquisitionCodeSequence](../../aspose.medical.dicom.tags/tag/diffusionacquisitioncodesequence) | (0066,0133) VR=SQ VM=1 Diffusion Acquisition Code Sequence. |
| static readonly [DiffusionAnisotropyType](../../aspose.medical.dicom.tags/tag/diffusionanisotropytype) | (0018,9147) VR=CS VM=1 Diffusion Anisotropy Type. |
| static readonly [DiffusionBMatrixSequence](../../aspose.medical.dicom.tags/tag/diffusionbmatrixsequence) | (0018,9601) VR=SQ VM=1 Diffusion b-matrix Sequence. |
| static readonly [DiffusionBValue](../../aspose.medical.dicom.tags/tag/diffusionbvalue) | (0018,9087) VR=FD VM=1 Diffusion b-value. |
| static readonly [DiffusionBValueXX](../../aspose.medical.dicom.tags/tag/diffusionbvaluexx) | (0018,9602) VR=FD VM=1 Diffusion b-value XX. |
| static readonly [DiffusionBValueXY](../../aspose.medical.dicom.tags/tag/diffusionbvaluexy) | (0018,9603) VR=FD VM=1 Diffusion b-value XY. |
| static readonly [DiffusionBValueXZ](../../aspose.medical.dicom.tags/tag/diffusionbvaluexz) | (0018,9604) VR=FD VM=1 Diffusion b-value XZ. |
| static readonly [DiffusionBValueYY](../../aspose.medical.dicom.tags/tag/diffusionbvalueyy) | (0018,9605) VR=FD VM=1 Diffusion b-value YY. |
| static readonly [DiffusionBValueYZ](../../aspose.medical.dicom.tags/tag/diffusionbvalueyz) | (0018,9606) VR=FD VM=1 Diffusion b-value YZ. |
| static readonly [DiffusionBValueZZ](../../aspose.medical.dicom.tags/tag/diffusionbvaluezz) | (0018,9607) VR=FD VM=1 Diffusion b-value ZZ. |
| static readonly [DiffusionDirectionality](../../aspose.medical.dicom.tags/tag/diffusiondirectionality) | (0018,9075) VR=CS VM=1 Diffusion Directionality. |
| static readonly [DiffusionGradientDirectionSequence](../../aspose.medical.dicom.tags/tag/diffusiongradientdirectionsequence) | (0018,9076) VR=SQ VM=1 Diffusion Gradient Direction Sequence. |
| static readonly [DiffusionGradientOrientation](../../aspose.medical.dicom.tags/tag/diffusiongradientorientation) | (0018,9089) VR=FD VM=3 Diffusion Gradient Orientation. |
| static readonly [DiffusionModelCodeSequence](../../aspose.medical.dicom.tags/tag/diffusionmodelcodesequence) | (0066,0134) VR=SQ VM=1 Diffusion Model Code Sequence. |
| static readonly [DigitalFilterCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/digitalfiltercharacteristicssequence) | (003A,0326) VR=SQ VM=1 Digital Filter Characteristics Sequence. |
| static readonly [DigitalFilterOrder](../../aspose.medical.dicom.tags/tag/digitalfilterorder) | (003A,0327) VR=IS VM=1 Digital Filter Order. |
| static readonly [DigitalFilterTypeCodeSequence](../../aspose.medical.dicom.tags/tag/digitalfiltertypecodesequence) | (003A,0328) VR=SQ VM=1 Digital Filter Type Code Sequence. |
| static readonly [DigitalImageFormatAcquired](../../aspose.medical.dicom.tags/tag/digitalimageformatacquired) | (0018,1023) VR=LO VM=1 Digital Image Format Acquired. |
| static readonly [DigitalSignatureDateTime](../../aspose.medical.dicom.tags/tag/digitalsignaturedatetime) | (0400,0105) VR=DT VM=1 Digital Signature DateTime. |
| static readonly [DigitalSignaturePurposeCodeSequence](../../aspose.medical.dicom.tags/tag/digitalsignaturepurposecodesequence) | (0400,0401) VR=SQ VM=1 Digital Signature Purpose Code Sequence. |
| static readonly [DigitalSignaturesSequence](../../aspose.medical.dicom.tags/tag/digitalsignaturessequence) | (FFFA,FFFA) VR=SQ VM=1 Digital Signatures Sequence. |
| static readonly [DigitalSignatureUID](../../aspose.medical.dicom.tags/tag/digitalsignatureuid) | (0400,0100) VR=UI VM=1 Digital Signature UID. |
| static readonly [DigitalZoomRatio](../../aspose.medical.dicom.tags/tag/digitalzoomratio) | (0016,0044) VR=DS VM=1 Digital Zoom Ratio. |
| static readonly [DigitizingDeviceTransportDirection](../../aspose.medical.dicom.tags/tag/digitizingdevicetransportdirection) | (0018,2020) VR=CS VM=1 Digitizing Device Transport Direction. |
| static readonly [DimensionDescriptionLabel](../../aspose.medical.dicom.tags/tag/dimensiondescriptionlabel) | (0020,9421) VR=LO VM=1 Dimension Description Label. |
| static readonly [DimensionIndexPointer](../../aspose.medical.dicom.tags/tag/dimensionindexpointer) | (0020,9165) VR=AT VM=1 Dimension Index Pointer. |
| static readonly [DimensionIndexPrivateCreator](../../aspose.medical.dicom.tags/tag/dimensionindexprivatecreator) | (0020,9213) VR=LO VM=1 Dimension Index Private Creator. |
| static readonly [DimensionIndexSequence](../../aspose.medical.dicom.tags/tag/dimensionindexsequence) | (0020,9222) VR=SQ VM=1 Dimension Index Sequence. |
| static readonly [DimensionIndexValues](../../aspose.medical.dicom.tags/tag/dimensionindexvalues) | (0020,9157) VR=UL VM=1-n Dimension Index Values. |
| static readonly [DimensionOrganizationSequence](../../aspose.medical.dicom.tags/tag/dimensionorganizationsequence) | (0020,9221) VR=SQ VM=1 Dimension Organization Sequence. |
| static readonly [DimensionOrganizationType](../../aspose.medical.dicom.tags/tag/dimensionorganizationtype) | (0020,9311) VR=CS VM=1 Dimension Organization Type. |
| static readonly [DimensionOrganizationUID](../../aspose.medical.dicom.tags/tag/dimensionorganizationuid) | (0020,9164) VR=UI VM=1 Dimension Organization UID. |
| static readonly [DirectoryRecordSequence](../../aspose.medical.dicom.tags/tag/directoryrecordsequence) | (0004,1220) VR=SQ VM=1 Directory Record Sequence. |
| static readonly [DirectoryRecordType](../../aspose.medical.dicom.tags/tag/directoryrecordtype) | (0004,1430) VR=CS VM=1 Directory Record Type. |
| static readonly [DirectSegmentReferenceSequence](../../aspose.medical.dicom.tags/tag/directsegmentreferencesequence) | (3010,0023) VR=SQ VM=1 Direct Segment Reference Sequence. |
| static readonly [DischargeDateRETIRED](../../aspose.medical.dicom.tags/tag/dischargedateretired) | (0038,0030) VR=DA VM=1 Discharge Date (RETIRED). |
| static readonly [DischargeDiagnosisCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/dischargediagnosiscodesequenceretired) | (0038,0044) VR=SQ VM=1 Discharge Diagnosis Code Sequence (RETIRED). |
| static readonly [DischargeDiagnosisDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/dischargediagnosisdescriptionretired) | (0038,0040) VR=LO VM=1 Discharge Diagnosis Description (RETIRED). |
| static readonly [DischargeTimeRETIRED](../../aspose.medical.dicom.tags/tag/dischargetimeretired) | (0038,0032) VR=TM VM=1 Discharge Time (RETIRED). |
| static readonly [DisplacementMatrix](../../aspose.medical.dicom.tags/tag/displacementmatrix) | (300A,079B) VR=FD VM=16 Displacement Matrix. |
| static readonly [DisplacementReferenceLabel](../../aspose.medical.dicom.tags/tag/displacementreferencelabel) | (300A,079A) VR=LO VM=1 Displacement Reference Label. |
| static readonly [DisplacementReferenceLocationCodeSequence](../../aspose.medical.dicom.tags/tag/displacementreferencelocationcodesequence) | (300A,079D) VR=SQ VM=1 Displacement Reference Location Code Sequence. |
| static readonly [DisplayCalibrationResultSequence](../../aspose.medical.dicom.tags/tag/displaycalibrationresultsequence) | (0028,7016) VR=SQ VM=1 Display Calibration Result Sequence. |
| static readonly [DisplayDeviceTypeCodeSequence](../../aspose.medical.dicom.tags/tag/displaydevicetypecodesequence) | (0028,7022) VR=SQ VM=1 Display Device Type Code Sequence. |
| static readonly [DisplayedAreaBottomRightHandCorner](../../aspose.medical.dicom.tags/tag/displayedareabottomrighthandcorner) | (0070,0053) VR=SL VM=2 Displayed Area Bottom Right Hand Corner. |
| static readonly [DisplayedAreaBottomRightHandCornerTrialRETIRED](../../aspose.medical.dicom.tags/tag/displayedareabottomrighthandcornertrialretired) | (0070,0051) VR=US VM=2 Displayed Area Bottom Right Hand Corner (Trial) (RETIRED). |
| static readonly [DisplayedAreaSelectionSequence](../../aspose.medical.dicom.tags/tag/displayedareaselectionsequence) | (0070,005A) VR=SQ VM=1 Displayed Area Selection Sequence. |
| static readonly [DisplayedAreaTopLeftHandCorner](../../aspose.medical.dicom.tags/tag/displayedareatoplefthandcorner) | (0070,0052) VR=SL VM=2 Displayed Area Top Left Hand Corner. |
| static readonly [DisplayedAreaTopLeftHandCornerTrialRETIRED](../../aspose.medical.dicom.tags/tag/displayedareatoplefthandcornertrialretired) | (0070,0050) VR=US VM=2 Displayed Area Top Left Hand Corner (Trial) (RETIRED). |
| static readonly [DisplayedWaveformSegmentSequence](../../aspose.medical.dicom.tags/tag/displayedwaveformsegmentsequence) | (0040,B035) VR=SQ VM=1 Displayed Waveform Segment Sequence. |
| static readonly [DisplayedZValue](../../aspose.medical.dicom.tags/tag/displayedzvalue) | (0018,2046) VR=FL VM=1 Displayed Z Value. |
| static readonly [DisplayEnvironmentSpatialPosition](../../aspose.medical.dicom.tags/tag/displayenvironmentspatialposition) | (0072,0108) VR=FD VM=4 Display Environment Spatial Position. |
| static readonly [DisplayFilterPercentage](../../aspose.medical.dicom.tags/tag/displayfilterpercentage) | (0028,9411) VR=FL VM=1 Display Filter Percentage. |
| static readonly [DisplayFormatRETIRED](../../aspose.medical.dicom.tags/tag/displayformatretired) | (0000,5110) VR=LT VM=1 Display Format (RETIRED). |
| static readonly [DisplayFunctionType](../../aspose.medical.dicom.tags/tag/displayfunctiontype) | (0028,7019) VR=CS VM=1 Display Function Type. |
| static readonly [DisplaySetHorizontalJustification](../../aspose.medical.dicom.tags/tag/displaysethorizontaljustification) | (0072,0717) VR=CS VM=1 Display Set Horizontal Justification. |
| static readonly [DisplaySetLabel](../../aspose.medical.dicom.tags/tag/displaysetlabel) | (0072,0203) VR=LO VM=1 Display Set Label. |
| static readonly [DisplaySetNumber](../../aspose.medical.dicom.tags/tag/displaysetnumber) | (0072,0202) VR=US VM=1 Display Set Number. |
| static readonly [DisplaySetPatientOrientation](../../aspose.medical.dicom.tags/tag/displaysetpatientorientation) | (0072,0700) VR=CS VM=2 Display Set Patient Orientation. |
| static readonly [DisplaySetPresentationGroup](../../aspose.medical.dicom.tags/tag/displaysetpresentationgroup) | (0072,0204) VR=US VM=1 Display Set Presentation Group. |
| static readonly [DisplaySetPresentationGroupDescription](../../aspose.medical.dicom.tags/tag/displaysetpresentationgroupdescription) | (0072,0206) VR=LO VM=1 Display Set Presentation Group Description. |
| static readonly [DisplaySetScrollingGroup](../../aspose.medical.dicom.tags/tag/displaysetscrollinggroup) | (0072,0212) VR=US VM=2-n Display Set Scrolling Group. |
| static readonly [DisplaySetsSequence](../../aspose.medical.dicom.tags/tag/displaysetssequence) | (0072,0200) VR=SQ VM=1 Display Sets Sequence. |
| static readonly [DisplaySetVerticalJustification](../../aspose.medical.dicom.tags/tag/displaysetverticaljustification) | (0072,0718) VR=CS VM=1 Display Set Vertical Justification. |
| static readonly [DisplayShadingFlag](../../aspose.medical.dicom.tags/tag/displayshadingflag) | (003A,0246) VR=CS VM=1 Display Shading Flag. |
| static readonly [DisplaySubsystemConfigurationSequence](../../aspose.medical.dicom.tags/tag/displaysubsystemconfigurationsequence) | (0028,700A) VR=SQ VM=1 Display Subsystem Configuration Sequence. |
| static readonly [DisplaySubsystemDescription](../../aspose.medical.dicom.tags/tag/displaysubsystemdescription) | (0028,7005) VR=LO VM=1 Display Subsystem Description. |
| static readonly [DisplaySubsystemID](../../aspose.medical.dicom.tags/tag/displaysubsystemid) | (0028,7003) VR=US VM=1 Display Subsystem ID. |
| static readonly [DisplaySubsystemName](../../aspose.medical.dicom.tags/tag/displaysubsystemname) | (0028,7004) VR=SH VM=1 Display Subsystem Name. |
| static readonly [DisplaySubsystemQAResultsSequence](../../aspose.medical.dicom.tags/tag/displaysubsystemqaresultssequence) | (0028,7010) VR=SQ VM=1 Display Subsystem QA Results Sequence. |
| static readonly [DisplaySubsystemSequence](../../aspose.medical.dicom.tags/tag/displaysubsystemsequence) | (0028,7023) VR=SQ VM=1 Display Subsystem Sequence. |
| static readonly [DisplayWindowLabelVector](../../aspose.medical.dicom.tags/tag/displaywindowlabelvector) | (0018,2006) VR=SH VM=1-n Display Window Label Vector. |
| static readonly [DistalDepth](../../aspose.medical.dicom.tags/tag/distaldepth) | (300A,0502) VR=FL VM=1 Distal Depth. |
| static readonly [DistalDepthFraction](../../aspose.medical.dicom.tags/tag/distaldepthfraction) | (300A,0501) VR=FL VM=1 Distal Depth Fraction. |
| static readonly [DistanceBetweenBscanSlabs](../../aspose.medical.dicom.tags/tag/distancebetweenbscanslabs) | (0022,1644) VR=FL VM=1 Distance Between B-scan Slabs. |
| static readonly [DistanceBetweenFocalPlanes](../../aspose.medical.dicom.tags/tag/distancebetweenfocalplanes) | (0048,0014) VR=FL VM=1 Distance Between Focal Planes. |
| static readonly [DistanceBetweenTurnsRETIRED](../../aspose.medical.dicom.tags/tag/distancebetweenturnsretired) | (0014,6033) VR=DS VM=1-n Distance Between Turns (RETIRED). |
| static readonly [DistanceObjectToTableTop](../../aspose.medical.dicom.tags/tag/distanceobjecttotabletop) | (0018,9403) VR=FL VM=1 Distance Object to Table Top. |
| static readonly [DistancePupillaryDistance](../../aspose.medical.dicom.tags/tag/distancepupillarydistance) | (0046,0060) VR=FD VM=1 Distance Pupillary Distance. |
| static readonly [DistanceReceptorPlaneToDetectorHousing](../../aspose.medical.dicom.tags/tag/distancereceptorplanetodetectorhousing) | (0018,9426) VR=FL VM=1 Distance Receptor Plane to Detector Housing. |
| static readonly [DistanceSourceToDataCollectionCenter](../../aspose.medical.dicom.tags/tag/distancesourcetodatacollectioncenter) | (0018,9335) VR=FD VM=1 Distance Source to Data Collection Center. |
| static readonly [DistanceSourceToDetector](../../aspose.medical.dicom.tags/tag/distancesourcetodetector) | (0018,1110) VR=DS VM=1 Distance Source to Detector. |
| static readonly [DistanceSourceToEntrance](../../aspose.medical.dicom.tags/tag/distancesourcetoentrance) | (0040,0306) VR=DS VM=1 Distance Source to Entrance. |
| static readonly [DistanceSourceToIsocenter](../../aspose.medical.dicom.tags/tag/distancesourcetoisocenter) | (0018,9402) VR=FL VM=1 Distance Source to Isocenter. |
| static readonly [DistanceSourceToPatient](../../aspose.medical.dicom.tags/tag/distancesourcetopatient) | (0018,1111) VR=DS VM=1 Distance Source to Patient. |
| static readonly [DistanceSourceToSupportRETIRED](../../aspose.medical.dicom.tags/tag/distancesourcetosupportretired) | (0040,0307) VR=DS VM=1 Distance Source to Support (RETIRED). |
| static readonly [DistributionAddressRETIRED](../../aspose.medical.dicom.tags/tag/distributionaddressretired) | (4008,011A) VR=LO VM=1 Distribution Address (RETIRED). |
| static readonly [DistributionNameRETIRED](../../aspose.medical.dicom.tags/tag/distributionnameretired) | (4008,0119) VR=PN VM=1 Distribution Name (RETIRED). |
| static readonly [DistributionType](../../aspose.medical.dicom.tags/tag/distributiontype) | (0012,0084) VR=CS VM=1 Distribution Type. |
| static readonly [DLPNotificationTrigger](../../aspose.medical.dicom.tags/tag/dlpnotificationtrigger) | (0018,9943) VR=FD VM=1 DLP Notification Trigger. |
| static readonly [DocumentAuthorIdentifierCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/documentauthoridentifiercodesequencetrialretired) | (0040,A068) VR=SQ VM=1 Document Author Identifier Code Sequence (Trial) (RETIRED). |
| static readonly [DocumentAuthorTrialRETIRED](../../aspose.medical.dicom.tags/tag/documentauthortrialretired) | (0040,A067) VR=PN VM=1 Document Author (Trial) (RETIRED). |
| static readonly [DocumentClassCodeSequence](../../aspose.medical.dicom.tags/tag/documentclasscodesequence) | (0040,E008) VR=SQ VM=1 Document Class Code Sequence. |
| static readonly [DocumentIdentifierCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/documentidentifiercodesequencetrialretired) | (0040,A066) VR=SQ VM=1 Document Identifier Code Sequence (Trial) (RETIRED). |
| static readonly [DocumentingObserverIdentifierCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/documentingobserveridentifiercodesequencetrialretired) | (0040,A076) VR=SQ VM=1 Documenting Observer Identifier Code Sequence (Trial) (RETIRED). |
| static readonly [DocumentingOrganizationIdentifierCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/documentingorganizationidentifiercodesequencetrialretired) | (0040,A028) VR=SQ VM=1 Documenting Organization Identifier Code Sequence (Trial) (RETIRED). |
| static readonly [DocumentTitle](../../aspose.medical.dicom.tags/tag/documenttitle) | (0042,0010) VR=ST VM=1 Document Title. |
| static readonly [DopplerCorrectionAngle](../../aspose.medical.dicom.tags/tag/dopplercorrectionangle) | (0018,6034) VR=FD VM=1 Doppler Correction Angle. |
| static readonly [DopplerSampleVolumeXPosition](../../aspose.medical.dicom.tags/tag/dopplersamplevolumexposition) | (0018,6039) VR=SL VM=1 Doppler Sample Volume X Position. |
| static readonly [DopplerSampleVolumeXPositionRetiredRETIRED](../../aspose.medical.dicom.tags/tag/dopplersamplevolumexpositionretiredretired) | (0018,6038) VR=UL VM=1 Doppler Sample Volume X Position (Retired) (RETIRED). |
| static readonly [DopplerSampleVolumeYPosition](../../aspose.medical.dicom.tags/tag/dopplersamplevolumeyposition) | (0018,603B) VR=SL VM=1 Doppler Sample Volume Y Position. |
| static readonly [DopplerSampleVolumeYPositionRetiredRETIRED](../../aspose.medical.dicom.tags/tag/dopplersamplevolumeypositionretiredretired) | (0018,603A) VR=UL VM=1 Doppler Sample Volume Y Position (Retired) (RETIRED). |
| static readonly [DoseCalibrationConditionsSequence](../../aspose.medical.dicom.tags/tag/dosecalibrationconditionssequence) | (300C,0120) VR=SQ VM=1 Dose Calibration Conditions Sequence. |
| static readonly [DoseCalibrationConditionsVerifiedFlag](../../aspose.medical.dicom.tags/tag/dosecalibrationconditionsverifiedflag) | (300C,0123) VR=CS VM=1 Dose Calibration Conditions Verified Flag. |
| static readonly [DoseCalibrationFactor](../../aspose.medical.dicom.tags/tag/dosecalibrationfactor) | (0054,1322) VR=DS VM=1 Dose Calibration Factor. |
| static readonly [DoseComment](../../aspose.medical.dicom.tags/tag/dosecomment) | (3004,0006) VR=LO VM=1 Dose Comment. |
| static readonly [DoseGridScaling](../../aspose.medical.dicom.tags/tag/dosegridscaling) | (3004,000E) VR=DS VM=1 Dose Grid Scaling. |
| static readonly [DoseMeasurementDeviceCodeSequence](../../aspose.medical.dicom.tags/tag/dosemeasurementdevicecodesequence) | (300A,0774) VR=SQ VM=1 Dose Measurement Device Code Sequence. |
| static readonly [DoseModeName](../../aspose.medical.dicom.tags/tag/dosemodename) | (0018,11B1) VR=LO VM=1 Dose Mode Name. |
| static readonly [DoseRateDelivered](../../aspose.medical.dicom.tags/tag/doseratedelivered) | (3008,0048) VR=DS VM=1 Dose Rate Delivered. |
| static readonly [DoseRateSet](../../aspose.medical.dicom.tags/tag/doserateset) | (300A,0115) VR=DS VM=1 Dose Rate Set. |
| static readonly [DoseReferenceDescription](../../aspose.medical.dicom.tags/tag/dosereferencedescription) | (300A,0016) VR=LO VM=1 Dose Reference Description. |
| static readonly [DoseReferenceNumber](../../aspose.medical.dicom.tags/tag/dosereferencenumber) | (300A,0012) VR=IS VM=1 Dose Reference Number. |
| static readonly [DoseReferencePointCoordinates](../../aspose.medical.dicom.tags/tag/dosereferencepointcoordinates) | (300A,0018) VR=DS VM=3 Dose Reference Point Coordinates. |
| static readonly [DoseReferenceSequence](../../aspose.medical.dicom.tags/tag/dosereferencesequence) | (300A,0010) VR=SQ VM=1 Dose Reference Sequence. |
| static readonly [DoseReferenceStructureType](../../aspose.medical.dicom.tags/tag/dosereferencestructuretype) | (300A,0014) VR=CS VM=1 Dose Reference Structure Type. |
| static readonly [DoseReferenceType](../../aspose.medical.dicom.tags/tag/dosereferencetype) | (300A,0020) VR=CS VM=1 Dose Reference Type. |
| static readonly [DoseReferenceUID](../../aspose.medical.dicom.tags/tag/dosereferenceuid) | (300A,0013) VR=UI VM=1 Dose Reference UID. |
| static readonly [DoseSummationType](../../aspose.medical.dicom.tags/tag/dosesummationtype) | (3004,000A) VR=CS VM=1 Dose Summation Type. |
| static readonly [DoseType](../../aspose.medical.dicom.tags/tag/dosetype) | (3004,0004) VR=CS VM=1 Dose Type. |
| static readonly [DoseUnits](../../aspose.medical.dicom.tags/tag/doseunits) | (3004,0002) VR=CS VM=1 Dose Units. |
| static readonly [DoseValue](../../aspose.medical.dicom.tags/tag/dosevalue) | (3004,0012) VR=DS VM=1 Dose Value. |
| static readonly [DoseValueInterpretation](../../aspose.medical.dicom.tags/tag/dosevalueinterpretation) | (300A,068B) VR=CS VM=1 Dose Value Interpretation. |
| static readonly [DoseValuePurpose](../../aspose.medical.dicom.tags/tag/dosevaluepurpose) | (300A,061D) VR=CS VM=1-n Dose Value Purpose. |
| static readonly [DoseValuesSequence](../../aspose.medical.dicom.tags/tag/dosevaluessequence) | (300A,061C) VR=SQ VM=1 Dose Values Sequence. |
| static readonly [DosimetricObjectiveEvaluationScope](../../aspose.medical.dicom.tags/tag/dosimetricobjectiveevaluationscope) | (3010,0063) VR=CS VM=1 Dosimetric Objective Evaluation Scope. |
| static readonly [DosimetricObjectiveParameterSequence](../../aspose.medical.dicom.tags/tag/dosimetricobjectiveparametersequence) | (3010,0070) VR=SQ VM=1 Dosimetric Objective Parameter Sequence. |
| static readonly [DosimetricObjectivePurpose](../../aspose.medical.dicom.tags/tag/dosimetricobjectivepurpose) | (3010,0075) VR=CS VM=1 Dosimetric Objective Purpose. |
| static readonly [DosimetricObjectiveSequence](../../aspose.medical.dicom.tags/tag/dosimetricobjectivesequence) | (3010,006C) VR=SQ VM=1 Dosimetric Objective Sequence. |
| static readonly [DosimetricObjectiveTypeCodeSequence](../../aspose.medical.dicom.tags/tag/dosimetricobjectivetypecodesequence) | (3010,006D) VR=SQ VM=1 Dosimetric Objective Type Code Sequence. |
| static readonly [DosimetricObjectiveUID](../../aspose.medical.dicom.tags/tag/dosimetricobjectiveuid) | (3010,006E) VR=UI VM=1 Dosimetric Objective UID. |
| static readonly [DosimetricObjectiveWeight](../../aspose.medical.dicom.tags/tag/dosimetricobjectiveweight) | (3010,0074) VR=FD VM=1 Dosimetric Objective Weight. |
| static readonly [DoubleExposureFieldDelta](../../aspose.medical.dicom.tags/tag/doubleexposurefielddelta) | (0074,133A) VR=FD VM=4 Double Exposure Field Delta. |
| static readonly [DoubleExposureFieldDeltaTrialRETIRED](../../aspose.medical.dicom.tags/tag/doubleexposurefielddeltatrialretired) | (0074,103A) VR=DS VM=4 Double Exposure Field Delta (Trial) (RETIRED). |
| static readonly [DoubleExposureFlag](../../aspose.medical.dicom.tags/tag/doubleexposureflag) | (0074,1034) VR=CS VM=1 Double Exposure Flag. |
| static readonly [DoubleExposureMeterset](../../aspose.medical.dicom.tags/tag/doubleexposuremeterset) | (0074,1338) VR=FD VM=1 Double Exposure Meterset. |
| static readonly [DoubleExposureMetersetTrialRETIRED](../../aspose.medical.dicom.tags/tag/doubleexposuremetersettrialretired) | (0074,1038) VR=DS VM=1 Double Exposure Meterset (Trial) (RETIRED). |
| static readonly [DoubleExposureOrdering](../../aspose.medical.dicom.tags/tag/doubleexposureordering) | (0074,1036) VR=CS VM=1 Double Exposure Ordering. |
| static readonly [DoubleFloatPixelData](../../aspose.medical.dicom.tags/tag/doublefloatpixeldata) | (7FE0,0009) VR=OD VM=1 Double Float Pixel Data. |
| static readonly [DoubleFloatPixelPaddingRangeLimit](../../aspose.medical.dicom.tags/tag/doublefloatpixelpaddingrangelimit) | (0028,0125) VR=FD VM=1 Double Float Pixel Padding Range Limit. |
| static readonly [DoubleFloatPixelPaddingValue](../../aspose.medical.dicom.tags/tag/doublefloatpixelpaddingvalue) | (0028,0123) VR=FD VM=1 Double Float Pixel Padding Value. |
| static readonly [DoubleFloatRealWorldValueFirstValueMapped](../../aspose.medical.dicom.tags/tag/doublefloatrealworldvaluefirstvaluemapped) | (0040,9214) VR=FD VM=1 Double Float Real World Value First Value Mapped. |
| static readonly [DoubleFloatRealWorldValueLastValueMapped](../../aspose.medical.dicom.tags/tag/doublefloatrealworldvaluelastvaluemapped) | (0040,9213) VR=FD VM=1 Double Float Real World Value Last Value Mapped. |
| static readonly [DoublePointCoordinatesData](../../aspose.medical.dicom.tags/tag/doublepointcoordinatesdata) | (0066,0022) VR=OD VM=1 Double Point Coordinates Data. |
| static readonly [DriveProbeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/driveprobesequenceretired) | (0014,4083) VR=SQ VM=1 Drive Probe Sequence (RETIRED). |
| static readonly [DriveTypeRETIRED](../../aspose.medical.dicom.tags/tag/drivetyperetired) | (0014,4081) VR=CS VM=1 Drive Type (RETIRED). |
| static readonly [DVHData](../../aspose.medical.dicom.tags/tag/dvhdata) | (3004,0058) VR=DS VM=2-2n DVH Data. |
| static readonly [DVHDoseScaling](../../aspose.medical.dicom.tags/tag/dvhdosescaling) | (3004,0052) VR=DS VM=1 DVH Dose Scaling. |
| static readonly [DVHMaximumDose](../../aspose.medical.dicom.tags/tag/dvhmaximumdose) | (3004,0072) VR=DS VM=1 DVH Maximum Dose. |
| static readonly [DVHMeanDose](../../aspose.medical.dicom.tags/tag/dvhmeandose) | (3004,0074) VR=DS VM=1 DVH Mean Dose. |
| static readonly [DVHMinimumDose](../../aspose.medical.dicom.tags/tag/dvhminimumdose) | (3004,0070) VR=DS VM=1 DVH Minimum Dose. |
| static readonly [DVHNormalizationDoseValue](../../aspose.medical.dicom.tags/tag/dvhnormalizationdosevalue) | (3004,0042) VR=DS VM=1 DVH Normalization Dose Value. |
| static readonly [DVHNormalizationPoint](../../aspose.medical.dicom.tags/tag/dvhnormalizationpoint) | (3004,0040) VR=DS VM=3 DVH Normalization Point. |
| static readonly [DVHNumberOfBins](../../aspose.medical.dicom.tags/tag/dvhnumberofbins) | (3004,0056) VR=IS VM=1 DVH Number of Bins. |
| static readonly [DVHReferencedROISequence](../../aspose.medical.dicom.tags/tag/dvhreferencedroisequence) | (3004,0060) VR=SQ VM=1 DVH Referenced ROI Sequence. |
| static readonly [DVHROIContributionType](../../aspose.medical.dicom.tags/tag/dvhroicontributiontype) | (3004,0062) VR=CS VM=1 DVH ROI Contribution Type. |
| static readonly [DVHSequence](../../aspose.medical.dicom.tags/tag/dvhsequence) | (3004,0050) VR=SQ VM=1 DVH Sequence. |
| static readonly [DVHType](../../aspose.medical.dicom.tags/tag/dvhtype) | (3004,0001) VR=CS VM=1 DVH Type. |
| static readonly [DVHVolumeUnits](../../aspose.medical.dicom.tags/tag/dvhvolumeunits) | (3004,0054) VR=CS VM=1 DVH Volume Units. |
| static readonly [DynamicRangeRETIRED](../../aspose.medical.dicom.tags/tag/dynamicrangeretired) | (0018,5030) VR=DS VM=1 Dynamic Range (RETIRED). |
| static readonly [EchoNumbers](../../aspose.medical.dicom.tags/tag/echonumbers) | (0018,0086) VR=IS VM=1-n Echo Number(s). |
| static readonly [EchoPeakPosition](../../aspose.medical.dicom.tags/tag/echopeakposition) | (0018,9298) VR=IS VM=1 Echo Peak Position. |
| static readonly [EchoPlanarPulseSequence](../../aspose.medical.dicom.tags/tag/echoplanarpulsesequence) | (0018,9018) VR=CS VM=1 Echo Planar Pulse Sequence. |
| static readonly [EchoPulseSequence](../../aspose.medical.dicom.tags/tag/echopulsesequence) | (0018,9008) VR=CS VM=1 Echo Pulse Sequence. |
| static readonly [EchoTime](../../aspose.medical.dicom.tags/tag/echotime) | (0018,0081) VR=DS VM=1 Echo Time. |
| static readonly [EchoTrainLength](../../aspose.medical.dicom.tags/tag/echotrainlength) | (0018,0091) VR=IS VM=1 Echo Train Length. |
| static readonly [EdgePointIndexListRETIRED](../../aspose.medical.dicom.tags/tag/edgepointindexlistretired) | (0066,0024) VR=OW VM=1 Edge Point Index List (RETIRED). |
| static readonly [EffectiveBinEnergy](../../aspose.medical.dicom.tags/tag/effectivebinenergy) | (0018,936E) VR=DS VM=1 Effective Bin Energy. |
| static readonly [EffectiveDateTime](../../aspose.medical.dicom.tags/tag/effectivedatetime) | (0068,6226) VR=DT VM=1 Effective DateTime. |
| static readonly [EffectiveDoseCalculationMethodCategoryCodeSequence](../../aspose.medical.dicom.tags/tag/effectivedosecalculationmethodcategorycodesequence) | (3010,0003) VR=SQ VM=1 Effective Dose Calculation Method Category Code Sequence. |
| static readonly [EffectiveDoseCalculationMethodCodeSequence](../../aspose.medical.dicom.tags/tag/effectivedosecalculationmethodcodesequence) | (3010,0004) VR=SQ VM=1 Effective Dose Calculation Method Code Sequence. |
| static readonly [EffectiveDoseCalculationMethodDescription](../../aspose.medical.dicom.tags/tag/effectivedosecalculationmethoddescription) | (3010,0005) VR=LO VM=1 Effective Dose Calculation Method Description. |
| static readonly [EffectiveDuration](../../aspose.medical.dicom.tags/tag/effectiveduration) | (0018,0072) VR=DS VM=1 Effective Duration. |
| static readonly [EffectiveEchoTime](../../aspose.medical.dicom.tags/tag/effectiveechotime) | (0018,9082) VR=FD VM=1 Effective Echo Time. |
| static readonly [EffectiveRefractiveIndex](../../aspose.medical.dicom.tags/tag/effectiverefractiveindex) | (0052,0004) VR=FD VM=1 Effective Refractive Index. |
| static readonly [EffectiveWedgeAngle](../../aspose.medical.dicom.tags/tag/effectivewedgeangle) | (300A,00DE) VR=DS VM=1 Effective Wedge Angle. |
| static readonly [ElectromagneticClassificationOfInspectionSurfaceRETIRED](../../aspose.medical.dicom.tags/tag/electromagneticclassificationofinspectionsurfaceretired) | (0014,604A) VR=CS VM=1-n Electromagnetic Classification of Inspection Surface (RETIRED). |
| static readonly [ElementDimensionARETIRED](../../aspose.medical.dicom.tags/tag/elementdimensionaretired) | (0014,4014) VR=DS VM=1 Element Dimension A (RETIRED). |
| static readonly [ElementDimensionBRETIRED](../../aspose.medical.dicom.tags/tag/elementdimensionbretired) | (0014,4015) VR=DS VM=1 Element Dimension B (RETIRED). |
| static readonly [ElementPitchARETIRED](../../aspose.medical.dicom.tags/tag/elementpitcharetired) | (0014,4016) VR=DS VM=1 Element Pitch A (RETIRED). |
| static readonly [ElementPitchBRETIRED](../../aspose.medical.dicom.tags/tag/elementpitchbretired) | (0014,401D) VR=DS VM=1 Element Pitch B (RETIRED). |
| static readonly [ElementShapeRETIRED](../../aspose.medical.dicom.tags/tag/elementshaperetired) | (0014,4013) VR=CS VM=1 Element Shape (RETIRED). |
| static readonly [EmissivityOfInspectionSurfaceRETIRED](../../aspose.medical.dicom.tags/tag/emissivityofinspectionsurfaceretired) | (0014,6049) VR=DS VM=1 Emissivity of Inspection Surface (RETIRED). |
| static readonly [EmitterColorTemperature](../../aspose.medical.dicom.tags/tag/emittercolortemperature) | (0016,1002) VR=DS VM=1 Emitter Color Temperature. |
| static readonly [EmmetropicMagnification](../../aspose.medical.dicom.tags/tag/emmetropicmagnification) | (0022,000A) VR=FL VM=1 Emmetropic Magnification. |
| static readonly [EmptyImageBoxCIELabValue](../../aspose.medical.dicom.tags/tag/emptyimageboxcielabvalue) | (0072,0421) VR=US VM=3 Empty Image Box CIELab Value. |
| static readonly [EmptyImageDensity](../../aspose.medical.dicom.tags/tag/emptyimagedensity) | (2010,0110) VR=CS VM=1 Empty Image Density. |
| static readonly [EmptyValueMatchingSequence](../../aspose.medical.dicom.tags/tag/emptyvaluematchingsequence) | (0008,0412) VR=SQ VM=1 Empty Value Matching Sequence. |
| static readonly [EncapsulatedDocument](../../aspose.medical.dicom.tags/tag/encapsulateddocument) | (0042,0011) VR=OB VM=1 Encapsulated Document. |
| static readonly [EncapsulatedDocumentLength](../../aspose.medical.dicom.tags/tag/encapsulateddocumentlength) | (0042,0015) VR=UL VM=1 Encapsulated Document Length. |
| static readonly [EncapsulatedPixelDataValueTotalLength](../../aspose.medical.dicom.tags/tag/encapsulatedpixeldatavaluetotallength) | (7FE0,0003) VR=UV VM=1 Encapsulated Pixel Data Value Total Length. |
| static readonly [EncryptedAttributesSequence](../../aspose.medical.dicom.tags/tag/encryptedattributessequence) | (0400,0500) VR=SQ VM=1 Encrypted Attributes Sequence. |
| static readonly [EncryptedContent](../../aspose.medical.dicom.tags/tag/encryptedcontent) | (0400,0520) VR=OB VM=1 Encrypted Content. |
| static readonly [EncryptedContentTransferSyntaxUID](../../aspose.medical.dicom.tags/tag/encryptedcontenttransfersyntaxuid) | (0400,0510) VR=UI VM=1 Encrypted Content Transfer Syntax UID. |
| static readonly [EndAcquisitionDateTime](../../aspose.medical.dicom.tags/tag/endacquisitiondatetime) | (0018,9517) VR=DT VM=1 End Acquisition DateTime. |
| static readonly [EndCumulativeMetersetWeight](../../aspose.medical.dicom.tags/tag/endcumulativemetersetweight) | (300C,0009) VR=DS VM=1 End Cumulative Meterset Weight. |
| static readonly [EndCumulativeTimeWeight](../../aspose.medical.dicom.tags/tag/endcumulativetimeweight) | (0074,1408) VR=DS VM=1 End Cumulative Time Weight. |
| static readonly [EndingRespiratoryAmplitude](../../aspose.medical.dicom.tags/tag/endingrespiratoryamplitude) | (0020,9248) VR=FL VM=1 Ending Respiratory Amplitude. |
| static readonly [EndingRespiratoryPhase](../../aspose.medical.dicom.tags/tag/endingrespiratoryphase) | (0020,9249) VR=CS VM=1 Ending Respiratory Phase. |
| static readonly [EndMessageIDRETIRED](../../aspose.medical.dicom.tags/tag/endmessageidretired) | (0000,5020) VR=SH VM=1 End Message ID (RETIRED). |
| static readonly [EndMeterset](../../aspose.medical.dicom.tags/tag/endmeterset) | (3008,007A) VR=DS VM=1 End Meterset. |
| static readonly [EnergyDerivationCodeSequence](../../aspose.medical.dicom.tags/tag/energyderivationcodesequence) | (3002,0133) VR=SQ VM=1 Energy Derivation Code Sequence. |
| static readonly [EnergyUnitCodeSequence](../../aspose.medical.dicom.tags/tag/energyunitcodesequence) | (300A,0684) VR=SQ VM=1 Energy Unit Code Sequence. |
| static readonly [EnergyWeightingFactor](../../aspose.medical.dicom.tags/tag/energyweightingfactor) | (0018,9353) VR=FL VM=1 Energy Weighting Factor. |
| static readonly [EnergyWindowCenterlineRETIRED](../../aspose.medical.dicom.tags/tag/energywindowcenterlineretired) | (0018,0032) VR=DS VM=1 Energy Window Centerline (RETIRED). |
| static readonly [EnergyWindowInformationSequence](../../aspose.medical.dicom.tags/tag/energywindowinformationsequence) | (0054,0012) VR=SQ VM=1 Energy Window Information Sequence. |
| static readonly [EnergyWindowLowerLimit](../../aspose.medical.dicom.tags/tag/energywindowlowerlimit) | (0054,0014) VR=DS VM=1 Energy Window Lower Limit. |
| static readonly [EnergyWindowName](../../aspose.medical.dicom.tags/tag/energywindowname) | (0054,0018) VR=SH VM=1 Energy Window Name. |
| static readonly [EnergyWindowNumber](../../aspose.medical.dicom.tags/tag/energywindownumber) | (0054,0308) VR=US VM=1 Energy Window Number. |
| static readonly [EnergyWindowRangeSequence](../../aspose.medical.dicom.tags/tag/energywindowrangesequence) | (0054,0013) VR=SQ VM=1 Energy Window Range Sequence. |
| static readonly [EnergyWindowTotalWidthRETIRED](../../aspose.medical.dicom.tags/tag/energywindowtotalwidthretired) | (0018,0033) VR=DS VM=1-n Energy Window Total Width (RETIRED). |
| static readonly [EnergyWindowUpperLimit](../../aspose.medical.dicom.tags/tag/energywindowupperlimit) | (0054,0015) VR=DS VM=1 Energy Window Upper Limit. |
| static readonly [EnergyWindowVector](../../aspose.medical.dicom.tags/tag/energywindowvector) | (0054,0010) VR=US VM=1-n Energy Window Vector. |
| static readonly [EnhancedPaletteColorLookupTableSequence](../../aspose.medical.dicom.tags/tag/enhancedpalettecolorlookuptablesequence) | (0028,140B) VR=SQ VM=1 Enhanced Palette Color Lookup Table Sequence. |
| static readonly [EnhancedRTBeamLimitingDeviceDefinitionFlag](../../aspose.medical.dicom.tags/tag/enhancedrtbeamlimitingdevicedefinitionflag) | (3008,00A3) VR=CS VM=1 Enhanced RT Beam Limiting Device Definition Flag. |
| static readonly [EnhancedRTBeamLimitingDeviceSequence](../../aspose.medical.dicom.tags/tag/enhancedrtbeamlimitingdevicesequence) | (3008,00A1) VR=SQ VM=1 Enhanced RT Beam Limiting Device Sequence. |
| static readonly [EnhancedRTBeamLimitingOpeningSequence](../../aspose.medical.dicom.tags/tag/enhancedrtbeamlimitingopeningsequence) | (3008,00A2) VR=SQ VM=1 Enhanced RT Beam Limiting Opening Sequence. |
| static readonly [EntityDescription](../../aspose.medical.dicom.tags/tag/entitydescription) | (3010,0037) VR=ST VM=1 Entity Description. |
| static readonly [EntityLabel](../../aspose.medical.dicom.tags/tag/entitylabel) | (3010,0035) VR=SH VM=1 Entity Label. |
| static readonly [EntityLongLabel](../../aspose.medical.dicom.tags/tag/entitylonglabel) | (3010,0038) VR=LO VM=1 Entity Long Label. |
| static readonly [EntityName](../../aspose.medical.dicom.tags/tag/entityname) | (3010,0036) VR=LO VM=1 Entity Name. |
| static readonly [EntranceDose](../../aspose.medical.dicom.tags/tag/entrancedose) | (0040,0302) VR=US VM=1 Entrance Dose. |
| static readonly [EntranceDoseDerivation](../../aspose.medical.dicom.tags/tag/entrancedosederivation) | (0040,8303) VR=CS VM=1 Entrance Dose Derivation. |
| static readonly [EntranceDoseInmGy](../../aspose.medical.dicom.tags/tag/entrancedoseinmgy) | (0040,8302) VR=DS VM=1 Entrance Dose in mGy. |
| static readonly [EnvironmentalConditionsRETIRED](../../aspose.medical.dicom.tags/tag/environmentalconditionsretired) | (0014,1040) VR=ST VM=1 Environmental Conditions (RETIRED). |
| static readonly [EquipmentAdministratorSequence](../../aspose.medical.dicom.tags/tag/equipmentadministratorsequence) | (0028,7000) VR=SQ VM=1 Equipment Administrator Sequence. |
| static readonly [EquipmentCoordinateSystemIdentification](../../aspose.medical.dicom.tags/tag/equipmentcoordinatesystemidentification) | (0028,9537) VR=CS VM=1 Equipment Coordinate System Identification. |
| static readonly [EquipmentFrameOfReferenceDescription](../../aspose.medical.dicom.tags/tag/equipmentframeofreferencedescription) | (300A,0676) VR=ST VM=1 Equipment Frame of Reference Description. |
| static readonly [EquipmentFrameOfReferenceUID](../../aspose.medical.dicom.tags/tag/equipmentframeofreferenceuid) | (300A,0675) VR=UI VM=1 Equipment Frame of Reference UID. |
| static readonly [EquipmentModality](../../aspose.medical.dicom.tags/tag/equipmentmodality) | (0008,0221) VR=CS VM=1 Equipment Modality. |
| static readonly [EquipmentReferencePointCodeSequence](../../aspose.medical.dicom.tags/tag/equipmentreferencepointcodesequence) | (300A,0678) VR=SQ VM=1 Equipment Reference Point Code Sequence. |
| static readonly [EquipmentReferencePointCoordinatesSequence](../../aspose.medical.dicom.tags/tag/equipmentreferencepointcoordinatessequence) | (300A,0677) VR=SQ VM=1 Equipment Reference Point Coordinates Sequence. |
| static readonly [EquivalentCDADocumentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/equivalentcdadocumentsequenceretired) | (0040,A090) VR=SQ VM=1 Equivalent CDA Document Sequence (RETIRED). |
| static readonly [EquivalentCodeSequence](../../aspose.medical.dicom.tags/tag/equivalentcodesequence) | (0008,0121) VR=SQ VM=1 Equivalent Code Sequence. |
| static readonly [EquivalentConceptualVolumeInstanceReferenceSequence](../../aspose.medical.dicom.tags/tag/equivalentconceptualvolumeinstancereferencesequence) | (3010,0009) VR=SQ VM=1 Equivalent Conceptual Volume Instance Reference Sequence. |
| static readonly [EquivalentConceptualVolumesSequence](../../aspose.medical.dicom.tags/tag/equivalentconceptualvolumessequence) | (3010,000A) VR=SQ VM=1 Equivalent Conceptual Volumes Sequence. |
| static readonly [EquivalentPupilRadius](../../aspose.medical.dicom.tags/tag/equivalentpupilradius) | (0046,0205) VR=FL VM=1 Equivalent Pupil Radius. |
| static readonly [EraseRETIRED](../../aspose.medical.dicom.tags/tag/eraseretired) | (0000,5190) VR=CS VM=1 Erase (RETIRED). |
| static readonly [ErrorComment](../../aspose.medical.dicom.tags/tag/errorcomment) | (0000,0902) VR=LO VM=1 Error Comment. |
| static readonly [ErrorID](../../aspose.medical.dicom.tags/tag/errorid) | (0000,0903) VR=US VM=1 Error ID. |
| static readonly [EscapeTripletRETIRED](../../aspose.medical.dicom.tags/tag/escapetripletretired) | (1000,xxx0) VR=US VM=3 Escape Triplet (RETIRED). |
| static readonly [EstimatedDoseSavingRETIRED](../../aspose.medical.dicom.tags/tag/estimateddosesavingretired) | (0018,9324) VR=FD VM=1 Estimated Dose Saving (RETIRED). |
| static readonly [EstimatedRadiographicMagnificationFactor](../../aspose.medical.dicom.tags/tag/estimatedradiographicmagnificationfactor) | (0018,1114) VR=DS VM=1 Estimated Radiographic Magnification Factor. |
| static readonly [EthicsCommitteeApprovalEffectivenessEndDate](../../aspose.medical.dicom.tags/tag/ethicscommitteeapprovaleffectivenessenddate) | (0012,0087) VR=DA VM=1 Ethics Committee Approval Effectiveness End Date. |
| static readonly [EthicsCommitteeApprovalEffectivenessStartDate](../../aspose.medical.dicom.tags/tag/ethicscommitteeapprovaleffectivenessstartdate) | (0012,0086) VR=DA VM=1 Ethics Committee Approval Effectiveness Start Date. |
| static readonly [EthnicGroup](../../aspose.medical.dicom.tags/tag/ethnicgroup) | (0010,2160) VR=SH VM=1 Ethnic Group. |
| static readonly [EthnicGroupCodeSequence](../../aspose.medical.dicom.tags/tag/ethnicgroupcodesequence) | (0010,2161) VR=SQ VM=1 Ethnic Group Code Sequence. |
| static readonly [EvaluationAttemptRETIRED](../../aspose.medical.dicom.tags/tag/evaluationattemptretired) | (0014,2008) VR=IS VM=1 Evaluation Attempt (RETIRED). |
| static readonly [EvaluatorNameRETIRED](../../aspose.medical.dicom.tags/tag/evaluatornameretired) | (0014,2006) VR=PN VM=1 Evaluator Name (RETIRED). |
| static readonly [EvaluatorNumberRETIRED](../../aspose.medical.dicom.tags/tag/evaluatornumberretired) | (0014,2004) VR=IS VM=1 Evaluator Number (RETIRED). |
| static readonly [EvaluatorSequenceRETIRED](../../aspose.medical.dicom.tags/tag/evaluatorsequenceretired) | (0014,2002) VR=SQ VM=1 Evaluator Sequence (RETIRED). |
| static readonly [EventCodeSequence](../../aspose.medical.dicom.tags/tag/eventcodesequence) | (0008,2135) VR=SQ VM=1 Event Code Sequence. |
| static readonly [EventElapsedTimes](../../aspose.medical.dicom.tags/tag/eventelapsedtimes) | (0008,2130) VR=DS VM=1-n Event Elapsed Time(s). |
| static readonly [EventTimeOffset](../../aspose.medical.dicom.tags/tag/eventtimeoffset) | (0008,2134) VR=FD VM=1 Event Time Offset. |
| static readonly [EventTimerNames](../../aspose.medical.dicom.tags/tag/eventtimernames) | (0008,2132) VR=LO VM=1-n Event Timer Name(s). |
| static readonly [EventTimerSequence](../../aspose.medical.dicom.tags/tag/eventtimersequence) | (0008,2133) VR=SQ VM=1 Event Timer Sequence. |
| static readonly [EventTypeID](../../aspose.medical.dicom.tags/tag/eventtypeid) | (0000,1002) VR=US VM=1 Event Type ID. |
| static readonly [ExaminedBodyThickness](../../aspose.medical.dicom.tags/tag/examinedbodythickness) | (0010,9431) VR=FL VM=1 Examined Body Thickness. |
| static readonly [ExcessiveFalseNegatives](../../aspose.medical.dicom.tags/tag/excessivefalsenegatives) | (0024,0052) VR=CS VM=1 Excessive False Negatives. |
| static readonly [ExcessiveFalseNegativesDataFlag](../../aspose.medical.dicom.tags/tag/excessivefalsenegativesdataflag) | (0024,0051) VR=CS VM=1 Excessive False Negatives Data Flag. |
| static readonly [ExcessiveFalsePositives](../../aspose.medical.dicom.tags/tag/excessivefalsepositives) | (0024,0062) VR=CS VM=1 Excessive False Positives. |
| static readonly [ExcessiveFalsePositivesDataFlag](../../aspose.medical.dicom.tags/tag/excessivefalsepositivesdataflag) | (0024,0061) VR=CS VM=1 Excessive False Positives Data Flag. |
| static readonly [ExcessiveFixationLosses](../../aspose.medical.dicom.tags/tag/excessivefixationlosses) | (0024,0040) VR=CS VM=1 Excessive Fixation Losses. |
| static readonly [ExcessiveFixationLossesDataFlag](../../aspose.medical.dicom.tags/tag/excessivefixationlossesdataflag) | (0024,0039) VR=CS VM=1 Excessive Fixation Losses Data Flag. |
| static readonly [ExcitationEnergy](../../aspose.medical.dicom.tags/tag/excitationenergy) | (0018,9823) VR=FD VM=1 Excitation Energy. |
| static readonly [ExcitationFrequencyRETIRED](../../aspose.medical.dicom.tags/tag/excitationfrequencyretired) | (0014,4024) VR=DS VM=1 Excitation Frequency (RETIRED). |
| static readonly [ExcitationPulseDuration](../../aspose.medical.dicom.tags/tag/excitationpulseduration) | (0018,9824) VR=FD VM=1 Excitation Pulse Duration. |
| static readonly [ExcitationSpectralWidth](../../aspose.medical.dicom.tags/tag/excitationspectralwidth) | (0018,9822) VR=FD VM=1 Excitation Spectral Width. |
| static readonly [ExcitationWavelength](../../aspose.medical.dicom.tags/tag/excitationwavelength) | (0018,9826) VR=FD VM=1 Excitation Wavelength. |
| static readonly [ExcitationWavelengthSequence](../../aspose.medical.dicom.tags/tag/excitationwavelengthsequence) | (0018,9825) VR=SQ VM=1 Excitation Wavelength Sequence. |
| static readonly [ExcludedIntervalsSequence](../../aspose.medical.dicom.tags/tag/excludedintervalssequence) | (0018,9803) VR=SQ VM=1 Excluded Intervals Sequence. |
| static readonly [ExclusionDuration](../../aspose.medical.dicom.tags/tag/exclusionduration) | (0018,9805) VR=FD VM=1 Exclusion Duration. |
| static readonly [ExclusionStartDateTime](../../aspose.medical.dicom.tags/tag/exclusionstartdatetime) | (0018,9804) VR=DT VM=1 Exclusion Start DateTime. |
| static readonly [ExclusiveComponentType](../../aspose.medical.dicom.tags/tag/exclusivecomponenttype) | (0076,0036) VR=CS VM=1 Exclusive Component Type. |
| static readonly [ExecutionStatus](../../aspose.medical.dicom.tags/tag/executionstatus) | (2100,0020) VR=CS VM=1 Execution Status. |
| static readonly [ExecutionStatusInfo](../../aspose.medical.dicom.tags/tag/executionstatusinfo) | (2100,0030) VR=CS VM=1 Execution Status Info. |
| static readonly [EXIFVersion](../../aspose.medical.dicom.tags/tag/exifversion) | (0016,0020) VR=UT VM=1 EXIF Version. |
| static readonly [ExpectedCompletionDateTime](../../aspose.medical.dicom.tags/tag/expectedcompletiondatetime) | (0040,4011) VR=DT VM=1 Expected Completion DateTime. |
| static readonly [ExpectedInVivoMeasurementValueIndex](../../aspose.medical.dicom.tags/tag/expectedinvivomeasurementvalueindex) | (300A,0622) VR=US VM=1 Expected In-Vivo Measurement Value Index. |
| static readonly [ExpectedInVivoMeasurementValuesSequence](../../aspose.medical.dicom.tags/tag/expectedinvivomeasurementvaluessequence) | (300A,0621) VR=SQ VM=1 Expected In-Vivo Measurement Values Sequence. |
| static readonly [ExpirationDateTime](../../aspose.medical.dicom.tags/tag/expirationdatetime) | (0008,0416) VR=DT VM=1 Expiration DateTime. |
| static readonly [ExpiryDateRETIRED](../../aspose.medical.dicom.tags/tag/expirydateretired) | (0014,1020) VR=DA VM=1 Expiry Date (RETIRED). |
| static readonly [ExposedArea](../../aspose.medical.dicom.tags/tag/exposedarea) | (0040,0303) VR=US VM=1-2 Exposed Area. |
| static readonly [Exposure](../../aspose.medical.dicom.tags/tag/exposure) | (0018,1152) VR=IS VM=1 Exposure. |
| static readonly [ExposureBiasValue](../../aspose.medical.dicom.tags/tag/exposurebiasvalue) | (0016,0024) VR=DS VM=1 Exposure Bias Value. |
| static readonly [ExposureControlMode](../../aspose.medical.dicom.tags/tag/exposurecontrolmode) | (0018,7060) VR=CS VM=1 Exposure Control Mode. |
| static readonly [ExposureControlModeDescription](../../aspose.medical.dicom.tags/tag/exposurecontrolmodedescription) | (0018,7062) VR=LT VM=1 Exposure Control Mode Description. |
| static readonly [ExposureControlSensingRegionLeftVerticalEdge](../../aspose.medical.dicom.tags/tag/exposurecontrolsensingregionleftverticaledge) | (0018,9436) VR=SS VM=1 Exposure Control Sensing Region Left Vertical Edge. |
| static readonly [ExposureControlSensingRegionLowerHorizontalEdge](../../aspose.medical.dicom.tags/tag/exposurecontrolsensingregionlowerhorizontaledge) | (0018,9439) VR=SS VM=1 Exposure Control Sensing Region Lower Horizontal Edge. |
| static readonly [ExposureControlSensingRegionRightVerticalEdge](../../aspose.medical.dicom.tags/tag/exposurecontrolsensingregionrightverticaledge) | (0018,9437) VR=SS VM=1 Exposure Control Sensing Region Right Vertical Edge. |
| static readonly [ExposureControlSensingRegionShape](../../aspose.medical.dicom.tags/tag/exposurecontrolsensingregionshape) | (0018,9435) VR=CS VM=1 Exposure Control Sensing Region Shape. |
| static readonly [ExposureControlSensingRegionsSequence](../../aspose.medical.dicom.tags/tag/exposurecontrolsensingregionssequence) | (0018,9434) VR=SQ VM=1 Exposure Control Sensing Regions Sequence. |
| static readonly [ExposureControlSensingRegionUpperHorizontalEdge](../../aspose.medical.dicom.tags/tag/exposurecontrolsensingregionupperhorizontaledge) | (0018,9438) VR=SS VM=1 Exposure Control Sensing Region Upper Horizontal Edge. |
| static readonly [ExposureDoseSequenceRETIRED](../../aspose.medical.dicom.tags/tag/exposuredosesequenceretired) | (0040,030E) VR=SQ VM=1 Exposure Dose Sequence (RETIRED). |
| static readonly [ExposureIndex](../../aspose.medical.dicom.tags/tag/exposureindex) | (0018,1411) VR=DS VM=1 Exposure Index. |
| static readonly [ExposureInmAs](../../aspose.medical.dicom.tags/tag/exposureinmas) | (0018,9332) VR=FD VM=1 Exposure in mAs. |
| static readonly [ExposureInuAs](../../aspose.medical.dicom.tags/tag/exposureinuas) | (0018,1153) VR=IS VM=1 Exposure in ÂµAs. |
| static readonly [ExposureMode](../../aspose.medical.dicom.tags/tag/exposuremode) | (0016,0042) VR=US VM=1 Exposure Mode. |
| static readonly [ExposureModulationType](../../aspose.medical.dicom.tags/tag/exposuremodulationtype) | (0018,9323) VR=CS VM=1-n Exposure Modulation Type. |
| static readonly [ExposureProgram](../../aspose.medical.dicom.tags/tag/exposureprogram) | (0016,0016) VR=US VM=1 Exposure Program. |
| static readonly [ExposureSequence](../../aspose.medical.dicom.tags/tag/exposuresequence) | (3002,0030) VR=SQ VM=1 Exposure Sequence. |
| static readonly [ExposuresOnDetectorSinceLastCalibration](../../aspose.medical.dicom.tags/tag/exposuresondetectorsincelastcalibration) | (0018,7010) VR=IS VM=1 Exposures on Detector Since Last Calibration. |
| static readonly [ExposuresOnDetectorSinceManufactured](../../aspose.medical.dicom.tags/tag/exposuresondetectorsincemanufactured) | (0018,7011) VR=IS VM=1 Exposures on Detector Since Manufactured. |
| static readonly [ExposuresOnPlate](../../aspose.medical.dicom.tags/tag/exposuresonplate) | (0018,1404) VR=US VM=1 Exposures on Plate. |
| static readonly [ExposureStatus](../../aspose.medical.dicom.tags/tag/exposurestatus) | (0018,7064) VR=CS VM=1 Exposure Status. |
| static readonly [ExposureTime](../../aspose.medical.dicom.tags/tag/exposuretime) | (0018,1150) VR=IS VM=1 Exposure Time. |
| static readonly [ExposureTimeInms](../../aspose.medical.dicom.tags/tag/exposuretimeinms) | (0018,9328) VR=FD VM=1 Exposure Time in ms. |
| static readonly [ExposureTimeInSeconds](../../aspose.medical.dicom.tags/tag/exposuretimeinseconds) | (0016,0004) VR=DS VM=1 Exposure Time in Seconds. |
| static readonly [ExposureTimeInuS](../../aspose.medical.dicom.tags/tag/exposuretimeinus) | (0018,8150) VR=DS VM=1 Exposure Time in ÂµS. |
| static readonly [ExtendedCodeMeaningRETIRED](../../aspose.medical.dicom.tags/tag/extendedcodemeaningretired) | (0008,0108) VR=LT VM=1 Extended Code Meaning (RETIRED). |
| static readonly [ExtendedCodeValueRETIRED](../../aspose.medical.dicom.tags/tag/extendedcodevalueretired) | (0008,0101) VR=LO VM=1 Extended Code Value (RETIRED). |
| static readonly [ExtendedDepthOfField](../../aspose.medical.dicom.tags/tag/extendeddepthoffield) | (0048,0012) VR=CS VM=1 Extended Depth of Field. |
| static readonly [ExtendedMatchingMechanisms](../../aspose.medical.dicom.tags/tag/extendedmatchingmechanisms) | (0008,040F) VR=CS VM=1-n Extended Matching Mechanisms. |
| static readonly [ExtendedOffsetTable](../../aspose.medical.dicom.tags/tag/extendedoffsettable) | (7FE0,0001) VR=OV VM=1 Extended Offset Table. |
| static readonly [ExtendedOffsetTableLengths](../../aspose.medical.dicom.tags/tag/extendedoffsettablelengths) | (7FE0,0002) VR=OV VM=1 Extended Offset Table Lengths. |
| static readonly [ExternalContourEntryPoint](../../aspose.medical.dicom.tags/tag/externalcontourentrypoint) | (300A,0133) VR=FL VM=3 External Contour Entry Point. |
| static readonly [FacetSequence](../../aspose.medical.dicom.tags/tag/facetsequence) | (0066,0034) VR=SQ VM=1 Facet Sequence. |
| static readonly [FailedAttributesSequence](../../aspose.medical.dicom.tags/tag/failedattributessequence) | (0074,1048) VR=SQ VM=1 Failed Attributes Sequence. |
| static readonly [FailedSOPInstanceUIDList](../../aspose.medical.dicom.tags/tag/failedsopinstanceuidlist) | (0008,0058) VR=UI VM=1-n Failed SOP Instance UID List. |
| static readonly [FailedSOPSequence](../../aspose.medical.dicom.tags/tag/failedsopsequence) | (0008,1198) VR=SQ VM=1 Failed SOP Sequence. |
| static readonly [FailedStudySequence](../../aspose.medical.dicom.tags/tag/failedstudysequence) | (0008,119B) VR=SQ VM=1 Failed Study Sequence. |
| static readonly [FailureAttributes](../../aspose.medical.dicom.tags/tag/failureattributes) | (2200,000E) VR=AT VM=1-n Failure Attributes. |
| static readonly [FailureReason](../../aspose.medical.dicom.tags/tag/failurereason) | (0008,1197) VR=US VM=1 Failure Reason. |
| static readonly [FalseNegativesEstimate](../../aspose.medical.dicom.tags/tag/falsenegativesestimate) | (0024,0046) VR=FL VM=1 False Negatives Estimate. |
| static readonly [FalseNegativesEstimateFlag](../../aspose.medical.dicom.tags/tag/falsenegativesestimateflag) | (0024,0045) VR=CS VM=1 False Negatives Estimate Flag. |
| static readonly [FalseNegativesQuantity](../../aspose.medical.dicom.tags/tag/falsenegativesquantity) | (0024,0050) VR=US VM=1 False Negatives Quantity. |
| static readonly [FalsePositivesEstimate](../../aspose.medical.dicom.tags/tag/falsepositivesestimate) | (0024,0054) VR=FL VM=1 False Positives Estimate. |
| static readonly [FalsePositivesEstimateFlag](../../aspose.medical.dicom.tags/tag/falsepositivesestimateflag) | (0024,0053) VR=CS VM=1 False Positives Estimate Flag. |
| static readonly [FalsePositivesQuantity](../../aspose.medical.dicom.tags/tag/falsepositivesquantity) | (0024,0060) VR=US VM=1 False Positives Quantity. |
| static readonly [FiducialDescription](../../aspose.medical.dicom.tags/tag/fiducialdescription) | (0070,030F) VR=ST VM=1 Fiducial Description. |
| static readonly [FiducialIdentifier](../../aspose.medical.dicom.tags/tag/fiducialidentifier) | (0070,0310) VR=SH VM=1 Fiducial Identifier. |
| static readonly [FiducialIdentifierCodeSequence](../../aspose.medical.dicom.tags/tag/fiducialidentifiercodesequence) | (0070,0311) VR=SQ VM=1 Fiducial Identifier Code Sequence. |
| static readonly [FiducialSequence](../../aspose.medical.dicom.tags/tag/fiducialsequence) | (0070,031E) VR=SQ VM=1 Fiducial Sequence. |
| static readonly [FiducialSetSequence](../../aspose.medical.dicom.tags/tag/fiducialsetsequence) | (0070,031C) VR=SQ VM=1 Fiducial Set Sequence. |
| static readonly [FiducialsPropertyCategoryCodeSequence](../../aspose.medical.dicom.tags/tag/fiducialspropertycategorycodesequence) | (0070,031F) VR=SQ VM=1 Fiducials Property Category Code Sequence. |
| static readonly [FiducialUID](../../aspose.medical.dicom.tags/tag/fiducialuid) | (0070,031A) VR=UI VM=1 Fiducial UID. |
| static readonly [FieldOfViewDescription](../../aspose.medical.dicom.tags/tag/fieldofviewdescription) | (0018,9433) VR=LO VM=1 Field of View Description. |
| static readonly [FieldOfViewDimensions](../../aspose.medical.dicom.tags/tag/fieldofviewdimensions) | (0018,1149) VR=IS VM=1-2 Field of View Dimension(s). |
| static readonly [FieldOfViewDimensionsInFloat](../../aspose.medical.dicom.tags/tag/fieldofviewdimensionsinfloat) | (0018,9461) VR=FL VM=1-2 Field of View Dimension(s) in Float. |
| static readonly [FieldOfViewHorizontalFlip](../../aspose.medical.dicom.tags/tag/fieldofviewhorizontalflip) | (0018,7034) VR=CS VM=1 Field of View Horizontal Flip. |
| static readonly [FieldOfViewOrigin](../../aspose.medical.dicom.tags/tag/fieldofvieworigin) | (0018,7030) VR=DS VM=2 Field of View Origin. |
| static readonly [FieldOfViewRETIRED](../../aspose.medical.dicom.tags/tag/fieldofviewretired) | (0014,6027) VR=DS VM=1 Field of View (RETIRED). |
| static readonly [FieldOfViewRotation](../../aspose.medical.dicom.tags/tag/fieldofviewrotation) | (0018,7032) VR=DS VM=1 Field of View Rotation. |
| static readonly [FieldOfViewSequence](../../aspose.medical.dicom.tags/tag/fieldofviewsequence) | (0018,9432) VR=SQ VM=1 Field of View Sequence. |
| static readonly [FieldOfViewShape](../../aspose.medical.dicom.tags/tag/fieldofviewshape) | (0018,1147) VR=CS VM=1 Field of View Shape. |
| static readonly [FileAccessSequence](../../aspose.medical.dicom.tags/tag/fileaccesssequence) | (0008,041A) VR=SQ VM=1 File Access Sequence. |
| static readonly [FileAccessURI](../../aspose.medical.dicom.tags/tag/fileaccessuri) | (0008,0409) VR=UR VM=1 File Access URI. |
| static readonly [FileLengthInContainer](../../aspose.medical.dicom.tags/tag/filelengthincontainer) | (0008,040D) VR=UV VM=1 File Length in Container. |
| static readonly [FileMetaInformationGroupLength](../../aspose.medical.dicom.tags/tag/filemetainformationgrouplength) | (0002,0000) VR=UL VM=1 File Meta Information Group Length. |
| static readonly [FileMetaInformationVersion](../../aspose.medical.dicom.tags/tag/filemetainformationversion) | (0002,0001) VR=OB VM=1 File Meta Information Version. |
| static readonly [FilenameInContainer](../../aspose.medical.dicom.tags/tag/filenameincontainer) | (0008,040B) VR=UR VM=1 Filename in Container. |
| static readonly [FileOffsetInContainer](../../aspose.medical.dicom.tags/tag/fileoffsetincontainer) | (0008,040C) VR=UV VM=1 File Offset in Container. |
| static readonly [FileSetAccessSequence](../../aspose.medical.dicom.tags/tag/filesetaccesssequence) | (0008,0419) VR=SQ VM=1 File Set Access Sequence. |
| static readonly [FileSetConsistencyFlag](../../aspose.medical.dicom.tags/tag/filesetconsistencyflag) | (0004,1212) VR=US VM=1 File-set Consistency Flag. |
| static readonly [FileSetDescriptorFileID](../../aspose.medical.dicom.tags/tag/filesetdescriptorfileid) | (0004,1141) VR=CS VM=1-8 File-set Descriptor File ID. |
| static readonly [FileSetID](../../aspose.medical.dicom.tags/tag/filesetid) | (0004,1130) VR=CS VM=1 File-set ID. |
| static readonly [FileSource](../../aspose.medical.dicom.tags/tag/filesource) | (0016,003A) VR=US VM=1 File Source. |
| static readonly [FillerOrderNumberImagingServiceRequest](../../aspose.medical.dicom.tags/tag/fillerordernumberimagingservicerequest) | (0040,2017) VR=LO VM=1 Filler Order Number / Imaging Service Request. |
| static readonly [FillerOrderNumberImagingServiceRequestRetiredRETIRED](../../aspose.medical.dicom.tags/tag/fillerordernumberimagingservicerequestretiredretired) | (0040,2007) VR=SH VM=1 Filler Order Number / Imaging Service Request (Retired) (RETIRED). |
| static readonly [FillerOrderNumberProcedureRETIRED](../../aspose.medical.dicom.tags/tag/fillerordernumberprocedureretired) | (0040,1007) VR=SH VM=1 Filler Order Number / Procedure (RETIRED). |
| static readonly [FillMode](../../aspose.medical.dicom.tags/tag/fillmode) | (0070,0257) VR=CS VM=1 Fill Mode. |
| static readonly [FillPattern](../../aspose.medical.dicom.tags/tag/fillpattern) | (0070,0256) VR=OB VM=1 Fill Pattern. |
| static readonly [FillStyleSequence](../../aspose.medical.dicom.tags/tag/fillstylesequence) | (0070,0233) VR=SQ VM=1 Fill Style Sequence. |
| static readonly [FilmBoxContentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/filmboxcontentsequenceretired) | (2130,0030) VR=SQ VM=1 Film Box Content Sequence (RETIRED). |
| static readonly [FilmConsumptionSequence](../../aspose.medical.dicom.tags/tag/filmconsumptionsequence) | (0040,0321) VR=SQ VM=1 Film Consumption Sequence. |
| static readonly [FilmDestination](../../aspose.medical.dicom.tags/tag/filmdestination) | (2000,0040) VR=CS VM=1 Film Destination. |
| static readonly [FilmOrientation](../../aspose.medical.dicom.tags/tag/filmorientation) | (2010,0040) VR=CS VM=1 Film Orientation. |
| static readonly [FilmSessionLabel](../../aspose.medical.dicom.tags/tag/filmsessionlabel) | (2000,0050) VR=LO VM=1 Film Session Label. |
| static readonly [FilmSizeID](../../aspose.medical.dicom.tags/tag/filmsizeid) | (2010,0050) VR=CS VM=1 Film Size ID. |
| static readonly [FilterBeamPathLengthMaximum](../../aspose.medical.dicom.tags/tag/filterbeampathlengthmaximum) | (0018,7058) VR=FL VM=1-n Filter Beam Path Length Maximum. |
| static readonly [FilterBeamPathLengthMinimum](../../aspose.medical.dicom.tags/tag/filterbeampathlengthminimum) | (0018,7056) VR=FL VM=1-n Filter Beam Path Length Minimum. |
| static readonly [FilterByAttributePresence](../../aspose.medical.dicom.tags/tag/filterbyattributepresence) | (0072,0404) VR=CS VM=1 Filter-by Attribute Presence. |
| static readonly [FilterByCategory](../../aspose.medical.dicom.tags/tag/filterbycategory) | (0072,0402) VR=CS VM=1 Filter-by Category. |
| static readonly [FilterByOperator](../../aspose.medical.dicom.tags/tag/filterbyoperator) | (0072,0406) VR=CS VM=1 Filter-by Operator. |
| static readonly [FilterHighFrequency](../../aspose.medical.dicom.tags/tag/filterhighfrequency) | (003A,0221) VR=DS VM=1 Filter High Frequency. |
| static readonly [FilterHighFrequencyCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/filterhighfrequencycharacteristicssequence) | (003A,0319) VR=SQ VM=1 Filter High Frequency Characteristics Sequence. |
| static readonly [FilterLookupTableData](../../aspose.medical.dicom.tags/tag/filterlookuptabledata) | (003A,032E) VR=OD VM=1 Filter Lookup Table Data. |
| static readonly [FilterLookupTableDescription](../../aspose.medical.dicom.tags/tag/filterlookuptabledescription) | (003A,032B) VR=ST VM=1 Filter Lookup Table Description. |
| static readonly [FilterLookupTableSequence](../../aspose.medical.dicom.tags/tag/filterlookuptablesequence) | (003A,032A) VR=SQ VM=1 Filter Lookup Table Sequence. |
| static readonly [FilterLowFrequency](../../aspose.medical.dicom.tags/tag/filterlowfrequency) | (003A,0220) VR=DS VM=1 Filter Low Frequency. |
| static readonly [FilterLowFrequencyCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/filterlowfrequencycharacteristicssequence) | (003A,0318) VR=SQ VM=1 Filter Low Frequency Characteristics Sequence. |
| static readonly [FilterMaterial](../../aspose.medical.dicom.tags/tag/filtermaterial) | (0018,7050) VR=CS VM=1-n Filter Material. |
| static readonly [FilterMaterialUsedInGainCalibrationRETIRED](../../aspose.medical.dicom.tags/tag/filtermaterialusedingaincalibrationretired) | (0014,3074) VR=LO VM=1 Filter Material Used in Gain Calibration (RETIRED). |
| static readonly [FilterOperationsSequence](../../aspose.medical.dicom.tags/tag/filteroperationssequence) | (0072,0400) VR=SQ VM=1 Filter Operations Sequence. |
| static readonly [FilterThicknessMaximum](../../aspose.medical.dicom.tags/tag/filterthicknessmaximum) | (0018,7054) VR=DS VM=1-n Filter Thickness Maximum. |
| static readonly [FilterThicknessMinimum](../../aspose.medical.dicom.tags/tag/filterthicknessminimum) | (0018,7052) VR=DS VM=1-n Filter Thickness Minimum. |
| static readonly [FilterThicknessUsedInGainCalibrationRETIRED](../../aspose.medical.dicom.tags/tag/filterthicknessusedingaincalibrationretired) | (0014,3075) VR=DS VM=1 Filter Thickness Used in Gain Calibration (RETIRED). |
| static readonly [FilterType](../../aspose.medical.dicom.tags/tag/filtertype) | (0018,1160) VR=SH VM=1 Filter Type. |
| static readonly [FinalCumulativeMetersetWeight](../../aspose.medical.dicom.tags/tag/finalcumulativemetersetweight) | (300A,010E) VR=DS VM=1 Final Cumulative Meterset Weight. |
| static readonly [FinalCumulativeTimeWeight](../../aspose.medical.dicom.tags/tag/finalcumulativetimeweight) | (300A,02C8) VR=DS VM=1 Final Cumulative Time Weight. |
| static readonly [FindingsFlagTrialRETIRED](../../aspose.medical.dicom.tags/tag/findingsflagtrialretired) | (0040,A007) VR=CS VM=1 Findings Flag (Trial) (RETIRED). |
| static readonly [FindingsGroupRecordingDateTrialRETIRED](../../aspose.medical.dicom.tags/tag/findingsgrouprecordingdatetrialretired) | (0040,A023) VR=DA VM=1 Findings Group Recording Date (Trial) (RETIRED). |
| static readonly [FindingsGroupRecordingTimeTrialRETIRED](../../aspose.medical.dicom.tags/tag/findingsgrouprecordingtimetrialretired) | (0040,A024) VR=TM VM=1 Findings Group Recording Time (Trial) (RETIRED). |
| static readonly [FindingsGroupUIDTrialRETIRED](../../aspose.medical.dicom.tags/tag/findingsgroupuidtrialretired) | (0040,A021) VR=UI VM=1 Findings Group UID (Trial) (RETIRED). |
| static readonly [FindingsSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/findingssequencetrialretired) | (0040,A020) VR=SQ VM=1 Findings Sequence (Trial) (RETIRED). |
| static readonly [FindingsSourceCategoryCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/findingssourcecategorycodesequencetrialretired) | (0040,A026) VR=SQ VM=1 Findings Source Category Code Sequence (Trial) (RETIRED). |
| static readonly [FindLocationRETIRED](../../aspose.medical.dicom.tags/tag/findlocationretired) | (0000,0400) VR=AE VM=1 Find Location (RETIRED). |
| static readonly [FiniteVolume](../../aspose.medical.dicom.tags/tag/finitevolume) | (0066,000E) VR=CS VM=1 Finite Volume. |
| static readonly [FirstALineLocation](../../aspose.medical.dicom.tags/tag/firstalinelocation) | (0052,0034) VR=FD VM=1 First A-line Location. |
| static readonly [FirstOrderPhaseCorrection](../../aspose.medical.dicom.tags/tag/firstorderphasecorrection) | (0018,9198) VR=CS VM=1 First Order Phase Correction. |
| static readonly [FirstOrderPhaseCorrectionAngle](../../aspose.medical.dicom.tags/tag/firstorderphasecorrectionangle) | (5600,0010) VR=OF VM=1 First Order Phase Correction Angle. |
| static readonly [FirstTreatmentDate](../../aspose.medical.dicom.tags/tag/firsttreatmentdate) | (3008,0054) VR=DA VM=1 First Treatment Date. |
| static readonly [FittingDataTypeRETIRED](../../aspose.medical.dicom.tags/tag/fittingdatatyperetired) | (0014,605A) VR=CS VM=1-n Fitting Data Type (RETIRED). |
| static readonly [FixationCheckedQuantity](../../aspose.medical.dicom.tags/tag/fixationcheckedquantity) | (0024,0035) VR=US VM=1 Fixation Checked Quantity. |
| static readonly [FixationDeviceDescription](../../aspose.medical.dicom.tags/tag/fixationdevicedescription) | (300A,0196) VR=ST VM=1 Fixation Device Description. |
| static readonly [FixationDeviceLabel](../../aspose.medical.dicom.tags/tag/fixationdevicelabel) | (300A,0194) VR=SH VM=1 Fixation Device Label. |
| static readonly [FixationDevicePitchAngle](../../aspose.medical.dicom.tags/tag/fixationdevicepitchangle) | (300A,0199) VR=FL VM=1 Fixation Device Pitch Angle. |
| static readonly [FixationDevicePosition](../../aspose.medical.dicom.tags/tag/fixationdeviceposition) | (300A,0198) VR=SH VM=1 Fixation Device Position. |
| static readonly [FixationDeviceRollAngle](../../aspose.medical.dicom.tags/tag/fixationdevicerollangle) | (300A,019A) VR=FL VM=1 Fixation Device Roll Angle. |
| static readonly [FixationDeviceSequence](../../aspose.medical.dicom.tags/tag/fixationdevicesequence) | (300A,0190) VR=SQ VM=1 Fixation Device Sequence. |
| static readonly [FixationDeviceType](../../aspose.medical.dicom.tags/tag/fixationdevicetype) | (300A,0192) VR=CS VM=1 Fixation Device Type. |
| static readonly [FixationEye](../../aspose.medical.dicom.tags/tag/fixationeye) | (300A,0150) VR=CS VM=1 Fixation Eye. |
| static readonly [FixationLightAzimuthalAngle](../../aspose.medical.dicom.tags/tag/fixationlightazimuthalangle) | (300A,0356) VR=FL VM=1 Fixation Light Azimuthal Angle. |
| static readonly [FixationLightAzimuthalAngleTolerance](../../aspose.medical.dicom.tags/tag/fixationlightazimuthalangletolerance) | (300A,0154) VR=DS VM=1 Fixation Light Azimuthal Angle Tolerance. |
| static readonly [FixationLightPolarAngle](../../aspose.medical.dicom.tags/tag/fixationlightpolarangle) | (300A,0358) VR=FL VM=1 Fixation Light Polar Angle. |
| static readonly [FixationLightPolarAngleTolerance](../../aspose.medical.dicom.tags/tag/fixationlightpolarangletolerance) | (300A,0155) VR=DS VM=1 Fixation Light Polar Angle Tolerance. |
| static readonly [FixationMethodCodeSequence](../../aspose.medical.dicom.tags/tag/fixationmethodcodesequence) | (0068,63AC) VR=SQ VM=1 Fixation Method Code Sequence. |
| static readonly [FixationMonitoringCodeSequence](../../aspose.medical.dicom.tags/tag/fixationmonitoringcodesequence) | (0024,0033) VR=SQ VM=1 Fixation Monitoring Code Sequence. |
| static readonly [FixationSequence](../../aspose.medical.dicom.tags/tag/fixationsequence) | (0024,0032) VR=SQ VM=1 Fixation Sequence. |
| static readonly [FixedRTBeamDelimiterDeviceSequence](../../aspose.medical.dicom.tags/tag/fixedrtbeamdelimiterdevicesequence) | (300A,0646) VR=SQ VM=1 Fixed RT Beam Delimiter Device Sequence. |
| static readonly [FlashDurationRETIRED](../../aspose.medical.dicom.tags/tag/flashdurationretired) | (0014,6010) VR=DS VM=1 Flash Duration (RETIRED). |
| static readonly [FlashEnergy](../../aspose.medical.dicom.tags/tag/flashenergy) | (0016,0036) VR=DS VM=1-2 Flash Energy. |
| static readonly [FlashFiringStatus](../../aspose.medical.dicom.tags/tag/flashfiringstatus) | (0016,0011) VR=US VM=1 Flash Firing Status. |
| static readonly [FlashFrameNumberRETIRED](../../aspose.medical.dicom.tags/tag/flashframenumberretired) | (0014,6011) VR=DS VM=1-n Flash Frame Number (RETIRED). |
| static readonly [FlashFunctionPresent](../../aspose.medical.dicom.tags/tag/flashfunctionpresent) | (0016,0014) VR=US VM=1 Flash Function Present. |
| static readonly [FlashHeatingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/flashheatingsequenceretired) | (0014,6034) VR=SQ VM=1 Flash Heating Sequence (RETIRED). |
| static readonly [FlashMode](../../aspose.medical.dicom.tags/tag/flashmode) | (0016,0013) VR=US VM=1 Flash Mode. |
| static readonly [FlashModificationStatusRETIRED](../../aspose.medical.dicom.tags/tag/flashmodificationstatusretired) | (0014,6037) VR=CS VM=1 Flash Modification Status (RETIRED). |
| static readonly [FlashRedEyeMode](../../aspose.medical.dicom.tags/tag/flashredeyemode) | (0016,0015) VR=US VM=1 Flash Red Eye Mode. |
| static readonly [FlashReturnStatus](../../aspose.medical.dicom.tags/tag/flashreturnstatus) | (0016,0012) VR=US VM=1 Flash Return Status. |
| static readonly [FlashSourceSettingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/flashsourcesettingsequenceretired) | (0014,600F) VR=SQ VM=1 Flash Source Setting Sequence (RETIRED). |
| static readonly [FlashSynchronizationProtocolRETIRED](../../aspose.medical.dicom.tags/tag/flashsynchronizationprotocolretired) | (0014,6036) VR=ST VM=1 Flash Synchronization Protocol (RETIRED). |
| static readonly [FlatCornealAxisSequence](../../aspose.medical.dicom.tags/tag/flatcornealaxissequence) | (0046,0113) VR=SQ VM=1 Flat Corneal Axis Sequence. |
| static readonly [FlatKeratometricAxisSequence](../../aspose.medical.dicom.tags/tag/flatkeratometricaxissequence) | (0046,0080) VR=SQ VM=1 Flat Keratometric Axis Sequence. |
| static readonly [FlipAngle](../../aspose.medical.dicom.tags/tag/flipangle) | (0018,1314) VR=DS VM=1 Flip Angle. |
| static readonly [FloatingPointValue](../../aspose.medical.dicom.tags/tag/floatingpointvalue) | (0040,A161) VR=FD VM=1-n Floating Point Value. |
| static readonly [FloatingPointValues](../../aspose.medical.dicom.tags/tag/floatingpointvalues) | (0066,0125) VR=OF VM=1 Floating Point Values. |
| static readonly [FloatPixelData](../../aspose.medical.dicom.tags/tag/floatpixeldata) | (7FE0,0008) VR=OF VM=1 Float Pixel Data. |
| static readonly [FloatPixelPaddingRangeLimit](../../aspose.medical.dicom.tags/tag/floatpixelpaddingrangelimit) | (0028,0124) VR=FL VM=1 Float Pixel Padding Range Limit. |
| static readonly [FloatPixelPaddingValue](../../aspose.medical.dicom.tags/tag/floatpixelpaddingvalue) | (0028,0122) VR=FL VM=1 Float Pixel Padding Value. |
| static readonly [FlowCompensation](../../aspose.medical.dicom.tags/tag/flowcompensation) | (0018,9010) VR=CS VM=1 Flow Compensation. |
| static readonly [FlowCompensationDirection](../../aspose.medical.dicom.tags/tag/flowcompensationdirection) | (0018,9183) VR=CS VM=1 Flow Compensation Direction. |
| static readonly [FlowIdentifier](../../aspose.medical.dicom.tags/tag/flowidentifier) | (0034,0002) VR=OB VM=1 Flow Identifier. |
| static readonly [FlowIdentifierSequence](../../aspose.medical.dicom.tags/tag/flowidentifiersequence) | (0034,0001) VR=SQ VM=1 Flow Identifier Sequence. |
| static readonly [FlowRTPSamplingRate](../../aspose.medical.dicom.tags/tag/flowrtpsamplingrate) | (0034,0004) VR=UL VM=1 Flow RTP Sampling Rate. |
| static readonly [FlowTransferSyntaxUID](../../aspose.medical.dicom.tags/tag/flowtransfersyntaxuid) | (0034,0003) VR=UI VM=1 Flow Transfer Syntax UID. |
| static readonly [FluenceDataScale](../../aspose.medical.dicom.tags/tag/fluencedatascale) | (3002,0042) VR=DS VM=1 Fluence Data Scale. |
| static readonly [FluenceDataSource](../../aspose.medical.dicom.tags/tag/fluencedatasource) | (3002,0041) VR=CS VM=1 Fluence Data Source. |
| static readonly [FluenceMapSequence](../../aspose.medical.dicom.tags/tag/fluencemapsequence) | (3002,0040) VR=SQ VM=1 Fluence Map Sequence. |
| static readonly [FluenceMode](../../aspose.medical.dicom.tags/tag/fluencemode) | (3002,0051) VR=CS VM=1 Fluence Mode. |
| static readonly [FluenceModeID](../../aspose.medical.dicom.tags/tag/fluencemodeid) | (3002,0052) VR=SH VM=1 Fluence Mode ID. |
| static readonly [FluoroscopyFlag](../../aspose.medical.dicom.tags/tag/fluoroscopyflag) | (0018,9334) VR=CS VM=1 Fluoroscopy Flag. |
| static readonly [FluoroscopyLastImageHoldPersistenceFlag](../../aspose.medical.dicom.tags/tag/fluoroscopylastimageholdpersistenceflag) | (0018,11B4) VR=CS VM=1 Fluoroscopy Last Image Hold Persistence Flag. |
| static readonly [FluoroscopyPersistenceFlag](../../aspose.medical.dicom.tags/tag/fluoroscopypersistenceflag) | (0018,11B3) VR=CS VM=1 Fluoroscopy Persistence Flag. |
| static readonly [FNumber](../../aspose.medical.dicom.tags/tag/fnumber) | (0016,0005) VR=DS VM=1 F-Number. |
| static readonly [FocalDistance](../../aspose.medical.dicom.tags/tag/focaldistance) | (0018,1182) VR=IS VM=1-2 Focal Distance. |
| static readonly [FocalLength](../../aspose.medical.dicom.tags/tag/focallength) | (0016,0029) VR=DS VM=1 Focal Length. |
| static readonly [FocalLengthIn35mmFilm](../../aspose.medical.dicom.tags/tag/focallengthin35mmfilm) | (0016,0045) VR=IS VM=1 Focal Length In 35mm Film. |
| static readonly [FocalSpots](../../aspose.medical.dicom.tags/tag/focalspots) | (0018,1190) VR=DS VM=1-n Focal Spot(s). |
| static readonly [FocusDepth](../../aspose.medical.dicom.tags/tag/focusdepth) | (0018,5012) VR=DS VM=1 Focus Depth. |
| static readonly [FocusMethod](../../aspose.medical.dicom.tags/tag/focusmethod) | (0048,0011) VR=CS VM=1 Focus Method. |
| static readonly [FolderAccessURI](../../aspose.medical.dicom.tags/tag/folderaccessuri) | (0008,0408) VR=UR VM=1 Folder Access URI. |
| static readonly [FontName](../../aspose.medical.dicom.tags/tag/fontname) | (0070,0227) VR=LO VM=1 Font Name. |
| static readonly [FontNameType](../../aspose.medical.dicom.tags/tag/fontnametype) | (0070,0228) VR=CS VM=1 Font Name Type. |
| static readonly [ForcedGasHeatingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/forcedgasheatingsequenceretired) | (0014,603C) VR=SQ VM=1 Forced Gas Heating Sequence (RETIRED). |
| static readonly [ForcedGasSettingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/forcedgassettingsequenceretired) | (0014,6017) VR=SQ VM=1 Forced Gas Setting Sequence (RETIRED). |
| static readonly [FovealPointNormativeDataFlag](../../aspose.medical.dicom.tags/tag/fovealpointnormativedataflag) | (0024,0117) VR=CS VM=1 Foveal Point Normative Data Flag. |
| static readonly [FovealPointProbabilityValue](../../aspose.medical.dicom.tags/tag/fovealpointprobabilityvalue) | (0024,0118) VR=FL VM=1 Foveal Point Probability Value. |
| static readonly [FovealSensitivity](../../aspose.medical.dicom.tags/tag/fovealsensitivity) | (0024,0087) VR=FL VM=1 Foveal Sensitivity. |
| static readonly [FovealSensitivityMeasured](../../aspose.medical.dicom.tags/tag/fovealsensitivitymeasured) | (0024,0086) VR=CS VM=1 Foveal Sensitivity Measured. |
| static readonly [FractionalBandwidth](../../aspose.medical.dicom.tags/tag/fractionalbandwidth) | (0018,982E) VR=FD VM=1 Fractional Bandwidth. |
| static readonly [FractionalChannelDisplayScale](../../aspose.medical.dicom.tags/tag/fractionalchanneldisplayscale) | (003A,0247) VR=FL VM=1 Fractional Channel Display Scale. |
| static readonly [FractionationNotes](../../aspose.medical.dicom.tags/tag/fractionationnotes) | (3010,007F) VR=UT VM=1 Fractionation Notes. |
| static readonly [FractionBasedRelationshipIntervalAnchor](../../aspose.medical.dicom.tags/tag/fractionbasedrelationshipintervalanchor) | (3010,0083) VR=CS VM=1 Fraction-Based Relationship Interval Anchor. |
| static readonly [FractionBasedRelationshipSequence](../../aspose.medical.dicom.tags/tag/fractionbasedrelationshipsequence) | (3010,0082) VR=SQ VM=1 Fraction-Based Relationship Sequence. |
| static readonly [FractionGroupDescription](../../aspose.medical.dicom.tags/tag/fractiongroupdescription) | (300A,0072) VR=LO VM=1 Fraction Group Description. |
| static readonly [FractionGroupNumber](../../aspose.medical.dicom.tags/tag/fractiongroupnumber) | (300A,0071) VR=IS VM=1 Fraction Group Number. |
| static readonly [FractionGroupSequence](../../aspose.medical.dicom.tags/tag/fractiongroupsequence) | (300A,0070) VR=SQ VM=1 Fraction Group Sequence. |
| static readonly [FractionGroupSummarySequence](../../aspose.medical.dicom.tags/tag/fractiongroupsummarysequence) | (3008,0220) VR=SQ VM=1 Fraction Group Summary Sequence. |
| static readonly [FractionGroupType](../../aspose.medical.dicom.tags/tag/fractiongrouptype) | (3008,0224) VR=CS VM=1 Fraction Group Type. |
| static readonly [FractionNumber](../../aspose.medical.dicom.tags/tag/fractionnumber) | (3002,0029) VR=IS VM=1 Fraction Number. |
| static readonly [FractionPattern](../../aspose.medical.dicom.tags/tag/fractionpattern) | (300A,007B) VR=LT VM=1 Fraction Pattern. |
| static readonly [FractionPatternSequence](../../aspose.medical.dicom.tags/tag/fractionpatternsequence) | (3010,0079) VR=SQ VM=1 Fraction Pattern Sequence. |
| static readonly [FractionStatusSummarySequence](../../aspose.medical.dicom.tags/tag/fractionstatussummarysequence) | (3008,0240) VR=SQ VM=1 Fraction Status Summary Sequence. |
| static readonly [FrameAcquisitionDateTime](../../aspose.medical.dicom.tags/tag/frameacquisitiondatetime) | (0018,9074) VR=DT VM=1 Frame Acquisition DateTime. |
| static readonly [FrameAcquisitionDuration](../../aspose.medical.dicom.tags/tag/frameacquisitionduration) | (0018,9220) VR=FD VM=1 Frame Acquisition Duration. |
| static readonly [FrameAcquisitionNumber](../../aspose.medical.dicom.tags/tag/frameacquisitionnumber) | (0020,9156) VR=US VM=1 Frame Acquisition Number. |
| static readonly [FrameAcquisitionSequence](../../aspose.medical.dicom.tags/tag/frameacquisitionsequence) | (0018,9417) VR=SQ VM=1 Frame Acquisition Sequence. |
| static readonly [FrameAnatomySequence](../../aspose.medical.dicom.tags/tag/frameanatomysequence) | (0020,9071) VR=SQ VM=1 Frame Anatomy Sequence. |
| static readonly [FrameComments](../../aspose.medical.dicom.tags/tag/framecomments) | (0020,9158) VR=LT VM=1 Frame Comments. |
| static readonly [FrameContentSequence](../../aspose.medical.dicom.tags/tag/framecontentsequence) | (0020,9111) VR=SQ VM=1 Frame Content Sequence. |
| static readonly [FrameDelay](../../aspose.medical.dicom.tags/tag/framedelay) | (0018,1066) VR=DS VM=1 Frame Delay. |
| static readonly [FrameDetectorParametersSequence](../../aspose.medical.dicom.tags/tag/framedetectorparameterssequence) | (0018,9451) VR=SQ VM=1 Frame Detector Parameters Sequence. |
| static readonly [FrameDimensionPointer](../../aspose.medical.dicom.tags/tag/framedimensionpointer) | (0028,000A) VR=AT VM=1-n Frame Dimension Pointer. |
| static readonly [FrameDisplaySequence](../../aspose.medical.dicom.tags/tag/framedisplaysequence) | (0008,9458) VR=SQ VM=1 Frame Display Sequence. |
| static readonly [FrameDisplayShutterSequence](../../aspose.medical.dicom.tags/tag/framedisplayshuttersequence) | (0018,9472) VR=SQ VM=1 Frame Display Shutter Sequence. |
| static readonly [FrameExtractionSequence](../../aspose.medical.dicom.tags/tag/frameextractionsequence) | (0008,1164) VR=SQ VM=1 Frame Extraction Sequence. |
| static readonly [FrameIncrementPointer](../../aspose.medical.dicom.tags/tag/frameincrementpointer) | (0028,0009) VR=AT VM=1-n Frame Increment Pointer. |
| static readonly [FrameLabel](../../aspose.medical.dicom.tags/tag/framelabel) | (0020,9453) VR=LO VM=1 Frame Label. |
| static readonly [FrameLabelVector](../../aspose.medical.dicom.tags/tag/framelabelvector) | (0018,2002) VR=SH VM=1-n Frame Label Vector. |
| static readonly [FrameLaterality](../../aspose.medical.dicom.tags/tag/framelaterality) | (0020,9072) VR=CS VM=1 Frame Laterality. |
| static readonly [FrameNumbersOfInterest](../../aspose.medical.dicom.tags/tag/framenumbersofinterest) | (0028,6020) VR=US VM=1-n Frame Numbers of Interest (FOI). |
| static readonly [FrameOfInterestDescription](../../aspose.medical.dicom.tags/tag/frameofinterestdescription) | (0028,6022) VR=LO VM=1-n Frame of Interest Description. |
| static readonly [FrameOfInterestType](../../aspose.medical.dicom.tags/tag/frameofinteresttype) | (0028,6023) VR=CS VM=1-n Frame of Interest Type. |
| static readonly [FrameOfReferenceRelationshipSequenceRETIRED](../../aspose.medical.dicom.tags/tag/frameofreferencerelationshipsequenceretired) | (3006,00C0) VR=SQ VM=1 Frame of Reference Relationship Sequence (RETIRED). |
| static readonly [FrameOfReferenceToDisplayedCoordinateSystemTransformationMatrix](../../aspose.medical.dicom.tags/tag/frameofreferencetodisplayedcoordinatesystemtransformationmatrix) | (0070,030B) VR=FD VM=16 Frame of Reference to Displayed Coordinate System Transformation Matrix. |
| static readonly [FrameOfReferenceTransformationComment](../../aspose.medical.dicom.tags/tag/frameofreferencetransformationcomment) | (3006,00C8) VR=LO VM=1 Frame of Reference Transformation Comment. |
| static readonly [FrameOfReferenceTransformationMatrix](../../aspose.medical.dicom.tags/tag/frameofreferencetransformationmatrix) | (3006,00C6) VR=DS VM=16 Frame of Reference Transformation Matrix. |
| static readonly [FrameOfReferenceTransformationMatrixType](../../aspose.medical.dicom.tags/tag/frameofreferencetransformationmatrixtype) | (0070,030C) VR=CS VM=1 Frame of Reference Transformation Matrix Type. |
| static readonly [FrameOfReferenceTransformationTypeRETIRED](../../aspose.medical.dicom.tags/tag/frameofreferencetransformationtyperetired) | (3006,00C4) VR=CS VM=1 Frame of Reference Transformation Type (RETIRED). |
| static readonly [FrameOfReferenceUID](../../aspose.medical.dicom.tags/tag/frameofreferenceuid) | (0020,0052) VR=UI VM=1 Frame of Reference UID. |
| static readonly [FrameOriginTimestamp](../../aspose.medical.dicom.tags/tag/frameorigintimestamp) | (0034,0007) VR=OB VM=1 Frame Origin Timestamp. |
| static readonly [FramePixelDataPropertiesSequence](../../aspose.medical.dicom.tags/tag/framepixeldatapropertiessequence) | (0028,9443) VR=SQ VM=1 Frame Pixel Data Properties Sequence. |
| static readonly [FramePixelShiftSequence](../../aspose.medical.dicom.tags/tag/framepixelshiftsequence) | (0028,9415) VR=SQ VM=1 Frame Pixel Shift Sequence. |
| static readonly [FramePrimaryAngleVector](../../aspose.medical.dicom.tags/tag/frameprimaryanglevector) | (0018,2003) VR=DS VM=1-n Frame Primary Angle Vector. |
| static readonly [FrameReferenceDateTime](../../aspose.medical.dicom.tags/tag/framereferencedatetime) | (0018,9151) VR=DT VM=1 Frame Reference DateTime. |
| static readonly [FrameReferenceTime](../../aspose.medical.dicom.tags/tag/framereferencetime) | (0054,1300) VR=DS VM=1 Frame Reference Time. |
| static readonly [FrameSecondaryAngleVector](../../aspose.medical.dicom.tags/tag/framesecondaryanglevector) | (0018,2004) VR=DS VM=1-n Frame Secondary Angle Vector. |
| static readonly [FrameTime](../../aspose.medical.dicom.tags/tag/frametime) | (0018,1063) VR=DS VM=1 Frame Time. |
| static readonly [FrameTimeVector](../../aspose.medical.dicom.tags/tag/frametimevector) | (0018,1065) VR=DS VM=1-n Frame Time Vector. |
| static readonly [FrameType](../../aspose.medical.dicom.tags/tag/frametype) | (0008,9007) VR=CS VM=4-5 Frame Type. |
| static readonly [FrameUsefulnessGroupSequence](../../aspose.medical.dicom.tags/tag/frameusefulnessgroupsequence) | (0034,0009) VR=SQ VM=1 Frame Usefulness Group Sequence. |
| static readonly [FrameVOILUTSequence](../../aspose.medical.dicom.tags/tag/framevoilutsequence) | (0028,9132) VR=SQ VM=1 Frame VOI LUT Sequence. |
| static readonly [FrequencyCorrection](../../aspose.medical.dicom.tags/tag/frequencycorrection) | (0018,9101) VR=CS VM=1 Frequency Correction. |
| static readonly [FrequencyEncodingCodeSequence](../../aspose.medical.dicom.tags/tag/frequencyencodingcodesequence) | (003A,032C) VR=SQ VM=1 Frequency Encoding Code Sequence. |
| static readonly [FrontPanelTemperatureRETIRED](../../aspose.medical.dicom.tags/tag/frontpaneltemperatureretired) | (0014,6021) VR=DS VM=1 Front Panel Temperature (RETIRED). |
| static readonly [FunctionalGroupPointer](../../aspose.medical.dicom.tags/tag/functionalgrouppointer) | (0020,9167) VR=AT VM=1 Functional Group Pointer. |
| static readonly [FunctionalGroupPrivateCreator](../../aspose.medical.dicom.tags/tag/functionalgroupprivatecreator) | (0020,9238) VR=LO VM=1 Functional Group Private Creator. |
| static readonly [FunctionalMRSequence](../../aspose.medical.dicom.tags/tag/functionalmrsequence) | (0018,9621) VR=SQ VM=1 Functional MR Sequence. |
| static readonly [FunctionalSettlingPhaseFramesPresent](../../aspose.medical.dicom.tags/tag/functionalsettlingphaseframespresent) | (0018,9622) VR=CS VM=1 Functional Settling Phase Frames Present. |
| static readonly [FunctionalSyncPulse](../../aspose.medical.dicom.tags/tag/functionalsyncpulse) | (0018,9623) VR=DT VM=1 Functional Sync Pulse. |
| static readonly [GainControl](../../aspose.medical.dicom.tags/tag/gaincontrol) | (0016,0047) VR=US VM=1 Gain Control. |
| static readonly [GainCorrectionReferenceSequenceRETIRED](../../aspose.medical.dicom.tags/tag/gaincorrectionreferencesequenceretired) | (0014,3060) VR=SQ VM=1 Gain Correction Reference Sequence (RETIRED). |
| static readonly [GammaValue](../../aspose.medical.dicom.tags/tag/gammavalue) | (0028,701A) VR=FL VM=1 Gamma Value. |
| static readonly [GantryAngle](../../aspose.medical.dicom.tags/tag/gantryangle) | (300A,011E) VR=DS VM=1 Gantry Angle. |
| static readonly [GantryAngleTolerance](../../aspose.medical.dicom.tags/tag/gantryangletolerance) | (300A,0044) VR=DS VM=1 Gantry Angle Tolerance. |
| static readonly [GantryDetectorSlew](../../aspose.medical.dicom.tags/tag/gantrydetectorslew) | (0018,1121) VR=DS VM=1 Gantry/Detector Slew. |
| static readonly [GantryDetectorTilt](../../aspose.medical.dicom.tags/tag/gantrydetectortilt) | (0018,1120) VR=DS VM=1 Gantry/Detector Tilt. |
| static readonly [GantryID](../../aspose.medical.dicom.tags/tag/gantryid) | (0018,1008) VR=LO VM=1 Gantry ID. |
| static readonly [GantryMotionCorrected](../../aspose.medical.dicom.tags/tag/gantrymotioncorrected) | (0018,9762) VR=CS VM=1 Gantry Motion Corrected. |
| static readonly [GantryPitchAngle](../../aspose.medical.dicom.tags/tag/gantrypitchangle) | (300A,014A) VR=FL VM=1 Gantry Pitch Angle. |
| static readonly [GantryPitchAngleTolerance](../../aspose.medical.dicom.tags/tag/gantrypitchangletolerance) | (300A,014E) VR=FL VM=1 Gantry Pitch Angle Tolerance. |
| static readonly [GantryPitchRotationDirection](../../aspose.medical.dicom.tags/tag/gantrypitchrotationdirection) | (300A,014C) VR=CS VM=1 Gantry Pitch Rotation Direction. |
| static readonly [GantryRotationDirection](../../aspose.medical.dicom.tags/tag/gantryrotationdirection) | (300A,011F) VR=CS VM=1 Gantry Rotation Direction. |
| static readonly [GantryTypeRETIRED](../../aspose.medical.dicom.tags/tag/gantrytyperetired) | (4010,1008) VR=CS VM=1 Gantry Type (RETIRED). |
| static readonly [GapLength](../../aspose.medical.dicom.tags/tag/gaplength) | (0070,0261) VR=FL VM=1 Gap Length. |
| static readonly [GasUsedForHeatingCoolingPartRETIRED](../../aspose.medical.dicom.tags/tag/gasusedforheatingcoolingpartretired) | (0014,603D) VR=LO VM=1 Gas Used for Heating/Cooling Part (RETIRED). |
| static readonly [GatedInformationSequence](../../aspose.medical.dicom.tags/tag/gatedinformationsequence) | (0054,0062) VR=SQ VM=1 Gated Information Sequence. |
| static readonly [GateSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/gatesettingssequenceretired) | (0014,4060) VR=SQ VM=1 Gate Settings Sequence (RETIRED). |
| static readonly [GateThresholdRETIRED](../../aspose.medical.dicom.tags/tag/gatethresholdretired) | (0014,4062) VR=DS VM=1 Gate Threshold (RETIRED). |
| static readonly [GatingBeamHoldTransitionSequence](../../aspose.medical.dicom.tags/tag/gatingbeamholdtransitionsequence) | (300C,0125) VR=SQ VM=1 Gating Beam Hold Transition Sequence. |
| static readonly [GeneralAccessoryDefinitionSequence](../../aspose.medical.dicom.tags/tag/generalaccessorydefinitionsequence) | (300A,0671) VR=SQ VM=1 General Accessory Definition Sequence. |
| static readonly [GeneralAccessoryDescription](../../aspose.medical.dicom.tags/tag/generalaccessorydescription) | (300A,0422) VR=ST VM=1 General Accessory Description. |
| static readonly [GeneralAccessoryID](../../aspose.medical.dicom.tags/tag/generalaccessoryid) | (300A,0421) VR=SH VM=1 General Accessory ID. |
| static readonly [GeneralAccessoryNumber](../../aspose.medical.dicom.tags/tag/generalaccessorynumber) | (300A,0424) VR=IS VM=1 General Accessory Number. |
| static readonly [GeneralAccessorySequence](../../aspose.medical.dicom.tags/tag/generalaccessorysequence) | (300A,0420) VR=SQ VM=1 General Accessory Sequence. |
| static readonly [GeneralAccessoryType](../../aspose.medical.dicom.tags/tag/generalaccessorytype) | (300A,0423) VR=CS VM=1 General Accessory Type. |
| static readonly [GeneralizedDefectCorrectedSensitivityDeviationFlag](../../aspose.medical.dicom.tags/tag/generalizeddefectcorrectedsensitivitydeviationflag) | (0024,0102) VR=CS VM=1 Generalized Defect Corrected Sensitivity Deviation Flag. |
| static readonly [GeneralizedDefectCorrectedSensitivityDeviationProbabilityValue](../../aspose.medical.dicom.tags/tag/generalizeddefectcorrectedsensitivitydeviationprobabilityvalue) | (0024,0104) VR=FL VM=1 Generalized Defect Corrected Sensitivity Deviation Probability Value. |
| static readonly [GeneralizedDefectCorrectedSensitivityDeviationValue](../../aspose.medical.dicom.tags/tag/generalizeddefectcorrectedsensitivitydeviationvalue) | (0024,0103) VR=FL VM=1 Generalized Defect Corrected Sensitivity Deviation Value. |
| static readonly [GeneralizedDefectSensitivityDeviationAlgorithmSequence](../../aspose.medical.dicom.tags/tag/generalizeddefectsensitivitydeviationalgorithmsequence) | (0024,0067) VR=SQ VM=1 Generalized Defect Sensitivity Deviation Algorithm Sequence. |
| static readonly [GeneralMachineVerificationSequence](../../aspose.medical.dicom.tags/tag/generalmachineverificationsequence) | (0074,1042) VR=SQ VM=1 General Machine Verification Sequence. |
| static readonly [GeneralMatchingSequence](../../aspose.medical.dicom.tags/tag/generalmatchingsequence) | (0008,0413) VR=SQ VM=1 General Matching Sequence. |
| static readonly [GeneralPurposePerformedProcedureStepStatusRETIRED](../../aspose.medical.dicom.tags/tag/generalpurposeperformedprocedurestepstatusretired) | (0040,4002) VR=CS VM=1 General Purpose Performed Procedure Step Status (RETIRED). |
| static readonly [GeneralPurposeScheduledProcedureStepPriorityRETIRED](../../aspose.medical.dicom.tags/tag/generalpurposescheduledproceduresteppriorityretired) | (0040,4003) VR=CS VM=1 General Purpose Scheduled Procedure Step Priority (RETIRED). |
| static readonly [GeneralPurposeScheduledProcedureStepStatusRETIRED](../../aspose.medical.dicom.tags/tag/generalpurposescheduledprocedurestepstatusretired) | (0040,4001) VR=CS VM=1 General Purpose Scheduled Procedure Step Status (RETIRED). |
| static readonly [GeneratorID](../../aspose.medical.dicom.tags/tag/generatorid) | (0018,1005) VR=LO VM=1 Generator ID. |
| static readonly [GeneratorPower](../../aspose.medical.dicom.tags/tag/generatorpower) | (0018,1170) VR=IS VM=1 Generator Power. |
| static readonly [GeneticModificationsCodeSequence](../../aspose.medical.dicom.tags/tag/geneticmodificationscodesequence) | (0010,0229) VR=SQ VM=1 Genetic Modifications Code Sequence. |
| static readonly [GeneticModificationsDescription](../../aspose.medical.dicom.tags/tag/geneticmodificationsdescription) | (0010,0222) VR=UC VM=1 Genetic Modifications Description. |
| static readonly [GeneticModificationsNomenclature](../../aspose.medical.dicom.tags/tag/geneticmodificationsnomenclature) | (0010,0223) VR=LO VM=1 Genetic Modifications Nomenclature. |
| static readonly [GeneticModificationsSequence](../../aspose.medical.dicom.tags/tag/geneticmodificationssequence) | (0010,0221) VR=SQ VM=1 Genetic Modifications Sequence. |
| static readonly [GeometricalProperties](../../aspose.medical.dicom.tags/tag/geometricalproperties) | (0028,9444) VR=CS VM=1 Geometrical Properties. |
| static readonly [GeometricMaximumDistortion](../../aspose.medical.dicom.tags/tag/geometricmaximumdistortion) | (0028,9445) VR=FL VM=1 Geometric Maximum Distortion. |
| static readonly [GeometryForDisplay](../../aspose.medical.dicom.tags/tag/geometryfordisplay) | (0070,1B08) VR=CS VM=1 Geometry for Display. |
| static readonly [GeometryOfKSpaceTraversal](../../aspose.medical.dicom.tags/tag/geometryofkspacetraversal) | (0018,9032) VR=CS VM=1 Geometry of k-Space Traversal. |
| static readonly [GlobalCrop](../../aspose.medical.dicom.tags/tag/globalcrop) | (0070,120B) VR=CS VM=1 Global Crop. |
| static readonly [GlobalCroppingSpecificationIndex](../../aspose.medical.dicom.tags/tag/globalcroppingspecificationindex) | (0070,120C) VR=US VM=1-n Global Cropping Specification Index. |
| static readonly [GlobalDeviationFromNormal](../../aspose.medical.dicom.tags/tag/globaldeviationfromnormal) | (0024,0066) VR=FL VM=1 Global Deviation From Normal. |
| static readonly [GlobalDeviationProbability](../../aspose.medical.dicom.tags/tag/globaldeviationprobability) | (0024,0071) VR=FL VM=1 Global Deviation Probability. |
| static readonly [GlobalDeviationProbabilityNormalsFlag](../../aspose.medical.dicom.tags/tag/globaldeviationprobabilitynormalsflag) | (0024,0059) VR=CS VM=1 Global Deviation Probability Normals Flag. |
| static readonly [GlobalDeviationProbabilitySequence](../../aspose.medical.dicom.tags/tag/globaldeviationprobabilitysequence) | (0024,0083) VR=SQ VM=1 Global Deviation Probability Sequence. |
| static readonly [GPSAltitude](../../aspose.medical.dicom.tags/tag/gpsaltitude) | (0016,0076) VR=DS VM=1 GPS Altitude. |
| static readonly [GPSAltitudeRef](../../aspose.medical.dicom.tags/tag/gpsaltituderef) | (0016,0075) VR=US VM=1 GPS Altitude Ref. |
| static readonly [GPSAreaInformation](../../aspose.medical.dicom.tags/tag/gpsareainformation) | (0016,008C) VR=OB VM=1 GPS Area Information. |
| static readonly [GPSDateStamp](../../aspose.medical.dicom.tags/tag/gpsdatestamp) | (0016,008D) VR=DT VM=1 GPS Date Stamp. |
| static readonly [GPSDestBearing](../../aspose.medical.dicom.tags/tag/gpsdestbearing) | (0016,0088) VR=DS VM=1 GPS Dest Bearing. |
| static readonly [GPSDestBearingRef](../../aspose.medical.dicom.tags/tag/gpsdestbearingref) | (0016,0087) VR=CS VM=1 GPS Dest Bearing Ref. |
| static readonly [GPSDestDistance](../../aspose.medical.dicom.tags/tag/gpsdestdistance) | (0016,008A) VR=DS VM=1 GPS Dest Distance. |
| static readonly [GPSDestDistanceRef](../../aspose.medical.dicom.tags/tag/gpsdestdistanceref) | (0016,0089) VR=CS VM=1 GPS Dest Distance Ref. |
| static readonly [GPSDestLatitude](../../aspose.medical.dicom.tags/tag/gpsdestlatitude) | (0016,0084) VR=DS VM=3 GPS Dest Latitude. |
| static readonly [GPSDestLatitudeRef](../../aspose.medical.dicom.tags/tag/gpsdestlatituderef) | (0016,0083) VR=CS VM=1 GPS Dest Latitude Ref. |
| static readonly [GPSDestLongitude](../../aspose.medical.dicom.tags/tag/gpsdestlongitude) | (0016,0086) VR=DS VM=3 GPS Dest Longitude. |
| static readonly [GPSDestLongitudeRef](../../aspose.medical.dicom.tags/tag/gpsdestlongituderef) | (0016,0085) VR=CS VM=1 GPS Dest Longitude Ref. |
| static readonly [GPSDifferential](../../aspose.medical.dicom.tags/tag/gpsdifferential) | (0016,008E) VR=IS VM=1 GPS Differential. |
| static readonly [GPSDOP](../../aspose.medical.dicom.tags/tag/gpsdop) | (0016,007B) VR=DS VM=1 GPS DOP. |
| static readonly [GPSImgDirection](../../aspose.medical.dicom.tags/tag/gpsimgdirection) | (0016,0081) VR=DS VM=1 GPS Img Direction. |
| static readonly [GPSImgDirectionRef](../../aspose.medical.dicom.tags/tag/gpsimgdirectionref) | (0016,0080) VR=CS VM=1 GPS Img Direction Ref. |
| static readonly [GPSLatitude](../../aspose.medical.dicom.tags/tag/gpslatitude) | (0016,0072) VR=DS VM=3 GPS Latitude. |
| static readonly [GPSLatitudeRef](../../aspose.medical.dicom.tags/tag/gpslatituderef) | (0016,0071) VR=CS VM=1 GPS Latitude Ref. |
| static readonly [GPSLongitude](../../aspose.medical.dicom.tags/tag/gpslongitude) | (0016,0074) VR=DS VM=3 GPS Longitude. |
| static readonly [GPSLongitudeRef](../../aspose.medical.dicom.tags/tag/gpslongituderef) | (0016,0073) VR=CS VM=1 GPS Longitude Ref. |
| static readonly [GPSMapDatum](../../aspose.medical.dicom.tags/tag/gpsmapdatum) | (0016,0082) VR=UT VM=1 GPS Map Datum. |
| static readonly [GPSMeasureMode](../../aspose.medical.dicom.tags/tag/gpsmeasuremode) | (0016,007A) VR=CS VM=1 GPS Measure Mode. |
| static readonly [GPSProcessingMethod](../../aspose.medical.dicom.tags/tag/gpsprocessingmethod) | (0016,008B) VR=OB VM=1 GPS Processing Method. |
| static readonly [GPSSatellites](../../aspose.medical.dicom.tags/tag/gpssatellites) | (0016,0078) VR=UT VM=1 GPS Satellites. |
| static readonly [GPSSpeed](../../aspose.medical.dicom.tags/tag/gpsspeed) | (0016,007D) VR=DS VM=1 GPS Speed. |
| static readonly [GPSSpeedRef](../../aspose.medical.dicom.tags/tag/gpsspeedref) | (0016,007C) VR=CS VM=1 GPS Speed Ref. |
| static readonly [GPSStatus](../../aspose.medical.dicom.tags/tag/gpsstatus) | (0016,0079) VR=CS VM=1 GPS Status. |
| static readonly [GPSTimeStamp](../../aspose.medical.dicom.tags/tag/gpstimestamp) | (0016,0077) VR=DT VM=1 GPS Time Stamp. |
| static readonly [GPSTrack](../../aspose.medical.dicom.tags/tag/gpstrack) | (0016,007F) VR=DS VM=1 GPS Track. |
| static readonly [GPSTrackRef](../../aspose.medical.dicom.tags/tag/gpstrackref) | (0016,007E) VR=CS VM=1 GPS Track Ref. |
| static readonly [GPSVersionID](../../aspose.medical.dicom.tags/tag/gpsversionid) | (0016,0070) VR=OB VM=1 GPS Version ID. |
| static readonly [GradientEchoTrainLength](../../aspose.medical.dicom.tags/tag/gradientechotrainlength) | (0018,9241) VR=US VM=1 Gradient Echo Train Length. |
| static readonly [GradientOutput](../../aspose.medical.dicom.tags/tag/gradientoutput) | (0018,9182) VR=FD VM=1 Gradient Output. |
| static readonly [GradientOutputType](../../aspose.medical.dicom.tags/tag/gradientoutputtype) | (0018,9180) VR=CS VM=1 Gradient Output Type. |
| static readonly [GraphicAnnotationSequence](../../aspose.medical.dicom.tags/tag/graphicannotationsequence) | (0070,0001) VR=SQ VM=1 Graphic Annotation Sequence. |
| static readonly [GraphicAnnotationUnits](../../aspose.medical.dicom.tags/tag/graphicannotationunits) | (0070,0005) VR=CS VM=1 Graphic Annotation Units. |
| static readonly [GraphicCoordinatesDataSequence](../../aspose.medical.dicom.tags/tag/graphiccoordinatesdatasequence) | (0070,0318) VR=SQ VM=1 Graphic Coordinates Data Sequence. |
| static readonly [GraphicData](../../aspose.medical.dicom.tags/tag/graphicdata) | (0070,0022) VR=FL VM=2-n Graphic Data. |
| static readonly [GraphicDimensions](../../aspose.medical.dicom.tags/tag/graphicdimensions) | (0070,0020) VR=US VM=1 Graphic Dimensions. |
| static readonly [GraphicFilled](../../aspose.medical.dicom.tags/tag/graphicfilled) | (0070,0024) VR=CS VM=1 Graphic Filled. |
| static readonly [GraphicGroupDescription](../../aspose.medical.dicom.tags/tag/graphicgroupdescription) | (0070,0208) VR=ST VM=1 Graphic Group Description. |
| static readonly [GraphicGroupID](../../aspose.medical.dicom.tags/tag/graphicgroupid) | (0070,0295) VR=UL VM=1 Graphic Group ID. |
| static readonly [GraphicGroupLabel](../../aspose.medical.dicom.tags/tag/graphicgrouplabel) | (0070,0207) VR=LO VM=1 Graphic Group Label. |
| static readonly [GraphicGroupSequence](../../aspose.medical.dicom.tags/tag/graphicgroupsequence) | (0070,0234) VR=SQ VM=1 Graphic Group Sequence. |
| static readonly [GraphicLayer](../../aspose.medical.dicom.tags/tag/graphiclayer) | (0070,0002) VR=CS VM=1 Graphic Layer. |
| static readonly [GraphicLayerDescription](../../aspose.medical.dicom.tags/tag/graphiclayerdescription) | (0070,0068) VR=LO VM=1 Graphic Layer Description. |
| static readonly [GraphicLayerOrder](../../aspose.medical.dicom.tags/tag/graphiclayerorder) | (0070,0062) VR=IS VM=1 Graphic Layer Order. |
| static readonly [GraphicLayerRecommendedDisplayCIELabValue](../../aspose.medical.dicom.tags/tag/graphiclayerrecommendeddisplaycielabvalue) | (0070,0401) VR=US VM=3 Graphic Layer Recommended Display CIELab Value. |
| static readonly [GraphicLayerRecommendedDisplayGrayscaleValue](../../aspose.medical.dicom.tags/tag/graphiclayerrecommendeddisplaygrayscalevalue) | (0070,0066) VR=US VM=1 Graphic Layer Recommended Display Grayscale Value. |
| static readonly [GraphicLayerRecommendedDisplayRGBValueRETIRED](../../aspose.medical.dicom.tags/tag/graphiclayerrecommendeddisplayrgbvalueretired) | (0070,0067) VR=US VM=3 Graphic Layer Recommended Display RGB Value (RETIRED). |
| static readonly [GraphicLayerSequence](../../aspose.medical.dicom.tags/tag/graphiclayersequence) | (0070,0060) VR=SQ VM=1 Graphic Layer Sequence. |
| static readonly [GraphicObjectSequence](../../aspose.medical.dicom.tags/tag/graphicobjectsequence) | (0070,0009) VR=SQ VM=1 Graphic Object Sequence. |
| static readonly [GraphicType](../../aspose.medical.dicom.tags/tag/graphictype) | (0070,0023) VR=CS VM=1 Graphic Type. |
| static readonly [GrayLookupTableDataRETIRED](../../aspose.medical.dicom.tags/tag/graylookuptabledataretired) | (0028,1200) VR=US or SS or OW VM=1-n or 1 Gray Lookup Table Data (RETIRED). |
| static readonly [GrayLookupTableDescriptorRETIRED](../../aspose.medical.dicom.tags/tag/graylookuptabledescriptorretired) | (0028,1100) VR=US or SS VM=3 Gray Lookup Table Descriptor (RETIRED). |
| static readonly [GrayScaleRETIRED](../../aspose.medical.dicom.tags/tag/grayscaleretired) | (0028,1080) VR=CS VM=1 Gray Scale (RETIRED). |
| static readonly [GreenPaletteColorLookupTableData](../../aspose.medical.dicom.tags/tag/greenpalettecolorlookuptabledata) | (0028,1202) VR=OW VM=1 Green Palette Color Lookup Table Data. |
| static readonly [GreenPaletteColorLookupTableDescriptor](../../aspose.medical.dicom.tags/tag/greenpalettecolorlookuptabledescriptor) | (0028,1102) VR=US or SS VM=3 Green Palette Color Lookup Table Descriptor. |
| static readonly [Grid](../../aspose.medical.dicom.tags/tag/grid) | (0018,1166) VR=CS VM=1-n Grid. |
| static readonly [GridAbsorbingMaterial](../../aspose.medical.dicom.tags/tag/gridabsorbingmaterial) | (0018,7040) VR=LT VM=1 Grid Absorbing Material. |
| static readonly [GridAspectRatio](../../aspose.medical.dicom.tags/tag/gridaspectratio) | (0018,7046) VR=IS VM=2 Grid Aspect Ratio. |
| static readonly [GridDimensions](../../aspose.medical.dicom.tags/tag/griddimensions) | (0064,0007) VR=UL VM=3 Grid Dimensions. |
| static readonly [GridFocalDistance](../../aspose.medical.dicom.tags/tag/gridfocaldistance) | (0018,704C) VR=DS VM=1 Grid Focal Distance. |
| static readonly [GridFrameOffsetVector](../../aspose.medical.dicom.tags/tag/gridframeoffsetvector) | (3004,000C) VR=DS VM=2-n Grid Frame Offset Vector. |
| static readonly [GridID](../../aspose.medical.dicom.tags/tag/gridid) | (0018,1006) VR=LO VM=1 Grid ID. |
| static readonly [GridPeriod](../../aspose.medical.dicom.tags/tag/gridperiod) | (0018,7048) VR=DS VM=1 Grid Period. |
| static readonly [GridPitch](../../aspose.medical.dicom.tags/tag/gridpitch) | (0018,7044) VR=DS VM=1 Grid Pitch. |
| static readonly [GridResolution](../../aspose.medical.dicom.tags/tag/gridresolution) | (0064,0008) VR=FD VM=3 Grid Resolution. |
| static readonly [GridSpacingMaterial](../../aspose.medical.dicom.tags/tag/gridspacingmaterial) | (0018,7041) VR=LT VM=1 Grid Spacing Material. |
| static readonly [GridThickness](../../aspose.medical.dicom.tags/tag/gridthickness) | (0018,7042) VR=DS VM=1 Grid Thickness. |
| static readonly [GroupOfPatientsIdentificationSequence](../../aspose.medical.dicom.tags/tag/groupofpatientsidentificationsequence) | (0010,0027) VR=SQ VM=1 Group of Patients Identification Sequence. |
| static readonly [HalfValueLayer](../../aspose.medical.dicom.tags/tag/halfvaluelayer) | (0040,0314) VR=DS VM=1 Half Value Layer. |
| static readonly [HangingProtocolCreationDateTime](../../aspose.medical.dicom.tags/tag/hangingprotocolcreationdatetime) | (0072,000A) VR=DT VM=1 Hanging Protocol Creation DateTime. |
| static readonly [HangingProtocolCreator](../../aspose.medical.dicom.tags/tag/hangingprotocolcreator) | (0072,0008) VR=LO VM=1 Hanging Protocol Creator. |
| static readonly [HangingProtocolDefinitionSequence](../../aspose.medical.dicom.tags/tag/hangingprotocoldefinitionsequence) | (0072,000C) VR=SQ VM=1 Hanging Protocol Definition Sequence. |
| static readonly [HangingProtocolDescription](../../aspose.medical.dicom.tags/tag/hangingprotocoldescription) | (0072,0004) VR=LO VM=1 Hanging Protocol Description. |
| static readonly [HangingProtocolLevel](../../aspose.medical.dicom.tags/tag/hangingprotocollevel) | (0072,0006) VR=CS VM=1 Hanging Protocol Level. |
| static readonly [HangingProtocolName](../../aspose.medical.dicom.tags/tag/hangingprotocolname) | (0072,0002) VR=SH VM=1 Hanging Protocol Name. |
| static readonly [HangingProtocolUserGroupName](../../aspose.medical.dicom.tags/tag/hangingprotocolusergroupname) | (0072,0010) VR=LO VM=1 Hanging Protocol User Group Name. |
| static readonly [HangingProtocolUserIdentificationCodeSequence](../../aspose.medical.dicom.tags/tag/hangingprotocoluseridentificationcodesequence) | (0072,000E) VR=SQ VM=1 Hanging Protocol User Identification Code Sequence. |
| static readonly [HardcopyCreationDeviceIDRETIRED](../../aspose.medical.dicom.tags/tag/hardcopycreationdeviceidretired) | (0018,1011) VR=LO VM=1 Hardcopy Creation Device ID (RETIRED). |
| static readonly [HardcopyDeviceManufacturerModelNameRETIRED](../../aspose.medical.dicom.tags/tag/hardcopydevicemanufacturermodelnameretired) | (0018,101B) VR=LO VM=1 Hardcopy Device Manufacturer's Model Name (RETIRED). |
| static readonly [HardcopyDeviceManufacturerRETIRED](../../aspose.medical.dicom.tags/tag/hardcopydevicemanufacturerretired) | (0018,1017) VR=LO VM=1 Hardcopy Device Manufacturer (RETIRED). |
| static readonly [HardcopyDeviceSoftwareVersionRETIRED](../../aspose.medical.dicom.tags/tag/hardcopydevicesoftwareversionretired) | (0018,101A) VR=LO VM=1-n Hardcopy Device Software Version (RETIRED). |
| static readonly [HeadFixationAngle](../../aspose.medical.dicom.tags/tag/headfixationangle) | (300A,0148) VR=FL VM=1 Head Fixation Angle. |
| static readonly [HeadFixationAngleTolerance](../../aspose.medical.dicom.tags/tag/headfixationangletolerance) | (300A,0152) VR=DS VM=1 Head Fixation Angle Tolerance. |
| static readonly [HeartRate](../../aspose.medical.dicom.tags/tag/heartrate) | (0018,1088) VR=IS VM=1 Heart Rate. |
| static readonly [HeatSourceDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/heatsourcedescriptionretired) | (0014,6043) VR=UT VM=1 Heat Source Description (RETIRED). |
| static readonly [HighBit](../../aspose.medical.dicom.tags/tag/highbit) | (0028,0102) VR=US VM=1 High Bit. |
| static readonly [HighDoseTechniqueType](../../aspose.medical.dicom.tags/tag/highdosetechniquetype) | (300A,00C7) VR=CS VM=1 High-Dose Technique Type. |
| static readonly [HighEnergyDetectorsRETIRED](../../aspose.medical.dicom.tags/tag/highenergydetectorsretired) | (4010,0002) VR=CS VM=1 High Energy Detectors (RETIRED). |
| static readonly [HighRRValue](../../aspose.medical.dicom.tags/tag/highrrvalue) | (0018,1082) VR=IS VM=1 High R-R Value. |
| static readonly [HistogramBinWidth](../../aspose.medical.dicom.tags/tag/histogrambinwidth) | (0060,3008) VR=US VM=1 Histogram Bin Width. |
| static readonly [HistogramData](../../aspose.medical.dicom.tags/tag/histogramdata) | (0060,3020) VR=UL VM=1-n Histogram Data. |
| static readonly [HistogramExplanation](../../aspose.medical.dicom.tags/tag/histogramexplanation) | (0060,3010) VR=LO VM=1 Histogram Explanation. |
| static readonly [HistogramFirstBinValue](../../aspose.medical.dicom.tags/tag/histogramfirstbinvalue) | (0060,3004) VR=US or SS VM=1 Histogram First Bin Value. |
| static readonly [HistogramLastBinValue](../../aspose.medical.dicom.tags/tag/histogramlastbinvalue) | (0060,3006) VR=US or SS VM=1 Histogram Last Bin Value. |
| static readonly [HistogramNumberOfBins](../../aspose.medical.dicom.tags/tag/histogramnumberofbins) | (0060,3002) VR=US VM=1 Histogram Number of Bins. |
| static readonly [HistogramSequence](../../aspose.medical.dicom.tags/tag/histogramsequence) | (0060,3000) VR=SQ VM=1 Histogram Sequence. |
| static readonly [HistologicalDiagnosesCodeSequence](../../aspose.medical.dicom.tags/tag/histologicaldiagnosescodesequence) | (0008,1304) VR=SQ VM=1 Histological Diagnoses Code Sequence. |
| static readonly [HL7DocumentEffectiveTime](../../aspose.medical.dicom.tags/tag/hl7documenteffectivetime) | (0040,E004) VR=DT VM=1 HL7 Document Effective Time. |
| static readonly [HL7DocumentTypeCodeSequence](../../aspose.medical.dicom.tags/tag/hl7documenttypecodesequence) | (0040,E006) VR=SQ VM=1 HL7 Document Type Code Sequence. |
| static readonly [HL7InstanceIdentifier](../../aspose.medical.dicom.tags/tag/hl7instanceidentifier) | (0040,E001) VR=ST VM=1 HL7 Instance Identifier. |
| static readonly [HL7StructuredDocumentReferenceSequence](../../aspose.medical.dicom.tags/tag/hl7structureddocumentreferencesequence) | (0040,A390) VR=SQ VM=1 HL7 Structured Document Reference Sequence. |
| static readonly [HomeCommunityID](../../aspose.medical.dicom.tags/tag/homecommunityid) | (0040,E031) VR=UI VM=1 Home Community ID. |
| static readonly [HorizontalAlignment](../../aspose.medical.dicom.tags/tag/horizontalalignment) | (0070,0242) VR=CS VM=1 Horizontal Alignment. |
| static readonly [HorizontalFieldOfView](../../aspose.medical.dicom.tags/tag/horizontalfieldofview) | (0022,000C) VR=FL VM=1 Horizontal Field of View. |
| static readonly [HorizontalLaserSpotDimensionRETIRED](../../aspose.medical.dicom.tags/tag/horizontallaserspotdimensionretired) | (0014,6013) VR=DS VM=1 Horizontal Laser Spot Dimension (RETIRED). |
| static readonly [HorizontalMovingWindowSizeRETIRED](../../aspose.medical.dicom.tags/tag/horizontalmovingwindowsizeretired) | (0014,6056) VR=DS VM=1 Horizontal Moving Window Size (RETIRED). |
| static readonly [HorizontalOffsetOfSensorRETIRED](../../aspose.medical.dicom.tags/tag/horizontaloffsetofsensorretired) | (0014,3024) VR=DS VM=1 Horizontal Offset of Sensor (RETIRED). |
| static readonly [HorizontalPixelSizeRETIRED](../../aspose.medical.dicom.tags/tag/horizontalpixelsizeretired) | (0014,6024) VR=DS VM=1 Horizontal Pixel Size (RETIRED). |
| static readonly [HorizontalPrismBase](../../aspose.medical.dicom.tags/tag/horizontalprismbase) | (0046,0032) VR=CS VM=1 Horizontal Prism Base. |
| static readonly [HorizontalPrismPower](../../aspose.medical.dicom.tags/tag/horizontalprismpower) | (0046,0030) VR=FD VM=1 Horizontal Prism Power. |
| static readonly [HPGLContourPenNumber](../../aspose.medical.dicom.tags/tag/hpglcontourpennumber) | (0068,6310) VR=US VM=1 HPGL Contour Pen Number. |
| static readonly [HPGLDocument](../../aspose.medical.dicom.tags/tag/hpgldocument) | (0068,6300) VR=OB VM=1 HPGL Document. |
| static readonly [HPGLDocumentID](../../aspose.medical.dicom.tags/tag/hpgldocumentid) | (0068,62D0) VR=US VM=1 HPGL Document ID. |
| static readonly [HPGLDocumentLabel](../../aspose.medical.dicom.tags/tag/hpgldocumentlabel) | (0068,62D5) VR=LO VM=1 HPGL Document Label. |
| static readonly [HPGLDocumentScaling](../../aspose.medical.dicom.tags/tag/hpgldocumentscaling) | (0068,62F2) VR=FD VM=1 HPGL Document Scaling. |
| static readonly [HPGLDocumentSequence](../../aspose.medical.dicom.tags/tag/hpgldocumentsequence) | (0068,62C0) VR=SQ VM=1 HPGL Document Sequence. |
| static readonly [HPGLPenDescription](../../aspose.medical.dicom.tags/tag/hpglpendescription) | (0068,6345) VR=ST VM=1 HPGL Pen Description. |
| static readonly [HPGLPenLabel](../../aspose.medical.dicom.tags/tag/hpglpenlabel) | (0068,6340) VR=LO VM=1 HPGL Pen Label. |
| static readonly [HPGLPenNumber](../../aspose.medical.dicom.tags/tag/hpglpennumber) | (0068,6330) VR=US VM=1 HPGL Pen Number. |
| static readonly [HPGLPenSequence](../../aspose.medical.dicom.tags/tag/hpglpensequence) | (0068,6320) VR=SQ VM=1 HPGL Pen Sequence. |
| static readonly [HuffmanTableSizeRETIRED](../../aspose.medical.dicom.tags/tag/huffmantablesizeretired) | (1000,xxx2) VR=US VM=1 Huffman Table Size (RETIRED). |
| static readonly [HuffmanTableTripletRETIRED](../../aspose.medical.dicom.tags/tag/huffmantabletripletretired) | (1000,xxx3) VR=US VM=3 Huffman Table Triplet (RETIRED). |
| static readonly [HumanPerformerCodeSequence](../../aspose.medical.dicom.tags/tag/humanperformercodesequence) | (0040,4009) VR=SQ VM=1 Human Performer Code Sequence. |
| static readonly [HumanPerformerName](../../aspose.medical.dicom.tags/tag/humanperformername) | (0040,4037) VR=PN VM=1 Human Performer's Name. |
| static readonly [HumanPerformerOrganization](../../aspose.medical.dicom.tags/tag/humanperformerorganization) | (0040,4036) VR=LO VM=1 Human Performer's Organization. |
| static readonly [Humidity](../../aspose.medical.dicom.tags/tag/humidity) | (0016,0031) VR=DS VM=1 Humidity. |
| static readonly [ICCProfile](../../aspose.medical.dicom.tags/tag/iccprofile) | (0028,2000) VR=OB VM=1 ICC Profile. |
| static readonly [IconImageSequence](../../aspose.medical.dicom.tags/tag/iconimagesequence) | (0088,0200) VR=SQ VM=1 Icon Image Sequence. |
| static readonly [IdenticalDocumentsSequence](../../aspose.medical.dicom.tags/tag/identicaldocumentssequence) | (0040,A525) VR=SQ VM=1 Identical Documents Sequence. |
| static readonly [IdentificationDescriptionTrialRETIRED](../../aspose.medical.dicom.tags/tag/identificationdescriptiontrialretired) | (0040,A224) VR=ST VM=1 Identification Description (Trial) (RETIRED). |
| static readonly [IdentifierCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/identifiercodesequencetrialretired) | (0040,A070) VR=SQ VM=1 Identifier Code Sequence (Trial) (RETIRED). |
| static readonly [IdentifierTypeCode](../../aspose.medical.dicom.tags/tag/identifiertypecode) | (0040,0035) VR=CS VM=1 Identifier Type Code. |
| static readonly [IdentifyingCommentsRETIRED](../../aspose.medical.dicom.tags/tag/identifyingcommentsretired) | (0008,4000) VR=LT VM=1 Identifying Comments (RETIRED). |
| static readonly [IdentifyingPrivateElements](../../aspose.medical.dicom.tags/tag/identifyingprivateelements) | (0008,0306) VR=US VM=1-n Identifying Private Elements. |
| static readonly [Illumination](../../aspose.medical.dicom.tags/tag/illumination) | (2010,015E) VR=US VM=1 Illumination. |
| static readonly [IlluminationBandwidth](../../aspose.medical.dicom.tags/tag/illuminationbandwidth) | (0022,0057) VR=FL VM=1 Illumination Bandwidth. |
| static readonly [IlluminationColorCodeSequence](../../aspose.medical.dicom.tags/tag/illuminationcolorcodesequence) | (0048,0108) VR=SQ VM=1 Illumination Color Code Sequence. |
| static readonly [IlluminationPower](../../aspose.medical.dicom.tags/tag/illuminationpower) | (0022,0056) VR=FL VM=1 Illumination Power. |
| static readonly [IlluminationTranslationFlag](../../aspose.medical.dicom.tags/tag/illuminationtranslationflag) | (0018,9828) VR=CS VM=1 Illumination Translation Flag. |
| static readonly [IlluminationTypeCodeSequence](../../aspose.medical.dicom.tags/tag/illuminationtypecodesequence) | (0022,0016) VR=SQ VM=1 Illumination Type Code Sequence. |
| static readonly [IlluminationWaveLength](../../aspose.medical.dicom.tags/tag/illuminationwavelength) | (0022,0055) VR=FL VM=1 Illumination Wave Length. |
| static readonly [IlluminatorTypeCodeSequence](../../aspose.medical.dicom.tags/tag/illuminatortypecodesequence) | (0048,0100) VR=SQ VM=1 Illuminator Type Code Sequence. |
| static readonly [ImageAcquisitionDepth](../../aspose.medical.dicom.tags/tag/imageacquisitiondepth) | (0048,0117) VR=FD VM=1 Image Acquisition Depth. |
| static readonly [ImageAndFluoroscopyAreaDoseProduct](../../aspose.medical.dicom.tags/tag/imageandfluoroscopyareadoseproduct) | (0018,115E) VR=DS VM=1 Image and Fluoroscopy Area Dose Product. |
| static readonly [ImageBoxContentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/imageboxcontentsequenceretired) | (2130,0040) VR=SQ VM=1 Image Box Content Sequence (RETIRED). |
| static readonly [ImageBoxesSequence](../../aspose.medical.dicom.tags/tag/imageboxessequence) | (0072,0300) VR=SQ VM=1 Image Boxes Sequence. |
| static readonly [ImageBoxLargeScrollAmount](../../aspose.medical.dicom.tags/tag/imageboxlargescrollamount) | (0072,0318) VR=US VM=1 Image Box Large Scroll Amount. |
| static readonly [ImageBoxLargeScrollType](../../aspose.medical.dicom.tags/tag/imageboxlargescrolltype) | (0072,0316) VR=CS VM=1 Image Box Large Scroll Type. |
| static readonly [ImageBoxLayoutType](../../aspose.medical.dicom.tags/tag/imageboxlayouttype) | (0072,0304) VR=CS VM=1 Image Box Layout Type. |
| static readonly [ImageBoxNumber](../../aspose.medical.dicom.tags/tag/imageboxnumber) | (0072,0302) VR=US VM=1 Image Box Number. |
| static readonly [ImageBoxOverlapPriority](../../aspose.medical.dicom.tags/tag/imageboxoverlappriority) | (0072,0320) VR=US VM=1 Image Box Overlap Priority. |
| static readonly [ImageBoxPosition](../../aspose.medical.dicom.tags/tag/imageboxposition) | (2020,0010) VR=US VM=1 Image Box Position. |
| static readonly [ImageBoxPresentationLUTFlagRETIRED](../../aspose.medical.dicom.tags/tag/imageboxpresentationlutflagretired) | (2000,006A) VR=CS VM=1 Image Box Presentation LUT Flag (RETIRED). |
| static readonly [ImageBoxScrollDirection](../../aspose.medical.dicom.tags/tag/imageboxscrolldirection) | (0072,0310) VR=CS VM=1 Image Box Scroll Direction. |
| static readonly [ImageBoxSmallScrollAmount](../../aspose.medical.dicom.tags/tag/imageboxsmallscrollamount) | (0072,0314) VR=US VM=1 Image Box Small Scroll Amount. |
| static readonly [ImageBoxSmallScrollType](../../aspose.medical.dicom.tags/tag/imageboxsmallscrolltype) | (0072,0312) VR=CS VM=1 Image Box Small Scroll Type. |
| static readonly [ImageBoxSynchronizationSequence](../../aspose.medical.dicom.tags/tag/imageboxsynchronizationsequence) | (0072,0430) VR=SQ VM=1 Image Box Synchronization Sequence. |
| static readonly [ImageBoxTileHorizontalDimension](../../aspose.medical.dicom.tags/tag/imageboxtilehorizontaldimension) | (0072,0306) VR=US VM=1 Image Box Tile Horizontal Dimension. |
| static readonly [ImageBoxTileVerticalDimension](../../aspose.medical.dicom.tags/tag/imageboxtileverticaldimension) | (0072,0308) VR=US VM=1 Image Box Tile Vertical Dimension. |
| static readonly [ImageCenterPointCoordinatesSequence](../../aspose.medical.dicom.tags/tag/imagecenterpointcoordinatessequence) | (0040,071A) VR=SQ VM=1 Image Center Point Coordinates Sequence. |
| static readonly [ImageComments](../../aspose.medical.dicom.tags/tag/imagecomments) | (0020,4000) VR=LT VM=1 Image Comments. |
| static readonly [ImageDataLocationRETIRED](../../aspose.medical.dicom.tags/tag/imagedatalocationretired) | (0028,08x8) VR=AT VM=1-n Image Data Location (RETIRED). |
| static readonly [ImageDataTypeCodeSequence](../../aspose.medical.dicom.tags/tag/imagedatatypecodesequence) | (0018,9836) VR=SQ VM=1 Image Data Type Code Sequence. |
| static readonly [ImageDataTypeSequence](../../aspose.medical.dicom.tags/tag/imagedatatypesequence) | (0018,9807) VR=SQ VM=1 Image Data Type Sequence. |
| static readonly [ImageDimensionsRETIRED](../../aspose.medical.dicom.tags/tag/imagedimensionsretired) | (0028,0005) VR=US VM=1 Image Dimensions (RETIRED). |
| static readonly [ImageDisplayFormat](../../aspose.medical.dicom.tags/tag/imagedisplayformat) | (2010,0010) VR=ST VM=1 Image Display Format. |
| static readonly [ImagedNucleus](../../aspose.medical.dicom.tags/tag/imagednucleus) | (0018,0085) VR=SH VM=1 Imaged Nucleus. |
| static readonly [ImagedVolumeDepth](../../aspose.medical.dicom.tags/tag/imagedvolumedepth) | (0048,0003) VR=FL VM=1 Imaged Volume Depth. |
| static readonly [ImagedVolumeHeight](../../aspose.medical.dicom.tags/tag/imagedvolumeheight) | (0048,0002) VR=FL VM=1 Imaged Volume Height. |
| static readonly [ImagedVolumeWidth](../../aspose.medical.dicom.tags/tag/imagedvolumewidth) | (0048,0001) VR=FL VM=1 Imaged Volume Width. |
| static readonly [ImageFilter](../../aspose.medical.dicom.tags/tag/imagefilter) | (0018,9320) VR=SH VM=1 Image Filter. |
| static readonly [ImageFilterDescription](../../aspose.medical.dicom.tags/tag/imagefilterdescription) | (0018,9941) VR=UT VM=1 Image Filter Description. |
| static readonly [ImageFilterDetailsSequence](../../aspose.medical.dicom.tags/tag/imagefilterdetailssequence) | (0018,11BF) VR=SQ VM=1 Image Filter Details Sequence. |
| static readonly [ImageFormatRETIRED](../../aspose.medical.dicom.tags/tag/imageformatretired) | (0028,0040) VR=CS VM=1 Image Format (RETIRED). |
| static readonly [ImageFrameOrigin](../../aspose.medical.dicom.tags/tag/imageframeorigin) | (60xx,0051) VR=US VM=1 Image Frame Origin. |
| static readonly [ImageGeometryTypeRETIRED](../../aspose.medical.dicom.tags/tag/imagegeometrytyperetired) | (0020,0070) VR=LO VM=1 Image Geometry Type (RETIRED). |
| static readonly [ImageHorizontalFlip](../../aspose.medical.dicom.tags/tag/imagehorizontalflip) | (0070,0041) VR=CS VM=1 Image Horizontal Flip. |
| static readonly [ImageID](../../aspose.medical.dicom.tags/tag/imageid) | (0054,0400) VR=SH VM=1 Image ID. |
| static readonly [ImageIndex](../../aspose.medical.dicom.tags/tag/imageindex) | (0054,1330) VR=US VM=1 Image Index. |
| static readonly [ImageLaterality](../../aspose.medical.dicom.tags/tag/imagelaterality) | (0020,0062) VR=CS VM=1 Image Laterality. |
| static readonly [ImageLocationRETIRED](../../aspose.medical.dicom.tags/tag/imagelocationretired) | (0028,0200) VR=US VM=1 Image Location (RETIRED). |
| static readonly [ImageOrientationPatient](../../aspose.medical.dicom.tags/tag/imageorientationpatient) | (0020,0037) VR=DS VM=6 Image Orientation (Patient). |
| static readonly [ImageOrientationRETIRED](../../aspose.medical.dicom.tags/tag/imageorientationretired) | (0020,0035) VR=DS VM=6 Image Orientation (RETIRED). |
| static readonly [ImageOrientationSlide](../../aspose.medical.dicom.tags/tag/imageorientationslide) | (0048,0102) VR=DS VM=6 Image Orientation (Slide). |
| static readonly [ImageOrientationVolume](../../aspose.medical.dicom.tags/tag/imageorientationvolume) | (0020,9302) VR=FD VM=6 Image Orientation (Volume). |
| static readonly [ImageOverlayBoxContentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/imageoverlayboxcontentsequenceretired) | (2130,0060) VR=SQ VM=1 Image Overlay Box Content Sequence (RETIRED). |
| static readonly [ImageOverlayFlagRETIRED](../../aspose.medical.dicom.tags/tag/imageoverlayflagretired) | (2000,0067) VR=CS VM=1 Image Overlay Flag (RETIRED). |
| static readonly [ImagePathFilterPassBand](../../aspose.medical.dicom.tags/tag/imagepathfilterpassband) | (0022,0004) VR=US VM=2 Image Path Filter Pass Band. |
| static readonly [ImagePathFilterPassThroughWavelength](../../aspose.medical.dicom.tags/tag/imagepathfilterpassthroughwavelength) | (0022,0003) VR=US VM=1 Image Path Filter Pass-Through Wavelength. |
| static readonly [ImagePathFilterTypeStackCodeSequence](../../aspose.medical.dicom.tags/tag/imagepathfiltertypestackcodesequence) | (0022,0018) VR=SQ VM=1 Image Path Filter Type Stack Code Sequence. |
| static readonly [ImagePlanePixelSpacing](../../aspose.medical.dicom.tags/tag/imageplanepixelspacing) | (3002,0011) VR=DS VM=2 Image Plane Pixel Spacing. |
| static readonly [ImagePositionPatient](../../aspose.medical.dicom.tags/tag/imagepositionpatient) | (0020,0032) VR=DS VM=3 Image Position (Patient). |
| static readonly [ImagePositionRETIRED](../../aspose.medical.dicom.tags/tag/imagepositionretired) | (0020,0030) VR=DS VM=3 Image Position (RETIRED). |
| static readonly [ImagePositionVolume](../../aspose.medical.dicom.tags/tag/imagepositionvolume) | (0020,9301) VR=FD VM=3 Image Position (Volume). |
| static readonly [ImagePresentationCommentsRETIRED](../../aspose.medical.dicom.tags/tag/imagepresentationcommentsretired) | (0028,4000) VR=LT VM=1 Image Presentation Comments (RETIRED). |
| static readonly [ImageProcessingApplied](../../aspose.medical.dicom.tags/tag/imageprocessingapplied) | (0028,9446) VR=CS VM=1-n Image Processing Applied. |
| static readonly [ImageQualityIndicatorMaterialRETIRED](../../aspose.medical.dicom.tags/tag/imagequalityindicatormaterialretired) | (0014,40A1) VR=LO VM=1-n Image Quality Indicator Material (RETIRED). |
| static readonly [ImageQualityIndicatorSizeRETIRED](../../aspose.medical.dicom.tags/tag/imagequalityindicatorsizeretired) | (0014,40A2) VR=LO VM=1-n Image Quality Indicator Size (RETIRED). |
| static readonly [ImageQualityIndicatorTypeRETIRED](../../aspose.medical.dicom.tags/tag/imagequalityindicatortyperetired) | (0014,40A0) VR=LO VM=1-n Image Quality Indicator Type (RETIRED). |
| static readonly [ImageReceptorPositionSequence](../../aspose.medical.dicom.tags/tag/imagereceptorpositionsequence) | (3002,010E) VR=SQ VM=1 Image Receptor Position Sequence. |
| static readonly [ImageRotation](../../aspose.medical.dicom.tags/tag/imagerotation) | (0070,0042) VR=US VM=1 Image Rotation. |
| static readonly [ImageRotationRetiredRETIRED](../../aspose.medical.dicom.tags/tag/imagerotationretiredretired) | (0070,0040) VR=IS VM=1 Image Rotation (Retired) (RETIRED). |
| static readonly [ImagerPixelSpacing](../../aspose.medical.dicom.tags/tag/imagerpixelspacing) | (0018,1164) VR=DS VM=2 Imager Pixel Spacing. |
| static readonly [ImageScaleRepresentationRETIRED](../../aspose.medical.dicom.tags/tag/imagescalerepresentationretired) | (4010,1075) VR=DS VM=1 Image Scale Representation (RETIRED). |
| static readonly [ImageSetLabel](../../aspose.medical.dicom.tags/tag/imagesetlabel) | (0072,0040) VR=LO VM=1 Image Set Label. |
| static readonly [ImageSetNumber](../../aspose.medical.dicom.tags/tag/imagesetnumber) | (0072,0032) VR=US VM=1 Image Set Number. |
| static readonly [ImageSetSelectorCategory](../../aspose.medical.dicom.tags/tag/imagesetselectorcategory) | (0072,0034) VR=CS VM=1 Image Set Selector Category. |
| static readonly [ImageSetSelectorSequence](../../aspose.medical.dicom.tags/tag/imagesetselectorsequence) | (0072,0022) VR=SQ VM=1 Image Set Selector Sequence. |
| static readonly [ImageSetSelectorUsageFlag](../../aspose.medical.dicom.tags/tag/imagesetselectorusageflag) | (0072,0024) VR=CS VM=1 Image Set Selector Usage Flag. |
| static readonly [ImageSetsSequence](../../aspose.medical.dicom.tags/tag/imagesetssequence) | (0072,0020) VR=SQ VM=1 Image Sets Sequence. |
| static readonly [ImagesInAcquisition](../../aspose.medical.dicom.tags/tag/imagesinacquisition) | (0020,1002) VR=IS VM=1 Images in Acquisition. |
| static readonly [ImagesInSeriesRETIRED](../../aspose.medical.dicom.tags/tag/imagesinseriesretired) | (0020,1003) VR=IS VM=1 Images in Series (RETIRED). |
| static readonly [ImagesInStudyRETIRED](../../aspose.medical.dicom.tags/tag/imagesinstudyretired) | (0020,1005) VR=IS VM=1 Images in Study (RETIRED). |
| static readonly [ImageToEquipmentMappingMatrix](../../aspose.medical.dicom.tags/tag/imagetoequipmentmappingmatrix) | (0028,9520) VR=DS VM=16 Image to Equipment Mapping Matrix. |
| static readonly [ImageTransformationMatrixRETIRED](../../aspose.medical.dicom.tags/tag/imagetransformationmatrixretired) | (0018,5210) VR=DS VM=6 Image Transformation Matrix (RETIRED). |
| static readonly [ImageTranslationVectorRETIRED](../../aspose.medical.dicom.tags/tag/imagetranslationvectorretired) | (0018,5212) VR=DS VM=3 Image Translation Vector (RETIRED). |
| static readonly [ImageTriggerDelay](../../aspose.medical.dicom.tags/tag/imagetriggerdelay) | (0018,1067) VR=DS VM=1 Image Trigger Delay. |
| static readonly [ImageType](../../aspose.medical.dicom.tags/tag/imagetype) | (0008,0008) VR=CS VM=2-n Image Type. |
| static readonly [ImageVolumeGeometry](../../aspose.medical.dicom.tags/tag/imagevolumegeometry) | (0070,1208) VR=CS VM=1 Image Volume Geometry. |
| static readonly [ImagingApertureSequence](../../aspose.medical.dicom.tags/tag/imagingaperturesequence) | (3002,0114) VR=SQ VM=1 Imaging Aperture Sequence. |
| static readonly [ImagingApertureSpecificationType](../../aspose.medical.dicom.tags/tag/imagingaperturespecificationtype) | (3002,0115) VR=CS VM=1 Imaging Aperture Specification Type. |
| static readonly [ImagingDeviceLocationMatrixSequence](../../aspose.medical.dicom.tags/tag/imagingdevicelocationmatrixsequence) | (3002,0112) VR=SQ VM=1 Imaging Device Location Matrix Sequence. |
| static readonly [ImagingDeviceLocationParameterSequence](../../aspose.medical.dicom.tags/tag/imagingdevicelocationparametersequence) | (3002,0113) VR=SQ VM=1 Imaging Device Location Parameter Sequence. |
| static readonly [ImagingDeviceSpecificAcquisitionParameters](../../aspose.medical.dicom.tags/tag/imagingdevicespecificacquisitionparameters) | (300A,00CC) VR=LO VM=1-n Imaging Device-Specific Acquisition Parameters. |
| static readonly [ImagingEquipmentToTreatmentDeliveryDeviceRelationshipSequence](../../aspose.medical.dicom.tags/tag/imagingequipmenttotreatmentdeliverydevicerelationshipsequence) | (300A,07A1) VR=SQ VM=1 Imaging Equipment to Treatment Delivery Device Relationship Sequence. |
| static readonly [ImagingFrequency](../../aspose.medical.dicom.tags/tag/imagingfrequency) | (0018,0084) VR=DS VM=1 Imaging Frequency. |
| static readonly [ImagingServiceRequestComments](../../aspose.medical.dicom.tags/tag/imagingservicerequestcomments) | (0040,2400) VR=LT VM=1 Imaging Service Request Comments. |
| static readonly [ImagingSourceLocationSpecificationType](../../aspose.medical.dicom.tags/tag/imagingsourcelocationspecificationtype) | (3002,0111) VR=CS VM=1 Imaging Source Location Specification Type. |
| static readonly [ImagingSourcePositionSequence](../../aspose.medical.dicom.tags/tag/imagingsourcepositionsequence) | (3002,010D) VR=SQ VM=1 Imaging Source Position Sequence. |
| static readonly [ImagingSourceToBeamModifierDefinitionPlaneDistance](../../aspose.medical.dicom.tags/tag/imagingsourcetobeammodifierdefinitionplanedistance) | (3002,012D) VR=FD VM=1 Imaging Source to Beam Modifier Definition Plane Distance. |
| static readonly [ImmersionMedia](../../aspose.medical.dicom.tags/tag/immersionmedia) | (0016,1004) VR=CS VM=1-n Immersion Media. |
| static readonly [ImpedanceMeasurementCurrentType](../../aspose.medical.dicom.tags/tag/impedancemeasurementcurrenttype) | (003A,0316) VR=CS VM=1 Impedance Measurement Current Type. |
| static readonly [ImpedanceMeasurementDateTime](../../aspose.medical.dicom.tags/tag/impedancemeasurementdatetime) | (003A,0314) VR=DT VM=1 Impedance Measurement DateTime. |
| static readonly [ImpedanceMeasurementFrequency](../../aspose.medical.dicom.tags/tag/impedancemeasurementfrequency) | (003A,0315) VR=DS VM=1 Impedance Measurement Frequency. |
| static readonly [ImpedanceValue](../../aspose.medical.dicom.tags/tag/impedancevalue) | (003A,0313) VR=DS VM=1 Impedance Value. |
| static readonly [ImplantAssemblyTemplateIssuer](../../aspose.medical.dicom.tags/tag/implantassemblytemplateissuer) | (0076,0003) VR=LO VM=1 Implant Assembly Template Issuer. |
| static readonly [ImplantAssemblyTemplateName](../../aspose.medical.dicom.tags/tag/implantassemblytemplatename) | (0076,0001) VR=LO VM=1 Implant Assembly Template Name. |
| static readonly [ImplantAssemblyTemplateTargetAnatomySequence](../../aspose.medical.dicom.tags/tag/implantassemblytemplatetargetanatomysequence) | (0076,0010) VR=SQ VM=1 Implant Assembly Template Target Anatomy Sequence. |
| static readonly [ImplantAssemblyTemplateType](../../aspose.medical.dicom.tags/tag/implantassemblytemplatetype) | (0076,000A) VR=CS VM=1 Implant Assembly Template Type. |
| static readonly [ImplantAssemblyTemplateVersion](../../aspose.medical.dicom.tags/tag/implantassemblytemplateversion) | (0076,0006) VR=LO VM=1 Implant Assembly Template Version. |
| static readonly [ImplantName](../../aspose.medical.dicom.tags/tag/implantname) | (0022,1095) VR=LO VM=1 Implant Name. |
| static readonly [ImplantPartNumber](../../aspose.medical.dicom.tags/tag/implantpartnumber) | (0022,1097) VR=LO VM=1 Implant Part Number. |
| static readonly [ImplantRegulatoryDisapprovalCodeSequence](../../aspose.medical.dicom.tags/tag/implantregulatorydisapprovalcodesequence) | (0068,62A0) VR=SQ VM=1 Implant Regulatory Disapproval Code Sequence. |
| static readonly [ImplantSize](../../aspose.medical.dicom.tags/tag/implantsize) | (0068,6210) VR=LO VM=1 Implant Size. |
| static readonly [ImplantTargetAnatomySequence](../../aspose.medical.dicom.tags/tag/implanttargetanatomysequence) | (0068,6230) VR=SQ VM=1 Implant Target Anatomy Sequence. |
| static readonly [ImplantTemplate3DModelSurfaceNumber](../../aspose.medical.dicom.tags/tag/implanttemplate3dmodelsurfacenumber) | (0068,6350) VR=US VM=1-n Implant Template 3D Model Surface Number. |
| static readonly [ImplantTemplateGroupDescription](../../aspose.medical.dicom.tags/tag/implanttemplategroupdescription) | (0078,0010) VR=ST VM=1 Implant Template Group Description. |
| static readonly [ImplantTemplateGroupIssuer](../../aspose.medical.dicom.tags/tag/implanttemplategroupissuer) | (0078,0020) VR=LO VM=1 Implant Template Group Issuer. |
| static readonly [ImplantTemplateGroupMemberID](../../aspose.medical.dicom.tags/tag/implanttemplategroupmemberid) | (0078,002E) VR=US VM=1 Implant Template Group Member ID. |
| static readonly [ImplantTemplateGroupMemberMatching2DCoordinatesSequence](../../aspose.medical.dicom.tags/tag/implanttemplategroupmembermatching2dcoordinatessequence) | (0078,0070) VR=SQ VM=1 Implant Template Group Member Matching 2D Coordinates Sequence. |
| static readonly [ImplantTemplateGroupMembersSequence](../../aspose.medical.dicom.tags/tag/implanttemplategroupmemberssequence) | (0078,002A) VR=SQ VM=1 Implant Template Group Members Sequence. |
| static readonly [ImplantTemplateGroupName](../../aspose.medical.dicom.tags/tag/implanttemplategroupname) | (0078,0001) VR=LO VM=1 Implant Template Group Name. |
| static readonly [ImplantTemplateGroupTargetAnatomySequence](../../aspose.medical.dicom.tags/tag/implanttemplategrouptargetanatomysequence) | (0078,0028) VR=SQ VM=1 Implant Template Group Target Anatomy Sequence. |
| static readonly [ImplantTemplateGroupVariationDimensionName](../../aspose.medical.dicom.tags/tag/implanttemplategroupvariationdimensionname) | (0078,00B2) VR=LO VM=1 Implant Template Group Variation Dimension Name. |
| static readonly [ImplantTemplateGroupVariationDimensionRank](../../aspose.medical.dicom.tags/tag/implanttemplategroupvariationdimensionrank) | (0078,00B8) VR=US VM=1 Implant Template Group Variation Dimension Rank. |
| static readonly [ImplantTemplateGroupVariationDimensionRankSequence](../../aspose.medical.dicom.tags/tag/implanttemplategroupvariationdimensionranksequence) | (0078,00B4) VR=SQ VM=1 Implant Template Group Variation Dimension Rank Sequence. |
| static readonly [ImplantTemplateGroupVariationDimensionSequence](../../aspose.medical.dicom.tags/tag/implanttemplategroupvariationdimensionsequence) | (0078,00B0) VR=SQ VM=1 Implant Template Group Variation Dimension Sequence. |
| static readonly [ImplantTemplateGroupVersion](../../aspose.medical.dicom.tags/tag/implanttemplategroupversion) | (0078,0024) VR=LO VM=1 Implant Template Group Version. |
| static readonly [ImplantTemplateVersion](../../aspose.medical.dicom.tags/tag/implanttemplateversion) | (0068,6221) VR=LO VM=1 Implant Template Version. |
| static readonly [ImplantType](../../aspose.medical.dicom.tags/tag/implanttype) | (0068,6223) VR=CS VM=1 Implant Type. |
| static readonly [ImplantTypeCodeSequence](../../aspose.medical.dicom.tags/tag/implanttypecodesequence) | (0068,63A8) VR=SQ VM=1 Implant Type Code Sequence. |
| static readonly [ImplementationClassUID](../../aspose.medical.dicom.tags/tag/implementationclassuid) | (0002,0012) VR=UI VM=1 Implementation Class UID. |
| static readonly [ImplementationVersionName](../../aspose.medical.dicom.tags/tag/implementationversionname) | (0002,0013) VR=SH VM=1 Implementation Version Name. |
| static readonly [ImpressionsRETIRED](../../aspose.medical.dicom.tags/tag/impressionsretired) | (4008,0300) VR=ST VM=1 Impressions (RETIRED). |
| static readonly [InboundArrivalTypeRETIRED](../../aspose.medical.dicom.tags/tag/inboundarrivaltyperetired) | (4010,1056) VR=CS VM=1 Inbound Arrival Type (RETIRED). |
| static readonly [IncidentAngleRETIRED](../../aspose.medical.dicom.tags/tag/incidentangleretired) | (0014,4052) VR=DS VM=1 Incident Angle (RETIRED). |
| static readonly [IncludeDisplayApplication](../../aspose.medical.dicom.tags/tag/includedisplayapplication) | (2200,0009) VR=CS VM=1 Include Display Application. |
| static readonly [IncludeNonDICOMObjects](../../aspose.medical.dicom.tags/tag/includenondicomobjects) | (2200,0008) VR=CS VM=1 Include Non-DICOM Objects. |
| static readonly [IncludesImagingSubject](../../aspose.medical.dicom.tags/tag/includesimagingsubject) | (0034,0008) VR=CS VM=1 Includes Imaging Subject. |
| static readonly [IncludesInformation](../../aspose.medical.dicom.tags/tag/includesinformation) | (0034,000C) VR=CS VM=1 Includes Information. |
| static readonly [InConcatenationNumber](../../aspose.medical.dicom.tags/tag/inconcatenationnumber) | (0020,9162) VR=US VM=1 In-concatenation Number. |
| static readonly [InConcatenationTotalNumber](../../aspose.medical.dicom.tags/tag/inconcatenationtotalnumber) | (0020,9163) VR=US VM=1 In-concatenation Total Number. |
| static readonly [IncorporatedInventoryInstanceSequence](../../aspose.medical.dicom.tags/tag/incorporatedinventoryinstancesequence) | (0008,0422) VR=SQ VM=1 Incorporated Inventory Instance Sequence. |
| static readonly [IndependentVariableForPolynomialFitRETIRED](../../aspose.medical.dicom.tags/tag/independentvariableforpolynomialfitretired) | (0014,605E) VR=CS VM=1 Independent Variable for Polynomial Fit (RETIRED). |
| static readonly [IndexNormalsFlag](../../aspose.medical.dicom.tags/tag/indexnormalsflag) | (0024,0338) VR=CS VM=1 Index Normals Flag. |
| static readonly [IndexProbability](../../aspose.medical.dicom.tags/tag/indexprobability) | (0024,0341) VR=FL VM=1 Index Probability. |
| static readonly [IndexProbabilitySequence](../../aspose.medical.dicom.tags/tag/indexprobabilitysequence) | (0024,0344) VR=SQ VM=1 Index Probability Sequence. |
| static readonly [IndicationDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/indicationdescriptionretired) | (0014,2018) VR=ST VM=1 Indication Description (RETIRED). |
| static readonly [IndicationDispositionRETIRED](../../aspose.medical.dicom.tags/tag/indicationdispositionretired) | (0014,201C) VR=CS VM=1 Indication Disposition (RETIRED). |
| static readonly [IndicationLabelRETIRED](../../aspose.medical.dicom.tags/tag/indicationlabelretired) | (0014,2016) VR=SH VM=1 Indication Label (RETIRED). |
| static readonly [IndicationNumberRETIRED](../../aspose.medical.dicom.tags/tag/indicationnumberretired) | (0014,2014) VR=IS VM=1 Indication Number (RETIRED). |
| static readonly [IndicationPhysicalPropertySequenceRETIRED](../../aspose.medical.dicom.tags/tag/indicationphysicalpropertysequenceretired) | (0014,2030) VR=SQ VM=1 Indication Physical Property Sequence (RETIRED). |
| static readonly [IndicationROISequenceRETIRED](../../aspose.medical.dicom.tags/tag/indicationroisequenceretired) | (0014,201E) VR=SQ VM=1 Indication ROI Sequence (RETIRED). |
| static readonly [IndicationSequenceRETIRED](../../aspose.medical.dicom.tags/tag/indicationsequenceretired) | (0014,2012) VR=SQ VM=1 Indication Sequence (RETIRED). |
| static readonly [IndicationTypeRETIRED](../../aspose.medical.dicom.tags/tag/indicationtyperetired) | (0014,201A) VR=CS VM=1-n Indication Type (RETIRED). |
| static readonly [InductionHeatingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/inductionheatingsequenceretired) | (0014,602E) VR=SQ VM=1 Induction Heating Sequence (RETIRED). |
| static readonly [InductionSourceSettingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/inductionsourcesettingsequenceretired) | (0014,600C) VR=SQ VM=1 Induction Source Setting Sequence (RETIRED). |
| static readonly [InformationFromManufacturerSequence](../../aspose.medical.dicom.tags/tag/informationfrommanufacturersequence) | (0068,6260) VR=SQ VM=1 Information From Manufacturer Sequence. |
| static readonly [InformationIssueDateTime](../../aspose.medical.dicom.tags/tag/informationissuedatetime) | (0068,6270) VR=DT VM=1 Information Issue DateTime. |
| static readonly [InformationSummary](../../aspose.medical.dicom.tags/tag/informationsummary) | (0068,6280) VR=ST VM=1 Information Summary. |
| static readonly [InitialCineRunState](../../aspose.medical.dicom.tags/tag/initialcinerunstate) | (0018,0042) VR=CS VM=1 Initial Cine Run State. |
| static readonly [InitiatorRETIRED](../../aspose.medical.dicom.tags/tag/initiatorretired) | (0000,0200) VR=AE VM=1 Initiator (RETIRED). |
| static readonly [InnerDiameterRETIRED](../../aspose.medical.dicom.tags/tag/innerdiameterretired) | (0014,0056) VR=DS VM=1 Inner Diameter (RETIRED). |
| static readonly [InPlanePhaseEncodingDirection](../../aspose.medical.dicom.tags/tag/inplanephaseencodingdirection) | (0018,1312) VR=CS VM=1 In-plane Phase Encoding Direction. |
| static readonly [InputAvailabilityFlagRETIRED](../../aspose.medical.dicom.tags/tag/inputavailabilityflagretired) | (0040,4020) VR=CS VM=1 Input Availability Flag (RETIRED). |
| static readonly [InputInformationSequence](../../aspose.medical.dicom.tags/tag/inputinformationsequence) | (0040,4021) VR=SQ VM=1 Input Information Sequence. |
| static readonly [InputReadinessState](../../aspose.medical.dicom.tags/tag/inputreadinessstate) | (0040,4041) VR=CS VM=1 Input Readiness State. |
| static readonly [InputSequencePositionIndex](../../aspose.medical.dicom.tags/tag/inputsequencepositionindex) | (0070,1203) VR=US VM=1 Input Sequence Position Index. |
| static readonly [InspectionSelectionCriteriaRETIRED](../../aspose.medical.dicom.tags/tag/inspectionselectioncriteriaretired) | (4010,107C) VR=CS VM=1 Inspection Selection Criteria (RETIRED). |
| static readonly [InStackPositionNumber](../../aspose.medical.dicom.tags/tag/instackpositionnumber) | (0020,9057) VR=UL VM=1 In-Stack Position Number. |
| static readonly [InstanceAvailability](../../aspose.medical.dicom.tags/tag/instanceavailability) | (0008,0056) VR=CS VM=1 Instance Availability. |
| static readonly [InstanceCoercionDateTime](../../aspose.medical.dicom.tags/tag/instancecoerciondatetime) | (0008,0015) VR=DT VM=1 Instance Coercion DateTime. |
| static readonly [InstanceCreationDate](../../aspose.medical.dicom.tags/tag/instancecreationdate) | (0008,0012) VR=DA VM=1 Instance Creation Date. |
| static readonly [InstanceCreationTime](../../aspose.medical.dicom.tags/tag/instancecreationtime) | (0008,0013) VR=TM VM=1 Instance Creation Time. |
| static readonly [InstanceCreatorUID](../../aspose.medical.dicom.tags/tag/instancecreatoruid) | (0008,0014) VR=UI VM=1 Instance Creator UID. |
| static readonly [InstanceLevelReferencedPerformedProcedureStepSequence](../../aspose.medical.dicom.tags/tag/instancelevelreferencedperformedprocedurestepsequence) | (3010,0044) VR=SQ VM=1 Instance-Level Referenced Performed Procedure Step Sequence. |
| static readonly [InstanceNumber](../../aspose.medical.dicom.tags/tag/instancenumber) | (0020,0013) VR=IS VM=1 Instance Number. |
| static readonly [InstanceOriginStatus](../../aspose.medical.dicom.tags/tag/instanceoriginstatus) | (0400,0600) VR=CS VM=1 Instance Origin Status. |
| static readonly [InstitutionAddress](../../aspose.medical.dicom.tags/tag/institutionaddress) | (0008,0081) VR=ST VM=1 Institution Address. |
| static readonly [InstitutionalDepartmentName](../../aspose.medical.dicom.tags/tag/institutionaldepartmentname) | (0008,1040) VR=LO VM=1 Institutional Department Name. |
| static readonly [InstitutionalDepartmentTypeCodeSequence](../../aspose.medical.dicom.tags/tag/institutionaldepartmenttypecodesequence) | (0008,1041) VR=SQ VM=1 Institutional Department Type Code Sequence. |
| static readonly [InstitutionCodeSequence](../../aspose.medical.dicom.tags/tag/institutioncodesequence) | (0008,0082) VR=SQ VM=1 Institution Code Sequence. |
| static readonly [InstitutionName](../../aspose.medical.dicom.tags/tag/institutionname) | (0008,0080) VR=LO VM=1 Institution Name. |
| static readonly [InstructionDescription](../../aspose.medical.dicom.tags/tag/instructiondescription) | (0018,9917) VR=UT VM=1 Instruction Description. |
| static readonly [InstructionIndex](../../aspose.medical.dicom.tags/tag/instructionindex) | (0018,9915) VR=US VM=1 Instruction Index. |
| static readonly [InstructionPerformanceComment](../../aspose.medical.dicom.tags/tag/instructionperformancecomment) | (0018,991A) VR=UT VM=1 Instruction Performance Comment. |
| static readonly [InstructionPerformedDateTime](../../aspose.medical.dicom.tags/tag/instructionperformeddatetime) | (0018,9919) VR=DT VM=1 Instruction Performed DateTime. |
| static readonly [InstructionPerformedFlag](../../aspose.medical.dicom.tags/tag/instructionperformedflag) | (0018,9918) VR=CS VM=1 Instruction Performed Flag. |
| static readonly [InstructionSequence](../../aspose.medical.dicom.tags/tag/instructionsequence) | (0018,9914) VR=SQ VM=1 Instruction Sequence. |
| static readonly [InstructionText](../../aspose.medical.dicom.tags/tag/instructiontext) | (0018,9916) VR=LO VM=1 Instruction Text. |
| static readonly [InsurancePlanIdentificationRETIRED](../../aspose.medical.dicom.tags/tag/insuranceplanidentificationretired) | (0010,1050) VR=LO VM=1-n Insurance Plan Identification (RETIRED). |
| static readonly [IntegrationTimeRETIRED](../../aspose.medical.dicom.tags/tag/integrationtimeretired) | (0014,6003) VR=DS VM=1 Integration Time (RETIRED). |
| static readonly [IntendedDeliveryDuration](../../aspose.medical.dicom.tags/tag/intendeddeliveryduration) | (3010,007E) VR=US VM=1 Intended Delivery Duration. |
| static readonly [IntendedFractionStartTime](../../aspose.medical.dicom.tags/tag/intendedfractionstarttime) | (3010,0085) VR=TM VM=1-n Intended Fraction Start Time. |
| static readonly [IntendedNumberOfFractions](../../aspose.medical.dicom.tags/tag/intendednumberoffractions) | (300A,0636) VR=US VM=1 Intended Number of Fractions. |
| static readonly [IntendedPhaseEndDate](../../aspose.medical.dicom.tags/tag/intendedphaseenddate) | (3010,004D) VR=DA VM=1 Intended Phase End Date. |
| static readonly [IntendedPhaseStartDate](../../aspose.medical.dicom.tags/tag/intendedphasestartdate) | (3010,004C) VR=DA VM=1 Intended Phase Start Date. |
| static readonly [IntendedRecipientsOfResultsIdentificationSequence](../../aspose.medical.dicom.tags/tag/intendedrecipientsofresultsidentificationsequence) | (0040,1011) VR=SQ VM=1 Intended Recipients of Results Identification Sequence. |
| static readonly [IntendedRTTreatmentPhaseSequence](../../aspose.medical.dicom.tags/tag/intendedrttreatmentphasesequence) | (3010,004B) VR=SQ VM=1 Intended RT Treatment Phase Sequence. |
| static readonly [IntendedStartDayOfWeek](../../aspose.medical.dicom.tags/tag/intendedstartdayofweek) | (3010,0086) VR=LT VM=1 Intended Start Day of Week. |
| static readonly [IntensifierActiveDimensions](../../aspose.medical.dicom.tags/tag/intensifieractivedimensions) | (0018,9428) VR=FL VM=1-2 Intensifier Active Dimension(s). |
| static readonly [IntensifierActiveShape](../../aspose.medical.dicom.tags/tag/intensifieractiveshape) | (0018,9427) VR=CS VM=1 Intensifier Active Shape. |
| static readonly [IntensifierSize](../../aspose.medical.dicom.tags/tag/intensifiersize) | (0018,1162) VR=DS VM=1 Intensifier Size. |
| static readonly [InterlockCodeSequence](../../aspose.medical.dicom.tags/tag/interlockcodesequence) | (300A,0744) VR=SQ VM=1 Interlock Code Sequence. |
| static readonly [InterlockDateTime](../../aspose.medical.dicom.tags/tag/interlockdatetime) | (300A,0741) VR=DT VM=1 Interlock DateTime. |
| static readonly [InterlockDescription](../../aspose.medical.dicom.tags/tag/interlockdescription) | (300A,0742) VR=ST VM=1 Interlock Description. |
| static readonly [InterlockOriginatingDeviceSequence](../../aspose.medical.dicom.tags/tag/interlockoriginatingdevicesequence) | (300A,0743) VR=SQ VM=1 Interlock Originating Device Sequence. |
| static readonly [InterlockOriginDescription](../../aspose.medical.dicom.tags/tag/interlockorigindescription) | (300A,0783) VR=ST VM=1 Interlock Origin Description. |
| static readonly [InterlockResolutionCodeSequence](../../aspose.medical.dicom.tags/tag/interlockresolutioncodesequence) | (300A,0745) VR=SQ VM=1 Interlock Resolution Code Sequence. |
| static readonly [InterlockResolutionUserSequence](../../aspose.medical.dicom.tags/tag/interlockresolutionusersequence) | (300A,0746) VR=SQ VM=1 Interlock Resolution User Sequence. |
| static readonly [InterlockSequence](../../aspose.medical.dicom.tags/tag/interlocksequence) | (300A,0740) VR=SQ VM=1 Interlock Sequence. |
| static readonly [InterMarkerDistance](../../aspose.medical.dicom.tags/tag/intermarkerdistance) | (0050,0019) VR=DS VM=1 Inter-Marker Distance. |
| static readonly [IntermediatePupillaryDistance](../../aspose.medical.dicom.tags/tag/intermediatepupillarydistance) | (0046,0063) VR=FD VM=1 Intermediate Pupillary Distance. |
| static readonly [InternalDetectorFrameTimeRETIRED](../../aspose.medical.dicom.tags/tag/internaldetectorframetimeretired) | (0014,3011) VR=DS VM=1 Internal Detector Frame Time (RETIRED). |
| static readonly [InternationalRouteSegmentRETIRED](../../aspose.medical.dicom.tags/tag/internationalroutesegmentretired) | (4010,1028) VR=CS VM=1 International Route Segment (RETIRED). |
| static readonly [InteroperabilityIndex](../../aspose.medical.dicom.tags/tag/interoperabilityindex) | (0016,0061) VR=CS VM=1 Interoperability Index. |
| static readonly [InteroperabilityVersion](../../aspose.medical.dicom.tags/tag/interoperabilityversion) | (0016,0062) VR=OB VM=1 Interoperability Version. |
| static readonly [InterpolationType](../../aspose.medical.dicom.tags/tag/interpolationtype) | (0052,0039) VR=CS VM=1 Interpolation Type. |
| static readonly [InterpretationApprovalDateRETIRED](../../aspose.medical.dicom.tags/tag/interpretationapprovaldateretired) | (4008,0112) VR=DA VM=1 Interpretation Approval Date (RETIRED). |
| static readonly [InterpretationApprovalTimeRETIRED](../../aspose.medical.dicom.tags/tag/interpretationapprovaltimeretired) | (4008,0113) VR=TM VM=1 Interpretation Approval Time (RETIRED). |
| static readonly [InterpretationApproverSequenceRETIRED](../../aspose.medical.dicom.tags/tag/interpretationapproversequenceretired) | (4008,0111) VR=SQ VM=1 Interpretation Approver Sequence (RETIRED). |
| static readonly [InterpretationAuthorRETIRED](../../aspose.medical.dicom.tags/tag/interpretationauthorretired) | (4008,010C) VR=PN VM=1 Interpretation Author (RETIRED). |
| static readonly [InterpretationDiagnosisCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/interpretationdiagnosiscodesequenceretired) | (4008,0117) VR=SQ VM=1 Interpretation Diagnosis Code Sequence (RETIRED). |
| static readonly [InterpretationDiagnosisDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/interpretationdiagnosisdescriptionretired) | (4008,0115) VR=LT VM=1 Interpretation Diagnosis Description (RETIRED). |
| static readonly [InterpretationIDIssuerRETIRED](../../aspose.medical.dicom.tags/tag/interpretationidissuerretired) | (4008,0202) VR=LO VM=1 Interpretation ID Issuer (RETIRED). |
| static readonly [InterpretationIDRETIRED](../../aspose.medical.dicom.tags/tag/interpretationidretired) | (4008,0200) VR=SH VM=1 Interpretation ID (RETIRED). |
| static readonly [InterpretationRecordedDateRETIRED](../../aspose.medical.dicom.tags/tag/interpretationrecordeddateretired) | (4008,0100) VR=DA VM=1 Interpretation Recorded Date (RETIRED). |
| static readonly [InterpretationRecordedTimeRETIRED](../../aspose.medical.dicom.tags/tag/interpretationrecordedtimeretired) | (4008,0101) VR=TM VM=1 Interpretation Recorded Time (RETIRED). |
| static readonly [InterpretationRecorderRETIRED](../../aspose.medical.dicom.tags/tag/interpretationrecorderretired) | (4008,0102) VR=PN VM=1 Interpretation Recorder (RETIRED). |
| static readonly [InterpretationStatusIDRETIRED](../../aspose.medical.dicom.tags/tag/interpretationstatusidretired) | (4008,0212) VR=CS VM=1 Interpretation Status ID (RETIRED). |
| static readonly [InterpretationTextRETIRED](../../aspose.medical.dicom.tags/tag/interpretationtextretired) | (4008,010B) VR=ST VM=1 Interpretation Text (RETIRED). |
| static readonly [InterpretationTranscriberRETIRED](../../aspose.medical.dicom.tags/tag/interpretationtranscriberretired) | (4008,010A) VR=PN VM=1 Interpretation Transcriber (RETIRED). |
| static readonly [InterpretationTranscriptionDateRETIRED](../../aspose.medical.dicom.tags/tag/interpretationtranscriptiondateretired) | (4008,0108) VR=DA VM=1 Interpretation Transcription Date (RETIRED). |
| static readonly [InterpretationTranscriptionTimeRETIRED](../../aspose.medical.dicom.tags/tag/interpretationtranscriptiontimeretired) | (4008,0109) VR=TM VM=1 Interpretation Transcription Time (RETIRED). |
| static readonly [InterpretationTypeIDRETIRED](../../aspose.medical.dicom.tags/tag/interpretationtypeidretired) | (4008,0210) VR=CS VM=1 Interpretation Type ID (RETIRED). |
| static readonly [IntervalNumberRETIRED](../../aspose.medical.dicom.tags/tag/intervalnumberretired) | (0020,0016) VR=IS VM=1 Interval Number (RETIRED). |
| static readonly [IntervalsAcquired](../../aspose.medical.dicom.tags/tag/intervalsacquired) | (0018,1083) VR=IS VM=1 Intervals Acquired. |
| static readonly [IntervalsRejected](../../aspose.medical.dicom.tags/tag/intervalsrejected) | (0018,1084) VR=IS VM=1 Intervals Rejected. |
| static readonly [InterventionDescription](../../aspose.medical.dicom.tags/tag/interventiondescription) | (0018,003A) VR=ST VM=1 Intervention Description. |
| static readonly [InterventionDrugCodeSequence](../../aspose.medical.dicom.tags/tag/interventiondrugcodesequence) | (0018,0029) VR=SQ VM=1 Intervention Drug Code Sequence. |
| static readonly [InterventionDrugDose](../../aspose.medical.dicom.tags/tag/interventiondrugdose) | (0018,0028) VR=DS VM=1 Intervention Drug Dose. |
| static readonly [InterventionDrugInformationSequence](../../aspose.medical.dicom.tags/tag/interventiondruginformationsequence) | (0018,0026) VR=SQ VM=1 Intervention Drug Information Sequence. |
| static readonly [InterventionDrugName](../../aspose.medical.dicom.tags/tag/interventiondrugname) | (0018,0034) VR=LO VM=1 Intervention Drug Name. |
| static readonly [InterventionDrugStartTime](../../aspose.medical.dicom.tags/tag/interventiondrugstarttime) | (0018,0035) VR=TM VM=1 Intervention Drug Start Time. |
| static readonly [InterventionDrugStopTime](../../aspose.medical.dicom.tags/tag/interventiondrugstoptime) | (0018,0027) VR=TM VM=1 Intervention Drug Stop Time. |
| static readonly [InterventionSequence](../../aspose.medical.dicom.tags/tag/interventionsequence) | (0018,0036) VR=SQ VM=1 Intervention Sequence. |
| static readonly [InterventionStatus](../../aspose.medical.dicom.tags/tag/interventionstatus) | (0018,0038) VR=CS VM=1 Intervention Status. |
| static readonly [IntraocularLensCalculationsLeftEyeSequence](../../aspose.medical.dicom.tags/tag/intraocularlenscalculationslefteyesequence) | (0022,1310) VR=SQ VM=1 Intraocular Lens Calculations Left Eye Sequence. |
| static readonly [IntraocularLensCalculationsRightEyeSequence](../../aspose.medical.dicom.tags/tag/intraocularlenscalculationsrighteyesequence) | (0022,1300) VR=SQ VM=1 Intraocular Lens Calculations Right Eye Sequence. |
| static readonly [IntraOcularPressure](../../aspose.medical.dicom.tags/tag/intraocularpressure) | (0022,000B) VR=FL VM=1 Intra Ocular Pressure. |
| static readonly [IntravascularFrameContentSequence](../../aspose.medical.dicom.tags/tag/intravascularframecontentsequence) | (0052,0027) VR=SQ VM=1 Intravascular Frame Content Sequence. |
| static readonly [IntravascularLongitudinalDistance](../../aspose.medical.dicom.tags/tag/intravascularlongitudinaldistance) | (0052,0028) VR=FD VM=1 Intravascular Longitudinal Distance. |
| static readonly [IntravascularOCTFrameContentSequence](../../aspose.medical.dicom.tags/tag/intravascularoctframecontentsequence) | (0052,0029) VR=SQ VM=1 Intravascular OCT Frame Content Sequence. |
| static readonly [IntravascularOCTFrameTypeSequence](../../aspose.medical.dicom.tags/tag/intravascularoctframetypesequence) | (0052,0025) VR=SQ VM=1 Intravascular OCT Frame Type Sequence. |
| static readonly [InventoriedInstancesSequence](../../aspose.medical.dicom.tags/tag/inventoriedinstancessequence) | (0008,0425) VR=SQ VM=1 Inventoried Instances Sequence. |
| static readonly [InventoriedSeriesSequence](../../aspose.medical.dicom.tags/tag/inventoriedseriessequence) | (0008,0424) VR=SQ VM=1 Inventoried Series Sequence. |
| static readonly [InventoriedStudiesSequence](../../aspose.medical.dicom.tags/tag/inventoriedstudiessequence) | (0008,0423) VR=SQ VM=1 Inventoried Studies Sequence. |
| static readonly [InventoryAccessEndPointsSequence](../../aspose.medical.dicom.tags/tag/inventoryaccessendpointssequence) | (0008,0420) VR=SQ VM=1 Inventory Access End Points Sequence. |
| static readonly [InventoryCompletionStatus](../../aspose.medical.dicom.tags/tag/inventorycompletionstatus) | (0008,0426) VR=CS VM=1 Inventory Completion Status. |
| static readonly [InventoryInstanceDescription](../../aspose.medical.dicom.tags/tag/inventoryinstancedescription) | (0008,0402) VR=LT VM=1 Inventory Instance Description. |
| static readonly [InventoryLevel](../../aspose.medical.dicom.tags/tag/inventorylevel) | (0008,0403) VR=CS VM=1 Inventory Level. |
| static readonly [InventoryPurpose](../../aspose.medical.dicom.tags/tag/inventorypurpose) | (0008,0401) VR=LT VM=1 Inventory Purpose. |
| static readonly [InversionRecovery](../../aspose.medical.dicom.tags/tag/inversionrecovery) | (0018,9009) VR=CS VM=1 Inversion Recovery. |
| static readonly [InversionTime](../../aspose.medical.dicom.tags/tag/inversiontime) | (0018,0082) VR=DS VM=1 Inversion Time. |
| static readonly [InversionTimes](../../aspose.medical.dicom.tags/tag/inversiontimes) | (0018,9079) VR=FD VM=1-n Inversion Times. |
| static readonly [IOLFormulaCodeSequence](../../aspose.medical.dicom.tags/tag/iolformulacodesequence) | (0022,1028) VR=SQ VM=1 IOL Formula Code Sequence. |
| static readonly [IOLFormulaDetail](../../aspose.medical.dicom.tags/tag/iolformuladetail) | (0022,1029) VR=LO VM=1 IOL Formula Detail. |
| static readonly [IOLManufacturer](../../aspose.medical.dicom.tags/tag/iolmanufacturer) | (0022,1093) VR=LO VM=1 IOL Manufacturer. |
| static readonly [IOLPower](../../aspose.medical.dicom.tags/tag/iolpower) | (0022,1053) VR=FL VM=1 IOL Power. |
| static readonly [IOLPowerForExactEmmetropia](../../aspose.medical.dicom.tags/tag/iolpowerforexactemmetropia) | (0022,1121) VR=FL VM=1 IOL Power For Exact Emmetropia. |
| static readonly [IOLPowerForExactTargetRefraction](../../aspose.medical.dicom.tags/tag/iolpowerforexacttargetrefraction) | (0022,1122) VR=FL VM=1 IOL Power For Exact Target Refraction. |
| static readonly [IOLPowerSequence](../../aspose.medical.dicom.tags/tag/iolpowersequence) | (0022,1090) VR=SQ VM=1 IOL Power Sequence. |
| static readonly [IonBeamLimitingDeviceSequence](../../aspose.medical.dicom.tags/tag/ionbeamlimitingdevicesequence) | (300A,03A4) VR=SQ VM=1 Ion Beam Limiting Device Sequence. |
| static readonly [IonBeamSequence](../../aspose.medical.dicom.tags/tag/ionbeamsequence) | (300A,03A2) VR=SQ VM=1 Ion Beam Sequence. |
| static readonly [IonBlockSequence](../../aspose.medical.dicom.tags/tag/ionblocksequence) | (300A,03A6) VR=SQ VM=1 Ion Block Sequence. |
| static readonly [IonControlPointDeliverySequence](../../aspose.medical.dicom.tags/tag/ioncontrolpointdeliverysequence) | (3008,0041) VR=SQ VM=1 Ion Control Point Delivery Sequence. |
| static readonly [IonControlPointSequence](../../aspose.medical.dicom.tags/tag/ioncontrolpointsequence) | (300A,03A8) VR=SQ VM=1 Ion Control Point Sequence. |
| static readonly [IonControlPointVerificationSequence](../../aspose.medical.dicom.tags/tag/ioncontrolpointverificationsequence) | (0074,104E) VR=SQ VM=1 Ion Control Point Verification Sequence. |
| static readonly [IonMachineVerificationSequence](../../aspose.medical.dicom.tags/tag/ionmachineverificationsequence) | (0074,1046) VR=SQ VM=1 Ion Machine Verification Sequence. |
| static readonly [IonRangeCompensatorSequence](../../aspose.medical.dicom.tags/tag/ionrangecompensatorsequence) | (300A,02EA) VR=SQ VM=1 Ion Range Compensator Sequence. |
| static readonly [IonToleranceTableSequence](../../aspose.medical.dicom.tags/tag/iontolerancetablesequence) | (300A,03A0) VR=SQ VM=1 Ion Tolerance Table Sequence. |
| static readonly [IonWedgePositionSequence](../../aspose.medical.dicom.tags/tag/ionwedgepositionsequence) | (300A,03AC) VR=SQ VM=1 Ion Wedge Position Sequence. |
| static readonly [IonWedgeSequence](../../aspose.medical.dicom.tags/tag/ionwedgesequence) | (300A,03AA) VR=SQ VM=1 Ion Wedge Sequence. |
| static readonly [IrradiationEventIdentificationSequence](../../aspose.medical.dicom.tags/tag/irradiationeventidentificationsequence) | (0018,9477) VR=SQ VM=1 Irradiation Event Identification Sequence. |
| static readonly [IrradiationEventUID](../../aspose.medical.dicom.tags/tag/irradiationeventuid) | (0008,3010) VR=UI VM=1-n Irradiation Event UID. |
| static readonly [IsocenterPosition](../../aspose.medical.dicom.tags/tag/isocenterposition) | (300A,012C) VR=DS VM=3 Isocenter Position. |
| static readonly [IsocenterReferenceSystemSequence](../../aspose.medical.dicom.tags/tag/isocenterreferencesystemsequence) | (0018,9462) VR=SQ VM=1 Isocenter Reference System Sequence. |
| static readonly [IsocenterToBeamLimitingDeviceDistance](../../aspose.medical.dicom.tags/tag/isocentertobeamlimitingdevicedistance) | (300A,00BB) VR=FL VM=1 Isocenter to Beam Limiting Device Distance. |
| static readonly [IsocenterToBlockTrayDistance](../../aspose.medical.dicom.tags/tag/isocentertoblocktraydistance) | (300A,00F7) VR=FL VM=1 Isocenter to Block Tray Distance. |
| static readonly [IsocenterToCompensatorDistances](../../aspose.medical.dicom.tags/tag/isocentertocompensatordistances) | (300A,02E6) VR=FL VM=1-n Isocenter to Compensator Distances. |
| static readonly [IsocenterToCompensatorTrayDistance](../../aspose.medical.dicom.tags/tag/isocentertocompensatortraydistance) | (300A,02E4) VR=FL VM=1 Isocenter to Compensator Tray Distance. |
| static readonly [IsocenterToGeneralAccessoryDistance](../../aspose.medical.dicom.tags/tag/isocentertogeneralaccessorydistance) | (300A,0426) VR=DS VM=1 Isocenter to General Accessory Distance. |
| static readonly [IsocenterToLateralSpreadingDeviceDistance](../../aspose.medical.dicom.tags/tag/isocentertolateralspreadingdevicedistance) | (300A,0374) VR=FL VM=1 Isocenter to Lateral Spreading Device Distance. |
| static readonly [IsocenterToRangeModulatorDistance](../../aspose.medical.dicom.tags/tag/isocentertorangemodulatordistance) | (300A,038A) VR=FL VM=1 Isocenter to Range Modulator Distance. |
| static readonly [IsocenterToRangeShifterDistance](../../aspose.medical.dicom.tags/tag/isocentertorangeshifterdistance) | (300A,0364) VR=FL VM=1 Isocenter to Range Shifter Distance. |
| static readonly [IsocenterToWedgeTrayDistance](../../aspose.medical.dicom.tags/tag/isocentertowedgetraydistance) | (300A,00D9) VR=FL VM=1 Isocenter to Wedge Tray Distance. |
| static readonly [ISOSpeed](../../aspose.medical.dicom.tags/tag/isospeed) | (0016,001D) VR=IS VM=1 ISO Speed. |
| static readonly [ISOSpeedLatitudeyyy](../../aspose.medical.dicom.tags/tag/isospeedlatitudeyyy) | (0016,001E) VR=IS VM=1 ISO Speed Latitude yyy. |
| static readonly [ISOSpeedLatitudezzz](../../aspose.medical.dicom.tags/tag/isospeedlatitudezzz) | (0016,001F) VR=IS VM=1 ISO Speed Latitude zzz. |
| static readonly [IsotopeNumberRETIRED](../../aspose.medical.dicom.tags/tag/isotopenumberretired) | (0020,0014) VR=IS VM=1 Isotope Number (RETIRED). |
| static readonly [IssueDateOfImagingServiceRequest](../../aspose.medical.dicom.tags/tag/issuedateofimagingservicerequest) | (0040,2004) VR=DA VM=1 Issue Date of Imaging Service Request. |
| static readonly [IssuerOfAccessionNumberSequence](../../aspose.medical.dicom.tags/tag/issuerofaccessionnumbersequence) | (0008,0051) VR=SQ VM=1 Issuer of Accession Number Sequence. |
| static readonly [IssuerOfAdmissionIDRETIRED](../../aspose.medical.dicom.tags/tag/issuerofadmissionidretired) | (0038,0011) VR=LO VM=1 Issuer of Admission ID (RETIRED). |
| static readonly [IssuerOfAdmissionIDSequence](../../aspose.medical.dicom.tags/tag/issuerofadmissionidsequence) | (0038,0014) VR=SQ VM=1 Issuer of Admission ID Sequence. |
| static readonly [IssuerOfClinicalTrialProtocolID](../../aspose.medical.dicom.tags/tag/issuerofclinicaltrialprotocolid) | (0012,0022) VR=LO VM=1 Issuer of Clinical Trial Protocol ID. |
| static readonly [IssuerOfClinicalTrialSeriesID](../../aspose.medical.dicom.tags/tag/issuerofclinicaltrialseriesid) | (0012,0073) VR=LO VM=1 Issuer of Clinical Trial Series ID. |
| static readonly [IssuerOfClinicalTrialSiteID](../../aspose.medical.dicom.tags/tag/issuerofclinicaltrialsiteid) | (0012,0032) VR=LO VM=1 Issuer of Clinical Trial Site ID. |
| static readonly [IssuerOfClinicalTrialSubjectID](../../aspose.medical.dicom.tags/tag/issuerofclinicaltrialsubjectid) | (0012,0041) VR=LO VM=1 Issuer of Clinical Trial Subject ID. |
| static readonly [IssuerOfClinicalTrialSubjectReadingID](../../aspose.medical.dicom.tags/tag/issuerofclinicaltrialsubjectreadingid) | (0012,0043) VR=LO VM=1 Issuer of Clinical Trial Subject Reading ID. |
| static readonly [IssuerOfClinicalTrialTimePointID](../../aspose.medical.dicom.tags/tag/issuerofclinicaltrialtimepointid) | (0012,0055) VR=LO VM=1 Issuer of Clinical Trial Time Point ID. |
| static readonly [IssuerOfPatientID](../../aspose.medical.dicom.tags/tag/issuerofpatientid) | (0010,0021) VR=LO VM=1 Issuer of Patient ID. |
| static readonly [IssuerOfPatientIDQualifiersSequence](../../aspose.medical.dicom.tags/tag/issuerofpatientidqualifierssequence) | (0010,0024) VR=SQ VM=1 Issuer of Patient ID Qualifiers Sequence. |
| static readonly [IssuerOfServiceEpisodeIDRETIRED](../../aspose.medical.dicom.tags/tag/issuerofserviceepisodeidretired) | (0038,0061) VR=LO VM=1 Issuer of Service Episode ID (RETIRED). |
| static readonly [IssuerOfServiceEpisodeIDSequence](../../aspose.medical.dicom.tags/tag/issuerofserviceepisodeidsequence) | (0038,0064) VR=SQ VM=1 Issuer of Service Episode ID Sequence. |
| static readonly [IssuerOfTheContainerIdentifierSequence](../../aspose.medical.dicom.tags/tag/issuerofthecontaineridentifiersequence) | (0040,0513) VR=SQ VM=1 Issuer of the Container Identifier Sequence. |
| static readonly [IssuerOfTheSpecimenIdentifierSequence](../../aspose.medical.dicom.tags/tag/issuerofthespecimenidentifiersequence) | (0040,0562) VR=SQ VM=1 Issuer of the Specimen Identifier Sequence. |
| static readonly [IssueTimeOfImagingServiceRequest](../../aspose.medical.dicom.tags/tag/issuetimeofimagingservicerequest) | (0040,2005) VR=TM VM=1 Issue Time of Imaging Service Request. |
| static readonly [Italic](../../aspose.medical.dicom.tags/tag/italic) | (0070,0250) VR=CS VM=1 Italic. |
| static readonly [Item](../../aspose.medical.dicom.tags/tag/item) | (FFFE,E000) VR=NONE VM=1 Item. |
| static readonly [ItemDelimitationItem](../../aspose.medical.dicom.tags/tag/itemdelimitationitem) | (FFFE,E00D) VR=NONE VM=1 Item Delimitation Item. |
| static readonly [ItemInventoryDateTime](../../aspose.medical.dicom.tags/tag/iteminventorydatetime) | (0008,0404) VR=DT VM=1 Item Inventory DateTime. |
| static readonly [ItemNumber](../../aspose.medical.dicom.tags/tag/itemnumber) | (0020,0019) VR=IS VM=1 Item Number. |
| static readonly [IterativeReconstructionMethod](../../aspose.medical.dicom.tags/tag/iterativereconstructionmethod) | (0018,9769) VR=CS VM=1 Iterative Reconstruction Method. |
| static readonly [ItineraryIDAssigningAuthorityRETIRED](../../aspose.medical.dicom.tags/tag/itineraryidassigningauthorityretired) | (4010,1053) VR=LO VM=1 Itinerary ID Assigning Authority (RETIRED). |
| static readonly [ItineraryIDRETIRED](../../aspose.medical.dicom.tags/tag/itineraryidretired) | (4010,1051) VR=LO VM=1 Itinerary ID (RETIRED). |
| static readonly [ItineraryIDTypeRETIRED](../../aspose.medical.dicom.tags/tag/itineraryidtyperetired) | (4010,1052) VR=SH VM=1 Itinerary ID Type (RETIRED). |
| static readonly [IVUSAcquisition](../../aspose.medical.dicom.tags/tag/ivusacquisition) | (0018,3100) VR=CS VM=1 IVUS Acquisition. |
| static readonly [IVUSGatedRate](../../aspose.medical.dicom.tags/tag/ivusgatedrate) | (0018,3102) VR=DS VM=1 IVUS Gated Rate. |
| static readonly [IVUSPullbackRate](../../aspose.medical.dicom.tags/tag/ivuspullbackrate) | (0018,3101) VR=DS VM=1 IVUS Pullback Rate. |
| static readonly [IVUSPullbackStartFrameNumber](../../aspose.medical.dicom.tags/tag/ivuspullbackstartframenumber) | (0018,3103) VR=IS VM=1 IVUS Pullback Start Frame Number. |
| static readonly [IVUSPullbackStopFrameNumber](../../aspose.medical.dicom.tags/tag/ivuspullbackstopframenumber) | (0018,3104) VR=IS VM=1 IVUS Pullback Stop Frame Number. |
| static readonly [KeratoconusPredictionIndex](../../aspose.medical.dicom.tags/tag/keratoconuspredictionindex) | (0046,0236) VR=FL VM=1 Keratoconus Prediction Index. |
| static readonly [KeratometerIndex](../../aspose.medical.dicom.tags/tag/keratometerindex) | (0022,1033) VR=FL VM=1 Keratometer Index. |
| static readonly [KeratometricAxis](../../aspose.medical.dicom.tags/tag/keratometricaxis) | (0046,0077) VR=FD VM=1 Keratometric Axis. |
| static readonly [KeratometricPower](../../aspose.medical.dicom.tags/tag/keratometricpower) | (0046,0076) VR=FD VM=1 Keratometric Power. |
| static readonly [KeratometryLeftEyeSequence](../../aspose.medical.dicom.tags/tag/keratometrylefteyesequence) | (0046,0071) VR=SQ VM=1 Keratometry Left Eye Sequence. |
| static readonly [KeratometryMeasurementTypeCodeSequence](../../aspose.medical.dicom.tags/tag/keratometrymeasurementtypecodesequence) | (0022,1096) VR=SQ VM=1 Keratometry Measurement Type Code Sequence. |
| static readonly [KeratometryRightEyeSequence](../../aspose.medical.dicom.tags/tag/keratometryrighteyesequence) | (0046,0070) VR=SQ VM=1 Keratometry Right Eye Sequence. |
| static readonly [KSpaceFiltering](../../aspose.medical.dicom.tags/tag/kspacefiltering) | (0018,9064) VR=CS VM=1 k-space Filtering. |
| static readonly [KVImagingGenerationParametersSequence](../../aspose.medical.dicom.tags/tag/kvimaginggenerationparameterssequence) | (3002,0127) VR=SQ VM=1 KV Imaging Generation Parameters Sequence. |
| static readonly [KVP](../../aspose.medical.dicom.tags/tag/kvp) | (0018,0060) VR=DS VM=1 KVP. |
| static readonly [KVUsedInGainCalibrationRETIRED](../../aspose.medical.dicom.tags/tag/kvusedingaincalibrationretired) | (0014,3071) VR=DS VM=1 KV Used in Gain Calibration (RETIRED). |
| static readonly [LabelStyleSelection](../../aspose.medical.dicom.tags/tag/labelstyleselection) | (2200,0003) VR=CS VM=1 Label Style Selection. |
| static readonly [LabelText](../../aspose.medical.dicom.tags/tag/labeltext) | (2200,0002) VR=UT VM=1 Label Text. |
| static readonly [LabelUsingInformationExtractedFromInstances](../../aspose.medical.dicom.tags/tag/labelusinginformationextractedfrominstances) | (2200,0001) VR=CS VM=1 Label Using Information Extracted From Instances. |
| static readonly [LanguageCodeSequence](../../aspose.medical.dicom.tags/tag/languagecodesequence) | (0008,0006) VR=SQ VM=1 Language Code Sequence. |
| static readonly [LanguageCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/languagecodesequencetrialretired) | (0040,A744) VR=SQ VM=1 Language Code Sequence (Trial) (RETIRED). |
| static readonly [LargeBluePaletteColorLookupTableDataRETIRED](../../aspose.medical.dicom.tags/tag/largebluepalettecolorlookuptabledataretired) | (0028,1213) VR=OW VM=1 Large Blue Palette Color Lookup Table Data (RETIRED). |
| static readonly [LargeBluePaletteColorLookupTableDescriptorRETIRED](../../aspose.medical.dicom.tags/tag/largebluepalettecolorlookuptabledescriptorretired) | (0028,1113) VR=US or SS VM=4 Large Blue Palette Color Lookup Table Descriptor (RETIRED). |
| static readonly [LargeGreenPaletteColorLookupTableDataRETIRED](../../aspose.medical.dicom.tags/tag/largegreenpalettecolorlookuptabledataretired) | (0028,1212) VR=OW VM=1 Large Green Palette Color Lookup Table Data (RETIRED). |
| static readonly [LargeGreenPaletteColorLookupTableDescriptorRETIRED](../../aspose.medical.dicom.tags/tag/largegreenpalettecolorlookuptabledescriptorretired) | (0028,1112) VR=US or SS VM=4 Large Green Palette Color Lookup Table Descriptor (RETIRED). |
| static readonly [LargePaletteColorLookupTableUIDRETIRED](../../aspose.medical.dicom.tags/tag/largepalettecolorlookuptableuidretired) | (0028,1214) VR=UI VM=1 Large Palette Color Lookup Table UID (RETIRED). |
| static readonly [LargeRedPaletteColorLookupTableDataRETIRED](../../aspose.medical.dicom.tags/tag/largeredpalettecolorlookuptabledataretired) | (0028,1211) VR=OW VM=1 Large Red Palette Color Lookup Table Data (RETIRED). |
| static readonly [LargeRedPaletteColorLookupTableDescriptorRETIRED](../../aspose.medical.dicom.tags/tag/largeredpalettecolorlookuptabledescriptorretired) | (0028,1111) VR=US or SS VM=4 Large Red Palette Color Lookup Table Descriptor (RETIRED). |
| static readonly [LargestImagePixelValue](../../aspose.medical.dicom.tags/tag/largestimagepixelvalue) | (0028,0107) VR=US or SS VM=1 Largest Image Pixel Value. |
| static readonly [LargestImagePixelValueInPlaneRETIRED](../../aspose.medical.dicom.tags/tag/largestimagepixelvalueinplaneretired) | (0028,0111) VR=US or SS VM=1 Largest Image Pixel Value in Plane (RETIRED). |
| static readonly [LargestMonochromePixelValueRETIRED](../../aspose.medical.dicom.tags/tag/largestmonochromepixelvalueretired) | (0028,9099) VR=US VM=1 Largest Monochrome Pixel Value (RETIRED). |
| static readonly [LargestPixelValueInSeries](../../aspose.medical.dicom.tags/tag/largestpixelvalueinseries) | (0028,0109) VR=US or SS VM=1 Largest Pixel Value in Series. |
| static readonly [LargestValidPixelValueRETIRED](../../aspose.medical.dicom.tags/tag/largestvalidpixelvalueretired) | (0028,0105) VR=US or SS VM=1 Largest Valid Pixel Value (RETIRED). |
| static readonly [LaserHeatingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/laserheatingsequenceretired) | (0014,6038) VR=SQ VM=1 Laser Heating Sequence (RETIRED). |
| static readonly [LaserManufacturerRETIRED](../../aspose.medical.dicom.tags/tag/lasermanufacturerretired) | (0014,6039) VR=LO VM=1 Laser Manufacturer (RETIRED). |
| static readonly [LaserModelNumberRETIRED](../../aspose.medical.dicom.tags/tag/lasermodelnumberretired) | (0014,603A) VR=LO VM=1 Laser Model Number (RETIRED). |
| static readonly [LaserPowerRETIRED](../../aspose.medical.dicom.tags/tag/laserpowerretired) | (0014,6016) VR=DS VM=1 Laser Power (RETIRED). |
| static readonly [LaserSourceSettingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/lasersourcesettingsequenceretired) | (0014,6012) VR=SQ VM=1 Laser Source Setting Sequence (RETIRED). |
| static readonly [LaserTypeDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/lasertypedescriptionretired) | (0014,603B) VR=ST VM=1 Laser Type Description (RETIRED). |
| static readonly [LaserWavelengthRETIRED](../../aspose.medical.dicom.tags/tag/laserwavelengthretired) | (0014,6015) VR=DS VM=1 Laser Wavelength (RETIRED). |
| static readonly [LastMenstrualDate](../../aspose.medical.dicom.tags/tag/lastmenstrualdate) | (0010,21D0) VR=DA VM=1 Last Menstrual Date. |
| static readonly [Laterality](../../aspose.medical.dicom.tags/tag/laterality) | (0020,0060) VR=CS VM=1 Laterality. |
| static readonly [LateralSpreadingDeviceDescription](../../aspose.medical.dicom.tags/tag/lateralspreadingdevicedescription) | (300A,033A) VR=LO VM=1 Lateral Spreading Device Description. |
| static readonly [LateralSpreadingDeviceID](../../aspose.medical.dicom.tags/tag/lateralspreadingdeviceid) | (300A,0336) VR=SH VM=1 Lateral Spreading Device ID. |
| static readonly [LateralSpreadingDeviceNumber](../../aspose.medical.dicom.tags/tag/lateralspreadingdevicenumber) | (300A,0334) VR=IS VM=1 Lateral Spreading Device Number. |
| static readonly [LateralSpreadingDeviceSequence](../../aspose.medical.dicom.tags/tag/lateralspreadingdevicesequence) | (300A,0332) VR=SQ VM=1 Lateral Spreading Device Sequence. |
| static readonly [LateralSpreadingDeviceSetting](../../aspose.medical.dicom.tags/tag/lateralspreadingdevicesetting) | (300A,0372) VR=LO VM=1 Lateral Spreading Device Setting. |
| static readonly [LateralSpreadingDeviceSettingsSequence](../../aspose.medical.dicom.tags/tag/lateralspreadingdevicesettingssequence) | (300A,0370) VR=SQ VM=1 Lateral Spreading Device Settings Sequence. |
| static readonly [LateralSpreadingDeviceType](../../aspose.medical.dicom.tags/tag/lateralspreadingdevicetype) | (300A,0338) VR=CS VM=1 Lateral Spreading Device Type. |
| static readonly [LateralSpreadingDeviceWaterEquivalentThickness](../../aspose.medical.dicom.tags/tag/lateralspreadingdevicewaterequivalentthickness) | (300A,033C) VR=FL VM=1 Lateral Spreading Device Water Equivalent Thickness. |
| static readonly [LeafJawPositions](../../aspose.medical.dicom.tags/tag/leafjawpositions) | (300A,011C) VR=DS VM=2-2n Leaf/Jaw Positions. |
| static readonly [LeafPositionBoundaries](../../aspose.medical.dicom.tags/tag/leafpositionboundaries) | (300A,00BE) VR=DS VM=3-n Leaf Position Boundaries. |
| static readonly [LeftImageSequence](../../aspose.medical.dicom.tags/tag/leftimagesequence) | (0022,0021) VR=SQ VM=1 Left Image Sequence. |
| static readonly [LeftLensSequence](../../aspose.medical.dicom.tags/tag/leftlenssequence) | (0046,0015) VR=SQ VM=1 Left Lens Sequence. |
| static readonly [LengthToEndRETIRED](../../aspose.medical.dicom.tags/tag/lengthtoendretired) | (0008,0001) VR=UL VM=1 Length to End (RETIRED). |
| static readonly [LensConstantDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/lensconstantdescriptionretired) | (0022,1094) VR=LO VM=1 Lens Constant Description (RETIRED). |
| static readonly [LensConstantSequence](../../aspose.medical.dicom.tags/tag/lensconstantsequence) | (0022,1092) VR=SQ VM=1 Lens Constant Sequence. |
| static readonly [LensDescription](../../aspose.medical.dicom.tags/tag/lensdescription) | (0046,0012) VR=LO VM=1 Lens Description. |
| static readonly [LensesCodeSequence](../../aspose.medical.dicom.tags/tag/lensescodesequence) | (0022,0019) VR=SQ VM=1 Lenses Code Sequence. |
| static readonly [LensFilterCutOffWavelengthRETIRED](../../aspose.medical.dicom.tags/tag/lensfiltercutoffwavelengthretired) | (0014,602A) VR=DS VM=1-n Lens Filter Cut-Off Wavelength (RETIRED). |
| static readonly [LensFilterManufacturerRETIRED](../../aspose.medical.dicom.tags/tag/lensfiltermanufacturerretired) | (0014,6028) VR=LO VM=1 Lens Filter Manufacturer (RETIRED). |
| static readonly [LensMake](../../aspose.medical.dicom.tags/tag/lensmake) | (0016,004F) VR=UT VM=1 Lens Make. |
| static readonly [LensModel](../../aspose.medical.dicom.tags/tag/lensmodel) | (0016,0050) VR=UT VM=1 Lens Model. |
| static readonly [LensSegmentType](../../aspose.medical.dicom.tags/tag/lenssegmenttype) | (0046,0038) VR=CS VM=1 Lens Segment Type. |
| static readonly [LensSequenceRETIRED](../../aspose.medical.dicom.tags/tag/lenssequenceretired) | (0014,6026) VR=SQ VM=1 Lens Sequence (RETIRED). |
| static readonly [LensSerialNumber](../../aspose.medical.dicom.tags/tag/lensserialnumber) | (0016,0051) VR=UT VM=1 Lens Serial Number. |
| static readonly [LensSpecification](../../aspose.medical.dicom.tags/tag/lensspecification) | (0016,004E) VR=DS VM=4 Lens Specification. |
| static readonly [LensStatusCodeSequence](../../aspose.medical.dicom.tags/tag/lensstatuscodesequence) | (0022,1024) VR=SQ VM=1 Lens Status Code Sequence. |
| static readonly [LensStatusDescription](../../aspose.medical.dicom.tags/tag/lensstatusdescription) | (0022,1065) VR=LO VM=1 Lens Status Description. |
| static readonly [LensThickness](../../aspose.medical.dicom.tags/tag/lensthickness) | (0022,1130) VR=FL VM=1 Lens Thickness. |
| static readonly [LensThicknessSequence](../../aspose.medical.dicom.tags/tag/lensthicknesssequence) | (0022,1127) VR=SQ VM=1 Lens Thickness Sequence. |
| static readonly [LesionNumber](../../aspose.medical.dicom.tags/tag/lesionnumber) | (0018,3105) VR=IS VM=1-n Lesion Number. |
| static readonly [LightDirection](../../aspose.medical.dicom.tags/tag/lightdirection) | (0070,1703) VR=FD VM=3 Light Direction. |
| static readonly [LightPathFilterPassBand](../../aspose.medical.dicom.tags/tag/lightpathfilterpassband) | (0022,0002) VR=US VM=2 Light Path Filter Pass Band. |
| static readonly [LightPathFilterPassThroughWavelength](../../aspose.medical.dicom.tags/tag/lightpathfilterpassthroughwavelength) | (0022,0001) VR=US VM=1 Light Path Filter Pass-Through Wavelength. |
| static readonly [LightPathFilterTypeStackCodeSequence](../../aspose.medical.dicom.tags/tag/lightpathfiltertypestackcodesequence) | (0022,0017) VR=SQ VM=1 Light Path Filter Type Stack Code Sequence. |
| static readonly [LightSource](../../aspose.medical.dicom.tags/tag/lightsource) | (0016,0028) VR=US VM=1 Light Source. |
| static readonly [LightSourcePolarization](../../aspose.medical.dicom.tags/tag/lightsourcepolarization) | (0016,1001) VR=CS VM=1 Light Source Polarization. |
| static readonly [LINACEnergyRETIRED](../../aspose.medical.dicom.tags/tag/linacenergyretired) | (0014,5002) VR=IS VM=1 LINAC Energy (RETIRED). |
| static readonly [LINACOutputRETIRED](../../aspose.medical.dicom.tags/tag/linacoutputretired) | (0014,5004) VR=IS VM=1 LINAC Output (RETIRED). |
| static readonly [LinearityCorrectionTechniqueRETIRED](../../aspose.medical.dicom.tags/tag/linearitycorrectiontechniqueretired) | (0014,3100) VR=LT VM=1 Linearity Correction Technique (RETIRED). |
| static readonly [LineDashingStyle](../../aspose.medical.dicom.tags/tag/linedashingstyle) | (0070,0254) VR=CS VM=1 Line Dashing Style. |
| static readonly [LinePattern](../../aspose.medical.dicom.tags/tag/linepattern) | (0070,0255) VR=UL VM=1 Line Pattern. |
| static readonly [LineSequence](../../aspose.medical.dicom.tags/tag/linesequence) | (0066,0028) VR=SQ VM=1 Line Sequence. |
| static readonly [LineStyleSequence](../../aspose.medical.dicom.tags/tag/linestylesequence) | (0070,0232) VR=SQ VM=1 Line Style Sequence. |
| static readonly [LineThickness](../../aspose.medical.dicom.tags/tag/linethickness) | (0070,0253) VR=FL VM=1 Line Thickness. |
| static readonly [ListOfMIMETypes](../../aspose.medical.dicom.tags/tag/listofmimetypes) | (0042,0014) VR=LO VM=1-n List of MIME Types. |
| static readonly [ListOfUIDMatchingSequence](../../aspose.medical.dicom.tags/tag/listofuidmatchingsequence) | (0008,0411) VR=SQ VM=1 List of UID Matching Sequence. |
| static readonly [LocalDeviationProbabilityNormalsFlag](../../aspose.medical.dicom.tags/tag/localdeviationprobabilitynormalsflag) | (0024,0072) VR=CS VM=1 Local Deviation Probability Normals Flag. |
| static readonly [LocalizedDeviationFromNormal](../../aspose.medical.dicom.tags/tag/localizeddeviationfromnormal) | (0024,0068) VR=FL VM=1 Localized Deviation From Normal. |
| static readonly [LocalizedDeviationProbability](../../aspose.medical.dicom.tags/tag/localizeddeviationprobability) | (0024,0073) VR=FL VM=1 Localized Deviation Probability. |
| static readonly [LocalizedDeviationProbabilitySequence](../../aspose.medical.dicom.tags/tag/localizeddeviationprobabilitysequence) | (0024,0085) VR=SQ VM=1 Localized Deviation Probability Sequence. |
| static readonly [LocalizingCursorPosition](../../aspose.medical.dicom.tags/tag/localizingcursorposition) | (0018,2043) VR=FL VM=2 Localizing Cursor Position. |
| static readonly [LocalNamespaceEntityID](../../aspose.medical.dicom.tags/tag/localnamespaceentityid) | (0040,0031) VR=UT VM=1 Local Namespace Entity ID. |
| static readonly [LocationOfMeasuredBeamDiameterRETIRED](../../aspose.medical.dicom.tags/tag/locationofmeasuredbeamdiameterretired) | (0014,4019) VR=DS VM=1 Location of Measured Beam Diameter (RETIRED). |
| static readonly [LocationRETIRED](../../aspose.medical.dicom.tags/tag/locationretired) | (0020,0050) VR=DS VM=1 Location (RETIRED). |
| static readonly [LongCodeValue](../../aspose.medical.dicom.tags/tag/longcodevalue) | (0008,0119) VR=UC VM=1 Long Code Value. |
| static readonly [LongDeviceDescription](../../aspose.medical.dicom.tags/tag/longdevicedescription) | (0050,0021) VR=ST VM=1 Long Device Description. |
| static readonly [LongEdgePointIndexList](../../aspose.medical.dicom.tags/tag/longedgepointindexlist) | (0066,0042) VR=OL VM=1 Long Edge Point Index List. |
| static readonly [LongitudinalTemporalEventType](../../aspose.medical.dicom.tags/tag/longitudinaltemporaleventtype) | (0012,0053) VR=CS VM=1 Longitudinal Temporal Event Type. |
| static readonly [LongitudinalTemporalInformationModified](../../aspose.medical.dicom.tags/tag/longitudinaltemporalinformationmodified) | (0028,0303) VR=CS VM=1 Longitudinal Temporal Information Modified. |
| static readonly [LongitudinalTemporalOffsetFromEvent](../../aspose.medical.dicom.tags/tag/longitudinaltemporaloffsetfromevent) | (0012,0052) VR=FD VM=1 Longitudinal Temporal Offset from Event. |
| static readonly [LongPrimitivePointIndexList](../../aspose.medical.dicom.tags/tag/longprimitivepointindexlist) | (0066,0040) VR=OL VM=1 Long Primitive Point Index List. |
| static readonly [LongTrianglePointIndexList](../../aspose.medical.dicom.tags/tag/longtrianglepointindexlist) | (0066,0041) VR=OL VM=1 Long Triangle Point Index List. |
| static readonly [LongVertexPointIndexList](../../aspose.medical.dicom.tags/tag/longvertexpointindexlist) | (0066,0043) VR=OL VM=1 Long Vertex Point Index List. |
| static readonly [LossyImageCompression](../../aspose.medical.dicom.tags/tag/lossyimagecompression) | (0028,2110) VR=CS VM=1 Lossy Image Compression. |
| static readonly [LossyImageCompressionMethod](../../aspose.medical.dicom.tags/tag/lossyimagecompressionmethod) | (0028,2114) VR=CS VM=1-n Lossy Image Compression Method. |
| static readonly [LossyImageCompressionRatio](../../aspose.medical.dicom.tags/tag/lossyimagecompressionratio) | (0028,2112) VR=DS VM=1-n Lossy Image Compression Ratio. |
| static readonly [LossyImageCompressionRetiredRETIRED](../../aspose.medical.dicom.tags/tag/lossyimagecompressionretiredretired) | (0008,2110) VR=CS VM=1 Lossy Image Compression (Retired) (RETIRED). |
| static readonly [LowEnergyDetectorsRETIRED](../../aspose.medical.dicom.tags/tag/lowenergydetectorsretired) | (4010,0001) VR=CS VM=1 Low Energy Detectors (RETIRED). |
| static readonly [LowerCutoffFrequency](../../aspose.medical.dicom.tags/tag/lowercutofffrequency) | (0018,982F) VR=FD VM=1 Lower Cutoff Frequency. |
| static readonly [LowRRValue](../../aspose.medical.dicom.tags/tag/lowrrvalue) | (0018,1081) VR=IS VM=1 Low R-R Value. |
| static readonly [LuminanceCharacteristicsID](../../aspose.medical.dicom.tags/tag/luminancecharacteristicsid) | (0028,7009) VR=US VM=1 Luminance Characteristics ID. |
| static readonly [LuminanceResponseDescription](../../aspose.medical.dicom.tags/tag/luminanceresponsedescription) | (0028,7020) VR=LO VM=1 Luminance Response Description. |
| static readonly [LuminanceResponseSequence](../../aspose.medical.dicom.tags/tag/luminanceresponsesequence) | (0028,701C) VR=SQ VM=1 Luminance Response Sequence. |
| static readonly [LuminanceResultSequence](../../aspose.medical.dicom.tags/tag/luminanceresultsequence) | (0028,7024) VR=SQ VM=1 Luminance Result Sequence. |
| static readonly [LuminanceUniformityResultSequence](../../aspose.medical.dicom.tags/tag/luminanceuniformityresultsequence) | (0028,7027) VR=SQ VM=1 Luminance Uniformity Result Sequence. |
| static readonly [LuminanceValue](../../aspose.medical.dicom.tags/tag/luminancevalue) | (0028,701F) VR=FL VM=1 Luminance Value. |
| static readonly [LUTData](../../aspose.medical.dicom.tags/tag/lutdata) | (0028,3006) VR=US or OW VM=1-n or 1 LUT Data. |
| static readonly [LUTDescriptor](../../aspose.medical.dicom.tags/tag/lutdescriptor) | (0028,3002) VR=US or SS VM=3 LUT Descriptor. |
| static readonly [LUTExplanation](../../aspose.medical.dicom.tags/tag/lutexplanation) | (0028,3003) VR=LO VM=1 LUT Explanation. |
| static readonly [LUTFrameRange](../../aspose.medical.dicom.tags/tag/lutframerange) | (0028,9507) VR=US VM=2-2n LUT Frame Range. |
| static readonly [LUTFunction](../../aspose.medical.dicom.tags/tag/lutfunction) | (0028,9474) VR=CS VM=1 LUT Function. |
| static readonly [LUTLabel](../../aspose.medical.dicom.tags/tag/lutlabel) | (0040,9210) VR=SH VM=1 LUT Label. |
| static readonly [LUTNumberRETIRED](../../aspose.medical.dicom.tags/tag/lutnumberretired) | (0020,0026) VR=IS VM=1 LUT Number (RETIRED). |
| static readonly [MAC](../../aspose.medical.dicom.tags/tag/mac) | (0400,0404) VR=OB VM=1 MAC. |
| static readonly [MACAlgorithm](../../aspose.medical.dicom.tags/tag/macalgorithm) | (0400,0015) VR=CS VM=1 MAC Algorithm. |
| static readonly [MACCalculationTransferSyntaxUID](../../aspose.medical.dicom.tags/tag/maccalculationtransfersyntaxuid) | (0400,0010) VR=UI VM=1 MAC Calculation Transfer Syntax UID. |
| static readonly [MachineSpecificTreatmentTerminationCodeSequence](../../aspose.medical.dicom.tags/tag/machinespecifictreatmentterminationcodesequence) | (300A,0716) VR=SQ VM=1 Machine-Specific Treatment Termination Code Sequence. |
| static readonly [MACIDNumber](../../aspose.medical.dicom.tags/tag/macidnumber) | (0400,0005) VR=US VM=1 MAC ID Number. |
| static readonly [MACParametersSequence](../../aspose.medical.dicom.tags/tag/macparameterssequence) | (4FFE,0001) VR=SQ VM=1 MAC Parameters Sequence. |
| static readonly [MagneticFieldStrength](../../aspose.medical.dicom.tags/tag/magneticfieldstrength) | (0018,0087) VR=DS VM=1 Magnetic Field Strength. |
| static readonly [MagnetizationTransfer](../../aspose.medical.dicom.tags/tag/magnetizationtransfer) | (0018,9020) VR=CS VM=1 Magnetization Transfer. |
| static readonly [MagnificationType](../../aspose.medical.dicom.tags/tag/magnificationtype) | (2010,0060) VR=CS VM=1 Magnification Type. |
| static readonly [MagnifyToNumberOfColumnsRETIRED](../../aspose.medical.dicom.tags/tag/magnifytonumberofcolumnsretired) | (2040,0074) VR=US VM=1 Magnify to Number of Columns (RETIRED). |
| static readonly [MagnitudeEncodingCodeSequence](../../aspose.medical.dicom.tags/tag/magnitudeencodingcodesequence) | (003A,032D) VR=SQ VM=1 Magnitude Encoding Code Sequence. |
| static readonly [MainLobeAngleRETIRED](../../aspose.medical.dicom.tags/tag/mainlobeangleretired) | (0014,5103) VR=DS VM=1 Main Lobe Angle (RETIRED). |
| static readonly [MainRoofAngleRETIRED](../../aspose.medical.dicom.tags/tag/mainroofangleretired) | (0014,5104) VR=DS VM=1 Main Roof Angle (RETIRED). |
| static readonly [MajorTicksSequence](../../aspose.medical.dicom.tags/tag/majortickssequence) | (0070,0287) VR=SQ VM=1 Major Ticks Sequence. |
| static readonly [MakerNote](../../aspose.medical.dicom.tags/tag/makernote) | (0016,002B) VR=OB VM=1 Maker Note. |
| static readonly [MandatoryComponentType](../../aspose.medical.dicom.tags/tag/mandatorycomponenttype) | (0076,0038) VR=CS VM=1 Mandatory Component Type. |
| static readonly [Manifold](../../aspose.medical.dicom.tags/tag/manifold) | (0066,0010) VR=CS VM=1 Manifold. |
| static readonly [ManipulatedImageRETIRED](../../aspose.medical.dicom.tags/tag/manipulatedimageretired) | (0028,0050) VR=LO VM=1-n Manipulated Image (RETIRED). |
| static readonly [Manufacturer](../../aspose.medical.dicom.tags/tag/manufacturer) | (0008,0070) VR=LO VM=1 Manufacturer. |
| static readonly [ManufacturerDeviceClassUID](../../aspose.medical.dicom.tags/tag/manufacturerdeviceclassuid) | (0018,100B) VR=UI VM=1-n Manufacturer's Device Class UID. |
| static readonly [ManufacturerDeviceIdentifier](../../aspose.medical.dicom.tags/tag/manufacturerdeviceidentifier) | (3010,0043) VR=ST VM=1 Manufacturer's Device Identifier. |
| static readonly [ManufacturerModelName](../../aspose.medical.dicom.tags/tag/manufacturermodelname) | (0008,1090) VR=LO VM=1 Manufacturer's Model Name. |
| static readonly [ManufacturerModelVersion](../../aspose.medical.dicom.tags/tag/manufacturermodelversion) | (3010,001A) VR=LO VM=1 Manufacturer's Model Version. |
| static readonly [ManufacturerRelatedModelGroup](../../aspose.medical.dicom.tags/tag/manufacturerrelatedmodelgroup) | (0008,0222) VR=LO VM=1 Manufacturer's Related Model Group. |
| static readonly [MappedPixelValue](../../aspose.medical.dicom.tags/tag/mappedpixelvalue) | (0022,1452) VR=US or SS VM=1 Mapped Pixel Value. |
| static readonly [MappingResource](../../aspose.medical.dicom.tags/tag/mappingresource) | (0008,0105) VR=CS VM=1 Mapping Resource. |
| static readonly [MappingResourceIdentificationSequence](../../aspose.medical.dicom.tags/tag/mappingresourceidentificationsequence) | (0008,0124) VR=SQ VM=1 Mapping Resource Identification Sequence. |
| static readonly [MappingResourceName](../../aspose.medical.dicom.tags/tag/mappingresourcename) | (0008,0122) VR=LO VM=1 Mapping Resource Name. |
| static readonly [MappingResourceUID](../../aspose.medical.dicom.tags/tag/mappingresourceuid) | (0008,0118) VR=UI VM=1 Mapping Resource UID. |
| static readonly [MaskFrameNumbers](../../aspose.medical.dicom.tags/tag/maskframenumbers) | (0028,6110) VR=US VM=1-n Mask Frame Numbers. |
| static readonly [MaskingImageRETIRED](../../aspose.medical.dicom.tags/tag/maskingimageretired) | (0020,0080) VR=CS VM=1-n Masking Image (RETIRED). |
| static readonly [MaskOperation](../../aspose.medical.dicom.tags/tag/maskoperation) | (0028,6101) VR=CS VM=1 Mask Operation. |
| static readonly [MaskOperationExplanation](../../aspose.medical.dicom.tags/tag/maskoperationexplanation) | (0028,6190) VR=ST VM=1 Mask Operation Explanation. |
| static readonly [MaskPointersRETIRED](../../aspose.medical.dicom.tags/tag/maskpointersretired) | (0028,6030) VR=US VM=1-n Mask Pointer(s) (RETIRED). |
| static readonly [MaskSelectionMode](../../aspose.medical.dicom.tags/tag/maskselectionmode) | (0028,9454) VR=CS VM=1 Mask Selection Mode. |
| static readonly [MaskSubPixelShift](../../aspose.medical.dicom.tags/tag/masksubpixelshift) | (0028,6114) VR=FL VM=2 Mask Sub-pixel Shift. |
| static readonly [MaskSubtractionSequence](../../aspose.medical.dicom.tags/tag/masksubtractionsequence) | (0028,6100) VR=SQ VM=1 Mask Subtraction Sequence. |
| static readonly [MaskVisibilityPercentage](../../aspose.medical.dicom.tags/tag/maskvisibilitypercentage) | (0028,9478) VR=FL VM=1 Mask Visibility Percentage. |
| static readonly [MassRETIRED](../../aspose.medical.dicom.tags/tag/massretired) | (4010,1017) VR=FL VM=1 Mass (RETIRED). |
| static readonly [MaterialAttenuationSequence](../../aspose.medical.dicom.tags/tag/materialattenuationsequence) | (0018,9382) VR=SQ VM=1 Material Attenuation Sequence. |
| static readonly [MaterialCodeSequence](../../aspose.medical.dicom.tags/tag/materialcodesequence) | (0018,937D) VR=SQ VM=1 Material Code Sequence. |
| static readonly [MaterialDensityRETIRED](../../aspose.medical.dicom.tags/tag/materialdensityretired) | (0014,6047) VR=DS VM=1 Material Density (RETIRED). |
| static readonly [MaterialGradeRETIRED](../../aspose.medical.dicom.tags/tag/materialgraderetired) | (0014,0042) VR=ST VM=1 Material Grade (RETIRED). |
| static readonly [MaterialID](../../aspose.medical.dicom.tags/tag/materialid) | (300A,00E1) VR=SH VM=1 Material ID. |
| static readonly [MaterialIsolationDiameterRETIRED](../../aspose.medical.dicom.tags/tag/materialisolationdiameterretired) | (0014,0034) VR=DS VM=1-n Material Isolation Diameter (RETIRED). |
| static readonly [MaterialNotesRETIRED](../../aspose.medical.dicom.tags/tag/materialnotesretired) | (0014,0046) VR=LT VM=1 Material Notes (RETIRED). |
| static readonly [MaterialPipeDiameterRETIRED](../../aspose.medical.dicom.tags/tag/materialpipediameterretired) | (0014,0032) VR=DS VM=1-n Material Pipe Diameter (RETIRED). |
| static readonly [MaterialPropertiesDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/materialpropertiesdescriptionretired) | (0014,0044) VR=ST VM=1 Material Properties Description (RETIRED). |
| static readonly [MaterialPropertiesFileFormatRetiredRETIRED](../../aspose.medical.dicom.tags/tag/materialpropertiesfileformatretiredretired) | (0014,0045) VR=ST VM=1 Material Properties File Format (Retired) (RETIRED). |
| static readonly [MaterialsCodeSequence](../../aspose.medical.dicom.tags/tag/materialscodesequence) | (0068,63A0) VR=SQ VM=1 Materials Code Sequence. |
| static readonly [MaterialThicknessRETIRED](../../aspose.medical.dicom.tags/tag/materialthicknessretired) | (0014,0030) VR=DS VM=1-n Material Thickness (RETIRED). |
| static readonly [MatingFeatureDegreeOfFreedomSequence](../../aspose.medical.dicom.tags/tag/matingfeaturedegreeoffreedomsequence) | (0068,6400) VR=SQ VM=1 Mating Feature Degree of Freedom Sequence. |
| static readonly [MatingFeatureID](../../aspose.medical.dicom.tags/tag/matingfeatureid) | (0068,63F0) VR=US VM=1 Mating Feature ID. |
| static readonly [MatingFeatureSequence](../../aspose.medical.dicom.tags/tag/matingfeaturesequence) | (0068,63E0) VR=SQ VM=1 Mating Feature Sequence. |
| static readonly [MatingFeatureSetID](../../aspose.medical.dicom.tags/tag/matingfeaturesetid) | (0068,63C0) VR=US VM=1 Mating Feature Set ID. |
| static readonly [MatingFeatureSetLabel](../../aspose.medical.dicom.tags/tag/matingfeaturesetlabel) | (0068,63D0) VR=LO VM=1 Mating Feature Set Label. |
| static readonly [MatingFeatureSetsSequence](../../aspose.medical.dicom.tags/tag/matingfeaturesetssequence) | (0068,63B0) VR=SQ VM=1 Mating Feature Sets Sequence. |
| static readonly [MatrixRegistrationSequence](../../aspose.medical.dicom.tags/tag/matrixregistrationsequence) | (0070,0309) VR=SQ VM=1 Matrix Registration Sequence. |
| static readonly [MatrixSequence](../../aspose.medical.dicom.tags/tag/matrixsequence) | (0070,030A) VR=SQ VM=1 Matrix Sequence. |
| static readonly [MAUsedInGainCalibrationRETIRED](../../aspose.medical.dicom.tags/tag/mausedingaincalibrationretired) | (0014,3072) VR=DS VM=1 MA Used in Gain Calibration (RETIRED). |
| static readonly [MaxApertureValue](../../aspose.medical.dicom.tags/tag/maxaperturevalue) | (0016,0025) VR=DS VM=1 Max Aperture Value. |
| static readonly [MaxDensity](../../aspose.medical.dicom.tags/tag/maxdensity) | (2010,0130) VR=US VM=1 Max Density. |
| static readonly [MaximumAcrossScanDistortion](../../aspose.medical.dicom.tags/tag/maximumacrossscandistortion) | (0022,0049) VR=FL VM=1 Maximum Across-scan Distortion. |
| static readonly [MaximumAlongScanDistortion](../../aspose.medical.dicom.tags/tag/maximumalongscandistortion) | (0022,0038) VR=FL VM=1 Maximum Along-scan Distortion. |
| static readonly [MaximumCollatedFilms](../../aspose.medical.dicom.tags/tag/maximumcollatedfilms) | (2010,0154) VR=IS VM=1 Maximum Collated Films. |
| static readonly [MaximumCoordinateValueRETIRED](../../aspose.medical.dicom.tags/tag/maximumcoordinatevalueretired) | (50xx,0105) VR=US VM=1-n Maximum Coordinate Value (RETIRED). |
| static readonly [MaximumCornealCurvature](../../aspose.medical.dicom.tags/tag/maximumcornealcurvature) | (0046,0212) VR=FL VM=1 Maximum Corneal Curvature. |
| static readonly [MaximumCornealCurvatureLocation](../../aspose.medical.dicom.tags/tag/maximumcornealcurvaturelocation) | (0046,0213) VR=FL VM=2 Maximum Corneal Curvature Location. |
| static readonly [MaximumCornealCurvatureSequence](../../aspose.medical.dicom.tags/tag/maximumcornealcurvaturesequence) | (0046,0211) VR=SQ VM=1 Maximum Corneal Curvature Sequence. |
| static readonly [MaximumCumulativeMetersetExposure](../../aspose.medical.dicom.tags/tag/maximumcumulativemetersetexposure) | (3002,0134) VR=FD VM=1 Maximum Cumulative Meterset Exposure. |
| static readonly [MaximumDepthDistortion](../../aspose.medical.dicom.tags/tag/maximumdepthdistortion) | (0022,0036) VR=FL VM=1 Maximum Depth Distortion. |
| static readonly [MaximumFractionalValue](../../aspose.medical.dicom.tags/tag/maximumfractionalvalue) | (0062,000E) VR=US VM=1 Maximum Fractional Value. |
| static readonly [MaximumMemoryAllocation](../../aspose.medical.dicom.tags/tag/maximummemoryallocation) | (2000,0061) VR=IS VM=1 Maximum Memory Allocation. |
| static readonly [MaximumNominalEnergy](../../aspose.medical.dicom.tags/tag/maximumnominalenergy) | (300A,0682) VR=DS VM=1 Maximum Nominal Energy. |
| static readonly [MaximumNumberOfIntervalDays](../../aspose.medical.dicom.tags/tag/maximumnumberofintervaldays) | (3010,0051) VR=FD VM=1 Maximum Number of Interval Days. |
| static readonly [MaximumNumberOfRecords](../../aspose.medical.dicom.tags/tag/maximumnumberofrecords) | (0008,0429) VR=UV VM=1 Maximum Number of Records. |
| static readonly [MaximumPointDistance](../../aspose.medical.dicom.tags/tag/maximumpointdistance) | (0066,0019) VR=FL VM=1 Maximum Point Distance. |
| static readonly [MaximumStimulusLuminance](../../aspose.medical.dicom.tags/tag/maximumstimulusluminance) | (0024,0018) VR=FL VM=1 Maximum Stimulus Luminance. |
| static readonly [MaximumStoredValueMapped](../../aspose.medical.dicom.tags/tag/maximumstoredvaluemapped) | (0028,1232) VR=FD VM=1 Maximum Stored Value Mapped. |
| static readonly [MeanPointDistance](../../aspose.medical.dicom.tags/tag/meanpointdistance) | (0066,0018) VR=FL VM=1 Mean Point Distance. |
| static readonly [MeasuredAPDimension](../../aspose.medical.dicom.tags/tag/measuredapdimension) | (0010,1023) VR=DS VM=1 Measured AP Dimension. |
| static readonly [MeasuredBandwidthRETIRED](../../aspose.medical.dicom.tags/tag/measuredbandwidthretired) | (0014,401C) VR=DS VM=1 Measured Bandwidth (RETIRED). |
| static readonly [MeasuredBeamDimensionARETIRED](../../aspose.medical.dicom.tags/tag/measuredbeamdimensionaretired) | (0014,4017) VR=DS VM=1 Measured Beam Dimension A (RETIRED). |
| static readonly [MeasuredBeamDimensionBRETIRED](../../aspose.medical.dicom.tags/tag/measuredbeamdimensionbretired) | (0014,4018) VR=DS VM=1 Measured Beam Dimension B (RETIRED). |
| static readonly [MeasuredCenterFrequencyRETIRED](../../aspose.medical.dicom.tags/tag/measuredcenterfrequencyretired) | (0014,401B) VR=DS VM=1 Measured Center Frequency (RETIRED). |
| static readonly [MeasuredCharacteristics](../../aspose.medical.dicom.tags/tag/measuredcharacteristics) | (0028,7026) VR=CS VM=1-n Measured Characteristics. |
| static readonly [MeasuredDoseDescription](../../aspose.medical.dicom.tags/tag/measureddosedescription) | (3008,0012) VR=ST VM=1 Measured Dose Description. |
| static readonly [MeasuredDoseReferenceNumber](../../aspose.medical.dicom.tags/tag/measureddosereferencenumber) | (3008,0064) VR=IS VM=1 Measured Dose Reference Number. |
| static readonly [MeasuredDoseReferenceSequence](../../aspose.medical.dicom.tags/tag/measureddosereferencesequence) | (3008,0010) VR=SQ VM=1 Measured Dose Reference Sequence. |
| static readonly [MeasuredDoseType](../../aspose.medical.dicom.tags/tag/measureddosetype) | (3008,0014) VR=CS VM=1 Measured Dose Type. |
| static readonly [MeasuredDoseValue](../../aspose.medical.dicom.tags/tag/measureddosevalue) | (3008,0016) VR=DS VM=1 Measured Dose Value. |
| static readonly [MeasuredLateralDimension](../../aspose.medical.dicom.tags/tag/measuredlateraldimension) | (0010,1024) VR=DS VM=1 Measured Lateral Dimension. |
| static readonly [MeasuredMetersetToDoseMappingSequence](../../aspose.medical.dicom.tags/tag/measuredmetersettodosemappingsequence) | (300A,0772) VR=SQ VM=1 Measured Meterset to Dose Mapping Sequence. |
| static readonly [MeasuredValueSequence](../../aspose.medical.dicom.tags/tag/measuredvaluesequence) | (0040,A300) VR=SQ VM=1 Measured Value Sequence. |
| static readonly [MeasurementAutomationTrialRETIRED](../../aspose.medical.dicom.tags/tag/measurementautomationtrialretired) | (0040,A194) VR=CS VM=1 Measurement Automation (Trial) (RETIRED). |
| static readonly [MeasurementEquipmentSequence](../../aspose.medical.dicom.tags/tag/measurementequipmentsequence) | (0028,7012) VR=SQ VM=1 Measurement Equipment Sequence. |
| static readonly [MeasurementEquipmentType](../../aspose.medical.dicom.tags/tag/measurementequipmenttype) | (0028,7014) VR=CS VM=1 Measurement Equipment Type. |
| static readonly [MeasurementFunctions](../../aspose.medical.dicom.tags/tag/measurementfunctions) | (0028,7013) VR=CS VM=1-n Measurement Functions. |
| static readonly [MeasurementLaterality](../../aspose.medical.dicom.tags/tag/measurementlaterality) | (0024,0113) VR=CS VM=1 Measurement Laterality. |
| static readonly [MeasurementPatternCodeSequence](../../aspose.medical.dicom.tags/tag/measurementpatterncodesequence) | (0028,702D) VR=SQ VM=1 Measurement Pattern Code Sequence. |
| static readonly [MeasurementPrecisionDescriptionTrialRETIRED](../../aspose.medical.dicom.tags/tag/measurementprecisiondescriptiontrialretired) | (0040,A047) VR=LO VM=1 Measurement Precision Description (Trial) (RETIRED). |
| static readonly [MeasurementsSequence](../../aspose.medical.dicom.tags/tag/measurementssequence) | (0066,0121) VR=SQ VM=1 Measurements Sequence. |
| static readonly [MeasurementUnitsCodeSequence](../../aspose.medical.dicom.tags/tag/measurementunitscodesequence) | (0040,08EA) VR=SQ VM=1 Measurement Units Code Sequence. |
| static readonly [MeasurementValuesSequence](../../aspose.medical.dicom.tags/tag/measurementvaluessequence) | (0066,0132) VR=SQ VM=1 Measurement Values Sequence. |
| static readonly [MeasuringUnitsSequence](../../aspose.medical.dicom.tags/tag/measuringunitssequence) | (0040,0295) VR=SQ VM=1 Measuring Units Sequence. |
| static readonly [MechanicalIndex](../../aspose.medical.dicom.tags/tag/mechanicalindex) | (0018,5022) VR=DS VM=1 Mechanical Index. |
| static readonly [MediaDisposition](../../aspose.medical.dicom.tags/tag/mediadisposition) | (2200,0004) VR=LT VM=1 Media Disposition. |
| static readonly [MediaInstalledSequence](../../aspose.medical.dicom.tags/tag/mediainstalledsequence) | (2000,00A2) VR=SQ VM=1 Media Installed Sequence. |
| static readonly [MediaStorageSOPClassUID](../../aspose.medical.dicom.tags/tag/mediastoragesopclassuid) | (0002,0002) VR=UI VM=1 Media Storage SOP Class UID. |
| static readonly [MediaStorageSOPInstanceUID](../../aspose.medical.dicom.tags/tag/mediastoragesopinstanceuid) | (0002,0003) VR=UI VM=1 Media Storage SOP Instance UID. |
| static readonly [MedicalAlerts](../../aspose.medical.dicom.tags/tag/medicalalerts) | (0010,2000) VR=LO VM=1-n Medical Alerts. |
| static readonly [MedicalRecordLocatorRETIRED](../../aspose.medical.dicom.tags/tag/medicalrecordlocatorretired) | (0010,1090) VR=LO VM=1 Medical Record Locator (RETIRED). |
| static readonly [MediumType](../../aspose.medical.dicom.tags/tag/mediumtype) | (2000,0030) VR=CS VM=1 Medium Type. |
| static readonly [MemoryAllocation](../../aspose.medical.dicom.tags/tag/memoryallocation) | (2000,0060) VR=IS VM=1 Memory Allocation. |
| static readonly [MemoryBitDepth](../../aspose.medical.dicom.tags/tag/memorybitdepth) | (2000,00A0) VR=US VM=1 Memory Bit Depth. |
| static readonly [MessageID](../../aspose.medical.dicom.tags/tag/messageid) | (0000,0110) VR=US VM=1 Message ID. |
| static readonly [MessageIDBeingRespondedTo](../../aspose.medical.dicom.tags/tag/messageidbeingrespondedto) | (0000,0120) VR=US VM=1 Message ID Being Responded To. |
| static readonly [MessageSetIDRETIRED](../../aspose.medical.dicom.tags/tag/messagesetidretired) | (0000,5010) VR=SH VM=1 Message Set ID (RETIRED). |
| static readonly [MetaboliteMapCodeSequence](../../aspose.medical.dicom.tags/tag/metabolitemapcodesequence) | (0018,9083) VR=SQ VM=1 Metabolite Map Code Sequence. |
| static readonly [MetaboliteMapDescription](../../aspose.medical.dicom.tags/tag/metabolitemapdescription) | (0018,9080) VR=ST VM=1 Metabolite Map Description. |
| static readonly [MetadataSequence](../../aspose.medical.dicom.tags/tag/metadatasequence) | (0008,041D) VR=SQ VM=1 Metadata Sequence. |
| static readonly [MeteringMode](../../aspose.medical.dicom.tags/tag/meteringmode) | (0016,0027) VR=US VM=1 Metering Mode. |
| static readonly [MetersetExposure](../../aspose.medical.dicom.tags/tag/metersetexposure) | (3002,0032) VR=DS VM=1 Meterset Exposure. |
| static readonly [MetersetRate](../../aspose.medical.dicom.tags/tag/metersetrate) | (300A,035A) VR=FL VM=1 Meterset Rate. |
| static readonly [MetersetRateDelivered](../../aspose.medical.dicom.tags/tag/metersetratedelivered) | (3008,0046) VR=FL VM=1 Meterset Rate Delivered. |
| static readonly [MetersetRateSet](../../aspose.medical.dicom.tags/tag/metersetrateset) | (3008,0045) VR=FL VM=1 Meterset Rate Set. |
| static readonly [MetersetToDoseMappingSequence](../../aspose.medical.dicom.tags/tag/metersettodosemappingsequence) | (300A,0620) VR=SQ VM=1 Meterset to Dose Mapping Sequence. |
| static readonly [MidSlabPosition](../../aspose.medical.dicom.tags/tag/midslabposition) | (0018,9106) VR=FD VM=3 Mid Slab Position. |
| static readonly [MilitaryRank](../../aspose.medical.dicom.tags/tag/militaryrank) | (0010,1080) VR=LO VM=1 Military Rank. |
| static readonly [MIMETypeOfEncapsulatedDocument](../../aspose.medical.dicom.tags/tag/mimetypeofencapsulateddocument) | (0042,0012) VR=LO VM=1 MIME Type of Encapsulated Document. |
| static readonly [MinDensity](../../aspose.medical.dicom.tags/tag/mindensity) | (2010,0120) VR=US VM=1 Min Density. |
| static readonly [MinimumCoordinateValueRETIRED](../../aspose.medical.dicom.tags/tag/minimumcoordinatevalueretired) | (50xx,0104) VR=US VM=1-n Minimum Coordinate Value (RETIRED). |
| static readonly [MinimumHoursBetweenFractions](../../aspose.medical.dicom.tags/tag/minimumhoursbetweenfractions) | (3010,0084) VR=FD VM=1 Minimum Hours between Fractions. |
| static readonly [MinimumKeratometricSequence](../../aspose.medical.dicom.tags/tag/minimumkeratometricsequence) | (0046,0215) VR=SQ VM=1 Minimum Keratometric Sequence. |
| static readonly [MinimumNominalEnergy](../../aspose.medical.dicom.tags/tag/minimumnominalenergy) | (300A,0681) VR=DS VM=1 Minimum Nominal Energy. |
| static readonly [MinimumNumberOfIntervalDays](../../aspose.medical.dicom.tags/tag/minimumnumberofintervaldays) | (3010,0050) VR=FD VM=1 Minimum Number of Interval Days. |
| static readonly [MinimumSensitivityValue](../../aspose.medical.dicom.tags/tag/minimumsensitivityvalue) | (0024,0105) VR=FL VM=1 Minimum Sensitivity Value. |
| static readonly [MinimumStoredValueMapped](../../aspose.medical.dicom.tags/tag/minimumstoredvaluemapped) | (0028,1231) VR=FD VM=1 Minimum Stored Value Mapped. |
| static readonly [ModalitiesInStudy](../../aspose.medical.dicom.tags/tag/modalitiesinstudy) | (0008,0061) VR=CS VM=1-n Modalities in Study. |
| static readonly [Modality](../../aspose.medical.dicom.tags/tag/modality) | (0008,0060) VR=CS VM=1 Modality. |
| static readonly [ModalityLUTSequence](../../aspose.medical.dicom.tags/tag/modalitylutsequence) | (0028,3000) VR=SQ VM=1 Modality LUT Sequence. |
| static readonly [ModalityLUTType](../../aspose.medical.dicom.tags/tag/modalityluttype) | (0028,3004) VR=LO VM=1 Modality LUT Type. |
| static readonly [ModelGroupUID](../../aspose.medical.dicom.tags/tag/modelgroupuid) | (0068,7004) VR=UI VM=1 Model Group UID. |
| static readonly [ModelMirroring](../../aspose.medical.dicom.tags/tag/modelmirroring) | (0068,7002) VR=CS VM=1 Model Mirroring. |
| static readonly [ModelModification](../../aspose.medical.dicom.tags/tag/modelmodification) | (0068,7001) VR=CS VM=1 Model Modification. |
| static readonly [ModelSpecificationSequence](../../aspose.medical.dicom.tags/tag/modelspecificationsequence) | (0018,9912) VR=SQ VM=1 Model Specification Sequence. |
| static readonly [ModelUsageCodeSequence](../../aspose.medical.dicom.tags/tag/modelusagecodesequence) | (0068,7003) VR=SQ VM=1 Model Usage Code Sequence. |
| static readonly [ModeOfPercutaneousAccessSequence](../../aspose.medical.dicom.tags/tag/modeofpercutaneousaccesssequence) | (0052,0016) VR=SQ VM=1 Mode of Percutaneous Access Sequence. |
| static readonly [ModifiableConstraintFlag](../../aspose.medical.dicom.tags/tag/modifiableconstraintflag) | (0082,0038) VR=CS VM=1 Modifiable Constraint Flag. |
| static readonly [ModifiedAttributesSequence](../../aspose.medical.dicom.tags/tag/modifiedattributessequence) | (0400,0550) VR=SQ VM=1 Modified Attributes Sequence. |
| static readonly [ModifiedImageDateRETIRED](../../aspose.medical.dicom.tags/tag/modifiedimagedateretired) | (0020,3403) VR=DA VM=1 Modified Image Date (RETIRED). |
| static readonly [ModifiedImageDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/modifiedimagedescriptionretired) | (0020,3406) VR=LO VM=1 Modified Image Description (RETIRED). |
| static readonly [ModifiedImageIDRETIRED](../../aspose.medical.dicom.tags/tag/modifiedimageidretired) | (0020,3402) VR=CS VM=1 Modified Image ID (RETIRED). |
| static readonly [ModifiedImageTimeRETIRED](../../aspose.medical.dicom.tags/tag/modifiedimagetimeretired) | (0020,3405) VR=TM VM=1 Modified Image Time (RETIRED). |
| static readonly [ModifierCodeSequence](../../aspose.medical.dicom.tags/tag/modifiercodesequence) | (0040,A195) VR=SQ VM=1 Modifier Code Sequence. |
| static readonly [ModifyingDeviceIDRETIRED](../../aspose.medical.dicom.tags/tag/modifyingdeviceidretired) | (0020,3401) VR=CS VM=1 Modifying Device ID (RETIRED). |
| static readonly [ModifyingDeviceManufacturerRETIRED](../../aspose.medical.dicom.tags/tag/modifyingdevicemanufacturerretired) | (0020,3404) VR=LO VM=1 Modifying Device Manufacturer (RETIRED). |
| static readonly [ModifyingSystem](../../aspose.medical.dicom.tags/tag/modifyingsystem) | (0400,0563) VR=LO VM=1 Modifying System. |
| static readonly [ModulatedScanModeType](../../aspose.medical.dicom.tags/tag/modulatedscanmodetype) | (300A,0309) VR=CS VM=1 Modulated Scan Mode Type. |
| static readonly [ModulationTypeRETIRED](../../aspose.medical.dicom.tags/tag/modulationtyperetired) | (0014,4026) VR=CS VM=1 Modulation Type (RETIRED). |
| static readonly [MonoenergeticEnergyEquivalent](../../aspose.medical.dicom.tags/tag/monoenergeticenergyequivalent) | (0018,937C) VR=FD VM=1 Monoenergetic Energy Equivalent. |
| static readonly [MontageActivationSequence](../../aspose.medical.dicom.tags/tag/montageactivationsequence) | (0040,B037) VR=SQ VM=1 Montage Activation Sequence. |
| static readonly [MontageActivationTimeOffset](../../aspose.medical.dicom.tags/tag/montageactivationtimeoffset) | (0040,B038) VR=DS VM=1 Montage Activation Time Offset. |
| static readonly [MontageChannelLabel](../../aspose.medical.dicom.tags/tag/montagechannellabel) | (0040,B03F) VR=LO VM=1 Montage Channel Label. |
| static readonly [MontageChannelNumber](../../aspose.medical.dicom.tags/tag/montagechannelnumber) | (0040,B03E) VR=IS VM=1 Montage Channel Number. |
| static readonly [MontageChannelSequence](../../aspose.medical.dicom.tags/tag/montagechannelsequence) | (0040,B03C) VR=SQ VM=1 Montage Channel Sequence. |
| static readonly [MontageChannelSourceCodeSequence](../../aspose.medical.dicom.tags/tag/montagechannelsourcecodesequence) | (0040,B040) VR=SQ VM=1 Montage Channel Source Code Sequence. |
| static readonly [MontageIndex](../../aspose.medical.dicom.tags/tag/montageindex) | (0040,B03D) VR=US VM=1 Montage Index. |
| static readonly [MontageName](../../aspose.medical.dicom.tags/tag/montagename) | (0040,B03B) VR=LT VM=1 Montage Name. |
| static readonly [MostRecentTreatmentDate](../../aspose.medical.dicom.tags/tag/mostrecenttreatmentdate) | (3008,0056) VR=DA VM=1 Most Recent Treatment Date. |
| static readonly [MotionSynchronizationSequence](../../aspose.medical.dicom.tags/tag/motionsynchronizationsequence) | (300A,0410) VR=SQ VM=1 Motion Synchronization Sequence. |
| static readonly [MoveDestination](../../aspose.medical.dicom.tags/tag/movedestination) | (0000,0600) VR=AE VM=1 Move Destination. |
| static readonly [MoveOriginatorApplicationEntityTitle](../../aspose.medical.dicom.tags/tag/moveoriginatorapplicationentitytitle) | (0000,1030) VR=AE VM=1 Move Originator Application Entity Title. |
| static readonly [MoveOriginatorMessageID](../../aspose.medical.dicom.tags/tag/moveoriginatormessageid) | (0000,1031) VR=US VM=1 Move Originator Message ID. |
| static readonly [MovingWindowPaddingLengthRETIRED](../../aspose.medical.dicom.tags/tag/movingwindowpaddinglengthretired) | (0014,6051) VR=DS VM=1 Moving Window Padding Sength (RETIRED). |
| static readonly [MovingWindowPaddingSchemeRETIRED](../../aspose.medical.dicom.tags/tag/movingwindowpaddingschemeretired) | (0014,6050) VR=CS VM=1 Moving Window Padding Scheme (RETIRED). |
| static readonly [MovingWindowPitchRETIRED](../../aspose.medical.dicom.tags/tag/movingwindowpitchretired) | (0014,604F) VR=DS VM=1 Moving Window Pitch (RETIRED). |
| static readonly [MovingWindowSizeRETIRED](../../aspose.medical.dicom.tags/tag/movingwindowsizeretired) | (0014,604C) VR=DS VM=1 Moving Window Size (RETIRED). |
| static readonly [MovingWindowTypeRETIRED](../../aspose.medical.dicom.tags/tag/movingwindowtyperetired) | (0014,604D) VR=CS VM=1 Moving Window Type (RETIRED). |
| static readonly [MovingWindowWeightsRETIRED](../../aspose.medical.dicom.tags/tag/movingwindowweightsretired) | (0014,604E) VR=DS VM=1-n Moving Window Weights (RETIRED). |
| static readonly [MPRSlabThickness](../../aspose.medical.dicom.tags/tag/mprslabthickness) | (0070,1503) VR=FD VM=1 MPR Slab Thickness. |
| static readonly [MPRThicknessType](../../aspose.medical.dicom.tags/tag/mprthicknesstype) | (0070,1502) VR=CS VM=1 MPR Thickness Type. |
| static readonly [MPRTopLeftHandCorner](../../aspose.medical.dicom.tags/tag/mprtoplefthandcorner) | (0070,1505) VR=FD VM=3 MPR Top Left Hand Corner. |
| static readonly [MPRViewHeight](../../aspose.medical.dicom.tags/tag/mprviewheight) | (0070,1512) VR=FD VM=1 MPR View Height. |
| static readonly [MPRViewHeightDirection](../../aspose.medical.dicom.tags/tag/mprviewheightdirection) | (0070,1511) VR=FD VM=3 MPR View Height Direction. |
| static readonly [MPRViewWidth](../../aspose.medical.dicom.tags/tag/mprviewwidth) | (0070,1508) VR=FD VM=1 MPR View Width. |
| static readonly [MPRViewWidthDirection](../../aspose.medical.dicom.tags/tag/mprviewwidthdirection) | (0070,1507) VR=FD VM=3 MPR View Width Direction. |
| static readonly [MRAcquisitionFrequencyEncodingSteps](../../aspose.medical.dicom.tags/tag/mracquisitionfrequencyencodingsteps) | (0018,9058) VR=US VM=1 MR Acquisition Frequency Encoding Steps. |
| static readonly [MRAcquisitionPhaseEncodingStepsInPlane](../../aspose.medical.dicom.tags/tag/mracquisitionphaseencodingstepsinplane) | (0018,9231) VR=US VM=1 MR Acquisition Phase Encoding Steps in-plane. |
| static readonly [MRAcquisitionPhaseEncodingStepsOutOfPlane](../../aspose.medical.dicom.tags/tag/mracquisitionphaseencodingstepsoutofplane) | (0018,9232) VR=US VM=1 MR Acquisition Phase Encoding Steps out-of-plane. |
| static readonly [MRAcquisitionType](../../aspose.medical.dicom.tags/tag/mracquisitiontype) | (0018,0023) VR=CS VM=1 MR Acquisition Type. |
| static readonly [MRArterialSpinLabelingSequence](../../aspose.medical.dicom.tags/tag/mrarterialspinlabelingsequence) | (0018,9251) VR=SQ VM=1 MR Arterial Spin Labeling Sequence. |
| static readonly [MRAveragesSequence](../../aspose.medical.dicom.tags/tag/mraveragessequence) | (0018,9119) VR=SQ VM=1 MR Averages Sequence. |
| static readonly [MRDiffusionSequence](../../aspose.medical.dicom.tags/tag/mrdiffusionsequence) | (0018,9117) VR=SQ VM=1 MR Diffusion Sequence. |
| static readonly [MRDRDirectoryRecordOffsetRETIRED](../../aspose.medical.dicom.tags/tag/mrdrdirectoryrecordoffsetretired) | (0004,1504) VR=UL VM=1 MRDR Directory Record Offset (RETIRED). |
| static readonly [MREchoSequence](../../aspose.medical.dicom.tags/tag/mrechosequence) | (0018,9114) VR=SQ VM=1 MR Echo Sequence. |
| static readonly [MRFOVGeometrySequence](../../aspose.medical.dicom.tags/tag/mrfovgeometrysequence) | (0018,9125) VR=SQ VM=1 MR FOV/Geometry Sequence. |
| static readonly [MRImageFrameTypeSequence](../../aspose.medical.dicom.tags/tag/mrimageframetypesequence) | (0018,9226) VR=SQ VM=1 MR Image Frame Type Sequence. |
| static readonly [MRImagingModifierSequence](../../aspose.medical.dicom.tags/tag/mrimagingmodifiersequence) | (0018,9006) VR=SQ VM=1 MR Imaging Modifier Sequence. |
| static readonly [MRMetaboliteMapSequence](../../aspose.medical.dicom.tags/tag/mrmetabolitemapsequence) | (0018,9152) VR=SQ VM=1 MR Metabolite Map Sequence. |
| static readonly [MRModifierSequence](../../aspose.medical.dicom.tags/tag/mrmodifiersequence) | (0018,9115) VR=SQ VM=1 MR Modifier Sequence. |
| static readonly [MRReceiveCoilSequence](../../aspose.medical.dicom.tags/tag/mrreceivecoilsequence) | (0018,9042) VR=SQ VM=1 MR Receive Coil Sequence. |
| static readonly [MRSpatialSaturationSequence](../../aspose.medical.dicom.tags/tag/mrspatialsaturationsequence) | (0018,9107) VR=SQ VM=1 MR Spatial Saturation Sequence. |
| static readonly [MRSpectroscopyAcquisitionType](../../aspose.medical.dicom.tags/tag/mrspectroscopyacquisitiontype) | (0018,9200) VR=CS VM=1 MR Spectroscopy Acquisition Type. |
| static readonly [MRSpectroscopyFOVGeometrySequence](../../aspose.medical.dicom.tags/tag/mrspectroscopyfovgeometrysequence) | (0018,9103) VR=SQ VM=1 MR Spectroscopy FOV/Geometry Sequence. |
| static readonly [MRSpectroscopyFrameTypeSequence](../../aspose.medical.dicom.tags/tag/mrspectroscopyframetypesequence) | (0018,9227) VR=SQ VM=1 MR Spectroscopy Frame Type Sequence. |
| static readonly [MRTimingAndRelatedParametersSequence](../../aspose.medical.dicom.tags/tag/mrtimingandrelatedparameterssequence) | (0018,9112) VR=SQ VM=1 MR Timing and Related Parameters Sequence. |
| static readonly [MRTransmitCoilSequence](../../aspose.medical.dicom.tags/tag/mrtransmitcoilsequence) | (0018,9049) VR=SQ VM=1 MR Transmit Coil Sequence. |
| static readonly [MRVelocityEncodingSequence](../../aspose.medical.dicom.tags/tag/mrvelocityencodingsequence) | (0018,9197) VR=SQ VM=1 MR Velocity Encoding Sequence. |
| static readonly [MultiCoilConfiguration](../../aspose.medical.dicom.tags/tag/multicoilconfiguration) | (0018,9046) VR=LO VM=1 Multi-Coil Configuration. |
| static readonly [MultiCoilDefinitionSequence](../../aspose.medical.dicom.tags/tag/multicoildefinitionsequence) | (0018,9045) VR=SQ VM=1 Multi-Coil Definition Sequence. |
| static readonly [MultiCoilElementName](../../aspose.medical.dicom.tags/tag/multicoilelementname) | (0018,9047) VR=SH VM=1 Multi-Coil Element Name. |
| static readonly [MultiCoilElementUsed](../../aspose.medical.dicom.tags/tag/multicoilelementused) | (0018,9048) VR=CS VM=1 Multi-Coil Element Used. |
| static readonly [MultienergyAcquisitionDescription](../../aspose.medical.dicom.tags/tag/multienergyacquisitiondescription) | (0018,937B) VR=UT VM=1 Multi-energy Acquisition Description. |
| static readonly [MultienergyCTAcquisition](../../aspose.medical.dicom.tags/tag/multienergyctacquisition) | (0018,9361) VR=CS VM=1 Multi-energy CT Acquisition. |
| static readonly [MultienergyCTAcquisitionSequence](../../aspose.medical.dicom.tags/tag/multienergyctacquisitionsequence) | (0018,9362) VR=SQ VM=1 Multi-energy CT Acquisition Sequence. |
| static readonly [MultienergyCTCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/multienergyctcharacteristicssequence) | (0018,9364) VR=SQ VM=1 Multi-energy CT Characteristics Sequence. |
| static readonly [MultienergyCTPathIndex](../../aspose.medical.dicom.tags/tag/multienergyctpathindex) | (0018,937A) VR=US VM=1 Multi-energy CT Path Index. |
| static readonly [MultienergyCTPathSequence](../../aspose.medical.dicom.tags/tag/multienergyctpathsequence) | (0018,9379) VR=SQ VM=1 Multi-energy CT Path Sequence. |
| static readonly [MultienergyCTProcessingSequence](../../aspose.medical.dicom.tags/tag/multienergyctprocessingsequence) | (0018,9363) VR=SQ VM=1 Multi-energy CT Processing Sequence. |
| static readonly [MultienergyCTXRayDetectorSequence](../../aspose.medical.dicom.tags/tag/multienergyctxraydetectorsequence) | (0018,936F) VR=SQ VM=1 Multi-energy CT X-Ray Detector Sequence. |
| static readonly [MultienergyCTXRaySourceSequence](../../aspose.medical.dicom.tags/tag/multienergyctxraysourcesequence) | (0018,9365) VR=SQ VM=1 Multi-energy CT X-Ray Source Sequence. |
| static readonly [MultienergyDetectorType](../../aspose.medical.dicom.tags/tag/multienergydetectortype) | (0018,9372) VR=CS VM=1 Multi-energy Detector Type. |
| static readonly [MultienergySourceTechnique](../../aspose.medical.dicom.tags/tag/multienergysourcetechnique) | (0018,9368) VR=CS VM=1 Multi-energy Source Technique. |
| static readonly [MultiFramePresentationSequence](../../aspose.medical.dicom.tags/tag/multiframepresentationsequence) | (0028,9505) VR=SQ VM=1 Multi-frame Presentation Sequence. |
| static readonly [MultiFrameSourceSOPInstanceUID](../../aspose.medical.dicom.tags/tag/multiframesourcesopinstanceuid) | (0008,1167) VR=UI VM=1 Multi-frame Source SOP Instance UID. |
| static readonly [MultiPlanarExcitation](../../aspose.medical.dicom.tags/tag/multiplanarexcitation) | (0018,9012) VR=CS VM=1 Multi-planar Excitation. |
| static readonly [MultiPlanarReconstructionStyle](../../aspose.medical.dicom.tags/tag/multiplanarreconstructionstyle) | (0070,1501) VR=CS VM=1 Multi-Planar Reconstruction Style. |
| static readonly [MultipleComponentApprovalSequenceRETIRED](../../aspose.medical.dicom.tags/tag/multiplecomponentapprovalsequenceretired) | (0014,0106) VR=SQ VM=1 Multiple Component Approval Sequence (RETIRED). |
| static readonly [MultipleCopiesFlagRETIRED](../../aspose.medical.dicom.tags/tag/multiplecopiesflagretired) | (0040,4006) VR=CS VM=1 Multiple Copies Flag (RETIRED). |
| static readonly [MultipleSpinEcho](../../aspose.medical.dicom.tags/tag/multiplespinecho) | (0018,9011) VR=CS VM=1 Multiple Spin Echo. |
| static readonly [MultiplexedAudioChannelsDescriptionCodeSequence](../../aspose.medical.dicom.tags/tag/multiplexedaudiochannelsdescriptioncodesequence) | (003A,0300) VR=SQ VM=1 Multiplexed Audio Channels Description Code Sequence. |
| static readonly [MultiplexGroupLabel](../../aspose.medical.dicom.tags/tag/multiplexgrouplabel) | (003A,0020) VR=SH VM=1 Multiplex Group Label. |
| static readonly [MultiplexGroupTimeOffset](../../aspose.medical.dicom.tags/tag/multiplexgrouptimeoffset) | (0018,1068) VR=DS VM=1 Multiplex Group Time Offset. |
| static readonly [MultiplexGroupUID](../../aspose.medical.dicom.tags/tag/multiplexgroupuid) | (003A,0310) VR=UI VM=1 Multiplex Group UID. |
| static readonly [MVImagingGenerationParametersSequence](../../aspose.medical.dicom.tags/tag/mvimaginggenerationparameterssequence) | (3002,0128) VR=SQ VM=1 MV Imaging Generation Parameters Sequence. |
| static readonly [MydriaticAgentCodeSequence](../../aspose.medical.dicom.tags/tag/mydriaticagentcodesequence) | (0022,001C) VR=SQ VM=1 Mydriatic Agent Code Sequence. |
| static readonly [MydriaticAgentConcentration](../../aspose.medical.dicom.tags/tag/mydriaticagentconcentration) | (0022,004E) VR=DS VM=1 Mydriatic Agent Concentration. |
| static readonly [MydriaticAgentConcentrationUnitsSequence](../../aspose.medical.dicom.tags/tag/mydriaticagentconcentrationunitssequence) | (0022,0042) VR=SQ VM=1 Mydriatic Agent Concentration Units Sequence. |
| static readonly [MydriaticAgentSequence](../../aspose.medical.dicom.tags/tag/mydriaticagentsequence) | (0022,0058) VR=SQ VM=1 Mydriatic Agent Sequence. |
| static readonly [NameOfPhysiciansReadingStudy](../../aspose.medical.dicom.tags/tag/nameofphysiciansreadingstudy) | (0008,1060) VR=PN VM=1-n Name of Physician(s) Reading Study. |
| static readonly [NamesOfIntendedRecipientsOfResults](../../aspose.medical.dicom.tags/tag/namesofintendedrecipientsofresults) | (0040,1010) VR=PN VM=1-n Names of Intended Recipients of Results. |
| static readonly [NavigationDisplaySet](../../aspose.medical.dicom.tags/tag/navigationdisplayset) | (0072,0216) VR=US VM=1 Navigation Display Set. |
| static readonly [NavigationIndicatorSequence](../../aspose.medical.dicom.tags/tag/navigationindicatorsequence) | (0072,0214) VR=SQ VM=1 Navigation Indicator Sequence. |
| static readonly [NearPupillaryDistance](../../aspose.medical.dicom.tags/tag/nearpupillarydistance) | (0046,0062) VR=FD VM=1 Near Pupillary Distance. |
| static readonly [NegativeCatchTrialsQuantity](../../aspose.medical.dicom.tags/tag/negativecatchtrialsquantity) | (0024,0048) VR=US VM=1 Negative Catch Trials Quantity. |
| static readonly [NetworkIDRETIRED](../../aspose.medical.dicom.tags/tag/networkidretired) | (0008,1000) VR=AE VM=1 Network ID (RETIRED). |
| static readonly [NominalBeamAngleRETIRED](../../aspose.medical.dicom.tags/tag/nominalbeamangleretired) | (0014,5112) VR=DS VM=1 Nominal Beam Angle (RETIRED). |
| static readonly [NominalBeamEnergy](../../aspose.medical.dicom.tags/tag/nominalbeamenergy) | (300A,0114) VR=DS VM=1 Nominal Beam Energy. |
| static readonly [NominalBeamEnergyUnit](../../aspose.medical.dicom.tags/tag/nominalbeamenergyunit) | (300A,0015) VR=CS VM=1 Nominal Beam Energy Unit. |
| static readonly [NominalCardiacTriggerDelayTime](../../aspose.medical.dicom.tags/tag/nominalcardiactriggerdelaytime) | (0020,9153) VR=FD VM=1 Nominal Cardiac Trigger Delay Time. |
| static readonly [NominalCardiacTriggerTimePriorToRPeak](../../aspose.medical.dicom.tags/tag/nominalcardiactriggertimepriortorpeak) | (0020,9154) VR=FL VM=1 Nominal Cardiac Trigger Time Prior To R-Peak. |
| static readonly [NominalEnergy](../../aspose.medical.dicom.tags/tag/nominalenergy) | (300A,0680) VR=DS VM=1 Nominal Energy. |
| static readonly [NominalFrequencyRETIRED](../../aspose.medical.dicom.tags/tag/nominalfrequencyretired) | (0014,401A) VR=DS VM=1 Nominal Frequency (RETIRED). |
| static readonly [NominalInterval](../../aspose.medical.dicom.tags/tag/nominalinterval) | (0018,1062) VR=IS VM=1 Nominal Interval. |
| static readonly [NominalMaxEnergy](../../aspose.medical.dicom.tags/tag/nominalmaxenergy) | (0018,9374) VR=DS VM=1 Nominal Max Energy. |
| static readonly [NominalMinEnergy](../../aspose.medical.dicom.tags/tag/nominalminenergy) | (0018,9375) VR=DS VM=1 Nominal Min Energy. |
| static readonly [NominalPercentageOfCardiacPhase](../../aspose.medical.dicom.tags/tag/nominalpercentageofcardiacphase) | (0020,9241) VR=FL VM=1 Nominal Percentage of Cardiac Phase. |
| static readonly [NominalPercentageOfRespiratoryPhase](../../aspose.medical.dicom.tags/tag/nominalpercentageofrespiratoryphase) | (0020,9245) VR=FL VM=1 Nominal Percentage of Respiratory Phase. |
| static readonly [NominalPriorDose](../../aspose.medical.dicom.tags/tag/nominalpriordose) | (300A,001A) VR=DS VM=1 Nominal Prior Dose. |
| static readonly [NominalRangeModulatedRegionDepths](../../aspose.medical.dicom.tags/tag/nominalrangemodulatedregiondepths) | (300A,0504) VR=FL VM=2 Nominal Range Modulated Region Depths. |
| static readonly [NominalRangeModulationFractions](../../aspose.medical.dicom.tags/tag/nominalrangemodulationfractions) | (300A,0503) VR=FL VM=2 Nominal Range Modulation Fractions. |
| static readonly [NominalRespiratoryTriggerDelayTime](../../aspose.medical.dicom.tags/tag/nominalrespiratorytriggerdelaytime) | (0020,9255) VR=FD VM=1 Nominal Respiratory Trigger Delay Time. |
| static readonly [NominalScannedPixelSpacing](../../aspose.medical.dicom.tags/tag/nominalscannedpixelspacing) | (0018,2010) VR=DS VM=2 Nominal Scanned Pixel Spacing. |
| static readonly [NominalScreenDefinitionSequence](../../aspose.medical.dicom.tags/tag/nominalscreendefinitionsequence) | (0072,0102) VR=SQ VM=1 Nominal Screen Definition Sequence. |
| static readonly [NonconformingDataElementValue](../../aspose.medical.dicom.tags/tag/nonconformingdataelementvalue) | (0400,0552) VR=OB VM=1 Nonconforming Data Element Value. |
| static readonly [NonconformingModifiedAttributesSequence](../../aspose.medical.dicom.tags/tag/nonconformingmodifiedattributessequence) | (0400,0551) VR=SQ VM=1 Nonconforming Modified Attributes Sequence. |
| static readonly [NonDICOMOutputCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/nondicomoutputcodesequenceretired) | (0040,4032) VR=SQ VM=1 Non-DICOM Output Code Sequence (RETIRED). |
| static readonly [NonidentifyingPrivateElements](../../aspose.medical.dicom.tags/tag/nonidentifyingprivateelements) | (0008,0304) VR=US VM=1-n Nonidentifying Private Elements. |
| static readonly [NonUniformRadialSamplingCorrected](../../aspose.medical.dicom.tags/tag/nonuniformradialsamplingcorrected) | (0018,9766) VR=CS VM=1 Non-uniform Radial Sampling Corrected. |
| static readonly [NormalizationFactorFormatRETIRED](../../aspose.medical.dicom.tags/tag/normalizationfactorformatretired) | (0028,0710) VR=US VM=1 Normalization Factor Format (RETIRED). |
| static readonly [NormalizationPoint](../../aspose.medical.dicom.tags/tag/normalizationpoint) | (3004,0008) VR=DS VM=3 Normalization Point. |
| static readonly [NormalReverseRETIRED](../../aspose.medical.dicom.tags/tag/normalreverseretired) | (0000,5140) VR=CS VM=1 Normal/Reverse (RETIRED). |
| static readonly [NotchFilterBandwidth](../../aspose.medical.dicom.tags/tag/notchfilterbandwidth) | (003A,0223) VR=DS VM=1 Notch Filter Bandwidth. |
| static readonly [NotchFilterCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/notchfiltercharacteristicssequence) | (003A,0321) VR=SQ VM=1 Notch Filter Characteristics Sequence. |
| static readonly [NotchFilterFrequency](../../aspose.medical.dicom.tags/tag/notchfilterfrequency) | (003A,0222) VR=DS VM=1 Notch Filter Frequency. |
| static readonly [NotificationFromManufacturerSequence](../../aspose.medical.dicom.tags/tag/notificationfrommanufacturersequence) | (0068,6265) VR=SQ VM=1 Notification From Manufacturer Sequence. |
| static readonly [NTPSourceAddress](../../aspose.medical.dicom.tags/tag/ntpsourceaddress) | (0018,1803) VR=LO VM=1 NTP Source Address. |
| static readonly [NuclearMedicineSeriesTypeRETIRED](../../aspose.medical.dicom.tags/tag/nuclearmedicineseriestyperetired) | (0008,0042) VR=CS VM=1 Nuclear Medicine Series Type (RETIRED). |
| static readonly [NumberOfAcquisitionDevices](../../aspose.medical.dicom.tags/tag/numberofacquisitiondevices) | (3002,0116) VR=US VM=1 Number of Acquisition Devices. |
| static readonly [NumberOfAlarmObjectsRETIRED](../../aspose.medical.dicom.tags/tag/numberofalarmobjectsretired) | (4010,1034) VR=US VM=1 Number of Alarm Objects (RETIRED). |
| static readonly [NumberOfAnnotations](../../aspose.medical.dicom.tags/tag/numberofannotations) | (006A,000C) VR=UL VM=1 Number of Annotations. |
| static readonly [NumberOfAssessmentObservations](../../aspose.medical.dicom.tags/tag/numberofassessmentobservations) | (0082,0006) VR=UL VM=1 Number of Assessment Observations. |
| static readonly [NumberOfAverages](../../aspose.medical.dicom.tags/tag/numberofaverages) | (0018,0083) VR=DS VM=1 Number of Averages. |
| static readonly [NumberOfBeams](../../aspose.medical.dicom.tags/tag/numberofbeams) | (300A,0080) VR=IS VM=1 Number of Beams. |
| static readonly [NumberOfBlocks](../../aspose.medical.dicom.tags/tag/numberofblocks) | (300A,00F0) VR=IS VM=1 Number of Blocks. |
| static readonly [NumberOfBlockSlabItems](../../aspose.medical.dicom.tags/tag/numberofblockslabitems) | (300A,0440) VR=IS VM=1 Number of Block Slab Items. |
| static readonly [NumberOfBoli](../../aspose.medical.dicom.tags/tag/numberofboli) | (300A,00ED) VR=IS VM=1 Number of Boli. |
| static readonly [NumberOfBoluses](../../aspose.medical.dicom.tags/tag/numberofboluses) | (300A,0674) VR=US VM=1 Number of Boluses. |
| static readonly [NumberOfBrachyApplicationSetups](../../aspose.medical.dicom.tags/tag/numberofbrachyapplicationsetups) | (300A,00A0) VR=IS VM=1 Number of Brachy Application Setups. |
| static readonly [NumberOfBscansPerFrame](../../aspose.medical.dicom.tags/tag/numberofbscansperframe) | (0022,1642) VR=UL VM=1 Number of B-scans Per Frame. |
| static readonly [NumberOfCalibrationFramesRETIRED](../../aspose.medical.dicom.tags/tag/numberofcalibrationframesretired) | (0014,6004) VR=DS VM=1 Number of Calibration Frames (RETIRED). |
| static readonly [NumberOfChannelsRETIRED](../../aspose.medical.dicom.tags/tag/numberofchannelsretired) | (50xx,2004) VR=US VM=1 Number of Channels (RETIRED). |
| static readonly [NumberOfColumnsInFullAcquisitionImageRETIRED](../../aspose.medical.dicom.tags/tag/numberofcolumnsinfullacquisitionimageretired) | (0014,6006) VR=DS VM=1 Number Of Columns in Full Acquisition Image (RETIRED). |
| static readonly [NumberOfCompensators](../../aspose.medical.dicom.tags/tag/numberofcompensators) | (300A,00E0) VR=IS VM=1 Number of Compensators. |
| static readonly [NumberOfCompletedSuboperations](../../aspose.medical.dicom.tags/tag/numberofcompletedsuboperations) | (0000,1021) VR=US VM=1 Number of Completed Sub-operations. |
| static readonly [NumberOfContourPoints](../../aspose.medical.dicom.tags/tag/numberofcontourpoints) | (3006,0046) VR=IS VM=1 Number of Contour Points. |
| static readonly [NumberOfControlPoints](../../aspose.medical.dicom.tags/tag/numberofcontrolpoints) | (300A,0110) VR=IS VM=1 Number of Control Points. |
| static readonly [NumberOfCopies](../../aspose.medical.dicom.tags/tag/numberofcopies) | (2000,0010) VR=IS VM=1 Number of Copies. |
| static readonly [NumberOfDetectors](../../aspose.medical.dicom.tags/tag/numberofdetectors) | (0054,0021) VR=US VM=1 Number of Detectors. |
| static readonly [NumberOfDisplaySubsystems](../../aspose.medical.dicom.tags/tag/numberofdisplaysubsystems) | (0028,7001) VR=US VM=1 Number of Display Subsystems. |
| static readonly [NumberOfElementsRETIRED](../../aspose.medical.dicom.tags/tag/numberofelementsretired) | (0014,4012) VR=US VM=1 Number of Elements (RETIRED). |
| static readonly [NumberOfEnergyWindows](../../aspose.medical.dicom.tags/tag/numberofenergywindows) | (0054,0011) VR=US VM=1 Number of Energy Windows. |
| static readonly [NumberOfEventTimers](../../aspose.medical.dicom.tags/tag/numberofeventtimers) | (0008,2129) VR=IS VM=1 Number of Event Timers. |
| static readonly [NumberOfFailedSuboperations](../../aspose.medical.dicom.tags/tag/numberoffailedsuboperations) | (0000,1022) VR=US VM=1 Number of Failed Sub-operations. |
| static readonly [NumberOfFilms](../../aspose.medical.dicom.tags/tag/numberoffilms) | (2100,0170) VR=IS VM=1 Number of Films. |
| static readonly [NumberOfFocalPlanes](../../aspose.medical.dicom.tags/tag/numberoffocalplanes) | (0048,0013) VR=US VM=1 Number of Focal Planes. |
| static readonly [NumberOfFractionPatternDigitsPerDay](../../aspose.medical.dicom.tags/tag/numberoffractionpatterndigitsperday) | (300A,0079) VR=IS VM=1 Number of Fraction Pattern Digits Per Day. |
| static readonly [NumberOfFractions](../../aspose.medical.dicom.tags/tag/numberoffractions) | (3010,007D) VR=US VM=1 Number of Fractions. |
| static readonly [NumberOfFractionsDelivered](../../aspose.medical.dicom.tags/tag/numberoffractionsdelivered) | (3008,005A) VR=IS VM=1 Number of Fractions Delivered. |
| static readonly [NumberOfFractionsIncluded](../../aspose.medical.dicom.tags/tag/numberoffractionsincluded) | (300C,0119) VR=US VM=1 Number of Fractions Included. |
| static readonly [NumberOfFractionsPlanned](../../aspose.medical.dicom.tags/tag/numberoffractionsplanned) | (300A,0078) VR=IS VM=1 Number of Fractions Planned. |
| static readonly [NumberOfFrames](../../aspose.medical.dicom.tags/tag/numberofframes) | (0028,0008) VR=IS VM=1 Number of Frames. |
| static readonly [NumberOfFramesInOverlay](../../aspose.medical.dicom.tags/tag/numberofframesinoverlay) | (60xx,0015) VR=IS VM=1 Number of Frames in Overlay. |
| static readonly [NumberOfFramesInPhase](../../aspose.medical.dicom.tags/tag/numberofframesinphase) | (0054,0033) VR=US VM=1 Number of Frames in Phase. |
| static readonly [NumberOfFramesInRotation](../../aspose.medical.dicom.tags/tag/numberofframesinrotation) | (0054,0053) VR=US VM=1 Number of Frames in Rotation. |
| static readonly [NumberOfFramesIntegratedRETIRED](../../aspose.medical.dicom.tags/tag/numberofframesintegratedretired) | (0014,3012) VR=DS VM=1 Number of Frames Integrated (RETIRED). |
| static readonly [NumberOfFramesUsedForIntegrationRETIRED](../../aspose.medical.dicom.tags/tag/numberofframesusedforintegrationretired) | (0014,3073) VR=DS VM=1 Number of Frames Used for Integration (RETIRED). |
| static readonly [NumberOfGeneralAccessories](../../aspose.medical.dicom.tags/tag/numberofgeneralaccessories) | (300A,0672) VR=US VM=1 Number of General Accessories. |
| static readonly [NumberOfGraphicPoints](../../aspose.medical.dicom.tags/tag/numberofgraphicpoints) | (0070,0021) VR=US VM=1 Number of Graphic Points. |
| static readonly [NumberOfHorizontalPixels](../../aspose.medical.dicom.tags/tag/numberofhorizontalpixels) | (0072,0106) VR=US VM=1 Number of Horizontal Pixels. |
| static readonly [NumberOfIntervalFractions](../../aspose.medical.dicom.tags/tag/numberofintervalfractions) | (3010,007C) VR=IS VM=1 Number of Interval Fractions. |
| static readonly [NumberOfIterations](../../aspose.medical.dicom.tags/tag/numberofiterations) | (0018,9739) VR=US VM=1 Number of Iterations. |
| static readonly [NumberOfKSpaceTrajectories](../../aspose.medical.dicom.tags/tag/numberofkspacetrajectories) | (0018,9093) VR=US VM=1 Number of k-Space Trajectories. |
| static readonly [NumberOfLampsRETIRED](../../aspose.medical.dicom.tags/tag/numberoflampsretired) | (0014,6035) VR=DS VM=1 Number of Lamps (RETIRED). |
| static readonly [NumberOfLateralSpreadingDevices](../../aspose.medical.dicom.tags/tag/numberoflateralspreadingdevices) | (300A,0330) VR=IS VM=1 Number of Lateral Spreading Devices. |
| static readonly [NumberOfLeafJawPairs](../../aspose.medical.dicom.tags/tag/numberofleafjawpairs) | (300A,00BC) VR=IS VM=1 Number of Leaf/Jaw Pairs. |
| static readonly [NumberOfLuminancePoints](../../aspose.medical.dicom.tags/tag/numberofluminancepoints) | (0028,701B) VR=US VM=1 Number of Luminance Points. |
| static readonly [NumberOfMapPoints](../../aspose.medical.dicom.tags/tag/numberofmappoints) | (0022,1530) VR=UL VM=1 Number of Map Points. |
| static readonly [NumberOfMatchesRETIRED](../../aspose.medical.dicom.tags/tag/numberofmatchesretired) | (0000,0850) VR=US VM=1 Number of Matches (RETIRED). |
| static readonly [NumberOfOpticalPaths](../../aspose.medical.dicom.tags/tag/numberofopticalpaths) | (0048,0302) VR=UL VM=1 Number of Optical Paths. |
| static readonly [NumberOfPaddedALines](../../aspose.medical.dicom.tags/tag/numberofpaddedalines) | (0052,0038) VR=US VM=1 Number of Padded A-lines. |
| static readonly [NumberOfPaintings](../../aspose.medical.dicom.tags/tag/numberofpaintings) | (300A,039A) VR=IS VM=1 Number of Paintings. |
| static readonly [NumberOfParallelRTBeamDelimiters](../../aspose.medical.dicom.tags/tag/numberofparallelrtbeamdelimiters) | (300A,0648) VR=US VM=1 Number of Parallel RT Beam Delimiters. |
| static readonly [NumberOfPatientRelatedInstances](../../aspose.medical.dicom.tags/tag/numberofpatientrelatedinstances) | (0020,1204) VR=IS VM=1 Number of Patient Related Instances. |
| static readonly [NumberOfPatientRelatedSeries](../../aspose.medical.dicom.tags/tag/numberofpatientrelatedseries) | (0020,1202) VR=IS VM=1 Number of Patient Related Series. |
| static readonly [NumberOfPatientRelatedStudies](../../aspose.medical.dicom.tags/tag/numberofpatientrelatedstudies) | (0020,1200) VR=IS VM=1 Number of Patient Related Studies. |
| static readonly [NumberOfPatientSupportDevices](../../aspose.medical.dicom.tags/tag/numberofpatientsupportdevices) | (300A,0687) VR=US VM=1 Number of Patient Support Devices. |
| static readonly [NumberOfPhaseEncodingSteps](../../aspose.medical.dicom.tags/tag/numberofphaseencodingsteps) | (0018,0089) VR=IS VM=1 Number of Phase Encoding Steps. |
| static readonly [NumberOfPhases](../../aspose.medical.dicom.tags/tag/numberofphases) | (0054,0031) VR=US VM=1 Number of Phases. |
| static readonly [NumberOfPointsRETIRED](../../aspose.medical.dicom.tags/tag/numberofpointsretired) | (50xx,0010) VR=US VM=1 Number of Points (RETIRED). |
| static readonly [NumberOfPolygonalVertices](../../aspose.medical.dicom.tags/tag/numberofpolygonalvertices) | (0018,1637) VR=UL VM=1 Number of Polygonal Vertices. |
| static readonly [NumberOfPriorsReferenced](../../aspose.medical.dicom.tags/tag/numberofpriorsreferenced) | (0072,0014) VR=US VM=1 Number of Priors Referenced. |
| static readonly [NumberOfPulses](../../aspose.medical.dicom.tags/tag/numberofpulses) | (300A,028A) VR=IS VM=1 Number of Pulses. |
| static readonly [NumberOfRadiationGenerationModes](../../aspose.medical.dicom.tags/tag/numberofradiationgenerationmodes) | (300A,0685) VR=US VM=1 Number of Radiation GenerationModes. |
| static readonly [NumberOfRangeModulators](../../aspose.medical.dicom.tags/tag/numberofrangemodulators) | (300A,0340) VR=IS VM=1 Number of Range Modulators. |
| static readonly [NumberOfRangeShifters](../../aspose.medical.dicom.tags/tag/numberofrangeshifters) | (300A,0312) VR=IS VM=1 Number of Range Shifters. |
| static readonly [NumberOfReferencesRETIRED](../../aspose.medical.dicom.tags/tag/numberofreferencesretired) | (0004,1600) VR=UL VM=1 Number of References (RETIRED). |
| static readonly [NumberOfRemainingSuboperations](../../aspose.medical.dicom.tags/tag/numberofremainingsuboperations) | (0000,1020) VR=US VM=1 Number of Remaining Sub-operations. |
| static readonly [NumberOfRotations](../../aspose.medical.dicom.tags/tag/numberofrotations) | (0054,0051) VR=US VM=1 Number of Rotations. |
| static readonly [NumberOfRowsInFullAcquisitionImageRETIRED](../../aspose.medical.dicom.tags/tag/numberofrowsinfullacquisitionimageretired) | (0014,6005) VR=DS VM=1 Number of Rows in Full Acquisition Image (RETIRED). |
| static readonly [NumberOfRRIntervals](../../aspose.medical.dicom.tags/tag/numberofrrintervals) | (0054,0061) VR=US VM=1 Number of R-R Intervals. |
| static readonly [NumberOfRTAccessoryHolders](../../aspose.medical.dicom.tags/tag/numberofrtaccessoryholders) | (300A,0670) VR=US VM=1 Number of RT Accessory Holders. |
| static readonly [NumberOfRTBeamLimitingDeviceOpenings](../../aspose.medical.dicom.tags/tag/numberofrtbeamlimitingdeviceopenings) | (300A,0657) VR=US VM=1 Number of RT Beam Limiting Device Openings. |
| static readonly [NumberOfRTBeamLimitingDevices](../../aspose.medical.dicom.tags/tag/numberofrtbeamlimitingdevices) | (300A,0641) VR=US VM=1 Number of RT Beam Limiting Devices. |
| static readonly [NumberOfRTControlPoints](../../aspose.medical.dicom.tags/tag/numberofrtcontrolpoints) | (300A,0604) VR=US VM=1 Number of RT Control Points. |
| static readonly [NumberOfSamplesRETIRED](../../aspose.medical.dicom.tags/tag/numberofsamplesretired) | (50xx,2006) VR=UL VM=1 Number of Samples (RETIRED). |
| static readonly [NumberOfScanSpotPositions](../../aspose.medical.dicom.tags/tag/numberofscanspotpositions) | (300A,0392) VR=IS VM=1 Number of Scan Spot Positions. |
| static readonly [NumberOfScreens](../../aspose.medical.dicom.tags/tag/numberofscreens) | (0072,0100) VR=US VM=1 Number of Screens. |
| static readonly [NumberOfSeriesRelatedInstances](../../aspose.medical.dicom.tags/tag/numberofseriesrelatedinstances) | (0020,1209) VR=IS VM=1 Number of Series Related Instances. |
| static readonly [NumberOfSlices](../../aspose.medical.dicom.tags/tag/numberofslices) | (0054,0081) VR=US VM=1 Number of Slices. |
| static readonly [NumberOfStages](../../aspose.medical.dicom.tags/tag/numberofstages) | (0008,2124) VR=IS VM=1 Number of Stages. |
| static readonly [NumberOfStudyRecordsInInstance](../../aspose.medical.dicom.tags/tag/numberofstudyrecordsininstance) | (0008,0427) VR=UL VM=1 Number of Study Records in Instance. |
| static readonly [NumberOfStudyRelatedInstances](../../aspose.medical.dicom.tags/tag/numberofstudyrelatedinstances) | (0020,1208) VR=IS VM=1 Number of Study Related Instances. |
| static readonly [NumberOfStudyRelatedSeries](../../aspose.medical.dicom.tags/tag/numberofstudyrelatedseries) | (0020,1206) VR=IS VM=1 Number of Study Related Series. |
| static readonly [NumberOfSubsets](../../aspose.medical.dicom.tags/tag/numberofsubsets) | (0018,9740) VR=US VM=1 Number of Subsets. |
| static readonly [NumberOfSurfacePoints](../../aspose.medical.dicom.tags/tag/numberofsurfacepoints) | (0066,0015) VR=UL VM=1 Number of Surface Points. |
| static readonly [NumberOfSurfaces](../../aspose.medical.dicom.tags/tag/numberofsurfaces) | (0066,0001) VR=UL VM=1 Number of Surfaces. |
| static readonly [NumberOfTableBreakPoints](../../aspose.medical.dicom.tags/tag/numberoftablebreakpoints) | (0018,6050) VR=UL VM=1 Number of Table Break Points. |
| static readonly [NumberOfTableColumns](../../aspose.medical.dicom.tags/tag/numberoftablecolumns) | (0040,A803) VR=UL VM=1 Number of Table Columns. |
| static readonly [NumberOfTableEntries](../../aspose.medical.dicom.tags/tag/numberoftableentries) | (0018,6056) VR=UL VM=1 Number of Table Entries. |
| static readonly [NumberOfTableRows](../../aspose.medical.dicom.tags/tag/numberoftablerows) | (0040,A802) VR=UL VM=1 Number of Table Rows. |
| static readonly [NumberOfTablesRETIRED](../../aspose.medical.dicom.tags/tag/numberoftablesretired) | (0028,08x2) VR=US VM=1 Number of Tables (RETIRED). |
| static readonly [NumberOfTemporalPositions](../../aspose.medical.dicom.tags/tag/numberoftemporalpositions) | (0020,0105) VR=IS VM=1 Number of Temporal Positions. |
| static readonly [NumberOfTimeSlices](../../aspose.medical.dicom.tags/tag/numberoftimeslices) | (0054,0101) VR=US VM=1 Number of Time Slices. |
| static readonly [NumberOfTimeSlots](../../aspose.medical.dicom.tags/tag/numberoftimeslots) | (0054,0071) VR=US VM=1 Number of Time Slots. |
| static readonly [NumberOfTomosynthesisSourceImages](../../aspose.medical.dicom.tags/tag/numberoftomosynthesissourceimages) | (0018,1495) VR=IS VM=1 Number of Tomosynthesis Source Images. |
| static readonly [NumberOfTotalObjectsRETIRED](../../aspose.medical.dicom.tags/tag/numberoftotalobjectsretired) | (4010,1033) VR=US VM=1 Number of Total Objects (RETIRED). |
| static readonly [NumberOfTransformStepsRETIRED](../../aspose.medical.dicom.tags/tag/numberoftransformstepsretired) | (0028,0402) VR=US VM=1 Number of Transform Steps (RETIRED). |
| static readonly [NumberOfTriggersInPhase](../../aspose.medical.dicom.tags/tag/numberoftriggersinphase) | (0054,0211) VR=US VM=1 Number of Triggers in Phase. |
| static readonly [NumberOfTurnsInCoilRETIRED](../../aspose.medical.dicom.tags/tag/numberofturnsincoilretired) | (0014,6030) VR=DS VM=1 Number of Turns in Coil (RETIRED). |
| static readonly [NumberOfVectors](../../aspose.medical.dicom.tags/tag/numberofvectors) | (0066,001E) VR=UL VM=1 Number of Vectors. |
| static readonly [NumberOfVerticalPixels](../../aspose.medical.dicom.tags/tag/numberofverticalpixels) | (0072,0104) VR=US VM=1 Number of Vertical Pixels. |
| static readonly [NumberOfViewsInStage](../../aspose.medical.dicom.tags/tag/numberofviewsinstage) | (0008,212A) VR=IS VM=1 Number of Views in Stage. |
| static readonly [NumberOfVisualStimuli](../../aspose.medical.dicom.tags/tag/numberofvisualstimuli) | (0024,0038) VR=US VM=1 Number of Visual Stimuli. |
| static readonly [NumberOfVolumetricCurvePoints](../../aspose.medical.dicom.tags/tag/numberofvolumetriccurvepoints) | (0070,150C) VR=UL VM=1 Number of Volumetric Curve Points. |
| static readonly [NumberOfWarningSuboperations](../../aspose.medical.dicom.tags/tag/numberofwarningsuboperations) | (0000,1023) VR=US VM=1 Number of Warning Sub-operations. |
| static readonly [NumberOfWaveformChannels](../../aspose.medical.dicom.tags/tag/numberofwaveformchannels) | (003A,0005) VR=US VM=1 Number of Waveform Channels. |
| static readonly [NumberOfWaveformSamples](../../aspose.medical.dicom.tags/tag/numberofwaveformsamples) | (003A,0010) VR=UL VM=1 Number of Waveform Samples. |
| static readonly [NumberOfWedgePositions](../../aspose.medical.dicom.tags/tag/numberofwedgepositions) | (300A,0655) VR=US VM=1 Number of Wedge Positions. |
| static readonly [NumberOfWedges](../../aspose.medical.dicom.tags/tag/numberofwedges) | (300A,00D0) VR=IS VM=1 Number of Wedges. |
| static readonly [NumberOfZeroFills](../../aspose.medical.dicom.tags/tag/numberofzerofills) | (0018,9066) VR=US VM=1-2 Number of Zero Fills. |
| static readonly [NumericValue](../../aspose.medical.dicom.tags/tag/numericvalue) | (0040,A30A) VR=DS VM=1-n Numeric Value. |
| static readonly [NumericValueQualifierCodeSequence](../../aspose.medical.dicom.tags/tag/numericvaluequalifiercodesequence) | (0040,A301) VR=SQ VM=1 Numeric Value Qualifier Code Sequence. |
| static readonly [ObjectBinaryIdentifierTrialRETIRED](../../aspose.medical.dicom.tags/tag/objectbinaryidentifiertrialretired) | (0040,A074) VR=OB VM=1 Object Binary Identifier (Trial) (RETIRED). |
| static readonly [ObjectDirectoryBinaryIdentifierTrialRETIRED](../../aspose.medical.dicom.tags/tag/objectdirectorybinaryidentifiertrialretired) | (0040,A089) VR=OB VM=1 Object Directory Binary Identifier (Trial) (RETIRED). |
| static readonly [ObjectiveLensNumericalAperture](../../aspose.medical.dicom.tags/tag/objectivelensnumericalaperture) | (0048,0113) VR=DS VM=1 Objective Lens Numerical Aperture. |
| static readonly [ObjectiveLensPower](../../aspose.medical.dicom.tags/tag/objectivelenspower) | (0048,0112) VR=DS VM=1 Objective Lens Power. |
| static readonly [ObjectPixelSpacingInCenterOfBeam](../../aspose.medical.dicom.tags/tag/objectpixelspacingincenterofbeam) | (0018,9404) VR=FL VM=2 Object Pixel Spacing in Center of Beam. |
| static readonly [ObjectSoundSpeed](../../aspose.medical.dicom.tags/tag/objectsoundspeed) | (0018,9833) VR=FD VM=1 Object Sound Speed. |
| static readonly [ObjectThicknessSequence](../../aspose.medical.dicom.tags/tag/objectthicknesssequence) | (0018,9456) VR=SQ VM=1 Object Thickness Sequence. |
| static readonly [ObliqueCroppingPlaneSequence](../../aspose.medical.dicom.tags/tag/obliquecroppingplanesequence) | (0070,1304) VR=SQ VM=1 Oblique Cropping Plane Sequence. |
| static readonly [ObservationBasisCodeSequence](../../aspose.medical.dicom.tags/tag/observationbasiscodesequence) | (0082,0022) VR=SQ VM=1 Observation Basis Code Sequence. |
| static readonly [ObservationCategoryCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/observationcategorycodesequencetrialretired) | (0040,A167) VR=SQ VM=1 Observation Category Code Sequence (Trial) (RETIRED). |
| static readonly [ObservationDateTime](../../aspose.medical.dicom.tags/tag/observationdatetime) | (0040,A032) VR=DT VM=1 Observation DateTime. |
| static readonly [ObservationDateTrialRETIRED](../../aspose.medical.dicom.tags/tag/observationdatetrialretired) | (0040,A192) VR=DA VM=1 Observation Date (Trial) (RETIRED). |
| static readonly [ObservationDescription](../../aspose.medical.dicom.tags/tag/observationdescription) | (0082,000A) VR=UT VM=1 Observation Description. |
| static readonly [ObservationNumber](../../aspose.medical.dicom.tags/tag/observationnumber) | (3006,0082) VR=IS VM=1 Observation Number. |
| static readonly [ObservationSignificance](../../aspose.medical.dicom.tags/tag/observationsignificance) | (0082,0008) VR=CS VM=1 Observation Significance. |
| static readonly [ObservationStartDateTime](../../aspose.medical.dicom.tags/tag/observationstartdatetime) | (0040,A033) VR=DT VM=1 Observation Start DateTime. |
| static readonly [ObservationSubjectClassTrialRETIRED](../../aspose.medical.dicom.tags/tag/observationsubjectclasstrialretired) | (0040,A403) VR=CS VM=1 Observation Subject Class (Trial) (RETIRED). |
| static readonly [ObservationSubjectContextFlagTrialRETIRED](../../aspose.medical.dicom.tags/tag/observationsubjectcontextflagtrialretired) | (0040,A600) VR=CS VM=1 Observation Subject Context Flag (Trial) (RETIRED). |
| static readonly [ObservationSubjectTypeCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/observationsubjecttypecodesequencetrialretired) | (0040,A404) VR=SQ VM=1 Observation Subject Type Code Sequence (Trial) (RETIRED). |
| static readonly [ObservationSubjectUIDTrialRETIRED](../../aspose.medical.dicom.tags/tag/observationsubjectuidtrialretired) | (0040,A402) VR=UI VM=1 Observation Subject UID (Trial) (RETIRED). |
| static readonly [ObservationTimeTrialRETIRED](../../aspose.medical.dicom.tags/tag/observationtimetrialretired) | (0040,A193) VR=TM VM=1 Observation Time (Trial) (RETIRED). |
| static readonly [ObservationUID](../../aspose.medical.dicom.tags/tag/observationuid) | (0040,A171) VR=UI VM=1 Observation UID. |
| static readonly [ObserverContextFlagTrialRETIRED](../../aspose.medical.dicom.tags/tag/observercontextflagtrialretired) | (0040,A601) VR=CS VM=1 Observer Context Flag (Trial) (RETIRED). |
| static readonly [ObserverType](../../aspose.medical.dicom.tags/tag/observertype) | (0040,A084) VR=CS VM=1 Observer Type. |
| static readonly [Occupation](../../aspose.medical.dicom.tags/tag/occupation) | (0010,2180) VR=SH VM=1 Occupation. |
| static readonly [OCTAcquisitionDomain](../../aspose.medical.dicom.tags/tag/octacquisitiondomain) | (0052,0006) VR=CS VM=1 OCT Acquisition Domain. |
| static readonly [OCTBscanAnalysisAcquisitionParametersSequence](../../aspose.medical.dicom.tags/tag/octbscananalysisacquisitionparameterssequence) | (0022,1640) VR=SQ VM=1 OCT B-scan Analysis Acquisition Parameters Sequence. |
| static readonly [OCTFocalDistance](../../aspose.medical.dicom.tags/tag/octfocaldistance) | (0052,0002) VR=FD VM=1 OCT Focal Distance. |
| static readonly [OCTOpticalCenterWavelength](../../aspose.medical.dicom.tags/tag/octopticalcenterwavelength) | (0052,0007) VR=FD VM=1 OCT Optical Center Wavelength. |
| static readonly [OCTZOffsetApplied](../../aspose.medical.dicom.tags/tag/octzoffsetapplied) | (0052,0026) VR=CS VM=1 OCT Z Offset Applied. |
| static readonly [OCTZOffsetCorrection](../../aspose.medical.dicom.tags/tag/octzoffsetcorrection) | (0052,0030) VR=SS VM=1 OCT Z Offset Correction. |
| static readonly [OECFColumnNames](../../aspose.medical.dicom.tags/tag/oecfcolumnnames) | (0016,0008) VR=UC VM=1-n OECF Column Names. |
| static readonly [OECFColumns](../../aspose.medical.dicom.tags/tag/oecfcolumns) | (0016,0007) VR=IS VM=1 OECF Columns. |
| static readonly [OECFRows](../../aspose.medical.dicom.tags/tag/oecfrows) | (0016,0006) VR=IS VM=1 OECF Rows. |
| static readonly [OECFValues](../../aspose.medical.dicom.tags/tag/oecfvalues) | (0016,0009) VR=DS VM=1-n OECF Values. |
| static readonly [OffendingElement](../../aspose.medical.dicom.tags/tag/offendingelement) | (0000,0901) VR=AT VM=1-n Offending Element. |
| static readonly [OffsetDirection](../../aspose.medical.dicom.tags/tag/offsetdirection) | (0018,9905) VR=CS VM=1 Offset Direction. |
| static readonly [OffsetDistance](../../aspose.medical.dicom.tags/tag/offsetdistance) | (0018,9904) VR=DS VM=1 Offset Distance. |
| static readonly [OffsetOfReferencedLowerLevelDirectoryEntity](../../aspose.medical.dicom.tags/tag/offsetofreferencedlowerleveldirectoryentity) | (0004,1420) VR=UL VM=1 Offset of Referenced Lower-Level Directory Entity. |
| static readonly [OffsetOfTheFirstDirectoryRecordOfTheRootDirectoryEntity](../../aspose.medical.dicom.tags/tag/offsetofthefirstdirectoryrecordoftherootdirectoryentity) | (0004,1200) VR=UL VM=1 Offset of the First Directory Record of the Root Directory Entity. |
| static readonly [OffsetOfTheLastDirectoryRecordOfTheRootDirectoryEntity](../../aspose.medical.dicom.tags/tag/offsetofthelastdirectoryrecordoftherootdirectoryentity) | (0004,1202) VR=UL VM=1 Offset of the Last Directory Record of the Root Directory Entity. |
| static readonly [OffsetOfTheNextDirectoryRecord](../../aspose.medical.dicom.tags/tag/offsetofthenextdirectoryrecord) | (0004,1400) VR=UL VM=1 Offset of the Next Directory Record. |
| static readonly [OmittedApplicationSetupSequence](../../aspose.medical.dicom.tags/tag/omittedapplicationsetupsequence) | (0074,140E) VR=SQ VM=1 Omitted Application Setup Sequence. |
| static readonly [OmittedBeamTaskSequence](../../aspose.medical.dicom.tags/tag/omittedbeamtasksequence) | (300C,0111) VR=SQ VM=1 Omitted Beam Task Sequence. |
| static readonly [OmittedChannelSequence](../../aspose.medical.dicom.tags/tag/omittedchannelsequence) | (0074,1409) VR=SQ VM=1 Omitted Channel Sequence. |
| static readonly [OmittedRadiationSequence](../../aspose.medical.dicom.tags/tag/omittedradiationsequence) | (300A,0787) VR=SQ VM=1 Omitted Radiation Sequence. |
| static readonly [OnAxisBackgroundAnatomicStructureCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/onaxisbackgroundanatomicstructurecodesequencetrialretired) | (0008,225C) VR=SQ VM=1 On Axis Background Anatomic Structure Code Sequence (Trial) (RETIRED). |
| static readonly [OOIOwnerCreationTimeRETIRED](../../aspose.medical.dicom.tags/tag/ooiownercreationtimeretired) | (4010,1041) VR=DT VM=1 OOI Owner Creation Time (RETIRED). |
| static readonly [OOIOwnerSequenceRETIRED](../../aspose.medical.dicom.tags/tag/ooiownersequenceretired) | (4010,1047) VR=SQ VM=1 OOI Owner Sequence (RETIRED). |
| static readonly [OOIOwnerTypeRETIRED](../../aspose.medical.dicom.tags/tag/ooiownertyperetired) | (4010,1009) VR=CS VM=1 OOI Owner Type (RETIRED). |
| static readonly [OOISizeRETIRED](../../aspose.medical.dicom.tags/tag/ooisizeretired) | (4010,1043) VR=FL VM=3 OOI Size (RETIRED). |
| static readonly [OOITypeDescriptorRETIRED](../../aspose.medical.dicom.tags/tag/ooitypedescriptorretired) | (4010,1068) VR=LT VM=1 OOI Type Descriptor (RETIRED). |
| static readonly [OOITypeRETIRED](../../aspose.medical.dicom.tags/tag/ooityperetired) | (4010,1042) VR=CS VM=1 OOI Type (RETIRED). |
| static readonly [OperatingMode](../../aspose.medical.dicom.tags/tag/operatingmode) | (0018,9178) VR=CS VM=1 Operating Mode. |
| static readonly [OperatingModeSequence](../../aspose.medical.dicom.tags/tag/operatingmodesequence) | (0018,9176) VR=SQ VM=1 Operating Mode Sequence. |
| static readonly [OperatingModeType](../../aspose.medical.dicom.tags/tag/operatingmodetype) | (0018,9177) VR=CS VM=1 Operating Mode Type. |
| static readonly [OperationOnPixelIntensityBeforeFittingRETIRED](../../aspose.medical.dicom.tags/tag/operationonpixelintensitybeforefittingretired) | (0014,605C) VR=CS VM=1 Operation on Pixel Intensity Before Fitting (RETIRED). |
| static readonly [OperationOnTimeAxisBeforeFittingRETIRED](../../aspose.medical.dicom.tags/tag/operationontimeaxisbeforefittingretired) | (0014,605B) VR=CS VM=1 Operation on Time Axis Before Fitting (RETIRED). |
| static readonly [OperatorIdentificationSequence](../../aspose.medical.dicom.tags/tag/operatoridentificationsequence) | (0008,1072) VR=SQ VM=1 Operator Identification Sequence. |
| static readonly [OperatorsName](../../aspose.medical.dicom.tags/tag/operatorsname) | (0008,1070) VR=PN VM=1-n Operators' Name. |
| static readonly [OphthalmicAnatomicReferencePointFrameCoordinate](../../aspose.medical.dicom.tags/tag/ophthalmicanatomicreferencepointframecoordinate) | (0022,1623) VR=FL VM=1 Ophthalmic Anatomic Reference Point Frame Coordinate. |
| static readonly [OphthalmicAnatomicReferencePointLocalizationType](../../aspose.medical.dicom.tags/tag/ophthalmicanatomicreferencepointlocalizationtype) | (0022,1633) VR=CS VM=1 Ophthalmic Anatomic Reference Point Localization Type. |
| static readonly [OphthalmicAnatomicReferencePointSequence](../../aspose.medical.dicom.tags/tag/ophthalmicanatomicreferencepointsequence) | (0022,1632) VR=SQ VM=1 Ophthalmic Anatomic Reference Point Sequence. |
| static readonly [OphthalmicAnatomicReferencePointXCoordinate](../../aspose.medical.dicom.tags/tag/ophthalmicanatomicreferencepointxcoordinate) | (0022,1624) VR=FL VM=1 Ophthalmic Anatomic Reference Point X-Coordinate. |
| static readonly [OphthalmicAnatomicReferencePointYCoordinate](../../aspose.medical.dicom.tags/tag/ophthalmicanatomicreferencepointycoordinate) | (0022,1626) VR=FL VM=1 Ophthalmic Anatomic Reference Point Y-Coordinate. |
| static readonly [OphthalmicAxialLength](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallength) | (0022,1019) VR=FL VM=1 Ophthalmic Axial Length. |
| static readonly [OphthalmicAxialLengthAcquisitionMethodCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthacquisitionmethodcodesequenceretired) | (0022,1153) VR=SQ VM=1 Ophthalmic Axial Length Acquisition Method Code Sequence (RETIRED). |
| static readonly [OphthalmicAxialLengthDataSourceCodeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthdatasourcecodesequence) | (0022,1150) VR=SQ VM=1 Ophthalmic Axial Length Data Source Code Sequence. |
| static readonly [OphthalmicAxialLengthDataSourceDescription](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthdatasourcedescription) | (0022,1159) VR=LO VM=1 Ophthalmic Axial Length Data Source Description. |
| static readonly [OphthalmicAxialLengthMeasurementModified](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthmeasurementmodified) | (0022,1140) VR=CS VM=1 Ophthalmic Axial Length Measurement Modified. |
| static readonly [OphthalmicAxialLengthMeasurementsLengthSummationSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthmeasurementslengthsummationsequence) | (0022,1212) VR=SQ VM=1 Ophthalmic Axial Length Measurements Length Summation Sequence. |
| static readonly [OphthalmicAxialLengthMeasurementsSegmentalLengthSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthmeasurementssegmentallengthsequence) | (0022,1211) VR=SQ VM=1 Ophthalmic Axial Length Measurements Segmental Length Sequence. |
| static readonly [OphthalmicAxialLengthMeasurementsSegmentNameCodeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthmeasurementssegmentnamecodesequence) | (0022,1101) VR=SQ VM=1 Ophthalmic Axial Length Measurements Segment Name Code Sequence. |
| static readonly [OphthalmicAxialLengthMeasurementsSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthmeasurementssequence) | (0022,1050) VR=SQ VM=1 Ophthalmic Axial Length Measurements Sequence. |
| static readonly [OphthalmicAxialLengthMeasurementsTotalLengthSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthmeasurementstotallengthsequence) | (0022,1210) VR=SQ VM=1 Ophthalmic Axial Length Measurements Total Length Sequence. |
| static readonly [OphthalmicAxialLengthMeasurementsType](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthmeasurementstype) | (0022,1010) VR=CS VM=1 Ophthalmic Axial Length Measurements Type. |
| static readonly [OphthalmicAxialLengthMethod](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthmethod) | (0022,1515) VR=CS VM=1 Ophthalmic Axial Length Method. |
| static readonly [OphthalmicAxialLengthQualityMetricSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthqualitymetricsequence) | (0022,1262) VR=SQ VM=1 Ophthalmic Axial Length Quality Metric Sequence. |
| static readonly [OphthalmicAxialLengthQualityMetricTypeCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthqualitymetrictypecodesequenceretired) | (0022,1265) VR=SQ VM=1 Ophthalmic Axial Length Quality Metric Type Code Sequence (RETIRED). |
| static readonly [OphthalmicAxialLengthQualityMetricTypeDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthqualitymetrictypedescriptionretired) | (0022,1273) VR=LO VM=1 Ophthalmic Axial Length Quality Metric Type Description (RETIRED). |
| static readonly [OphthalmicAxialLengthSelectionMethodCodeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthselectionmethodcodesequence) | (0022,1250) VR=SQ VM=1 Ophthalmic Axial Length Selection Method Code Sequence. |
| static readonly [OphthalmicAxialLengthSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthsequence) | (0022,1012) VR=SQ VM=1 Ophthalmic Axial Length Sequence. |
| static readonly [OphthalmicAxialLengthVelocity](../../aspose.medical.dicom.tags/tag/ophthalmicaxiallengthvelocity) | (0022,1059) VR=FL VM=1 Ophthalmic Axial Length Velocity. |
| static readonly [OphthalmicAxialMeasurementsDeviceType](../../aspose.medical.dicom.tags/tag/ophthalmicaxialmeasurementsdevicetype) | (0022,1009) VR=CS VM=1 Ophthalmic Axial Measurements Device Type. |
| static readonly [OphthalmicAxialMeasurementsLeftEyeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxialmeasurementslefteyesequence) | (0022,1008) VR=SQ VM=1 Ophthalmic Axial Measurements Left Eye Sequence. |
| static readonly [OphthalmicAxialMeasurementsRightEyeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicaxialmeasurementsrighteyesequence) | (0022,1007) VR=SQ VM=1 Ophthalmic Axial Measurements Right Eye Sequence. |
| static readonly [OphthalmicEnFaceImageQualityRatingSequence](../../aspose.medical.dicom.tags/tag/ophthalmicenfaceimagequalityratingsequence) | (0022,1628) VR=SQ VM=1 Ophthalmic En Face Image Quality Rating Sequence. |
| static readonly [OphthalmicEnFaceVolumeDescriptorScope](../../aspose.medical.dicom.tags/tag/ophthalmicenfacevolumedescriptorscope) | (0022,1629) VR=CS VM=1 Ophthalmic En Face Volume Descriptor Scope. |
| static readonly [OphthalmicEnFaceVolumeDescriptorSequence](../../aspose.medical.dicom.tags/tag/ophthalmicenfacevolumedescriptorsequence) | (0022,1627) VR=SQ VM=1 Ophthalmic En Face Volume Descriptor Sequence. |
| static readonly [OphthalmicFOV](../../aspose.medical.dicom.tags/tag/ophthalmicfov) | (0022,1517) VR=FL VM=1 Ophthalmic FOV. |
| static readonly [OphthalmicFrameLocationSequence](../../aspose.medical.dicom.tags/tag/ophthalmicframelocationsequence) | (0022,0031) VR=SQ VM=1 Ophthalmic Frame Location Sequence. |
| static readonly [OphthalmicImageOrientation](../../aspose.medical.dicom.tags/tag/ophthalmicimageorientation) | (0022,0039) VR=CS VM=1 Ophthalmic Image Orientation. |
| static readonly [OphthalmicImageTypeCodeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicimagetypecodesequence) | (0022,1615) VR=SQ VM=1 Ophthalmic Image Type Code Sequence. |
| static readonly [OphthalmicImageTypeDescription](../../aspose.medical.dicom.tags/tag/ophthalmicimagetypedescription) | (0022,1616) VR=LO VM=1 Ophthalmic Image Type Description. |
| static readonly [OphthalmicMappingDeviceType](../../aspose.medical.dicom.tags/tag/ophthalmicmappingdevicetype) | (0022,1415) VR=CS VM=1 Ophthalmic Mapping Device Type. |
| static readonly [OphthalmicPatientClinicalInformationLeftEyeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicpatientclinicalinformationlefteyesequence) | (0024,0114) VR=SQ VM=1 Ophthalmic Patient Clinical Information Left Eye Sequence. |
| static readonly [OphthalmicPatientClinicalInformationRightEyeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicpatientclinicalinformationrighteyesequence) | (0024,0115) VR=SQ VM=1 Ophthalmic Patient Clinical Information Right Eye Sequence. |
| static readonly [OphthalmicThicknessMappingNormalsSequence](../../aspose.medical.dicom.tags/tag/ophthalmicthicknessmappingnormalssequence) | (0022,1443) VR=SQ VM=1 Ophthalmic Thickness Mapping Normals Sequence. |
| static readonly [OphthalmicThicknessMapQualityRatingSequence](../../aspose.medical.dicom.tags/tag/ophthalmicthicknessmapqualityratingsequence) | (0022,1470) VR=SQ VM=1 Ophthalmic Thickness Map Quality Rating Sequence. |
| static readonly [OphthalmicThicknessMapQualityThresholdSequence](../../aspose.medical.dicom.tags/tag/ophthalmicthicknessmapqualitythresholdsequence) | (0022,1458) VR=SQ VM=1 Ophthalmic Thickness Map Quality Threshold Sequence. |
| static readonly [OphthalmicThicknessMapThresholdQualityRating](../../aspose.medical.dicom.tags/tag/ophthalmicthicknessmapthresholdqualityrating) | (0022,1460) VR=FL VM=1 Ophthalmic Thickness Map Threshold Quality Rating. |
| static readonly [OphthalmicThicknessMapTypeCodeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicthicknessmaptypecodesequence) | (0022,1436) VR=SQ VM=1 Ophthalmic Thickness Map Type Code Sequence. |
| static readonly [OphthalmicUltrasoundMethodCodeSequence](../../aspose.medical.dicom.tags/tag/ophthalmicultrasoundmethodcodesequence) | (0022,1044) VR=SQ VM=1 Ophthalmic Ultrasound Method Code Sequence. |
| static readonly [OphthalmicVolumetricPropertiesFlag](../../aspose.medical.dicom.tags/tag/ophthalmicvolumetricpropertiesflag) | (0022,1622) VR=CS VM=1 Ophthalmic Volumetric Properties Flag. |
| static readonly [OpticalCoatingTypeRETIRED](../../aspose.medical.dicom.tags/tag/opticalcoatingtyperetired) | (0014,6045) VR=ST VM=1 Optical Coating Type (RETIRED). |
| static readonly [OpticalMagnificationFactor](../../aspose.medical.dicom.tags/tag/opticalmagnificationfactor) | (0016,1005) VR=DS VM=1 Optical Magnification Factor. |
| static readonly [OpticalOphthalmicAxialLengthMeasurementsSequence](../../aspose.medical.dicom.tags/tag/opticalophthalmicaxiallengthmeasurementssequence) | (0022,1225) VR=SQ VM=1 Optical Ophthalmic Axial Length Measurements Sequence. |
| static readonly [OpticalPathDescription](../../aspose.medical.dicom.tags/tag/opticalpathdescription) | (0048,0107) VR=ST VM=1 Optical Path Description. |
| static readonly [OpticalPathIdentificationSequence](../../aspose.medical.dicom.tags/tag/opticalpathidentificationsequence) | (0048,0207) VR=SQ VM=1 Optical Path Identification Sequence. |
| static readonly [OpticalPathIdentifier](../../aspose.medical.dicom.tags/tag/opticalpathidentifier) | (0048,0106) VR=SH VM=1 Optical Path Identifier. |
| static readonly [OpticalPathSequence](../../aspose.medical.dicom.tags/tag/opticalpathsequence) | (0048,0105) VR=SQ VM=1 Optical Path Sequence. |
| static readonly [OpticalSelectedOphthalmicAxialLengthSequence](../../aspose.medical.dicom.tags/tag/opticalselectedophthalmicaxiallengthsequence) | (0022,1255) VR=SQ VM=1 Optical Selected Ophthalmic Axial Length Sequence. |
| static readonly [OpticalTransmittance](../../aspose.medical.dicom.tags/tag/opticaltransmittance) | (0046,0040) VR=FD VM=1 Optical Transmittance. |
| static readonly [Optotype](../../aspose.medical.dicom.tags/tag/optotype) | (0046,0094) VR=CS VM=1 Optotype. |
| static readonly [OptotypeDetailedDefinition](../../aspose.medical.dicom.tags/tag/optotypedetaileddefinition) | (0046,0139) VR=LO VM=1 Optotype Detailed Definition. |
| static readonly [OptotypePresentation](../../aspose.medical.dicom.tags/tag/optotypepresentation) | (0046,0095) VR=CS VM=1 Optotype Presentation. |
| static readonly [OrderCallbackPhoneNumber](../../aspose.medical.dicom.tags/tag/ordercallbackphonenumber) | (0040,2010) VR=SH VM=1 Order Callback Phone Number. |
| static readonly [OrderCallbackTelecomInformation](../../aspose.medical.dicom.tags/tag/ordercallbacktelecominformation) | (0040,2011) VR=LT VM=1 Order Callback Telecom Information. |
| static readonly [OrderEnteredBy](../../aspose.medical.dicom.tags/tag/orderenteredby) | (0040,2008) VR=PN VM=1 Order Entered By. |
| static readonly [OrderEntererLocation](../../aspose.medical.dicom.tags/tag/orderentererlocation) | (0040,2009) VR=SH VM=1 Order Enterer's Location. |
| static readonly [OrderFillerIdentifierSequence](../../aspose.medical.dicom.tags/tag/orderfilleridentifiersequence) | (0040,0027) VR=SQ VM=1 Order Filler Identifier Sequence. |
| static readonly [OrderOfPolynomialRETIRED](../../aspose.medical.dicom.tags/tag/orderofpolynomialretired) | (0014,605D) VR=DS VM=1 Order of Polynomial (RETIRED). |
| static readonly [OrderPlacerIdentifierSequence](../../aspose.medical.dicom.tags/tag/orderplaceridentifiersequence) | (0040,0026) VR=SQ VM=1 Order Placer Identifier Sequence. |
| static readonly [OrganAtRiskFullVolumeDose](../../aspose.medical.dicom.tags/tag/organatriskfullvolumedose) | (300A,002A) VR=DS VM=1 Organ at Risk Full-volume Dose. |
| static readonly [OrganAtRiskLimitDose](../../aspose.medical.dicom.tags/tag/organatrisklimitdose) | (300A,002B) VR=DS VM=1 Organ at Risk Limit Dose. |
| static readonly [OrganAtRiskMaximumDose](../../aspose.medical.dicom.tags/tag/organatriskmaximumdose) | (300A,002C) VR=DS VM=1 Organ at Risk Maximum Dose. |
| static readonly [OrganAtRiskOverdoseVolumeFraction](../../aspose.medical.dicom.tags/tag/organatriskoverdosevolumefraction) | (300A,002D) VR=DS VM=1 Organ at Risk Overdose Volume Fraction. |
| static readonly [OrganDose](../../aspose.medical.dicom.tags/tag/organdose) | (0040,0316) VR=DS VM=1 Organ Dose. |
| static readonly [OrganExposed](../../aspose.medical.dicom.tags/tag/organexposed) | (0040,0318) VR=CS VM=1 Organ Exposed. |
| static readonly [OrganizationalRoleCodeSequence](../../aspose.medical.dicom.tags/tag/organizationalrolecodesequence) | (0044,010A) VR=SQ VM=1 Organizational Role Code Sequence. |
| static readonly [OriginalAttributesSequence](../../aspose.medical.dicom.tags/tag/originalattributessequence) | (0400,0561) VR=SQ VM=1 Original Attributes Sequence. |
| static readonly [OriginalImageIdentificationNomenclatureRETIRED](../../aspose.medical.dicom.tags/tag/originalimageidentificationnomenclatureretired) | (0020,5002) VR=LO VM=1-n Original Image Identification Nomenclature (RETIRED). |
| static readonly [OriginalImageIdentificationRETIRED](../../aspose.medical.dicom.tags/tag/originalimageidentificationretired) | (0020,5000) VR=AT VM=1-n Original Image Identification (RETIRED). |
| static readonly [OriginalImageSequence](../../aspose.medical.dicom.tags/tag/originalimagesequence) | (2130,00C0) VR=SQ VM=1 Original Image Sequence. |
| static readonly [OriginalImplantAssemblyTemplateSequence](../../aspose.medical.dicom.tags/tag/originalimplantassemblytemplatesequence) | (0076,000C) VR=SQ VM=1 Original Implant Assembly Template Sequence. |
| static readonly [OriginalImplantTemplateSequence](../../aspose.medical.dicom.tags/tag/originalimplanttemplatesequence) | (0068,6225) VR=SQ VM=1 Original Implant Template Sequence. |
| static readonly [OriginalSpecializedSOPClassUID](../../aspose.medical.dicom.tags/tag/originalspecializedsopclassuid) | (0008,001B) VR=UI VM=1 Original Specialized SOP Class UID. |
| static readonly [OriginatingSOPInstanceReferenceSequence](../../aspose.medical.dicom.tags/tag/originatingsopinstancereferencesequence) | (3010,0007) VR=SQ VM=1 Originating SOP Instance Reference Sequence. |
| static readonly [Originator](../../aspose.medical.dicom.tags/tag/originator) | (2100,0070) VR=AE VM=1 Originator. |
| static readonly [OtherApprovalStatusRETIRED](../../aspose.medical.dicom.tags/tag/otherapprovalstatusretired) | (0014,0107) VR=CS VM=1-n Other Approval Status (RETIRED). |
| static readonly [OtherClinicalTrialProtocolIDsSequence](../../aspose.medical.dicom.tags/tag/otherclinicaltrialprotocolidssequence) | (0012,0023) VR=SQ VM=1 Other Clinical Trial Protocol IDs Sequence. |
| static readonly [OtherFailuresSequence](../../aspose.medical.dicom.tags/tag/otherfailuressequence) | (0008,119A) VR=SQ VM=1 Other Failures Sequence. |
| static readonly [OtherMagnificationTypesAvailable](../../aspose.medical.dicom.tags/tag/othermagnificationtypesavailable) | (2010,00A7) VR=CS VM=1-n Other Magnification Types Available. |
| static readonly [OtherMediaAvailableSequence](../../aspose.medical.dicom.tags/tag/othermediaavailablesequence) | (2000,00A4) VR=SQ VM=1 Other Media Available Sequence. |
| static readonly [OtherPatientIDsRETIRED](../../aspose.medical.dicom.tags/tag/otherpatientidsretired) | (0010,1000) VR=LO VM=1-n Other Patient IDs (RETIRED). |
| static readonly [OtherPatientIDsSequence](../../aspose.medical.dicom.tags/tag/otherpatientidssequence) | (0010,1002) VR=SQ VM=1 Other Patient IDs Sequence. |
| static readonly [OtherPatientNames](../../aspose.medical.dicom.tags/tag/otherpatientnames) | (0010,1001) VR=PN VM=1-n Other Patient Names. |
| static readonly [OtherPupillaryDistance](../../aspose.medical.dicom.tags/tag/otherpupillarydistance) | (0046,0064) VR=FD VM=1 Other Pupillary Distance. |
| static readonly [OtherSecondaryApprovalStatusRETIRED](../../aspose.medical.dicom.tags/tag/othersecondaryapprovalstatusretired) | (0014,0108) VR=CS VM=1-n Other Secondary Approval Status (RETIRED). |
| static readonly [OtherSmoothingTypesAvailable](../../aspose.medical.dicom.tags/tag/othersmoothingtypesavailable) | (2010,00A9) VR=CS VM=1-n Other Smoothing Types Available. |
| static readonly [OtherStudyNumbersRETIRED](../../aspose.medical.dicom.tags/tag/otherstudynumbersretired) | (0020,1070) VR=IS VM=1-n Other Study Numbers (RETIRED). |
| static readonly [OuterDiameterRETIRED](../../aspose.medical.dicom.tags/tag/outerdiameterretired) | (0014,0054) VR=DS VM=1 Outer Diameter (RETIRED). |
| static readonly [OutlineLeftVerticalEdge](../../aspose.medical.dicom.tags/tag/outlineleftverticaledge) | (0018,1631) VR=FD VM=1 Outline Left Vertical Edge. |
| static readonly [OutlineLowerHorizontalEdge](../../aspose.medical.dicom.tags/tag/outlinelowerhorizontaledge) | (0018,1634) VR=FD VM=1 Outline Lower Horizontal Edge. |
| static readonly [OutlineRightVerticalEdge](../../aspose.medical.dicom.tags/tag/outlinerightverticaledge) | (0018,1632) VR=FD VM=1 Outline Right Vertical Edge. |
| static readonly [OutlineShapeType](../../aspose.medical.dicom.tags/tag/outlineshapetype) | (0018,1630) VR=CS VM=1 Outline Shape Type. |
| static readonly [OutlineUpperHorizontalEdge](../../aspose.medical.dicom.tags/tag/outlineupperhorizontaledge) | (0018,1633) VR=FD VM=1 Outline Upper Horizontal Edge. |
| static readonly [OutputDestinationSequence](../../aspose.medical.dicom.tags/tag/outputdestinationsequence) | (0040,4070) VR=SQ VM=1 Output Destination Sequence. |
| static readonly [OutputInformationSequence](../../aspose.medical.dicom.tags/tag/outputinformationsequence) | (0040,4033) VR=SQ VM=1 Output Information Sequence. |
| static readonly [OutputPower](../../aspose.medical.dicom.tags/tag/outputpower) | (0018,5000) VR=SH VM=1-n Output Power. |
| static readonly [OverallTemplateSpatialTolerance](../../aspose.medical.dicom.tags/tag/overalltemplatespatialtolerance) | (0068,62A5) VR=FD VM=1 Overall Template Spatial Tolerance. |
| static readonly [OverlayActivationLayer](../../aspose.medical.dicom.tags/tag/overlayactivationlayer) | (60xx,1001) VR=CS VM=1 Overlay Activation Layer. |
| static readonly [OverlayBackgroundDensityRETIRED](../../aspose.medical.dicom.tags/tag/overlaybackgrounddensityretired) | (2040,0082) VR=CS VM=1 Overlay Background Density (RETIRED). |
| static readonly [OverlayBitPosition](../../aspose.medical.dicom.tags/tag/overlaybitposition) | (60xx,0102) VR=US VM=1 Overlay Bit Position. |
| static readonly [OverlayBitsAllocated](../../aspose.medical.dicom.tags/tag/overlaybitsallocated) | (60xx,0100) VR=US VM=1 Overlay Bits Allocated. |
| static readonly [OverlayBitsForCodeWordRETIRED](../../aspose.medical.dicom.tags/tag/overlaybitsforcodewordretired) | (60xx,0804) VR=US VM=1 Overlay Bits For Code Word (RETIRED). |
| static readonly [OverlayBitsGroupedRETIRED](../../aspose.medical.dicom.tags/tag/overlaybitsgroupedretired) | (60xx,0069) VR=US VM=1 Overlay Bits Grouped (RETIRED). |
| static readonly [OverlayCodeLabelRETIRED](../../aspose.medical.dicom.tags/tag/overlaycodelabelretired) | (60xx,0800) VR=CS VM=1-n Overlay Code Label (RETIRED). |
| static readonly [OverlayCodeTableLocationRETIRED](../../aspose.medical.dicom.tags/tag/overlaycodetablelocationretired) | (60xx,0803) VR=AT VM=1-n Overlay Code Table Location (RETIRED). |
| static readonly [OverlayColumns](../../aspose.medical.dicom.tags/tag/overlaycolumns) | (60xx,0011) VR=US VM=1 Overlay Columns. |
| static readonly [OverlayCommentsRETIRED](../../aspose.medical.dicom.tags/tag/overlaycommentsretired) | (60xx,4000) VR=LT VM=1 Overlay Comments (RETIRED). |
| static readonly [OverlayCompressionCodeRETIRED](../../aspose.medical.dicom.tags/tag/overlaycompressioncoderetired) | (60xx,0060) VR=CS VM=1 Overlay Compression Code (RETIRED). |
| static readonly [OverlayCompressionDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/overlaycompressiondescriptionretired) | (60xx,0063) VR=CS VM=1 Overlay Compression Description (RETIRED). |
| static readonly [OverlayCompressionLabelRETIRED](../../aspose.medical.dicom.tags/tag/overlaycompressionlabelretired) | (60xx,0062) VR=SH VM=1 Overlay Compression Label (RETIRED). |
| static readonly [OverlayCompressionOriginatorRETIRED](../../aspose.medical.dicom.tags/tag/overlaycompressionoriginatorretired) | (60xx,0061) VR=SH VM=1 Overlay Compression Originator (RETIRED). |
| static readonly [OverlayCompressionStepPointersRETIRED](../../aspose.medical.dicom.tags/tag/overlaycompressionsteppointersretired) | (60xx,0066) VR=AT VM=1-n Overlay Compression Step Pointers (RETIRED). |
| static readonly [OverlayData](../../aspose.medical.dicom.tags/tag/overlaydata) | (60xx,3000) VR=OB or OW VM=1 Overlay Data. |
| static readonly [OverlayDateRETIRED](../../aspose.medical.dicom.tags/tag/overlaydateretired) | (0008,0024) VR=DA VM=1 Overlay Date (RETIRED). |
| static readonly [OverlayDescription](../../aspose.medical.dicom.tags/tag/overlaydescription) | (60xx,0022) VR=LO VM=1 Overlay Description. |
| static readonly [OverlayDescriptorBlueRETIRED](../../aspose.medical.dicom.tags/tag/overlaydescriptorblueretired) | (60xx,1103) VR=US VM=1 Overlay Descriptor - Blue (RETIRED). |
| static readonly [OverlayDescriptorGrayRETIRED](../../aspose.medical.dicom.tags/tag/overlaydescriptorgrayretired) | (60xx,1100) VR=US VM=1 Overlay Descriptor - Gray (RETIRED). |
| static readonly [OverlayDescriptorGreenRETIRED](../../aspose.medical.dicom.tags/tag/overlaydescriptorgreenretired) | (60xx,1102) VR=US VM=1 Overlay Descriptor - Green (RETIRED). |
| static readonly [OverlayDescriptorRedRETIRED](../../aspose.medical.dicom.tags/tag/overlaydescriptorredretired) | (60xx,1101) VR=US VM=1 Overlay Descriptor - Red (RETIRED). |
| static readonly [OverlayForegroundDensityRETIRED](../../aspose.medical.dicom.tags/tag/overlayforegrounddensityretired) | (2040,0080) VR=CS VM=1 Overlay Foreground Density (RETIRED). |
| static readonly [OverlayFormatRETIRED](../../aspose.medical.dicom.tags/tag/overlayformatretired) | (60xx,0110) VR=CS VM=1 Overlay Format (RETIRED). |
| static readonly [OverlayLabel](../../aspose.medical.dicom.tags/tag/overlaylabel) | (60xx,1500) VR=LO VM=1 Overlay Label. |
| static readonly [OverlayLocationRETIRED](../../aspose.medical.dicom.tags/tag/overlaylocationretired) | (60xx,0200) VR=US VM=1 Overlay Location (RETIRED). |
| static readonly [OverlayMagnificationTypeRETIRED](../../aspose.medical.dicom.tags/tag/overlaymagnificationtyperetired) | (2040,0060) VR=CS VM=1 Overlay Magnification Type (RETIRED). |
| static readonly [OverlayModeRETIRED](../../aspose.medical.dicom.tags/tag/overlaymoderetired) | (2040,0090) VR=CS VM=1 Overlay Mode (RETIRED). |
| static readonly [OverlayNumberOfTablesRETIRED](../../aspose.medical.dicom.tags/tag/overlaynumberoftablesretired) | (60xx,0802) VR=US VM=1 Overlay Number of Tables (RETIRED). |
| static readonly [OverlayNumberRETIRED](../../aspose.medical.dicom.tags/tag/overlaynumberretired) | (0020,0022) VR=IS VM=1 Overlay Number (RETIRED). |
| static readonly [OverlayOrigin](../../aspose.medical.dicom.tags/tag/overlayorigin) | (60xx,0050) VR=SS VM=2 Overlay Origin. |
| static readonly [OverlayOrImageMagnificationRETIRED](../../aspose.medical.dicom.tags/tag/overlayorimagemagnificationretired) | (2040,0072) VR=CS VM=1 Overlay or Image Magnification (RETIRED). |
| static readonly [OverlayPixelDataSequenceRETIRED](../../aspose.medical.dicom.tags/tag/overlaypixeldatasequenceretired) | (2040,0020) VR=SQ VM=1 Overlay Pixel Data Sequence (RETIRED). |
| static readonly [OverlayPlaneOriginRETIRED](../../aspose.medical.dicom.tags/tag/overlayplaneoriginretired) | (60xx,0052) VR=US VM=1 Overlay Plane Origin (RETIRED). |
| static readonly [OverlayPlanesRETIRED](../../aspose.medical.dicom.tags/tag/overlayplanesretired) | (60xx,0012) VR=US VM=1 Overlay Planes (RETIRED). |
| static readonly [OverlayRepeatIntervalRETIRED](../../aspose.medical.dicom.tags/tag/overlayrepeatintervalretired) | (60xx,0068) VR=US VM=1 Overlay Repeat Interval (RETIRED). |
| static readonly [OverlayRows](../../aspose.medical.dicom.tags/tag/overlayrows) | (60xx,0010) VR=US VM=1 Overlay Rows. |
| static readonly [OverlaysBlueRETIRED](../../aspose.medical.dicom.tags/tag/overlaysblueretired) | (60xx,1203) VR=US VM=1-n Overlays - Blue (RETIRED). |
| static readonly [OverlaysGrayRETIRED](../../aspose.medical.dicom.tags/tag/overlaysgrayretired) | (60xx,1200) VR=US VM=1-n Overlays - Gray (RETIRED). |
| static readonly [OverlaysGreenRETIRED](../../aspose.medical.dicom.tags/tag/overlaysgreenretired) | (60xx,1202) VR=US VM=1-n Overlays - Green (RETIRED). |
| static readonly [OverlaySmoothingTypeRETIRED](../../aspose.medical.dicom.tags/tag/overlaysmoothingtyperetired) | (2040,0070) VR=CS VM=1 Overlay Smoothing Type (RETIRED). |
| static readonly [OverlaysRedRETIRED](../../aspose.medical.dicom.tags/tag/overlaysredretired) | (60xx,1201) VR=US VM=1-n Overlays - Red (RETIRED). |
| static readonly [OverlaysRETIRED](../../aspose.medical.dicom.tags/tag/overlaysretired) | (0000,51B0) VR=US VM=1-n Overlays (RETIRED). |
| static readonly [OverlaySubtype](../../aspose.medical.dicom.tags/tag/overlaysubtype) | (60xx,0045) VR=LO VM=1 Overlay Subtype. |
| static readonly [OverlayTimeRETIRED](../../aspose.medical.dicom.tags/tag/overlaytimeretired) | (0008,0034) VR=TM VM=1 Overlay Time (RETIRED). |
| static readonly [OverlayType](../../aspose.medical.dicom.tags/tag/overlaytype) | (60xx,0040) VR=CS VM=1 Overlay Type. |
| static readonly [OverriddenAttributesSequence](../../aspose.medical.dicom.tags/tag/overriddenattributessequence) | (0074,104A) VR=SQ VM=1 Overridden Attributes Sequence. |
| static readonly [OverrideDateTime](../../aspose.medical.dicom.tags/tag/overridedatetime) | (300A,0760) VR=DT VM=1 Override DateTime. |
| static readonly [OverrideParameterPointer](../../aspose.medical.dicom.tags/tag/overrideparameterpointer) | (3008,0062) VR=AT VM=1 Override Parameter Pointer. |
| static readonly [OverrideReason](../../aspose.medical.dicom.tags/tag/overridereason) | (3008,0066) VR=ST VM=1 Override Reason. |
| static readonly [OverrideSequence](../../aspose.medical.dicom.tags/tag/overridesequence) | (3008,0060) VR=SQ VM=1 Override Sequence. |
| static readonly [OversamplingPhase](../../aspose.medical.dicom.tags/tag/oversamplingphase) | (0018,9029) VR=CS VM=1 Oversampling Phase. |
| static readonly [OwnerID](../../aspose.medical.dicom.tags/tag/ownerid) | (2100,0160) VR=SH VM=1 Owner ID. |
| static readonly [PaddleDescription](../../aspose.medical.dicom.tags/tag/paddledescription) | (0018,11A4) VR=LO VM=1 Paddle Description. |
| static readonly [PageNumberVector](../../aspose.medical.dicom.tags/tag/pagenumbervector) | (0018,2001) VR=IS VM=1-n Page Number Vector. |
| static readonly [PagePositionIDRETIRED](../../aspose.medical.dicom.tags/tag/pagepositionidretired) | (0000,5120) VR=LT VM=1 Page Position ID (RETIRED). |
| static readonly [PaletteColorLookupTableSequence](../../aspose.medical.dicom.tags/tag/palettecolorlookuptablesequence) | (0048,0120) VR=SQ VM=1 Palette Color Lookup Table Sequence. |
| static readonly [PaletteColorLookupTableUID](../../aspose.medical.dicom.tags/tag/palettecolorlookuptableuid) | (0028,1199) VR=UI VM=1 Palette Color Lookup Table UID. |
| static readonly [ParallelAcquisition](../../aspose.medical.dicom.tags/tag/parallelacquisition) | (0018,9077) VR=CS VM=1 Parallel Acquisition. |
| static readonly [ParallelAcquisitionTechnique](../../aspose.medical.dicom.tags/tag/parallelacquisitiontechnique) | (0018,9078) VR=CS VM=1 Parallel Acquisition Technique. |
| static readonly [ParallelReductionFactorInPlane](../../aspose.medical.dicom.tags/tag/parallelreductionfactorinplane) | (0018,9069) VR=FD VM=1 Parallel Reduction Factor In-plane. |
| static readonly [ParallelReductionFactorInPlaneRetiredRETIRED](../../aspose.medical.dicom.tags/tag/parallelreductionfactorinplaneretiredretired) | (0018,9096) VR=FD VM=1 Parallel Reduction Factor In-plane (Retired) (RETIRED). |
| static readonly [ParallelReductionFactorOutOfPlane](../../aspose.medical.dicom.tags/tag/parallelreductionfactoroutofplane) | (0018,9155) VR=FD VM=1 Parallel Reduction Factor out-of-plane. |
| static readonly [ParallelReductionFactorSecondInPlane](../../aspose.medical.dicom.tags/tag/parallelreductionfactorsecondinplane) | (0018,9168) VR=FD VM=1 Parallel Reduction Factor Second In-plane. |
| static readonly [ParallelRTBeamDelimiterBoundaries](../../aspose.medical.dicom.tags/tag/parallelrtbeamdelimiterboundaries) | (300A,0649) VR=FD VM=2-n Parallel RT Beam Delimiter Boundaries. |
| static readonly [ParallelRTBeamDelimiterDeviceOrientationLabelCodeSequence](../../aspose.medical.dicom.tags/tag/parallelrtbeamdelimiterdeviceorientationlabelcodesequence) | (300A,0644) VR=SQ VM=1 Parallel RT Beam Delimiter Device Orientation Label Code Sequence. |
| static readonly [ParallelRTBeamDelimiterDeviceSequence](../../aspose.medical.dicom.tags/tag/parallelrtbeamdelimiterdevicesequence) | (300A,0647) VR=SQ VM=1 Parallel RT Beam Delimiter Device Sequence. |
| static readonly [ParallelRTBeamDelimiterLeafMountingSide](../../aspose.medical.dicom.tags/tag/parallelrtbeamdelimiterleafmountingside) | (300A,064F) VR=CS VM=1-n Parallel RT Beam Delimiter Leaf Mounting Side. |
| static readonly [ParallelRTBeamDelimiterOpeningExtents](../../aspose.medical.dicom.tags/tag/parallelrtbeamdelimiteropeningextents) | (3008,00A4) VR=FD VM=2-2n Parallel RT Beam Delimiter Opening Extents. |
| static readonly [ParallelRTBeamDelimiterOpeningMode](../../aspose.medical.dicom.tags/tag/parallelrtbeamdelimiteropeningmode) | (300A,064E) VR=CS VM=1 Parallel RT Beam Delimiter Opening Mode. |
| static readonly [ParallelRTBeamDelimiterPositions](../../aspose.medical.dicom.tags/tag/parallelrtbeamdelimiterpositions) | (300A,064A) VR=FD VM=2-n Parallel RT Beam Delimiter Positions. |
| static readonly [ParameterItemIndex](../../aspose.medical.dicom.tags/tag/parameteritemindex) | (3008,0063) VR=IS VM=1 Parameter Item Index. |
| static readonly [ParameterPointer](../../aspose.medical.dicom.tags/tag/parameterpointer) | (3008,0065) VR=AT VM=1 Parameter Pointer. |
| static readonly [ParameterSequencePointer](../../aspose.medical.dicom.tags/tag/parametersequencepointer) | (3008,0061) VR=AT VM=1 Parameter Sequence Pointer. |
| static readonly [ParametersSpecificationSequence](../../aspose.medical.dicom.tags/tag/parametersspecificationsequence) | (0018,9913) VR=SQ VM=1 Parameters Specification Sequence. |
| static readonly [ParameterValueNumber](../../aspose.medical.dicom.tags/tag/parametervaluenumber) | (3008,0067) VR=US VM=1 Parameter Value Number. |
| static readonly [ParametricMapFrameTypeSequence](../../aspose.medical.dicom.tags/tag/parametricmapframetypesequence) | (0040,9092) VR=SQ VM=1 Parametric Map Frame Type Sequence. |
| static readonly [PartialDataDisplayHandling](../../aspose.medical.dicom.tags/tag/partialdatadisplayhandling) | (0072,0208) VR=CS VM=1 Partial Data Display Handling. |
| static readonly [PartialFourier](../../aspose.medical.dicom.tags/tag/partialfourier) | (0018,9081) VR=CS VM=1 Partial Fourier. |
| static readonly [PartialFourierDirection](../../aspose.medical.dicom.tags/tag/partialfourierdirection) | (0018,9036) VR=CS VM=1 Partial Fourier Direction. |
| static readonly [PartialView](../../aspose.medical.dicom.tags/tag/partialview) | (0028,1350) VR=CS VM=1 Partial View. |
| static readonly [PartialViewCodeSequence](../../aspose.medical.dicom.tags/tag/partialviewcodesequence) | (0028,1352) VR=SQ VM=1 Partial View Code Sequence. |
| static readonly [PartialViewDescription](../../aspose.medical.dicom.tags/tag/partialviewdescription) | (0028,1351) VR=ST VM=1 Partial View Description. |
| static readonly [ParticipantSequence](../../aspose.medical.dicom.tags/tag/participantsequence) | (0040,A07A) VR=SQ VM=1 Participant Sequence. |
| static readonly [ParticipationDateTime](../../aspose.medical.dicom.tags/tag/participationdatetime) | (0040,A082) VR=DT VM=1 Participation DateTime. |
| static readonly [ParticipationType](../../aspose.medical.dicom.tags/tag/participationtype) | (0040,A080) VR=CS VM=1 Participation Type. |
| static readonly [PatientAdditionalPosition](../../aspose.medical.dicom.tags/tag/patientadditionalposition) | (300A,0184) VR=LO VM=1 Patient Additional Position. |
| static readonly [PatientAddress](../../aspose.medical.dicom.tags/tag/patientaddress) | (0010,1040) VR=LO VM=1 Patient's Address. |
| static readonly [PatientAge](../../aspose.medical.dicom.tags/tag/patientage) | (0010,1010) VR=AS VM=1 Patient's Age. |
| static readonly [PatientAlternativeCalendar](../../aspose.medical.dicom.tags/tag/patientalternativecalendar) | (0010,0035) VR=CS VM=1 Patient's Alternative Calendar. |
| static readonly [PatientBirthDate](../../aspose.medical.dicom.tags/tag/patientbirthdate) | (0010,0030) VR=DA VM=1 Patient's Birth Date. |
| static readonly [PatientBirthDateInAlternativeCalendar](../../aspose.medical.dicom.tags/tag/patientbirthdateinalternativecalendar) | (0010,0033) VR=LO VM=1 Patient's Birth Date in Alternative Calendar. |
| static readonly [PatientBirthName](../../aspose.medical.dicom.tags/tag/patientbirthname) | (0010,1005) VR=PN VM=1 Patient's Birth Name. |
| static readonly [PatientBirthTime](../../aspose.medical.dicom.tags/tag/patientbirthtime) | (0010,0032) VR=TM VM=1 Patient's Birth Time. |
| static readonly [PatientBodyMassIndex](../../aspose.medical.dicom.tags/tag/patientbodymassindex) | (0010,1022) VR=DS VM=1 Patient's Body Mass Index. |
| static readonly [PatientBreedCodeSequence](../../aspose.medical.dicom.tags/tag/patientbreedcodesequence) | (0010,2293) VR=SQ VM=1 Patient Breed Code Sequence. |
| static readonly [PatientBreedDescription](../../aspose.medical.dicom.tags/tag/patientbreeddescription) | (0010,2292) VR=LO VM=1 Patient Breed Description. |
| static readonly [PatientClinicalTrialParticipationSequence](../../aspose.medical.dicom.tags/tag/patientclinicaltrialparticipationsequence) | (0038,0502) VR=SQ VM=1 Patient Clinical Trial Participation Sequence. |
| static readonly [PatientComments](../../aspose.medical.dicom.tags/tag/patientcomments) | (0010,4000) VR=LT VM=1 Patient Comments. |
| static readonly [PatientDeathDateInAlternativeCalendar](../../aspose.medical.dicom.tags/tag/patientdeathdateinalternativecalendar) | (0010,0034) VR=LO VM=1 Patient's Death Date in Alternative Calendar. |
| static readonly [PatientEquipmentRelationshipCodeSequence](../../aspose.medical.dicom.tags/tag/patientequipmentrelationshipcodesequence) | (3010,0030) VR=SQ VM=1 Patient Equipment Relationship Code Sequence. |
| static readonly [PatientEyeMovementCommandCodeSequence](../../aspose.medical.dicom.tags/tag/patienteyemovementcommandcodesequence) | (0022,0006) VR=SQ VM=1 Patient Eye Movement Command Code Sequence. |
| static readonly [PatientEyeMovementCommanded](../../aspose.medical.dicom.tags/tag/patienteyemovementcommanded) | (0022,0005) VR=CS VM=1 Patient Eye Movement Commanded. |
| static readonly [PatientFrameOfReferenceSource](../../aspose.medical.dicom.tags/tag/patientframeofreferencesource) | (0020,930C) VR=CS VM=1 Patient Frame of Reference Source. |
| static readonly [PatientGantryRelationshipCodeSequence](../../aspose.medical.dicom.tags/tag/patientgantryrelationshipcodesequence) | (0054,0414) VR=SQ VM=1 Patient Gantry Relationship Code Sequence. |
| static readonly [PatientID](../../aspose.medical.dicom.tags/tag/patientid) | (0010,0020) VR=LO VM=1 Patient ID. |
| static readonly [PatientIdentityRemoved](../../aspose.medical.dicom.tags/tag/patientidentityremoved) | (0012,0062) VR=CS VM=1 Patient Identity Removed. |
| static readonly [PatientInstitutionResidence](../../aspose.medical.dicom.tags/tag/patientinstitutionresidence) | (0038,0400) VR=LO VM=1 Patient's Institution Residence. |
| static readonly [PatientInsurancePlanCodeSequence](../../aspose.medical.dicom.tags/tag/patientinsuranceplancodesequence) | (0010,0050) VR=SQ VM=1 Patient's Insurance Plan Code Sequence. |
| static readonly [PatientLocationCoordinatesCodeSequence](../../aspose.medical.dicom.tags/tag/patientlocationcoordinatescodesequence) | (3006,00CA) VR=SQ VM=1 Patient Location Coordinates Code Sequence. |
| static readonly [PatientLocationCoordinatesSequence](../../aspose.medical.dicom.tags/tag/patientlocationcoordinatessequence) | (3006,00C9) VR=SQ VM=1 Patient Location Coordinates Sequence. |
| static readonly [PatientMotherBirthName](../../aspose.medical.dicom.tags/tag/patientmotherbirthname) | (0010,1060) VR=PN VM=1 Patient's Mother's Birth Name. |
| static readonly [PatientMotionCorrected](../../aspose.medical.dicom.tags/tag/patientmotioncorrected) | (0018,9763) VR=CS VM=1 Patient Motion Corrected. |
| static readonly [PatientName](../../aspose.medical.dicom.tags/tag/patientname) | (0010,0010) VR=PN VM=1 Patient's Name. |
| static readonly [PatientNotProperlyFixatedQuantity](../../aspose.medical.dicom.tags/tag/patientnotproperlyfixatedquantity) | (0024,0036) VR=US VM=1 Patient Not Properly Fixated Quantity. |
| static readonly [PatientOrientation](../../aspose.medical.dicom.tags/tag/patientorientation) | (0020,0020) VR=CS VM=2 Patient Orientation. |
| static readonly [PatientOrientationCodeSequence](../../aspose.medical.dicom.tags/tag/patientorientationcodesequence) | (0054,0410) VR=SQ VM=1 Patient Orientation Code Sequence. |
| static readonly [PatientOrientationInFrameSequence](../../aspose.medical.dicom.tags/tag/patientorientationinframesequence) | (0020,9450) VR=SQ VM=1 Patient Orientation in Frame Sequence. |
| static readonly [PatientOrientationModifierCodeSequence](../../aspose.medical.dicom.tags/tag/patientorientationmodifiercodesequence) | (0054,0412) VR=SQ VM=1 Patient Orientation Modifier Code Sequence. |
| static readonly [PatientPhysiologicalStateCodeSequence](../../aspose.medical.dicom.tags/tag/patientphysiologicalstatecodesequence) | (0018,9772) VR=SQ VM=1 Patient Physiological State Code Sequence. |
| static readonly [PatientPhysiologicalStateSequence](../../aspose.medical.dicom.tags/tag/patientphysiologicalstatesequence) | (0018,9771) VR=SQ VM=1 Patient Physiological State Sequence. |
| static readonly [PatientPosition](../../aspose.medical.dicom.tags/tag/patientposition) | (0018,5100) VR=CS VM=1 Patient Position. |
| static readonly [PatientPositioningInstructionSequence](../../aspose.medical.dicom.tags/tag/patientpositioninginstructionsequence) | (0018,991B) VR=SQ VM=1 Patient Positioning Instruction Sequence. |
| static readonly [PatientPrimaryLanguageCodeSequence](../../aspose.medical.dicom.tags/tag/patientprimarylanguagecodesequence) | (0010,0101) VR=SQ VM=1 Patient's Primary Language Code Sequence. |
| static readonly [PatientPrimaryLanguageModifierCodeSequence](../../aspose.medical.dicom.tags/tag/patientprimarylanguagemodifiercodesequence) | (0010,0102) VR=SQ VM=1 Patient's Primary Language Modifier Code Sequence. |
| static readonly [PatientReliabilityIndicator](../../aspose.medical.dicom.tags/tag/patientreliabilityindicator) | (0024,0069) VR=LO VM=1 Patient Reliability Indicator. |
| static readonly [PatientReligiousPreference](../../aspose.medical.dicom.tags/tag/patientreligiouspreference) | (0010,21F0) VR=LO VM=1 Patient's Religious Preference. |
| static readonly [PatientSetupLabel](../../aspose.medical.dicom.tags/tag/patientsetuplabel) | (300A,0183) VR=LO VM=1 Patient Setup Label. |
| static readonly [PatientSetupNumber](../../aspose.medical.dicom.tags/tag/patientsetupnumber) | (300A,0182) VR=IS VM=1 Patient Setup Number. |
| static readonly [PatientSetupPhotoDescription](../../aspose.medical.dicom.tags/tag/patientsetupphotodescription) | (300A,0794) VR=LT VM=1 Patient Setup Photo Description. |
| static readonly [PatientSetupSequence](../../aspose.medical.dicom.tags/tag/patientsetupsequence) | (300A,0180) VR=SQ VM=1 Patient Setup Sequence. |
| static readonly [PatientSetupUIDRETIRED](../../aspose.medical.dicom.tags/tag/patientsetupuidretired) | (300A,0650) VR=UI VM=1 Patient Setup UID (RETIRED). |
| static readonly [PatientSex](../../aspose.medical.dicom.tags/tag/patientsex) | (0010,0040) VR=CS VM=1 Patient's Sex. |
| static readonly [PatientSexNeutered](../../aspose.medical.dicom.tags/tag/patientsexneutered) | (0010,2203) VR=CS VM=1 Patient's Sex Neutered. |
| static readonly [PatientSize](../../aspose.medical.dicom.tags/tag/patientsize) | (0010,1020) VR=DS VM=1 Patient's Size. |
| static readonly [PatientSizeCodeSequence](../../aspose.medical.dicom.tags/tag/patientsizecodesequence) | (0010,1021) VR=SQ VM=1 Patient's Size Code Sequence. |
| static readonly [PatientSpeciesCodeSequence](../../aspose.medical.dicom.tags/tag/patientspeciescodesequence) | (0010,2202) VR=SQ VM=1 Patient Species Code Sequence. |
| static readonly [PatientSpeciesDescription](../../aspose.medical.dicom.tags/tag/patientspeciesdescription) | (0010,2201) VR=LO VM=1 Patient Species Description. |
| static readonly [PatientSpecificationSequence](../../aspose.medical.dicom.tags/tag/patientspecificationsequence) | (0018,9911) VR=SQ VM=1 Patient Specification Sequence. |
| static readonly [PatientState](../../aspose.medical.dicom.tags/tag/patientstate) | (0038,0500) VR=LO VM=1 Patient State. |
| static readonly [PatientSupportAccessoryCode](../../aspose.medical.dicom.tags/tag/patientsupportaccessorycode) | (300A,0354) VR=LO VM=1 Patient Support Accessory Code. |
| static readonly [PatientSupportAdjustedAngle](../../aspose.medical.dicom.tags/tag/patientsupportadjustedangle) | (0074,102A) VR=FD VM=1 Patient Support Adjusted Angle. |
| static readonly [PatientSupportAngle](../../aspose.medical.dicom.tags/tag/patientsupportangle) | (300A,0122) VR=DS VM=1 Patient Support Angle. |
| static readonly [PatientSupportAngleTolerance](../../aspose.medical.dicom.tags/tag/patientsupportangletolerance) | (300A,004C) VR=DS VM=1 Patient Support Angle Tolerance. |
| static readonly [PatientSupportDevicesSequence](../../aspose.medical.dicom.tags/tag/patientsupportdevicessequence) | (300A,0686) VR=SQ VM=1 Patient Support Devices Sequence. |
| static readonly [PatientSupportDisplacementSequence](../../aspose.medical.dicom.tags/tag/patientsupportdisplacementsequence) | (300A,079C) VR=SQ VM=1 Patient Support Displacement Sequence. |
| static readonly [PatientSupportID](../../aspose.medical.dicom.tags/tag/patientsupportid) | (300A,0352) VR=SH VM=1 Patient Support ID. |
| static readonly [PatientSupportPositionDeviceParameterSequence](../../aspose.medical.dicom.tags/tag/patientsupportpositiondeviceparametersequence) | (300A,065D) VR=SQ VM=1 Patient Support Position Device Parameter Sequence. |
| static readonly [PatientSupportPositionDeviceToleranceSequence](../../aspose.medical.dicom.tags/tag/patientsupportpositiondevicetolerancesequence) | (300A,0660) VR=SQ VM=1 Patient Support Position Device Tolerance Sequence. |
| static readonly [PatientSupportPositionParameterOrderIndex](../../aspose.medical.dicom.tags/tag/patientsupportpositionparameterorderindex) | (300A,065F) VR=US VM=1 Patient Support Position Parameter Order Index. |
| static readonly [PatientSupportPositionParameterSequence](../../aspose.medical.dicom.tags/tag/patientsupportpositionparametersequence) | (300A,065B) VR=SQ VM=1 Patient Support Position Parameter Sequence. |
| static readonly [PatientSupportPositionSequence](../../aspose.medical.dicom.tags/tag/patientsupportpositionsequence) | (3006,00CB) VR=SQ VM=1 Patient Support Position Sequence. |
| static readonly [PatientSupportPositionSpecificationMethod](../../aspose.medical.dicom.tags/tag/patientsupportpositionspecificationmethod) | (300A,065C) VR=CS VM=1 Patient Support Position Specification Method. |
| static readonly [PatientSupportPositionToleranceOrderIndex](../../aspose.medical.dicom.tags/tag/patientsupportpositiontoleranceorderindex) | (300A,0661) VR=US VM=1 Patient Support Position Tolerance Order Index. |
| static readonly [PatientSupportPositionToleranceSequence](../../aspose.medical.dicom.tags/tag/patientsupportpositiontolerancesequence) | (300A,062D) VR=SQ VM=1 Patient Support Position Tolerance Sequence. |
| static readonly [PatientSupportRotationDirection](../../aspose.medical.dicom.tags/tag/patientsupportrotationdirection) | (300A,0123) VR=CS VM=1 Patient Support Rotation Direction. |
| static readonly [PatientSupportType](../../aspose.medical.dicom.tags/tag/patientsupporttype) | (300A,0350) VR=CS VM=1 Patient Support Type. |
| static readonly [PatientTelecomInformation](../../aspose.medical.dicom.tags/tag/patienttelecominformation) | (0010,2155) VR=LT VM=1 Patient's Telecom Information. |
| static readonly [PatientTelephoneNumbers](../../aspose.medical.dicom.tags/tag/patienttelephonenumbers) | (0010,2154) VR=SH VM=1-n Patient's Telephone Numbers. |
| static readonly [PatientToEquipmentRelationshipSequence](../../aspose.medical.dicom.tags/tag/patienttoequipmentrelationshipsequence) | (300A,07A0) VR=SQ VM=1 Patient to Equipment Relationship Sequence. |
| static readonly [PatientTransportArrangements](../../aspose.medical.dicom.tags/tag/patienttransportarrangements) | (0040,1004) VR=LO VM=1 Patient Transport Arrangements. |
| static readonly [PatientTreatmentOrientationSequence](../../aspose.medical.dicom.tags/tag/patienttreatmentorientationsequence) | (3010,0032) VR=SQ VM=1 Patient Treatment Orientation Sequence. |
| static readonly [PatientTreatmentPreparationDeviceSequence](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationdevicesequence) | (300A,078F) VR=SQ VM=1 Patient Treatment Preparation Device Sequence. |
| static readonly [PatientTreatmentPreparationMethodCodeSequence](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationmethodcodesequence) | (300A,078D) VR=SQ VM=1 Patient Treatment Preparation Method Code Sequence. |
| static readonly [PatientTreatmentPreparationMethodDescription](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationmethoddescription) | (300A,0792) VR=LT VM=1 Patient Treatment Preparation Method Description. |
| static readonly [PatientTreatmentPreparationProcedureCodeSequence](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationprocedurecodesequence) | (300A,0791) VR=SQ VM=1 Patient Treatment Preparation Procedure Code Sequence. |
| static readonly [PatientTreatmentPreparationProcedureIndex](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationprocedureindex) | (300A,0795) VR=US VM=1 Patient Treatment Preparation Procedure Index. |
| static readonly [PatientTreatmentPreparationProcedureParameterDescription](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationprocedureparameterdescription) | (300A,078E) VR=LT VM=1 Patient Treatment Preparation Procedure Parameter Description. |
| static readonly [PatientTreatmentPreparationProcedureParameterSequence](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationprocedureparametersequence) | (300A,0793) VR=SQ VM=1 Patient Treatment Preparation Procedure Parameter Sequence. |
| static readonly [PatientTreatmentPreparationProcedureSequence](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationproceduresequence) | (300A,0790) VR=SQ VM=1 Patient Treatment Preparation Procedure Sequence. |
| static readonly [PatientTreatmentPreparationSequence](../../aspose.medical.dicom.tags/tag/patienttreatmentpreparationsequence) | (300A,079F) VR=SQ VM=1 Patient Treatment Preparation Sequence. |
| static readonly [PatientWeight](../../aspose.medical.dicom.tags/tag/patientweight) | (0010,1030) VR=DS VM=1 Patient's Weight. |
| static readonly [PatternOffColorCIELabValue](../../aspose.medical.dicom.tags/tag/patternoffcolorcielabvalue) | (0070,0252) VR=US VM=3 Pattern Off Color CIELab Value. |
| static readonly [PatternOffOpacity](../../aspose.medical.dicom.tags/tag/patternoffopacity) | (0070,0285) VR=FL VM=1 Pattern Off Opacity. |
| static readonly [PatternOnColorCIELabValue](../../aspose.medical.dicom.tags/tag/patternoncolorcielabvalue) | (0070,0251) VR=US VM=3 Pattern On Color CIELab Value. |
| static readonly [PatternOnOpacity](../../aspose.medical.dicom.tags/tag/patternonopacity) | (0070,0284) VR=FL VM=1 Pattern On Opacity. |
| static readonly [PauseBetweenFrames](../../aspose.medical.dicom.tags/tag/pausebetweenframes) | (0054,0038) VR=IS VM=1 Pause Between Frames. |
| static readonly [PercentPhaseFieldOfView](../../aspose.medical.dicom.tags/tag/percentphasefieldofview) | (0018,0094) VR=DS VM=1 Percent Phase Field of View. |
| static readonly [PercentSampling](../../aspose.medical.dicom.tags/tag/percentsampling) | (0018,0093) VR=DS VM=1 Percent Sampling. |
| static readonly [PerformedLocation](../../aspose.medical.dicom.tags/tag/performedlocation) | (0040,0243) VR=SH VM=1 Performed Location. |
| static readonly [PerformedProcedureCodeSequence](../../aspose.medical.dicom.tags/tag/performedprocedurecodesequence) | (0040,A372) VR=SQ VM=1 Performed Procedure Code Sequence. |
| static readonly [PerformedProcedureStepDescription](../../aspose.medical.dicom.tags/tag/performedprocedurestepdescription) | (0040,0254) VR=LO VM=1 Performed Procedure Step Description. |
| static readonly [PerformedProcedureStepDiscontinuationReasonCodeSequence](../../aspose.medical.dicom.tags/tag/performedprocedurestepdiscontinuationreasoncodesequence) | (0040,0281) VR=SQ VM=1 Performed Procedure Step Discontinuation Reason Code Sequence. |
| static readonly [PerformedProcedureStepEndDate](../../aspose.medical.dicom.tags/tag/performedprocedurestependdate) | (0040,0250) VR=DA VM=1 Performed Procedure Step End Date. |
| static readonly [PerformedProcedureStepEndDateTime](../../aspose.medical.dicom.tags/tag/performedprocedurestependdatetime) | (0040,4051) VR=DT VM=1 Performed Procedure Step End DateTime. |
| static readonly [PerformedProcedureStepEndTime](../../aspose.medical.dicom.tags/tag/performedprocedurestependtime) | (0040,0251) VR=TM VM=1 Performed Procedure Step End Time. |
| static readonly [PerformedProcedureStepID](../../aspose.medical.dicom.tags/tag/performedprocedurestepid) | (0040,0253) VR=SH VM=1 Performed Procedure Step ID. |
| static readonly [PerformedProcedureStepStartDate](../../aspose.medical.dicom.tags/tag/performedprocedurestepstartdate) | (0040,0244) VR=DA VM=1 Performed Procedure Step Start Date. |
| static readonly [PerformedProcedureStepStartDateTime](../../aspose.medical.dicom.tags/tag/performedprocedurestepstartdatetime) | (0040,4050) VR=DT VM=1 Performed Procedure Step Start DateTime. |
| static readonly [PerformedProcedureStepStartTime](../../aspose.medical.dicom.tags/tag/performedprocedurestepstarttime) | (0040,0245) VR=TM VM=1 Performed Procedure Step Start Time. |
| static readonly [PerformedProcedureStepStatus](../../aspose.medical.dicom.tags/tag/performedprocedurestepstatus) | (0040,0252) VR=CS VM=1 Performed Procedure Step Status. |
| static readonly [PerformedProcedureTypeDescription](../../aspose.medical.dicom.tags/tag/performedproceduretypedescription) | (0040,0255) VR=LO VM=1 Performed Procedure Type Description. |
| static readonly [PerformedProcessingApplicationsCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/performedprocessingapplicationscodesequenceretired) | (0040,4007) VR=SQ VM=1 Performed Processing Applications Code Sequence (RETIRED). |
| static readonly [PerformedProcessingParametersSequence](../../aspose.medical.dicom.tags/tag/performedprocessingparameterssequence) | (0074,1212) VR=SQ VM=1 Performed Processing Parameters Sequence. |
| static readonly [PerformedProtocolCodeSequence](../../aspose.medical.dicom.tags/tag/performedprotocolcodesequence) | (0040,0260) VR=SQ VM=1 Performed Protocol Code Sequence. |
| static readonly [PerformedProtocolType](../../aspose.medical.dicom.tags/tag/performedprotocoltype) | (0040,0261) VR=CS VM=1 Performed Protocol Type. |
| static readonly [PerformedSeriesSequence](../../aspose.medical.dicom.tags/tag/performedseriessequence) | (0040,0340) VR=SQ VM=1 Performed Series Sequence. |
| static readonly [PerformedStationAETitle](../../aspose.medical.dicom.tags/tag/performedstationaetitle) | (0040,0241) VR=AE VM=1 Performed Station AE Title. |
| static readonly [PerformedStationClassCodeSequence](../../aspose.medical.dicom.tags/tag/performedstationclasscodesequence) | (0040,4029) VR=SQ VM=1 Performed Station Class Code Sequence. |
| static readonly [PerformedStationGeographicLocationCodeSequence](../../aspose.medical.dicom.tags/tag/performedstationgeographiclocationcodesequence) | (0040,4030) VR=SQ VM=1 Performed Station Geographic Location Code Sequence. |
| static readonly [PerformedStationName](../../aspose.medical.dicom.tags/tag/performedstationname) | (0040,0242) VR=SH VM=1 Performed Station Name. |
| static readonly [PerformedStationNameCodeSequence](../../aspose.medical.dicom.tags/tag/performedstationnamecodesequence) | (0040,4028) VR=SQ VM=1 Performed Station Name Code Sequence. |
| static readonly [PerformedWorkitemCodeSequence](../../aspose.medical.dicom.tags/tag/performedworkitemcodesequence) | (0040,4019) VR=SQ VM=1 Performed Workitem Code Sequence. |
| static readonly [PerformingPhysicianIdentificationSequence](../../aspose.medical.dicom.tags/tag/performingphysicianidentificationsequence) | (0008,1052) VR=SQ VM=1 Performing Physician Identification Sequence. |
| static readonly [PerformingPhysicianName](../../aspose.medical.dicom.tags/tag/performingphysicianname) | (0008,1050) VR=PN VM=1-n Performing Physician's Name. |
| static readonly [PerFrameFunctionalGroupsSequence](../../aspose.medical.dicom.tags/tag/perframefunctionalgroupssequence) | (5200,9230) VR=SQ VM=1 Per-Frame Functional Groups Sequence. |
| static readonly [PerimeterTableRETIRED](../../aspose.medical.dicom.tags/tag/perimetertableretired) | (0028,0070) VR=US VM=1-n Perimeter Table (RETIRED). |
| static readonly [PerimeterValueRETIRED](../../aspose.medical.dicom.tags/tag/perimetervalueretired) | (0028,0071) VR=US or SS VM=1 Perimeter Value (RETIRED). |
| static readonly [PerProjectionAcquisitionSequence](../../aspose.medical.dicom.tags/tag/perprojectionacquisitionsequence) | (0018,9538) VR=SQ VM=1 Per Projection Acquisition Sequence. |
| static readonly [PersonAddress](../../aspose.medical.dicom.tags/tag/personaddress) | (0040,1102) VR=ST VM=1 Person's Address. |
| static readonly [PersonIdentificationCodeSequence](../../aspose.medical.dicom.tags/tag/personidentificationcodesequence) | (0040,1101) VR=SQ VM=1 Person Identification Code Sequence. |
| static readonly [PersonName](../../aspose.medical.dicom.tags/tag/personname) | (0040,A123) VR=PN VM=1 Person Name. |
| static readonly [PersonTelecomInformation](../../aspose.medical.dicom.tags/tag/persontelecominformation) | (0040,1104) VR=LT VM=1 Person's Telecom Information. |
| static readonly [PersonTelephoneNumbers](../../aspose.medical.dicom.tags/tag/persontelephonenumbers) | (0040,1103) VR=LO VM=1-n Person's Telephone Numbers. |
| static readonly [PertinentDocumentsSequence](../../aspose.medical.dicom.tags/tag/pertinentdocumentssequence) | (0038,0100) VR=SQ VM=1 Pertinent Documents Sequence. |
| static readonly [PertinentOtherEvidenceSequence](../../aspose.medical.dicom.tags/tag/pertinentotherevidencesequence) | (0040,A385) VR=SQ VM=1 Pertinent Other Evidence Sequence. |
| static readonly [PertinentResourcesSequence](../../aspose.medical.dicom.tags/tag/pertinentresourcessequence) | (0038,0101) VR=SQ VM=1 Pertinent Resources Sequence. |
| static readonly [PertinentSOPClassesInSeries](../../aspose.medical.dicom.tags/tag/pertinentsopclassesinseries) | (3010,0053) VR=UI VM=1-n Pertinent SOP Classes in Series. |
| static readonly [PertinentSOPClassesInStudy](../../aspose.medical.dicom.tags/tag/pertinentsopclassesinstudy) | (3010,0052) VR=UI VM=1-n Pertinent SOP Classes in Study. |
| static readonly [PETDetectorMotionDetailsSequence](../../aspose.medical.dicom.tags/tag/petdetectormotiondetailssequence) | (0018,9733) VR=SQ VM=1 PET Detector Motion Details Sequence. |
| static readonly [PETFrameAcquisitionSequence](../../aspose.medical.dicom.tags/tag/petframeacquisitionsequence) | (0018,9732) VR=SQ VM=1 PET Frame Acquisition Sequence. |
| static readonly [PETFrameCorrectionFactorsSequence](../../aspose.medical.dicom.tags/tag/petframecorrectionfactorssequence) | (0018,9736) VR=SQ VM=1 PET Frame Correction Factors Sequence. |
| static readonly [PETFrameTypeSequence](../../aspose.medical.dicom.tags/tag/petframetypesequence) | (0018,9751) VR=SQ VM=1 PET Frame Type Sequence. |
| static readonly [PETPositionSequence](../../aspose.medical.dicom.tags/tag/petpositionsequence) | (0018,9735) VR=SQ VM=1 PET Position Sequence. |
| static readonly [PETReconstructionSequence](../../aspose.medical.dicom.tags/tag/petreconstructionsequence) | (0018,9749) VR=SQ VM=1 PET Reconstruction Sequence. |
| static readonly [PETTableDynamicsSequence](../../aspose.medical.dicom.tags/tag/pettabledynamicssequence) | (0018,9734) VR=SQ VM=1 PET Table Dynamics Sequence. |
| static readonly [PhantomTypeRETIRED](../../aspose.medical.dicom.tags/tag/phantomtyperetired) | (4010,1046) VR=CS VM=1 Phantom Type (RETIRED). |
| static readonly [PhaseContrast](../../aspose.medical.dicom.tags/tag/phasecontrast) | (0018,9014) VR=CS VM=1 Phase Contrast. |
| static readonly [PhaseDelay](../../aspose.medical.dicom.tags/tag/phasedelay) | (0054,0036) VR=IS VM=1 Phase Delay. |
| static readonly [PhaseDescription](../../aspose.medical.dicom.tags/tag/phasedescription) | (0054,0039) VR=CS VM=1 Phase Description. |
| static readonly [PhaseInformationSequence](../../aspose.medical.dicom.tags/tag/phaseinformationsequence) | (0054,0032) VR=SQ VM=1 Phase Information Sequence. |
| static readonly [PhaseNumberRETIRED](../../aspose.medical.dicom.tags/tag/phasenumberretired) | (0020,0015) VR=IS VM=1 Phase Number (RETIRED). |
| static readonly [PhaseVector](../../aspose.medical.dicom.tags/tag/phasevector) | (0054,0030) VR=US VM=1-n Phase Vector. |
| static readonly [PhosphorType](../../aspose.medical.dicom.tags/tag/phosphortype) | (0018,1261) VR=LO VM=1 Phosphor Type. |
| static readonly [PhotoacousticExcitationCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/photoacousticexcitationcharacteristicssequence) | (0018,9821) VR=SQ VM=1 Photoacoustic Excitation Characteristics Sequence. |
| static readonly [PhotoacousticImageFrameTypeSequence](../../aspose.medical.dicom.tags/tag/photoacousticimageframetypesequence) | (0018,9835) VR=SQ VM=1 Photoacoustic Image Frame Type Sequence. |
| static readonly [PhotographicExposureIndex](../../aspose.medical.dicom.tags/tag/photographicexposureindex) | (0016,0038) VR=DS VM=1 Photographic Exposure Index. |
| static readonly [PhotographicSensitivity](../../aspose.medical.dicom.tags/tag/photographicsensitivity) | (0016,0018) VR=IS VM=1 Photographic Sensitivity. |
| static readonly [PhotometricInterpretation](../../aspose.medical.dicom.tags/tag/photometricinterpretation) | (0028,0004) VR=CS VM=1 Photometric Interpretation. |
| static readonly [PhotonEnergy](../../aspose.medical.dicom.tags/tag/photonenergy) | (0018,9383) VR=DS VM=1 Photon Energy. |
| static readonly [PhototimerSetting](../../aspose.medical.dicom.tags/tag/phototimersetting) | (0018,7065) VR=DS VM=1 Phototimer Setting. |
| static readonly [PhysicalDeltaX](../../aspose.medical.dicom.tags/tag/physicaldeltax) | (0018,602C) VR=FD VM=1 Physical Delta X. |
| static readonly [PhysicalDeltaY](../../aspose.medical.dicom.tags/tag/physicaldeltay) | (0018,602E) VR=FD VM=1 Physical Delta Y. |
| static readonly [PhysicalDetectorSize](../../aspose.medical.dicom.tags/tag/physicaldetectorsize) | (0018,9429) VR=FL VM=2 Physical Detector Size. |
| static readonly [PhysicalUnitsXDirection](../../aspose.medical.dicom.tags/tag/physicalunitsxdirection) | (0018,6024) VR=US VM=1 Physical Units X Direction. |
| static readonly [PhysicalUnitsYDirection](../../aspose.medical.dicom.tags/tag/physicalunitsydirection) | (0018,6026) VR=US VM=1 Physical Units Y Direction. |
| static readonly [PhysicianApprovingInterpretationRETIRED](../../aspose.medical.dicom.tags/tag/physicianapprovinginterpretationretired) | (4008,0114) VR=PN VM=1 Physician Approving Interpretation (RETIRED). |
| static readonly [PhysiciansOfRecord](../../aspose.medical.dicom.tags/tag/physiciansofrecord) | (0008,1048) VR=PN VM=1-n Physician(s) of Record. |
| static readonly [PhysiciansOfRecordIdentificationSequence](../../aspose.medical.dicom.tags/tag/physiciansofrecordidentificationsequence) | (0008,1049) VR=SQ VM=1 Physician(s) of Record Identification Sequence. |
| static readonly [PhysiciansReadingStudyIdentificationSequence](../../aspose.medical.dicom.tags/tag/physiciansreadingstudyidentificationsequence) | (0008,1062) VR=SQ VM=1 Physician(s) Reading Study Identification Sequence. |
| static readonly [PixelAspectRatio](../../aspose.medical.dicom.tags/tag/pixelaspectratio) | (0028,0034) VR=IS VM=2 Pixel Aspect Ratio. |
| static readonly [PixelBandwidth](../../aspose.medical.dicom.tags/tag/pixelbandwidth) | (0018,0095) VR=DS VM=1 Pixel Bandwidth. |
| static readonly [PixelComponentDataType](../../aspose.medical.dicom.tags/tag/pixelcomponentdatatype) | (0018,604E) VR=US VM=1 Pixel Component Data Type. |
| static readonly [PixelComponentMask](../../aspose.medical.dicom.tags/tag/pixelcomponentmask) | (0018,6046) VR=UL VM=1 Pixel Component Mask. |
| static readonly [PixelComponentOrganization](../../aspose.medical.dicom.tags/tag/pixelcomponentorganization) | (0018,6044) VR=US VM=1 Pixel Component Organization. |
| static readonly [PixelComponentPhysicalUnits](../../aspose.medical.dicom.tags/tag/pixelcomponentphysicalunits) | (0018,604C) VR=US VM=1 Pixel Component Physical Units. |
| static readonly [PixelComponentRangeStart](../../aspose.medical.dicom.tags/tag/pixelcomponentrangestart) | (0018,6048) VR=UL VM=1 Pixel Component Range Start. |
| static readonly [PixelComponentRangeStop](../../aspose.medical.dicom.tags/tag/pixelcomponentrangestop) | (0018,604A) VR=UL VM=1 Pixel Component Range Stop. |
| static readonly [PixelCoordinatesSetTrialRETIRED](../../aspose.medical.dicom.tags/tag/pixelcoordinatessettrialretired) | (0040,A29A) VR=SL VM=2-2n Pixel Coordinates Set (Trial) (RETIRED). |
| static readonly [PixelData](../../aspose.medical.dicom.tags/tag/pixeldata) | (7FE0,0010) VR=OB or OW VM=1 Pixel Data. |
| static readonly [PixelDataAreaOriginRelativeToFOV](../../aspose.medical.dicom.tags/tag/pixeldataareaoriginrelativetofov) | (0018,7036) VR=FL VM=2 Pixel Data Area Origin Relative To FOV. |
| static readonly [PixelDataAreaRotationAngleRelativeToFOV](../../aspose.medical.dicom.tags/tag/pixeldataarearotationanglerelativetofov) | (0018,7038) VR=FL VM=1 Pixel Data Area Rotation Angle Relative To FOV. |
| static readonly [PixelDataProviderURL](../../aspose.medical.dicom.tags/tag/pixeldataproviderurl) | (0028,7FE0) VR=UR VM=1 Pixel Data Provider URL. |
| static readonly [PixelIntensityRelationship](../../aspose.medical.dicom.tags/tag/pixelintensityrelationship) | (0028,1040) VR=CS VM=1 Pixel Intensity Relationship. |
| static readonly [PixelIntensityRelationshipLUTSequence](../../aspose.medical.dicom.tags/tag/pixelintensityrelationshiplutsequence) | (0028,9422) VR=SQ VM=1 Pixel Intensity Relationship LUT Sequence. |
| static readonly [PixelIntensityRelationshipSign](../../aspose.medical.dicom.tags/tag/pixelintensityrelationshipsign) | (0028,1041) VR=SS VM=1 Pixel Intensity Relationship Sign. |
| static readonly [PixelMeasuresSequence](../../aspose.medical.dicom.tags/tag/pixelmeasuressequence) | (0028,9110) VR=SQ VM=1 Pixel Measures Sequence. |
| static readonly [PixelOriginInterpretation](../../aspose.medical.dicom.tags/tag/pixelorigininterpretation) | (0048,0301) VR=CS VM=1 Pixel Origin Interpretation. |
| static readonly [PixelPaddingRangeLimit](../../aspose.medical.dicom.tags/tag/pixelpaddingrangelimit) | (0028,0121) VR=US or SS VM=1 Pixel Padding Range Limit. |
| static readonly [PixelPaddingValue](../../aspose.medical.dicom.tags/tag/pixelpaddingvalue) | (0028,0120) VR=US or SS VM=1 Pixel Padding Value. |
| static readonly [PixelPresentation](../../aspose.medical.dicom.tags/tag/pixelpresentation) | (0008,9205) VR=CS VM=1 Pixel Presentation. |
| static readonly [PixelRepresentation](../../aspose.medical.dicom.tags/tag/pixelrepresentation) | (0028,0103) VR=US VM=1 Pixel Representation. |
| static readonly [PixelShiftFrameRange](../../aspose.medical.dicom.tags/tag/pixelshiftframerange) | (0028,9506) VR=US VM=2-2n Pixel Shift Frame Range. |
| static readonly [PixelShiftSequence](../../aspose.medical.dicom.tags/tag/pixelshiftsequence) | (0028,9501) VR=SQ VM=1 Pixel Shift Sequence. |
| static readonly [PixelSpacing](../../aspose.medical.dicom.tags/tag/pixelspacing) | (0028,0030) VR=DS VM=2 Pixel Spacing. |
| static readonly [PixelSpacingCalibrationDescription](../../aspose.medical.dicom.tags/tag/pixelspacingcalibrationdescription) | (0028,0A04) VR=LO VM=1 Pixel Spacing Calibration Description. |
| static readonly [PixelSpacingCalibrationType](../../aspose.medical.dicom.tags/tag/pixelspacingcalibrationtype) | (0028,0A02) VR=CS VM=1 Pixel Spacing Calibration Type. |
| static readonly [PixelSpacingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/pixelspacingsequenceretired) | (0040,08D8) VR=SQ VM=1 Pixel Spacing Sequence (RETIRED). |
| static readonly [PixelValueMappingCodeSequence](../../aspose.medical.dicom.tags/tag/pixelvaluemappingcodesequence) | (0040,9098) VR=SQ VM=1 Pixel Value Mapping Code Sequence. |
| static readonly [PixelValueMappingExplanation](../../aspose.medical.dicom.tags/tag/pixelvaluemappingexplanation) | (0022,1454) VR=LO VM=1 Pixel Value Mapping Explanation. |
| static readonly [PixelValueMappingToCodedConceptSequence](../../aspose.medical.dicom.tags/tag/pixelvaluemappingtocodedconceptsequence) | (0022,1450) VR=SQ VM=1 Pixel Value Mapping to Coded Concept Sequence. |
| static readonly [PixelValueTransformationSequence](../../aspose.medical.dicom.tags/tag/pixelvaluetransformationsequence) | (0028,9145) VR=SQ VM=1 Pixel Value Transformation Sequence. |
| static readonly [PlacerOrderNumberImagingServiceRequest](../../aspose.medical.dicom.tags/tag/placerordernumberimagingservicerequest) | (0040,2016) VR=LO VM=1 Placer Order Number / Imaging Service Request. |
| static readonly [PlacerOrderNumberImagingServiceRequestRetiredRETIRED](../../aspose.medical.dicom.tags/tag/placerordernumberimagingservicerequestretiredretired) | (0040,2006) VR=SH VM=1 Placer Order Number / Imaging Service Request (Retired) (RETIRED). |
| static readonly [PlacerOrderNumberProcedureRETIRED](../../aspose.medical.dicom.tags/tag/placerordernumberprocedureretired) | (0040,1006) VR=SH VM=1 Placer Order Number / Procedure (RETIRED). |
| static readonly [PlanarConfiguration](../../aspose.medical.dicom.tags/tag/planarconfiguration) | (0028,0006) VR=US VM=1 Planar Configuration. |
| static readonly [Plane](../../aspose.medical.dicom.tags/tag/plane) | (0070,1305) VR=FD VM=4 Plane. |
| static readonly [PlaneIdentification](../../aspose.medical.dicom.tags/tag/planeidentification) | (0018,9457) VR=CS VM=1 Plane Identification. |
| static readonly [PlaneNormal](../../aspose.medical.dicom.tags/tag/planenormal) | (0070,1306) VR=FD VM=3 Plane Normal. |
| static readonly [PlaneOrientationSequence](../../aspose.medical.dicom.tags/tag/planeorientationsequence) | (0020,9116) VR=SQ VM=1 Plane Orientation Sequence. |
| static readonly [PlaneOrientationVolumeSequence](../../aspose.medical.dicom.tags/tag/planeorientationvolumesequence) | (0020,930F) VR=SQ VM=1 Plane Orientation (Volume) Sequence. |
| static readonly [PlanePositionSequence](../../aspose.medical.dicom.tags/tag/planepositionsequence) | (0020,9113) VR=SQ VM=1 Plane Position Sequence. |
| static readonly [PlanePositionSlideSequence](../../aspose.medical.dicom.tags/tag/planepositionslidesequence) | (0048,021A) VR=SQ VM=1 Plane Position (Slide) Sequence. |
| static readonly [PlanePositionVolumeSequence](../../aspose.medical.dicom.tags/tag/planepositionvolumesequence) | (0020,930E) VR=SQ VM=1 Plane Position (Volume) Sequence. |
| static readonly [PlanesInAcquisition](../../aspose.medical.dicom.tags/tag/planesinacquisition) | (0018,9410) VR=CS VM=1 Planes in Acquisition. |
| static readonly [PlanesRETIRED](../../aspose.medical.dicom.tags/tag/planesretired) | (0028,0012) VR=US VM=1 Planes (RETIRED). |
| static readonly [PlanIntent](../../aspose.medical.dicom.tags/tag/planintent) | (300A,000A) VR=CS VM=1 Plan Intent. |
| static readonly [PlannedVerificationImageSequence](../../aspose.medical.dicom.tags/tag/plannedverificationimagesequence) | (300A,00CA) VR=SQ VM=1 Planned Verification Image Sequence. |
| static readonly [PlanningInputInformationSequence](../../aspose.medical.dicom.tags/tag/planninginputinformationsequence) | (3010,0076) VR=SQ VM=1 Planning Input Information Sequence. |
| static readonly [PlanningLandmarkDescription](../../aspose.medical.dicom.tags/tag/planninglandmarkdescription) | (0068,6540) VR=LO VM=1 Planning Landmark Description. |
| static readonly [PlanningLandmarkID](../../aspose.medical.dicom.tags/tag/planninglandmarkid) | (0068,6530) VR=US VM=1 Planning Landmark ID. |
| static readonly [PlanningLandmarkIdentificationCodeSequence](../../aspose.medical.dicom.tags/tag/planninglandmarkidentificationcodesequence) | (0068,6545) VR=SQ VM=1 Planning Landmark Identification Code Sequence. |
| static readonly [PlanningLandmarkLineSequence](../../aspose.medical.dicom.tags/tag/planninglandmarklinesequence) | (0068,6510) VR=SQ VM=1 Planning Landmark Line Sequence. |
| static readonly [PlanningLandmarkPlaneSequence](../../aspose.medical.dicom.tags/tag/planninglandmarkplanesequence) | (0068,6520) VR=SQ VM=1 Planning Landmark Plane Sequence. |
| static readonly [PlanningLandmarkPointSequence](../../aspose.medical.dicom.tags/tag/planninglandmarkpointsequence) | (0068,6500) VR=SQ VM=1 Planning Landmark Point Sequence. |
| static readonly [PlanOverviewIndex](../../aspose.medical.dicom.tags/tag/planoverviewindex) | (300C,0117) VR=US VM=1 Plan Overview Index. |
| static readonly [PlanOverviewSequence](../../aspose.medical.dicom.tags/tag/planoverviewsequence) | (300C,0116) VR=SQ VM=1 Plan Overview Sequence. |
| static readonly [PlateID](../../aspose.medical.dicom.tags/tag/plateid) | (0018,1004) VR=LO VM=1 Plate ID. |
| static readonly [PlateType](../../aspose.medical.dicom.tags/tag/platetype) | (0018,1260) VR=SH VM=1 Plate Type. |
| static readonly [PointCoordinatesData](../../aspose.medical.dicom.tags/tag/pointcoordinatesdata) | (0066,0016) VR=OF VM=1 Point Coordinates Data. |
| static readonly [PointPositionAccuracy](../../aspose.medical.dicom.tags/tag/pointpositionaccuracy) | (0066,0017) VR=FL VM=3 Point Position Accuracy. |
| static readonly [PointsBoundingBoxCoordinates](../../aspose.medical.dicom.tags/tag/pointsboundingboxcoordinates) | (0066,001A) VR=FL VM=6 Points Bounding Box Coordinates. |
| static readonly [Polarity](../../aspose.medical.dicom.tags/tag/polarity) | (2020,0020) VR=CS VM=1 Polarity. |
| static readonly [PolynomialCoefficientsRETIRED](../../aspose.medical.dicom.tags/tag/polynomialcoefficientsretired) | (0014,605F) VR=DS VM=1-n PolynomialCoefficients (RETIRED). |
| static readonly [PolynomialFittingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/polynomialfittingsequenceretired) | (0014,6059) VR=SQ VM=1 Polynomial Fitting Sequence (RETIRED). |
| static readonly [PositionAcquisitionTemplateCodeSequence](../../aspose.medical.dicom.tags/tag/positionacquisitiontemplatecodesequence) | (3002,0122) VR=SQ VM=1 Position Acquisition Template Code Sequence. |
| static readonly [PositionAcquisitionTemplateDescription](../../aspose.medical.dicom.tags/tag/positionacquisitiontemplatedescription) | (3002,0123) VR=LT VM=1 Position Acquisition Template Description. |
| static readonly [PositionAcquisitionTemplateID](../../aspose.medical.dicom.tags/tag/positionacquisitiontemplateid) | (3002,0120) VR=ST VM=1 Position Acquisition Template ID. |
| static readonly [PositionAcquisitionTemplateIdentificationSequence](../../aspose.medical.dicom.tags/tag/positionacquisitiontemplateidentificationsequence) | (3002,011F) VR=SQ VM=1 Position Acquisition Template Identification Sequence. |
| static readonly [PositionAcquisitionTemplateName](../../aspose.medical.dicom.tags/tag/positionacquisitiontemplatename) | (3002,0121) VR=LO VM=1 Position Acquisition Template Name. |
| static readonly [PositionerIsocenterDetectorRotationAngle](../../aspose.medical.dicom.tags/tag/positionerisocenterdetectorrotationangle) | (0018,9465) VR=FL VM=1 Positioner Isocenter Detector Rotation Angle. |
| static readonly [PositionerIsocenterPrimaryAngle](../../aspose.medical.dicom.tags/tag/positionerisocenterprimaryangle) | (0018,9463) VR=FL VM=1 Positioner Isocenter Primary Angle. |
| static readonly [PositionerIsocenterSecondaryAngle](../../aspose.medical.dicom.tags/tag/positionerisocentersecondaryangle) | (0018,9464) VR=FL VM=1 Positioner Isocenter Secondary Angle. |
| static readonly [PositionerMotion](../../aspose.medical.dicom.tags/tag/positionermotion) | (0018,1500) VR=CS VM=1 Positioner Motion. |
| static readonly [PositionerPositionSequence](../../aspose.medical.dicom.tags/tag/positionerpositionsequence) | (0018,9405) VR=SQ VM=1 Positioner Position Sequence. |
| static readonly [PositionerPrimaryAngle](../../aspose.medical.dicom.tags/tag/positionerprimaryangle) | (0018,1510) VR=DS VM=1 Positioner Primary Angle. |
| static readonly [PositionerPrimaryAngleDirection](../../aspose.medical.dicom.tags/tag/positionerprimaryangledirection) | (0018,9559) VR=CS VM=1 Positioner Primary Angle Direction. |
| static readonly [PositionerPrimaryAngleIncrement](../../aspose.medical.dicom.tags/tag/positionerprimaryangleincrement) | (0018,1520) VR=DS VM=1-n Positioner Primary Angle Increment. |
| static readonly [PositionerSecondaryAngle](../../aspose.medical.dicom.tags/tag/positionersecondaryangle) | (0018,1511) VR=DS VM=1 Positioner Secondary Angle. |
| static readonly [PositionerSecondaryAngleIncrement](../../aspose.medical.dicom.tags/tag/positionersecondaryangleincrement) | (0018,1521) VR=DS VM=1-n Positioner Secondary Angle Increment. |
| static readonly [PositionerType](../../aspose.medical.dicom.tags/tag/positionertype) | (0018,1508) VR=CS VM=1 Positioner Type. |
| static readonly [PositioningLandmarkSequence](../../aspose.medical.dicom.tags/tag/positioninglandmarksequence) | (0018,991D) VR=SQ VM=1 Positioning Landmark Sequence. |
| static readonly [PositioningMethodCodeSequence](../../aspose.medical.dicom.tags/tag/positioningmethodcodesequence) | (0018,991C) VR=SQ VM=1 Positioning Method Code Sequence. |
| static readonly [PositionMeasuringDeviceUsed](../../aspose.medical.dicom.tags/tag/positionmeasuringdeviceused) | (0018,980C) VR=CS VM=1 Position Measuring Device Used. |
| static readonly [PositionOfIsocenterProjection](../../aspose.medical.dicom.tags/tag/positionofisocenterprojection) | (0018,9430) VR=FL VM=2 Position of Isocenter Projection. |
| static readonly [PositionReferenceIndicator](../../aspose.medical.dicom.tags/tag/positionreferenceindicator) | (0020,1040) VR=LO VM=1 Position Reference Indicator. |
| static readonly [PositiveCatchTrialsQuantity](../../aspose.medical.dicom.tags/tag/positivecatchtrialsquantity) | (0024,0056) VR=US VM=1 Positive Catch Trials Quantity. |
| static readonly [PostDeformationMatrixRegistrationSequence](../../aspose.medical.dicom.tags/tag/postdeformationmatrixregistrationsequence) | (0064,0010) VR=SQ VM=1 Post Deformation Matrix Registration Sequence. |
| static readonly [PostprocessingFunctionRETIRED](../../aspose.medical.dicom.tags/tag/postprocessingfunctionretired) | (0018,5021) VR=LO VM=1 Postprocessing Function (RETIRED). |
| static readonly [PotentialDiagnosticTasks](../../aspose.medical.dicom.tags/tag/potentialdiagnostictasks) | (0018,990A) VR=UC VM=1-n Potential Diagnostic Tasks. |
| static readonly [PotentialReasonsForProcedure](../../aspose.medical.dicom.tags/tag/potentialreasonsforprocedure) | (0018,9908) VR=UC VM=1-n Potential Reasons for Procedure. |
| static readonly [PotentialReasonsForProcedureCodeSequence](../../aspose.medical.dicom.tags/tag/potentialreasonsforprocedurecodesequence) | (0018,9909) VR=SQ VM=1 Potential Reasons for Procedure Code Sequence. |
| static readonly [PotentialRequestedProcedureCodeSequence](../../aspose.medical.dicom.tags/tag/potentialrequestedprocedurecodesequence) | (0018,9907) VR=SQ VM=1 Potential Requested Procedure Code Sequence. |
| static readonly [PotentialScheduledProtocolCodeSequence](../../aspose.medical.dicom.tags/tag/potentialscheduledprotocolcodesequence) | (0018,9906) VR=SQ VM=1 Potential Scheduled Protocol Code Sequence. |
| static readonly [PotentialThreatObjectIDRETIRED](../../aspose.medical.dicom.tags/tag/potentialthreatobjectidretired) | (4010,1010) VR=US VM=1 Potential Threat Object ID (RETIRED). |
| static readonly [PowerlineFrequency](../../aspose.medical.dicom.tags/tag/powerlinefrequency) | (003A,0311) VR=DS VM=1 Powerline Frequency. |
| static readonly [PRCSToRCSOrientationRETIRED](../../aspose.medical.dicom.tags/tag/prcstorcsorientationretired) | (4010,107E) VR=DS VM=6 PRCS to RCS Orientation (RETIRED). |
| static readonly [PreAmplifierEquipmentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/preamplifierequipmentsequenceretired) | (0014,400E) VR=SQ VM=1 Pre-Amplifier Equipment Sequence (RETIRED). |
| static readonly [PreAmplifierNotesRETIRED](../../aspose.medical.dicom.tags/tag/preamplifiernotesretired) | (0014,400F) VR=LT VM=1 Pre-Amplifier Notes (RETIRED). |
| static readonly [PreAmplifierSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/preamplifiersettingssequenceretired) | (0014,4040) VR=SQ VM=1 Pre-Amplifier Settings Sequence (RETIRED). |
| static readonly [PredecessorDocumentsSequence](../../aspose.medical.dicom.tags/tag/predecessordocumentssequence) | (0040,A360) VR=SQ VM=1 Predecessor Documents Sequence. |
| static readonly [PredecessorProtocolSequence](../../aspose.medical.dicom.tags/tag/predecessorprotocolsequence) | (0018,990E) VR=SQ VM=1 Predecessor Protocol Sequence. |
| static readonly [PredecessorStructureSetSequence](../../aspose.medical.dicom.tags/tag/predecessorstructuresetsequence) | (3006,0018) VR=SQ VM=1 Predecessor Structure Set Sequence. |
| static readonly [PreDeformationMatrixRegistrationSequence](../../aspose.medical.dicom.tags/tag/predeformationmatrixregistrationsequence) | (0064,000F) VR=SQ VM=1 Pre Deformation Matrix Registration Sequence. |
| static readonly [PredictedRefractiveError](../../aspose.medical.dicom.tags/tag/predictedrefractiveerror) | (0022,1054) VR=FL VM=1 Predicted Refractive Error. |
| static readonly [PredictedToricErrorSequence](../../aspose.medical.dicom.tags/tag/predictedtoricerrorsequence) | (0022,1048) VR=SQ VM=1 Predicted Toric Error Sequence. |
| static readonly [PredictorColumnsRETIRED](../../aspose.medical.dicom.tags/tag/predictorcolumnsretired) | (0028,0081) VR=US VM=1 Predictor Columns (RETIRED). |
| static readonly [PredictorConstantsRETIRED](../../aspose.medical.dicom.tags/tag/predictorconstantsretired) | (0028,0082) VR=US VM=1-n Predictor Constants (RETIRED). |
| static readonly [PredictorRowsRETIRED](../../aspose.medical.dicom.tags/tag/predictorrowsretired) | (0028,0080) VR=US VM=1 Predictor Rows (RETIRED). |
| static readonly [PreferredPlaybackSequencing](../../aspose.medical.dicom.tags/tag/preferredplaybacksequencing) | (0018,1244) VR=US VM=1 Preferred Playback Sequencing. |
| static readonly [PregnancyStatus](../../aspose.medical.dicom.tags/tag/pregnancystatus) | (0010,21C0) VR=US VM=1 Pregnancy Status. |
| static readonly [PreliminaryFlag](../../aspose.medical.dicom.tags/tag/preliminaryflag) | (0040,A496) VR=CS VM=1 Preliminary Flag. |
| static readonly [PreMedication](../../aspose.medical.dicom.tags/tag/premedication) | (0040,0012) VR=LO VM=1 Pre-Medication. |
| static readonly [PrescriptionDescription](../../aspose.medical.dicom.tags/tag/prescriptiondescription) | (300A,000E) VR=ST VM=1 Prescription Description. |
| static readonly [PrescriptionNotes](../../aspose.medical.dicom.tags/tag/prescriptionnotes) | (3010,007B) VR=UT VM=1 Prescription Notes. |
| static readonly [PrescriptionNotesSequence](../../aspose.medical.dicom.tags/tag/prescriptionnotessequence) | (3010,0081) VR=SQ VM=1 Prescription Notes Sequence. |
| static readonly [PrescriptionOverviewSequence](../../aspose.medical.dicom.tags/tag/prescriptionoverviewsequence) | (300C,0114) VR=SQ VM=1 Prescription Overview Sequence. |
| static readonly [PreSelectedForImplantation](../../aspose.medical.dicom.tags/tag/preselectedforimplantation) | (0022,1049) VR=CS VM=1 Pre-Selected for Implantation. |
| static readonly [PresentationAnimationStyle](../../aspose.medical.dicom.tags/tag/presentationanimationstyle) | (0070,1A01) VR=CS VM=1 Presentation Animation Style. |
| static readonly [PresentationCreationDate](../../aspose.medical.dicom.tags/tag/presentationcreationdate) | (0070,0082) VR=DA VM=1 Presentation Creation Date. |
| static readonly [PresentationCreationTime](../../aspose.medical.dicom.tags/tag/presentationcreationtime) | (0070,0083) VR=TM VM=1 Presentation Creation Time. |
| static readonly [PresentationDisplayCollectionUID](../../aspose.medical.dicom.tags/tag/presentationdisplaycollectionuid) | (0070,1101) VR=UI VM=1 Presentation Display Collection UID. |
| static readonly [PresentationGroupNumber](../../aspose.medical.dicom.tags/tag/presentationgroupnumber) | (003A,0241) VR=US VM=1 Presentation Group Number. |
| static readonly [PresentationInputType](../../aspose.medical.dicom.tags/tag/presentationinputtype) | (0070,1202) VR=CS VM=1 Presentation Input Type. |
| static readonly [PresentationIntentType](../../aspose.medical.dicom.tags/tag/presentationintenttype) | (0008,0068) VR=CS VM=1 Presentation Intent Type. |
| static readonly [PresentationLUTContentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/presentationlutcontentsequenceretired) | (2130,0080) VR=SQ VM=1 Presentation LUT Content Sequence (RETIRED). |
| static readonly [PresentationLUTFlagRETIRED](../../aspose.medical.dicom.tags/tag/presentationlutflagretired) | (2000,0069) VR=CS VM=1 Presentation LUT Flag (RETIRED). |
| static readonly [PresentationLUTSequence](../../aspose.medical.dicom.tags/tag/presentationlutsequence) | (2050,0010) VR=SQ VM=1 Presentation LUT Sequence. |
| static readonly [PresentationLUTShape](../../aspose.medical.dicom.tags/tag/presentationlutshape) | (2050,0020) VR=CS VM=1 Presentation LUT Shape. |
| static readonly [PresentationPixelAspectRatio](../../aspose.medical.dicom.tags/tag/presentationpixelaspectratio) | (0070,0102) VR=IS VM=2 Presentation Pixel Aspect Ratio. |
| static readonly [PresentationPixelMagnificationRatio](../../aspose.medical.dicom.tags/tag/presentationpixelmagnificationratio) | (0070,0103) VR=FL VM=1 Presentation Pixel Magnification Ratio. |
| static readonly [PresentationPixelSpacing](../../aspose.medical.dicom.tags/tag/presentationpixelspacing) | (0070,0101) VR=DS VM=2 Presentation Pixel Spacing. |
| static readonly [PresentationSequenceCollectionUID](../../aspose.medical.dicom.tags/tag/presentationsequencecollectionuid) | (0070,1102) VR=UI VM=1 Presentation Sequence Collection UID. |
| static readonly [PresentationSequencePositionIndex](../../aspose.medical.dicom.tags/tag/presentationsequencepositionindex) | (0070,1103) VR=US VM=1 Presentation Sequence Position Index. |
| static readonly [PresentationSizeMode](../../aspose.medical.dicom.tags/tag/presentationsizemode) | (0070,0100) VR=CS VM=1 Presentation Size Mode. |
| static readonly [PresentationStateClassificationComponentSequence](../../aspose.medical.dicom.tags/tag/presentationstateclassificationcomponentsequence) | (0070,1801) VR=SQ VM=1 Presentation State Classification Component Sequence. |
| static readonly [PresentationStateCompositorComponentSequence](../../aspose.medical.dicom.tags/tag/presentationstatecompositorcomponentsequence) | (0070,1805) VR=SQ VM=1 Presentation State Compositor Component Sequence. |
| static readonly [PresentedVisualStimuliDataFlag](../../aspose.medical.dicom.tags/tag/presentedvisualstimulidataflag) | (0024,0037) VR=CS VM=1 Presented Visual Stimuli Data Flag. |
| static readonly [PreserveCompositeInstancesAfterMediaCreation](../../aspose.medical.dicom.tags/tag/preservecompositeinstancesaftermediacreation) | (2200,000A) VR=CS VM=1 Preserve Composite Instances After Media Creation. |
| static readonly [Pressure](../../aspose.medical.dicom.tags/tag/pressure) | (0016,0032) VR=DS VM=1 Pressure. |
| static readonly [PrimaryAnatomicStructureItemIndex](../../aspose.medical.dicom.tags/tag/primaryanatomicstructureitemindex) | (0022,1634) VR=IS VM=1 Primary Anatomic Structure Item Index. |
| static readonly [PrimaryAnatomicStructureModifierSequence](../../aspose.medical.dicom.tags/tag/primaryanatomicstructuremodifiersequence) | (0008,2230) VR=SQ VM=1 Primary Anatomic Structure Modifier Sequence. |
| static readonly [PrimaryAnatomicStructureSequence](../../aspose.medical.dicom.tags/tag/primaryanatomicstructuresequence) | (0008,2228) VR=SQ VM=1 Primary Anatomic Structure Sequence. |
| static readonly [PrimaryChromaticities](../../aspose.medical.dicom.tags/tag/primarychromaticities) | (0016,0002) VR=DS VM=3 Primary Chromaticities. |
| static readonly [PrimaryDiagnosisCodeSequence](../../aspose.medical.dicom.tags/tag/primarydiagnosiscodesequence) | (0008,1302) VR=SQ VM=1 Primary Diagnosis Code Sequence. |
| static readonly [PrimaryDoseValueIndicator](../../aspose.medical.dicom.tags/tag/primarydosevalueindicator) | (300A,061B) VR=CS VM=1 Primary Dose Value Indicator. |
| static readonly [PrimaryDosimeterUnit](../../aspose.medical.dicom.tags/tag/primarydosimeterunit) | (300A,00B3) VR=CS VM=1 Primary Dosimeter Unit. |
| static readonly [PrimaryFluenceModeSequence](../../aspose.medical.dicom.tags/tag/primaryfluencemodesequence) | (3002,0050) VR=SQ VM=1 Primary Fluence Mode Sequence. |
| static readonly [PrimaryPositionerIncrement](../../aspose.medical.dicom.tags/tag/primarypositionerincrement) | (0018,9514) VR=FL VM=1 Primary Positioner Increment. |
| static readonly [PrimaryPositionerIncrementSign](../../aspose.medical.dicom.tags/tag/primarypositionerincrementsign) | (0018,9518) VR=SS VM=1 Primary Positioner Increment Sign. |
| static readonly [PrimaryPositionerScanArc](../../aspose.medical.dicom.tags/tag/primarypositionerscanarc) | (0018,9508) VR=FL VM=1 Primary Positioner Scan Arc. |
| static readonly [PrimaryPositionerScanStartAngle](../../aspose.medical.dicom.tags/tag/primarypositionerscanstartangle) | (0018,9510) VR=FL VM=1 Primary Positioner Scan Start Angle. |
| static readonly [PrimaryPromptsCountsAccumulated](../../aspose.medical.dicom.tags/tag/primarypromptscountsaccumulated) | (0054,1310) VR=IS VM=1 Primary (Prompts) Counts Accumulated. |
| static readonly [PrimitivePointIndexListRETIRED](../../aspose.medical.dicom.tags/tag/primitivepointindexlistretired) | (0066,0029) VR=OW VM=1 Primitive Point Index List (RETIRED). |
| static readonly [PrincipalDiagnosisCodeSequence](../../aspose.medical.dicom.tags/tag/principaldiagnosiscodesequence) | (0008,1301) VR=SQ VM=1 Principal Diagnosis Code Sequence. |
| static readonly [PrinterCharacteristicsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/printercharacteristicssequenceretired) | (2130,0015) VR=SQ VM=1 Printer Characteristics Sequence (RETIRED). |
| static readonly [PrinterConfigurationSequence](../../aspose.medical.dicom.tags/tag/printerconfigurationsequence) | (2000,001E) VR=SQ VM=1 Printer Configuration Sequence. |
| static readonly [PrinterName](../../aspose.medical.dicom.tags/tag/printername) | (2110,0030) VR=LO VM=1 Printer Name. |
| static readonly [PrinterPixelSpacing](../../aspose.medical.dicom.tags/tag/printerpixelspacing) | (2010,0376) VR=DS VM=2 Printer Pixel Spacing. |
| static readonly [PrinterResolutionID](../../aspose.medical.dicom.tags/tag/printerresolutionid) | (2010,0052) VR=CS VM=1 Printer Resolution ID. |
| static readonly [PrinterStatus](../../aspose.medical.dicom.tags/tag/printerstatus) | (2110,0010) VR=CS VM=1 Printer Status. |
| static readonly [PrinterStatusInfo](../../aspose.medical.dicom.tags/tag/printerstatusinfo) | (2110,0020) VR=CS VM=1 Printer Status Info. |
| static readonly [PrintingBitDepth](../../aspose.medical.dicom.tags/tag/printingbitdepth) | (2000,00A1) VR=US VM=1 Printing Bit Depth. |
| static readonly [PrintJobDescriptionSequenceRETIRED](../../aspose.medical.dicom.tags/tag/printjobdescriptionsequenceretired) | (2120,0050) VR=SQ VM=1 Print Job Description Sequence (RETIRED). |
| static readonly [PrintJobIDRETIRED](../../aspose.medical.dicom.tags/tag/printjobidretired) | (2100,0010) VR=SH VM=1 Print Job ID (RETIRED). |
| static readonly [PrintManagementCapabilitiesSequenceRETIRED](../../aspose.medical.dicom.tags/tag/printmanagementcapabilitiessequenceretired) | (2130,0010) VR=SQ VM=1 Print Management Capabilities Sequence (RETIRED). |
| static readonly [PrintPriority](../../aspose.medical.dicom.tags/tag/printpriority) | (2000,0020) VR=CS VM=1 Print Priority. |
| static readonly [PrintQueueIDRETIRED](../../aspose.medical.dicom.tags/tag/printqueueidretired) | (2110,0099) VR=SH VM=1 Print Queue ID (RETIRED). |
| static readonly [PrintRETIRED](../../aspose.medical.dicom.tags/tag/printretired) | (0000,51A0) VR=CS VM=1 Print (RETIRED). |
| static readonly [Priority](../../aspose.medical.dicom.tags/tag/priority) | (0000,0700) VR=US VM=1 Priority. |
| static readonly [PriorRecordKey](../../aspose.medical.dicom.tags/tag/priorrecordkey) | (0008,041C) VR=OB VM=1 Prior Record Key. |
| static readonly [PriorTreatmentDoseDescription](../../aspose.medical.dicom.tags/tag/priortreatmentdosedescription) | (3010,0061) VR=UT VM=1 Prior Treatment Dose Description. |
| static readonly [PriorTreatmentReferenceSequence](../../aspose.medical.dicom.tags/tag/priortreatmentreferencesequence) | (3010,0062) VR=SQ VM=1 Prior Treatment Reference Sequence. |
| static readonly [PrismSequence](../../aspose.medical.dicom.tags/tag/prismsequence) | (0046,0028) VR=SQ VM=1 Prism Sequence. |
| static readonly [PrivateCreatorReference](../../aspose.medical.dicom.tags/tag/privatecreatorreference) | (0008,0302) VR=LO VM=1 Private Creator Reference. |
| static readonly [PrivateDataElement](../../aspose.medical.dicom.tags/tag/privatedataelement) | (0008,0308) VR=US VM=1 Private Data Element. |
| static readonly [PrivateDataElementCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/privatedataelementcharacteristicssequence) | (0008,0300) VR=SQ VM=1 Private Data Element Characteristics Sequence. |
| static readonly [PrivateDataElementDefinitionSequence](../../aspose.medical.dicom.tags/tag/privatedataelementdefinitionsequence) | (0008,0310) VR=SQ VM=1 Private Data Element Definition Sequence. |
| static readonly [PrivateDataElementDescription](../../aspose.medical.dicom.tags/tag/privatedataelementdescription) | (0008,030E) VR=UT VM=1 Private Data Element Description. |
| static readonly [PrivateDataElementEncoding](../../aspose.medical.dicom.tags/tag/privatedataelementencoding) | (0008,030F) VR=UT VM=1 Private Data Element Encoding. |
| static readonly [PrivateDataElementKeyword](../../aspose.medical.dicom.tags/tag/privatedataelementkeyword) | (0008,030D) VR=UC VM=1 Private Data Element Keyword. |
| static readonly [PrivateDataElementName](../../aspose.medical.dicom.tags/tag/privatedataelementname) | (0008,030C) VR=UC VM=1 Private Data Element Name. |
| static readonly [PrivateDataElementNumberOfItems](../../aspose.medical.dicom.tags/tag/privatedataelementnumberofitems) | (0008,030B) VR=UL VM=1-2 Private Data Element Number of Items. |
| static readonly [PrivateDataElementValueMultiplicity](../../aspose.medical.dicom.tags/tag/privatedataelementvaluemultiplicity) | (0008,0309) VR=UL VM=1-3 Private Data Element Value Multiplicity. |
| static readonly [PrivateDataElementValueRepresentation](../../aspose.medical.dicom.tags/tag/privatedataelementvaluerepresentation) | (0008,030A) VR=CS VM=1 Private Data Element Value Representation. |
| static readonly [PrivateGroupReference](../../aspose.medical.dicom.tags/tag/privategroupreference) | (0008,0301) VR=US VM=1 Private Group Reference. |
| static readonly [PrivateInformation](../../aspose.medical.dicom.tags/tag/privateinformation) | (0002,0102) VR=OB VM=1 Private Information. |
| static readonly [PrivateInformationCreatorUID](../../aspose.medical.dicom.tags/tag/privateinformationcreatoruid) | (0002,0100) VR=UI VM=1 Private Information Creator UID. |
| static readonly [PrivateRecordUID](../../aspose.medical.dicom.tags/tag/privaterecorduid) | (0004,1432) VR=UI VM=1 Private Record UID. |
| static readonly [ProbeCenterLocationXRETIRED](../../aspose.medical.dicom.tags/tag/probecenterlocationxretired) | (0014,4058) VR=DS VM=1 Probe Center Location X (RETIRED). |
| static readonly [ProbeCenterLocationZRETIRED](../../aspose.medical.dicom.tags/tag/probecenterlocationzretired) | (0014,4059) VR=DS VM=1 Probe Center Location Z (RETIRED). |
| static readonly [ProbeDriveEquipmentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/probedriveequipmentsequenceretired) | (0014,4080) VR=SQ VM=1 Probe Drive Equipment Sequence (RETIRED). |
| static readonly [ProbeDriveNotesRETIRED](../../aspose.medical.dicom.tags/tag/probedrivenotesretired) | (0014,4082) VR=LT VM=1 Probe Drive Notes (RETIRED). |
| static readonly [ProbeDriveSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/probedrivesettingssequenceretired) | (0014,4087) VR=SQ VM=1 Probe Drive Settings Sequence (RETIRED). |
| static readonly [ProbeInductanceRETIRED](../../aspose.medical.dicom.tags/tag/probeinductanceretired) | (0014,4084) VR=DS VM=1 Probe Inductance (RETIRED). |
| static readonly [ProbeManufacturerRETIRED](../../aspose.medical.dicom.tags/tag/probemanufacturerretired) | (0014,603F) VR=LO VM=1 Probe Manufacturer (RETIRED). |
| static readonly [ProbeModelNumberRETIRED](../../aspose.medical.dicom.tags/tag/probemodelnumberretired) | (0014,6040) VR=LO VM=1 Probe Model Number (RETIRED). |
| static readonly [ProbeOrientationAngleRETIRED](../../aspose.medical.dicom.tags/tag/probeorientationangleretired) | (0014,4089) VR=DS VM=1 Probe Orientation Angle (RETIRED). |
| static readonly [ProbeResistanceRETIRED](../../aspose.medical.dicom.tags/tag/proberesistanceretired) | (0014,4085) VR=DS VM=1 Probe Resistance (RETIRED). |
| static readonly [ProbeResonantFrequencyRETIRED](../../aspose.medical.dicom.tags/tag/proberesonantfrequencyretired) | (0014,6042) VR=DS VM=1 Probe Resonant Frequency (RETIRED). |
| static readonly [ProcedureCodeSequence](../../aspose.medical.dicom.tags/tag/procedurecodesequence) | (0008,1032) VR=SQ VM=1 Procedure Code Sequence. |
| static readonly [ProcedureContextFlagTrialRETIRED](../../aspose.medical.dicom.tags/tag/procedurecontextflagtrialretired) | (0040,A603) VR=CS VM=1 Procedure Context Flag (Trial) (RETIRED). |
| static readonly [ProcedureContextSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/procedurecontextsequencetrialretired) | (0040,A340) VR=SQ VM=1 Procedure Context Sequence (Trial) (RETIRED). |
| static readonly [ProcedureCreationDateRETIRED](../../aspose.medical.dicom.tags/tag/procedurecreationdateretired) | (0014,4076) VR=DA VM=1 Procedure Creation Date (RETIRED). |
| static readonly [ProcedureExpirationDateRETIRED](../../aspose.medical.dicom.tags/tag/procedureexpirationdateretired) | (0014,4078) VR=DA VM=1 Procedure Expiration Date (RETIRED). |
| static readonly [ProcedureIdentifierCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/procedureidentifiercodesequencetrialretired) | (0040,A085) VR=SQ VM=1 Procedure Identifier Code Sequence (Trial) (RETIRED). |
| static readonly [ProcedureLastModifiedDateRETIRED](../../aspose.medical.dicom.tags/tag/procedurelastmodifieddateretired) | (0014,407A) VR=DA VM=1 Procedure Last Modified Date (RETIRED). |
| static readonly [ProcedureStepCancellationDateTime](../../aspose.medical.dicom.tags/tag/procedurestepcancellationdatetime) | (0040,4052) VR=DT VM=1 Procedure Step Cancellation DateTime. |
| static readonly [ProcedureStepCommunicationsURISequence](../../aspose.medical.dicom.tags/tag/procedurestepcommunicationsurisequence) | (0074,1008) VR=SQ VM=1 Procedure Step Communications URI Sequence. |
| static readonly [ProcedureStepDiscontinuationReasonCodeSequence](../../aspose.medical.dicom.tags/tag/procedurestepdiscontinuationreasoncodesequence) | (0074,100E) VR=SQ VM=1 Procedure Step Discontinuation Reason Code Sequence. |
| static readonly [ProcedureStepLabel](../../aspose.medical.dicom.tags/tag/proceduresteplabel) | (0074,1204) VR=LO VM=1 Procedure Step Label. |
| static readonly [ProcedureStepProgress](../../aspose.medical.dicom.tags/tag/procedurestepprogress) | (0074,1004) VR=DS VM=1 Procedure Step Progress. |
| static readonly [ProcedureStepProgressDescription](../../aspose.medical.dicom.tags/tag/procedurestepprogressdescription) | (0074,1006) VR=ST VM=1 Procedure Step Progress Description. |
| static readonly [ProcedureStepProgressInformationSequence](../../aspose.medical.dicom.tags/tag/procedurestepprogressinformationsequence) | (0074,1002) VR=SQ VM=1 Procedure Step Progress Information Sequence. |
| static readonly [ProcedureStepProgressParametersSequence](../../aspose.medical.dicom.tags/tag/procedurestepprogressparameterssequence) | (0074,1007) VR=SQ VM=1 Procedure Step Progress Parameters Sequence. |
| static readonly [ProcedureStepRelationshipTypeRETIRED](../../aspose.medical.dicom.tags/tag/proceduresteprelationshiptyperetired) | (0074,1222) VR=LO VM=1 Procedure Step Relationship Type (RETIRED). |
| static readonly [ProcedureStepState](../../aspose.medical.dicom.tags/tag/procedurestepstate) | (0074,1000) VR=CS VM=1 Procedure Step State. |
| static readonly [ProcedureTypeCodeSequence](../../aspose.medical.dicom.tags/tag/proceduretypecodesequence) | (0076,0020) VR=SQ VM=1 Procedure Type Code Sequence. |
| static readonly [ProcedureVersionRETIRED](../../aspose.medical.dicom.tags/tag/procedureversionretired) | (0014,4074) VR=SH VM=1 Procedure Version (RETIRED). |
| static readonly [ProcessingFunction](../../aspose.medical.dicom.tags/tag/processingfunction) | (0018,5020) VR=LO VM=1 Processing Function. |
| static readonly [ProductDescription](../../aspose.medical.dicom.tags/tag/productdescription) | (0044,0009) VR=LT VM=1 Product Description. |
| static readonly [ProductExpirationDateTime](../../aspose.medical.dicom.tags/tag/productexpirationdatetime) | (0044,000B) VR=DT VM=1 Product Expiration DateTime. |
| static readonly [ProductLotIdentifier](../../aspose.medical.dicom.tags/tag/productlotidentifier) | (0044,000A) VR=LO VM=1 Product Lot Identifier. |
| static readonly [ProductName](../../aspose.medical.dicom.tags/tag/productname) | (0044,0008) VR=LO VM=1-n Product Name. |
| static readonly [ProductPackageIdentifier](../../aspose.medical.dicom.tags/tag/productpackageidentifier) | (0044,0001) VR=ST VM=1 Product Package Identifier. |
| static readonly [ProductParameterSequence](../../aspose.medical.dicom.tags/tag/productparametersequence) | (0044,0013) VR=SQ VM=1 Product Parameter Sequence. |
| static readonly [ProductTypeCodeSequence](../../aspose.medical.dicom.tags/tag/producttypecodesequence) | (0044,0007) VR=SQ VM=1 Product Type Code Sequence. |
| static readonly [ProjectionEponymousNameCodeSequence](../../aspose.medical.dicom.tags/tag/projectioneponymousnamecodesequence) | (0018,5104) VR=SQ VM=1 Projection Eponymous Name Code Sequence. |
| static readonly [ProjectionImagingAcquisitionParameterSequence](../../aspose.medical.dicom.tags/tag/projectionimagingacquisitionparametersequence) | (3002,0125) VR=SQ VM=1 Projection Imaging Acquisition Parameter Sequence. |
| static readonly [ProjectionPixelCalibrationSequence](../../aspose.medical.dicom.tags/tag/projectionpixelcalibrationsequence) | (0018,9401) VR=SQ VM=1 Projection Pixel Calibration Sequence. |
| static readonly [PropertyLabelRETIRED](../../aspose.medical.dicom.tags/tag/propertylabelretired) | (0014,2032) VR=SH VM=1 Property Label (RETIRED). |
| static readonly [ProposedStudySequence](../../aspose.medical.dicom.tags/tag/proposedstudysequence) | (2130,00A0) VR=SQ VM=1 Proposed Study Sequence. |
| static readonly [ProtocolContextSequence](../../aspose.medical.dicom.tags/tag/protocolcontextsequence) | (0040,0440) VR=SQ VM=1 Protocol Context Sequence. |
| static readonly [ProtocolDefinedPatientPosition](../../aspose.medical.dicom.tags/tag/protocoldefinedpatientposition) | (0018,9947) VR=CS VM=1 Protocol Defined Patient Position. |
| static readonly [ProtocolDesignRationale](../../aspose.medical.dicom.tags/tag/protocoldesignrationale) | (0018,9910) VR=UT VM=1 Protocol Design Rationale. |
| static readonly [ProtocolElementCharacteristicsSummary](../../aspose.medical.dicom.tags/tag/protocolelementcharacteristicssummary) | (0018,9923) VR=UT VM=1 Protocol Element Characteristics Summary. |
| static readonly [ProtocolElementName](../../aspose.medical.dicom.tags/tag/protocolelementname) | (0018,9922) VR=LO VM=1 Protocol Element Name. |
| static readonly [ProtocolElementNumber](../../aspose.medical.dicom.tags/tag/protocolelementnumber) | (0018,9921) VR=US VM=1 Protocol Element Number. |
| static readonly [ProtocolElementPurpose](../../aspose.medical.dicom.tags/tag/protocolelementpurpose) | (0018,9924) VR=UT VM=1 Protocol Element Purpose. |
| static readonly [ProtocolName](../../aspose.medical.dicom.tags/tag/protocolname) | (0018,1030) VR=LO VM=1 Protocol Name. |
| static readonly [ProtocolPlanningInformation](../../aspose.medical.dicom.tags/tag/protocolplanninginformation) | (0018,990F) VR=UT VM=1 Protocol Planning Information. |
| static readonly [PseudoColorPaletteInstanceReferenceSequence](../../aspose.medical.dicom.tags/tag/pseudocolorpaletteinstancereferencesequence) | (0072,0705) VR=SQ VM=1 Pseudo-Color Palette Instance Reference Sequence. |
| static readonly [PseudoColorType](../../aspose.medical.dicom.tags/tag/pseudocolortype) | (0072,0704) VR=CS VM=1 Pseudo-Color Type. |
| static readonly [PTOLocationDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/ptolocationdescriptionretired) | (4010,1078) VR=ST VM=1 PTO Location Description (RETIRED). |
| static readonly [PTORegionSequenceRETIRED](../../aspose.medical.dicom.tags/tag/ptoregionsequenceretired) | (4010,107B) VR=SQ VM=1 PTO Region Sequence (RETIRED). |
| static readonly [PTORepresentationSequenceRETIRED](../../aspose.medical.dicom.tags/tag/ptorepresentationsequenceretired) | (4010,1037) VR=SQ VM=1 PTO Representation Sequence (RETIRED). |
| static readonly [PulseNumber](../../aspose.medical.dicom.tags/tag/pulsenumber) | (3008,0172) VR=US VM=1 Pulse Number. |
| static readonly [PulseRepetitionFrequency](../../aspose.medical.dicom.tags/tag/pulserepetitionfrequency) | (0018,6032) VR=UL VM=1 Pulse Repetition Frequency. |
| static readonly [PulseRepetitionInterval](../../aspose.medical.dicom.tags/tag/pulserepetitioninterval) | (300A,028C) VR=DS VM=1 Pulse Repetition Interval. |
| static readonly [PulserEquipmentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/pulserequipmentsequenceretired) | (0014,4002) VR=SQ VM=1 Pulser Equipment Sequence (RETIRED). |
| static readonly [PulserNotesRETIRED](../../aspose.medical.dicom.tags/tag/pulsernotesretired) | (0014,4006) VR=LT VM=1 Pulser Notes (RETIRED). |
| static readonly [PulserSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/pulsersettingssequenceretired) | (0014,4020) VR=SQ VM=1 Pulser Settings Sequence (RETIRED). |
| static readonly [PulserTypeRETIRED](../../aspose.medical.dicom.tags/tag/pulsertyperetired) | (0014,4004) VR=CS VM=1 Pulser Type (RETIRED). |
| static readonly [PulseSequenceName](../../aspose.medical.dicom.tags/tag/pulsesequencename) | (0018,9005) VR=SH VM=1 Pulse Sequence Name. |
| static readonly [PulseSpecificBrachyControlPointDeliveredSequence](../../aspose.medical.dicom.tags/tag/pulsespecificbrachycontrolpointdeliveredsequence) | (3008,0171) VR=SQ VM=1 Pulse Specific Brachy Control Point Delivered Sequence. |
| static readonly [PulseWidthRETIRED](../../aspose.medical.dicom.tags/tag/pulsewidthretired) | (0014,4022) VR=DS VM=1 Pulse Width (RETIRED). |
| static readonly [PupilCentroidXCoordinate](../../aspose.medical.dicom.tags/tag/pupilcentroidxcoordinate) | (0046,0203) VR=FL VM=1 Pupil Centroid X-Coordinate. |
| static readonly [PupilCentroidYCoordinate](../../aspose.medical.dicom.tags/tag/pupilcentroidycoordinate) | (0046,0204) VR=FL VM=1 Pupil Centroid Y-Coordinate. |
| static readonly [PupilDilated](../../aspose.medical.dicom.tags/tag/pupildilated) | (0022,000D) VR=CS VM=1 Pupil Dilated. |
| static readonly [PupilSize](../../aspose.medical.dicom.tags/tag/pupilsize) | (0046,0044) VR=FD VM=1 Pupil Size. |
| static readonly [PurposeOfReferenceCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/purposeofreferencecodesequenceretired) | (0040,A170) VR=SQ VM=1 Purpose of Reference Code Sequence (RETIRED). |
| static readonly [PVCRejection](../../aspose.medical.dicom.tags/tag/pvcrejection) | (0018,1085) VR=LO VM=1 PVC Rejection. |
| static readonly [PyramidDescription](../../aspose.medical.dicom.tags/tag/pyramiddescription) | (0008,1088) VR=LO VM=1 Pyramid Description. |
| static readonly [PyramidLabel](../../aspose.medical.dicom.tags/tag/pyramidlabel) | (0020,0027) VR=LO VM=1 Pyramid Label. |
| static readonly [PyramidUID](../../aspose.medical.dicom.tags/tag/pyramiduid) | (0008,0019) VR=UI VM=1 Pyramid UID. |
| static readonly [QAResultsSequence](../../aspose.medical.dicom.tags/tag/qaresultssequence) | (0028,700F) VR=SQ VM=1 QA Results Sequence. |
| static readonly [QRMeasurementsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/qrmeasurementssequenceretired) | (4010,1071) VR=SQ VM=1 QR Measurements Sequence (RETIRED). |
| static readonly [QuadratureReceiveCoil](../../aspose.medical.dicom.tags/tag/quadraturereceivecoil) | (0018,9044) VR=CS VM=1 Quadrature Receive Coil. |
| static readonly [QualityControlImage](../../aspose.medical.dicom.tags/tag/qualitycontrolimage) | (0028,0300) VR=CS VM=1 Quality Control Image. |
| static readonly [QualityControlSubject](../../aspose.medical.dicom.tags/tag/qualitycontrolsubject) | (0010,0200) VR=CS VM=1 Quality Control Subject. |
| static readonly [QualityControlSubjectTypeCodeSequence](../../aspose.medical.dicom.tags/tag/qualitycontrolsubjecttypecodesequence) | (0010,0201) VR=SQ VM=1 Quality Control Subject Type Code Sequence. |
| static readonly [QualityThreshold](../../aspose.medical.dicom.tags/tag/qualitythreshold) | (0022,1630) VR=DS VM=1 Quality Threshold. |
| static readonly [QuantifiedDefect](../../aspose.medical.dicom.tags/tag/quantifieddefect) | (0024,0098) VR=FL VM=1 Quantified Defect. |
| static readonly [Quantity](../../aspose.medical.dicom.tags/tag/quantity) | (0040,0294) VR=DS VM=1 Quantity. |
| static readonly [QuantityDefinitionSequence](../../aspose.medical.dicom.tags/tag/quantitydefinitionsequence) | (0040,9220) VR=SQ VM=1 Quantity Definition Sequence. |
| static readonly [QuantitySequence](../../aspose.medical.dicom.tags/tag/quantitysequence) | (0040,0293) VR=SQ VM=1 Quantity Sequence. |
| static readonly [QueryRetrieveLevel](../../aspose.medical.dicom.tags/tag/queryretrievelevel) | (0008,0052) VR=CS VM=1 Query/Retrieve Level. |
| static readonly [QueryRetrieveView](../../aspose.medical.dicom.tags/tag/queryretrieveview) | (0008,0053) VR=CS VM=1 Query/Retrieve View. |
| static readonly [QueueStatusRETIRED](../../aspose.medical.dicom.tags/tag/queuestatusretired) | (2120,0010) VR=CS VM=1 Queue Status (RETIRED). |
| static readonly [RadialPosition](../../aspose.medical.dicom.tags/tag/radialposition) | (0018,1142) VR=DS VM=1-n Radial Position. |
| static readonly [RadiationAtomicNumber](../../aspose.medical.dicom.tags/tag/radiationatomicnumber) | (300A,0304) VR=IS VM=1 Radiation Atomic Number. |
| static readonly [RadiationBeamBlockSlabThickness](../../aspose.medical.dicom.tags/tag/radiationbeamblockslabthickness) | (300A,066E) VR=FD VM=1 Radiation Beam Block Slab Thickness. |
| static readonly [RadiationBeamBlockThickness](../../aspose.medical.dicom.tags/tag/radiationbeamblockthickness) | (300A,066D) VR=FD VM=1 Radiation Beam Block Thickness. |
| static readonly [RadiationBeamCompensatorMillingToolDiameter](../../aspose.medical.dicom.tags/tag/radiationbeamcompensatormillingtooldiameter) | (300A,0669) VR=FD VM=1 Radiation Beam Compensator Milling Tool Diameter. |
| static readonly [RadiationBeamEffectiveWedgeAngle](../../aspose.medical.dicom.tags/tag/radiationbeameffectivewedgeangle) | (300A,0654) VR=FD VM=1 Radiation Beam Effective Wedge Angle. |
| static readonly [RadiationBeamWedgeAngle](../../aspose.medical.dicom.tags/tag/radiationbeamwedgeangle) | (300A,0652) VR=FD VM=1 Radiation Beam Wedge Angle. |
| static readonly [RadiationBeamWedgeThinEdgeDistance](../../aspose.medical.dicom.tags/tag/radiationbeamwedgethinedgedistance) | (300A,0653) VR=FD VM=1 Radiation Beam Wedge Thin Edge Distance. |
| static readonly [RadiationChargeState](../../aspose.medical.dicom.tags/tag/radiationchargestate) | (300A,0306) VR=SS VM=1 Radiation Charge State. |
| static readonly [RadiationDeviceConfigurationAndCommissioningKeySequence](../../aspose.medical.dicom.tags/tag/radiationdeviceconfigurationandcommissioningkeysequence) | (300A,065A) VR=SQ VM=1 Radiation Device Configuration and Commissioning Key Sequence. |
| static readonly [RadiationDoseCentralAxisDisplacement](../../aspose.medical.dicom.tags/tag/radiationdosecentralaxisdisplacement) | (300A,0624) VR=FD VM=2 Radiation Dose Central Axis Displacement. |
| static readonly [RadiationDoseIdentificationIndex](../../aspose.medical.dicom.tags/tag/radiationdoseidentificationindex) | (300A,0603) VR=US VM=1 Radiation Dose Identification Index. |
| static readonly [RadiationDoseIdentificationLabel](../../aspose.medical.dicom.tags/tag/radiationdoseidentificationlabel) | (300A,0619) VR=LO VM=1 Radiation Dose Identification Label. |
| static readonly [RadiationDoseIdentificationSequence](../../aspose.medical.dicom.tags/tag/radiationdoseidentificationsequence) | (300A,0618) VR=SQ VM=1 Radiation Dose Identification Sequence. |
| static readonly [RadiationDoseInVivoMeasurementLabel](../../aspose.medical.dicom.tags/tag/radiationdoseinvivomeasurementlabel) | (300A,0623) VR=LO VM=1 Radiation Dose In-Vivo Measurement Label. |
| static readonly [RadiationDoseMeasurementPointCoordinates](../../aspose.medical.dicom.tags/tag/radiationdosemeasurementpointcoordinates) | (300A,0627) VR=FD VM=3 Radiation Dose Measurement Point Coordinates. |
| static readonly [RadiationDoseSequence](../../aspose.medical.dicom.tags/tag/radiationdosesequence) | (300A,0617) VR=SQ VM=1 Radiation Dose Sequence. |
| static readonly [RadiationDoseSourceToExternalContourDistance](../../aspose.medical.dicom.tags/tag/radiationdosesourcetoexternalcontourdistance) | (300A,0628) VR=FD VM=1 Radiation Dose Source to External Contour Distance. |
| static readonly [RadiationDoseSourceToSkinDistance](../../aspose.medical.dicom.tags/tag/radiationdosesourcetoskindistance) | (300A,0626) VR=FD VM=1 Radiation Dose Source to Skin Distance. |
| static readonly [RadiationDoseValue](../../aspose.medical.dicom.tags/tag/radiationdosevalue) | (300A,0625) VR=FD VM=1 Radiation Dose Value. |
| static readonly [RadiationDoseValuesParametersSequence](../../aspose.medical.dicom.tags/tag/radiationdosevaluesparameterssequence) | (300A,061F) VR=SQ VM=1 Radiation Dose Values Parameters Sequence. |
| static readonly [RadiationDosimeterUnitSequence](../../aspose.medical.dicom.tags/tag/radiationdosimeterunitsequence) | (300A,0658) VR=SQ VM=1 Radiation Dosimeter Unit Sequence. |
| static readonly [RadiationFluenceModifierCodeSequence](../../aspose.medical.dicom.tags/tag/radiationfluencemodifiercodesequence) | (300A,0683) VR=SQ VM=1 Radiation Fluence Modifier Code Sequence. |
| static readonly [RadiationGenerationModeDescription](../../aspose.medical.dicom.tags/tag/radiationgenerationmodedescription) | (300A,067D) VR=ST VM=1 Radiation GenerationMode Description. |
| static readonly [RadiationGenerationModeIndex](../../aspose.medical.dicom.tags/tag/radiationgenerationmodeindex) | (300A,0601) VR=US VM=1 Radiation Generation Mode Index. |
| static readonly [RadiationGenerationModeLabel](../../aspose.medical.dicom.tags/tag/radiationgenerationmodelabel) | (300A,067C) VR=SH VM=1 Radiation GenerationMode Label. |
| static readonly [RadiationGenerationModeMachineCodeSequence](../../aspose.medical.dicom.tags/tag/radiationgenerationmodemachinecodesequence) | (300A,067E) VR=SQ VM=1 Radiation GenerationMode Machine Code Sequence. |
| static readonly [RadiationGenerationModeSequence](../../aspose.medical.dicom.tags/tag/radiationgenerationmodesequence) | (300A,067B) VR=SQ VM=1 Radiation GenerationMode Sequence. |
| static readonly [RadiationMachineName](../../aspose.medical.dicom.tags/tag/radiationmachinename) | (3002,0020) VR=SH VM=1 Radiation Machine Name. |
| static readonly [RadiationMachineSAD](../../aspose.medical.dicom.tags/tag/radiationmachinesad) | (3002,0022) VR=DS VM=1 Radiation Machine SAD. |
| static readonly [RadiationMachineSSD](../../aspose.medical.dicom.tags/tag/radiationmachinessd) | (3002,0024) VR=DS VM=1 Radiation Machine SSD. |
| static readonly [RadiationMassNumber](../../aspose.medical.dicom.tags/tag/radiationmassnumber) | (300A,0302) VR=IS VM=1 Radiation Mass Number. |
| static readonly [RadiationMode](../../aspose.medical.dicom.tags/tag/radiationmode) | (0018,115A) VR=CS VM=1 Radiation Mode. |
| static readonly [RadiationOrderIndex](../../aspose.medical.dicom.tags/tag/radiationorderindex) | (300A,0786) VR=US VM=1 Radiation Order Index. |
| static readonly [RadiationSetting](../../aspose.medical.dicom.tags/tag/radiationsetting) | (0018,1155) VR=CS VM=1 Radiation Setting. |
| static readonly [RadiationSourceAxisDistance](../../aspose.medical.dicom.tags/tag/radiationsourceaxisdistance) | (300A,0640) VR=FD VM=1 Radiation Source-Axis Distance. |
| static readonly [RadiationSourceCoordinateSystemPitchAngle](../../aspose.medical.dicom.tags/tag/radiationsourcecoordinatesystempitchangle) | (3010,0096) VR=FD VM=1 Radiation Source Coordinate System Pitch Angle. |
| static readonly [RadiationSourceCoordinateSystemRollAngle](../../aspose.medical.dicom.tags/tag/radiationsourcecoordinatesystemrollangle) | (3010,0095) VR=FD VM=1 Radiation Source Coordinate SystemRoll Angle. |
| static readonly [RadiationSourceCoordinateSystemYawAngle](../../aspose.medical.dicom.tags/tag/radiationsourcecoordinatesystemyawangle) | (3010,0094) VR=FD VM=1 Radiation Source Coordinate SystemYaw Angle. |
| static readonly [RadiationType](../../aspose.medical.dicom.tags/tag/radiationtype) | (300A,00C6) VR=CS VM=1 Radiation Type. |
| static readonly [RadiationTypeCodeSequence](../../aspose.medical.dicom.tags/tag/radiationtypecodesequence) | (300A,067F) VR=SQ VM=1 Radiation Type Code Sequence. |
| static readonly [RadiobiologicalDoseEffectFlag](../../aspose.medical.dicom.tags/tag/radiobiologicaldoseeffectflag) | (3010,0002) VR=CS VM=1 Radiobiological Dose Effect Flag. |
| static readonly [RadiobiologicalDoseEffectSequence](../../aspose.medical.dicom.tags/tag/radiobiologicaldoseeffectsequence) | (3010,0001) VR=SQ VM=1 Radiobiological Dose Effect Sequence. |
| static readonly [RadionuclideCodeSequence](../../aspose.medical.dicom.tags/tag/radionuclidecodesequence) | (0054,0300) VR=SQ VM=1 Radionuclide Code Sequence. |
| static readonly [RadionuclideHalfLife](../../aspose.medical.dicom.tags/tag/radionuclidehalflife) | (0018,1075) VR=DS VM=1 Radionuclide Half Life. |
| static readonly [RadionuclidePositronFraction](../../aspose.medical.dicom.tags/tag/radionuclidepositronfraction) | (0018,1076) VR=DS VM=1 Radionuclide Positron Fraction. |
| static readonly [RadionuclideRETIRED](../../aspose.medical.dicom.tags/tag/radionuclideretired) | (0018,0030) VR=LO VM=1-n Radionuclide (RETIRED). |
| static readonly [RadionuclideTotalDose](../../aspose.medical.dicom.tags/tag/radionuclidetotaldose) | (0018,1074) VR=DS VM=1 Radionuclide Total Dose. |
| static readonly [Radiopharmaceutical](../../aspose.medical.dicom.tags/tag/radiopharmaceutical) | (0018,0031) VR=LO VM=1 Radiopharmaceutical. |
| static readonly [RadiopharmaceuticalAdministrationEventUID](../../aspose.medical.dicom.tags/tag/radiopharmaceuticaladministrationeventuid) | (0008,3012) VR=UI VM=1 Radiopharmaceutical Administration Event UID. |
| static readonly [RadiopharmaceuticalAgentNumber](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalagentnumber) | (0018,9729) VR=US VM=1 Radiopharmaceutical Agent Number. |
| static readonly [RadiopharmaceuticalCodeSequence](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalcodesequence) | (0054,0304) VR=SQ VM=1 Radiopharmaceutical Code Sequence. |
| static readonly [RadiopharmaceuticalInformationSequence](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalinformationsequence) | (0054,0016) VR=SQ VM=1 Radiopharmaceutical Information Sequence. |
| static readonly [RadiopharmaceuticalRoute](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalroute) | (0018,1070) VR=LO VM=1 Radiopharmaceutical Route. |
| static readonly [RadiopharmaceuticalSpecificActivity](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalspecificactivity) | (0018,1077) VR=DS VM=1 Radiopharmaceutical Specific Activity. |
| static readonly [RadiopharmaceuticalStartDateTime](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalstartdatetime) | (0018,1078) VR=DT VM=1 Radiopharmaceutical Start DateTime. |
| static readonly [RadiopharmaceuticalStartTime](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalstarttime) | (0018,1072) VR=TM VM=1 Radiopharmaceutical Start Time. |
| static readonly [RadiopharmaceuticalStopDateTime](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalstopdatetime) | (0018,1079) VR=DT VM=1 Radiopharmaceutical Stop DateTime. |
| static readonly [RadiopharmaceuticalStopTime](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalstoptime) | (0018,1073) VR=TM VM=1 Radiopharmaceutical Stop Time. |
| static readonly [RadiopharmaceuticalUsageSequence](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalusagesequence) | (0018,9737) VR=SQ VM=1 Radiopharmaceutical Usage Sequence. |
| static readonly [RadiopharmaceuticalVolume](../../aspose.medical.dicom.tags/tag/radiopharmaceuticalvolume) | (0018,1071) VR=DS VM=1 Radiopharmaceutical Volume. |
| static readonly [RadiotherapyTreatmentType](../../aspose.medical.dicom.tags/tag/radiotherapytreatmenttype) | (3010,0046) VR=CS VM=1 Radiotherapy Treatment Type. |
| static readonly [RadiusAlongWedgeRETIRED](../../aspose.medical.dicom.tags/tag/radiusalongwedgeretired) | (0014,511F) VR=DS VM=1 Radius Along the Wedge (RETIRED). |
| static readonly [RadiusOfCircularCollimator](../../aspose.medical.dicom.tags/tag/radiusofcircularcollimator) | (0018,1712) VR=IS VM=1 Radius of Circular Collimator. |
| static readonly [RadiusOfCircularExposureControlSensingRegion](../../aspose.medical.dicom.tags/tag/radiusofcircularexposurecontrolsensingregion) | (0018,9441) VR=US VM=1 Radius of Circular Exposure Control Sensing Region. |
| static readonly [RadiusOfCircularShutter](../../aspose.medical.dicom.tags/tag/radiusofcircularshutter) | (0018,1612) VR=IS VM=1 Radius of Circular Shutter. |
| static readonly [RadiusOfCurvature](../../aspose.medical.dicom.tags/tag/radiusofcurvature) | (0046,0075) VR=FD VM=1 Radius of Curvature. |
| static readonly [RandomsCorrected](../../aspose.medical.dicom.tags/tag/randomscorrected) | (0018,9765) VR=CS VM=1 Randoms Corrected. |
| static readonly [RandomsCorrectionMethod](../../aspose.medical.dicom.tags/tag/randomscorrectionmethod) | (0054,1100) VR=CS VM=1 Randoms Correction Method. |
| static readonly [RangeMatchingSequence](../../aspose.medical.dicom.tags/tag/rangematchingsequence) | (0008,0410) VR=SQ VM=1 Range Matching Sequence. |
| static readonly [RangeModulatorDescription](../../aspose.medical.dicom.tags/tag/rangemodulatordescription) | (300A,034A) VR=LO VM=1 Range Modulator Description. |
| static readonly [RangeModulatorGatingStartValue](../../aspose.medical.dicom.tags/tag/rangemodulatorgatingstartvalue) | (300A,0382) VR=FL VM=1 Range Modulator Gating Start Value. |
| static readonly [RangeModulatorGatingStartWaterEquivalentThickness](../../aspose.medical.dicom.tags/tag/rangemodulatorgatingstartwaterequivalentthickness) | (300A,0386) VR=FL VM=1 Range Modulator Gating Start Water Equivalent Thickness. |
| static readonly [RangeModulatorGatingStopValue](../../aspose.medical.dicom.tags/tag/rangemodulatorgatingstopvalue) | (300A,0384) VR=FL VM=1 Range Modulator Gating Stop Value. |
| static readonly [RangeModulatorGatingStopWaterEquivalentThickness](../../aspose.medical.dicom.tags/tag/rangemodulatorgatingstopwaterequivalentthickness) | (300A,0388) VR=FL VM=1 Range Modulator Gating Stop Water Equivalent Thickness. |
| static readonly [RangeModulatorID](../../aspose.medical.dicom.tags/tag/rangemodulatorid) | (300A,0346) VR=SH VM=1 Range Modulator ID. |
| static readonly [RangeModulatorNumber](../../aspose.medical.dicom.tags/tag/rangemodulatornumber) | (300A,0344) VR=IS VM=1 Range Modulator Number. |
| static readonly [RangeModulatorSequence](../../aspose.medical.dicom.tags/tag/rangemodulatorsequence) | (300A,0342) VR=SQ VM=1 Range Modulator Sequence. |
| static readonly [RangeModulatorSettingsSequence](../../aspose.medical.dicom.tags/tag/rangemodulatorsettingssequence) | (300A,0380) VR=SQ VM=1 Range Modulator Settings Sequence. |
| static readonly [RangeModulatorType](../../aspose.medical.dicom.tags/tag/rangemodulatortype) | (300A,0348) VR=CS VM=1 Range Modulator Type. |
| static readonly [RangeOfFreedom](../../aspose.medical.dicom.tags/tag/rangeoffreedom) | (0068,64A0) VR=FD VM=2 Range of Freedom. |
| static readonly [RangeShifterDescription](../../aspose.medical.dicom.tags/tag/rangeshifterdescription) | (300A,0322) VR=LO VM=1 Range Shifter Description. |
| static readonly [RangeShifterID](../../aspose.medical.dicom.tags/tag/rangeshifterid) | (300A,0318) VR=SH VM=1 Range Shifter ID. |
| static readonly [RangeShifterNumber](../../aspose.medical.dicom.tags/tag/rangeshifternumber) | (300A,0316) VR=IS VM=1 Range Shifter Number. |
| static readonly [RangeShifterSequence](../../aspose.medical.dicom.tags/tag/rangeshiftersequence) | (300A,0314) VR=SQ VM=1 Range Shifter Sequence. |
| static readonly [RangeShifterSetting](../../aspose.medical.dicom.tags/tag/rangeshiftersetting) | (300A,0362) VR=LO VM=1 Range Shifter Setting. |
| static readonly [RangeShifterSettingsSequence](../../aspose.medical.dicom.tags/tag/rangeshiftersettingssequence) | (300A,0360) VR=SQ VM=1 Range Shifter Settings Sequence. |
| static readonly [RangeShifterType](../../aspose.medical.dicom.tags/tag/rangeshiftertype) | (300A,0320) VR=CS VM=1 Range Shifter Type. |
| static readonly [RangeShifterWaterEquivalentThickness](../../aspose.medical.dicom.tags/tag/rangeshifterwaterequivalentthickness) | (300A,0366) VR=FL VM=1 Range Shifter Water Equivalent Thickness. |
| static readonly [RangingDepth](../../aspose.medical.dicom.tags/tag/rangingdepth) | (0052,0009) VR=FD VM=1 Ranging Depth. |
| static readonly [RationalDenominatorValue](../../aspose.medical.dicom.tags/tag/rationaldenominatorvalue) | (0040,A163) VR=UL VM=1-n Rational Denominator Value. |
| static readonly [RationalNumeratorValue](../../aspose.medical.dicom.tags/tag/rationalnumeratorvalue) | (0040,A162) VR=SL VM=1-n Rational Numerator Value. |
| static readonly [RawDataHandling](../../aspose.medical.dicom.tags/tag/rawdatahandling) | (0040,4040) VR=CS VM=1 Raw Data Handling. |
| static readonly [RealTimeBulkDataFlowSequence](../../aspose.medical.dicom.tags/tag/realtimebulkdataflowsequence) | (0034,000A) VR=SQ VM=1 Real-Time Bulk Data Flow Sequence. |
| static readonly [RealWorldValueFirstValueMapped](../../aspose.medical.dicom.tags/tag/realworldvaluefirstvaluemapped) | (0040,9216) VR=US or SS VM=1 Real World Value First Value Mapped. |
| static readonly [RealWorldValueIntercept](../../aspose.medical.dicom.tags/tag/realworldvalueintercept) | (0040,9224) VR=FD VM=1 Real World Value Intercept. |
| static readonly [RealWorldValueLastValueMapped](../../aspose.medical.dicom.tags/tag/realworldvaluelastvaluemapped) | (0040,9211) VR=US or SS VM=1 Real World Value Last Value Mapped. |
| static readonly [RealWorldValueLUTData](../../aspose.medical.dicom.tags/tag/realworldvaluelutdata) | (0040,9212) VR=FD VM=1-n Real World Value LUT Data. |
| static readonly [RealWorldValueMappingSequence](../../aspose.medical.dicom.tags/tag/realworldvaluemappingsequence) | (0040,9096) VR=SQ VM=1 Real World Value Mapping Sequence. |
| static readonly [RealWorldValueSlope](../../aspose.medical.dicom.tags/tag/realworldvalueslope) | (0040,9225) VR=FD VM=1 Real World Value Slope. |
| static readonly [ReasonForCancellation](../../aspose.medical.dicom.tags/tag/reasonforcancellation) | (0074,1238) VR=LT VM=1 Reason for Cancellation. |
| static readonly [ReasonForChannelOmission](../../aspose.medical.dicom.tags/tag/reasonforchannelomission) | (0074,140A) VR=CS VM=1 Reason for Channel Omission. |
| static readonly [ReasonForChannelOmissionDescription](../../aspose.medical.dicom.tags/tag/reasonforchannelomissiondescription) | (0074,140B) VR=LO VM=1 Reason for Channel Omission Description. |
| static readonly [ReasonForOmission](../../aspose.medical.dicom.tags/tag/reasonforomission) | (300C,0112) VR=CS VM=1 Reason for Omission. |
| static readonly [ReasonForOmissionCodeSequence](../../aspose.medical.dicom.tags/tag/reasonforomissioncodesequence) | (300A,0788) VR=SQ VM=1 Reason for Omission Code Sequence. |
| static readonly [ReasonForOmissionDescription](../../aspose.medical.dicom.tags/tag/reasonforomissiondescription) | (300C,0113) VR=LO VM=1 Reason for Omission Description. |
| static readonly [ReasonForPerformedProcedureCodeSequence](../../aspose.medical.dicom.tags/tag/reasonforperformedprocedurecodesequence) | (0040,1012) VR=SQ VM=1 Reason For Performed Procedure Code Sequence. |
| static readonly [ReasonForRemovalCodeSequence](../../aspose.medical.dicom.tags/tag/reasonforremovalcodesequence) | (0008,0406) VR=SQ VM=1 Reason for Removal Code Sequence. |
| static readonly [ReasonForRequestedProcedureCodeSequence](../../aspose.medical.dicom.tags/tag/reasonforrequestedprocedurecodesequence) | (0040,100A) VR=SQ VM=1 Reason for Requested Procedure Code Sequence. |
| static readonly [ReasonForStudyRETIRED](../../aspose.medical.dicom.tags/tag/reasonforstudyretired) | (0032,1030) VR=LO VM=1 Reason for Study (RETIRED). |
| static readonly [ReasonForSuperseding](../../aspose.medical.dicom.tags/tag/reasonforsuperseding) | (3010,005C) VR=ST VM=1 Reason for Superseding. |
| static readonly [ReasonForTheAttributeModification](../../aspose.medical.dicom.tags/tag/reasonfortheattributemodification) | (0400,0565) VR=CS VM=1 Reason for the Attribute Modification. |
| static readonly [ReasonForTheImagingServiceRequestRETIRED](../../aspose.medical.dicom.tags/tag/reasonfortheimagingservicerequestretired) | (0040,2001) VR=LO VM=1 Reason for the Imaging Service Request (RETIRED). |
| static readonly [ReasonForTheRequestedProcedure](../../aspose.medical.dicom.tags/tag/reasonfortherequestedprocedure) | (0040,1002) VR=LO VM=1 Reason for the Requested Procedure. |
| static readonly [ReasonForVisit](../../aspose.medical.dicom.tags/tag/reasonforvisit) | (0032,1066) VR=UT VM=1 Reason for Visit. |
| static readonly [ReasonForVisitCodeSequence](../../aspose.medical.dicom.tags/tag/reasonforvisitcodesequence) | (0032,1067) VR=SQ VM=1 Reason for Visit Code Sequence. |
| static readonly [ReceiveCoilManufacturerName](../../aspose.medical.dicom.tags/tag/receivecoilmanufacturername) | (0018,9041) VR=LO VM=1 Receive Coil Manufacturer Name. |
| static readonly [ReceiveCoilName](../../aspose.medical.dicom.tags/tag/receivecoilname) | (0018,1250) VR=SH VM=1 Receive Coil Name. |
| static readonly [ReceiveCoilType](../../aspose.medical.dicom.tags/tag/receivecoiltype) | (0018,9043) VR=CS VM=1 Receive Coil Type. |
| static readonly [ReceiveProbeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/receiveprobesequenceretired) | (0014,4086) VR=SQ VM=1 Receive Probe Sequence (RETIRED). |
| static readonly [ReceiverEquipmentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/receiverequipmentsequenceretired) | (0014,4008) VR=SQ VM=1 Receiver Equipment Sequence (RETIRED). |
| static readonly [ReceiverNotesRETIRED](../../aspose.medical.dicom.tags/tag/receivernotesretired) | (0014,400C) VR=LT VM=1 Receiver Notes (RETIRED). |
| static readonly [ReceiverRETIRED](../../aspose.medical.dicom.tags/tag/receiverretired) | (0000,0300) VR=AE VM=1 Receiver (RETIRED). |
| static readonly [ReceiverSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/receiversettingssequenceretired) | (0014,4030) VR=SQ VM=1 Receiver Settings Sequence (RETIRED). |
| static readonly [ReceiveTransducerSequenceRETIRED](../../aspose.medical.dicom.tags/tag/receivetransducersequenceretired) | (0014,4011) VR=SQ VM=1 Receive Transducer Sequence (RETIRED). |
| static readonly [ReceiveTransducerSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/receivetransducersettingssequenceretired) | (0014,4051) VR=SQ VM=1 Receive Transducer Settings Sequence (RETIRED). |
| static readonly [ReceivingAE](../../aspose.medical.dicom.tags/tag/receivingae) | (0074,1234) VR=AE VM=1 Receiving AE. |
| static readonly [ReceivingApplicationEntityTitle](../../aspose.medical.dicom.tags/tag/receivingapplicationentitytitle) | (0002,0018) VR=AE VM=1 Receiving Application Entity Title. |
| static readonly [ReceivingPresentationAddress](../../aspose.medical.dicom.tags/tag/receivingpresentationaddress) | (0002,0028) VR=UR VM=1 Receiving Presentation Address. |
| static readonly [RecognitionCodeRETIRED](../../aspose.medical.dicom.tags/tag/recognitioncoderetired) | (0008,0010) VR=SH VM=1 Recognition Code (RETIRED). |
| static readonly [RecognizableVisualFeatures](../../aspose.medical.dicom.tags/tag/recognizablevisualfeatures) | (0028,0302) VR=CS VM=1 Recognizable Visual Features. |
| static readonly [RecommendedAbsentPixelCIELabValue](../../aspose.medical.dicom.tags/tag/recommendedabsentpixelcielabvalue) | (0048,0015) VR=US VM=3 Recommended Absent Pixel CIELab Value. |
| static readonly [RecommendedAnimationRate](../../aspose.medical.dicom.tags/tag/recommendedanimationrate) | (0070,1A03) VR=FD VM=1 Recommended Animation Rate. |
| static readonly [RecommendedDefaultValueSequence](../../aspose.medical.dicom.tags/tag/recommendeddefaultvaluesequence) | (0082,0035) VR=SQ VM=1 Recommended Default Value Sequence. |
| static readonly [RecommendedDisplayCIELabValue](../../aspose.medical.dicom.tags/tag/recommendeddisplaycielabvalue) | (0062,000D) VR=US VM=3 Recommended Display CIELab Value. |
| static readonly [RecommendedDisplayCIELabValueList](../../aspose.medical.dicom.tags/tag/recommendeddisplaycielabvaluelist) | (0066,0103) VR=OW VM=1 Recommended Display CIELab Value List. |
| static readonly [RecommendedDisplayFrameRate](../../aspose.medical.dicom.tags/tag/recommendeddisplayframerate) | (0008,2144) VR=IS VM=1 Recommended Display Frame Rate. |
| static readonly [RecommendedDisplayFrameRateInFloat](../../aspose.medical.dicom.tags/tag/recommendeddisplayframerateinfloat) | (0008,9459) VR=FL VM=1 Recommended Display Frame Rate in Float. |
| static readonly [RecommendedDisplayGrayscaleValue](../../aspose.medical.dicom.tags/tag/recommendeddisplaygrayscalevalue) | (0062,000C) VR=US VM=1 Recommended Display Grayscale Value. |
| static readonly [RecommendedExposureIndex](../../aspose.medical.dicom.tags/tag/recommendedexposureindex) | (0016,001C) VR=IS VM=1 Recommended Exposure Index. |
| static readonly [RecommendedIsodoseLevelSequence](../../aspose.medical.dicom.tags/tag/recommendedisodoselevelsequence) | (3004,0016) VR=SQ VM=1 Recommended Isodose Level Sequence. |
| static readonly [RecommendedLineThickness](../../aspose.medical.dicom.tags/tag/recommendedlinethickness) | (0066,0038) VR=FL VM=1 Recommended Line Thickness. |
| static readonly [RecommendedPointRadius](../../aspose.medical.dicom.tags/tag/recommendedpointradius) | (0066,0037) VR=FL VM=1 Recommended Point Radius. |
| static readonly [RecommendedPresentationOpacity](../../aspose.medical.dicom.tags/tag/recommendedpresentationopacity) | (0066,000C) VR=FL VM=1 Recommended Presentation Opacity. |
| static readonly [RecommendedPresentationType](../../aspose.medical.dicom.tags/tag/recommendedpresentationtype) | (0066,000D) VR=CS VM=1 Recommended Presentation Type. |
| static readonly [RecommendedRotationPoint](../../aspose.medical.dicom.tags/tag/recommendedrotationpoint) | (0068,6346) VR=FD VM=2 Recommended Rotation Point. |
| static readonly [RecommendedViewingMode](../../aspose.medical.dicom.tags/tag/recommendedviewingmode) | (0028,1090) VR=CS VM=1 Recommended Viewing Mode. |
| static readonly [ReconstructionAlgorithm](../../aspose.medical.dicom.tags/tag/reconstructionalgorithm) | (0018,9315) VR=CS VM=1 Reconstruction Algorithm. |
| static readonly [ReconstructionAlgorithmSequence](../../aspose.medical.dicom.tags/tag/reconstructionalgorithmsequence) | (0018,993D) VR=SQ VM=1 Reconstruction Algorithm Sequence. |
| static readonly [ReconstructionAngle](../../aspose.medical.dicom.tags/tag/reconstructionangle) | (0018,9319) VR=FD VM=1 Reconstruction Angle. |
| static readonly [ReconstructionDescription](../../aspose.medical.dicom.tags/tag/reconstructiondescription) | (0018,9531) VR=LO VM=1 Reconstruction Description. |
| static readonly [ReconstructionDiameter](../../aspose.medical.dicom.tags/tag/reconstructiondiameter) | (0018,1100) VR=DS VM=1 Reconstruction Diameter. |
| static readonly [ReconstructionEndLocationSequence](../../aspose.medical.dicom.tags/tag/reconstructionendlocationsequence) | (0018,993C) VR=SQ VM=1 Reconstruction End Location Sequence. |
| static readonly [ReconstructionFieldOfView](../../aspose.medical.dicom.tags/tag/reconstructionfieldofview) | (0018,9317) VR=FD VM=2 Reconstruction Field of View. |
| static readonly [ReconstructionIndex](../../aspose.medical.dicom.tags/tag/reconstructionindex) | (0020,9536) VR=US VM=1 Reconstruction Index. |
| static readonly [ReconstructionMethod](../../aspose.medical.dicom.tags/tag/reconstructionmethod) | (0054,1103) VR=LO VM=1 Reconstruction Method. |
| static readonly [ReconstructionPipelineType](../../aspose.medical.dicom.tags/tag/reconstructionpipelinetype) | (0018,11BE) VR=CS VM=1 Reconstruction Pipeline Type. |
| static readonly [ReconstructionPixelSpacing](../../aspose.medical.dicom.tags/tag/reconstructionpixelspacing) | (0018,9322) VR=FD VM=2 Reconstruction Pixel Spacing. |
| static readonly [ReconstructionProtocolElementSequence](../../aspose.medical.dicom.tags/tag/reconstructionprotocolelementsequence) | (0018,9934) VR=SQ VM=1 Reconstruction Protocol Element Sequence. |
| static readonly [ReconstructionProtocolElementSpecificationSequence](../../aspose.medical.dicom.tags/tag/reconstructionprotocolelementspecificationsequence) | (0018,9933) VR=SQ VM=1 Reconstruction Protocol Element Specification Sequence. |
| static readonly [ReconstructionStartLocationSequence](../../aspose.medical.dicom.tags/tag/reconstructionstartlocationsequence) | (0018,993B) VR=SQ VM=1 Reconstruction Start Location Sequence. |
| static readonly [ReconstructionTargetCenterLocationSequence](../../aspose.medical.dicom.tags/tag/reconstructiontargetcenterlocationsequence) | (0018,993E) VR=SQ VM=1 Reconstruction Target Center Location Sequence. |
| static readonly [ReconstructionTargetCenterPatient](../../aspose.medical.dicom.tags/tag/reconstructiontargetcenterpatient) | (0018,9318) VR=FD VM=3 Reconstruction Target Center (Patient). |
| static readonly [ReconstructionType](../../aspose.medical.dicom.tags/tag/reconstructiontype) | (0018,9756) VR=CS VM=1 Reconstruction Type. |
| static readonly [RecordedBlockSequence](../../aspose.medical.dicom.tags/tag/recordedblocksequence) | (3008,00D0) VR=SQ VM=1 Recorded Block Sequence. |
| static readonly [RecordedBlockSlabSequence](../../aspose.medical.dicom.tags/tag/recordedblockslabsequence) | (3008,00D1) VR=SQ VM=1 Recorded Block Slab Sequence. |
| static readonly [RecordedBrachyAccessoryDeviceSequence](../../aspose.medical.dicom.tags/tag/recordedbrachyaccessorydevicesequence) | (3008,0120) VR=SQ VM=1 Recorded Brachy Accessory Device Sequence. |
| static readonly [RecordedChannelSequence](../../aspose.medical.dicom.tags/tag/recordedchannelsequence) | (3008,0130) VR=SQ VM=1 Recorded Channel Sequence. |
| static readonly [RecordedChannelShieldSequence](../../aspose.medical.dicom.tags/tag/recordedchannelshieldsequence) | (3008,0150) VR=SQ VM=1 Recorded Channel Shield Sequence. |
| static readonly [RecordedCompensatorSequence](../../aspose.medical.dicom.tags/tag/recordedcompensatorsequence) | (3008,00C0) VR=SQ VM=1 Recorded Compensator Sequence. |
| static readonly [RecordedLateralSpreadingDeviceSequence](../../aspose.medical.dicom.tags/tag/recordedlateralspreadingdevicesequence) | (3008,00F4) VR=SQ VM=1 Recorded Lateral Spreading Device Sequence. |
| static readonly [RecordedRangeModulatorSequence](../../aspose.medical.dicom.tags/tag/recordedrangemodulatorsequence) | (3008,00F6) VR=SQ VM=1 Recorded Range Modulator Sequence. |
| static readonly [RecordedRangeShifterSequence](../../aspose.medical.dicom.tags/tag/recordedrangeshiftersequence) | (3008,00F2) VR=SQ VM=1 Recorded Range Shifter Sequence. |
| static readonly [RecordedRTControlPointDateTime](../../aspose.medical.dicom.tags/tag/recordedrtcontrolpointdatetime) | (300A,073A) VR=DT VM=1 Recorded RT Control Point DateTime. |
| static readonly [RecordedSnoutSequence](../../aspose.medical.dicom.tags/tag/recordedsnoutsequence) | (3008,00F0) VR=SQ VM=1 Recorded Snout Sequence. |
| static readonly [RecordedSourceApplicatorSequence](../../aspose.medical.dicom.tags/tag/recordedsourceapplicatorsequence) | (3008,0140) VR=SQ VM=1 Recorded Source Applicator Sequence. |
| static readonly [RecordedSourceSequence](../../aspose.medical.dicom.tags/tag/recordedsourcesequence) | (3008,0100) VR=SQ VM=1 Recorded Source Sequence. |
| static readonly [RecordedWedgeSequence](../../aspose.medical.dicom.tags/tag/recordedwedgesequence) | (3008,00B0) VR=SQ VM=1 Recorded Wedge Sequence. |
| static readonly [RecordInUseFlag](../../aspose.medical.dicom.tags/tag/recordinuseflag) | (0004,1410) VR=US VM=1 Record In-use Flag. |
| static readonly [RecordKey](../../aspose.medical.dicom.tags/tag/recordkey) | (0008,041B) VR=OB VM=1 Record Key. |
| static readonly [RectificationType](../../aspose.medical.dicom.tags/tag/rectificationtype) | (0018,1156) VR=CS VM=1 Rectification Type. |
| static readonly [RectifierSmoothingRETIRED](../../aspose.medical.dicom.tags/tag/rectifiersmoothingretired) | (0014,4034) VR=DS VM=1 Rectifier Smoothing (RETIRED). |
| static readonly [RectilinearPhaseEncodeReordering](../../aspose.medical.dicom.tags/tag/rectilinearphaseencodereordering) | (0018,9034) VR=CS VM=1 Rectilinear Phase Encode Reordering. |
| static readonly [RedPaletteColorLookupTableData](../../aspose.medical.dicom.tags/tag/redpalettecolorlookuptabledata) | (0028,1201) VR=OW VM=1 Red Palette Color Lookup Table Data. |
| static readonly [RedPaletteColorLookupTableDescriptor](../../aspose.medical.dicom.tags/tag/redpalettecolorlookuptabledescriptor) | (0028,1101) VR=US or SS VM=3 Red Palette Color Lookup Table Descriptor. |
| static readonly [ReferenceAirKermaRate](../../aspose.medical.dicom.tags/tag/referenceairkermarate) | (300A,022A) VR=DS VM=1 Reference Air Kerma Rate. |
| static readonly [ReferenceBasisCodeSequence](../../aspose.medical.dicom.tags/tag/referencebasiscodesequence) | (0018,9902) VR=SQ VM=1 Reference Basis Code Sequence. |
| static readonly [ReferenceCoordinates](../../aspose.medical.dicom.tags/tag/referencecoordinates) | (0022,0032) VR=FL VM=2-2n Reference Coordinates. |
| static readonly [ReferencedAccessionSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/referencedaccessionsequencetrialretired) | (0040,A313) VR=SQ VM=1 Referenced Accession Sequence (Trial) (RETIRED). |
| static readonly [ReferencedAssertionUID](../../aspose.medical.dicom.tags/tag/referencedassertionuid) | (0044,0108) VR=UI VM=1 Referenced Assertion UID. |
| static readonly [ReferencedBaselineParametersRTRadiationInstanceSequence](../../aspose.medical.dicom.tags/tag/referencedbaselineparametersrtradiationinstancesequence) | (3002,011E) VR=SQ VM=1 Referenced Baseline Parameters RT Radiation Instance Sequence. |
| static readonly [ReferencedBasicAnnotationBoxSequence](../../aspose.medical.dicom.tags/tag/referencedbasicannotationboxsequence) | (2010,0520) VR=SQ VM=1 Referenced Basic Annotation Box Sequence. |
| static readonly [ReferencedBeamNumber](../../aspose.medical.dicom.tags/tag/referencedbeamnumber) | (300C,0006) VR=IS VM=1 Referenced Beam Number. |
| static readonly [ReferencedBeamSequence](../../aspose.medical.dicom.tags/tag/referencedbeamsequence) | (300C,0004) VR=SQ VM=1 Referenced Beam Sequence. |
| static readonly [ReferencedBlockNumber](../../aspose.medical.dicom.tags/tag/referencedblocknumber) | (300C,00E0) VR=IS VM=1 Referenced Block Number. |
| static readonly [ReferencedBolusSequence](../../aspose.medical.dicom.tags/tag/referencedbolussequence) | (300C,00B0) VR=SQ VM=1 Referenced Bolus Sequence. |
| static readonly [ReferencedBrachyAccessoryDeviceNumber](../../aspose.medical.dicom.tags/tag/referencedbrachyaccessorydevicenumber) | (3008,0122) VR=IS VM=1 Referenced Brachy Accessory Device Number. |
| static readonly [ReferencedBrachyApplicationSetupNumber](../../aspose.medical.dicom.tags/tag/referencedbrachyapplicationsetupnumber) | (300C,000C) VR=IS VM=1 Referenced Brachy Application Setup Number. |
| static readonly [ReferencedBrachyApplicationSetupSequence](../../aspose.medical.dicom.tags/tag/referencedbrachyapplicationsetupsequence) | (300C,000A) VR=SQ VM=1 Referenced Brachy Application Setup Sequence. |
| static readonly [ReferencedCalculatedDoseReferenceNumber](../../aspose.medical.dicom.tags/tag/referencedcalculateddosereferencenumber) | (3008,0092) VR=IS VM=1 Referenced Calculated Dose Reference Number. |
| static readonly [ReferencedCalculatedDoseReferenceSequence](../../aspose.medical.dicom.tags/tag/referencedcalculateddosereferencesequence) | (3008,0090) VR=SQ VM=1 Referenced Calculated Dose Reference Sequence. |
| static readonly [ReferencedChannelNumber](../../aspose.medical.dicom.tags/tag/referencedchannelnumber) | (0074,1406) VR=IS VM=1 Referenced Channel Number. |
| static readonly [ReferencedChannelShieldNumber](../../aspose.medical.dicom.tags/tag/referencedchannelshieldnumber) | (3008,0152) VR=IS VM=1 Referenced Channel Shield Number. |
| static readonly [ReferencedColorPaletteInstanceUID](../../aspose.medical.dicom.tags/tag/referencedcolorpaletteinstanceuid) | (0028,0304) VR=UI VM=1 Referenced Color Palette Instance UID. |
| static readonly [ReferencedComparisonSOPInstanceSequence](../../aspose.medical.dicom.tags/tag/referencedcomparisonsopinstancesequence) | (0082,0005) VR=SQ VM=1 Referenced Comparison SOP Instance Sequence. |
| static readonly [ReferencedCompensatorNumber](../../aspose.medical.dicom.tags/tag/referencedcompensatornumber) | (300C,00D0) VR=IS VM=1 Referenced Compensator Number. |
| static readonly [ReferencedConceptualVolumeUID](../../aspose.medical.dicom.tags/tag/referencedconceptualvolumeuid) | (3010,000B) VR=UI VM=1 Referenced Conceptual Volume UID. |
| static readonly [ReferencedContentItem](../../aspose.medical.dicom.tags/tag/referencedcontentitem) | (0070,1904) VR=UI VM=1 Referenced Content Item. |
| static readonly [ReferencedContentItemIdentifier](../../aspose.medical.dicom.tags/tag/referencedcontentitemidentifier) | (0040,DB73) VR=UL VM=1-n Referenced Content Item Identifier. |
| static readonly [ReferencedControlPointIndex](../../aspose.medical.dicom.tags/tag/referencedcontrolpointindex) | (300C,00F0) VR=IS VM=1 Referenced Control Point Index. |
| static readonly [ReferencedControlPointSequence](../../aspose.medical.dicom.tags/tag/referencedcontrolpointsequence) | (300C,00F2) VR=SQ VM=1 Referenced Control Point Sequence. |
| static readonly [ReferencedCurveSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedcurvesequenceretired) | (0008,1145) VR=SQ VM=1 Referenced Curve Sequence (RETIRED). |
| static readonly [ReferencedDateTime](../../aspose.medical.dicom.tags/tag/referenceddatetime) | (0040,A13A) VR=DT VM=1-n Referenced DateTime. |
| static readonly [ReferencedDefinedDeviceIndex](../../aspose.medical.dicom.tags/tag/referenceddefineddeviceindex) | (300A,0602) VR=US VM=1 Referenced Defined Device Index. |
| static readonly [ReferencedDefinedProtocolSequence](../../aspose.medical.dicom.tags/tag/referenceddefinedprotocolsequence) | (0018,990C) VR=SQ VM=1 Referenced Defined Protocol Sequence. |
| static readonly [ReferencedDeviceIndex](../../aspose.medical.dicom.tags/tag/referenceddeviceindex) | (300A,0607) VR=US VM=1 Referenced Device Index. |
| static readonly [ReferencedDigitalSignatureSequence](../../aspose.medical.dicom.tags/tag/referenceddigitalsignaturesequence) | (0400,0402) VR=SQ VM=1 Referenced Digital Signature Sequence. |
| static readonly [ReferencedDirectSegmentInstanceSequence](../../aspose.medical.dicom.tags/tag/referenceddirectsegmentinstancesequence) | (3010,004A) VR=SQ VM=1 Referenced Direct Segment Instance Sequence. |
| static readonly [ReferencedDoseReferenceNumber](../../aspose.medical.dicom.tags/tag/referenceddosereferencenumber) | (300C,0051) VR=IS VM=1 Referenced Dose Reference Number. |
| static readonly [ReferencedDoseReferenceSequence](../../aspose.medical.dicom.tags/tag/referenceddosereferencesequence) | (300C,0050) VR=SQ VM=1 Referenced Dose Reference Sequence. |
| static readonly [ReferencedDoseReferenceUID](../../aspose.medical.dicom.tags/tag/referenceddosereferenceuid) | (300A,0083) VR=UI VM=1 Referenced Dose Reference UID. |
| static readonly [ReferencedDoseSequence](../../aspose.medical.dicom.tags/tag/referenceddosesequence) | (300C,0080) VR=SQ VM=1 Referenced Dose Sequence. |
| static readonly [ReferencedDosimetricObjectivesSequence](../../aspose.medical.dicom.tags/tag/referenceddosimetricobjectivessequence) | (3010,0071) VR=SQ VM=1 Referenced Dosimetric Objectives Sequence. |
| static readonly [ReferencedDosimetricObjectiveUID](../../aspose.medical.dicom.tags/tag/referenceddosimetricobjectiveuid) | (3010,006F) VR=UI VM=1 Referenced Dosimetric Objective UID. |
| static readonly [ReferencedExpectedInVivoMeasurementValueIndex](../../aspose.medical.dicom.tags/tag/referencedexpectedinvivomeasurementvalueindex) | (300A,0773) VR=US VM=1 Referenced Expected In-Vivo Measurement Value Index. |
| static readonly [ReferencedFiducialsUID](../../aspose.medical.dicom.tags/tag/referencedfiducialsuid) | (3010,0031) VR=UI VM=1 Referenced Fiducials UID. |
| static readonly [ReferencedFiducialUID](../../aspose.medical.dicom.tags/tag/referencedfiducialuid) | (0070,031B) VR=UI VM=1 Referenced Fiducial UID. |
| static readonly [ReferencedFileID](../../aspose.medical.dicom.tags/tag/referencedfileid) | (0004,1500) VR=CS VM=1-8 Referenced File ID. |
| static readonly [ReferencedFilmBoxSequence](../../aspose.medical.dicom.tags/tag/referencedfilmboxsequence) | (2000,0500) VR=SQ VM=1 Referenced Film Box Sequence. |
| static readonly [ReferencedFilmSessionSequence](../../aspose.medical.dicom.tags/tag/referencedfilmsessionsequence) | (2010,0500) VR=SQ VM=1 Referenced Film Session Sequence. |
| static readonly [ReferencedFindingsGroupUIDTrialRETIRED](../../aspose.medical.dicom.tags/tag/referencedfindingsgroupuidtrialretired) | (0040,A022) VR=UI VM=1 Referenced Findings Group UID (Trial) (RETIRED). |
| static readonly [ReferencedFirstFrameSequence](../../aspose.medical.dicom.tags/tag/referencedfirstframesequence) | (0072,0427) VR=SQ VM=1 Referenced First Frame Sequence. |
| static readonly [ReferencedFractionGroupNumber](../../aspose.medical.dicom.tags/tag/referencedfractiongroupnumber) | (300C,0022) VR=IS VM=1 Referenced Fraction Group Number. |
| static readonly [ReferencedFractionGroupSequence](../../aspose.medical.dicom.tags/tag/referencedfractiongroupsequence) | (300C,0020) VR=SQ VM=1 Referenced Fraction Group Sequence. |
| static readonly [ReferencedFractionNumber](../../aspose.medical.dicom.tags/tag/referencedfractionnumber) | (3008,0223) VR=IS VM=1 Referenced Fraction Number. |
| static readonly [ReferencedFrameNumber](../../aspose.medical.dicom.tags/tag/referencedframenumber) | (0008,1160) VR=IS VM=1-n Referenced Frame Number. |
| static readonly [ReferencedFrameNumbersRETIRED](../../aspose.medical.dicom.tags/tag/referencedframenumbersretired) | (0040,A136) VR=US VM=1-n Referenced Frame Numbers (RETIRED). |
| static readonly [ReferencedFrameOfReferenceSequence](../../aspose.medical.dicom.tags/tag/referencedframeofreferencesequence) | (3006,0010) VR=SQ VM=1 Referenced Frame of Reference Sequence. |
| static readonly [ReferencedFrameOfReferenceUID](../../aspose.medical.dicom.tags/tag/referencedframeofreferenceuid) | (3006,0024) VR=UI VM=1 Referenced Frame of Reference UID. |
| static readonly [ReferencedGeneralPurposeScheduledProcedureStepSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedgeneralpurposescheduledprocedurestepsequenceretired) | (0040,4016) VR=SQ VM=1 Referenced General Purpose Scheduled Procedure Step Sequence (RETIRED). |
| static readonly [ReferencedGeneralPurposeScheduledProcedureStepTransactionUIDRETIRED](../../aspose.medical.dicom.tags/tag/referencedgeneralpurposescheduledproceduresteptransactionuidretired) | (0040,4023) VR=UI VM=1 Referenced General Purpose Scheduled Procedure Step Transaction UID (RETIRED). |
| static readonly [ReferencedHPGLDocumentID](../../aspose.medical.dicom.tags/tag/referencedhpgldocumentid) | (0068,6440) VR=US VM=1 Referenced HPGL Document ID. |
| static readonly [ReferencedImageBoxSequence](../../aspose.medical.dicom.tags/tag/referencedimageboxsequence) | (2010,0510) VR=SQ VM=1 Referenced Image Box Sequence. |
| static readonly [ReferencedImageBoxSequenceRetiredRETIRED](../../aspose.medical.dicom.tags/tag/referencedimageboxsequenceretiredretired) | (2040,0500) VR=SQ VM=1 Referenced Image Box Sequence (Retired) (RETIRED). |
| static readonly [ReferencedImageEvidenceSequence](../../aspose.medical.dicom.tags/tag/referencedimageevidencesequence) | (0008,9092) VR=SQ VM=1 Referenced Image Evidence Sequence. |
| static readonly [ReferencedImageNavigationSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedimagenavigationsequenceretired) | (0048,0200) VR=SQ VM=1 Referenced Image Navigation Sequence (RETIRED). |
| static readonly [ReferencedImageOverlayBoxSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedimageoverlayboxsequenceretired) | (2020,0130) VR=SQ VM=1 Referenced Image Overlay Box Sequence (RETIRED). |
| static readonly [ReferencedImageRealWorldValueMappingSequence](../../aspose.medical.dicom.tags/tag/referencedimagerealworldvaluemappingsequence) | (0040,9094) VR=SQ VM=1 Referenced Image Real World Value Mapping Sequence. |
| static readonly [ReferencedImageSequence](../../aspose.medical.dicom.tags/tag/referencedimagesequence) | (0008,1140) VR=SQ VM=1 Referenced Image Sequence. |
| static readonly [ReferencedImplantTemplateGroupMemberID](../../aspose.medical.dicom.tags/tag/referencedimplanttemplategroupmemberid) | (0078,00B6) VR=US VM=1 Referenced Implant Template Group Member ID. |
| static readonly [ReferencedInstancesBySOPClassSequence](../../aspose.medical.dicom.tags/tag/referencedinstancesbysopclasssequence) | (0008,1112) VR=SQ VM=1 Referenced Instances by SOP Class Sequence. |
| static readonly [ReferencedInstanceSequence](../../aspose.medical.dicom.tags/tag/referencedinstancesequence) | (0008,114A) VR=SQ VM=1 Referenced Instance Sequence. |
| static readonly [ReferencedInterpretationSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedinterpretationsequenceretired) | (4008,0050) VR=SQ VM=1 Referenced Interpretation Sequence (RETIRED). |
| static readonly [ReferenceDisplaySets](../../aspose.medical.dicom.tags/tag/referencedisplaysets) | (0072,0218) VR=US VM=1-n Reference Display Sets. |
| static readonly [ReferencedLateralSpreadingDeviceNumber](../../aspose.medical.dicom.tags/tag/referencedlateralspreadingdevicenumber) | (300C,0102) VR=IS VM=1 Referenced Lateral Spreading Device Number. |
| static readonly [ReferencedMeasuredDoseReferenceNumber](../../aspose.medical.dicom.tags/tag/referencedmeasureddosereferencenumber) | (3008,0082) VR=IS VM=1 Referenced Measured Dose Reference Number. |
| static readonly [ReferencedMeasuredDoseReferenceSequence](../../aspose.medical.dicom.tags/tag/referencedmeasureddosereferencesequence) | (3008,0080) VR=SQ VM=1 Referenced Measured Dose Reference Sequence. |
| static readonly [ReferencedMontageChannelNumber](../../aspose.medical.dicom.tags/tag/referencedmontagechannelnumber) | (0040,B03A) VR=IS VM=1 Referenced Montage Channel Number. |
| static readonly [ReferencedMontageIndex](../../aspose.medical.dicom.tags/tag/referencedmontageindex) | (0040,B032) VR=US VM=1 Referenced Montage Index. |
| static readonly [ReferencedNonImageCompositeSOPInstanceSequence](../../aspose.medical.dicom.tags/tag/referencednonimagecompositesopinstancesequence) | (0040,0220) VR=SQ VM=1 Referenced Non-Image Composite SOP Instance Sequence. |
| static readonly [ReferencedObjectObservationClassTrialRETIRED](../../aspose.medical.dicom.tags/tag/referencedobjectobservationclasstrialretired) | (0040,A174) VR=CS VM=1 Referenced Object Observation Class (Trial) (RETIRED). |
| static readonly [ReferencedObservationClassTrialRETIRED](../../aspose.medical.dicom.tags/tag/referencedobservationclasstrialretired) | (0040,A173) VR=CS VM=1 Referenced Observation Class (Trial) (RETIRED). |
| static readonly [ReferencedObservationUIDTrialRETIRED](../../aspose.medical.dicom.tags/tag/referencedobservationuidtrialretired) | (0040,A172) VR=UI VM=1 Referenced Observation UID (Trial) (RETIRED). |
| static readonly [ReferencedOphthalmicAxialLengthMeasurementQCImageSequence](../../aspose.medical.dicom.tags/tag/referencedophthalmicaxiallengthmeasurementqcimagesequence) | (0022,1330) VR=SQ VM=1 Referenced Ophthalmic Axial Length Measurement QC Image Sequence. |
| static readonly [ReferencedOphthalmicAxialMeasurementsSequence](../../aspose.medical.dicom.tags/tag/referencedophthalmicaxialmeasurementssequence) | (0022,1100) VR=SQ VM=1 Referenced Ophthalmic Axial Measurements Sequence. |
| static readonly [ReferencedOpticalPathIdentifier](../../aspose.medical.dicom.tags/tag/referencedopticalpathidentifier) | (006A,000E) VR=SH VM=1-n Referenced Optical Path Identifier. |
| static readonly [ReferenceDoseDefinition](../../aspose.medical.dicom.tags/tag/referencedosedefinition) | (300A,0512) VR=CS VM=1 Reference Dose Definition. |
| static readonly [ReferenceDosePointCoordinates](../../aspose.medical.dicom.tags/tag/referencedosepointcoordinates) | (300A,061E) VR=FD VM=3 Reference Dose Point Coordinates. |
| static readonly [ReferenceDoseType](../../aspose.medical.dicom.tags/tag/referencedosetype) | (300A,061A) VR=CS VM=1 Reference Dose Type. |
| static readonly [ReferencedOtherPlaneSequence](../../aspose.medical.dicom.tags/tag/referencedotherplanesequence) | (0008,9410) VR=SQ VM=1 Referenced Other Plane Sequence. |
| static readonly [ReferencedOverlayPlaneGroupsRETIRED](../../aspose.medical.dicom.tags/tag/referencedoverlayplanegroupsretired) | (2040,0011) VR=US VM=1-99 Referenced Overlay Plane Groups (RETIRED). |
| static readonly [ReferencedOverlayPlaneSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedoverlayplanesequenceretired) | (2040,0010) VR=SQ VM=1 Referenced Overlay Plane Sequence (RETIRED). |
| static readonly [ReferencedOverlaySequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedoverlaysequenceretired) | (0008,1130) VR=SQ VM=1 Referenced Overlay Sequence (RETIRED). |
| static readonly [ReferencedParentRTPrescriptionIndex](../../aspose.medical.dicom.tags/tag/referencedparentrtprescriptionindex) | (3010,0042) VR=US VM=1 Referenced Parent RT Prescription Index. |
| static readonly [ReferencedPathIndex](../../aspose.medical.dicom.tags/tag/referencedpathindex) | (0018,9378) VR=US VM=1-n Referenced Path Index. |
| static readonly [ReferencedPatientAliasSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedpatientaliassequenceretired) | (0038,0004) VR=SQ VM=1 Referenced Patient Alias Sequence (RETIRED). |
| static readonly [ReferencedPatientPhotoSequence](../../aspose.medical.dicom.tags/tag/referencedpatientphotosequence) | (0010,1100) VR=SQ VM=1 Referenced Patient Photo Sequence. |
| static readonly [ReferencedPatientSequence](../../aspose.medical.dicom.tags/tag/referencedpatientsequence) | (0008,1120) VR=SQ VM=1 Referenced Patient Sequence. |
| static readonly [ReferencedPatientSetupNumber](../../aspose.medical.dicom.tags/tag/referencedpatientsetupnumber) | (300C,006A) VR=IS VM=1 Referenced Patient Setup Number. |
| static readonly [ReferencedPatientSetupPhotoSequence](../../aspose.medical.dicom.tags/tag/referencedpatientsetupphotosequence) | (300A,078C) VR=SQ VM=1 Referenced Patient Setup Photo Sequence. |
| static readonly [ReferencedPatientSetupProcedureIndex](../../aspose.medical.dicom.tags/tag/referencedpatientsetupprocedureindex) | (300A,0796) VR=US VM=1 Referenced Patient Setup Procedure Index. |
| static readonly [ReferencedPerformedProcedureStepSequence](../../aspose.medical.dicom.tags/tag/referencedperformedprocedurestepsequence) | (0008,1111) VR=SQ VM=1 Referenced Performed Procedure Step Sequence. |
| static readonly [ReferencedPerformedProtocolSequence](../../aspose.medical.dicom.tags/tag/referencedperformedprotocolsequence) | (0018,990D) VR=SQ VM=1 Referenced Performed Protocol Sequence. |
| static readonly [ReferencedPlanOverviewIndex](../../aspose.medical.dicom.tags/tag/referencedplanoverviewindex) | (300C,0118) VR=US VM=1 Referenced Plan Overview Index. |
| static readonly [ReferencedPositionReferenceInstanceSequence](../../aspose.medical.dicom.tags/tag/referencedpositionreferenceinstancesequence) | (3002,0132) VR=SQ VM=1 Referenced Position Reference Instance Sequence. |
| static readonly [ReferencedPresentationLUTSequence](../../aspose.medical.dicom.tags/tag/referencedpresentationlutsequence) | (2050,0500) VR=SQ VM=1 Referenced Presentation LUT Sequence. |
| static readonly [ReferencedPresentationStateSequence](../../aspose.medical.dicom.tags/tag/referencedpresentationstatesequence) | (0008,9237) VR=SQ VM=1 Referenced Presentation State Sequence. |
| static readonly [ReferencedPrintJobSequencePullStoredPrintRETIRED](../../aspose.medical.dicom.tags/tag/referencedprintjobsequencepullstoredprintretired) | (2100,0500) VR=SQ VM=1 Referenced Print Job Sequence (Pull Stored Print) (RETIRED). |
| static readonly [ReferencedPrintJobSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedprintjobsequenceretired) | (2120,0070) VR=SQ VM=1 Referenced Print Job Sequence (RETIRED). |
| static readonly [ReferencedProcedureStepSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedprocedurestepsequenceretired) | (0040,0330) VR=SQ VM=1 Referenced Procedure Step Sequence (RETIRED). |
| static readonly [ReferencedPTOSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedptosequenceretired) | (4010,1076) VR=SQ VM=1 Referenced PTO Sequence (RETIRED). |
| static readonly [ReferencedRadiationDoseIdentificationIndex](../../aspose.medical.dicom.tags/tag/referencedradiationdoseidentificationindex) | (300A,060C) VR=US VM=1 Referenced Radiation Dose Identification Index. |
| static readonly [ReferencedRadiationGenerationModeIndex](../../aspose.medical.dicom.tags/tag/referencedradiationgenerationmodeindex) | (300A,0605) VR=US VM=1 Referenced Radiation Generation Mode Index. |
| static readonly [ReferencedRadiationRTControlPointIndex](../../aspose.medical.dicom.tags/tag/referencedradiationrtcontrolpointindex) | (300A,073B) VR=US VM=1 Referenced Radiation RT Control Point Index. |
| static readonly [ReferencedRangeModulatorNumber](../../aspose.medical.dicom.tags/tag/referencedrangemodulatornumber) | (300C,0104) VR=IS VM=1 Referenced Range Modulator Number. |
| static readonly [ReferencedRangeShifterNumber](../../aspose.medical.dicom.tags/tag/referencedrangeshifternumber) | (300C,0100) VR=IS VM=1 Referenced Range Shifter Number. |
| static readonly [ReferencedRawDataSequence](../../aspose.medical.dicom.tags/tag/referencedrawdatasequence) | (0008,9121) VR=SQ VM=1 Referenced Raw Data Sequence. |
| static readonly [ReferencedRealWorldValueMappingInstanceSequence](../../aspose.medical.dicom.tags/tag/referencedrealworldvaluemappinginstancesequence) | (0008,114B) VR=SQ VM=1 Referenced Real World Value Mapping Instance Sequence. |
| static readonly [ReferencedReferenceImageNumber](../../aspose.medical.dicom.tags/tag/referencedreferenceimagenumber) | (300C,0007) VR=IS VM=1 Referenced Reference Image Number. |
| static readonly [ReferencedReferenceImageSequence](../../aspose.medical.dicom.tags/tag/referencedreferenceimagesequence) | (300C,0042) VR=SQ VM=1 Referenced Reference Image Sequence. |
| static readonly [ReferencedRefractiveMeasurementsSequence](../../aspose.medical.dicom.tags/tag/referencedrefractivemeasurementssequence) | (0046,0145) VR=SQ VM=1 Referenced Refractive Measurements Sequence. |
| static readonly [ReferencedRelatedGeneralSOPClassUIDInFile](../../aspose.medical.dicom.tags/tag/referencedrelatedgeneralsopclassuidinfile) | (0004,151A) VR=UI VM=1-n Referenced Related General SOP Class UID in File. |
| static readonly [ReferencedRequestSequence](../../aspose.medical.dicom.tags/tag/referencedrequestsequence) | (0040,A370) VR=SQ VM=1 Referenced Request Sequence. |
| static readonly [ReferencedResultsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedresultssequenceretired) | (0008,1100) VR=SQ VM=1 Referenced Results Sequence (RETIRED). |
| static readonly [ReferencedROINumber](../../aspose.medical.dicom.tags/tag/referencedroinumber) | (3006,0084) VR=IS VM=1 Referenced ROI Number. |
| static readonly [ReferencedRTAccessoryHolderDeviceIndex](../../aspose.medical.dicom.tags/tag/referencedrtaccessoryholderdeviceindex) | (300A,060E) VR=US VM=1 Referenced RT Accessory Holder Device Index. |
| static readonly [ReferencedRTInstanceSequence](../../aspose.medical.dicom.tags/tag/referencedrtinstancesequence) | (300A,0631) VR=SQ VM=1 Referenced RT Instance Sequence. |
| static readonly [ReferencedRTPatientSetupSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedrtpatientsetupsequenceretired) | (300A,0632) VR=SQ VM=1 Referenced RT Patient Setup Sequence (RETIRED). |
| static readonly [ReferencedRTPhysicianIntentIndex](../../aspose.medical.dicom.tags/tag/referencedrtphysicianintentindex) | (3010,005E) VR=US VM=1 Referenced RT Physician Intent Index. |
| static readonly [ReferencedRTPhysicianIntentSequence](../../aspose.medical.dicom.tags/tag/referencedrtphysicianintentsequence) | (300A,063B) VR=SQ VM=1 Referenced RT Physician Intent Sequence. |
| static readonly [ReferencedRTPlanSequence](../../aspose.medical.dicom.tags/tag/referencedrtplansequence) | (300C,0002) VR=SQ VM=1 Referenced RT Plan Sequence. |
| static readonly [ReferencedRTPrescriptionIndex](../../aspose.medical.dicom.tags/tag/referencedrtprescriptionindex) | (3010,0041) VR=US VM=1 Referenced RT Prescription Index. |
| static readonly [ReferencedRTPrescriptionSequence](../../aspose.medical.dicom.tags/tag/referencedrtprescriptionsequence) | (300A,068A) VR=SQ VM=1 Referenced RT Prescription Sequence. |
| static readonly [ReferencedRTRadiationRecordSequence](../../aspose.medical.dicom.tags/tag/referencedrtradiationrecordsequence) | (300A,0703) VR=SQ VM=1 Referenced RT Radiation Record Sequence. |
| static readonly [ReferencedRTRadiationSequence](../../aspose.medical.dicom.tags/tag/referencedrtradiationsequence) | (300A,0630) VR=SQ VM=1 Referenced RT Radiation Sequence. |
| static readonly [ReferencedRTRadiationSetSequence](../../aspose.medical.dicom.tags/tag/referencedrtradiationsetsequence) | (300A,0702) VR=SQ VM=1 Referenced RT Radiation Set Sequence. |
| static readonly [ReferencedRTTreatmentPhaseIndex](../../aspose.medical.dicom.tags/tag/referencedrttreatmentphaseindex) | (3010,0040) VR=US VM=1 Referenced RT Treatment Phase Index. |
| static readonly [ReferencedRTTreatmentPhaseSequence](../../aspose.medical.dicom.tags/tag/referencedrttreatmentphasesequence) | (3010,0049) VR=SQ VM=1 Referenced RT Treatment Phase Sequence. |
| static readonly [ReferencedRTTreatmentPreparationSequence](../../aspose.medical.dicom.tags/tag/referencedrttreatmentpreparationsequence) | (300A,078B) VR=SQ VM=1 Referenced RT Treatment Preparation Sequence. |
| static readonly [ReferencedSamplePositions](../../aspose.medical.dicom.tags/tag/referencedsamplepositions) | (0040,A132) VR=UL VM=1-n Referenced Sample Positions. |
| static readonly [ReferencedSegmentationSequence](../../aspose.medical.dicom.tags/tag/referencedsegmentationsequence) | (0008,114C) VR=SQ VM=1 Referenced Segmentation Sequence. |
| static readonly [ReferencedSegmentNumber](../../aspose.medical.dicom.tags/tag/referencedsegmentnumber) | (0062,000B) VR=US VM=1-n Referenced Segment Number. |
| static readonly [ReferencedSegmentReferenceIndex](../../aspose.medical.dicom.tags/tag/referencedsegmentreferenceindex) | (3010,0020) VR=US VM=1 Referenced Segment Reference Index. |
| static readonly [ReferencedSeriesSequence](../../aspose.medical.dicom.tags/tag/referencedseriessequence) | (0008,1115) VR=SQ VM=1 Referenced Series Sequence. |
| static readonly [ReferencedSetupImageSequence](../../aspose.medical.dicom.tags/tag/referencedsetupimagesequence) | (300A,0401) VR=SQ VM=1 Referenced Setup Image Sequence. |
| static readonly [ReferencedSOPClassUID](../../aspose.medical.dicom.tags/tag/referencedsopclassuid) | (0008,1150) VR=UI VM=1 Referenced SOP Class UID. |
| static readonly [ReferencedSOPClassUIDInFile](../../aspose.medical.dicom.tags/tag/referencedsopclassuidinfile) | (0004,1510) VR=UI VM=1 Referenced SOP Class UID in File. |
| static readonly [ReferencedSOPInstanceMACSequence](../../aspose.medical.dicom.tags/tag/referencedsopinstancemacsequence) | (0400,0403) VR=SQ VM=1 Referenced SOP Instance MAC Sequence. |
| static readonly [ReferencedSOPInstanceUID](../../aspose.medical.dicom.tags/tag/referencedsopinstanceuid) | (0008,1155) VR=UI VM=1 Referenced SOP Instance UID. |
| static readonly [ReferencedSOPInstanceUIDInFile](../../aspose.medical.dicom.tags/tag/referencedsopinstanceuidinfile) | (0004,1511) VR=UI VM=1 Referenced SOP Instance UID in File. |
| static readonly [ReferencedSOPSequence](../../aspose.medical.dicom.tags/tag/referencedsopsequence) | (0008,1199) VR=SQ VM=1 Referenced SOP Sequence. |
| static readonly [ReferencedSourceApplicatorNumber](../../aspose.medical.dicom.tags/tag/referencedsourceapplicatornumber) | (3008,0142) VR=IS VM=1 Referenced Source Applicator Number. |
| static readonly [ReferencedSourceNumber](../../aspose.medical.dicom.tags/tag/referencedsourcenumber) | (300C,000E) VR=IS VM=1 Referenced Source Number. |
| static readonly [ReferencedSpatialRegistrationSequence](../../aspose.medical.dicom.tags/tag/referencedspatialregistrationsequence) | (0070,0404) VR=SQ VM=1 Referenced Spatial Registration Sequence. |
| static readonly [ReferencedStartControlPointIndex](../../aspose.medical.dicom.tags/tag/referencedstartcontrolpointindex) | (300C,00F4) VR=IS VM=1 Referenced Start Control Point Index. |
| static readonly [ReferencedStereometricInstanceSequence](../../aspose.medical.dicom.tags/tag/referencedstereometricinstancesequence) | (0008,1134) VR=SQ VM=1 Referenced Stereometric Instance Sequence. |
| static readonly [ReferencedStopControlPointIndex](../../aspose.medical.dicom.tags/tag/referencedstopcontrolpointindex) | (300C,00F6) VR=IS VM=1 Referenced Stop Control Point Index. |
| static readonly [ReferencedStorageMediaSequence](../../aspose.medical.dicom.tags/tag/referencedstoragemediasequence) | (2200,000D) VR=SQ VM=1 Referenced Storage Media Sequence. |
| static readonly [ReferencedStoredPrintSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedstoredprintsequenceretired) | (2000,0510) VR=SQ VM=1 Referenced Stored Print Sequence (RETIRED). |
| static readonly [ReferencedStructuredContextSequence](../../aspose.medical.dicom.tags/tag/referencedstructuredcontextsequence) | (0070,1903) VR=SQ VM=1 Referenced Structured Context Sequence. |
| static readonly [ReferencedStructureSetSequence](../../aspose.medical.dicom.tags/tag/referencedstructuresetsequence) | (300C,0060) VR=SQ VM=1 Referenced Structure Set Sequence. |
| static readonly [ReferencedStudySequence](../../aspose.medical.dicom.tags/tag/referencedstudysequence) | (0008,1110) VR=SQ VM=1 Referenced Study Sequence. |
| static readonly [ReferencedSurfaceDataSequence](../../aspose.medical.dicom.tags/tag/referencedsurfacedatasequence) | (0080,0013) VR=SQ VM=1 Referenced Surface Data Sequence. |
| static readonly [ReferencedSurfaceMeshIdentificationSequence](../../aspose.medical.dicom.tags/tag/referencedsurfacemeshidentificationsequence) | (0022,1620) VR=SQ VM=1 Referenced Surface Mesh Identification Sequence. |
| static readonly [ReferencedSurfaceNumber](../../aspose.medical.dicom.tags/tag/referencedsurfacenumber) | (0066,002C) VR=UL VM=1 Referenced Surface Number. |
| static readonly [ReferencedSurfaceSegmentationSequence](../../aspose.medical.dicom.tags/tag/referencedsurfacesegmentationsequence) | (0008,114D) VR=SQ VM=1 Referenced Surface Segmentation Sequence. |
| static readonly [ReferencedSurfaceSequence](../../aspose.medical.dicom.tags/tag/referencedsurfacesequence) | (0066,002B) VR=SQ VM=1 Referenced Surface Sequence. |
| static readonly [ReferencedTargetLuminanceCharacteristicsID](../../aspose.medical.dicom.tags/tag/referencedtargetluminancecharacteristicsid) | (0028,700E) VR=US VM=1 Referenced Target Luminance Characteristics ID. |
| static readonly [ReferencedTDRInstanceSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedtdrinstancesequenceretired) | (4010,1077) VR=SQ VM=1 Referenced TDR Instance Sequence (RETIRED). |
| static readonly [ReferencedTextureSequence](../../aspose.medical.dicom.tags/tag/referencedtexturesequence) | (0080,0012) VR=SQ VM=1 Referenced Texture Sequence. |
| static readonly [ReferencedTimeOffsets](../../aspose.medical.dicom.tags/tag/referencedtimeoffsets) | (0040,A138) VR=DS VM=1-n Referenced Time Offsets. |
| static readonly [ReferencedToleranceTableNumber](../../aspose.medical.dicom.tags/tag/referencedtolerancetablenumber) | (300C,00A0) VR=IS VM=1 Referenced Tolerance Table Number. |
| static readonly [ReferencedTransferSyntaxUIDInFile](../../aspose.medical.dicom.tags/tag/referencedtransfersyntaxuidinfile) | (0004,1512) VR=UI VM=1 Referenced Transfer Syntax UID in File. |
| static readonly [ReferencedTreatmentPositionGroupUID](../../aspose.medical.dicom.tags/tag/referencedtreatmentpositiongroupuid) | (300A,0785) VR=UI VM=1 Referenced Treatment Position Group UID. |
| static readonly [ReferencedTreatmentPositionIndex](../../aspose.medical.dicom.tags/tag/referencedtreatmentpositionindex) | (300A,060B) VR=US VM=1 Referenced Treatment Position Index. |
| static readonly [ReferencedTreatmentRecordSequence](../../aspose.medical.dicom.tags/tag/referencedtreatmentrecordsequence) | (3008,0030) VR=SQ VM=1 Referenced Treatment Record Sequence. |
| static readonly [ReferencedVerificationImageSequence](../../aspose.medical.dicom.tags/tag/referencedverificationimagesequence) | (300C,0040) VR=SQ VM=1 Referenced Verification Image Sequence. |
| static readonly [ReferencedVisitSequence](../../aspose.medical.dicom.tags/tag/referencedvisitsequence) | (0008,1125) VR=SQ VM=1 Referenced Visit Sequence. |
| static readonly [ReferencedVOILUTBoxSequenceRETIRED](../../aspose.medical.dicom.tags/tag/referencedvoilutboxsequenceretired) | (2020,0140) VR=SQ VM=1 Referenced VOI LUT Box Sequence (RETIRED). |
| static readonly [ReferencedWaveformChannels](../../aspose.medical.dicom.tags/tag/referencedwaveformchannels) | (0040,A0B0) VR=US VM=2-2n Referenced Waveform Channels. |
| static readonly [ReferencedWaveformSequence](../../aspose.medical.dicom.tags/tag/referencedwaveformsequence) | (0008,113A) VR=SQ VM=1 Referenced Waveform Sequence. |
| static readonly [ReferencedWedgeNumber](../../aspose.medical.dicom.tags/tag/referencedwedgenumber) | (300C,00C0) VR=IS VM=1 Referenced Wedge Number. |
| static readonly [ReferencedXRayDetectorIndex](../../aspose.medical.dicom.tags/tag/referencedxraydetectorindex) | (0018,9376) VR=US VM=1-n Referenced X-Ray Detector Index. |
| static readonly [ReferencedXRaySourceIndex](../../aspose.medical.dicom.tags/tag/referencedxraysourceindex) | (0018,9377) VR=US VM=1-n Referenced X-Ray Source Index. |
| static readonly [ReferenceGeometryCodeSequence](../../aspose.medical.dicom.tags/tag/referencegeometrycodesequence) | (0018,9903) VR=SQ VM=1 Reference Geometry Code Sequence. |
| static readonly [ReferenceImageNumber](../../aspose.medical.dicom.tags/tag/referenceimagenumber) | (300A,00C8) VR=IS VM=1 Reference Image Number. |
| static readonly [ReferenceLocationDescription](../../aspose.medical.dicom.tags/tag/referencelocationdescription) | (0018,9901) VR=UT VM=1 Reference Location Description. |
| static readonly [ReferenceLocationLabel](../../aspose.medical.dicom.tags/tag/referencelocationlabel) | (0018,9900) VR=LO VM=1 Reference Location Label. |
| static readonly [ReferencePixelPhysicalValueX](../../aspose.medical.dicom.tags/tag/referencepixelphysicalvaluex) | (0018,6028) VR=FD VM=1 Reference Pixel Physical Value X. |
| static readonly [ReferencePixelPhysicalValueY](../../aspose.medical.dicom.tags/tag/referencepixelphysicalvaluey) | (0018,602A) VR=FD VM=1 Reference Pixel Physical Value Y. |
| static readonly [ReferencePixelX0](../../aspose.medical.dicom.tags/tag/referencepixelx0) | (0018,6020) VR=SL VM=1 Reference Pixel X0. |
| static readonly [ReferencePixelY0](../../aspose.medical.dicom.tags/tag/referencepixely0) | (0018,6022) VR=SL VM=1 Reference Pixel Y0. |
| static readonly [ReferenceRETIRED](../../aspose.medical.dicom.tags/tag/referenceretired) | (0020,1020) VR=LO VM=1-n Reference (RETIRED). |
| static readonly [ReferenceToRecordedSoundRETIRED](../../aspose.medical.dicom.tags/tag/referencetorecordedsoundretired) | (4008,0103) VR=LO VM=1 Reference to Recorded Sound (RETIRED). |
| static readonly [ReferringPhysicianAddress](../../aspose.medical.dicom.tags/tag/referringphysicianaddress) | (0008,0092) VR=ST VM=1 Referring Physician's Address. |
| static readonly [ReferringPhysicianIdentificationSequence](../../aspose.medical.dicom.tags/tag/referringphysicianidentificationsequence) | (0008,0096) VR=SQ VM=1 Referring Physician Identification Sequence. |
| static readonly [ReferringPhysicianName](../../aspose.medical.dicom.tags/tag/referringphysicianname) | (0008,0090) VR=PN VM=1 Referring Physician's Name. |
| static readonly [ReferringPhysicianTelephoneNumbers](../../aspose.medical.dicom.tags/tag/referringphysiciantelephonenumbers) | (0008,0094) VR=SH VM=1-n Referring Physician's Telephone Numbers. |
| static readonly [ReflectedAmbientLight](../../aspose.medical.dicom.tags/tag/reflectedambientlight) | (2010,0160) VR=US VM=1 Reflected Ambient Light. |
| static readonly [ReformattingInterval](../../aspose.medical.dicom.tags/tag/reformattinginterval) | (0072,0514) VR=FD VM=1 Reformatting Interval. |
| static readonly [ReformattingOperationInitialViewDirection](../../aspose.medical.dicom.tags/tag/reformattingoperationinitialviewdirection) | (0072,0516) VR=CS VM=1 Reformatting Operation Initial View Direction. |
| static readonly [ReformattingOperationType](../../aspose.medical.dicom.tags/tag/reformattingoperationtype) | (0072,0510) VR=CS VM=1 Reformatting Operation Type. |
| static readonly [ReformattingThickness](../../aspose.medical.dicom.tags/tag/reformattingthickness) | (0072,0512) VR=FD VM=1 Reformatting Thickness. |
| static readonly [RefractiveErrorBeforeRefractiveSurgeryCodeSequence](../../aspose.medical.dicom.tags/tag/refractiveerrorbeforerefractivesurgerycodesequence) | (0022,1103) VR=SQ VM=1 Refractive Error Before Refractive Surgery Code Sequence. |
| static readonly [RefractiveIndexApplied](../../aspose.medical.dicom.tags/tag/refractiveindexapplied) | (0052,003A) VR=CS VM=1 Refractive Index Applied. |
| static readonly [RefractiveIndexOfAqueousHumor](../../aspose.medical.dicom.tags/tag/refractiveindexofaqueoushumor) | (0046,0118) VR=FL VM=1 Refractive Index of Aqueous Humor. |
| static readonly [RefractiveIndexOfCornea](../../aspose.medical.dicom.tags/tag/refractiveindexofcornea) | (0046,0117) VR=FL VM=1 Refractive Index of Cornea. |
| static readonly [RefractiveParametersUsedOnPatientSequence](../../aspose.medical.dicom.tags/tag/refractiveparametersusedonpatientsequence) | (0024,0112) VR=SQ VM=1 Refractive Parameters Used on Patient Sequence. |
| static readonly [RefractivePower](../../aspose.medical.dicom.tags/tag/refractivepower) | (0046,0251) VR=FL VM=1 Refractive Power. |
| static readonly [RefractiveProcedureOccurred](../../aspose.medical.dicom.tags/tag/refractiveprocedureoccurred) | (0022,1039) VR=CS VM=1 Refractive Procedure Occurred. |
| static readonly [RefractiveStateSequence](../../aspose.medical.dicom.tags/tag/refractivestatesequence) | (0022,001B) VR=SQ VM=1 Refractive State Sequence. |
| static readonly [RefractiveSurgeryTypeCodeSequence](../../aspose.medical.dicom.tags/tag/refractivesurgerytypecodesequence) | (0022,1040) VR=SQ VM=1 Refractive Surgery Type Code Sequence. |
| static readonly [RegionDataType](../../aspose.medical.dicom.tags/tag/regiondatatype) | (0018,6014) VR=US VM=1 Region Data Type. |
| static readonly [RegionFlags](../../aspose.medical.dicom.tags/tag/regionflags) | (0018,6016) VR=UL VM=1 Region Flags. |
| static readonly [RegionLocationMaxX1](../../aspose.medical.dicom.tags/tag/regionlocationmaxx1) | (0018,601C) VR=UL VM=1 Region Location Max X1. |
| static readonly [RegionLocationMaxY1](../../aspose.medical.dicom.tags/tag/regionlocationmaxy1) | (0018,601E) VR=UL VM=1 Region Location Max Y1. |
| static readonly [RegionLocationMinX0](../../aspose.medical.dicom.tags/tag/regionlocationminx0) | (0018,6018) VR=UL VM=1 Region Location Min X0. |
| static readonly [RegionLocationMinY0](../../aspose.medical.dicom.tags/tag/regionlocationminy0) | (0018,601A) VR=UL VM=1 Region Location Min Y0. |
| static readonly [RegionOfResidence](../../aspose.medical.dicom.tags/tag/regionofresidence) | (0010,2152) VR=LO VM=1 Region of Residence. |
| static readonly [RegionPixelShiftSequence](../../aspose.medical.dicom.tags/tag/regionpixelshiftsequence) | (0028,9502) VR=SQ VM=1 Region Pixel Shift Sequence. |
| static readonly [RegionSpatialFormat](../../aspose.medical.dicom.tags/tag/regionspatialformat) | (0018,6012) VR=US VM=1 Region Spatial Format. |
| static readonly [RegisteredLocalizerBottomRightHandCorner](../../aspose.medical.dicom.tags/tag/registeredlocalizerbottomrighthandcorner) | (0022,1468) VR=FL VM=2 Registered Localizer Bottom Right Hand Corner. |
| static readonly [RegisteredLocalizerTopLeftHandCorner](../../aspose.medical.dicom.tags/tag/registeredlocalizertoplefthandcorner) | (0022,1467) VR=FL VM=2 Registered Localizer Top Left Hand Corner. |
| static readonly [RegisteredLocalizerUnits](../../aspose.medical.dicom.tags/tag/registeredlocalizerunits) | (0022,1466) VR=CS VM=1 Registered Localizer Units. |
| static readonly [RegistrationMethodCodeSequence](../../aspose.medical.dicom.tags/tag/registrationmethodcodesequence) | (0080,0003) VR=SQ VM=1 Registration Method Code Sequence. |
| static readonly [RegistrationSequence](../../aspose.medical.dicom.tags/tag/registrationsequence) | (0070,0308) VR=SQ VM=1 Registration Sequence. |
| static readonly [RegistrationToLocalizerSequence](../../aspose.medical.dicom.tags/tag/registrationtolocalizersequence) | (0022,1465) VR=SQ VM=1 Registration to Localizer Sequence. |
| static readonly [RegistrationTypeCodeSequence](../../aspose.medical.dicom.tags/tag/registrationtypecodesequence) | (0070,030D) VR=SQ VM=1 Registration Type Code Sequence. |
| static readonly [RelatedAssertionSequence](../../aspose.medical.dicom.tags/tag/relatedassertionsequence) | (0044,0107) VR=SQ VM=1 Related Assertion Sequence. |
| static readonly [RelatedFrameOfReferenceUIDRETIRED](../../aspose.medical.dicom.tags/tag/relatedframeofreferenceuidretired) | (3006,00C2) VR=UI VM=1 Related Frame of Reference UID (RETIRED). |
| static readonly [RelatedGeneralSOPClassUID](../../aspose.medical.dicom.tags/tag/relatedgeneralsopclassuid) | (0008,001A) VR=UI VM=1-n Related General SOP Class UID. |
| static readonly [RelatedProcedureStepSequenceRETIRED](../../aspose.medical.dicom.tags/tag/relatedprocedurestepsequenceretired) | (0074,1220) VR=SQ VM=1 Related Procedure Step Sequence (RETIRED). |
| static readonly [RelatedReferenceRTImageSequence](../../aspose.medical.dicom.tags/tag/relatedreferencertimagesequence) | (0074,1040) VR=SQ VM=1 Related Reference RT Image Sequence. |
| static readonly [RelatedRTROIObservationsSequence](../../aspose.medical.dicom.tags/tag/relatedrtroiobservationssequence) | (3006,00A0) VR=SQ VM=1 Related RT ROI Observations Sequence. |
| static readonly [RelatedRTTreatmentPhaseIndex](../../aspose.medical.dicom.tags/tag/relatedrttreatmentphaseindex) | (3010,003F) VR=US VM=1 Related RT Treatment Phase Index. |
| static readonly [RelatedSegmentCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/relatedsegmentcharacteristicssequence) | (3010,0028) VR=SQ VM=1 Related Segment Characteristics Sequence. |
| static readonly [RelatedSeriesSequence](../../aspose.medical.dicom.tags/tag/relatedseriessequence) | (0008,1250) VR=SQ VM=1 Related Series Sequence. |
| static readonly [RelationshipSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/relationshipsequencetrialretired) | (0040,A731) VR=SQ VM=1 Relationship Sequence (Trial) (RETIRED). |
| static readonly [RelationshipType](../../aspose.medical.dicom.tags/tag/relationshiptype) | (0040,A010) VR=CS VM=1 Relationship Type. |
| static readonly [RelationshipTypeCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/relationshiptypecodesequencetrialretired) | (0040,A732) VR=SQ VM=1 Relationship Type Code Sequence (Trial) (RETIRED). |
| static readonly [RelativeElevation](../../aspose.medical.dicom.tags/tag/relativeelevation) | (0046,0252) VR=FL VM=1 Relative Elevation. |
| static readonly [RelativeImagePositionCodeSequence](../../aspose.medical.dicom.tags/tag/relativeimagepositioncodesequence) | (0022,001D) VR=SQ VM=1 Relative Image Position Code Sequence. |
| static readonly [RelativeOpacity](../../aspose.medical.dicom.tags/tag/relativeopacity) | (0070,0403) VR=FL VM=1 Relative Opacity. |
| static readonly [RelativeTime](../../aspose.medical.dicom.tags/tag/relativetime) | (0072,0038) VR=US VM=2 Relative Time. |
| static readonly [RelativeTimeUnits](../../aspose.medical.dicom.tags/tag/relativetimeunits) | (0072,003A) VR=CS VM=1 Relative Time Units. |
| static readonly [RelativeURIReferenceWithinEncapsulatedDocument](../../aspose.medical.dicom.tags/tag/relativeurireferencewithinencapsulateddocument) | (0068,7005) VR=UR VM=1 Relative URI Reference Within Encapsulated Document. |
| static readonly [RelativeXRayExposure](../../aspose.medical.dicom.tags/tag/relativexrayexposure) | (0018,1405) VR=IS VM=1 Relative X-Ray Exposure. |
| static readonly [RelevantInformationSequenceRETIRED](../../aspose.medical.dicom.tags/tag/relevantinformationsequenceretired) | (0040,4022) VR=SQ VM=1 Relevant Information Sequence (RETIRED). |
| static readonly [RelevantOPTAttributesSequence](../../aspose.medical.dicom.tags/tag/relevantoptattributessequence) | (0022,1472) VR=SQ VM=1 Relevant OPT Attributes Sequence. |
| static readonly [RemovedFromOperationalUse](../../aspose.medical.dicom.tags/tag/removedfromoperationaluse) | (0008,0405) VR=CS VM=1 Removed from Operational Use. |
| static readonly [RenderedImageReferenceSequence](../../aspose.medical.dicom.tags/tag/renderedimagereferencesequence) | (0070,1104) VR=SQ VM=1 Rendered Image Reference Sequence. |
| static readonly [RenderFieldOfView](../../aspose.medical.dicom.tags/tag/renderfieldofview) | (0070,1606) VR=FD VM=6 Render Field of View. |
| static readonly [RenderingMethod](../../aspose.medical.dicom.tags/tag/renderingmethod) | (0070,120D) VR=CS VM=1 Rendering Method. |
| static readonly [RenderProjection](../../aspose.medical.dicom.tags/tag/renderprojection) | (0070,1602) VR=CS VM=1 Render Projection. |
| static readonly [RepairIDRETIRED](../../aspose.medical.dicom.tags/tag/repairidretired) | (0014,0105) VR=ST VM=1 Repair ID (RETIRED). |
| static readonly [RepeatFractionCycleLength](../../aspose.medical.dicom.tags/tag/repeatfractioncyclelength) | (300A,007A) VR=IS VM=1 Repeat Fraction Cycle Length. |
| static readonly [RepeatIntervalRETIRED](../../aspose.medical.dicom.tags/tag/repeatintervalretired) | (0028,0068) VR=US VM=1 Repeat Interval (RETIRED). |
| static readonly [RepetitionTime](../../aspose.medical.dicom.tags/tag/repetitiontime) | (0018,0080) VR=DS VM=1 Repetition Time. |
| static readonly [ReplacedImplantAssemblyTemplateSequence](../../aspose.medical.dicom.tags/tag/replacedimplantassemblytemplatesequence) | (0076,0008) VR=SQ VM=1 Replaced Implant Assembly Template Sequence. |
| static readonly [ReplacedImplantTemplateGroupSequence](../../aspose.medical.dicom.tags/tag/replacedimplanttemplategroupsequence) | (0078,0026) VR=SQ VM=1 Replaced Implant Template Group Sequence. |
| static readonly [ReplacedImplantTemplateSequence](../../aspose.medical.dicom.tags/tag/replacedimplanttemplatesequence) | (0068,6222) VR=SQ VM=1 Replaced Implant Template Sequence. |
| static readonly [ReplacedProcedureStepSequence](../../aspose.medical.dicom.tags/tag/replacedprocedurestepsequence) | (0074,1224) VR=SQ VM=1 Replaced Procedure Step Sequence. |
| static readonly [ReportDetailSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/reportdetailsequencetrialretired) | (0040,A380) VR=SQ VM=1 Report Detail Sequence (Trial) (RETIRED). |
| static readonly [ReportedValuesOrigin](../../aspose.medical.dicom.tags/tag/reportedvaluesorigin) | (3002,000A) VR=CS VM=1 Reported Values Origin. |
| static readonly [ReportingPriority](../../aspose.medical.dicom.tags/tag/reportingpriority) | (0040,1009) VR=SH VM=1 Reporting Priority. |
| static readonly [ReportNumberRETIRED](../../aspose.medical.dicom.tags/tag/reportnumberretired) | (0020,00AA) VR=IS VM=1 Report Number (RETIRED). |
| static readonly [ReportProductionStatusTrialRETIRED](../../aspose.medical.dicom.tags/tag/reportproductionstatustrialretired) | (4008,00FF) VR=CS VM=1 Report Production Status (Trial) (RETIRED). |
| static readonly [ReportStatusCommentTrialRETIRED](../../aspose.medical.dicom.tags/tag/reportstatuscommenttrialretired) | (0040,A33A) VR=ST VM=1 Report Status Comment (Trial) (RETIRED). |
| static readonly [ReportStatusIDTrialRETIRED](../../aspose.medical.dicom.tags/tag/reportstatusidtrialretired) | (0040,A125) VR=CS VM=2 Report Status ID (Trial) (RETIRED). |
| static readonly [RepositoryUniqueID](../../aspose.medical.dicom.tags/tag/repositoryuniqueid) | (0040,E030) VR=UI VM=1 Repository Unique ID. |
| static readonly [RepresentativeFrameNumber](../../aspose.medical.dicom.tags/tag/representativeframenumber) | (0028,6010) VR=US VM=1 Representative Frame Number. |
| static readonly [ReprojectionMethod](../../aspose.medical.dicom.tags/tag/reprojectionmethod) | (0054,1004) VR=CS VM=1 Reprojection Method. |
| static readonly [RequestAttributesSequence](../../aspose.medical.dicom.tags/tag/requestattributessequence) | (0040,0275) VR=SQ VM=1 Request Attributes Sequence. |
| static readonly [RequestedContrastAgent](../../aspose.medical.dicom.tags/tag/requestedcontrastagent) | (0032,1070) VR=LO VM=1 Requested Contrast Agent. |
| static readonly [RequestedDecimateCropBehavior](../../aspose.medical.dicom.tags/tag/requesteddecimatecropbehavior) | (2020,0040) VR=CS VM=1 Requested Decimate/Crop Behavior. |
| static readonly [RequestedImageSize](../../aspose.medical.dicom.tags/tag/requestedimagesize) | (2020,0030) VR=DS VM=1 Requested Image Size. |
| static readonly [RequestedImageSizeFlag](../../aspose.medical.dicom.tags/tag/requestedimagesizeflag) | (2020,00A0) VR=CS VM=1 Requested Image Size Flag. |
| static readonly [RequestedLateralityCodeSequence](../../aspose.medical.dicom.tags/tag/requestedlateralitycodesequence) | (0032,1065) VR=SQ VM=1 Requested Laterality Code Sequence. |
| static readonly [RequestedMediaApplicationProfile](../../aspose.medical.dicom.tags/tag/requestedmediaapplicationprofile) | (2200,000C) VR=LO VM=1 Requested Media Application Profile. |
| static readonly [RequestedProcedureCodeSequence](../../aspose.medical.dicom.tags/tag/requestedprocedurecodesequence) | (0032,1064) VR=SQ VM=1 Requested Procedure Code Sequence. |
| static readonly [RequestedProcedureComments](../../aspose.medical.dicom.tags/tag/requestedprocedurecomments) | (0040,1400) VR=LT VM=1 Requested Procedure Comments. |
| static readonly [RequestedProcedureDescription](../../aspose.medical.dicom.tags/tag/requestedproceduredescription) | (0032,1060) VR=LO VM=1 Requested Procedure Description. |
| static readonly [RequestedProcedureDescriptionTrialRETIRED](../../aspose.medical.dicom.tags/tag/requestedproceduredescriptiontrialretired) | (0040,1060) VR=LO VM=1 Requested Procedure Description (Trial) (RETIRED). |
| static readonly [RequestedProcedureID](../../aspose.medical.dicom.tags/tag/requestedprocedureid) | (0040,1001) VR=SH VM=1 Requested Procedure ID. |
| static readonly [RequestedProcedureLocation](../../aspose.medical.dicom.tags/tag/requestedprocedurelocation) | (0040,1005) VR=LO VM=1 Requested Procedure Location. |
| static readonly [RequestedProcedurePriority](../../aspose.medical.dicom.tags/tag/requestedprocedurepriority) | (0040,1003) VR=SH VM=1 Requested Procedure Priority. |
| static readonly [RequestedResolutionID](../../aspose.medical.dicom.tags/tag/requestedresolutionid) | (2020,0050) VR=CS VM=1 Requested Resolution ID. |
| static readonly [RequestedSeriesDescription](../../aspose.medical.dicom.tags/tag/requestedseriesdescription) | (0018,9937) VR=LO VM=1 Requested Series Description. |
| static readonly [RequestedSeriesDescriptionCodeSequence](../../aspose.medical.dicom.tags/tag/requestedseriesdescriptioncodesequence) | (0018,11C1) VR=SQ VM=1 Requested Series Description Code Sequence. |
| static readonly [RequestedSOPClassUID](../../aspose.medical.dicom.tags/tag/requestedsopclassuid) | (0000,0003) VR=UI VM=1 Requested SOP Class UID. |
| static readonly [RequestedSOPInstanceUID](../../aspose.medical.dicom.tags/tag/requestedsopinstanceuid) | (0000,1001) VR=UI VM=1 Requested SOP Instance UID. |
| static readonly [RequestedStatusInterval](../../aspose.medical.dicom.tags/tag/requestedstatusinterval) | (0008,0414) VR=US VM=1 Requested Status Interval. |
| static readonly [RequestedSubsequentWorkitemCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/requestedsubsequentworkitemcodesequenceretired) | (0040,4031) VR=SQ VM=1 Requested Subsequent Workitem Code Sequence (RETIRED). |
| static readonly [RequestingAE](../../aspose.medical.dicom.tags/tag/requestingae) | (0074,1236) VR=AE VM=1 Requesting AE. |
| static readonly [RequestingPhysician](../../aspose.medical.dicom.tags/tag/requestingphysician) | (0032,1032) VR=PN VM=1 Requesting Physician. |
| static readonly [RequestingPhysicianIdentificationSequence](../../aspose.medical.dicom.tags/tag/requestingphysicianidentificationsequence) | (0032,1031) VR=SQ VM=1 Requesting Physician Identification Sequence. |
| static readonly [RequestingService](../../aspose.medical.dicom.tags/tag/requestingservice) | (0032,1033) VR=LO VM=1 Requesting Service. |
| static readonly [RequestingServiceCodeSequence](../../aspose.medical.dicom.tags/tag/requestingservicecodesequence) | (0032,1034) VR=SQ VM=1 Requesting Service Code Sequence. |
| static readonly [RequestPriority](../../aspose.medical.dicom.tags/tag/requestpriority) | (2200,0020) VR=CS VM=1 Request Priority. |
| static readonly [RescaleIntercept](../../aspose.medical.dicom.tags/tag/rescaleintercept) | (0028,1052) VR=DS VM=1 Rescale Intercept. |
| static readonly [RescaleSlope](../../aspose.medical.dicom.tags/tag/rescaleslope) | (0028,1053) VR=DS VM=1 Rescale Slope. |
| static readonly [RescaleType](../../aspose.medical.dicom.tags/tag/rescaletype) | (0028,1054) VR=LO VM=1 Rescale Type. |
| static readonly [ResidualSyringeCounts](../../aspose.medical.dicom.tags/tag/residualsyringecounts) | (0054,0017) VR=IS VM=1 Residual Syringe Counts. |
| static readonly [ResonantNucleus](../../aspose.medical.dicom.tags/tag/resonantnucleus) | (0018,9100) VR=CS VM=1-2 Resonant Nucleus. |
| static readonly [ResourceDescription](../../aspose.medical.dicom.tags/tag/resourcedescription) | (0038,0102) VR=LO VM=1 Resource Description. |
| static readonly [RespiratoryCyclePosition](../../aspose.medical.dicom.tags/tag/respiratorycycleposition) | (0018,9214) VR=CS VM=1 Respiratory Cycle Position. |
| static readonly [RespiratoryIntervalTime](../../aspose.medical.dicom.tags/tag/respiratoryintervaltime) | (0020,9254) VR=FD VM=1 Respiratory Interval Time. |
| static readonly [RespiratoryMotionCompensationTechnique](../../aspose.medical.dicom.tags/tag/respiratorymotioncompensationtechnique) | (0018,9170) VR=CS VM=1 Respiratory Motion Compensation Technique. |
| static readonly [RespiratoryMotionCompensationTechniqueDescription](../../aspose.medical.dicom.tags/tag/respiratorymotioncompensationtechniquedescription) | (0018,9185) VR=ST VM=1 Respiratory Motion Compensation Technique Description. |
| static readonly [RespiratorySignalSource](../../aspose.medical.dicom.tags/tag/respiratorysignalsource) | (0018,9171) VR=CS VM=1 Respiratory Signal Source. |
| static readonly [RespiratorySignalSourceID](../../aspose.medical.dicom.tags/tag/respiratorysignalsourceid) | (0018,9186) VR=SH VM=1 Respiratory Signal Source ID. |
| static readonly [RespiratorySynchronizationSequence](../../aspose.medical.dicom.tags/tag/respiratorysynchronizationsequence) | (0020,9253) VR=SQ VM=1 Respiratory Synchronization Sequence. |
| static readonly [RespiratoryTriggerDelayThreshold](../../aspose.medical.dicom.tags/tag/respiratorytriggerdelaythreshold) | (0020,9256) VR=FD VM=1 Respiratory Trigger Delay Threshold. |
| static readonly [RespiratoryTriggerType](../../aspose.medical.dicom.tags/tag/respiratorytriggertype) | (0020,9250) VR=CS VM=1 Respiratory Trigger Type. |
| static readonly [ResponseSequenceNumberRETIRED](../../aspose.medical.dicom.tags/tag/responsesequencenumberretired) | (0000,0860) VR=US VM=1 Response Sequence Number (RETIRED). |
| static readonly [ResponsibleGroupCodeSequence](../../aspose.medical.dicom.tags/tag/responsiblegroupcodesequence) | (0008,0220) VR=SQ VM=1 Responsible Group Code Sequence. |
| static readonly [ResponsibleOrganization](../../aspose.medical.dicom.tags/tag/responsibleorganization) | (0010,2299) VR=LO VM=1 Responsible Organization. |
| static readonly [ResponsiblePerson](../../aspose.medical.dicom.tags/tag/responsibleperson) | (0010,2297) VR=PN VM=1 Responsible Person. |
| static readonly [ResponsiblePersonRole](../../aspose.medical.dicom.tags/tag/responsiblepersonrole) | (0010,2298) VR=CS VM=1 Responsible Person Role. |
| static readonly [ResultingGeneralPurposePerformedProcedureStepsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/resultinggeneralpurposeperformedprocedurestepssequenceretired) | (0040,4015) VR=SQ VM=1 Resulting General Purpose Performed Procedure Steps Sequence (RETIRED). |
| static readonly [ResultsCommentsRETIRED](../../aspose.medical.dicom.tags/tag/resultscommentsretired) | (4008,4000) VR=ST VM=1 Results Comments (RETIRED). |
| static readonly [ResultsDistributionListSequenceRETIRED](../../aspose.medical.dicom.tags/tag/resultsdistributionlistsequenceretired) | (4008,0118) VR=SQ VM=1 Results Distribution List Sequence (RETIRED). |
| static readonly [ResultsIDIssuerRETIRED](../../aspose.medical.dicom.tags/tag/resultsidissuerretired) | (4008,0042) VR=LO VM=1 Results ID Issuer (RETIRED). |
| static readonly [ResultsIDRETIRED](../../aspose.medical.dicom.tags/tag/resultsidretired) | (4008,0040) VR=SH VM=1 Results ID (RETIRED). |
| static readonly [ResultsNormalsSequence](../../aspose.medical.dicom.tags/tag/resultsnormalssequence) | (0024,0064) VR=SQ VM=1 Results Normals Sequence. |
| static readonly [RetainInstances](../../aspose.medical.dicom.tags/tag/retaininstances) | (0008,0415) VR=CS VM=1 Retain Instances. |
| static readonly [RetestSensitivityValue](../../aspose.medical.dicom.tags/tag/retestsensitivityvalue) | (0024,0096) VR=FL VM=1 Retest Sensitivity Value. |
| static readonly [RetestStimulusSeen](../../aspose.medical.dicom.tags/tag/reteststimulusseen) | (0024,0095) VR=CS VM=1 Retest Stimulus Seen. |
| static readonly [RetinalThicknessDefinitionCodeSequence](../../aspose.medical.dicom.tags/tag/retinalthicknessdefinitioncodesequence) | (0022,1445) VR=SQ VM=1 Retinal Thickness Definition Code Sequence. |
| static readonly [RetrieveAETitle](../../aspose.medical.dicom.tags/tag/retrieveaetitle) | (0008,0054) VR=AE VM=1-n Retrieve AE Title. |
| static readonly [RetrieveLocationUID](../../aspose.medical.dicom.tags/tag/retrievelocationuid) | (0040,E011) VR=UI VM=1 Retrieve Location UID. |
| static readonly [RetrieveURI](../../aspose.medical.dicom.tags/tag/retrieveuri) | (0040,E010) VR=UR VM=1 Retrieve URI. |
| static readonly [RetrieveURL](../../aspose.medical.dicom.tags/tag/retrieveurl) | (0008,1190) VR=UR VM=1 Retrieve URL. |
| static readonly [ReviewDate](../../aspose.medical.dicom.tags/tag/reviewdate) | (300E,0004) VR=DA VM=1 Review Date. |
| static readonly [ReviewerName](../../aspose.medical.dicom.tags/tag/reviewername) | (300E,0008) VR=PN VM=1 Reviewer Name. |
| static readonly [ReviewTime](../../aspose.medical.dicom.tags/tag/reviewtime) | (300E,0005) VR=TM VM=1 Review Time. |
| static readonly [RevolutionTime](../../aspose.medical.dicom.tags/tag/revolutiontime) | (0018,9305) VR=FD VM=1 Revolution Time. |
| static readonly [RFEchoTrainLength](../../aspose.medical.dicom.tags/tag/rfechotrainlength) | (0018,9240) VR=US VM=1 RF Echo Train Length. |
| static readonly [RGBATransferFunctionDescription](../../aspose.medical.dicom.tags/tag/rgbatransferfunctiondescription) | (0070,1A09) VR=LO VM=1 RGBA Transfer Function Description. |
| static readonly [RGBLUTTransferFunction](../../aspose.medical.dicom.tags/tag/rgbluttransferfunction) | (0028,140F) VR=CS VM=1 RGB LUT Transfer Function. |
| static readonly [RightImageSequence](../../aspose.medical.dicom.tags/tag/rightimagesequence) | (0022,0022) VR=SQ VM=1 Right Image Sequence. |
| static readonly [RightLensSequence](../../aspose.medical.dicom.tags/tag/rightlenssequence) | (0046,0014) VR=SQ VM=1 Right Lens Sequence. |
| static readonly [RoboticBaseLocationIndicatorRETIRED](../../aspose.medical.dicom.tags/tag/roboticbaselocationindicatorretired) | (3010,0090) VR=CS VM=1 Robotic Base Location Indicator (RETIRED). |
| static readonly [RoboticNodeIdentifier](../../aspose.medical.dicom.tags/tag/roboticnodeidentifier) | (3010,0092) VR=UL VM=1 Robotic Node Identifier. |
| static readonly [RoboticPathControlPointSequence](../../aspose.medical.dicom.tags/tag/roboticpathcontrolpointsequence) | (3010,0097) VR=SQ VM=1 Robotic Path Control Point Sequence. |
| static readonly [RoboticPathNodeSetCodeSequence](../../aspose.medical.dicom.tags/tag/roboticpathnodesetcodesequence) | (3010,0091) VR=SQ VM=1 Robotic Path Node Set Code Sequence. |
| static readonly [ROIArea](../../aspose.medical.dicom.tags/tag/roiarea) | (60xx,1301) VR=IS VM=1 ROI Area. |
| static readonly [ROIContourSequence](../../aspose.medical.dicom.tags/tag/roicontoursequence) | (3006,0039) VR=SQ VM=1 ROI Contour Sequence. |
| static readonly [ROICreatorSequence](../../aspose.medical.dicom.tags/tag/roicreatorsequence) | (3006,004D) VR=SQ VM=1 ROI Creator Sequence. |
| static readonly [ROIDateTime](../../aspose.medical.dicom.tags/tag/roidatetime) | (3006,002D) VR=DT VM=1 ROI DateTime. |
| static readonly [ROIDerivationAlgorithmIdentificationSequence](../../aspose.medical.dicom.tags/tag/roiderivationalgorithmidentificationsequence) | (3006,0037) VR=SQ VM=1 ROI Derivation Algorithm Identification Sequence. |
| static readonly [ROIDescription](../../aspose.medical.dicom.tags/tag/roidescription) | (3006,0028) VR=ST VM=1 ROI Description. |
| static readonly [ROIDisplayColor](../../aspose.medical.dicom.tags/tag/roidisplaycolor) | (3006,002A) VR=IS VM=3 ROI Display Color. |
| static readonly [ROIElementalCompositionAtomicMassFraction](../../aspose.medical.dicom.tags/tag/roielementalcompositionatomicmassfraction) | (3006,00B8) VR=FL VM=1 ROI Elemental Composition Atomic Mass Fraction. |
| static readonly [ROIElementalCompositionAtomicNumber](../../aspose.medical.dicom.tags/tag/roielementalcompositionatomicnumber) | (3006,00B7) VR=US VM=1 ROI Elemental Composition Atomic Number. |
| static readonly [ROIElementalCompositionSequence](../../aspose.medical.dicom.tags/tag/roielementalcompositionsequence) | (3006,00B6) VR=SQ VM=1 ROI Elemental Composition Sequence. |
| static readonly [ROIGenerationAlgorithm](../../aspose.medical.dicom.tags/tag/roigenerationalgorithm) | (3006,0036) VR=CS VM=1 ROI Generation Algorithm. |
| static readonly [ROIGenerationDescription](../../aspose.medical.dicom.tags/tag/roigenerationdescription) | (3006,0038) VR=LO VM=1 ROI Generation Description. |
| static readonly [ROIInterpreter](../../aspose.medical.dicom.tags/tag/roiinterpreter) | (3006,00A6) VR=PN VM=1 ROI Interpreter. |
| static readonly [ROIInterpreterSequence](../../aspose.medical.dicom.tags/tag/roiinterpretersequence) | (3006,004E) VR=SQ VM=1 ROI Interpreter Sequence. |
| static readonly [ROIMean](../../aspose.medical.dicom.tags/tag/roimean) | (60xx,1302) VR=DS VM=1 ROI Mean. |
| static readonly [ROIName](../../aspose.medical.dicom.tags/tag/roiname) | (3006,0026) VR=LO VM=1 ROI Name. |
| static readonly [ROINumber](../../aspose.medical.dicom.tags/tag/roinumber) | (3006,0022) VR=IS VM=1 ROI Number. |
| static readonly [ROIObservationContextCodeSequence](../../aspose.medical.dicom.tags/tag/roiobservationcontextcodesequence) | (3006,004F) VR=SQ VM=1 ROI Observation Context Code Sequence. |
| static readonly [ROIObservationDateTime](../../aspose.medical.dicom.tags/tag/roiobservationdatetime) | (3006,002E) VR=DT VM=1 ROI Observation DateTime. |
| static readonly [ROIObservationDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/roiobservationdescriptionretired) | (3006,0088) VR=ST VM=1 ROI Observation Description (RETIRED). |
| static readonly [ROIObservationLabelRETIRED](../../aspose.medical.dicom.tags/tag/roiobservationlabelretired) | (3006,0085) VR=SH VM=1 ROI Observation Label (RETIRED). |
| static readonly [ROIPhysicalPropertiesSequence](../../aspose.medical.dicom.tags/tag/roiphysicalpropertiessequence) | (3006,00B0) VR=SQ VM=1 ROI Physical Properties Sequence. |
| static readonly [ROIPhysicalProperty](../../aspose.medical.dicom.tags/tag/roiphysicalproperty) | (3006,00B2) VR=CS VM=1 ROI Physical Property. |
| static readonly [ROIPhysicalPropertyValue](../../aspose.medical.dicom.tags/tag/roiphysicalpropertyvalue) | (3006,00B4) VR=DS VM=1 ROI Physical Property Value. |
| static readonly [ROIStandardDeviation](../../aspose.medical.dicom.tags/tag/roistandarddeviation) | (60xx,1303) VR=DS VM=1 ROI Standard Deviation. |
| static readonly [ROIVolume](../../aspose.medical.dicom.tags/tag/roivolume) | (3006,002C) VR=DS VM=1 ROI Volume. |
| static readonly [RotationAngle](../../aspose.medical.dicom.tags/tag/rotationangle) | (0070,0230) VR=FD VM=1 Rotation Angle. |
| static readonly [RotationDirection](../../aspose.medical.dicom.tags/tag/rotationdirection) | (0018,1140) VR=CS VM=1 Rotation Direction. |
| static readonly [RotationInformationSequence](../../aspose.medical.dicom.tags/tag/rotationinformationsequence) | (0054,0052) VR=SQ VM=1 Rotation Information Sequence. |
| static readonly [RotationOffsetRETIRED](../../aspose.medical.dicom.tags/tag/rotationoffsetretired) | (0018,1146) VR=DS VM=1-n Rotation Offset (RETIRED). |
| static readonly [RotationOfScannedFilm](../../aspose.medical.dicom.tags/tag/rotationofscannedfilm) | (0018,2030) VR=DS VM=1 Rotation of Scanned Film. |
| static readonly [RotationPoint](../../aspose.medical.dicom.tags/tag/rotationpoint) | (0070,0273) VR=FL VM=2 Rotation Point. |
| static readonly [RotationVector](../../aspose.medical.dicom.tags/tag/rotationvector) | (0054,0050) VR=US VM=1-n Rotation Vector. |
| static readonly [RouteIDAssigningAuthorityRETIRED](../../aspose.medical.dicom.tags/tag/routeidassigningauthorityretired) | (4010,1055) VR=SH VM=1 Route ID Assigning Authority (RETIRED). |
| static readonly [RouteIDRETIRED](../../aspose.medical.dicom.tags/tag/routeidretired) | (4010,1054) VR=SH VM=1 Route ID (RETIRED). |
| static readonly [RouteOfAdmissions](../../aspose.medical.dicom.tags/tag/routeofadmissions) | (0038,0016) VR=LO VM=1 Route of Admissions. |
| static readonly [RouteSegmentEndLocationIDRETIRED](../../aspose.medical.dicom.tags/tag/routesegmentendlocationidretired) | (4010,101F) VR=SH VM=1 Route Segment End Location ID (RETIRED). |
| static readonly [RouteSegmentEndTimeRETIRED](../../aspose.medical.dicom.tags/tag/routesegmentendtimeretired) | (4010,1026) VR=DT VM=1 Route Segment End Time (RETIRED). |
| static readonly [RouteSegmentIDRETIRED](../../aspose.medical.dicom.tags/tag/routesegmentidretired) | (4010,1007) VR=SH VM=1 Route Segment ID (RETIRED). |
| static readonly [RouteSegmentLocationIDTypeRETIRED](../../aspose.medical.dicom.tags/tag/routesegmentlocationidtyperetired) | (4010,1020) VR=CS VM=1 Route Segment Location ID Type (RETIRED). |
| static readonly [RouteSegmentSequenceRETIRED](../../aspose.medical.dicom.tags/tag/routesegmentsequenceretired) | (4010,100A) VR=SQ VM=1 Route Segment Sequence (RETIRED). |
| static readonly [RouteSegmentStartLocationIDRETIRED](../../aspose.medical.dicom.tags/tag/routesegmentstartlocationidretired) | (4010,101E) VR=SH VM=1 Route Segment Start Location ID (RETIRED). |
| static readonly [RouteSegmentStartTimeRETIRED](../../aspose.medical.dicom.tags/tag/routesegmentstarttimeretired) | (4010,1025) VR=DT VM=1 Route Segment Start Time (RETIRED). |
| static readonly [RowOverlapRETIRED](../../aspose.medical.dicom.tags/tag/rowoverlapretired) | (0028,0093) VR=US VM=1 Row Overlap (RETIRED). |
| static readonly [RowPositionInTotalImagePixelMatrix](../../aspose.medical.dicom.tags/tag/rowpositionintotalimagepixelmatrix) | (0048,021F) VR=SL VM=1 Row Position In Total Image Pixel Matrix. |
| static readonly [Rows](../../aspose.medical.dicom.tags/tag/rows) | (0028,0010) VR=US VM=1 Rows. |
| static readonly [RowsForNthOrderCoefficientsRETIRED](../../aspose.medical.dicom.tags/tag/rowsfornthordercoefficientsretired) | (0028,04x0) VR=US VM=1 Rows For Nth Order Coefficients (RETIRED). |
| static readonly [RRIntervalTimeNominal](../../aspose.medical.dicom.tags/tag/rrintervaltimenominal) | (0020,9251) VR=FD VM=1 R-R Interval Time Nominal. |
| static readonly [RRIntervalVector](../../aspose.medical.dicom.tags/tag/rrintervalvector) | (0054,0060) VR=US VM=1-n R-R Interval Vector. |
| static readonly [RTAccessoryDeviceSlotID](../../aspose.medical.dicom.tags/tag/rtaccessorydeviceslotid) | (300A,0615) VR=LO VM=1 RT Accessory Device Slot ID. |
| static readonly [RTAccessoryHolderDefinitionSequence](../../aspose.medical.dicom.tags/tag/rtaccessoryholderdefinitionsequence) | (300A,0614) VR=SQ VM=1 RT Accessory Holder Definition Sequence. |
| static readonly [RTAccessoryHolderSlotDistance](../../aspose.medical.dicom.tags/tag/rtaccessoryholderslotdistance) | (300A,0612) VR=FD VM=1 RT Accessory Holder Slot Distance. |
| static readonly [RTAccessoryHolderSlotExistenceFlag](../../aspose.medical.dicom.tags/tag/rtaccessoryholderslotexistenceflag) | (300A,060F) VR=CS VM=1 RT Accessory Holder Slot Existence Flag. |
| static readonly [RTAccessoryHolderSlotID](../../aspose.medical.dicom.tags/tag/rtaccessoryholderslotid) | (300A,0611) VR=LO VM=1 RT Accessory Holder Slot ID. |
| static readonly [RTAccessoryHolderSlotSequence](../../aspose.medical.dicom.tags/tag/rtaccessoryholderslotsequence) | (300A,0610) VR=SQ VM=1 RT Accessory Holder Slot Sequence. |
| static readonly [RTAccessoryHolderWaterEquivalentThickness](../../aspose.medical.dicom.tags/tag/rtaccessoryholderwaterequivalentthickness) | (300A,060D) VR=FD VM=1 RT Accessory Holder Water-Equivalent Thickness. |
| static readonly [RTAccessorySlotDistance](../../aspose.medical.dicom.tags/tag/rtaccessoryslotdistance) | (300A,0613) VR=FD VM=1 RT Accessory Slot Distance. |
| static readonly [RTAcquisitionPatientPositionSequence](../../aspose.medical.dicom.tags/tag/rtacquisitionpatientpositionsequence) | (3002,0108) VR=SQ VM=1 RT Acquisition Patient Position Sequence. |
| static readonly [RTAnatomicPrescriptionSequence](../../aspose.medical.dicom.tags/tag/rtanatomicprescriptionsequence) | (3010,0060) VR=SQ VM=1 RT Anatomic Prescription Sequence. |
| static readonly [RTBeamDelimiterGeometrySequence](../../aspose.medical.dicom.tags/tag/rtbeamdelimitergeometrysequence) | (300A,064C) VR=SQ VM=1 RT Beam Delimiter Geometry Sequence. |
| static readonly [RTBeamLimitingDeviceAngle](../../aspose.medical.dicom.tags/tag/rtbeamlimitingdeviceangle) | (300A,0679) VR=FD VM=1 RT Beam Limiting Device Angle. |
| static readonly [RTBeamLimitingDeviceDefinitionSequence](../../aspose.medical.dicom.tags/tag/rtbeamlimitingdevicedefinitionsequence) | (300A,064D) VR=SQ VM=1 RT Beam Limiting Device Definition Sequence. |
| static readonly [RTBeamLimitingDeviceDistalDistance](../../aspose.medical.dicom.tags/tag/rtbeamlimitingdevicedistaldistance) | (300A,0643) VR=FD VM=1 RT Beam Limiting Device Distal Distance. |
| static readonly [RTBeamLimitingDeviceOffset](../../aspose.medical.dicom.tags/tag/rtbeamlimitingdeviceoffset) | (300A,064B) VR=FD VM=2 RT Beam Limiting Device Offset. |
| static readonly [RTBeamLimitingDeviceOpeningSequence](../../aspose.medical.dicom.tags/tag/rtbeamlimitingdeviceopeningsequence) | (300A,0656) VR=SQ VM=1 RT Beam Limiting Device Opening Sequence. |
| static readonly [RTBeamLimitingDeviceProximalDistance](../../aspose.medical.dicom.tags/tag/rtbeamlimitingdeviceproximaldistance) | (300A,0642) VR=FD VM=1 RT Beam Limiting Device Proximal Distance. |
| static readonly [RTBeamLimitingDeviceType](../../aspose.medical.dicom.tags/tag/rtbeamlimitingdevicetype) | (300A,00B8) VR=CS VM=1 RT Beam Limiting Device Type. |
| static readonly [RTBeamModifierDefinitionDistance](../../aspose.medical.dicom.tags/tag/rtbeammodifierdefinitiondistance) | (300A,0688) VR=FD VM=1 RT Beam Modifier Definition Distance. |
| static readonly [RTConeBeamImagingGeometrySequence](../../aspose.medical.dicom.tags/tag/rtconebeamimaginggeometrysequence) | (3002,0136) VR=SQ VM=1 RT Cone-Beam Imaging Geometry Sequence. |
| static readonly [RTControlPointIndex](../../aspose.medical.dicom.tags/tag/rtcontrolpointindex) | (300A,0600) VR=US VM=1 RT Control Point Index. |
| static readonly [RTDeliveryStartPatientPositionSequence](../../aspose.medical.dicom.tags/tag/rtdeliverystartpatientpositionsequence) | (300A,0789) VR=SQ VM=1 RT Delivery Start Patient Position Sequence. |
| static readonly [RTDeviceDistanceReferenceLocationCodeSequence](../../aspose.medical.dicom.tags/tag/rtdevicedistancereferencelocationcodesequence) | (300A,0659) VR=SQ VM=1 RT Device Distance Reference Location Code Sequence. |
| static readonly [RTDiagnosisCodeSequence](../../aspose.medical.dicom.tags/tag/rtdiagnosiscodesequence) | (3010,005D) VR=SQ VM=1 RT Diagnosis Code Sequence. |
| static readonly [RTDoseROISequenceRETIRED](../../aspose.medical.dicom.tags/tag/rtdoseroisequenceretired) | (3004,0010) VR=SQ VM=1 RT Dose ROI Sequence (RETIRED). |
| static readonly [RTImageDescription](../../aspose.medical.dicom.tags/tag/rtimagedescription) | (3002,0004) VR=ST VM=1 RT Image Description. |
| static readonly [RTImageFrameContextSequence](../../aspose.medical.dicom.tags/tag/rtimageframecontextsequence) | (3002,0103) VR=SQ VM=1 RT Image Frame Context Sequence. |
| static readonly [RTImageFrameGeneralContentSequence](../../aspose.medical.dicom.tags/tag/rtimageframegeneralcontentsequence) | (3002,0102) VR=SQ VM=1 RT Image Frame General Content Sequence. |
| static readonly [RTImageFrameImagingDevicePositionSequence](../../aspose.medical.dicom.tags/tag/rtimageframeimagingdevicepositionsequence) | (3002,0109) VR=SQ VM=1 RT Image Frame Imaging Device Position Sequence. |
| static readonly [RTImageFramekVRadiationAcquisitionSequence](../../aspose.medical.dicom.tags/tag/rtimageframekvradiationacquisitionsequence) | (3002,010A) VR=SQ VM=1 RT Image Frame kV Radiation Acquisition Sequence. |
| static readonly [RTImageFrameMVRadiationAcquisitionSequence](../../aspose.medical.dicom.tags/tag/rtimageframemvradiationacquisitionsequence) | (3002,010B) VR=SQ VM=1 RT Image Frame MV Radiation Acquisition Sequence. |
| static readonly [RTImageFrameRadiationAcquisitionSequence](../../aspose.medical.dicom.tags/tag/rtimageframeradiationacquisitionsequence) | (3002,010C) VR=SQ VM=1 RT Image Frame Radiation Acquisition Sequence. |
| static readonly [RTImageLabel](../../aspose.medical.dicom.tags/tag/rtimagelabel) | (3002,0002) VR=SH VM=1 RT Image Label. |
| static readonly [RTImageName](../../aspose.medical.dicom.tags/tag/rtimagename) | (3002,0003) VR=LO VM=1 RT Image Name. |
| static readonly [RTImageOrientation](../../aspose.medical.dicom.tags/tag/rtimageorientation) | (3002,0010) VR=DS VM=6 RT Image Orientation. |
| static readonly [RTImagePlane](../../aspose.medical.dicom.tags/tag/rtimageplane) | (3002,000C) VR=CS VM=1 RT Image Plane. |
| static readonly [RTImagePosition](../../aspose.medical.dicom.tags/tag/rtimageposition) | (3002,0012) VR=DS VM=2 RT Image Position. |
| static readonly [RTImageScopeSequence](../../aspose.medical.dicom.tags/tag/rtimagescopesequence) | (3002,0104) VR=SQ VM=1 RT Image Scope Sequence. |
| static readonly [RTImageSID](../../aspose.medical.dicom.tags/tag/rtimagesid) | (3002,0026) VR=DS VM=1 RT Image SID. |
| static readonly [RTPatientPositionDisplacementSequence](../../aspose.medical.dicom.tags/tag/rtpatientpositiondisplacementsequence) | (300A,0798) VR=SQ VM=1 RT Patient Position Displacement Sequence. |
| static readonly [RTPatientPositionScopeSequence](../../aspose.medical.dicom.tags/tag/rtpatientpositionscopesequence) | (300A,0784) VR=SQ VM=1 RT Patient Position Scope Sequence. |
| static readonly [RTPatientPositionSequence](../../aspose.medical.dicom.tags/tag/rtpatientpositionsequence) | (300A,0799) VR=SQ VM=1 RT Patient Position Sequence. |
| static readonly [RTPhysicianIntentIndex](../../aspose.medical.dicom.tags/tag/rtphysicianintentindex) | (3010,0058) VR=US VM=1 RT Physician Intent Index. |
| static readonly [RTPhysicianIntentInputInstanceSequence](../../aspose.medical.dicom.tags/tag/rtphysicianintentinputinstancesequence) | (3010,005F) VR=SQ VM=1 RT Physician Intent Input Instance Sequence. |
| static readonly [RTPhysicianIntentNarrative](../../aspose.medical.dicom.tags/tag/rtphysicianintentnarrative) | (3010,005A) VR=UT VM=1 RT Physician Intent Narrative. |
| static readonly [RTPhysicianIntentPredecessorSequence](../../aspose.medical.dicom.tags/tag/rtphysicianintentpredecessorsequence) | (3010,0055) VR=SQ VM=1 RT Physician Intent Predecessor Sequence. |
| static readonly [RTPhysicianIntentSequence](../../aspose.medical.dicom.tags/tag/rtphysicianintentsequence) | (3010,0057) VR=SQ VM=1 RT Physician Intent Sequence. |
| static readonly [RTPlanDate](../../aspose.medical.dicom.tags/tag/rtplandate) | (300A,0006) VR=DA VM=1 RT Plan Date. |
| static readonly [RTPlanDescription](../../aspose.medical.dicom.tags/tag/rtplandescription) | (300A,0004) VR=ST VM=1 RT Plan Description. |
| static readonly [RTPlanGeometry](../../aspose.medical.dicom.tags/tag/rtplangeometry) | (300A,000C) VR=CS VM=1 RT Plan Geometry. |
| static readonly [RTPlanLabel](../../aspose.medical.dicom.tags/tag/rtplanlabel) | (300A,0002) VR=SH VM=1 RT Plan Label. |
| static readonly [RTPlanName](../../aspose.medical.dicom.tags/tag/rtplanname) | (300A,0003) VR=LO VM=1 RT Plan Name. |
| static readonly [RTPlanRelationship](../../aspose.medical.dicom.tags/tag/rtplanrelationship) | (300A,0055) VR=CS VM=1 RT Plan Relationship. |
| static readonly [RTPlanTime](../../aspose.medical.dicom.tags/tag/rtplantime) | (300A,0007) VR=TM VM=1 RT Plan Time. |
| static readonly [RTPrescriptionIndex](../../aspose.medical.dicom.tags/tag/rtprescriptionindex) | (3010,003C) VR=US VM=1 RT Prescription Index. |
| static readonly [RTPrescriptionLabel](../../aspose.medical.dicom.tags/tag/rtprescriptionlabel) | (3010,0054) VR=LO VM=1 RT Prescription Label. |
| static readonly [RTPrescriptionSequence](../../aspose.medical.dicom.tags/tag/rtprescriptionsequence) | (3010,006B) VR=SQ VM=1 RT Prescription Sequence. |
| static readonly [RTProtocolCodeSequence](../../aspose.medical.dicom.tags/tag/rtprotocolcodesequence) | (3010,005B) VR=SQ VM=1 RT Protocol Code Sequence. |
| static readonly [RTRadiationPhysicalAndGeometricContentDetailFlag](../../aspose.medical.dicom.tags/tag/rtradiationphysicalandgeometriccontentdetailflag) | (300A,0638) VR=CS VM=1 RT Radiation Physical and Geometric Content Detail Flag. |
| static readonly [RTRadiationSalvageRecordControlPointSequence](../../aspose.medical.dicom.tags/tag/rtradiationsalvagerecordcontrolpointsequence) | (300A,0722) VR=SQ VM=1 RT Radiation Salvage Record Control Point Sequence. |
| static readonly [RTRadiationSequence](../../aspose.medical.dicom.tags/tag/rtradiationsequence) | (300A,0616) VR=SQ VM=1 RT Radiation Sequence. |
| static readonly [RTRadiationSetDeliveryNumber](../../aspose.medical.dicom.tags/tag/rtradiationsetdeliverynumber) | (300A,0704) VR=US VM=1 RT Radiation Set Delivery Number. |
| static readonly [RTRadiationSetDeliveryUsage](../../aspose.medical.dicom.tags/tag/rtradiationsetdeliveryusage) | (300A,079E) VR=CS VM=1 RT Radiation Set Delivery Usage. |
| static readonly [RTRadiationSetIntent](../../aspose.medical.dicom.tags/tag/rtradiationsetintent) | (300A,0637) VR=CS VM=1 RT Radiation Set Intent. |
| static readonly [RTRadiationSetUsage](../../aspose.medical.dicom.tags/tag/rtradiationsetusage) | (300A,0707) VR=CS VM=1 RT Radiation Set Usage. |
| static readonly [RTRadiationTaskSequence](../../aspose.medical.dicom.tags/tag/rtradiationtasksequence) | (300A,0797) VR=SQ VM=1 RT Radiation Task Sequence. |
| static readonly [RTRadiationUsage](../../aspose.medical.dicom.tags/tag/rtradiationusage) | (300A,0701) VR=CS VM=1 RT Radiation Usage. |
| static readonly [RTRecordFlag](../../aspose.medical.dicom.tags/tag/rtrecordflag) | (300A,0639) VR=CS VM=1 RT Record Flag. |
| static readonly [RTReferencedSeriesSequence](../../aspose.medical.dicom.tags/tag/rtreferencedseriessequence) | (3006,0014) VR=SQ VM=1 RT Referenced Series Sequence. |
| static readonly [RTReferencedStudySequence](../../aspose.medical.dicom.tags/tag/rtreferencedstudysequence) | (3006,0012) VR=SQ VM=1 RT Referenced Study Sequence. |
| static readonly [RTRelatedROISequence](../../aspose.medical.dicom.tags/tag/rtrelatedroisequence) | (3006,0030) VR=SQ VM=1 RT Related ROI Sequence. |
| static readonly [RTROIIdentificationCodeSequence](../../aspose.medical.dicom.tags/tag/rtroiidentificationcodesequence) | (3006,0086) VR=SQ VM=1 RT ROI Identification Code Sequence. |
| static readonly [RTROIInterpretedType](../../aspose.medical.dicom.tags/tag/rtroiinterpretedtype) | (3006,00A4) VR=CS VM=1 RT ROI Interpreted Type. |
| static readonly [RTROIObservationsSequence](../../aspose.medical.dicom.tags/tag/rtroiobservationssequence) | (3006,0080) VR=SQ VM=1 RT ROI Observations Sequence. |
| static readonly [RTROIRelationship](../../aspose.medical.dicom.tags/tag/rtroirelationship) | (3006,0033) VR=CS VM=1 RT ROI Relationship. |
| static readonly [RTSegmentAnnotationIndex](../../aspose.medical.dicom.tags/tag/rtsegmentannotationindex) | (3010,003D) VR=US VM=1 RT Segment Annotation Index. |
| static readonly [RTSegmentAnnotationSequence](../../aspose.medical.dicom.tags/tag/rtsegmentannotationsequence) | (3010,002A) VR=SQ VM=1 RT Segment Annotation Sequence. |
| static readonly [RTToleranceSetLabel](../../aspose.medical.dicom.tags/tag/rttolerancesetlabel) | (300A,062A) VR=LO VM=1 RT Tolerance Set Label. |
| static readonly [RTToleranceSetSequence](../../aspose.medical.dicom.tags/tag/rttolerancesetsequence) | (300A,0629) VR=SQ VM=1 RT Tolerance Set Sequence. |
| static readonly [RTTreatmentApproachLabel](../../aspose.medical.dicom.tags/tag/rttreatmentapproachlabel) | (3010,0056) VR=LO VM=1 RT Treatment Approach Label. |
| static readonly [RTTreatmentFractionCompletionStatus](../../aspose.medical.dicom.tags/tag/rttreatmentfractioncompletionstatus) | (300A,0706) VR=CS VM=1 RT Treatment Fraction Completion Status. |
| static readonly [RTTreatmentIntentType](../../aspose.medical.dicom.tags/tag/rttreatmentintenttype) | (3010,0059) VR=CS VM=1 RT Treatment Intent Type. |
| static readonly [RTTreatmentPhaseIndex](../../aspose.medical.dicom.tags/tag/rttreatmentphaseindex) | (3010,003A) VR=US VM=1 RT Treatment Phase Index. |
| static readonly [RTTreatmentPhaseIntentPresenceFlag](../../aspose.medical.dicom.tags/tag/rttreatmentphaseintentpresenceflag) | (3010,0045) VR=CS VM=1 RT Treatment Phase Intent Presence Flag. |
| static readonly [RTTreatmentPhaseIntervalSequence](../../aspose.medical.dicom.tags/tag/rttreatmentphaseintervalsequence) | (3010,004E) VR=SQ VM=1 RT Treatment Phase Interval Sequence. |
| static readonly [RTTreatmentPhaseUID](../../aspose.medical.dicom.tags/tag/rttreatmentphaseuid) | (3010,003B) VR=UI VM=1 RT Treatment Phase UID. |
| static readonly [RTTreatmentPreparationPatientPositionSequence](../../aspose.medical.dicom.tags/tag/rttreatmentpreparationpatientpositionsequence) | (300A,078A) VR=SQ VM=1 RT Treatment Preparation Patient Position Sequence. |
| static readonly [RTTreatmentSourceCoordinates](../../aspose.medical.dicom.tags/tag/rttreatmentsourcecoordinates) | (3010,0093) VR=FD VM=3 RT Treatment Source Coordinates. |
| static readonly [RTTreatmentTechniqueCodeSequence](../../aspose.medical.dicom.tags/tag/rttreatmenttechniquecodesequence) | (3010,0080) VR=SQ VM=1 RT Treatment Technique Code Sequence. |
| static readonly [RTTreatmentTerminationReasonCodeSequence](../../aspose.medical.dicom.tags/tag/rttreatmentterminationreasoncodesequence) | (300A,0715) VR=SQ VM=1 RT Treatment Termination Reason Code Sequence. |
| static readonly [RTTreatmentTerminationStatus](../../aspose.medical.dicom.tags/tag/rttreatmentterminationstatus) | (300A,0714) VR=CS VM=1 RT Treatment Termination Status. |
| static readonly [RTVCommunicationSOPClassUID](../../aspose.medical.dicom.tags/tag/rtvcommunicationsopclassuid) | (0002,0032) VR=UI VM=1 RTV Communication SOP Class UID. |
| static readonly [RTVCommunicationSOPInstanceUID](../../aspose.medical.dicom.tags/tag/rtvcommunicationsopinstanceuid) | (0002,0033) VR=UI VM=1 RTV Communication SOP Instance UID. |
| static readonly [RTVFlowActualFrameDuration](../../aspose.medical.dicom.tags/tag/rtvflowactualframeduration) | (0002,0038) VR=FD VM=1 RTV Flow Actual Frame Duration. |
| static readonly [RTVFlowIdentifier](../../aspose.medical.dicom.tags/tag/rtvflowidentifier) | (0002,0036) VR=OB VM=1 RTV Flow Identifier. |
| static readonly [RTVFlowRTPSamplingRate](../../aspose.medical.dicom.tags/tag/rtvflowrtpsamplingrate) | (0002,0037) VR=UL VM=1 RTV Flow RTP Sampling Rate. |
| static readonly [RTVMetaInformationVersion](../../aspose.medical.dicom.tags/tag/rtvmetainformationversion) | (0002,0031) VR=OB VM=1 RTV Meta Information Version. |
| static readonly [RTVSourceIdentifier](../../aspose.medical.dicom.tags/tag/rtvsourceidentifier) | (0002,0035) VR=OB VM=1 RTV Source Identifier. |
| static readonly [RunLengthTripletRETIRED](../../aspose.medical.dicom.tags/tag/runlengthtripletretired) | (1000,xxx1) VR=US VM=3 Run Length Triplet (RETIRED). |
| static readonly [RWavePointer](../../aspose.medical.dicom.tags/tag/rwavepointer) | (0028,6040) VR=US VM=1-n R Wave Pointer. |
| static readonly [RWaveTimeVector](../../aspose.medical.dicom.tags/tag/rwavetimevector) | (0018,6060) VR=FL VM=1-n R Wave Time Vector. |
| static readonly [SafePositionExitDate](../../aspose.medical.dicom.tags/tag/safepositionexitdate) | (3008,0162) VR=DA VM=1 Safe Position Exit Date. |
| static readonly [SafePositionExitTime](../../aspose.medical.dicom.tags/tag/safepositionexittime) | (3008,0164) VR=TM VM=1 Safe Position Exit Time. |
| static readonly [SafePositionReturnDate](../../aspose.medical.dicom.tags/tag/safepositionreturndate) | (3008,0166) VR=DA VM=1 Safe Position Return Date. |
| static readonly [SafePositionReturnTime](../../aspose.medical.dicom.tags/tag/safepositionreturntime) | (3008,0168) VR=TM VM=1 Safe Position Return Time. |
| static readonly [SampleRateRETIRED](../../aspose.medical.dicom.tags/tag/samplerateretired) | (50xx,2008) VR=UL VM=1 Sample Rate (RETIRED). |
| static readonly [SamplesPerPixel](../../aspose.medical.dicom.tags/tag/samplesperpixel) | (0028,0002) VR=US VM=1 Samples per Pixel. |
| static readonly [SamplesPerPixelUsed](../../aspose.medical.dicom.tags/tag/samplesperpixelused) | (0028,0003) VR=US VM=1 Samples per Pixel Used. |
| static readonly [SamplingFrequency](../../aspose.medical.dicom.tags/tag/samplingfrequency) | (003A,001A) VR=DS VM=1 Sampling Frequency. |
| static readonly [SamplingStepSize](../../aspose.medical.dicom.tags/tag/samplingstepsize) | (0070,1607) VR=FD VM=1 Sampling Step Size. |
| static readonly [SAR](../../aspose.medical.dicom.tags/tag/sar) | (0018,1316) VR=DS VM=1 SAR. |
| static readonly [Saturation](../../aspose.medical.dicom.tags/tag/saturation) | (0016,0049) VR=US VM=1 Saturation. |
| static readonly [SaturationRecovery](../../aspose.medical.dicom.tags/tag/saturationrecovery) | (0018,9024) VR=CS VM=1 Saturation Recovery. |
| static readonly [ScanArc](../../aspose.medical.dicom.tags/tag/scanarc) | (0018,1143) VR=DS VM=1 Scan Arc. |
| static readonly [ScanArcType](../../aspose.medical.dicom.tags/tag/scanarctype) | (3002,012E) VR=CS VM=1 Scan Arc Type. |
| static readonly [ScanLength](../../aspose.medical.dicom.tags/tag/scanlength) | (0018,1302) VR=IS VM=1 Scan Length. |
| static readonly [ScanMode](../../aspose.medical.dicom.tags/tag/scanmode) | (300A,0308) VR=CS VM=1 Scan Mode. |
| static readonly [ScannerSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/scannersettingssequenceretired) | (0014,409A) VR=SQ VM=1 Scanner Settings Sequence (RETIRED). |
| static readonly [ScanningSequence](../../aspose.medical.dicom.tags/tag/scanningsequence) | (0018,0020) VR=CS VM=1-n Scanning Sequence. |
| static readonly [ScanningSpotSize](../../aspose.medical.dicom.tags/tag/scanningspotsize) | (300A,0398) VR=FL VM=2 Scanning Spot Size. |
| static readonly [ScanOptions](../../aspose.medical.dicom.tags/tag/scanoptions) | (0018,0022) VR=CS VM=1-n Scan Options. |
| static readonly [ScanPatternTypeCodeSequence](../../aspose.medical.dicom.tags/tag/scanpatterntypecodesequence) | (0022,1618) VR=SQ VM=1 Scan Pattern Type Code Sequence. |
| static readonly [ScanProcedureRETIRED](../../aspose.medical.dicom.tags/tag/scanprocedureretired) | (0014,409B) VR=ST VM=1 Scan Procedure (RETIRED). |
| static readonly [ScanProgressionDirection](../../aspose.medical.dicom.tags/tag/scanprogressiondirection) | (0054,0501) VR=CS VM=1 Scan Progression Direction. |
| static readonly [ScanSpotMetersetsDelivered](../../aspose.medical.dicom.tags/tag/scanspotmetersetsdelivered) | (3008,0047) VR=FL VM=1-n Scan Spot Metersets Delivered. |
| static readonly [ScanSpotMetersetWeights](../../aspose.medical.dicom.tags/tag/scanspotmetersetweights) | (300A,0396) VR=FL VM=1-n Scan Spot Meterset Weights. |
| static readonly [ScanSpotPositionMap](../../aspose.medical.dicom.tags/tag/scanspotpositionmap) | (300A,0394) VR=FL VM=1-n Scan Spot Position Map. |
| static readonly [ScanSpotPrescribedIndices](../../aspose.medical.dicom.tags/tag/scanspotprescribedindices) | (300A,0391) VR=IS VM=1-n Scan Spot Prescribed Indices. |
| static readonly [ScanSpotReordered](../../aspose.medical.dicom.tags/tag/scanspotreordered) | (300A,0393) VR=CS VM=1 Scan Spot Reordered. |
| static readonly [ScanSpotReorderingAllowed](../../aspose.medical.dicom.tags/tag/scanspotreorderingallowed) | (300A,0395) VR=CS VM=1 Scan Spot Reordering Allowed. |
| static readonly [ScanSpotSizesDelivered](../../aspose.medical.dicom.tags/tag/scanspotsizesdelivered) | (300A,0399) VR=FL VM=2-2n Scan Spot Sizes Delivered. |
| static readonly [ScanSpotTimeOffset](../../aspose.medical.dicom.tags/tag/scanspottimeoffset) | (300A,038F) VR=FL VM=1-n Scan Spot Time Offset. |
| static readonly [ScanSpotTuneID](../../aspose.medical.dicom.tags/tag/scanspottuneid) | (300A,0390) VR=SH VM=1 Scan Spot Tune ID. |
| static readonly [ScanStartPositionSequence](../../aspose.medical.dicom.tags/tag/scanstartpositionsequence) | (3002,012B) VR=SQ VM=1 Scan Start Position Sequence. |
| static readonly [ScanStopPositionSequence](../../aspose.medical.dicom.tags/tag/scanstoppositionsequence) | (3002,012C) VR=SQ VM=1 Scan Stop Position Sequence. |
| static readonly [ScanTypeRETIRED](../../aspose.medical.dicom.tags/tag/scantyperetired) | (4010,1048) VR=CS VM=1 Scan Type (RETIRED). |
| static readonly [ScanVelocity](../../aspose.medical.dicom.tags/tag/scanvelocity) | (0018,1300) VR=DS VM=1 Scan Velocity. |
| static readonly [ScatterCorrected](../../aspose.medical.dicom.tags/tag/scattercorrected) | (0018,9760) VR=CS VM=1 Scatter Corrected. |
| static readonly [ScatterCorrectionMethod](../../aspose.medical.dicom.tags/tag/scattercorrectionmethod) | (0054,1105) VR=LO VM=1 Scatter Correction Method. |
| static readonly [ScatterFractionFactor](../../aspose.medical.dicom.tags/tag/scatterfractionfactor) | (0054,1323) VR=DS VM=1 Scatter Fraction Factor. |
| static readonly [SceneCaptureType](../../aspose.medical.dicom.tags/tag/scenecapturetype) | (0016,0046) VR=US VM=1 Scene Capture Type. |
| static readonly [SceneType](../../aspose.medical.dicom.tags/tag/scenetype) | (0016,003B) VR=US VM=1 Scene Type. |
| static readonly [ScheduledAdmissionDateRETIRED](../../aspose.medical.dicom.tags/tag/scheduledadmissiondateretired) | (0038,001A) VR=DA VM=1 Scheduled Admission Date (RETIRED). |
| static readonly [ScheduledAdmissionTimeRETIRED](../../aspose.medical.dicom.tags/tag/scheduledadmissiontimeretired) | (0038,001B) VR=TM VM=1 Scheduled Admission Time (RETIRED). |
| static readonly [ScheduledDischargeDateRETIRED](../../aspose.medical.dicom.tags/tag/scheduleddischargedateretired) | (0038,001C) VR=DA VM=1 Scheduled Discharge Date (RETIRED). |
| static readonly [ScheduledDischargeTimeRETIRED](../../aspose.medical.dicom.tags/tag/scheduleddischargetimeretired) | (0038,001D) VR=TM VM=1 Scheduled Discharge Time (RETIRED). |
| static readonly [ScheduledHumanPerformersSequence](../../aspose.medical.dicom.tags/tag/scheduledhumanperformerssequence) | (0040,4034) VR=SQ VM=1 Scheduled Human Performers Sequence. |
| static readonly [ScheduledPatientInstitutionResidenceRETIRED](../../aspose.medical.dicom.tags/tag/scheduledpatientinstitutionresidenceretired) | (0038,001E) VR=LO VM=1 Scheduled Patient Institution Residence (RETIRED). |
| static readonly [ScheduledPerformingPhysicianIdentificationSequence](../../aspose.medical.dicom.tags/tag/scheduledperformingphysicianidentificationsequence) | (0040,000B) VR=SQ VM=1 Scheduled Performing Physician Identification Sequence. |
| static readonly [ScheduledPerformingPhysicianName](../../aspose.medical.dicom.tags/tag/scheduledperformingphysicianname) | (0040,0006) VR=PN VM=1 Scheduled Performing Physician's Name. |
| static readonly [ScheduledProcedureStepDescription](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepdescription) | (0040,0007) VR=LO VM=1 Scheduled Procedure Step Description. |
| static readonly [ScheduledProcedureStepEndDate](../../aspose.medical.dicom.tags/tag/scheduledprocedurestependdate) | (0040,0004) VR=DA VM=1 Scheduled Procedure Step End Date. |
| static readonly [ScheduledProcedureStepEndTime](../../aspose.medical.dicom.tags/tag/scheduledprocedurestependtime) | (0040,0005) VR=TM VM=1 Scheduled Procedure Step End Time. |
| static readonly [ScheduledProcedureStepExpirationDateTime](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepexpirationdatetime) | (0040,4008) VR=DT VM=1 Scheduled Procedure Step Expiration DateTime. |
| static readonly [ScheduledProcedureStepID](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepid) | (0040,0009) VR=SH VM=1 Scheduled Procedure Step ID. |
| static readonly [ScheduledProcedureStepLocation](../../aspose.medical.dicom.tags/tag/scheduledproceduresteplocation) | (0040,0011) VR=SH VM=1 Scheduled Procedure Step Location. |
| static readonly [ScheduledProcedureStepModificationDateTime](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepmodificationdatetime) | (0040,4010) VR=DT VM=1 Scheduled Procedure Step Modification DateTime. |
| static readonly [ScheduledProcedureStepPriority](../../aspose.medical.dicom.tags/tag/scheduledproceduresteppriority) | (0074,1200) VR=CS VM=1 Scheduled Procedure Step Priority. |
| static readonly [ScheduledProcedureStepSequence](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepsequence) | (0040,0100) VR=SQ VM=1 Scheduled Procedure Step Sequence. |
| static readonly [ScheduledProcedureStepStartDate](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepstartdate) | (0040,0002) VR=DA VM=1 Scheduled Procedure Step Start Date. |
| static readonly [ScheduledProcedureStepStartDateTime](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepstartdatetime) | (0040,4005) VR=DT VM=1 Scheduled Procedure Step Start DateTime. |
| static readonly [ScheduledProcedureStepStartTime](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepstarttime) | (0040,0003) VR=TM VM=1 Scheduled Procedure Step Start Time. |
| static readonly [ScheduledProcedureStepStatus](../../aspose.medical.dicom.tags/tag/scheduledprocedurestepstatus) | (0040,0020) VR=CS VM=1 Scheduled Procedure Step Status. |
| static readonly [ScheduledProcessingApplicationsCodeSequenceRETIRED](../../aspose.medical.dicom.tags/tag/scheduledprocessingapplicationscodesequenceretired) | (0040,4004) VR=SQ VM=1 Scheduled Processing Applications Code Sequence (RETIRED). |
| static readonly [ScheduledProcessingParametersSequence](../../aspose.medical.dicom.tags/tag/scheduledprocessingparameterssequence) | (0074,1210) VR=SQ VM=1 Scheduled Processing Parameters Sequence. |
| static readonly [ScheduledProtocolCodeSequence](../../aspose.medical.dicom.tags/tag/scheduledprotocolcodesequence) | (0040,0008) VR=SQ VM=1 Scheduled Protocol Code Sequence. |
| static readonly [ScheduledSpecimenSequence](../../aspose.medical.dicom.tags/tag/scheduledspecimensequence) | (0040,0500) VR=SQ VM=1 Scheduled Specimen Sequence. |
| static readonly [ScheduledStationAETitle](../../aspose.medical.dicom.tags/tag/scheduledstationaetitle) | (0040,0001) VR=AE VM=1-n Scheduled Station AE Title. |
| static readonly [ScheduledStationClassCodeSequence](../../aspose.medical.dicom.tags/tag/scheduledstationclasscodesequence) | (0040,4026) VR=SQ VM=1 Scheduled Station Class Code Sequence. |
| static readonly [ScheduledStationGeographicLocationCodeSequence](../../aspose.medical.dicom.tags/tag/scheduledstationgeographiclocationcodesequence) | (0040,4027) VR=SQ VM=1 Scheduled Station Geographic Location Code Sequence. |
| static readonly [ScheduledStationName](../../aspose.medical.dicom.tags/tag/scheduledstationname) | (0040,0010) VR=SH VM=1-n Scheduled Station Name. |
| static readonly [ScheduledStationNameCodeSequence](../../aspose.medical.dicom.tags/tag/scheduledstationnamecodesequence) | (0040,4025) VR=SQ VM=1 Scheduled Station Name Code Sequence. |
| static readonly [ScheduledStepAttributesSequence](../../aspose.medical.dicom.tags/tag/scheduledstepattributessequence) | (0040,0270) VR=SQ VM=1 Scheduled Step Attributes Sequence. |
| static readonly [ScheduledStudyLocationAETitleRETIRED](../../aspose.medical.dicom.tags/tag/scheduledstudylocationaetitleretired) | (0032,1021) VR=AE VM=1-n Scheduled Study Location AE Title (RETIRED). |
| static readonly [ScheduledStudyLocationRETIRED](../../aspose.medical.dicom.tags/tag/scheduledstudylocationretired) | (0032,1020) VR=LO VM=1 Scheduled Study Location (RETIRED). |
| static readonly [ScheduledStudyStartDateRETIRED](../../aspose.medical.dicom.tags/tag/scheduledstudystartdateretired) | (0032,1000) VR=DA VM=1 Scheduled Study Start Date (RETIRED). |
| static readonly [ScheduledStudyStartTimeRETIRED](../../aspose.medical.dicom.tags/tag/scheduledstudystarttimeretired) | (0032,1001) VR=TM VM=1 Scheduled Study Start Time (RETIRED). |
| static readonly [ScheduledStudyStopDateRETIRED](../../aspose.medical.dicom.tags/tag/scheduledstudystopdateretired) | (0032,1010) VR=DA VM=1 Scheduled Study Stop Date (RETIRED). |
| static readonly [ScheduledStudyStopTimeRETIRED](../../aspose.medical.dicom.tags/tag/scheduledstudystoptimeretired) | (0032,1011) VR=TM VM=1 Scheduled Study Stop Time (RETIRED). |
| static readonly [ScheduledWorkitemCodeSequence](../../aspose.medical.dicom.tags/tag/scheduledworkitemcodesequence) | (0040,4018) VR=SQ VM=1 Scheduled Workitem Code Sequence. |
| static readonly [ScopeOfInventorySequence](../../aspose.medical.dicom.tags/tag/scopeofinventorysequence) | (0008,0400) VR=SQ VM=1 Scope of Inventory Sequence. |
| static readonly [SCPStatus](../../aspose.medical.dicom.tags/tag/scpstatus) | (0074,1242) VR=CS VM=1 SCP Status. |
| static readonly [ScreeningBaselineMeasured](../../aspose.medical.dicom.tags/tag/screeningbaselinemeasured) | (0024,0120) VR=CS VM=1 Screening Baseline Measured. |
| static readonly [ScreeningBaselineMeasuredSequence](../../aspose.medical.dicom.tags/tag/screeningbaselinemeasuredsequence) | (0024,0122) VR=SQ VM=1 Screening Baseline Measured Sequence. |
| static readonly [ScreeningBaselineType](../../aspose.medical.dicom.tags/tag/screeningbaselinetype) | (0024,0124) VR=CS VM=1 Screening Baseline Type. |
| static readonly [ScreeningBaselineValue](../../aspose.medical.dicom.tags/tag/screeningbaselinevalue) | (0024,0126) VR=FL VM=1 Screening Baseline Value. |
| static readonly [ScreeningTestModeCodeSequence](../../aspose.medical.dicom.tags/tag/screeningtestmodecodesequence) | (0024,0016) VR=SQ VM=1 Screening Test Mode Code Sequence. |
| static readonly [ScreenMinimumColorBitDepth](../../aspose.medical.dicom.tags/tag/screenminimumcolorbitdepth) | (0072,010C) VR=US VM=1 Screen Minimum Color Bit Depth. |
| static readonly [ScreenMinimumGrayscaleBitDepth](../../aspose.medical.dicom.tags/tag/screenminimumgrayscalebitdepth) | (0072,010A) VR=US VM=1 Screen Minimum Grayscale Bit Depth. |
| static readonly [SeamLineIndex](../../aspose.medical.dicom.tags/tag/seamlineindex) | (0052,0036) VR=US VM=1 Seam Line Index. |
| static readonly [SeamLineLocation](../../aspose.medical.dicom.tags/tag/seamlinelocation) | (0052,0033) VR=FD VM=1 Seam Line Location. |
| static readonly [SecondaryApprovalStatusRETIRED](../../aspose.medical.dicom.tags/tag/secondaryapprovalstatusretired) | (0014,0101) VR=CS VM=1 Secondary Approval Status (RETIRED). |
| static readonly [SecondaryCaptureDeviceID](../../aspose.medical.dicom.tags/tag/secondarycapturedeviceid) | (0018,1010) VR=LO VM=1 Secondary Capture Device ID. |
| static readonly [SecondaryCaptureDeviceManufacturer](../../aspose.medical.dicom.tags/tag/secondarycapturedevicemanufacturer) | (0018,1016) VR=LO VM=1 Secondary Capture Device Manufacturer. |
| static readonly [SecondaryCaptureDeviceManufacturerModelName](../../aspose.medical.dicom.tags/tag/secondarycapturedevicemanufacturermodelname) | (0018,1018) VR=LO VM=1 Secondary Capture Device Manufacturer's Model Name. |
| static readonly [SecondaryCaptureDeviceSoftwareVersions](../../aspose.medical.dicom.tags/tag/secondarycapturedevicesoftwareversions) | (0018,1019) VR=LO VM=1-n Secondary Capture Device Software Versions. |
| static readonly [SecondaryCountsAccumulated](../../aspose.medical.dicom.tags/tag/secondarycountsaccumulated) | (0054,1311) VR=IS VM=1-n Secondary Counts Accumulated. |
| static readonly [SecondaryCountsType](../../aspose.medical.dicom.tags/tag/secondarycountstype) | (0054,1220) VR=CS VM=1-n Secondary Counts Type. |
| static readonly [SecondaryDiagnosesCodeSequence](../../aspose.medical.dicom.tags/tag/secondarydiagnosescodesequence) | (0008,1303) VR=SQ VM=1 Secondary Diagnoses Code Sequence. |
| static readonly [SecondaryInspectionMethodSequenceRETIRED](../../aspose.medical.dicom.tags/tag/secondaryinspectionmethodsequenceretired) | (4010,107D) VR=SQ VM=1 Secondary Inspection Method Sequence (RETIRED). |
| static readonly [SecondaryPositionerIncrement](../../aspose.medical.dicom.tags/tag/secondarypositionerincrement) | (0018,9515) VR=FL VM=1 Secondary Positioner Increment. |
| static readonly [SecondaryPositionerIncrementSign](../../aspose.medical.dicom.tags/tag/secondarypositionerincrementsign) | (0018,9519) VR=SS VM=1 Secondary Positioner Increment Sign. |
| static readonly [SecondaryPositionerScanArc](../../aspose.medical.dicom.tags/tag/secondarypositionerscanarc) | (0018,9509) VR=FL VM=1 Secondary Positioner Scan Arc. |
| static readonly [SecondaryPositionerScanStartAngle](../../aspose.medical.dicom.tags/tag/secondarypositionerscanstartangle) | (0018,9511) VR=FL VM=1 Secondary Positioner Scan Start Angle. |
| static readonly [SecondaryReviewDateRETIRED](../../aspose.medical.dicom.tags/tag/secondaryreviewdateretired) | (0014,0102) VR=DA VM=1 Secondary Review Date (RETIRED). |
| static readonly [SecondaryReviewerNameRETIRED](../../aspose.medical.dicom.tags/tag/secondaryreviewernameretired) | (0014,0104) VR=PN VM=1 Secondary Reviewer Name (RETIRED). |
| static readonly [SecondaryReviewTimeRETIRED](../../aspose.medical.dicom.tags/tag/secondaryreviewtimeretired) | (0014,0103) VR=TM VM=1 Secondary Review Time (RETIRED). |
| static readonly [SegmentAlgorithmName](../../aspose.medical.dicom.tags/tag/segmentalgorithmname) | (0062,0009) VR=LO VM=1-n Segment Algorithm Name. |
| static readonly [SegmentAlgorithmType](../../aspose.medical.dicom.tags/tag/segmentalgorithmtype) | (0062,0008) VR=CS VM=1 Segment Algorithm Type. |
| static readonly [SegmentAnnotationCategoryCodeSequence](../../aspose.medical.dicom.tags/tag/segmentannotationcategorycodesequence) | (3010,002B) VR=SQ VM=1 Segment Annotation Category Code Sequence. |
| static readonly [SegmentAnnotationTypeCodeSequence](../../aspose.medical.dicom.tags/tag/segmentannotationtypecodesequence) | (3010,002C) VR=SQ VM=1 Segment Annotation Type Code Sequence. |
| static readonly [SegmentAnnotationTypeModifierCodeSequence](../../aspose.medical.dicom.tags/tag/segmentannotationtypemodifiercodesequence) | (3010,002F) VR=SQ VM=1 Segment Annotation Type Modifier Code Sequence. |
| static readonly [SegmentationAlgorithmIdentificationSequence](../../aspose.medical.dicom.tags/tag/segmentationalgorithmidentificationsequence) | (0062,0007) VR=SQ VM=1 Segmentation Algorithm Identification Sequence. |
| static readonly [SegmentationCreationTemplateLabel](../../aspose.medical.dicom.tags/tag/segmentationcreationtemplatelabel) | (3010,001E) VR=LO VM=1 Segmentation Creation Template Label. |
| static readonly [SegmentationFractionalType](../../aspose.medical.dicom.tags/tag/segmentationfractionaltype) | (0062,0010) VR=CS VM=1 Segmentation Fractional Type. |
| static readonly [SegmentationTemplateUID](../../aspose.medical.dicom.tags/tag/segmentationtemplateuid) | (3010,001F) VR=UI VM=1 Segmentation Template UID. |
| static readonly [SegmentationType](../../aspose.medical.dicom.tags/tag/segmentationtype) | (0062,0001) VR=CS VM=1 Segmentation Type. |
| static readonly [SegmentCharacteristicsPrecedence](../../aspose.medical.dicom.tags/tag/segmentcharacteristicsprecedence) | (3010,0029) VR=US VM=1 Segment Characteristics Precedence. |
| static readonly [SegmentCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/segmentcharacteristicssequence) | (3010,0027) VR=SQ VM=1 Segment Characteristics Sequence. |
| static readonly [SegmentDefinitionDateTime](../../aspose.medical.dicom.tags/tag/segmentdefinitiondatetime) | (0040,B036) VR=DT VM=1 Segment Definition DateTime. |
| static readonly [SegmentDescription](../../aspose.medical.dicom.tags/tag/segmentdescription) | (0062,0006) VR=ST VM=1 Segment Description. |
| static readonly [SegmentedAlphaPaletteColorLookupTableData](../../aspose.medical.dicom.tags/tag/segmentedalphapalettecolorlookuptabledata) | (0028,1224) VR=OW VM=1 Segmented Alpha Palette Color Lookup Table Data. |
| static readonly [SegmentedBluePaletteColorLookupTableData](../../aspose.medical.dicom.tags/tag/segmentedbluepalettecolorlookuptabledata) | (0028,1223) VR=OW VM=1 Segmented Blue Palette Color Lookup Table Data. |
| static readonly [SegmentedGreenPaletteColorLookupTableData](../../aspose.medical.dicom.tags/tag/segmentedgreenpalettecolorlookuptabledata) | (0028,1222) VR=OW VM=1 Segmented Green Palette Color Lookup Table Data. |
| static readonly [SegmentedKSpaceTraversal](../../aspose.medical.dicom.tags/tag/segmentedkspacetraversal) | (0018,9033) VR=CS VM=1 Segmented k-Space Traversal. |
| static readonly [SegmentedPropertyCategoryCodeSequence](../../aspose.medical.dicom.tags/tag/segmentedpropertycategorycodesequence) | (0062,0003) VR=SQ VM=1 Segmented Property Category Code Sequence. |
| static readonly [SegmentedPropertyTypeCodeSequence](../../aspose.medical.dicom.tags/tag/segmentedpropertytypecodesequence) | (0062,000F) VR=SQ VM=1 Segmented Property Type Code Sequence. |
| static readonly [SegmentedPropertyTypeModifierCodeSequence](../../aspose.medical.dicom.tags/tag/segmentedpropertytypemodifiercodesequence) | (0062,0011) VR=SQ VM=1 Segmented Property Type Modifier Code Sequence. |
| static readonly [SegmentedRedPaletteColorLookupTableData](../../aspose.medical.dicom.tags/tag/segmentedredpalettecolorlookuptabledata) | (0028,1221) VR=OW VM=1 Segmented Red Palette Color Lookup Table Data. |
| static readonly [SegmentedRTAccessoryDeviceSequence](../../aspose.medical.dicom.tags/tag/segmentedrtaccessorydevicesequence) | (3010,0026) VR=SQ VM=1 Segmented RT Accessory Device Sequence. |
| static readonly [SegmentIdentificationSequence](../../aspose.medical.dicom.tags/tag/segmentidentificationsequence) | (0062,000A) VR=SQ VM=1 Segment Identification Sequence. |
| static readonly [SegmentLabel](../../aspose.medical.dicom.tags/tag/segmentlabel) | (0062,0005) VR=LO VM=1 Segment Label. |
| static readonly [SegmentNumber](../../aspose.medical.dicom.tags/tag/segmentnumber) | (0062,0004) VR=US VM=1 Segment Number. |
| static readonly [SegmentReferenceIndex](../../aspose.medical.dicom.tags/tag/segmentreferenceindex) | (3010,0022) VR=US VM=1 Segment Reference Index. |
| static readonly [SegmentReferenceSequence](../../aspose.medical.dicom.tags/tag/segmentreferencesequence) | (3010,0021) VR=SQ VM=1 Segment Reference Sequence. |
| static readonly [SegmentSequence](../../aspose.medical.dicom.tags/tag/segmentsequence) | (0062,0002) VR=SQ VM=1 Segment Sequence. |
| static readonly [SegmentsOverlap](../../aspose.medical.dicom.tags/tag/segmentsoverlap) | (0062,0013) VR=CS VM=1 Segments Overlap. |
| static readonly [SegmentSurfaceGenerationAlgorithmIdentificationSequence](../../aspose.medical.dicom.tags/tag/segmentsurfacegenerationalgorithmidentificationsequence) | (0066,002D) VR=SQ VM=1 Segment Surface Generation Algorithm Identification Sequence. |
| static readonly [SegmentSurfaceSourceInstanceSequence](../../aspose.medical.dicom.tags/tag/segmentsurfacesourceinstancesequence) | (0066,002E) VR=SQ VM=1 Segment Surface Source Instance Sequence. |
| static readonly [SelectedFrameFunctionalGroupsSequence](../../aspose.medical.dicom.tags/tag/selectedframefunctionalgroupssequence) | (3002,0101) VR=SQ VM=1 Selected Frame Functional Groups Sequence. |
| static readonly [SelectedFrameNumber](../../aspose.medical.dicom.tags/tag/selectedframenumber) | (3002,0100) VR=IS VM=1 Selected Frame Number. |
| static readonly [SelectedSegmentalOphthalmicAxialLengthSequence](../../aspose.medical.dicom.tags/tag/selectedsegmentalophthalmicaxiallengthsequence) | (0022,1257) VR=SQ VM=1 Selected Segmental Ophthalmic Axial Length Sequence. |
| static readonly [SelectedTotalOphthalmicAxialLengthSequence](../../aspose.medical.dicom.tags/tag/selectedtotalophthalmicaxiallengthsequence) | (0022,1260) VR=SQ VM=1 Selected Total Ophthalmic Axial Length Sequence. |
| static readonly [SelectorAEValue](../../aspose.medical.dicom.tags/tag/selectoraevalue) | (0072,005E) VR=AE VM=1-n Selector AE Value. |
| static readonly [SelectorASValue](../../aspose.medical.dicom.tags/tag/selectorasvalue) | (0072,005F) VR=AS VM=1-n Selector AS Value. |
| static readonly [SelectorAttribute](../../aspose.medical.dicom.tags/tag/selectorattribute) | (0072,0026) VR=AT VM=1 Selector Attribute. |
| static readonly [SelectorAttributeKeyword](../../aspose.medical.dicom.tags/tag/selectorattributekeyword) | (0082,0019) VR=LO VM=1 Selector Attribute Keyword. |
| static readonly [SelectorAttributeName](../../aspose.medical.dicom.tags/tag/selectorattributename) | (0082,0018) VR=LO VM=1 Selector Attribute Name. |
| static readonly [SelectorAttributePrivateCreator](../../aspose.medical.dicom.tags/tag/selectorattributeprivatecreator) | (0072,0056) VR=LO VM=1 Selector Attribute Private Creator. |
| static readonly [SelectorAttributeVR](../../aspose.medical.dicom.tags/tag/selectorattributevr) | (0072,0050) VR=CS VM=1 Selector Attribute VR. |
| static readonly [SelectorATValue](../../aspose.medical.dicom.tags/tag/selectoratvalue) | (0072,0060) VR=AT VM=1-n Selector AT Value. |
| static readonly [SelectorCodeSequenceValue](../../aspose.medical.dicom.tags/tag/selectorcodesequencevalue) | (0072,0080) VR=SQ VM=1 Selector Code Sequence Value. |
| static readonly [SelectorCSValue](../../aspose.medical.dicom.tags/tag/selectorcsvalue) | (0072,0062) VR=CS VM=1-n Selector CS Value. |
| static readonly [SelectorDAValue](../../aspose.medical.dicom.tags/tag/selectordavalue) | (0072,0061) VR=DA VM=1-n Selector DA Value. |
| static readonly [SelectorDSValue](../../aspose.medical.dicom.tags/tag/selectordsvalue) | (0072,0072) VR=DS VM=1-n Selector DS Value. |
| static readonly [SelectorDTValue](../../aspose.medical.dicom.tags/tag/selectordtvalue) | (0072,0063) VR=DT VM=1-n Selector DT Value. |
| static readonly [SelectorFDValue](../../aspose.medical.dicom.tags/tag/selectorfdvalue) | (0072,0074) VR=FD VM=1-n Selector FD Value. |
| static readonly [SelectorFLValue](../../aspose.medical.dicom.tags/tag/selectorflvalue) | (0072,0076) VR=FL VM=1-n Selector FL Value. |
| static readonly [SelectorISValue](../../aspose.medical.dicom.tags/tag/selectorisvalue) | (0072,0064) VR=IS VM=1-n Selector IS Value. |
| static readonly [SelectorLOValue](../../aspose.medical.dicom.tags/tag/selectorlovalue) | (0072,0066) VR=LO VM=1-n Selector LO Value. |
| static readonly [SelectorLTValue](../../aspose.medical.dicom.tags/tag/selectorltvalue) | (0072,0068) VR=LT VM=1 Selector LT Value. |
| static readonly [SelectorOBValue](../../aspose.medical.dicom.tags/tag/selectorobvalue) | (0072,0065) VR=OB VM=1 Selector OB Value. |
| static readonly [SelectorODValue](../../aspose.medical.dicom.tags/tag/selectorodvalue) | (0072,0073) VR=OD VM=1 Selector OD Value. |
| static readonly [SelectorOFValue](../../aspose.medical.dicom.tags/tag/selectorofvalue) | (0072,0067) VR=OF VM=1 Selector OF Value. |
| static readonly [SelectorOLValue](../../aspose.medical.dicom.tags/tag/selectorolvalue) | (0072,0075) VR=OL VM=1 Selector OL Value. |
| static readonly [SelectorOVValue](../../aspose.medical.dicom.tags/tag/selectorovvalue) | (0072,0081) VR=OV VM=1 Selector OV Value. |
| static readonly [SelectorOWValue](../../aspose.medical.dicom.tags/tag/selectorowvalue) | (0072,0069) VR=OW VM=1 Selector OW Value. |
| static readonly [SelectorPNValue](../../aspose.medical.dicom.tags/tag/selectorpnvalue) | (0072,006A) VR=PN VM=1-n Selector PN Value. |
| static readonly [SelectorSequencePointer](../../aspose.medical.dicom.tags/tag/selectorsequencepointer) | (0072,0052) VR=AT VM=1-n Selector Sequence Pointer. |
| static readonly [SelectorSequencePointerItems](../../aspose.medical.dicom.tags/tag/selectorsequencepointeritems) | (0074,1057) VR=IS VM=1-n Selector Sequence Pointer Items. |
| static readonly [SelectorSequencePointerPrivateCreator](../../aspose.medical.dicom.tags/tag/selectorsequencepointerprivatecreator) | (0072,0054) VR=LO VM=1-n Selector Sequence Pointer Private Creator. |
| static readonly [SelectorSHValue](../../aspose.medical.dicom.tags/tag/selectorshvalue) | (0072,006C) VR=SH VM=1-n Selector SH Value. |
| static readonly [SelectorSLValue](../../aspose.medical.dicom.tags/tag/selectorslvalue) | (0072,007C) VR=SL VM=1-n Selector SL Value. |
| static readonly [SelectorSSValue](../../aspose.medical.dicom.tags/tag/selectorssvalue) | (0072,007E) VR=SS VM=1-n Selector SS Value. |
| static readonly [SelectorSTValue](../../aspose.medical.dicom.tags/tag/selectorstvalue) | (0072,006E) VR=ST VM=1 Selector ST Value. |
| static readonly [SelectorSVValue](../../aspose.medical.dicom.tags/tag/selectorsvvalue) | (0072,0082) VR=SV VM=1-n Selector SV Value. |
| static readonly [SelectorTMValue](../../aspose.medical.dicom.tags/tag/selectortmvalue) | (0072,006B) VR=TM VM=1-n Selector TM Value. |
| static readonly [SelectorUCValue](../../aspose.medical.dicom.tags/tag/selectorucvalue) | (0072,006F) VR=UC VM=1-n Selector UC Value. |
| static readonly [SelectorUIValue](../../aspose.medical.dicom.tags/tag/selectoruivalue) | (0072,007F) VR=UI VM=1-n Selector UI Value. |
| static readonly [SelectorULValue](../../aspose.medical.dicom.tags/tag/selectorulvalue) | (0072,0078) VR=UL VM=1-n Selector UL Value. |
| static readonly [SelectorUNValue](../../aspose.medical.dicom.tags/tag/selectorunvalue) | (0072,006D) VR=UN VM=1 Selector UN Value. |
| static readonly [SelectorURValue](../../aspose.medical.dicom.tags/tag/selectorurvalue) | (0072,0071) VR=UR VM=1 Selector UR Value. |
| static readonly [SelectorUSValue](../../aspose.medical.dicom.tags/tag/selectorusvalue) | (0072,007A) VR=US VM=1-n Selector US Value. |
| static readonly [SelectorUTValue](../../aspose.medical.dicom.tags/tag/selectorutvalue) | (0072,0070) VR=UT VM=1 Selector UT Value. |
| static readonly [SelectorUVValue](../../aspose.medical.dicom.tags/tag/selectoruvvalue) | (0072,0083) VR=UV VM=1-n Selector UV Value. |
| static readonly [SelectorValueNumber](../../aspose.medical.dicom.tags/tag/selectorvaluenumber) | (0072,0028) VR=US VM=1 Selector Value Number. |
| static readonly [SelfTimerMode](../../aspose.medical.dicom.tags/tag/selftimermode) | (0016,0019) VR=IS VM=1 Self Timer Mode. |
| static readonly [SendingApplicationEntityTitle](../../aspose.medical.dicom.tags/tag/sendingapplicationentitytitle) | (0002,0017) VR=AE VM=1 Sending Application Entity Title. |
| static readonly [SendingPresentationAddress](../../aspose.medical.dicom.tags/tag/sendingpresentationaddress) | (0002,0027) VR=UR VM=1 Sending Presentation Address. |
| static readonly [SensingMethod](../../aspose.medical.dicom.tags/tag/sensingmethod) | (0016,0039) VR=US VM=1 Sensing Method. |
| static readonly [Sensitivity](../../aspose.medical.dicom.tags/tag/sensitivity) | (0018,6000) VR=DS VM=1 Sensitivity. |
| static readonly [SensitivityCalibrated](../../aspose.medical.dicom.tags/tag/sensitivitycalibrated) | (0018,9767) VR=CS VM=1 Sensitivity Calibrated. |
| static readonly [SensitivityType](../../aspose.medical.dicom.tags/tag/sensitivitytype) | (0016,001A) VR=US VM=1 Sensitivity Type. |
| static readonly [SensitivityValue](../../aspose.medical.dicom.tags/tag/sensitivityvalue) | (0024,0094) VR=FL VM=1 Sensitivity Value. |
| static readonly [SensorNameRETIRED](../../aspose.medical.dicom.tags/tag/sensornameretired) | (0014,3022) VR=ST VM=1 Sensor Name (RETIRED). |
| static readonly [SensorTemperatureRETIRED](../../aspose.medical.dicom.tags/tag/sensortemperatureretired) | (0014,3028) VR=DS VM=1 Sensor Temperature (RETIRED). |
| static readonly [SequenceDelimitationItem](../../aspose.medical.dicom.tags/tag/sequencedelimitationitem) | (FFFE,E0DD) VR=NONE VM=1 Sequence Delimitation Item. |
| static readonly [SequenceName](../../aspose.medical.dicom.tags/tag/sequencename) | (0018,0024) VR=SH VM=1 Sequence Name. |
| static readonly [SequenceOfCompressedDataRETIRED](../../aspose.medical.dicom.tags/tag/sequenceofcompresseddataretired) | (0028,0403) VR=LO VM=1-n Sequence of Compressed Data (RETIRED). |
| static readonly [SequenceOfUltrasoundRegions](../../aspose.medical.dicom.tags/tag/sequenceofultrasoundregions) | (0018,6011) VR=SQ VM=1 Sequence of Ultrasound Regions. |
| static readonly [SequenceVariant](../../aspose.medical.dicom.tags/tag/sequencevariant) | (0018,0021) VR=CS VM=1-n Sequence Variant. |
| static readonly [SequencingIndicatorTrialRETIRED](../../aspose.medical.dicom.tags/tag/sequencingindicatortrialretired) | (0040,A060) VR=LO VM=1 Sequencing Indicator (Trial) (RETIRED). |
| static readonly [SeriesDate](../../aspose.medical.dicom.tags/tag/seriesdate) | (0008,0021) VR=DA VM=1 Series Date. |
| static readonly [SeriesDescription](../../aspose.medical.dicom.tags/tag/seriesdescription) | (0008,103E) VR=LO VM=1 Series Description. |
| static readonly [SeriesDescriptionCodeSequence](../../aspose.medical.dicom.tags/tag/seriesdescriptioncodesequence) | (0008,103F) VR=SQ VM=1 Series Description Code Sequence. |
| static readonly [SeriesInstanceUID](../../aspose.medical.dicom.tags/tag/seriesinstanceuid) | (0020,000E) VR=UI VM=1 Series Instance UID. |
| static readonly [SeriesInStudyRETIRED](../../aspose.medical.dicom.tags/tag/seriesinstudyretired) | (0020,1000) VR=IS VM=1 Series in Study (RETIRED). |
| static readonly [SeriesNumber](../../aspose.medical.dicom.tags/tag/seriesnumber) | (0020,0011) VR=IS VM=1 Series Number. |
| static readonly [SeriesTime](../../aspose.medical.dicom.tags/tag/seriestime) | (0008,0031) VR=TM VM=1 Series Time. |
| static readonly [SeriesType](../../aspose.medical.dicom.tags/tag/seriestype) | (0054,1000) VR=CS VM=2 Series Type. |
| static readonly [ServiceEpisodeDescription](../../aspose.medical.dicom.tags/tag/serviceepisodedescription) | (0038,0062) VR=LO VM=1 Service Episode Description. |
| static readonly [ServiceEpisodeID](../../aspose.medical.dicom.tags/tag/serviceepisodeid) | (0038,0060) VR=LO VM=1 Service Episode ID. |
| static readonly [SettlingPhaseFrame](../../aspose.medical.dicom.tags/tag/settlingphaseframe) | (0018,9624) VR=CS VM=1 Settling Phase Frame. |
| static readonly [SetupDeviceDescription](../../aspose.medical.dicom.tags/tag/setupdevicedescription) | (300A,01BA) VR=ST VM=1 Setup Device Description. |
| static readonly [SetupDeviceLabel](../../aspose.medical.dicom.tags/tag/setupdevicelabel) | (300A,01B8) VR=SH VM=1 Setup Device Label. |
| static readonly [SetupDeviceParameter](../../aspose.medical.dicom.tags/tag/setupdeviceparameter) | (300A,01BC) VR=DS VM=1 Setup Device Parameter. |
| static readonly [SetupDeviceSequence](../../aspose.medical.dicom.tags/tag/setupdevicesequence) | (300A,01B4) VR=SQ VM=1 Setup Device Sequence. |
| static readonly [SetupDeviceType](../../aspose.medical.dicom.tags/tag/setupdevicetype) | (300A,01B6) VR=CS VM=1 Setup Device Type. |
| static readonly [SetupImageComment](../../aspose.medical.dicom.tags/tag/setupimagecomment) | (300A,0402) VR=ST VM=1 Setup Image Comment. |
| static readonly [SetupReferenceDescription](../../aspose.medical.dicom.tags/tag/setupreferencedescription) | (300A,01D0) VR=ST VM=1 Setup Reference Description. |
| static readonly [SetupTechnique](../../aspose.medical.dicom.tags/tag/setuptechnique) | (300A,01B0) VR=CS VM=1 Setup Technique. |
| static readonly [SetupTechniqueDescription](../../aspose.medical.dicom.tags/tag/setuptechniquedescription) | (300A,01B2) VR=ST VM=1 Setup Technique Description. |
| static readonly [ShadingStyle](../../aspose.medical.dicom.tags/tag/shadingstyle) | (0070,1701) VR=CS VM=1 Shading Style. |
| static readonly [ShadowColorCIELabValue](../../aspose.medical.dicom.tags/tag/shadowcolorcielabvalue) | (0070,0247) VR=US VM=3 Shadow Color CIELab Value. |
| static readonly [ShadowOffsetX](../../aspose.medical.dicom.tags/tag/shadowoffsetx) | (0070,0245) VR=FL VM=1 Shadow Offset X. |
| static readonly [ShadowOffsetY](../../aspose.medical.dicom.tags/tag/shadowoffsety) | (0070,0246) VR=FL VM=1 Shadow Offset Y. |
| static readonly [ShadowOpacity](../../aspose.medical.dicom.tags/tag/shadowopacity) | (0070,0258) VR=FL VM=1 Shadow Opacity. |
| static readonly [ShadowStyle](../../aspose.medical.dicom.tags/tag/shadowstyle) | (0070,0244) VR=CS VM=1 Shadow Style. |
| static readonly [ShapeOfIndividualTurnRETIRED](../../aspose.medical.dicom.tags/tag/shapeofindividualturnretired) | (0014,6031) VR=CS VM=1 Shape of Individual Turn (RETIRED). |
| static readonly [ShapeType](../../aspose.medical.dicom.tags/tag/shapetype) | (0070,0306) VR=CS VM=1 Shape Type. |
| static readonly [SharedFunctionalGroupsSequence](../../aspose.medical.dicom.tags/tag/sharedfunctionalgroupssequence) | (5200,9229) VR=SQ VM=1 Shared Functional Groups Sequence. |
| static readonly [Sharpness](../../aspose.medical.dicom.tags/tag/sharpness) | (0016,004A) VR=US VM=1 Sharpness. |
| static readonly [ShieldingDeviceDescription](../../aspose.medical.dicom.tags/tag/shieldingdevicedescription) | (300A,01A6) VR=ST VM=1 Shielding Device Description. |
| static readonly [ShieldingDeviceLabel](../../aspose.medical.dicom.tags/tag/shieldingdevicelabel) | (300A,01A4) VR=SH VM=1 Shielding Device Label. |
| static readonly [ShieldingDevicePosition](../../aspose.medical.dicom.tags/tag/shieldingdeviceposition) | (300A,01A8) VR=SH VM=1 Shielding Device Position. |
| static readonly [ShieldingDeviceSequence](../../aspose.medical.dicom.tags/tag/shieldingdevicesequence) | (300A,01A0) VR=SQ VM=1 Shielding Device Sequence. |
| static readonly [ShieldingDeviceType](../../aspose.medical.dicom.tags/tag/shieldingdevicetype) | (300A,01A2) VR=CS VM=1 Shielding Device Type. |
| static readonly [ShiftTableSizeRETIRED](../../aspose.medical.dicom.tags/tag/shifttablesizeretired) | (1000,xxx4) VR=US VM=1 Shift Table Size (RETIRED). |
| static readonly [ShiftTableTripletRETIRED](../../aspose.medical.dicom.tags/tag/shifttabletripletretired) | (1000,xxx5) VR=US VM=3 Shift Table Triplet (RETIRED). |
| static readonly [Shininess](../../aspose.medical.dicom.tags/tag/shininess) | (0070,1706) VR=FD VM=1 Shininess. |
| static readonly [ShortTermFluctuation](../../aspose.medical.dicom.tags/tag/shorttermfluctuation) | (0024,0075) VR=FL VM=1 Short Term Fluctuation. |
| static readonly [ShortTermFluctuationCalculated](../../aspose.medical.dicom.tags/tag/shorttermfluctuationcalculated) | (0024,0074) VR=CS VM=1 Short Term Fluctuation Calculated. |
| static readonly [ShortTermFluctuationProbability](../../aspose.medical.dicom.tags/tag/shorttermfluctuationprobability) | (0024,0077) VR=FL VM=1 Short Term Fluctuation Probability. |
| static readonly [ShortTermFluctuationProbabilityCalculated](../../aspose.medical.dicom.tags/tag/shorttermfluctuationprobabilitycalculated) | (0024,0076) VR=CS VM=1 Short Term Fluctuation Probability Calculated. |
| static readonly [ShotDurationTime](../../aspose.medical.dicom.tags/tag/shotdurationtime) | (0080,0004) VR=FD VM=1 Shot Duration Time. |
| static readonly [ShotOffsetTime](../../aspose.medical.dicom.tags/tag/shotoffsettime) | (0080,0005) VR=FD VM=1 Shot Offset Time. |
| static readonly [ShowAcquisitionTechniquesFlag](../../aspose.medical.dicom.tags/tag/showacquisitiontechniquesflag) | (0072,0716) VR=CS VM=1 Show Acquisition Techniques Flag. |
| static readonly [ShowGraphicAnnotationFlag](../../aspose.medical.dicom.tags/tag/showgraphicannotationflag) | (0072,0712) VR=CS VM=1 Show Graphic Annotation Flag. |
| static readonly [ShowGrayscaleInverted](../../aspose.medical.dicom.tags/tag/showgrayscaleinverted) | (0072,0706) VR=CS VM=1 Show Grayscale Inverted. |
| static readonly [ShowImageTrueSizeFlag](../../aspose.medical.dicom.tags/tag/showimagetruesizeflag) | (0072,0710) VR=CS VM=1 Show Image True Size Flag. |
| static readonly [ShowPatientDemographicsFlag](../../aspose.medical.dicom.tags/tag/showpatientdemographicsflag) | (0072,0714) VR=CS VM=1 Show Patient Demographics Flag. |
| static readonly [ShowTickLabel](../../aspose.medical.dicom.tags/tag/showticklabel) | (0070,0278) VR=CS VM=1 Show Tick Label. |
| static readonly [ShutterLeftVerticalEdge](../../aspose.medical.dicom.tags/tag/shutterleftverticaledge) | (0018,1602) VR=IS VM=1 Shutter Left Vertical Edge. |
| static readonly [ShutterLowerHorizontalEdge](../../aspose.medical.dicom.tags/tag/shutterlowerhorizontaledge) | (0018,1608) VR=IS VM=1 Shutter Lower Horizontal Edge. |
| static readonly [ShutterOverlayGroup](../../aspose.medical.dicom.tags/tag/shutteroverlaygroup) | (0018,1623) VR=US VM=1 Shutter Overlay Group. |
| static readonly [ShutterPresentationColorCIELabValue](../../aspose.medical.dicom.tags/tag/shutterpresentationcolorcielabvalue) | (0018,1624) VR=US VM=3 Shutter Presentation Color CIELab Value. |
| static readonly [ShutterPresentationValue](../../aspose.medical.dicom.tags/tag/shutterpresentationvalue) | (0018,1622) VR=US VM=1 Shutter Presentation Value. |
| static readonly [ShutterRightVerticalEdge](../../aspose.medical.dicom.tags/tag/shutterrightverticaledge) | (0018,1604) VR=IS VM=1 Shutter Right Vertical Edge. |
| static readonly [ShutterShape](../../aspose.medical.dicom.tags/tag/shuttershape) | (0018,1600) VR=CS VM=1-3 Shutter Shape. |
| static readonly [ShutterSpeedValue](../../aspose.medical.dicom.tags/tag/shutterspeedvalue) | (0016,0021) VR=DS VM=1 Shutter Speed Value. |
| static readonly [ShutterUpperHorizontalEdge](../../aspose.medical.dicom.tags/tag/shutterupperhorizontaledge) | (0018,1606) VR=IS VM=1 Shutter Upper Horizontal Edge. |
| static readonly [SignalDomainColumns](../../aspose.medical.dicom.tags/tag/signaldomaincolumns) | (0028,9003) VR=CS VM=1 Signal Domain Columns. |
| static readonly [SignalDomainRows](../../aspose.medical.dicom.tags/tag/signaldomainrows) | (0028,9235) VR=CS VM=1 Signal Domain Rows. |
| static readonly [SignalToNoiseRatio](../../aspose.medical.dicom.tags/tag/signaltonoiseratio) | (0022,1155) VR=FL VM=1 Signal to Noise Ratio. |
| static readonly [Signature](../../aspose.medical.dicom.tags/tag/signature) | (0400,0120) VR=OB VM=1 Signature. |
| static readonly [SimpleFrameList](../../aspose.medical.dicom.tags/tag/simpleframelist) | (0008,1161) VR=UL VM=1-n Simple Frame List. |
| static readonly [SimulatedKeratometricCylinderSequence](../../aspose.medical.dicom.tags/tag/simulatedkeratometriccylindersequence) | (0046,0218) VR=SQ VM=1 Simulated Keratometric Cylinder Sequence. |
| static readonly [SingleCollimationWidth](../../aspose.medical.dicom.tags/tag/singlecollimationwidth) | (0018,9306) VR=FD VM=1 Single Collimation Width. |
| static readonly [SizeOfIndividualTurnRETIRED](../../aspose.medical.dicom.tags/tag/sizeofindividualturnretired) | (0014,6032) VR=DS VM=1-n Size of Individual Turn (RETIRED). |
| static readonly [SkipBeats](../../aspose.medical.dicom.tags/tag/skipbeats) | (0018,1086) VR=IS VM=1 Skip Beats. |
| static readonly [SkipFrameRangeFlag](../../aspose.medical.dicom.tags/tag/skipframerangeflag) | (0008,9460) VR=CS VM=1 Skip Frame Range Flag. |
| static readonly [SlabOrientation](../../aspose.medical.dicom.tags/tag/slaborientation) | (0018,9105) VR=FD VM=3 Slab Orientation. |
| static readonly [SlabThickness](../../aspose.medical.dicom.tags/tag/slabthickness) | (0018,9104) VR=FD VM=1 Slab Thickness. |
| static readonly [SliceLocation](../../aspose.medical.dicom.tags/tag/slicelocation) | (0020,1041) VR=DS VM=1 Slice Location. |
| static readonly [SliceLocationVector](../../aspose.medical.dicom.tags/tag/slicelocationvector) | (0018,2005) VR=DS VM=1-n Slice Location Vector. |
| static readonly [SliceProgressionDirection](../../aspose.medical.dicom.tags/tag/sliceprogressiondirection) | (0054,0500) VR=CS VM=1 Slice Progression Direction. |
| static readonly [SliceSensitivityFactor](../../aspose.medical.dicom.tags/tag/slicesensitivityfactor) | (0054,1320) VR=DS VM=1 Slice Sensitivity Factor. |
| static readonly [SliceThickness](../../aspose.medical.dicom.tags/tag/slicethickness) | (0018,0050) VR=DS VM=1 Slice Thickness. |
| static readonly [SliceVector](../../aspose.medical.dicom.tags/tag/slicevector) | (0054,0080) VR=US VM=1-n Slice Vector. |
| static readonly [SlideIdentifierRETIRED](../../aspose.medical.dicom.tags/tag/slideidentifierretired) | (0040,06FA) VR=LO VM=1 Slide Identifier (RETIRED). |
| static readonly [SmallestImagePixelValue](../../aspose.medical.dicom.tags/tag/smallestimagepixelvalue) | (0028,0106) VR=US or SS VM=1 Smallest Image Pixel Value. |
| static readonly [SmallestImagePixelValueInPlaneRETIRED](../../aspose.medical.dicom.tags/tag/smallestimagepixelvalueinplaneretired) | (0028,0110) VR=US or SS VM=1 Smallest Image Pixel Value in Plane (RETIRED). |
| static readonly [SmallestPixelValueInSeries](../../aspose.medical.dicom.tags/tag/smallestpixelvalueinseries) | (0028,0108) VR=US or SS VM=1 Smallest Pixel Value in Series. |
| static readonly [SmallestValidPixelValueRETIRED](../../aspose.medical.dicom.tags/tag/smallestvalidpixelvalueretired) | (0028,0104) VR=US or SS VM=1 Smallest Valid Pixel Value (RETIRED). |
| static readonly [SmokingStatus](../../aspose.medical.dicom.tags/tag/smokingstatus) | (0010,21A0) VR=CS VM=1 Smoking Status. |
| static readonly [SmoothingType](../../aspose.medical.dicom.tags/tag/smoothingtype) | (2010,0080) VR=CS VM=1 Smoothing Type. |
| static readonly [SnoutID](../../aspose.medical.dicom.tags/tag/snoutid) | (300A,030F) VR=SH VM=1 Snout ID. |
| static readonly [SnoutPosition](../../aspose.medical.dicom.tags/tag/snoutposition) | (300A,030D) VR=FL VM=1 Snout Position. |
| static readonly [SnoutPositionTolerance](../../aspose.medical.dicom.tags/tag/snoutpositiontolerance) | (300A,004B) VR=FL VM=1 Snout Position Tolerance. |
| static readonly [SnoutSequence](../../aspose.medical.dicom.tags/tag/snoutsequence) | (300A,030C) VR=SQ VM=1 Snout Sequence. |
| static readonly [SNRThresholdRETIRED](../../aspose.medical.dicom.tags/tag/snrthresholdretired) | (4010,1073) VR=FD VM=1 SNR Threshold (RETIRED). |
| static readonly [SoftcopyVOILUTSequence](../../aspose.medical.dicom.tags/tag/softcopyvoilutsequence) | (0028,3110) VR=SQ VM=1 Softcopy VOI LUT Sequence. |
| static readonly [SoftTissueFocusThermalIndex](../../aspose.medical.dicom.tags/tag/softtissuefocusthermalindex) | (0018,5028) VR=DS VM=1 Soft Tissue-focus Thermal Index. |
| static readonly [SoftTissueSurfaceThermalIndex](../../aspose.medical.dicom.tags/tag/softtissuesurfacethermalindex) | (0018,5029) VR=DS VM=1 Soft Tissue-surface Thermal Index. |
| static readonly [SoftTissueThermalIndex](../../aspose.medical.dicom.tags/tag/softtissuethermalindex) | (0018,5027) VR=DS VM=1 Soft Tissue Thermal Index. |
| static readonly [SoftwareVersions](../../aspose.medical.dicom.tags/tag/softwareversions) | (0018,1020) VR=LO VM=1-n Software Versions. |
| static readonly [SOPAuthorizationComment](../../aspose.medical.dicom.tags/tag/sopauthorizationcomment) | (0100,0424) VR=LT VM=1 SOP Authorization Comment. |
| static readonly [SOPAuthorizationDateTime](../../aspose.medical.dicom.tags/tag/sopauthorizationdatetime) | (0100,0420) VR=DT VM=1 SOP Authorization DateTime. |
| static readonly [SOPClassesInStudy](../../aspose.medical.dicom.tags/tag/sopclassesinstudy) | (0008,0062) VR=UI VM=1-n SOP Classes in Study. |
| static readonly [SOPClassesSupported](../../aspose.medical.dicom.tags/tag/sopclassessupported) | (0008,115A) VR=UI VM=1-n SOP Classes Supported. |
| static readonly [SOPClassUID](../../aspose.medical.dicom.tags/tag/sopclassuid) | (0008,0016) VR=UI VM=1 SOP Class UID. |
| static readonly [SOPInstanceStatus](../../aspose.medical.dicom.tags/tag/sopinstancestatus) | (0100,0410) VR=CS VM=1 SOP Instance Status. |
| static readonly [SOPInstanceUID](../../aspose.medical.dicom.tags/tag/sopinstanceuid) | (0008,0018) VR=UI VM=1 SOP Instance UID. |
| static readonly [SOPInstanceUIDOfConcatenationSource](../../aspose.medical.dicom.tags/tag/sopinstanceuidofconcatenationsource) | (0020,0242) VR=UI VM=1 SOP Instance UID of Concatenation Source. |
| static readonly [SortByCategory](../../aspose.medical.dicom.tags/tag/sortbycategory) | (0072,0602) VR=CS VM=1 Sort-by Category. |
| static readonly [SortingDirection](../../aspose.medical.dicom.tags/tag/sortingdirection) | (0072,0604) VR=CS VM=1 Sorting Direction. |
| static readonly [SortingOperationsSequence](../../aspose.medical.dicom.tags/tag/sortingoperationssequence) | (0072,0600) VR=SQ VM=1 Sorting Operations Sequence. |
| static readonly [SoundPathLengthRETIRED](../../aspose.medical.dicom.tags/tag/soundpathlengthretired) | (0014,405A) VR=DS VM=1 Sound Path Length (RETIRED). |
| static readonly [SoundSpeedCorrectionMechanismCodeSequence](../../aspose.medical.dicom.tags/tag/soundspeedcorrectionmechanismcodesequence) | (0018,9832) VR=SQ VM=1 Sound Speed Correction Mechanism Code Sequence. |
| static readonly [SourceAcquisitionBeamNumber](../../aspose.medical.dicom.tags/tag/sourceacquisitionbeamnumber) | (0018,9939) VR=US VM=1-n Source Acquisition Beam Number. |
| static readonly [SourceAcquisitionProtocolElementNumber](../../aspose.medical.dicom.tags/tag/sourceacquisitionprotocolelementnumber) | (0018,9938) VR=US VM=1-n Source Acquisition Protocol Element Number. |
| static readonly [SourceApplicationEntityTitle](../../aspose.medical.dicom.tags/tag/sourceapplicationentitytitle) | (0002,0016) VR=AE VM=1 Source Application Entity Title. |
| static readonly [SourceApplicatorID](../../aspose.medical.dicom.tags/tag/sourceapplicatorid) | (300A,0291) VR=SH VM=1 Source Applicator ID. |
| static readonly [SourceApplicatorLength](../../aspose.medical.dicom.tags/tag/sourceapplicatorlength) | (300A,0296) VR=DS VM=1 Source Applicator Length. |
| static readonly [SourceApplicatorManufacturer](../../aspose.medical.dicom.tags/tag/sourceapplicatormanufacturer) | (300A,0298) VR=LO VM=1 Source Applicator Manufacturer. |
| static readonly [SourceApplicatorName](../../aspose.medical.dicom.tags/tag/sourceapplicatorname) | (300A,0294) VR=LO VM=1 Source Applicator Name. |
| static readonly [SourceApplicatorNumber](../../aspose.medical.dicom.tags/tag/sourceapplicatornumber) | (300A,0290) VR=IS VM=1 Source Applicator Number. |
| static readonly [SourceApplicatorStepSize](../../aspose.medical.dicom.tags/tag/sourceapplicatorstepsize) | (300A,02A0) VR=DS VM=1 Source Applicator Step Size. |
| static readonly [SourceApplicatorTipLength](../../aspose.medical.dicom.tags/tag/sourceapplicatortiplength) | (300A,0274) VR=DS VM=1 Source Applicator Tip Length. |
| static readonly [SourceApplicatorType](../../aspose.medical.dicom.tags/tag/sourceapplicatortype) | (300A,0292) VR=CS VM=1 Source Applicator Type. |
| static readonly [SourceApplicatorWallNominalThickness](../../aspose.medical.dicom.tags/tag/sourceapplicatorwallnominalthickness) | (300A,029C) VR=DS VM=1 Source Applicator Wall Nominal Thickness. |
| static readonly [SourceApplicatorWallNominalTransmission](../../aspose.medical.dicom.tags/tag/sourceapplicatorwallnominaltransmission) | (300A,029E) VR=DS VM=1 Source Applicator Wall Nominal Transmission. |
| static readonly [SourceAxisDistance](../../aspose.medical.dicom.tags/tag/sourceaxisdistance) | (300A,00B4) VR=DS VM=1 Source-Axis Distance. |
| static readonly [SourceConceptualVolumeSequence](../../aspose.medical.dicom.tags/tag/sourceconceptualvolumesequence) | (3010,0018) VR=SQ VM=1 Source Conceptual Volume Sequence. |
| static readonly [SourceConceptualVolumeUID](../../aspose.medical.dicom.tags/tag/sourceconceptualvolumeuid) | (3010,0015) VR=UI VM=1 Source Conceptual Volume UID. |
| static readonly [SourceDescription](../../aspose.medical.dicom.tags/tag/sourcedescription) | (300A,021C) VR=LO VM=1 Source Description. |
| static readonly [SourceEncapsulationNominalThickness](../../aspose.medical.dicom.tags/tag/sourceencapsulationnominalthickness) | (300A,0222) VR=DS VM=1 Source Encapsulation Nominal Thickness. |
| static readonly [SourceEncapsulationNominalTransmission](../../aspose.medical.dicom.tags/tag/sourceencapsulationnominaltransmission) | (300A,0224) VR=DS VM=1 Source Encapsulation Nominal Transmission. |
| static readonly [SourceEndDateTime](../../aspose.medical.dicom.tags/tag/sourceenddatetime) | (0018,936A) VR=DT VM=1 Source End DateTime. |
| static readonly [SourceFrameOfReferenceUID](../../aspose.medical.dicom.tags/tag/sourceframeofreferenceuid) | (0064,0003) VR=UI VM=1 Source Frame of Reference UID. |
| static readonly [SourceHangingProtocolSequence](../../aspose.medical.dicom.tags/tag/sourcehangingprotocolsequence) | (0072,0012) VR=SQ VM=1 Source Hanging Protocol Sequence. |
| static readonly [SourceHorizontalPitchRETIRED](../../aspose.medical.dicom.tags/tag/sourcehorizontalpitchretired) | (0014,6008) VR=DS VM=1 Source Horizontal Pitch (RETIRED). |
| static readonly [SourceHorizontalScanSpeedRETIRED](../../aspose.medical.dicom.tags/tag/sourcehorizontalscanspeedretired) | (0014,600A) VR=DS VM=1 Source Horizontal Scan Speed (RETIRED). |
| static readonly [SourceIdentifier](../../aspose.medical.dicom.tags/tag/sourceidentifier) | (0034,0005) VR=OB VM=1 Source Identifier. |
| static readonly [SourceImageCornealProcessedDataSequence](../../aspose.medical.dicom.tags/tag/sourceimagecornealprocesseddatasequence) | (0046,0244) VR=SQ VM=1 Source Image Corneal Processed Data Sequence. |
| static readonly [SourceImageEvidenceSequence](../../aspose.medical.dicom.tags/tag/sourceimageevidencesequence) | (0008,9154) VR=SQ VM=1 Source Image Evidence Sequence. |
| static readonly [SourceImageIDsRETIRED](../../aspose.medical.dicom.tags/tag/sourceimageidsretired) | (0020,31xx) VR=CS VM=1-n Source Image IDs (RETIRED). |
| static readonly [SourceImageSequence](../../aspose.medical.dicom.tags/tag/sourceimagesequence) | (0008,2112) VR=SQ VM=1 Source Image Sequence. |
| static readonly [SourceInstanceSequence](../../aspose.medical.dicom.tags/tag/sourceinstancesequence) | (0042,0013) VR=SQ VM=1 Source Instance Sequence. |
| static readonly [SourceIrradiationEventSequence](../../aspose.medical.dicom.tags/tag/sourceirradiationeventsequence) | (0008,3011) VR=SQ VM=1 Source Irradiation Event Sequence. |
| static readonly [SourceIsotopeHalfLife](../../aspose.medical.dicom.tags/tag/sourceisotopehalflife) | (300A,0228) VR=DS VM=1 Source Isotope Half Life. |
| static readonly [SourceIsotopeName](../../aspose.medical.dicom.tags/tag/sourceisotopename) | (300A,0226) VR=LO VM=1 Source Isotope Name. |
| static readonly [SourceManufacturer](../../aspose.medical.dicom.tags/tag/sourcemanufacturer) | (300A,0216) VR=LO VM=1 Source Manufacturer. |
| static readonly [SourceModelID](../../aspose.medical.dicom.tags/tag/sourcemodelid) | (300A,021B) VR=SH VM=1 Source Model ID. |
| static readonly [SourceMovementType](../../aspose.medical.dicom.tags/tag/sourcemovementtype) | (300A,0288) VR=CS VM=1 Source Movement Type. |
| static readonly [SourceNumber](../../aspose.medical.dicom.tags/tag/sourcenumber) | (300A,0212) VR=IS VM=1 Source Number. |
| static readonly [SourceOfAnteriorChamberDepthDataCodeSequence](../../aspose.medical.dicom.tags/tag/sourceofanteriorchamberdepthdatacodesequence) | (0022,1133) VR=SQ VM=1 Source of Anterior Chamber Depth Data Code Sequence. |
| static readonly [SourceOfCornealSizeDataCodeSequence](../../aspose.medical.dicom.tags/tag/sourceofcornealsizedatacodesequence) | (0022,1036) VR=SQ VM=1 Source of Corneal Size Data Code Sequence. |
| static readonly [SourceOfCorneaMeasurementDataCodeSequence](../../aspose.medical.dicom.tags/tag/sourceofcorneameasurementdatacodesequence) | (0046,0111) VR=SQ VM=1 Source of Cornea Measurement Data Code Sequence. |
| static readonly [SourceOfLensThicknessDataCodeSequence](../../aspose.medical.dicom.tags/tag/sourceoflensthicknessdatacodesequence) | (0022,1132) VR=SQ VM=1 Source of Lens Thickness Data Code Sequence. |
| static readonly [SourceOfOphthalmicAxialLengthCodeSequence](../../aspose.medical.dicom.tags/tag/sourceofophthalmicaxiallengthcodesequence) | (0022,1035) VR=SQ VM=1 Source of Ophthalmic Axial Length Code Sequence. |
| static readonly [SourceOfPreviousValues](../../aspose.medical.dicom.tags/tag/sourceofpreviousvalues) | (0400,0564) VR=LO VM=1 Source of Previous Values. |
| static readonly [SourceOfRefractiveMeasurementsCodeSequence](../../aspose.medical.dicom.tags/tag/sourceofrefractivemeasurementscodesequence) | (0022,1135) VR=SQ VM=1 Source of Refractive Measurements Code Sequence. |
| static readonly [SourceOfRefractiveMeasurementsSequence](../../aspose.medical.dicom.tags/tag/sourceofrefractivemeasurementssequence) | (0022,1134) VR=SQ VM=1 Source of Refractive Measurements Sequence. |
| static readonly [SourceOrientationRETIRED](../../aspose.medical.dicom.tags/tag/sourceorientationretired) | (4010,1060) VR=FL VM=3 Source Orientation (RETIRED). |
| static readonly [SourcePatientGroupIdentificationSequence](../../aspose.medical.dicom.tags/tag/sourcepatientgroupidentificationsequence) | (0010,0026) VR=SQ VM=1 Source Patient Group Identification Sequence. |
| static readonly [SourcePixelPlanesCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/sourcepixelplanescharacteristicssequence) | (3006,004A) VR=SQ VM=1 Source Pixel Planes Characteristics Sequence. |
| static readonly [SourcePositionRETIRED](../../aspose.medical.dicom.tags/tag/sourcepositionretired) | (4010,1061) VR=FL VM=3 Source Position (RETIRED). |
| static readonly [SourcePresentationAddress](../../aspose.medical.dicom.tags/tag/sourcepresentationaddress) | (0002,0026) VR=UR VM=1 Source Presentation Address. |
| static readonly [SourceReconstructionProtocolElementNumber](../../aspose.medical.dicom.tags/tag/sourcereconstructionprotocolelementnumber) | (0018,993A) VR=US VM=1-n Source Reconstruction Protocol Element Number. |
| static readonly [SourceRollAngle](../../aspose.medical.dicom.tags/tag/sourcerollangle) | (300A,067A) VR=FD VM=1 Source Roll Angle. |
| static readonly [SourceSequence](../../aspose.medical.dicom.tags/tag/sourcesequence) | (300A,0210) VR=SQ VM=1 Source Sequence. |
| static readonly [SourceSerialNumber](../../aspose.medical.dicom.tags/tag/sourceserialnumber) | (3008,0105) VR=LO VM=1 Source Serial Number. |
| static readonly [SourceSeriesInformationSequence](../../aspose.medical.dicom.tags/tag/sourceseriesinformationsequence) | (3006,004C) VR=SQ VM=1 Source Series Information Sequence. |
| static readonly [SourceSeriesSequence](../../aspose.medical.dicom.tags/tag/sourceseriessequence) | (3006,004B) VR=SQ VM=1 Source Series Sequence. |
| static readonly [SourceStartDateTime](../../aspose.medical.dicom.tags/tag/sourcestartdatetime) | (0018,9369) VR=DT VM=1 Source Start DateTime. |
| static readonly [SourceStrength](../../aspose.medical.dicom.tags/tag/sourcestrength) | (300A,022B) VR=DS VM=1 Source Strength. |
| static readonly [SourceStrengthReferenceDate](../../aspose.medical.dicom.tags/tag/sourcestrengthreferencedate) | (300A,022C) VR=DA VM=1 Source Strength Reference Date. |
| static readonly [SourceStrengthReferenceTime](../../aspose.medical.dicom.tags/tag/sourcestrengthreferencetime) | (300A,022E) VR=TM VM=1 Source Strength Reference Time. |
| static readonly [SourceStrengthUnits](../../aspose.medical.dicom.tags/tag/sourcestrengthunits) | (300A,0229) VR=CS VM=1 Source Strength Units. |
| static readonly [SourceToApplicatorMountingPositionDistance](../../aspose.medical.dicom.tags/tag/sourcetoapplicatormountingpositiondistance) | (300A,0436) VR=FL VM=1 Source to Applicator Mounting Position Distance. |
| static readonly [SourceToBeamLimitingDeviceDistance](../../aspose.medical.dicom.tags/tag/sourcetobeamlimitingdevicedistance) | (300A,00BA) VR=DS VM=1 Source to Beam Limiting Device Distance. |
| static readonly [SourceToBlockTrayDistance](../../aspose.medical.dicom.tags/tag/sourcetoblocktraydistance) | (300A,00F6) VR=DS VM=1 Source to Block Tray Distance. |
| static readonly [SourceToCompensatorDistance](../../aspose.medical.dicom.tags/tag/sourcetocompensatordistance) | (300A,02E2) VR=DS VM=1-n Source to Compensator Distance. |
| static readonly [SourceToCompensatorTrayDistance](../../aspose.medical.dicom.tags/tag/sourcetocompensatortraydistance) | (300A,00E6) VR=DS VM=1 Source to Compensator Tray Distance. |
| static readonly [SourceToExternalContourDistance](../../aspose.medical.dicom.tags/tag/sourcetoexternalcontourdistance) | (300A,0132) VR=FL VM=1 Source to External Contour Distance. |
| static readonly [SourceToGeneralAccessoryDistance](../../aspose.medical.dicom.tags/tag/sourcetogeneralaccessorydistance) | (300A,0425) VR=FL VM=1 Source to General Accessory Distance. |
| static readonly [SourceToPatientSurfaceDistance](../../aspose.medical.dicom.tags/tag/sourcetopatientsurfacedistance) | (300A,0634) VR=FD VM=1 Source to Patient Surface Distance. |
| static readonly [SourceToReferenceObjectDistance](../../aspose.medical.dicom.tags/tag/sourcetoreferenceobjectdistance) | (3002,0028) VR=DS VM=1 Source to Reference Object Distance. |
| static readonly [SourceToSurfaceDistance](../../aspose.medical.dicom.tags/tag/sourcetosurfacedistance) | (300A,0130) VR=DS VM=1 Source to Surface Distance. |
| static readonly [SourceToWedgeTrayDistance](../../aspose.medical.dicom.tags/tag/sourcetowedgetraydistance) | (300A,00DA) VR=DS VM=1 Source to Wedge Tray Distance. |
| static readonly [SourceType](../../aspose.medical.dicom.tags/tag/sourcetype) | (300A,0214) VR=CS VM=1 Source Type. |
| static readonly [SourceVerticalPitchRETIRED](../../aspose.medical.dicom.tags/tag/sourceverticalpitchretired) | (0014,6009) VR=DS VM=1 Source Vertical Pitch (RETIRED). |
| static readonly [SourceWaveformSequence](../../aspose.medical.dicom.tags/tag/sourcewaveformsequence) | (003A,020A) VR=SQ VM=1 Source Waveform Sequence. |
| static readonly [SpacingBetweenSlices](../../aspose.medical.dicom.tags/tag/spacingbetweenslices) | (0018,0088) VR=DS VM=1 Spacing Between Slices. |
| static readonly [SpatialFilteringParametersSequenceRETIRED](../../aspose.medical.dicom.tags/tag/spatialfilteringparameterssequenceretired) | (0014,6052) VR=SQ VM=1 Spatial Filtering Parameters Sequence (RETIRED). |
| static readonly [SpatialFilteringSchemeRETIRED](../../aspose.medical.dicom.tags/tag/spatialfilteringschemeretired) | (0014,6053) VR=CS VM=1 Spatial Filtering Scheme (RETIRED). |
| static readonly [SpatialFrequencyResponseColumnNames](../../aspose.medical.dicom.tags/tag/spatialfrequencyresponsecolumnnames) | (0016,000C) VR=UC VM=1-n Spatial Frequency Response Column Names. |
| static readonly [SpatialFrequencyResponseColumns](../../aspose.medical.dicom.tags/tag/spatialfrequencyresponsecolumns) | (0016,000B) VR=IS VM=1 Spatial Frequency Response Columns. |
| static readonly [SpatialFrequencyResponseRows](../../aspose.medical.dicom.tags/tag/spatialfrequencyresponserows) | (0016,000A) VR=IS VM=1 Spatial Frequency Response Rows. |
| static readonly [SpatialFrequencyResponseValues](../../aspose.medical.dicom.tags/tag/spatialfrequencyresponsevalues) | (0016,000D) VR=DS VM=1-n Spatial Frequency Response Values. |
| static readonly [SpatialLocationsPreserved](../../aspose.medical.dicom.tags/tag/spatiallocationspreserved) | (0028,135A) VR=CS VM=1 Spatial Locations Preserved. |
| static readonly [SpatialPresaturation](../../aspose.medical.dicom.tags/tag/spatialpresaturation) | (0018,9027) VR=CS VM=1 Spatial Pre-saturation. |
| static readonly [SpatialResolution](../../aspose.medical.dicom.tags/tag/spatialresolution) | (0018,1050) VR=DS VM=1 Spatial Resolution. |
| static readonly [SpatialTransformOfDose](../../aspose.medical.dicom.tags/tag/spatialtransformofdose) | (3004,0005) VR=CS VM=1 Spatial Transform of Dose. |
| static readonly [SpecialNeeds](../../aspose.medical.dicom.tags/tag/specialneeds) | (0038,0050) VR=LO VM=1 Special Needs. |
| static readonly [SpecificAbsorptionRateDefinition](../../aspose.medical.dicom.tags/tag/specificabsorptionratedefinition) | (0018,9179) VR=CS VM=1 Specific Absorption Rate Definition. |
| static readonly [SpecificAbsorptionRateSequence](../../aspose.medical.dicom.tags/tag/specificabsorptionratesequence) | (0018,9239) VR=SQ VM=1 Specific Absorption Rate Sequence. |
| static readonly [SpecificAbsorptionRateValue](../../aspose.medical.dicom.tags/tag/specificabsorptionratevalue) | (0018,9181) VR=FD VM=1 Specific Absorption Rate Value. |
| static readonly [SpecificationSelectionGuidance](../../aspose.medical.dicom.tags/tag/specificationselectionguidance) | (0082,0033) VR=UT VM=1 Specification Selection Guidance. |
| static readonly [SpecificCharacterSet](../../aspose.medical.dicom.tags/tag/specificcharacterset) | (0008,0005) VR=CS VM=1-n Specific Character Set. |
| static readonly [SpecificCharacterSetOfFileSetDescriptorFile](../../aspose.medical.dicom.tags/tag/specificcharactersetoffilesetdescriptorfile) | (0004,1142) VR=CS VM=1 Specific Character Set of File-set Descriptor File. |
| static readonly [SpecificHeatOfInspectionSurfaceRETIRED](../../aspose.medical.dicom.tags/tag/specificheatofinspectionsurfaceretired) | (0014,6048) VR=DS VM=1 Specific Heat of Inspection Surface (RETIRED). |
| static readonly [SpecifiedChannelTotalTime](../../aspose.medical.dicom.tags/tag/specifiedchanneltotaltime) | (3008,0132) VR=DS VM=1 Specified Channel Total Time. |
| static readonly [SpecifiedMeterset](../../aspose.medical.dicom.tags/tag/specifiedmeterset) | (3008,0042) VR=DS VM=1 Specified Meterset. |
| static readonly [SpecifiedNumberOfPulses](../../aspose.medical.dicom.tags/tag/specifiednumberofpulses) | (3008,0136) VR=IS VM=1 Specified Number of Pulses. |
| static readonly [SpecifiedPrimaryMeterset](../../aspose.medical.dicom.tags/tag/specifiedprimarymeterset) | (3008,0032) VR=DS VM=1 Specified Primary Meterset. |
| static readonly [SpecifiedPulseRepetitionInterval](../../aspose.medical.dicom.tags/tag/specifiedpulserepetitioninterval) | (3008,013A) VR=DS VM=1 Specified Pulse Repetition Interval. |
| static readonly [SpecifiedSecondaryMeterset](../../aspose.medical.dicom.tags/tag/specifiedsecondarymeterset) | (3008,0033) VR=DS VM=1 Specified Secondary Meterset. |
| static readonly [SpecifiedTreatmentTime](../../aspose.medical.dicom.tags/tag/specifiedtreatmenttime) | (3008,003A) VR=DS VM=1 Specified Treatment Time. |
| static readonly [SpecimenAccessionNumberRETIRED](../../aspose.medical.dicom.tags/tag/specimenaccessionnumberretired) | (0040,050A) VR=LO VM=1 Specimen Accession Number (RETIRED). |
| static readonly [SpecimenDescriptionSequence](../../aspose.medical.dicom.tags/tag/specimendescriptionsequence) | (0040,0560) VR=SQ VM=1 Specimen Description Sequence. |
| static readonly [SpecimenDescriptionSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/specimendescriptionsequencetrialretired) | (0040,0552) VR=SQ VM=1 Specimen Description Sequence (Trial) (RETIRED). |
| static readonly [SpecimenDescriptionTrialRETIRED](../../aspose.medical.dicom.tags/tag/specimendescriptiontrialretired) | (0040,0553) VR=ST VM=1 Specimen Description (Trial) (RETIRED). |
| static readonly [SpecimenDetailedDescription](../../aspose.medical.dicom.tags/tag/specimendetaileddescription) | (0040,0602) VR=UT VM=1 Specimen Detailed Description. |
| static readonly [SpecimenIdentifier](../../aspose.medical.dicom.tags/tag/specimenidentifier) | (0040,0551) VR=LO VM=1 Specimen Identifier. |
| static readonly [SpecimenLabelInImage](../../aspose.medical.dicom.tags/tag/specimenlabelinimage) | (0048,0010) VR=CS VM=1 Specimen Label in Image. |
| static readonly [SpecimenLocalizationContentItemSequence](../../aspose.medical.dicom.tags/tag/specimenlocalizationcontentitemsequence) | (0040,0620) VR=SQ VM=1 Specimen Localization Content Item Sequence. |
| static readonly [SpecimenPreparationSequence](../../aspose.medical.dicom.tags/tag/specimenpreparationsequence) | (0040,0610) VR=SQ VM=1 Specimen Preparation Sequence. |
| static readonly [SpecimenPreparationStepContentItemSequence](../../aspose.medical.dicom.tags/tag/specimenpreparationstepcontentitemsequence) | (0040,0612) VR=SQ VM=1 Specimen Preparation Step Content Item Sequence. |
| static readonly [SpecimenReferenceSequence](../../aspose.medical.dicom.tags/tag/specimenreferencesequence) | (0048,0110) VR=SQ VM=1 Specimen Reference Sequence. |
| static readonly [SpecimenSequenceRETIRED](../../aspose.medical.dicom.tags/tag/specimensequenceretired) | (0040,0550) VR=SQ VM=1 Specimen Sequence (RETIRED). |
| static readonly [SpecimenShortDescription](../../aspose.medical.dicom.tags/tag/specimenshortdescription) | (0040,0600) VR=LO VM=1 Specimen Short Description. |
| static readonly [SpecimenTypeCodeSequence](../../aspose.medical.dicom.tags/tag/specimentypecodesequence) | (0040,059A) VR=SQ VM=1 Specimen Type Code Sequence. |
| static readonly [SpecimenUID](../../aspose.medical.dicom.tags/tag/specimenuid) | (0040,0554) VR=UI VM=1 Specimen UID. |
| static readonly [SpectrallySelectedExcitation](../../aspose.medical.dicom.tags/tag/spectrallyselectedexcitation) | (0018,9026) VR=CS VM=1 Spectrally Selected Excitation. |
| static readonly [SpectrallySelectedSuppression](../../aspose.medical.dicom.tags/tag/spectrallyselectedsuppression) | (0018,9025) VR=CS VM=1 Spectrally Selected Suppression. |
| static readonly [SpectralSensitivity](../../aspose.medical.dicom.tags/tag/spectralsensitivity) | (0016,0017) VR=UT VM=1 Spectral Sensitivity. |
| static readonly [SpectralWidth](../../aspose.medical.dicom.tags/tag/spectralwidth) | (0018,9052) VR=FD VM=1-2 Spectral Width. |
| static readonly [SpectroscopyAcquisitionDataColumns](../../aspose.medical.dicom.tags/tag/spectroscopyacquisitiondatacolumns) | (0018,9127) VR=UL VM=1 Spectroscopy Acquisition Data Columns. |
| static readonly [SpectroscopyAcquisitionOutOfPlanePhaseSteps](../../aspose.medical.dicom.tags/tag/spectroscopyacquisitionoutofplanephasesteps) | (0018,9159) VR=UL VM=1 Spectroscopy Acquisition Out-of-plane Phase Steps. |
| static readonly [SpectroscopyAcquisitionPhaseColumns](../../aspose.medical.dicom.tags/tag/spectroscopyacquisitionphasecolumns) | (0018,9234) VR=UL VM=1 Spectroscopy Acquisition Phase Columns. |
| static readonly [SpectroscopyAcquisitionPhaseRows](../../aspose.medical.dicom.tags/tag/spectroscopyacquisitionphaserows) | (0018,9095) VR=UL VM=1 Spectroscopy Acquisition Phase Rows. |
| static readonly [SpectroscopyData](../../aspose.medical.dicom.tags/tag/spectroscopydata) | (5600,0020) VR=OF VM=1 Spectroscopy Data. |
| static readonly [SpecularReflectionIntensity](../../aspose.medical.dicom.tags/tag/specularreflectionintensity) | (0070,1705) VR=FD VM=1 Specular Reflection Intensity. |
| static readonly [SpherePower](../../aspose.medical.dicom.tags/tag/spherepower) | (0046,0146) VR=FD VM=1 Sphere Power. |
| static readonly [SphericalLensPower](../../aspose.medical.dicom.tags/tag/sphericallenspower) | (0022,0007) VR=FL VM=1 Spherical Lens Power. |
| static readonly [SpiralPitchFactor](../../aspose.medical.dicom.tags/tag/spiralpitchfactor) | (0018,9311) VR=FD VM=1 Spiral Pitch Factor. |
| static readonly [Spoiling](../../aspose.medical.dicom.tags/tag/spoiling) | (0018,9016) VR=CS VM=1 Spoiling. |
| static readonly [StackID](../../aspose.medical.dicom.tags/tag/stackid) | (0020,9056) VR=SH VM=1 Stack ID. |
| static readonly [StageCodeSequence](../../aspose.medical.dicom.tags/tag/stagecodesequence) | (0040,000A) VR=SQ VM=1 Stage Code Sequence. |
| static readonly [StageName](../../aspose.medical.dicom.tags/tag/stagename) | (0008,2120) VR=SH VM=1 Stage Name. |
| static readonly [StageNumber](../../aspose.medical.dicom.tags/tag/stagenumber) | (0008,2122) VR=IS VM=1 Stage Number. |
| static readonly [StandardOutputSensitivity](../../aspose.medical.dicom.tags/tag/standardoutputsensitivity) | (0016,001B) VR=IS VM=1 Standard Output Sensitivity. |
| static readonly [StartAcquisitionDateTime](../../aspose.medical.dicom.tags/tag/startacquisitiondatetime) | (0018,9516) VR=DT VM=1 Start Acquisition DateTime. |
| static readonly [StartAngle](../../aspose.medical.dicom.tags/tag/startangle) | (0054,0200) VR=DS VM=1 Start Angle. |
| static readonly [StartCardiacTriggerCountThreshold](../../aspose.medical.dicom.tags/tag/startcardiactriggercountthreshold) | (0018,9717) VR=FD VM=1 Start Cardiac Trigger Count Threshold. |
| static readonly [StartCumulativeMeterset](../../aspose.medical.dicom.tags/tag/startcumulativemeterset) | (3002,0106) VR=FD VM=1 Start Cumulative Meterset. |
| static readonly [StartCumulativeMetersetWeight](../../aspose.medical.dicom.tags/tag/startcumulativemetersetweight) | (300C,0008) VR=DS VM=1 Start Cumulative Meterset Weight. |
| static readonly [StartCumulativeTimeWeight](../../aspose.medical.dicom.tags/tag/startcumulativetimeweight) | (0074,1407) VR=DS VM=1 Start Cumulative Time Weight. |
| static readonly [StartDensityThreshold](../../aspose.medical.dicom.tags/tag/startdensitythreshold) | (0018,9715) VR=FD VM=1 Start Density Threshold. |
| static readonly [StartingMetersetValueKnownFlag](../../aspose.medical.dicom.tags/tag/startingmetersetvalueknownflag) | (300A,0723) VR=CS VM=1 Starting Meterset Value Known Flag. |
| static readonly [StartingRespiratoryAmplitude](../../aspose.medical.dicom.tags/tag/startingrespiratoryamplitude) | (0020,9246) VR=FL VM=1 Starting Respiratory Amplitude. |
| static readonly [StartingRespiratoryPhase](../../aspose.medical.dicom.tags/tag/startingrespiratoryphase) | (0020,9247) VR=CS VM=1 Starting Respiratory Phase. |
| static readonly [StartMeterset](../../aspose.medical.dicom.tags/tag/startmeterset) | (3008,0078) VR=DS VM=1 Start Meterset. |
| static readonly [StartRelativeDensityDifferenceThreshold](../../aspose.medical.dicom.tags/tag/startrelativedensitydifferencethreshold) | (0018,9716) VR=FD VM=1 Start Relative Density Difference Threshold. |
| static readonly [StartRespiratoryTriggerCountThreshold](../../aspose.medical.dicom.tags/tag/startrespiratorytriggercountthreshold) | (0018,9718) VR=FD VM=1 Start Respiratory Trigger Count Threshold. |
| static readonly [StartTrim](../../aspose.medical.dicom.tags/tag/starttrim) | (0008,2142) VR=IS VM=1 Start Trim. |
| static readonly [StationAETitle](../../aspose.medical.dicom.tags/tag/stationaetitle) | (0008,0055) VR=AE VM=1 Station AE Title. |
| static readonly [StationName](../../aspose.medical.dicom.tags/tag/stationname) | (0008,1010) VR=SH VM=1 Station Name. |
| static readonly [Status](../../aspose.medical.dicom.tags/tag/status) | (0000,0900) VR=US VM=1 Status. |
| static readonly [SteadyStatePulseSequence](../../aspose.medical.dicom.tags/tag/steadystatepulsesequence) | (0018,9017) VR=CS VM=1 Steady State Pulse Sequence. |
| static readonly [SteepCornealAxisSequence](../../aspose.medical.dicom.tags/tag/steepcornealaxissequence) | (0046,0112) VR=SQ VM=1 Steep Corneal Axis Sequence. |
| static readonly [SteepKeratometricAxisSequence](../../aspose.medical.dicom.tags/tag/steepkeratometricaxissequence) | (0046,0074) VR=SQ VM=1 Steep Keratometric Axis Sequence. |
| static readonly [SteeringAngle](../../aspose.medical.dicom.tags/tag/steeringangle) | (0018,6036) VR=FD VM=1 Steering Angle. |
| static readonly [StereoBaselineAngle](../../aspose.medical.dicom.tags/tag/stereobaselineangle) | (0022,0010) VR=FL VM=1 Stereo Baseline Angle. |
| static readonly [StereoBaselineDisplacement](../../aspose.medical.dicom.tags/tag/stereobaselinedisplacement) | (0022,0011) VR=FL VM=1 Stereo Baseline Displacement. |
| static readonly [StereoHorizontalPixelOffset](../../aspose.medical.dicom.tags/tag/stereohorizontalpixeloffset) | (0022,0012) VR=FL VM=1 Stereo Horizontal Pixel Offset. |
| static readonly [StereoPairsPresent](../../aspose.medical.dicom.tags/tag/stereopairspresent) | (0022,0028) VR=CS VM=1 Stereo Pairs Present. |
| static readonly [StereoPairsSequence](../../aspose.medical.dicom.tags/tag/stereopairssequence) | (0022,0020) VR=SQ VM=1 Stereo Pairs Sequence. |
| static readonly [StereoRotation](../../aspose.medical.dicom.tags/tag/stereorotation) | (0022,0014) VR=FL VM=1 Stereo Rotation. |
| static readonly [StereoVerticalPixelOffset](../../aspose.medical.dicom.tags/tag/stereoverticalpixeloffset) | (0022,0013) VR=FL VM=1 Stereo Vertical Pixel Offset. |
| static readonly [StimuliRetestingQuantity](../../aspose.medical.dicom.tags/tag/stimuliretestingquantity) | (0024,0042) VR=US VM=1 Stimuli Retesting Quantity. |
| static readonly [StimulusArea](../../aspose.medical.dicom.tags/tag/stimulusarea) | (0024,0025) VR=FL VM=1 Stimulus Area. |
| static readonly [StimulusColorCodeSequence](../../aspose.medical.dicom.tags/tag/stimuluscolorcodesequence) | (0024,0021) VR=SQ VM=1 Stimulus Color Code Sequence. |
| static readonly [StimulusPresentationTime](../../aspose.medical.dicom.tags/tag/stimuluspresentationtime) | (0024,0028) VR=FL VM=1 Stimulus Presentation Time. |
| static readonly [StimulusResults](../../aspose.medical.dicom.tags/tag/stimulusresults) | (0024,0093) VR=CS VM=1 Stimulus Results. |
| static readonly [StopCumulativeMeterset](../../aspose.medical.dicom.tags/tag/stopcumulativemeterset) | (3002,0107) VR=FD VM=1 Stop Cumulative Meterset. |
| static readonly [StopTrim](../../aspose.medical.dicom.tags/tag/stoptrim) | (0008,2143) VR=IS VM=1 Stop Trim. |
| static readonly [StorageMediaFileSetID](../../aspose.medical.dicom.tags/tag/storagemediafilesetid) | (0088,0130) VR=SH VM=1 Storage Media File-set ID. |
| static readonly [StorageMediaFileSetUID](../../aspose.medical.dicom.tags/tag/storagemediafilesetuid) | (0088,0140) VR=UI VM=1 Storage Media File-set UID. |
| static readonly [StorageProtocolElementSequence](../../aspose.medical.dicom.tags/tag/storageprotocolelementsequence) | (0018,9936) VR=SQ VM=1 Storage Protocol Element Sequence. |
| static readonly [StorageProtocolElementSpecificationSequence](../../aspose.medical.dicom.tags/tag/storageprotocolelementspecificationsequence) | (0018,9935) VR=SQ VM=1 Storage Protocol Element Specification Sequence. |
| static readonly [StorageURL](../../aspose.medical.dicom.tags/tag/storageurl) | (0040,4073) VR=UR VM=1 Storage URL. |
| static readonly [StoredInstanceBaseURI](../../aspose.medical.dicom.tags/tag/storedinstancebaseuri) | (0008,0407) VR=UR VM=1 Stored Instance Base URI. |
| static readonly [StoredInstanceTransferSyntaxUID](../../aspose.medical.dicom.tags/tag/storedinstancetransfersyntaxuid) | (0008,040E) VR=UI VM=1 Stored Instance Transfer Syntax UID. |
| static readonly [StoredValueColorRangeSequence](../../aspose.medical.dicom.tags/tag/storedvaluecolorrangesequence) | (0028,1230) VR=SQ VM=1 Stored Value Color Range Sequence. |
| static readonly [STOWRSStorageSequence](../../aspose.medical.dicom.tags/tag/stowrsstoragesequence) | (0040,4072) VR=SQ VM=1 STOW-RS Storage Sequence. |
| static readonly [StrainAdditionalInformation](../../aspose.medical.dicom.tags/tag/strainadditionalinformation) | (0010,0218) VR=UT VM=1 Strain Additional Information. |
| static readonly [StrainCodeSequence](../../aspose.medical.dicom.tags/tag/straincodesequence) | (0010,0219) VR=SQ VM=1 Strain Code Sequence. |
| static readonly [StrainDescription](../../aspose.medical.dicom.tags/tag/straindescription) | (0010,0212) VR=UC VM=1 Strain Description. |
| static readonly [StrainNomenclature](../../aspose.medical.dicom.tags/tag/strainnomenclature) | (0010,0213) VR=LO VM=1 Strain Nomenclature. |
| static readonly [StrainSource](../../aspose.medical.dicom.tags/tag/strainsource) | (0010,0217) VR=LO VM=1 Strain Source. |
| static readonly [StrainSourceRegistryCodeSequence](../../aspose.medical.dicom.tags/tag/strainsourceregistrycodesequence) | (0010,0215) VR=SQ VM=1 Strain Source Registry Code Sequence. |
| static readonly [StrainStockNumber](../../aspose.medical.dicom.tags/tag/strainstocknumber) | (0010,0214) VR=LO VM=1 Strain Stock Number. |
| static readonly [StrainStockSequence](../../aspose.medical.dicom.tags/tag/strainstocksequence) | (0010,0216) VR=SQ VM=1 Strain Stock Sequence. |
| static readonly [StructuredConstraintObservationSequence](../../aspose.medical.dicom.tags/tag/structuredconstraintobservationsequence) | (0082,000C) VR=SQ VM=1 Structured Constraint Observation Sequence. |
| static readonly [StructuredDisplayBackgroundCIELabValue](../../aspose.medical.dicom.tags/tag/structureddisplaybackgroundcielabvalue) | (0072,0420) VR=US VM=3 Structured Display Background CIELab Value. |
| static readonly [StructuredDisplayImageBoxSequence](../../aspose.medical.dicom.tags/tag/structureddisplayimageboxsequence) | (0072,0422) VR=SQ VM=1 Structured Display Image Box Sequence. |
| static readonly [StructuredDisplayTextBoxSequence](../../aspose.medical.dicom.tags/tag/structureddisplaytextboxsequence) | (0072,0424) VR=SQ VM=1 Structured Display Text Box Sequence. |
| static readonly [StructuredWaveformAnnotationSequence](../../aspose.medical.dicom.tags/tag/structuredwaveformannotationsequence) | (0040,B030) VR=SQ VM=1 Structured Waveform Annotation Sequence. |
| static readonly [StructureSetDate](../../aspose.medical.dicom.tags/tag/structuresetdate) | (3006,0008) VR=DA VM=1 Structure Set Date. |
| static readonly [StructureSetDescription](../../aspose.medical.dicom.tags/tag/structuresetdescription) | (3006,0006) VR=ST VM=1 Structure Set Description. |
| static readonly [StructureSetLabel](../../aspose.medical.dicom.tags/tag/structuresetlabel) | (3006,0002) VR=SH VM=1 Structure Set Label. |
| static readonly [StructureSetName](../../aspose.medical.dicom.tags/tag/structuresetname) | (3006,0004) VR=LO VM=1 Structure Set Name. |
| static readonly [StructureSetROISequence](../../aspose.medical.dicom.tags/tag/structuresetroisequence) | (3006,0020) VR=SQ VM=1 Structure Set ROI Sequence. |
| static readonly [StructureSetTime](../../aspose.medical.dicom.tags/tag/structuresettime) | (3006,0009) VR=TM VM=1 Structure Set Time. |
| static readonly [StudiesContainingOtherReferencedInstancesSequence](../../aspose.medical.dicom.tags/tag/studiescontainingotherreferencedinstancessequence) | (0008,1200) VR=SQ VM=1 Studies Containing Other Referenced Instances Sequence. |
| static readonly [StudyAccessEndPointsSequence](../../aspose.medical.dicom.tags/tag/studyaccessendpointssequence) | (0008,0421) VR=SQ VM=1 Study Access End Points Sequence. |
| static readonly [StudyArrivalDateRETIRED](../../aspose.medical.dicom.tags/tag/studyarrivaldateretired) | (0032,1040) VR=DA VM=1 Study Arrival Date (RETIRED). |
| static readonly [StudyArrivalTimeRETIRED](../../aspose.medical.dicom.tags/tag/studyarrivaltimeretired) | (0032,1041) VR=TM VM=1 Study Arrival Time (RETIRED). |
| static readonly [StudyCommentsRETIRED](../../aspose.medical.dicom.tags/tag/studycommentsretired) | (0032,4000) VR=LT VM=1 Study Comments (RETIRED). |
| static readonly [StudyCompletionDateRETIRED](../../aspose.medical.dicom.tags/tag/studycompletiondateretired) | (0032,1050) VR=DA VM=1 Study Completion Date (RETIRED). |
| static readonly [StudyCompletionTimeRETIRED](../../aspose.medical.dicom.tags/tag/studycompletiontimeretired) | (0032,1051) VR=TM VM=1 Study Completion Time (RETIRED). |
| static readonly [StudyComponentStatusIDRETIRED](../../aspose.medical.dicom.tags/tag/studycomponentstatusidretired) | (0032,1055) VR=CS VM=1 Study Component Status ID (RETIRED). |
| static readonly [StudyDate](../../aspose.medical.dicom.tags/tag/studydate) | (0008,0020) VR=DA VM=1 Study Date. |
| static readonly [StudyDescription](../../aspose.medical.dicom.tags/tag/studydescription) | (0008,1030) VR=LO VM=1 Study Description. |
| static readonly [StudyID](../../aspose.medical.dicom.tags/tag/studyid) | (0020,0010) VR=SH VM=1 Study ID. |
| static readonly [StudyIDIssuerRETIRED](../../aspose.medical.dicom.tags/tag/studyidissuerretired) | (0032,0012) VR=LO VM=1 Study ID Issuer (RETIRED). |
| static readonly [StudyInstanceUID](../../aspose.medical.dicom.tags/tag/studyinstanceuid) | (0020,000D) VR=UI VM=1 Study Instance UID. |
| static readonly [StudyPriorityIDRETIRED](../../aspose.medical.dicom.tags/tag/studypriorityidretired) | (0032,000C) VR=CS VM=1 Study Priority ID (RETIRED). |
| static readonly [StudyReadDateRETIRED](../../aspose.medical.dicom.tags/tag/studyreaddateretired) | (0032,0034) VR=DA VM=1 Study Read Date (RETIRED). |
| static readonly [StudyReadTimeRETIRED](../../aspose.medical.dicom.tags/tag/studyreadtimeretired) | (0032,0035) VR=TM VM=1 Study Read Time (RETIRED). |
| static readonly [StudyStatusIDRETIRED](../../aspose.medical.dicom.tags/tag/studystatusidretired) | (0032,000A) VR=CS VM=1 Study Status ID (RETIRED). |
| static readonly [StudyTime](../../aspose.medical.dicom.tags/tag/studytime) | (0008,0030) VR=TM VM=1 Study Time. |
| static readonly [StudyUpdateDateTime](../../aspose.medical.dicom.tags/tag/studyupdatedatetime) | (0008,041F) VR=DT VM=1 Study Update DateTime. |
| static readonly [StudyVerifiedDateRETIRED](../../aspose.medical.dicom.tags/tag/studyverifieddateretired) | (0032,0032) VR=DA VM=1 Study Verified Date (RETIRED). |
| static readonly [StudyVerifiedTimeRETIRED](../../aspose.medical.dicom.tags/tag/studyverifiedtimeretired) | (0032,0033) VR=TM VM=1 Study Verified Time (RETIRED). |
| static readonly [SubjectArea](../../aspose.medical.dicom.tags/tag/subjectarea) | (0016,002A) VR=IS VM=2-4 Subject Area. |
| static readonly [SubjectDistance](../../aspose.medical.dicom.tags/tag/subjectdistance) | (0016,0026) VR=DS VM=1 Subject Distance. |
| static readonly [SubjectDistanceRange](../../aspose.medical.dicom.tags/tag/subjectdistancerange) | (0016,004C) VR=US VM=1 Subject Distance Range. |
| static readonly [SubjectiveRefractionLeftEyeSequence](../../aspose.medical.dicom.tags/tag/subjectiverefractionlefteyesequence) | (0046,0098) VR=SQ VM=1 Subjective Refraction Left Eye Sequence. |
| static readonly [SubjectiveRefractionRightEyeSequence](../../aspose.medical.dicom.tags/tag/subjectiverefractionrighteyesequence) | (0046,0097) VR=SQ VM=1 Subjective Refraction Right Eye Sequence. |
| static readonly [SubjectLocation](../../aspose.medical.dicom.tags/tag/subjectlocation) | (0016,0037) VR=IS VM=2 Subject Location. |
| static readonly [SubjectRelativePositionInImage](../../aspose.medical.dicom.tags/tag/subjectrelativepositioninimage) | (0010,0028) VR=US VM=3 Subject Relative Position in Image. |
| static readonly [SubscriptionListStatus](../../aspose.medical.dicom.tags/tag/subscriptionliststatus) | (0074,1244) VR=CS VM=1 Subscription List Status. |
| static readonly [SubstanceAdministrationApproval](../../aspose.medical.dicom.tags/tag/substanceadministrationapproval) | (0044,0002) VR=CS VM=1 Substance Administration Approval. |
| static readonly [SubstanceAdministrationDateTime](../../aspose.medical.dicom.tags/tag/substanceadministrationdatetime) | (0044,0010) VR=DT VM=1 Substance Administration DateTime. |
| static readonly [SubstanceAdministrationDeviceID](../../aspose.medical.dicom.tags/tag/substanceadministrationdeviceid) | (0044,0012) VR=LO VM=1 Substance Administration Device ID. |
| static readonly [SubstanceAdministrationNotes](../../aspose.medical.dicom.tags/tag/substanceadministrationnotes) | (0044,0011) VR=LO VM=1 Substance Administration Notes. |
| static readonly [SubstanceAdministrationParameterSequence](../../aspose.medical.dicom.tags/tag/substanceadministrationparametersequence) | (0044,0019) VR=SQ VM=1 Substance Administration Parameter Sequence. |
| static readonly [SubtaskWorkitemCodeSequence](../../aspose.medical.dicom.tags/tag/subtaskworkitemcodesequence) | (3002,011B) VR=SQ VM=1 Subtask Workitem Code Sequence. |
| static readonly [SubtractionItemID](../../aspose.medical.dicom.tags/tag/subtractionitemid) | (0028,9416) VR=US VM=1 Subtraction Item ID. |
| static readonly [SummarizedFilterLookupTableSequence](../../aspose.medical.dicom.tags/tag/summarizedfilterlookuptablesequence) | (003A,0320) VR=SQ VM=1 Summarized Filter Lookup Table Sequence. |
| static readonly [SupportedImageDisplayFormatsSequence](../../aspose.medical.dicom.tags/tag/supportedimagedisplayformatssequence) | (2000,00A8) VR=SQ VM=1 Supported Image Display Formats Sequence. |
| static readonly [SurfaceAsymmetryIndex](../../aspose.medical.dicom.tags/tag/surfaceasymmetryindex) | (0046,0232) VR=FL VM=1 Surface Asymmetry Index. |
| static readonly [SurfaceComments](../../aspose.medical.dicom.tags/tag/surfacecomments) | (0066,0004) VR=LT VM=1 Surface Comments. |
| static readonly [SurfaceCount](../../aspose.medical.dicom.tags/tag/surfacecount) | (0066,002A) VR=UL VM=1 Surface Count. |
| static readonly [SurfaceEntryPoint](../../aspose.medical.dicom.tags/tag/surfaceentrypoint) | (300A,012E) VR=DS VM=3 Surface Entry Point. |
| static readonly [SurfaceMeshPrimitivesSequence](../../aspose.medical.dicom.tags/tag/surfacemeshprimitivessequence) | (0066,0013) VR=SQ VM=1 Surface Mesh Primitives Sequence. |
| static readonly [SurfaceMeshZPixelOffset](../../aspose.medical.dicom.tags/tag/surfacemeshzpixeloffset) | (0022,1658) VR=UL VM=1 Surface Mesh Z-Pixel Offset. |
| static readonly [SurfaceModelDescriptionSequence](../../aspose.medical.dicom.tags/tag/surfacemodeldescriptionsequence) | (0068,6360) VR=SQ VM=1 Surface Model Description Sequence. |
| static readonly [SurfaceModelLabel](../../aspose.medical.dicom.tags/tag/surfacemodellabel) | (0068,6380) VR=LO VM=1 Surface Model Label. |
| static readonly [SurfaceModelScalingFactor](../../aspose.medical.dicom.tags/tag/surfacemodelscalingfactor) | (0068,6390) VR=FD VM=1 Surface Model Scaling Factor. |
| static readonly [SurfaceNumber](../../aspose.medical.dicom.tags/tag/surfacenumber) | (0066,0003) VR=UL VM=1 Surface Number. |
| static readonly [SurfaceOffset](../../aspose.medical.dicom.tags/tag/surfaceoffset) | (0066,0005) VR=FL VM=1 Surface Offset. |
| static readonly [SurfacePointColorCIELabValueData](../../aspose.medical.dicom.tags/tag/surfacepointcolorcielabvaluedata) | (0080,0007) VR=US VM=3-3n Surface Point Color CIELab Value Data. |
| static readonly [SurfacePointPresentationValueData](../../aspose.medical.dicom.tags/tag/surfacepointpresentationvaluedata) | (0080,0006) VR=US VM=1-n Surface Point Presentation Value Data. |
| static readonly [SurfacePointsNormalsSequence](../../aspose.medical.dicom.tags/tag/surfacepointsnormalssequence) | (0066,0012) VR=SQ VM=1 Surface Points Normals Sequence. |
| static readonly [SurfacePointsSequence](../../aspose.medical.dicom.tags/tag/surfacepointssequence) | (0066,0011) VR=SQ VM=1 Surface Points Sequence. |
| static readonly [SurfacePreparationWithOpticalCoatingRETIRED](../../aspose.medical.dicom.tags/tag/surfacepreparationwithopticalcoatingretired) | (0014,6044) VR=CS VM=1 Surface Preparation with Optical Coating (RETIRED). |
| static readonly [SurfaceProcessing](../../aspose.medical.dicom.tags/tag/surfaceprocessing) | (0066,0009) VR=CS VM=1 Surface Processing. |
| static readonly [SurfaceProcessingAlgorithmIdentificationSequence](../../aspose.medical.dicom.tags/tag/surfaceprocessingalgorithmidentificationsequence) | (0066,0035) VR=SQ VM=1 Surface Processing Algorithm Identification Sequence. |
| static readonly [SurfaceProcessingDescription](../../aspose.medical.dicom.tags/tag/surfaceprocessingdescription) | (0066,000B) VR=LO VM=1 Surface Processing Description. |
| static readonly [SurfaceProcessingRatio](../../aspose.medical.dicom.tags/tag/surfaceprocessingratio) | (0066,000A) VR=FL VM=1 Surface Processing Ratio. |
| static readonly [SurfaceRegularityIndex](../../aspose.medical.dicom.tags/tag/surfaceregularityindex) | (0046,0230) VR=FL VM=1 Surface Regularity Index. |
| static readonly [SurfaceScanAcquisitionTypeCodeSequence](../../aspose.medical.dicom.tags/tag/surfacescanacquisitiontypecodesequence) | (0080,0001) VR=SQ VM=1 Surface Scan Acquisition Type Code Sequence. |
| static readonly [SurfaceScanModeCodeSequence](../../aspose.medical.dicom.tags/tag/surfacescanmodecodesequence) | (0080,0002) VR=SQ VM=1 Surface Scan Mode Code Sequence. |
| static readonly [SurfaceSequence](../../aspose.medical.dicom.tags/tag/surfacesequence) | (0066,0002) VR=SQ VM=1 Surface Sequence. |
| static readonly [SurgicallyInducedAstigmatismSequence](../../aspose.medical.dicom.tags/tag/surgicallyinducedastigmatismsequence) | (0022,1045) VR=SQ VM=1 Surgically Induced Astigmatism Sequence. |
| static readonly [SurgicalTechnique](../../aspose.medical.dicom.tags/tag/surgicaltechnique) | (0076,0030) VR=LO VM=1 Surgical Technique. |
| static readonly [SUVType](../../aspose.medical.dicom.tags/tag/suvtype) | (0054,1006) VR=CS VM=1 SUV Type. |
| static readonly [SwitchingPhaseNominalDuration](../../aspose.medical.dicom.tags/tag/switchingphasenominalduration) | (0018,936C) VR=DS VM=1 Switching Phase Nominal Duration. |
| static readonly [SwitchingPhaseNumber](../../aspose.medical.dicom.tags/tag/switchingphasenumber) | (0018,936B) VR=US VM=1 Switching Phase Number. |
| static readonly [SwitchingPhaseTransitionDuration](../../aspose.medical.dicom.tags/tag/switchingphasetransitionduration) | (0018,936D) VR=DS VM=1 Switching Phase Transition Duration. |
| static readonly [SwivelRange](../../aspose.medical.dicom.tags/tag/swivelrange) | (0070,1A06) VR=FD VM=1 Swivel Range. |
| static readonly [SynchronizationChannel](../../aspose.medical.dicom.tags/tag/synchronizationchannel) | (0018,106C) VR=US VM=2 Synchronization Channel. |
| static readonly [SynchronizationFrameOfReferenceUID](../../aspose.medical.dicom.tags/tag/synchronizationframeofreferenceuid) | (0020,0200) VR=UI VM=1 Synchronization Frame of Reference UID. |
| static readonly [SynchronizationTrigger](../../aspose.medical.dicom.tags/tag/synchronizationtrigger) | (0018,106A) VR=CS VM=1 Synchronization Trigger. |
| static readonly [SynchronizedImageBoxList](../../aspose.medical.dicom.tags/tag/synchronizedimageboxlist) | (0072,0432) VR=US VM=2-n Synchronized Image Box List. |
| static readonly [SynchronizedScrollingSequence](../../aspose.medical.dicom.tags/tag/synchronizedscrollingsequence) | (0072,0210) VR=SQ VM=1 Synchronized Scrolling Sequence. |
| static readonly [SyntheticData](../../aspose.medical.dicom.tags/tag/syntheticdata) | (0008,001C) VR=CS VM=1 Synthetic Data. |
| static readonly [SyringeCounts](../../aspose.medical.dicom.tags/tag/syringecounts) | (0018,1045) VR=IS VM=1 Syringe Counts. |
| static readonly [SystemStatus](../../aspose.medical.dicom.tags/tag/systemstatus) | (0028,7006) VR=CS VM=1 System Status. |
| static readonly [SystemStatusComment](../../aspose.medical.dicom.tags/tag/systemstatuscomment) | (0028,7007) VR=LO VM=1 System Status Comment. |
| static readonly [T2Preparation](../../aspose.medical.dicom.tags/tag/t2preparation) | (0018,9021) VR=CS VM=1 T2 Preparation. |
| static readonly [TableAngle](../../aspose.medical.dicom.tags/tag/tableangle) | (0018,1138) VR=DS VM=1 Table Angle. |
| static readonly [TableColumnDefinitionSequence](../../aspose.medical.dicom.tags/tag/tablecolumndefinitionsequence) | (0040,A807) VR=SQ VM=1 Table Column Definition Sequence. |
| static readonly [TableColumnNumber](../../aspose.medical.dicom.tags/tag/tablecolumnnumber) | (0040,A805) VR=UL VM=1 Table Column Number. |
| static readonly [TableCradleTiltAngle](../../aspose.medical.dicom.tags/tag/tablecradletiltangle) | (0018,9471) VR=FL VM=1 Table Cradle Tilt Angle. |
| static readonly [TableFeedPerRotation](../../aspose.medical.dicom.tags/tag/tablefeedperrotation) | (0018,9310) VR=FD VM=1 Table Feed per Rotation. |
| static readonly [TableFrameOfReferenceUID](../../aspose.medical.dicom.tags/tag/tableframeofreferenceuid) | (0020,9313) VR=UI VM=1 Table Frame of Reference UID. |
| static readonly [TableHeadTiltAngle](../../aspose.medical.dicom.tags/tag/tableheadtiltangle) | (0018,9470) VR=FL VM=1 Table Head Tilt Angle. |
| static readonly [TableHeight](../../aspose.medical.dicom.tags/tag/tableheight) | (0018,1130) VR=DS VM=1 Table Height. |
| static readonly [TableHorizontalRotationAngle](../../aspose.medical.dicom.tags/tag/tablehorizontalrotationangle) | (0018,9469) VR=FL VM=1 Table Horizontal Rotation Angle. |
| static readonly [TableLateralIncrement](../../aspose.medical.dicom.tags/tag/tablelateralincrement) | (0018,1136) VR=DS VM=1-n Table Lateral Increment. |
| static readonly [TableLongitudinalIncrement](../../aspose.medical.dicom.tags/tag/tablelongitudinalincrement) | (0018,1137) VR=DS VM=1-n Table Longitudinal Increment. |
| static readonly [TableMotion](../../aspose.medical.dicom.tags/tag/tablemotion) | (0018,1134) VR=CS VM=1 Table Motion. |
| static readonly [TableOfParameterValues](../../aspose.medical.dicom.tags/tag/tableofparametervalues) | (0018,605A) VR=FL VM=1-n Table of Parameter Values. |
| static readonly [TableOfPixelValues](../../aspose.medical.dicom.tags/tag/tableofpixelvalues) | (0018,6058) VR=UL VM=1-n Table of Pixel Values. |
| static readonly [TableOfXBreakPoints](../../aspose.medical.dicom.tags/tag/tableofxbreakpoints) | (0018,6052) VR=UL VM=1-n Table of X Break Points. |
| static readonly [TableOfYBreakPoints](../../aspose.medical.dicom.tags/tag/tableofybreakpoints) | (0018,6054) VR=FD VM=1-n Table of Y Break Points. |
| static readonly [TablePosition](../../aspose.medical.dicom.tags/tag/tableposition) | (0018,9327) VR=FD VM=1 Table Position. |
| static readonly [TablePositionSequence](../../aspose.medical.dicom.tags/tag/tablepositionsequence) | (0018,9406) VR=SQ VM=1 Table Position Sequence. |
| static readonly [TableRowDefinitionSequence](../../aspose.medical.dicom.tags/tag/tablerowdefinitionsequence) | (0040,A806) VR=SQ VM=1 Table Row Definition Sequence. |
| static readonly [TableRowNumber](../../aspose.medical.dicom.tags/tag/tablerownumber) | (0040,A804) VR=UL VM=1 Table Row Number. |
| static readonly [TableSpeed](../../aspose.medical.dicom.tags/tag/tablespeed) | (0018,9309) VR=FD VM=1 Table Speed. |
| static readonly [TableTopEccentricAdjustedAngle](../../aspose.medical.dicom.tags/tag/tabletopeccentricadjustedangle) | (0074,102B) VR=FD VM=1 Table Top Eccentric Adjusted Angle. |
| static readonly [TableTopEccentricAngle](../../aspose.medical.dicom.tags/tag/tabletopeccentricangle) | (300A,0125) VR=DS VM=1 Table Top Eccentric Angle. |
| static readonly [TableTopEccentricAngleTolerance](../../aspose.medical.dicom.tags/tag/tabletopeccentricangletolerance) | (300A,004E) VR=DS VM=1 Table Top Eccentric Angle Tolerance. |
| static readonly [TableTopEccentricAxisDistance](../../aspose.medical.dicom.tags/tag/tabletopeccentricaxisdistance) | (300A,0124) VR=DS VM=1 Table Top Eccentric Axis Distance. |
| static readonly [TableTopEccentricRotationDirection](../../aspose.medical.dicom.tags/tag/tabletopeccentricrotationdirection) | (300A,0126) VR=CS VM=1 Table Top Eccentric Rotation Direction. |
| static readonly [TableTopLateralAdjustedPosition](../../aspose.medical.dicom.tags/tag/tabletoplateraladjustedposition) | (0074,1028) VR=FD VM=1 Table Top Lateral Adjusted Position. |
| static readonly [TableTopLateralPosition](../../aspose.medical.dicom.tags/tag/tabletoplateralposition) | (300A,012A) VR=DS VM=1 Table Top Lateral Position. |
| static readonly [TableTopLateralPositionTolerance](../../aspose.medical.dicom.tags/tag/tabletoplateralpositiontolerance) | (300A,0053) VR=DS VM=1 Table Top Lateral Position Tolerance. |
| static readonly [TableTopLateralSetupDisplacement](../../aspose.medical.dicom.tags/tag/tabletoplateralsetupdisplacement) | (300A,01D6) VR=DS VM=1 Table Top Lateral Setup Displacement. |
| static readonly [TableTopLongitudinalAdjustedPosition](../../aspose.medical.dicom.tags/tag/tabletoplongitudinaladjustedposition) | (0074,1027) VR=FD VM=1 Table Top Longitudinal Adjusted Position. |
| static readonly [TableTopLongitudinalPosition](../../aspose.medical.dicom.tags/tag/tabletoplongitudinalposition) | (300A,0129) VR=DS VM=1 Table Top Longitudinal Position. |
| static readonly [TableTopLongitudinalPositionTolerance](../../aspose.medical.dicom.tags/tag/tabletoplongitudinalpositiontolerance) | (300A,0052) VR=DS VM=1 Table Top Longitudinal Position Tolerance. |
| static readonly [TableTopLongitudinalSetupDisplacement](../../aspose.medical.dicom.tags/tag/tabletoplongitudinalsetupdisplacement) | (300A,01D4) VR=DS VM=1 Table Top Longitudinal Setup Displacement. |
| static readonly [TableTopPitchAdjustedAngle](../../aspose.medical.dicom.tags/tag/tabletoppitchadjustedangle) | (0074,102C) VR=FD VM=1 Table Top Pitch Adjusted Angle. |
| static readonly [TableTopPitchAngle](../../aspose.medical.dicom.tags/tag/tabletoppitchangle) | (300A,0140) VR=FL VM=1 Table Top Pitch Angle. |
| static readonly [TableTopPitchAngleTolerance](../../aspose.medical.dicom.tags/tag/tabletoppitchangletolerance) | (300A,004F) VR=FL VM=1 Table Top Pitch Angle Tolerance. |
| static readonly [TableTopPitchRotationDirection](../../aspose.medical.dicom.tags/tag/tabletoppitchrotationdirection) | (300A,0142) VR=CS VM=1 Table Top Pitch Rotation Direction. |
| static readonly [TableTopPositionAlignmentUID](../../aspose.medical.dicom.tags/tag/tabletoppositionalignmentuid) | (300A,0054) VR=UI VM=1 Table Top Position Alignment UID. |
| static readonly [TableTopRollAdjustedAngle](../../aspose.medical.dicom.tags/tag/tabletoprolladjustedangle) | (0074,102D) VR=FD VM=1 Table Top Roll Adjusted Angle. |
| static readonly [TableTopRollAngle](../../aspose.medical.dicom.tags/tag/tabletoprollangle) | (300A,0144) VR=FL VM=1 Table Top Roll Angle. |
| static readonly [TableTopRollAngleTolerance](../../aspose.medical.dicom.tags/tag/tabletoprollangletolerance) | (300A,0050) VR=FL VM=1 Table Top Roll Angle Tolerance. |
| static readonly [TableTopRollRotationDirection](../../aspose.medical.dicom.tags/tag/tabletoprollrotationdirection) | (300A,0146) VR=CS VM=1 Table Top Roll Rotation Direction. |
| static readonly [TableTopVerticalAdjustedPosition](../../aspose.medical.dicom.tags/tag/tabletopverticaladjustedposition) | (0074,1026) VR=FD VM=1 Table Top Vertical Adjusted Position. |
| static readonly [TableTopVerticalPosition](../../aspose.medical.dicom.tags/tag/tabletopverticalposition) | (300A,0128) VR=DS VM=1 Table Top Vertical Position. |
| static readonly [TableTopVerticalPositionTolerance](../../aspose.medical.dicom.tags/tag/tabletopverticalpositiontolerance) | (300A,0051) VR=DS VM=1 Table Top Vertical Position Tolerance. |
| static readonly [TableTopVerticalSetupDisplacement](../../aspose.medical.dicom.tags/tag/tabletopverticalsetupdisplacement) | (300A,01D2) VR=DS VM=1 Table Top Vertical Setup Displacement. |
| static readonly [TableTraverse](../../aspose.medical.dicom.tags/tag/tabletraverse) | (0018,1131) VR=DS VM=1 Table Traverse. |
| static readonly [TableType](../../aspose.medical.dicom.tags/tag/tabletype) | (0018,113A) VR=CS VM=1 Table Type. |
| static readonly [TableVerticalIncrement](../../aspose.medical.dicom.tags/tag/tableverticalincrement) | (0018,1135) VR=DS VM=1-n Table Vertical Increment. |
| static readonly [TableXPositionToIsocenter](../../aspose.medical.dicom.tags/tag/tablexpositiontoisocenter) | (0018,9466) VR=FL VM=1 Table X Position to Isocenter. |
| static readonly [TableYPositionToIsocenter](../../aspose.medical.dicom.tags/tag/tableypositiontoisocenter) | (0018,9467) VR=FL VM=1 Table Y Position to Isocenter. |
| static readonly [TableZPositionToIsocenter](../../aspose.medical.dicom.tags/tag/tablezpositiontoisocenter) | (0018,9468) VR=FL VM=1 Table Z Position to Isocenter. |
| static readonly [TabulatedValuesSequence](../../aspose.medical.dicom.tags/tag/tabulatedvaluessequence) | (0040,A801) VR=SQ VM=1 Tabulated Values Sequence. |
| static readonly [TagAngleFirstAxis](../../aspose.medical.dicom.tags/tag/taganglefirstaxis) | (0018,9019) VR=FD VM=1 Tag Angle First Axis. |
| static readonly [TagAngleSecondAxis](../../aspose.medical.dicom.tags/tag/taganglesecondaxis) | (0018,9219) VR=SS VM=1 Tag Angle Second Axis. |
| static readonly [Tagging](../../aspose.medical.dicom.tags/tag/tagging) | (0018,9028) VR=CS VM=1 Tagging. |
| static readonly [TaggingDelay](../../aspose.medical.dicom.tags/tag/taggingdelay) | (0018,9184) VR=FD VM=1 Tagging Delay. |
| static readonly [TagSpacingFirstDimension](../../aspose.medical.dicom.tags/tag/tagspacingfirstdimension) | (0018,9030) VR=FD VM=1 Tag Spacing First Dimension. |
| static readonly [TagSpacingSecondDimension](../../aspose.medical.dicom.tags/tag/tagspacingseconddimension) | (0018,9218) VR=FD VM=1 Tag Spacing Second Dimension. |
| static readonly [TagThickness](../../aspose.medical.dicom.tags/tag/tagthickness) | (0018,9035) VR=FD VM=1 Tag Thickness. |
| static readonly [TangentialPower](../../aspose.medical.dicom.tags/tag/tangentialpower) | (0046,0250) VR=FL VM=1 Tangential Power. |
| static readonly [TargetExposureIndex](../../aspose.medical.dicom.tags/tag/targetexposureindex) | (0018,1412) VR=DS VM=1 Target Exposure Index. |
| static readonly [TargetFrameOfReferenceUID](../../aspose.medical.dicom.tags/tag/targetframeofreferenceuid) | (0018,991E) VR=UI VM=1 Target Frame of Reference UID. |
| static readonly [TargetLabel](../../aspose.medical.dicom.tags/tag/targetlabel) | (0018,2045) VR=SH VM=1 Target Label. |
| static readonly [TargetLuminanceCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/targetluminancecharacteristicssequence) | (0028,7008) VR=SQ VM=1 Target Luminance Characteristics Sequence. |
| static readonly [TargetMaterialSequenceRETIRED](../../aspose.medical.dicom.tags/tag/targetmaterialsequenceretired) | (4010,1072) VR=SQ VM=1 Target Material Sequence (RETIRED). |
| static readonly [TargetMaximumDose](../../aspose.medical.dicom.tags/tag/targetmaximumdose) | (300A,0027) VR=DS VM=1 Target Maximum Dose. |
| static readonly [TargetMaximumLuminance](../../aspose.medical.dicom.tags/tag/targetmaximumluminance) | (0028,701E) VR=FL VM=1 Target Maximum Luminance. |
| static readonly [TargetMinimumDose](../../aspose.medical.dicom.tags/tag/targetminimumdose) | (300A,0025) VR=DS VM=1 Target Minimum Dose. |
| static readonly [TargetMinimumLuminance](../../aspose.medical.dicom.tags/tag/targetminimumluminance) | (0028,701D) VR=FL VM=1 Target Minimum Luminance. |
| static readonly [TargetPositionReferenceIndicator](../../aspose.medical.dicom.tags/tag/targetpositionreferenceindicator) | (0020,103F) VR=LO VM=1 Target Position Reference Indicator. |
| static readonly [TargetPrescriptionDose](../../aspose.medical.dicom.tags/tag/targetprescriptiondose) | (300A,0026) VR=DS VM=1 Target Prescription Dose. |
| static readonly [TargetRefraction](../../aspose.medical.dicom.tags/tag/targetrefraction) | (0022,1037) VR=FL VM=1 Target Refraction. |
| static readonly [TargetUID](../../aspose.medical.dicom.tags/tag/targetuid) | (0018,2042) VR=UI VM=1 Target UID. |
| static readonly [TargetUnderdoseVolumeFraction](../../aspose.medical.dicom.tags/tag/targetunderdosevolumefraction) | (300A,0028) VR=DS VM=1 Target Underdose Volume Fraction. |
| static readonly [TDRTypeRETIRED](../../aspose.medical.dicom.tags/tag/tdrtyperetired) | (4010,1027) VR=CS VM=1 TDR Type (RETIRED). |
| static readonly [TelephoneNumberTrialRETIRED](../../aspose.medical.dicom.tags/tag/telephonenumbertrialretired) | (0040,A354) VR=LO VM=1 Telephone Number (Trial) (RETIRED). |
| static readonly [TeletherapyRadiationType](../../aspose.medical.dicom.tags/tag/teletherapyradiationtype) | (3010,0047) VR=CS VM=1-n Teletherapy Radiation Type. |
| static readonly [Temperature](../../aspose.medical.dicom.tags/tag/temperature) | (0016,0030) VR=DS VM=1 Temperature. |
| static readonly [TemplateExtensionCreatorUIDRETIRED](../../aspose.medical.dicom.tags/tag/templateextensioncreatoruidretired) | (0040,DB0D) VR=UI VM=1 Template Extension Creator UID (RETIRED). |
| static readonly [TemplateExtensionFlagRETIRED](../../aspose.medical.dicom.tags/tag/templateextensionflagretired) | (0040,DB0B) VR=CS VM=1 Template Extension Flag (RETIRED). |
| static readonly [TemplateExtensionOrganizationUIDRETIRED](../../aspose.medical.dicom.tags/tag/templateextensionorganizationuidretired) | (0040,DB0C) VR=UI VM=1 Template Extension Organization UID (RETIRED). |
| static readonly [TemplateIdentifier](../../aspose.medical.dicom.tags/tag/templateidentifier) | (0040,DB00) VR=CS VM=1 Template Identifier. |
| static readonly [TemplateLocalVersionRETIRED](../../aspose.medical.dicom.tags/tag/templatelocalversionretired) | (0040,DB07) VR=DT VM=1 Template Local Version (RETIRED). |
| static readonly [TemplateName](../../aspose.medical.dicom.tags/tag/templatename) | (300A,0244) VR=LO VM=1 Template Name. |
| static readonly [TemplateNumber](../../aspose.medical.dicom.tags/tag/templatenumber) | (300A,0240) VR=IS VM=1 Template Number. |
| static readonly [TemplateType](../../aspose.medical.dicom.tags/tag/templatetype) | (300A,0242) VR=SH VM=1 Template Type. |
| static readonly [TemplateVersionRETIRED](../../aspose.medical.dicom.tags/tag/templateversionretired) | (0040,DB06) VR=DT VM=1 Template Version (RETIRED). |
| static readonly [TemporalPositionIdentifier](../../aspose.medical.dicom.tags/tag/temporalpositionidentifier) | (0020,0100) VR=IS VM=1 Temporal Position Identifier. |
| static readonly [TemporalPositionIndex](../../aspose.medical.dicom.tags/tag/temporalpositionindex) | (0020,9128) VR=UL VM=1 Temporal Position Index. |
| static readonly [TemporalPositionSequence](../../aspose.medical.dicom.tags/tag/temporalpositionsequence) | (0020,9310) VR=SQ VM=1 Temporal Position Sequence. |
| static readonly [TemporalPositionTimeOffset](../../aspose.medical.dicom.tags/tag/temporalpositiontimeoffset) | (0020,930D) VR=FD VM=1 Temporal Position Time Offset. |
| static readonly [TemporalRangeType](../../aspose.medical.dicom.tags/tag/temporalrangetype) | (0040,A130) VR=CS VM=1 Temporal Range Type. |
| static readonly [TemporalRelationshipIntervalAnchor](../../aspose.medical.dicom.tags/tag/temporalrelationshipintervalanchor) | (3010,004F) VR=CS VM=1 Temporal Relationship Interval Anchor. |
| static readonly [TemporalResolution](../../aspose.medical.dicom.tags/tag/temporalresolution) | (0020,0110) VR=DS VM=1 Temporal Resolution. |
| static readonly [TerminalTypeRETIRED](../../aspose.medical.dicom.tags/tag/terminaltyperetired) | (0000,4010) VR=LT VM=1 Terminal Type (RETIRED). |
| static readonly [TerminationCardiacTriggerCountThreshold](../../aspose.medical.dicom.tags/tag/terminationcardiactriggercountthreshold) | (0018,9723) VR=FD VM=1 Termination Cardiac Trigger Count Threshold. |
| static readonly [TerminationCountsThreshold](../../aspose.medical.dicom.tags/tag/terminationcountsthreshold) | (0018,9719) VR=FD VM=1 Termination Counts Threshold. |
| static readonly [TerminationDensityThreshold](../../aspose.medical.dicom.tags/tag/terminationdensitythreshold) | (0018,9720) VR=FD VM=1 Termination Density Threshold. |
| static readonly [TerminationRelativeDensityThreshold](../../aspose.medical.dicom.tags/tag/terminationrelativedensitythreshold) | (0018,9721) VR=FD VM=1 Termination Relative Density Threshold. |
| static readonly [TerminationRespiratoryTriggerCountThreshold](../../aspose.medical.dicom.tags/tag/terminationrespiratorytriggercountthreshold) | (0018,9724) VR=FD VM=1 Termination Respiratory Trigger Count Threshold. |
| static readonly [TerminationTimeThreshold](../../aspose.medical.dicom.tags/tag/terminationtimethreshold) | (0018,9722) VR=FD VM=1 Termination Time Threshold. |
| static readonly [TestImageValidation](../../aspose.medical.dicom.tags/tag/testimagevalidation) | (0028,702B) VR=CS VM=1 Test Image Validation. |
| static readonly [TestPatternCodeSequence](../../aspose.medical.dicom.tags/tag/testpatterncodesequence) | (0028,702C) VR=SQ VM=1 Test Pattern Code Sequence. |
| static readonly [TestPointNormalsDataFlag](../../aspose.medical.dicom.tags/tag/testpointnormalsdataflag) | (0024,0057) VR=CS VM=1 Test Point Normals Data Flag. |
| static readonly [TestPointNormalsSequence](../../aspose.medical.dicom.tags/tag/testpointnormalssequence) | (0024,0058) VR=SQ VM=1 Test Point Normals Sequence. |
| static readonly [TestResult](../../aspose.medical.dicom.tags/tag/testresult) | (0028,7029) VR=CS VM=1 Test Result. |
| static readonly [TestResultComment](../../aspose.medical.dicom.tags/tag/testresultcomment) | (0028,702A) VR=LO VM=1 Test Result Comment. |
| static readonly [TextColorCIELabValue](../../aspose.medical.dicom.tags/tag/textcolorcielabvalue) | (0070,0241) VR=US VM=3 Text Color CIELab Value. |
| static readonly [TextCommentsRETIRED](../../aspose.medical.dicom.tags/tag/textcommentsretired) | (4000,4000) VR=LT VM=1 Text Comments (RETIRED). |
| static readonly [TextFormatIDRETIRED](../../aspose.medical.dicom.tags/tag/textformatidretired) | (0000,5130) VR=CS VM=1 Text Format ID (RETIRED). |
| static readonly [TextObjectSequence](../../aspose.medical.dicom.tags/tag/textobjectsequence) | (0070,0008) VR=SQ VM=1 Text Object Sequence. |
| static readonly [TextString](../../aspose.medical.dicom.tags/tag/textstring) | (2030,0020) VR=LO VM=1 Text String. |
| static readonly [TextStyleSequence](../../aspose.medical.dicom.tags/tag/textstylesequence) | (0070,0231) VR=SQ VM=1 Text Style Sequence. |
| static readonly [TextureLabel](../../aspose.medical.dicom.tags/tag/texturelabel) | (0080,0009) VR=SH VM=1 Texture Label. |
| static readonly [TextValue](../../aspose.medical.dicom.tags/tag/textvalue) | (0040,A160) VR=UT VM=1 Text Value. |
| static readonly [TherapeuticRoleCategoryCodeSequence](../../aspose.medical.dicom.tags/tag/therapeuticrolecategorycodesequence) | (3010,0064) VR=SQ VM=1 Therapeutic Role Category Code Sequence. |
| static readonly [TherapeuticRoleTypeCodeSequence](../../aspose.medical.dicom.tags/tag/therapeuticroletypecodesequence) | (3010,0065) VR=SQ VM=1 Therapeutic Role Type Code Sequence. |
| static readonly [TherapyDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/therapydescriptionretired) | (0018,0039) VR=CS VM=1 Therapy Description (RETIRED). |
| static readonly [TherapyTypeRETIRED](../../aspose.medical.dicom.tags/tag/therapytyperetired) | (0018,0037) VR=CS VM=1 Therapy Type (RETIRED). |
| static readonly [ThermalCameraCalibrationTypeRETIRED](../../aspose.medical.dicom.tags/tag/thermalcameracalibrationtyperetired) | (0014,601F) VR=CS VM=1 Thermal Camera Calibration Type (RETIRED). |
| static readonly [ThermalCameraCoreSequenceRETIRED](../../aspose.medical.dicom.tags/tag/thermalcameracoresequenceretired) | (0014,601D) VR=SQ VM=1 Thermal Camera Core Sequence (RETIRED). |
| static readonly [ThermalCameraSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/thermalcamerasettingssequenceretired) | (0014,6001) VR=SQ VM=1 Thermal Camera Settings Sequence (RETIRED). |
| static readonly [ThermalConductivityOfExposedSurfaceRETIRED](../../aspose.medical.dicom.tags/tag/thermalconductivityofexposedsurfaceretired) | (0014,6046) VR=DS VM=1 Thermal Conductivity of Exposed Surface (RETIRED). |
| static readonly [ThermalSourceModulationFrequencyRETIRED](../../aspose.medical.dicom.tags/tag/thermalsourcemodulationfrequencyretired) | (0014,600B) VR=DS VM=1 Thermal Source Modulation Frequency (RETIRED). |
| static readonly [ThermalSourceMotionStateRETIRED](../../aspose.medical.dicom.tags/tag/thermalsourcemotionstateretired) | (0014,602C) VR=CS VM=1 Thermal Source Motion State (RETIRED). |
| static readonly [ThermalSourceMotionTypeRETIRED](../../aspose.medical.dicom.tags/tag/thermalsourcemotiontyperetired) | (0014,602D) VR=CS VM=1 Thermal Source Motion Type (RETIRED). |
| static readonly [ThermalSourceSequenceRETIRED](../../aspose.medical.dicom.tags/tag/thermalsourcesequenceretired) | (0014,602B) VR=SQ VM=1 Thermal Source Sequence (RETIRED). |
| static readonly [ThermalSourceSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/thermalsourcesettingssequenceretired) | (0014,6007) VR=SQ VM=1 Thermal Source Settings Sequence (RETIRED). |
| static readonly [ThermalTechniqueRETIRED](../../aspose.medical.dicom.tags/tag/thermaltechniqueretired) | (0014,601C) VR=CS VM=1 Thermal Technique (RETIRED). |
| static readonly [ThermographyDataCaptureMethodRETIRED](../../aspose.medical.dicom.tags/tag/thermographydatacapturemethodretired) | (0014,601B) VR=CS VM=1 Thermography Data Capture Method (RETIRED). |
| static readonly [ThermographyPixelDataUnitRETIRED](../../aspose.medical.dicom.tags/tag/thermographypixeldataunitretired) | (0014,6060) VR=CS VM=1 Thermography Pixel Data Unit (RETIRED). |
| static readonly [ThreatCategoryDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/threatcategorydescriptionretired) | (4010,1013) VR=LT VM=1 Threat Category Description (RETIRED). |
| static readonly [ThreatCategoryRETIRED](../../aspose.medical.dicom.tags/tag/threatcategoryretired) | (4010,1012) VR=CS VM=1 Threat Category (RETIRED). |
| static readonly [ThreatDetectionAlgorithmAndVersionRETIRED](../../aspose.medical.dicom.tags/tag/threatdetectionalgorithmandversionretired) | (4010,1029) VR=LO VM=1-n Threat Detection Algorithm and Version (RETIRED). |
| static readonly [ThreatROIBaseRETIRED](../../aspose.medical.dicom.tags/tag/threatroibaseretired) | (4010,1004) VR=FL VM=3 Threat ROI Base (RETIRED). |
| static readonly [ThreatROIBitmapRETIRED](../../aspose.medical.dicom.tags/tag/threatroibitmapretired) | (4010,1006) VR=OB VM=1 Threat ROI Bitmap (RETIRED). |
| static readonly [ThreatROIExtentsRETIRED](../../aspose.medical.dicom.tags/tag/threatroiextentsretired) | (4010,1005) VR=FL VM=3 Threat ROI Extents (RETIRED). |
| static readonly [ThreatROIVoxelSequenceRETIRED](../../aspose.medical.dicom.tags/tag/threatroivoxelsequenceretired) | (4010,1001) VR=SQ VM=1 Threat ROI Voxel Sequence (RETIRED). |
| static readonly [ThreatSequenceRETIRED](../../aspose.medical.dicom.tags/tag/threatsequenceretired) | (4010,1011) VR=SQ VM=1 Threat Sequence (RETIRED). |
| static readonly [ThreeDDegreeOfFreedomAxis](../../aspose.medical.dicom.tags/tag/threeddegreeoffreedomaxis) | (0068,6490) VR=FD VM=3 3D Degree of Freedom Axis. |
| static readonly [ThreeDImplantTemplateGroupMemberMatchingAxes](../../aspose.medical.dicom.tags/tag/threedimplanttemplategroupmembermatchingaxes) | (0078,0060) VR=FD VM=9 3D Implant Template Group Member Matching Axes. |
| static readonly [ThreeDImplantTemplateGroupMemberMatchingPoint](../../aspose.medical.dicom.tags/tag/threedimplanttemplategroupmembermatchingpoint) | (0078,0050) VR=FD VM=3 3D Implant Template Group Member Matching Point. |
| static readonly [ThreeDLineCoordinates](../../aspose.medical.dicom.tags/tag/threedlinecoordinates) | (0068,65D0) VR=FD VM=6 3D Line Coordinates. |
| static readonly [ThreeDMatingAxes](../../aspose.medical.dicom.tags/tag/threedmatingaxes) | (0068,64D0) VR=FD VM=9 3D Mating Axes. |
| static readonly [ThreeDMatingPoint](../../aspose.medical.dicom.tags/tag/threedmatingpoint) | (0068,64C0) VR=FD VM=3 3D Mating Point. |
| static readonly [ThreeDPlaneNormal](../../aspose.medical.dicom.tags/tag/threedplanenormal) | (0068,6620) VR=FD VM=3 3D Plane Normal. |
| static readonly [ThreeDPlaneOrigin](../../aspose.medical.dicom.tags/tag/threedplaneorigin) | (0068,6610) VR=FD VM=3 3D Plane Origin. |
| static readonly [ThreeDPointCoordinates](../../aspose.medical.dicom.tags/tag/threedpointcoordinates) | (0068,6590) VR=FD VM=3 3D Point Coordinates. |
| static readonly [ThreeDRenderingType](../../aspose.medical.dicom.tags/tag/threedrenderingtype) | (0072,0520) VR=CS VM=1-n 3D Rendering Type. |
| static readonly [ThresholdDensityRETIRED](../../aspose.medical.dicom.tags/tag/thresholddensityretired) | (2040,0100) VR=CS VM=1 Threshold Density (RETIRED). |
| static readonly [ThresholdSequence](../../aspose.medical.dicom.tags/tag/thresholdsequence) | (0070,1B11) VR=SQ VM=1 Threshold Sequence. |
| static readonly [ThresholdType](../../aspose.medical.dicom.tags/tag/thresholdtype) | (0070,1B13) VR=CS VM=1 Threshold Type. |
| static readonly [ThresholdValue](../../aspose.medical.dicom.tags/tag/thresholdvalue) | (0070,1B14) VR=FD VM=1 Threshold Value. |
| static readonly [ThresholdValueSequence](../../aspose.medical.dicom.tags/tag/thresholdvaluesequence) | (0070,1B12) VR=SQ VM=1 Threshold Value Sequence. |
| static readonly [TickAlignment](../../aspose.medical.dicom.tags/tag/tickalignment) | (0070,0274) VR=CS VM=1 Tick Alignment. |
| static readonly [TickLabel](../../aspose.medical.dicom.tags/tag/ticklabel) | (0070,0289) VR=SH VM=1 Tick Label. |
| static readonly [TickLabelAlignment](../../aspose.medical.dicom.tags/tag/ticklabelalignment) | (0070,0279) VR=CS VM=1 Tick Label Alignment. |
| static readonly [TickPosition](../../aspose.medical.dicom.tags/tag/tickposition) | (0070,0288) VR=FL VM=1 Tick Position. |
| static readonly [TIDOffset](../../aspose.medical.dicom.tags/tag/tidoffset) | (0028,6120) VR=SS VM=1 TID Offset. |
| static readonly [TilesOverlap](../../aspose.medical.dicom.tags/tag/tilesoverlap) | (0048,0304) VR=CS VM=1 Tiles Overlap. |
| static readonly [Time](../../aspose.medical.dicom.tags/tag/time) | (0040,A122) VR=TM VM=1 Time. |
| static readonly [TimeBasedImageSetsSequence](../../aspose.medical.dicom.tags/tag/timebasedimagesetssequence) | (0072,0030) VR=SQ VM=1 Time Based Image Sets Sequence. |
| static readonly [TimeDistributionProtocol](../../aspose.medical.dicom.tags/tag/timedistributionprotocol) | (0018,1802) VR=CS VM=1 Time Distribution Protocol. |
| static readonly [TimeDomainFiltering](../../aspose.medical.dicom.tags/tag/timedomainfiltering) | (0018,9065) VR=CS VM=1-2 Time Domain Filtering. |
| static readonly [TimeOfDocumentCreationOrVerbalTransactionTrialRETIRED](../../aspose.medical.dicom.tags/tag/timeofdocumentcreationorverbaltransactiontrialretired) | (0040,A112) VR=TM VM=1 Time of Document Creation or Verbal Transaction (Trial) (RETIRED). |
| static readonly [TimeOfFlightContrast](../../aspose.medical.dicom.tags/tag/timeofflightcontrast) | (0018,9015) VR=CS VM=1 Time of Flight Contrast. |
| static readonly [TimeOfFlightInformationUsed](../../aspose.medical.dicom.tags/tag/timeofflightinformationused) | (0018,9755) VR=CS VM=1 Time of Flight Information Used. |
| static readonly [TimeOfFrameGroupSequence](../../aspose.medical.dicom.tags/tag/timeofframegroupsequence) | (0034,000D) VR=SQ VM=1 Time of Frame Group Sequence. |
| static readonly [TimeOfGainCalibrationRETIRED](../../aspose.medical.dicom.tags/tag/timeofgaincalibrationretired) | (0014,3077) VR=TM VM=1 Time of Gain Calibration (RETIRED). |
| static readonly [TimeOfLastCalibration](../../aspose.medical.dicom.tags/tag/timeoflastcalibration) | (0018,1201) VR=TM VM=1-n Time of Last Calibration. |
| static readonly [TimeOfLastDetectorCalibration](../../aspose.medical.dicom.tags/tag/timeoflastdetectorcalibration) | (0018,700E) VR=TM VM=1 Time of Last Detector Calibration. |
| static readonly [TimeOfSecondaryCapture](../../aspose.medical.dicom.tags/tag/timeofsecondarycapture) | (0018,1014) VR=TM VM=1 Time of Secondary Capture. |
| static readonly [TimeRange](../../aspose.medical.dicom.tags/tag/timerange) | (0008,1163) VR=FD VM=2 Time Range. |
| static readonly [TimeSeriesBlending](../../aspose.medical.dicom.tags/tag/timeseriesblending) | (0070,1B07) VR=CS VM=1 Time Series Blending. |
| static readonly [TimeSliceVector](../../aspose.medical.dicom.tags/tag/timeslicevector) | (0054,0100) VR=US VM=1-n Time Slice Vector. |
| static readonly [TimeSlotInformationSequence](../../aspose.medical.dicom.tags/tag/timeslotinformationsequence) | (0054,0072) VR=SQ VM=1 Time Slot Information Sequence. |
| static readonly [TimeSlotNumberRETIRED](../../aspose.medical.dicom.tags/tag/timeslotnumberretired) | (0020,0017) VR=IS VM=1 Time Slot Number (RETIRED). |
| static readonly [TimeSlotTime](../../aspose.medical.dicom.tags/tag/timeslottime) | (0054,0073) VR=DS VM=1 Time Slot Time. |
| static readonly [TimeSlotVector](../../aspose.medical.dicom.tags/tag/timeslotvector) | (0054,0070) VR=US VM=1-n Time Slot Vector. |
| static readonly [TimeSource](../../aspose.medical.dicom.tags/tag/timesource) | (0018,1801) VR=SH VM=1 Time Source. |
| static readonly [TimezoneOffsetFromUTC](../../aspose.medical.dicom.tags/tag/timezoneoffsetfromutc) | (0008,0201) VR=SH VM=1 Timezone Offset From UTC. |
| static readonly [TIPTypeRETIRED](../../aspose.medical.dicom.tags/tag/tiptyperetired) | (4010,1039) VR=CS VM=1 TIP Type (RETIRED). |
| static readonly [TissueHeterogeneityCorrection](../../aspose.medical.dicom.tags/tag/tissueheterogeneitycorrection) | (3004,0014) VR=CS VM=1-3 Tissue Heterogeneity Correction. |
| static readonly [TissueLocation](../../aspose.medical.dicom.tags/tag/tissuelocation) | (0048,0115) VR=CS VM=1 Tissue Location. |
| static readonly [TMLinePositionX0](../../aspose.medical.dicom.tags/tag/tmlinepositionx0) | (0018,603D) VR=SL VM=1 TM-Line Position X0. |
| static readonly [TMLinePositionX0RetiredRETIRED](../../aspose.medical.dicom.tags/tag/tmlinepositionx0retiredretired) | (0018,603C) VR=UL VM=1 TM-Line Position X0 (Retired) (RETIRED). |
| static readonly [TMLinePositionX1](../../aspose.medical.dicom.tags/tag/tmlinepositionx1) | (0018,6041) VR=SL VM=1 TM-Line Position X1. |
| static readonly [TMLinePositionX1RetiredRETIRED](../../aspose.medical.dicom.tags/tag/tmlinepositionx1retiredretired) | (0018,6040) VR=UL VM=1 TM-Line Position X1 (Retired) (RETIRED). |
| static readonly [TMLinePositionY0](../../aspose.medical.dicom.tags/tag/tmlinepositiony0) | (0018,603F) VR=SL VM=1 TM-Line Position Y0. |
| static readonly [TMLinePositionY0RetiredRETIRED](../../aspose.medical.dicom.tags/tag/tmlinepositiony0retiredretired) | (0018,603E) VR=UL VM=1 TM-Line Position Y0 (Retired) (RETIRED). |
| static readonly [TMLinePositionY1](../../aspose.medical.dicom.tags/tag/tmlinepositiony1) | (0018,6043) VR=SL VM=1 TM-Line Position Y1. |
| static readonly [TMLinePositionY1RetiredRETIRED](../../aspose.medical.dicom.tags/tag/tmlinepositiony1retiredretired) | (0018,6042) VR=UL VM=1 TM-Line Position Y1 (Retired) (RETIRED). |
| static readonly [ToleranceTableLabel](../../aspose.medical.dicom.tags/tag/tolerancetablelabel) | (300A,0043) VR=SH VM=1 Tolerance Table Label. |
| static readonly [ToleranceTableNumber](../../aspose.medical.dicom.tags/tag/tolerancetablenumber) | (300A,0042) VR=IS VM=1 Tolerance Table Number. |
| static readonly [ToleranceTableSequence](../../aspose.medical.dicom.tags/tag/tolerancetablesequence) | (300A,0040) VR=SQ VM=1 Tolerance Table Sequence. |
| static readonly [ToleranceValue](../../aspose.medical.dicom.tags/tag/tolerancevalue) | (300A,062C) VR=FD VM=1 Tolerance Value. |
| static readonly [TomoAngle](../../aspose.medical.dicom.tags/tag/tomoangle) | (0018,1470) VR=DS VM=1 Tomo Angle. |
| static readonly [TomoClass](../../aspose.medical.dicom.tags/tag/tomoclass) | (0018,1491) VR=CS VM=1 Tomo Class. |
| static readonly [TomoLayerHeight](../../aspose.medical.dicom.tags/tag/tomolayerheight) | (0018,1460) VR=DS VM=1 Tomo Layer Height. |
| static readonly [TomotherapeuticControlPointSequence](../../aspose.medical.dicom.tags/tag/tomotherapeuticcontrolpointsequence) | (3010,0098) VR=SQ VM=1 Tomotherapeutic Control Point Sequence. |
| static readonly [TomotherapeuticLeafInitialClosedDurations](../../aspose.medical.dicom.tags/tag/tomotherapeuticleafinitialcloseddurations) | (3010,009A) VR=FD VM=1-n Tomotherapeutic Leaf Initial Closed Durations. |
| static readonly [TomotherapeuticLeafOpenDurations](../../aspose.medical.dicom.tags/tag/tomotherapeuticleafopendurations) | (3010,0099) VR=FD VM=1-n Tomotherapeutic Leaf Open Durations. |
| static readonly [TomoTime](../../aspose.medical.dicom.tags/tag/tomotime) | (0018,1480) VR=DS VM=1 Tomo Time. |
| static readonly [TomoType](../../aspose.medical.dicom.tags/tag/tomotype) | (0018,1490) VR=CS VM=1 Tomo Type. |
| static readonly [TopicAuthorRETIRED](../../aspose.medical.dicom.tags/tag/topicauthorretired) | (0088,0910) VR=LO VM=1 Topic Author (RETIRED). |
| static readonly [TopicKeywordsRETIRED](../../aspose.medical.dicom.tags/tag/topickeywordsretired) | (0088,0912) VR=LO VM=1-32 Topic Keywords (RETIRED). |
| static readonly [TopicSubjectRETIRED](../../aspose.medical.dicom.tags/tag/topicsubjectretired) | (0088,0906) VR=ST VM=1 Topic Subject (RETIRED). |
| static readonly [TopicTitleRETIRED](../../aspose.medical.dicom.tags/tag/topictitleretired) | (0088,0904) VR=LO VM=1 Topic Title (RETIRED). |
| static readonly [TopLeftHandCornerOfLocalizerAreaRETIRED](../../aspose.medical.dicom.tags/tag/toplefthandcorneroflocalizerarearetired) | (0048,0201) VR=US VM=2 Top Left Hand Corner of Localizer Area (RETIRED). |
| static readonly [ToricIOLPowerForExactEmmetropiaSequence](../../aspose.medical.dicom.tags/tag/toriciolpowerforexactemmetropiasequence) | (0022,104A) VR=SQ VM=1 Toric IOL Power for Exact Emmetropia Sequence. |
| static readonly [ToricIOLPowerForExactTargetRefractionSequence](../../aspose.medical.dicom.tags/tag/toriciolpowerforexacttargetrefractionsequence) | (0022,104B) VR=SQ VM=1 Toric IOL Power for Exact Target Refraction Sequence. |
| static readonly [ToricIOLPowerSequence](../../aspose.medical.dicom.tags/tag/toriciolpowersequence) | (0022,1047) VR=SQ VM=1 Toric IOL Power Sequence. |
| static readonly [TotalApertureRETIRED](../../aspose.medical.dicom.tags/tag/totalapertureretired) | (0014,5101) VR=DS VM=1 Total Aperture (RETIRED). |
| static readonly [TotalBlockTrayFactor](../../aspose.medical.dicom.tags/tag/totalblocktrayfactor) | (300A,00F2) VR=DS VM=1 Total Block Tray Factor. |
| static readonly [TotalBlockTrayWaterEquivalentThickness](../../aspose.medical.dicom.tags/tag/totalblocktraywaterequivalentthickness) | (300A,00F3) VR=FL VM=1 Total Block Tray Water-Equivalent Thickness. |
| static readonly [TotalCollimationWidth](../../aspose.medical.dicom.tags/tag/totalcollimationwidth) | (0018,9307) VR=FD VM=1 Total Collimation Width. |
| static readonly [TotalCompensatorTrayFactor](../../aspose.medical.dicom.tags/tag/totalcompensatortrayfactor) | (300A,00E2) VR=DS VM=1 Total Compensator Tray Factor. |
| static readonly [TotalCompensatorTrayWaterEquivalentThickness](../../aspose.medical.dicom.tags/tag/totalcompensatortraywaterequivalentthickness) | (300A,02E3) VR=FL VM=1 Total Compensator Tray Water-Equivalent Thickness. |
| static readonly [TotalGainRETIRED](../../aspose.medical.dicom.tags/tag/totalgainretired) | (0018,5040) VR=DS VM=1 Total Gain (RETIRED). |
| static readonly [TotalNumberOfExposuresRETIRED](../../aspose.medical.dicom.tags/tag/totalnumberofexposuresretired) | (0040,0301) VR=US VM=1 Total Number of Exposures (RETIRED). |
| static readonly [TotalNumberOfPiecesOfMediaCreated](../../aspose.medical.dicom.tags/tag/totalnumberofpiecesofmediacreated) | (2200,000B) VR=US VM=1 Total Number of Pieces of Media Created. |
| static readonly [TotalNumberOfStudyRecords](../../aspose.medical.dicom.tags/tag/totalnumberofstudyrecords) | (0008,0428) VR=UV VM=1 Total Number of Study Records. |
| static readonly [TotalPixelMatrixColumns](../../aspose.medical.dicom.tags/tag/totalpixelmatrixcolumns) | (0048,0006) VR=UL VM=1 Total Pixel Matrix Columns. |
| static readonly [TotalPixelMatrixFocalPlanes](../../aspose.medical.dicom.tags/tag/totalpixelmatrixfocalplanes) | (0048,0303) VR=UL VM=1 Total Pixel Matrix Focal Planes. |
| static readonly [TotalPixelMatrixOriginSequence](../../aspose.medical.dicom.tags/tag/totalpixelmatrixoriginsequence) | (0048,0008) VR=SQ VM=1 Total Pixel Matrix Origin Sequence. |
| static readonly [TotalPixelMatrixRows](../../aspose.medical.dicom.tags/tag/totalpixelmatrixrows) | (0048,0007) VR=UL VM=1 Total Pixel Matrix Rows. |
| static readonly [TotalPrescriptionDose](../../aspose.medical.dicom.tags/tag/totalprescriptiondose) | (300C,0115) VR=FL VM=1 Total Prescription Dose. |
| static readonly [TotalProcessingTimeRETIRED](../../aspose.medical.dicom.tags/tag/totalprocessingtimeretired) | (4010,1069) VR=FL VM=1 Total Processing Time (RETIRED). |
| static readonly [TotalReferenceAirKerma](../../aspose.medical.dicom.tags/tag/totalreferenceairkerma) | (300A,0250) VR=DS VM=1 Total Reference Air Kerma. |
| static readonly [TotalTimeOfFluoroscopyRETIRED](../../aspose.medical.dicom.tags/tag/totaltimeoffluoroscopyretired) | (0040,0300) VR=US VM=1 Total Time of Fluoroscopy (RETIRED). |
| static readonly [TotalTimeRETIRED](../../aspose.medical.dicom.tags/tag/totaltimeretired) | (50xx,200A) VR=UL VM=1 Total Time (RETIRED). |
| static readonly [TotalWedgeTrayWaterEquivalentThickness](../../aspose.medical.dicom.tags/tag/totalwedgetraywaterequivalentthickness) | (300A,00D7) VR=FL VM=1 Total Wedge Tray Water-Equivalent Thickness. |
| static readonly [TrackingAlgorithmIdentificationSequence](../../aspose.medical.dicom.tags/tag/trackingalgorithmidentificationsequence) | (0066,0104) VR=SQ VM=1 Tracking Algorithm Identification Sequence. |
| static readonly [TrackingID](../../aspose.medical.dicom.tags/tag/trackingid) | (0062,0020) VR=UT VM=1 Tracking ID. |
| static readonly [TrackingUID](../../aspose.medical.dicom.tags/tag/trackinguid) | (0062,0021) VR=UI VM=1 Tracking UID. |
| static readonly [TrackPointIndexList](../../aspose.medical.dicom.tags/tag/trackpointindexlist) | (0066,0129) VR=OL VM=1 Track Point Index List. |
| static readonly [TrackSequence](../../aspose.medical.dicom.tags/tag/tracksequence) | (0066,0102) VR=SQ VM=1 Track Sequence. |
| static readonly [TrackSetAnatomicalTypeCodeSequence](../../aspose.medical.dicom.tags/tag/tracksetanatomicaltypecodesequence) | (0066,0108) VR=SQ VM=1 Track Set Anatomical Type Code Sequence. |
| static readonly [TrackSetDescription](../../aspose.medical.dicom.tags/tag/tracksetdescription) | (0066,0107) VR=UT VM=1 Track Set Description. |
| static readonly [TrackSetLabel](../../aspose.medical.dicom.tags/tag/tracksetlabel) | (0066,0106) VR=LO VM=1 Track Set Label. |
| static readonly [TrackSetNumber](../../aspose.medical.dicom.tags/tag/tracksetnumber) | (0066,0105) VR=UL VM=1 Track Set Number. |
| static readonly [TrackSetSequence](../../aspose.medical.dicom.tags/tag/tracksetsequence) | (0066,0101) VR=SQ VM=1 Track Set Sequence. |
| static readonly [TrackSetStatisticsSequence](../../aspose.medical.dicom.tags/tag/tracksetstatisticssequence) | (0066,0124) VR=SQ VM=1 Track Set Statistics Sequence. |
| static readonly [TrackStatisticsSequence](../../aspose.medical.dicom.tags/tag/trackstatisticssequence) | (0066,0130) VR=SQ VM=1 Track Statistics Sequence. |
| static readonly [TransactionStatus](../../aspose.medical.dicom.tags/tag/transactionstatus) | (0008,0417) VR=CS VM=1 Transaction Status. |
| static readonly [TransactionStatusComment](../../aspose.medical.dicom.tags/tag/transactionstatuscomment) | (0008,0418) VR=LT VM=1 Transaction Status Comment. |
| static readonly [TransactionUID](../../aspose.medical.dicom.tags/tag/transactionuid) | (0008,1195) VR=UI VM=1 Transaction UID. |
| static readonly [TransducerApplicationCodeSequence](../../aspose.medical.dicom.tags/tag/transducerapplicationcodesequence) | (0018,980F) VR=SQ VM=1 Transducer Application Code Sequence. |
| static readonly [TransducerBeamSteeringCodeSequence](../../aspose.medical.dicom.tags/tag/transducerbeamsteeringcodesequence) | (0018,980E) VR=SQ VM=1 Transducer Beam Steering Code Sequence. |
| static readonly [TransducerData](../../aspose.medical.dicom.tags/tag/transducerdata) | (0018,5010) VR=LO VM=1-n Transducer Data. |
| static readonly [TransducerFrequency](../../aspose.medical.dicom.tags/tag/transducerfrequency) | (0018,6030) VR=UL VM=1 Transducer Frequency. |
| static readonly [TransducerGeometryCodeSequence](../../aspose.medical.dicom.tags/tag/transducergeometrycodesequence) | (0018,980D) VR=SQ VM=1 Transducer Geometry Code Sequence. |
| static readonly [TransducerIdentificationSequence](../../aspose.medical.dicom.tags/tag/transduceridentificationsequence) | (0018,5011) VR=SQ VM=1 Transducer Identification Sequence. |
| static readonly [TransducerOrientationModifierSequenceRETIRED](../../aspose.medical.dicom.tags/tag/transducerorientationmodifiersequenceretired) | (0008,2246) VR=SQ VM=1 Transducer Orientation Modifier Sequence (RETIRED). |
| static readonly [TransducerOrientationRETIRED](../../aspose.medical.dicom.tags/tag/transducerorientationretired) | (0008,2204) VR=CS VM=1 Transducer Orientation (RETIRED). |
| static readonly [TransducerOrientationSequenceRETIRED](../../aspose.medical.dicom.tags/tag/transducerorientationsequenceretired) | (0008,2244) VR=SQ VM=1 Transducer Orientation Sequence (RETIRED). |
| static readonly [TransducerPositionModifierSequenceRETIRED](../../aspose.medical.dicom.tags/tag/transducerpositionmodifiersequenceretired) | (0008,2242) VR=SQ VM=1 Transducer Position Modifier Sequence (RETIRED). |
| static readonly [TransducerPositionRETIRED](../../aspose.medical.dicom.tags/tag/transducerpositionretired) | (0008,2200) VR=CS VM=1 Transducer Position (RETIRED). |
| static readonly [TransducerPositionSequenceRETIRED](../../aspose.medical.dicom.tags/tag/transducerpositionsequenceretired) | (0008,2240) VR=SQ VM=1 Transducer Position Sequence (RETIRED). |
| static readonly [TransducerResponseSequence](../../aspose.medical.dicom.tags/tag/transducerresponsesequence) | (0018,982C) VR=SQ VM=1 Transducer Response Sequence. |
| static readonly [TransducerScanPatternCodeSequence](../../aspose.medical.dicom.tags/tag/transducerscanpatterncodesequence) | (0018,9809) VR=SQ VM=1 Transducer Scan Pattern Code Sequence. |
| static readonly [TransducerTechnologySequence](../../aspose.medical.dicom.tags/tag/transducertechnologysequence) | (0018,9831) VR=SQ VM=1 Transducer Technology Sequence. |
| static readonly [TransducerType](../../aspose.medical.dicom.tags/tag/transducertype) | (0018,6031) VR=CS VM=1 Transducer Type. |
| static readonly [TransferSyntaxUID](../../aspose.medical.dicom.tags/tag/transfersyntaxuid) | (0002,0010) VR=UI VM=1 Transfer Syntax UID. |
| static readonly [TransferTubeLength](../../aspose.medical.dicom.tags/tag/transfertubelength) | (300A,02A4) VR=DS VM=1 Transfer Tube Length. |
| static readonly [TransferTubeNumber](../../aspose.medical.dicom.tags/tag/transfertubenumber) | (300A,02A2) VR=IS VM=1 Transfer Tube Number. |
| static readonly [TransformationAlgorithmSequence](../../aspose.medical.dicom.tags/tag/transformationalgorithmsequence) | (0022,1513) VR=SQ VM=1 Transformation Algorithm Sequence. |
| static readonly [TransformationMethodCodeSequence](../../aspose.medical.dicom.tags/tag/transformationmethodcodesequence) | (0022,1512) VR=SQ VM=1 Transformation Method Code Sequence. |
| static readonly [TransformDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/transformdescriptionretired) | (0014,2222) VR=ST VM=1 Transform Description (RETIRED). |
| static readonly [TransformedAxisUnitsRETIRED](../../aspose.medical.dicom.tags/tag/transformedaxisunitsretired) | (0014,2228) VR=CS VM=1 Transformed Axis Units (RETIRED). |
| static readonly [TransformLabelRETIRED](../../aspose.medical.dicom.tags/tag/transformlabelretired) | (0028,0400) VR=LO VM=1 Transform Label (RETIRED). |
| static readonly [TransformNumberOfAxesRETIRED](../../aspose.medical.dicom.tags/tag/transformnumberofaxesretired) | (0014,2224) VR=IS VM=1 Transform Number of Axes (RETIRED). |
| static readonly [TransformOrderOfAxesRETIRED](../../aspose.medical.dicom.tags/tag/transformorderofaxesretired) | (0014,2226) VR=IS VM=1-n Transform Order of Axes (RETIRED). |
| static readonly [TransformVersionNumberRETIRED](../../aspose.medical.dicom.tags/tag/transformversionnumberretired) | (0028,0401) VR=LO VM=1 Transform Version Number (RETIRED). |
| static readonly [TranslationRateXRETIRED](../../aspose.medical.dicom.tags/tag/translationratexretired) | (0014,409C) VR=DS VM=1 Translation Rate X (RETIRED). |
| static readonly [TranslationRateYRETIRED](../../aspose.medical.dicom.tags/tag/translationrateyretired) | (0014,409D) VR=DS VM=1 Translation Rate Y (RETIRED). |
| static readonly [TransmitCoilManufacturerName](../../aspose.medical.dicom.tags/tag/transmitcoilmanufacturername) | (0018,9050) VR=LO VM=1 Transmit Coil Manufacturer Name. |
| static readonly [TransmitCoilName](../../aspose.medical.dicom.tags/tag/transmitcoilname) | (0018,1251) VR=SH VM=1 Transmit Coil Name. |
| static readonly [TransmitCoilType](../../aspose.medical.dicom.tags/tag/transmitcoiltype) | (0018,9051) VR=CS VM=1 Transmit Coil Type. |
| static readonly [TransmitterFrequency](../../aspose.medical.dicom.tags/tag/transmitterfrequency) | (0018,9098) VR=FD VM=1-2 Transmitter Frequency. |
| static readonly [TransmitTransducerSequenceRETIRED](../../aspose.medical.dicom.tags/tag/transmittransducersequenceretired) | (0014,4010) VR=SQ VM=1 Transmit Transducer Sequence (RETIRED). |
| static readonly [TransmitTransducerSettingsSequenceRETIRED](../../aspose.medical.dicom.tags/tag/transmittransducersettingssequenceretired) | (0014,4050) VR=SQ VM=1 Transmit Transducer Settings Sequence (RETIRED). |
| static readonly [TransportClassificationRETIRED](../../aspose.medical.dicom.tags/tag/transportclassificationretired) | (4010,1067) VR=CS VM=1 Transport Classification (RETIRED). |
| static readonly [TransverseDetectorSeparation](../../aspose.medical.dicom.tags/tag/transversedetectorseparation) | (0018,9726) VR=FD VM=1 Transverse Detector Separation. |
| static readonly [TransverseMash](../../aspose.medical.dicom.tags/tag/transversemash) | (0054,1202) VR=IS VM=1 Transverse Mash. |
| static readonly [TrayAccessoryCode](../../aspose.medical.dicom.tags/tag/trayaccessorycode) | (300A,0355) VR=LO VM=1 Tray Accessory Code. |
| static readonly [TreatmentControlPointDate](../../aspose.medical.dicom.tags/tag/treatmentcontrolpointdate) | (3008,0024) VR=DA VM=1 Treatment Control Point Date. |
| static readonly [TreatmentControlPointTime](../../aspose.medical.dicom.tags/tag/treatmentcontrolpointtime) | (3008,0025) VR=TM VM=1 Treatment Control Point Time. |
| static readonly [TreatmentDate](../../aspose.medical.dicom.tags/tag/treatmentdate) | (3008,0250) VR=DA VM=1 Treatment Date. |
| static readonly [TreatmentDeliveryContinuationFlag](../../aspose.medical.dicom.tags/tag/treatmentdeliverycontinuationflag) | (300A,0708) VR=CS VM=1 Treatment Delivery Continuation Flag. |
| static readonly [TreatmentDeliveryType](../../aspose.medical.dicom.tags/tag/treatmentdeliverytype) | (300A,00CE) VR=CS VM=1 Treatment Delivery Type. |
| static readonly [TreatmentDeviceIdentificationSequence](../../aspose.medical.dicom.tags/tag/treatmentdeviceidentificationsequence) | (300A,063A) VR=SQ VM=1 Treatment Device Identification Sequence. |
| static readonly [TreatmentMachineName](../../aspose.medical.dicom.tags/tag/treatmentmachinename) | (300A,00B2) VR=SH VM=1 Treatment Machine Name. |
| static readonly [TreatmentMachineSequence](../../aspose.medical.dicom.tags/tag/treatmentmachinesequence) | (300A,0206) VR=SQ VM=1 Treatment Machine Sequence. |
| static readonly [TreatmentMachineSpecialModeCodeSequence](../../aspose.medical.dicom.tags/tag/treatmentmachinespecialmodecodesequence) | (300A,0635) VR=SQ VM=1 Treatment Machine Special Mode Code Sequence. |
| static readonly [TreatmentPositionGroupLabel](../../aspose.medical.dicom.tags/tag/treatmentpositiongrouplabel) | (300A,0608) VR=LO VM=1 Treatment Position Group Label. |
| static readonly [TreatmentPositionGroupSequence](../../aspose.medical.dicom.tags/tag/treatmentpositiongroupsequence) | (300A,060A) VR=SQ VM=1 Treatment Position Group Sequence. |
| static readonly [TreatmentPositionGroupUID](../../aspose.medical.dicom.tags/tag/treatmentpositiongroupuid) | (300A,0609) VR=UI VM=1 Treatment Position Group UID. |
| static readonly [TreatmentPositionIndex](../../aspose.medical.dicom.tags/tag/treatmentpositionindex) | (300A,0606) VR=US VM=1 Treatment Position Index. |
| static readonly [TreatmentPositionSequence](../../aspose.medical.dicom.tags/tag/treatmentpositionsequence) | (300A,063F) VR=SQ VM=1 Treatment Position Sequence. |
| static readonly [TreatmentProtocols](../../aspose.medical.dicom.tags/tag/treatmentprotocols) | (300A,0009) VR=LO VM=1-n Treatment Protocols. |
| static readonly [TreatmentRecordContentOrigin](../../aspose.medical.dicom.tags/tag/treatmentrecordcontentorigin) | (300A,0709) VR=CS VM=1 Treatment Record Content Origin. |
| static readonly [TreatmentSessionApplicationSetupSequence](../../aspose.medical.dicom.tags/tag/treatmentsessionapplicationsetupsequence) | (3008,0110) VR=SQ VM=1 Treatment Session Application Setup Sequence. |
| static readonly [TreatmentSessionBeamSequence](../../aspose.medical.dicom.tags/tag/treatmentsessionbeamsequence) | (3008,0020) VR=SQ VM=1 Treatment Session Beam Sequence. |
| static readonly [TreatmentSessionIonBeamSequence](../../aspose.medical.dicom.tags/tag/treatmentsessionionbeamsequence) | (3008,0021) VR=SQ VM=1 Treatment Session Ion Beam Sequence. |
| static readonly [TreatmentSessionUID](../../aspose.medical.dicom.tags/tag/treatmentsessionuid) | (300A,0700) VR=UI VM=1 Treatment Session UID. |
| static readonly [TreatmentSite](../../aspose.medical.dicom.tags/tag/treatmentsite) | (3010,0077) VR=LO VM=1 Treatment Site. |
| static readonly [TreatmentSiteCodeSequence](../../aspose.medical.dicom.tags/tag/treatmentsitecodesequence) | (3010,0078) VR=SQ VM=1 Treatment Site Code Sequence. |
| static readonly [TreatmentSiteModifierCodeSequence](../../aspose.medical.dicom.tags/tag/treatmentsitemodifiercodesequence) | (3010,0089) VR=SQ VM=1 Treatment Site Modifier Code Sequence. |
| static readonly [TreatmentSitesRETIRED](../../aspose.medical.dicom.tags/tag/treatmentsitesretired) | (300A,000B) VR=LO VM=1-n Treatment Sites (RETIRED). |
| static readonly [TreatmentStatusComment](../../aspose.medical.dicom.tags/tag/treatmentstatuscomment) | (3008,0202) VR=ST VM=1 Treatment Status Comment. |
| static readonly [TreatmentSummaryCalculatedDoseReferenceSequence](../../aspose.medical.dicom.tags/tag/treatmentsummarycalculateddosereferencesequence) | (3008,0050) VR=SQ VM=1 Treatment Summary Calculated Dose Reference Sequence. |
| static readonly [TreatmentSummaryMeasuredDoseReferenceSequence](../../aspose.medical.dicom.tags/tag/treatmentsummarymeasureddosereferencesequence) | (3008,00E0) VR=SQ VM=1 Treatment Summary Measured Dose Reference Sequence. |
| static readonly [TreatmentTechniqueNotes](../../aspose.medical.dicom.tags/tag/treatmenttechniquenotes) | (3010,007A) VR=UT VM=1 Treatment Technique Notes. |
| static readonly [TreatmentTerminationCodeRETIRED](../../aspose.medical.dicom.tags/tag/treatmentterminationcoderetired) | (3008,002B) VR=SH VM=1 Treatment Termination Code (RETIRED). |
| static readonly [TreatmentTerminationDescription](../../aspose.medical.dicom.tags/tag/treatmentterminationdescription) | (300A,0730) VR=ST VM=1 Treatment Termination Description. |
| static readonly [TreatmentTerminationStatus](../../aspose.medical.dicom.tags/tag/treatmentterminationstatus) | (3008,002A) VR=CS VM=1 Treatment Termination Status. |
| static readonly [TreatmentTime](../../aspose.medical.dicom.tags/tag/treatmenttime) | (3008,0251) VR=TM VM=1 Treatment Time. |
| static readonly [TreatmentTimeLimit](../../aspose.medical.dicom.tags/tag/treatmenttimelimit) | (300A,062E) VR=FD VM=1 Treatment Time Limit. |
| static readonly [TreatmentToleranceViolationAttributeSequence](../../aspose.medical.dicom.tags/tag/treatmenttoleranceviolationattributesequence) | (300A,0733) VR=SQ VM=1 Treatment Tolerance Violation Attribute Sequence. |
| static readonly [TreatmentToleranceViolationCategory](../../aspose.medical.dicom.tags/tag/treatmenttoleranceviolationcategory) | (300A,0732) VR=CS VM=1 Treatment Tolerance Violation Category. |
| static readonly [TreatmentToleranceViolationCauseCodeSequence](../../aspose.medical.dicom.tags/tag/treatmenttoleranceviolationcausecodesequence) | (300A,0762) VR=SQ VM=1 Treatment Tolerance Violation Cause Code Sequence. |
| static readonly [TreatmentToleranceViolationDateTime](../../aspose.medical.dicom.tags/tag/treatmenttoleranceviolationdatetime) | (300A,0736) VR=DT VM=1 Treatment Tolerance Violation DateTime. |
| static readonly [TreatmentToleranceViolationDescription](../../aspose.medical.dicom.tags/tag/treatmenttoleranceviolationdescription) | (300A,0734) VR=ST VM=1 Treatment Tolerance Violation Description. |
| static readonly [TreatmentToleranceViolationIdentification](../../aspose.medical.dicom.tags/tag/treatmenttoleranceviolationidentification) | (300A,0735) VR=ST VM=1 Treatment Tolerance Violation Identification. |
| static readonly [TreatmentToleranceViolationSequence](../../aspose.medical.dicom.tags/tag/treatmenttoleranceviolationsequence) | (300A,0731) VR=SQ VM=1 Treatment Tolerance Violation Sequence. |
| static readonly [TreatmentToleranceViolationTypeCodeSequence](../../aspose.medical.dicom.tags/tag/treatmenttoleranceviolationtypecodesequence) | (300A,0761) VR=SQ VM=1 Treatment Tolerance Violation Type Code Sequence. |
| static readonly [TreatmentVerificationStatus](../../aspose.medical.dicom.tags/tag/treatmentverificationstatus) | (3008,002C) VR=CS VM=1 Treatment Verification Status. |
| static readonly [TriangleFanSequence](../../aspose.medical.dicom.tags/tag/trianglefansequence) | (0066,0027) VR=SQ VM=1 Triangle Fan Sequence. |
| static readonly [TrianglePointIndexListRETIRED](../../aspose.medical.dicom.tags/tag/trianglepointindexlistretired) | (0066,0023) VR=OW VM=1 Triangle Point Index List (RETIRED). |
| static readonly [TriangleStripSequence](../../aspose.medical.dicom.tags/tag/trianglestripsequence) | (0066,0026) VR=SQ VM=1 Triangle Strip Sequence. |
| static readonly [TriggerSamplePosition](../../aspose.medical.dicom.tags/tag/triggersampleposition) | (0018,106E) VR=UL VM=1 Trigger Sample Position. |
| static readonly [TriggerSourceOrType](../../aspose.medical.dicom.tags/tag/triggersourceortype) | (0018,1061) VR=LO VM=1 Trigger Source or Type. |
| static readonly [TriggerTime](../../aspose.medical.dicom.tags/tag/triggertime) | (0018,1060) VR=DS VM=1 Trigger Time. |
| static readonly [TriggerTimeOffset](../../aspose.medical.dicom.tags/tag/triggertimeoffset) | (0018,1069) VR=DS VM=1 Trigger Time Offset. |
| static readonly [TriggerVector](../../aspose.medical.dicom.tags/tag/triggervector) | (0054,0210) VR=IS VM=1-n Trigger Vector. |
| static readonly [TriggerWindow](../../aspose.medical.dicom.tags/tag/triggerwindow) | (0018,1094) VR=IS VM=1 Trigger Window. |
| static readonly [Trim](../../aspose.medical.dicom.tags/tag/trim) | (2010,0140) VR=CS VM=1 Trim. |
| static readonly [TubeAngle](../../aspose.medical.dicom.tags/tag/tubeangle) | (0018,9303) VR=FD VM=1 Tube Angle. |
| static readonly [TwoDDegreeOfFreedomAxis](../../aspose.medical.dicom.tags/tag/twoddegreeoffreedomaxis) | (0068,64F0) VR=FD VM=3 2D Degree of Freedom Axis. |
| static readonly [TwoDDegreeOfFreedomSequence](../../aspose.medical.dicom.tags/tag/twoddegreeoffreedomsequence) | (0068,6470) VR=SQ VM=1 2D Degree of Freedom Sequence. |
| static readonly [TwoDimensionalToThreeDimensionalMapData](../../aspose.medical.dicom.tags/tag/twodimensionaltothreedimensionalmapdata) | (0022,1531) VR=OF VM=1 Two Dimensional to Three Dimensional Map Data. |
| static readonly [TwoDimensionalToThreeDimensionalMapSequence](../../aspose.medical.dicom.tags/tag/twodimensionaltothreedimensionalmapsequence) | (0022,1518) VR=SQ VM=1 Two Dimensional to Three Dimensional Map Sequence. |
| static readonly [TwoDImplantTemplateGroupMemberMatchingAxes](../../aspose.medical.dicom.tags/tag/twodimplanttemplategroupmembermatchingaxes) | (0078,00A0) VR=FD VM=4 2D Implant Template Group Member Matching Axes. |
| static readonly [TwoDImplantTemplateGroupMemberMatchingPoint](../../aspose.medical.dicom.tags/tag/twodimplanttemplategroupmembermatchingpoint) | (0078,0090) VR=FD VM=2 2D Implant Template Group Member Matching Point. |
| static readonly [TwoDLineCoordinates](../../aspose.medical.dicom.tags/tag/twodlinecoordinates) | (0068,65B0) VR=FD VM=4 2D Line Coordinates. |
| static readonly [TwoDLineCoordinatesSequence](../../aspose.medical.dicom.tags/tag/twodlinecoordinatessequence) | (0068,65A0) VR=SQ VM=1 2D Line Coordinates Sequence. |
| static readonly [TwoDMatingAxes](../../aspose.medical.dicom.tags/tag/twodmatingaxes) | (0068,6460) VR=FD VM=4 2D Mating Axes. |
| static readonly [TwoDMatingFeatureCoordinatesSequence](../../aspose.medical.dicom.tags/tag/twodmatingfeaturecoordinatessequence) | (0068,6430) VR=SQ VM=1 2D Mating Feature Coordinates Sequence. |
| static readonly [TwoDMatingPoint](../../aspose.medical.dicom.tags/tag/twodmatingpoint) | (0068,6450) VR=FD VM=2 2D Mating Point. |
| static readonly [TwoDPlaneCoordinatesSequence](../../aspose.medical.dicom.tags/tag/twodplanecoordinatessequence) | (0068,65E0) VR=SQ VM=1 2D Plane Coordinates Sequence. |
| static readonly [TwoDPlaneIntersection](../../aspose.medical.dicom.tags/tag/twodplaneintersection) | (0068,65F0) VR=FD VM=4 2D Plane Intersection. |
| static readonly [TwoDPointCoordinates](../../aspose.medical.dicom.tags/tag/twodpointcoordinates) | (0068,6560) VR=FD VM=2 2D Point Coordinates. |
| static readonly [TwoDPointCoordinatesSequence](../../aspose.medical.dicom.tags/tag/twodpointcoordinatessequence) | (0068,6550) VR=SQ VM=1 2D Point Coordinates Sequence. |
| static readonly [TypeOfDataRETIRED](../../aspose.medical.dicom.tags/tag/typeofdataretired) | (50xx,0020) VR=CS VM=1 Type of Data (RETIRED). |
| static readonly [TypeOfDetectorMotion](../../aspose.medical.dicom.tags/tag/typeofdetectormotion) | (0054,0202) VR=CS VM=1 Type of Detector Motion. |
| static readonly [TypeOfFilters](../../aspose.medical.dicom.tags/tag/typeoffilters) | (0018,1161) VR=LO VM=1-n Type of Filters. |
| static readonly [TypeOfInstances](../../aspose.medical.dicom.tags/tag/typeofinstances) | (0040,E020) VR=CS VM=1 Type of Instances. |
| static readonly [TypeOfOpticalCorrection](../../aspose.medical.dicom.tags/tag/typeofopticalcorrection) | (0022,1046) VR=CS VM=1 Type of Optical Correction. |
| static readonly [TypeOfPatientID](../../aspose.medical.dicom.tags/tag/typeofpatientid) | (0010,0022) VR=CS VM=1 Type of Patient ID. |
| static readonly [TypeOfSynchronization](../../aspose.medical.dicom.tags/tag/typeofsynchronization) | (0072,0434) VR=CS VM=1 Type of Synchronization. |
| static readonly [UDISequence](../../aspose.medical.dicom.tags/tag/udisequence) | (0018,100A) VR=SQ VM=1 UDI Sequence. |
| static readonly [UID](../../aspose.medical.dicom.tags/tag/uid) | (0040,A124) VR=UI VM=1 UID. |
| static readonly [UltrasoundAcquisitionGeometry](../../aspose.medical.dicom.tags/tag/ultrasoundacquisitiongeometry) | (0020,9307) VR=CS VM=1 Ultrasound Acquisition Geometry. |
| static readonly [UltrasoundColorDataPresent](../../aspose.medical.dicom.tags/tag/ultrasoundcolordatapresent) | (0028,0014) VR=US VM=1 Ultrasound Color Data Present. |
| static readonly [UltrasoundOphthalmicAxialLengthMeasurementsSequence](../../aspose.medical.dicom.tags/tag/ultrasoundophthalmicaxiallengthmeasurementssequence) | (0022,1220) VR=SQ VM=1 Ultrasound Ophthalmic Axial Length Measurements Sequence. |
| static readonly [UltrasoundSelectedOphthalmicAxialLengthSequence](../../aspose.medical.dicom.tags/tag/ultrasoundselectedophthalmicaxiallengthsequence) | (0022,1230) VR=SQ VM=1 Ultrasound Selected Ophthalmic Axial Length Sequence. |
| static readonly [UnassignedPerFrameConvertedAttributesSequence](../../aspose.medical.dicom.tags/tag/unassignedperframeconvertedattributessequence) | (0020,9171) VR=SQ VM=1 Unassigned Per-Frame Converted Attributes Sequence. |
| static readonly [UnassignedSharedConvertedAttributesSequence](../../aspose.medical.dicom.tags/tag/unassignedsharedconvertedattributessequence) | (0020,9170) VR=SQ VM=1 Unassigned Shared Converted Attributes Sequence. |
| static readonly [Underlined](../../aspose.medical.dicom.tags/tag/underlined) | (0070,0248) VR=CS VM=1 Underlined. |
| static readonly [UnformattedTextValue](../../aspose.medical.dicom.tags/tag/unformattedtextvalue) | (0070,0006) VR=ST VM=1 Unformatted Text Value. |
| static readonly [UnifiedProcedureStepListStatus](../../aspose.medical.dicom.tags/tag/unifiedprocedurestepliststatus) | (0074,1246) VR=CS VM=1 Unified Procedure Step List Status. |
| static readonly [UnifiedProcedureStepPerformedProcedureSequence](../../aspose.medical.dicom.tags/tag/unifiedprocedurestepperformedproceduresequence) | (0074,1216) VR=SQ VM=1 Unified Procedure Step Performed Procedure Sequence. |
| static readonly [UniformResourceLocatorTrialRETIRED](../../aspose.medical.dicom.tags/tag/uniformresourcelocatortrialretired) | (0040,A992) VR=ST VM=1 Uniform Resource Locator (Trial) (RETIRED). |
| static readonly [UniqueDeviceIdentifier](../../aspose.medical.dicom.tags/tag/uniquedeviceidentifier) | (0018,1009) VR=UT VM=1 Unique Device Identifier. |
| static readonly [Units](../../aspose.medical.dicom.tags/tag/units) | (0054,1001) VR=CS VM=1 Units. |
| static readonly [UniversalEntityID](../../aspose.medical.dicom.tags/tag/universalentityid) | (0040,0032) VR=UT VM=1 Universal Entity ID. |
| static readonly [UniversalEntityIDType](../../aspose.medical.dicom.tags/tag/universalentityidtype) | (0040,0033) VR=CS VM=1 Universal Entity ID Type. |
| static readonly [UnspecifiedLateralityLensSequence](../../aspose.medical.dicom.tags/tag/unspecifiedlateralitylenssequence) | (0046,0016) VR=SQ VM=1 Unspecified Laterality Lens Sequence. |
| static readonly [UpdatedMetadataSequence](../../aspose.medical.dicom.tags/tag/updatedmetadatasequence) | (0008,041E) VR=SQ VM=1 Updated Metadata Sequence. |
| static readonly [UpperCutoffFrequency](../../aspose.medical.dicom.tags/tag/uppercutofffrequency) | (0018,9830) VR=FD VM=1 Upper Cutoff Frequency. |
| static readonly [UpperLimitNumberOfPersistentFluoroscopyFrames](../../aspose.medical.dicom.tags/tag/upperlimitnumberofpersistentfluoroscopyframes) | (0018,11B5) VR=IS VM=1 Upper Limit Number Of Persistent Fluoroscopy Frames. |
| static readonly [UpperLowerPixelValuesRETIRED](../../aspose.medical.dicom.tags/tag/upperlowerpixelvaluesretired) | (0018,1240) VR=IS VM=1-n Upper/Lower Pixel Values (RETIRED). |
| static readonly [UrgencyOrPriorityAlertsTrialRETIRED](../../aspose.medical.dicom.tags/tag/urgencyorpriorityalertstrialretired) | (0040,A057) VR=CS VM=1-n Urgency or Priority Alerts (Trial) (RETIRED). |
| static readonly [URNCodeValue](../../aspose.medical.dicom.tags/tag/urncodevalue) | (0008,0120) VR=UR VM=1 URN Code Value. |
| static readonly [UsedFiducialsSequence](../../aspose.medical.dicom.tags/tag/usedfiducialssequence) | (0070,0314) VR=SQ VM=1 Used Fiducials Sequence. |
| static readonly [UsedRTStructureSetROISequence](../../aspose.medical.dicom.tags/tag/usedrtstructuresetroisequence) | (0070,0315) VR=SQ VM=1 Used RT Structure Set ROI Sequence. |
| static readonly [UsedSegmentsSequence](../../aspose.medical.dicom.tags/tag/usedsegmentssequence) | (0062,0012) VR=SQ VM=1 Used Segments Sequence. |
| static readonly [UserContentLabel](../../aspose.medical.dicom.tags/tag/usercontentlabel) | (3010,0033) VR=SH VM=1 User Content Label. |
| static readonly [UserContentLongLabel](../../aspose.medical.dicom.tags/tag/usercontentlonglabel) | (3010,0034) VR=LO VM=1 User Content Long Label. |
| static readonly [UserSelectedGainYRETIRED](../../aspose.medical.dicom.tags/tag/userselectedgainyretired) | (0014,408B) VR=DS VM=1 User Selected Gain Y (RETIRED). |
| static readonly [UserSelectedOffsetXRETIRED](../../aspose.medical.dicom.tags/tag/userselectedoffsetxretired) | (0014,408D) VR=DS VM=1 User Selected Offset X (RETIRED). |
| static readonly [UserSelectedOffsetYRETIRED](../../aspose.medical.dicom.tags/tag/userselectedoffsetyretired) | (0014,408E) VR=DS VM=1 User Selected Offset Y (RETIRED). |
| static readonly [UserSelectedPhaseRETIRED](../../aspose.medical.dicom.tags/tag/userselectedphaseretired) | (0014,408C) VR=DS VM=1 User Selected Phase (RETIRED). |
| static readonly [USImageDescriptionSequence](../../aspose.medical.dicom.tags/tag/usimagedescriptionsequence) | (0018,9806) VR=SQ VM=1 US Image Description Sequence. |
| static readonly [UValueData](../../aspose.medical.dicom.tags/tag/uvaluedata) | (0080,0010) VR=OF VM=1 U Value Data. |
| static readonly [UVMappingSequence](../../aspose.medical.dicom.tags/tag/uvmappingsequence) | (0080,0008) VR=SQ VM=1 UV Mapping Sequence. |
| static readonly [ValueType](../../aspose.medical.dicom.tags/tag/valuetype) | (0040,A040) VR=CS VM=1 Value Type. |
| static readonly [VariableCoefficientsSDDNRETIRED](../../aspose.medical.dicom.tags/tag/variablecoefficientssddnretired) | (7Fxx,0040) VR=OW VM=1 Variable Coefficients SDDN (RETIRED). |
| static readonly [VariableCoefficientsSDHNRETIRED](../../aspose.medical.dicom.tags/tag/variablecoefficientssdhnretired) | (7Fxx,0030) VR=OW VM=1 Variable Coefficients SDHN (RETIRED). |
| static readonly [VariableCoefficientsSDVNRETIRED](../../aspose.medical.dicom.tags/tag/variablecoefficientssdvnretired) | (7Fxx,0020) VR=OW VM=1 Variable Coefficients SDVN (RETIRED). |
| static readonly [VariableFlipAngleFlag](../../aspose.medical.dicom.tags/tag/variableflipangleflag) | (0018,1315) VR=CS VM=1 Variable Flip Angle Flag. |
| static readonly [VariableModalityLUTSequence](../../aspose.medical.dicom.tags/tag/variablemodalitylutsequence) | (0028,3001) VR=SQ VM=1 Variable Modality LUT Sequence. |
| static readonly [VariableNextDataGroupRETIRED](../../aspose.medical.dicom.tags/tag/variablenextdatagroupretired) | (7Fxx,0011) VR=US VM=1 Variable Next Data Group (RETIRED). |
| static readonly [VariablePixelDataRETIRED](../../aspose.medical.dicom.tags/tag/variablepixeldataretired) | (7Fxx,0010) VR=OB or OW VM=1 Variable Pixel Data (RETIRED). |
| static readonly [VectorAccuracy](../../aspose.medical.dicom.tags/tag/vectoraccuracy) | (0066,0020) VR=FL VM=1-n Vector Accuracy. |
| static readonly [VectorCoordinateData](../../aspose.medical.dicom.tags/tag/vectorcoordinatedata) | (0066,0021) VR=OF VM=1 Vector Coordinate Data. |
| static readonly [VectorDimensionality](../../aspose.medical.dicom.tags/tag/vectordimensionality) | (0066,001F) VR=US VM=1 Vector Dimensionality. |
| static readonly [VectorGridData](../../aspose.medical.dicom.tags/tag/vectorgriddata) | (0064,0009) VR=OF VM=1 Vector Grid Data. |
| static readonly [VelocityEncodingAcquisitionSequence](../../aspose.medical.dicom.tags/tag/velocityencodingacquisitionsequence) | (0018,9092) VR=SQ VM=1 Velocity Encoding Acquisition Sequence. |
| static readonly [VelocityEncodingDirection](../../aspose.medical.dicom.tags/tag/velocityencodingdirection) | (0018,9090) VR=FD VM=3 Velocity Encoding Direction. |
| static readonly [VelocityEncodingMaximumValue](../../aspose.medical.dicom.tags/tag/velocityencodingmaximumvalue) | (0018,9217) VR=FD VM=1 Velocity Encoding Maximum Value. |
| static readonly [VelocityEncodingMinimumValue](../../aspose.medical.dicom.tags/tag/velocityencodingminimumvalue) | (0018,9091) VR=FD VM=1 Velocity Encoding Minimum Value. |
| static readonly [VelocityOfSoundRETIRED](../../aspose.medical.dicom.tags/tag/velocityofsoundretired) | (0014,4064) VR=DS VM=1 Velocity of Sound (RETIRED). |
| static readonly [VerbalSourceIdentifierCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/verbalsourceidentifiercodesequencetrialretired) | (0040,A358) VR=SQ VM=1 Verbal Source Identifier Code Sequence (Trial) (RETIRED). |
| static readonly [VerbalSourceTrialRETIRED](../../aspose.medical.dicom.tags/tag/verbalsourcetrialretired) | (0040,A352) VR=PN VM=1 Verbal Source (Trial) (RETIRED). |
| static readonly [VerificationDateTime](../../aspose.medical.dicom.tags/tag/verificationdatetime) | (0040,A030) VR=DT VM=1 Verification DateTime. |
| static readonly [VerificationFlag](../../aspose.medical.dicom.tags/tag/verificationflag) | (0040,A493) VR=CS VM=1 Verification Flag. |
| static readonly [VerificationImageTiming](../../aspose.medical.dicom.tags/tag/verificationimagetiming) | (0074,1032) VR=CS VM=1 Verification Image Timing. |
| static readonly [VerifyingObserverIdentificationCodeSequence](../../aspose.medical.dicom.tags/tag/verifyingobserveridentificationcodesequence) | (0040,A088) VR=SQ VM=1 Verifying Observer Identification Code Sequence. |
| static readonly [VerifyingObserverName](../../aspose.medical.dicom.tags/tag/verifyingobservername) | (0040,A075) VR=PN VM=1 Verifying Observer Name. |
| static readonly [VerifyingObserverSequence](../../aspose.medical.dicom.tags/tag/verifyingobserversequence) | (0040,A073) VR=SQ VM=1 Verifying Observer Sequence. |
| static readonly [VerifyingOrganization](../../aspose.medical.dicom.tags/tag/verifyingorganization) | (0040,A027) VR=LO VM=1 Verifying Organization. |
| static readonly [VertexDistance](../../aspose.medical.dicom.tags/tag/vertexdistance) | (0022,000F) VR=FD VM=1 Vertex Distance. |
| static readonly [VertexPointIndexListRETIRED](../../aspose.medical.dicom.tags/tag/vertexpointindexlistretired) | (0066,0025) VR=OW VM=1 Vertex Point Index List (RETIRED). |
| static readonly [VerticalAlignment](../../aspose.medical.dicom.tags/tag/verticalalignment) | (0070,0243) VR=CS VM=1 Vertical Alignment. |
| static readonly [VerticalLaserSpotDimensionRETIRED](../../aspose.medical.dicom.tags/tag/verticallaserspotdimensionretired) | (0014,6014) VR=DS VM=1 Vertical Laser Spot Dimension (RETIRED). |
| static readonly [VerticalMovingWindowSizeRETIRED](../../aspose.medical.dicom.tags/tag/verticalmovingwindowsizeretired) | (0014,6057) VR=DS VM=1 Vertical Moving Window Size (RETIRED). |
| static readonly [VerticalOffsetOfSensorRETIRED](../../aspose.medical.dicom.tags/tag/verticaloffsetofsensorretired) | (0014,3026) VR=DS VM=1 Vertical Offset of Sensor (RETIRED). |
| static readonly [VerticalPixelSizeRETIRED](../../aspose.medical.dicom.tags/tag/verticalpixelsizeretired) | (0014,6023) VR=DS VM=1 Vertical Pixel Size (RETIRED). |
| static readonly [VerticalPrismBase](../../aspose.medical.dicom.tags/tag/verticalprismbase) | (0046,0036) VR=CS VM=1 Vertical Prism Base. |
| static readonly [VerticalPrismPower](../../aspose.medical.dicom.tags/tag/verticalprismpower) | (0046,0034) VR=FD VM=1 Vertical Prism Power. |
| static readonly [VerticesOfTheOutlineOfPupil](../../aspose.medical.dicom.tags/tag/verticesoftheoutlineofpupil) | (0046,0208) VR=IS VM=2-2n Vertices of the Outline of Pupil. |
| static readonly [VerticesOfThePolygonalCollimator](../../aspose.medical.dicom.tags/tag/verticesofthepolygonalcollimator) | (0018,1720) VR=IS VM=2-2n Vertices of the Polygonal Collimator. |
| static readonly [VerticesOfThePolygonalExposureControlSensingRegion](../../aspose.medical.dicom.tags/tag/verticesofthepolygonalexposurecontrolsensingregion) | (0018,9442) VR=SS VM=2-n Vertices of the Polygonal Exposure Control Sensing Region. |
| static readonly [VerticesOfThePolygonalOutline](../../aspose.medical.dicom.tags/tag/verticesofthepolygonaloutline) | (0018,1638) VR=OF VM=1 Vertices of the Polygonal Outline. |
| static readonly [VerticesOfThePolygonalShutter](../../aspose.medical.dicom.tags/tag/verticesofthepolygonalshutter) | (0018,1620) VR=IS VM=2-2n Vertices of the Polygonal Shutter. |
| static readonly [VerticesOfTheRegion](../../aspose.medical.dicom.tags/tag/verticesoftheregion) | (0028,9503) VR=SS VM=2-2n Vertices of the Region. |
| static readonly [VibrationExcitationFrequencyRETIRED](../../aspose.medical.dicom.tags/tag/vibrationexcitationfrequencyretired) | (0014,6019) VR=DS VM=1 Vibration Excitation Frequency (RETIRED). |
| static readonly [VibrationExcitationVoltageRETIRED](../../aspose.medical.dicom.tags/tag/vibrationexcitationvoltageretired) | (0014,601A) VR=DS VM=1 Vibration Excitation Voltage (RETIRED). |
| static readonly [VibrationSonicHeatingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/vibrationsonicheatingsequenceretired) | (0014,603E) VR=SQ VM=1 Vibration/Sonic Heating Sequence (RETIRED). |
| static readonly [VibrationSourceSettingSequenceRETIRED](../../aspose.medical.dicom.tags/tag/vibrationsourcesettingsequenceretired) | (0014,6018) VR=SQ VM=1 Vibration Source Setting Sequence (RETIRED). |
| static readonly [VideoImageFormatAcquired](../../aspose.medical.dicom.tags/tag/videoimageformatacquired) | (0018,1022) VR=SH VM=1 Video Image Format Acquired. |
| static readonly [ViewCodeSequence](../../aspose.medical.dicom.tags/tag/viewcodesequence) | (0054,0220) VR=SQ VM=1 View Code Sequence. |
| static readonly [ViewingDistance](../../aspose.medical.dicom.tags/tag/viewingdistance) | (0046,0106) VR=FD VM=1 Viewing Distance. |
| static readonly [ViewingDistanceType](../../aspose.medical.dicom.tags/tag/viewingdistancetype) | (0046,0125) VR=CS VM=1 Viewing Distance Type. |
| static readonly [ViewModifierCodeSequence](../../aspose.medical.dicom.tags/tag/viewmodifiercodesequence) | (0054,0222) VR=SQ VM=1 View Modifier Code Sequence. |
| static readonly [ViewName](../../aspose.medical.dicom.tags/tag/viewname) | (0008,2127) VR=SH VM=1 View Name. |
| static readonly [ViewNumber](../../aspose.medical.dicom.tags/tag/viewnumber) | (0008,2128) VR=IS VM=1 View Number. |
| static readonly [ViewOrientationCodeSequence](../../aspose.medical.dicom.tags/tag/vieworientationcodesequence) | (0068,62E0) VR=SQ VM=1 View Orientation Code Sequence. |
| static readonly [ViewOrientationModifierCodeSequence](../../aspose.medical.dicom.tags/tag/vieworientationmodifiercodesequence) | (0068,62F0) VR=SQ VM=1 View Orientation Modifier Code Sequence. |
| static readonly [ViewpointLookAtPoint](../../aspose.medical.dicom.tags/tag/viewpointlookatpoint) | (0070,1604) VR=FD VM=3 Viewpoint LookAt Point. |
| static readonly [ViewpointPosition](../../aspose.medical.dicom.tags/tag/viewpointposition) | (0070,1603) VR=FD VM=3 Viewpoint Position. |
| static readonly [ViewpointUpDirection](../../aspose.medical.dicom.tags/tag/viewpointupdirection) | (0070,1605) VR=FD VM=3 Viewpoint Up Direction. |
| static readonly [ViewPosition](../../aspose.medical.dicom.tags/tag/viewposition) | (0018,5101) VR=CS VM=1 View Position. |
| static readonly [VirtualSourceAxisDistances](../../aspose.medical.dicom.tags/tag/virtualsourceaxisdistances) | (300A,030A) VR=FL VM=2 Virtual Source-Axis Distances. |
| static readonly [VisitComments](../../aspose.medical.dicom.tags/tag/visitcomments) | (0038,4000) VR=LT VM=1 Visit Comments. |
| static readonly [VisitStatusID](../../aspose.medical.dicom.tags/tag/visitstatusid) | (0038,0008) VR=CS VM=1 Visit Status ID. |
| static readonly [VisualAcuityBothEyesOpenSequence](../../aspose.medical.dicom.tags/tag/visualacuitybotheyesopensequence) | (0046,0124) VR=SQ VM=1 Visual Acuity Both Eyes Open Sequence. |
| static readonly [VisualAcuityLeftEyeSequence](../../aspose.medical.dicom.tags/tag/visualacuitylefteyesequence) | (0046,0123) VR=SQ VM=1 Visual Acuity Left Eye Sequence. |
| static readonly [VisualAcuityMeasurementSequence](../../aspose.medical.dicom.tags/tag/visualacuitymeasurementsequence) | (0024,0110) VR=SQ VM=1 Visual Acuity Measurement Sequence. |
| static readonly [VisualAcuityModifiers](../../aspose.medical.dicom.tags/tag/visualacuitymodifiers) | (0046,0135) VR=SS VM=2 Visual Acuity Modifiers. |
| static readonly [VisualAcuityRightEyeSequence](../../aspose.medical.dicom.tags/tag/visualacuityrighteyesequence) | (0046,0122) VR=SQ VM=1 Visual Acuity Right Eye Sequence. |
| static readonly [VisualAcuityTypeCodeSequence](../../aspose.medical.dicom.tags/tag/visualacuitytypecodesequence) | (0046,0121) VR=SQ VM=1 Visual Acuity Type Code Sequence. |
| static readonly [VisualEvaluationMethodCodeSequence](../../aspose.medical.dicom.tags/tag/visualevaluationmethodcodesequence) | (0028,702E) VR=SQ VM=1 Visual Evaluation Method Code Sequence. |
| static readonly [VisualEvaluationResultSequence](../../aspose.medical.dicom.tags/tag/visualevaluationresultsequence) | (0028,7015) VR=SQ VM=1 Visual Evaluation Result Sequence. |
| static readonly [VisualEvaluationTestSequence](../../aspose.medical.dicom.tags/tag/visualevaluationtestsequence) | (0028,7028) VR=SQ VM=1 Visual Evaluation Test Sequence. |
| static readonly [VisualFieldCatchTrialSequence](../../aspose.medical.dicom.tags/tag/visualfieldcatchtrialsequence) | (0024,0034) VR=SQ VM=1 Visual Field Catch Trial Sequence. |
| static readonly [VisualFieldGlobalResultsIndexSequence](../../aspose.medical.dicom.tags/tag/visualfieldglobalresultsindexsequence) | (0024,0320) VR=SQ VM=1 Visual Field Global Results Index Sequence. |
| static readonly [VisualFieldHorizontalExtent](../../aspose.medical.dicom.tags/tag/visualfieldhorizontalextent) | (0024,0010) VR=FL VM=1 Visual Field Horizontal Extent. |
| static readonly [VisualFieldMeanSensitivity](../../aspose.medical.dicom.tags/tag/visualfieldmeansensitivity) | (0024,0070) VR=FL VM=1 Visual Field Mean Sensitivity. |
| static readonly [VisualFieldShape](../../aspose.medical.dicom.tags/tag/visualfieldshape) | (0024,0012) VR=CS VM=1 Visual Field Shape. |
| static readonly [VisualFieldTestDuration](../../aspose.medical.dicom.tags/tag/visualfieldtestduration) | (0024,0088) VR=FL VM=1 Visual Field Test Duration. |
| static readonly [VisualFieldTestNormalsFlag](../../aspose.medical.dicom.tags/tag/visualfieldtestnormalsflag) | (0024,0063) VR=CS VM=1 Visual Field Test Normals Flag. |
| static readonly [VisualFieldTestPointNormalsSequence](../../aspose.medical.dicom.tags/tag/visualfieldtestpointnormalssequence) | (0024,0097) VR=SQ VM=1 Visual Field Test Point Normals Sequence. |
| static readonly [VisualFieldTestPointSequence](../../aspose.medical.dicom.tags/tag/visualfieldtestpointsequence) | (0024,0089) VR=SQ VM=1 Visual Field Test Point Sequence. |
| static readonly [VisualFieldTestPointXCoordinate](../../aspose.medical.dicom.tags/tag/visualfieldtestpointxcoordinate) | (0024,0090) VR=FL VM=1 Visual Field Test Point X-Coordinate. |
| static readonly [VisualFieldTestPointYCoordinate](../../aspose.medical.dicom.tags/tag/visualfieldtestpointycoordinate) | (0024,0091) VR=FL VM=1 Visual Field Test Point Y-Coordinate. |
| static readonly [VisualFieldTestReliabilityGlobalIndexSequence](../../aspose.medical.dicom.tags/tag/visualfieldtestreliabilityglobalindexsequence) | (0024,0317) VR=SQ VM=1 Visual Field Test Reliability Global Index Sequence. |
| static readonly [VisualFieldVerticalExtent](../../aspose.medical.dicom.tags/tag/visualfieldverticalextent) | (0024,0011) VR=FL VM=1 Visual Field Vertical Extent. |
| static readonly [VitalStainCodeSequenceTrialRETIRED](../../aspose.medical.dicom.tags/tag/vitalstaincodesequencetrialretired) | (0040,09F8) VR=SQ VM=1 Vital Stain Code Sequence (Trial) (RETIRED). |
| static readonly [VitreousStatusCodeSequence](../../aspose.medical.dicom.tags/tag/vitreousstatuscodesequence) | (0022,1025) VR=SQ VM=1 Vitreous Status Code Sequence. |
| static readonly [VitreousStatusDescription](../../aspose.medical.dicom.tags/tag/vitreousstatusdescription) | (0022,1066) VR=LO VM=1 Vitreous Status Description. |
| static readonly [VOILUTFunction](../../aspose.medical.dicom.tags/tag/voilutfunction) | (0028,1056) VR=CS VM=1 VOI LUT Function. |
| static readonly [VOILUTSequence](../../aspose.medical.dicom.tags/tag/voilutsequence) | (0028,3010) VR=SQ VM=1 VOI LUT Sequence. |
| static readonly [VOIType](../../aspose.medical.dicom.tags/tag/voitype) | (0072,0702) VR=CS VM=1 VOI Type. |
| static readonly [VolumeBasedCalculationTechnique](../../aspose.medical.dicom.tags/tag/volumebasedcalculationtechnique) | (0008,9207) VR=CS VM=1 Volume Based Calculation Technique. |
| static readonly [VolumeCroppingMethod](../../aspose.medical.dicom.tags/tag/volumecroppingmethod) | (0070,1302) VR=CS VM=1 Volume Cropping Method. |
| static readonly [VolumeCroppingSequence](../../aspose.medical.dicom.tags/tag/volumecroppingsequence) | (0070,1301) VR=SQ VM=1 Volume Cropping Sequence. |
| static readonly [VolumeFrameOfReferenceUID](../../aspose.medical.dicom.tags/tag/volumeframeofreferenceuid) | (0020,9312) VR=UI VM=1 Volume Frame of Reference UID. |
| static readonly [VolumeLocalizationSequence](../../aspose.medical.dicom.tags/tag/volumelocalizationsequence) | (0018,9126) VR=SQ VM=1 Volume Localization Sequence. |
| static readonly [VolumeLocalizationTechnique](../../aspose.medical.dicom.tags/tag/volumelocalizationtechnique) | (0018,9054) VR=CS VM=1 Volume Localization Technique. |
| static readonly [VolumeOfPTORETIRED](../../aspose.medical.dicom.tags/tag/volumeofptoretired) | (4010,1023) VR=FL VM=1 Volume of PTO (RETIRED). |
| static readonly [VolumeStreamSequence](../../aspose.medical.dicom.tags/tag/volumestreamsequence) | (0070,1A08) VR=SQ VM=1 Volume Stream Sequence. |
| static readonly [VolumeToTableMappingMatrix](../../aspose.medical.dicom.tags/tag/volumetotablemappingmatrix) | (0020,930A) VR=FD VM=16 Volume to Table Mapping Matrix. |
| static readonly [VolumeToTransducerMappingMatrix](../../aspose.medical.dicom.tags/tag/volumetotransducermappingmatrix) | (0020,9309) VR=FD VM=16 Volume to Transducer Mapping Matrix. |
| static readonly [VolumeToTransducerRelationship](../../aspose.medical.dicom.tags/tag/volumetotransducerrelationship) | (0020,930B) VR=CS VM=1 Volume to Transducer Relationship. |
| static readonly [VolumetricAnnotationSequence](../../aspose.medical.dicom.tags/tag/volumetricannotationsequence) | (0070,1901) VR=SQ VM=1 Volumetric Annotation Sequence. |
| static readonly [VolumetricCurvePoints](../../aspose.medical.dicom.tags/tag/volumetriccurvepoints) | (0070,150D) VR=OD VM=1 Volumetric Curve Points. |
| static readonly [VolumetricCurveUpDirections](../../aspose.medical.dicom.tags/tag/volumetriccurveupdirections) | (0070,1A07) VR=OD VM=1 Volumetric Curve Up Directions. |
| static readonly [VolumetricPresentationInputAnnotationSequence](../../aspose.medical.dicom.tags/tag/volumetricpresentationinputannotationsequence) | (0070,1905) VR=SQ VM=1 Volumetric Presentation Input Annotation Sequence. |
| static readonly [VolumetricPresentationInputIndex](../../aspose.medical.dicom.tags/tag/volumetricpresentationinputindex) | (0070,1804) VR=US VM=1 Volumetric Presentation Input Index. |
| static readonly [VolumetricPresentationInputNumber](../../aspose.medical.dicom.tags/tag/volumetricpresentationinputnumber) | (0070,1207) VR=US VM=1 Volumetric Presentation Input Number. |
| static readonly [VolumetricPresentationInputSetSequence](../../aspose.medical.dicom.tags/tag/volumetricpresentationinputsetsequence) | (0070,120A) VR=SQ VM=1 Volumetric Presentation Input Set Sequence. |
| static readonly [VolumetricPresentationInputSetUID](../../aspose.medical.dicom.tags/tag/volumetricpresentationinputsetuid) | (0070,1209) VR=UI VM=1 Volumetric Presentation Input Set UID. |
| static readonly [VolumetricPresentationStateInputSequence](../../aspose.medical.dicom.tags/tag/volumetricpresentationstateinputsequence) | (0070,1201) VR=SQ VM=1 Volumetric Presentation State Input Sequence. |
| static readonly [VolumetricProperties](../../aspose.medical.dicom.tags/tag/volumetricproperties) | (0008,9206) VR=CS VM=1 Volumetric Properties. |
| static readonly [VValueData](../../aspose.medical.dicom.tags/tag/vvaluedata) | (0080,0011) VR=OF VM=1 V Value Data. |
| static readonly [WADORetrievalSequence](../../aspose.medical.dicom.tags/tag/wadoretrievalsequence) | (0040,E023) VR=SQ VM=1 WADO Retrieval Sequence. |
| static readonly [WADORSRetrievalSequence](../../aspose.medical.dicom.tags/tag/wadorsretrievalsequence) | (0040,E025) VR=SQ VM=1 WADO-RS Retrieval Sequence. |
| static readonly [WarningReason](../../aspose.medical.dicom.tags/tag/warningreason) | (0008,1196) VR=US VM=1 Warning Reason. |
| static readonly [WaterDepth](../../aspose.medical.dicom.tags/tag/waterdepth) | (0016,0033) VR=DS VM=1 Water Depth. |
| static readonly [WaterEquivalentDiameter](../../aspose.medical.dicom.tags/tag/waterequivalentdiameter) | (0018,1271) VR=FD VM=1 Water Equivalent Diameter. |
| static readonly [WaterEquivalentDiameterCalculationMethodCodeSequence](../../aspose.medical.dicom.tags/tag/waterequivalentdiametercalculationmethodcodesequence) | (0018,1272) VR=SQ VM=1 Water Equivalent Diameter Calculation Method Code Sequence. |
| static readonly [WaterReferenceAcquisition](../../aspose.medical.dicom.tags/tag/waterreferenceacquisition) | (0018,9297) VR=CS VM=1 Water Reference Acquisition. |
| static readonly [WaterReferencedPhaseCorrection](../../aspose.medical.dicom.tags/tag/waterreferencedphasecorrection) | (0018,9199) VR=CS VM=1 Water Referenced Phase Correction. |
| static readonly [WaveformAmplifierType](../../aspose.medical.dicom.tags/tag/waveformamplifiertype) | (003A,0317) VR=CS VM=1 Waveform Amplifier Type. |
| static readonly [WaveformAnnotationDisplaySelectionSequence](../../aspose.medical.dicom.tags/tag/waveformannotationdisplayselectionsequence) | (0040,B031) VR=SQ VM=1 Waveform Annotation Display Selection Sequence. |
| static readonly [WaveformAnnotationSequence](../../aspose.medical.dicom.tags/tag/waveformannotationsequence) | (0040,B020) VR=SQ VM=1 Waveform Annotation Sequence. |
| static readonly [WaveformBitsAllocated](../../aspose.medical.dicom.tags/tag/waveformbitsallocated) | (5400,1004) VR=US VM=1 Waveform Bits Allocated. |
| static readonly [WaveformBitsStored](../../aspose.medical.dicom.tags/tag/waveformbitsstored) | (003A,021A) VR=US VM=1 Waveform Bits Stored. |
| static readonly [WaveformChannelNumber](../../aspose.medical.dicom.tags/tag/waveformchannelnumber) | (003A,0202) VR=IS VM=1 Waveform Channel Number. |
| static readonly [WaveformData](../../aspose.medical.dicom.tags/tag/waveformdata) | (5400,1010) VR=OB or OW VM=1 Waveform Data. |
| static readonly [WaveformDataDisplayScale](../../aspose.medical.dicom.tags/tag/waveformdatadisplayscale) | (003A,0230) VR=FL VM=1 Waveform Data Display Scale. |
| static readonly [WaveformDisplayBackgroundCIELabValue](../../aspose.medical.dicom.tags/tag/waveformdisplaybackgroundcielabvalue) | (003A,0231) VR=US VM=3 Waveform Display Background CIELab Value. |
| static readonly [WaveformFilterDescription](../../aspose.medical.dicom.tags/tag/waveformfilterdescription) | (003A,0329) VR=ST VM=1 Waveform Filter Description. |
| static readonly [WaveformFilterType](../../aspose.medical.dicom.tags/tag/waveformfiltertype) | (003A,0322) VR=CS VM=1 Waveform Filter Type. |
| static readonly [WaveformMontageSequence](../../aspose.medical.dicom.tags/tag/waveformmontagesequence) | (0040,B039) VR=SQ VM=1 Waveform Montage Sequence. |
| static readonly [WaveformOriginality](../../aspose.medical.dicom.tags/tag/waveformoriginality) | (003A,0004) VR=CS VM=1 Waveform Originality. |
| static readonly [WaveformPaddingValue](../../aspose.medical.dicom.tags/tag/waveformpaddingvalue) | (5400,100A) VR=OB or OW VM=1 Waveform Padding Value. |
| static readonly [WaveformPresentationGroupSequence](../../aspose.medical.dicom.tags/tag/waveformpresentationgroupsequence) | (003A,0240) VR=SQ VM=1 Waveform Presentation Group Sequence. |
| static readonly [WaveformSampleInterpretation](../../aspose.medical.dicom.tags/tag/waveformsampleinterpretation) | (5400,1006) VR=CS VM=1 Waveform Sample Interpretation. |
| static readonly [WaveformSequence](../../aspose.medical.dicom.tags/tag/waveformsequence) | (5400,0100) VR=SQ VM=1 Waveform Sequence. |
| static readonly [WaveformTextualAnnotationSequence](../../aspose.medical.dicom.tags/tag/waveformtextualannotationsequence) | (0040,B033) VR=SQ VM=1 Waveform Textual Annotation Sequence. |
| static readonly [WedgeAngle](../../aspose.medical.dicom.tags/tag/wedgeangle) | (300A,00D5) VR=IS VM=1 Wedge Angle. |
| static readonly [WedgeAngleFloatRETIRED](../../aspose.medical.dicom.tags/tag/wedgeanglefloatretired) | (0014,5107) VR=DS VM=1 Wedge Angle Float (RETIRED). |
| static readonly [WedgeChamferHeightRETIRED](../../aspose.medical.dicom.tags/tag/wedgechamferheightretired) | (0014,511D) VR=DS VM=1 Wedge Chamfer Height (RETIRED). |
| static readonly [WedgeCurveRETIRED](../../aspose.medical.dicom.tags/tag/wedgecurveretired) | (0014,511E) VR=CS VM=1 Wedge Curve (RETIRED). |
| static readonly [WedgeDefinitionSequence](../../aspose.medical.dicom.tags/tag/wedgedefinitionsequence) | (300A,0651) VR=SQ VM=1 Wedge Definition Sequence. |
| static readonly [WedgeDescriptionRETIRED](../../aspose.medical.dicom.tags/tag/wedgedescriptionretired) | (0014,5111) VR=LO VM=1 Wedge Description (RETIRED). |
| static readonly [WedgeElement1PositionRETIRED](../../aspose.medical.dicom.tags/tag/wedgeelement1positionretired) | (0014,5109) VR=CS VM=1 Wedge Element 1 Position (RETIRED). |
| static readonly [WedgeFactor](../../aspose.medical.dicom.tags/tag/wedgefactor) | (300A,00D6) VR=DS VM=1 Wedge Factor. |
| static readonly [WedgeFrontGapRETIRED](../../aspose.medical.dicom.tags/tag/wedgefrontgapretired) | (0014,5117) VR=DS VM=1 Wedge Front Gap (RETIRED). |
| static readonly [WedgeFrontHeightRETIRED](../../aspose.medical.dicom.tags/tag/wedgefrontheightretired) | (0014,5119) VR=DS VM=1 Wedge Front Height (RETIRED). |
| static readonly [WedgeID](../../aspose.medical.dicom.tags/tag/wedgeid) | (300A,00D4) VR=SH VM=1 Wedge ID. |
| static readonly [WedgeInContactLengthRETIRED](../../aspose.medical.dicom.tags/tag/wedgeincontactlengthretired) | (0014,5116) VR=DS VM=1 Wedge In Contact Length (RETIRED). |
| static readonly [WedgeInContactWidthRETIRED](../../aspose.medical.dicom.tags/tag/wedgeincontactwidthretired) | (0014,511C) VR=DS VM=1 Wedge In Contact Width (RETIRED). |
| static readonly [WedgeManufacturerNameRETIRED](../../aspose.medical.dicom.tags/tag/wedgemanufacturernameretired) | (0014,5110) VR=SH VM=1 Wedge Manufacturer Name (RETIRED). |
| static readonly [WedgeMaterialRETIRED](../../aspose.medical.dicom.tags/tag/wedgematerialretired) | (0014,510B) VR=SH VM=1 Wedge Material (RETIRED). |
| static readonly [WedgeMaterialVelocityRETIRED](../../aspose.medical.dicom.tags/tag/wedgematerialvelocityretired) | (0014,510A) VR=DS VM=1 Wedge Material Velocity (RETIRED). |
| static readonly [WedgeModelNumberRETIRED](../../aspose.medical.dicom.tags/tag/wedgemodelnumberretired) | (0014,5106) VR=SH VM=1 Wedge Model Number (RETIRED). |
| static readonly [WedgeNameRETIRED](../../aspose.medical.dicom.tags/tag/wedgenameretired) | (0014,510F) VR=SH VM=1 Wedge Name (RETIRED). |
| static readonly [WedgeNumber](../../aspose.medical.dicom.tags/tag/wedgenumber) | (300A,00D2) VR=IS VM=1 Wedge Number. |
| static readonly [WedgeOffsetXRETIRED](../../aspose.medical.dicom.tags/tag/wedgeoffsetxretired) | (0014,5113) VR=DS VM=1 Wedge Offset X (RETIRED). |
| static readonly [WedgeOffsetYRETIRED](../../aspose.medical.dicom.tags/tag/wedgeoffsetyretired) | (0014,5114) VR=DS VM=1 Wedge Offset Y (RETIRED). |
| static readonly [WedgeOffsetZRETIRED](../../aspose.medical.dicom.tags/tag/wedgeoffsetzretired) | (0014,510C) VR=DS VM=1 Wedge Offset Z (RETIRED). |
| static readonly [WedgeOrientation](../../aspose.medical.dicom.tags/tag/wedgeorientation) | (300A,00D8) VR=DS VM=1 Wedge Orientation. |
| static readonly [WedgeOriginOffsetXRETIRED](../../aspose.medical.dicom.tags/tag/wedgeoriginoffsetxretired) | (0014,510D) VR=DS VM=1 Wedge Origin Offset X (RETIRED). |
| static readonly [WedgePosition](../../aspose.medical.dicom.tags/tag/wedgeposition) | (300A,0118) VR=CS VM=1 Wedge Position. |
| static readonly [WedgePositionSequence](../../aspose.medical.dicom.tags/tag/wedgepositionsequence) | (300A,0116) VR=SQ VM=1 Wedge Position Sequence. |
| static readonly [WedgeRearHeightRETIRED](../../aspose.medical.dicom.tags/tag/wedgerearheightretired) | (0014,511A) VR=DS VM=1 Wedge Rear Height (RETIRED). |
| static readonly [WedgeRoofAngleRETIRED](../../aspose.medical.dicom.tags/tag/wedgeroofangleretired) | (0014,5108) VR=DS VM=1 Wedge Roof Angle (RETIRED). |
| static readonly [WedgeSequence](../../aspose.medical.dicom.tags/tag/wedgesequence) | (300A,00D1) VR=SQ VM=1 Wedge Sequence. |
| static readonly [WedgeThinEdgePosition](../../aspose.medical.dicom.tags/tag/wedgethinedgeposition) | (300A,00DB) VR=FL VM=1 Wedge Thin Edge Position. |
| static readonly [WedgeTimeDelayRETIRED](../../aspose.medical.dicom.tags/tag/wedgetimedelayretired) | (0014,510E) VR=DS VM=1 Wedge Time Delay (RETIRED). |
| static readonly [WedgeTotalHeightRETIRED](../../aspose.medical.dicom.tags/tag/wedgetotalheightretired) | (0014,5118) VR=DS VM=1 Wedge Total Height (RETIRED). |
| static readonly [WedgeTotalLengthRETIRED](../../aspose.medical.dicom.tags/tag/wedgetotallengthretired) | (0014,5115) VR=DS VM=1 Wedge Total Length (RETIRED). |
| static readonly [WedgeTotalWidthRETIRED](../../aspose.medical.dicom.tags/tag/wedgetotalwidthretired) | (0014,511B) VR=DS VM=1 Wedge Total Width (RETIRED). |
| static readonly [WedgeType](../../aspose.medical.dicom.tags/tag/wedgetype) | (300A,00D3) VR=CS VM=1 Wedge Type. |
| static readonly [WeekdayFractionPatternSequence](../../aspose.medical.dicom.tags/tag/weekdayfractionpatternsequence) | (3010,0087) VR=SQ VM=1 Weekday Fraction Pattern Sequence. |
| static readonly [WeightingLookupTableDataRETIRED](../../aspose.medical.dicom.tags/tag/weightinglookuptabledataretired) | (0070,1808) VR=OB VM=1 Weighting Lookup Table Data (RETIRED). |
| static readonly [WeightingLookupTableDescriptorRETIRED](../../aspose.medical.dicom.tags/tag/weightinglookuptabledescriptorretired) | (0070,1807) VR=US VM=3 Weighting Lookup Table Descriptor (RETIRED). |
| static readonly [WeightingTransferFunctionSequence](../../aspose.medical.dicom.tags/tag/weightingtransferfunctionsequence) | (0070,1806) VR=SQ VM=1 Weighting Transfer Function Sequence. |
| static readonly [WhiteBalance](../../aspose.medical.dicom.tags/tag/whitebalance) | (0016,0043) VR=US VM=1 White Balance. |
| static readonly [WhitePoint](../../aspose.medical.dicom.tags/tag/whitepoint) | (0016,0001) VR=DS VM=1 White Point. |
| static readonly [WhitePointFlag](../../aspose.medical.dicom.tags/tag/whitepointflag) | (0028,7021) VR=CS VM=1 White Point Flag. |
| static readonly [WholeBodyTechnique](../../aspose.medical.dicom.tags/tag/wholebodytechnique) | (0018,1301) VR=CS VM=1-n Whole Body Technique. |
| static readonly [WholeSlideMicroscopyImageFrameTypeSequence](../../aspose.medical.dicom.tags/tag/wholeslidemicroscopyimageframetypesequence) | (0040,0710) VR=SQ VM=1 Whole Slide Microscopy Image Frame Type Sequence. |
| static readonly [WideFieldOphthalmicPhotographyQualityRatingSequence](../../aspose.medical.dicom.tags/tag/widefieldophthalmicphotographyqualityratingsequence) | (0022,1525) VR=SQ VM=1 Wide Field Ophthalmic Photography Quality Rating Sequence. |
| static readonly [WideFieldOphthalmicPhotographyQualityThresholdSequence](../../aspose.medical.dicom.tags/tag/widefieldophthalmicphotographyqualitythresholdsequence) | (0022,1526) VR=SQ VM=1 Wide Field Ophthalmic Photography Quality Threshold Sequence. |
| static readonly [WideFieldOphthalmicPhotographyThresholdQualityRating](../../aspose.medical.dicom.tags/tag/widefieldophthalmicphotographythresholdqualityrating) | (0022,1527) VR=FL VM=1 Wide Field Ophthalmic Photography Threshold Quality Rating. |
| static readonly [WindowCenter](../../aspose.medical.dicom.tags/tag/windowcenter) | (0028,1050) VR=DS VM=1-n Window Center. |
| static readonly [WindowCenterWidthExplanation](../../aspose.medical.dicom.tags/tag/windowcenterwidthexplanation) | (0028,1055) VR=LO VM=1-n Window Center &amp; Width Explanation. |
| static readonly [WindowWidth](../../aspose.medical.dicom.tags/tag/windowwidth) | (0028,1051) VR=DS VM=1-n Window Width. |
| static readonly [WorklistLabel](../../aspose.medical.dicom.tags/tag/worklistlabel) | (0074,1202) VR=LO VM=1 Worklist Label. |
| static readonly [XAAcquisitionDuration](../../aspose.medical.dicom.tags/tag/xaacquisitionduration) | (0018,11BD) VR=FD VM=1 XA Acquisition Duration. |
| static readonly [XAAcquisitionFrameRate](../../aspose.medical.dicom.tags/tag/xaacquisitionframerate) | (0018,11B9) VR=FD VM=1 XA Acquisition Frame Rate. |
| static readonly [XAAcquisitionPhaseDetailsSequence](../../aspose.medical.dicom.tags/tag/xaacquisitionphasedetailssequence) | (0018,11B8) VR=SQ VM=1 XA Acquisition Phase Details Sequence. |
| static readonly [XAPlaneDetailsSequence](../../aspose.medical.dicom.tags/tag/xaplanedetailssequence) | (0018,11BA) VR=SQ VM=1 XA Plane Details Sequence. |
| static readonly [XAXRFFrameCharacteristicsSequence](../../aspose.medical.dicom.tags/tag/xaxrfframecharacteristicssequence) | (0018,9412) VR=SQ VM=1 XA/XRF Frame Characteristics Sequence. |
| static readonly [XCoordinatesCenterPixelViewAngle](../../aspose.medical.dicom.tags/tag/xcoordinatescenterpixelviewangle) | (0022,1528) VR=FL VM=1 X Coordinates Center Pixel View Angle. |
| static readonly [XDSRetrievalSequence](../../aspose.medical.dicom.tags/tag/xdsretrievalsequence) | (0040,E024) VR=SQ VM=1 XDS Retrieval Sequence. |
| static readonly [XDSStorageSequence](../../aspose.medical.dicom.tags/tag/xdsstoragesequence) | (0040,4074) VR=SQ VM=1 XDS Storage Sequence. |
| static readonly [XFocusCenter](../../aspose.medical.dicom.tags/tag/xfocuscenter) | (0018,1183) VR=DS VM=1-2 X Focus Center. |
| static readonly [XOffsetInSlideCoordinateSystem](../../aspose.medical.dicom.tags/tag/xoffsetinslidecoordinatesystem) | (0040,072A) VR=DS VM=1 X Offset in Slide Coordinate System. |
| static readonly [XRay3DAcquisitionSequence](../../aspose.medical.dicom.tags/tag/xray3dacquisitionsequence) | (0018,9507) VR=SQ VM=1 X-Ray 3D Acquisition Sequence. |
| static readonly [XRay3DFrameTypeSequence](../../aspose.medical.dicom.tags/tag/xray3dframetypesequence) | (0018,9504) VR=SQ VM=1 X-Ray 3D Frame Type Sequence. |
| static readonly [XRay3DReconstructionSequence](../../aspose.medical.dicom.tags/tag/xray3dreconstructionsequence) | (0018,9530) VR=SQ VM=1 X-Ray 3D Reconstruction Sequence. |
| static readonly [XRayAcquisitionDoseSequence](../../aspose.medical.dicom.tags/tag/xrayacquisitiondosesequence) | (0018,9542) VR=SQ VM=1 X-Ray Acquisition Dose Sequence. |
| static readonly [XRayDetectorID](../../aspose.medical.dicom.tags/tag/xraydetectorid) | (0018,9371) VR=UC VM=1 X-Ray Detector ID. |
| static readonly [XRayDetectorIndex](../../aspose.medical.dicom.tags/tag/xraydetectorindex) | (0018,9370) VR=US VM=1 X-Ray Detector Index. |
| static readonly [XRayDetectorLabel](../../aspose.medical.dicom.tags/tag/xraydetectorlabel) | (0018,9373) VR=ST VM=1 X-Ray Detector Label. |
| static readonly [XRayFilterDetailsSequence](../../aspose.medical.dicom.tags/tag/xrayfilterdetailssequence) | (0018,11BC) VR=SQ VM=1 X-Ray Filter Details Sequence. |
| static readonly [XRayFilterSequence](../../aspose.medical.dicom.tags/tag/xrayfiltersequence) | (0018,9556) VR=SQ VM=1 X-Ray Filter Sequence. |
| static readonly [XRayGeometrySequence](../../aspose.medical.dicom.tags/tag/xraygeometrysequence) | (0018,9476) VR=SQ VM=1 X-Ray Geometry Sequence. |
| static readonly [XRayGridSequence](../../aspose.medical.dicom.tags/tag/xraygridsequence) | (0018,9555) VR=SQ VM=1 X-Ray Grid Sequence. |
| static readonly [XRayImageReceptorAngle](../../aspose.medical.dicom.tags/tag/xrayimagereceptorangle) | (3002,000E) VR=DS VM=1 X-Ray Image Receptor Angle. |
| static readonly [XRayImageReceptorTranslation](../../aspose.medical.dicom.tags/tag/xrayimagereceptortranslation) | (3002,000D) VR=DS VM=3 X-Ray Image Receptor Translation. |
| static readonly [XRayMassAttenuationCoefficient](../../aspose.medical.dicom.tags/tag/xraymassattenuationcoefficient) | (0018,9384) VR=DS VM=1 X-Ray Mass Attenuation Coefficient. |
| static readonly [XRayOutput](../../aspose.medical.dicom.tags/tag/xrayoutput) | (0040,0312) VR=DS VM=1 X-Ray Output. |
| static readonly [XRayReceptorType](../../aspose.medical.dicom.tags/tag/xrayreceptortype) | (0018,9420) VR=CS VM=1 X-Ray Receptor Type. |
| static readonly [XRaySourceID](../../aspose.medical.dicom.tags/tag/xraysourceid) | (0018,9367) VR=UC VM=1 X-Ray Source ID. |
| static readonly [XRaySourceIndex](../../aspose.medical.dicom.tags/tag/xraysourceindex) | (0018,9366) VR=US VM=1 X-Ray Source Index. |
| static readonly [XRaySourceIsocenterPrimaryAngle](../../aspose.medical.dicom.tags/tag/xraysourceisocenterprimaryangle) | (0018,9543) VR=FD VM=1 X-Ray Source Isocenter Primary Angle. |
| static readonly [XRaySourceIsocenterSecondaryAngle](../../aspose.medical.dicom.tags/tag/xraysourceisocentersecondaryangle) | (0018,9544) VR=FD VM=1 X-Ray Source Isocenter Secondary Angle. |
| static readonly [XRayTubeCurrent](../../aspose.medical.dicom.tags/tag/xraytubecurrent) | (0018,1151) VR=IS VM=1 X-Ray Tube Current. |
| static readonly [XRayTubeCurrentInmA](../../aspose.medical.dicom.tags/tag/xraytubecurrentinma) | (0018,9330) VR=FD VM=1 X-Ray Tube Current in mA. |
| static readonly [XRayTubeCurrentInuA](../../aspose.medical.dicom.tags/tag/xraytubecurrentinua) | (0018,8151) VR=DS VM=1 X-Ray Tube Current in ÂµA. |
| static readonly [YCoordinatesCenterPixelViewAngle](../../aspose.medical.dicom.tags/tag/ycoordinatescenterpixelviewangle) | (0022,1529) VR=FL VM=1 Y Coordinates Center Pixel View Angle. |
| static readonly [YFocusCenter](../../aspose.medical.dicom.tags/tag/yfocuscenter) | (0018,1184) VR=DS VM=1-2 Y Focus Center. |
| static readonly [YOffsetInSlideCoordinateSystem](../../aspose.medical.dicom.tags/tag/yoffsetinslidecoordinatesystem) | (0040,073A) VR=DS VM=1 Y Offset in Slide Coordinate System. |
| static readonly [ZEffectiveRETIRED](../../aspose.medical.dicom.tags/tag/zeffectiveretired) | (4010,1019) VR=FL VM=1 Z Effective (RETIRED). |
| static readonly [ZeroVelocityPixelValue](../../aspose.medical.dicom.tags/tag/zerovelocitypixelvalue) | (0018,9810) VR=US or SS VM=1 Zero Velocity Pixel Value. |
| static readonly [ZOffsetInSlideCoordinateSystem](../../aspose.medical.dicom.tags/tag/zoffsetinslidecoordinatesystem) | (0040,074A) VR=DS VM=1 Z Offset in Slide Coordinate System. |
| static readonly [ZonalMapFormatRETIRED](../../aspose.medical.dicom.tags/tag/zonalmapformatretired) | (0028,0722) VR=US VM=1 Zonal Map Format (RETIRED). |
| static readonly [ZonalMapLocationRETIRED](../../aspose.medical.dicom.tags/tag/zonalmaplocationretired) | (0028,0721) VR=AT VM=1-n Zonal Map Location (RETIRED). |
| static readonly [ZonalMapNumberFormatRETIRED](../../aspose.medical.dicom.tags/tag/zonalmapnumberformatretired) | (0028,0720) VR=US VM=1 Zonal Map Number Format (RETIRED). |
| static readonly [ZonalMapRETIRED](../../aspose.medical.dicom.tags/tag/zonalmapretired) | (1010,xxxx) VR=US VM=1-n Zonal Map (RETIRED). |
| static readonly [ZoomCenter](../../aspose.medical.dicom.tags/tag/zoomcenter) | (0028,0032) VR=DS VM=2 Zoom Center. |
| static readonly [ZoomFactor](../../aspose.medical.dicom.tags/tag/zoomfactor) | (0028,0031) VR=DS VM=2 Zoom Factor. |

### See Also

* namespace [Aspose.Medical.Dicom.Tags](../../aspose.medical.dicom.tags)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
