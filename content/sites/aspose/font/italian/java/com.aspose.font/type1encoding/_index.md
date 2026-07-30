---
title: "Type1Encoding"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la codifica del Font Type1."
type: docs
weight: 114
url: /it/java/com.aspose.font/type1encoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class Type1Encoding implements IFontEncoding, ISupportsNameAddressing
```

Rappresenta la codifica del Font Type1.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Decodifica Gid in unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Metodo di decodifica parametrizzato. |
| [encode(long gid, long charCode)](#encode-long-long-) | Codifica il glifo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Restituisce la mappa di codifica nome a codice carattere. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodifica Gid in Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Restituisce GlyphId per unicode. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Decodifica Gid in unicode. Glyph id è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1 è un nome di glifo, istanza della classe ( GlyphStringId ). L'id di TTF è un indice intero, istanza della classe ( GlyphUInt32Id ).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charCode | long | Codice carattere per cui ottenere l'identificatore del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Metodo di decodifica parametrizzato. Non supportato per il tipo di Font Type1.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Non supportato per il tipo di Font Type1. |
| charCode | long | Non supportato per il tipo di Font Type1. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Not supported for Type1 Font type.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Codifica il glifo. Per i Font TTF il codice carattere è unicode. Non supportato per i tipi di Font Type1.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gid | long | ID glifo. |
| charCode | long | Codice carattere associato all'id del glifo. |

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


Restituisce la mappa di codifica nome a codice carattere. Nota: il codice carattere non è un unicode. Il codice carattere è un indice di carattere nella \"tabella\" di codifica del Font.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Decodifica Gid in Unicode. Glyph id è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1 è un nome di glifo, istanza della classe ( GlyphStringId ). L'id di TTF è un indice intero, istanza della classe ( GlyphUInt32Id ).

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


Restituisce GlyphId per unicode. O notdef se il font non contiene un glifo per l'unicode. Glyph id è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1 è un nome di glifo, istanza della classe ( GlyphStringId ). L'id di TTF è un indice intero, istanza della classe ( GlyphUInt32Id ).

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

