---
title: "StringIndexDataProvider"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "声明用于访问 CFF String INDEX 结构的功能。"
type: docs
weight: 75
url: /zh/java/com.aspose.font/stringindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class StringIndexDataProvider implements ICffIndexDataProvider
```

声明用于访问 CFF String INDEX 结构的功能。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [StringIndexDataProvider()](#StringIndexDataProvider--) |  |
## 方法

| 方法 | 描述 |
| --- | --- |
| [addString(String value)](#addString-java.lang.String-) | 向 CFF String INDEX 结构中添加字符串。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | 获取/设置 指定索引处的字符串。 |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | CFF INDEX 结构中对象的数量。 |
| [getRawBytes()](#getRawBytes--) | 获取 CFF INDEX 结构的所有字节。 |
| [getString(int index)](#getString-int-) | 从 CFF String INDEX 结构中获取指定索引处的字符串。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeString(int index)](#removeString-int-) | 在指定索引处从 CFF String Index 结构中移除字符串。 |
| [set(int index, String value)](#set-int-java.lang.String-) |  |
| [setString(String value, int index)](#setString-java.lang.String-int-) | 在指定索引处设置 CFF String Index 结构中的字符串。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringIndexDataProvider() {#StringIndexDataProvider--}
```
public StringIndexDataProvider()
```


### addString(String value) {#addString-java.lang.String-}
```
public abstract void addString(String value)
```


向 CFF String INDEX 结构中添加字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 字符串值 |

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


获取/设置 指定索引处的字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 字符串的索引，索引指的是 CFF INDEX 结构中的序号，而非 SID |

**Returns:**
java.lang.String - 字符串
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


CFF INDEX 结构中对象的数量。

**Returns:**
int
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


获取 CFF INDEX 结构的所有字节。

**Returns:**
byte[] - CFF INDEX 结构的字节
### getString(int index) {#getString-int-}
```
public abstract String getString(int index)
```


从 CFF String INDEX 结构中获取指定索引处的字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 字符串的索引，索引指的是 CFF INDEX 结构中的序号，而非 SID |

**Returns:**
java.lang.String - 字符串
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




### removeString(int index) {#removeString-int-}
```
public abstract void removeString(int index)
```


在指定索引处从 CFF String Index 结构中移除字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 字符串的索引，索引指的是 CFF INDEX 结构中的序号，而非 SID |

### set(int index, String value) {#set-int-java.lang.String-}
```
public abstract void set(int index, String value)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int |  |
| 值 | java.lang.String |  |

### setString(String value, int index) {#setString-java.lang.String-int-}
```
public abstract void setString(String value, int index)
```


在指定索引处设置 CFF String Index 结构中的字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 字符串值 |
| 索引 | int | 字符串的索引，索引指的是 CFF INDEX 结构中的序号，而非 SID |

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

