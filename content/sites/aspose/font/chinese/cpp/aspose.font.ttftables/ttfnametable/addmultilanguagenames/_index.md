---
title: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames 方法"
linktitle: "AddMultiLanguageNames"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames 方法。提取传入的 mlNames 对象中的所有多语言字符串，并使用传入的参数 platformId、platformSpecificId 和 nameId 为每个提取的字符串创建相应的 NameRecord 结构。languageID 字段的值从 mlNames 对象中提取。新创建的记录被添加到表中。如果发现已有记录在 platformID、platformSpecificID、nameID 和 langugeId 字段上与新创建的记录相同，则不会添加新记录，而只会更新已有记录的字符串数据（在 C++ 中）。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable::AddMultiLanguageNames method


提取传入的 *mlNames* 对象中的所有多语言字符串，并使用传入的参数 *platformId*、*platformSpecificId* 和 *nameId* 为每个提取的字符串创建相应的 [NameRecord](../namerecord/) 结构。languageID 字段的值从 *mlNames* 对象中提取。新创建的记录被添加到表中。如果发现已有记录在 platformID、platformSpecificID、nameID 和 langugeId 字段上与新创建的记录相同，则不会添加新记录，而只会更新已有记录的字符串数据。

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames(System::SharedPtr<MultiLanguageString> mlNames, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| mlNames | System::SharedPtr\<MultiLanguageString\> | 多语言字符串 |
| platformId | TtfNameTable::PlatformId | 平台标识符 |
| platformSpecificId | uint16_t | 平台特定编码标识符 |
| nameId | TtfNameTable::NameId | 名称标识符、逻辑字符串类别，由 [NameId](../nameid/) 枚举指定。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
