---
title: "XpsLinearGradientBrush"
second_title: "Aspose.Page for Java API 参考"
description: "封装 LinearGradientBrush 属性元素特性的类。"
type: docs
weight: 34
url: /zh/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

封装 LinearGradientBrush 属性元素特性的类。此元素用于沿向量指定线性渐变画刷。
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆此线性渐变画刷。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | 返回指定颜色插值的伽马函数的值。 |
| [getEndPoint()](#getEndPoint--) | 返回线性渐变的结束点。 |
| [getGradientStops()](#getGradientStops--) | 返回组成渐变的渐变停止点列表。 |
| [getOpacity()](#getOpacity--) | 返回定义画刷填充统一透明度的值。 |
| [getSpreadMethod()](#getSpreadMethod--) | 返回描述画刷应如何填充主初始渐变区域之外内容区域的值。 |
| [getStartPoint()](#getStartPoint--) | 返回线性渐变的起始点。 |
| [getTransform()](#getTransform--) | 返回应用于画刷坐标空间的矩阵变换。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | 设置指定颜色插值的伽马函数的值。 |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | 返回/设置线性渐变的结束点。 |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | 设置组成渐变的渐变停止点列表。 |
| [setOpacity(float value)](#setOpacity-float-) | 设置定义画刷填充统一透明度的值。 |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | 设置描述画刷应如何填充主初始渐变区域之外内容区域的值。 |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | 设置线性渐变的起始点。 |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | 设置应用于画刷坐标空间的矩阵变换。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


克隆此线性渐变画刷。

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


返回指定颜色插值的伽马函数的值。如果指定，伽马调整不应应用于 alpha 分量。

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


返回线性渐变的结束点。

**Returns:**
java.awt.geom.Point2D - 线性渐变的结束点。
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


返回组成渐变的渐变停止点列表。

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - 组成渐变的渐变停止点列表。
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


返回定义画刷填充统一透明度的值。

**Returns:**
float - 定义画刷填充统一透明度的值。
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


返回描述画刷应如何填充主初始渐变区域之外内容区域的值。

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


返回线性渐变的起始点。

**Returns:**
java.awt.geom.Point2D - 线性渐变的起始点。
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


返回应用于画刷坐标空间的矩阵变换。Transform 属性与当前有效渲染变换连接，以产生相对于画刷的有效渲染变换。画刷的视口使用该局部有效渲染变换进行变换。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


设置指定颜色插值的伽马函数的值。如果指定，伽马调整不应应用于 alpha 分量。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | 指定颜色插值的伽马函数的值。 |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


返回/设置线性渐变的结束点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Point2D | 线性渐变的结束点。 |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


设置组成渐变的渐变停止点列表。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.util.List<com.aspose.xps.XpsGradientStop> | 组成渐变的渐变停止点列表。 |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


设置定义画刷填充统一透明度的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 定义画刷填充统一透明度的值。 |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


设置描述画刷应如何填充主初始渐变区域之外内容区域的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | 描述画笔应如何填充主初始渐变区域之外的内容区域的值。 |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


设置线性渐变的起始点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Point2D | 线性渐变的起始点。 |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


设置应用于画刷坐标空间的矩阵变换。Transform 属性与当前有效渲染变换连接，以产生相对于画刷的有效渲染变换。画刷的视口使用该局部有效渲染变换进行变换。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 应用于画刷坐标空间的矩阵变换。 |

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

