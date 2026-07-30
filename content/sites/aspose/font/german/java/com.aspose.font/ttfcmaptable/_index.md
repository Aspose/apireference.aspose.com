---
title: "TtfCMapTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Cmap-Tabelle der TTF-Schriftdatei dar."
type: docs
weight: 89
url: /de/java/com.aspose.font/ttfcmaptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfCMapTable extends TtfTableBase
```

Stellt die "cmap" Tabelle der TTF Schriftdatei dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findUnicodeTable()](#findUnicodeTable--) | Durchsucht und gibt die Unicode-CMap zurück. |
| [getAllSubtables()](#getAllSubtables--) | Gibt alle Untertabellen der CMap-Tabelle zurück. |
| [getClass()](#getClass--) |  |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getPlatformTables(int platformId, int platformSpecificId)](#getPlatformTables-int-int-) | Gibt CMap-Untertabellen für planformId und platformSpecificId zurück. |
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
### findUnicodeTable() {#findUnicodeTable--}
```
public TtfCMapFormatBaseTable findUnicodeTable()
```


Durchsucht und gibt die Unicode-CMap zurück. Wenn es eine UCS-4-CMap gibt, wird diese zuerst zurückgegeben; andernfalls wird irgendeine gefundene Unicode-CMap zurückgegeben.

**Returns:**
[TtfCMapFormatBaseTable](../../com.aspose.font/ttfcmapformatbasetable) - Unicode subtable.
### getAllSubtables() {#getAllSubtables--}
```
public TtfCMapTable.TtfCMapSubtableDescription[] getAllSubtables()
```


Gibt alle Untertabellen der CMap-Tabelle zurück.

**Returns:**
com.aspose.font.TtfCMapTable.TtfCMapSubtableDescription[] - Array von TtfCmapSubtableDescription-Objekten
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


Liefert den Offset vom Anfang des sfnt.

**Returns:**
long - Offset vom Anfang des sfnt.
### getPlatformTables(int platformId, int platformSpecificId) {#getPlatformTables-int-int-}
```
public TtfCMapFormatBaseTable[] getPlatformTables(int platformId, int platformSpecificId)
```


Gibt CMap-Untertabellen für planformId und platformSpecificId zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| platformId | int | Plattform‑Id. |
| platformSpecificId | int | Plattform‑spezifische Kodierungs‑Id. |

**Returns:**
com.aspose.font.TtfCMapFormatBaseTable[] - CMap‑Untertabellen.
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

