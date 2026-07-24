---
title: "Metodo Aspose::Page::XPS::XpsDocument::SaveAsImage"
linktitle: "SaveAsImage"
second_title: "Aspose.Page per C++"
description: "Metodo Aspose::Page::XPS::XpsDocument::SaveAsImage. Salva il documento in un file immagine. La directory di output e il nome del file saranno gli stessi del file XPS di input. L'estensione del file corrisponderà al formato immagine nel parametro \\\"options\\\". Se il documento è stato inizializzato con uno stream che non è FileStream, il file immagine verrà salvato nella cartella corrente con il modello di nome file predefinito in C++."
type: docs
weight: 5500
url: /it/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Salva il documento in un file immagine. La directory di output e il nome file saranno gli stessi del file [XPS](../../) di input. L'estensione del file corrisponderà al formato immagine nel parametro "options". Se il documento è stato inizializzato con uno stream che non è FileStream, il file immagine verrà salvato nella cartella corrente con il modello di nome file predefinito.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opzioni per salvare il documento in formato immagine bitmap. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Salva il documento in un file immagine nella directory specificata con il nome file specificato. L'estensione del file corrisponderà al formato immagine nel parametro "options".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opzioni per salvare il documento in formato immagine bitmap. |
| outDir | System::String | La directory di output dove verrà salvato il file immagine. |
| fileNameTemplate | System::String | Il modello di nome file per l'immagine (senza estensione). Se il file [XPS](../../) di input è a 1 pagina, sarà esattamente il nome file, altrimenti "_[n]", dove "n" è il numero di pagina a partire da 0, al quale verrà aggiunto il suffisso. L'estensione del file corrisponderà al formato immagine nel parametro "option". |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
