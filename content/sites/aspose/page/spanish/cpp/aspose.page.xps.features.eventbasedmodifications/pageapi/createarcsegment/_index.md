---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment método. Crea un nuevo segmento de arco elíptico en C++."
type: docs
weight: 600
url: /es/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


Crea un nuevo segmento de arco elíptico.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| punto | System::Drawing::PointF | El punto final del arco elíptico. |
| size | System::Drawing::SizeF | El radio x e y del arco elíptico como un par x,y. |
| rotationAngle | float | Indica cómo se rota la elipse respecto al sistema de coordenadas actual. |
| isLargeArc | bool | Determina si el arco se dibuja con un barrido de 180 grados o más. |
| sweepDirection | XpsModel::XpsSweepDirection | La dirección en la que se dibuja el arco. |
| isStroked | bool | Especifica si el trazo para este segmento de la ruta se dibuja. |

### ReturnValue

Nuevo segmento de arco elíptico.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
