---
title: Enum LineCap
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.LineCap enum. The line cap. Specifies the appearance of line caps
type: docs
weight: 9370
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/linecap/
---
## LineCap enumeration

The line cap. Specifies the appearance of line caps.

```csharp
public enum LineCap
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Flat | `0` | The flat. The length of the line is the approximate distance on the curve between the two intersections of the flat lines ending the line and the contour of the shape. Lines with a length greater than 0 are drawn, and degenerate lines with a length of 0 are not drawn. |
| Round | `1` | The round. The length of the line is the approximate distance on the curve between the two contour intersection points, that is, the intersection of the flat line ending the line (without the round caps attached) and the contour of the shape. The caps are drawn as half-circles attached to the ends of the line. The boundaries of the round caps are not distorted to follow the contour, but are transformed using the effective render transform. Degenerate line with a length of 0 are drawn as circles. |
| Square | `2` | The square. The length of the line is the approximate distance on the curve between the two contour intersection points, that is, the intersection of the flat line ending the line (without the square caps attached) and the contour of the shape. The caps are drawn as half-squares attached to the ends of the line. The boundaries of the square caps are not curved to follow the contour, but are transformed using the effective render transform. Degenerate lines with a length of 0 are drawn as squares. If a line with a length of 0 appears at, or very near to, a join in a path then differences in rendering resolution and in precision in the calculation of coordinates may lead to differing orientation of the line caps between consumers. |
| Triangle | `3` | The triangle. The length of the Line is the approximate distance on the curve between the two contour intersection points, that is, the intersection of the flat line ending the Line (without the triangular caps attached) and the contour of the shape. The caps are drawn as triangles attached with their base to the ends of the Line. The boundaries of the triangular caps are not distorted to follow the contour, but are transformed using the effective render transform. The height of the triangles is half of the stroke width. Degenerate Lines with a length of 0 are drawn as diamonds. If a line with a length of 0 appears at, or very near to, a join in a path then differences in rendering resolution and in precision in the calculation of coordinates may lead to differing orientation of the line caps between consumers. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


