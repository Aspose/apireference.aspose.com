---
title: "TtcFontFileDefinition"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTC 字体的文件定义。"
type: docs
weight: 79
url: /zh/java/com.aspose.font/ttcfontfiledefinition/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontFileDefinition](../../com.aspose.font/fontfiledefinition)
```
public class TtcFontFileDefinition extends FontFileDefinition
```

表示 TTC 字体的文件定义。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)](#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-) | 仅使用文件内容创建文件定义。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | 获取文件扩展名。 |
| [getFileName()](#getFileName--) | 获取文件名。 |
| [getFontIndex()](#getFontIndex--) | 获取 TTC Font 中的字体索引。 |
| [getOffset()](#getOffset--) | 获取流中的偏移量。 |
| [getStreamSource()](#getStreamSource--) | 获取流源。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset) {#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-}
```
public TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)
```


仅使用文件内容创建文件定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontIndex | int | TTC font collection 中字体的索引。 |
| fileExtension | java.lang.String | 字体文件集合的扩展名。 |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体文件集合的来源。 |
| 偏移量 | long | 字体文件集合中字体数据的偏移量，参见 OpenType 字体文件规范中的 TTC 头部、偏移表。 |

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
### getFontIndex() {#getFontIndex--}
```
public long getFontIndex()
```


获取 TTC Font 中的字体索引。

**Returns:**
long - TTC 字体中的字体索引。
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

