---
title: Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method
linktitle: UpdateNamesByNameId
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method. Selects all records which related to logical string category, specified by parameter nameId and updates name field (string data) in these records. Fields related to platform (platformID, Platform-specific encoding ID) and language (Language ID) are not affected by this method. Only name string data is replaced with a new name. Use this method with caution, cause it will replace original names for all platforms and languages, related to nameId. It can make a conflicts for cases when original names had different values, cause replace operation changes all these values with new single one.And this new value may have a logical inconsistency with some platforms and languages. This method is useful for cases when original name has single representation for all platforms and languages, for example, when name string data is in english language in C++.'
type: docs
weight: 600
url: /cpp/aspose.font.ttftables/ttfnametable/updatenamesbynameid/
---
## TtfNameTable::UpdateNamesByNameId method


Selects all records which related to logical string category, specified by parameter nameId and updates name field (string data) in these records. Fields related to platform (platformID, Platform-specific encoding ID) and language (Language ID) are not affected by this method. Only name string data is replaced with a new name. Use this method with caution, cause it will replace original names for all platforms and languages, related to nameId. It can make a conflicts for cases when original names had different values, cause replace operation changes all these values with new single one.And this new value may have a logical inconsistency with some platforms and languages. This method is useful for cases when original name has single representation for all platforms and languages, for example, when name string data is in english language.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId(TtfNameTable::NameId nameId, System::String newName)
```


| Parameter | Type | Description |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Name identifier, logical string category, specified by [NameId](../nameid/) enumeration |
| newName | System::String | New name or new string data |

## See Also

* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
