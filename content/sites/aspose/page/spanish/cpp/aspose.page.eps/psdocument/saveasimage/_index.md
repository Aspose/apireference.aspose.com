---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage método"
linktitle: "SaveAsImage"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage método. Guarda el archivo PS/EPS como archivo de imagen. El directorio de salida y el nombre del archivo serán los mismos que del archivo PS de entrada. La extensión del archivo corresponderá al formato de imagen en el parámetro \"options\". Si el documento se inicializó con un flujo que no es FileStream, el archivo de imagen se guardará en la carpeta actual con la plantilla de nombre de archivo predeterminada en C++."
type: docs
weight: 4300
url: /es/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


Guarda el archivo PS/EPS en un archivo de imagen. El directorio de salida y el nombre del archivo serán los mismos que del archivo PS de entrada. La extensión del archivo corresponderá al formato de imagen especificado en el parámetro \"options\". Si el documento se inicializó con un flujo que no es FileStream, el archivo de imagen se guardará en la carpeta actual con la plantilla de nombre de archivo predeterminada.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


Guarda el archivo PS/EPS en un archivo de imagen en el directorio especificado con el nombre de archivo especificado. La extensión del archivo corresponderá al formato de imagen indicado en el parámetro \"options\".

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
