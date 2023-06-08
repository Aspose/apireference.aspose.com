---
title: Enum TiffAlphaStorage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Tiff.Enums.TiffAlphaStorage enum. Specifies the alpha storage for tiff documents
type: docs
weight: 34620
url: /net/aspose.cad.fileformats.tiff.enums/tiffalphastorage/
---
## TiffAlphaStorage enumeration

Specifies the alpha storage for tiff documents.

```csharp
public enum TiffAlphaStorage : ushort
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Unspecified | `0` | The alpha is not specified and stored in the tiff file. |
| Associated | `1` | The alpha value is stored in premultiplied form. When alpha is restored there may be some rounding effects and restored value may be different from the original. |
| Unassociated | `2` | The alpha value is stored in unassociated form. That means that alpha restored is exactly the same as it was stored to the tiff. |

### See Also

* namespace [Aspose.CAD.FileFormats.Tiff.Enums](../../aspose.cad.fileformats.tiff.enums/)
* assembly [Aspose.CAD](../../)


