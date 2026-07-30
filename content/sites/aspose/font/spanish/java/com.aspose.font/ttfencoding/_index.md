---
title: "TtfEncoding"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la codificación de la fuente TTF."
type: docs
weight: 92
url: /es/java/com.aspose.font/ttfencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding)
```
public class TtfEncoding implements IFontEncoding
```

Representa la codificación de la fuente TTF.
## Métodos

| Método | Descripción |
| --- | --- |
| [decodeToGid(long unicode)](#decodeToGid-long-) | La implementación DecodeToGlyphId de la fuente TTF busca la tabla unicode y devuelve el id de glifo para el carácter unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | La versión parametrizada permite usar una tabla CMap específica (no unicode). |
| [encode(long gid, long charCode)](#encode-long-long-) | Codifica el glifo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [gidToUnicode(GlyphId glyphId)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodifica el id de glifo a unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Decodifica un unicode y devuelve el id de glifo. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long unicode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long unicode)
```


La implementación DecodeToGlyphId de la fuente TTF busca la tabla unicode y devuelve el id de glifo para el carácter unicode. El id de glifo es un número único para un glifo, que depende del tipo de fuente. Por ejemplo: el id de Type1 es un nombre de glifo, instancia de la clase ( GlyphStringId ). El id de TTF es un índice entero, instancia de la clase ( GlyphUInt32Id ).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| unicode | long | Código de carácter para obtener el identificador del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


La versión parametrizada permite usar una tabla CMap específica (no unicode).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementación de la interfaz IEncodingParameters. |
| charCode | long | código de carácter para obtener el identificador de glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Codifica el glifo. Para fuentes TTF el código de carácter es unicode.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| gid | long | Identificador de glifo. |
| charCode | long | Código de carácter. |

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
### gidToUnicode(GlyphId glyphId) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId glyphId)
```


Decodifica el id de glifo a unicode. El id de glifo es un número único para un glifo, que depende del tipo de fuente. Por ejemplo: el id de Type1 es un nombre de glifo, instancia de la clase ( GlyphStringId ). El id de TTF es un índice entero, instancia de la clase ( GlyphUInt32Id ).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Identificador de glifo del símbolo a decodificar. |

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


Decodifica un unicode y devuelve el id de glifo.

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

