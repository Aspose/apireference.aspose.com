---
title: "Aspose::Page::XPS::XpsDocument::MergeToPdf 方法"
linktitle: "MergeToPdf"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::MergeToPdf 方法。使用 C++ 中的 Device 实例将 XPS 文档合并为 PDF。"
type: docs
weight: 4800
url: /zh/cpp/aspose.page.xps/xpsdocument/mergetopdf/
---
## XpsDocument::MergeToPdf(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) method


使用 [Device](../) 实例将 [XPS](../../) 文档合并为 PDF。

```cpp
void Aspose::Page::XPS::XpsDocument::MergeToPdf(System::ArrayPtr<System::String> filesForMerge, System::SharedPtr<System::IO::Stream> pdfStream, System::SharedPtr<Presentation::Pdf::PdfSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| filesForMerge | System::ArrayPtr\<System::String\> | 用于与此文档合并到输出设备的 [XPS](../../) 文件。 |
| pdfStream | System::SharedPtr\<System::IO::Stream\> | 输出 PDF 流。 |
| options | System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\> | [Document](../../../aspose.page/document/) 保存选项。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PdfSaveOptions](../../../aspose.page.xps.presentation.pdf/pdfsaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::MergeToPdf(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) method


使用 [Device](../) 实例将 [XPS](../../) 文档合并为 PDF。

```cpp
void Aspose::Page::XPS::XpsDocument::MergeToPdf(System::ArrayPtr<System::String> filesForMerge, System::String outPdfFilePath, System::SharedPtr<Presentation::Pdf::PdfSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| filesForMerge | System::ArrayPtr\<System::String\> | 用于与此文档合并到输出设备的 [XPS](../../) 文件。 |
| outPdfFilePath | System::String | 输出 PDF 文件的路径。 |
| options | System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\> | [Document](../../../aspose.page/document/) 保存选项。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PdfSaveOptions](../../../aspose.page.xps.presentation.pdf/pdfsaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
