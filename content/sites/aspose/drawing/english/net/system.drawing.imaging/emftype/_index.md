---
title: Enum EmfType
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.EmfType enum. Specifies the nature of the records that are placed in an Enhanced Metafile EMF file. This enumeration is used by several constructors in the Metafile class
type: docs
weight: 690
url: /net/system.drawing.imaging/emftype/
---
## EmfType enumeration

Specifies the nature of the records that are placed in an Enhanced Metafile (EMF) file. This enumeration is used by several constructors in the Metafile class.

```csharp
public enum EmfType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| EmfOnly | `3` | Specifies that all the records in the metafile are EMF records, which can be displayed by GDI or GDI+. |
| EmfPlusOnly | `4` | Specifies that all the records in the metafile are EMF+ records, which can be displayed by GDI+ but not by GDI. |
| EmfPlusDual | `5` | Specifies that all EMF+ records in the metafile are associated with an alternate EMF record. Metafiles of type EmfPlusDual can be displayed by GDI or by GDI+. |

### See Also

* namespace [System.Drawing.Imaging](../../system.drawing.imaging/)
* assembly [Aspose.Drawing](../../)


