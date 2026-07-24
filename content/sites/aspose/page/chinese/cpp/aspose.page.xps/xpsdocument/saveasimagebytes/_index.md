---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes 方法"
linktitle: "SaveAsImageBytes"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes 方法。以位图图像格式将文档保存为字节数组，使用 C++。"
type: docs
weight: 5600
url: /zh/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


以位图图像格式将文档保存为字节数组。

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 选项 | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | 以位图图像格式保存文档的选项。 |

### ReturnValue

生成的图像字节数组。第一维表示内部文档，第二维表示内部文档中的页面。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
