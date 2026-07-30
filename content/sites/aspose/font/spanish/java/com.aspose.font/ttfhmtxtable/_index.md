---
title: "TtfHmtxTable"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la tabla hmtx del archivo de fuente TTF."
type: docs
weight: 101
url: /es/java/com.aspose.font/ttfhmtxtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHmtxTable extends TtfTableBase
```

Representa la tabla "hmtx" del archivo de fuente TTF.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalAdvanceWidth()](#getAdditionalAdvanceWidth--) | En la tabla hmtx pueden existir casos en los que el número total de glifos no sea igual a hhea.numberOfHMetrics. |
| [getClass()](#getClass--) |  |
| [getHMetrics()](#getHMetrics--) | Obtiene métricas horizontales. |
| [getLeftSidebearings()](#getLeftSidebearings--) | Obtiene los bearings laterales izquierdos. |
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
### getAdditionalAdvanceWidth() {#getAdditionalAdvanceWidth--}
```
public int getAdditionalAdvanceWidth()
```


En la tabla hmtx pueden existir casos en los que el número total de glifos no sea igual a hhea.numberOfHMetrics. Para estos casos la tabla hmtx contiene un arreglo adicional 'leftSideBearing' que corresponde a la propiedad LeftSidebearings. Pero los glifos con índices desde hhea.numOfLongHorMetrics hasta maxp.numGlyphs también tienen anchos. Y estos anchos, de acuerdo con la especificación de la tabla hmtx, tienen los siguientes valores: "Aquí se asume que advanceWidth es el mismo que el advanceWidth de la última entrada anterior".

**Returns:**
int - Ancho de avance adicional.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHMetrics() {#getHMetrics--}
```
public TtfHmtxTable.MetricList getHMetrics()
```


Obtiene métricas horizontales.

**Returns:**
[MetricList](../../com.aspose.font/metriclist) - Horizontal metrics.
### getLeftSidebearings() {#getLeftSidebearings--}
```
public short[] getLeftSidebearings()
```


Obtiene los bearings laterales izquierdos.

**Returns:**
short[] - Bearings laterales izquierdos.
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

