---
title: Enum FillRule
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.FillRule enum. The fill rule. The FillRule attribute specifies a fill algorithm. The filling area of a geometry is defined by taking all of the contained path figures and applying the fill algorithm to determine the enclosed area. Fill algorithms determine how the intersecting areas of geometric shapes are combined to form a region
type: docs
weight: 9320
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fillrule/
---
## FillRule enumeration

The fill rule. The FillRule attribute specifies a fill algorithm. The filling area of a geometry is defined by taking all of the contained path figures and applying the fill algorithm to determine the enclosed area. Fill algorithms determine how the intersecting areas of geometric shapes are combined to form a region.

```csharp
public enum FillRule
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| EvenOdd | `0` | The even odd. This rule determines the “INSIDENESS” of a point on the canvas by drawing a ray from the point to infinity in any direction and counting the number of segments from the given shape that the ray crosses. If this number is odd, the point is inside; if it is even, the point is outside. This is the default rule used throughout document markup. |
| NonZero | `1` | The non zero. This rule determines the “INSIDENESS” of a point on the canvas by drawing a ray from the point to infinity in any direction and then examining the places where a segment of the shape crosses the ray. Starting with a count of zero, add one each time a segment crosses the ray from left to right and subtract one each time a path segment crosses the ray from right to left. After counting the crossings, if the result is zero then the point is outside the path; otherwise, it is inside. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


