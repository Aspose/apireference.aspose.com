---
title: "TtfMaxpTable"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la tabla maxp del archivo de fuente TTF"
type: docs
weight: 104
url: /es/java/com.aspose.font/ttfmaxptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfMaxpTable extends TtfTableBase
```

Representa la tabla "maxp" del archivo de fuente TTF
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxComponentContours()](#getMaxComponentContours--) | Obtiene uint16 maxComponentContours contornos en glifo compuesto. |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | Obtiene uint16 maxComponentDepth niveles de recursión, establecido en 0 si la fuente tiene solo glifos simples. |
| [getMaxComponentElements()](#getMaxComponentElements--) | Obtiene uint16 maxComponentElements número de glifos referenciados en el nivel superior. |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | Obtiene uint16 maxComponentPoints puntos en glifo compuesto. |
| [getMaxContours()](#getMaxContours--) | Obtiene uint16 maxContours contornos en glifo no compuesto. |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | Obtiene uint16 maxFunctionDefs número de FDEFs. |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | Obtiene uint16 maxInstructionDefs número de IDEFs. |
| [getMaxPoints()](#getMaxPoints--) | Obtiene uint16 maxPoints puntos en glifo no compuesto. |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | Obtiene uint16 maxSizeOfInstructions recuento de bytes para instrucciones de glifos. |
| [getMaxStackElements()](#getMaxStackElements--) | Obtiene uint16 maxStackElements profundidad máxima de la pila. |
| [getMaxStorage()](#getMaxStorage--) | Obtiene uint16 maxStorage número de ubicaciones del Área de Almacenamiento. |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | Obtiene uint16 maxTwilightPoints puntos usados en la zona Twilight (Z0). |
| [getMaxZones()](#getMaxZones--) | Obtiene uint16 maxZones establecido en 2. |
| [getNumGlyphs()](#getNumGlyphs--) | Obtiene uint16 numGlyphs el número de glifos en la fuente. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento desde el inicio de sfnt. |
| [getTableVersion()](#getTableVersion--) | Obtiene la versión del formato. |
| [getTag()](#getTag--) | Obtiene la etiqueta de la tabla. |
| [getTtfTables()](#getTtfTables--) | Referencia al repositorio de tabla TTF. |
| [getVersion()](#getVersion--) | Obtiene la versión fija 0x00010000 si (versión 1.0). |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMaxComponentContours() {#getMaxComponentContours--}
```
public int getMaxComponentContours()
```


Obtiene uint16 maxComponentContours contornos en glifo compuesto.

**Returns:**
int - UInt16 maxComponentContours contornos en glifo compuesto.
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


Obtiene uint16 maxComponentDepth niveles de recursión, establecido en 0 si la fuente tiene solo glifos simples.

**Returns:**
int - Uint16 maxComponentDepth niveles de recursión, establezca a 0 si la fuente tiene solo glifos simples.
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


Obtiene uint16 maxComponentElements número de glifos referenciados en el nivel superior.

**Returns:**
int - UInt16 maxComponentElements número de glifos referenciados en el nivel superior.
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


Obtiene uint16 maxComponentPoints puntos en glifo compuesto.

**Returns:**
int - UInt16 maxComponentPoints puntos en glifo compuesto.
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


Obtiene uint16 maxContours contornos en glifo no compuesto.

**Returns:**
int - UInt16 maxContours contornos en glifo no compuesto.
### getMaxFunctionDefs() {#getMaxFunctionDefs--}
```
public int getMaxFunctionDefs()
```


Obtiene uint16 maxFunctionDefs número de FDEFs.

**Returns:**
int - UInt16 maxFunctionDefs número de FDEFs.
### getMaxInstructionDefs() {#getMaxInstructionDefs--}
```
public int getMaxInstructionDefs()
```


Obtiene uint16 maxInstructionDefs número de IDEFs.

**Returns:**
int - UInt16 maxInstructionDefs número de IDEFs.
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


Obtiene uint16 maxPoints puntos en glifo no compuesto.

**Returns:**
int - UInt16 maxPoints puntos en glifo no compuesto.
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


Obtiene uint16 maxSizeOfInstructions recuento de bytes para instrucciones de glifos.

**Returns:**
int - UInt16 maxSizeOfInstructions recuento de bytes para instrucciones de glifo.
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


Obtiene uint16 maxStackElements profundidad máxima de la pila.

**Returns:**
int - UInt16 maxStackElements profundidad máxima de la pila.
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


Obtiene uint16 maxStorage número de ubicaciones del Área de Almacenamiento.

**Returns:**
int - UInt16 maxStorage número de ubicaciones del Área de Almacenamiento.
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


Obtiene uint16 maxTwilightPoints puntos usados en la zona Twilight (Z0).

**Returns:**
int - UInt16 maxTwilightPoints puntos usados en la Zona Crepuscular (Z0).
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


Obtiene uint16 maxZones establecido en 2.

**Returns:**
int - Uint16 maxZones establecido en 2.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Obtiene uint16 numGlyphs el número de glifos en la fuente.

**Returns:**
int - UInt16 numGlyphs el número de glifos en la Fuente.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Obtiene el desplazamiento desde el inicio de sfnt.

**Returns:**
long - Desplazamiento desde el inicio de sfnt.
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


Obtiene la versión del formato. Use las propiedades MajorNumber y MinorNUmber del objeto  Version16Dot16  en notación hexadecimal para detectar la versión utilizada.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
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
### getVersion() {#getVersion--}
```
public float getVersion()
```


Obtiene la versión fija 0x00010000 si (versión 1.0). Obsoleto, use la propiedad  TableVersion  en su lugar.

**Returns:**
float - Versión fija 0x00010000 si (versión 1.0).
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

