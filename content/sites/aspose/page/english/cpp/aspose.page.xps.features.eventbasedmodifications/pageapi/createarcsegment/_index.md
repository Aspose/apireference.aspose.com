---
title: Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method
linktitle: CreateArcSegment
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method. Creates a new elliptical arc segment in C++.'
type: docs
weight: 600
url: /cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


Creates a new elliptical arc segment.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Type | Description |
| --- | --- | --- |
| point | System::Drawing::PointF | The endpoint of the elliptical arc. |
| size | System::Drawing::SizeF | The x and y radius of the elliptical arc as an x,y pair. |
| rotationAngle | float | Indicates how the ellipse is rotated relative to the current coordinate system. |
| isLargeArc | bool | Determines whether the arc is drawn with a sweep of 180 or greater. |
| sweepDirection | XpsModel::XpsSweepDirection | The direction in which the arc is drawn. |
| isStroked | bool | Specifies whether the stroke for this segment of the path is drawn. |

### ReturnValue

New elliptical arc segment.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
