---
title: "الفئة FontMetrics"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.FontMetrics. تمثل مقاييس الخط."
type: docs
weight: 320
url: /ar/net/aspose.font/fontmetrics/
---
## FontMetrics class

يمثل مقاييس الخط.

```csharp
public abstract class FontMetrics : IFontMetrics
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| virtual [Ascender](../../aspose.font/fontmetrics/ascender/) { get; set; } | يحصل على قيمة Ascender. |
| virtual [Descender](../../aspose.font/fontmetrics/descender/) { get; set; } | يحصل على قيمة Descender. |
| virtual [FontBBox](../../aspose.font/fontmetrics/fontbbox/) { get; } | يحصل على قيمة FontBBox. |
| virtual [FontMatrix](../../aspose.font/fontmetrics/fontmatrix/) { get; } | يحصل على قيمة FontMatrix. |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | يحصل على قيمة IsFixedPitch. |
| virtual [LineGap](../../aspose.font/fontmetrics/linegap/) { get; } | يحصل على قيمة LineGap. |
| virtual [TypoAscender](../../aspose.font/fontmetrics/typoascender/) { get; set; } | يحصل على قيمة TypoAscender. |
| virtual [TypoDescender](../../aspose.font/fontmetrics/typodescender/) { get; set; } | يحصل على قيمة TypoDescender. |
| virtual [TypoLineGap](../../aspose.font/fontmetrics/typolinegap/) { get; } | يحصل على قيمة TypoLineGap. |
| virtual [UnitsPerEM](../../aspose.font/fontmetrics/unitsperem/) { get; set; } | يحصل على قيمة UnitsPerEM. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | يعيد الصاعد لحجم الخط المحدد. |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | يعيد BBox للرمز. يعيد FontBBox إذا لم يتم تعريف BBox للرمز. قد يتم تجاوزها بواسطة مشتقات ترميز الخط المحددة. |
| virtual [GetGlyphWidth](../../aspose.font/fontmetrics/getglyphwidth/)(GlyphId) | يعيد glyph width. قد يتم تجاوزها بواسطة الوراثة الخاصة بترميز الخط المحدد. |
| virtual [GetKerningValue](../../aspose.font/fontmetrics/getkerningvalue/)(GlyphId, GlyphId) | يعيد قيمة الترصيع للزوج من الرموز. |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | يعيد الفجوة بين السطور لحجم الخط المحدد. |
| abstract [MeasureString](../../aspose.font/fontmetrics/measurestring/)(string, double) | يقيس السلسلة ويعيد عرض السلسلة. |
| abstract [SetGlyphWidth](../../aspose.font/fontmetrics/setglyphwidth/)(GlyphId, double) | يضبط عرض الرمز. |

### انظر أيضاً

* interface [IFontMetrics](../ifontmetrics/)
* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


