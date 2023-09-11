---
title: Class ImageCodecInfo
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Imaging.ImageCodecInfo class. The ImageCodecInfo class provides the necessary storage members and methods to retrieve all pertinent information about the installed image encoders and decoders called codecs. Not inheritable
type: docs
weight: 720
url: /net/aspose.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class

The ImageCodecInfo class provides the necessary storage members and methods to retrieve all pertinent information about the installed image encoders and decoders (called codecs). Not inheritable.

```csharp
public sealed class ImageCodecInfo
```

## Properties

| Name | Description |
| --- | --- |
| [Clsid](../../aspose.drawing.imaging/imagecodecinfo/clsid/) { get; set; } | Gets or sets a Guid structure that contains a GUID that identifies a specific codec. |
| [CodecName](../../aspose.drawing.imaging/imagecodecinfo/codecname/) { get; set; } | Gets or sets a string that contains the name of the codec. |
| [FilenameExtension](../../aspose.drawing.imaging/imagecodecinfo/filenameextension/) { get; set; } | Gets or sets string that contains the file name extension(s) used in the codec. The extensions are separated by semicolons. |
| [FormatDescription](../../aspose.drawing.imaging/imagecodecinfo/formatdescription/) { get; set; } | Gets or sets a string that describes the codec's file format. |
| [FormatID](../../aspose.drawing.imaging/imagecodecinfo/formatid/) { get; set; } | Gets or sets a Guid structure that contains a GUID that identifies the codec's format. |
| [MimeType](../../aspose.drawing.imaging/imagecodecinfo/mimetype/) { get; set; } | Gets or sets a string that contains the codec's Multipurpose Internet Mail Extensions (MIME) type. |
| [SignatureMasks](../../aspose.drawing.imaging/imagecodecinfo/signaturemasks/) { get; set; } | Gets or sets a two dimensional array of bytes that can be used as a filter. |
| [SignaturePatterns](../../aspose.drawing.imaging/imagecodecinfo/signaturepatterns/) { get; set; } | Gets or sets a two dimensional array of bytes that represents the signature of the codec. |
| [Version](../../aspose.drawing.imaging/imagecodecinfo/version/) { get; set; } | Gets or sets the version number of the codec. |

## Methods

| Name | Description |
| --- | --- |
| static [GetImageDecoders](../../aspose.drawing.imaging/imagecodecinfo/getimagedecoders/)() | Returns an array of ImageCodecInfo objects that contain information about the image decoders built into GDI+. |
| static [GetImageEncoders](../../aspose.drawing.imaging/imagecodecinfo/getimageencoders/)() | Returns an array of ImageCodecInfo objects that contain information about the image encoders built into GDI+. |

### See Also

* namespace [Aspose.Drawing.Imaging](../../aspose.drawing.imaging/)
* assembly [Aspose.Drawing.Common](../../)


