---
title: "Aspose::Page::EPS::PsDocument::MergeToPdf method"
linktitle: "MergeToPdf"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::MergeToPdf method. Объединяет файлы PS/EPS в устройство в C++."
type: docs
weight: 3700
url: /ru/cpp/aspose.page.eps/psdocument/mergetopdf/
---
## PsDocument::MergeToPdf(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) method


Объединяет файлы PS/EPS в устройство.

```cpp
void Aspose::Page::EPS::PsDocument::MergeToPdf(System::SharedPtr<System::IO::Stream> pdfStream, System::ArrayPtr<System::String> filesForMerge, System::SharedPtr<SaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| filesForMerge | System::SharedPtr\<System::IO::Stream\> | Файлы PS/EPS для объединения с этим файлом в выходное устройство. |
| pdfStream | System::ArrayPtr\<System::String\> | Выходной поток PDF. |
| параметры | System::SharedPtr\<SaveOptions\> | Содержит флаги, указывающие вывод ошибок, возникших во время преобразования. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::MergeToPdf(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) method


Объединяет файлы PS/EPS в устройство.

```cpp
void Aspose::Page::EPS::PsDocument::MergeToPdf(System::String outPdfFilePath, System::ArrayPtr<System::String> filesForMerge, System::SharedPtr<SaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| filesForMerge | System::String | Файлы PS/EPS для объединения с этим файлом в выходное устройство. |
| outPdfFilePath | System::ArrayPtr\<System::String\> | Путь к выходному PDF‑файлу. |
| параметры | System::SharedPtr\<SaveOptions\> | Содержит флаги, указывающие вывод ошибок, возникших во время преобразования. |

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
