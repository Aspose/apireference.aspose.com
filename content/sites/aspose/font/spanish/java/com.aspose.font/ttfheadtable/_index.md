---
title: "TtfHeadTable"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la tabla head del archivo de fuente TTF."
type: docs
weight: 99
url: /es/java/com.aspose.font/ttfheadtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHeadTable extends TtfTableBase
```

Representa la tabla "head" del archivo de fuente TTF.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | Obtiene uint32 checkSumAdjustment. |
| [getClass()](#getClass--) |  |
| [getCreated()](#getCreated--) | Obtiene longDateTime creado fecha internacional. |
| [getFlags()](#getFlags--) | Obtiene uint16 flags. |
| [getFontDirectionHint()](#getFontDirectionHint--) | Obtiene int16 fontDirectionHint. 0 Glifos de dirección mixta; 1 Solo glifos fuertemente de izquierda a derecha; 2 Como 1 pero también contiene neutrales; -1 Solo glifos fuertemente de derecha a izquierda; -2 Como -1 pero también contiene neutrales. |
| [getFontRevision()](#getFontRevision--) | Obtiene fixed fontRevision establecido por el fabricante de la fuente. |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | Obtiene int16 glyphDataFormat 0 para el formato actual. |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | Obtiene int16 indexToLocFormat 0 para desplazamientos cortos, 1 para largos. |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | Obtiene uint16 lowestRecPPEM el tamaño legible más pequeño en píxeles. |
| [getMacStyle()](#getMacStyle--) | Obtiene uint16 macStyle. |
| [getMagicNumber()](#getMagicNumber--) | Obtiene uint32 magicNumber establecido en 0x5F0F3CF5. |
| [getModified()](#getModified--) | Obtiene longDateTime modificado fecha internacional. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento desde el inicio de sfnt. |
| [getTag()](#getTag--) | Obtiene la etiqueta de la tabla. |
| [getTtfTables()](#getTtfTables--) | Referencia al repositorio de tabla TTF. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Obtiene uint16 unitsPerEM rango de 64 a 16384. |
| [getVersion()](#getVersion--) | Versión Fixed 0x00010000 si (versión 1.0). |
| [getXMax()](#getXMax--) | Obtiene FWord xMax para todas las cajas delimitadoras de glifos. |
| [getXMin()](#getXMin--) | Obtiene FWord xMin para todas las cajas delimitadoras de glifos. |
| [getYMax()](#getYMax--) | Obtiene FWord yMax para todas las cajas delimitadoras de glifos. |
| [getYMin()](#getYMin--) | Obtiene FWord yMin para todas las cajas delimitadoras de glifos. |
| [hashCode()](#hashCode--) |  |
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
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


Obtiene uint32 checkSumAdjustment. Para calcularlo: establézcalo en 0, calcule la suma de verificación para la tabla 'head' y colóquela en el directorio de tablas, sume toda la fuente como uint32, luego almacene B1B0AFBA - suma. La suma de verificación para la tabla 'head' no será incorrecta. Eso está bien.

**Returns:**
long - Uint32 checkSumAdjustment.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreated() {#getCreated--}
```
public Date getCreated()
```


Obtiene longDateTime creado fecha internacional.

**Returns:**
java.util.Date - LongDateTime creado fecha internacional.
### getFlags() {#getFlags--}
```
public int getFlags()
```


Obtiene uint16 flags.

**Returns:**
int - UInt16 flags.
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


Obtiene int16 fontDirectionHint. 0 Glifos de dirección mixta; 1 Solo glifos fuertemente de izquierda a derecha; 2 Como 1 pero también contiene neutrales; -1 Solo glifos fuertemente de derecha a izquierda; -2 Como -1 pero también contiene neutrales.

**Returns:**
short - Int16 fontDirectionHint.
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


Obtiene fixed fontRevision establecido por el fabricante de la fuente.

**Returns:**
float - Fixed fontRevision establecido por el fabricante de la fuente.
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


Obtiene int16 glyphDataFormat 0 para el formato actual.

**Returns:**
short - Int16 glyphDataFormat 0 para el formato actual.
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


Obtiene int16 indexToLocFormat 0 para desplazamientos cortos, 1 para largos.

**Returns:**
short - Int16 indexToLocFormat 0 para desplazamientos cortos, 1 para largos.
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


Obtiene uint16 lowestRecPPEM el tamaño legible más pequeño en píxeles.

**Returns:**
int - UInt16 lowestRecPPEM el tamaño legible más pequeño en píxeles.
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


Obtiene uint16 macStyle.

**Returns:**
int - UInt16 macStyle.
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


Obtiene uint32 magicNumber establecido en 0x5F0F3CF5.

**Returns:**
long - UInt32 magicNumber establecido en 0x5F0F3CF5.
### getModified() {#getModified--}
```
public Date getModified()
```


Obtiene longDateTime modificado fecha internacional.

**Returns:**
java.util.Date - LongDateTime fecha internacional modificada.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Obtiene el desplazamiento desde el inicio de sfnt.

**Returns:**
long - Desplazamiento desde el inicio de sfnt.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Obtiene uint16 unitsPerEM rango de 64 a 16384.

**Returns:**
long - UInt16 unitsPerEM rango de 64 a 16384.
### getVersion() {#getVersion--}
```
public float getVersion()
```


Versión Fixed 0x00010000 si (versión 1.0).

**Returns:**
float - Versión fija 0x00010000 si (versión 1.0).
### getXMax() {#getXMax--}
```
public short getXMax()
```


Obtiene FWord xMax para todas las cajas delimitadoras de glifos.

**Returns:**
short - FWord xMax para todas las cajas delimitadoras de glifos.
### getXMin() {#getXMin--}
```
public short getXMin()
```


Obtiene FWord xMin para todas las cajas delimitadoras de glifos.

**Returns:**
short - FWord xMin para todas las cajas delimitadoras de glifos.
### getYMax() {#getYMax--}
```
public short getYMax()
```


Obtiene FWord yMax para todas las cajas delimitadoras de glifos.

**Returns:**
short - FWord yMax para todas las cajas delimitadoras de glifos.
### getYMin() {#getYMin--}
```
public short getYMin()
```


Obtiene FWord yMin para todas las cajas delimitadoras de glifos.

**Returns:**
short - FWord yMin para todas las cajas delimitadoras de glifos.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
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

