---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage 方法"
linktitle: "SaveAsImage"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage 方法。 将文档保存为图像文件。输出目录和文件名将与输入 XPS 文件相同。文件扩展名将对应于 \"options\" 参数中的图像格式。如果文档是使用非 FileStream 的流初始化的，图像文件将在当前文件夹中使用默认文件名模板保存，使用 C++。"
type: docs
weight: 5500
url: /zh/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


将文档保存为图像文件。输出目录和文件名将与输入的 [XPS](../../) 文件相同。文件扩展名将对应于 "options" 参数中的图像格式。如果文档是使用非 FileStream 的流初始化的，图像文件将保存在当前文件夹中，使用默认的文件名模板。

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 选项 | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | 以位图图像格式保存文档的选项。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


将文档保存为图像文件到指定目录，并使用指定的文件名。文件扩展名将对应于 "options" 参数中的图像格式。

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 选项 | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | 以位图图像格式保存文档的选项。 |
| outDir | System::String | 图像文件将被保存的输出目录。 |
| fileNameTemplate | System::String | 图像的文件名模板（不含扩展名）。如果输入的 [XPS](../../) 文件为单页，则文件名将完全相同；否则为 "_[n]"，其中 "n" 为从 0 开始的页码，后缀将追加到此。文件扩展名将对应于 "option" 参数中的图像格式。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
