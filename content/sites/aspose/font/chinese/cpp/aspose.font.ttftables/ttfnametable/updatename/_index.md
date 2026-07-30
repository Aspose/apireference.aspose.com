---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateName 方法"
linktitle: "UpdateName"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateName method. 更新记录中与指定平台（platformId 和 platformSpecificId 的组合）、类别（nameId）和语言（languageId）相关的名称，使用 C++。"
type: docs
weight: 1000
url: /zh/cpp/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable::UpdateName method


更新与指定平台（platformId 与 platformSpecificId 的组合）、类别（nameId）和语言（languageId）相关的记录中的名称。

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateName(TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId, uint16_t languageId, System::String newName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| platformId | TtfNameTable::PlatformId | 平台标识符 |
| platformSpecificId | uint16_t | 平台特定编码标识符 |
| nameId | TtfNameTable::NameId | 名称标识符、逻辑字符串类别，由 [NameId](../nameid/) 枚举指定。 |
| languageId | uint16_t | 语言标识符 |
| newName | System::String | 新名称或新字符串数据 |

## 另见

* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
