---
title: DashCap enumeration
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 260
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/dashcap/
is_root: false
---

## DashCap enumeration

The dash cap.
The effective render transform of the path being stroked is used
to transform the control points of the contour of the dash.



The DashCap type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| FLAT | The flat.<br/>The length of the dash is the approximate distance on the curve<br/>between the two intersections of the flat lines ending the dash and the contour of the shape.<br/>The distance from the end of one dash to the start of the next dash is the specified dash gap length.<br/>Dashes with a length greater than 0 are drawn, and degenerate dashes with a length of 0 are not drawn. |
| ROUND | The round.<br/>The length of the dash is the approximate distance on the curve between the two contour intersection points,<br/>that is, the intersection of the flat line ending the dash (without the round caps attached) and the contour of the shape.<br/>The caps are drawn as half-circles attached to the ends of the dash.<br/>The boundaries of the round caps are not distorted to follow the contour, but are transformed using the effective render transform.<br/>The distance between the contour intersection points of consecutive dashes is the specified dash gap length.<br/>Degenerate dashes with a length of 0 are drawn as circles. |
| SQUARE | The square.<br/>The length of the dash is the approximate distance on the curve between the two contour intersection points, that is,<br/>the intersection of the flat line ending the dash (without the square caps attached) and the contour of the shape.<br/>The caps are drawn as half-squares attached to the ends of the dash.<br/>The boundaries of the square caps are not curved to follow the contour, but are transformed using the effective render transform.<br/>The distance between the contour intersection points of consecutive dashes is the specified dash gap length.<br/>Degenerate dashes with a length of 0 are drawn as squares.<br/>If a dash with a length of 0 appears at, or very near to, a join in a path then differences in rendering resolution<br/>and in precision in the calculation of coordinates may lead to differing orientation of the dash caps between consumers. |
| TRIANGLE | The triangle.<br/>The length of the dash is the approximate distance on the curve between the two contour intersection points,<br/>that is, the intersection of the flat line ending the dash (without the triangular caps attached) and the contour of the shape.<br/>The caps are drawn as triangles attached with their base to the ends of the dash.<br/>The boundaries of the triangular caps are not distorted to follow the contour, but are transformed using the effective render transform.<br/>The height of the triangles is half of the stroke width.<br/>The distance between the contour intersection points of consecutive dashes is the specified dash gap length.<br/>Degenerate dashes with a length of 0 are drawn as diamonds.<br/>If a dash with a length of 0 appears at, or very near to, a join in a path then differences in rendering resolution<br/>and in precision in the calculation of coordinates may lead to differing orientation of the dash caps between consumers. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
