---
title: "Aspose::Page::EPS::PsDocument::MergeToPdf メソッド"
linktitle: "MergeToPdf"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::MergeToPdf メソッド。C++ で PS/EPS ファイルをデバイスにマージします。"
type: docs
weight: 3700
url: /ja/cpp/aspose.page.eps/psdocument/mergetopdf/
---
## PsDocument::MergeToPdf(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) method


PS/EPS ファイルをデバイスにマージします。

```cpp
void Aspose::Page::EPS::PsDocument::MergeToPdf(System::SharedPtr<System::IO::Stream> pdfStream, System::ArrayPtr<System::String> filesForMerge, System::SharedPtr<SaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filesForMerge | System::SharedPtr\<System::IO::Stream\> | このファイルとマージして出力デバイスに送る PS/EPS ファイル。 |
| pdfStream | System::ArrayPtr\<System::String\> | 出力 PDF ストリームです。 |
| options | System::SharedPtr\<SaveOptions\> | 変換中にスローされたエラーの出力を指定するフラグを含みます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::MergeToPdf(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) method


PS/EPS ファイルをデバイスにマージします。

```cpp
void Aspose::Page::EPS::PsDocument::MergeToPdf(System::String outPdfFilePath, System::ArrayPtr<System::String> filesForMerge, System::SharedPtr<SaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filesForMerge | System::String | このファイルとマージして出力デバイスに送る PS/EPS ファイル。 |
| outPdfFilePath | System::ArrayPtr\<System::String\> | 出力 PDF ファイルのパスです。 |
| options | System::SharedPtr\<SaveOptions\> | 変換中にスローされたエラーの出力を指定するフラグを含みます。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
