---
title: "TtfFontMetrics"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa las métricas de la fuente TTF."
type: docs
weight: 95
url: /es/java/com.aspose.font/ttffontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class TtfFontMetrics extends FontMetrics
```

Representa las métricas de la fuente TTF.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | Obtiene el valor del ascendente. |
| [getAscender(double fontSize)](#getAscender-double-) | Devuelve el ascender para un tamaño de fuente específico. |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | Obtiene el valor del descendente. |
| [getDescender(double fontSize)](#getDescender-double-) | Devuelve el descender para un tamaño de fuente específico. |
| [getFontBBox()](#getFontBBox--) | Obtiene el valor de FontBBox. |
| [getFontMatrix()](#getFontMatrix--) | Obtiene el valor de FontBBox. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Devuelve el Bbox del glifo. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Devuelve el ancho de los glifos por id de glifo. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Devuelve el valor de kerning para el par de glifos. |
| [getLineGap()](#getLineGap--) | Obtiene el valor de LineGap. |
| [getTypoAscender()](#getTypoAscender--) | Obtiene el valor de TypoAscender. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Devuelve el ascendente tipográfico para un tamaño de fuente específico. |
| [getTypoDescender()](#getTypoDescender--) | Obtiene el valor de TypoDescender. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Devuelve el descendente tipográfico para un tamaño de fuente específico |
| [getTypoLineGap()](#getTypoLineGap--) | Obtiene el valor de TypoLineGap. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Devuelve el espacio entre líneas para un tamaño de fuente específico. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Obtiene el valor de UnitsPerEM. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Obtiene el valor de IsFixedPitch. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Mide la cadena y devuelve el ancho de la cadena. |
| [measureString(long[] charCodes, double fontSize)](#measureString-long---double-) | Mide el texto representado como una matriz de códigos de caracteres y devuelve el ancho de la cadena. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | Establece el valor del ascendente. |
| [setDescender(double value)](#setDescender-double-) | Establece el valor del descendente. |
| [setGlyphWidth(GlyphId glyphId, double value)](#setGlyphWidth-com.aspose.font.GlyphId-double-) | Establece el ancho del glifo. |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Establece el valor de TypoAscender. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Establece el valor de TypoDescender. |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAscender() {#getAscender--}
```
public double getAscender()
```


Obtiene el valor del ascendente.

**Returns:**
double - valor de Ascender.
### getAscender(double fontSize) {#getAscender-double-}
```
public double getAscender(double fontSize)
```


Devuelve el ascender para un tamaño de fuente específico.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontSize | double | Tamaño de fuente. |

**Returns:**
double - valor de Ascender.
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


Obtiene el valor del descendente.

**Returns:**
double - valor de Descender.
### getDescender(double fontSize) {#getDescender-double-}
```
public double getDescender(double fontSize)
```


Devuelve el descender para un tamaño de fuente específico.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontSize | double | Tamaño de fuente. |

**Returns:**
double - valor de Descender.
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


Obtiene el valor de FontBBox.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox)
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


Obtiene el valor de FontBBox.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix)
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public FontBBox getGlyphBBox(GlyphId glyphId)
```


Devuelve el Bbox del glifo. Devuelve FontBBox si el Bbox no estaba definido para el glifo. Puede ser sobrescrito por herederos de codificación de fuente específicos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Identificador de glifo. |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Devuelve el ancho de los glifos por id de glifo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Identificador de glifo. |

**Returns:**
double - Ancho del glifo.
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


Devuelve el valor de kerning para el par de glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Primer glifo en el par. |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Tamaño de fuente. |

**Returns:**
double - Valor de interletraje
### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


Obtiene el valor de LineGap.

**Returns:**
double - Valor de LineGap.
### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


Obtiene el valor de TypoAscender.

**Returns:**
double - Valor de TypoAscender.
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public double getTypoAscender(double fontSize)
```


Devuelve el ascendente tipográfico para un tamaño de fuente específico.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontSize | double | Tamaño de fuente. |

**Returns:**
double - Valor del ascendente tipográfico.
### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


Obtiene el valor de TypoDescender.

**Returns:**
double - Valor de TypoDescender.
### getTypoDescender(double fontSize) {#getTypoDescender-double-}
```
public double getTypoDescender(double fontSize)
```


Devuelve el descendente tipográfico para un tamaño de fuente específico

param fontSize Tamaño de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontSize | double |  |

**Returns:**
double - Valor del descendente tipográfico.
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


Obtiene el valor de TypoLineGap.

**Returns:**
double - Valor de TypoLineGap.
### getTypoLineGap(double fontSize) {#getTypoLineGap-double-}
```
public double getTypoLineGap(double fontSize)
```


Devuelve el espacio entre líneas para un tamaño de fuente específico.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontSize | double | Tamaño de fuente. |

**Returns:**
double - Valor del espacio de línea.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Obtiene el valor de UnitsPerEM.

**Returns:**
long
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


Obtiene el valor de IsFixedPitch.

**Returns:**
boolean - Valor de IsFixedPitch.
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public double measureString(String unicode, double fontSize)
```


Mide la cadena y devuelve el ancho de la cadena.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| unicode | java.lang.String | Cadena Unicode. |
| fontSize | double | Tamaño de fuente. |

**Returns:**
double - Ancho de la cadena.
### measureString(long[] charCodes, double fontSize) {#measureString-long---double-}
```
public double measureString(long[] charCodes, double fontSize)
```


Mide el texto representado como una matriz de códigos de caracteres y devuelve el ancho de la cadena.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| charCodes | long[] | Cadena de texto representada como una matriz de códigos de caracteres. |
| fontSize | double | Tamaño de fuente. |

**Returns:**
double - Ancho de la cadena.
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


Establece el valor del ascendente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor del ascendente. |

### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


Establece el valor del descendente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor del descendente. |

### setGlyphWidth(GlyphId glyphId, double value) {#setGlyphWidth-com.aspose.font.GlyphId-double-}
```
public void setGlyphWidth(GlyphId glyphId, double value)
```


Establece el ancho del glifo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Identificador de glifo. |
| valor | double | Nuevo ancho. |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


Establece el valor de TypoAscender.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor de TypoAscender. |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


Establece el valor de TypoDescender.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor de TypoDescender. |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Establece el valor de UnitsPerEM.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | long |  |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

