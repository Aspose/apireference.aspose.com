---
title: "Aspose::Font::Cff::CffFontMetrics class"
linktitle: "CffFontMetrics"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Cff::CffFontMetrics class. يمثل مقاييس خط CFF في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class


يمثل مقاييس CFF [Font](../../aspose.font/font/).

```cpp
class CffFontMetrics : public Aspose::Font::FontMetrics
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | يحصل على قيمة Ascender. |
| [get_Descender](./get_descender/)() override | يحصل على قيمة Descender. |
| [get_FontBBox](./get_fontbbox/)() override | يحصل على قيمة [FontBBox](../../aspose.font/fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | يحصل على قيمة FontMatrix. |
| [get_UnitsPerEM](./get_unitsperem/)() override | يحصل على قيمة UnitsPerEM. |
| [GetFontMatrixForGlyph](./getfontmatrixforglyph/)(System::SharedPtr\<Glyphs::GlyphId\>) | يحسب مصفوفة التحويل للـ glyph المحدد بالمعرف. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | يرجع عرض glyph. قد يتم تجاوزها من قبل وراثي تشفير [Font](../../aspose.font/font/) المحددين. |
| [MeasureString](./measurestring/)(System::String, double) override | يقيس السلسلة ويعيد عرض السلسلة. |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | يضبط عرض الشكل. |
## انظر أيضًا

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
