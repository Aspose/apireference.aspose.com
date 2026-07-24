---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment-methode"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment-methode. Maakt een nieuwe reeks kwadratische Béziercurven aan vanaf het vorige punt in de padfiguur via een reeks hoekpunten, met behulp van opgegeven controlepunten in C++."
type: docs
weight: 2600
url: /nl/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Maakt een nieuwe set kwadratische Bézier-curves van het vorige punt in de padfiguur via een reeks hoekpunten, met gebruik van gespecificeerde controlepunten.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Controlepunten voor meerdere kwadratische Béziersegmenten. |
| isStroked | bool | Specificeert of de stroke voor dit segment van het pad wordt getekend. |

### ReturnValue

Nieuw kwadratisch Bézier-curve segment.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
