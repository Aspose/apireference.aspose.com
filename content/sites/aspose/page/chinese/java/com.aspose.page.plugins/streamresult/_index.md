---
title: "StreamResult"
second_title: "Aspose.Page for Java API 参考"
description: "表示以流形式的操作结果。"
type: docs
weight: 18
url: /zh/java/com.aspose.page.plugins/streamresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StreamResult implements IOperationResult
```

表示以流形式的操作结果。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [StreamResult(OutputStream stream)](#StreamResult-java.io.OutputStream-) | 使用指定的流对象初始化新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | 获取原始数据。 |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | 指示结果是否为字节数组。 |
| [isFile()](#isFile--) | 指示结果是否为输出文件的路径。 |
| [isStream()](#isStream--) | 指示结果是否为输出文件的路径。 |
| [isString()](#isString--) | 指示结果是否为字符串。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | 尝试将结果转换为文件。 |
| [toStream()](#toStream--) | 尝试将结果转换为流对象。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamResult(OutputStream stream) {#StreamResult-java.io.OutputStream-}
```
public StreamResult(OutputStream stream)
```


使用指定的流对象初始化新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.OutputStream | 流对象 |

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
### getData() {#getData--}
```
public final Object getData()
```


获取原始数据。

**Returns:**
java.lang.Object - 表示输出数据的对象。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


指示结果是否为字节数组。

**Returns:**
boolean - 如果结果是字节数组则为 true；否则为 false。
### isFile() {#isFile--}
```
public final boolean isFile()
```


指示结果是否为输出文件的路径。

**Returns:**
boolean - 如果结果是文件则为 true；否则为 false。
### isStream() {#isStream--}
```
public final boolean isStream()
```


指示结果是否为输出文件的路径。

**Returns:**
boolean - 如果结果是流对象则为 true；否则为 false。
### isString() {#isString--}
```
public final boolean isString()
```


指示结果是否为字符串。

**Returns:**
boolean - 如果结果是字符串则为 true；否则为 false。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


尝试将结果转换为文件。

**Returns:**
java.lang.String - 如果结果是文件，则表示输出文件路径的字符串；否则为 null。
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


尝试将结果转换为流对象。

**Returns:**
java.io.OutputStream - 如果结果是流，则表示输出数据的流对象；否则为 null。
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

