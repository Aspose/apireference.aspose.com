---
title: "TtfMaxpTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die maxp‑Tabelle der TTF‑Schriftdatei dar"
type: docs
weight: 104
url: /de/java/com.aspose.font/ttfmaxptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfMaxpTable extends TtfTableBase
```

Stellt die "maxp"-Tabelle der TTF-Schriftdatei dar
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxComponentContours()](#getMaxComponentContours--) | Liefert uint16 maxComponentContours Konturen in zusammengesetztem Glyph. |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | Liefert uint16 maxComponentDepth Rekursionsebenen, auf 0 gesetzt, wenn die Schrift nur einfache Glyphen enthält. |
| [getMaxComponentElements()](#getMaxComponentElements--) | Liefert uint16 maxComponentElements Anzahl der Glyphen, die auf oberster Ebene referenziert werden. |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | Liefert uint16 maxComponentPoints Punkte in zusammengesetztem Glyph. |
| [getMaxContours()](#getMaxContours--) | Liefert uint16 maxContours Konturen in nicht‑zusammengesetztem Glyph. |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | Liefert uint16 maxFunctionDefs Anzahl der FDEFs. |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | Liefert uint16 maxInstructionDefs Anzahl der IDEFs. |
| [getMaxPoints()](#getMaxPoints--) | Liefert uint16 maxPoints Punkte in nicht‑zusammengesetztem Glyph. |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | Liefert uint16 maxSizeOfInstructions Byteanzahl für Glyph‑Anweisungen. |
| [getMaxStackElements()](#getMaxStackElements--) | Liefert uint16 maxStackElements maximale Stapeltiefe. |
| [getMaxStorage()](#getMaxStorage--) | Liefert uint16 maxStorage Anzahl der Speicherbereichs‑Positionen. |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | Liefert uint16 maxTwilightPoints Punkte, die in der Twilight Zone (Z0) verwendet werden. |
| [getMaxZones()](#getMaxZones--) | Liefert uint16 maxZones, festgelegt auf 2. |
| [getNumGlyphs()](#getNumGlyphs--) | Liefert uint16 numGlyphs die Anzahl der Glyphen in der Schrift. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTableVersion()](#getTableVersion--) | Liefert Formatversion. |
| [getTag()](#getTag--) | Liest das Tabellen-Tag. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [getVersion()](#getVersion--) | Gibt feste Version 0x00010000, wenn (Version 1.0). |
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
### getMaxComponentContours() {#getMaxComponentContours--}
```
public int getMaxComponentContours()
```


Liefert uint16 maxComponentContours Konturen in zusammengesetztem Glyph.

**Returns:**
int - UInt16 maxComponentContours Konturen in zusammengesetztem Glyph.
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


Liefert uint16 maxComponentDepth Rekursionsebenen, auf 0 gesetzt, wenn die Schrift nur einfache Glyphen enthält.

**Returns:**
int - Uint16 maxComponentDepth Rekursionsebenen, auf 0 setzen, wenn die Schrift nur einfache Glyphen hat.
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


Liefert uint16 maxComponentElements Anzahl der Glyphen, die auf oberster Ebene referenziert werden.

**Returns:**
int - UInt16 maxComponentElements Anzahl der Glyphen, die auf oberster Ebene referenziert werden.
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


Liefert uint16 maxComponentPoints Punkte in zusammengesetztem Glyph.

**Returns:**
int - UInt16 maxComponentPoints Punkte in zusammengesetztem Glyph.
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


Liefert uint16 maxContours Konturen in nicht‑zusammengesetztem Glyph.

**Returns:**
int - UInt16 maxContours Konturen in nicht zusammengesetztem Glyph.
### getMaxFunctionDefs() {#getMaxFunctionDefs--}
```
public int getMaxFunctionDefs()
```


Liefert uint16 maxFunctionDefs Anzahl der FDEFs.

**Returns:**
int - UInt16 maxFunctionDefs Anzahl der FDEFs.
### getMaxInstructionDefs() {#getMaxInstructionDefs--}
```
public int getMaxInstructionDefs()
```


Liefert uint16 maxInstructionDefs Anzahl der IDEFs.

**Returns:**
int - UInt16 maxInstructionDefs Anzahl der IDEFs.
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


Liefert uint16 maxPoints Punkte in nicht‑zusammengesetztem Glyph.

**Returns:**
int - UInt16 maxPoints Punkte in nicht zusammengesetztem Glyph.
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


Liefert uint16 maxSizeOfInstructions Byteanzahl für Glyph‑Anweisungen.

**Returns:**
int - UInt16 maxSizeOfInstructions Byteanzahl für Glyphen‑Anweisungen.
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


Liefert uint16 maxStackElements maximale Stapeltiefe.

**Returns:**
int - UInt16 maxStackElements maximale Stapeltiefe.
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


Liefert uint16 maxStorage Anzahl der Speicherbereichs‑Positionen.

**Returns:**
int - UInt16 maxStorage Anzahl der Speicherbereichs‑Positionen.
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


Liefert uint16 maxTwilightPoints Punkte, die in der Twilight Zone (Z0) verwendet werden.

**Returns:**
int - UInt16 maxTwilightPoints Punkte, die in der Twilight Zone (Z0) verwendet werden.
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


Liefert uint16 maxZones, festgelegt auf 2.

**Returns:**
int - Uint16 maxZones auf 2 gesetzt.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Liefert uint16 numGlyphs die Anzahl der Glyphen in der Schrift.

**Returns:**
int - UInt16 numGlyphs die Anzahl der Glyphen in der Schrift.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert den Offset vom Anfang des sfnt.

**Returns:**
long - Offset vom Anfang des sfnt.
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


Liefert Formatversion. Verwende die Eigenschaften MajorNumber und MinorNUmber des Objekts Version16Dot16 in hexadezimaler Schreibweise, um die verwendete Version zu erkennen.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
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
### getVersion() {#getVersion--}
```
public float getVersion()
```


Liefert feste Version 0x00010000, wenn (Version 1.0). Veraltet, stattdessen die Eigenschaft TableVersion verwenden.

**Returns:**
float - Feste Version 0x00010000, wenn (Version 1.0).
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

