---
title: "Aspose::Font::TtfTables::TtfNameTable класс"
linktitle: "TtfNameTable"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfNameTable класс. Представляет таблицу \"name\" файла шрифта TTF в C++."
type: docs
weight: 1300
url: /ru/cpp/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class


Представляет таблицу "name" файла TTF [Font](../../aspose.font/font/).

```cpp
class TtfNameTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [NameRecord](./namerecord/)
## Enums

| Перечисление | Описание |
| --- | --- |
| [MacLanguageId](./maclanguageid/) | Перечисление идентификаторов языков платформы Macintosh. |
| [MacPlatformSpecificId](./macplatformspecificid/) | Представляет перечисление PlatformSpecificId платформы Macintosh. |
| [MSLanguageId](./mslanguageid/) | Перечисление идентификаторов языков платформы Microsoft. |
| [MSPlatformSpecificId](./msplatformspecificid/) | Представляет перечисление PlatformSpecificId платформы Microsoft. |
| [NameId](./nameid/) | Представляет [NameId](./nameid/). |
| [PlatformId](./platformid/) | Представляет перечисление [PlatformId](./platformid/). |
| [UnicodePlatformSpecificId](./unicodeplatformspecificid/) | Представляет платформенно-специфичное перечисление Unicode. |
## Методы

| Метод | Описание |
| --- | --- |
| [AddMultiLanguageNames](./addmultilanguagenames/)(System::SharedPtr\<MultiLanguageString\>, TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Извлекает все многоязычные строки из переданного объекта *mlNames* и создает соответствующую структуру [NameRecord](./namerecord/) для каждой извлечённой строки, используя переданные параметры *platformId*, *platformSpecificId* и *nameId*. Значение поля languageID извлекается из объекта *mlNames*. Только что созданная запись добавляется в таблицу. Если будет найдена запись, совпадающая с только что созданной по полям platformID, platformSpecificID, nameID и languageId, то новая запись не будет добавлена, а только данные строки будут обновлены для существующей записи. |
| [AddName](./addname/)(TtfNameTable::NameId, TtfNameTable::PlatformId, int32_t, int32_t, System::String) | Добавляет запись в таблицу. Категория строковых данных для добавления указывается параметром *name*. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Удаляет все записи, связанные с переданными параметрами. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t) | Удаляет все записи, связанные с указанной платформой. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t) | Удаляет запись(и), связанные с указанными параметрами. |
| [DeleteRecordsByNameId](./deleterecordsbynameid/)(TtfNameTable::NameId) | Удаляет все записи, связанные с переданным параметром nameId. |
| static [get_Tag](./get_tag/)() | Получает тег таблицы. |
| [GetAllNameRecords](./getallnamerecords/)() | Возвращает все структуры [NameRecord](./namerecord/) из таблицы. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId) | Возвращает имя по nameId. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId) | Возвращает имя по nameId, используя переданный идентификатор платформы. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) | Возвращает имя в виде объекта типа [MultiLanguageString](../../aspose.font/multilanguagestring/). Метод собирает все структуры [NameRecord](./namerecord/), которые совпадают с переданными параметрами nameId, platformId и platformSpecificId, а затем создает результирующий объект на основе этого списка структур. |
| [GetNameById](./getnamebyid/)(TtfNameTable::NameId) | Возвращает имя по nameId, если найдено, иначе null. |
| [GetNameRecordsByNameId](./getnamerecordsbynameid/)(TtfNameTable::NameId) | Возвращает все структуры [NameRecord](./namerecord/), у которых поле [NameId](./nameid/) равно переданному значению *nameId*. Если записи не найдены, будет возвращён пустой массив. |
| [UpdateName](./updatename/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t, System::String) | Обновляет имя в записи(ях), связанных с указанной платформой (комбинация platformId и platformSpecificId), категорией (nameId) и языком (languageId). |
| [UpdateNamesByNameId](./updatenamesbynameid/)(TtfNameTable::NameId, System::String) | Выбирает все записи, связанные с логической строковой категорией, указанной параметром nameId, и обновляет поле name (строковые данные) в этих записях. Поля, связанные с платформой (platformID, Platform-specific encoding ID) и языком (Language ID), не затрагиваются этим методом. Заменяется только строковое значение name на новое имя. Используйте этот метод с осторожностью, так как он заменит оригинальные имена для всех платформ и языков, связанных с nameId. Это может вызвать конфликты в случаях, когда оригинальные имена имели разные значения, поскольку операция замены меняет все эти значения на одно новое. И новое значение может иметь логическую несогласованность с некоторыми платформами и языками. Метод полезен в случаях, когда оригинальное имя имеет единственное представление для всех платформ и языков, например, когда строковые данные имени находятся в английском языке. |
## См. также

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
