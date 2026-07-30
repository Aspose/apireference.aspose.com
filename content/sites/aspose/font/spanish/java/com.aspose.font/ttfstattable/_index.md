---
title: "TtfStatTable"
second_title: "Referencia de API de Aspose.Font para Java"
description: 
type: docs
weight: 109
url: /es/java/com.aspose.font/ttfstattable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfStatTable extends TtfTableBase
```
## Métodos

| Método | Descripción |
| --- | --- |
| [addAxisRecord(AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.AxisRecord-) | Agrega una estructura de Registro de Eje a la tabla. |
| [addAxisValueTable(AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.AxisValueTableBase-) | Agrega una estructura de Tabla de Valor de Eje a la tabla. |
| [clearAxisRecords()](#clearAxisRecords--) | Elimina todos los registros de eje de la tabla. |
| [clearAxisValueTables()](#clearAxisValueTables--) | Elimina todas las tablas de valor de eje de la tabla. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisRecords()](#getAxisRecords--) | Devuelve la matriz de ejes de diseño. |
| [getAxisValueCount()](#getAxisValueCount--) | Devuelve el número de tablas de valor de eje. |
| [getAxisValueTables()](#getAxisValueTables--) | Devuelve una matriz de Tablas de Valor de Eje. |
| [getClass()](#getClass--) |  |
| [getDesignAxisCount()](#getDesignAxisCount--) | Devuelve el número de registros de eje. |
| [getElidedFallbackName()](#getElidedFallbackName--) | Especificación: Nombre utilizado como alternativa cuando la proyección de nombres en un modelo de fuente particular produce un nombre de subfamilia que contiene solo elementos elidibles. |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | Especificación: ID de nombre utilizado como alternativa cuando la proyección de nombres en un modelo de fuente particular produce un nombre de subfamilia que contiene solo elementos elidibles. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento desde el inicio de sfnt. |
| [getTag()](#getTag--) | Obtiene la etiqueta de la tabla. |
| [getTtfTables()](#getTtfTables--) | Referencia al repositorio de tabla TTF. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addAxisRecord(AxisRecord axisRecord) {#addAxisRecord-com.aspose.font.AxisRecord-}
```
public void addAxisRecord(AxisRecord axisRecord)
```


Agrega una estructura de Registro de Eje a la tabla.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | Estructura AxisRecord |

### addAxisValueTable(AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.AxisValueTableBase-}
```
public void addAxisValueTable(AxisValueTableBase axisValueTable)
```


Agrega una estructura de Tabla de Valor de Eje a la tabla.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | Estructura de tabla de valor de eje |

### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


Elimina todos los registros de eje de la tabla.

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


Elimina todas las tablas de valor de eje de la tabla.

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
### getAxisRecords() {#getAxisRecords--}
```
public AxisRecord[] getAxisRecords()
```


Devuelve la matriz de ejes de diseño. La matriz de ejes es una matriz de estructuras del tipo Axis Record. Especificación: el registro de eje proporciona información sobre un único eje de diseño.

**Returns:**
com.aspose.font.AxisRecord[] - La matriz de ejes de diseño.
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


Devuelve el número de tablas de valor de eje.

**Returns:**
int - El número de tablas de valor de eje.
### getAxisValueTables() {#getAxisValueTables--}
```
public AxisValueTableBase[] getAxisValueTables()
```


Devuelve una matriz de Tablas de Valor de Eje. Especificación: Las Tablas de Valor de Eje proporcionan detalles sobre un valor de atributo de estilo específico en algún eje específico de variación de diseño, o una combinación de valores de ejes de variación de diseño, y la relación de esos valores con las etiquetas usadas como elementos en los nombres de subfamilia.

**Returns:**
com.aspose.font.AxisValueTableBase[] - La matriz de tablas de valores de eje.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDesignAxisCount() {#getDesignAxisCount--}
```
public int getDesignAxisCount()
```


Devuelve el número de registros de eje. Especificación: en una fuente con una tabla 'fvar', este valor debe ser mayor o igual que el valor axisCount en la tabla 'fvar'. En todas las fuentes, debe ser mayor que cero si axisValueCount es mayor que cero.

**Returns:**
int - El número de registros de eje.
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


Especificación: Nombre utilizado como alternativa cuando la proyección de nombres en un modelo de fuente particular produce un nombre de subfamilia que contiene solo elementos elidibles.

**Returns:**
java.lang.String - El nombre usado como alternativa cuando la proyección de nombres en un modelo de fuente particular produce un nombre de subfamilia que contiene solo elementos elidibles.
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


Especificación: ID de nombre utilizado como alternativa cuando la proyección de nombres en un modelo de fuente particular produce un nombre de subfamilia que contiene solo elementos elidibles.

**Returns:**
int - El ID del nombre.
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

