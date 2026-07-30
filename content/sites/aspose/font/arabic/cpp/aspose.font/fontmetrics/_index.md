---
title: "Aspose::Font::FontMetrics فئة"
linktitle: "FontMetrics"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::FontMetrics فئة. تمثل مقاييس الخط في C++."
type: docs
weight: 800
url: /ar/cpp/aspose.font/fontmetrics/
---
## FontMetrics class


تمثل مقاييس [Font](../font/).

```cpp
class FontMetrics : public Aspose::Font::IFontMetrics
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | يحصل على قيمة Ascender. |
| [get_Descender](./get_descender/)() override | يحصل على قيمة Descender. |
| [get_FontBBox](./get_fontbbox/)() override | يحصل على قيمة [FontBBox](../fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | يحصل على قيمة FontMatrix. |
| [get_IsFixedPitch](./get_isfixedpitch/)() override | يحصل على قيمة IsFixedPitch. |
| [get_LineGap](./get_linegap/)() override | يحصل على قيمة الفجوة بين السطور. |
| [get_TypoAscender](./get_typoascender/)() override | يحصل على قيمة TypoAscender. |
| [get_TypoDescender](./get_typodescender/)() override | يحصل على قيمة TypoDescender. |
| [get_TypoLineGap](./get_typolinegap/)() override | يحصل على قيمة TypoLineGap. |
| [get_UnitsPerEM](./get_unitsperem/)() override | يحصل على قيمة UnitsPerEM. |
| [GetAscender](./getascender/)(double) override | يعيد الصاعد لحجم [Font](../font/) محدد. |
| [GetDescender](./getdescender/)(double) override | يعيد النازل لحجم [Font](../font/) محدد. |
| [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) override | يرجع BBox للرمز. يرجع [FontBBox](../fontbbox/) إذا لم يتم تعريف BBox للرمز. قد يتم تجاوزها من قبل وراثي ترميز الخط المحدد. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | يرجع عرض الرمز. قد يتم تجاوزها من قبل وراثي ترميز الخط المحدد. |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | يرجع قيمة التباعد بين الشكلين. |
| [GetTypoAscender](./gettypoascender/)(double) override | يعيد النازل لحجم [Font](../font/) محدد. |
| [GetTypoDescender](./gettypodescender/)(double) override | يعيد النازل لحجم [Font](../font/) محدد. |
| [GetTypoLineGap](./gettypolinegap/)(double) override | يعيد الفجوة بين السطور لحجم [Font](../font/) محدد. |
| virtual [MeasureString](./measurestring/)(System::String, double) | يقيس السلسلة ويعيد عرض السلسلة. |
| [set_Ascender](./set_ascender/)(double) override | يحصل على قيمة Ascender. |
| [set_Descender](./set_descender/)(double) override | يحصل على قيمة Descender. |
| [set_TypoAscender](./set_typoascender/)(double) override | يحصل على قيمة TypoAscender. |
| [set_TypoDescender](./set_typodescender/)(double) override | يحصل على قيمة TypoDescender. |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | يحصل على قيمة UnitsPerEM. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | يضبط عرض الشكل. |
## انظر أيضًا

* Class [IFontMetrics](../ifontmetrics/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
