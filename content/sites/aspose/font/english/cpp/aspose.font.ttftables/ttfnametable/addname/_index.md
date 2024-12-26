---
title: Aspose::Font::TtfTables::TtfNameTable::AddName method
linktitle: AddName
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfNameTable::AddName method. Adds entry into the table. String data category to add is specified by name  parameter in C++.'
type: docs
weight: 300
url: /cpp/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable::AddName method


Adds entry into the table. String data category to add is specified by *name*  parameter.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddName(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, int32_t platformSpecificId, int32_t languageId, System::String name)
```


| Parameter | Type | Description |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Name identifier, logical string category, specified by [NameId](../nameid/) enumeration |
| platformId | TtfNameTable::PlatformId | Platform identifier |
| platformSpecificId | int32_t | Platform-specific encoding identifier. Please, use value from one of such enumerations - [UnicodePlatformSpecificId](../unicodeplatformspecificid/), [MacPlatformSpecificId](../macplatformspecificid/), [MSPlatformSpecificId](../msplatformspecificid/). What enumeration to use is defined by context (*platformId*  parameter) |
| languageId | int32_t | Language identifier. Please, use value from [MSLanguageId](../mslanguageid/) or [MacLanguageId](../maclanguageid/) enumerations depend from context, defined by *platformId*  parameter. |
| name | System::String | Actual string data |

## See Also

* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
