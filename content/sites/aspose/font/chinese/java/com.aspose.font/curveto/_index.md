---
title: "CurveTo"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 CurveTo 操作。"
type: docs
weight: 29
url: /zh/java/com.aspose.font/curveto/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IPathSegment](../../com.aspose.font/ipathsegment)
```
public class CurveTo implements IPathSegment
```

表示 CurveTo 操作。
## 方法

| 方法 | 描述 |
| --- | --- |
| [clone()](#clone--) | 创建一个当前实例的副本的新对象。 |
| [copy()](#copy--) | 创建段对象的副本。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getX1()](#getX1--) | 获取坐标 x1。 |
| [getX2()](#getX2--) | 获取坐标 x2。 |
| [getX3()](#getX3--) | 获取坐标 x3。 |
| [getY1()](#getY1--) | 获取坐标 y1。 |
| [getY2()](#getY2--) | 获取坐标 y2。 |
| [getY3()](#getY3--) | 获取坐标 y3。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [shift(double dx, double dy)](#shift-double-double-) | 通过 x 和 y 坐标执行平移。 |
| [toString()](#toString--) |  |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | 使用变换矩阵转换坐标。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Object clone()
```


创建一个当前实例的副本的新对象。

**Returns:**
java.lang.Object - 一个该实例的副本新对象。
### copy() {#copy--}
```
public IPathSegment copy()
```


创建段对象的副本。

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
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
### getX1() {#getX1--}
```
public double getX1()
```


获取坐标 x1。

**Returns:**
double - 坐标 x1。
### getX2() {#getX2--}
```
public double getX2()
```


获取坐标 x2。

**Returns:**
double - 坐标 x2。
### getX3() {#getX3--}
```
public double getX3()
```


获取坐标 x3。

**Returns:**
double - 坐标 x3。
### getY1() {#getY1--}
```
public double getY1()
```


获取坐标 y1。

**Returns:**
double - 坐标 y1。
### getY2() {#getY2--}
```
public double getY2()
```


获取坐标 y2。

**Returns:**
double - 坐标 y2。
### getY3() {#getY3--}
```
public double getY3()
```


获取坐标 y3。

**Returns:**
double - 坐标 y3。
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




### shift(double dx, double dy) {#shift-double-double-}
```
public void shift(double dx, double dy)
```


通过 x 和 y 坐标执行平移。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dx | double | dx 的值。 |
| dy | double | dy 的值。 |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public void transform(TransformationMatrix matrix)
```


使用变换矩阵转换坐标。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | 变换矩阵。 |

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

