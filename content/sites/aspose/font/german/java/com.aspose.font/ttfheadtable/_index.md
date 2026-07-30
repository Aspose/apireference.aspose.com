---
title: "TtfHeadTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Kopf‑Tabelle der TTF‑Schriftdatei dar."
type: docs
weight: 99
url: /de/java/com.aspose.font/ttfheadtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHeadTable extends TtfTableBase
```

Stellt die "head" Tabelle der TTF Schriftdatei dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | Liefert uint32 checkSumAdjustment. |
| [getClass()](#getClass--) |  |
| [getCreated()](#getCreated--) | Liefert longDateTime erstelltes internationales Datum. |
| [getFlags()](#getFlags--) | Liefert uint16 flags. |
| [getFontDirectionHint()](#getFontDirectionHint--) | Liefert int16 fontDirectionHint. 0 Gemischte Richtungs‑Glyphen; 1 Nur stark von links nach rechts gerichtete Glyphen; 2 Wie 1, enthält aber auch neutrale Glyphen; -1 Nur stark von rechts nach links gerichtete Glyphen; -2 Wie -1, enthält aber auch neutrale Glyphen. |
| [getFontRevision()](#getFontRevision--) | Liefert Fixed fontRevision, festgelegt vom Schriftartenhersteller. |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | Liefert int16 glyphDataFormat 0 für das aktuelle Format. |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | Liefert int16 indexToLocFormat 0 für kurze Offsets, 1 für lange. |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | Liefert uint16 lowestRecPPEM kleinste lesbare Größe in Pixeln. |
| [getMacStyle()](#getMacStyle--) | Liefert uint16 macStyle. |
| [getMagicNumber()](#getMagicNumber--) | Liefert uint32 magicNumber, gesetzt auf 0x5F0F3CF5. |
| [getModified()](#getModified--) | Liefert longDateTime modifiziertes internationales Datum. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTag()](#getTag--) | Liest das Tabellen-Tag. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Liefert uint16 unitsPerEM, Bereich von 64 bis 16384. |
| [getVersion()](#getVersion--) | Fixed version 0x00010000, falls (Version 1.0). |
| [getXMax()](#getXMax--) | Liefert FWord xMax für alle Glyphenbegrenzungsrahmen. |
| [getXMin()](#getXMin--) | Liefert FWord xMin für alle Glyphenbegrenzungsrahmen. |
| [getYMax()](#getYMax--) | Liefert FWord yMax für alle Glyphenbegrenzungsrahmen. |
| [getYMin()](#getYMin--) | Liefert FWord yMin für alle Glyphenbegrenzungsrahmen. |
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
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


Liefert uint32 checkSumAdjustment. Zur Berechnung: Setzen Sie ihn auf 0, berechnen Sie die Prüfsumme für die 'head'-Tabelle und tragen Sie sie in das Tabellendirectory ein, summieren Sie die gesamte Schriftart als uint32 und speichern Sie dann B1B0AFBA - Summe. Die Prüfsumme für die 'head'-Tabelle wird nicht falsch sein. Das ist in Ordnung.

**Returns:**
long - Uint32 checkSumAdjustment.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreated() {#getCreated--}
```
public Date getCreated()
```


Liefert longDateTime erstelltes internationales Datum.

**Returns:**
java.util.Date - LongDateTime erstelltes internationales Datum.
### getFlags() {#getFlags--}
```
public int getFlags()
```


Liefert uint16 flags.

**Returns:**
int - UInt16 flags.
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


Liefert int16 fontDirectionHint. 0 Gemischte Richtungs‑Glyphen; 1 Nur stark von links nach rechts gerichtete Glyphen; 2 Wie 1, enthält aber auch neutrale Glyphen; -1 Nur stark von rechts nach links gerichtete Glyphen; -2 Wie -1, enthält aber auch neutrale Glyphen.

**Returns:**
short - Int16 fontDirectionHint.
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


Liefert Fixed fontRevision, festgelegt vom Schriftartenhersteller.

**Returns:**
float - Fixed fontRevision, festgelegt vom Schriftartenhersteller.
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


Liefert int16 glyphDataFormat 0 für das aktuelle Format.

**Returns:**
short - Int16 glyphDataFormat 0 für das aktuelle Format.
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


Liefert int16 indexToLocFormat 0 für kurze Offsets, 1 für lange.

**Returns:**
short - Int16 indexToLocFormat 0 für kurze Offsets, 1 für lange.
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


Liefert uint16 lowestRecPPEM kleinste lesbare Größe in Pixeln.

**Returns:**
int - UInt16 lowestRecPPEM kleinste lesbare Größe in Pixeln.
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


Liefert uint16 macStyle.

**Returns:**
int - UInt16 macStyle.
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


Liefert uint32 magicNumber, gesetzt auf 0x5F0F3CF5.

**Returns:**
long - UInt32 magicNumber auf 0x5F0F3CF5 gesetzt.
### getModified() {#getModified--}
```
public Date getModified()
```


Liefert longDateTime modifiziertes internationales Datum.

**Returns:**
java.util.Date - LongDateTime modifiziertes internationales Datum.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Liefert uint16 unitsPerEM, Bereich von 64 bis 16384.

**Returns:**
long - UInt16 unitsPerEM Bereich von 64 bis 16384.
### getVersion() {#getVersion--}
```
public float getVersion()
```


Fixed version 0x00010000, falls (Version 1.0).

**Returns:**
float - Feste Version 0x00010000, wenn (Version 1.0).
### getXMax() {#getXMax--}
```
public short getXMax()
```


Liefert FWord xMax für alle Glyphenbegrenzungsrahmen.

**Returns:**
short - FWord xMax für alle Glyphenbegrenzungsrahmen.
### getXMin() {#getXMin--}
```
public short getXMin()
```


Liefert FWord xMin für alle Glyphenbegrenzungsrahmen.

**Returns:**
short - FWord xMin für alle Glyphenbegrenzungsrahmen.
### getYMax() {#getYMax--}
```
public short getYMax()
```


Liefert FWord yMax für alle Glyphenbegrenzungsrahmen.

**Returns:**
short - FWord yMax für alle Glyphenbegrenzungsrahmen.
### getYMin() {#getYMin--}
```
public short getYMin()
```


Liefert FWord yMin für alle Glyphenbegrenzungsrahmen.

**Returns:**
short - FWord yMin für alle Glyphenbegrenzungsrahmen.
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

