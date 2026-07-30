---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateName метод"
linktitle: "UpdateName"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateName метод. Обновляет имя в записи(ях), связанных с указанной платформой (комбинация platformId и platformSpecificId), категорией (nameId) и языком (languageId) в C++."
type: docs
weight: 1000
url: /ru/cpp/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable::UpdateName method


Обновляет имя в записи(ях), связанных с указанной платформой (комбинация platformId и platformSpecificId), категорией (nameId) и языком (languageId).

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateName(TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId, uint16_t languageId, System::String newName)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| platformId | TtfNameTable::PlatformId | Идентификатор платформы |
| platformSpecificId | uint16_t | Идентификатор кодировки, специфичной для платформы |
| nameId | TtfNameTable::NameId | Идентификатор имени, логическая строковая категория, указанная перечислением [NameId](../nameid/) |
| languageId | uint16_t | Идентификатор языка |
| newName | System::String | Новое имя или новые строковые данные |

## См. также

* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
