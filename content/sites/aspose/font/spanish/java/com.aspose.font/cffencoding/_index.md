---
title: "CffEncoding"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la codificación _font CFF."
type: docs
weight: 18
url: /es/java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

Representa la codificación \_font de CFF.
## Métodos

| Método | Descripción |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Obtiene Gid para el charCode proporcionado. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Método de decodificación parametrizado. |
| [encode(long gid, long charCode)](#encode-long-long-) | Codifica el glifo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Devuelve el mapa de codificación de nombre a código de carácter. |
| [getNameToGidIndex()](#getNameToGidIndex--) | Devuelve el mapa de codificación de nombre a código de carácter. |
| [getNameToSidIndex()](#getNameToSidIndex--) | Devuelve el mapa de codificación de nombre a código de carácter. |
| [getSidName(int sid)](#getSidName-int-) | Obtiene el nombre para el SID especificado. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodifica Gid a unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Decodifica un unicode y devuelve el id de glifo. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Obtiene Gid para el charCode proporcionado. Este método está diseñado para CFF CIDFonts, donde charCode debe ser un valor CID válido. Glyph id es un número único para un glifo, que depende del tipo \_font. El glyph id de la fuente CFF puede ser una instancia de la clase ( GlyphStringId ) o de la clase ( GlyphUInt32Id ).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| charCode | long | Código de carácter (CID) para obtener el identificador de glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to CID passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Método de decodificación parametrizado. No compatible con el tipo de fuente CFF.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementación de la interfaz IEncodingParameters. |
| charCode | long | Código de carácter para obtener el identificador del glifo. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Codifica el glifo. No compatible con los tipos de fuente CFF.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| gid | long | ID de glifo |
| charCode | long | CharCode asociado con el ID de glifo. |

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


Devuelve el mapa de nombre a codificación de código de carácter. Nota: el código de carácter no es Unicode. El código de carácter es un índice de carácter en la "tabla" de codificación de la fuente.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToGidIndex() {#getNameToGidIndex--}
```
public NameToCodeMap getNameToGidIndex()
```


Devuelve el mapa de nombre a codificación de código de carácter. Nota: el código de carácter no es Unicode. El código de carácter es un índice de carácter en la "tabla" de codificación de la fuente.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToSidIndex() {#getNameToSidIndex--}
```
public NameToCodeMap getNameToSidIndex()
```


Devuelve el mapa de nombre a codificación de código de carácter. Nota: el código de carácter no es Unicode. El código de carácter es un índice de carácter en la "tabla" de codificación de la fuente.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getSidName(int sid) {#getSidName-int-}
```
public String getSidName(int sid)
```


Obtiene el nombre para el SID especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| sid | int | Identificador de cadena. |

**Returns:**
java.lang.String - Nombre del String INDEX si se encuentra.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Decodifica Gid a Unicode. Glyph id es un número único para un glifo, que depende del tipo \_font. El glyph id de la fuente CFF puede ser una instancia de la clase ( GlyphStringId ) o de la clase ( GlyphUInt32Id ).

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


Decodifica un Unicode y devuelve el ID de glifo. Glyph id es un número único para un glifo, que depende del tipo \_font. El glyph id de la fuente CFF puede ser una instancia de la clase ( GlyphStringId ) o de la clase ( GlyphUInt32Id ).

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

