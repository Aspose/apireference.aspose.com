---
title: Interface IFontMetrics
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.IFontMetrics interface. Defines an interface for Font metrics tools
type: docs
weight: 500
url: /net/aspose.font/ifontmetrics/
---
## IFontMetrics interface

Defines an interface for Font metrics tools.

```csharp
public interface IFontMetrics
```

## Properties

| Name | Description |
| --- | --- |
| [Ascender](../../aspose.font/ifontmetrics/ascender/) { get; set; } | Gets ascender value of the Font in font units. |
| [Descender](../../aspose.font/ifontmetrics/descender/) { get; set; } | Gets descender value of the Font in font units. |
| [FontBBox](../../aspose.font/ifontmetrics/fontbbox/) { get; } | Gets Font bounding box. |
| [FontMatrix](../../aspose.font/ifontmetrics/fontmatrix/) { get; } | Gets Font transformation matrix. |
| [IsFixedPitch](../../aspose.font/ifontmetrics/isfixedpitch/) { get; } | True, if the Font is monospaced. |
| [LineGap](../../aspose.font/ifontmetrics/linegap/) { get; } | Gets LineGap value of the Font in Font units. |
| [TypoAscender](../../aspose.font/ifontmetrics/typoascender/) { get; set; } | Gets typographic ascender value of the Font in font units. |
| [TypoDescender](../../aspose.font/ifontmetrics/typodescender/) { get; set; } | Gets typographic descender value of the Font in Font units. |
| [TypoLineGap](../../aspose.font/ifontmetrics/typolinegap/) { get; } | Gets typographic LineGap value of the Font in Font units. |
| [UnitsPerEM](../../aspose.font/ifontmetrics/unitsperem/) { get; set; } | Gets units per em. |

## Methods

| Name | Description |
| --- | --- |
| [GetAscender](../../aspose.font/ifontmetrics/getascender/)(double) | Returns ascender for specific Font size. |
| [GetDescender](../../aspose.font/ifontmetrics/getdescender/)(double) | Returns descender for specific Font size. |
| [GetGlyphBBox](../../aspose.font/ifontmetrics/getglyphbbox/)(GlyphId) | Returns glyph BBox. |
| [GetGlyphWidth](../../aspose.font/ifontmetrics/getglyphwidth/)(GlyphId) | Returns glyph width. |
| [GetKerningValue](../../aspose.font/ifontmetrics/getkerningvalue/)(GlyphId, GlyphId) | Returns kerning value for the glyph pair. |
| [GetTypoAscender](../../aspose.font/ifontmetrics/gettypoascender/)(double) | Returns typographic ascender for specific Font size. |
| [GetTypoDescender](../../aspose.font/ifontmetrics/gettypodescender/)(double) | Returns typographic descender for specific Font size. |
| [GetTypoLineGap](../../aspose.font/ifontmetrics/gettypolinegap/)(double) | Returns line gap for specific Font size. |
| [MeasureString](../../aspose.font/ifontmetrics/measurestring/)(string, double) | Measures string and returns string width. |
| [SetGlyphWidth](../../aspose.font/ifontmetrics/setglyphwidth/)(GlyphId, double) | Sets glyph width. |

### See Also

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


