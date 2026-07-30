---
title: "TtfGlyfTable"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la tabella glyf del file di carattere TTF."
type: docs
weight: 98
url: /it/java/com.aspose.font/ttfglyftable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfGlyfTable extends TtfTableBase
```

Rappresenta la tabella "glyf" del file TTF font.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [containsGlyph(int glyphIndex)](#containsGlyph-int-) | Restituisce true se la tabella contiene il glifo con glyphIndex. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getGlyph(long glyphIndex)](#getGlyph-long-) | Restituisce un glifo per indice di glifo. |
| [getOffset()](#getOffset--) | Ottiene l'offset dall'inizio di sfnt. |
| [getTag()](#getTag--) | Ottiene l'etichetta della tabella. |
| [getTtfTables()](#getTtfTables--) | Riferimento al repository della tabella TTF. |
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


Restituisce true se la tabella contiene il glifo con glyphIndex.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphIndex | int | Indice del glifo. |

**Returns:**
boolean - True se la tabella contiene il glifo per l'indice specificato, false altrimenti.
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
### getGlyph(long glyphIndex) {#getGlyph-long-}
```
public Glyph getGlyph(long glyphIndex)
```


Restituisce un glifo per indice di glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphIndex | long | Indice del glifo. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph Glyph related to index specified.
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

