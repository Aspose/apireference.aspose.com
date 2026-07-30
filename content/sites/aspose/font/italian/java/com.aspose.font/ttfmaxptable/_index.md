---
title: "TtfMaxpTable"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella maxp del file font TTF"
type: docs
weight: 104
url: /it/java/com.aspose.font/ttfmaxptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfMaxpTable extends TtfTableBase
```

Rappresenta la tabella "maxp" del file di font TTF
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxComponentContours()](#getMaxComponentContours--) | Ottiene uint16 maxComponentContours contorni in glifo composto. |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | Ottiene uint16 maxComponentDepth livelli di ricorsione, impostato a 0 se il font ha solo glifi semplici. |
| [getMaxComponentElements()](#getMaxComponentElements--) | Ottiene uint16 maxComponentElements numero di glifi referenziati al livello superiore. |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | Ottiene uint16 maxComponentPoints punti in glifo composto. |
| [getMaxContours()](#getMaxContours--) | Ottiene uint16 maxContours contorni in glifo non composto. |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | Ottiene uint16 maxFunctionDefs numero di FDEF. |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | Ottiene uint16 maxInstructionDefs numero di IDEF. |
| [getMaxPoints()](#getMaxPoints--) | Ottieni uint16 maxPoints punti in glifo non composto. |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | Ottiene uint16 maxSizeOfInstructions conteggio byte per le istruzioni del glifo. |
| [getMaxStackElements()](#getMaxStackElements--) | Ottiene uint16 maxStackElements profondità massima dello stack. |
| [getMaxStorage()](#getMaxStorage--) | Ottiene uint16 maxStorage numero di posizioni dell'Area di Memorizzazione. |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | Ottiene uint16 maxTwilightPoints punti usati nella Twilight Zone (Z0). |
| [getMaxZones()](#getMaxZones--) | Ottiene uint16 maxZones impostato a 2. |
| [getNumGlyphs()](#getNumGlyphs--) | Ottiene uint16 numGlyphs il numero di glifi nel Font. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTableVersion()](#getTableVersion--) | Ottiene la versione del formato. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
| [getVersion()](#getVersion--) | Ottiene la versione fissa 0x00010000 se (versione 1.0). |
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


Ottiene uint16 maxComponentContours contorni in glifo composto.

**Returns:**
int - UInt16 maxComponentContours contorni in glifo composto.
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


Ottiene uint16 maxComponentDepth livelli di ricorsione, impostato a 0 se il font ha solo glifi semplici.

**Returns:**
int - Uint16 maxComponentDepth livelli di ricorsione, impostati a 0 se il font contiene solo glifi semplici.
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


Ottiene uint16 maxComponentElements numero di glifi referenziati al livello superiore.

**Returns:**
int - UInt16 maxComponentElements numero di glifi referenziati al livello superiore.
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


Ottiene uint16 maxComponentPoints punti in glifo composto.

**Returns:**
int - UInt16 maxComponentPoints punti in glifo composto.
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


Ottiene uint16 maxContours contorni in glifo non composto.

**Returns:**
int - UInt16 maxContours contorni in glifo non composto.
### getMaxFunctionDefs() {#getMaxFunctionDefs--}
```
public int getMaxFunctionDefs()
```


Ottiene uint16 maxFunctionDefs numero di FDEF.

**Returns:**
int - UInt16 maxFunctionDefs numero di FDEFs.
### getMaxInstructionDefs() {#getMaxInstructionDefs--}
```
public int getMaxInstructionDefs()
```


Ottiene uint16 maxInstructionDefs numero di IDEF.

**Returns:**
int - UInt16 maxInstructionDefs numero di IDEFs.
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


Ottieni uint16 maxPoints punti in glifo non composto.

**Returns:**
int - UInt16 maxPoints punti in glifo non composto.
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


Ottiene uint16 maxSizeOfInstructions conteggio byte per le istruzioni del glifo.

**Returns:**
int - UInt16 maxSizeOfInstructions conteggio dei byte per le istruzioni del glifo.
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


Ottiene uint16 maxStackElements profondità massima dello stack.

**Returns:**
int - UInt16 maxStackElements profondità massima dello stack.
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


Ottiene uint16 maxStorage numero di posizioni dell'Area di Memorizzazione.

**Returns:**
int - UInt16 maxStorage numero di posizioni dell'Area di Memorizzazione.
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


Ottiene uint16 maxTwilightPoints punti usati nella Twilight Zone (Z0).

**Returns:**
int - UInt16 maxTwilightPoints punti usati nella Twilight Zone (Z0).
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


Ottiene uint16 maxZones impostato a 2.

**Returns:**
int - Uint16 maxZones impostato a 2.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Ottiene uint16 numGlyphs il numero di glifi nel Font.

**Returns:**
int - UInt16 numGlyphs il numero di glifi nel Font.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Ottiene l'offset dall'inizio di sfnt.

**Returns:**
long - Offset dall'inizio di sfnt.
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


Ottiene la versione del formato. Usa le proprietà MajorNumber e MinorNUmber dell'oggetto Version16Dot16 in notazione esadecimale per rilevare la versione utilizzata.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
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
### getVersion() {#getVersion--}
```
public float getVersion()
```


Ottiene la versione fissa 0x00010000 se (versione 1.0). Obsoleta, usa la proprietà TableVersion invece.

**Returns:**
float - Versione fissa 0x00010000 se (versione 1.0).
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

