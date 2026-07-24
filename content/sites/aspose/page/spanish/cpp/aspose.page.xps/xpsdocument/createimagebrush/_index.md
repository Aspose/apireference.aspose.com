---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush método"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush método. Crea un nuevo pincel de imagen en C++."
type: docs
weight: 1800
url: /es/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Crea una nueva brocha de imagen.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagen | System::SharedPtr\<XpsModel::XpsImage\> | Un recurso de imagen. |
| viewbox | System::Drawing::RectangleF | La posición y dimensiones del contenido fuente del pincel. |
| ventana de visualización | System::Drawing::RectangleF | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente de forma repetida) aplica para rellenar la región a la que se aplica el pincel |

### ReturnValue

Nuevo pincel de imagen.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Crea una nueva brocha de imagen.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagePath | System::String | La ruta a la imagen que se usará como mosaico del pincel. |
| viewbox | System::Drawing::RectangleF | La posición y dimensiones del contenido fuente del pincel. |
| ventana de visualización | System::Drawing::RectangleF | La región en el espacio de coordenadas contenedor del mosaico principal del pincel que se (posiblemente de forma repetida) aplica para rellenar la región a la que se aplica el pincel |

### ReturnValue

Nuevo pincel de imagen.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
