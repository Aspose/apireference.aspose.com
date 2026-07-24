---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage methode"
linktitle: "SaveAsImage"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage methode. Slaat het document op als afbeeldingsbestand. De uitvoermap en de bestandsnaam zullen hetzelfde zijn als van het invoer‑XPS‑bestand. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter \"options\". Als het document is geïnitialiseerd met een stream die geen FileStream is, wordt het afbeeldingsbestand opgeslagen in de huidige map met een standaard bestandsnaamsjabloon in C++."
type: docs
weight: 5500
url: /nl/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Slaat het document op als afbeeldingsbestand. De uitvoermap en de bestandsnaam zullen hetzelfde zijn als van het invoer‑[XPS](../../) bestand. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "options". Als het document is geïnitialiseerd met een stream die geen FileStream is, wordt het afbeeldingsbestand opgeslagen in de huidige map met een standaard bestandsnaamsjabloon.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| opties | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opties voor het opslaan van het document in een bitmap‑afbeeldingsformaat. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Slaat het document op als afbeeldingsbestand in de opgegeven map met de opgegeven bestandsnaam. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "options".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| opties | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opties voor het opslaan van het document in een bitmap‑afbeeldingsformaat. |
| outDir | System::String | De uitvoermap waar het afbeeldingsbestand wordt opgeslagen. |
| fileNameTemplate | System::String | Het bestandsnaamsjabloon voor de afbeelding (zonder extensie). Als het invoer‑[XPS](../../) bestand één pagina heeft, zal dit precies de bestandsnaam zijn, anders "_[n]", waarbij "n" - een paginanummer beginnend bij 0, wordt hier een achtervoegsel aan toegevoegd. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "option". |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
