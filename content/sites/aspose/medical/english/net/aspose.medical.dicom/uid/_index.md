---
title: Uid
second_title: Aspose.Medical for .NET API Reference
description: Encapsulates DICOM UID. https//dicom.nema.org/dicom/2013/output/chtml/part06/chapter_A.htmlhttps//dicom.nema.org/dicom/2013/output/chtml/part06/chapter_A.html.
type: docs
weight: 1180
url: /net/aspose.medical.dicom/uid/
---

## Uid class

Encapsulates DICOM UID. [https://dicom.nema.org/dicom/2013/output/chtml/part06/chapter_A.html](https://dicom.nema.org/dicom/2013/output/chtml/part06/chapter_A.html).

```csharp
public sealed class Uid : IEquatable<Uid>, ISpanParsable<Uid>
```

## Properties

| Name | Description |
| --- | --- |
| static [Unknown](../../aspose.medical.dicom/uid/unknown) { get; } | Invalid/Unknown [`Uid`](../uid). Read-only [`Uid`](../uid). |
| [Code](../../aspose.medical.dicom/uid/code) { get; set; } | UID string code. Read-only String. |
| [IsRetired](../../aspose.medical.dicom/uid/isretired) { get; set; } | Indicates whether this UID is retired or not. Read-only Boolean. |
| [Name](../../aspose.medical.dicom/uid/name) { get; set; } | UID descriptive name. Read-only String. |
| [Type](../../aspose.medical.dicom/uid/type) { get; set; } | UID type. Read-only [`UidType`](../uidtype). |

## Methods

| Name | Description |
| --- | --- |
| static [CreateDerivedFromUuid](../../aspose.medical.dicom/uid/createderivedfromuuid)(string?) | Generates a UUID-derived [`UID`](../uid), according to http://medical.nema.org/medical/dicom/current/output/html/part05.html#sect_B.2 |
| static [Parse](../../aspose.medical.dicom/uid/parse#parse_1)(string) | Converts the string representation of an UID to its typed equivalent. |
| static [Parse](../../aspose.medical.dicom/uid/parse#parse)(ReadOnlySpan&lt;char&gt;, IFormatProvider?) |  |
| static [Parse](../../aspose.medical.dicom/uid/parse#parse_2)(string, IFormatProvider?) |  |
| override [Equals](../../aspose.medical.dicom/uid/equals#equals_1)(object) |  |
| [Equals](../../aspose.medical.dicom/uid/equals#equals)(Uid) |  |
| override [GetHashCode](../../aspose.medical.dicom/uid/gethashcode)() |  |
| override [ToString](../../aspose.medical.dicom/uid/tostring)() |  |
| static [TryParse](../../aspose.medical.dicom/uid/tryparse#tryparse)(ReadOnlySpan&lt;char&gt;, IFormatProvider, out Uid) |  |
| static [TryParse](../../aspose.medical.dicom/uid/tryparse#tryparse_1)(string, IFormatProvider, out Uid) |  |
| [operator ==](../../aspose.medical.dicom/uid/op_equality) | Determines whether two specified objects have the same value. |
| [operator !=](../../aspose.medical.dicom/uid/op_inequality) | Determines whether two specified objects have different values. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [AbstractMultiDimensionalImageModel](../../aspose.medical.dicom/uid/abstractmultidimensionalimagemodel) | Application Hosting Model: Abstract Multi-Dimensional Image Model. |
| static readonly [AcquisitionContextSRStorage](../../aspose.medical.dicom/uid/acquisitioncontextsrstorage) | SOP Class: Acquisition Context SR Storage. |
| static readonly [AdultMouseAnatomyOntology](../../aspose.medical.dicom/uid/adultmouseanatomyontology) | Coding Scheme: Adult Mouse Anatomy Ontology. |
| static readonly [AdvancedBlendingPresentationStateStorage](../../aspose.medical.dicom/uid/advancedblendingpresentationstatestorage) | SOP Class: Advanced Blending Presentation State Storage. |
| static readonly [AmbulatoryECGWaveformStorage](../../aspose.medical.dicom/uid/ambulatoryecgwaveformstorage) | SOP Class: Ambulatory ECG Waveform Storage. |
| static readonly [ArterialPulseWaveformStorage](../../aspose.medical.dicom/uid/arterialpulsewaveformstorage) | SOP Class: Arterial Pulse Waveform Storage. |
| static readonly [AudioSRStorageTrialRetired](../../aspose.medical.dicom/uid/audiosrstoragetrialretired) | SOP Class: Audio SR Storage - Trial (Retired). |
| static readonly [AudioWaveformRealTimeCommunication](../../aspose.medical.dicom/uid/audiowaveformrealtimecommunication) | SOP Class: Audio Waveform Real-Time Communication. |
| static readonly [AutorefractionMeasurementsStorage](../../aspose.medical.dicom/uid/autorefractionmeasurementsstorage) | SOP Class: Autorefraction Measurements Storage. |
| static readonly [BasicAnnotationBoxSOPClass](../../aspose.medical.dicom/uid/basicannotationboxsopclass) | SOP Class: Basic Annotation Box SOP Class. |
| static readonly [BasicColorImageBoxSOPClass](../../aspose.medical.dicom/uid/basiccolorimageboxsopclass) | SOP Class: Basic Color Image Box SOP Class. |
| static readonly [BasicColorPrintManagementMetaSOPClass](../../aspose.medical.dicom/uid/basiccolorprintmanagementmetasopclass) | Meta SOP Class: Basic Color Print Management Meta SOP Class. |
| static readonly [BasicFilmBoxSOPClass](../../aspose.medical.dicom/uid/basicfilmboxsopclass) | SOP Class: Basic Film Box SOP Class. |
| static readonly [BasicFilmSessionSOPClass](../../aspose.medical.dicom/uid/basicfilmsessionsopclass) | SOP Class: Basic Film Session SOP Class. |
| static readonly [BasicGrayscaleImageBoxSOPClass](../../aspose.medical.dicom/uid/basicgrayscaleimageboxsopclass) | SOP Class: Basic Grayscale Image Box SOP Class. |
| static readonly [BasicGrayscalePrintManagementMetaSOPClass](../../aspose.medical.dicom/uid/basicgrayscaleprintmanagementmetasopclass) | Meta SOP Class: Basic Grayscale Print Management Meta SOP Class. |
| static readonly [BasicPrintImageOverlayBoxSOPClassRetired](../../aspose.medical.dicom/uid/basicprintimageoverlayboxsopclassretired) | SOP Class: Basic Print Image Overlay Box SOP Class (Retired). |
| static readonly [BasicStructuredDisplayStorage](../../aspose.medical.dicom/uid/basicstructureddisplaystorage) | SOP Class: Basic Structured Display Storage. |
| static readonly [BasicStudyContentNotificationSOPClassRetired](../../aspose.medical.dicom/uid/basicstudycontentnotificationsopclassretired) | SOP Class: Basic Study Content Notification SOP Class (Retired). |
| static readonly [BasicTextSRStorage](../../aspose.medical.dicom/uid/basictextsrstorage) | SOP Class: Basic Text SR Storage. |
| static readonly [BasicVoiceAudioWaveformStorage](../../aspose.medical.dicom/uid/basicvoiceaudiowaveformstorage) | SOP Class: Basic Voice Audio Waveform Storage. |
| static readonly [BlendingSoftcopyPresentationStateStorage](../../aspose.medical.dicom/uid/blendingsoftcopypresentationstatestorage) | SOP Class: Blending Softcopy Presentation State Storage. |
| static readonly [BodyPositionWaveformStorage](../../aspose.medical.dicom/uid/bodypositionwaveformstorage) | SOP Class: Body Position Waveform Storage. |
| static readonly [BreastImagingRelevantPatientInformationQuery](../../aspose.medical.dicom/uid/breastimagingrelevantpatientinformationquery) | SOP Class: Breast Imaging Relevant Patient Information Query. |
| static readonly [BreastProjectionXRayImageStorageForPresentation](../../aspose.medical.dicom/uid/breastprojectionxrayimagestorageforpresentation) | SOP Class: Breast Projection X-Ray Image Storage - For Presentation. |
| static readonly [BreastProjectionXRayImageStorageForProcessing](../../aspose.medical.dicom/uid/breastprojectionxrayimagestorageforprocessing) | SOP Class: Breast Projection X-Ray Image Storage - For Processing. |
| static readonly [BreastTomosynthesisImageStorage](../../aspose.medical.dicom/uid/breasttomosynthesisimagestorage) | SOP Class: Breast Tomosynthesis Image Storage. |
| static readonly [CardiacElectrophysiologyWaveformStorage](../../aspose.medical.dicom/uid/cardiacelectrophysiologywaveformstorage) | SOP Class: Cardiac Electrophysiology Waveform Storage. |
| static readonly [CardiacRelevantPatientInformationQuery](../../aspose.medical.dicom/uid/cardiacrelevantpatientinformationquery) | SOP Class: Cardiac Relevant Patient Information Query. |
| static readonly [CArmPhotonElectronRadiationRecordStorage](../../aspose.medical.dicom/uid/carmphotonelectronradiationrecordstorage) | SOP Class: C-Arm Photon-Electron Radiation Record Storage. |
| static readonly [CArmPhotonElectronRadiationStorage](../../aspose.medical.dicom/uid/carmphotonelectronradiationstorage) | SOP Class: C-Arm Photon-Electron Radiation Storage. |
| static readonly [ChestCADSRStorage](../../aspose.medical.dicom/uid/chestcadsrstorage) | SOP Class: Chest CAD SR Storage. |
| static readonly [ColonCADSRStorage](../../aspose.medical.dicom/uid/coloncadsrstorage) | SOP Class: Colon CAD SR Storage. |
| static readonly [ColorPaletteQueryRetrieveInformationModelFIND](../../aspose.medical.dicom/uid/colorpalettequeryretrieveinformationmodelfind) | SOP Class: Color Palette Query/Retrieve Information Model - FIND. |
| static readonly [ColorPaletteQueryRetrieveInformationModelGET](../../aspose.medical.dicom/uid/colorpalettequeryretrieveinformationmodelget) | SOP Class: Color Palette Query/Retrieve Information Model - GET. |
| static readonly [ColorPaletteQueryRetrieveInformationModelMOVE](../../aspose.medical.dicom/uid/colorpalettequeryretrieveinformationmodelmove) | SOP Class: Color Palette Query/Retrieve Information Model - MOVE. |
| static readonly [ColorPaletteStorage](../../aspose.medical.dicom/uid/colorpalettestorage) | SOP Class: Color Palette Storage. |
| static readonly [ColorSoftcopyPresentationStateStorage](../../aspose.medical.dicom/uid/colorsoftcopypresentationstatestorage) | SOP Class: Color Softcopy Presentation State Storage. |
| static readonly [CompositeInstanceRetrieveWithoutBulkDataGET](../../aspose.medical.dicom/uid/compositeinstanceretrievewithoutbulkdataget) | SOP Class: Composite Instance Retrieve Without Bulk Data - GET. |
| static readonly [CompositeInstanceRootRetrieveGET](../../aspose.medical.dicom/uid/compositeinstancerootretrieveget) | SOP Class: Composite Instance Root Retrieve - GET. |
| static readonly [CompositeInstanceRootRetrieveMOVE](../../aspose.medical.dicom/uid/compositeinstancerootretrievemove) | SOP Class: Composite Instance Root Retrieve - MOVE. |
| static readonly [CompositingPlanarMPRVolumetricPresentationStateStorage](../../aspose.medical.dicom/uid/compositingplanarmprvolumetricpresentationstatestorage) | SOP Class: Compositing Planar MPR Volumetric Presentation State Storage. |
| static readonly [Comprehensive3DSRStorage](../../aspose.medical.dicom/uid/comprehensive3dsrstorage) | SOP Class: Comprehensive 3D SR Storage. |
| static readonly [ComprehensiveSRStorage](../../aspose.medical.dicom/uid/comprehensivesrstorage) | SOP Class: Comprehensive SR Storage. |
| static readonly [ComprehensiveSRStorageTrialRetired](../../aspose.medical.dicom/uid/comprehensivesrstoragetrialretired) | SOP Class: Comprehensive SR Storage - Trial (Retired). |
| static readonly [ComputedRadiographyImageStorage](../../aspose.medical.dicom/uid/computedradiographyimagestorage) | SOP Class: Computed Radiography Image Storage. |
| static readonly [ConfocalMicroscopyImageStorage](../../aspose.medical.dicom/uid/confocalmicroscopyimagestorage) | SOP Class: Confocal Microscopy Image Storage. |
| static readonly [ConfocalMicroscopyTiledPyramidalImageStorage](../../aspose.medical.dicom/uid/confocalmicroscopytiledpyramidalimagestorage) | SOP Class: Confocal Microscopy Tiled Pyramidal Image Storage. |
| static readonly [ContentAssessmentResultsStorage](../../aspose.medical.dicom/uid/contentassessmentresultsstorage) | SOP Class: Content Assessment Results Storage. |
| static readonly [CornealTopographyMapStorage](../../aspose.medical.dicom/uid/cornealtopographymapstorage) | SOP Class: Corneal Topography Map Storage. |
| static readonly [CTDefinedProcedureProtocolStorage](../../aspose.medical.dicom/uid/ctdefinedprocedureprotocolstorage) | SOP Class: CT Defined Procedure Protocol Storage. |
| static readonly [CTImageStorage](../../aspose.medical.dicom/uid/ctimagestorage) | SOP Class: CT Image Storage. |
| static readonly [CTPerformedProcedureProtocolStorage](../../aspose.medical.dicom/uid/ctperformedprocedureprotocolstorage) | SOP Class: CT Performed Procedure Protocol Storage. |
| static readonly [DefinedProcedureProtocolInformationModelFIND](../../aspose.medical.dicom/uid/definedprocedureprotocolinformationmodelfind) | SOP Class: Defined Procedure Protocol Information Model - FIND. |
| static readonly [DefinedProcedureProtocolInformationModelGET](../../aspose.medical.dicom/uid/definedprocedureprotocolinformationmodelget) | SOP Class: Defined Procedure Protocol Information Model - GET. |
| static readonly [DefinedProcedureProtocolInformationModelMOVE](../../aspose.medical.dicom/uid/definedprocedureprotocolinformationmodelmove) | SOP Class: Defined Procedure Protocol Information Model - MOVE. |
| static readonly [DeflatedExplicitVrLittleEndian](../../aspose.medical.dicom/uid/deflatedexplicitvrlittleendian) | Transfer Syntax: Deflated Explicit VR Little Endian. |
| static readonly [DeflatedImageFrameCompression](../../aspose.medical.dicom/uid/deflatedimageframecompression) | Transfer Syntax: Deflated Image Frame Compression. |
| static readonly [DeformableSpatialRegistrationStorage](../../aspose.medical.dicom/uid/deformablespatialregistrationstorage) | SOP Class: Deformable Spatial Registration Storage. |
| static readonly [DermoscopicPhotographyImageStorage](../../aspose.medical.dicom/uid/dermoscopicphotographyimagestorage) | SOP Class: Dermoscopic Photography Image Storage. |
| static readonly [DetachedInterpretationManagementSOPClassRetired](../../aspose.medical.dicom/uid/detachedinterpretationmanagementsopclassretired) | SOP Class: Detached Interpretation Management SOP Class (Retired). |
| static readonly [DetachedPatientManagementMetaSOPClassRetired](../../aspose.medical.dicom/uid/detachedpatientmanagementmetasopclassretired) | Meta SOP Class: Detached Patient Management Meta SOP Class (Retired). |
| static readonly [DetachedPatientManagementSOPClassRetired](../../aspose.medical.dicom/uid/detachedpatientmanagementsopclassretired) | SOP Class: Detached Patient Management SOP Class (Retired). |
| static readonly [DetachedResultsManagementMetaSOPClassRetired](../../aspose.medical.dicom/uid/detachedresultsmanagementmetasopclassretired) | Meta SOP Class: Detached Results Management Meta SOP Class (Retired). |
| static readonly [DetachedResultsManagementSOPClassRetired](../../aspose.medical.dicom/uid/detachedresultsmanagementsopclassretired) | SOP Class: Detached Results Management SOP Class (Retired). |
| static readonly [DetachedStudyManagementMetaSOPClassRetired](../../aspose.medical.dicom/uid/detachedstudymanagementmetasopclassretired) | Meta SOP Class: Detached Study Management Meta SOP Class (Retired). |
| static readonly [DetachedStudyManagementSOPClassRetired](../../aspose.medical.dicom/uid/detachedstudymanagementsopclassretired) | SOP Class: Detached Study Management SOP Class (Retired). |
| static readonly [DetachedVisitManagementSOPClassRetired](../../aspose.medical.dicom/uid/detachedvisitmanagementsopclassretired) | SOP Class: Detached Visit Management SOP Class (Retired). |
| static readonly [DetailSRStorageTrialRetired](../../aspose.medical.dicom/uid/detailsrstoragetrialretired) | SOP Class: Detail SR Storage - Trial (Retired). |
| static readonly [DicomAETitle](../../aspose.medical.dicom/uid/dicomaetitle) | LDAP OID: dicomAETitle. |
| static readonly [DicomApplicationCluster](../../aspose.medical.dicom/uid/dicomapplicationcluster) | LDAP OID: dicomApplicationCluster. |
| static readonly [DICOMApplicationContextName](../../aspose.medical.dicom/uid/dicomapplicationcontextname) | Application Context Name: DICOM Application Context Name. |
| static readonly [DicomAssociationAcceptor](../../aspose.medical.dicom/uid/dicomassociationacceptor) | LDAP OID: dicomAssociationAcceptor. |
| static readonly [DicomAssociationInitiator](../../aspose.medical.dicom/uid/dicomassociationinitiator) | LDAP OID: dicomAssociationInitiator. |
| static readonly [DicomAuthorizedNodeCertificateReference](../../aspose.medical.dicom/uid/dicomauthorizednodecertificatereference) | LDAP OID: dicomAuthorizedNodeCertificateReference. |
| static readonly [DicomConfigurationRoot](../../aspose.medical.dicom/uid/dicomconfigurationroot) | LDAP OID: dicomConfigurationRoot. |
| static readonly [DICOMContentMappingResource](../../aspose.medical.dicom/uid/dicomcontentmappingresource) | Mapping Resource: DICOM Content Mapping Resource. |
| static readonly [DICOMControlledTerminology](../../aspose.medical.dicom/uid/dicomcontrolledterminology) | Coding Scheme: DICOM Controlled Terminology. |
| static readonly [DicomDescription](../../aspose.medical.dicom/uid/dicomdescription) | LDAP OID: dicomDescription. |
| static readonly [DicomDevice](../../aspose.medical.dicom/uid/dicomdevice) | LDAP OID: dicomDevice. |
| static readonly [DicomDeviceName](../../aspose.medical.dicom/uid/dicomdevicename) | LDAP OID: dicomDeviceName. |
| static readonly [DicomDeviceSerialNumber](../../aspose.medical.dicom/uid/dicomdeviceserialnumber) | LDAP OID: dicomDeviceSerialNumber. |
| static readonly [DicomDevicesRoot](../../aspose.medical.dicom/uid/dicomdevicesroot) | LDAP OID: dicomDevicesRoot. |
| static readonly [DicomHostname](../../aspose.medical.dicom/uid/dicomhostname) | LDAP OID: dicomHostname. |
| static readonly [DicomInstalled](../../aspose.medical.dicom/uid/dicominstalled) | LDAP OID: dicomInstalled. |
| static readonly [DicomInstitutionAddress](../../aspose.medical.dicom/uid/dicominstitutionaddress) | LDAP OID: dicomInstitutionAddress. |
| static readonly [DicomInstitutionDepartmentName](../../aspose.medical.dicom/uid/dicominstitutiondepartmentname) | LDAP OID: dicomInstitutionDepartmentName. |
| static readonly [DicomInstitutionName](../../aspose.medical.dicom/uid/dicominstitutionname) | LDAP OID: dicomInstitutionName. |
| static readonly [DicomIssuerOfPatientID](../../aspose.medical.dicom/uid/dicomissuerofpatientid) | LDAP OID: dicomIssuerOfPatientID. |
| static readonly [DicomManufacturer](../../aspose.medical.dicom/uid/dicommanufacturer) | LDAP OID: dicomManufacturer. |
| static readonly [DicomManufacturerModelName](../../aspose.medical.dicom/uid/dicommanufacturermodelname) | LDAP OID: dicomManufacturerModelName. |
| static readonly [DicomNetworkAE](../../aspose.medical.dicom/uid/dicomnetworkae) | LDAP OID: dicomNetworkAE. |
| static readonly [DicomNetworkConnection](../../aspose.medical.dicom/uid/dicomnetworkconnection) | LDAP OID: dicomNetworkConnection. |
| static readonly [DicomNetworkConnectionReference](../../aspose.medical.dicom/uid/dicomnetworkconnectionreference) | LDAP OID: dicomNetworkConnectionReference. |
| static readonly [DicomPort](../../aspose.medical.dicom/uid/dicomport) | LDAP OID: dicomPort. |
| static readonly [DicomPreferredCalledAETitle](../../aspose.medical.dicom/uid/dicompreferredcalledaetitle) | LDAP OID: dicomPreferredCalledAETitle. |
| static readonly [DicomPreferredCallingAETitle](../../aspose.medical.dicom/uid/dicompreferredcallingaetitle) | LDAP OID: dicomPreferredCallingAETitle. |
| static readonly [DicomPrimaryDeviceType](../../aspose.medical.dicom/uid/dicomprimarydevicetype) | LDAP OID: dicomPrimaryDeviceType. |
| static readonly [DicomRelatedDeviceReference](../../aspose.medical.dicom/uid/dicomrelateddevicereference) | LDAP OID: dicomRelatedDeviceReference. |
| static readonly [DicomSoftwareVersion](../../aspose.medical.dicom/uid/dicomsoftwareversion) | LDAP OID: dicomSoftwareVersion. |
| static readonly [DicomSOPClass](../../aspose.medical.dicom/uid/dicomsopclass) | LDAP OID: dicomSOPClass. |
| static readonly [DicomStationName](../../aspose.medical.dicom/uid/dicomstationname) | LDAP OID: dicomStationName. |
| static readonly [DicomSupportedCharacterSet](../../aspose.medical.dicom/uid/dicomsupportedcharacterset) | LDAP OID: dicomSupportedCharacterSet. |
| static readonly [DicomThisNodeCertificateReference](../../aspose.medical.dicom/uid/dicomthisnodecertificatereference) | LDAP OID: dicomThisNodeCertificateReference. |
| static readonly [DicomTLsCyphersuite](../../aspose.medical.dicom/uid/dicomtlscyphersuite) | LDAP OID: dicomTLSCyphersuite. |
| static readonly [DicomTransferCapability](../../aspose.medical.dicom/uid/dicomtransfercapability) | LDAP OID: dicomTransferCapability. |
| static readonly [DicomTransferRole](../../aspose.medical.dicom/uid/dicomtransferrole) | LDAP OID: dicomTransferRole. |
| static readonly [DicomTransferSyntax](../../aspose.medical.dicom/uid/dicomtransfersyntax) | LDAP OID: dicomTransferSyntax. |
| static readonly [DICOMUIDRegistry](../../aspose.medical.dicom/uid/dicomuidregistry) | DICOM UIDs as a Coding Scheme: DICOM UID Registry. |
| static readonly [DicomUniqueAETitle](../../aspose.medical.dicom/uid/dicomuniqueaetitle) | LDAP OID: dicomUniqueAETitle. |
| static readonly [DicomUniqueAETitlesRegistryRoot](../../aspose.medical.dicom/uid/dicomuniqueaetitlesregistryroot) | LDAP OID: dicomUniqueAETitlesRegistryRoot. |
| static readonly [DicomVendorData](../../aspose.medical.dicom/uid/dicomvendordata) | LDAP OID: dicomVendorData. |
| static readonly [DICOS2DAITStorage](../../aspose.medical.dicom/uid/dicos2daitstorage) | SOP Class: DICOS 2D AIT Storage. |
| static readonly [DICOS3DAITStorage](../../aspose.medical.dicom/uid/dicos3daitstorage) | SOP Class: DICOS 3D AIT Storage. |
| static readonly [DICOSCTImageStorage](../../aspose.medical.dicom/uid/dicosctimagestorage) | SOP Class: DICOS CT Image Storage. |
| static readonly [DICOSDigitalXRayImageStorageForPresentation](../../aspose.medical.dicom/uid/dicosdigitalxrayimagestorageforpresentation) | SOP Class: DICOS Digital X-Ray Image Storage - For Presentation. |
| static readonly [DICOSDigitalXRayImageStorageForProcessing](../../aspose.medical.dicom/uid/dicosdigitalxrayimagestorageforprocessing) | SOP Class: DICOS Digital X-Ray Image Storage - For Processing. |
| static readonly [DICOSQuadrupoleResonanceQRStorage](../../aspose.medical.dicom/uid/dicosquadrupoleresonanceqrstorage) | SOP Class: DICOS Quadrupole Resonance (QR) Storage. |
| static readonly [DICOSThreatDetectionReportStorage](../../aspose.medical.dicom/uid/dicosthreatdetectionreportstorage) | SOP Class: DICOS Threat Detection Report Storage. |
| static readonly [DigitalIntraOralXRayImageStorageForPresentation](../../aspose.medical.dicom/uid/digitalintraoralxrayimagestorageforpresentation) | SOP Class: Digital Intra-Oral X-Ray Image Storage - For Presentation. |
| static readonly [DigitalIntraOralXRayImageStorageForProcessing](../../aspose.medical.dicom/uid/digitalintraoralxrayimagestorageforprocessing) | SOP Class: Digital Intra-Oral X-Ray Image Storage - For Processing. |
| static readonly [DigitalMammographyXRayImageStorageForPresentation](../../aspose.medical.dicom/uid/digitalmammographyxrayimagestorageforpresentation) | SOP Class: Digital Mammography X-Ray Image Storage - For Presentation. |
| static readonly [DigitalMammographyXRayImageStorageForProcessing](../../aspose.medical.dicom/uid/digitalmammographyxrayimagestorageforprocessing) | SOP Class: Digital Mammography X-Ray Image Storage - For Processing. |
| static readonly [DigitalXRayImageStorageForPresentation](../../aspose.medical.dicom/uid/digitalxrayimagestorageforpresentation) | SOP Class: Digital X-Ray Image Storage - For Presentation. |
| static readonly [DigitalXRayImageStorageForProcessing](../../aspose.medical.dicom/uid/digitalxrayimagestorageforprocessing) | SOP Class: Digital X-Ray Image Storage - For Processing. |
| static readonly [DisplaySystemSOPClass](../../aspose.medical.dicom/uid/displaysystemsopclass) | SOP Class: Display System SOP Class. |
| static readonly [DisplaySystemSOPInstance](../../aspose.medical.dicom/uid/displaysystemsopinstance) | Well-known SOP Instance: Display System SOP Instance. |
| static readonly [DublinCore](../../aspose.medical.dicom/uid/dublincore) | Coding Scheme: Dublin Core. |
| static readonly [EddyCurrentImageStorage](../../aspose.medical.dicom/uid/eddycurrentimagestorage) | SOP Class: Eddy Current Image Storage. |
| static readonly [EddyCurrentMultiFrameImageStorage](../../aspose.medical.dicom/uid/eddycurrentmultiframeimagestorage) | SOP Class: Eddy Current Multi-frame Image Storage. |
| static readonly [ElectromyogramWaveformStorage](../../aspose.medical.dicom/uid/electromyogramwaveformstorage) | SOP Class: Electromyogram Waveform Storage. |
| static readonly [ElectrooculogramWaveformStorage](../../aspose.medical.dicom/uid/electrooculogramwaveformstorage) | SOP Class: Electrooculogram Waveform Storage. |
| static readonly [EncapsulatedCDAStorage](../../aspose.medical.dicom/uid/encapsulatedcdastorage) | SOP Class: Encapsulated CDA Storage. |
| static readonly [EncapsulatedMTLStorage](../../aspose.medical.dicom/uid/encapsulatedmtlstorage) | SOP Class: Encapsulated MTL Storage. |
| static readonly [EncapsulatedOBJStorage](../../aspose.medical.dicom/uid/encapsulatedobjstorage) | SOP Class: Encapsulated OBJ Storage. |
| static readonly [EncapsulatedPDFStorage](../../aspose.medical.dicom/uid/encapsulatedpdfstorage) | SOP Class: Encapsulated PDF Storage. |
| static readonly [EncapsulatedSTLStorage](../../aspose.medical.dicom/uid/encapsulatedstlstorage) | SOP Class: Encapsulated STL Storage. |
| static readonly [EncapsulatedUncompressedExplicitVrLittleEndian](../../aspose.medical.dicom/uid/encapsulateduncompressedexplicitvrlittleendian) | Transfer Syntax: Encapsulated Uncompressed Explicit VR Little Endian. |
| static readonly [EnhancedContinuousRTImageStorage](../../aspose.medical.dicom/uid/enhancedcontinuousrtimagestorage) | SOP Class: Enhanced Continuous RT Image Storage. |
| static readonly [EnhancedCTImageStorage](../../aspose.medical.dicom/uid/enhancedctimagestorage) | SOP Class: Enhanced CT Image Storage. |
| static readonly [EnhancedMRColorImageStorage](../../aspose.medical.dicom/uid/enhancedmrcolorimagestorage) | SOP Class: Enhanced MR Color Image Storage. |
| static readonly [EnhancedMRImageStorage](../../aspose.medical.dicom/uid/enhancedmrimagestorage) | SOP Class: Enhanced MR Image Storage. |
| static readonly [EnhancedPETImageStorage](../../aspose.medical.dicom/uid/enhancedpetimagestorage) | SOP Class: Enhanced PET Image Storage. |
| static readonly [EnhancedRTImageStorage](../../aspose.medical.dicom/uid/enhancedrtimagestorage) | SOP Class: Enhanced RT Image Storage. |
| static readonly [EnhancedSRStorage](../../aspose.medical.dicom/uid/enhancedsrstorage) | SOP Class: Enhanced SR Storage. |
| static readonly [EnhancedUSVolumeStorage](../../aspose.medical.dicom/uid/enhancedusvolumestorage) | SOP Class: Enhanced US Volume Storage. |
| static readonly [EnhancedXAImageStorage](../../aspose.medical.dicom/uid/enhancedxaimagestorage) | SOP Class: Enhanced XA Image Storage. |
| static readonly [EnhancedXRayRadiationDoseSRStorage](../../aspose.medical.dicom/uid/enhancedxrayradiationdosesrstorage) | SOP Class: Enhanced X-Ray Radiation Dose SR Storage. |
| static readonly [EnhancedXRFImageStorage](../../aspose.medical.dicom/uid/enhancedxrfimagestorage) | SOP Class: Enhanced XRF Image Storage. |
| static readonly [ExplicitVrBigEndianRetired](../../aspose.medical.dicom/uid/explicitvrbigendianretired) | Transfer Syntax: Explicit VR Big Endian (Retired). |
| static readonly [ExplicitVrLittleEndian](../../aspose.medical.dicom/uid/explicitvrlittleendian) | Transfer Syntax: Explicit VR Little Endian. |
| static readonly [ExtensibleSRStorage](../../aspose.medical.dicom/uid/extensiblesrstorage) | SOP Class: Extensible SR Storage. |
| static readonly [FallColorPaletteSOPInstance](../../aspose.medical.dicom/uid/fallcolorpalettesopinstance) | Well-known SOP Instance: Fall Color Palette SOP Instance. |
| static readonly [FragmentableMPEG2MainProfileHighLevel](../../aspose.medical.dicom/uid/fragmentablempeg2mainprofilehighlevel) | Transfer Syntax: Fragmentable MPEG2 Main Profile / High Level. |
| static readonly [FragmentableMPEG2MainProfileMainLevel](../../aspose.medical.dicom/uid/fragmentablempeg2mainprofilemainlevel) | Transfer Syntax: Fragmentable MPEG2 Main Profile / Main Level. |
| static readonly [FragmentableMPEG4AVCH264BDCompatibleHighProfileLevel41](../../aspose.medical.dicom/uid/fragmentablempeg4avch264bdcompatiblehighprofilelevel41) | Transfer Syntax: Fragmentable MPEG-4 AVC/H.264 BD-compatible High Profile / Level 4.1. |
| static readonly [FragmentableMPEG4AVCH264HighProfileLevel41](../../aspose.medical.dicom/uid/fragmentablempeg4avch264highprofilelevel41) | Transfer Syntax: Fragmentable MPEG-4 AVC/H.264 High Profile / Level 4.1. |
| static readonly [FragmentableMPEG4AVCH264HighProfileLevel42For2DVideo](../../aspose.medical.dicom/uid/fragmentablempeg4avch264highprofilelevel42for2dvideo) | Transfer Syntax: Fragmentable MPEG-4 AVC/H.264 High Profile / Level 4.2 For 2D Video. |
| static readonly [FragmentableMPEG4AVCH264HighProfileLevel42For3DVideo](../../aspose.medical.dicom/uid/fragmentablempeg4avch264highprofilelevel42for3dvideo) | Transfer Syntax: Fragmentable MPEG-4 AVC/H.264 High Profile / Level 4.2 For 3D Video. |
| static readonly [FragmentableMPEG4AVCH264StereoHighProfileLevel42](../../aspose.medical.dicom/uid/fragmentablempeg4avch264stereohighprofilelevel42) | Transfer Syntax: Fragmentable MPEG-4 AVC/H.264 Stereo High Profile / Level 4.2. |
| static readonly [General32BitECGWaveformStorage](../../aspose.medical.dicom/uid/general32bitecgwaveformstorage) | SOP Class: General 32-bit ECG Waveform Storage. |
| static readonly [GeneralAudioWaveformStorage](../../aspose.medical.dicom/uid/generalaudiowaveformstorage) | SOP Class: General Audio Waveform Storage. |
| static readonly [GeneralECGWaveformStorage](../../aspose.medical.dicom/uid/generalecgwaveformstorage) | SOP Class: General ECG Waveform Storage. |
| static readonly [GeneralPurposePerformedProcedureStepSOPClassRetired](../../aspose.medical.dicom/uid/generalpurposeperformedprocedurestepsopclassretired) | SOP Class: General Purpose Performed Procedure Step SOP Class (Retired). |
| static readonly [GeneralPurposeScheduledProcedureStepSOPClassRetired](../../aspose.medical.dicom/uid/generalpurposescheduledprocedurestepsopclassretired) | SOP Class: General Purpose Scheduled Procedure Step SOP Class (Retired). |
| static readonly [GeneralPurposeWorklistInformationModelFINDRetired](../../aspose.medical.dicom/uid/generalpurposeworklistinformationmodelfindretired) | SOP Class: General Purpose Worklist Information Model - FIND (Retired). |
| static readonly [GeneralPurposeWorklistManagementMetaSOPClassRetired](../../aspose.medical.dicom/uid/generalpurposeworklistmanagementmetasopclassretired) | Meta SOP Class: General Purpose Worklist Management Meta SOP Class (Retired). |
| static readonly [GeneralRelevantPatientInformationQuery](../../aspose.medical.dicom/uid/generalrelevantpatientinformationquery) | SOP Class: General Relevant Patient Information Query. |
| static readonly [GenericImplantTemplateInformationModelFIND](../../aspose.medical.dicom/uid/genericimplanttemplateinformationmodelfind) | SOP Class: Generic Implant Template Information Model - FIND. |
| static readonly [GenericImplantTemplateInformationModelGET](../../aspose.medical.dicom/uid/genericimplanttemplateinformationmodelget) | SOP Class: Generic Implant Template Information Model - GET. |
| static readonly [GenericImplantTemplateInformationModelMOVE](../../aspose.medical.dicom/uid/genericimplanttemplateinformationmodelmove) | SOP Class: Generic Implant Template Information Model - MOVE. |
| static readonly [GenericImplantTemplateStorage](../../aspose.medical.dicom/uid/genericimplanttemplatestorage) | SOP Class: Generic Implant Template Storage. |
| static readonly [GePrivateImplicitVrBigEndian](../../aspose.medical.dicom/uid/geprivateimplicitvrbigendian) | GE Private Implicit VR Big Endian. |
| static readonly [GrayscalePlanarMPRVolumetricPresentationStateStorage](../../aspose.medical.dicom/uid/grayscaleplanarmprvolumetricpresentationstatestorage) | SOP Class: Grayscale Planar MPR Volumetric Presentation State Storage. |
| static readonly [GrayscaleSoftcopyPresentationStateStorage](../../aspose.medical.dicom/uid/grayscalesoftcopypresentationstatestorage) | SOP Class: Grayscale Softcopy Presentation State Storage. |
| static readonly [HangingProtocolInformationModelFIND](../../aspose.medical.dicom/uid/hangingprotocolinformationmodelfind) | SOP Class: Hanging Protocol Information Model - FIND. |
| static readonly [HangingProtocolInformationModelGET](../../aspose.medical.dicom/uid/hangingprotocolinformationmodelget) | SOP Class: Hanging Protocol Information Model - GET. |
| static readonly [HangingProtocolInformationModelMOVE](../../aspose.medical.dicom/uid/hangingprotocolinformationmodelmove) | SOP Class: Hanging Protocol Information Model - MOVE. |
| static readonly [HangingProtocolStorage](../../aspose.medical.dicom/uid/hangingprotocolstorage) | SOP Class: Hanging Protocol Storage. |
| static readonly [HardcopyColorImageStorageSOPClassRetired](../../aspose.medical.dicom/uid/hardcopycolorimagestoragesopclassretired) | SOP Class: Hardcopy Color Image Storage SOP Class (Retired). |
| static readonly [HardcopyGrayscaleImageStorageSOPClassRetired](../../aspose.medical.dicom/uid/hardcopygrayscaleimagestoragesopclassretired) | SOP Class: Hardcopy Grayscale Image Storage SOP Class (Retired). |
| static readonly [HeightMapSegmentationStorage](../../aspose.medical.dicom/uid/heightmapsegmentationstorage) | SOP Class: Height Map Segmentation Storage. |
| static readonly [HemodynamicWaveformStorage](../../aspose.medical.dicom/uid/hemodynamicwaveformstorage) | SOP Class: Hemodynamic Waveform Storage. |
| static readonly [HEVCH265Main10ProfileLevel51](../../aspose.medical.dicom/uid/hevch265main10profilelevel51) | Transfer Syntax: HEVC/H.265 Main 10 Profile / Level 5.1. |
| static readonly [HEVCH265MainProfileLevel51](../../aspose.medical.dicom/uid/hevch265mainprofilelevel51) | Transfer Syntax: HEVC/H.265 Main Profile / Level 5.1. |
| static readonly [HighThroughputJpeg2000](../../aspose.medical.dicom/uid/highthroughputjpeg2000) | Transfer Syntax: High-Throughput JPEG 2000 Image Compression. |
| static readonly [HighThroughputJpeg2000LosslessOnly](../../aspose.medical.dicom/uid/highthroughputjpeg2000losslessonly) | Transfer Syntax: High-Throughput JPEG 2000 Image Compression (Lossless Only). |
| static readonly [HighThroughputJpeg2000WithRPCLOptionsLosslessOnly](../../aspose.medical.dicom/uid/highthroughputjpeg2000withrpcloptionslosslessonly) | Transfer Syntax: High-Throughput JPEG 2000 with RPCL Options Image Compression (Lossless Only). |
| static readonly [HotIronColorPaletteSOPInstance](../../aspose.medical.dicom/uid/hotironcolorpalettesopinstance) | Well-known SOP Instance: Hot Iron Color Palette SOP Instance. |
| static readonly [HotMetalBlueColorPaletteSOPInstance](../../aspose.medical.dicom/uid/hotmetalbluecolorpalettesopinstance) | Well-known SOP Instance: Hot Metal Blue Color Palette SOP Instance. |
| static readonly [ICD11](../../aspose.medical.dicom/uid/icd11) | Coding Scheme: ICD-11. |
| static readonly [ImageBiomarkerStandardisationInitiative](../../aspose.medical.dicom/uid/imagebiomarkerstandardisationinitiative) | Coding Scheme: Image Biomarker Standardisation Initiative. |
| static readonly [ImageOverlayBoxSOPClassRetired](../../aspose.medical.dicom/uid/imageoverlayboxsopclassretired) | SOP Class: Image Overlay Box SOP Class (Retired). |
| static readonly [ImplantAssemblyTemplateInformationModelFIND](../../aspose.medical.dicom/uid/implantassemblytemplateinformationmodelfind) | SOP Class: Implant Assembly Template Information Model - FIND. |
| static readonly [ImplantAssemblyTemplateInformationModelGET](../../aspose.medical.dicom/uid/implantassemblytemplateinformationmodelget) | SOP Class: Implant Assembly Template Information Model - GET. |
| static readonly [ImplantAssemblyTemplateInformationModelMOVE](../../aspose.medical.dicom/uid/implantassemblytemplateinformationmodelmove) | SOP Class: Implant Assembly Template Information Model - MOVE. |
| static readonly [ImplantAssemblyTemplateStorage](../../aspose.medical.dicom/uid/implantassemblytemplatestorage) | SOP Class: Implant Assembly Template Storage. |
| static readonly [ImplantationPlanSRStorage](../../aspose.medical.dicom/uid/implantationplansrstorage) | SOP Class: Implantation Plan SR Storage. |
| static readonly [ImplantTemplateGroupInformationModelFIND](../../aspose.medical.dicom/uid/implanttemplategroupinformationmodelfind) | SOP Class: Implant Template Group Information Model - FIND. |
| static readonly [ImplantTemplateGroupInformationModelGET](../../aspose.medical.dicom/uid/implanttemplategroupinformationmodelget) | SOP Class: Implant Template Group Information Model - GET. |
| static readonly [ImplantTemplateGroupInformationModelMOVE](../../aspose.medical.dicom/uid/implanttemplategroupinformationmodelmove) | SOP Class: Implant Template Group Information Model - MOVE. |
| static readonly [ImplantTemplateGroupStorage](../../aspose.medical.dicom/uid/implanttemplategroupstorage) | SOP Class: Implant Template Group Storage. |
| static readonly [ImplicitVrLittleEndian](../../aspose.medical.dicom/uid/implicitvrlittleendian) | Transfer Syntax: Implicit VR Little Endian: Default Transfer Syntax for DICOM. |
| static readonly [InstanceAvailabilityNotificationSOPClass](../../aspose.medical.dicom/uid/instanceavailabilitynotificationsopclass) | SOP Class: Instance Availability Notification SOP Class. |
| static readonly [IntegratedTaxonomicInformationSystemITISTaxonomicSerialNumberTSN](../../aspose.medical.dicom/uid/integratedtaxonomicinformationsystemitistaxonomicserialnumbertsn) | Coding Scheme: Integrated Taxonomic Information System (ITIS) Taxonomic Serial Number (TSN). |
| static readonly [IntraocularLensCalculationsStorage](../../aspose.medical.dicom/uid/intraocularlenscalculationsstorage) | SOP Class: Intraocular Lens Calculations Storage. |
| static readonly [IntravascularOpticalCoherenceTomographyImageStorageForPresentation](../../aspose.medical.dicom/uid/intravascularopticalcoherencetomographyimagestorageforpresentation) | SOP Class: Intravascular Optical Coherence Tomography Image Storage - For Presentation. |
| static readonly [IntravascularOpticalCoherenceTomographyImageStorageForProcessing](../../aspose.medical.dicom/uid/intravascularopticalcoherencetomographyimagestorageforprocessing) | SOP Class: Intravascular Optical Coherence Tomography Image Storage - For Processing. |
| static readonly [InventoryCreation](../../aspose.medical.dicom/uid/inventorycreation) | SOP Class: Inventory Creation. |
| static readonly [InventoryFIND](../../aspose.medical.dicom/uid/inventoryfind) | SOP Class: Inventory - FIND. |
| static readonly [InventoryGET](../../aspose.medical.dicom/uid/inventoryget) | SOP Class: Inventory - GET. |
| static readonly [InventoryMOVE](../../aspose.medical.dicom/uid/inventorymove) | SOP Class: Inventory - MOVE. |
| static readonly [InventoryStorage](../../aspose.medical.dicom/uid/inventorystorage) | SOP Class: Inventory Storage. |
| static readonly [Jpeg2000](../../aspose.medical.dicom/uid/jpeg2000) | Transfer Syntax: JPEG 2000 Image Compression. |
| static readonly [Jpeg2000LosslessOnly](../../aspose.medical.dicom/uid/jpeg2000losslessonly) | Transfer Syntax: JPEG 2000 Image Compression (Lossless Only). |
| static readonly [Jpeg2000Part2MultiComponent](../../aspose.medical.dicom/uid/jpeg2000part2multicomponent) | Transfer Syntax: JPEG 2000 Part 2 Multi-component Image Compression. |
| static readonly [Jpeg2000Part2MultiComponentLosslessOnly](../../aspose.medical.dicom/uid/jpeg2000part2multicomponentlosslessonly) | Transfer Syntax: JPEG 2000 Part 2 Multi-component Image Compression (Lossless Only). |
| static readonly [JpegBaseline1](../../aspose.medical.dicom/uid/jpegbaseline1) | Transfer Syntax: JPEG Baseline (Process 1): Default Transfer Syntax for Lossy JPEG 8 Bit Image Compression. |
| static readonly [JpegExtended24](../../aspose.medical.dicom/uid/jpegextended24) | Transfer Syntax: JPEG Extended (Process 2 &amp; 4): Default Transfer Syntax for Lossy JPEG 12 Bit Image Compression (Process 4 only). |
| static readonly [JpegExtended35Retired](../../aspose.medical.dicom/uid/jpegextended35retired) | Transfer Syntax: JPEG Extended (Process 3 &amp; 5) (Retired). |
| static readonly [JpegExtendedHierarchical1618Retired](../../aspose.medical.dicom/uid/jpegextendedhierarchical1618retired) | Transfer Syntax: JPEG Extended, Hierarchical (Process 16 &amp; 18) (Retired). |
| static readonly [JpegExtendedHierarchical1719Retired](../../aspose.medical.dicom/uid/jpegextendedhierarchical1719retired) | Transfer Syntax: JPEG Extended, Hierarchical (Process 17 &amp; 19) (Retired). |
| static readonly [JpegFullProgressionHierarchical2426Retired](../../aspose.medical.dicom/uid/jpegfullprogressionhierarchical2426retired) | Transfer Syntax: JPEG Full Progression, Hierarchical (Process 24 &amp; 26) (Retired). |
| static readonly [JpegFullProgressionHierarchical2527Retired](../../aspose.medical.dicom/uid/jpegfullprogressionhierarchical2527retired) | Transfer Syntax: JPEG Full Progression, Hierarchical (Process 25 &amp; 27) (Retired). |
| static readonly [JpegFullProgressionNonHierarchical1012Retired](../../aspose.medical.dicom/uid/jpegfullprogressionnonhierarchical1012retired) | Transfer Syntax: JPEG Full Progression, Non-Hierarchical (Process 10 &amp; 12) (Retired). |
| static readonly [JpegFullProgressionNonHierarchical1113Retired](../../aspose.medical.dicom/uid/jpegfullprogressionnonhierarchical1113retired) | Transfer Syntax: JPEG Full Progression, Non-Hierarchical (Process 11 &amp; 13) (Retired). |
| static readonly [JpegLosslessHierarchical28Retired](../../aspose.medical.dicom/uid/jpeglosslesshierarchical28retired) | Transfer Syntax: JPEG Lossless, Hierarchical (Process 28) (Retired). |
| static readonly [JpegLosslessHierarchical29Retired](../../aspose.medical.dicom/uid/jpeglosslesshierarchical29retired) | Transfer Syntax: JPEG Lossless, Hierarchical (Process 29) (Retired). |
| static readonly [JpegLosslessNonHierarchical14](../../aspose.medical.dicom/uid/jpeglosslessnonhierarchical14) | Transfer Syntax: JPEG Lossless, Non-Hierarchical (Process 14). |
| static readonly [JpegLosslessNonHierarchical15Retired](../../aspose.medical.dicom/uid/jpeglosslessnonhierarchical15retired) | Transfer Syntax: JPEG Lossless, Non-Hierarchical (Process 15) (Retired). |
| static readonly [JpegLosslessNonHierarchicalFirstOrderPrediction14SelectionValue1](../../aspose.medical.dicom/uid/jpeglosslessnonhierarchicalfirstorderprediction14selectionvalue1) | Transfer Syntax: JPEG Lossless, Non-Hierarchical, First-Order Prediction (Process 14 [Selection Value 1]): Default Transfer Syntax for Lossless JPEG Image Compression. |
| static readonly [JpegLsLossless](../../aspose.medical.dicom/uid/jpeglslossless) | Transfer Syntax: JPEG-LS Lossless Image Compression. |
| static readonly [JpegLsLossyNearLossless](../../aspose.medical.dicom/uid/jpeglslossynearlossless) | Transfer Syntax: JPEG-LS Lossy (Near-Lossless) Image Compression. |
| static readonly [JpegSpectralSelectionHierarchical2022Retired](../../aspose.medical.dicom/uid/jpegspectralselectionhierarchical2022retired) | Transfer Syntax: JPEG Spectral Selection, Hierarchical (Process 20 &amp; 22) (Retired). |
| static readonly [JpegSpectralSelectionHierarchical2123Retired](../../aspose.medical.dicom/uid/jpegspectralselectionhierarchical2123retired) | Transfer Syntax: JPEG Spectral Selection, Hierarchical (Process 21 &amp; 23) (Retired). |
| static readonly [JpegSpectralSelectionNonHierarchical68Retired](../../aspose.medical.dicom/uid/jpegspectralselectionnonhierarchical68retired) | Transfer Syntax: JPEG Spectral Selection, Non-Hierarchical (Process 6 &amp; 8) (Retired). |
| static readonly [JpegSpectralSelectionNonHierarchical79Retired](../../aspose.medical.dicom/uid/jpegspectralselectionnonhierarchical79retired) | Transfer Syntax: JPEG Spectral Selection, Non-Hierarchical (Process 7 &amp; 9) (Retired). |
| static readonly [JpegXL](../../aspose.medical.dicom/uid/jpegxl) | Transfer Syntax: JPEG XL. |
| static readonly [JpegXLJpegRecompression](../../aspose.medical.dicom/uid/jpegxljpegrecompression) | Transfer Syntax: JPEG XL JPEG Recompression. |
| static readonly [JpegXLLossless](../../aspose.medical.dicom/uid/jpegxllossless) | Transfer Syntax: JPEG XL Lossless. |
| static readonly [JpipHTJ2KReferenced](../../aspose.medical.dicom/uid/jpiphtj2kreferenced) | Transfer Syntax: JPIP HTJ2K Referenced. |
| static readonly [JpipHTJ2KReferencedDeflate](../../aspose.medical.dicom/uid/jpiphtj2kreferenceddeflate) | Transfer Syntax: JPIP HTJ2K Referenced Deflate. |
| static readonly [JpipReferenced](../../aspose.medical.dicom/uid/jpipreferenced) | Transfer Syntax: JPIP Referenced. |
| static readonly [JpipReferencedDeflate](../../aspose.medical.dicom/uid/jpipreferenceddeflate) | Transfer Syntax: JPIP Referenced Deflate. |
| static readonly [KeratometryMeasurementsStorage](../../aspose.medical.dicom/uid/keratometrymeasurementsstorage) | SOP Class: Keratometry Measurements Storage. |
| static readonly [KeyObjectSelectionDocumentStorage](../../aspose.medical.dicom/uid/keyobjectselectiondocumentstorage) | SOP Class: Key Object Selection Document Storage. |
| static readonly [LabelMapSegmentationStorage](../../aspose.medical.dicom/uid/labelmapsegmentationstorage) | SOP Class: Label Map Segmentation Storage. |
| static readonly [LegacyConvertedEnhancedCTImageStorage](../../aspose.medical.dicom/uid/legacyconvertedenhancedctimagestorage) | SOP Class: Legacy Converted Enhanced CT Image Storage. |
| static readonly [LegacyConvertedEnhancedMRImageStorage](../../aspose.medical.dicom/uid/legacyconvertedenhancedmrimagestorage) | SOP Class: Legacy Converted Enhanced MR Image Storage. |
| static readonly [LegacyConvertedEnhancedPETImageStorage](../../aspose.medical.dicom/uid/legacyconvertedenhancedpetimagestorage) | SOP Class: Legacy Converted Enhanced PET Image Storage. |
| static readonly [LensometryMeasurementsStorage](../../aspose.medical.dicom/uid/lensometrymeasurementsstorage) | SOP Class: Lensometry Measurements Storage. |
| static readonly [MacularGridThicknessAndVolumeReportStorage](../../aspose.medical.dicom/uid/maculargridthicknessandvolumereportstorage) | SOP Class: Macular Grid Thickness and Volume Report Storage. |
| static readonly [MammographyCADSRStorage](../../aspose.medical.dicom/uid/mammographycadsrstorage) | SOP Class: Mammography CAD SR Storage. |
| static readonly [MayoClinicNonRadiologicalImagesSpecificBodyStructureAnatomicalSurfaceRegionGuide](../../aspose.medical.dicom/uid/mayoclinicnonradiologicalimagesspecificbodystructureanatomicalsurfaceregionguide) | Coding Scheme: Mayo Clinic Non-radiological Images Specific Body Structure Anatomical Surface Region Guide. |
| static readonly [MediaCreationManagementSOPClassUID](../../aspose.medical.dicom/uid/mediacreationmanagementsopclassuid) | SOP Class: Media Creation Management SOP Class UID. |
| static readonly [MediaStorageDirectoryStorage](../../aspose.medical.dicom/uid/mediastoragedirectorystorage) | SOP Class: Media Storage Directory Storage. |
| static readonly [MicroscopyBulkSimpleAnnotationsStorage](../../aspose.medical.dicom/uid/microscopybulksimpleannotationsstorage) | SOP Class: Microscopy Bulk Simple Annotations Storage. |
| static readonly [ModalityPerformedProcedureStepNotificationSOPClass](../../aspose.medical.dicom/uid/modalityperformedprocedurestepnotificationsopclass) | SOP Class: Modality Performed Procedure Step Notification SOP Class. |
| static readonly [ModalityPerformedProcedureStepRetrieveSOPClass](../../aspose.medical.dicom/uid/modalityperformedprocedurestepretrievesopclass) | SOP Class: Modality Performed Procedure Step Retrieve SOP Class. |
| static readonly [ModalityPerformedProcedureStepSOPClass](../../aspose.medical.dicom/uid/modalityperformedprocedurestepsopclass) | SOP Class: Modality Performed Procedure Step SOP Class. |
| static readonly [ModalityWorklistInformationModelFIND](../../aspose.medical.dicom/uid/modalityworklistinformationmodelfind) | SOP Class: Modality Worklist Information Model - FIND. |
| static readonly [MouseGenomeInitiativeMGI](../../aspose.medical.dicom/uid/mousegenomeinitiativemgi) | Coding Scheme: Mouse Genome Initiative (MGI). |
| static readonly [Mpeg2](../../aspose.medical.dicom/uid/mpeg2) | Transfer Syntax: MPEG2 Main Profile / Main Level. |
| static readonly [MPEG2MainProfileHighLevel](../../aspose.medical.dicom/uid/mpeg2mainprofilehighlevel) | Transfer Syntax: MPEG2 Main Profile / High Level. |
| static readonly [MPEG4AVCH264BDCompatibleHighProfileLevel41](../../aspose.medical.dicom/uid/mpeg4avch264bdcompatiblehighprofilelevel41) | Transfer Syntax: MPEG-4 AVC/H.264 BD-compatible High Profile / Level 4.1. |
| static readonly [MPEG4AVCH264HighProfileLevel41](../../aspose.medical.dicom/uid/mpeg4avch264highprofilelevel41) | Transfer Syntax: MPEG-4 AVC/H.264 High Profile / Level 4.1. |
| static readonly [MPEG4AVCH264HighProfileLevel42For2DVideo](../../aspose.medical.dicom/uid/mpeg4avch264highprofilelevel42for2dvideo) | Transfer Syntax: MPEG-4 AVC/H.264 High Profile / Level 4.2 For 2D Video. |
| static readonly [MPEG4AVCH264HighProfileLevel42For3DVideo](../../aspose.medical.dicom/uid/mpeg4avch264highprofilelevel42for3dvideo) | Transfer Syntax: MPEG-4 AVC/H.264 High Profile / Level 4.2 For 3D Video. |
| static readonly [MPEG4AVCH264StereoHighProfileLevel42](../../aspose.medical.dicom/uid/mpeg4avch264stereohighprofilelevel42) | Transfer Syntax: MPEG-4 AVC/H.264 Stereo High Profile / Level 4.2. |
| static readonly [MRImageStorage](../../aspose.medical.dicom/uid/mrimagestorage) | SOP Class: MR Image Storage. |
| static readonly [MRSpectroscopyStorage](../../aspose.medical.dicom/uid/mrspectroscopystorage) | SOP Class: MR Spectroscopy Storage. |
| static readonly [MultiChannelRespiratoryWaveformStorage](../../aspose.medical.dicom/uid/multichannelrespiratorywaveformstorage) | SOP Class: Multi-channel Respiratory Waveform Storage. |
| static readonly [MultiFrameGrayscaleByteSecondaryCaptureImageStorage](../../aspose.medical.dicom/uid/multiframegrayscalebytesecondarycaptureimagestorage) | SOP Class: Multi-frame Grayscale Byte Secondary Capture Image Storage. |
| static readonly [MultiFrameGrayscaleWordSecondaryCaptureImageStorage](../../aspose.medical.dicom/uid/multiframegrayscalewordsecondarycaptureimagestorage) | SOP Class: Multi-frame Grayscale Word Secondary Capture Image Storage. |
| static readonly [MultiFrameSingleBitSecondaryCaptureImageStorage](../../aspose.medical.dicom/uid/multiframesinglebitsecondarycaptureimagestorage) | SOP Class: Multi-frame Single Bit Secondary Capture Image Storage. |
| static readonly [MultiFrameTrueColorSecondaryCaptureImageStorage](../../aspose.medical.dicom/uid/multiframetruecolorsecondarycaptureimagestorage) | SOP Class: Multi-frame True Color Secondary Capture Image Storage. |
| static readonly [MultipleVolumeRenderingVolumetricPresentationStateStorage](../../aspose.medical.dicom/uid/multiplevolumerenderingvolumetricpresentationstatestorage) | SOP Class: Multiple Volume Rendering Volumetric Presentation State Storage. |
| static readonly [NativeDICOMModel](../../aspose.medical.dicom/uid/nativedicommodel) | Application Hosting Model: Native DICOM Model. |
| static readonly [NewYorkUniversityMelanomaClinicalCooperativeGroup](../../aspose.medical.dicom/uid/newyorkuniversitymelanomaclinicalcooperativegroup) | Coding Scheme: New York University Melanoma Clinical Cooperative Group. |
| static readonly [NuclearMedicineImageStorage](../../aspose.medical.dicom/uid/nuclearmedicineimagestorage) | SOP Class: Nuclear Medicine Image Storage. |
| static readonly [NuclearMedicineImageStorageRetired](../../aspose.medical.dicom/uid/nuclearmedicineimagestorageretired) | SOP Class: Nuclear Medicine Image Storage (Retired). |
| static readonly [OphthalmicAxialMeasurementsStorage](../../aspose.medical.dicom/uid/ophthalmicaxialmeasurementsstorage) | SOP Class: Ophthalmic Axial Measurements Storage. |
| static readonly [OphthalmicOpticalCoherenceTomographyBScanVolumeAnalysisStorage](../../aspose.medical.dicom/uid/ophthalmicopticalcoherencetomographybscanvolumeanalysisstorage) | SOP Class: Ophthalmic Optical Coherence Tomography B-scan Volume Analysis Storage. |
| static readonly [OphthalmicOpticalCoherenceTomographyEnFaceImageStorage](../../aspose.medical.dicom/uid/ophthalmicopticalcoherencetomographyenfaceimagestorage) | SOP Class: Ophthalmic Optical Coherence Tomography En Face Image Storage. |
| static readonly [OphthalmicPhotography16BitImageStorage](../../aspose.medical.dicom/uid/ophthalmicphotography16bitimagestorage) | SOP Class: Ophthalmic Photography 16 Bit Image Storage. |
| static readonly [OphthalmicPhotography8BitImageStorage](../../aspose.medical.dicom/uid/ophthalmicphotography8bitimagestorage) | SOP Class: Ophthalmic Photography 8 Bit Image Storage. |
| static readonly [OphthalmicThicknessMapStorage](../../aspose.medical.dicom/uid/ophthalmicthicknessmapstorage) | SOP Class: Ophthalmic Thickness Map Storage. |
| static readonly [OphthalmicTomographyImageStorage](../../aspose.medical.dicom/uid/ophthalmictomographyimagestorage) | SOP Class: Ophthalmic Tomography Image Storage. |
| static readonly [OphthalmicVisualFieldStaticPerimetryMeasurementsStorage](../../aspose.medical.dicom/uid/ophthalmicvisualfieldstaticperimetrymeasurementsstorage) | SOP Class: Ophthalmic Visual Field Static Perimetry Measurements Storage. |
| static readonly [Papyrus3ImplicitVrLittleEndianRetired](../../aspose.medical.dicom/uid/papyrus3implicitvrlittleendianretired) | Transfer Syntax: Papyrus 3 Implicit VR Little Endian (Retired). |
| static readonly [ParametricMapStorage](../../aspose.medical.dicom/uid/parametricmapstorage) | SOP Class: Parametric Map Storage. |
| static readonly [PatientRadiationDoseSRStorage](../../aspose.medical.dicom/uid/patientradiationdosesrstorage) | SOP Class: Patient Radiation Dose SR Storage. |
| static readonly [PatientRootQueryRetrieveInformationModelFIND](../../aspose.medical.dicom/uid/patientrootqueryretrieveinformationmodelfind) | SOP Class: Patient Root Query/Retrieve Information Model - FIND. |
| static readonly [PatientRootQueryRetrieveInformationModelGET](../../aspose.medical.dicom/uid/patientrootqueryretrieveinformationmodelget) | SOP Class: Patient Root Query/Retrieve Information Model - GET. |
| static readonly [PatientRootQueryRetrieveInformationModelMOVE](../../aspose.medical.dicom/uid/patientrootqueryretrieveinformationmodelmove) | SOP Class: Patient Root Query/Retrieve Information Model - MOVE. |
| static readonly [PatientStudyOnlyQueryRetrieveInformationModelFINDRetired](../../aspose.medical.dicom/uid/patientstudyonlyqueryretrieveinformationmodelfindretired) | SOP Class: Patient/Study Only Query/Retrieve Information Model - FIND (Retired). |
| static readonly [PatientStudyOnlyQueryRetrieveInformationModelGETRetired](../../aspose.medical.dicom/uid/patientstudyonlyqueryretrieveinformationmodelgetretired) | SOP Class: Patient/Study Only Query/Retrieve Information Model - GET (Retired). |
| static readonly [PatientStudyOnlyQueryRetrieveInformationModelMOVERetired](../../aspose.medical.dicom/uid/patientstudyonlyqueryretrieveinformationmodelmoveretired) | SOP Class: Patient/Study Only Query/Retrieve Information Model - MOVE (Retired). |
| static readonly [PerformedImagingAgentAdministrationSRStorage](../../aspose.medical.dicom/uid/performedimagingagentadministrationsrstorage) | SOP Class: Performed Imaging Agent Administration SR Storage. |
| static readonly [PET20StepColorPaletteSOPInstance](../../aspose.medical.dicom/uid/pet20stepcolorpalettesopinstance) | Well-known SOP Instance: PET 20 Step Color Palette SOP Instance. |
| static readonly [PETColorPaletteSOPInstance](../../aspose.medical.dicom/uid/petcolorpalettesopinstance) | Well-known SOP Instance: PET Color Palette SOP Instance. |
| static readonly [PhotoacousticImageStorage](../../aspose.medical.dicom/uid/photoacousticimagestorage) | SOP Class: Photoacoustic Image Storage. |
| static readonly [PlannedImagingAgentAdministrationSRStorage](../../aspose.medical.dicom/uid/plannedimagingagentadministrationsrstorage) | SOP Class: Planned Imaging Agent Administration SR Storage. |
| static readonly [PositronEmissionTomographyImageStorage](../../aspose.medical.dicom/uid/positronemissiontomographyimagestorage) | SOP Class: Positron Emission Tomography Image Storage. |
| static readonly [PresentationLUTSOPClass](../../aspose.medical.dicom/uid/presentationlutsopclass) | SOP Class: Presentation LUT SOP Class. |
| static readonly [PrinterConfigurationRetrievalSOPClass](../../aspose.medical.dicom/uid/printerconfigurationretrievalsopclass) | SOP Class: Printer Configuration Retrieval SOP Class. |
| static readonly [PrinterConfigurationRetrievalSOPInstance](../../aspose.medical.dicom/uid/printerconfigurationretrievalsopinstance) | Well-known SOP Instance: Printer Configuration Retrieval SOP Instance. |
| static readonly [PrinterSOPClass](../../aspose.medical.dicom/uid/printersopclass) | SOP Class: Printer SOP Class. |
| static readonly [PrinterSOPInstance](../../aspose.medical.dicom/uid/printersopinstance) | Well-known SOP Instance: Printer SOP Instance. |
| static readonly [PrintJobSOPClass](../../aspose.medical.dicom/uid/printjobsopclass) | SOP Class: Print Job SOP Class. |
| static readonly [PrintQueueManagementSOPClassRetired](../../aspose.medical.dicom/uid/printqueuemanagementsopclassretired) | SOP Class: Print Queue Management SOP Class (Retired). |
| static readonly [PrintQueueSOPInstanceRetired](../../aspose.medical.dicom/uid/printqueuesopinstanceretired) | Well-known SOP Instance: Print Queue SOP Instance (Retired). |
| static readonly [PrivateAgfaArrivalTransaction](../../aspose.medical.dicom/uid/privateagfaarrivaltransaction) | Private Agfa Arrival Transaction. |
| static readonly [PrivateAgfaBasicAttributePresentationState](../../aspose.medical.dicom/uid/privateagfabasicattributepresentationstate) | Private Agfa Basic Attribute Presentation State. |
| static readonly [PrivateAgfaDictationTransaction](../../aspose.medical.dicom/uid/privateagfadictationtransaction) | Private Agfa Dictation Transaction. |
| static readonly [PrivateAgfaReportApprovalTransaction](../../aspose.medical.dicom/uid/privateagfareportapprovaltransaction) | Private Agfa Report Approval Transaction. |
| static readonly [PrivateAgfaReportTranscriptionTransaction](../../aspose.medical.dicom/uid/privateagfareporttranscriptiontransaction) | Private Agfa Report Transcription Transaction. |
| static readonly [PrivateEradPracticeBuilderReportDictationStorage](../../aspose.medical.dicom/uid/privateeradpracticebuilderreportdictationstorage) | Private ERAD Practice Builder Report Dictation Storage. |
| static readonly [PrivateEradPracticeBuilderReportTextStorage](../../aspose.medical.dicom/uid/privateeradpracticebuilderreporttextstorage) | Private ERAD Practice Builder Report Text Storage. |
| static readonly [PrivateFujiCrImageStorage](../../aspose.medical.dicom/uid/privatefujicrimagestorage) | Private Fuji CR Image Storage. |
| static readonly [PrivateGe3DModelStorage](../../aspose.medical.dicom/uid/privatege3dmodelstorage) | Private GE 3D Model Storage. |
| static readonly [PrivateGeCollageStorage](../../aspose.medical.dicom/uid/privategecollagestorage) | Private GE Collage Storage. |
| static readonly [PrivateGeDicomCTImageInfoObject](../../aspose.medical.dicom/uid/privategedicomctimageinfoobject) | Private GE Dicom CT Image Info Object. |
| static readonly [PrivateGeDicomDisplayImageInfoObject](../../aspose.medical.dicom/uid/privategedicomdisplayimageinfoobject) | Private GE Dicom Display Image Info Object. |
| static readonly [PrivateGeDicomMrImageInfoObject](../../aspose.medical.dicom/uid/privategedicommrimageinfoobject) | Private GE Dicom MR Image Info Object. |
| static readonly [PrivateGeEntegraProtocolOrNmGenieStorage](../../aspose.medical.dicom/uid/privategeentegraprotocolornmgeniestorage) | Private GE eNTEGRA Protocol or NM Genie Storage. |
| static readonly [PrivateGepetRawDataStorage](../../aspose.medical.dicom/uid/privategepetrawdatastorage) | Private GE PET Raw Data Storage. |
| static readonly [PrivateGertPlanStorage](../../aspose.medical.dicom/uid/privategertplanstorage) | Private GE RT Plan Storage. |
| static readonly [PrivatePhilips3DObjectStorage](../../aspose.medical.dicom/uid/privatephilips3dobjectstorage) | Private Philips 3D Object Storage. |
| static readonly [PrivatePhilips3DObjectStorageRetired](../../aspose.medical.dicom/uid/privatephilips3dobjectstorageretired) | Private Philips 3D Object Storage (Retired). |
| static readonly [PrivatePhilips3DPresentationStateStorage](../../aspose.medical.dicom/uid/privatephilips3dpresentationstatestorage) | Private Philips 3D Presentation State Storage. |
| static readonly [PrivatePhilipsCompositeObjectStorage](../../aspose.medical.dicom/uid/privatephilipscompositeobjectstorage) | Private Philips Composite Object Storage. |
| static readonly [PrivatePhilipsCtSyntheticImageStorage](../../aspose.medical.dicom/uid/privatephilipsctsyntheticimagestorage) | Private Philips CT Synthetic Image Storage. |
| static readonly [PrivatePhilipsCxImageStorage](../../aspose.medical.dicom/uid/privatephilipscximagestorage) | Private Philips CX Image Storage. |
| static readonly [PrivatePhilipsCxSyntheticImageStorage](../../aspose.medical.dicom/uid/privatephilipscxsyntheticimagestorage) | Private Philips CX Synthetic Image Storage. |
| static readonly [PrivatePhilipsHpLive3D01Storage](../../aspose.medical.dicom/uid/privatephilipshplive3d01storage) | Private Philips HP Live 3D 01 Storage. |
| static readonly [PrivatePhilipsHpLive3D02Storage](../../aspose.medical.dicom/uid/privatephilipshplive3d02storage) | Private Philips HP Live 3D 02 Storage. |
| static readonly [PrivatePhilipsLiveRunStorage](../../aspose.medical.dicom/uid/privatephilipsliverunstorage) | Private Philips Live Run Storage. |
| static readonly [PrivatePhilipsMrCardioAnalysisStorage](../../aspose.medical.dicom/uid/privatephilipsmrcardioanalysisstorage) | Private Philips MR Cardio Analysis Storage. |
| static readonly [PrivatePhilipsMrCardioAnalysisStorageRetired](../../aspose.medical.dicom/uid/privatephilipsmrcardioanalysisstorageretired) | Private Philips MR Cardio Analysis Storage (Retired). |
| static readonly [PrivatePhilipsMrCardioProfileStorage](../../aspose.medical.dicom/uid/privatephilipsmrcardioprofilestorage) | Private Philips MR Cardio Profile Storage. |
| static readonly [PrivatePhilipsMrCardioStorage](../../aspose.medical.dicom/uid/privatephilipsmrcardiostorage) | Private Philips MR Cardio Storage. |
| static readonly [PrivatePhilipsMrCardioStorageRetired](../../aspose.medical.dicom/uid/privatephilipsmrcardiostorageretired) | Private Philips MR Cardio Storage (Retired). |
| static readonly [PrivatePhilipsMrColorImageStorage](../../aspose.medical.dicom/uid/privatephilipsmrcolorimagestorage) | Private Philips MR Color Image Storage. |
| static readonly [PrivatePhilipsMrExamcardStorage](../../aspose.medical.dicom/uid/privatephilipsmrexamcardstorage) | Private Philips MR Examcard Storage. |
| static readonly [PrivatePhilipsMrSeriesDataStorage](../../aspose.medical.dicom/uid/privatephilipsmrseriesdatastorage) | Private Philips MR Series Data Storage. |
| static readonly [PrivatePhilipsMrSpectrumStorage](../../aspose.medical.dicom/uid/privatephilipsmrspectrumstorage) | Private Philips MR Spectrum Storage. |
| static readonly [PrivatePhilipsMrSyntheticImageStorage](../../aspose.medical.dicom/uid/privatephilipsmrsyntheticimagestorage) | Private Philips MR Synthetic Image Storage. |
| static readonly [PrivatePhilipsPerfusionImageStorage](../../aspose.medical.dicom/uid/privatephilipsperfusionimagestorage) | Private Philips Perfusion Image Storage. |
| static readonly [PrivatePhilipsPerfusionStorage](../../aspose.medical.dicom/uid/privatephilipsperfusionstorage) | Private Philips Perfusion Storage. |
| static readonly [PrivatePhilipsReconstructionStorage](../../aspose.medical.dicom/uid/privatephilipsreconstructionstorage) | Private Philips Reconstruction Storage. |
| static readonly [PrivatePhilipsRunStorage](../../aspose.medical.dicom/uid/privatephilipsrunstorage) | Private Philips Run Storage. |
| static readonly [PrivatePhilipsSpecialisedXaStorage](../../aspose.medical.dicom/uid/privatephilipsspecialisedxastorage) | Private Philips Specialised XA Storage. |
| static readonly [PrivatePhilipsSurfaceStorage](../../aspose.medical.dicom/uid/privatephilipssurfacestorage) | Private Philips Surface Storage. |
| static readonly [PrivatePhilipsSurfaceStorageRetired](../../aspose.medical.dicom/uid/privatephilipssurfacestorageretired) | Private Philips Surface Storage (Retired). |
| static readonly [PrivatePhilipsVolumeSetStorage](../../aspose.medical.dicom/uid/privatephilipsvolumesetstorage) | Private Philips Volume Set Storage. |
| static readonly [PrivatePhilipsVolumeStorage](../../aspose.medical.dicom/uid/privatephilipsvolumestorage) | Private Philips Volume Storage. |
| static readonly [PrivatePhilipsVolumeStorageRetired](../../aspose.medical.dicom/uid/privatephilipsvolumestorageretired) | Private Philips Volume Storage (Retired). |
| static readonly [PrivatePhilipsVrmlStorage](../../aspose.medical.dicom/uid/privatephilipsvrmlstorage) | Private Philips VRML Storage. |
| static readonly [PrivatePhilipsXRayMfStorage](../../aspose.medical.dicom/uid/privatephilipsxraymfstorage) | Private Philips X-Ray MF Storage. |
| static readonly [PrivatePixelMedFloatingPointImageStorage](../../aspose.medical.dicom/uid/privatepixelmedfloatingpointimagestorage) | Private PixelMed Floating Point Image Storage. |
| static readonly [PrivatePixelMedLegacyConvertedEnhancedCtImageStorage](../../aspose.medical.dicom/uid/privatepixelmedlegacyconvertedenhancedctimagestorage) | Private PixelMed Legacy Converted Enhanced CT Image Storage. |
| static readonly [PrivatePixelMedLegacyConvertedEnhancedMrImageStorage](../../aspose.medical.dicom/uid/privatepixelmedlegacyconvertedenhancedmrimagestorage) | Private PixelMed Legacy Converted Enhanced MR Image Storage. |
| static readonly [PrivatePixelMedLegacyConvertedEnhancedPetImageStorage](../../aspose.medical.dicom/uid/privatepixelmedlegacyconvertedenhancedpetimagestorage) | Private PixelMed Legacy Converted Enhanced PET Image Storage. |
| static readonly [PrivatePModMultiFrameImageStorage](../../aspose.medical.dicom/uid/privatepmodmultiframeimagestorage) | Private PMOD Multi-frame Image Storage. |
| static readonly [PrivateSiemensAxFrameSetsStorage](../../aspose.medical.dicom/uid/privatesiemensaxframesetsstorage) | Private Siemens AX Frame Sets Storage. |
| static readonly [PrivateSiemensCsaNonImageStorage](../../aspose.medical.dicom/uid/privatesiemenscsanonimagestorage) | Private Siemens CSA Non Image Storage. |
| static readonly [PrivateSiemensCtmrVolumeStorage](../../aspose.medical.dicom/uid/privatesiemensctmrvolumestorage) | Private Siemens CT MR Volume Storage. |
| static readonly [PrivateTomTecAnnotationStorage](../../aspose.medical.dicom/uid/privatetomtecannotationstorage) | Private TomTec Annotation Storage. |
| static readonly [PrivateToshibaUsImageStorage](../../aspose.medical.dicom/uid/privatetoshibausimagestorage) | Private Toshiba US Image Storage. |
| static readonly [ProceduralEventLoggingSOPClass](../../aspose.medical.dicom/uid/proceduraleventloggingsopclass) | SOP Class: Procedural Event Logging SOP Class. |
| static readonly [ProceduralEventLoggingSOPInstance](../../aspose.medical.dicom/uid/proceduraleventloggingsopinstance) | Well-known SOP Instance: Procedural Event Logging SOP Instance. |
| static readonly [ProcedureLogStorage](../../aspose.medical.dicom/uid/procedurelogstorage) | SOP Class: Procedure Log Storage. |
| static readonly [ProductCharacteristicsQuerySOPClass](../../aspose.medical.dicom/uid/productcharacteristicsquerysopclass) | SOP Class: Product Characteristics Query SOP Class. |
| static readonly [ProtocolApprovalInformationModelFIND](../../aspose.medical.dicom/uid/protocolapprovalinformationmodelfind) | SOP Class: Protocol Approval Information Model - FIND. |
| static readonly [ProtocolApprovalInformationModelGET](../../aspose.medical.dicom/uid/protocolapprovalinformationmodelget) | SOP Class: Protocol Approval Information Model - GET. |
| static readonly [ProtocolApprovalInformationModelMOVE](../../aspose.medical.dicom/uid/protocolapprovalinformationmodelmove) | SOP Class: Protocol Approval Information Model - MOVE. |
| static readonly [ProtocolApprovalStorage](../../aspose.medical.dicom/uid/protocolapprovalstorage) | SOP Class: Protocol Approval Storage. |
| static readonly [PseudoColorSoftcopyPresentationStateStorage](../../aspose.medical.dicom/uid/pseudocolorsoftcopypresentationstatestorage) | SOP Class: Pseudo-Color Softcopy Presentation State Storage. |
| static readonly [PubChemCompoundCID](../../aspose.medical.dicom/uid/pubchemcompoundcid) | Coding Scheme: PubChem Compound CID. |
| static readonly [PullPrintRequestSOPClassRetired](../../aspose.medical.dicom/uid/pullprintrequestsopclassretired) | SOP Class: Pull Print Request SOP Class (Retired). |
| static readonly [PullStoredPrintManagementMetaSOPClassRetired](../../aspose.medical.dicom/uid/pullstoredprintmanagementmetasopclassretired) | Meta SOP Class: Pull Stored Print Management Meta SOP Class (Retired). |
| static readonly [RadElement](../../aspose.medical.dicom/uid/radelement) | Coding Scheme: RadElement. |
| static readonly [RadiomicsOntology](../../aspose.medical.dicom/uid/radiomicsontology) | Coding Scheme: Radiomics Ontology. |
| static readonly [RadiopharmaceuticalRadiationDoseSRStorage](../../aspose.medical.dicom/uid/radiopharmaceuticalradiationdosesrstorage) | SOP Class: Radiopharmaceutical Radiation Dose SR Storage. |
| static readonly [RawDataStorage](../../aspose.medical.dicom/uid/rawdatastorage) | SOP Class: Raw Data Storage. |
| static readonly [RealWorldValueMappingStorage](../../aspose.medical.dicom/uid/realworldvaluemappingstorage) | SOP Class: Real World Value Mapping Storage. |
| static readonly [ReferencedColorPrintManagementMetaSOPClassRetired](../../aspose.medical.dicom/uid/referencedcolorprintmanagementmetasopclassretired) | Meta SOP Class: Referenced Color Print Management Meta SOP Class (Retired). |
| static readonly [ReferencedGrayscalePrintManagementMetaSOPClassRetired](../../aspose.medical.dicom/uid/referencedgrayscaleprintmanagementmetasopclassretired) | Meta SOP Class: Referenced Grayscale Print Management Meta SOP Class (Retired). |
| static readonly [ReferencedImageBoxSOPClassRetired](../../aspose.medical.dicom/uid/referencedimageboxsopclassretired) | SOP Class: Referenced Image Box SOP Class (Retired). |
| static readonly [RenditionSelectionDocumentRealTimeCommunication](../../aspose.medical.dicom/uid/renditionselectiondocumentrealtimecommunication) | SOP Class: Rendition Selection Document Real-Time Communication. |
| static readonly [RepositoryQuery](../../aspose.medical.dicom/uid/repositoryquery) | SOP Class: Repository Query. |
| static readonly [ResearchResourceIdentification](../../aspose.medical.dicom/uid/researchresourceidentification) | Coding Scheme: Research Resource Identification. |
| static readonly [RespiratoryWaveformStorage](../../aspose.medical.dicom/uid/respiratorywaveformstorage) | SOP Class: Respiratory Waveform Storage. |
| static readonly [Rfc2557MimeEncapsulationRetired](../../aspose.medical.dicom/uid/rfc2557mimeencapsulationretired) | Transfer Syntax: RFC 2557 MIME encapsulation (Retired). |
| static readonly [RleLossless](../../aspose.medical.dicom/uid/rlelossless) | Transfer Syntax: RLE Lossless. |
| static readonly [RoboticArmRadiationStorage](../../aspose.medical.dicom/uid/roboticarmradiationstorage) | SOP Class: Robotic-Arm Radiation Storage. |
| static readonly [RoboticRadiationRecordStorage](../../aspose.medical.dicom/uid/roboticradiationrecordstorage) | SOP Class: Robotic Radiation Record Storage. |
| static readonly [RoutineScalpElectroencephalogramWaveformStorage](../../aspose.medical.dicom/uid/routinescalpelectroencephalogramwaveformstorage) | SOP Class: Routine Scalp Electroencephalogram Waveform Storage. |
| static readonly [RTBeamsDeliveryInstructionStorage](../../aspose.medical.dicom/uid/rtbeamsdeliveryinstructionstorage) | SOP Class: RT Beams Delivery Instruction Storage. |
| static readonly [RTBeamsDeliveryInstructionStorageTrialRetired](../../aspose.medical.dicom/uid/rtbeamsdeliveryinstructionstoragetrialretired) | SOP Class: RT Beams Delivery Instruction Storage - Trial (Retired). |
| static readonly [RTBeamsTreatmentRecordStorage](../../aspose.medical.dicom/uid/rtbeamstreatmentrecordstorage) | SOP Class: RT Beams Treatment Record Storage. |
| static readonly [RTBrachyApplicationSetupDeliveryInstructionStorage](../../aspose.medical.dicom/uid/rtbrachyapplicationsetupdeliveryinstructionstorage) | SOP Class: RT Brachy Application Setup Delivery Instruction Storage. |
| static readonly [RTBrachyTreatmentRecordStorage](../../aspose.medical.dicom/uid/rtbrachytreatmentrecordstorage) | SOP Class: RT Brachy Treatment Record Storage. |
| static readonly [RTConventionalMachineVerification](../../aspose.medical.dicom/uid/rtconventionalmachineverification) | SOP Class: RT Conventional Machine Verification. |
| static readonly [RTConventionalMachineVerificationTrialRetired](../../aspose.medical.dicom/uid/rtconventionalmachineverificationtrialretired) | SOP Class: RT Conventional Machine Verification - Trial (Retired). |
| static readonly [RTDoseStorage](../../aspose.medical.dicom/uid/rtdosestorage) | SOP Class: RT Dose Storage. |
| static readonly [RTImageStorage](../../aspose.medical.dicom/uid/rtimagestorage) | SOP Class: RT Image Storage. |
| static readonly [RTIonBeamsTreatmentRecordStorage](../../aspose.medical.dicom/uid/rtionbeamstreatmentrecordstorage) | SOP Class: RT Ion Beams Treatment Record Storage. |
| static readonly [RTIonMachineVerification](../../aspose.medical.dicom/uid/rtionmachineverification) | SOP Class: RT Ion Machine Verification. |
| static readonly [RTIonMachineVerificationTrialRetired](../../aspose.medical.dicom/uid/rtionmachineverificationtrialretired) | SOP Class: RT Ion Machine Verification - Trial (Retired). |
| static readonly [RTIonPlanStorage](../../aspose.medical.dicom/uid/rtionplanstorage) | SOP Class: RT Ion Plan Storage. |
| static readonly [RTPatientPositionAcquisitionInstructionStorage](../../aspose.medical.dicom/uid/rtpatientpositionacquisitioninstructionstorage) | SOP Class: RT Patient Position Acquisition Instruction Storage. |
| static readonly [RTPhysicianIntentStorage](../../aspose.medical.dicom/uid/rtphysicianintentstorage) | SOP Class: RT Physician Intent Storage. |
| static readonly [RTPlanStorage](../../aspose.medical.dicom/uid/rtplanstorage) | SOP Class: RT Plan Storage. |
| static readonly [RTRadiationRecordSetStorage](../../aspose.medical.dicom/uid/rtradiationrecordsetstorage) | SOP Class: RT Radiation Record Set Storage. |
| static readonly [RTRadiationSalvageRecordStorage](../../aspose.medical.dicom/uid/rtradiationsalvagerecordstorage) | SOP Class: RT Radiation Salvage Record Storage. |
| static readonly [RTRadiationSetDeliveryInstructionStorage](../../aspose.medical.dicom/uid/rtradiationsetdeliveryinstructionstorage) | SOP Class: RT Radiation Set Delivery Instruction Storage. |
| static readonly [RTRadiationSetStorage](../../aspose.medical.dicom/uid/rtradiationsetstorage) | SOP Class: RT Radiation Set Storage. |
| static readonly [RTSegmentAnnotationStorage](../../aspose.medical.dicom/uid/rtsegmentannotationstorage) | SOP Class: RT Segment Annotation Storage. |
| static readonly [RTStructureSetStorage](../../aspose.medical.dicom/uid/rtstructuresetstorage) | SOP Class: RT Structure Set Storage. |
| static readonly [RTTreatmentPreparationStorage](../../aspose.medical.dicom/uid/rttreatmentpreparationstorage) | SOP Class: RT Treatment Preparation Storage. |
| static readonly [RTTreatmentSummaryRecordStorage](../../aspose.medical.dicom/uid/rttreatmentsummaryrecordstorage) | SOP Class: RT Treatment Summary Record Storage. |
| static readonly [SecondaryCaptureImageStorage](../../aspose.medical.dicom/uid/secondarycaptureimagestorage) | SOP Class: Secondary Capture Image Storage. |
| static readonly [SegmentationStorage](../../aspose.medical.dicom/uid/segmentationstorage) | SOP Class: Segmentation Storage. |
| static readonly [SegmentedVolumeRenderingVolumetricPresentationStateStorage](../../aspose.medical.dicom/uid/segmentedvolumerenderingvolumetricpresentationstatestorage) | SOP Class: Segmented Volume Rendering Volumetric Presentation State Storage. |
| static readonly [SimplifiedAdultEchoSRStorage](../../aspose.medical.dicom/uid/simplifiedadultechosrstorage) | SOP Class: Simplified Adult Echo SR Storage. |
| static readonly [SleepElectroencephalogramWaveformStorage](../../aspose.medical.dicom/uid/sleepelectroencephalogramwaveformstorage) | SOP Class: Sleep Electroencephalogram Waveform Storage. |
| static readonly [SMPTEST211020UncompressedInterlacedActiveVideo](../../aspose.medical.dicom/uid/smptest211020uncompressedinterlacedactivevideo) | Transfer Syntax: SMPTE ST 2110-20 Uncompressed Interlaced Active Video. |
| static readonly [SMPTEST211020UncompressedProgressiveActiveVideo](../../aspose.medical.dicom/uid/smptest211020uncompressedprogressiveactivevideo) | Transfer Syntax: SMPTE ST 2110-20 Uncompressed Progressive Active Video. |
| static readonly [SMPTEST211030PCMDigitalAudio](../../aspose.medical.dicom/uid/smptest211030pcmdigitalaudio) | Transfer Syntax: SMPTE ST 2110-30 PCM Digital Audio. |
| static readonly [SpatialFiducialsStorage](../../aspose.medical.dicom/uid/spatialfiducialsstorage) | SOP Class: Spatial Fiducials Storage. |
| static readonly [SpatialRegistrationStorage](../../aspose.medical.dicom/uid/spatialregistrationstorage) | SOP Class: Spatial Registration Storage. |
| static readonly [SpectaclePrescriptionReportStorage](../../aspose.medical.dicom/uid/spectacleprescriptionreportstorage) | SOP Class: Spectacle Prescription Report Storage. |
| static readonly [SpringColorPaletteSOPInstance](../../aspose.medical.dicom/uid/springcolorpalettesopinstance) | Well-known SOP Instance: Spring Color Palette SOP Instance. |
| static readonly [StandaloneCurveStorageRetired](../../aspose.medical.dicom/uid/standalonecurvestorageretired) | SOP Class: Standalone Curve Storage (Retired). |
| static readonly [StandaloneModalityLUTStorageRetired](../../aspose.medical.dicom/uid/standalonemodalitylutstorageretired) | SOP Class: Standalone Modality LUT Storage (Retired). |
| static readonly [StandaloneOverlayStorageRetired](../../aspose.medical.dicom/uid/standaloneoverlaystorageretired) | SOP Class: Standalone Overlay Storage (Retired). |
| static readonly [StandalonePETCurveStorageRetired](../../aspose.medical.dicom/uid/standalonepetcurvestorageretired) | SOP Class: Standalone PET Curve Storage (Retired). |
| static readonly [StandaloneVOILUTStorageRetired](../../aspose.medical.dicom/uid/standalonevoilutstorageretired) | SOP Class: Standalone VOI LUT Storage (Retired). |
| static readonly [StereometricRelationshipStorage](../../aspose.medical.dicom/uid/stereometricrelationshipstorage) | SOP Class: Stereometric Relationship Storage. |
| static readonly [StorageCommitmentPullModelSOPClassRetired](../../aspose.medical.dicom/uid/storagecommitmentpullmodelsopclassretired) | SOP Class: Storage Commitment Pull Model SOP Class (Retired). |
| static readonly [StorageCommitmentPullModelSOPInstanceRetired](../../aspose.medical.dicom/uid/storagecommitmentpullmodelsopinstanceretired) | Well-known SOP Instance: Storage Commitment Pull Model SOP Instance (Retired). |
| static readonly [StorageCommitmentPushModelSOPClass](../../aspose.medical.dicom/uid/storagecommitmentpushmodelsopclass) | SOP Class: Storage Commitment Push Model SOP Class. |
| static readonly [StorageCommitmentPushModelSOPInstance](../../aspose.medical.dicom/uid/storagecommitmentpushmodelsopinstance) | Well-known SOP Instance: Storage Commitment Push Model SOP Instance. |
| static readonly [StorageManagementSOPInstance](../../aspose.medical.dicom/uid/storagemanagementsopinstance) | Well-known SOP Instance: Storage Management SOP Instance. |
| static readonly [StorageServiceClass](../../aspose.medical.dicom/uid/storageserviceclass) | Service Class: Storage Service Class. |
| static readonly [StoredPrintStorageSOPClassRetired](../../aspose.medical.dicom/uid/storedprintstoragesopclassretired) | SOP Class: Stored Print Storage SOP Class (Retired). |
| static readonly [StudyComponentManagementSOPClassRetired](../../aspose.medical.dicom/uid/studycomponentmanagementsopclassretired) | SOP Class: Study Component Management SOP Class (Retired). |
| static readonly [StudyRootQueryRetrieveInformationModelFIND](../../aspose.medical.dicom/uid/studyrootqueryretrieveinformationmodelfind) | SOP Class: Study Root Query/Retrieve Information Model - FIND. |
| static readonly [StudyRootQueryRetrieveInformationModelGET](../../aspose.medical.dicom/uid/studyrootqueryretrieveinformationmodelget) | SOP Class: Study Root Query/Retrieve Information Model - GET. |
| static readonly [StudyRootQueryRetrieveInformationModelMOVE](../../aspose.medical.dicom/uid/studyrootqueryretrieveinformationmodelmove) | SOP Class: Study Root Query/Retrieve Information Model - MOVE. |
| static readonly [SubjectiveRefractionMeasurementsStorage](../../aspose.medical.dicom/uid/subjectiverefractionmeasurementsstorage) | SOP Class: Subjective Refraction Measurements Storage. |
| static readonly [SubstanceAdministrationLoggingSOPClass](../../aspose.medical.dicom/uid/substanceadministrationloggingsopclass) | SOP Class: Substance Administration Logging SOP Class. |
| static readonly [SubstanceAdministrationLoggingSOPInstance](../../aspose.medical.dicom/uid/substanceadministrationloggingsopinstance) | Well-known SOP Instance: Substance Administration Logging SOP Instance. |
| static readonly [SubstanceApprovalQuerySOPClass](../../aspose.medical.dicom/uid/substanceapprovalquerysopclass) | SOP Class: Substance Approval Query SOP Class. |
| static readonly [SummerColorPaletteSOPInstance](../../aspose.medical.dicom/uid/summercolorpalettesopinstance) | Well-known SOP Instance: Summer Color Palette SOP Instance. |
| static readonly [SurfaceScanMeshStorage](../../aspose.medical.dicom/uid/surfacescanmeshstorage) | SOP Class: Surface Scan Mesh Storage. |
| static readonly [SurfaceScanPointCloudStorage](../../aspose.medical.dicom/uid/surfacescanpointcloudstorage) | SOP Class: Surface Scan Point Cloud Storage. |
| static readonly [SurfaceSegmentationStorage](../../aspose.medical.dicom/uid/surfacesegmentationstorage) | SOP Class: Surface Segmentation Storage. |
| static readonly [TextSRStorageTrialRetired](../../aspose.medical.dicom/uid/textsrstoragetrialretired) | SOP Class: Text SR Storage - Trial (Retired). |
| static readonly [ThermographyImageStorage](../../aspose.medical.dicom/uid/thermographyimagestorage) | SOP Class: Thermography Image Storage. |
| static readonly [ThermographyMultiFrameImageStorage](../../aspose.medical.dicom/uid/thermographymultiframeimagestorage) | SOP Class: Thermography Multi-frame Image Storage. |
| static readonly [TomotherapeuticRadiationRecordStorage](../../aspose.medical.dicom/uid/tomotherapeuticradiationrecordstorage) | SOP Class: Tomotherapeutic Radiation Record Storage. |
| static readonly [TomotherapeuticRadiationStorage](../../aspose.medical.dicom/uid/tomotherapeuticradiationstorage) | SOP Class: Tomotherapeutic Radiation Storage. |
| static readonly [TractographyResultsStorage](../../aspose.medical.dicom/uid/tractographyresultsstorage) | SOP Class: Tractography Results Storage. |
| static readonly [TwelveLeadECGWaveformStorage](../../aspose.medical.dicom/uid/twelveleadecgwaveformstorage) | SOP Class: 12-lead ECG Waveform Storage. |
| static readonly [UberonOntology](../../aspose.medical.dicom/uid/uberonontology) | Coding Scheme: Uberon Ontology. |
| static readonly [UID_1_2_840_10008_5_1_4_1_1_12_77Retired](../../aspose.medical.dicom/uid/uid_1_2_840_10008_5_1_4_1_1_12_77retired) | SOP Class: (Retired). |
| static readonly [UID_1_2_840_10008_5_1_4_1_1_40Retired](../../aspose.medical.dicom/uid/uid_1_2_840_10008_5_1_4_1_1_40retired) | SOP Class: (Retired). |
| static readonly [UltrasoundImageStorage](../../aspose.medical.dicom/uid/ultrasoundimagestorage) | SOP Class: Ultrasound Image Storage. |
| static readonly [UltrasoundImageStorageRetired](../../aspose.medical.dicom/uid/ultrasoundimagestorageretired) | SOP Class: Ultrasound Image Storage (Retired). |
| static readonly [UltrasoundMultiFrameImageStorage](../../aspose.medical.dicom/uid/ultrasoundmultiframeimagestorage) | SOP Class: Ultrasound Multi-frame Image Storage. |
| static readonly [UltrasoundMultiFrameImageStorageRetired](../../aspose.medical.dicom/uid/ultrasoundmultiframeimagestorageretired) | SOP Class: Ultrasound Multi-frame Image Storage (Retired). |
| static readonly [UnifiedNumberingSystemUNSForMetalsAndAlloys](../../aspose.medical.dicom/uid/unifiednumberingsystemunsformetalsandalloys) | Coding Scheme: Unified numbering system (UNS) for metals and alloys. |
| static readonly [UnifiedProcedureStepEventSOPClass](../../aspose.medical.dicom/uid/unifiedprocedurestepeventsopclass) | SOP Class: Unified Procedure Step - Event SOP Class. |
| static readonly [UnifiedProcedureStepEventSOPClassTrialRetired](../../aspose.medical.dicom/uid/unifiedprocedurestepeventsopclasstrialretired) | SOP Class: Unified Procedure Step - Event SOP Class - Trial (Retired). |
| static readonly [UnifiedProcedureStepPullSOPClass](../../aspose.medical.dicom/uid/unifiedproceduresteppullsopclass) | SOP Class: Unified Procedure Step - Pull SOP Class. |
| static readonly [UnifiedProcedureStepPullSOPClassTrialRetired](../../aspose.medical.dicom/uid/unifiedproceduresteppullsopclasstrialretired) | SOP Class: Unified Procedure Step - Pull SOP Class - Trial (Retired). |
| static readonly [UnifiedProcedureStepPushSOPClass](../../aspose.medical.dicom/uid/unifiedproceduresteppushsopclass) | SOP Class: Unified Procedure Step - Push SOP Class. |
| static readonly [UnifiedProcedureStepPushSOPClassTrialRetired](../../aspose.medical.dicom/uid/unifiedproceduresteppushsopclasstrialretired) | SOP Class: Unified Procedure Step - Push SOP Class - Trial (Retired). |
| static readonly [UnifiedProcedureStepQuerySOPClass](../../aspose.medical.dicom/uid/unifiedprocedurestepquerysopclass) | SOP Class: Unified Procedure Step - Query SOP Class. |
| static readonly [UnifiedProcedureStepWatchSOPClass](../../aspose.medical.dicom/uid/unifiedprocedurestepwatchsopclass) | SOP Class: Unified Procedure Step - Watch SOP Class. |
| static readonly [UnifiedProcedureStepWatchSOPClassTrialRetired](../../aspose.medical.dicom/uid/unifiedprocedurestepwatchsopclasstrialretired) | SOP Class: Unified Procedure Step - Watch SOP Class - Trial (Retired). |
| static readonly [UnifiedWorklistAndProcedureStepServiceClass](../../aspose.medical.dicom/uid/unifiedworklistandprocedurestepserviceclass) | Service Class: Unified Worklist and Procedure Step Service Class. |
| static readonly [UnifiedWorklistAndProcedureStepServiceClassTrialRetired](../../aspose.medical.dicom/uid/unifiedworklistandprocedurestepserviceclasstrialretired) | Service Class: Unified Worklist and Procedure Step Service Class - Trial (Retired). |
| static readonly [UniversalCoordinatedTime](../../aspose.medical.dicom/uid/universalcoordinatedtime) | Synchronization Frame of Reference: Universal Coordinated Time. |
| static readonly [UPSFilteredGlobalSubscriptionSOPInstance](../../aspose.medical.dicom/uid/upsfilteredglobalsubscriptionsopinstance) | Well-known SOP Instance: UPS Filtered Global Subscription SOP Instance. |
| static readonly [UPSGlobalSubscriptionSOPInstance](../../aspose.medical.dicom/uid/upsglobalsubscriptionsopinstance) | Well-known SOP Instance: UPS Global Subscription SOP Instance. |
| static readonly [VariableModalityLUTSoftcopyPresentationStateStorage](../../aspose.medical.dicom/uid/variablemodalitylutsoftcopypresentationstatestorage) | SOP Class: Variable Modality LUT Softcopy Presentation State Storage. |
| static readonly [Verification](../../aspose.medical.dicom/uid/verification) | SOP Class: Verification SOP Class. |
| static readonly [VideoEndoscopicImageRealTimeCommunication](../../aspose.medical.dicom/uid/videoendoscopicimagerealtimecommunication) | SOP Class: Video Endoscopic Image Real-Time Communication. |
| static readonly [VideoEndoscopicImageStorage](../../aspose.medical.dicom/uid/videoendoscopicimagestorage) | SOP Class: Video Endoscopic Image Storage. |
| static readonly [VideoMicroscopicImageStorage](../../aspose.medical.dicom/uid/videomicroscopicimagestorage) | SOP Class: Video Microscopic Image Storage. |
| static readonly [VideoPhotographicImageRealTimeCommunication](../../aspose.medical.dicom/uid/videophotographicimagerealtimecommunication) | SOP Class: Video Photographic Image Real-Time Communication. |
| static readonly [VideoPhotographicImageStorage](../../aspose.medical.dicom/uid/videophotographicimagestorage) | SOP Class: Video Photographic Image Storage. |
| static readonly [VisualAcuityMeasurementsStorage](../../aspose.medical.dicom/uid/visualacuitymeasurementsstorage) | SOP Class: Visual Acuity Measurements Storage. |
| static readonly [VLEndoscopicImageStorage](../../aspose.medical.dicom/uid/vlendoscopicimagestorage) | SOP Class: VL Endoscopic Image Storage. |
| static readonly [VLImageStorageTrialRetired](../../aspose.medical.dicom/uid/vlimagestoragetrialretired) | SOP Class: VL Image Storage - Trial (Retired). |
| static readonly [VLMicroscopicImageStorage](../../aspose.medical.dicom/uid/vlmicroscopicimagestorage) | SOP Class: VL Microscopic Image Storage. |
| static readonly [VLMultiFrameImageStorageTrialRetired](../../aspose.medical.dicom/uid/vlmultiframeimagestoragetrialretired) | SOP Class: VL Multi-frame Image Storage - Trial (Retired). |
| static readonly [VLPhotographicImageStorage](../../aspose.medical.dicom/uid/vlphotographicimagestorage) | SOP Class: VL Photographic Image Storage. |
| static readonly [VLSlideCoordinatesMicroscopicImageStorage](../../aspose.medical.dicom/uid/vlslidecoordinatesmicroscopicimagestorage) | SOP Class: VL Slide-Coordinates Microscopic Image Storage. |
| static readonly [VLWholeSlideMicroscopyImageStorage](../../aspose.medical.dicom/uid/vlwholeslidemicroscopyimagestorage) | SOP Class: VL Whole Slide Microscopy Image Storage. |
| static readonly [VOILUTBoxSOPClass](../../aspose.medical.dicom/uid/voilutboxsopclass) | SOP Class: VOI LUT Box SOP Class. |
| static readonly [VolumeRenderingVolumetricPresentationStateStorage](../../aspose.medical.dicom/uid/volumerenderingvolumetricpresentationstatestorage) | SOP Class: Volume Rendering Volumetric Presentation State Storage. |
| static readonly [WaveformAcquisitionPresentationStateStorage](../../aspose.medical.dicom/uid/waveformacquisitionpresentationstatestorage) | SOP Class: Waveform Acquisition Presentation State Storage. |
| static readonly [WaveformAnnotationSRStorage](../../aspose.medical.dicom/uid/waveformannotationsrstorage) | SOP Class: Waveform Annotation SR Storage. |
| static readonly [WaveformPresentationStateStorage](../../aspose.medical.dicom/uid/waveformpresentationstatestorage) | SOP Class: Waveform Presentation State Storage. |
| static readonly [WaveformStorageTrialRetired](../../aspose.medical.dicom/uid/waveformstoragetrialretired) | SOP Class: Waveform Storage - Trial (Retired). |
| static readonly [WideFieldOphthalmicPhotography3DCoordinatesImageStorage](../../aspose.medical.dicom/uid/widefieldophthalmicphotography3dcoordinatesimagestorage) | SOP Class: Wide Field Ophthalmic Photography 3D Coordinates Image Storage. |
| static readonly [WideFieldOphthalmicPhotographyStereographicProjectionImageStorage](../../aspose.medical.dicom/uid/widefieldophthalmicphotographystereographicprojectionimagestorage) | SOP Class: Wide Field Ophthalmic Photography Stereographic Projection Image Storage. |
| static readonly [WinterColorPaletteSOPInstance](../../aspose.medical.dicom/uid/wintercolorpalettesopinstance) | Well-known SOP Instance: Winter Color Palette SOP Instance. |
| static readonly [XADefinedProcedureProtocolStorage](../../aspose.medical.dicom/uid/xadefinedprocedureprotocolstorage) | SOP Class: XA Defined Procedure Protocol Storage. |
| static readonly [XAPerformedProcedureProtocolStorage](../../aspose.medical.dicom/uid/xaperformedprocedureprotocolstorage) | SOP Class: XA Performed Procedure Protocol Storage. |
| static readonly [XAXRFGrayscaleSoftcopyPresentationStateStorage](../../aspose.medical.dicom/uid/xaxrfgrayscalesoftcopypresentationstatestorage) | SOP Class: XA/XRF Grayscale Softcopy Presentation State Storage. |
| static readonly [XmlEncodingRetired](../../aspose.medical.dicom/uid/xmlencodingretired) | Transfer Syntax: XML Encoding (Retired). |
| static readonly [XRay3DAngiographicImageStorage](../../aspose.medical.dicom/uid/xray3dangiographicimagestorage) | SOP Class: X-Ray 3D Angiographic Image Storage. |
| static readonly [XRay3DCraniofacialImageStorage](../../aspose.medical.dicom/uid/xray3dcraniofacialimagestorage) | SOP Class: X-Ray 3D Craniofacial Image Storage. |
| static readonly [XRayAngiographicBiPlaneImageStorageRetired](../../aspose.medical.dicom/uid/xrayangiographicbiplaneimagestorageretired) | SOP Class: X-Ray Angiographic Bi-Plane Image Storage (Retired). |
| static readonly [XRayAngiographicImageStorage](../../aspose.medical.dicom/uid/xrayangiographicimagestorage) | SOP Class: X-Ray Angiographic Image Storage. |
| static readonly [XRayRadiationDoseSRStorage](../../aspose.medical.dicom/uid/xrayradiationdosesrstorage) | SOP Class: X-Ray Radiation Dose SR Storage. |
| static readonly [XRayRadiofluoroscopicImageStorage](../../aspose.medical.dicom/uid/xrayradiofluoroscopicimagestorage) | SOP Class: X-Ray Radiofluoroscopic Image Storage. |

### See Also

* namespace [Aspose.Medical.Dicom](../../aspose.medical.dicom)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
