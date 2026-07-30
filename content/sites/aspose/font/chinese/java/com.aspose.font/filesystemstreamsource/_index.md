---
title: "FileSystemStreamSource"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示基于文件系统的流源。"
type: docs
weight: 31
url: /zh/java/com.aspose.font/filesystemstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class FileSystemStreamSource extends StreamSource
```

表示基于文件系统的流源。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [FileSystemStreamSource(String fileName)](#FileSystemStreamSource-java.lang.String-) | 初始化新的 FileSystemStreamSource 对象。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆 FileSystemStreamSource 对象。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileName()](#getFileName--) | 获取文件名。 |
| [getFontStream()](#getFontStream--) | 返回 Font 文件流。 |
| [getOffset()](#getOffset--) | 获取源内部的偏移量。 |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | 子类可能阻止流关闭。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setFileName(String value)](#setFileName-java.lang.String-) | 设置文件名。 |
| [setOffset(long value)](#setOffset-long-) | 设置源内部的偏移量。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileSystemStreamSource(String fileName) {#FileSystemStreamSource-java.lang.String-}
```
public FileSystemStreamSource(String fileName)
```


初始化新的 FileSystemStreamSource 对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文件名 | java.lang.String | 文件名。 |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


克隆 FileSystemStreamSource 对象。

**Returns:**
java.lang.Object - FileSystemStreamSource 对象的副本。
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
### getFileName() {#getFileName--}
```
public String getFileName()
```


获取文件名。

**Returns:**
java.lang.String - 文件名。
### getFontStream() {#getFontStream--}
```
public InputStream getFontStream()
```


返回 Font 文件流。使用后请记得关闭流。

**Returns:**
java.io.InputStream - Font 文件流。
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




### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


设置文件名。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 文件名。 |

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

