---
title: "RenderingUtils"
second_title: "Riferimento API Aspose.Font per Java"
description: "Fornisce metodi di utilità per il rendering."
type: docs
weight: 72
url: /it/java/com.aspose.font/renderingutils/
---
**Inheritance:**
java.lang.Object
```
public class RenderingUtils
```

Fornisce metodi di utilità per il rendering.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-) | Rendering del testo in BitMap. |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Rendering del testo in BitMap. |
| [drawText(Font font, String text, double fontSize)](#drawText-com.aspose.font.Font-java.lang.String-double-) | Rendering del testo in BitMap. |
| [drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Rendering del testo in BitMap. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### drawText(Font font, GlyphId[] glyphIds, double fontSize) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize)
```


Rendering del testo in BitMap. Restituisce il risultato in formato PNG come flusso di byte.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Font |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Testo rappresentato come array di identificatori di glifo |
| fontSize | double | Dimensione del font |

**Returns:**
java.io.InputStream - Immagine in formato PNG come flusso di byte
### drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Rendering del testo in BitMap. Restituisce il risultato in formato PNG come flusso di byte.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Font |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Testo rappresentato come array di identificatori di glifo |
| fontSize | double | Dimensione del font |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Tipo di interlinea. Numero di pixel o percentuale dell'altezza del font |
| lineSpacingValue | int | Valore dell'interlinea |
| maxWidth | int | Larghezza massima in pixel per l'immagine |

**Returns:**
java.io.InputStream - Immagine in formato PNG come flusso di byte
### drawText(Font font, String text, double fontSize) {#drawText-com.aspose.font.Font-java.lang.String-double-}
```
public static InputStream drawText(Font font, String text, double fontSize)
```


Rendering del testo in BitMap.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Il carattere. |
| text | java.lang.String | Il testo. |
| fontSize | double | La dimensione del carattere. |

**Returns:**
java.io.InputStream - L'immagine PNG con il testo come flusso di byte.
### drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Rendering del testo in BitMap.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Il carattere. |
| text | java.lang.String | Il testo. |
| fontSize | double | La dimensione del carattere. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Il tipo di interlinea. Numero di pixel o percentuale dell'altezza del carattere. |
| lineSpacingValue | int | Il valore dell'interlinea. |
| maxWidth | int | La larghezza massima in pixel per l'immagine risultante. |

**Returns:**
java.io.InputStream - L'immagine PNG con il testo come flusso di byte.
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

