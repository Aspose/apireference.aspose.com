---
title: "CffEncoding"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar CFF _font-kodning."
type: docs
weight: 18
url: /sv/java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

Representerar CFF \_font-kodning.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Hämtar Gid för angiven charCode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parametriserad avkodningsmetod. |
| [encode(long gid, long charCode)](#encode-long-long-) | Kodar tecknet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Returnerar namn‑till‑teckenkod‑kodningskarta. |
| [getNameToGidIndex()](#getNameToGidIndex--) | Returnerar namn‑till‑teckenkod‑kodningskarta. |
| [getNameToSidIndex()](#getNameToSidIndex--) | Returnerar namn‑till‑teckenkod‑kodningskarta. |
| [getSidName(int sid)](#getSidName-int-) | Hämtar namn för den angivna SID. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Avkodar Gid till unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Avkodar en unicode och returnerar glyfid. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Hämtar Gid för angiven charCode. Denna metod är avsedd för CFF CIDFonts, där charCode måste vara ett giltigt CID‑värde. Glyph id är ett unikt nummer för en glyf, vilket är \_font‑typberoende. CFF Font glyph id kan vara en instans av klassen ( GlyphStringId ) eller ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| charCode | long | Teckenkod (CID) för att få glyfid. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to CID passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parametriserad avkodningsmetod. Stöds inte för CFF Font-typ.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementering av gränssnittet IEncodingParameters. |
| charCode | long | Teckenkod för att hämta teckenidentifierare för. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Kodar glyfen. Stöds inte för CFF Font-typer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| gid | long | Glyfid |
| charCode | long | CharCode associerad med glyfid. |

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


Returnerar namn‑till‑teckenkod‑kodningskarta. Obs: teckenkod är inte unicode. Teckenkod är ett teckenindex i Font‑kodningens "tabell".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToGidIndex() {#getNameToGidIndex--}
```
public NameToCodeMap getNameToGidIndex()
```


Returnerar namn‑till‑teckenkod‑kodningskarta. Obs: teckenkod är inte unicode. Teckenkod är ett teckenindex i Font‑kodningens "tabell".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToSidIndex() {#getNameToSidIndex--}
```
public NameToCodeMap getNameToSidIndex()
```


Returnerar namn‑till‑teckenkod‑kodningskarta. Obs: teckenkod är inte unicode. Teckenkod är ett teckenindex i Font‑kodningens "tabell".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getSidName(int sid) {#getSidName-int-}
```
public String getSidName(int sid)
```


Hämtar namn för den angivna SID.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sid | int | String‑identifierare. |

**Returns:**
java.lang.String - Namn från String‑INDEX om det hittas.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Avkodar Gid till unicode. Glyph id är ett unikt nummer för en glyf, vilket är \_font‑typberoende. CFF Font glyph id kan vara en instans av klassen ( GlyphStringId ) eller ( GlyphUInt32Id ).

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


Avkodar en unicode och returnerar glyfid. Glyph id är ett unikt nummer för en glyf, vilket är \_font‑typberoende. CFF Font glyph id kan vara en instans av klassen ( GlyphStringId ) eller ( GlyphUInt32Id ).

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

