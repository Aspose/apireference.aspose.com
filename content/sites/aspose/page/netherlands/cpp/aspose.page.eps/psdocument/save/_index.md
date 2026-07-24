---
title: "Aspose::Page::EPS::PsDocument::Save method"
linktitle: "Opslaan"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::PsDocument::Save method. Slaat het opgegeven PsDocument op als PS- of EPS-bestand. Deze methode wordt alleen gebruikt wanneer PsDocument vanaf nul is gemaakt in C++."
type: docs
weight: 4200
url: /nl/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Slaat het opgegeven [PsDocument](../) op als PS- of [EPS](../../) bestand. Deze methode wordt alleen gebruikt wanneer [PsDocument](../) vanaf nul is gemaakt.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Zie ook

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Slaat het opgegeven [PsDocument](../) op naar de stream. Deze methode wordt alleen gebruikt na het bijwerken van [XMP](../../../aspose.page.eps.xmp/) metadata. Het slaat het oorspronkelijke [EPS](../../) bestand op met bijgewerkte bestaande metadata of een nieuw bestand dat is aangemaakt tijdens het aanroepen van de GetMetadata-methode. In het laatste geval worden alle benodigde PostScript-code en [EPS](../../) opmerkingen toegevoegd.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream van het uitvoer-[EPS](../../) bestand. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Slaat het opgegeven [PsDocument](../) op als [EPS](../../) bestand. Deze methode wordt alleen gebruikt na het bijwerken van [XMP](../../../aspose.page.eps.xmp/) metadata. Het slaat het oorspronkelijke [EPS](../../) bestand op met bijgewerkte bestaande metadata of een nieuw bestand dat is aangemaakt tijdens het aanroepen van de GetMetadata-methode. In het laatste geval worden alle benodigde PostScript-code en [EPS](../../) opmerkingen toegevoegd.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outEpsFilePath | System::String | Een uitvoerpad voor het [EPS](../../) bestand. |

## Zie ook

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
