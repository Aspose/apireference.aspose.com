---
title: "Aspose::Page::XPS::XpsDocument::MergeToPdf メソッド"
linktitle: "MergeToPdf"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::MergeToPdf メソッド。C++ で Device インスタンスを使用して XPS ドキュメントを PDF に結合します。"
type: docs
weight: 4800
url: /ja/cpp/aspose.page.xps/xpsdocument/mergetopdf/
---
## XpsDocument::MergeToPdf(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) method


[XPS](../../) ドキュメントを PDF に結合する際に、[Device](../) インスタンスを使用します。

```cpp
void Aspose::Page::XPS::XpsDocument::MergeToPdf(System::ArrayPtr<System::String> filesForMerge, System::SharedPtr<System::IO::Stream> pdfStream, System::SharedPtr<Presentation::Pdf::PdfSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filesForMerge | System::ArrayPtr\<System::String\> | このドキュメントと結合するための [XPS](../../) ファイルを出力デバイスに使用します。 |
| pdfStream | System::SharedPtr\<System::IO::Stream\> | 出力 PDF ストリームです。 |
| options | System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\> | [Document](../../../aspose.page/document/) の保存オプション。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PdfSaveOptions](../../../aspose.page.xps.presentation.pdf/pdfsaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::MergeToPdf(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) method


[XPS](../../) ドキュメントを PDF に結合する際に、[Device](../) インスタンスを使用します。

```cpp
void Aspose::Page::XPS::XpsDocument::MergeToPdf(System::ArrayPtr<System::String> filesForMerge, System::String outPdfFilePath, System::SharedPtr<Presentation::Pdf::PdfSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filesForMerge | System::ArrayPtr\<System::String\> | このドキュメントと結合するための [XPS](../../) ファイルを出力デバイスに使用します。 |
| outPdfFilePath | System::String | 出力 PDF ファイルのパスです。 |
| options | System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\> | [Document](../../../aspose.page/document/) の保存オプション。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PdfSaveOptions](../../../aspose.page.xps.presentation.pdf/pdfsaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
