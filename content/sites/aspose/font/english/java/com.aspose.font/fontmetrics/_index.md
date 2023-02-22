---
title: FontMetrics
second_title: Aspose.Font for Java API Reference
description: Represents font metrics.
type: docs
weight: 33
url: /java/com.aspose.font/fontmetrics/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontMetrics](../../com.aspose.font/ifontmetrics)
```
public abstract class FontMetrics implements IFontMetrics
```

Represents font metrics.
## Methods

| Method | Description |
| --- | --- |
| [getAscender()](#getAscender--) | Gets Ascender value. |
| [setAscender(double value)](#setAscender-double-) | Sets Ascender value. |
| [getDescender()](#getDescender--) | Gets Descender value. |
| [setDescender(double value)](#setDescender-double-) | Sets Descender value. |
| [getTypoDescender()](#getTypoDescender--) | Gets TypoDescender value. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Sets TypoDescender value. |
| [getTypoAscender()](#getTypoAscender--) | Gets TypoAscender value. |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Sets TypoAscender value. |
| [getLineGap()](#getLineGap--) | Gets LineGap value. |
| [getTypoLineGap()](#getTypoLineGap--) | Gets TypoLineGap value. |
| [isFixedPitch()](#isFixedPitch--) | Gets IsFixedPitch value. |
| [getFontBBox()](#getFontBBox--) | Gets FontBBox value. |
| [getFontMatrix()](#getFontMatrix--) | Gets FontMatrix value. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets UnitsPerEM value. |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) | Sets UnitsPerEM value. |
| [getAscender(double fontSize)](#getAscender-double-) | Returns ascender for specific Font size. |
| [getDescender(double fontSize)](#getDescender-double-) | Returns descender for specific Font size. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Returns typographic descender for specific font size |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Returns typographic ascender for specific Font size. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Returns line gap for specific Font size. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Returns glyph width. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Returns glyph Bbox. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Returns kerning value for the glyph pair. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Measures string and returns string width. |
### getAscender() {#getAscender--}
```
public double getAscender()
```


Gets Ascender value.

**Returns:**
double - Ascender value.
### setAscender(double value) {#setAscender-double-}
```
public void setAscender(double value)
```


Sets Ascender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | Ascender value. |

### getDescender() {#getDescender--}
```
public double getDescender()
```


Gets Descender value.

**Returns:**
double - Descender value.
### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


Sets Descender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | Descender value. |

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
### isFixedPitch() {#isFixedPitch--}
```
public boolean isFixedPitch()
```


Gets IsFixedPitch value.

**Returns:**
boolean - IsFixedPitch value.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Gets UnitsPerEM value.

**Returns:**
long - UnitsPerEM value.
### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Sets UnitsPerEM value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | long | UnitsPerEM value. |

### getAscender(double fontSize) {#getAscender-double-}
```
public double getAscender(double fontSize)
```


Returns ascender for specific Font size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontSize | double | Font size. |

**Returns:**
double - Ascender value.
### getDescender(double fontSize) {#getDescender-double-}
```
public double getDescender(double fontSize)
```


Returns descender for specific Font size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontSize | double | Font size. |

**Returns:**
double - Descender value.
### getTypoDescender(double fontSize) {#getTypoDescender-double-}
```
public double getTypoDescender(double fontSize)
```


Returns typographic descender for specific font size

param fontSize Font size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontSize | double |  |

**Returns:**
double - Typographic descender value.
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public double getTypoAscender(double fontSize)
```


Returns typographic ascender for specific Font size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontSize | double | Font size. |

**Returns:**
double - Typographic ascender value.
### getTypoLineGap(double fontSize) {#getTypoLineGap-double-}
```
public double getTypoLineGap(double fontSize)
```


Returns line gap for specific Font size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontSize | double | Font size. |

**Returns:**
double - Line gap value.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Returns glyph width. May be overridden by specific font encoding inheritors.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier. |

**Returns:**
double - Glyph width.
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public FontBBox getGlyphBBox(GlyphId glyphId)
```


Returns glyph Bbox. Returns FontBBox if BBox was not defined for the glyph. May be overridden by specific font encoding inheritors.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier. |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox.
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
double - Kerning value.
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public abstract double measureString(String unicode, double fontSize)
```


Measures string and returns string width.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| unicode | java.lang.String | Unicode string. |
| fontSize | double | Font size. |

**Returns:**
double - String width.
