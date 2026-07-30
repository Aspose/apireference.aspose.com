---
title: "RenderingUtils"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يوفر طرقًا مساعدة للتصوير."
type: docs
weight: 72
url: /ar/java/com.aspose.font/renderingutils/
---
**Inheritance:**
java.lang.Object
```
public class RenderingUtils
```

يوفر طرقًا مساعدة للتصوير.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-) | عرض النص في BitMap. |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | عرض النص في BitMap. |
| [drawText(Font font, String text, double fontSize)](#drawText-com.aspose.font.Font-java.lang.String-double-) | عرض النص في BitMap. |
| [drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | عرض النص في BitMap. |
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


عرض النص في BitMap. إرجاع النتيجة بصيغة PNG كتيار من البايتات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | الخط |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | النص ممثل كمصفوفة من معرفات glyph. |
| fontSize | double | حجم الخط |

**Returns:**
java.io.InputStream - صورة بصيغة PNG كتيار من البايتات
### drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


عرض النص في BitMap. إرجاع النتيجة بصيغة PNG كتيار من البايتات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | الخط |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | النص ممثل كمصفوفة من معرفات glyph. |
| fontSize | double | حجم الخط |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | نوع تباعد السطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | int | قيمة تباعد السطر |
| maxWidth | int | العرض الأقصى بالبكسل للصورة |

**Returns:**
java.io.InputStream - صورة بصيغة PNG كتيار من البايتات
### drawText(Font font, String text, double fontSize) {#drawText-com.aspose.font.Font-java.lang.String-double-}
```
public static InputStream drawText(Font font, String text, double fontSize)
```


عرض النص في BitMap.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | الخط. |
| text | java.lang.String | النص. |
| fontSize | double | حجم الخط. |

**Returns:**
java.io.InputStream - صورة PNG مع النص كتيار من البايتات.
### drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


عرض النص في BitMap.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | الخط. |
| text | java.lang.String | النص. |
| fontSize | double | حجم الخط. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | نوع تباعد السطر. عدد البكسلات أو نسبة من ارتفاع الخط. |
| lineSpacingValue | int | قيمة تباعد السطر. |
| maxWidth | int | العرض الأقصى بالبكسل للصورة الناتجة. |

**Returns:**
java.io.InputStream - صورة PNG مع النص كتيار من البايتات.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

