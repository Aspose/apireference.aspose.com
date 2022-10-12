---
title: CffFontMetrics
second_title: Aspose.Font for Java API Reference
description: CFF font metrics implementation
type: docs
weight: 14
url: /java/com.aspose.font/cfffontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class CffFontMetrics extends FontMetrics
```

CFF font metrics implementation
## Methods

| Method | Description |
| --- | --- |
| [getAscender()](#getAscender--) | Gets Ascender value. |
| [getDescender()](#getDescender--) | Gets Descender value. |
| [getFontBBox()](#getFontBBox--) | Gets FontBBox value. |
| [getFontMatrix()](#getFontMatrix--) | Gets FontMatrix value. |
| [getFontMatrixForGlyph(GlyphId glyphId)](#getFontMatrixForGlyph-com.aspose.font.GlyphId-) | Calculates transformation matrix for glyph specified by id. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets UnitsPerEM value. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Returns glyph width. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Measures string and returns string width. |
### getAscender() {#getAscender--}
```
public double getAscender()
```


Gets Ascender value.

**Returns:**
double - Ascender value.
### getDescender() {#getDescender--}
```
public double getDescender()
```


Gets Descender value.

**Returns:**
double - Descender value.
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


Gets FontBBox value.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - FontBBox value.
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


Gets FontMatrix value.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - FontMatrix value.
### getFontMatrixForGlyph(GlyphId glyphId) {#getFontMatrixForGlyph-com.aspose.font.GlyphId-}
```
public TransformationMatrix getFontMatrixForGlyph(GlyphId glyphId)
```


Calculates transformation matrix for glyph specified by id.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier. |

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Glyph transformation matrix.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Gets UnitsPerEM value.

**Returns:**
long - UnitsPerEM value.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Returns glyph width. May be overridden by specific Font encoding inheritors.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier. |

**Returns:**
double - Glyph width.
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public double measureString(String unicode, double fontSize)
```


Measures string and returns string width.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| unicode | java.lang.String | Unicode string. |
| fontSize | double | Font size. |

**Returns:**
double - String width.
