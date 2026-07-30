---
title: "TtfHmtxTable"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella hmtx del file di font TTF."
type: docs
weight: 101
url: /it/java/com.aspose.font/ttfhmtxtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHmtxTable extends TtfTableBase
```

Rappresenta la tabella "hmtx" del file di font TTF.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalAdvanceWidth()](#getAdditionalAdvanceWidth--) | Nella tabella hmtx potrebbero esserci casi in cui il numero totale di glifi non è uguale a hhea.numberOfHMetrics. |
| [getClass()](#getClass--) |  |
| [getHMetrics()](#getHMetrics--) | Ottiene le metriche orizzontali. |
| [getLeftSidebearings()](#getLeftSidebearings--) | Ottiene i left side bearings. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
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
### getAdditionalAdvanceWidth() {#getAdditionalAdvanceWidth--}
```
public int getAdditionalAdvanceWidth()
```


Nella tabella hmtx potrebbero esserci casi in cui il numero totale di glifi non è uguale a hhea.numberOfHMetrics. Per questi casi la tabella hmtx contiene un array aggiuntivo 'leftSideBearing' che corrisponde alla proprietà LeftSidebearings. Tuttavia i glifi con indici da hhea.numOfLongHorMetrics a maxp.numGlyphs hanno anche larghezze. E queste larghezze, in conformità alla specifica per la tabella hmtx, hanno i seguenti valori: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above".

**Returns:**
int - Larghezza di avanzamento aggiuntiva.
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


Ottiene le metriche orizzontali.

**Returns:**
[MetricList](../../com.aspose.font/metriclist) - Horizontal metrics.
### getLeftSidebearings() {#getLeftSidebearings--}
```
public short[] getLeftSidebearings()
```


Ottiene i left side bearings.

**Returns:**
short[] - Left side bearings.
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
java.lang.String - Etichetta della tabella.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Riferimento al repository della tabella TTF.

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

