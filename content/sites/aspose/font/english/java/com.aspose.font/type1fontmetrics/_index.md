---
title: Type1FontMetrics
second_title: Aspose.Font for Java API Reference
description: Represents Type1 Font metrics.
type: docs
weight: 108
url: /java/com.aspose.font/type1fontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class Type1FontMetrics extends FontMetrics
```

Represents Type1 Font metrics.
## Methods

| Method | Description |
| --- | --- |
| [getWeight()](#getWeight--) | Gets weight. |
| [getItalicAngle()](#getItalicAngle--) | Gets italic angle value. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Gets underline position value. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Gets underline thickness value. |
| [getCapHeight()](#getCapHeight--) | Gets cap height value. |
| [getXHeight()](#getXHeight--) | Gets XHeight value. |
| [getAscender()](#getAscender--) | Gets ascender value. |
| [getDescender()](#getDescender--) | Gets descender value. |
| [getStdHW()](#getStdHW--) | Gets StdHW value. |
| [getStdVW()](#getStdVW--) | Gets StdVW value. |
| [getFontBBox()](#getFontBBox--) | Gets FontBBox value. |
| [getFontMatrix()](#getFontMatrix--) | Gets Font transformation matrix. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets underline UnitsPerEM value. |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) |  |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Returns glyph width. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Measures string and returns string width. |
### getWeight() {#getWeight--}
```
public String getWeight()
```


Gets weight.

**Returns:**
java.lang.String - Weight.
### getItalicAngle() {#getItalicAngle--}
```
public double getItalicAngle()
```


Gets italic angle value.

**Returns:**
double - Italic angle value.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public double getUnderlinePosition()
```


Gets underline position value.

**Returns:**
double - Underline position value.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public double getUnderlineThickness()
```


Gets underline thickness value.

**Returns:**
double - Underline thickness value.
### getCapHeight() {#getCapHeight--}
```
public double getCapHeight()
```


Gets cap height value.

**Returns:**
double - Cap height value.
### getXHeight() {#getXHeight--}
```
public double getXHeight()
```


Gets XHeight value.

**Returns:**
double - XHeight value.
### getAscender() {#getAscender--}
```
public double getAscender()
```


Gets ascender value.

**Returns:**
double - Ascender value.
### getDescender() {#getDescender--}
```
public double getDescender()
```


Gets descender value.

**Returns:**
double - Descender value.
### getStdHW() {#getStdHW--}
```
public double getStdHW()
```


Gets StdHW value.

**Returns:**
double - StdHW value.
### getStdVW() {#getStdVW--}
```
public double getStdVW()
```


Gets StdVW value.

**Returns:**
double - StdVW value.
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


Gets Font transformation matrix.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Font transformation matrix.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Gets underline UnitsPerEM value.

**Returns:**
long - Underline UnitsPerEM value.
### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Sets UnitsPerEM value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | long |  |

### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Returns glyph width. May be ovridden by specific font encoding inheritors.

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
