---
title: "StreamSource"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "定义在需要时获取文件流的方式。"
type: docs
weight: 74
url: /zh/java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

定义在需要时获取文件流的方式。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [StreamSource()](#StreamSource--) | 初始化流源实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆流源对象。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | 返回 Font 流。 |
| [getOffset()](#getOffset--) | 获取源内部的偏移量。 |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | 子类可能阻止流关闭。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffset(long value)](#setOffset-long-) | 设置源内部的偏移量。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


初始化流源实例。

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


克隆流源对象。

**Returns:**
java.lang.Object - 流源对象的副本。
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
### getFontStream() {#getFontStream--}
```
public abstract InputStream getFontStream()
```


返回 Font 流。

**Returns:**
java.io.InputStream - Font 流。
### getOffset() {#getOffset--}
```
public long getOffset()
```


获取源内部的偏移量。

**Returns:**
long - 源内部的偏移量。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


子类可能阻止流关闭。如果流源希望在使用后关闭流，则返回 true。否则返回 false。

**Returns:**
boolean - 若流源希望在使用后关闭流，则为 true；否则为 false。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


设置源内部的偏移量。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | long | 源内部的偏移量。 |

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

