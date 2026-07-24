---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions clase"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions clase. Clase básica para opciones de guardado XPS-como-imagen en C++."
type: docs
weight: 200
url: /es/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Clase básica para opciones de guardado XPS-as-image.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Especifica el tamaño de una porción de páginas para pasar de nodo a nodo. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | La colección de controladores de eventos que realiza modificaciones a una página [XPS](../../aspose.page.xps/) justo antes de que se guarde. |
| [get_ImageSize](./get_imagesize/)() const | Obtiene/establece el tamaño de las imágenes de salida en píxeles. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Obtiene/establece el modo de interpolación. |
| [get_PageNumbers](./get_pagenumbers/)() override | Obtiene/establece la matriz de números de páginas a convertir. |
| [get_Resolution](./get_resolution/)() const | Obtiene/establece la resolución de la imagen. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Obtiene/establece el modo de suavizado. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Obtiene/establece la sugerencia de renderizado de texto. |
| [ImageSaveOptions](./imagesaveoptions/)() | Crea una nueva instancia de opciones. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Especifica el tamaño de una porción de páginas para pasar de nodo a nodo. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Obtiene/establece el tamaño de las imágenes de salida en píxeles. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Obtiene/establece el modo de interpolación. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Obtiene/establece la matriz de números de páginas a convertir. |
| [set_Resolution](./set_resolution/)(float) | Obtiene/establece la resolución de la imagen. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Obtiene/establece el modo de suavizado. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Obtiene/establece la sugerencia de renderizado de texto. |
## Ver también

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
