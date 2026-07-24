---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment metod"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment metod. Skapar en ny uppsättning kvadratiska Bézier‑kurvor från föregående punkt i banfiguren genom en mängd hörn, med angivna kontrollpunkter i C++."
type: docs
weight: 2600
url: /sv/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Skapar en ny uppsättning av kvadratiska Bézier-kurvor från föregående punkt i sökvägsfiguren genom en mängd hörn, med användning av specificerade kontrollpunkter.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| punkter | System::ArrayPtr\<System::Drawing::PointF\> | Kontrollpunkter för flera kvadratiska Bézier-segment. |
| isStroked | bool | Anger om strecket för detta segment av vägen ritas. |

### ReturnValue

Nytt segment med kvadratiska Bézier‑kurvor.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
