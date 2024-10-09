---
title: Aspose::Page::XPS::XpsDocument::SaveAsImage method
linktitle: SaveAsImage
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument::SaveAsImage method. Saves the document in a bitmap image format in C++.'
type: docs
weight: 5500
url: /cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage method


Saves the document in a bitmap image format.

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Options for saving the document in a bitmap image format. |

### ReturnValue

The resulting images byte arrays. The first dimension is for inner documents and the second one is for pages within inner documents.

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
