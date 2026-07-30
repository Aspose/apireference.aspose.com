---
title: "Type1Encoding"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar Type1-typsnitts-kodning."
type: docs
weight: 114
url: /sv/java/com.aspose.font/type1encoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class Type1Encoding implements IFontEncoding, ISupportsNameAddressing
```

Representerar Type1-typsnitts-kodning.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Avkodar Gid till unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parametriserad avkodningsmetod. |
| [encode(long gid, long charCode)](#encode-long-long-) | Kodar tecknet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Returnerar namn‑till‑teckenkod‑kodningskarta. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Avkodar Gid till Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Returnerar GlyphId för unicode. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Avkodar Gid till unicode. Glyph‑id är ett unikt nummer för ett tecken, som beror på font‑typen. Till exempel: Type1:s id är ett teckennamn, en instans av klassen ( GlyphStringId ). TTF:s id är ett heltalsindex, en instans av klassen ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| charCode | long | Teckenkod för att hämta teckenidentifierare för. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parametriserad avkodningsmetod. Stöds inte för Type1‑fonttyp.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Stöds inte för Type1‑fonttyp. |
| charCode | long | Stöds inte för Type1‑fonttyp. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Not supported for Type1 Font type.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Kodar tecknet. För TTF‑fonter är teckenkoden unicode. Stöds inte för Type1‑fonttyper.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| gid | long | Glyfid. |
| charCode | long | Teckenkod associerad med glyph‑id. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Returnerar namn‑till‑teckenkod‑kodningskarta. Obs: Teckenkod är inte unicode. Teckenkod är ett teckenindex i Font encoding "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Avkodar Gid till Unicode. Glyph‑id är ett unikt nummer för ett tecken, som beror på font‑typen. Till exempel: Type1:s id är ett teckennamn, en instans av klassen ( GlyphStringId ). TTF:s id är ett heltalsindex, en instans av klassen ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑identifierare för symbol att avkoda. |

**Returns:**
long – Unicode‑värde relaterat till det angivna glyph‑id.
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


Returnerar GlyphId för unicode. Eller notdef om fonten inte innehåller ett glyph för unicode. Glyph‑id är ett unikt nummer för ett tecken, som beror på font‑typen. Till exempel: Type1:s id är ett teckennamn, en instans av klassen ( GlyphStringId ). TTF:s id är ett heltalsindex, en instans av klassen ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| unicode | long | Unicode för att få glyph‑identifierare för. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

