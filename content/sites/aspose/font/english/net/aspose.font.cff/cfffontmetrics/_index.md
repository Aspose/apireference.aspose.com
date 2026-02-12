---
title: Class CffFontMetrics
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Cff.CffFontMetrics class. Represents CFF Font metrics
type: docs
weight: 40
url: /net/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class

Represents CFF Font metrics.

```csharp
public class CffFontMetrics : FontMetrics
```

## Properties

| Name | Description |
| --- | --- |
| override [Ascender](../../aspose.font.cff/cfffontmetrics/ascender/) { get; } | Gets Ascender value. |
| override [Descender](../../aspose.font.cff/cfffontmetrics/descender/) { get; } | Gets Descender value. |
| override [FontBBox](../../aspose.font.cff/cfffontmetrics/fontbbox/) { get; } | Gets FontBBox value. |
| override [FontMatrix](../../aspose.font.cff/cfffontmetrics/fontmatrix/) { get; } | Gets FontMatrix value. |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | Gets IsFixedPitch value. |
| virtual [LineGap](../../aspose.font/fontmetrics/linegap/) { get; } | Gets LineGap value. |
| virtual [TypoAscender](../../aspose.font/fontmetrics/typoascender/) { get; set; } | Gets TypoAscender value. |
| virtual [TypoDescender](../../aspose.font/fontmetrics/typodescender/) { get; set; } | Gets TypoDescender value. |
| virtual [TypoLineGap](../../aspose.font/fontmetrics/typolinegap/) { get; } | Gets TypoLineGap value. |
| override [UnitsPerEM](../../aspose.font.cff/cfffontmetrics/unitsperem/) { get; } | Gets UnitsPerEM value. |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | Returns ascender for specific Font size. |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | Returns descender for specific Font size. |
| [GetFontMatrixForGlyph](../../aspose.font.cff/cfffontmetrics/getfontmatrixforglyph/)(GlyphId) | Calculates transformation matrix for glyph specified by id. |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | Returns glyph BBox. Returns FontBBox if BBox was not defined for the glyph. May be overridden by specific font encoding inheritors. |
| override [GetGlyphWidth](../../aspose.font.cff/cfffontmetrics/getglyphwidth/)(GlyphId) | Returns glyph width. May be overridden by specific Font encoding inheritors. |
| virtual [GetKerningValue](../../aspose.font/fontmetrics/getkerningvalue/)(GlyphId, GlyphId) | Returns kerning value for the glyph pair. |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | Returns descender for specific Font size. |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | Returns descender for specific Font size. |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | Returns line gap for specific Font size. |
| override [MeasureString](../../aspose.font.cff/cfffontmetrics/measurestring/)(string, double) | Measures string and returns string width. |
| override [SetGlyphWidth](../../aspose.font.cff/cfffontmetrics/setglyphwidth/)(GlyphId, double) | Sets glyph width. |

### See Also

* class [FontMetrics](../../aspose.font/fontmetrics/)
* namespace [Aspose.Font.Cff](../../aspose.font.cff/)
* assembly [Aspose.Font](../../)


