---
title: "CffFontMetrics"
second_title: "Aspose.Font für Java API-Referenz"
description: "Implementierung der CFF‑Schriftmetriken"
type: docs
weight: 21
url: /de/java/com.aspose.font/cfffontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class CffFontMetrics extends FontMetrics
```

Implementierung der CFF‑Schriftmetriken
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | Liefert den Ascender-Wert. |
| [getAscender(double fontSize)](#getAscender-double-) | Gibt den Ascender für eine bestimmte Schriftgröße zurück. |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | Liefert den Descender-Wert. |
| [getDescender(double fontSize)](#getDescender-double-) | Gibt den Descender für eine bestimmte Schriftgröße zurück. |
| [getFontBBox()](#getFontBBox--) | Liefert den FontBBox-Wert. |
| [getFontMatrix()](#getFontMatrix--) | Liefert den FontMatrix-Wert. |
| [getFontMatrixForGlyph(GlyphId glyphId)](#getFontMatrixForGlyph-com.aspose.font.GlyphId-) | Berechnet die Transformationsmatrix für die durch die ID angegebene Glyph. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Gibt das Glyph-Bbox zurück. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Gibt die Glyph-Breite zurück. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Gibt den Kerning-Wert für das Glyph-Paar zurück. |
| [getLineGap()](#getLineGap--) | Liest den LineGap-Wert. |
| [getTypoAscender()](#getTypoAscender--) | Liest den TypoAscender-Wert. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Gibt den typografischen Ascender für eine bestimmte Schriftgröße zurück. |
| [getTypoDescender()](#getTypoDescender--) | Liest den TypoDescender-Wert. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Gibt den typografischen Descender für eine bestimmte Schriftgröße zurück. |
| [getTypoLineGap()](#getTypoLineGap--) | Liest den TypoLineGap-Wert. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Gibt den Zeilenabstand für eine bestimmte Schriftgröße zurück. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Liest den UnitsPerEM-Wert. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Liest den IsFixedPitch-Wert. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Misst die Zeichenkette und gibt die Zeichenkettenbreite zurück. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | Setzt den Ascender-Wert. |
| [setDescender(double value)](#setDescender-double-) | Setzt den Descender-Wert. |
| [setGlyphWidth(GlyphId glyphId, double value)](#setGlyphWidth-com.aspose.font.GlyphId-double-) |  |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Setzt den TypoAscender-Wert. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Setzt den TypoDescender-Wert. |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) | Setzt den UnitsPerEM-Wert. |
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


Liefert den Ascender-Wert.

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


Liefert den Descender-Wert.

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


Liefert den FontMatrix-Wert.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - FontMatrix value.
### getFontMatrixForGlyph(GlyphId glyphId) {#getFontMatrixForGlyph-com.aspose.font.GlyphId-}
```
public TransformationMatrix getFontMatrixForGlyph(GlyphId glyphId)
```


Berechnet die Transformationsmatrix für die durch die ID angegebene Glyph.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑Bezeichner. |

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Glyph transformation matrix.
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


Gibt die Glyph-Breite zurück. Kann von spezifischen Font-Encoding-Erben überschrieben werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑Bezeichner. |

**Returns:**
double - Glyphenbreite.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Liest den UnitsPerEM-Wert.

**Returns:**
long - UnitsPerEM-Wert.
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
| glyphId | [GlyphId](../../com.aspose.font/glyphid) |  |
| Wert | double |  |

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
| Wert | long | UnitsPerEM-Wert. |

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

