---
title: Enum MetafileType
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.MetafileType enum. Specifies types of metafiles
type: docs
weight: 820
url: /net/system.drawing.imaging/metafiletype/
---
## MetafileType enumeration

Specifies types of metafiles.

```csharp
public enum MetafileType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Invalid | `0` | Specifies a metafile format that is not recognized in GDI+. |
| Wmf | `1` | Specifies a WMF (Windows Metafile) file. Such a file contains only GDI records. |
| WmfPlaceable | `2` | Specifies a WMF (Windows Metafile) file that has a placeable metafile header in front of it. |
| Emf | `3` | Specifies an Enhanced Metafile (EMF) file. Such a file contains only GDI records. |
| EmfPlusOnly | `4` | Specifies an EMF+ file. Such a file contains only GDI+ records and must be displayed by using GDI+. Displaying the records using GDI may cause unpredictable results. |
| EmfPlusDual | `5` | Specifies an EMF+ Dual file. Such a file contains GDI+ records along with alternative GDI records and can be displayed by using either GDI or GDI+. Displaying the records using GDI may cause some quality degradation. |

### See Also

* namespace [System.Drawing.Imaging](../../system.drawing.imaging/)
* assembly [Aspose.Drawing](../../)


