---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment Methode"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment Methode. Erstellt ein neues Set quadratischer Bézierkurven vom vorherigen Punkt in der Pfadfigur über eine Menge von Scheitelpunkten hinweg, wobei die angegebenen Kontrollpunkte in C++ verwendet werden."
type: docs
weight: 2600
url: /de/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Erstellt ein neues Set quadratischer Bézierkurven vom vorherigen Punkt in der Pfadfigur durch eine Menge von Scheitelpunkten unter Verwendung der angegebenen Kontrollpunkte.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
