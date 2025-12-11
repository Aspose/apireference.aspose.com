---
title: Aspose::Font::Ttf::TtfFont class
linktitle: TtfFont
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfFont class. Represents TrueType Font (TTF) in C++.'
type: docs
weight: 600
url: /cpp/aspose.font.ttf/ttffont/
---
## TtfFont class


Represents TrueType [Font](../../aspose.font/font/) (TTF).

```cpp
class TtfFont : public Aspose::Font::Font
```

## Methods

| Method | Description |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Converts the [Font](../../aspose.font/font/) into another format. |
| [Convert](./convert/)(Aspose::Font::FontType, System::SharedPtr\<System::Collections::Generic::ICollection\<uint32_t\>\>) | Converts the [Font](../../aspose.font/font/) into another format with limiting character set. |
| virtual [get_CffFont](./get_cfffont/)() | Gets CFF [Font](../../aspose.font/font/) if present. |
| [get_Encoding](./get_encoding/)() override | Gets [Font](../../aspose.font/font/) encoding. |
| [get_FontDefinition](./get_fontdefinition/)() override | Gets [Font](../../aspose.font/font/) definition. |
| [get_FontFamily](./get_fontfamily/)() override | Gets or Sets [Font](../../aspose.font/font/) family. |
| [get_FontName](./get_fontname/)() override | Gets or Sets [Font](../../aspose.font/font/) face name. |
| [get_FontNames](./get_fontnames/)() override | Gets [Font](../../aspose.font/font/) names. |
| [get_FontStyle](./get_fontstyle/)() override | Gets [Font](../../aspose.font/font/) style. This is a value computed and represented in generalized type. |
| [get_FontType](./get_fonttype/)() override | Gets [Font](../../aspose.font/font/) type. Returns [FontType.TTF](../../aspose.font/fonttype/) value. |
| [get_GlyphIdType](./get_glyphidtype/)() override | Gets glyph id type specification. |
| [get_IsSymbolic](./get_issymbolic/)() | Returns true in case [Font](../../aspose.font/font/) is symbolic. |
| [get_Metrics](./get_metrics/)() override | Gets [Font](../../aspose.font/font/) metrics. |
| [get_NumGlyphs](./get_numglyphs/)() override | Gets number of glyphs in the [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Gets Postscript [Font](../../aspose.font/font/) names. |
| [get_Style](./get_style/)() override | Gets or Sets [Font](../../aspose.font/font/) style. This is a raw string value provided by [Font](../../aspose.font/font/) file. |
| virtual [get_TtfTables](./get_ttftables/)() | Gets TTF tables. |
| [GetAllGlyphIds](./getallglyphids/)() override | Returns array of all glyph ids, available in the [Font](../../aspose.font/font/). Glyph id is a unique number for a glyph, which is font type dependent. TTF [Font](../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF [Font](../../aspose.font/font/) inside, the CFF structures are used to address glyphs by name. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. TTF [Font](../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF [Font](../../aspose.font/font/) inside, the CFF structures are used to address glyphs by name. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Returns glyph by glyph name. Name (string) glyph addressing is supported for TTF fonts via Post table mapping. In case CFF [Font](../../aspose.font/font/) inside, the CFF structures are used to address glyphs by name. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Returns glyph by glyph id. |
| virtual [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) | Gets a glyph by glyph identifier passed and fills passed list of glyph identifiers with components of this glyph. Glyph id is a unique number for a glyph, which is font type dependent. TTF [Font](../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF [Font](../../aspose.font/font/) inside, the CFF structures are used to address glyphs by name. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) | Gets a glyph by glyph name passed and fills passed list of glyph identifiers with components of this glyph. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) | Gets a glyph by glyph index passed and fills passed list of glyph identifiers with components of this glyph. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Get glyphs representation for text. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Gets or Sets [Font](../../aspose.font/font/) family. |
| [set_FontName](./set_fontname/)(System::String) override | Gets or Sets [Font](../../aspose.font/font/) face name. |
| [set_Style](./set_style/)(System::String) override | Gets or Sets [Font](../../aspose.font/font/) style. This is a raw string value provided by [Font](../../aspose.font/font/) file. |
## See Also

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
