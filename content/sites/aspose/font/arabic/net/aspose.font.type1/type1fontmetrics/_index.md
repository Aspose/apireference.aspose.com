---
title: "الفئة Type1FontMetrics"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Type1.Type1FontMetrics. تمثل مقاييس خط Type1."
type: docs
weight: 1470
url: /ar/net/aspose.font.type1/type1fontmetrics/
---
## Type1FontMetrics class

يمثل مقاييس Type1 Font.

```csharp
public class Type1FontMetrics : FontMetrics
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| override [Ascender](../../aspose.font.type1/type1fontmetrics/ascender/) { get; } | يحصل على قيمة الصاعد. |
| [CapHeight](../../aspose.font.type1/type1fontmetrics/capheight/) { get; } | يحصل على قيمة ارتفاع الحرف الكبير. |
| override [Descender](../../aspose.font.type1/type1fontmetrics/descender/) { get; } | يحصل على قيمة النازل. |
| override [FontBBox](../../aspose.font.type1/type1fontmetrics/fontbbox/) { get; } | يحصل على قيمة FontBBox. |
| override [FontMatrix](../../aspose.font.type1/type1fontmetrics/fontmatrix/) { get; } | يحصل على مصفوفة تحويل الخط. |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | يحصل على قيمة IsFixedPitch. |
| [ItalicAngle](../../aspose.font.type1/type1fontmetrics/italicangle/) { get; } | يحصل على قيمة زاوية المائل. |
| virtual [LineGap](../../aspose.font/fontmetrics/linegap/) { get; } | يحصل على قيمة LineGap. |
| [StdHW](../../aspose.font.type1/type1fontmetrics/stdhw/) { get; } | يحصل على قيمة StdHW. |
| [StdVW](../../aspose.font.type1/type1fontmetrics/stdvw/) { get; } | يحصل على قيمة StdVW. |
| virtual [TypoAscender](../../aspose.font/fontmetrics/typoascender/) { get; set; } | يحصل على قيمة TypoAscender. |
| virtual [TypoDescender](../../aspose.font/fontmetrics/typodescender/) { get; set; } | يحصل على قيمة TypoDescender. |
| virtual [TypoLineGap](../../aspose.font/fontmetrics/typolinegap/) { get; } | يحصل على قيمة TypoLineGap. |
| [UnderlinePosition](../../aspose.font.type1/type1fontmetrics/underlineposition/) { get; } | يحصل على قيمة موضع الخط السفلي. |
| [UnderlineThickness](../../aspose.font.type1/type1fontmetrics/underlinethickness/) { get; } | يحصل على قيمة سمك الخط السفلي. |
| override [UnitsPerEM](../../aspose.font.type1/type1fontmetrics/unitsperem/) { get; set; } | يحصل على قيمة UnitsPerEM للخط السفلي. |
| [Weight](../../aspose.font.type1/type1fontmetrics/weight/) { get; } | يحصل على الوزن. |
| [XHeight](../../aspose.font.type1/type1fontmetrics/xheight/) { get; } | يحصل على قيمة XHeight. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | يعيد الصاعد لحجم الخط المحدد. |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | يعيد BBox للرمز. يعيد FontBBox إذا لم يتم تعريف BBox للرمز. قد يتم تجاوزها بواسطة مشتقات ترميز الخط المحددة. |
| override [GetGlyphWidth](../../aspose.font.type1/type1fontmetrics/getglyphwidth/)(GlyphId) | يعيد عرض القالب. قد يتم تجاوزها بواسطة وراثة ترميز الخط المحدد. |
| virtual [GetKerningValue](../../aspose.font/fontmetrics/getkerningvalue/)(GlyphId, GlyphId) | يعيد قيمة الترصيع للزوج من الرموز. |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | يعيد النازل لحجم الخط المحدد. |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | يعيد الفجوة بين السطور لحجم الخط المحدد. |
| override [MeasureString](../../aspose.font.type1/type1fontmetrics/measurestring/)(string, double) | يقيس السلسلة ويعيد عرض السلسلة. |
| override [SetGlyphWidth](../../aspose.font.type1/type1fontmetrics/setglyphwidth/)(GlyphId, double) | يضبط عرض الرمز. |

### انظر أيضاً

* class [FontMetrics](../../aspose.font/fontmetrics/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


