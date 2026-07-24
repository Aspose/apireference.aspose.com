---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method. Crea un nuevo pincel visual en C++."
type: docs
weight: 2200
url: /es/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


Crea una nueva brocha visual.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | El elemento [XPS](../../../aspose.page.xps/) (Canvas, Path o Glyphs) para la propiedad Visual del pincel visual. |
| viewbox | System::Drawing::RectangleF | La posición y dimensiones del contenido fuente del pincel. |
| ventana de visualización | System::Drawing::RectangleF | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente de forma repetida) aplica para rellenar la región a la que se aplica el pincel |

### ReturnValue

Nuevo pincel visual.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
