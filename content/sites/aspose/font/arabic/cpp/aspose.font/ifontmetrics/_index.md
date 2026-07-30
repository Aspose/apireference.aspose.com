---
title: "Aspose::Font::IFontMetrics فئة"
linktitle: "IFontMetrics"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::IFontMetrics. تُعرّف واجهة لأدوات قياسات الخط في C++."
type: docs
weight: 1600
url: /ar/cpp/aspose.font/ifontmetrics/
---
## IFontMetrics class


يُعرّف واجهة لأدوات قياسات [Font](../font/).

```cpp
class IFontMetrics : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_Ascender](./get_ascender/)() | يحصل على قيمة الصاعد للـ [Font](../font/) بوحدات الخط. |
| virtual [get_Descender](./get_descender/)() | يحصل على قيمة النازل للـ [Font](../font/) بوحدات الخط. |
| virtual [get_FontBBox](./get_fontbbox/)() | يحصل على صندوق الحدود للـ [Font](../font/). |
| virtual [get_FontMatrix](./get_fontmatrix/)() | يحصل على مصفوفة التحويل للـ [Font](../font/). |
| virtual [get_IsFixedPitch](./get_isfixedpitch/)() | صحيح إذا كان الـ [Font](../font/) أحادي العرض. |
| virtual [get_LineGap](./get_linegap/)() | يحصل على قيمة الفجوة بين السطور (LineGap) للـ [Font](../font/) بوحدات الـ [Font](../font/). |
| virtual [get_TypoAscender](./get_typoascender/)() | يحصل على قيمة الصاعد الطباعي للـ [Font](../font/) بوحدات الخط. |
| virtual [get_TypoDescender](./get_typodescender/)() | يحصل على قيمة النازل الطباعي للـ [Font](../font/) بوحدات الـ [Font](../font/). |
| virtual [get_TypoLineGap](./get_typolinegap/)() | يحصل على قيمة الفجوة بين السطور (LineGap) الطباعية للـ [Font](../font/) بوحدات الـ [Font](../font/). |
| virtual [get_UnitsPerEM](./get_unitsperem/)() | يحصل على الوحدات لكل إيم. |
| virtual [GetAscender](./getascender/)(double) | يعيد الصاعد لحجم [Font](../font/) محدد. |
| virtual [GetDescender](./getdescender/)(double) | يعيد النازل لحجم [Font](../font/) محدد. |
| virtual [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) | يعيد صندوق حدود الحرف (glyph BBox). |
| virtual [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) | يعيد عرض الحرف. |
| virtual [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) | يرجع قيمة التباعد بين الشكلين. |
| virtual [GetTypoAscender](./gettypoascender/)(double) | يعيد الصاعد الطباعي لحجم [Font](../font/) محدد. |
| virtual [GetTypoDescender](./gettypodescender/)(double) | يعيد النازل الطباعي لحجم [Font](../font/) محدد. |
| virtual [GetTypoLineGap](./gettypolinegap/)(double) | يعيد الفجوة بين السطور لحجم [Font](../font/) محدد. |
| virtual [MeasureString](./measurestring/)(System::String, double) | يقيس السلسلة ويعيد عرض السلسلة. |
| virtual [set_Ascender](./set_ascender/)(double) | يحصل على قيمة الصاعد للـ [Font](../font/) بوحدات الخط. |
| virtual [set_Descender](./set_descender/)(double) | يحصل على قيمة النازل للـ [Font](../font/) بوحدات الخط. |
| virtual [set_TypoAscender](./set_typoascender/)(double) | يحصل على قيمة الصاعد الطباعي للـ [Font](../font/) بوحدات الخط. |
| virtual [set_TypoDescender](./set_typodescender/)(double) | يحصل على قيمة النازل الطباعي للـ [Font](../font/) بوحدات الـ [Font](../font/). |
| virtual [set_UnitsPerEM](./set_unitsperem/)(uint32_t) | يحصل على الوحدات لكل إيم. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | يضبط عرض الشكل. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
