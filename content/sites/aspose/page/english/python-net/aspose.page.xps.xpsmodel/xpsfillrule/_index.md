---
title: XpsFillRule enumeration
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 420
url: /python-net/aspose.page.xps.xpsmodel/xpsfillrule/
is_root: false
---

## XpsFillRule enumeration

Valid values of PathGeometry element's FillRule property.



The XpsFillRule type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| EVEN_ODD | This rule determines the “insideness” of a point on the canvas by drawing a ray<br/>from the point to infinity in any direction and counting the number of segments<br/>from the given shape that the ray crosses. If this number is odd, the point is<br/>inside; if it is even, the point is outside. |
| NON_ZERO | This rule determines the “insideness” of a point on the canvas by drawing a ray<br/>from the point to infinity in any direction and then examining the places where<br/>a segment of the shape crosses the ray. Starting with a count of zero, add one<br/>each time a segment crosses the ray from left to right and subtract one each time<br/>a path segment crosses the ray from right to left. After counting the crossings,<br/>if the result is zero then the point is outside the path; otherwise, it is inside. |



### See Also
* module [`aspose.page.xps.xpsmodel`](..)
