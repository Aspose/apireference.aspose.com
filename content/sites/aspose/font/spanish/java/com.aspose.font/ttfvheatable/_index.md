---
title: "TtfVheaTable"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la tabla hhea del archivo de fuente TTF."
type: docs
weight: 112
url: /es/java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

Representa la tabla "hhea" del archivo de fuente TTF.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | Obtiene AdvanceHeightMax. |
| [getAscent()](#getAscent--) | Obtiene Ascent. |
| [getCaretOffset()](#getCaretOffset--) | Obtiene CaretOffset. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Obtiene CaretSlopeRise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Obtiene CaretSlopeRun. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | Obtiene Descent. |
| [getLineGap()](#getLineGap--) | Obtiene LineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Obtiene MetricDataFormat. |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | Obtiene MinBottomSideBearing. |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | Obtiene MinTopSideBearing. |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | Obtiene MetricDataFormat. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento desde el inicio de sfnt. |
| [getTag()](#getTag--) | Obtiene la etiqueta de la tabla. |
| [getTtfTables()](#getTtfTables--) | Referencia al repositorio de tabla TTF. |
| [getVersion()](#getVersion--) | Obtiene el número de versión de la tabla de encabezado vertical. |
| [getYMaxExtent()](#getYMaxExtent--) | Obtiene \_yMaxExtent. |
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
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


Obtiene AdvanceHeightMax. La medida máxima de altura de avance en FUnits encontrada en la fuente.

**Returns:**
short - La AdvanceHeightMax.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Obtiene Ascent. Distancia en FUnits desde la línea central hasta el \_descent de la línea anterior\\u2019s.

**Returns:**
short - La Ascent.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Obtiene CaretOffset.

**Returns:**
short - La CaretOffset.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Obtiene CaretSlopeRise.

**Returns:**
short - La CaretSlopeRise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Obtiene CaretSlopeRun.

**Returns:**
short - La CaretSlopeRun.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDescent() {#getDescent--}
```
public short getDescent()
```


Obtiene Descent. Distancia en FUnits desde la línea central hasta el \_ascent de la siguiente línea\\u2019s.

**Returns:**
short - La Descent.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Obtiene LineGap. El espacio tipográfico vertical para esta fuente.

**Returns:**
short - La LineGap.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Obtiene MetricDataFormat.

**Returns:**
short - La MetricDataFormat.
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


Obtiene MinBottomSideBearing. La medida mínima de sidebearing inferior encontrada en la fuente, en FUnits.

**Returns:**
short - La MinBottomSideBearing.
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


Obtiene MinTopSideBearing. La medida mínima de sidebearing superior encontrada en la fuente, en FUnits.

**Returns:**
short - El MinTopSideBearing.
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


Obtiene MetricDataFormat. Número de alturas de avance en la tabla de métricas verticales.

**Returns:**
int - El MetricDataFormat.
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
java.lang.String - La etiqueta.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referencia al repositorio de tabla TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


Obtiene el número de versión de la tabla de encabezado vertical.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


Obtiene \_yMaxExtent.

**Returns:**
short - El \_yMaxExtent.
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

