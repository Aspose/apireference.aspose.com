---
title: "Aspose::Font::TtfTables::TtfPostTable 类"
linktitle: "TtfPostTable"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfPostTable 类。表示 C++ 中 TTF 字体文件的 \\\"post\\\" 表。"
type: docs
weight: 1500
url: /zh/cpp/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class


表示 TTF [Font](../../aspose.font/font/) 文件的 \"post\" 表。

```cpp
class TtfPostTable : public Aspose::Font::TtfTables::TtfTableBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Format](./get_format/)() | 获取此表的固定格式（版本）。已弃用，请使用 [TableFormat](../) 属性。 |
| [get_HasNoPostScriptNames](./get_hasnopostscriptnames/)() | 指示此字体文件的字形未提供 PostScript 名称信息。 |
| [get_IsFixedPitch](./get_isfixedpitch/)() | 获取 uint32 isFixedPitch。若字体是比例间距则为 0，若字体不是比例间距（即等宽）则为非零。 |
| [get_ItalicAngle](./get_italicangle/)() | 获取固定的 italicAngle（以度为单位的倾斜角）。 |
| [get_MaxMemType1](./get_maxmemtype1/)() | 获取 uint32 maxMemType1——当 TrueType 字体以 Type 1 [Font](../../aspose.font/font/) 下载时的最大内存使用量。 |
| [get_MaxMemType42](./get_maxmemtype42/)() | 获取 uint32 maxMemType42——当 TrueType 字体以 Type 42 [Font](../../aspose.font/font/) 下载时的最大内存使用量。 |
| [get_MinMemType1](./get_minmemtype1/)() | 获取 uint32 minMemType1——当 TrueType 字体以 Type 1 [Font](../../aspose.font/font/) 下载时的最小内存使用量。 |
| [get_MinMemType42](./get_minmemtype42/)() | 获取 uint32 minMemType42——当 TrueType 字体以 Type 42 [Font](../../aspose.font/font/) 下载时的最小内存使用量。 |
| [get_TableFormat](./get_tableformat/)() | 获取此表的固定格式（版本）。使用对象 [Version16Dot16](../) 的属性 MajorNumber 和 MinorNUmber（十六进制表示）来检测所使用的版本。 |
| static [get_Tag](./get_tag/)() | 获取表标签。 |
| [get_UnderlinePosition](./get_underlineposition/)() | 获取 FWord underlinePosition 值。 |
| [get_UnderlineThickness](./get_underlinethickness/)() | 获取 FWord underlineThickness 值。 |
| [GetAllGlyphIndexesForGlyphName](./getallglyphindexesforglyphname/)(System::String) | 获取按字形名称的字形索引数组。 |
| [GetGlyphIndex](./getglyphindex/)(System::String) | 获取按字形名称的字形索引。 |
| [GetGlyphName](./getglyphname/)(uint32_t) | 获取按字形索引的字形名称。 |
## 另见

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
