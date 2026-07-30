---
title: "TtfNameTable.UpdateNamesByNameId"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfNameTable 方法。选择所有与参数 nameId 指定的逻辑字符串类别相关的记录，并更新这些记录中的 name 字段字符串数据。与平台 platformID、平台特定编码 ID 和语言 Language ID 相关的字段不受此方法影响。仅替换 name 字符串数据为新名称。使用此方法时请谨慎，因为它会替换与 nameId 相关的所有平台和语言的原始名称。若原始名称在不同平台或语言中具有不同值，替换操作会将这些值全部改为单一的新值，可能导致冲突，并且该新值可能与某些平台和语言在逻辑上不一致。此方法适用于原始名称在所有平台和语言中只有单一表示的情况，例如 name 字符串数据为英文时。"
type: docs
weight: 100
url: /zh/net/aspose.font.ttftables/ttfnametable/updatenamesbynameid/
---
## TtfNameTable.UpdateNamesByNameId method

选择所有与逻辑字符串类别（由参数 nameId 指定）相关的记录，并更新这些记录中的 name 字段（字符串数据）。与平台（platformID、平台特定编码 ID）和语言（Language ID）相关的字段不受此方法影响。仅将名称字符串数据替换为新名称。使用此方法时请谨慎，因为它会替换所有与 nameId 相关的平台和语言的原始名称。这可能导致冲突，例如原始名称在不同平台或语言上有不同值时，替换操作会将所有这些值改为单一的新值，而该新值可能与某些平台和语言逻辑不一致。当原始名称在所有平台和语言上只有单一表示时（例如名称字符串数据为英文），此方法非常有用。

```csharp
public void UpdateNamesByNameId(NameId nameId, string newName)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | NameId | 名称标识符、逻辑字符串类别，由[`NameId`](../../ttfnametable.nameid/) 枚举指定 |
| newName | String | 新名称或新字符串数据 |

### 另见

* enum [NameId](../../ttfnametable.nameid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


