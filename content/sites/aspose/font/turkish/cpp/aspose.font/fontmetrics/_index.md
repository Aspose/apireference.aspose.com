---
title: "Aspose::Font::FontMetrics sınıf"
linktitle: "FontMetrics"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::FontMetrics sınıf. C++'da Yazı Tipi ölçümlerini temsil eder."
type: docs
weight: 800
url: /tr/cpp/aspose.font/fontmetrics/
---
## FontMetrics class


[Font](../font/) ölçümlerini temsil eder.

```cpp
class FontMetrics : public Aspose::Font::IFontMetrics
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Ascender değerini alır. |
| [get_Descender](./get_descender/)() override | Descender değerini alır. |
| [get_FontBBox](./get_fontbbox/)() override | [FontBBox](../fontbbox/) değerini alır. |
| [get_FontMatrix](./get_fontmatrix/)() override | FontMatrix değerini alır. |
| [get_IsFixedPitch](./get_isfixedpitch/)() override | IsFixedPitch değerini alır. |
| [get_LineGap](./get_linegap/)() override | LineGap değerini alır. |
| [get_TypoAscender](./get_typoascender/)() override | TypoAscender değerini alır. |
| [get_TypoDescender](./get_typodescender/)() override | TypoDescender değerini alır. |
| [get_TypoLineGap](./get_typolinegap/)() override | TypoLineGap değerini alır. |
| [get_UnitsPerEM](./get_unitsperem/)() override | UnitsPerEM değerini alır. |
| [GetAscender](./getascender/)(double) override | Belirli [Font](../font/) boyutu için ascender döndürür. |
| [GetDescender](./getdescender/)(double) override | Belirli [Font](../font/) boyutu için descender döndürür. |
| [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Glyph BBox'yi döndürür. Glyph için BBox tanımlı değilse [FontBBox](../fontbbox/) döndürür. Belirli yazı tipi kodlaması miras alanları tarafından geçersiz kılınabilir. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Glyph genişliğini döndürür. Belirli yazı tipi kodlaması miras alanları tarafından geçersiz kılınabilir. |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Glif çifti için kerning değerini döndürür. |
| [GetTypoAscender](./gettypoascender/)(double) override | Belirli [Font](../font/) boyutu için descender döndürür. |
| [GetTypoDescender](./gettypodescender/)(double) override | Belirli [Font](../font/) boyutu için descender döndürür. |
| [GetTypoLineGap](./gettypolinegap/)(double) override | Belirli [Font](../font/) boyutu için satır boşluğunu döndürür. |
| virtual [MeasureString](./measurestring/)(System::String, double) | Dizeyi ölçer ve dize genişliğini döndürür. |
| [set_Ascender](./set_ascender/)(double) override | Ascender değerini alır. |
| [set_Descender](./set_descender/)(double) override | Descender değerini alır. |
| [set_TypoAscender](./set_typoascender/)(double) override | TypoAscender değerini alır. |
| [set_TypoDescender](./set_typodescender/)(double) override | TypoDescender değerini alır. |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | UnitsPerEM değerini alır. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Glif genişliğini ayarlar. |
## Ayrıca Bakınız

* Class [IFontMetrics](../ifontmetrics/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
