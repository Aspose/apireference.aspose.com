---
title: Class TtfPostTable
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfPostTable class. Represents post table of the TTF Font file
type: docs
weight: 1280
url: /net/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class

Represents "post" table of the TTF Font file.

```csharp
public class TtfPostTable : TtfTableBase
```

## Properties

| Name | Description |
| --- | --- |
| [Format](../../aspose.font.ttftables/ttfposttable/format/) { get; } | Gets fixed format(version) of this table. Deprecated, use [`TableFormat`](./tableformat/) property |
| [HasNoPostScriptNames](../../aspose.font.ttftables/ttfposttable/hasnopostscriptnames/) { get; } | Indicates that no PostScript name information is provided for the glyphs in this font file. |
| [IsFixedPitch](../../aspose.font.ttftables/ttfposttable/isfixedpitch/) { get; } | Gets uint32 isFixedPitch. 0 if the font is proportionally spaced, non-zero if the font is not proportionally spaced (i.e. monospaced). |
| [ItalicAngle](../../aspose.font.ttftables/ttfposttable/italicangle/) { get; } | Gets fixed italicAngle Italic angle in degrees. |
| [MaxMemType1](../../aspose.font.ttftables/ttfposttable/maxmemtype1/) { get; } | Gets uint32 maxMemType1 Maximum memory usage when a TrueType font is downloaded as a Type 1 Font. |
| [MaxMemType42](../../aspose.font.ttftables/ttfposttable/maxmemtype42/) { get; } | Gets uint32 maxMemType42 Maximum memory usage when a TrueType font is downloaded as a Type 42 Font. |
| [MinMemType1](../../aspose.font.ttftables/ttfposttable/minmemtype1/) { get; } | Gets uint32 minMemType1 Minimum memory usage when a TrueType font is downloaded as a Type 1 Font. |
| [MinMemType42](../../aspose.font.ttftables/ttfposttable/minmemtype42/) { get; } | Gets uint32 minMemType42 Minimum memory usage when a TrueType font is downloaded as a Type 42 Font. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | Gets offset from beginning of sfnt. |
| [TableFormat](../../aspose.font.ttftables/ttfposttable/tableformat/) { get; } | Gets fixed format(version) of this table. Use properties MajorNumber and MinorNUmber of object [`Version16Dot16`](../../aspose.font.ttfcommon/version16dot16/) in hexademical notation to detect version used. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | Reference to TTF table repository. |
| [UnderlinePosition](../../aspose.font.ttftables/ttfposttable/underlineposition/) { get; } | Gets FWord underlinePosition value. |
| [UnderlineThickness](../../aspose.font.ttftables/ttfposttable/underlinethickness/) { get; } | Gets FWord underlineThickness value. |
| static [Tag](../../aspose.font.ttftables/ttfposttable/tag/) { get; } | Gets table tag. |

## Methods

| Name | Description |
| --- | --- |
| [GetAllGlyphIndexesForGlyphName](../../aspose.font.ttftables/ttfposttable/getallglyphindexesforglyphname/)(string) | Gets array of glyphs indexes by glyph name |
| [GetGlyphIndex](../../aspose.font.ttftables/ttfposttable/getglyphindex/)(string) | Gets glyph index by glyph name. |
| [GetGlyphName](../../aspose.font.ttftables/ttfposttable/getglyphname/)(uint) | Gets glyph name by glyph index. |

### See Also

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


