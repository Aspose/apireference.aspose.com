---
title: Aspose::Font::TtfTables::TtfNameTable class
linktitle: TtfNameTable
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfNameTable class. Represents "name" table of the TTF Font file in C++.'
type: docs
weight: 1300
url: /cpp/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class


Represents "name" table of the TTF [Font](../../aspose.font/font/) file.

```cpp
class TtfNameTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [NameRecord](./namerecord/)
## Enums

| Enum | Description |
| --- | --- |
| [MacLanguageId](./maclanguageid/) | Macintosh platform language id enumeration. |
| [MacPlatformSpecificId](./macplatformspecificid/) | Represents Macintosh platform PlatformSpecificId enumeration. |
| [MSLanguageId](./mslanguageid/) | Microsoft platform language id enumeration. |
| [MSPlatformSpecificId](./msplatformspecificid/) | Represents Microsoft platform PlatformSpecificId enumeration. |
| [NameId](./nameid/) | Represents [NameId](./nameid/). |
| [PlatformId](./platformid/) | Represents [PlatformId](./platformid/) enumeration. |
| [UnicodePlatformSpecificId](./unicodeplatformspecificid/) | Represents unicode platform-specific enumeration. |
## Methods

| Method | Description |
| --- | --- |
| [AddMultiLanguageNames](./addmultilanguagenames/)(System::SharedPtr\<MultiLanguageString\>, TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Extracts all multilingual strings from passed *mlNames*  object and creates correspondent [NameRecord](./namerecord/) structure for every string extracted using passed parameters *platformId* , *platformSpecificId*  and *nameId* . Value for field languageID is extracted from *mlNames*  object. New just created record is added into table. If record which coincides with just created by fields platformID, platformSpecificID, nameID and, langugeId will be found, then new created record will not be added and only string data will be updated for existing record. |
| [AddName](./addname/)(TtfNameTable::NameId, TtfNameTable::PlatformId, int32_t, int32_t, System::String) | Adds entry into the table. String data category to add is specified by *name*  parameter. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Deletes all the records related to passed parameters. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t) | Deletes all the records related to platform specified. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t) | Deletes record(s) related to parameters specified. |
| [DeleteRecordsByNameId](./deleterecordsbynameid/)(TtfNameTable::NameId) | Deletes all the records related to passed nameId parameter. |
| static [get_Tag](./get_tag/)() | Gets table tag. |
| [GetAllNameRecords](./getallnamerecords/)() | Returns all [NameRecord](./namerecord/) structures from table. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId) | Returns a name by nameId. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId) | Returns a name by nameId using platform identifier passed. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) | Returns a name as object of type [MultiLanguageString](../../aspose.font/multilanguagestring/). Method collects all [NameRecord](./namerecord/) structures which coincide with passed parameters nameId, platformId and platformSpecificId and then builds resultant object based on this structures list. |
| [GetNameById](./getnamebyid/)(TtfNameTable::NameId) | Returns a name by nameId if found, null otherwise. |
| [GetNameRecordsByNameId](./getnamerecordsbynameid/)(TtfNameTable::NameId) | Returns all [NameRecord](./namerecord/) structures which [NameId](./nameid/) field is equal to passed *nameId*  value. If no records found, empty array will be returned. |
| [UpdateName](./updatename/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t, System::String) | Updates name in record(s) which related to specified platform (combination of platformId and platformSpecificId), category (nameId) and language (languageId). |
| [UpdateNamesByNameId](./updatenamesbynameid/)(TtfNameTable::NameId, System::String) | Selects all records which related to logical string category, specified by parameter nameId and updates name field (string data) in these records. Fields related to platform (platformID, Platform-specific encoding ID) and language (Language ID) are not affected by this method. Only name string data is replaced with a new name. Use this method with caution, cause it will replace original names for all platforms and languages, related to nameId. It can make a conflicts for cases when original names had different values, cause replace operation changes all these values with new single one.And this new value may have a logical inconsistency with some platforms and languages. This method is useful for cases when original name has single representation for all platforms and languages, for example, when name string data is in english language. |
## See Also

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
