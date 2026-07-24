---
title: "XpsPathFigure"
second_title: "Aspose.Page for Java API 参考"
description: "封装 PathFigure 元素特性的类。"
type: docs
weight: 41
url: /zh/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

封装 PathFigure 元素特性的类。此元素由一个或多个直线或曲线段组成。
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(T obj)](#add-T-) | 向数组中添加新对象。 |
| [deepClone()](#deepClone--) | 克隆此路径图形。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 通过索引 i 提供对数组元素的访问。 |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | 返回子路径段的列表。 |
| [getStartPoint()](#getStartPoint--) | 返回路径图形第一个段的起始点。 |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | 在指定位置向数组中插入新对象。 |
| [isClosed()](#isClosed--) | 返回指示路径图形是否闭合的值。 |
| [isFilled()](#isFilled--) | 返回指示路径图形是否用于计算其包含的路径几何面积的值。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | 从数组中移除对象。 |
| [removeAt(int index)](#removeAt-int-) | 在指定位置从数组中移除对象。 |
| [setClosed(boolean value)](#setClosed-boolean-) | 设置指示路径图形是否闭合的值。 |
| [setFilled(boolean value)](#setFilled-boolean-) | 设置指示路径图形是否用于计算其包含的路径几何面积的值。 |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | 设置路径图形第一个段的起始点。 |
| [size()](#size--) | 返回元素数量。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


向数组中添加新对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 对象 | T | 要添加的对象。 |

**Returns:**
T - 已添加的对象。
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


克隆此路径图形。

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### get(int i) {#get-int-}
```
public T get(int i)
```


通过索引 i 提供对数组元素的访问。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int | 元素的索引。 |

**Returns:**
T - 位于 i 位置的元素。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


返回子路径段的列表。

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - 子路径段的列表。
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


返回路径图形第一个段的起始点。

**Returns:**
java.awt.geom.Point2D - 路径图形第一个段的起始点。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


在指定位置向数组中插入新对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 要插入对象的位置。 |
| 对象 | T | 要插入的对象。 |

**Returns:**
T - 已插入的对象。
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


返回指示路径图形是否闭合的值。

**Returns:**
boolean - 表示路径图形是否闭合的值。
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


返回指示路径图形是否用于计算其包含的路径几何面积的值。

**Returns:**
boolean - 表示路径图形是否在计算包含路径几何体的面积时使用的值。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


从数组中移除对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 对象 | T | 要删除的对象。 |

**Returns:**
T - 已删除的对象。
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


在指定位置从数组中移除对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 要删除对象的位置。 |

**Returns:**
T - 已删除的对象。
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


设置指示路径图形是否闭合的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | boolean | 表示路径图形是否闭合的值。 |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


设置指示路径图形是否用于计算其包含的路径几何面积的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | boolean | 表示路径图形是否在计算包含路径几何体的面积时使用的值。 |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


设置路径图形第一个段的起始点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |

### size() {#size--}
```
public int size()
```


返回元素数量。

**Returns:**
int - 元素的数量。
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

