---
title: "TtfLtshTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Linear-Threshold-Tabelle der TTF-Schriftdatei dar."
type: docs
weight: 103
url: /de/java/com.aspose.font/ttfltshtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfLtshTable extends TtfTableBase
```

Stellt die Linear-Threshold-Tabelle der TTF-Schriftdatei dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNumGlyphs()](#getNumGlyphs--) | Ruft die Anzahl der Glyphen ab (aus "numGlyphs" in der 'maxp'-Tabelle). |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTag()](#getTag--) | Ruft das Tabellen-Tag ab. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [getVersion()](#getVersion--) | Ruft die Tabellen-Version ab. |
| [getYPel(int glyphNum)](#getYPel-int-) | Gibt die vertikale Pel-Höhe für Glyph/Zero zurück, wenn die Glyph-Nummer inkorrekt ist. |
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
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Ruft die Anzahl der Glyphen ab (aus "numGlyphs" in der 'maxp'-Tabelle).

**Returns:**
int - Die Anzahl der Glyphen (aus "numGlyphs" in der 'maxp'-Tabelle).
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
### getYPel(int glyphNum) {#getYPel-int-}
```
public byte getYPel(int glyphNum)
```


Gibt die vertikale Pel-Höhe für Glyph/Zero zurück, wenn die Glyph-Nummer inkorrekt ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphNum | int | Eine Glyph-Nummer (Index). |

**Returns:**
byte - Die vertikale Pel-Höhe für Glyph/Zero, wenn die Glyph-Nummer inkorrekt ist.
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

