---
title: "Aspose::Page::EPS::PsDocument::MergeToPdf 方法"
linktitle: "MergeToPdf"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::MergeToPdf 方法。将 PS/EPS 文件合并到设备（在 C++ 中）。"
type: docs
weight: 3700
url: /zh/cpp/aspose.page.eps/psdocument/mergetopdf/
---
## PsDocument::MergeToPdf(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) method


将 PS/EPS 文件合并到设备。

```cpp
void Aspose::Page::EPS::PsDocument::MergeToPdf(System::SharedPtr<System::IO::Stream> pdfStream, System::ArrayPtr<System::String> filesForMerge, System::SharedPtr<SaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| filesForMerge | System::SharedPtr\<System::IO::Stream\> | 用于与此文件合并到输出设备的 PS/EPS 文件。 |
| pdfStream | System::ArrayPtr\<System::String\> | 输出 PDF 流。 |
| 选项 | System::SharedPtr\<SaveOptions\> | 包含指定在转换期间抛出的错误输出的标志。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::MergeToPdf(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) method


将 PS/EPS 文件合并到设备。

```cpp
void Aspose::Page::EPS::PsDocument::MergeToPdf(System::String outPdfFilePath, System::ArrayPtr<System::String> filesForMerge, System::SharedPtr<SaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| filesForMerge | System::String | 用于与此文件合并到输出设备的 PS/EPS 文件。 |
| outPdfFilePath | System::ArrayPtr\<System::String\> | 输出 PDF 文件的路径。 |
| 选项 | System::SharedPtr\<SaveOptions\> | 包含指定在转换期间抛出的错误输出的标志。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
