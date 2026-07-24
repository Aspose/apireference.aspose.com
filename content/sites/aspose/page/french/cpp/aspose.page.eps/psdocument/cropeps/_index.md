---
title: "Aspose::Page::EPS::PsDocument::CropEps method"
linktitle: "CropEps"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::PsDocument::CropEps method. Recadre le PsDocument fourni en fichier EPS. Il enregistre le fichier EPS initial avec le %BoundingBox existant mis à jour ou crée un nouveau en C++."
type: docs
weight: 900
url: /fr/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


Recadre le [PsDocument](../) en fichier [EPS](../../). Il enregistre le fichier [EPS](../../) initial avec le %BoundingBox existant mis à jour ou crée un nouveau.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Flux du fichier [EPS](../../) de sortie. |
| cropBox | System::ArrayPtr\<float\> | La zone de recadrage (x0, y0, x, y). |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


Recadre le [PsDocument](../) en fichier [EPS](../../). Il enregistre le fichier [EPS](../../) initial avec le %BoundingBox existant mis à jour ou crée un nouveau.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outEpsFilePath | System::String | Le chemin du fichier [EPS](../../) de sortie. |
| cropBox | System::ArrayPtr\<float\> | La zone de recadrage (x0, y0, x, y). |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
