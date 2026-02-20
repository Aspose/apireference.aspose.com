---
title: Aspose::Font::FontMetrics class
linktitle: FontMetrics
second_title: Aspose.Font for C++
description: 'Aspose::Font::FontMetrics class. Represents Font metrics in C++.'
type: docs
weight: 800
url: /cpp/aspose.font/fontmetrics/
---
## FontMetrics class


Represents [Font](../font/) metrics.

```cpp
class FontMetrics : public Aspose::Font::IFontMetrics
```

## Methods

| Method | Description |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Gets Ascender value. |
| [get_Descender](./get_descender/)() override | Gets Descender value. |
| [get_FontBBox](./get_fontbbox/)() override | Gets [FontBBox](../fontbbox/) value. |
| [get_FontMatrix](./get_fontmatrix/)() override | Gets FontMatrix value. |
| [get_IsFixedPitch](./get_isfixedpitch/)() override | Gets IsFixedPitch value. |
| [get_LineGap](./get_linegap/)() override | Gets LineGap value. |
| [get_TypoAscender](./get_typoascender/)() override | Gets TypoAscender value. |
| [get_TypoDescender](./get_typodescender/)() override | Gets TypoDescender value. |
| [get_TypoLineGap](./get_typolinegap/)() override | Gets TypoLineGap value. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Gets UnitsPerEM value. |
| [GetAscender](./getascender/)(double) override | Returns ascender for specific [Font](../font/) size. |
| [GetDescender](./getdescender/)(double) override | Returns descender for specific [Font](../font/) size. |
| [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Returns glyph BBox. Returns [FontBBox](../fontbbox/) if BBox was not defined for the glyph. May be overridden by specific font encoding inheritors. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Returns glyph width. May be overridden by specific font encoding inheritors. |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Returns kerning value for the glyph pair. |
| [GetTypoAscender](./gettypoascender/)(double) override | Returns descender for specific [Font](../font/) size. |
| [GetTypoDescender](./gettypodescender/)(double) override | Returns descender for specific [Font](../font/) size. |
| [GetTypoLineGap](./gettypolinegap/)(double) override | Returns line gap for specific [Font](../font/) size. |
| virtual [MeasureString](./measurestring/)(System::String, double) | Measures string and returns string width. |
| [set_Ascender](./set_ascender/)(double) override | Gets Ascender value. |
| [set_Descender](./set_descender/)(double) override | Gets Descender value. |
| [set_TypoAscender](./set_typoascender/)(double) override | Gets TypoAscender value. |
| [set_TypoDescender](./set_typodescender/)(double) override | Gets TypoDescender value. |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | Gets UnitsPerEM value. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Sets glyph width. |
## See Also

* Class [IFontMetrics](../ifontmetrics/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
