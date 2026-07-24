---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment Methode. Erstellt ein neues elliptisches Bogensegment in C++."
type: docs
weight: 600
url: /de/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


Erstellt ein neues elliptisches Bogensegment.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Punkt | System::Drawing::PointF | Der Endpunkt des elliptischen Bogens. |
| size | System::Drawing::SizeF | Der x- und y-Radius des elliptischen Bogens als x,y-Paar. |
| rotationAngle | float | Gibt an, wie die Ellipse relativ zum aktuellen Koordinatensystem rotiert ist. |
| isLargeArc | bool | Bestimmt, ob der Bogen mit einem Sweep von 180 Grad oder mehr gezeichnet wird. |
| sweepDirection | XpsModel::XpsSweepDirection | Die Richtung, in der der Bogen gezeichnet wird. |
| isStroked | bool | Gibt an, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |

### ReturnValue

Neues elliptisches Bogensegment.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
