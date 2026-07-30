---
title: "TtfGlyfTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar glyf‑tabellen i TTF‑typsnittsfilen."
type: docs
weight: 98
url: /sv/java/com.aspose.font/ttfglyftable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfGlyfTable extends TtfTableBase
```

Representerar "glyf"-tabell i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [containsGlyph(int glyphIndex)](#containsGlyph-int-) | Returnerar true om tabellen innehåller en glyf med glyphIndex. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getGlyph(long glyphIndex)](#getGlyph-long-) | Returnerar en glyf efter glyf‑index. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### containsGlyph(int glyphIndex) {#containsGlyph-int-}
```
public boolean containsGlyph(int glyphIndex)
```


Returnerar true om tabellen innehåller en glyf med glyphIndex.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphIndex | int | Glyfindex. |

**Returns:**
boolean - True om tabellen innehåller en glyf för angivet index, annars false.
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
### getGlyph(long glyphIndex) {#getGlyph-long-}
```
public Glyph getGlyph(long glyphIndex)
```


Returnerar en glyf efter glyf‑index.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphIndex | long | Glyfindex. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph Glyph related to index specified.
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

