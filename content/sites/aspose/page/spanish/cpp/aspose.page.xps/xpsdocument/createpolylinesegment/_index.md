---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment método"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment método. Crea un nuevo dibujo poligonal que contiene un número arbitrario de vértices individuales en C++."
type: docs
weight: 2500
url: /es/cpp/aspose.page.xps/xpsdocument/createpolylinesegment/
---
## XpsDocument::CreatePolyLineSegment method


Crea un nuevo dibujo poligonal que contiene un número arbitrario de vértices individuales.

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
