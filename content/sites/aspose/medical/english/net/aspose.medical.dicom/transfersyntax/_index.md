---
title: TransferSyntax
second_title: Aspose.Medical for .NET API Reference
description: A DICOM file Transfer Syntax. https//dicom.nema.org/medical/dicom/current/output/chtml/part05/chapter_A.htmlhttps//dicom.nema.org/medical/dicom/current/output/chtml/part05/chapter_A.html.
type: docs
weight: 1150
url: /net/aspose.medical.dicom/transfersyntax/
---

## TransferSyntax class

A DICOM file Transfer Syntax. [https://dicom.nema.org/medical/dicom/current/output/chtml/part05/chapter_A.html](https://dicom.nema.org/medical/dicom/current/output/chtml/part05/chapter_A.html).

```csharp
public sealed class TransferSyntax : ISpanParsable<TransferSyntax>
```

## Properties

| Name | Description |
| --- | --- |
| [IsDeflate](../../aspose.medical.dicom/transfersyntax/isdeflate) { get; set; } | Indicates whether the transfer syntax represents deflatable objects. Read-only Boolean. |
| [IsEncapsulated](../../aspose.medical.dicom/transfersyntax/isencapsulated) { get; set; } | Indicated whether the transfer syntax data representation is encapsulated. Read-only Boolean. |
| [IsExplicitVr](../../aspose.medical.dicom/transfersyntax/isexplicitvr) { get; set; } | Specifies that the Value Representation of the transfer syntax is explicit. Read-only Boolean. |
| [IsLittleEndian](../../aspose.medical.dicom/transfersyntax/islittleendian) { get; set; } | Specifies that the transfer syntax uses a Little Endian notation. Read-only Boolean. |
| [IsLossy](../../aspose.medical.dicom/transfersyntax/islossy) { get; set; } | Indicates whether the transfer syntax data representation is lossy. Read-only Boolean. |
| [IsRetired](../../aspose.medical.dicom/transfersyntax/isretired) { get; set; } | Specifies that the transfer syntax is declared retired. Read-only Boolean. |
| [LossyCompressionMethod](../../aspose.medical.dicom/transfersyntax/lossycompressionmethod) { get; set; } | Gets the lossy compression method identifier. Read-only [`LossyCompressionMethods`](../lossycompressionmethods). |
| [SwapPixelData](../../aspose.medical.dicom/transfersyntax/swappixeldata) { get; set; } | Indicates whether the pixel data requires swapping. Read-only Boolean. |
| [Uid](../../aspose.medical.dicom/transfersyntax/uid) { get; set; } | The unique identifier of the transfer syntax. Read-only [`Uid`](./uid). |

## Methods

| Name | Description |
| --- | --- |
| static [GetByUid](../../aspose.medical.dicom/transfersyntax/getbyuid)(Uid) |  |
| static [Parse](../../aspose.medical.dicom/transfersyntax/parse#parse)(ReadOnlySpan&lt;char&gt;, IFormatProvider?) |  |
| static [Parse](../../aspose.medical.dicom/transfersyntax/parse#parse_1)(string, IFormatProvider?) |  |
| override [ToString](../../aspose.medical.dicom/transfersyntax/tostring)() |  |
| static [Register](../../aspose.medical.dicom/transfersyntax/register)(Uid, bool, bool) | Registers transfer syntax. |
| static [TryParse](../../aspose.medical.dicom/transfersyntax/tryparse#tryparse)(ReadOnlySpan&lt;char&gt;, IFormatProvider, out TransferSyntax) |  |
| static [TryParse](../../aspose.medical.dicom/transfersyntax/tryparse#tryparse_1)(string, IFormatProvider, out TransferSyntax) |  |

## Fields

| Name | Description |
| --- | --- |
| static readonly [DeflatedExplicitVrLittleEndian](../../aspose.medical.dicom/transfersyntax/deflatedexplicitvrlittleendian) | Deflated Explicit VR Little Endian (1.2.840.10008.1.2.1.99). |
| static readonly [ExplicitVrBigEndian](../../aspose.medical.dicom/transfersyntax/explicitvrbigendian) | Explicit VR Big Endian (1.2.840.10008.1.2.2). |
| static readonly [ExplicitVrLittleEndian](../../aspose.medical.dicom/transfersyntax/explicitvrlittleendian) | Explicit VR Little Endian (1.2.840.10008.1.2.1). |
| static readonly [FragmentableMpeg2MainProfile](../../aspose.medical.dicom/transfersyntax/fragmentablempeg2mainprofile) | Fragmentable MPEG2 Main Profile @ Main Level (1.2.840.10008.1.2.4.100.1). |
| static readonly [FragmentableMpeg2MainProfileHighLevel](../../aspose.medical.dicom/transfersyntax/fragmentablempeg2mainprofilehighlevel) | Fragmentable MPEG2 Main Profile / High Level (1.2.840.10008.1.2.4.101.1). |
| static readonly [FragmentableMpeg4Avch264BdCompatibleHighProfileLevel41](../../aspose.medical.dicom/transfersyntax/fragmentablempeg4avch264bdcompatiblehighprofilelevel41) | Fragmentable MPEG-4 AVC/H.264 BD-compatible High Profile / Level 4.1 (1.2.840.10008.1.2.4.103.1). |
| static readonly [FragmentableMpeg4Avch264HighProfileLevel41](../../aspose.medical.dicom/transfersyntax/fragmentablempeg4avch264highprofilelevel41) | Fragmentable MPEG-4 AVC/H.264 High Profile / Level 4.1 (1.2.840.10008.1.2.4.102.1). |
| static readonly [FragmentableMpeg4Avch264HighProfileLevel42For2DVideo](../../aspose.medical.dicom/transfersyntax/fragmentablempeg4avch264highprofilelevel42for2dvideo) | Fragmentable MPEG-4 AVC/H.264 High Profile / Level 4.2 For 2D Video (1.2.840.10008.1.2.4.104.1). |
| static readonly [FragmentableMpeg4Avch264HighProfileLevel42For3DVideo](../../aspose.medical.dicom/transfersyntax/fragmentablempeg4avch264highprofilelevel42for3dvideo) | Fragmentable MPEG-4 AVC/H.264 High Profile / Level 4.2 For 3D Video (1.2.840.10008.1.2.4.105.1). |
| static readonly [FragmentableMpeg4Avch264StereoHighProfileLevel42](../../aspose.medical.dicom/transfersyntax/fragmentablempeg4avch264stereohighprofilelevel42) | Fragmentable MPEG-4 AVC/H.264 Stereo High Profile / Level 4.2 (1.2.840.10008.1.2.4.106.1). |
| static readonly [GePrivateImplicitVrBigEndian](../../aspose.medical.dicom/transfersyntax/geprivateimplicitvrbigendian) | GE Private Implicit VR Big Endian (1.2.840.113619.5.2). |
| static readonly [Hevch265Main10ProfileLevel51](../../aspose.medical.dicom/transfersyntax/hevch265main10profilelevel51) | HEVC/H.265 Main 10 Profile / Level 5.1 (1.2.840.10008.1.2.4.108). |
| static readonly [Hevch265MainProfileLevel51](../../aspose.medical.dicom/transfersyntax/hevch265mainprofilelevel51) | HEVC/H.265 Main Profile / Level 5.1 (1.2.840.10008.1.2.4.107). |
| static readonly [HTJ2K](../../aspose.medical.dicom/transfersyntax/htj2k) | High-Throughput JPEG 2000 Image Compression (1.2.840.10008.1.2.4.203). |
| static readonly [HTJ2KLossless](../../aspose.medical.dicom/transfersyntax/htj2klossless) | High-Throughput JPEG 2000 Image Compression (Lossless Only) (1.2.840.10008.1.2.4.201). |
| static readonly [HTJ2KLosslessRPCL](../../aspose.medical.dicom/transfersyntax/htj2klosslessrpcl) | High-Throughput JPEG 2000 with RPCL Options Image Compression (Lossless Only) (1.2.840.10008.1.2.4.202). |
| static readonly [ImplicitVrLittleEndian](../../aspose.medical.dicom/transfersyntax/implicitvrlittleendian) | Implicit VR Little Endian (1.2.840.10008.1.2). |
| static readonly [Jpeg2000Lossless](../../aspose.medical.dicom/transfersyntax/jpeg2000lossless) | JPEG 2000 Lossless Image Compression (1.2.840.10008.1.2.4.90). |
| static readonly [Jpeg2000Lossy](../../aspose.medical.dicom/transfersyntax/jpeg2000lossy) | JPEG 2000 Lossy Image Compression (1.2.840.10008.1.2.4.91). |
| static readonly [Jpeg2000Part2MultiComponent](../../aspose.medical.dicom/transfersyntax/jpeg2000part2multicomponent) | JPEG 2000 Part 2 Multi-component Image Compression (1.2.840.10008.1.2.4.93). |
| static readonly [Jpeg2000Part2MultiComponentLosslessOnly](../../aspose.medical.dicom/transfersyntax/jpeg2000part2multicomponentlosslessonly) | JPEG 2000 Part 2 Multi-component Image Compression (Lossless Only) (1.2.840.10008.1.2.4.92). |
| static readonly [JpegExtended24](../../aspose.medical.dicom/transfersyntax/jpegextended24) | JPEG Extended (Process 2 &amp; 4) (1.2.840.10008.1.2.4.51). |
| static readonly [JpegExtended35Retired](../../aspose.medical.dicom/transfersyntax/jpegextended35retired) | JPEG Extended (Process 3 &amp; 5) (Retired) (1.2.840.10008.1.2.4.52). |
| static readonly [JpegLsLossless](../../aspose.medical.dicom/transfersyntax/jpeglslossless) | JPEG-LS Lossless Image Compression (1.2.840.10008.1.2.4.80). |
| static readonly [JpegLsNearLossless](../../aspose.medical.dicom/transfersyntax/jpeglsnearlossless) | JPEG-LS Lossy (Near-Lossless) Image Compression (1.2.840.10008.1.2.4.81). |
| static readonly [JpegProcess1](../../aspose.medical.dicom/transfersyntax/jpegprocess1) | JPEG Baseline (Process 1) (1.2.840.10008.1.2.4.50). |
| static readonly [JpegProcess1012Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess1012retired) | JPEG Full Progression, Non-Hierarchical (Process 10 &amp; 12) (Retired) (1.2.840.10008.1.2.4.55). |
| static readonly [JpegProcess1113Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess1113retired) | JPEG Full Progression, Non-Hierarchical (Process 11 &amp; 13) (Retired) (1.2.840.10008.1.2.4.56). |
| static readonly [JpegProcess14](../../aspose.medical.dicom/transfersyntax/jpegprocess14) | JPEG Lossless, Non-Hierarchical (Process 14) (1.2.840.10008.1.2.4.57). |
| static readonly [JpegProcess14Sv1](../../aspose.medical.dicom/transfersyntax/jpegprocess14sv1) | JPEG Lossless, Non-Hierarchical, First-Order Prediction (Process 14 [Selection Value 1]) (1.2.840.10008.1.2.4.70). |
| static readonly [JpegProcess15Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess15retired) | JPEG Lossless, Non-Hierarchical (Process 15) (Retired) (1.2.840.10008.1.2.4.58). |
| static readonly [JpegProcess1618Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess1618retired) | JPEG Extended, Hierarchical (Process 16 &amp; 18) (Retired) (1.2.840.10008.1.2.4.59). |
| static readonly [JpegProcess1719Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess1719retired) | JPEG Extended, Hierarchical (Process 17 &amp; 19) (Retired) (1.2.840.10008.1.2.4.60). |
| static readonly [JpegProcess2022Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess2022retired) | JPEG Spectral Selection, Hierarchical (Process 20 &amp; 22) (Retired) (1.2.840.10008.1.2.4.61). |
| static readonly [JpegProcess2123Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess2123retired) | JPEG Spectral Selection, Hierarchical (Process 21 &amp; 23) (Retired) (1.2.840.10008.1.2.4.62). |
| static readonly [JpegProcess2426Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess2426retired) | JPEG Full Progression, Hierarchical (Process 24 &amp; 26) (Retired) (1.2.840.10008.1.2.4.63). |
| static readonly [JpegProcess2527Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess2527retired) | JPEG Full Progression, Hierarchical (Process 25 &amp; 27) (Retired) (1.2.840.10008.1.2.4.64). |
| static readonly [JpegProcess28Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess28retired) | JPEG Lossless, Hierarchical (Process 28) (Retired) (1.2.840.10008.1.2.4.65). |
| static readonly [JpegProcess29Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess29retired) | JPEG Lossless, Hierarchical (Process 29) (Retired) (1.2.840.10008.1.2.4.66). |
| static readonly [JpegProcess68Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess68retired) | JPEG Spectral Selection, Non-Hierarchical (Process 6 &amp; 8) (Retired) (1.2.840.10008.1.2.4.53). |
| static readonly [JpegProcess79Retired](../../aspose.medical.dicom/transfersyntax/jpegprocess79retired) | JPEG Spectral Selection, Non-Hierarchical (Process 7 &amp; 9) (Retired) (1.2.840.10008.1.2.4.54). |
| static readonly [JpegXL](../../aspose.medical.dicom/transfersyntax/jpegxl) | JPEG XL (1.2.840.10008.1.2.4.112). |
| static readonly [JpegXLJpegRecompression](../../aspose.medical.dicom/transfersyntax/jpegxljpegrecompression) | JPEG XL JPEG Recompression (1.2.840.10008.1.2.4.111). |
| static readonly [JpegXLLossless](../../aspose.medical.dicom/transfersyntax/jpegxllossless) | JPEG XL Lossless (1.2.840.10008.1.2.4.110). |
| static readonly [JpipReferenced](../../aspose.medical.dicom/transfersyntax/jpipreferenced) | JPIP Referenced (1.2.840.10008.1.2.4.94). |
| static readonly [JpipReferencedDeflate](../../aspose.medical.dicom/transfersyntax/jpipreferenceddeflate) | JPIP Referenced Deflate (1.2.840.10008.1.2.4.95). |
| static readonly [Mpeg2MainProfile](../../aspose.medical.dicom/transfersyntax/mpeg2mainprofile) | MPEG2 Main Profile @ Main Level (1.2.840.10008.1.2.4.100). |
| static readonly [Mpeg2MainProfileHighLevel](../../aspose.medical.dicom/transfersyntax/mpeg2mainprofilehighlevel) | MPEG2 Main Profile / High Level (1.2.840.10008.1.2.4.101). |
| static readonly [Mpeg4Avch264BdCompatibleHighProfileLevel41](../../aspose.medical.dicom/transfersyntax/mpeg4avch264bdcompatiblehighprofilelevel41) | MPEG-4 AVC/H.264 BD-compatible High Profile / Level 4.1 (1.2.840.10008.1.2.4.103). |
| static readonly [Mpeg4Avch264HighProfileLevel41](../../aspose.medical.dicom/transfersyntax/mpeg4avch264highprofilelevel41) | MPEG-4 AVC/H.264 High Profile / Level 4.1 (1.2.840.10008.1.2.4.102). |
| static readonly [Mpeg4Avch264HighProfileLevel42For2DVideo](../../aspose.medical.dicom/transfersyntax/mpeg4avch264highprofilelevel42for2dvideo) | MPEG-4 AVC/H.264 High Profile / Level 4.2 For 2D Video (1.2.840.10008.1.2.4.104). |
| static readonly [Mpeg4Avch264HighProfileLevel42For3DVideo](../../aspose.medical.dicom/transfersyntax/mpeg4avch264highprofilelevel42for3dvideo) | MPEG-4 AVC/H.264 High Profile / Level 4.2 For 3D Video (1.2.840.10008.1.2.4.105). |
| static readonly [Mpeg4Avch264StereoHighProfileLevel42](../../aspose.medical.dicom/transfersyntax/mpeg4avch264stereohighprofilelevel42) | MPEG-4 AVC/H.264 Stereo High Profile / Level 4.2 (1.2.840.10008.1.2.4.106). |
| static readonly [Papyrus3ImplicitVrLittleEndianRetired](../../aspose.medical.dicom/transfersyntax/papyrus3implicitvrlittleendianretired) | Papyrus 3 Implicit VR Little Endian (Retired) (1.2.840.10008.1.20). |
| static readonly [Rfc2557MimeEncapsulation](../../aspose.medical.dicom/transfersyntax/rfc2557mimeencapsulation) | RFC 2557 MIME encapsulation (1.2.840.10008.1.2.6.1). |
| static readonly [RleLossless](../../aspose.medical.dicom/transfersyntax/rlelossless) | RLE Lossless (1.2.840.10008.1.2.5). |
| static readonly [XmlEncoding](../../aspose.medical.dicom/transfersyntax/xmlencoding) | XML Encoding (1.2.840.10008.1.2.6.2). |

### See Also

* namespace [Aspose.Medical.Dicom](../../aspose.medical.dicom)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
