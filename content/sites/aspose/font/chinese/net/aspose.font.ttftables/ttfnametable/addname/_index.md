---
title: "TtfNameTable.AddName"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfNameTable 方法。向表中添加条目。要添加的字符串数据类别由 name 参数指定"
type: docs
weight: 20
url: /zh/net/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable.AddName method

向表中添加条目。要添加的字符串数据类别由 *name* 参数指定。

```csharp
public void AddName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, 
    string name)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | NameId | 名称标识符、逻辑字符串类别，由[`NameId`](../../ttfnametable.nameid/) 枚举指定 |
| platformId | PlatformId | 平台标识符 |
| platformSpecificId | Int32 | 平台特定编码标识符。请使用以下枚举之一的值 - [`UnicodePlatformSpecificId`](../../ttfnametable.unicodeplatformspecificid/)、[`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/)、[`MSPlatformSpecificId`](../../ttfnametable.msplatformspecificid/)。使用哪种枚举由上下文（*platformId* 参数）决定 |
| languageId | Int32 | 语言标识符。请根据上下文使用 [`MSLanguageId`](../../ttfnametable.mslanguageid/) 或 [`MacLanguageId`](../../ttfnametable.maclanguageid/) 枚举的值，由 *platformId* 参数决定 |
| name | String | 实际字符串数据 |

### 另见

* enum [NameId](../../ttfnametable.nameid/)
* enum [PlatformId](../../ttfnametable.platformid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


