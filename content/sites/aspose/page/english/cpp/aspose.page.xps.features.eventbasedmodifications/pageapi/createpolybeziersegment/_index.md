---
title: Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyBezierSegment method
linktitle: CreatePolyBezierSegment
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyBezierSegment method. Creates a new set of cubic Bézier curves in C++.'
type: docs
weight: 1700
url: /cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolybeziersegment/
---
## PageAPI::CreatePolyBezierSegment method


Creates a new set of cubic Bézier curves.

```cpp
System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsPolyBezierSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | Description |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Control points for multiple Bézier segments. |
| isStroked | bool | Specifies whether the stroke for this segment of the path is drawn. |

### ReturnValue

New cubic Bézier curves segment.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolybeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
