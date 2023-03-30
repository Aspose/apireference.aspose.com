---
title: TtfNameTable.AddMultiLanguageNames
second_title: Aspose.Font for .NET API Reference
description: TtfNameTable method. Extracts all multilingual strings from passed mlNames object and creates correspondent NameRecord structure for every string extracted using passed parameters platformId platformSpecificId and nameId. Value for field languageID is extracted from mlNames object. New just created record is added into table. If record which coincides with just created by fields platformID platformSpecificID nameID and langugeId will be found then new created record will not be added and only string data will be updated for existing record
type: docs
weight: 10
url: /net/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable.AddMultiLanguageNames method

Extracts all multilingual strings from passed *mlNames* object and creates correspondent NameRecord structure for every string extracted using passed parameters *platformId*, *platformSpecificId* and *nameId*. Value for field languageID is extracted from *mlNames* object. New just created record is added into table. If record which coincides with just created by fields platformID, platformSpecificID, nameID and, langugeId will be found, then new created record will not be added and only string data will be updated for existing record.

```csharp
public void AddMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, 
    ushort platformSpecificId, NameId nameId)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mlNames | MultiLanguageString | Multilingual string |
| platformId | PlatformId | Platform identifier |
| platformSpecificId | UInt16 | Platform-specific encoding identifier |
| nameId | NameId | Name identifier, logical string category, specified by [`NameId`](../../ttfnametable.nameid/) enumeration |

### See Also

* class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* enum [PlatformId](../../ttfnametable.platformid/)
* enum [NameId](../../ttfnametable.nameid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../ttfnametable/)
* assembly [Aspose.Font](../../../)


