---
title: "GlyphRendererBase"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示字形渲染器的基类。"
type: docs
weight: 53
url: /zh/java/com.aspose.font/glyphrendererbase/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IGlyphRenderer](../../com.aspose.font/iglyphrenderer)
```
public abstract class GlyphRendererBase implements IGlyphRenderer
```

表示字形渲染器的基类。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [renderGlyph(IFont font, GlyphId glyphId)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-) | 渲染字形。 |
| [renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | 渲染字形，此重载版本的目标是用于字形缓存。 |
| [renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-) | 渲染字形。 |
| [renderGlyph(IFont font, long glyphIndex)](#renderGlyph-com.aspose.font.IFont-long-) | 渲染字形 |
| [renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-) | 渲染字形。 |
| [renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | 使用独立的字形路径渲染字形。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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




### renderGlyph(IFont font, GlyphId glyphId) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-}
```
public void renderGlyph(IFont font, GlyphId glyphId)
```


渲染字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | 包含该字形的字体。 |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | 字体内部的物理字形索引。请注意，这不是 Unicode。 |

### renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


渲染字形，此重载版本的目标是用于字形缓存。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | 包含该字形的字体。 |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | 字体内部的物理字形索引。请注意，这不是 Unicode。 |
| glyph | [Glyph](../../com.aspose.font/glyph) | 要渲染的字形。 |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | 应用于字形坐标的矩阵。 |

### renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)
```


渲染字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | 包含该字形的字体。 |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | 字体内部的物理字形索引。请注意，这不是 Unicode。 |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | 应用于字形坐标的矩阵。 |

### renderGlyph(IFont font, long glyphIndex) {#renderGlyph-com.aspose.font.IFont-long-}
```
public void renderGlyph(IFont font, long glyphIndex)
```


渲染字形

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | 包含该字形的字体。 |
| glyphIndex | long | 字体内部的物理字形索引。请注意，这不是 Unicode。 |

### renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)
```


渲染字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | 包含该字形的字体。 |
| glyphIndex | long | 字体内部的物理字形索引。请注意，这不是 Unicode。 |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | 应用于字形坐标的矩阵。 |

### renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


使用独立的字形路径渲染字形。RenderGlyph() 函数族在渲染时会更改字形路径。这导致需要再次重新加载该字形。此函数使用字形路径的副本且不更改原始字形路径，因此同一字形可以多次重复使用。此函数版本旨在与字形缓存一起使用。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | 包含该字形的字体。 |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | 字体内部的物理字形索引。请注意，这不是 Unicode。 |
| glyph | [Glyph](../../com.aspose.font/glyph) | 要渲染的字形。 |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | 应用于字形坐标的矩阵。 |

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

