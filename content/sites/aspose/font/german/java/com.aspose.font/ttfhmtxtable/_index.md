---
title: "TtfHmtxTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die hmtx-Tabelle der TTF-Schriftdatei dar."
type: docs
weight: 101
url: /de/java/com.aspose.font/ttfhmtxtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHmtxTable extends TtfTableBase
```

Stellt die "hmtx"-Tabelle der TTF-Schriftdatei dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalAdvanceWidth()](#getAdditionalAdvanceWidth--) | In der hmtx-Tabelle kann es Fälle geben, in denen die Gesamtzahl der Glyphen nicht gleich hhea.numberOfHMetrics ist. |
| [getClass()](#getClass--) |  |
| [getHMetrics()](#getHMetrics--) | Liefert horizontale Metriken. |
| [getLeftSidebearings()](#getLeftSidebearings--) | Liefert linke Seitenabstände. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTag()](#getTag--) | Liest das Tabellen-Tag. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdditionalAdvanceWidth() {#getAdditionalAdvanceWidth--}
```
public int getAdditionalAdvanceWidth()
```


In der hmtx-Tabelle kann es Fälle geben, in denen die Gesamtzahl der Glyphen nicht gleich hhea.numberOfHMetrics ist. Für diese Fälle enthält die hmtx-Tabelle ein zusätzliches Array 'leftSideBearing', das der Eigenschaft LeftSidebearings entspricht. Aber Glyphen mit Indizes von hhea.numOfLongHorMetrics bis maxp.numGlyphs haben ebenfalls Breiten. Und diese Breiten haben gemäß der Spezifikation für die hmtx-Tabelle folgende Werte: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above".

**Returns:**
int - Zusätzliche Vorwärtsbreite.
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


Liefert horizontale Metriken.

**Returns:**
[MetricList](../../com.aspose.font/metriclist) - Horizontal metrics.
### getLeftSidebearings() {#getLeftSidebearings--}
```
public short[] getLeftSidebearings()
```


Liefert linke Seitenabstände.

**Returns:**
short[] - Linke Seitenabstände.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert den Offset vom Anfang des sfnt.

**Returns:**
long - Offset vom Anfang des sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Liest das Tabellen-Tag.

**Returns:**
java.lang.String - Tabellen‑Tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Verweis auf das TTF-Tabellen-Repository.

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

