---
title: "TtfNameTable.AddMultiLanguageNames"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfNameTable 方法。提取传入的 mlNames 对象中的所有多语言字符串，并使用传入的参数 platformId platformSpecificId 和 nameId 为每个提取的字符串创建相应的 NameRecord 结构。字段 languageID 的值从 mlNames 对象中提取。新创建的记录被添加到表中。如果找到与新创建记录在 platformID、platformSpecificID、nameID 和 langugeId 字段上相同的记录，则不会添加新记录，只会更新现有记录的字符串数据。"
type: docs
weight: 10
url: /zh/net/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable.AddMultiLanguageNames method

从传入的 *mlNames* 对象中提取所有多语言字符串，并使用传入的参数 *platformId*、*platformSpecificId* 和 *nameId* 为每个提取的字符串创建相应的 NameRecord 结构。字段 languageID 的值从 *mlNames* 对象中提取。新创建的记录被添加到表中。如果发现已有记录在 platformID、platformSpecificID、nameID 和 languageId 上与新创建的记录相同，则不会添加新记录，只会更新现有记录的字符串数据。

```csharp
public void AddMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, 
    ushort platformSpecificId, NameId nameId)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| mlNames | MultiLanguageString | 多语言字符串 |
| platformId | PlatformId | 平台标识符 |
| platformSpecificId | UInt16 | 平台特定编码标识符 |
| nameId | NameId | 名称标识符、逻辑字符串类别，由[`NameId`](../../ttfnametable.nameid/) 枚举指定 |

### 另见

* class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* enum [PlatformId](../../ttfnametable.platformid/)
* enum [NameId](../../ttfnametable.nameid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


