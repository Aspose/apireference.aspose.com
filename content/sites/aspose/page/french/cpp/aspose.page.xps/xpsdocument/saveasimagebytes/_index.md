---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes méthode"
linktitle: "SaveAsImageBytes"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes méthode. Enregistre le document au format image bitmap sous forme de tableaux d'octets en C++."
type: docs
weight: 5600
url: /fr/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


Enregistre le document au format image bitmap sous forme de tableaux d'octets.

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Options pour enregistrer le document au format d'image bitmap. |

### ReturnValue

Les tableaux d'octets des images résultantes. La première dimension correspond aux documents internes et la seconde aux pages au sein des documents internes.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
