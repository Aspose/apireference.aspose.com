---
title: TtfNameTable.UpdateNamesByNameId
second_title: Aspose.Font for .NET API Reference
description: TtfNameTable method. Selects all records which related to logical string category specified by parameter nameId and updates name field string data in these records. Fields related to platform platformID Platformspecific encoding ID and language Language ID are not affected by this method. Only name string data is replaced with a new name. Use this method with caution cause it will replace original names for all platforms and languages related to nameId. It can make a conflicts for cases when original names had different values cause replace operation changes all these values with new single one.And this new value may have a logical inconsistency with some platforms and languages. This method is useful for cases when original name has single representation for all platforms and languages for example when name string data is in english language
type: docs
weight: 100
url: /net/aspose.font.ttftables/ttfnametable/updatenamesbynameid/
---
## TtfNameTable.UpdateNamesByNameId method

Selects all records which related to logical string category, specified by parameter nameId and updates name field (string data) in these records. Fields related to platform (platformID, Platform-specific encoding ID) and language (Language ID) are not affected by this method. Only name string data is replaced with a new name. Use this method with caution, cause it will replace original names for all platforms and languages, related to nameId. It can make a conflicts for cases when original names had different values, cause replace operation changes all these values with new single one.And this new value may have a logical inconsistency with some platforms and languages. This method is useful for cases when original name has single representation for all platforms and languages, for example, when name string data is in english language.

```csharp
public void UpdateNamesByNameId(NameId nameId, string newName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| nameId | NameId | Name identifier, logical string category, specified by [`NameId`](../../ttfnametable.nameid/) enumeration |
| newName | String | New name or new string data |

### See Also

* enum [NameId](../../ttfnametable.nameid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../ttfnametable/)
* assembly [Aspose.Font](../../../)


