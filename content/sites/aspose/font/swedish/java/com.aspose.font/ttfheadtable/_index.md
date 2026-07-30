---
title: "TtfHeadTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar huvudtabell för TTF-teckensnittsfilen."
type: docs
weight: 99
url: /sv/java/com.aspose.font/ttfheadtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHeadTable extends TtfTableBase
```

Representerar "head"-tabell i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | Hämtar uint32 checkSumAdjustment. |
| [getClass()](#getClass--) |  |
| [getCreated()](#getCreated--) | Hämtar longDateTime skapad internationellt datum. |
| [getFlags()](#getFlags--) | Hämtar uint16 flaggor. |
| [getFontDirectionHint()](#getFontDirectionHint--) | Hämtar int16 fontDirectionHint. 0 Blandade riktade glyfer; 1 Endast starkt vänster-till-höger glyfer; 2 Som 1 men innehåller också neutrala; -1 Endast starkt höger-till-vänster glyfer; -2 Som -1 men innehåller också neutrala. |
| [getFontRevision()](#getFontRevision--) | Hämtar fast fontRevision som satts av teckensnittstillverkaren. |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | Hämtar int16 glyphDataFormat 0 för aktuellt format. |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | Hämtar int16 indexToLocFormat 0 för korta offset, 1 för långa. |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | Hämtar uint16 lowestRecPPEM minsta läsbara storlek i pixlar. |
| [getMacStyle()](#getMacStyle--) | Hämtar uint16 macStyle. |
| [getMagicNumber()](#getMagicNumber--) | Hämtar uint32 magicNumber satt till 0x5F0F3CF5. |
| [getModified()](#getModified--) | Hämtar longDateTime modifierat internationellt datum. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Hämtar uint16 unitsPerEM intervall från 64 till 16384. |
| [getVersion()](#getVersion--) | Fast version 0x00010000 om (version 1.0). |
| [getXMax()](#getXMax--) | Hämtar FWord xMax för alla glyf-begränsningsrutor. |
| [getXMin()](#getXMin--) | Hämtar FWord xMin för alla glyf-begränsningsrutor. |
| [getYMax()](#getYMax--) | Hämtar FWord yMax för alla glyf-begränsningsrutor. |
| [getYMin()](#getYMin--) | Hämtar FWord yMin för alla glyf-begränsningsrutor. |
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
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


Hämtar uint32 checkSumAdjustment. För att beräkna: sätt den till 0, beräkna kontrollsumman för 'head'-tabellen och placera den i tabellkatalogen, summera hela teckensnittet som uint32, och lagra sedan B1B0AFBA - summa. Kontrollsumman för 'head'-tabellen kommer inte att vara fel. Det är OK.

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


Hämtar longDateTime skapad internationellt datum.

**Returns:**
java.util.Date - LongDateTime skapad internationellt datum.
### getFlags() {#getFlags--}
```
public int getFlags()
```


Hämtar uint16 flaggor.

**Returns:**
int - UInt16 flaggor.
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


Hämtar int16 fontDirectionHint. 0 Blandade riktade glyfer; 1 Endast starkt vänster-till-höger glyfer; 2 Som 1 men innehåller också neutrala; -1 Endast starkt höger-till-vänster glyfer; -2 Som -1 men innehåller också neutrala.

**Returns:**
short - Int16 fontDirectionHint.
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


Hämtar fast fontRevision som satts av teckensnittstillverkaren.

**Returns:**
float - Fast fontRevision satt av teckensnittstillverkaren.
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


Hämtar int16 glyphDataFormat 0 för aktuellt format.

**Returns:**
short - Int16 glyphDataFormat 0 för aktuellt format.
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


Hämtar int16 indexToLocFormat 0 för korta offset, 1 för långa.

**Returns:**
short - Int16 indexToLocFormat 0 för korta offset, 1 för långa.
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


Hämtar uint16 lowestRecPPEM minsta läsbara storlek i pixlar.

**Returns:**
int - UInt16 lowestRecPPEM minsta läsbara storlek i pixlar.
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


Hämtar uint16 macStyle.

**Returns:**
int - UInt16 macStyle.
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


Hämtar uint32 magicNumber satt till 0x5F0F3CF5.

**Returns:**
long - UInt32 magicNumber satt till 0x5F0F3CF5.
### getModified() {#getModified--}
```
public Date getModified()
```


Hämtar longDateTime modifierat internationellt datum.

**Returns:**
java.util.Date - LongDateTime modifierat internationellt datum.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Hämtar uint16 unitsPerEM intervall från 64 till 16384.

**Returns:**
long - UInt16 unitsPerEM intervall från 64 till 16384.
### getVersion() {#getVersion--}
```
public float getVersion()
```


Fast version 0x00010000 om (version 1.0).

**Returns:**
float - Fast version 0x00010000 om (version 1.0).
### getXMax() {#getXMax--}
```
public short getXMax()
```


Hämtar FWord xMax för alla glyf-begränsningsrutor.

**Returns:**
short - FWord xMax för alla glyf‑begränsningsrutor.
### getXMin() {#getXMin--}
```
public short getXMin()
```


Hämtar FWord xMin för alla glyf-begränsningsrutor.

**Returns:**
short - FWord xMin för alla glyf‑begränsningsrutor.
### getYMax() {#getYMax--}
```
public short getYMax()
```


Hämtar FWord yMax för alla glyf-begränsningsrutor.

**Returns:**
short - FWord yMax för alla glyf‑begränsningsrutor.
### getYMin() {#getYMin--}
```
public short getYMin()
```


Hämtar FWord yMin för alla glyf-begränsningsrutor.

**Returns:**
short - FWord yMin för alla glyf‑begränsningsrutor.
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

