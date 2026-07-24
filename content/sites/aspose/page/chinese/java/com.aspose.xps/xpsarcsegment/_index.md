---
title: "XpsArcSegment"
second_title: "Aspose.Page for Java API 参考"
description: "封装 ArcSegment 元素特性的类。"
type: docs
weight: 13
url: /zh/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

封装 ArcSegment 元素特性的类。此元素描述椭圆弧。
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆此弧段。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | 返回椭圆弧的终点。 |
| [getRotationAngle()](#getRotationAngle--) | 返回指示椭圆相对于当前坐标系旋转方式的值。 |
| [getSize()](#getSize--) | 以 x,y 对的形式返回椭圆弧的 x 和 y 半径。 |
| [getSweepDirection()](#getSweepDirection--) | 返回指定弧线绘制方向的值。 |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | 返回确定弧线是否以 180 度或更大幅度绘制的值。 |
| [isStroked()](#isStroked--) | 返回指定是否绘制此路径段描边的值。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | 设置确定弧线是否以 180 度或更大幅度绘制的值。 |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | 设置椭圆弧的终点。 |
| [setRotationAngle(float value)](#setRotationAngle-float-) | 设置指示椭圆相对于当前坐标系旋转方式的值。 |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | 设置椭圆弧的 x 和 y 半径，以 x,y 对的形式。 |
| [setStroked(boolean value)](#setStroked-boolean-) | 设置指定是否绘制此路径段描边的值。 |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | 设置指定绘制弧线方向的值。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


克隆此弧段。

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


返回椭圆弧的终点。

**Returns:**
java.awt.geom.Point2D - 椭圆弧的终点。
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


返回指示椭圆相对于当前坐标系旋转方式的值。

**Returns:**
float - 指示椭圆相对于当前坐标系旋转方式的值。
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


以 x,y 对的形式返回椭圆弧的 x 和 y 半径。

**Returns:**
java.awt.geom.Dimension2D - 以 x,y 对形式表示的椭圆弧的 x 和 y 半径。
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


返回指定弧线绘制方向的值。

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


返回确定弧线是否以 180 度或更大幅度绘制的值。

**Returns:**
boolean - 确定弧线是否以 180 度或更大幅度绘制的值。
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


返回指定是否绘制此路径段描边的值。

**Returns:**
boolean - 指定是否绘制此路径段描边的值。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


设置确定弧线是否以 180 度或更大幅度绘制的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | boolean | 确定弧线是否以 180 度或更大幅度绘制的值。 |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


设置椭圆弧的终点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Point2D | 椭圆弧的终点。 |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


设置指示椭圆相对于当前坐标系旋转方式的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 指示椭圆相对于当前坐标系旋转方式的值。 |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


设置椭圆弧的 x 和 y 半径，以 x,y 对的形式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Dimension2D | 椭圆弧的 x 和 y 半径，以 x,y 对的形式。 |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


设置指定是否绘制此路径段描边的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | boolean | 指定是否绘制此路径段描边的值。 |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


设置指定绘制弧线方向的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 指定绘制弧线方向的值。 |

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

