---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method. Crea un nuevo dibujo poligonal que contiene un número arbitrario de vértices individuales en C++."
type: docs
weight: 1800
url: /es/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolylinesegment/
---
## PageAPI::CreatePolyLineSegment method


Crea un nuevo dibujo poligonal que contiene un número arbitrario de vértices individuales.

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | System::ArrayPtr\<System::Drawing::PointF\> | Un conjunto de coordenadas para los múltiples segmentos que definen el segmento de polilínea. |
| isStroked | bool | Especifica si el trazo para este segmento de la ruta se dibuja. |

### ReturnValue

Nuevo segmento de dibujo poligonal.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyLineSegment](../../../aspose.page.xps.xpsmodel/xpspolylinesegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
