---
title: "XpsVisualBrush"
second_title: "Aspose.Page for Java API 参考"
description: "封装 VisualBrush 属性元素特性的类。"
type: docs
weight: 54
url: /zh/java/com.aspose.xps/xpsvisualbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsVisualBrush extends XpsTilingBrush
```

封装 VisualBrush 属性元素特性的类。此元素用于使用绘图填充区域。
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆此视觉画刷。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | 返回定义画刷填充统一透明度的值。 |
| [getTileMode()](#getTileMode--) | 返回指定在填充几何体中如何执行平铺的值。 |
| [getTransform()](#getTransform--) | 返回应用于画刷坐标空间的矩阵变换。 |
| [getViewbox()](#getViewbox--) | 返回要映射到视口的画刷源内容区域。 |
| [getViewport()](#getViewport--) | 返回第一个画刷平铺的位置信息和尺寸。 |
| [getVisual()](#getVisual--) | 返回用于绘制 brush\\u2019s 源内容的 Path、Glyphs 或 Canvas 元素。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | 设置定义画刷填充统一透明度的值。 |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | 设置指定在填充几何体中如何执行平铺的值。 |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | 设置应用于画刷坐标空间的矩阵变换。 |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | 设置要映射到视口的画刷源内容区域。 |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | 设置第一个画刷平铺的位置信息和尺寸。 |
| [setVisual(XpsContentElement visual)](#setVisual-com.aspose.xps.XpsContentElement-) | 将 visual 设置为视觉画刷的 Visual 元素。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsVisualBrush deepClone()
```


克隆此视觉画刷。

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - Clone of this visual brush.
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
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


返回定义画刷填充统一透明度的值。

**Returns:**
float - 定义画刷填充统一透明度的值。
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


返回指定在填充几何体中如何执行平铺的值。

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


返回应用于画刷坐标空间的矩阵变换。Transform 属性与当前有效渲染变换连接，以产生相对于画刷的有效渲染变换。画刷的视口使用该局部有效渲染变换进行变换。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


返回要映射到视口的画刷源内容区域。

**Returns:**
java.awt.geom.Rectangle2D - 要映射到视口的画刷源内容区域。
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


返回第一个画刷平铺的位置信息和尺寸。后续平铺相对于此平铺定位，依据平铺模式指定。

**Returns:**
java.awt.geom.Rectangle2D - 第一个画刷平铺的位置信息和尺寸。
### getVisual() {#getVisual--}
```
public XpsContentElement getVisual()
```


返回用于绘制 brush\\u2019s 源内容的 Path、Glyphs 或 Canvas 元素。

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - A Path, Glyphs, or Canvas element used to draw the brush\\u2019s source content.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


设置定义画刷填充统一透明度的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 定义画刷填充统一透明度的值。 |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


设置指定在填充几何体中如何执行平铺的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | 指定在填充几何体中如何执行平铺的值。 |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


设置应用于画刷坐标空间的矩阵变换。Transform 属性与当前有效渲染变换连接，以产生相对于画刷的有效渲染变换。画刷的视口使用该局部有效渲染变换进行变换。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 应用于画刷坐标空间的矩阵变换。 |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


设置要映射到视口的画刷源内容区域。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Rectangle2D | 要映射到视口的画刷源内容区域。 |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


设置第一个画刷平铺的位置信息和尺寸。后续平铺相对于此平铺定位，依据平铺模式指定。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Rectangle2D | 第一个画笔瓦片的位置和尺寸。 |

### setVisual(XpsContentElement visual) {#setVisual-com.aspose.xps.XpsContentElement-}
```
public void setVisual(XpsContentElement visual)
```


将 visual 设置为视觉画刷的 Visual 元素。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| visual | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | 该元素。 |

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

