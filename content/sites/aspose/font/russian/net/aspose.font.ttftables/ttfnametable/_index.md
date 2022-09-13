---
title: TtfNameTable
second_title: Справочник по API Aspose.Font для .NET
description: Представляет таблицу имя файла шрифта TTF.
type: docs
weight: 900
url: /ru/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

Представляет таблицу «имя» файла шрифта TTF.

```csharp
public class TtfNameTable : TtfTableBase
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | Получает смещение от начала sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | Ссылка на репозиторий таблиц TTF. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag) { get; } | Получает тег таблицы. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames)(MultiLanguageString, PlatformId, ushort, NameId) | Извлекает все многоязычные строки из переданных*mlNames* объект and создает соответствующую структуру NameRecord для каждой строки, извлеченной с использованием переданных параметров *platformId* ,*platformSpecificId* а также*nameId* . Значение для поля languageID извлекается из*mlNames* объект. В таблицу добавляется новая только что созданная запись. Если будет найдена запись, совпадающая с только что созданной по полям platformID, platformSpecificID, nameID и, langugeId , то новая созданная запись не будет добавлена, а будут обновлены только строковые данные для существующей записи. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname)(NameId, PlatformId, int, int, string) | Добавляет запись в таблицу. Категория строковых данных для добавления определяется*name* параметр. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords)(PlatformId, ushort) | Удаляет все записи, относящиеся к указанной платформе |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_1)(PlatformId, ushort, NameId) | Удаляет все записи, относящиеся к переданным параметрам |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_2)(PlatformId, ushort, NameId, ushort) | Удаляет записи, относящиеся к указанным параметрам |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid)(NameId) | Удаляет все записи, связанные с переданным параметром nameId |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords)() | Возвращает все[`NameRecord`](../ttfnametable.namerecord) структуры из table |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid)(NameId) | Возвращает имя по nameId. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_1)(NameId, PlatformId) | Возвращает имя по nameId, используя переданный идентификатор платформы. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | Возвращает имя как объект типа[`MultiLanguageString`](../../aspose.font/multilanguagestring) . Метод собирает все структуры NameRecord, которые совпадают с переданными параметрами nameId, platformId и platformSpecificId, а затем строит результирующий объект на основе этого списка структур. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid)(NameId) | Возвращает имя по nameId, если найдено, иначе null |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid)(NameId) | Возвращает все[`NameRecord`](../ttfnametable.namerecord) структуры, поле NameId которых равно для передачи*nameId* ценность. Если записей не найдено, будет возвращен пустой массив. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename)(PlatformId, ushort, NameId, ushort, string) | Обновляет имя в записи (записях), относящейся к указанной платформе (комбинация идентификатора платформы и идентификатора платформы), категорию (идентификатор имени) и язык (идентификатор языка). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid)(NameId, string) | Выбирает все записи, относящиеся к категории логической строки, заданной параметром nameId, и обновляет поле имени (строковые данные) в этих записях. Этот метод не затрагивает поля, связанные с платформой (идентификатор платформы, идентификатор кодировки для конкретной платформы) и языком (идентификатор языка). Только данные строки имени заменяются новым именем. Используйте этот метод с осторожностью, поскольку он заменит исходные имена для всех платформ и языков, связанных с nameId. Это может вызвать конфликты для случаев, когда исходные имена имели разные значения, потому что операция замены изменяет все эти значения на новое одно. И это новое значение может иметь логическое несоответствие с некоторыми платформами и языками. Этот метод полезен в случаях, когда исходное имя имеет единое представление для всех платформ и языков, например, , когда данные строки имени представлены на английском языке. |

## Другие члены

| Имя | Описание |
| --- | --- |
| enum [MacLanguageId](ttfnametable.maclanguageid) | Перечисление идентификатора языка платформы Macintosh. |
| enum [MacPlatformSpecificId](ttfnametable.macplatformspecificid) | Представляет перечисление PlatformSpecificId для платформы Macintosh. |
| enum [MSLanguageId](ttfnametable.mslanguageid) | Перечисление идентификатора языка платформы Microsoft. |
| enum [MSPlatformSpecificId](ttfnametable.msplatformspecificid) | Представляет перечисление PlatformSpecificId платформы Microsoft. |
| enum [NameId](ttfnametable.nameid) | Представляет NameId. |
| class [NameRecord](ttfnametable.namerecord) | Представляет структуру NameRecord таблицы «имя» |
| enum [PlatformId](ttfnametable.platformid) | Представляет перечисление PlatformId. |
| enum [UnicodePlatformSpecificId](ttfnametable.unicodeplatformspecificid) | Представляет перечисление Unicode для конкретной платформы. |

### Смотрите также

* class [TtfTableBase](../ttftablebase)
* пространство имен [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* сборка [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
