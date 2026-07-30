---
title: "Type1FontMetrics"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar Type1-typsnittsmetrik."
type: docs
weight: 116
url: /sv/java/com.aspose.font/type1fontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class Type1FontMetrics extends FontMetrics
```

Representerar Type1-typsnittsmetrik.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | Hämtar ascendervärde. |
| [getAscender(double fontSize)](#getAscender-double-) | Returnerar ascender för en specifik teckenstorlek. |
| [getCapHeight()](#getCapHeight--) | Hämtar värdet för cap-höjd. |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | Hämtar descendervärde. |
| [getDescender(double fontSize)](#getDescender-double-) | Returnerar descender för en specifik teckenstorlek. |
| [getFontBBox()](#getFontBBox--) | Hämtar FontBBox‑värdet. |
| [getFontMatrix()](#getFontMatrix--) | Hämtar fontens transformationsmatris. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Returnerar glyf Bbox. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Returnerar glyfbredd. |
| [getItalicAngle()](#getItalicAngle--) | Hämtar värdet för kursiv vinkel. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Returnerar kerningvärde för glyfparet. |
| [getLineGap()](#getLineGap--) | Hämtar LineGap-värde. |
| [getStdHW()](#getStdHW--) | Hämtar StdHW-värdet. |
| [getStdVW()](#getStdVW--) | Hämtar StdVW-värdet. |
| [getTypoAscender()](#getTypoAscender--) | Hämtar TypoAscender-värde. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Returnerar typografisk ascender för specifik Font-storlek. |
| [getTypoDescender()](#getTypoDescender--) | Hämtar TypoDescender-värde. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Returnerar typografisk descender för specifik fontstorlek. |
| [getTypoLineGap()](#getTypoLineGap--) | Hämtar TypoLineGap-värde. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Returnerar radgap för specifik Font-storlek. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Hämtar värdet för understrykningens position. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Hämtar värdet för understrykningens tjocklek. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Hämtar värdet för understrykningens UnitsPerEM. |
| [getWeight()](#getWeight--) | Hämtar vikt. |
| [getXHeight()](#getXHeight--) | Hämtar XHeight-värdet. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Hämtar IsFixedPitch-värde. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Mäter sträng och returnerar strängbredd. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | Ställer in Ascender-värde. |
| [setDescender(double value)](#setDescender-double-) | Ställer in Descender-värde. |
| [setGlyphWidth(GlyphId glyphId, double value)](#setGlyphWidth-com.aspose.font.GlyphId-double-) | Ställer in glyfbredd. |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Ställer in TypoAscender-värde. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Ställer in TypoDescender-värde. |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAscender() {#getAscender--}
```
public double getAscender()
```


Hämtar ascendervärde.

**Returns:**
double - Ascender-värde.
### getAscender(double fontSize) {#getAscender-double-}
```
public double getAscender(double fontSize)
```


Returnerar ascender för en specifik teckenstorlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontSize | double | Fontstorlek. |

**Returns:**
double - Ascender-värde.
### getCapHeight() {#getCapHeight--}
```
public double getCapHeight()
```


Hämtar värdet för cap-höjd.

**Returns:**
double - värde för versalhöjd.
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


Hämtar descendervärde.

**Returns:**
double - Descender-värde.
### getDescender(double fontSize) {#getDescender-double-}
```
public double getDescender(double fontSize)
```


Returnerar descender för en specifik teckenstorlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontSize | double | Fontstorlek. |

**Returns:**
double - Descender-värde.
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


Hämtar FontBBox‑värdet.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - FontBBox value.
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


Hämtar fontens transformationsmatris.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Font transformation matrix.
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public FontBBox getGlyphBBox(GlyphId glyphId)
```


Returnerar glyf Bbox. Returnerar FontBBox om BBox inte var definierad för glyfen. Kan åsidosättas av specifika teckenkodningsarvtagare.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyfidentifierare. |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Returnerar glyfbredd. Kan åsidosättas av specifika teckenkodningsärvda klasser.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyfidentifierare. |

**Returns:**
double - Glyph-bredd.
### getItalicAngle() {#getItalicAngle--}
```
public double getItalicAngle()
```


Hämtar värdet för kursiv vinkel.

**Returns:**
double - värde för kursiv vinkel.
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


Returnerar kerningvärde för glyfparet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Första glyph i paret. |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Fontstorlek. |

**Returns:**
double - Kerningvärde.
### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


Hämtar LineGap-värde.

**Returns:**
double - LineGap-värde.
### getStdHW() {#getStdHW--}
```
public double getStdHW()
```


Hämtar StdHW-värdet.

**Returns:**
double - StdHW-värde.
### getStdVW() {#getStdVW--}
```
public double getStdVW()
```


Hämtar StdVW-värdet.

**Returns:**
double - StdVW-värde.
### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


Hämtar TypoAscender-värde.

**Returns:**
double - TypoAscender-värde.
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public double getTypoAscender(double fontSize)
```


Returnerar typografisk ascender för specifik Font-storlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontSize | double | Fontstorlek. |

**Returns:**
double - Typographic ascender-värde.
### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


Hämtar TypoDescender-värde.

**Returns:**
double - TypoDescender-värde.
### getTypoDescender(double fontSize) {#getTypoDescender-double-}
```
public double getTypoDescender(double fontSize)
```


Returnerar typografisk descender för specifik fontstorlek.

param fontSize teckenstorlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontSize | double |  |

**Returns:**
double - Typographic descender-värde.
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


Hämtar TypoLineGap-värde.

**Returns:**
double - TypoLineGap-värde.
### getTypoLineGap(double fontSize) {#getTypoLineGap-double-}
```
public double getTypoLineGap(double fontSize)
```


Returnerar radgap för specifik Font-storlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontSize | double | Fontstorlek. |

**Returns:**
double - Line gap-värde.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public double getUnderlinePosition()
```


Hämtar värdet för understrykningens position.

**Returns:**
double - värde för understrykningens position.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public double getUnderlineThickness()
```


Hämtar värdet för understrykningens tjocklek.

**Returns:**
double - värde för understrykningens tjocklek.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Hämtar värdet för understrykningens UnitsPerEM.

**Returns:**
long - värde för understrykningens UnitsPerEM.
### getWeight() {#getWeight--}
```
public String getWeight()
```


Hämtar vikt.

**Returns:**
java.lang.String - Vikt.
### getXHeight() {#getXHeight--}
```
public double getXHeight()
```


Hämtar XHeight-värdet.

**Returns:**
double - XHeight-värde.
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


Hämtar IsFixedPitch-värde.

**Returns:**
boolean - IsFixedPitch-värde.
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public double measureString(String unicode, double fontSize)
```


Mäter sträng och returnerar strängbredd.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| unicode | java.lang.String | Unicode-sträng. |
| fontSize | double | Fontstorlek. |

**Returns:**
double - Strängbredd.
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


Ställer in Ascender-värde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | Ascender-värde. |

### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


Ställer in Descender-värde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | Descender-värde. |

### setGlyphWidth(GlyphId glyphId, double value) {#setGlyphWidth-com.aspose.font.GlyphId-double-}
```
public void setGlyphWidth(GlyphId glyphId, double value)
```


Ställer in glyfbredd.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyfidentifierare. |
| värde | double | Ny bredd. |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


Ställer in TypoAscender-värde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | TypoAscender-värde. |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


Ställer in TypoDescender-värde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | TypoDescender-värde. |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Ställer in UnitsPerEM-värde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | long |  |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

