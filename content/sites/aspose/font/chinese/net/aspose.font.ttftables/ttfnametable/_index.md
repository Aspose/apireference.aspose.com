---
title: "类 TtfNameTable"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfNameTable 类。表示 TTF 字体文件的名称表。"
type: docs
weight: 1180
url: /zh/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

表示 "name" 表的 TTF 字体文件。

```csharp
public class TtfNameTable : TtfTableBase
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | 获取 sfnt 开始处的偏移。 |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | 对 TTF 表仓库的引用。 |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag/) { get; } | 获取表标签。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames/)(MultiLanguageString, PlatformId, ushort, NameId) | 从传入的 *mlNames* 对象中提取所有多语言字符串，并使用传入的参数 *platformId*、*platformSpecificId* 和 *nameId* 为每个提取的字符串创建相应的 NameRecord 结构。字段 languageID 的值从 *mlNames* 对象中提取。新创建的记录被添加到表中。如果发现已有记录在 platformID、platformSpecificID、nameID 和 languageId 上与新创建的记录相同，则不会添加新记录，只会更新现有记录的字符串数据。 |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname/)(NameId, PlatformId, int, int, string) | 向表中添加条目。要添加的字符串数据类别由 *name* 参数指定。 |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords)(PlatformId, ushort) | 删除所有与指定平台相关的记录。 |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords_1)(PlatformId, ushort, NameId) | 删除所有与传入参数相关的记录。 |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords_2)(PlatformId, ushort, NameId, ushort) | 删除与指定参数相关的记录。 |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid/)(NameId) | 删除所有与传入 nameId 参数相关的记录。 |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords/)() | 返回表中所有 [`NameRecord`](../ttfnametable.namerecord/) 结构。 |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid)(NameId) | 根据 nameId 返回名称。 |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid_1)(NameId, PlatformId) | 使用传入的平台标识符，根据 nameId 返回名称。 |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | 以 [`MultiLanguageString`](../../aspose.font/multilanguagestring/) 类型的对象返回名称。该方法收集所有与传入的参数 nameId、platformId 和 platformSpecificId 相匹配的 NameRecord 结构，然后基于这些结构列表构建结果对象。 |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid/)(NameId) | 如果找到则根据 nameId 返回名称，否则返回 null。 |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid/)(NameId) | 返回所有 NameId 字段等于传入 *nameId* 值的 [`NameRecord`](../ttfnametable.namerecord/) 结构。如果未找到记录，则返回空数组。 |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename/)(PlatformId, ushort, NameId, ushort, string) | 更新与指定平台（platformId 与 platformSpecificId 的组合）、类别（nameId）和语言（languageId）相关的记录中的名称。 |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid/)(NameId, string) | 选择所有与逻辑字符串类别（由参数 nameId 指定）相关的记录，并更新这些记录中的 name 字段（字符串数据）。与平台（platformID、平台特定编码 ID）和语言（Language ID）相关的字段不受此方法影响。仅将名称字符串数据替换为新名称。使用此方法时请谨慎，因为它会替换所有与 nameId 相关的平台和语言的原始名称。这可能导致冲突，例如原始名称在不同平台或语言上有不同值时，替换操作会将所有这些值改为单一的新值，而该新值可能与某些平台和语言逻辑不一致。当原始名称在所有平台和语言上只有单一表示时（例如名称字符串数据为英文），此方法非常有用。 |

## 其他成员

| 名称 | 描述 |
| --- | --- |
| enum [MacLanguageId](../../aspose.font.ttftables/ttfnametable.maclanguageid) | Macintosh 平台语言 ID 枚举。 |
| enum [MacPlatformSpecificId](../../aspose.font.ttftables/ttfnametable.macplatformspecificid) | 表示 Macintosh 平台 PlatformSpecificId 枚举。 |
| enum [MSLanguageId](../../aspose.font.ttftables/ttfnametable.mslanguageid) | Microsoft 平台语言 ID 枚举。 |
| enum [MSPlatformSpecificId](../../aspose.font.ttftables/ttfnametable.msplatformspecificid) | 表示 Microsoft 平台 PlatformSpecificId 枚举。 |
| enum [NameId](../../aspose.font.ttftables/ttfnametable.nameid) | 表示 NameId。 |
| class [NameRecord](../../aspose.font.ttftables/ttfnametable.namerecord) | 表示 'name' 表的 NameRecord 结构 |
| enum [PlatformId](../../aspose.font.ttftables/ttfnametable.platformid) | 表示 PlatformId 枚举。 |
| enum [UnicodePlatformSpecificId](../../aspose.font.ttftables/ttfnametable.unicodeplatformspecificid) | 表示 Unicode 平台特定的枚举。 |

### 另见

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


