---
title: "الواجهة IFontMetrics"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "واجهة Aspose.Font.IFontMetrics. تُعرّف واجهة لأدوات قياسات الخط"
type: docs
weight: 500
url: /ar/net/aspose.font/ifontmetrics/
---
## IFontMetrics interface

يحدد واجهة لأدوات مقاييس الخط.

```csharp
public interface IFontMetrics
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [Ascender](../../aspose.font/ifontmetrics/ascender/) { get; set; } | يحصل على قيمة الصاعد للخط في وحدات الخط. |
| [Descender](../../aspose.font/ifontmetrics/descender/) { get; set; } | يحصل على قيمة النازل للخط في وحدات الخط. |
| [FontBBox](../../aspose.font/ifontmetrics/fontbbox/) { get; } | يحصل على صندوق الحد للخط. |
| [FontMatrix](../../aspose.font/ifontmetrics/fontmatrix/) { get; } | يحصل على مصفوفة تحويل الخط. |
| [IsFixedPitch](../../aspose.font/ifontmetrics/isfixedpitch/) { get; } | صحيح إذا كان الخط أحادي العرض. |
| [LineGap](../../aspose.font/ifontmetrics/linegap/) { get; } | يحصل على قيمة الفجوة بين السطور (LineGap) للخط بوحدات الخط. |
| [TypoAscender](../../aspose.font/ifontmetrics/typoascender/) { get; set; } | يحصل على قيمة الصاعد الطباعي للخط في وحدات الخط. |
| [TypoDescender](../../aspose.font/ifontmetrics/typodescender/) { get; set; } | يحصل على قيمة النازل الطباعي للخط في وحدات الخط. |
| [TypoLineGap](../../aspose.font/ifontmetrics/typolinegap/) { get; } | يحصل على قيمة الفجوة بين السطور الطباعية (LineGap) للخط في وحدات الخط. |
| [UnitsPerEM](../../aspose.font/ifontmetrics/unitsperem/) { get; set; } | يحصل على الوحدات لكل وحدة em. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [GetAscender](../../aspose.font/ifontmetrics/getascender/)(double) | يعيد الصاعد لحجم الخط المحدد. |
| [GetDescender](../../aspose.font/ifontmetrics/getdescender/)(double) | يعيد النازل لحجم الخط المحدد. |
| [GetGlyphBBox](../../aspose.font/ifontmetrics/getglyphbbox/)(GlyphId) | يعيد glyph BBox. |
| [GetGlyphWidth](../../aspose.font/ifontmetrics/getglyphwidth/)(GlyphId) | يعيد glyph width. |
| [GetKerningValue](../../aspose.font/ifontmetrics/getkerningvalue/)(GlyphId, GlyphId) | يعيد قيمة الترصيع للزوج من الرموز. |
| [GetTypoAscender](../../aspose.font/ifontmetrics/gettypoascender/)(double) | يعيد الصاعد الطباعي لحجم خط محدد. |
| [GetTypoDescender](../../aspose.font/ifontmetrics/gettypodescender/)(double) | يعيد النازل الطباعي لحجم خط محدد. |
| [GetTypoLineGap](../../aspose.font/ifontmetrics/gettypolinegap/)(double) | يعيد الفجوة بين السطور لحجم الخط المحدد. |
| [MeasureString](../../aspose.font/ifontmetrics/measurestring/)(string, double) | يقيس السلسلة ويعيد عرض السلسلة. |
| [SetGlyphWidth](../../aspose.font/ifontmetrics/setglyphwidth/)(GlyphId, double) | يضبط عرض الرمز. |

### انظر أيضاً

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


