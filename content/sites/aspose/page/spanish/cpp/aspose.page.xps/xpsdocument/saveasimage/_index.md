---
title: "Método Aspose::Page::XPS::XpsDocument::SaveAsImage"
linktitle: "SaveAsImage"
second_title: "Aspose.Page para C++"
description: "Método Aspose::Page::XPS::XpsDocument::SaveAsImage. Guarda el documento en un archivo de imagen. El directorio de salida y el nombre de archivo serán los mismos que del archivo XPS de entrada. La extensión del archivo corresponderá al formato de imagen en el parámetro \"options\". Si el documento se inicializó con un flujo que no es FileStream, el archivo de imagen se guardará en la carpeta actual con la plantilla de nombre de archivo predeterminada en C++."
type: docs
weight: 5500
url: /es/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Guarda el documento en un archivo de imagen. El directorio de salida y el nombre del archivo serán los mismos que del archivo de entrada [XPS](../../). La extensión del archivo corresponderá al formato de imagen en el parámetro "options". Si el documento se inicializó con un flujo que no es FileStream, el archivo de imagen se guardará en la carpeta actual con la plantilla de nombre de archivo predeterminada.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| opciones | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opciones para guardar el documento en un formato de imagen bitmap. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Guarda el documento en un archivo de imagen en el directorio especificado con el nombre de archivo especificado. La extensión del archivo corresponderá al formato de imagen en el parámetro \"options\".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| opciones | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opciones para guardar el documento en un formato de imagen bitmap. |
| outDir | System::String | El directorio de salida donde se guardará el archivo de imagen. |
| fileNameTemplate | System::String | La plantilla de nombre de archivo para la imagen (sin extensión). Si el archivo de entrada [XPS](../../) tiene una sola página, será precisamente el nombre del archivo; de lo contrario "_[n]", donde "n" es el número de página comenzando desde 0, y se añadirá este sufijo. La extensión del archivo corresponderá al formato de imagen en el parámetro "option". |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
