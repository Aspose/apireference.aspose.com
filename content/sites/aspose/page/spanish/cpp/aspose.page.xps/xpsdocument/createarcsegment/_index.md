---
title: "Método Aspose::Page::XPS::XpsDocument::CreateArcSegment"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page para C++"
description: "Método Aspose::Page::XPS::XpsDocument::CreateArcSegment. Crea un nuevo segmento de arco elíptico en C++."
type: docs
weight: 1000
url: /es/cpp/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument::CreateArcSegment method


Crea un nuevo segmento de arco elíptico.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::XpsDocument::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
