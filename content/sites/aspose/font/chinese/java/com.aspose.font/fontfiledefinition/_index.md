---
title: "FontFileDefinition"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 Font 文件定义。"
type: docs
weight: 42
url: /zh/java/com.aspose.font/fontfiledefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontFileDefinition
```

表示 Font 文件定义。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [FontFileDefinition(StreamSource streamSource)](#FontFileDefinition-com.aspose.font.StreamSource-) | 仅使用文件内容创建文件定义。 |
| [FontFileDefinition(String fileExtension, StreamSource streamSource)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-) | 仅使用文件内容创建文件定义。 |
| [FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-) | 仅使用文件内容创建文件定义。 |
| [FontFileDefinition(File fontFile)](#FontFileDefinition-java.io.File-) | 使用字体文件（由 File 表示）和文件内容创建文件定义。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | 获取文件扩展名。 |
| [getFileName()](#getFileName--) | 获取文件名。 |
| [getOffset()](#getOffset--) | 获取流中的偏移量。 |
| [getStreamSource()](#getStreamSource--) | 获取流源。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontFileDefinition(StreamSource streamSource) {#FontFileDefinition-com.aspose.font.StreamSource-}
```
public FontFileDefinition(StreamSource streamSource)
```


仅使用文件内容创建文件定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体流源。 |

### FontFileDefinition(String fileExtension, StreamSource streamSource) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource)
```


仅使用文件内容创建文件定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fileExtension | java.lang.String | 字体文件扩展名。 |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体流源。 |

### FontFileDefinition(String fileExtension, StreamSource streamSource, long offset) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)
```


仅使用文件内容创建文件定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fileExtension | java.lang.String | 字体文件扩展名。 |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体流源。 |
| 偏移量 | long | 流源中字体数据的偏移量。 |

### FontFileDefinition(File fontFile) {#FontFileDefinition-java.io.File-}
```
public FontFileDefinition(File fontFile)
```


使用字体文件（由 File 表示）和文件内容创建文件定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontFile | java.io.File | File 对象。 |

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
### getFileExtension() {#getFileExtension--}
```
public String getFileExtension()
```


获取文件扩展名。

**Returns:**
java.lang.String - 文件扩展名。
### getFileName() {#getFileName--}
```
public String getFileName()
```


获取文件名。

**Returns:**
java.lang.String - 文件名。
### getOffset() {#getOffset--}
```
public long getOffset()
```


获取流中的偏移量。

**Returns:**
long - 流中的偏移量。
### getStreamSource() {#getStreamSource--}
```
public StreamSource getStreamSource()
```


获取流源。

**Returns:**
[StreamSource](../../com.aspose.font/streamsource) - The stream source.
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

