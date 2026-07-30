---
title: "TtfPostTable"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella post del file di font TTF."
type: docs
weight: 107
url: /it/java/com.aspose.font/ttfposttable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfPostTable extends TtfTableBase
```

Rappresenta la tabella "post" del file di font TTF
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | Ottiene l'array di indici dei glifi per nome del glifo |
| [getClass()](#getClass--) |  |
| [getFormat()](#getFormat--) | Ottiene il formato fisso (versione) di questa tabella. |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | Ottiene l'indice del glifo per nome del glifo. |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | Ottiene il nome del glifo per indice del glifo. |
| [getItalicAngle()](#getItalicAngle--) | Restituisce fixed italicAngle Angolo italic in gradi. |
| [getMaxMemType1()](#getMaxMemType1--) | Restituisce uint32 maxMemType1 Memoria massima utilizzata quando un TrueType Font viene scaricato come Type 1 Font. |
| [getMaxMemType42()](#getMaxMemType42--) | Restituisce uint32 maxMemType42 Memoria massima utilizzata quando un TrueType font viene scaricato come Type 42 Font. |
| [getMinMemType1()](#getMinMemType1--) | Restituisce uint32 minMemType1 Memoria minima utilizzata quando un TrueType Font viene scaricato come Type 1 Font. |
| [getMinMemType42()](#getMinMemType42--) | Restituisce uint32 minMemType42 Memoria minima utilizzata quando un TrueType font viene scaricato come Type 42 Font. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTableFormat()](#getTableFormat--) | Restituisce fixed format (versione) di questa tabella. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Restituisce FWord underlinePosition Posizione della sottolineatura. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Restituisce FWord underlineThickness Spessore della sottolineatura. |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | Indica che nessuna informazione sul nome PostScript è fornita per i glifi in questo file di font. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Restituisce uint32 isFixedPitch. 0 se il font è a spaziatura proporzionale, diverso da zero se il Font non è a spaziatura proporzionale (cioè monospazio). |
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
### getAllGlyphIndexesForGlyphName(String glyphName) {#getAllGlyphIndexesForGlyphName-java.lang.String-}
```
public long[] getAllGlyphIndexesForGlyphName(String glyphName)
```


Ottiene l'array di indici dei glifi per nome del glifo

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphName | java.lang.String | Nome glifo |

**Returns:**
long[] - array di indici dei glifi
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFormat() {#getFormat--}
```
public float getFormat()
```


Ottiene il formato fisso (versione) di questa tabella.

**Returns:**
float - Fixed format(versione) di questa tabella.
### getGlyphIndex(String glyphName) {#getGlyphIndex-java.lang.String-}
```
public long getGlyphIndex(String glyphName)
```


Ottiene l'indice del glifo per nome del glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphName | java.lang.String | Nome del glifo. |

**Returns:**
long - Indice del glifo. Quando nessuna informazione sul nome PostScript è fornita per i glifi in questo file di font, restituisce l'indice 0, che è il glifo non definito o il glifo \".notdef\".
### getGlyphName(long glyphIndex) {#getGlyphName-long-}
```
public String getGlyphName(long glyphIndex)
```


Ottiene il nome del glifo per indice del glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphIndex | long | Indice del glifo. |

**Returns:**
java.lang.String - Nome del glifo. Quando nessuna informazione sul nome PostScript è fornita per i glifi in questo file di font, restituisce null.
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


Restituisce fixed italicAngle Angolo italic in gradi.

**Returns:**
float - Fixed italicAngle Angolo italic in gradi.
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


Restituisce uint32 maxMemType1 Memoria massima utilizzata quando un TrueType Font viene scaricato come Type 1 Font.

**Returns:**
long - UInt32 maxMemType1 Memoria massima utilizzata quando un TrueType Font viene scaricato come Type 1 Font.
### getMaxMemType42() {#getMaxMemType42--}
```
public long getMaxMemType42()
```


Restituisce uint32 maxMemType42 Memoria massima utilizzata quando un TrueType font viene scaricato come Type 42 Font.

**Returns:**
long - UInt32 maxMemType42 Memoria massima utilizzata quando un TrueType font viene scaricato come Type 42 Font.
### getMinMemType1() {#getMinMemType1--}
```
public long getMinMemType1()
```


Restituisce uint32 minMemType1 Memoria minima utilizzata quando un TrueType Font viene scaricato come Type 1 Font.

**Returns:**
long - UInt32 minMemType1 Memoria minima utilizzata quando un TrueType Font viene scaricato come Type 1 Font.
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


Restituisce uint32 minMemType42 Memoria minima utilizzata quando un TrueType font viene scaricato come Type 42 Font.

**Returns:**
long - UInt32 minMemType42 Memoria minima utilizzata quando un TrueType font viene scaricato come Type 42 Font.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Ottiene l'offset dall'inizio di sfnt.

**Returns:**
long - Offset dall'inizio di sfnt.
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


Restituisce fixed format (versione) di questa tabella. Usa le proprietà MajorNumber e MinorNUmber dell'oggetto Version16Dot16 in notazione esadecimale per rilevare la versione utilizzata.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
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
### getUnderlinePosition() {#getUnderlinePosition--}
```
public short getUnderlinePosition()
```


Restituisce FWord underlinePosition Posizione della sottolineatura.

**Returns:**
short - FWord underlinePosition Posizione della sottolineatura.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public short getUnderlineThickness()
```


Restituisce FWord underlineThickness Spessore della sottolineatura.

**Returns:**
short - FWord underlineThickness Spessore della sottolineatura.
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


Indica che nessuna informazione sul nome PostScript è fornita per i glifi in questo file di font.

**Returns:**
boolean - True, se nessuna informazione sul nome PostScript è fornita per i glifi in questo file di font. False, altrimenti.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public long isFixedPitch()
```


Restituisce uint32 isFixedPitch. 0 se il font è a spaziatura proporzionale, diverso da zero se il Font non è a spaziatura proporzionale (cioè monospazio).

**Returns:**
long - UInt32 isFixedPitch. 0 se il font è a spaziatura proporzionale, diverso da zero se il Font non è a spaziatura proporzionale (cioè monospazio).
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

