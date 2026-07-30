---
title: "RenderingUtils"
second_title: "Aspose.Font för Java API-referens"
description: "Tillhandahåller hjälpfunktioner för rendering."
type: docs
weight: 72
url: /sv/java/com.aspose.font/renderingutils/
---
**Inheritance:**
java.lang.Object
```
public class RenderingUtils
```

Tillhandahåller hjälpfunktioner för rendering.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-) | Renderar text i BitMap. |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Renderar text i BitMap. |
| [drawText(Font font, String text, double fontSize)](#drawText-com.aspose.font.Font-java.lang.String-double-) | Renderar text i BitMap. |
| [drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Renderar text i BitMap. |
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


Renderar text i BitMap. Returnerar resultatet i PNG-format som en byte‑ström.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Font |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Text representerad som en array av glyfid‑identifierare. |
| fontSize | double | Fontstorlek |

**Returns:**
java.io.InputStream – bild i PNG-format som en byte‑ström.
### drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Renderar text i BitMap. Returnerar resultatet i PNG-format som en byte‑ström.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Font |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Text representerad som en array av glyfid‑identifierare. |
| fontSize | double | Fontstorlek |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Typ av radavstånd. Antal pixlar eller procent av fontens höjd. |
| lineSpacingValue | int | Värde för radavstånd. |
| maxWidth | int | Maximal bredd i pixlar för bilden |

**Returns:**
java.io.InputStream – bild i PNG-format som en byte‑ström.
### drawText(Font font, String text, double fontSize) {#drawText-com.aspose.font.Font-java.lang.String-double-}
```
public static InputStream drawText(Font font, String text, double fontSize)
```


Renderar text i BitMap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Typsnittet. |
| text | java.lang.String | Texten. |
| fontSize | double | Typsnittsstorleken. |

**Returns:**
java.io.InputStream - PNG‑bilden med texten som en byte‑ström.
### drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Renderar text i BitMap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Typsnittet. |
| text | java.lang.String | Texten. |
| fontSize | double | Typsnittsstorleken. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Typen av radavstånd. Antal pixlar eller procent av typsnittshöjden. |
| lineSpacingValue | int | Värdet för radavstånd. |
| maxWidth | int | Den maximala bredden i pixlar för den resulterande bilden. |

**Returns:**
java.io.InputStream - PNG‑bilden med texten som en byte‑ström.
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

