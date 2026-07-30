---
title: "GlyphId"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar glyph‑id:n som finns i teckensnittet."
type: docs
weight: 50
url: /sv/java/com.aspose.font/glyphid/
---
**Inheritance:**
java.lang.Object
```
public abstract class GlyphId
```

Representerar glyph‑id:n som finns i teckensnittet. Ett glyph‑id är ett unikt nummer för ett glyph, vilket beror på teckensnittstypen. Till exempel: Type1:s id är ett glyph‑namn, en instans av klassen ( GlyphStringId ) class. TTF:s id är ett heltalsindex, en instans av klassen ( GlyphUInt32Id ) class.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Returnerar sant om två glyph-id:n inte är lika. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | Returnerar hashkod för objektet. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | Returnerar sant om två glyph-id:n är lika. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | Returnerar sant om två glyph-id:n inte är lika. |
| [toGlyphStringId()](#toGlyphStringId--) | Virtuell kastning till GlyphStringId. |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | Virtuell kastning till GlyphUInt32Id. |
| [toString()](#toString--) | Returnerar strängrepresentation av glyph‑id‑t. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Returnerar sant om två glyph-id:n inte är lika.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj | java.lang.Object | Glyph‑identifierare att jämföra med. |

**Returns:**
boolean - Jämförelseresultat.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


Returnerar hashkod för objektet.

**Returns:**
int - Hashkod för objektet.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(GlyphId obj1, Object obj2) {#op-Equality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Equality(GlyphId obj1, Object obj2)
```


Returnerar sant om två glyph-id:n är lika.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Första glyph-identifierare att jämföra. |
| obj2 | java.lang.Object | Andra glyph-identifierare att jämföra. |

**Returns:**
boolean - Jämförelseresultat.
### op_Inequality(GlyphId obj1, Object obj2) {#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Inequality(GlyphId obj1, Object obj2)
```


Returnerar sant om två glyph-id:n inte är lika.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Första glyph-identifierare att jämföra. |
| obj2 | java.lang.Object | Andra glyph-identifierare att jämföra. |

**Returns:**
boolean - Jämförelseresultat.
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


Virtuell cast till GlyphStringId. GlyphStringId återdefinierar för att returnera en instans.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


Virtuell kastning till GlyphUInt32Id. GlyphUInt32Id åsidosätter för att returnera en instans.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public abstract String toString()
```


Returnerar strängrepresentation av glyph‑id‑t.

**Returns:**
java.lang.String – glyfidentifierare
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

