---
title: "接口 IFontMetrics"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.IFontMetrics 接口。定义用于字体度量工具的接口"
type: docs
weight: 500
url: /zh/net/aspose.font/ifontmetrics/
---
## IFontMetrics interface

定义 Font 度量工具的接口。

```csharp
public interface IFontMetrics
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [Ascender](../../aspose.font/ifontmetrics/ascender/) { get; set; } | 获取 Font 的 ascender 值（以 font 单位计）。 |
| [Descender](../../aspose.font/ifontmetrics/descender/) { get; set; } | 获取 Font 的 descender 值（以 font 单位计）。 |
| [FontBBox](../../aspose.font/ifontmetrics/fontbbox/) { get; } | 获取 Font 的边界框。 |
| [FontMatrix](../../aspose.font/ifontmetrics/fontmatrix/) { get; } | 获取字体变换矩阵。 |
| [IsFixedPitch](../../aspose.font/ifontmetrics/isfixedpitch/) { get; } | 如果 Font 是等宽的，则为 True。 |
| [LineGap](../../aspose.font/ifontmetrics/linegap/) { get; } | 获取 Font 的 LineGap 值（以 Font 单位计）。 |
| [TypoAscender](../../aspose.font/ifontmetrics/typoascender/) { get; set; } | 获取 Font 的排版 ascender 值（以 font 单位计）。 |
| [TypoDescender](../../aspose.font/ifontmetrics/typodescender/) { get; set; } | 获取 Font 的排版 descender 值（以 font 单位计）。 |
| [TypoLineGap](../../aspose.font/ifontmetrics/typolinegap/) { get; } | 获取 Font 的排版 LineGap 值（以 Font 单位计）。 |
| [UnitsPerEM](../../aspose.font/ifontmetrics/unitsperem/) { get; set; } | 获取每个 em 的单位数。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [GetAscender](../../aspose.font/ifontmetrics/getascender/)(double) | 返回特定字体大小的升部值。 |
| [GetDescender](../../aspose.font/ifontmetrics/getdescender/)(double) | 返回特定字体大小的降部值。 |
| [GetGlyphBBox](../../aspose.font/ifontmetrics/getglyphbbox/)(GlyphId) | 返回字形 BBox。 |
| [GetGlyphWidth](../../aspose.font/ifontmetrics/getglyphwidth/)(GlyphId) | 返回字形宽度。 |
| [GetKerningValue](../../aspose.font/ifontmetrics/getkerningvalue/)(GlyphId, GlyphId) | 返回字形对的字距值。 |
| [GetTypoAscender](../../aspose.font/ifontmetrics/gettypoascender/)(double) | 返回特定 Font 大小的排版 ascender。 |
| [GetTypoDescender](../../aspose.font/ifontmetrics/gettypodescender/)(double) | 返回特定 Font 大小的排版 descender。 |
| [GetTypoLineGap](../../aspose.font/ifontmetrics/gettypolinegap/)(double) | 返回特定字体大小的行间距值。 |
| [MeasureString](../../aspose.font/ifontmetrics/measurestring/)(string, double) | 测量字符串并返回字符串宽度。 |
| [SetGlyphWidth](../../aspose.font/ifontmetrics/setglyphwidth/)(GlyphId, double) | 设置字形宽度。 |

### 另见

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


