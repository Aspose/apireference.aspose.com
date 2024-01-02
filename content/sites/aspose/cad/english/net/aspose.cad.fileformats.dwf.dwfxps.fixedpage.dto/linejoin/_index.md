---
title: Enum LineJoin
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.LineJoin enum. The line join. Specifies the appearance of line joins
type: docs
weight: 9280
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/linejoin/
---
## LineJoin enumeration

The line join. Specifies the appearance of line joins.

```csharp
public enum LineJoin
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Miter | `0` | The miter. Indicates that the region to be filled includes the intersection of the strokes projected to infinity, and then clipped at a specific distance. The intersection of the strokes is clipped at a line perpendicular to the bisector of the angle between the strokes, at the distance equal to the stroke miter limit value multiplied by half the stroke thickness value. |
| Bevel | `1` | The bevel. Indicates that the outer corner of the joined lines should be filled by enclosing the triangular region of the corner with a straight line between the outer corners of each stroke. |
| Round | `2` | The round. Indicates that the outer corner of the joined lines should be filled by enclosing the rounded region with its center point at the point of intersection between the two lines and a radius of one-half the stroke thickness value. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


