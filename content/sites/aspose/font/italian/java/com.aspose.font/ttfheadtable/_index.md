---
title: "TtfHeadTable"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella head del file di font TTF."
type: docs
weight: 99
url: /it/java/com.aspose.font/ttfheadtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHeadTable extends TtfTableBase
```

Rappresenta la tabella "head" del file TTF Font.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | Ottiene uint32 checkSumAdjustment. |
| [getClass()](#getClass--) |  |
| [getCreated()](#getCreated--) | Ottiene longDateTime data internazionale di creazione. |
| [getFlags()](#getFlags--) | Ottiene uint16 flags. |
| [getFontDirectionHint()](#getFontDirectionHint--) | Ottiene int16 fontDirectionHint. 0 Glifi direzionali misti; 1 Solo glifi fortemente da sinistra a destra; 2 Come 1 ma contiene anche neutrali; -1 Solo glifi fortemente da destra a sinistra; -2 Come -1 ma contiene anche neutrali. |
| [getFontRevision()](#getFontRevision--) | Ottieni fontRevision fixed impostato dal produttore del font. |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | Ottiene int16 glyphDataFormat 0 per il formato corrente. |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | Ottiene int16 indexToLocFormat 0 per offset brevi, 1 per lunghi. |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | Ottiene uint16 lowestRecPPEM dimensione leggibile più piccola in pixel. |
| [getMacStyle()](#getMacStyle--) | Ottiene uint16 macStyle. |
| [getMagicNumber()](#getMagicNumber--) | Ottiene uint32 magicNumber impostato a 0x5F0F3CF5. |
| [getModified()](#getModified--) | Ottiene longDateTime data internazionale di modifica. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Ottiene uint16 unitsPerEM intervallo da 64 a 16384. |
| [getVersion()](#getVersion--) | Versione fixed 0x00010000 se (versione 1.0). |
| [getXMax()](#getXMax--) | Ottiene FWord xMax per tutti i riquadri di delimitazione dei glifi. |
| [getXMin()](#getXMin--) | Ottiene FWord xMin per tutti i riquadri di delimitazione dei glifi. |
| [getYMax()](#getYMax--) | Ottiene FWord yMax per tutti i riquadri di delimitazione dei glifi. |
| [getYMin()](#getYMin--) | Ottiene FWord yMin per tutti i riquadri di delimitazione dei glifi. |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


Ottiene uint32 checkSumAdjustment. Per calcolarlo: impostalo a 0, calcola il checksum per la tabella 'head' e inseriscilo nella directory della tabella, somma l'intero font come uint32, quindi memorizza B1B0AFBA - somma. Il checksum per la tabella 'head' non sarà errato. Va bene.

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


Ottiene longDateTime data internazionale di creazione.

**Returns:**
java.util.Date - LongDateTime data internazionale di creazione.
### getFlags() {#getFlags--}
```
public int getFlags()
```


Ottiene uint16 flags.

**Returns:**
int - UInt16 flags.
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


Ottiene int16 fontDirectionHint. 0 Glifi direzionali misti; 1 Solo glifi fortemente da sinistra a destra; 2 Come 1 ma contiene anche neutrali; -1 Solo glifi fortemente da destra a sinistra; -2 Come -1 ma contiene anche neutrali.

**Returns:**
short - Int16 fontDirectionHint.
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


Ottieni fontRevision fixed impostato dal produttore del font.

**Returns:**
float - Fixed fontRevision impostato dal produttore del font.
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


Ottiene int16 glyphDataFormat 0 per il formato corrente.

**Returns:**
short - Int16 glyphDataFormat 0 per il formato corrente.
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


Ottiene int16 indexToLocFormat 0 per offset brevi, 1 per lunghi.

**Returns:**
short - Int16 indexToLocFormat 0 per offset brevi, 1 per lunghi.
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


Ottiene uint16 lowestRecPPEM dimensione leggibile più piccola in pixel.

**Returns:**
int - UInt16 lowestRecPPEM dimensione leggibile più piccola in pixel.
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


Ottiene uint16 macStyle.

**Returns:**
int - UInt16 macStyle.
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


Ottiene uint32 magicNumber impostato a 0x5F0F3CF5.

**Returns:**
long - UInt32 magicNumber impostato a 0x5F0F3CF5.
### getModified() {#getModified--}
```
public Date getModified()
```


Ottiene longDateTime data internazionale di modifica.

**Returns:**
java.util.Date - LongDateTime data internazionale modificata.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Ottiene l'offset dall'inizio di sfnt.

**Returns:**
long - Offset dall'inizio di sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Ottiene l'etichetta della tabella.

**Returns:**
java.lang.String - Etichetta della tabella.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Riferimento al repository della tabella TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Ottiene uint16 unitsPerEM intervallo da 64 a 16384.

**Returns:**
long - UInt16 unitsPerEM intervallo da 64 a 16384.
### getVersion() {#getVersion--}
```
public float getVersion()
```


Versione fixed 0x00010000 se (versione 1.0).

**Returns:**
float - Versione fissa 0x00010000 se (versione 1.0).
### getXMax() {#getXMax--}
```
public short getXMax()
```


Ottiene FWord xMax per tutti i riquadri di delimitazione dei glifi.

**Returns:**
short - FWord xMax per tutti i riquadri di delimitazione dei glifi.
### getXMin() {#getXMin--}
```
public short getXMin()
```


Ottiene FWord xMin per tutti i riquadri di delimitazione dei glifi.

**Returns:**
short - FWord xMin per tutti i riquadri di delimitazione dei glifi.
### getYMax() {#getYMax--}
```
public short getYMax()
```


Ottiene FWord yMax per tutti i riquadri di delimitazione dei glifi.

**Returns:**
short - FWord yMax per tutti i riquadri di delimitazione dei glifi.
### getYMin() {#getYMin--}
```
public short getYMin()
```


Ottiene FWord yMin per tutti i riquadri di delimitazione dei glifi.

**Returns:**
short - FWord yMin per tutti i riquadri di delimitazione dei glifi.
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

