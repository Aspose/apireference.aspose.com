---
title: "XpsMatrix"
second_title: "Aspose.Page for Java API 参考"
description: "封装 MatrixTransform 属性元素特性的类。"
type: docs
weight: 36
url: /zh/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

封装 MatrixTransform 属性元素特性的类。此元素定义了用于操作元素坐标系的任意仿射矩阵变换。
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆此变换矩阵。 |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 实际实现。 |
| [equals(Object obj)](#equals-java.lang.Object-) | 确定指定的 object 是否等于此实例。 |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | 获取 M11 元素。 |
| [getM12()](#getM12--) | 获取 M12 元素。 |
| [getM21()](#getM21--) | 获取 M21 元素。 |
| [getM22()](#getM22--) | 获取 M22 元素。 |
| [getM31()](#getM31--) | 获取 M31 元素。 |
| [getM32()](#getM32--) | 获取 M32 元素。 |
| [hashCode()](#hashCode--) | 返回此实例的哈希码。 |
| [isIdentity()](#isIdentity--) | 获取一个值，指示此实例是否为单位矩阵。 |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | 在默认（Prepend）顺序下，将此矩阵乘以由  matrix  指定的矩阵。 |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | 按照  matrixOrder  指定的顺序，将此矩阵乘以由  matrix  指定的矩阵。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 实现运算符 ==。 |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 实现运算符 !。 |
| [reset()](#reset--) | 将此 Matrix 重置为单位矩阵。 |
| [rotate(float angle)](#rotate-float-) | 在默认（Prepend）顺序下，对此 Matrix 应用角度为  angle  的顺时针旋转。 |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | 按照  matrixOrder  指定的顺序，对此 Matrix 应用角度为  angle  的顺时针旋转。 |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | 在默认（Prepend）顺序下，对此 Matrix 绕  pivot  进行角度为  angle  的顺时针旋转。 |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | 按照  matrixOrder  指定的顺序，对此 Matrix 绕  pivot  进行角度为  angle  的顺时针旋转。 |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | 在默认（Prepend）顺序下，将指定的缩放向量（scaleX 和 scaleY）应用于此 Matrix。 |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | 按照  matrixOrder  指定的顺序，将指定的缩放向量（scaleX 和 scaleY）应用于此 Matrix。 |
| [skew(double skewX, double skewY)](#skew-double-double-) | 对该 Matrix 应用指定的倾斜变换。 |
| [toString()](#toString--) | 返回此  XpsMatrix  实例的字符串表示。 |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | 将此 Matrix 表示的仿射变换应用于指定的矩形。 |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | 将此 Matrix 表示的仿射变换应用于指定的点。 |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | 将此 Matrix 表示的仿射变换应用于指定的点数组。 |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | 将此 Matrix 表示的仿射变换应用于点数组的指定部分。 |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | 将指定的平移向量应用于此 Matrix。 |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | 按照  matrixOrder  指定的顺序，将指定的平移向量应用于此 Matrix。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


克隆此变换矩阵。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


实际实现。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 第一个矩阵。 |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 第二个矩阵。 |

**Returns:**
boolean - [true] 如果矩阵相等
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


确定指定的 object 是否等于此实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 对象 | java.lang.Object | 用于与此实例比较的对象。 |

**Returns:**
boolean - true 如果指定的对象等于此实例，则为 true；否则为 false。obj 参数为 null。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


获取 M11 元素。

**Returns:**
float - M11 元素。
### getM12() {#getM12--}
```
public float getM12()
```


获取 M12 元素。

**Returns:**
float - M12 元素。
### getM21() {#getM21--}
```
public float getM21()
```


获取 M21 元素。

**Returns:**
float - M21 元素。
### getM22() {#getM22--}
```
public float getM22()
```


获取 M22 元素。

**Returns:**
float - M22 元素。
### getM31() {#getM31--}
```
public float getM31()
```


获取 M31 元素。

**Returns:**
float - M31 元素。
### getM32() {#getM32--}
```
public float getM32()
```


获取 M32 元素。

**Returns:**
float - M32 元素。
### hashCode() {#hashCode--}
```
public int hashCode()
```


返回此实例的哈希码。

**Returns:**
int - 此实例的哈希码，适用于哈希算法和哈希表等数据结构。
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


获取一个值，指示此实例是否为单位矩阵。

值：True 如果此实例是单位矩阵，则为 false。

**Returns:**
boolean - 指示此实例是否为单位矩阵的值。
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


在默认（Prepend）顺序下，将此矩阵乘以由  matrix  指定的矩阵。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 矩阵。 |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


按照  matrixOrder  指定的顺序，将此矩阵乘以由  matrix  指定的矩阵。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 矩阵。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 顺序。 |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


实现运算符 ==。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 第一个矩阵。 |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 第二个矩阵。 |

**Returns:**
boolean - 运算符的结果。
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


实现运算符 !=。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 第一个矩阵。 |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 第二个矩阵。 |

**Returns:**
boolean - 运算符的结果。
### reset() {#reset--}
```
public void reset()
```


将此 Matrix 重置为单位矩阵。

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


在默认（Prepend）顺序下，对此 Matrix 应用角度为  angle  的顺时针旋转。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| angle | float | 角度。 |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


按照  matrixOrder  指定的顺序，对此 Matrix 应用角度为  angle  的顺时针旋转。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| angle | float | 角度。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 顺序。 |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


在默认（Prepend）顺序下，对此 Matrix 绕  pivot  进行角度为  angle  的顺时针旋转。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| angle | float | 角度。 |
| 枢轴 | java.awt.geom.Point2D | 枢轴点。 |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


按照  matrixOrder  指定的顺序，对此 Matrix 绕  pivot  进行角度为  angle  的顺时针旋转。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| angle | float | 角度。 |
| 枢轴 | java.awt.geom.Point2D | 枢轴点。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 顺序。 |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


在默认（Prepend）顺序下，将指定的缩放向量（scaleX 和 scaleY）应用于此 Matrix。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| scaleX | float | scale x 的缩放。 |
| scaleY | float | scale y 的缩放。 |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


按照  matrixOrder  指定的顺序，将指定的缩放向量（scaleX 和 scaleY）应用于此 Matrix。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| scaleX | float | scale X 的缩放。 |
| scaleY | float | scale Y 的缩放。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 顺序。 |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


对该 Matrix 应用指定的倾斜变换。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| skewX | double | 倾斜 x。 |
| skewY | double | 倾斜 y。 |

### toString() {#toString--}
```
public String toString()
```


返回此  XpsMatrix  实例的字符串表示。

**Returns:**
java.lang.String - 字符串表示
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


将此 Matrix 表示的仿射变换应用于指定的矩形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 矩形 | java.awt.geom.Rectangle2D | 矩形。 |

**Returns:**
java.awt.geom.Rectangle2D - 变换后的矩形
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


将此 Matrix 表示的仿射变换应用于指定的点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| point | java.awt.geom.Point2D | 点。 |

**Returns:**
java.awt.geom.Point2D - 变换后的点
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


将此 Matrix 表示的仿射变换应用于指定的点数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 这些点。 |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


将此 Matrix 表示的仿射变换应用于点数组的指定部分。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 这些点。 |
| startIndex | int | 起始索引。 |
| numberOfPoints | int | 点的数量。 |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


将指定的平移向量应用于此 Matrix。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| offsetX | float | 偏移 X。 |
| offsetY | float | 偏移 Y。 |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


按照  matrixOrder  指定的顺序，将指定的平移向量应用于此 Matrix。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| offsetX | float | 偏移 X。 |
| offsetY | float | 偏移 Y。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 顺序。 |

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

