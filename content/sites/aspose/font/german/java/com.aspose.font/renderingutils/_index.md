---
title: "RenderingUtils"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt Dienstprogrammmethoden für das Rendering bereit."
type: docs
weight: 72
url: /de/java/com.aspose.font/renderingutils/
---
**Inheritance:**
java.lang.Object
```
public class RenderingUtils
```

Stellt Dienstprogrammmethoden für das Rendering bereit.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-) | Text in BitMap rendern. |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Text in BitMap rendern. |
| [drawText(Font font, String text, double fontSize)](#drawText-com.aspose.font.Font-java.lang.String-double-) | Text in BitMap rendern. |
| [drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Text in BitMap rendern. |
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


Text in BitMap rendern. Ergebnis im PNG-Format als Byte-Stream zurückgeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Schriftart |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Text dargestellt als Array von Glyph-Bezeichnern |
| fontSize | double | Schriftgröße |

**Returns:**
java.io.InputStream - Bild im PNG-Format als Byte-Stream
### drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Text in BitMap rendern. Ergebnis im PNG-Format als Byte-Stream zurückgeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Schriftart |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Text dargestellt als Array von Glyph-Bezeichnern |
| fontSize | double | Schriftgröße |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Art des Zeilenabstands. Anzahl von Pixeln oder Prozentsatz der Schriftgröße |
| lineSpacingValue | int | Wert des Zeilenabstands |
| maxWidth | int | Maximale Breite in Pixeln für das Bild |

**Returns:**
java.io.InputStream - Bild im PNG-Format als Byte-Stream
### drawText(Font font, String text, double fontSize) {#drawText-com.aspose.font.Font-java.lang.String-double-}
```
public static InputStream drawText(Font font, String text, double fontSize)
```


Text in BitMap rendern.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Die Schriftart. |
| text | java.lang.String | Der Text. |
| fontSize | double | Die Schriftgröße. |

**Returns:**
java.io.InputStream - Das PNG-Bild mit dem Text als Bytestrom.
### drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Text in BitMap rendern.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Die Schriftart. |
| text | java.lang.String | Der Text. |
| fontSize | double | Die Schriftgröße. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Der Typ des Zeilenabstands. Anzahl der Pixel oder Prozentsatz der Schrifthöhe. |
| lineSpacingValue | int | Der Wert des Zeilenabstands. |
| maxWidth | int | Die maximale Breite in Pixeln für das resultierende Bild. |

**Returns:**
java.io.InputStream - Das PNG-Bild mit dem Text als Bytestrom.
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

