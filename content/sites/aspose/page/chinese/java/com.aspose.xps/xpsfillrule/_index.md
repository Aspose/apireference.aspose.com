---
title: "XpsFillRule"
second_title: "Aspose.Page for Java API 参考"
description: "PathGeometry 元素 FillRule 属性的有效值。"
type: docs
weight: 59
url: /zh/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

PathGeometry 元素的 FillRule 属性的有效值。
## 字段

| 字段 | 描述 |
| --- | --- |
| [EvenOdd](#EvenOdd) | 此规则通过从点向任意方向绘制射线至无穷远，并计数射线穿过给定形状的线段数量，以确定画布上点的“内部性”。 |
| [NonZero](#NonZero) | 此规则通过从点向任意方向绘制射线至无穷远，然后检查形状的线段穿过射线的部位，以确定画布上点的“内部性”。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EvenOdd {#EvenOdd}
```
public static final XpsFillRule EvenOdd
```


此规则通过从点向任意方向绘制射线至无穷远，并计数射线穿过给定形状的线段数量，以确定画布上点的“内部性”。如果该数量为奇数，则点在内部；如果为偶数，则点在外部。

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


此规则通过从点向任意方向绘制射线至无穷远，然后检查形状的线段穿过射线的部位。计数从零开始，每当线段从左向右穿过射线时加一，每当路径线段从右向左穿过射线时减一。计数完成后，如果结果为零，则点在路径外部；否则，点在内部。

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsFillRule valueOf(String name)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String |  |

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule)
### values() {#values--}
```
public static XpsFillRule[] values()
```




**Returns:**
com.aspose.xps.XpsFillRule[]
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

