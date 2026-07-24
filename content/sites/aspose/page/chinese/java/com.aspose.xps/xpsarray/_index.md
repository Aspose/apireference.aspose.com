---
title: "XpsArray"
second_title: "Aspose.Page for Java API 参考"
description: "封装通用 XPS 模型数组对象特性的类。"
type: docs
weight: 14
url: /zh/java/com.aspose.xps/xpsarray/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public abstract class XpsArray<T> extends XpsObject
```

封装通用 XPS 模型数组对象特性的类。
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(T obj)](#add-T-) | 向数组中添加新对象。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 通过索引 i 提供对数组元素的访问。 |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | 在指定位置向数组中插入新对象。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | 从数组中移除对象。 |
| [removeAt(int index)](#removeAt-int-) | 在指定位置从数组中移除对象。 |
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

