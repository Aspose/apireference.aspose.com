---
title: "DimensionF"
second_title: "Aspose.Page for Java API 参考"
description: "Dimension 类在单个对象中封装了组件的宽度和高度，使用单精度表示。"
type: docs
weight: 11
url: /zh/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

`Dimension` 类将组件的宽度和高度（单精度）封装在一个对象中。

通常，`width` 和 `height` 的值是非负整数。允许创建维度的构造函数并不会阻止您为这些属性设置负值。如果 `width` 或 `height` 的值为负，则其他对象定义的某些方法的行为未定义。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [DimensionF()](#DimensionF--) | 创建一个 `Dimension` 实例，其宽度为零，高度为零。 |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | 创建一个 `Dimension` 实例，其宽度和高度与指定的维度相同。 |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | 构造一个 `Dimension` 并将其初始化为指定的宽度和指定的高度。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| [height](#height) | 高度维度；可以使用负值。 |
| [width](#width) | 宽度维度；可以使用负值。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | 检查两个维度对象的值是否相等。 |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | 获取此 `Dimension` 对象的大小。 |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | 返回此 `Dimension` 的哈希码。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | 将此 `Dimension` 对象的大小设置为指定的尺寸。 |
| [setSize(double width, double height)](#setSize-double-double-) | 将此 `Dimension` 对象的大小设置为指定的宽度和高度，使用双精度。 |
| [setSize(float width, float height)](#setSize-float-float-) | 将此 `Dimension` 对象的大小设置为指定的宽度和高度。 |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | 返回此 `Dimension` 对象的 `height` 和 `width` 字段值的字符串表示。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


创建一个 `Dimension` 实例，其宽度为零，高度为零。

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


创建一个 `Dimension` 实例，其宽度和高度与指定的维度相同。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | 用于 `width` 和 `height` 值的指定维度 |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


构造一个 `Dimension` 并将其初始化为指定的宽度和指定的高度。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float | 指定的宽度 |
| 高度 | float | 指定的高度 |

### height {#height}
```
public float height
```


高度维度；可以使用负值。

### width {#width}
```
public float width
```


宽度维度；可以使用负值。

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


检查两个维度对象的值是否相等。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 对象 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


获取此 `Dimension` 对象的大小。此方法为完整性而包含，以对应 `Component` 定义的 `getSize` 方法。

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


返回此 `Dimension` 的哈希码。

**Returns:**
int - 此 `Dimension` 的哈希码
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


将此 `Dimension` 对象的大小设置为指定的尺寸。此方法为完整性而包含，以对应 `Component` 定义的 `setSize` 方法。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | 此 `Dimension` 对象的新尺寸 |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


将此 `Dimension` 对象的大小设置为指定的宽度和高度（双精度）。请注意，如果 `width` 或 `height` 大于 `Integer.MAX_VALUE`，它们将被重置为 `Integer.MAX_VALUE`。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | double | 该 `Dimension` 对象的新宽度 |
| 高度 | double | 该 `Dimension` 对象的新高度 |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


将此 `Dimension` 对象的大小设置为指定的宽度和高度。此方法为完整性而包含，以对应 `Component` 定义的 `setSize` 方法。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float | 此 `Dimension` 对象的新宽度 |
| 高度 | float | 此 `Dimension` 对象的新高度 |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


返回此 `Dimension` 对象的 `height` 和 `width` 字段值的字符串表示。此方法仅用于调试目的，返回字符串的内容和格式可能因实现而异。返回的字符串可能为空，但不能为 `null`。

**Returns:**
java.lang.String - 此 `Dimension` 对象的字符串表示
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

