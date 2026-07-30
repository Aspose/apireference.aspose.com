---
title: "类 TtfPostTable"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfPostTable 类。表示 TTF 字体文件的 post 表。"
type: docs
weight: 1280
url: /zh/net/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class

表示 "post" 表的 TTF 字体文件。

```csharp
public class TtfPostTable : TtfTableBase
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [Format](../../aspose.font.ttftables/ttfposttable/format/) { get; } | 获取此表的固定 format（版本）。已弃用，请使用 [`TableFormat`](./tableformat/) 属性。 |
| [HasNoPostScriptNames](../../aspose.font.ttftables/ttfposttable/hasnopostscriptnames/) { get; } | 指示此字体文件中的字形未提供 PostScript 名称信息。 |
| [IsFixedPitch](../../aspose.font.ttftables/ttfposttable/isfixedpitch/) { get; } | 获取 uint32 isFixedPitch。若字体是比例间距则为 0，若不是比例间距（即等宽）则为非零。 |
| [ItalicAngle](../../aspose.font.ttftables/ttfposttable/italicangle/) { get; } | 获取固定 italicAngle（以度为单位的斜体角度）。 |
| [MaxMemType1](../../aspose.font.ttftables/ttfposttable/maxmemtype1/) { get; } | 获取 uint32 maxMemType1。当 TrueType 字体以 Type 1 字体下载时的最大内存使用量。 |
| [MaxMemType42](../../aspose.font.ttftables/ttfposttable/maxmemtype42/) { get; } | 获取 uint32 maxMemType42。当 TrueType 字体以 Type 42 字体下载时的最大内存使用量。 |
| [MinMemType1](../../aspose.font.ttftables/ttfposttable/minmemtype1/) { get; } | 获取 uint32 minMemType1。当 TrueType 字体以 Type 1 字体下载时的最小内存使用量。 |
| [MinMemType42](../../aspose.font.ttftables/ttfposttable/minmemtype42/) { get; } | 获取 uint32 minMemType42。当 TrueType 字体以 Type 42 字体下载时的最小内存使用量。 |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | 获取 sfnt 开始处的偏移。 |
| [TableFormat](../../aspose.font.ttftables/ttfposttable/tableformat/) { get; } | 获取此表的固定 format（版本）。使用对象 [`Version16Dot16`](../../aspose.font.ttfcommon/version16dot16/) 的属性 MajorNumber 和 MinorNUmber（十六进制表示）来检测使用的版本。 |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | 对 TTF 表仓库的引用。 |
| [UnderlinePosition](../../aspose.font.ttftables/ttfposttable/underlineposition/) { get; } | 获取 FWord underlinePosition 值。 |
| [UnderlineThickness](../../aspose.font.ttftables/ttfposttable/underlinethickness/) { get; } | 获取 FWord underlineThickness 值。 |
| static [Tag](../../aspose.font.ttftables/ttfposttable/tag/) { get; } | 获取表标签。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [GetAllGlyphIndexesForGlyphName](../../aspose.font.ttftables/ttfposttable/getallglyphindexesforglyphname/)(string) | 获取按字形名称的字形索引数组。 |
| [GetGlyphIndex](../../aspose.font.ttftables/ttfposttable/getglyphindex/)(string) | 获取按字形名称的字形索引。 |
| [GetGlyphName](../../aspose.font.ttftables/ttfposttable/getglyphname/)(uint) | 获取按字形索引的字形名称。 |

### 另见

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


