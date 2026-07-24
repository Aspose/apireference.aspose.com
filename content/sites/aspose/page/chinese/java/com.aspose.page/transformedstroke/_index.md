---
title: "TransformedStroke"
second_title: "Aspose.Page for Java API 参考"
description: "包含变换的笔画。"
type: docs
weight: 17
url: /zh/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

包含变换的笔画。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | 基于另一个 Stroke 和 AffineTransform 创建一个 TransformedStroke。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | 使用此笔画对给定的 Shape 进行描边，生成轮廓。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | 获取基本笔画。 |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | 获取一个变换。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


基于另一个 Stroke 和 AffineTransform 创建一个 TransformedStroke。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| base | java.awt.Stroke | 笔画基准。 |
| at | java.awt.geom.AffineTransform | 仿射变换。 |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


使用此笔画对给定的 Shape 进行描边，生成轮廓。该轮廓会被我们的 AffineTransform 扭曲，相对于基准笔画所产生的轮廓，仅在缩放（即线条粗细）方面产生变化，因为在描边后平移和旋转会被取消。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | java.awt.Shape | 作为要描边的形状。 |

**Returns:**
java.awt.Shape - 形状的轮廓。
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
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


获取基本笔画。

**Returns:**
java.awt.Stroke - 基本笔画。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


获取一个变换。

**Returns:**
java.awt.geom.AffineTransform - 变换。
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

