---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment Methode"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment Methode. Erstellt einen neuen Satz quadratischer Bézier-Kurven vom vorherigen Punkt in der Pfadfigur durch eine Menge von Scheitelpunkten, wobei angegebene Kontrollpunkte in C++ verwendet werden."
type: docs
weight: 1900
url: /de/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolyquadraticbeziersegment/
---
## PageAPI::CreatePolyQuadraticBezierSegment method


Erstellt ein neues Set quadratischer Bézierkurven vom vorherigen Punkt in der Pfadfigur durch eine Menge von Scheitelpunkten unter Verwendung der angegebenen Kontrollpunkte.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Kontrollpunkte für mehrere quadratische Bézier-Segmente. |
| isStroked | bool | Gibt an, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |

### ReturnValue

Neues quadratisches Bézier-Kurvensegment.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
