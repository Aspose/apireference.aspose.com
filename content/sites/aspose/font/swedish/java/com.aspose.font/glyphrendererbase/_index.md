---
title: "GlyphRendererBase"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar basklass för glyfrenderare."
type: docs
weight: 53
url: /sv/java/com.aspose.font/glyphrendererbase/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IGlyphRenderer](../../com.aspose.font/iglyphrenderer)
```
public abstract class GlyphRendererBase implements IGlyphRenderer
```

Representerar basklass för glyfrenderare.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [renderGlyph(IFont font, GlyphId glyphId)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-) | Renderar glyf. |
| [renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Renderar glyf, ett mål med den här överlagrade versionen - att användas med cache för glyfer. |
| [renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-) | Renderar glyf. |
| [renderGlyph(IFont font, long glyphIndex)](#renderGlyph-com.aspose.font.IFont-long-) | Renderar glyf |
| [renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-) | Renderar glyf. |
| [renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Renderar glyf med en oberoende glyfväg. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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




### renderGlyph(IFont font, GlyphId glyphId) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-}
```
public void renderGlyph(IFont font, GlyphId glyphId)
```


Renderar glyf.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Typsnittet som innehåller glyfen. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Fysiskt glyfindex i typsnittet. Observera att detta inte är en Unicode. |

### renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Renderar glyf, ett mål med den här överlagrade versionen - att användas med cache för glyfer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Typsnittet som innehåller glyfen. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Fysiskt glyfindex i typsnittet. Observera att detta inte är en Unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Glyf att rendera. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matris som tillämpas på glyfkoordinater. |

### renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)
```


Renderar glyf.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Typsnittet som innehåller glyfen. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Fysiskt glyfindex i typsnittet. Observera att detta inte är en Unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matris som tillämpas på glyfkoordinater. |

### renderGlyph(IFont font, long glyphIndex) {#renderGlyph-com.aspose.font.IFont-long-}
```
public void renderGlyph(IFont font, long glyphIndex)
```


Renderar glyf

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Typsnittet som innehåller glyfen. |
| glyphIndex | long | Fysiskt glyfindex i typsnittet. Observera att detta inte är en Unicode. |

### renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)
```


Renderar glyf.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Typsnittet som innehåller glyfen. |
| glyphIndex | long | Fysiskt glyfindex i typsnittet. Observera att detta inte är en Unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matris som tillämpas på glyfkoordinater. |

### renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Ritar tecknet med en oberoende teckenväg. RenderGlyph()-funktionfamiljen ändrar teckenvägen vid rendering. Detta leder till att tecknet måste laddas om igen. Funktionen använder en kopia av teckenvägen och ändrar inte den ursprungliga teckenvägen, så samma tecken kan återanvändas flera gånger. Denna version av funktionen är avsedd för användning med en cache av tecken.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Typsnittet som innehåller glyfen. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Fysiskt glyfindex i typsnittet. Observera att detta inte är en Unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Glyf att rendera. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matris som tillämpas på glyfkoordinater. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

