---
title: Class GridAndGuidesResouce
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Psd.Resources.GridAndGuidesResouce class. Represents the grid and guides resource
type: docs
weight: 33740
url: /net/aspose.cad.fileformats.psd.resources/gridandguidesresouce/
---
## GridAndGuidesResouce class

Represents the grid and guides resource.

```csharp
public sealed class GridAndGuidesResouce : ResourceBlock
```

## Constructors

| Name | Description |
| --- | --- |
| [GridAndGuidesResouce](gridandguidesresouce/)() | Initializes a new instance of the `GridAndGuidesResouce` class. |

## Properties

| Name | Description |
| --- | --- |
| override [DataSize](../../aspose.cad.fileformats.psd.resources/gridandguidesresouce/datasize/) { get; } | Gets the resource data size in bytes. |
| [GridCycleX](../../aspose.cad.fileformats.psd.resources/gridandguidesresouce/gridcyclex/) { get; set; } | Gets or sets the horizontal grid cycle. The default is 576. |
| [GridCycleY](../../aspose.cad.fileformats.psd.resources/gridandguidesresouce/gridcycley/) { get; set; } | Gets or sets the vertical grid cycle. The default is 576. |
| [GuideCount](../../aspose.cad.fileformats.psd.resources/gridandguidesresouce/guidecount/) { get; } | Gets the guide resource blocks count. |
| [HeaderVersion](../../aspose.cad.fileformats.psd.resources/gridandguidesresouce/headerversion/) { get; set; } | Gets or sets the header version. This value should be always 1. |
| [ID](../../aspose.cad.fileformats.psd/resourceblock/id/) { get; set; } | Gets or sets the unique identifier for the resource. |
| override [MinimalVersion](../../aspose.cad.fileformats.psd.resources/gridandguidesresouce/minimalversion/) { get; } | Gets the minimal required psd version. |
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


