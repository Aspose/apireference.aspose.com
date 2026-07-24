---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment metod. Skapar ett nytt elliptiskt bågsegment i C++."
type: docs
weight: 600
url: /sv/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


Skapar ett nytt elliptiskt bågsegment.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| punkt | System::Drawing::PointF | Slutpunkten på den elliptiska bågen. |
| size | System::Drawing::SizeF | x- och y-radien för den elliptiska bågen som ett x,y-par. |
| rotationAngle | float | Anger hur ellipsen är roterad i förhållande till det aktuella koordinatsystemet. |
| isLargeArc | bool | Bestämmer om bågen ritas med en svepning på 180 grader eller mer. |
| sweepDirection | XpsModel::XpsSweepDirection | Riktningen i vilken bågen ritas. |
| isStroked | bool | Anger om strecket för detta segment av vägen ritas. |

### ReturnValue

Nytt elliptiskt bågsegment.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
