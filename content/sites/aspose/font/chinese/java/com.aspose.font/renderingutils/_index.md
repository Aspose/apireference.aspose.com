---
title: "RenderingUtils"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "提供用于渲染的实用方法。"
type: docs
weight: 72
url: /zh/java/com.aspose.font/renderingutils/
---
**Inheritance:**
java.lang.Object
```
public class RenderingUtils
```

提供用于渲染的实用方法。
## 方法

| 方法 | 描述 |
| --- | --- |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-) | 在位图中渲染文本。 |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | 在位图中渲染文本。 |
| [drawText(Font font, String text, double fontSize)](#drawText-com.aspose.font.Font-java.lang.String-double-) | 在位图中渲染文本。 |
| [drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | 在位图中渲染文本。 |
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


在位图中渲染文本。返回 PNG 格式的字节流结果。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Font |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | 以字形标识符数组表示的文本 |
| fontSize | double | 字体大小 |

**Returns:**
java.io.InputStream - PNG 格式的图像字节流
### drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


在位图中渲染文本。返回 PNG 格式的字节流结果。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Font |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | 以字形标识符数组表示的文本 |
| fontSize | double | 字体大小 |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | int | 行间距的值 |
| maxWidth | int | 图像的最大宽度（像素） |

**Returns:**
java.io.InputStream - PNG 格式的图像字节流
### drawText(Font font, String text, double fontSize) {#drawText-com.aspose.font.Font-java.lang.String-double-}
```
public static InputStream drawText(Font font, String text, double fontSize)
```


在位图中渲染文本。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | 字体。 |
| text | java.lang.String | 文本。 |
| fontSize | double | 字体大小。 |

**Returns:**
java.io.InputStream - 包含文本的 PNG 图像，以字节流形式。
### drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


在位图中渲染文本。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | 字体。 |
| text | java.lang.String | 文本。 |
| fontSize | double | 字体大小。 |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | 行间距的类型。像素数或字体高度的百分比。 |
| lineSpacingValue | int | 行间距的值。 |
| maxWidth | int | 生成图像的最大宽度（像素）。 |

**Returns:**
java.io.InputStream - 包含文本的 PNG 图像，以字节流形式。
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

