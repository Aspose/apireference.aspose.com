---
title: "Type1Encoding"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la codificación de fuente Type1."
type: docs
weight: 114
url: /es/java/com.aspose.font/type1encoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class Type1Encoding implements IFontEncoding, ISupportsNameAddressing
```

Representa la codificación de fuente Type1.
## Métodos

| Método | Descripción |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Decodifica Gid a unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Método de decodificación parametrizado. |
| [encode(long gid, long charCode)](#encode-long-long-) | Codifica el glifo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Devuelve el mapa de codificación de nombre a código de carácter. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodifica Gid a Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Devuelve GlyphId para Unicode. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Decodifica Gid a unicode. El id del glifo es un número único para un glifo, que depende del tipo de fuente. Por ejemplo: el id de Type1 es un nombre de glifo, instancia de la clase ( GlyphStringId ). El id de TTF es un índice entero, instancia de la clase ( GlyphUInt32Id ).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| charCode | long | Código de carácter para obtener el identificador del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Método de decodificación parametrizado. No compatible con el tipo de fuente Type1.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | No compatible con el tipo de fuente Type1. |
| charCode | long | No compatible con el tipo de fuente Type1. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Not supported for Type1 Font type.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Codifica el glifo. Para fuentes TTF el código de carácter es unicode. No compatible con los tipos de fuente Type1.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| gid | long | Id de glifo. |
| charCode | long | Código de carácter asociado con el id del glifo. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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


Devuelve el mapa de codificación de nombre a código de carácter. Nota: El código de carácter no es un unicode. El código de carácter es un índice de carácter en la "tabla" de codificación de la fuente.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Decodifica Gid a Unicode. El id del glifo es un número único para un glifo, que depende del tipo de fuente. Por ejemplo: el id de Type1 es un nombre de glifo, instancia de la clase ( GlyphStringId ). El id de TTF es un índice entero, instancia de la clase ( GlyphUInt32Id ).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Identificador de glifo del símbolo a decodificar. |

**Returns:**
long - Valor Unicode relacionado con el id de glifo pasado.
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


Devuelve GlyphId para unicode. O notdef si la fuente no contiene un glifo para el unicode. El id del glifo es un número único para un glifo, que depende del tipo de fuente. Por ejemplo: el id de Type1 es un nombre de glifo, instancia de la clase ( GlyphStringId ). El id de TTF es un índice entero, instancia de la clase ( GlyphUInt32Id ).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| unicode | long | Unicode para obtener el identificador del glifo. |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

