---
title: "类 CffFontMetrics"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Cff.CffFontMetrics 类。表示 CFF 字体度量"
type: docs
weight: 40
url: /zh/net/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class

表示 CFF 字体度量。

```csharp
public class CffFontMetrics : FontMetrics
```

## 属性

| 名称 | 描述 |
| --- | --- |
| override [Ascender](../../aspose.font.cff/cfffontmetrics/ascender/) { get; } | 获取 Ascender 值。 |
| override [Descender](../../aspose.font.cff/cfffontmetrics/descender/) { get; } | 获取 Descender 值。 |
| override [FontBBox](../../aspose.font.cff/cfffontmetrics/fontbbox/) { get; } | 获取 FontBBox 值。 |
| override [FontMatrix](../../aspose.font.cff/cfffontmetrics/fontmatrix/) { get; } | 获取 FontMatrix 值。 |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | 获取 IsFixedPitch 值。 |
| virtual [LineGap](../../aspose.font/fontmetrics/linegap/) { get; } | 获取 LineGap 值。 |
| virtual [TypoAscender](../../aspose.font/fontmetrics/typoascender/) { get; set; } | 获取 TypoAscender 值。 |
| virtual [TypoDescender](../../aspose.font/fontmetrics/typodescender/) { get; set; } | 获取 TypoDescender 值。 |
| virtual [TypoLineGap](../../aspose.font/fontmetrics/typolinegap/) { get; } | 获取 TypoLineGap 值。 |
| override [UnitsPerEM](../../aspose.font.cff/cfffontmetrics/unitsperem/) { get; } | 获取 UnitsPerEM 值。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | 返回特定字体大小的升部值。 |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | 返回特定字体大小的降部值。 |
| [GetFontMatrixForGlyph](../../aspose.font.cff/cfffontmetrics/getfontmatrixforglyph/)(GlyphId) | 计算由 id 指定的字形的变换矩阵。 |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | 返回字形 BBox。若字形未定义 BBox，则返回 FontBBox。可能会被特定字体编码的继承者覆盖。 |
| override [GetGlyphWidth](../../aspose.font.cff/cfffontmetrics/getglyphwidth/)(GlyphId) | 返回字形宽度。可能被特定字体编码的继承者覆盖。 |
| virtual [GetKerningValue](../../aspose.font/fontmetrics/getkerningvalue/)(GlyphId, GlyphId) | 返回字形对的字距值。 |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | 返回特定字体大小的降部值。 |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | 返回特定字体大小的降部值。 |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | 返回特定字体大小的行间距值。 |
| override [MeasureString](../../aspose.font.cff/cfffontmetrics/measurestring/)(string, double) | 测量字符串并返回字符串宽度。 |
| override [SetGlyphWidth](../../aspose.font.cff/cfffontmetrics/setglyphwidth/)(GlyphId, double) | 设置字形宽度。 |

### 另见

* class [FontMetrics](../../aspose.font/fontmetrics/)
* namespace [Aspose.Font.Cff](../../aspose.font.cff/)
* assembly [Aspose.Font](../../)


