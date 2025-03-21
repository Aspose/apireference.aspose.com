---
title: TtfNameTable.UpdateName
second_title: Aspose.Font for .NET API Reference
description: TtfNameTable method. Updates name in records which related to specified platform combination of platformId and platformSpecificId category nameId and language languageId
type: docs
weight: 90
url: /net/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable.UpdateName method

Updates name in record(s) which related to specified platform (combination of platformId and platformSpecificId), category (nameId) and language (languageId).

```csharp
public void UpdateName(PlatformId platformId, ushort platformSpecificId, NameId nameId, 
    ushort languageId, string newName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| platformId | PlatformId | Platform identifier |
| platformSpecificId | UInt16 | Platform-specific encoding identifier |
| nameId | NameId | Name identifier, logical string category, specified by [`NameId`](../../ttfnametable.nameid/) enumeration |
| languageId | UInt16 | Language identifier |
| newName | String | New name or new string data |

### See Also

* enum [PlatformId](../../ttfnametable.platformid/)
* enum [NameId](../../ttfnametable.nameid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


