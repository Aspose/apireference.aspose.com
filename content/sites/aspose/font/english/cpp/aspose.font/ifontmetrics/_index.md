---
title: Aspose::Font::IFontMetrics class
linktitle: IFontMetrics
second_title: Aspose.Font for C++
description: 'Aspose::Font::IFontMetrics class. Defines an interface for Font metrics tools in C++.'
type: docs
weight: 1600
url: /cpp/aspose.font/ifontmetrics/
---
## IFontMetrics class


Defines an interface for [Font](../font/) metrics tools.

```cpp
class IFontMetrics : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [get_Ascender](./get_ascender/)() | Gets ascender value of the [Font](../font/) in font units. |
| virtual [get_Descender](./get_descender/)() | Gets descender value of the [Font](../font/) in font units. |
| virtual [get_FontBBox](./get_fontbbox/)() | Gets [Font](../font/) bounding box. |
| virtual [get_FontMatrix](./get_fontmatrix/)() | Gets [Font](../font/) transformation matrix. |
| virtual [get_IsFixedPitch](./get_isfixedpitch/)() | True, if the [Font](../font/) is monospaced. |
| virtual [get_LineGap](./get_linegap/)() | Gets LineGap value of the [Font](../font/) in [Font](../font/) units. |
| virtual [get_TypoAscender](./get_typoascender/)() | Gets typographic ascender value of the [Font](../font/) in font units. |
| virtual [get_TypoDescender](./get_typodescender/)() | Gets typographic descender value of the [Font](../font/) in [Font](../font/) units. |
| virtual [get_TypoLineGap](./get_typolinegap/)() | Gets typographic LineGap value of the [Font](../font/) in [Font](../font/) units. |
| virtual [get_UnitsPerEM](./get_unitsperem/)() | Gets units per em. |
| virtual [GetAscender](./getascender/)(double) | Returns ascender for specific [Font](../font/) size. |
| virtual [GetDescender](./getdescender/)(double) | Returns descender for specific [Font](../font/) size. |
| virtual [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) | Sets glyph width. |
| virtual [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) | Returns glyph width. |
| virtual [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) | Returns kerning value for the glyph pair. |
| virtual [GetTypoAscender](./gettypoascender/)(double) | Returns typographic ascender for specific [Font](../font/) size. |
| virtual [GetTypoDescender](./gettypodescender/)(double) | Returns typographic descender for specific [Font](../font/) size. |
| virtual [GetTypoLineGap](./gettypolinegap/)(double) | Returns line gap for specific [Font](../font/) size. |
| virtual [MeasureString](./measurestring/)(System::String, double) | Measures string and returns string width. |
| virtual [set_Ascender](./set_ascender/)(double) | Gets ascender value of the [Font](../font/) in font units. |
| virtual [set_Descender](./set_descender/)(double) | Gets descender value of the [Font](../font/) in font units. |
| virtual [set_TypoAscender](./set_typoascender/)(double) | Gets typographic ascender value of the [Font](../font/) in font units. |
| virtual [set_TypoDescender](./set_typodescender/)(double) | Gets typographic descender value of the [Font](../font/) in [Font](../font/) units. |
| virtual [set_UnitsPerEM](./set_unitsperem/)(uint32_t) | Gets units per em. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
