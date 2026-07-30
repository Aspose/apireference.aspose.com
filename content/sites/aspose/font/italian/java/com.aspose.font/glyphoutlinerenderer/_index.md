---
title: "GlyphOutlineRenderer"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta il renderer del contorno del glifo."
type: docs
weight: 52
url: /it/java/com.aspose.font/glyphoutlinerenderer/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.GlyphRendererBase](../../com.aspose.font/glyphrendererbase)
```
public class GlyphOutlineRenderer extends GlyphRendererBase
```

Rappresenta il renderer del contorno del glifo.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [GlyphOutlineRenderer(IGlyphOutlinePainter painter)](#GlyphOutlineRenderer-com.aspose.font.IGlyphOutlinePainter-) | Inizializza un nuovo oggetto GlyphOutlineRenderer. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [renderGlyph(IFont font, GlyphId glyphId)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-) | Renderizza il glifo. |
| [renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Renderizza il glifo, un obiettivo di questa versione sovraccaricata - da utilizzare con la cache per i glifi. |
| [renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-) | Renderizza il glifo. |
| [renderGlyph(IFont font, long glyphIndex)](#renderGlyph-com.aspose.font.IFont-long-) | Renderizza il glifo |
| [renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-) | Renderizza il glifo. |
| [renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Renderizza il glifo usando un percorso di glifo indipendente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### GlyphOutlineRenderer(IGlyphOutlinePainter painter) {#GlyphOutlineRenderer-com.aspose.font.IGlyphOutlinePainter-}
```
public GlyphOutlineRenderer(IGlyphOutlinePainter painter)
```


Inizializza un nuovo oggetto GlyphOutlineRenderer.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| painter | [IGlyphOutlinePainter](../../com.aspose.font/iglyphoutlinepainter) | Pittore di glifi. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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


Renderizza il glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Il Font che contiene il glifo. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Indice fisico del glifo all'interno del Font. Nota che questo non è un unicode. |

### renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Renderizza il glifo, un obiettivo di questa versione sovraccaricata - da utilizzare con la cache per i glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Il Font che contiene il glifo. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Indice fisico del glifo all'interno del Font. Nota che questo non è un unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Glifo da renderizzare. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrice applicata alle coordinate del glifo. |

### renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)
```


Renderizza il glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Il Font che contiene il glifo. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Indice fisico del glifo all'interno del Font. Nota che questo non è un unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrice applicata alle coordinate del glifo. |

### renderGlyph(IFont font, long glyphIndex) {#renderGlyph-com.aspose.font.IFont-long-}
```
public void renderGlyph(IFont font, long glyphIndex)
```


Renderizza il glifo

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Il Font che contiene il glifo. |
| glyphIndex | long | Indice fisico del glifo all'interno del Font. Nota che questo non è un unicode. |

### renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)
```


Renderizza il glifo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Il Font che contiene il glifo. |
| glyphIndex | long | Indice fisico del glifo all'interno del Font. Nota che questo non è un unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrice applicata alle coordinate del glifo. |

### renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Renderizza il glifo usando un percorso di glifo indipendente. La famiglia di funzioni RenderGlyph() modifica il percorso del glifo durante il rendering. Ciò porta alla necessità di ricaricare nuovamente questo glifo. Questa funzione utilizza una copia del percorso del glifo e non modifica il percorso originale, quindi lo stesso glifo può essere riutilizzato più volte. Questa versione della funzione è destinata all'uso con la cache dei glifi.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Il Font che contiene il glifo. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Indice fisico del glifo all'interno del Font. Nota che questo non è un unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Glifo da renderizzare. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrice applicata alle coordinate del glifo. |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

