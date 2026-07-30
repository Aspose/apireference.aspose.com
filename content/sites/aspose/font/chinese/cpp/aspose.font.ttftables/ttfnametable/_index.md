---
title: "Aspose::Font::TtfTables::TtfNameTable 类"
linktitle: "TtfNameTable"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfNameTable 类。表示 C++ 中 TTF 字体文件的 \"name\" 表。"
type: docs
weight: 1300
url: /zh/cpp/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class


表示 TTF [Font](../../aspose.font/font/) 文件的 "name" 表。

```cpp
class TtfNameTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [NameRecord](./namerecord/)
## Enums

| 枚举 | 描述 |
| --- | --- |
| [MacLanguageId](./maclanguageid/) | Macintosh 平台语言 ID 枚举。 |
| [MacPlatformSpecificId](./macplatformspecificid/) | 表示 Macintosh 平台 PlatformSpecificId 枚举。 |
| [MSLanguageId](./mslanguageid/) | Microsoft 平台语言 ID 枚举。 |
| [MSPlatformSpecificId](./msplatformspecificid/) | 表示 Microsoft 平台 PlatformSpecificId 枚举。 |
| [NameId](./nameid/) | 表示 [NameId](./nameid/)。 |
| [PlatformId](./platformid/) | 表示 [PlatformId](./platformid/) 枚举。 |
| [UnicodePlatformSpecificId](./unicodeplatformspecificid/) | 表示 Unicode 平台特定枚举。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [AddMultiLanguageNames](./addmultilanguagenames/)(System::SharedPtr\<MultiLanguageString\>, TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | 从传入的 *mlNames* 对象中提取所有多语言字符串，并使用传入的参数 *platformId*、*platformSpecificId* 和 *nameId* 为每个提取的字符串创建相应的 [NameRecord](./namerecord/) 结构。字段 languageID 的值从 *mlNames* 对象中提取。新创建的记录会被添加到表中。如果已存在与新创建记录在 platformID、platformSpecificID、nameID 和 languageId 字段上相同的记录，则不会添加新记录，只会更新现有记录的字符串数据。 |
| [AddName](./addname/)(TtfNameTable::NameId, TtfNameTable::PlatformId, int32_t, int32_t, System::String) | 向表中添加条目。要添加的字符串数据类别由 *name* 参数指定。 |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | 删除所有与传入参数相关的记录。 |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t) | 删除所有与指定平台相关的记录。 |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t) | 删除与指定参数相关的记录。 |
| [DeleteRecordsByNameId](./deleterecordsbynameid/)(TtfNameTable::NameId) | 删除所有与传入 nameId 参数相关的记录。 |
| static [get_Tag](./get_tag/)() | 获取表标签。 |
| [GetAllNameRecords](./getallnamerecords/)() | 返回表中所有 [NameRecord](./namerecord/) 结构。 |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId) | 根据 nameId 返回名称。 |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId) | 使用传入的平台标识符，根据 nameId 返回名称。 |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) | 返回一个类型为 [MultiLanguageString](../../aspose.font/multilanguagestring/) 的名称对象。该方法收集所有与传入的参数 nameId、platformId 和 platformSpecificId 相匹配的 [NameRecord](./namerecord/) 结构，然后基于这些结构列表构建结果对象。 |
| [GetNameById](./getnamebyid/)(TtfNameTable::NameId) | 如果找到则根据 nameId 返回名称，否则返回 null。 |
| [GetNameRecordsByNameId](./getnamerecordsbynameid/)(TtfNameTable::NameId) | 返回所有 [NameRecord](./namerecord/) 结构，其中 [NameId](./nameid/) 字段等于传入的 *nameId* 值。如果未找到记录，将返回空数组。 |
| [UpdateName](./updatename/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t, System::String) | 更新与指定平台（platformId 与 platformSpecificId 的组合）、类别（nameId）和语言（languageId）相关的记录中的名称。 |
| [UpdateNamesByNameId](./updatenamesbynameid/)(TtfNameTable::NameId, System::String) | 选择所有与逻辑字符串类别相关的记录，由参数 nameId 指定，并更新这些记录中的 name 字段（字符串数据）。平台相关的字段（platformID、平台特定编码 ID）和语言相关的字段（Language ID）不受此方法影响。仅替换 name 字符串数据为新名称。使用此方法时请谨慎，因为它会替换所有平台和语言中与 nameId 相关的原始名称。当原始名称具有不同值时可能会产生冲突，因为替换操作会将所有这些值改为单一的新值。且此新值可能在某些平台和语言上出现逻辑不一致。此方法适用于原始名称在所有平台和语言上只有单一表示的情况，例如 name 字符串数据为英文时。 |
## 另见

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
