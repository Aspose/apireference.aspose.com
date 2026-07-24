---
title: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush método"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush método. Crea una nueva brocha visual en C++."
type: docs
weight: 2900
url: /es/cpp/aspose.page.xps/xpsdocument/createvisualbrush/
---
## XpsDocument::CreateVisualBrush method


Crea una nueva brocha visual.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::XpsDocument::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | El elemento [XPS](../../) (Canvas, Path o Glyphs) para la propiedad Visual del pincel visual. |
| viewbox | System::Drawing::RectangleF | La posición y dimensiones del contenido fuente del pincel. |
| ventana de visualización | System::Drawing::RectangleF | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente de forma repetida) aplica para rellenar la región a la que se aplica el pincel |

### ReturnValue

Nuevo pincel visual.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
