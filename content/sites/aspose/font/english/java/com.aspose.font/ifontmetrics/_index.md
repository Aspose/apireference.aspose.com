---
title: IFontMetrics
second_title: Aspose.Font for Java API Reference
description: Defines an interface for Font metrics tools.
type: docs
weight: 124
url: /java/com.aspose.font/ifontmetrics/
---```
public interface IFontMetrics
```

Defines an interface for Font metrics tools.
## Methods

| Method | Description |
| --- | --- |
| [getAscender()](#getAscender--) | Gets ascender value of the Font in font units. |
| [getAscender(double fontSize)](#getAscender-double-) | Returns ascender for specific Font size. |
| [getDescender()](#getDescender--) | Gets descender value of the Font in font units. |
| [getDescender(double fontSize)](#getDescender-double-) | Returns descender for specific Font size. |
| [getFontBBox()](#getFontBBox--) | Gets Font bounding box. |
| [getFontMatrix()](#getFontMatrix--) | Gets Font transformation matrix. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Returns glyph BBox. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Returns glyph width. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Returns kerning value for the glyph pair. |
| [getLineGap()](#getLineGap--) | Gets LineGap value of the Font in Font units. |
| [getTypoAscender()](#getTypoAscender--) | Gets typographic ascender value of the Font in font units |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Returns typographic ascender for specific Font size. |
| [getTypoDescender()](#getTypoDescender--) | Gets typographic descender value of the Font in Font units. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Returns typographic descender for specific Font size. |
| [getTypoLineGap()](#getTypoLineGap--) | Gets typographic LineGap value of the Font in Font units. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Returns line gap for specific Font size. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets Gets units per em. |
| [isFixedPitch()](#isFixedPitch--) | True, if the Font is monospaced. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Measures string and returns string width. |
| [setAscender(double value)](#setAscender-double-) |  |
| [setDescender(double value)](#setDescender-double-) |  |
| [setTypoAscender(double value)](#setTypoAscender-double-) |  |
| [setTypoDescender(double value)](#setTypoDescender-double-) |  |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) |  |
### getAscender() {#getAscender--}
```
public abstract double getAscender()
```


Gets ascender value of the Font in font units.

**Returns:**
double - Ascender value of the Font in font units.
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
### getDescender() {#getDescender--}
```
public abstract double getDescender()
```


Gets descender value of the Font in font units.

**Returns:**
double - Descender value of the Font in font units.
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
### getLineGap() {#getLineGap--}
```
public abstract double getLineGap()
```


Gets LineGap value of the Font in Font units.

**Returns:**
double - LineGap value of the Font in Font units.
### getTypoAscender() {#getTypoAscender--}
```
public abstract double getTypoAscender()
```


Gets typographic ascender value of the Font in font units

**Returns:**
double - Typographic ascender value of the Font in font units
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
### getTypoDescender() {#getTypoDescender--}
```
public abstract double getTypoDescender()
```


Gets typographic descender value of the Font in Font units.

**Returns:**
double - Typographic descender value of the Font in Font units.
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
### getTypoLineGap() {#getTypoLineGap--}
```
public abstract double getTypoLineGap()
```


Gets typographic LineGap value of the Font in Font units.

**Returns:**
double - Typographic LineGap value of the Font in Font units.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public abstract long getUnitsPerEM()
```


Gets Gets units per em.

**Returns:**
long - Units per em.
### isFixedPitch() {#isFixedPitch--}
```
public abstract boolean isFixedPitch()
```


True, if the Font is monospaced.

**Returns:**
boolean - True, if the Font is monospaced.
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
### setAscender(double value) {#setAscender-double-}
```
public abstract void setAscender(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### setDescender(double value) {#setDescender-double-}
```
public abstract void setDescender(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public abstract void setTypoAscender(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public abstract void setTypoDescender(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public abstract void setUnitsPerEM(long value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | long |  |

