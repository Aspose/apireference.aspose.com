---
title: Class ResourceBlock
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Psd.ResourceBlock class. The resource block
type: docs
weight: 33720
url: /net/aspose.cad.fileformats.psd/resourceblock/
---
## ResourceBlock class

The resource block.

```csharp
public abstract class ResourceBlock
```

## Properties

| Name | Description |
| --- | --- |
| abstract [DataSize](../../aspose.cad.fileformats.psd/resourceblock/datasize/) { get; } | Gets the resource data size in bytes. |
| [ID](../../aspose.cad.fileformats.psd/resourceblock/id/) { get; set; } | Gets or sets the unique identifier for the resource. |
| abstract [MinimalVersion](../../aspose.cad.fileformats.psd/resourceblock/minimalversion/) { get; } | Gets the minimal required PSD version. |
| [Name](../../aspose.cad.fileformats.psd/resourceblock/name/) { get; set; } | Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0). |
| [Signature](../../aspose.cad.fileformats.psd/resourceblock/signature/) { get; } | Gets the resource signature. Should be always '8BIM'. |
| [Size](../../aspose.cad.fileformats.psd/resourceblock/size/) { get; } | Gets the resource block size in bytes including its data. |

## Methods

| Name | Description |
| --- | --- |
| [Save](../../aspose.cad.fileformats.psd/resourceblock/save/)(StreamContainer) | Saves the resource block to the specified stream. |
| virtual [ValidateValues](../../aspose.cad.fileformats.psd/resourceblock/validatevalues/)() | Validates the resource values. |

## Fields

| Name | Description |
| --- | --- |
| const [ResouceBlockSignature](../../aspose.cad.fileformats.psd/resourceblock/resouceblocksignature/) | The resource signature. |

## Other Members

| Name | Description |
| --- | --- |
| enum [ResourceBlockState](../../aspose.cad.fileformats.psd/resourceblock.resourceblockstate) | Represents resource block state. |

### See Also

* namespace [Aspose.CAD.FileFormats.Psd](../../aspose.cad.fileformats.psd/)
* assembly [Aspose.CAD](../../)


