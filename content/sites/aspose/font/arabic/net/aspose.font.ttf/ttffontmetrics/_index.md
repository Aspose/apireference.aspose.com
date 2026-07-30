---
title: "الفئة TtfFontMetrics"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.Ttf.TtfFontMetrics. تمثل مقاييس خط TTF"
type: docs
weight: 880
url: /ar/net/aspose.font.ttf/ttffontmetrics/
---
## TtfFontMetrics class

يمثل مقاييس خط TTF.

```csharp
public class TtfFontMetrics : FontMetrics
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| override [Ascender](../../aspose.font.ttf/ttffontmetrics/ascender/) { get; set; } | يحصل على قيمة الصاعد. |
| override [Descender](../../aspose.font.ttf/ttffontmetrics/descender/) { get; set; } | يحصل على قيمة النازل. |
| override [FontBBox](../../aspose.font.ttf/ttffontmetrics/fontbbox/) { get; } | يحصل على قيمة FontBBox. |
| override [FontMatrix](../../aspose.font.ttf/ttffontmetrics/fontmatrix/) { get; } | يحصل على قيمة FontBBox. |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | يحصل على قيمة IsFixedPitch. |
| override [LineGap](../../aspose.font.ttf/ttffontmetrics/linegap/) { get; } | يحصل على قيمة LineGap. |
| override [TypoAscender](../../aspose.font.ttf/ttffontmetrics/typoascender/) { get; set; } | يحصل على قيمة TypoAscender. |
| override [TypoDescender](../../aspose.font.ttf/ttffontmetrics/typodescender/) { get; set; } | يحصل على قيمة TypoDescender. |
| override [TypoLineGap](../../aspose.font.ttf/ttffontmetrics/typolinegap/) { get; } | يحصل على قيمة TypoLineGap. |
| override [UnitsPerEM](../../aspose.font.ttf/ttffontmetrics/unitsperem/) { get; set; } | يحصل على قيمة UnitsPerEM. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | يعيد الصاعد لحجم الخط المحدد. |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | يعيد BBox للرمز. يعيد FontBBox إذا لم يتم تعريف BBox للرمز. قد يتم تجاوزها بواسطة مشتقات ترميز الخط المحددة. |
| override [GetGlyphWidth](../../aspose.font.ttf/ttffontmetrics/getglyphwidth/)(GlyphId) | يعيد عرض الحرف حسب معرفه. |
| override [GetKerningValue](../../aspose.font.ttf/ttffontmetrics/getkerningvalue/)(GlyphId, GlyphId) | يعيد قيمة الترصيع للزوج من الرموز. |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | يعيد الفجوة بين السطور لحجم الخط المحدد. |
| override [MeasureString](../../aspose.font.ttf/ttffontmetrics/measurestring/#measurestring)(string, double) | يقيس السلسلة ويعيد عرض السلسلة. |
| [MeasureString](../../aspose.font.ttf/ttffontmetrics/measurestring/#measurestring_1)(uint[], double) | يقيس النص الممثل كمصفوفة من رموز الأحرف ويعيد عرض السلسلة. |
| override [SetGlyphWidth](../../aspose.font.ttf/ttffontmetrics/setglyphwidth/)(GlyphId, double) | يضبط عرض الرمز. |

### انظر أيضاً

* class [FontMetrics](../../aspose.font/fontmetrics/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


