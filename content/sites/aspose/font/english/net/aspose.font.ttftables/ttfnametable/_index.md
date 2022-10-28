---
title: TtfNameTable
second_title: Aspose.Font for .NET API Reference
description: Represents name table of the TTF Font file.
type: docs
weight: 930
url: /net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

Represents "name" table of the TTF Font file.

```csharp
public class TtfNameTable : TtfTableBase
```

## Properties

| Name | Description |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | Gets offset from beginning of sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | Reference to TTF table repository. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag/) { get; } | Gets table tag. |

## Methods

| Name | Description |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames/)(MultiLanguageString, PlatformId, ushort, NameId) | Extracts all multilingual strings from passed *mlNames* object and creates correspondent NameRecord structure for every string extracted using passed parameters *platformId*, *platformSpecificId* and *nameId*. Value for field languageID is extracted from *mlNames* object. New just created record is added into table. If record which coincides with just created by fields platformID, platformSpecificID, nameID and, langugeId will be found, then new created record will not be added and only string data will be updated for existing record. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname/)(NameId, PlatformId, int, int, string) | Adds entry into the table. String data category to add is specified by *name* parameter. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords)(PlatformId, ushort) | Deletes all the records related to platform specified |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords_1)(PlatformId, ushort, NameId) | Deletes all the records related to passed parameters |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords_2)(PlatformId, ushort, NameId, ushort) | Deletes record(s) related to parameters specified |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid/)(NameId) | Deletes all the records related to passed nameId parameter |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords/)() | Returns all [`NameRecord`](../ttfnametable.namerecord/) structures from table |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid)(NameId) | Returns a name by nameId. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid_1)(NameId, PlatformId) | Returns a name by nameId using platform identifier passed. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | Returns a name as object of type [`MultiLanguageString`](../../aspose.font/multilanguagestring/). Method collects all NameRecord structures which coincide with passed parameters nameId, platformId and platformSpecificId and then builds resultant object based on this structures list. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid/)(NameId) | Returns a name by nameId if found, null otherwise |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid/)(NameId) | Returns all [`NameRecord`](../ttfnametable.namerecord/) structures which NameId field is equal to passed *nameId* value. If no records found, empty array will be returned. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename/)(PlatformId, ushort, NameId, ushort, string) | Updates name in record(s) which related to specified platform (combination of platformId and platformSpecificId), category (nameId) and language (languageId). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid/)(NameId, string) | Selects all records which related to logical string category, specified by parameter nameId and updates name field (string data) in these records. Fields related to platform (platformID, Platform-specific encoding ID) and language (Language ID) are not affected by this method. Only name string data is replaced with a new name. Use this method with caution, cause it will replace original names for all platforms and languages, related to nameId. It can make a conflicts for cases when original names had different values, cause replace operation changes all these values with new single one.And this new value may have a logical inconsistency with some platforms and languages. This method is useful for cases when original name has single representation for all platforms and languages, for example, when name string data is in english language. |

## Other Members

| Name | Description |
| --- | --- |
| enum [MacLanguageId](../../aspose.font.ttftables/ttfnametable.maclanguageid) | Macintosh platform language id enumeration. |
| enum [MacPlatformSpecificId](../../aspose.font.ttftables/ttfnametable.macplatformspecificid) | Represents Macintosh platform PlatformSpecificId enumeration. |
| enum [MSLanguageId](../../aspose.font.ttftables/ttfnametable.mslanguageid) | Microsoft platform language id enumeration. |
| enum [MSPlatformSpecificId](../../aspose.font.ttftables/ttfnametable.msplatformspecificid) | Represents Microsoft platform PlatformSpecificId enumeration. |
| enum [NameId](../../aspose.font.ttftables/ttfnametable.nameid) | Represents NameId. |
| class [NameRecord](../../aspose.font.ttftables/ttfnametable.namerecord) | Represents NameRecord structure of the 'name' table |
| enum [PlatformId](../../aspose.font.ttftables/ttfnametable.platformid) | Represents PlatformId enumeration. |
| enum [UnicodePlatformSpecificId](../../aspose.font.ttftables/ttfnametable.unicodeplatformspecificid) | Represents unicode platform-specific enumeration. |

### See Also

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
