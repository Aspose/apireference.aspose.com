---
title: Enum DashCap
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.DashCap enum. The dash cap. The effective render transform of the path being stroked is used to transform the control points of the contour of the dash
type: docs
weight: 9180
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/dashcap/
---
## DashCap enumeration

The dash cap. The effective render transform of the path being stroked is used to transform the control points of the contour of the dash.

```csharp
public enum DashCap
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Flat | `0` | The flat. The length of the dash is the approximate distance on the curve between the two intersections of the flat lines ending the dash and the contour of the shape. The distance from the end of one dash to the start of the next dash is the specified dash gap length. Dashes with a length greater than 0 are drawn, and degenerate dashes with a length of 0 are not drawn. |
| Round | `1` | The round. The length of the dash is the approximate distance on the curve between the two contour intersection points, that is, the intersection of the flat line ending the dash (without the round caps attached) and the contour of the shape. The caps are drawn as half-circles attached to the ends of the dash. The boundaries of the round caps are not distorted to follow the contour, but are transformed using the effective render transform. The distance between the contour intersection points of consecutive dashes is the specified dash gap length. Degenerate dashes with a length of 0 are drawn as circles. |
| Square | `2` | The square. The length of the dash is the approximate distance on the curve between the two contour intersection points, that is, the intersection of the flat line ending the dash (without the square caps attached) and the contour of the shape. The caps are drawn as half-squares attached to the ends of the dash. The boundaries of the square caps are not curved to follow the contour, but are transformed using the effective render transform. The distance between the contour intersection points of consecutive dashes is the specified dash gap length. Degenerate dashes with a length of 0 are drawn as squares. If a dash with a length of 0 appears at, or very near to, a join in a path then differences in rendering resolution and in precision in the calculation of coordinates may lead to differing orientation of the dash caps between consumers. |
| Triangle | `3` | The triangle. The length of the dash is the approximate distance on the curve between the two contour intersection points, that is, the intersection of the flat line ending the dash (without the triangular caps attached) and the contour of the shape. The caps are drawn as triangles attached with their base to the ends of the dash. The boundaries of the triangular caps are not distorted to follow the contour, but are transformed using the effective render transform. The height of the triangles is half of the stroke width. The distance between the contour intersection points of consecutive dashes is the specified dash gap length. Degenerate dashes with a length of 0 are drawn as diamonds. If a dash with a length of 0 appears at, or very near to, a join in a path then differences in rendering resolution and in precision in the calculation of coordinates may lead to differing orientation of the dash caps between consumers. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


