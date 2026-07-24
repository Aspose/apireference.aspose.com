---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes metodo"
linktitle: "SaveAsImageBytes"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes metodo. Salva il documento in un formato di immagine bitmap come array di byte in C++."
type: docs
weight: 5600
url: /it/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


Salva il documento in formato immagine bitmap come array di byte.

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opzioni per salvare il documento in formato immagine bitmap. |

### ReturnValue

Gli array di byte delle immagini risultanti. La prima dimensione è per i documenti interni e la seconda è per le pagine all'interno dei documenti interni.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
