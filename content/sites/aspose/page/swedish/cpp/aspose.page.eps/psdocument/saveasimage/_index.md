---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage metod"
linktitle: "SaveAsImage"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage metod. Sparar PS/EPS‑fil till bildfil. Utdata‑katalogen och filnamnet kommer att vara samma som från den inmatade PS‑filen. Filändelsen kommer att motsvara bildformatet i parametern \"options\". Om dokumentet initierades med en ström som inte är FileStream, kommer bildfilen att sparas i den aktuella mappen med standardfilnamnsmall i C++."
type: docs
weight: 4300
url: /sv/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


Sparar PS/EPS‑fil till en bildfil. Utdata‑katalogen och filnamnet kommer att vara samma som för indata‑PS‑filen. Filändelsen kommer att motsvara bildformatet i parametern \"options\". Om dokumentet initierades med en ström som inte är FileStream, sparas bildfilen i den aktuella mappen med standardmall för filnamn.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


Sparar PS/EPS‑fil till en bildfil i den angivna katalogen med det angivna filnamnet. Filändelsen kommer att motsvara bildformatet i parametern \"options\".

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
