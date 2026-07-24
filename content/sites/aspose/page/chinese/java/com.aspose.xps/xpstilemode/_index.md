---
title: "XpsTileMode"
second_title: "Aspose.Page for Java API 参考"
description: "平铺画笔 TileMode 属性的有效值。"
type: docs
weight: 66
url: /zh/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

平铺画刷的 TileMode 属性的有效值。
## 字段

| 字段 | 描述 |
| --- | --- |
| [FlipX](#FlipX) | 平铺排列类似于 Tile 平铺模式，但交替列的平铺会水平翻转。 |
| [FlipXY](#FlipXY) | 平铺排列类似于 Tile 平铺模式，但交替列的平铺会水平翻转，交替行的平铺会垂直翻转。 |
| [FlipY](#FlipY) | 平铺排列类似于 Tile 平铺模式，但交替行的平铺会垂直翻转。 |
| [None](#None) | 在此模式下，仅绘制单个基础平铺。 |
| [Tile](#Tile) | 在此模式下，绘制基础平铺，并通过重复基础平铺填充剩余区域，使每个平铺的右边缘与下一个平铺的左边缘相接，底部边缘与下一个平铺的顶部相接。 |
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
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


平铺排列类似于 Tile 平铺模式，但交替列的平铺会水平翻转。基础平铺按视口指定的位置放置。该平铺左右列的平铺会水平翻转。

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


平铺排列类似于 Tile 平铺模式，但交替列的平铺会水平翻转，交替行的平铺会垂直翻转。基础平铺按视口指定的位置放置。

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


平铺排列类似于 Tile 平铺模式，但交替行的平铺会垂直翻转。基础平铺按视口指定的位置放置。上下行会垂直翻转。

### None {#None}
```
public static final XpsTileMode None
```


在此模式下，仅绘制单个基础平铺。其余区域保持透明。

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


在此模式下，绘制基础平铺，并通过重复基础平铺填充剩余区域，使每个平铺的右边缘与下一个平铺的左边缘相接，底部边缘与下一个平铺的顶部相接。

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
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
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

