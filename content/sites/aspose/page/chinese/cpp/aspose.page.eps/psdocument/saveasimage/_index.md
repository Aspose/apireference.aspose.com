---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage 方法"
linktitle: "SaveAsImage"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage 方法。 将 PS/EPS 文件保存为图像文件。 输出目录和文件名将与输入的 PS 文件相同。 文件扩展名将对应于 \"options\" 参数中的图像格式。 如果文档是使用非 FileStream 的流初始化的，图像文件将使用默认文件名模板保存在当前文件夹中，使用 C++。"
type: docs
weight: 4300
url: /zh/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


将 PS/EPS 文件保存为图像文件。输出目录和文件名将与输入的 PS 文件相同。文件扩展名将对应于 \"options\" 参数中的图像格式。如果文档是使用非 FileStream 的流初始化的，图像文件将保存在当前文件夹中，使用默认的文件名模板。

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


将 PS/EPS 文件保存为图像文件到指定目录，并使用指定的文件名。文件扩展名将对应于 \"options\" 参数中的图像格式。

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
