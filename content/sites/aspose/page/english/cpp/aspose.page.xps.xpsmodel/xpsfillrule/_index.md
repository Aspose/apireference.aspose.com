---
title: Aspose::Page::XPS::XpsModel::XpsFillRule enum
linktitle: XpsFillRule
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsFillRule enum. Valid values of PathGeometry element''s FillRule property in C++.'
type: docs
weight: 5100
url: /cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


Valid values of PathGeometry element's FillRule property.

```cpp
enum class XpsFillRule
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| EvenOdd | 0 | This rule determines the “insideness” of a point on the canvas by drawing a ray from the point to infinity in any direction and counting the number of segments from the given shape that the ray crosses. If this number is odd, the point is inside; if it is even, the point is outside. |
| NonZero | 1 | This rule determines the “insideness” of a point on the canvas by drawing a ray from the point to infinity in any direction and then examining the places where a segment of the shape crosses the ray. Starting with a count of zero, add one each time a segment crosses the ray from left to right and subtract one each time a path segment crosses the ray from right to left. After counting the crossings, if the result is zero then the point is outside the path; otherwise, it is inside. |

## See Also

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
