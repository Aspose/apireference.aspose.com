---
title: "类 FontMetrics"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.FontMetrics 类。表示 Font 指标。"
type: docs
weight: 320
url: /zh/net/aspose.font/fontmetrics/
---
## FontMetrics class

表示 Font 度量。

```csharp
public abstract class FontMetrics : IFontMetrics
```

## 属性

| 名称 | 描述 |
| --- | --- |
| virtual [Ascender](../../aspose.font/fontmetrics/ascender/) { get; set; } | 获取 Ascender 值。 |
| virtual [Descender](../../aspose.font/fontmetrics/descender/) { get; set; } | 获取 Descender 值。 |
| virtual [FontBBox](../../aspose.font/fontmetrics/fontbbox/) { get; } | 获取 FontBBox 值。 |
| virtual [FontMatrix](../../aspose.font/fontmetrics/fontmatrix/) { get; } | 获取 FontMatrix 值。 |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | 获取 IsFixedPitch 值。 |
| virtual [LineGap](../../aspose.font/fontmetrics/linegap/) { get; } | 获取 LineGap 值。 |
| virtual [TypoAscender](../../aspose.font/fontmetrics/typoascender/) { get; set; } | 获取 TypoAscender 值。 |
| virtual [TypoDescender](../../aspose.font/fontmetrics/typodescender/) { get; set; } | 获取 TypoDescender 值。 |
| virtual [TypoLineGap](../../aspose.font/fontmetrics/typolinegap/) { get; } | 获取 TypoLineGap 值。 |
| virtual [UnitsPerEM](../../aspose.font/fontmetrics/unitsperem/) { get; set; } | 获取 UnitsPerEM 值。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | 返回特定字体大小的升部值。 |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | 返回特定字体大小的降部值。 |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | 返回字形 BBox。若字形未定义 BBox，则返回 FontBBox。可能会被特定字体编码的继承者覆盖。 |
| virtual [GetGlyphWidth](../../aspose.font/fontmetrics/getglyphwidth/)(GlyphId) | 返回字形宽度。可能会被特定字体编码的继承者覆盖。 |
| virtual [GetKerningValue](../../aspose.font/fontmetrics/getkerningvalue/)(GlyphId, GlyphId) | 返回字形对的字距值。 |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | 返回特定字体大小的降部值。 |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | 返回特定字体大小的降部值。 |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | 返回特定字体大小的行间距值。 |
| abstract [MeasureString](../../aspose.font/fontmetrics/measurestring/)(string, double) | 测量字符串并返回字符串宽度。 |
| abstract [SetGlyphWidth](../../aspose.font/fontmetrics/setglyphwidth/)(GlyphId, double) | 设置字形宽度。 |

### 另见

* interface [IFontMetrics](../ifontmetrics/)
* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


