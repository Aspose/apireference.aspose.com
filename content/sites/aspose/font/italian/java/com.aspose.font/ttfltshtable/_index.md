---
title: "TtfLtshTable"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella Linear Threshold del file di font TTF."
type: docs
weight: 103
url: /it/java/com.aspose.font/ttfltshtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfLtshTable extends TtfTableBase
```

Rappresenta la tabella Linear Threshold del file di font TTF.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNumGlyphs()](#getNumGlyphs--) | Ottiene il numero di glifi (da "numGlyphs" nella tabella 'maxp'). |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTag()](#getTag--) | Ottiene il tag della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
| [getVersion()](#getVersion--) | Ottiene la versione della tabella. |
| [getYPel(int glyphNum)](#getYPel-int-) | Restituisce l'altezza verticale del pel per il glifo/zero se il numero del glifo è errato. |
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
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Ottiene il numero di glifi (da "numGlyphs" nella tabella 'maxp').

**Returns:**
int - Il numero di glifi (da "numGlyphs" nella tabella 'maxp').
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


Ottiene il tag della tabella.

**Returns:**
java.lang.String - L'etichetta della tabella.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Riferimento al repository della tabella TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Ottiene la versione della tabella.

**Returns:**
int - La versione della tabella.
### getYPel(int glyphNum) {#getYPel-int-}
```
public byte getYPel(int glyphNum)
```


Restituisce l'altezza verticale del pel per il glifo/zero se il numero del glifo è errato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphNum | int | Un numero di glifo (indice). |

**Returns:**
byte - L'altezza verticale del pel per il glifo/zero se il numero del glifo è errato.
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

