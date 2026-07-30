---
title: "CompositeGlyph"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示字体复合字形。"
type: docs
weight: 25
url: /zh/java/com.aspose.font/compositeglyph/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Glyph](../../com.aspose.font/glyph)
```
public class CompositeGlyph extends Glyph
```

表示字体复合字形。
## 方法

| 方法 | 描述 |
| --- | --- |
| [clone()](#clone--) | 返回字形的副本。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getComponents()](#getComponents--) | 获取组件列表。 |
| [getGlyphBBox()](#getGlyphBBox--) | 获取字形的 BBox。 |
| [getLeftSidebearingX()](#getLeftSidebearingX--) | 获取字形侧边距 x 坐标。 |
| [getLeftSidebearingY()](#getLeftSidebearingY--) | 获取字形侧边距 y 坐标。 |
| [getPath()](#getPath--) | 获取字形路径。 |
| [getSourceResolution()](#getSourceResolution--) | 获取源命令集的分辨率。 |
| [getState()](#getState--) | 获取字形状态。 |
| [getWidthVectorX()](#getWidthVectorX--) | 获取字形宽度向量。 |
| [getWidthVectorY()](#getWidthVectorY--) | 获取字形宽度向量。 |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) | 如果字形不包含绘图指令，则为 true。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Object clone()
```


返回字形的副本。

**Returns:**
java.lang.Object - 字形的副本
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
### getComponents() {#getComponents--}
```
public CompositeGlyphComponentList getComponents()
```


获取组件列表。

**Returns:**
[CompositeGlyphComponentList](../../com.aspose.font/compositeglyphcomponentlist) - Components list.
### getGlyphBBox() {#getGlyphBBox--}
```
public FontBBox getGlyphBBox()
```


获取字形的 BBox。

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox
### getLeftSidebearingX() {#getLeftSidebearingX--}
```
public double getLeftSidebearingX()
```


获取字形侧边距 x 坐标。

**Returns:**
double - 字形侧边距 x 坐标。
### getLeftSidebearingY() {#getLeftSidebearingY--}
```
public double getLeftSidebearingY()
```


获取字形侧边距 y 坐标。

**Returns:**
double - 字形侧边距 y 坐标。
### getPath() {#getPath--}
```
public SegmentPath getPath()
```


获取字形路径。

**Returns:**
[SegmentPath](../../com.aspose.font/segmentpath) - Glyph path.
### getSourceResolution() {#getSourceResolution--}
```
public int getSourceResolution()
```


获取源命令集的分辨率。

**Returns:**
int - 源命令集的分辨率。
### getState() {#getState--}
```
public GlyphState getState()
```


获取字形状态。

**Returns:**
[GlyphState](../../com.aspose.font/glyphstate) - Glyph state.
### getWidthVectorX() {#getWidthVectorX--}
```
public double getWidthVectorX()
```


获取字形宽度向量。坐标 x。

**Returns:**
double - 字形宽度向量。坐标 x。
### getWidthVectorY() {#getWidthVectorY--}
```
public double getWidthVectorY()
```


获取字形宽度向量。坐标 y。

**Returns:**
double - 字形宽度向量。坐标 y。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


如果字形不包含绘图指令，则为 true。

**Returns:**
boolean - 如果字形不包含绘图指令，则为 true。
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

