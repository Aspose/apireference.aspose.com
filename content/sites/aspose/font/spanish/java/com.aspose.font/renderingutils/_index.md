---
title: "RenderingUtils"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Proporciona métodos utilitarios para el renderizado."
type: docs
weight: 72
url: /es/java/com.aspose.font/renderingutils/
---
**Inheritance:**
java.lang.Object
```
public class RenderingUtils
```

Proporciona métodos utilitarios para el renderizado.
## Métodos

| Método | Descripción |
| --- | --- |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-) | Renderizando texto en BitMap. |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Renderizando texto en BitMap. |
| [drawText(Font font, String text, double fontSize)](#drawText-com.aspose.font.Font-java.lang.String-double-) | Renderizando texto en BitMap. |
| [drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Renderizando texto en BitMap. |
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


Renderizando texto en BitMap. Devuelve el resultado en formato PNG como flujo de bytes.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Fuente |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Texto representado como una matriz de identificadores de glifos |
| fontSize | double | Tamaño de fuente |

**Returns:**
java.io.InputStream - Imagen en formato PNG como flujo de bytes
### drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Renderizando texto en BitMap. Devuelve el resultado en formato PNG como flujo de bytes.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Fuente |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Texto representado como una matriz de identificadores de glifos |
| fontSize | double | Tamaño de fuente |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Tipo de interlineado. Número de píxeles o porcentaje de la altura de la fuente |
| lineSpacingValue | int | Valor del interlineado |
| maxWidth | int | Ancho máximo en píxeles para la imagen |

**Returns:**
java.io.InputStream - Imagen en formato PNG como flujo de bytes
### drawText(Font font, String text, double fontSize) {#drawText-com.aspose.font.Font-java.lang.String-double-}
```
public static InputStream drawText(Font font, String text, double fontSize)
```


Renderizando texto en BitMap.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | La fuente. |
| text | java.lang.String | El texto. |
| fontSize | double | El tamaño de la fuente. |

**Returns:**
java.io.InputStream - La imagen PNG con el texto como una secuencia de bytes.
### drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Renderizando texto en BitMap.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | La fuente. |
| text | java.lang.String | El texto. |
| fontSize | double | El tamaño de la fuente. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | El tipo de interlineado. Número de píxeles o porcentaje de la altura de la fuente. |
| lineSpacingValue | int | El valor del interlineado. |
| maxWidth | int | El ancho máximo en píxeles para la imagen resultante. |

**Returns:**
java.io.InputStream - La imagen PNG con el texto como una secuencia de bytes.
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

