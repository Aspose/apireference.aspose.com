---
title: Class ThumbnailResource
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Psd.Resources.ThumbnailResource class. The thumbnail resource block
type: docs
weight: 33760
url: /net/aspose.cad.fileformats.psd.resources/thumbnailresource/
---
## ThumbnailResource class

The thumbnail resource block.

```csharp
public class ThumbnailResource : ResourceBlock
```

## Constructors

| Name | Description |
| --- | --- |
| [ThumbnailResource](thumbnailresource/)() | Initializes a new instance of the `ThumbnailResource` class. |

## Properties

| Name | Description |
| --- | --- |
| [BitsPixel](../../aspose.cad.fileformats.psd.resources/thumbnailresource/bitspixel/) { get; set; } | Gets or sets the bits pixel. |
| override [DataSize](../../aspose.cad.fileformats.psd.resources/thumbnailresource/datasize/) { get; } | Gets the resource data size in bytes. |
| [Height](../../aspose.cad.fileformats.psd.resources/thumbnailresource/height/) { get; set; } | Gets or sets the height of thumbnail in pixels. |
| [ID](../../aspose.cad.fileformats.psd/resourceblock/id/) { get; set; } | Gets or sets the unique identifier for the resource. |
| [JpegOptions](../../aspose.cad.fileformats.psd.resources/thumbnailresource/jpegoptions/) { get; set; } | Gets or sets the JPEG options. Suitable when thumbnail resource is saved into JPEG file format only. This option has no effect when RAW format is defined. |
| override [MinimalVersion](../../aspose.cad.fileformats.psd.resources/thumbnailresource/minimalversion/) { get; } | Gets the minimal required psd version. |
| [Name](../../aspose.cad.fileformats.psd/resourceblock/name/) { get; set; } | Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0). |
| [PlanesCount](../../aspose.cad.fileformats.psd.resources/thumbnailresource/planescount/) { get; set; } | Gets or sets the planes count. |
| [Signature](../../aspose.cad.fileformats.psd/resourceblock/signature/) { get; } | Gets the resource signature. Should be always '8BIM'. |
| [Size](../../aspose.cad.fileformats.psd/resourceblock/size/) { get; } | Gets the resource block size in bytes including its data. |
| [SizeAfterCompression](../../aspose.cad.fileformats.psd.resources/thumbnailresource/sizeaftercompression/) { get; } | Gets or sets the size after compression. Used for consistency check. |
| [ThumbnailArgb32Data](../../aspose.cad.fileformats.psd.resources/thumbnailresource/thumbnailargb32data/) { get; set; } | Gets or sets the 32-bit ARGB thumbnail data. |
| [ThumbnailData](../../aspose.cad.fileformats.psd.resources/thumbnailresource/thumbnaildata/) { get; set; } | Gets or sets the thumbnail data. |
| [TotalSize](../../aspose.cad.fileformats.psd.resources/thumbnailresource/totalsize/) { get; } | Gets the total data size. |
| [Width](../../aspose.cad.fileformats.psd.resources/thumbnailresource/width/) { get; set; } | Gets or sets the width of thumbnail in pixels. |
| [WidthBytes](../../aspose.cad.fileformats.psd.resources/thumbnailresource/widthbytes/) { get; } | Gets the row width in bytes. |

## Methods

| Name | Description |
| --- | --- |
| [Save](../../aspose.cad.fileformats.psd/resourceblock/save/)(StreamContainer) | Saves the resource block to the specified stream. |
| override [ValidateValues](../../aspose.cad.fileformats.psd.resources/thumbnailresource/validatevalues/)() | Validates the resource values. |

### See Also

* class [ResourceBlock](../../aspose.cad.fileformats.psd/resourceblock/)
* namespace [Aspose.CAD.FileFormats.Psd.Resources](../../aspose.cad.fileformats.psd.resources/)
* assembly [Aspose.CAD](../../)


