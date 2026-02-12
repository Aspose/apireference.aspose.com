---
title: Class TtfFontMetrics
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Ttf.TtfFontMetrics class. Represents TTF Font metrics
type: docs
weight: 880
url: /net/aspose.font.ttf/ttffontmetrics/
---
## TtfFontMetrics class

Represents TTF Font metrics.

```csharp
public class TtfFontMetrics : FontMetrics
```

## Properties

| Name | Description |
| --- | --- |
| override [Ascender](../../aspose.font.ttf/ttffontmetrics/ascender/) { get; set; } | Gets ascender value. |
| override [Descender](../../aspose.font.ttf/ttffontmetrics/descender/) { get; set; } | Gets descender value. |
| override [FontBBox](../../aspose.font.ttf/ttffontmetrics/fontbbox/) { get; } | Gets FontBBox value. |
| override [FontMatrix](../../aspose.font.ttf/ttffontmetrics/fontmatrix/) { get; } | Gets FontBBox value. |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | Gets IsFixedPitch value. |
| override [LineGap](../../aspose.font.ttf/ttffontmetrics/linegap/) { get; } | Gets LineGap value. |
| override [TypoAscender](../../aspose.font.ttf/ttffontmetrics/typoascender/) { get; set; } | Gets TypoAscender value. |
| override [TypoDescender](../../aspose.font.ttf/ttffontmetrics/typodescender/) { get; set; } | Gets TypoDescender value. |
| override [TypoLineGap](../../aspose.font.ttf/ttffontmetrics/typolinegap/) { get; } | Gets TypoLineGap value. |
| override [UnitsPerEM](../../aspose.font.ttf/ttffontmetrics/unitsperem/) { get; set; } | Gets UnitsPerEM value. |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | Returns ascender for specific Font size. |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | Returns descender for specific Font size. |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | Returns glyph BBox. Returns FontBBox if BBox was not defined for the glyph. May be overridden by specific font encoding inheritors. |
| override [GetGlyphWidth](../../aspose.font.ttf/ttffontmetrics/getglyphwidth/)(GlyphId) | Returns glyphs width by glyph id. |
| override [GetKerningValue](../../aspose.font.ttf/ttffontmetrics/getkerningvalue/)(GlyphId, GlyphId) | Returns kerning value for the glyph pair. |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | Returns descender for specific Font size. |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | Returns descender for specific Font size. |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | Returns line gap for specific Font size. |
| override [MeasureString](../../aspose.font.ttf/ttffontmetrics/measurestring/#measurestring)(string, double) | Measures string and returns string width. |
| [MeasureString](../../aspose.font.ttf/ttffontmetrics/measurestring/#measurestring_1)(uint[], double) | Measures text represented as array of character codes and returns string width. |
| override [SetGlyphWidth](../../aspose.font.ttf/ttffontmetrics/setglyphwidth/)(GlyphId, double) | Sets glyph width. |

### See Also

* class [FontMetrics](../../aspose.font/fontmetrics/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


