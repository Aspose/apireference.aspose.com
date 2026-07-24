---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes metod"
linktitle: "SaveAsImageBytes"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes metod. Sparar dokumentet i ett bitmap-bildformat som byte-arrayer i C++."
type: docs
weight: 5600
url: /sv/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


Sparar dokumentet i bitmap‑bildformat som byte‑arrayer.

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| alternativ | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Alternativ för att spara dokumentet i ett bitmap-bildformat. |

### ReturnValue

De resulterande bildernas byte-arrayer. Den första dimensionen är för inre dokument och den andra är för sidor inom inre dokument.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
