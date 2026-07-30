---
title: "TtfCffTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的 cff 表。"
type: docs
weight: 90
url: /zh/java/com.aspose.font/ttfcfftable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfCffTable extends TtfTableBase
```

表示 TTF 字体文件的 "cff" 表。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffSource()](#getCffSource--) | 紧凑字体格式表示中轮廓的原始字节。 |
| [getClass()](#getClass--) |  |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCffSource(StreamSource streamSource)](#setCffSource-com.aspose.font.StreamSource-) |  |
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
### getCffSource() {#getCffSource--}
```
public StreamSource getCffSource()
```


紧凑字体格式表示中轮廓的原始字节。

**Returns:**
[StreamSource](../../com.aspose.font/streamsource) - Raw bytes for outlines in Compact Font Format representation.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOffset() {#getOffset--}
```
public long getOffset()
```


获取自 sfnt 开始的偏移量。

**Returns:**
long - 自 sfnt 开始的偏移量。
### getTag() {#getTag--}
```
public static String getTag()
```


获取表标签。

**Returns:**
java.lang.String - 表标签。
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


指向 TTF 表仓库的引用。

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
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




### setCffSource(StreamSource streamSource) {#setCffSource-com.aspose.font.StreamSource-}
```
public void setCffSource(StreamSource streamSource)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) |  |

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

