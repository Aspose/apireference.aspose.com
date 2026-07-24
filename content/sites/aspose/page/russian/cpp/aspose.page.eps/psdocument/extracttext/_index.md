---
title: "Метод Aspose::Page::EPS::PsDocument::ExtractText"
linktitle: "ExtractText"
second_title: "Aspose.Page для C++"
description: "Метод Aspose::Page::EPS::PsDocument::ExtractText. Извлекает текст из файла PS. Текст может быть извлечён только если он записан шрифтом Type 42 (TrueType) или шрифтом Type 0 с шрифтами Type 42 в его векторной карте в C++."
type: docs
weight: 2300
url: /ru/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Извлекает текст из файла PS. Текст может быть извлечён только если он записан шрифтом Type 42 (**TrueType**) или шрифтом Type 0 с шрифтами Type 42 в его векторной карте.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| параметры | System::SharedPtr\<SaveOptions\> | Параметры сохранения. |
| startPage | int32_t | Страница, с которой начинать извлечение текста. Этот параметр полезен для многостраничных документов. |
| endPage | int32_t | Страница, до которой следует завершить извлечение текста. Этот параметр полезен для многостраничных документов. |

### ReturnValue

Извлечённый текст.

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
