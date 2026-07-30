---
title: "Type1FontMetrics"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Type1-Schriftmetriken dar."
type: docs
weight: 116
url: /de/java/com.aspose.font/type1fontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class Type1FontMetrics extends FontMetrics
```

Stellt die Type1-Schriftmetriken dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | Liefert Aufstiegswert. |
| [getAscender(double fontSize)](#getAscender-double-) | Gibt den Ascender für eine bestimmte Schriftgröße zurück. |
| [getCapHeight()](#getCapHeight--) | Liefert den Cap‑Höhenwert. |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | Liefert Descender-Wert. |
| [getDescender(double fontSize)](#getDescender-double-) | Gibt den Descender für eine bestimmte Schriftgröße zurück. |
| [getFontBBox()](#getFontBBox--) | Liefert den FontBBox-Wert. |
| [getFontMatrix()](#getFontMatrix--) | Liefert die Font-Transformationsmatrix. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Gibt das Glyph-Bbox zurück. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Gibt die Glyph-Breite zurück. |
| [getItalicAngle()](#getItalicAngle--) | Liefert den Kursivwinkelwert. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Gibt den Kerning-Wert für das Glyph-Paar zurück. |
| [getLineGap()](#getLineGap--) | Liest den LineGap-Wert. |
| [getStdHW()](#getStdHW--) | Liefert den StdHW-Wert. |
| [getStdVW()](#getStdVW--) | Liefert den StdVW-Wert. |
| [getTypoAscender()](#getTypoAscender--) | Liest den TypoAscender-Wert. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Gibt den typografischen Ascender für eine bestimmte Schriftgröße zurück. |
| [getTypoDescender()](#getTypoDescender--) | Liest den TypoDescender-Wert. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Gibt den typografischen Descender für eine bestimmte Schriftgröße zurück. |
| [getTypoLineGap()](#getTypoLineGap--) | Liest den TypoLineGap-Wert. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Gibt den Zeilenabstand für eine bestimmte Schriftgröße zurück. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Liefert den Unterstreichungspositionswert. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Liefert den Unterstreichungsdickenwert. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Liefert den Unterstreichungs-UnitsPerEM-Wert. |
| [getWeight()](#getWeight--) | Liefert das Gewicht. |
| [getXHeight()](#getXHeight--) | Liefert den XHeight-Wert. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Liest den IsFixedPitch-Wert. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Misst die Zeichenkette und gibt die Zeichenkettenbreite zurück. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | Setzt den Ascender-Wert. |
| [setDescender(double value)](#setDescender-double-) | Setzt den Descender-Wert. |
| [setGlyphWidth(GlyphId glyphId, double value)](#setGlyphWidth-com.aspose.font.GlyphId-double-) | Setzt die Glyph-Breite. |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Setzt den TypoAscender-Wert. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Setzt den TypoDescender-Wert. |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAscender() {#getAscender--}
```
public double getAscender()
```


Liefert Aufstiegswert.

**Returns:**
double - Ascender-Wert.
### getAscender(double fontSize) {#getAscender-double-}
```
public double getAscender(double fontSize)
```


Gibt den Ascender für eine bestimmte Schriftgröße zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontSize | double | Schriftgröße. |

**Returns:**
double - Ascender-Wert.
### getCapHeight() {#getCapHeight--}
```
public double getCapHeight()
```


Liefert den Cap‑Höhenwert.

**Returns:**
double - Cap-Höhenwert.
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


Liefert Descender-Wert.

**Returns:**
double - Descender-Wert.
### getDescender(double fontSize) {#getDescender-double-}
```
public double getDescender(double fontSize)
```


Gibt den Descender für eine bestimmte Schriftgröße zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontSize | double | Schriftgröße. |

**Returns:**
double - Descender-Wert.
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


Liefert den FontBBox-Wert.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - FontBBox value.
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


Liefert die Font-Transformationsmatrix.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Font transformation matrix.
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public FontBBox getGlyphBBox(GlyphId glyphId)
```


