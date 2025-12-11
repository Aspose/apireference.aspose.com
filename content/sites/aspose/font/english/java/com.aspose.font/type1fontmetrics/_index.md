---
title: Type1FontMetrics
second_title: Aspose.Font for Java API Reference
description: Represents Type1 Font metrics.
type: docs
weight: 115
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
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | Gets ascender value. |
| [getAscender(double fontSize)](#getAscender-double-) | Returns ascender for specific Font size. |
| [getCapHeight()](#getCapHeight--) | Gets cap height value. |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | Gets descender value. |
| [getDescender(double fontSize)](#getDescender-double-) | Returns descender for specific Font size. |
| [getFontBBox()](#getFontBBox--) | Gets FontBBox value. |
| [getFontMatrix()](#getFontMatrix--) | Gets Font transformation matrix. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Returns glyph Bbox. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Returns glyph width. |
| [getItalicAngle()](#getItalicAngle--) | Gets italic angle value. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Returns kerning value for the glyph pair. |
| [getLineGap()](#getLineGap--) | Gets LineGap value. |
| [getStdHW()](#getStdHW--) | Gets StdHW value. |
| [getStdVW()](#getStdVW--) | Gets StdVW value. |
| [getTypoAscender()](#getTypoAscender--) | Gets TypoAscender value. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Returns typographic ascender for specific Font size. |
| [getTypoDescender()](#getTypoDescender--) | Gets TypoDescender value. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Returns typographic descender for specific font size |
| [getTypoLineGap()](#getTypoLineGap--) | Gets TypoLineGap value. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Returns line gap for specific Font size. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Gets underline position value. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Gets underline thickness value. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets underline UnitsPerEM value. |
| [getWeight()](#getWeight--) | Gets weight. |
| [getXHeight()](#getXHeight--) | Gets XHeight value. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Gets IsFixedPitch value. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Measures string and returns string width. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | Sets Ascender value. |
| [setDescender(double value)](#setDescender-double-) | Sets Descender value. |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Sets TypoAscender value. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Sets TypoDescender value. |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAscender() {#getAscender--}
```
public double getAscender()
```


Gets ascender value.

**Returns:**
double - Ascender value.
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
### getCapHeight() {#getCapHeight--}
```
public double getCapHeight()
```


Gets cap height value.

**Returns:**
double - Cap height value.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDescender() {#getDescender--}
```
public double getDescender()
```


Gets descender value.

**Returns:**
double - Descender value.
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
### getItalicAngle() {#getItalicAngle--}
```
public double getItalicAngle()
```


Gets italic angle value.

**Returns:**
double - Italic angle value.
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
### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


Gets LineGap value.

**Returns:**
double - LineGap value.
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
### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


Gets TypoAscender value.

**Returns:**
double - TypoAscender value.
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
### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


Gets TypoDescender value.

**Returns:**
double - TypoDescender value.
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
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


Gets TypoLineGap value.

**Returns:**
double - TypoLineGap value.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Gets underline UnitsPerEM value.

**Returns:**
long - Underline UnitsPerEM value.
### getWeight() {#getWeight--}
```
public String getWeight()
```


Gets weight.

**Returns:**
java.lang.String - Weight.
### getXHeight() {#getXHeight--}
```
public double getXHeight()
```


Gets XHeight value.

**Returns:**
double - XHeight value.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public boolean isFixedPitch()
```


Gets IsFixedPitch value.

**Returns:**
boolean - IsFixedPitch value.
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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAscender(double value) {#setAscender-double-}
```
public void setAscender(double value)
```


Sets Ascender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | Ascender value. |

### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


Sets Descender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | Descender value. |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


Sets TypoAscender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | TypoAscender value. |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


Sets TypoDescender value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | TypoDescender value. |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Sets UnitsPerEM value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | long |  |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

