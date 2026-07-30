---
title: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames метод"
linktitle: "AddMultiLanguageNames"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames метод. Извлекает все многоязычные строки из переданного объекта mlNames и создаёт соответствующую структуру NameRecord для каждой извлечённой строки, используя переданные параметры platformId, platformSpecificId и nameId. Значение поля languageID извлекается из объекта mlNames. Новая только что созданная запись добавляется в таблицу. Если будет найдена запись, совпадающая с только что созданной по полям platformID, platformSpecificID, nameID и langugeId, то новая запись не будет добавлена, а только данные строки будут обновлены для существующей записи в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable::AddMultiLanguageNames method


Извлекает все многоязычные строки из переданного *mlNames* объекта и создаёт соответствующую структуру [NameRecord](../namerecord/) для каждой извлечённой строки, используя переданные параметры *platformId*, *platformSpecificId* и *nameId*. Значение поля languageID извлекается из *mlNames* объекта. Новая только что созданная запись добавляется в таблицу. Если будет найдена запись, совпадающая с только что созданной по полям platformID, platformSpecificID, nameID и langugeId, то новая запись не будет добавлена, а только данные строки будут обновлены для существующей записи.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames(System::SharedPtr<MultiLanguageString> mlNames, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| mlNames | System::SharedPtr\<MultiLanguageString\> | Многоязычная строка |
| platformId | TtfNameTable::PlatformId | Идентификатор платформы |
| platformSpecificId | uint16_t | Идентификатор кодировки, специфичной для платформы |
| nameId | TtfNameTable::NameId | Идентификатор имени, логическая строковая категория, указанная перечислением [NameId](../nameid/) |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
