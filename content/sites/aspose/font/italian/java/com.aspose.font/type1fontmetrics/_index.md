---
title: "Type1FontMetrics"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta le metriche del Font Type1."
type: docs
weight: 116
url: /it/java/com.aspose.font/type1fontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class Type1FontMetrics extends FontMetrics
```

Rappresenta le metriche del Font Type1.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | Ottiene il valore dell'ascendente. |
| [getAscender(double fontSize)](#getAscender-double-) | Restituisce l'ascender per una dimensione specifica del Font. |
| [getCapHeight()](#getCapHeight--) | Ottiene il valore dell'altezza delle maiuscole. |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | Ottiene il valore del discendente. |
| [getDescender(double fontSize)](#getDescender-double-) | Restituisce il descender per una dimensione specifica del Font. |
| [getFontBBox()](#getFontBBox--) | Restituisce il valore FontBBox. |
| [getFontMatrix()](#getFontMatrix--) | Ottiene la matrice di trasformazione del Font. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Restituisce il Bbox del glifo. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Restituisce la larghezza del glifo. |
| [getItalicAngle()](#getItalicAngle--) | Ottiene il valore dell'angolo italic. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Restituisce il valore di kerning per la coppia di glifi. |
| [getLineGap()](#getLineGap--) | Ottiene il valore LineGap. |
| [getStdHW()](#getStdHW--) | Ottiene il valore StdHW. |
| [getStdVW()](#getStdVW--) | Ottiene il valore StdVW. |
| [getTypoAscender()](#getTypoAscender--) | Ottiene il valore TypoAscender. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Restituisce l'ascendente tipografico per una dimensione specifica del Font. |
| [getTypoDescender()](#getTypoDescender--) | Ottiene il valore TypoDescender. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Restituisce il discendente tipografico per una dimensione specifica del font. |
| [getTypoLineGap()](#getTypoLineGap--) | Ottiene il valore TypoLineGap. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Restituisce il gap di linea per una dimensione specifica del Font. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Ottiene il valore della posizione di sottolineatura. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Ottiene il valore dello spessore della sottolineatura. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Ottiene il valore UnitsPerEM della sottolineatura. |
| [getWeight()](#getWeight--) | Ottiene il peso. |
| [getXHeight()](#getXHeight--) | Ottiene il valore XHeight. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Ottiene il valore IsFixedPitch. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Misura la stringa e restituisce la larghezza della stringa. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | Imposta il valore Ascender. |
| [setDescender(double value)](#setDescender-double-) | Imposta il valore Descender. |
| [setGlyphWidth(GlyphId glyphId, double value)](#setGlyphWidth-com.aspose.font.GlyphId-double-) | Imposta la larghezza del glifo. |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Imposta il valore TypoAscender. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Imposta il valore TypoDescender. |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAscender() {#getAscender--}
```
public double getAscender()
```


Ottiene il valore dell'ascendente.

**Returns:**
double - valore Ascender.
### getAscender(double fontSize) {#getAscender-double-}
```
public double getAscender(double fontSize)
```


Restituisce l'ascender per una dimensione specifica del Font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontSize | double | Dimensione del Font. |

**Returns:**
double - valore Ascender.
### getCapHeight() {#getCapHeight--}
```
public double getCapHeight()
```


Ottiene il valore dell'altezza delle maiuscole.

**Returns:**
double - valore dell'altezza Cap.
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


Ottiene il valore del discendente.

**Returns:**
double - valore Descender.
### getDescender(double fontSize) {#getDescender-double-}
```
public double getDescender(double fontSize)
```


Restituisce il descender per una dimensione specifica del Font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontSize | double | Dimensione del Font. |

**Returns:**
double - valore Descender.
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


Restituisce il valore FontBBox.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - FontBBox value.
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


Ottiene la matrice di trasformazione del Font.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Font transformation matrix.
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public FontBBox getGlyphBBox(GlyphId glyphId)
```


