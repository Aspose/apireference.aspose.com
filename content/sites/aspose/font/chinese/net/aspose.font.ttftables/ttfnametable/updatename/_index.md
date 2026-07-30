---
title: "TtfNameTable.UpdateName"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfNameTable 方法。更新与指定平台组合 platformId 和 platformSpecificId、类别 nameId 以及语言 languageId 相关的记录中的名称。"
type: docs
weight: 90
url: /zh/net/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable.UpdateName method

更新与指定平台（platformId 与 platformSpecificId 的组合）、类别（nameId）和语言（languageId）相关的记录中的名称。

```csharp
public void UpdateName(PlatformId platformId, ushort platformSpecificId, NameId nameId, 
    ushort languageId, string newName)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| platformId | PlatformId | 平台标识符 |
| platformSpecificId | UInt16 | 平台特定编码标识符 |
| nameId | NameId | 名称标识符、逻辑字符串类别，由[`NameId`](../../ttfnametable.nameid/) 枚举指定 |
| languageId | UInt16 | 语言标识符 |
| newName | String | 新名称或新字符串数据 |

### 另见

* enum [PlatformId](../../ttfnametable.platformid/)
* enum [NameId](../../ttfnametable.nameid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


