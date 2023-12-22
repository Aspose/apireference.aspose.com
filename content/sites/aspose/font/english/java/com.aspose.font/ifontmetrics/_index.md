---
title: IFontMetrics
second_title: Aspose.Font for Java API Reference
description: Defines an interface for Font metrics tools.
type: docs
weight: 107
url: /java/com.aspose.font/ifontmetrics/
---```
public interface IFontMetrics
```

Defines an interface for Font metrics tools.
## Methods

| Method | Description |
| --- | --- |
| [isFixedPitch()](#isFixedPitch--) | True, if the Font is monospaced. |
| [getFontBBox()](#getFontBBox--) | Gets Font bounding box. |
| [getFontMatrix()](#getFontMatrix--) | Gets Font transformation matrix. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets Gets units per em. |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) |  |
| [getAscender()](#getAscender--) | Gets ascender value of the Font in font units. |
| [setAscender(double value)](#setAscender-double-) |  |
| [getTypoAscender()](#getTypoAscender--) | Gets typographic ascender value of the Font in font units |
| [setTypoAscender(double value)](#setTypoAscender-double-) |  |
| [getDescender()](#getDescender--) | Gets descender value of the Font in font units. |
| [setDescender(double value)](#setDescender-double-) |  |
| [getTypoDescender()](#getTypoDescender--) | Gets typographic descender value of the Font in Font units. |
| [setTypoDescender(double value)](#setTypoDescender-double-) |  |
| [getLineGap()](#getLineGap--) | Gets LineGap value of the Font in Font units. |
| [getTypoLineGap()](#getTypoLineGap--) | Gets typographic LineGap value of the Font in Font units. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Returns kerning value for the glyph pair. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Returns glyph width. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Returns glyph BBox. |
| [getAscender(double fontSize)](#getAscender-double-) | Returns ascender for specific Font size. |
| [getDescender(double fontSize)](#getDescender-double-) | Returns descender for specific Font size. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Returns typographic descender for specific Font size. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Returns typographic ascender for specific Font size. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Returns line gap for specific Font size. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Measures string and returns string width. |
### isFixedPitch() {#isFixedPitch--}
```
public abstract boolean isFixedPitch()
```


True, if the Font is monospaced.

**Returns:**
boolean - True, if the Font is monospaced.
### getFontBBox() {#getFontBBox--}
```
public abstract FontBBox getFontBBox()
```


Gets Font bounding box.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Font bounding box.
### getFontMatrix() {#getFontMatrix--}
```
public abstract TransformationMatrix getFontMatrix()
```


Gets Font transformation matrix.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Font transformation matrix.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public abstract long getUnitsPerEM()
```


Gets Gets units per em.

**Returns:**
long - Units per em.
### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public abstract void setUnitsPerEM(long value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | long |  |

### getAscender() {#getAscender--}
```
public abstract double getAscender()
```


Gets ascender value of the Font in font units.

**Returns:**
double - Ascender value of the Font in font units.
### setAscender(double value) {#setAscender-double-}
```
public abstract void setAscender(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### getTypoAscender() {#getTypoAscender--}
```
public abstract double getTypoAscender()
```


Gets typographic ascender value of the Font in font units

**Returns:**
double - Typographic ascender value of the Font in font units
### setTypoAscender(double value) {#setTypoAscender-double-}
```
public abstract void setTypoAscender(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### getDescender() {#getDescender--}
```
public abstract double getDescender()
```


Gets descender value of the Font in font units.

**Returns:**
double - Descender value of the Font in font units.
### setDescender(double value) {#setDescender-double-}
```
public abstract void setDescender(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### getTypoDescender() {#getTypoDescender--}
```
public abstract double getTypoDescender()
```


Gets typographic descender value of the Font in Font units.

**Returns:**
double - Typographic descender value of the Font in Font units.
### setTypoDescender(double value) {#setTypoDescender-double-}
```
public abstract void setTypoDescender(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### getLineGap() {#getLineGap--}
```
public abstract double getLineGap()
```


Gets LineGap value of the Font in Font units.

**Returns:**
double - LineGap value of the Font in Font units.
### getTypoLineGap() {#getTypoLineGap--}
```
public abstract double getTypoLineGap()
```


Gets typographic LineGap value of the Font in Font units.

**Returns:**
double - Typographic LineGap value of the Font in Font units.
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public abstract double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


Returns kerning value for the glyph pair.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | First glyph in pair. |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Font size. |

**Returns:**
double - Kerning value.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public abstract double getGlyphWidth(GlyphId glyphId)
```


Returns glyph width.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier. |

**Returns:**
double - Glyph width.
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public abstract FontBBox getGlyphBBox(GlyphId glyphId)
```


Returns glyph BBox.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | glyph identifier |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - glyph BBox
### getAscender(double fontSize) {#getAscender-double-}
```
public abstract double getAscender(double fontSize)
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
public abstract double getDescender(double fontSize)
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
public abstract double getTypoDescender(double fontSize)
```


Returns typographic descender for specific Font size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontSize | double | Font size. |

**Returns:**
double - Typographic descender value.
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public abstract double getTypoAscender(double fontSize)
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
public abstract double getTypoLineGap(double fontSize)
```


Returns line gap for specific Font size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontSize | double | Font size. |

**Returns:**
double - Line gap value.
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
