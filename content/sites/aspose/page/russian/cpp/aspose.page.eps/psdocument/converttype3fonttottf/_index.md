---
title: "Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF метод"
linktitle: "ConvertType3FontToTTF"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF метод. Преобразует шрифт Type 3 в поток TrueType в C++."
type: docs
weight: 800
url: /ru/cpp/aspose.page.eps/psdocument/converttype3fonttottf/
---
## PsDocument::ConvertType3FontToTTF(System::String, System::SharedPtr\<System::IO::Stream\>) method


Преобразует шрифт Type 3 в поток **TrueType**.

```cpp
void Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF(System::String type3FontFilePath, System::SharedPtr<System::IO::Stream> outputStream)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type3FontFilePath | System::String | Путь к файлу шрифта Type 3. |
| outputStream | System::SharedPtr\<System::IO::Stream\> | Поток вывода, в котором сохраняется полученный шрифт **TrueType**. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ConvertType3FontToTTF(System::String, System::String) method


Преобразует шрифт Type 3 в **TrueType**. Имя преобразованного TTF‑шрифта будет таким же, как у входного файла шрифта Type 3, с расширением ".ttf". Файл TTF будет сохранён в указанную выходную директорию.

```cpp
void Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF(System::String type3FontFilePath, System::String outputDir)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type3FontFilePath | System::String | Путь к файлу шрифта Type 3. |
| outputDir | System::String | Каталог вывода, в котором сохраняется полученный шрифт **TrueType**. |

## См. также

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
