---
title: "Aspose::Page::EPS::PsDocument::CropEps método"
linktitle: "CropEps"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument::CropEps método. Recorta el PsDocument dado como archivo EPS. Guarda el archivo EPS inicial con el %BoundingBox existente actualizado o se creará uno nuevo en C++."
type: docs
weight: 900
url: /es/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


Recorta el [PsDocument](../) dado como archivo [EPS](../../). Guarda el archivo [EPS](../../) inicial con el %BoundingBox existente actualizado o se creará uno nuevo.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Flujo del archivo [EPS](../../) de salida. |
| cropBox | System::ArrayPtr\<float\> | El cuadro de recorte (x0, y0, x, y). |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


Recorta el [PsDocument](../) dado como archivo [EPS](../../). Guarda el archivo [EPS](../../) inicial con el %BoundingBox existente actualizado o se creará uno nuevo.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outEpsFilePath | System::String | La ruta del archivo [EPS](../../) de salida. |
| cropBox | System::ArrayPtr\<float\> | El cuadro de recorte (x0, y0, x, y). |

## Ver también

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
