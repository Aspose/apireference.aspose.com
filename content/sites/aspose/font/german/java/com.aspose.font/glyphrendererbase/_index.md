---
title: "GlyphRendererBase"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Basisklasse für Glyph-Renderer dar."
type: docs
weight: 53
url: /de/java/com.aspose.font/glyphrendererbase/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IGlyphRenderer](../../com.aspose.font/iglyphrenderer)
```
public abstract class GlyphRendererBase implements IGlyphRenderer
```

Stellt die Basisklasse für Glyph-Renderer dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [renderGlyph(IFont font, GlyphId glyphId)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-) | Rendert das Glyph. |
| [renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Rendert das Glyph, ein Ziel dieser überladenen Version – zur Verwendung mit einem Cache für Glyphs. |
| [renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-) | Rendert das Glyph. |
| [renderGlyph(IFont font, long glyphIndex)](#renderGlyph-com.aspose.font.IFont-long-) | Rendert das Glyph |
| [renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-) | Rendert das Glyph. |
| [renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Rendert das Glyph mit einem unabhängigen Glyph-Pfad. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Rendert das Glyph.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Die Schrift, die das Glyph enthält. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Physikalischer Glyph-Index innerhalb der Schrift. Hinweis: Dies ist kein Unicode. |

### renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Rendert das Glyph, ein Ziel dieser überladenen Version – zur Verwendung mit einem Cache für Glyphs.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Die Schrift, die das Glyph enthält. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Physikalischer Glyph-Index innerhalb der Schrift. Hinweis: Dies ist kein Unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Glyph zum Rendern. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrix, die auf Glyph-Koordinaten angewendet wird. |

### renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)
```


Rendert das Glyph.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Die Schrift, die das Glyph enthält. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Physikalischer Glyph-Index innerhalb der Schrift. Hinweis: Dies ist kein Unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrix, die auf Glyph-Koordinaten angewendet wird. |

### renderGlyph(IFont font, long glyphIndex) {#renderGlyph-com.aspose.font.IFont-long-}
```
public void renderGlyph(IFont font, long glyphIndex)
```


Rendert das Glyph

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Die Schrift, die das Glyph enthält. |
| glyphIndex | long | Physikalischer Glyph-Index innerhalb der Schrift. Hinweis: Dies ist kein Unicode. |

### renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)
```


Rendert das Glyph.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Die Schrift, die das Glyph enthält. |
| glyphIndex | long | Physikalischer Glyph-Index innerhalb der Schrift. Hinweis: Dies ist kein Unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrix, die auf Glyph-Koordinaten angewendet wird. |

### renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Rendert das Glyph mit einem unabhängigen Glyph-Pfad. Die RenderGlyph()-Funktionsfamilie ändert den Glyph-Pfad beim Rendern. Das führt dazu, dass das Glyph erneut geladen werden muss. Diese Funktion verwendet eine Kopie des Glyph-Pfads und ändert den ursprünglichen Glyph-Pfad nicht, sodass dasselbe Glyph mehrfach verwendet werden kann. Diese Version der Funktion ist für die Verwendung mit einem Glyph-Cache vorgesehen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Die Schrift, die das Glyph enthält. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Physikalischer Glyph-Index innerhalb der Schrift. Hinweis: Dies ist kein Unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Glyph zum Rendern. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrix, die auf Glyph-Koordinaten angewendet wird. |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

