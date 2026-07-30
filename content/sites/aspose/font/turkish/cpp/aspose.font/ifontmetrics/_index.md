---
title: "Aspose::Font::IFontMetrics sınıfı"
linktitle: "IFontMetrics"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::IFontMetrics sınıfı. C++'ta Font ölçüm araçları için bir arabirim tanımlar."
type: docs
weight: 1600
url: /tr/cpp/aspose.font/ifontmetrics/
---
## IFontMetrics class


[Font](../font/) ölçüm araçları için bir arabirim tanımlar.

```cpp
class IFontMetrics : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_Ascender](./get_ascender/)() | [Font](../font/) ascender değerini font birimlerinde alır. |
| virtual [get_Descender](./get_descender/)() | [Font](../font/) descender değerini font birimlerinde alır. |
| virtual [get_FontBBox](./get_fontbbox/)() | [Font](../font/) sınırlama kutusunu alır. |
| virtual [get_FontMatrix](./get_fontmatrix/)() | [Font](../font/) dönüşüm matrisini alır. |
| virtual [get_IsFixedPitch](./get_isfixedpitch/)() | Doğru, eğer [Font](../font/) tek aralıklıysa. |
| virtual [get_LineGap](./get_linegap/)() | [Font](../font/) LineGap değerini [Font](../font/) birimlerinde alır. |
| virtual [get_TypoAscender](./get_typoascender/)() | [Font](../font/) tipografik ascender değerini font birimlerinde alır. |
| virtual [get_TypoDescender](./get_typodescender/)() | [Font](../font/) tipografik descender değerini [Font](../font/) birimlerinde alır. |
| virtual [get_TypoLineGap](./get_typolinegap/)() | [Font](../font/) tipografik LineGap değerini [Font](../font/) birimlerinde alır. |
| virtual [get_UnitsPerEM](./get_unitsperem/)() | Bir em başına birimleri alır. |
| virtual [GetAscender](./getascender/)(double) | Belirli [Font](../font/) boyutu için ascender döndürür. |
| virtual [GetDescender](./getdescender/)(double) | Belirli [Font](../font/) boyutu için descender döndürür. |
| virtual [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) | Glyph BBox'yi döndürür. |
| virtual [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) | Glyph genişliğini döndürür. |
| virtual [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) | Glif çifti için kerning değerini döndürür. |
| virtual [GetTypoAscender](./gettypoascender/)(double) | Belirli [Font](../font/) boyutu için tipografik ascender döndürür. |
| virtual [GetTypoDescender](./gettypodescender/)(double) | Belirli [Font](../font/) boyutu için tipografik descender döndürür. |
| virtual [GetTypoLineGap](./gettypolinegap/)(double) | Belirli [Font](../font/) boyutu için satır boşluğunu döndürür. |
| virtual [MeasureString](./measurestring/)(System::String, double) | Dizeyi ölçer ve dize genişliğini döndürür. |
| virtual [set_Ascender](./set_ascender/)(double) | [Font](../font/) ascender değerini font birimlerinde alır. |
| virtual [set_Descender](./set_descender/)(double) | [Font](../font/) descender değerini font birimlerinde alır. |
| virtual [set_TypoAscender](./set_typoascender/)(double) | [Font](../font/) tipografik ascender değerini font birimlerinde alır. |
| virtual [set_TypoDescender](./set_typodescender/)(double) | [Font](../font/) tipografik descender değerini [Font](../font/) birimlerinde alır. |
| virtual [set_UnitsPerEM](./set_unitsperem/)(uint32_t) | Bir em başına birimleri alır. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Glif genişliğini ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
