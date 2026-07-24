---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment yöntemi. C++'ta rastgele sayıda bireysel köşe içeren yeni bir çokgen çizimi oluşturur."
type: docs
weight: 1800
url: /tr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolylinesegment/
---
## PageAPI::CreatePolyLineSegment method


Keyfi sayıda bireysel köşe içeren yeni bir çokgen çizim oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Poli hat segmentini tanımlayan birden çok segment için bir koordinat kümesi. |
| isStroked | bool | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirtir. |

### ReturnValue

Yeni çokgen çizim segmenti.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyLineSegment](../../../aspose.page.xps.xpsmodel/xpspolylinesegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
