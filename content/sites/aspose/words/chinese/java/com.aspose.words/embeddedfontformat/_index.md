---
title: EmbeddedFontFormat
second_title: Aspose.Words for Java API 参考
description: 指定对象内特定嵌入字体的格式。
type: docs
weight: 141
url: /zh/java/com.aspose.words/embeddedfontformat/
---

**遗产：**
java.lang.Object
```
public class EmbeddedFontFormat
```

指定内部特定嵌入字体的格式[FontInfo](../../com.aspose.words/fontinfo)目的。

将文档保存到文件时，只记录相应格式的嵌入字体。
## 字段

| 场地 | 描述 |
| --- | --- |
| [EMBEDDED_OPEN_TYPE](#EMBEDDED-OPEN-TYPE) | 指定嵌入式 OpenType (EOT) 文件格式。 |
| [OPEN_TYPE](#OPEN-TYPE) | 指定字体，嵌入为 OpenType (TrueType) 字体文件的普通副本。 |
| [length](#length) |  |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromName(String embeddedFontFormatName)](#fromName-java.lang.String-) |  |
| [getClass()](#getClass--) |  |
| [getName(int embeddedFontFormat)](#getName-int-) |  |
| [getValues()](#getValues--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [toString(int embeddedFontFormat)](#toString-int-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EMBEDDED_OPEN_TYPE {#EMBEDDED-OPEN-TYPE}
```
public static int EMBEDDED_OPEN_TYPE
```


指定嵌入式 OpenType (EOT) 文件格式。

DOC 文件中使用的这种嵌入字体格式。

有关格式的说明，请参阅 http://www.w3.org/Submission/EOT。

### OPEN_TYPE {#OPEN-TYPE}
```
public static int OPEN_TYPE
```


指定字体，嵌入为 OpenType (TrueType) 字体文件的普通副本。

这种嵌入字体的格式用于 Open Office XML 格式，包括 DOCX 文件。

### length {#length}
```
public static int length
```


### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**退货：**
布尔值
### fromName(String embeddedFontFormatName) {#fromName-java.lang.String-}
```
public static int fromName(String embeddedFontFormatName)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| embeddedFontFormatName | java.lang.String |  |

**退货：**
整数
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**退货：**
java.lang.Class<?>
### getName(int embeddedFontFormat) {#getName-int-}
```
public static String getName(int embeddedFontFormat)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| embeddedFontFormat | int |  |

**退货：**
java.lang.字符串
### getValues() {#getValues--}
```
public static int[] getValues()
```




**退货：**
整数[]
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**退货：**
整数
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




**退货：**
java.lang.字符串
### toString(int embeddedFontFormat) {#toString-int-}
```
public static String toString(int embeddedFontFormat)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| embeddedFontFormat | int |  |

**退货：**
java.lang.字符串
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |
