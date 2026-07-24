---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage metod"
linktitle: "SaveAsImage"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage metod. Sparar dokumentet till en bildfil. Utdata‑katalogen och filnamnet kommer att vara samma som från den ingående XPS‑filen. Filändelsen kommer att motsvara bildformatet i parametern \"options\". Om dokumentet initierades med en ström som inte är FileStream, kommer bildfilen att sparas i den aktuella mappen med standardfilnamnsmall i C++."
type: docs
weight: 5500
url: /sv/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Sparar dokumentet till en bildfil. Utdata‑katalogen och filnamnet blir samma som från inmatnings‑[XPS](../../)‑filen. Filändelsen kommer att motsvara bildformatet i parametern "options". Om dokumentet initierades med en ström som inte är FileStream, sparas bildfilen i den aktuella mappen med standardmall för filnamn.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| alternativ | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Alternativ för att spara dokumentet i ett bitmap-bildformat. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Sparar dokumentet till en bildfil i den angivna katalogen med det angivna filnamnet. Filändelsen kommer att motsvara bildformatet i parametern \"options\".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| alternativ | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Alternativ för att spara dokumentet i ett bitmap-bildformat. |
| outDir | System::String | Utdata‑katalogen där bildfilen kommer att sparas. |
| fileNameTemplate | System::String | Filnamnsmallen för bilden (utan filändelse). Om inmatnings‑[XPS](../../)‑filen är en‑sidig blir den exakt filnamnet, annars "_[n]", där "n" är sidnumret med början från 0, ett suffix kommer att läggas till detta. Filändelsen kommer att motsvara bildformatet i parametern "option". |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
