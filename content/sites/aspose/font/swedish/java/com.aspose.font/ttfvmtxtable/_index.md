---
title: "TtfVmtxTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar vmtx-tabellen i TTF-fontfilen."
type: docs
weight: 113
url: /sv/java/com.aspose.font/ttfvmtxtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVmtxTable extends TtfTableBase
```

Representerar "vmtx"-tabellen i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTopSideBearings()](#getTopSideBearings--) | Hämtar övre sidbärare. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [getVMetrics()](#getVMetrics--) | Hämtar vertikala mått. |
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
| Parameter | Typ | Beskrivning |
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
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning från början av sfnt.

**Returns:**
long - Förskjutning från början av sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Hämtar tabellens tagg.

**Returns:**
java.lang.String - Tabellens tagg.
### getTopSideBearings() {#getTopSideBearings--}
```
public short[] getTopSideBearings()
```


Hämtar övre sidbärare. Array av övre sidbärare för tecknet.

**Returns:**
short[] - De övre sidobäringarna.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referens till TTF-tabellarkivet.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVMetrics() {#getVMetrics--}
```
public TtfVmtxTable.LongVerMetric[] getVMetrics()
```


Hämtar vertikala mått.

**Returns:**
com.aspose.font.TtfVmtxTable.LongVerMetric[] - De vertikala måtten.
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

