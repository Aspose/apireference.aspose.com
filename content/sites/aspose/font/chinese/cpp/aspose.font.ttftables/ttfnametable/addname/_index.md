---
title: "Aspose::Font::TtfTables::TtfNameTable::AddName 方法"
linktitle: "AddName"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddName 方法。向表中添加条目。要添加的字符串数据类别由 C++ 中的 name 参数指定。"
type: docs
weight: 300
url: /zh/cpp/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable::AddName method


向表中添加条目。要添加的字符串数据类别由 *name* 参数指定。

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddName(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, int32_t platformSpecificId, int32_t languageId, System::String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | 名称标识符、逻辑字符串类别，由 [NameId](../nameid/) 枚举指定。 |
| platformId | TtfNameTable::PlatformId | 平台标识符 |
| platformSpecificId | int32_t | 平台特定编码标识符。请使用以下枚举之一的值 - [UnicodePlatformSpecificId](../unicodeplatformspecificid/)、[MacPlatformSpecificId](../macplatformspecificid/)、[MSPlatformSpecificId](../msplatformspecificid/)。使用哪个枚举由上下文（*platformId* 参数）决定。 |
| languageId | int32_t | 语言标识符。请使用来自 [MSLanguageId](../mslanguageid/) 或 [MacLanguageId](../maclanguageid/) 枚举的值，取决于上下文，由 *platformId* 参数定义。 |
| 名称 | System::String | 实际字符串数据 |

## 另见

* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
