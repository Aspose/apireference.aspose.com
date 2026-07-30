---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method"
linktitle: "UpdateNamesByNameId"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId 方法。选择所有与逻辑字符串类别相关的记录，该类别由参数 nameId 指定，并更新这些记录中的 name 字段（字符串数据）。与平台（platformID、Platform-specific encoding ID）和语言（Language ID）相关的字段不受此方法影响。仅替换 name 字符串数据为新名称。使用此方法时需谨慎，因为它会替换所有平台和语言中与 nameId 相关的原始名称。若原始名称在不同平台或语言下具有不同值，替换操作会将这些值全部改为同一个新值，可能导致冲突，并且该新值在某些平台和语言上可能存在逻辑不一致。此方法适用于原始名称在所有平台和语言中只有单一表示的情况，例如，当 name 字符串数据在 C++ 中使用英文时。"
type: docs
weight: 1100
url: /zh/cpp/aspose.font.ttftables/ttfnametable/updatenamesbynameid/
---
## TtfNameTable::UpdateNamesByNameId method


选择所有与逻辑字符串类别相关的记录，由参数 nameId 指定，并更新这些记录中的 name 字段（字符串数据）。平台相关的字段（platformID、平台特定编码 ID）和语言相关的字段（Language ID）不受此方法影响。仅替换 name 字符串数据为新名称。使用此方法时请谨慎，因为它会替换所有平台和语言中与 nameId 相关的原始名称。当原始名称具有不同值时可能会产生冲突，因为替换操作会将所有这些值改为单一的新值。且此新值可能在某些平台和语言上出现逻辑不一致。此方法适用于原始名称在所有平台和语言上只有单一表示的情况，例如 name 字符串数据为英文时。

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId(TtfNameTable::NameId nameId, System::String newName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | 名称标识符、逻辑字符串类别，由 [NameId](../nameid/) 枚举指定。 |
| newName | System::String | 新名称或新字符串数据 |

## 另见

* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
