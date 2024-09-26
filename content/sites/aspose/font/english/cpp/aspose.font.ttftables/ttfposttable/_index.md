---
title: Aspose::Font::TtfTables::TtfPostTable class
linktitle: TtfPostTable
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfPostTable class. Represents "post" table of the TTF Font file in C++.'
type: docs
weight: 1500
url: /cpp/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class


Represents "post" table of the TTF [Font](../../aspose.font/font/) file.

```cpp
class TtfPostTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Methods

| Method | Description |
| --- | --- |
| [get_Format](./get_format/)() | Gets fixed format(version) of this table. Deprecated, use [TableFormat](../) property. |
| [get_HasNoPostScriptNames](./get_hasnopostscriptnames/)() | Indicates that no PostScript name information is provided for the glyphs in this font file. |
| [get_IsFixedPitch](./get_isfixedpitch/)() | Gets uint32 isFixedPitch. 0 if the font is proportionally spaced, non-zero if the font is not proportionally spaced (i.e. monospaced). |
| [get_ItalicAngle](./get_italicangle/)() | Gets fixed italicAngle Italic angle in degrees. |
| [get_MaxMemType1](./get_maxmemtype1/)() | Gets uint32 maxMemType1 Maximum memory usage when a TrueType font is downloaded as a Type 1 [Font](../../aspose.font/font/). |
| [get_MaxMemType42](./get_maxmemtype42/)() | Gets uint32 maxMemType42 Maximum memory usage when a TrueType font is downloaded as a Type 42 [Font](../../aspose.font/font/). |
| [get_MinMemType1](./get_minmemtype1/)() | Gets uint32 minMemType1 Minimum memory usage when a TrueType font is downloaded as a Type 1 [Font](../../aspose.font/font/). |
| [get_MinMemType42](./get_minmemtype42/)() | Gets uint32 minMemType42 Minimum memory usage when a TrueType font is downloaded as a Type 42 [Font](../../aspose.font/font/). |
| [get_TableFormat](./get_tableformat/)() | Gets fixed format(version) of this table. Use properties MajorNumber and MinorNUmber of object [Version16Dot16](../) in hexademical notation to detect version used. |
| static [get_Tag](./get_tag/)() | Gets table tag. |
| [get_UnderlinePosition](./get_underlineposition/)() | Gets FWord underlinePosition value. |
| [get_UnderlineThickness](./get_underlinethickness/)() | Gets FWord underlineThickness value. |
| [GetAllGlyphIndexesForGlyphName](./getallglyphindexesforglyphname/)(System::String) | Gets array of glyphs indexes by glyph name. |
| [GetGlyphIndex](./getglyphindex/)(System::String) | Gets glyph index by glyph name. |
| [GetGlyphName](./getglyphname/)(uint32_t) | Gets glyph name by glyph index. |
## See Also

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