Restituisce il Bbox del glifo. Restituisce FontBBox se il BBox non era definito per il glifo. Può essere sovrascritto da eredi di codifica del font specifici.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Identificatore del glifo. |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Restituisce la larghezza del glyph. Può essere sovrascritto da eredi di codifica del font specifici.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Identificatore del glifo. |

**Returns:**
double - Larghezza del glyph.
### getItalicAngle() {#getItalicAngle--}
```
public double getItalicAngle()
```


Ottiene il valore dell'angolo italic.

**Returns:**
double - valore dell'angolo Italic.
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


Restituisce il valore di kerning per la coppia di glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Primo glyph nella coppia. |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Dimensione del Font. |

**Returns:**
double - Valore del kerning.
### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


Ottiene il valore LineGap.

**Returns:**
double - Valore del LineGap.
### getStdHW() {#getStdHW--}
```
public double getStdHW()
```


Ottiene il valore StdHW.

**Returns:**
double - valore StdHW.
### getStdVW() {#getStdVW--}
```
public double getStdVW()
```


Ottiene il valore StdVW.

**Returns:**
double - valore StdVW.
### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


Ottiene il valore TypoAscender.

**Returns:**
double - Valore del TypoAscender.
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public double getTypoAscender(double fontSize)
```


Restituisce l'ascendente tipografico per una dimensione specifica del Font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontSize | double | Dimensione del Font. |

**Returns:**
double - Valore del Typographic ascender.
### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


Ottiene il valore TypoDescender.

**Returns:**
double - Valore del TypoDescender.
### getTypoDescender(double fontSize) {#getTypoDescender-double-}
```
public double getTypoDescender(double fontSize)
```


Restituisce il discendente tipografico per una dimensione specifica del font.

param fontSize Dimensione del font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontSize | double |  |

**Returns:**
double - Valore del Typographic descender.
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


Ottiene il valore TypoLineGap.

**Returns:**
double - Valore del TypoLineGap.
### getTypoLineGap(double fontSize) {#getTypoLineGap-double-}
```
public double getTypoLineGap(double fontSize)
```


Restituisce il gap di linea per una dimensione specifica del Font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontSize | double | Dimensione del Font. |

**Returns:**
double - Valore del Line gap.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public double getUnderlinePosition()
```


Ottiene il valore della posizione di sottolineatura.

**Returns:**
double - valore della posizione di sottolineatura.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public double getUnderlineThickness()
```


Ottiene il valore dello spessore della sottolineatura.

**Returns:**
double - valore dello spessore della sottolineatura.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Ottiene il valore UnitsPerEM della sottolineatura.

**Returns:**
long - valore UnitsPerEM della sottolineatura.
### getWeight() {#getWeight--}
```
public String getWeight()
```


Ottiene il peso.

**Returns:**
java.lang.String - Peso.
### getXHeight() {#getXHeight--}
```
public double getXHeight()
```


Ottiene il valore XHeight.

**Returns:**
double - valore XHeight.
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


Ottiene il valore IsFixedPitch.

**Returns:**
boolean - Valore del IsFixedPitch.
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public double measureString(String unicode, double fontSize)
```


Misura la stringa e restituisce la larghezza della stringa.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| unicode | java.lang.String | Stringa Unicode. |
| fontSize | double | Dimensione del Font. |

**Returns:**
double - Larghezza del String.
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


Imposta il valore Ascender.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore del Ascender. |

### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


Imposta il valore Descender.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore del Descender. |

### setGlyphWidth(GlyphId glyphId, double value) {#setGlyphWidth-com.aspose.font.GlyphId-double-}
```
public void setGlyphWidth(GlyphId glyphId, double value)
```


Imposta la larghezza del glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Identificatore del glifo. |
| valore | double | Nuova larghezza. |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


Imposta il valore TypoAscender.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore del TypoAscender. |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


Imposta il valore TypoDescender.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore del TypoDescender. |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Imposta il valore UnitsPerEM.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | long |  |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

