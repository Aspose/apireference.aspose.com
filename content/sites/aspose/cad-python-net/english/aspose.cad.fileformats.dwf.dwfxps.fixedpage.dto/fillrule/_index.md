---
title: FillRule enumeration
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 280
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fillrule/
is_root: false
---

## FillRule enumeration

The fill rule.
The FillRule attribute specifies a fill algorithm.
The filling area of a geometry is defined by taking all
of the contained path figures and applying the fill algorithm to determine the enclosed area.
Fill algorithms determine how the intersecting areas of geometric shapes are combined to form a region.



The FillRule type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| EVEN_ODD | The even odd.<br/>This rule determines the “INSIDENESS” of a point on the canvas<br/>by drawing a ray from the point to infinity in any direction and counting<br/>the number of segments from the given shape that the ray crosses.<br/>If this number is odd, the point is inside;<br/>if it is even, the point is outside.<br/>This is the default rule used throughout document markup. |
| NON_ZERO | The non zero.<br/>This rule determines the “INSIDENESS” of a point on the canvas<br/>by drawing a ray from the point to infinity in any direction<br/>and then examining the places where a segment of the shape crosses the ray.<br/>Starting with a count of zero, add one each time a segment crosses<br/>the ray from left to right and subtract one each time a path segment crosses the ray from right to left.<br/>After counting the crossings, if the result is zero then the point is outside the path; otherwise, it is inside. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
