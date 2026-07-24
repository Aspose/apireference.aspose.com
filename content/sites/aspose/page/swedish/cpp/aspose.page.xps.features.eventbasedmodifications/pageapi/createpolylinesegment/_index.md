---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method. Skapar en ny polygonal ritning som innehåller ett godtyckligt antal individuella hörn i C++."
type: docs
weight: 1800
url: /sv/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolylinesegment/
---
## PageAPI::CreatePolyLineSegment method


Skapar en ny polygonritning som innehåller ett godtyckligt antal enskilda hörn.

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| punkter | System::ArrayPtr\<System::Drawing::PointF\> | En uppsättning koordinater för de flera segmenten som definierar polylinjensegmentet. |
| isStroked | bool | Anger om strecket för detta segment av vägen ritas. |

### ReturnValue

Nytt polygonalt ritsegment.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyLineSegment](../../../aspose.page.xps.xpsmodel/xpspolylinesegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
