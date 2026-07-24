---
title: "XpsPathGeometry"
second_title: "Aspose.Page for Java API 参考"
description: "封装 PathGeometry 属性元素特性的类。"
type: docs
weight: 42
url: /zh/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

封装 PathGeometry 属性元素特性的类。此元素包含一组路径图形，可通过 Figures 属性或子 PathFigure 元素指定。
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(T obj)](#add-T-) | 向数组中添加新对象。 |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | 将路径段添加到最后一个 pah 图形的子段列表中。 |
| [deepClone()](#deepClone--) | 克隆此路径几何体。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 通过索引 i 提供对数组元素的访问。 |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | 返回指定几何形状相交区域如何组合形成区域的值。 |
| [getPathFigures()](#getPathFigures--) | 返回子路径图形的列表。 |
| [getTransform()](#getTransform--) | 返回仿射变换矩阵，该矩阵建立了在路径几何体用于填充、裁剪或描边之前，应用于所有子元素和后代元素的局部矩阵变换。 |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | 在指定位置向数组中插入新对象。 |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | 在索引位置将路径段插入到最后一个路径图形的子段列表中。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | 从数组中移除对象。 |
| [removeAt(int index)](#removeAt-int-) | 在指定位置从数组中移除对象。 |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | 从最后一个路径图形的子段列表中移除路径段。 |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | 在索引位置从最后一个路径图形的子段列表中移除路径段。 |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | 设置指定几何形状相交区域如何组合形成区域的值。 |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | 设置仿射变换矩阵，该矩阵建立了在路径几何体用于填充、裁剪或描边之前，应用于所有子元素和后代元素的局部矩阵变换。 |
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
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


将路径段添加到最后一个 pah 图形的子段列表中。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 要添加的路径段。 |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


克隆此路径几何体。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


返回指定几何形状相交区域如何组合形成区域的值。

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


返回子路径图形的列表。

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - 子路径图形的列表。
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


返回仿射变换矩阵，该矩阵建立了在路径几何体用于填充、裁剪或描边之前，应用于所有子元素和后代元素的局部矩阵变换。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
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
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


在索引位置将路径段插入到最后一个路径图形的子段列表中。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入段的位置。 |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 要插入的路径段。 |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
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
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


从最后一个路径图形的子段列表中移除路径段。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 要移除的路径段。 |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


在索引位置从最后一个路径图形的子段列表中移除路径段。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应移除路径段的位置。 |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


设置指定几何形状相交区域如何组合形成区域的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | 指定几何形状相交区域如何组合形成区域的值。 |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


设置仿射变换矩阵，该矩阵建立了在路径几何体用于填充、裁剪或描边之前，应用于所有子元素和后代元素的局部矩阵变换。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 仿射变换矩阵。 |

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

