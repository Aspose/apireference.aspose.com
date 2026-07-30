---
title: "TtfEncoding"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la codifica del Font TTF."
type: docs
weight: 92
url: /it/java/com.aspose.font/ttfencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding)
```
public class TtfEncoding implements IFontEncoding
```

Rappresenta la codifica del Font TTF.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [decodeToGid(long unicode)](#decodeToGid-long-) | L'implementazione DecodeToGlyphId del font TTF trova la tabella Unicode e restituisce l'ID del glifo per il carattere Unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | La versione parametrizzata consente di utilizzare una tabella CMap specifica (non Unicode). |
| [encode(long gid, long charCode)](#encode-long-long-) | Codifica il glifo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [gidToUnicode(GlyphId glyphId)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodifica l'ID del glifo in Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Decodifica un Unicode e restituisce l'ID del glifo. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long unicode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long unicode)
```


L'implementazione DecodeToGlyphId del font TTF trova la tabella Unicode e restituisce l'ID del glifo per il carattere Unicode. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di Type1 è un nome di glifo, istanza della classe ( GlyphStringId ). L'ID di TTF è un indice intero, istanza della classe ( GlyphUInt32Id ).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| unicode | long | Codice carattere per cui ottenere l'identificatore del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


La versione parametrizzata consente di utilizzare una tabella CMap specifica (non Unicode).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementazione dell'interfaccia IEncodingParameters. |
| charCode | long | codice carattere per ottenere l'identificatore del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Codifica il glifo. Per i font TTF il codice carattere è Unicode.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gid | long | Identificatore del glifo. |
| charCode | long | Codice carattere. |

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
### gidToUnicode(GlyphId glyphId) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId glyphId)
```


Decodifica l'ID del glifo in Unicode. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di Type1 è un nome di glifo, istanza della classe ( GlyphStringId ). L'ID di TTF è un indice intero, istanza della classe ( GlyphUInt32Id ).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Identificatore del glifo del simbolo da decodificare. |

**Returns:**
long - Valore Unicode relativo all'id del glifo passato.
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
### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


Decodifica un Unicode e restituisce l'ID del glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| unicode | long | Unicode per cui ottenere l'identificatore del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
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

