---
title: Aspose::Page::EPS::PsDocument::SaveAsImage method
linktitle: SaveAsImage
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument::SaveAsImage method. Saves PS/EPS file to images bytes arrays in C++.'
type: docs
weight: 600
url: /cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage method


Saves PS/EPS file to images bytes arrays.

```cpp
System::ArrayPtr<System::ArrayPtr<uint8_t>> Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<Device::ImageSaveOptions\> | Contains necessary parameters for saving image and flags that specify output of errors thrown during conversion. |

### ReturnValue

**Images** bytes. One byte array for one page.

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
