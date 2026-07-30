---
title: "TtfVheaTable"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella hhea del file di carattere TTF."
type: docs
weight: 112
url: /it/java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

Rappresenta la tabella "hhea" del file di font TTF.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | Ottiene AdvanceHeightMax. |
| [getAscent()](#getAscent--) | Ottiene Ascent. |
| [getCaretOffset()](#getCaretOffset--) | Ottiene CaretOffset. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Ottiene CaretSlopeRise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Ottiene CaretSlopeRun. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | Ottiene Descent. |
| [getLineGap()](#getLineGap--) | Ottiene LineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Ottiene MetricDataFormat. |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | Ottiene MinBottomSideBearing. |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | Ottiene MinTopSideBearing. |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | Ottiene MetricDataFormat. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
| [getVersion()](#getVersion--) | Ottiene il numero di versione della tabella di intestazione verticale. |
| [getYMaxExtent()](#getYMaxExtent--) | Ottiene \_yMaxExtent. |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


Ottiene AdvanceHeightMax. La massima misura dell'altezza di avanzamento in FUnits trovata nel font.

**Returns:**
short - L'AdvanceHeightMax.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Ottiene Ascent. Distanza in FUnits dalla linea centrale al \_descent della riga precedente.

**Returns:**
short - L'Ascent.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Ottiene CaretOffset.

**Returns:**
short - Il CaretOffset.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Ottiene CaretSlopeRise.

**Returns:**
short - Il CaretSlopeRise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Ottiene CaretSlopeRun.

**Returns:**
short - Il CaretSlopeRun.
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


Ottiene Descent. Distanza in FUnits dalla linea centrale al \_ascent della riga successiva.

**Returns:**
short - Il Descent.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Ottiene LineGap. Lo spazio tipografico verticale per questo font.

**Returns:**
short - Il LineGap.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Ottiene MetricDataFormat.

**Returns:**
short - Il MetricDataFormat.
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


Ottiene MinBottomSideBearing. La minima misura del sidebearing inferiore trovata nel font, in FUnits.

**Returns:**
short - Il MinBottomSideBearing.
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


Ottiene MinTopSideBearing. La misura minima del sidebearing superiore trovata nel font, in FUnits.

**Returns:**
short - Il MinTopSideBearing.
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


Ottiene MetricDataFormat. Numero di altezze di avanzamento nella tabella metriche verticali.

**Returns:**
int - Il MetricDataFormat.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Ottiene l'offset dall'inizio di sfnt.

**Returns:**
long - Offset dall'inizio di sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Ottiene l'etichetta della tabella.

**Returns:**
java.lang.String - Il tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Riferimento al repository della tabella TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


Ottiene il numero di versione della tabella di intestazione verticale.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


Ottiene \_yMaxExtent.

**Returns:**
short - Il \_yMaxExtent.
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

