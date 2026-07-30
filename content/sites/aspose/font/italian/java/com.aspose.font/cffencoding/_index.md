---
title: "CffEncoding"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la codifica _font CFF."
type: docs
weight: 18
url: /it/java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

Rappresenta la codifica CFF \_font.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Ottiene Gid per il charCode fornito. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Metodo di decodifica parametrizzato. |
| [encode(long gid, long charCode)](#encode-long-long-) | Codifica il glifo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Restituisce la mappa di codifica nome a codice carattere. |
| [getNameToGidIndex()](#getNameToGidIndex--) | Restituisce la mappa di codifica nome a codice carattere. |
| [getNameToSidIndex()](#getNameToSidIndex--) | Restituisce la mappa di codifica nome a codice carattere. |
| [getSidName(int sid)](#getSidName-int-) | Ottiene il nome per il SID specificato. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodifica Gid in unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Decodifica un Unicode e restituisce l'ID del glifo. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Ottiene Gid per il charCode fornito. Questo metodo è progettato per CFF CIDFonts, dove charCode deve essere un valore CID valido. Glyph id è un numero unico per un glifo, che dipende dal tipo \\_font. Il glyph id del Font CFF può essere un'istanza della classe ( GlyphStringId ) o della classe ( GlyphUInt32Id ).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charCode | long | Codice carattere (CID) per cui ottenere l'identificatore del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to CID passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Metodo di decodifica parametrizzato. Non supportato per il tipo di Font CFF.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementazione dell'interfaccia IEncodingParameters. |
| charCode | long | Codice carattere per cui ottenere l'identificatore del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Codifica il glifo. Non supportato per i tipi di Font CFF.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gid | long | Glyph id |
| charCode | long | CharCode associato all'ID glifo. |

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
### getNameToCharCodeIndex() {#getNameToCharCodeIndex--}
```
public NameToCodeMap getNameToCharCodeIndex()
```


Restituisce la mappa nome‑codice carattere della codifica. Nota: il codice carattere non è un unicode. Il codice carattere è un indice di carattere nella \"tabella\" di codifica del Font.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToGidIndex() {#getNameToGidIndex--}
```
public NameToCodeMap getNameToGidIndex()
```


Restituisce la mappa nome‑codice carattere della codifica. Nota: il codice carattere non è un unicode. Il codice carattere è un indice di carattere nella \"tabella\" di codifica del Font.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToSidIndex() {#getNameToSidIndex--}
```
public NameToCodeMap getNameToSidIndex()
```


Restituisce la mappa nome‑codice carattere della codifica. Nota: il codice carattere non è un unicode. Il codice carattere è un indice di carattere nella \"tabella\" di codifica del Font.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getSidName(int sid) {#getSidName-int-}
```
public String getSidName(int sid)
```


Ottiene il nome per il SID specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sid | int | Identificatore stringa. |

**Returns:**
java.lang.String - Nome dall'INDEX di String se trovato.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Decodifica Gid in unicode. Glyph id è un numero unico per un glifo, che dipende dal tipo \\_font. Il glyph id del Font CFF può essere un'istanza della classe ( GlyphStringId ) o della classe ( GlyphUInt32Id ).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Identificatore del glifo del simbolo da decodificare. |

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


Decodifica un unicode e restituisce l'ID glifo. Glyph id è un numero unico per un glifo, che dipende dal tipo \\_font. Il glyph id del Font CFF può essere un'istanza della classe ( GlyphStringId ) o della classe ( GlyphUInt32Id ).

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

