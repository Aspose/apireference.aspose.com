---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment método"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment método. Crea un nuevo conjunto de curvas Bézier cuadráticas desde el punto anterior en la figura de la ruta a través de un conjunto de vértices, utilizando puntos de control especificados en C++."
type: docs
weight: 2600
url: /es/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Crea un nuevo conjunto de curvas Bézier cuadráticas desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | System::ArrayPtr\<System::Drawing::PointF\> | Puntos de control para múltiples segmentos Bézier cuadráticos. |
| isStroked | bool | Especifica si el trazo para este segmento de la ruta se dibuja. |

### ReturnValue

Nuevo segmento de curvas Bézier cuadráticas.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
