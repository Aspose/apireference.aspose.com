---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page for Java API 参考"
description: "定义各种保存前事件参数的基类。"
type: docs
weight: 11
url: /zh/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

定义各种保存前事件参数的基类。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | 返回 XPS 包中所有文档的当前绝对页码。 |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | 返回 XPS 包中当前的文档编号。 |
| [getElementAPI()](#getElementAPI--) | 返回即将保存的元素的修改 API。 |
| [getOutputPageNumber()](#getOutputPageNumber--) | 返回当前输出编号。 |
| [getRelativePageNumber()](#getRelativePageNumber--) | 返回相对于 XPS 包中当前文档的当前页码。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


返回 XPS 包中所有文档的当前绝对页码。

**Returns:**
int - XPS 包中所有文档的当前绝对页码。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


返回 XPS 包中当前的文档编号。

**Returns:**
int - XPS 包中当前的文档编号。
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


返回即将保存的元素的修改 API。

**Returns:**
T - 即将保存的元素的修改 API。
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


返回当前输出编号。如果指定了 **PageNumbers** 保存选项，则它与 **AbsolutePageNumber** 不同。

**Returns:**
int - 当前输出编号。
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


返回相对于 XPS 包中当前文档的当前页码。

**Returns:**
int - 相对于 XPS 包中当前文档的当前页码。
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