Gibt das Glyph-Bbox zurück. Gibt FontBBox zurück, wenn das BBox für das Glyph nicht definiert war. Kann von spezifischen Font-Encoding-Erben überschrieben werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑Bezeichner. |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Gibt die Glyphenbreite zurück. Kann von spezifischen Font-Encoding-Erben überschrieben werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑Bezeichner. |

**Returns:**
double - Glyphenbreite.
### getItalicAngle() {#getItalicAngle--}
```
public double getItalicAngle()
```


Liefert den Kursivwinkelwert.

**Returns:**
double - Kursivwinkelwert.
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


Gibt den Kerning-Wert für das Glyph-Paar zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Erste Glyphe im Paar. |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Schriftgröße. |

**Returns:**
double - Kerning-Wert.
### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


Liest den LineGap-Wert.

**Returns:**
double - LineGap-Wert.
### getStdHW() {#getStdHW--}
```
public double getStdHW()
```


Liefert den StdHW-Wert.

**Returns:**
double - StdHW-Wert.
### getStdVW() {#getStdVW--}
```
public double getStdVW()
```


Liefert den StdVW-Wert.

**Returns:**
double - StdVW-Wert.
### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


Liest den TypoAscender-Wert.

**Returns:**
double - TypoAscender-Wert.
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public double getTypoAscender(double fontSize)
```


Gibt den typografischen Ascender für eine bestimmte Schriftgröße zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontSize | double | Schriftgröße. |

**Returns:**
double - Typografischer Aufsteigerwert.
### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


Liest den TypoDescender-Wert.

**Returns:**
double - TypoDescender-Wert.
### getTypoDescender(double fontSize) {#getTypoDescender-double-}
```
public double getTypoDescender(double fontSize)
```


Gibt den typografischen Descender für eine bestimmte Schriftgröße zurück.

param fontSize Schriftgröße.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontSize | double |  |

**Returns:**
double - Typografischer Abstiegwert.
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


Liest den TypoLineGap-Wert.

**Returns:**
double - TypoLineGap-Wert.
### getTypoLineGap(double fontSize) {#getTypoLineGap-double-}
```
public double getTypoLineGap(double fontSize)
```


Gibt den Zeilenabstand für eine bestimmte Schriftgröße zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontSize | double | Schriftgröße. |

**Returns:**
double - Zeilenabstandswert.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public double getUnderlinePosition()
```


Liefert den Unterstreichungspositionswert.

**Returns:**
double - Unterstreichungspositionswert.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public double getUnderlineThickness()
```


Liefert den Unterstreichungsdickenwert.

**Returns:**
double - Unterstreichungsdickenwert.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Liefert den Unterstreichungs-UnitsPerEM-Wert.

**Returns:**
long - Unterstreichungs-UnitsPerEM-Wert.
### getWeight() {#getWeight--}
```
public String getWeight()
```


Liefert das Gewicht.

**Returns:**
java.lang.String - Gewicht.
### getXHeight() {#getXHeight--}
```
public double getXHeight()
```


Liefert den XHeight-Wert.

**Returns:**
double - XHeight-Wert.
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


Liest den IsFixedPitch-Wert.

**Returns:**
boolean - IsFixedPitch-Wert.
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public double measureString(String unicode, double fontSize)
```


Misst die Zeichenkette und gibt die Zeichenkettenbreite zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| unicode | java.lang.String | Unicode-Zeichenkette. |
| fontSize | double | Schriftgröße. |

**Returns:**
double - Zeichenkettenbreite.
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


Setzt den Ascender-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Aufsteigerwert. |

### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


Setzt den Descender-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Abstiegwert. |

### setGlyphWidth(GlyphId glyphId, double value) {#setGlyphWidth-com.aspose.font.GlyphId-double-}
```
public void setGlyphWidth(GlyphId glyphId, double value)
```


Setzt die Glyph-Breite.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑Bezeichner. |
| Wert | double | Neue Breite. |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


Setzt den TypoAscender-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | TypoAscender-Wert. |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


Setzt den TypoDescender-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | TypoDescender-Wert. |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Setzt den UnitsPerEM-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | long |  |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

