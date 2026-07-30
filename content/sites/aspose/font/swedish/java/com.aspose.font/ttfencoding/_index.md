---
title: "TtfEncoding"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar TTF-typsnittskodning."
type: docs
weight: 92
url: /sv/java/com.aspose.font/ttfencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding)
```
public class TtfEncoding implements IFontEncoding
```

Representerar TTF-typsnittskodning.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [decodeToGid(long unicode)](#decodeToGid-long-) | TTF‑fontens DecodeToGlyphId‑implementation hittar unicode‑tabellen och returnerar glyfid för unicode‑tecken. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parametriserad version tillåter att använda en specifik CMap‑tabell (inte unicode). |
| [encode(long gid, long charCode)](#encode-long-long-) | Kodar tecknet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [gidToUnicode(GlyphId glyphId)](#gidToUnicode-com.aspose.font.GlyphId-) | Avkodar glyfid till unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Avkodar en unicode och returnerar glyfid. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long unicode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long unicode)
```


TTF‑fontens DecodeToGlyphId‑implementation hittar unicode‑tabellen och returnerar glyfid för unicode‑tecken. Glyfid är ett unikt nummer för en glyf, vilket beror på fonttypen. Till exempel: Type1:s id är ett glyfnamn, en instans av klassen ( GlyphStringId ). TTF:s id är ett int‑index, en instans av klassen ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| unicode | long | Teckenkod för att hämta teckenidentifierare för. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parametriserad version tillåter att använda en specifik CMap‑tabell (inte unicode).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementering av gränssnittet IEncodingParameters. |
| charCode | long | teckenkod för att hämta glyfid. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Kodar glyfen. För TTF‑fonter är teckenkoden unicode.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| gid | long | Glyfidentifierare. |
| charCode | long | Teckenkod. |

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
### gidToUnicode(GlyphId glyphId) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId glyphId)
```


Avkodar glyfid till unicode. Glyfid är ett unikt nummer för en glyf, vilket beror på fonttypen. Till exempel: Type1:s id är ett glyfnamn, en instans av klassen ( GlyphStringId ). TTF:s id är ett int‑index, en instans av klassen ( GlyphUInt32Id ).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph‑identifierare för symbol att avkoda. |

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


Avkodar en unicode och returnerar glyfid.

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

