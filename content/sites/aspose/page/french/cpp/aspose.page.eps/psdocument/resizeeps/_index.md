---
title: "Aspose::Page::EPS::PsDocument::ResizeEps méthode"
linktitle: "ResizeEps"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps méthode. Redimensionne le PsDocument fourni en tant que fichier EPS. Cette méthode n'est utilisée qu'après l'extraction de la taille EPS. Elle enregistre le fichier EPS initial avec le %BoundingBox existant mis à jour ou un nouveau sera créé. La matrice de transformation de la page sera également définie en C++."
type: docs
weight: 4000
url: /fr/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Redimensionne le [PsDocument](../) en fichier [EPS](../../). Cette méthode n'est utilisée qu'après l'extraction de la taille du [EPS](../../). Elle enregistre le fichier [EPS](../../) initial avec le %BoundingBox existant mis à jour ou un nouveau sera créé. La matrice de transformation du [Page](../../../aspose.page/) sera également définie.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Flux du fichier [EPS](../../) de sortie. |
| newSizeInUnits | System::Drawing::SizeF | Nouvelle taille de l'image [EPS](../../) dans les unités assignées. |
| unités | Unités | Les unités de la nouvelle taille. Elles peuvent être des points, des pouces, des millimètres, des centimètres et des pourcentages de la taille initiale. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Redimensionne le [PsDocument](../) en fichier [EPS](../../). Cette méthode n'est utilisée qu'après l'extraction de la taille du [EPS](../../). Elle enregistre le [EPS](../../) initial filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hLe répertoire de sortie où le fichier image sera enregistré.e avec le %BoundingBox existant mis à jour ou un nouveau sera créé. La matrice de transformation du [Page](../../../aspose.page/) sera également définie.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outEpsFilePath | System::String | Le chemin du fichier [EPS](../../) de sortie. |
| newSizeInUnits | System::Drawing::SizeF | Nouvelle taille de l'image [EPS](../../) dans les unités assignées. |
| unités | Unités | Les unités de la nouvelle taille. Elles peuvent être des points, des pouces, des millimètres, des centimètres et des pourcentages de la taille initiale. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
