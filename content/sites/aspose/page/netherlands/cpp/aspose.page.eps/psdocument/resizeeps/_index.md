---
title: "Aspose::Page::EPS::PsDocument::ResizeEps method"
linktitle: "ResizeEps"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps method. Wijzigt de grootte van het opgegeven PsDocument als EPS‑bestand. Deze methode wordt alleen gebruikt na het extraheren van de EPS‑grootte. Het slaat het oorspronkelijke EPS‑bestand op met een bijgewerkte bestaande %BoundingBox of er wordt een nieuwe aangemaakt. De paginatransformatie‑matrix wordt ook ingesteld in C++."
type: docs
weight: 4000
url: /nl/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Wijzigt de grootte van het opgegeven [PsDocument](../) als [EPS](../../)‑bestand. Deze methode wordt alleen gebruikt na het extraheren van de [EPS](../../)‑grootte. Het slaat het oorspronkelijke [EPS](../../)‑bestand op met een bijgewerkte bestaande %BoundingBox of er wordt een nieuwe aangemaakt. De [Page](../../../aspose.page/)‑transformatie‑matrix wordt ook ingesteld.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream van het uitvoer-[EPS](../../) bestand. |
| newSizeInUnits | System::Drawing::SizeF | Nieuwe grootte van de [EPS](../../)‑afbeelding in toegewezen eenheden. |
| eenheden | Eenheden | De eenheden van de nieuwe grootte. Kan punten, inches, millimeters, centimeters en procenten van de oorspronkelijke grootte zijn. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Wijzigt de grootte van het opgegeven [PsDocument](../) als [EPS](../../)‑bestand. Deze methode wordt alleen gebruikt na het extraheren van de [EPS](../../)‑grootte. Het slaat het oorspronkelijke [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hDe uitvoermap waar het afbeeldingsbestand wordt opgeslagen.e met een bijgewerkte bestaande %BoundingBox of er wordt een nieuwe aangemaakt. De [Page](../../../aspose.page/)‑transformatie‑matrix wordt ook ingesteld.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outEpsFilePath | System::String | Het uitvoer‑[EPS](../../)‑bestandspad. |
| newSizeInUnits | System::Drawing::SizeF | Nieuwe grootte van de [EPS](../../)‑afbeelding in toegewezen eenheden. |
| eenheden | Eenheden | De eenheden van de nieuwe grootte. Kan punten, inches, millimeters, centimeters en procenten van de oorspronkelijke grootte zijn. |

## Zie ook

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
