---
title: "Aspose::Font::TtfTables::TtfNameTable::AddName method"
linktitle: "AddName"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddName method. Добавляет запись в таблицу. Категория строковых данных для добавления указывается параметром name в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable::AddName method


Добавляет запись в таблицу. Категория строковых данных для добавления указывается параметром *name*.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddName(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, int32_t platformSpecificId, int32_t languageId, System::String name)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Идентификатор имени, логическая строковая категория, указанная перечислением [NameId](../nameid/) |
| platformId | TtfNameTable::PlatformId | Идентификатор платформы |
| platformSpecificId | int32_t | Идентификатор кодировки, специфичный для платформы. Пожалуйста, используйте значение из одной из следующих перечислений — [UnicodePlatformSpecificId](../unicodeplatformspecificid/), [MacPlatformSpecificId](../macplatformspecificid/), [MSPlatformSpecificId](../msplatformspecificid/). Какое перечисление использовать, определяется контекстом (параметр *platformId*). |
| languageId | int32_t | Идентификатор языка. Пожалуйста, используйте значение из перечислений [MSLanguageId](../mslanguageid/) или [MacLanguageId](../maclanguageid/), зависящих от контекста, определяемого параметром *platformId*. |
| имя | System::String | Фактические строковые данные |

## См. также

* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
