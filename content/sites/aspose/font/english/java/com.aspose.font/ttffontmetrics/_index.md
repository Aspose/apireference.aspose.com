---
title: TtfFontMetrics
second_title: Aspose.Font for Java API Reference
description: Represents TTF Font metrics.
type: docs
weight: 75
url: /java/com.aspose.font/ttffontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class TtfFontMetrics extends FontMetrics
```

Represents TTF Font metrics.
## Methods

| Method | Description |
| --- | --- |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Returns glyphs width by glyph id. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Measures string and returns string width. |
| [getAscender()](#getAscender--) | Gets ascender value. |
| [setAscender(double value)](#setAscender-double-) | Sets ascender value. |
| [getDescender()](#getDescender--) | Gets descender value. |
| [setDescender(double value)](#setDescender-double-) | Sets descender value. |
| [getTypoAscender()](#getTypoAscender--) | Gets TypoAscender value. |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Sets TypoAscender value. |
| [getTypoDescender()](#getTypoDescender--) | Gets TypoDescender value. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Sets TypoDescender value. |
| [getLineGap()](#getLineGap--) | Gets LineGap value. |
| [getTypoLineGap()](#getTypoLineGap--) | Gets TypoLineGap value. |
| [getFontBBox()](#getFontBBox--) | Gets FontBBox value. |
| [getFontMatrix()](#getFontMatrix--) | Gets FontBBox value. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Returns kerning value for the glyph pair. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets UnitsPerEM value. |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) |  |
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Returns glyphs width by glyph id.

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
### getAscender() {#getAscender--}
```
public double getAscender()
```


Gets ascender value.

**Returns:**
double - Ascender value.
### setAscender(double value) {#setAscender-double-}
```
public void setAscender(double value)
```


Sets ascender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | Ascender value. |

### getDescender() {#getDescender--}
```
public double getDescender()
```


Gets descender value.

**Returns:**
double - Descender value.
### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


Sets descender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | Descender value. |

### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


Gets TypoAscender value.

**Returns:**
double - TypoAscender value.
### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


Sets TypoAscender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | TypoAscender value. |

### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


Gets TypoDescender value.

**Returns:**
double - TypoDescender value.
### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


Sets TypoDescender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | TypoDescender value. |

### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


Gets LineGap value.

**Returns:**
double - LineGap value.
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


Gets TypoLineGap value.

**Returns:**
double - TypoLineGap value.
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


Gets FontBBox value.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox)
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


Gets FontBBox value.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix)
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


Returns kerning value for the glyph pair.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | First glyph in pair. |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Font size. |

**Returns:**
double - Kerning value
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Gets UnitsPerEM value.

**Returns:**
long
### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Sets UnitsPerEM value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | long |  |

