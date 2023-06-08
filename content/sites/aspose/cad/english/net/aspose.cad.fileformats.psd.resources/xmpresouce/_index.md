---
title: Class XmpResouce
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Psd.Resources.XmpResouce class. Represents the XMP metadata resource
type: docs
weight: 33790
url: /net/aspose.cad.fileformats.psd.resources/xmpresouce/
---
## XmpResouce class

Represents the XMP metadata resource.

```csharp
public sealed class XmpResouce : ResourceBlock
```

## Constructors

| Name | Description |
| --- | --- |
| [XmpResouce](xmpresouce/)() | Initializes a new instance of the [`GridAndGuidesResouce`](../gridandguidesresouce/) class. |

## Properties

| Name | Description |
| --- | --- |
| override [DataSize](../../aspose.cad.fileformats.psd.resources/xmpresouce/datasize/) { get; } | Gets the resource data size in bytes. |
| [ID](../../aspose.cad.fileformats.psd/resourceblock/id/) { get; set; } | Gets or sets the unique identifier for the resource. |
| override [MinimalVersion](../../aspose.cad.fileformats.psd.resources/xmpresouce/minimalversion/) { get; } | Gets the minimal required psd version. |
| [Name](../../aspose.cad.fileformats.psd/resourceblock/name/) { get; set; } | Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0). |
| [Signature](../../aspose.cad.fileformats.psd/resourceblock/signature/) { get; } | Gets the resource signature. Should be always '8BIM'. |
| [Size](../../aspose.cad.fileformats.psd/resourceblock/size/) { get; } | Gets the resource block size in bytes including its data. |
| [XmpData](../../aspose.cad.fileformats.psd.resources/xmpresouce/xmpdata/) { get; set; } | Get or set XMP data container |

## Methods

| Name | Description |
| --- | --- |
| [Save](../../aspose.cad.fileformats.psd/resourceblock/save/)(StreamContainer) | Saves the resource block to the specified stream. |
| virtual [ValidateValues](../../aspose.cad.fileformats.psd/resourceblock/validatevalues/)() | Validates the resource values. |

### See Also

* class [ResourceBlock](../../aspose.cad.fileformats.psd/resourceblock/)
* namespace [Aspose.CAD.FileFormats.Psd.Resources](../../aspose.cad.fileformats.psd.resources/)
* assembly [Aspose.CAD](../../)


