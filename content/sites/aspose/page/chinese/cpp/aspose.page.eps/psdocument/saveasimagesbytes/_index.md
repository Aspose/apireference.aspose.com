---
title: "Aspose::Page::EPS::PsDocument::SaveAsImagesBytes 方法"
linktitle: "SaveAsImagesBytes"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::SaveAsImagesBytes 方法。 在 C++ 中将 PS/EPS 文件保存为图像字节数组。"
type: docs
weight: 4400
url: /zh/cpp/aspose.page.eps/psdocument/saveasimagesbytes/
---
## PsDocument::SaveAsImagesBytes method


将 PS/EPS 文件保存为图像字节数组。

```cpp
System::ArrayPtr<System::ArrayPtr<uint8_t>> Aspose::Page::EPS::PsDocument::SaveAsImagesBytes(System::SharedPtr<Device::ImageSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 选项 | System::SharedPtr\<Device::ImageSaveOptions\> | 包含用于保存图像的必要参数以及指定转换期间抛出错误输出的标志。 |

### ReturnValue

**Images** bytes. One byte array for one page.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
