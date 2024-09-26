---
title: Aspose::Font::TtfTables::TtfNameTable::UpdateName method
linktitle: UpdateName
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfNameTable::UpdateName method. Updates name in record(s) which related to specified platform (combination of platformId and platformSpecificId), category (nameId) and language (languageId) in C++.'
type: docs
weight: 500
url: /cpp/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable::UpdateName method


Updates name in record(s) which related to specified platform (combination of platformId and platformSpecificId), category (nameId) and language (languageId).

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateName(TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId, uint16_t languageId, System::String newName)
```


| Parameter | Type | Description |
| --- | --- | --- |
| platformId | TtfNameTable::PlatformId | Platform identifier |
| platformSpecificId | uint16_t | Platform-specific encoding identifier |
| nameId | TtfNameTable::NameId | Name identifier, logical string category, specified by [NameId](../nameid/) enumeration |
| languageId | uint16_t | Language identifier |
| newName | System::String | New name or new string data |

## See Also

* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
