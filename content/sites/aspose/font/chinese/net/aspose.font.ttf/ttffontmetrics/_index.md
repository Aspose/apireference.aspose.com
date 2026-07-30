---
title: "类 TtfFontMetrics"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Ttf.TtfFontMetrics 类。表示 TTF 字体度量"
type: docs
weight: 880
url: /zh/net/aspose.font.ttf/ttffontmetrics/
---
## TtfFontMetrics class

表示 TTF 字体度量。

```csharp
public class TtfFontMetrics : FontMetrics
```

## 属性

| 名称 | 描述 |
| --- | --- |
| override [Ascender](../../aspose.font.ttf/ttffontmetrics/ascender/) { get; set; } | 获取升部值。 |
| override [Descender](../../aspose.font.ttf/ttffontmetrics/descender/) { get; set; } | 获取降部值。 |
| override [FontBBox](../../aspose.font.ttf/ttffontmetrics/fontbbox/) { get; } | 获取 FontBBox 值。 |
| override [FontMatrix](../../aspose.font.ttf/ttffontmetrics/fontmatrix/) { get; } | 获取 FontBBox 值。 |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | 获取 IsFixedPitch 值。 |
| override [LineGap](../../aspose.font.ttf/ttffontmetrics/linegap/) { get; } | 获取 LineGap 值。 |
| override [TypoAscender](../../aspose.font.ttf/ttffontmetrics/typoascender/) { get; set; } | 获取 TypoAscender 值。 |
| override [TypoDescender](../../aspose.font.ttf/ttffontmetrics/typodescender/) { get; set; } | 获取 TypoDescender 值。 |
| override [TypoLineGap](../../aspose.font.ttf/ttffontmetrics/typolinegap/) { get; } | 获取 TypoLineGap 值。 |
| override [UnitsPerEM](../../aspose.font.ttf/ttffontmetrics/unitsperem/) { get; set; } | 获取 UnitsPerEM 值。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | 返回特定字体大小的升部值。 |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | 返回特定字体大小的降部值。 |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | 返回字形 BBox。若字形未定义 BBox，则返回 FontBBox。可能会被特定字体编码的继承者覆盖。 |
| override [GetGlyphWidth](../../aspose.font.ttf/ttffontmetrics/getglyphwidth/)(GlyphId) | 根据字形 ID 返回字形宽度。 |
| override [GetKerningValue](../../aspose.font.ttf/ttffontmetrics/getkerningvalue/)(GlyphId, GlyphId) | 返回字形对的字距值。 |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | 返回特定字体大小的降部值。 |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | 返回特定字体大小的降部值。 |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | 返回特定字体大小的行间距值。 |
| override [MeasureString](../../aspose.font.ttf/ttffontmetrics/measurestring/#measurestring)(string, double) | 测量字符串并返回字符串宽度。 |
| [MeasureString](../../aspose.font.ttf/ttffontmetrics/measurestring/#measurestring_1)(uint[], double) | 测量以字符代码数组表示的文本并返回字符串宽度。 |
| override [SetGlyphWidth](../../aspose.font.ttf/ttffontmetrics/setglyphwidth/)(GlyphId, double) | 设置字形宽度。 |

### 另见

* class [FontMetrics](../../aspose.font/fontmetrics/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


