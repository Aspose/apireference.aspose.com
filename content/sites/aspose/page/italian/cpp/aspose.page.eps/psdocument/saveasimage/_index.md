---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage metodo"
linktitle: "SaveAsImage"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage metodo. Salva il file PS/EPS in un file immagine. La directory di output e il nome del file saranno gli stessi del file PS di input. L'estensione del file corrisponderà al formato immagine nel parametro \"options\". Se il documento è stato inizializzato con uno stream che non è FileStream, il file immagine verrà salvato nella cartella corrente con il modello di nome file predefinito in C++."
type: docs
weight: 4300
url: /it/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


Salva il file PS/EPS in un file immagine. La directory di output e il nome del file saranno gli stessi del file PS di input. L'estensione del file corrisponderà al formato immagine specificato nel parametro \"options\". Se il documento è stato inizializzato con uno stream che non è un FileStream, il file immagine verrà salvato nella cartella corrente con il modello di nome file predefinito.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


Salva il file PS/EPS in un file immagine nella directory specificata con il nome file specificato. L'estensione del file corrisponderà al formato immagine indicato nel parametro \"options\".

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
