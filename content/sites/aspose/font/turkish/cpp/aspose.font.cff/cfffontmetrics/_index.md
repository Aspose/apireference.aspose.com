---
title: "Aspose::Font::Cff::CffFontMetrics sınıfı"
linktitle: "CffFontMetrics"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Cff::CffFontMetrics sınıfı. C++'ta CFF Yazı Tipi ölçümlerini temsil eder."
type: docs
weight: 300
url: /tr/cpp/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class


CFF [Font](../../aspose.font/font/) ölçümlerini temsil eder.

```cpp
class CffFontMetrics : public Aspose::Font::FontMetrics
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Ascender değerini alır. |
| [get_Descender](./get_descender/)() override | Descender değerini alır. |
| [get_FontBBox](./get_fontbbox/)() override | Alır [FontBBox](../../aspose.font/fontbbox/) değerini. |
| [get_FontMatrix](./get_fontmatrix/)() override | FontMatrix değerini alır. |
| [get_UnitsPerEM](./get_unitsperem/)() override | UnitsPerEM değerini alır. |
| [GetFontMatrixForGlyph](./getfontmatrixforglyph/)(System::SharedPtr\<Glyphs::GlyphId\>) | Belirtilen kimliğe sahip glif için dönüşüm matrisini hesaplar. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Glif genişliğini döndürür. Belirli [Font](../../aspose.font/font/) kodlaması miras alanları tarafından geçersiz kılınabilir. |
| [MeasureString](./measurestring/)(System::String, double) override | Dizeyi ölçer ve dize genişliğini döndürür. |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | Glif genişliğini ayarlar. |
## Ayrıca Bakınız

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
