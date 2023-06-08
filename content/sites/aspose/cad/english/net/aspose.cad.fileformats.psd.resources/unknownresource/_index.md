---
title: Class UnknownResource
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Psd.Resources.UnknownResource class. The unknown resource. When a resource block is not recognized then this resource block is created
type: docs
weight: 33780
url: /net/aspose.cad.fileformats.psd.resources/unknownresource/
---
## UnknownResource class

The unknown resource. When a resource block is not recognized then this resource block is created.

```csharp
public sealed class UnknownResource : ResourceBlock
```

## Properties

| Name | Description |
| --- | --- |
| [Data](../../aspose.cad.fileformats.psd.resources/unknownresource/data/) { get; } | Gets the resource data. |
| override [DataSize](../../aspose.cad.fileformats.psd.resources/unknownresource/datasize/) { get; } | Gets the resource data size in bytes. |
| [ID](../../aspose.cad.fileformats.psd/resourceblock/id/) { get; set; } | Gets or sets the unique identifier for the resource. |
| override [MinimalVersion](../../aspose.cad.fileformats.psd.resources/unknownresource/minimalversion/) { get; } | Gets the minimal required psd version. |
| [Name](../../aspose.cad.fileformats.psd/resourceblock/name/) { get; set; } | Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0). |
| [Signature](../../aspose.cad.fileformats.psd/resourceblock/signature/) { get; } | Gets the resource signature. Should be always '8BIM'. |
| [Size](../../aspose.cad.fileformats.psd/resourceblock/size/) { get; } | Gets the resource block size in bytes including its data. |

## Methods

| Name | Description |
| --- | --- |
| [Save](../../aspose.cad.fileformats.psd/resourceblock/save/)(StreamContainer) | Saves the resource block to the specified stream. |
| virtual [ValidateValues](../../aspose.cad.fileformats.psd/resourceblock/validatevalues/)() | Validates the resource values. |

### See Also

* class [ResourceBlock](../../aspose.cad.fileformats.psd/resourceblock/)
* namespace [Aspose.CAD.FileFormats.Psd.Resources](../../aspose.cad.fileformats.psd.resources/)
* assembly [Aspose.CAD](../../)


