---
title: Class ColorHalftoneInformationResource
second_title: Aspose.PSD for .NET API Reference
description: Aspose.PSD.FileFormats.Psd.Resources.ColorHalftoneInformationResource class. Halftoning resource
type: docs
weight: 4060
url: /net/aspose.psd.fileformats.psd.resources/colorhalftoneinformationresource/
---
{{< psd/tize >}}
## ColorHalftoneInformationResource class

Halftoning resource

```csharp
public sealed class ColorHalftoneInformationResource : ResourceBlock
```

## Constructors

| Name | Description |
| --- | --- |
| [ColorHalftoneInformationResource](colorhalftoneinformationresource/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| override [DataSize](../../aspose.psd.fileformats.psd.resources/colorhalftoneinformationresource/datasize/) { get; } | Gets the resource data size in bytes. |
| [HalftoneData](../../aspose.psd.fileformats.psd.resources/colorhalftoneinformationresource/halftonedata/) { get; set; } | Gets or sets the halftone data. |
| [ID](../../aspose.psd.fileformats.psd/resourceblock/id/) { get; set; } | Gets or sets the unique identifier for the resource. |
| override [MinimalVersion](../../aspose.psd.fileformats.psd.resources/colorhalftoneinformationresource/minimalversion/) { get; } | Gets the minimal required PSD version. |
| [Name](../../aspose.psd.fileformats.psd/resourceblock/name/) { get; set; } | Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0). |
| [Signature](../../aspose.psd.fileformats.psd/resourceblock/signature/) { get; } | Gets the resource signature. Should be always '8BIM'. |
| [Size](../../aspose.psd.fileformats.psd/resourceblock/size/) { get; } | Gets the resource block size in bytes including its data. |

## Methods

| Name | Description |
| --- | --- |
| [Save](../../aspose.psd.fileformats.psd/resourceblock/save/)(StreamContainer) | Saves the resource block to the specified stream. |
| virtual [ValidateValues](../../aspose.psd.fileformats.psd/resourceblock/validatevalues/)() | Validates the resource values. |

### See Also

* class [ResourceBlock](../../aspose.psd.fileformats.psd/resourceblock/)
* namespace [Aspose.PSD.FileFormats.Psd.Resources](../../aspose.psd.fileformats.psd.resources/)
* assembly [Aspose.PSD](../../)


