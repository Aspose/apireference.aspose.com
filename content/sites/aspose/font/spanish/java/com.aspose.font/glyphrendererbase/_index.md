---
title: "GlyphRendererBase"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la clase base para renderizadores de glifos."
type: docs
weight: 53
url: /es/java/com.aspose.font/glyphrendererbase/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IGlyphRenderer](../../com.aspose.font/iglyphrenderer)
```
public abstract class GlyphRendererBase implements IGlyphRenderer
```

Representa la clase base para renderizadores de glifos.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [renderGlyph(IFont font, GlyphId glyphId)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-) | Renderiza el glifo. |
| [renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Renderiza el glifo, un objetivo de esta versión sobrecargada - para ser usado con caché de glifos. |
| [renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-) | Renderiza el glifo. |
| [renderGlyph(IFont font, long glyphIndex)](#renderGlyph-com.aspose.font.IFont-long-) | Renderiza el glifo |
| [renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-) | Renderiza el glifo. |
| [renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Renderiza el glifo usando una ruta de glifo independiente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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


Renderiza el glifo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | La fuente que contiene el glifo. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Índice físico del glifo dentro de la fuente. Nota que esto no es un unicode. |

### renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Renderiza el glifo, un objetivo de esta versión sobrecargada - para ser usado con caché de glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | La fuente que contiene el glifo. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Índice físico del glifo dentro de la fuente. Nota que esto no es un unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Glifo a renderizar. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matriz que se aplica a las coordenadas del glifo. |

### renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)
```


Renderiza el glifo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | La fuente que contiene el glifo. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Índice físico del glifo dentro de la fuente. Nota que esto no es un unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matriz que se aplica a las coordenadas del glifo. |

### renderGlyph(IFont font, long glyphIndex) {#renderGlyph-com.aspose.font.IFont-long-}
```
public void renderGlyph(IFont font, long glyphIndex)
```


Renderiza el glifo

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | La fuente que contiene el glifo. |
| glyphIndex | long | Índice físico del glifo dentro de la fuente. Nota que esto no es un unicode. |

### renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)
```


Renderiza el glifo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | La fuente que contiene el glifo. |
| glyphIndex | long | Índice físico del glifo dentro de la fuente. Nota que esto no es un unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matriz que se aplica a las coordenadas del glifo. |

### renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Renderiza el glifo usando una ruta de glifo independiente. La familia de funciones RenderGlyph() cambia la ruta del glifo al renderizar. Esto lleva a la necesidad de recargar este glifo nuevamente. Esta función usa una copia de la ruta del glifo y no cambia la ruta original del glifo, por lo que el mismo glifo puede reutilizarse varias veces. Esta versión de la función está destinada a usarse con una caché de glifos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | La fuente que contiene el glifo. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Índice físico del glifo dentro de la fuente. Nota que esto no es un unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Glifo a renderizar. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matriz que se aplica a las coordenadas del glifo. |

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

