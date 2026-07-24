---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method. Crea un nuovo segmento di arco ellittico in C++."
type: docs
weight: 600
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


Crea un nuovo segmento di arco ellittico.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| punto | System::Drawing::PointF | Il punto finale dell'arco ellittico. |
| size | System::Drawing::SizeF | Il raggio x e y dell'arco ellittico come coppia x,y. |
| rotationAngle | float | Indica come l'ellisse è ruotata rispetto al sistema di coordinate corrente. |
| isLargeArc | bool | Determina se l'arco è disegnato con una sweep di 180 o più. |
| sweepDirection | XpsModel::XpsSweepDirection | La direzione in cui l'arco è disegnato. |
| isStroked | bool | Specifica se il tratto per questo segmento del percorso viene disegnato. |

### ReturnValue

Nuovo segmento di arco ellittico.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
