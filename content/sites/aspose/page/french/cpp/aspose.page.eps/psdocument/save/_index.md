---
title: "Aspose::Page::EPS::PsDocument::Save méthode"
linktitle: "Save"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::PsDocument::Save méthode. Enregistre le PsDocument fourni en tant que fichier PS ou EPS. Cette méthode n'est utilisée que lorsque le PsDocument a été créé à partir de zéro en C++."
type: docs
weight: 4200
url: /fr/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Enregistre le [PsDocument](../) fourni en tant que fichier PS ou [EPS](../../). Cette méthode n'est utilisée que lorsque le [PsDocument](../) a été créé à partir de zéro.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Voir aussi

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Enregistre le [PsDocument](../) fourni dans le flux. Cette méthode n'est utilisée qu'après la mise à jour des métadonnées [XMP](../../../aspose.page.eps.xmp/). Elle enregistre le fichier [EPS](../../) initial avec les métadonnées existantes mises à jour ou une nouvelle créée lors de l'appel de la méthode GetMetadata. Dans le dernier cas, tout le code PostScript nécessaire et les commentaires [EPS](../../) sont ajoutés.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Flux du fichier [EPS](../../) de sortie. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Enregistre le [PsDocument](../) fourni en tant que fichier [EPS](../../). Cette méthode n'est utilisée qu'après la mise à jour des métadonnées [XMP](../../../aspose.page.eps.xmp/). Elle enregistre le fichier [EPS](../../) initial avec les métadonnées existantes mises à jour ou une nouvelle créée lors de l'appel de la méthode GetMetadata. Dans le dernier cas, tout le code PostScript nécessaire et les commentaires [EPS](../../) sont ajoutés.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outEpsFilePath | System::String | Un chemin de fichier [EPS](../../) de sortie. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
