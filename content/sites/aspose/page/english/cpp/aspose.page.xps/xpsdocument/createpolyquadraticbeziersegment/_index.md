---
title: Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment method
linktitle: CreatePolyQuadraticBezierSegment
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment method. Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set of vertices, using specified control points in C++.'
type: docs
weight: 4900
url: /cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set of vertices, using specified control points.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | Description |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Control points for multiple quadratic Bézier segments. |
| isStroked | bool | Specifies whether the stroke for this segment of the path is drawn. |

### ReturnValue

New quadratic Bézier curves segment.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
