---
title: "ParameterRef"
second_title: "Aspose.Page for Java API 参考"
description: "实现通用 PrintTicket 参数引用的类。"
type: docs
weight: 140
url: /zh/java/com.aspose.xps.metadata/parameterref/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem)
```
public class ParameterRef extends PrintTicketElement implements IPrintTicketItem
```

实现通用 PrintTicket 参数引用的类。ParameterRef 元素定义对 ParameterInit 元素的引用。包含 ParameterRef 元素的 ScoredProperty 元素没有显式设置的 Value 元素。相反，ScoredProperty 元素的值来自 ParameterRef 元素所引用的 ParameterInit 元素。 https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterref
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [ParameterRef(String name)](#ParameterRef-java.lang.String-) | 创建一个新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 获取元素名称。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ParameterRef(String name) {#ParameterRef-java.lang.String-}
```
public ParameterRef(String name)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String | 参数名称。 |

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
### getName() {#getName--}
```
public String getName()
```


获取元素名称。

**Returns:**
java.lang.String
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

