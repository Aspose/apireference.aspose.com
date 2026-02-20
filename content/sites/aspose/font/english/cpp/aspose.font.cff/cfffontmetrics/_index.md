---
title: Aspose::Font::Cff::CffFontMetrics class
linktitle: CffFontMetrics
second_title: Aspose.Font for C++
description: 'Aspose::Font::Cff::CffFontMetrics class. Represents CFF Font metrics in C++.'
type: docs
weight: 300
url: /cpp/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class


Represents CFF [Font](../../aspose.font/font/) metrics.

```cpp
class CffFontMetrics : public Aspose::Font::FontMetrics
```

## Methods

| Method | Description |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Gets Ascender value. |
| [get_Descender](./get_descender/)() override | Gets Descender value. |
| [get_FontBBox](./get_fontbbox/)() override | Gets [FontBBox](../../aspose.font/fontbbox/) value. |
| [get_FontMatrix](./get_fontmatrix/)() override | Gets FontMatrix value. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Gets UnitsPerEM value. |
| [GetFontMatrixForGlyph](./getfontmatrixforglyph/)(System::SharedPtr\<Glyphs::GlyphId\>) | Calculates transformation matrix for glyph specified by id. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Returns glyph width. May be overridden by specific [Font](../../aspose.font/font/) encoding inheritors. |
| [MeasureString](./measurestring/)(System::String, double) override | Measures string and returns string width. |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | Sets glyph width. |
## See Also

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
