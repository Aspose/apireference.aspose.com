---
title: "TtfGaspTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Gasp‑Tabelle der TTF‑Font‑Datei dar."
type: docs
weight: 97
url: /de/java/com.aspose.font/ttfgasptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfGaspTable extends TtfTableBase
```

Stellt die "gasp" Tabelle der TTF Schriftdatei dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getGaspRanges()](#getGaspRanges--) | Ruft die Liste der GaspRange‑Datensätze ab und liefert empfohlene Verhaltensweisen für verschiedene ppem‑Größen. |
| [getNumRanges()](#getNumRanges--) | Ruft GaspRange‑Datensätze ab. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTag()](#getTag--) | Ruft das Tabellen-Tag ab. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [getVersion()](#getVersion--) | Ruft die Tabellen-Version ab. |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getGaspRanges() {#getGaspRanges--}
```
public List<GaspRange> getGaspRanges()
```


Ruft die Liste der GaspRange‑Datensätze ab und liefert empfohlene Verhaltensweisen für verschiedene ppem‑Größen.

**Returns:**
java.util.List<com.aspose.font.GaspRange> - Die Liste der GaspRange.
### getNumRanges() {#getNumRanges--}
```
public int getNumRanges()
```


Ruft GaspRange‑Datensätze ab.

**Returns:**
int - GaspRange‑Datensätze.
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


Ruft das Tabellen-Tag ab.

**Returns:**
java.lang.String - Das Tabellen-Tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Verweis auf das TTF-Tabellen-Repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Ruft die Tabellen-Version ab.

**Returns:**
int - Die Tabellenversion.
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

