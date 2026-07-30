---
title: "TtfCMapTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar cmap-tabellen i TTF-typsnittsfilen."
type: docs
weight: 89
url: /sv/java/com.aspose.font/ttfcmaptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfCMapTable extends TtfTableBase
```

Representerar "cmap"-tabell i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findUnicodeTable()](#findUnicodeTable--) | Söker och returnerar unicode CMap. |
| [getAllSubtables()](#getAllSubtables--) | Returnerar alla deltabeller från CMap-tabellen. |
| [getClass()](#getClass--) |  |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getPlatformTables(int platformId, int platformSpecificId)](#getPlatformTables-int-int-) | Returnerar CMap-deltabeller för planformId och platformSpecificId. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
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
### findUnicodeTable() {#findUnicodeTable--}
```
public TtfCMapFormatBaseTable findUnicodeTable()
```


Söker och returnerar unicode CMap. om det finns ucs-4 CMap - returneras den först; annars - returneras någon unicode CMap som kan hittas.

**Returns:**
[TtfCMapFormatBaseTable](../../com.aspose.font/ttfcmapformatbasetable) - Unicode subtable.
### getAllSubtables() {#getAllSubtables--}
```
public TtfCMapTable.TtfCMapSubtableDescription[] getAllSubtables()
```


Returnerar alla deltabeller från CMap-tabellen.

**Returns:**
com.aspose.font.TtfCMapTable.TtfCMapSubtableDescription[] - array av TtfCmapSubtableDescription-objekt
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
### getPlatformTables(int platformId, int platformSpecificId) {#getPlatformTables-int-int-}
```
public TtfCMapFormatBaseTable[] getPlatformTables(int platformId, int platformSpecificId)
```


Returnerar CMap-deltabeller för planformId och platformSpecificId.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| platformId | int | Plattforms-ID. |
| platformSpecificId | int | Plattformspecifik kodnings-ID. |

**Returns:**
com.aspose.font.TtfCMapFormatBaseTable[] - CMap-deltabeller.
### getTag() {#getTag--}
```
public static String getTag()
```


Hämtar tabellens tagg.

**Returns:**
java.lang.String - Tabellens tagg.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referens till TTF-tabellarkivet.

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

