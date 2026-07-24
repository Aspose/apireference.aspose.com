---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes método"
linktitle: "SaveAsImageBytes"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes método. Guarda el documento en formato de imagen bitmap como matrices de bytes en C++."
type: docs
weight: 5600
url: /es/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


Guarda el documento en formato de imagen bitmap como matrices de bytes.

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| opciones | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opciones para guardar el documento en un formato de imagen bitmap. |

### ReturnValue

Los arreglos de bytes de las imágenes resultantes. La primera dimensión es para documentos internos y la segunda es para páginas dentro de los documentos internos.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
