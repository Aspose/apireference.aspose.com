---
title: Class Type1FontMetrics
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Type1.Type1FontMetrics class. Represents Type1 Font metrics
type: docs
weight: 1470
url: /net/aspose.font.type1/type1fontmetrics/
---
## Type1FontMetrics class

Represents Type1 Font metrics.

```csharp
public class Type1FontMetrics : FontMetrics
```

## Properties

| Name | Description |
| --- | --- |
| override [Ascender](../../aspose.font.type1/type1fontmetrics/ascender/) { get; } | Gets ascender value. |
| [CapHeight](../../aspose.font.type1/type1fontmetrics/capheight/) { get; } | Gets cap height value. |
| override [Descender](../../aspose.font.type1/type1fontmetrics/descender/) { get; } | Gets descender value. |
| override [FontBBox](../../aspose.font.type1/type1fontmetrics/fontbbox/) { get; } | Gets FontBBox value. |
| override [FontMatrix](../../aspose.font.type1/type1fontmetrics/fontmatrix/) { get; } | Gets Font transformation matrix. |
| [IsFixedPitch](../../aspose.font/fontmetrics/isfixedpitch/) { get; } | Gets IsFixedPitch value. |
| [ItalicAngle](../../aspose.font.type1/type1fontmetrics/italicangle/) { get; } | Gets italic angle value. |
| virtual [LineGap](../../aspose.font/fontmetrics/linegap/) { get; } | Gets LineGap value. |
| [StdHW](../../aspose.font.type1/type1fontmetrics/stdhw/) { get; } | Gets StdHW value. |
| [StdVW](../../aspose.font.type1/type1fontmetrics/stdvw/) { get; } | Gets StdVW value. |
| virtual [TypoAscender](../../aspose.font/fontmetrics/typoascender/) { get; set; } | Gets TypoAscender value. |
| virtual [TypoDescender](../../aspose.font/fontmetrics/typodescender/) { get; set; } | Gets TypoDescender value. |
| virtual [TypoLineGap](../../aspose.font/fontmetrics/typolinegap/) { get; } | Gets TypoLineGap value. |
| [UnderlinePosition](../../aspose.font.type1/type1fontmetrics/underlineposition/) { get; } | Gets underline position value. |
| [UnderlineThickness](../../aspose.font.type1/type1fontmetrics/underlinethickness/) { get; } | Gets underline thickness value. |
| override [UnitsPerEM](../../aspose.font.type1/type1fontmetrics/unitsperem/) { get; set; } | Gets underline UnitsPerEM value. |
| [Weight](../../aspose.font.type1/type1fontmetrics/weight/) { get; } | Gets weight. |
| [XHeight](../../aspose.font.type1/type1fontmetrics/xheight/) { get; } | Gets XHeight value. |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetAscender](../../aspose.font/fontmetrics/getascender/)(double) | Returns ascender for specific Font size. |
| virtual [GetDescender](../../aspose.font/fontmetrics/getdescender/)(double) | Returns descender for specific Font size. |
| virtual [GetGlyphBBox](../../aspose.font/fontmetrics/getglyphbbox/)(GlyphId) | Returns glyph BBox. Returns FontBBox if BBox was not defined for the glyph. May be overridden by specific font encoding inheritors. |
| override [GetGlyphWidth](../../aspose.font.type1/type1fontmetrics/getglyphwidth/)(GlyphId) | Returns glyph width. May be ovridden by specific font encoding inheritors. |
| virtual [GetKerningValue](../../aspose.font/fontmetrics/getkerningvalue/)(GlyphId, GlyphId) | Returns kerning value for the glyph pair. |
| virtual [GetTypoAscender](../../aspose.font/fontmetrics/gettypoascender/)(double) | Returns descender for specific Font size. |
| virtual [GetTypoDescender](../../aspose.font/fontmetrics/gettypodescender/)(double) | Returns descender for specific Font size. |
| virtual [GetTypoLineGap](../../aspose.font/fontmetrics/gettypolinegap/)(double) | Returns line gap for specific Font size. |
| override [MeasureString](../../aspose.font.type1/type1fontmetrics/measurestring/)(string, double) | Measures string and returns string width. |
| override [SetGlyphWidth](../../aspose.font.type1/type1fontmetrics/setglyphwidth/)(GlyphId, double) | Sets glyph width. |

### See Also

* class [FontMetrics](../../aspose.font/fontmetrics/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


