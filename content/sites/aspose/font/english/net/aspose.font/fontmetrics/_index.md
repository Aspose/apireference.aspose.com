---
title: Class FontMetrics
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.FontMetrics class. Represents Font metrics
type: docs
weight: 320
url: /net/aspose.font/fontmetrics/
---
## FontMetrics class

Represents Font metrics.

```csharp
public abstract class FontMetrics : IFontMetrics
```

## Properties

| Name | Description |
| --- | --- |
| virtual [Ascender](../../aspose.font/fontmetrics/ascender/) { get; set; } | Gets Ascender value. |
| virtual [Descender](../../aspose.font/fontmetrics/descender/) { get; set; } | Gets Descender value. |
| virtual [FontBBox](../../aspose.font/fontmetrics/fontbbox/) { get; } | Gets FontBBox value. |
| virtual [FontMatrix](../../aspose.font/fontmetrics/fontmatrix/) { get; } | Gets FontMatrix value. |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | Gets IsFixedPitch value. |
| virtual [LineGap](../../aspose.font/fontmetrics/linegap/) { get; } | Gets LineGap value. |
| virtual [TypoAscender](../../aspose.font/fontmetrics/typoascender/) { get; set; } | Gets TypoAscender value. |
| virtual [TypoDescender](../../aspose.font/fontmetrics/typodescender/) { get; set; } | Gets TypoDescender value. |
| virtual [TypoLineGap](../../aspose.font/fontmetrics/typolinegap/) { get; } | Gets TypoLineGap value. |
| virtual [UnitsPerEM](../../aspose.font/fontmetrics/unitsperem/) { get; set; } | Gets UnitsPerEM value. |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | Returns ascender for specific Font size. |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | Returns descender for specific Font size. |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | Returns glyph BBox. Returns FontBBox if BBox was not defined for the glyph. May be overridden by specific font encoding inheritors. |
| virtual [GetGlyphWidth](../../aspose.font/fontmetrics/getglyphwidth/)(GlyphId) | Returns glyph width. May be overridden by specific font encoding inheritors. |
| virtual [GetKerningValue](../../aspose.font/fontmetrics/getkerningvalue/)(GlyphId, GlyphId) | Returns kerning value for the glyph pair. |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | Returns descender for specific Font size. |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | Returns descender for specific Font size. |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | Returns line gap for specific Font size. |
| abstract [MeasureString](../../aspose.font/fontmetrics/measurestring/)(string, double) | Measures string and returns string width. |
| abstract [SetGlyphWidth](../../aspose.font/fontmetrics/setglyphwidth/)(GlyphId, double) | Sets glyph width. |

### See Also

* interface [IFontMetrics](../ifontmetrics/)
* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


