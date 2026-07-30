---
title: "TtfLtshTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar Linear Threshold-tabellen i TTF-typsnittsfilen."
type: docs
weight: 103
url: /sv/java/com.aspose.font/ttfltshtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfLtshTable extends TtfTableBase
```

Representerar Linear Threshold-tabellen i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNumGlyphs()](#getNumGlyphs--) | Hämtar antalet glyfer (från "numGlyphs" i 'maxp'-tabellen). |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTag()](#getTag--) | Hämtar tabelltaggen. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [getVersion()](#getVersion--) | Hämtar tabellversionen. |
| [getYPel(int glyphNum)](#getYPel-int-) | Returnerar den vertikala pelhöjden för glyph/zero om teckennumret är felaktigt. |
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
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Hämtar antalet glyfer (från "numGlyphs" i 'maxp'-tabellen).

**Returns:**
int - Antalet tecken (från "numGlyphs" i 'maxp'-tabellen).
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


Hämtar tabelltaggen.

**Returns:**
java.lang.String - Tabellens tagg.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referens till TTF-tabellarkivet.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Hämtar tabellversionen.

**Returns:**
int - Tabellens version.
### getYPel(int glyphNum) {#getYPel-int-}
```
public byte getYPel(int glyphNum)
```


Returnerar den vertikala pelhöjden för glyph/zero om teckennumret är felaktigt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphNum | int | Ett teckennummer (index). |

**Returns:**
byte - Den vertikala pelhöjden för glyph/zero om teckennumret är felaktigt.
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

