---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment methode. Maakt een nieuw elliptisch boogsegment in C++."
type: docs
weight: 600
url: /nl/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


Maakt een nieuw elliptisch boogsegment.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| punt | System::Drawing::PointF | Het eindpunt van de elliptische boog. |
| size | System::Drawing::SizeF | De x- en y-radius van de elliptische boog als een x,y-paar. |
| rotationAngle | float | Geeft aan hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem. |
| isLargeArc | bool | Bepaalt of de boog wordt getekend met een sweep van 180 graden of meer. |
| sweepDirection | XpsModel::XpsSweepDirection | De richting waarin de boog wordt getekend. |
| isStroked | bool | Specificeert of de stroke voor dit segment van het pad wordt getekend. |

### ReturnValue

Nieuw elliptisch boogsegment.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
