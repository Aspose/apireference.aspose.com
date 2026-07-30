---
title: "TtfPostTable"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la tabla post del archivo de fuente TTF"
type: docs
weight: 107
url: /es/java/com.aspose.font/ttfposttable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfPostTable extends TtfTableBase
```

Representa la tabla "post" del archivo de fuente TTF
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | Obtiene una matriz de índices de glifos por nombre de glifo |
| [getClass()](#getClass--) |  |
| [getFormat()](#getFormat--) | Obtiene el formato fijo (versión) de esta tabla. |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | Obtiene el índice de glifo por nombre de glifo. |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | Obtiene el nombre de glifo por índice de glifo. |
| [getItalicAngle()](#getItalicAngle--) | Obtiene fixed italicAngle ángulo itálico en grados. |
| [getMaxMemType1()](#getMaxMemType1--) | Obtiene uint32 maxMemType1 Uso máximo de memoria cuando una fuente TrueType se descarga como una fuente Type 1. |
| [getMaxMemType42()](#getMaxMemType42--) | Obtiene uint32 maxMemType42 Uso máximo de memoria cuando una fuente TrueType se descarga como una fuente Type 42. |
| [getMinMemType1()](#getMinMemType1--) | Obtiene uint32 minMemType1 Uso mínimo de memoria cuando una fuente TrueType se descarga como una fuente Type 1. |
| [getMinMemType42()](#getMinMemType42--) | Obtiene uint32 minMemType42 Uso mínimo de memoria cuando una fuente TrueType se descarga como una fuente Type 42. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento desde el inicio de sfnt. |
| [getTableFormat()](#getTableFormat--) | Obtiene fixed format (versión) de esta tabla. |
| [getTag()](#getTag--) | Obtiene la etiqueta de la tabla. |
| [getTtfTables()](#getTtfTables--) | Referencia al repositorio de tabla TTF. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Obtiene FWord underlinePosition Posición de subrayado. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Obtiene FWord underlineThickness Grosor del subrayado. |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | Indica que no se proporciona información de nombre PostScript para los glifos en este archivo de fuente. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Obtiene uint32 isFixedPitch. 0 si la fuente tiene espaciado proporcional, distinto de cero si la Fuente no tiene espaciado proporcional (es decir, monoespaciada). |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
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
### getAllGlyphIndexesForGlyphName(String glyphName) {#getAllGlyphIndexesForGlyphName-java.lang.String-}
```
public long[] getAllGlyphIndexesForGlyphName(String glyphName)
```


Obtiene una matriz de índices de glifos por nombre de glifo

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| glyphName | java.lang.String | Nombre del glifo |

**Returns:**
long[] - matriz de índices de glifos
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFormat() {#getFormat--}
```
public float getFormat()
```


Obtiene el formato fijo (versión) de esta tabla.

**Returns:**
float - Fixed format (versión) de esta tabla.
### getGlyphIndex(String glyphName) {#getGlyphIndex-java.lang.String-}
```
public long getGlyphIndex(String glyphName)
```


Obtiene el índice de glifo por nombre de glifo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| glyphName | java.lang.String | Nombre del glifo. |

**Returns:**
long - Índice de glifo. Cuando no se proporciona información de nombre PostScript para los glifos en este archivo de fuente, devuelve el índice 0, que es el glifo indefinido o el glifo \".notdef\".
### getGlyphName(long glyphIndex) {#getGlyphName-long-}
```
public String getGlyphName(long glyphIndex)
```


Obtiene el nombre de glifo por índice de glifo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| glyphIndex | long | Índice de glifo. |

**Returns:**
java.lang.String - Nombre del glifo. Cuando no se proporciona información de nombre PostScript para los glifos en este archivo de fuente, devuelve null.
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


Obtiene fixed italicAngle ángulo itálico en grados.

**Returns:**
float - Fixed italicAngle ángulo itálico en grados.
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


Obtiene uint32 maxMemType1 Uso máximo de memoria cuando una fuente TrueType se descarga como una fuente Type 1.

**Returns:**
long - UInt32 maxMemType1 Uso máximo de memoria cuando una fuente TrueType se descarga como una fuente Type 1.
### getMaxMemType42() {#getMaxMemType42--}
```
public long getMaxMemType42()
```


Obtiene uint32 maxMemType42 Uso máximo de memoria cuando una fuente TrueType se descarga como una fuente Type 42.

**Returns:**
long - UInt32 maxMemType42 Uso máximo de memoria cuando una fuente TrueType se descarga como una fuente Type 42.
### getMinMemType1() {#getMinMemType1--}
```
public long getMinMemType1()
```


Obtiene uint32 minMemType1 Uso mínimo de memoria cuando una fuente TrueType se descarga como una fuente Type 1.

**Returns:**
long - UInt32 minMemType1 Uso mínimo de memoria cuando una fuente TrueType se descarga como una fuente Type 1.
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


Obtiene uint32 minMemType42 Uso mínimo de memoria cuando una fuente TrueType se descarga como una fuente Type 42.

**Returns:**
long - UInt32 minMemType42 Uso mínimo de memoria cuando una fuente TrueType se descarga como una fuente Type 42.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Obtiene el desplazamiento desde el inicio de sfnt.

**Returns:**
long - Desplazamiento desde el inicio de sfnt.
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


Obtiene fixed format (versión) de esta tabla. Use las propiedades MajorNumber y MinorNUmber del objeto Version16Dot16 en notación hexadecimal para detectar la versión utilizada.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
### getTag() {#getTag--}
```
public static String getTag()
```


Obtiene la etiqueta de la tabla.

**Returns:**
java.lang.String - Etiqueta de tabla.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referencia al repositorio de tabla TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public short getUnderlinePosition()
```


Obtiene FWord underlinePosition Posición de subrayado.

**Returns:**
short - FWord underlinePosition Posición de subrayado.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public short getUnderlineThickness()
```


Obtiene FWord underlineThickness Grosor del subrayado.

**Returns:**
short - FWord underlineThickness Grosor del subrayado.
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


Indica que no se proporciona información de nombre PostScript para los glifos en este archivo de fuente.

**Returns:**
boolean - Verdadero, si no se proporciona información de nombre PostScript para los glifos en este archivo de fuente. Falso, de lo contrario.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public long isFixedPitch()
```


Obtiene uint32 isFixedPitch. 0 si la fuente tiene espaciado proporcional, distinto de cero si la Fuente no tiene espaciado proporcional (es decir, monoespaciada).

**Returns:**
long - UInt32 isFixedPitch. 0 si la fuente tiene espaciado proporcional, distinto de cero si la Fuente no tiene espaciado proporcional (es decir, monoespaciada).
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

