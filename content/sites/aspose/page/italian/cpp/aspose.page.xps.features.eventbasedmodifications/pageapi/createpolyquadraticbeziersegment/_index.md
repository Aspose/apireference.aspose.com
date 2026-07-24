---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment method"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment method. Crea un nuovo insieme di curve Bézier quadratiche dal punto precedente nella figura del percorso attraverso un insieme di vertici, utilizzando i punti di controllo specificati in C++."
type: docs
weight: 1900
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolyquadraticbeziersegment/
---
## PageAPI::CreatePolyQuadraticBezierSegment method


Crea un nuovo insieme di curve Bézier quadratiche dal punto precedente nella figura di percorso attraverso un insieme di vertici, usando i punti di controllo specificati.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Punti di controllo per più segmenti Bézier quadratici. |
| isStroked | bool | Specifica se il tratto per questo segmento del percorso viene disegnato. |

### ReturnValue

Nuovo segmento di curve Bézier quadratiche.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
