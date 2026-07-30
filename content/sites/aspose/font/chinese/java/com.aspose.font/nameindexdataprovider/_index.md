---
title: "NameIndexDataProvider"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "提供 CFF 字体通用设置。"
type: docs
weight: 68
url: /zh/java/com.aspose.font/nameindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class NameIndexDataProvider implements ICffIndexDataProvider
```

提供 CFF 字体通用设置。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [NameIndexDataProvider()](#NameIndexDataProvider--) |  |
## 方法

| 方法 | 描述 |
| --- | --- |
| [addName(String name)](#addName-java.lang.String-) | 向 Name INDEX 结构添加字体名称。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | 获取指定索引处的字体名称。 |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | 获取 CFF INDEX 结构中的对象数量。 |
| [getName(int index)](#getName-int-) | 获取指定索引处的字体名称。 |
| [getRawBytes()](#getRawBytes--) | 获取 CFF INDEX 结构的所有字节。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeName(int index)](#removeName-int-) | 删除指定索引处的名称。 |
| [set(int index, String name)](#set-int-java.lang.String-) | 在指定索引处指定字体名称。 |
| [setName(String name, int index)](#setName-java.lang.String-int-) | 在指定索引处设置字体名称。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NameIndexDataProvider() {#NameIndexDataProvider--}
```
public NameIndexDataProvider()
```


### addName(String name) {#addName-java.lang.String-}
```
public abstract void addName(String name)
```


向 Name INDEX 结构添加字体名称。请谨慎使用此方法，因为根据 CFF 规范，CFF Name INDEX 结构中的每个字体名称必须在 Top DICT 索引中具有相应的 DICT 结构。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String |  |

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
### get(int index) {#get-int-}
```
public abstract String get(int index)
```


获取指定索引处的字体名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 字体索引。 |

**Returns:**
java.lang.String - 字体名称。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public abstract int getCount()
```


获取 CFF INDEX 结构中的对象数量。

**Returns:**
int
### getName(int index) {#getName-int-}
```
public abstract String getName(int index)
```


获取指定索引处的字体名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 字体索引。 |

**Returns:**
java.lang.String - 字体名称。
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


获取 CFF INDEX 结构的所有字节。

**Returns:**
byte[] - CFF INDEX 结构的字节
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




### removeName(int index) {#removeName-int-}
```
public abstract void removeName(int index)
```


删除指定索引处的名称。请谨慎使用此方法，因为根据 CFF 规范，CFF Name INDEX 结构中的每个字体名称必须在 Top DICT 索引中具有相应的 DICT 结构。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 字体索引。 |

### set(int index, String name) {#set-int-java.lang.String-}
```
public abstract void set(int index, String name)
```


在指定索引处指定字体名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 字体索引。 |
| 名称 | java.lang.String | 字体名称。 |

### setName(String name, int index) {#setName-java.lang.String-int-}
```
public abstract void setName(String name, int index)
```


在指定索引处设置字体名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String | 字体名称。 |
| 索引 | int | 字体索引。 |

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

