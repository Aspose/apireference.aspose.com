---
title: "XpsRadialGradientBrush"
second_title: "Aspose.Page for Java API 参考"
description: "封装 RadialGradientBrush 属性元素特性的类。"
type: docs
weight: 48
url: /zh/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

封装 RadialGradientBrush 属性元素特性的类。此元素用于指定径向渐变画刷。
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆此径向渐变画刷。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | 返回径向渐变的中心点（即椭圆的中心）。 |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | 返回指定颜色插值的伽马函数的值。 |
| [getGradientOrigin()](#getGradientOrigin--) | 返回径向渐变的原点。 |
| [getGradientStops()](#getGradientStops--) | 返回组成渐变的渐变停止点列表。 |
| [getOpacity()](#getOpacity--) | 返回定义画刷填充统一透明度的值。 |
| [getRadiusX()](#getRadiusX--) | 返回定义径向渐变的椭圆在 x 方向的半径。 |
| [getRadiusY()](#getRadiusY--) | 返回定义径向渐变的椭圆在 y 方向的半径。 |
| [getSpreadMethod()](#getSpreadMethod--) | 返回描述画刷应如何填充主初始渐变区域之外内容区域的值。 |
| [getTransform()](#getTransform--) | 返回应用于画刷坐标空间的矩阵变换。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | 设置径向渐变的中心点（即椭圆的中心）。 |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | 设置指定颜色插值的伽马函数的值。 |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | 设置径向渐变的原点。 |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | 设置组成渐变的渐变停止点列表。 |
| [setOpacity(float value)](#setOpacity-float-) | 设置定义画刷填充统一透明度的值。 |
| [setRadiusX(float value)](#setRadiusX-float-) | 设置定义径向渐变的椭圆在 x 方向的半径。 |
| [setRadiusY(float value)](#setRadiusY-float-) | 设置定义径向渐变的椭圆在 y 方向的半径。 |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | 设置描述画刷应如何填充主初始渐变区域之外内容区域的值。 |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | 设置应用于画刷坐标空间的矩阵变换。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


克隆此径向渐变画刷。

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


返回径向渐变的中心点（即椭圆的中心）。

**Returns:**
java.awt.geom.Point2D - 径向渐变的中心点。
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
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


返回径向渐变的原点。

**Returns:**
java.awt.geom.Point2D - 径向渐变的原点。
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
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


返回定义径向渐变的椭圆在 x 方向的半径。

**Returns:**
float - 定义径向渐变的椭圆在 x 方向的半径。
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


返回定义径向渐变的椭圆在 y 方向的半径。

**Returns:**
float - 定义径向渐变的椭圆在 y 方向的半径。
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


返回描述画刷应如何填充主初始渐变区域之外内容区域的值。

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


设置径向渐变的中心点（即椭圆的中心）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Point2D | 径向渐变的中心点。 |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


设置指定颜色插值的伽马函数的值。如果指定，伽马调整不应应用于 alpha 分量。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | 指定颜色插值的伽马函数的值。 |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


设置径向渐变的原点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Point2D | 径向渐变的起始点。 |

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

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


设置定义径向渐变的椭圆在 x 方向的半径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 定义径向渐变的椭圆在 x 维度上的半径。 |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


设置定义径向渐变的椭圆在 y 方向的半径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 定义径向渐变的椭圆在 y 维度上的半径。 |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


设置描述画刷应如何填充主初始渐变区域之外内容区域的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | 描述画笔应如何填充主初始渐变区域之外的内容区域的值。 |

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

