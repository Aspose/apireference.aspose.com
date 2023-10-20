---
title: Class ImageCodecInfo
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.ImageCodecInfo class. The ImageCodecInfo class provides the necessary storage members and methods to retrieve all pertinent information about the installed image encoders and decoders called codecs. Not inheritable
type: docs
weight: 740
url: /net/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class

The ImageCodecInfo class provides the necessary storage members and methods to retrieve all pertinent information about the installed image encoders and decoders (called codecs). Not inheritable.

```csharp
public sealed class ImageCodecInfo
```

## Properties

| Name | Description |
| --- | --- |
| [Clsid](../../system.drawing.imaging/imagecodecinfo/clsid/) { get; set; } | Gets or sets a Guid structure that contains a GUID that identifies a specific codec. |
| [CodecName](../../system.drawing.imaging/imagecodecinfo/codecname/) { get; set; } | Gets or sets a string that contains the name of the codec. |
| [FilenameExtension](../../system.drawing.imaging/imagecodecinfo/filenameextension/) { get; set; } | Gets or sets string that contains the file name extension(s) used in the codec. The extensions are separated by semicolons. |
| [FormatDescription](../../system.drawing.imaging/imagecodecinfo/formatdescription/) { get; set; } | Gets or sets a string that describes the codec's file format. |
| [FormatID](../../system.drawing.imaging/imagecodecinfo/formatid/) { get; set; } | Gets or sets a Guid structure that contains a GUID that identifies the codec's format. |
| [MimeType](../../system.drawing.imaging/imagecodecinfo/mimetype/) { get; set; } | Gets or sets a string that contains the codec's Multipurpose Internet Mail Extensions (MIME) type. |
| [SignatureMasks](../../system.drawing.imaging/imagecodecinfo/signaturemasks/) { get; set; } | Gets or sets a two dimensional array of bytes that can be used as a filter. |
| [SignaturePatterns](../../system.drawing.imaging/imagecodecinfo/signaturepatterns/) { get; set; } | Gets or sets a two dimensional array of bytes that represents the signature of the codec. |
| [Version](../../system.drawing.imaging/imagecodecinfo/version/) { get; set; } | Gets or sets the version number of the codec. |

## Methods

| Name | Description |
| --- | --- |
| static [GetImageDecoders](../../system.drawing.imaging/imagecodecinfo/getimagedecoders/)() | Returns an array of ImageCodecInfo objects that contain information about the image decoders built into GDI+. |
| static [GetImageEncoders](../../system.drawing.imaging/imagecodecinfo/getimageencoders/)() | Returns an array of ImageCodecInfo objects that contain information about the image encoders built into GDI+. |

### See Also

* namespace [System.Drawing.Imaging](../../system.drawing.imaging/)
* assembly [Aspose.Drawing](../../)


