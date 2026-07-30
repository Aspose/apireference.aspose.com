---
title: "TtfCMapTable"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la tabla cmap del archivo de fuente TTF."
type: docs
weight: 89
url: /es/java/com.aspose.font/ttfcmaptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfCMapTable extends TtfTableBase
```

Representa la tabla "cmap" del archivo de fuente TTF.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findUnicodeTable()](#findUnicodeTable--) | Busca y devuelve el CMap Unicode. |
| [getAllSubtables()](#getAllSubtables--) | Devuelve todas las subtablas de la tabla CMap. |
| [getClass()](#getClass--) |  |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento desde el inicio de sfnt. |
| [getPlatformTables(int platformId, int platformSpecificId)](#getPlatformTables-int-int-) | Devuelve las subtablas CMap para planformId y platformSpecificId. |
| [getTag()](#getTag--) | Obtiene la etiqueta de la tabla. |
| [getTtfTables()](#getTtfTables--) | Referencia al repositorio de tabla TTF. |
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
### findUnicodeTable() {#findUnicodeTable--}
```
public TtfCMapFormatBaseTable findUnicodeTable()
```


Busca y devuelve el CMap Unicode. Si hay un CMap ucs-4, lo devuelve primero; de lo contrario, devuelve cualquier CMap Unicode que pueda encontrar.

**Returns:**
[TtfCMapFormatBaseTable](../../com.aspose.font/ttfcmapformatbasetable) - Unicode subtable.
### getAllSubtables() {#getAllSubtables--}
```
public TtfCMapTable.TtfCMapSubtableDescription[] getAllSubtables()
```


Devuelve todas las subtablas de la tabla CMap.

**Returns:**
com.aspose.font.TtfCMapTable.TtfCMapSubtableDescription[] - matriz de objetos TtfCmapSubtableDescription
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOffset() {#getOffset--}
```
public long getOffset()
```


Obtiene el desplazamiento desde el inicio de sfnt.

**Returns:**
long - Desplazamiento desde el inicio de sfnt.
### getPlatformTables(int platformId, int platformSpecificId) {#getPlatformTables-int-int-}
```
public TtfCMapFormatBaseTable[] getPlatformTables(int platformId, int platformSpecificId)
```


Devuelve las subtablas CMap para planformId y platformSpecificId.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| platformId | int | Id de plataforma. |
| platformSpecificId | int | Id de codificación específica de la plataforma. |

**Returns:**
com.aspose.font.TtfCMapFormatBaseTable[] - subtablas CMap.
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

