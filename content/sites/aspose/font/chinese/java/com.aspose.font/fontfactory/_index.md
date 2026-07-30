---
title: "FontFactory"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "包含打开不同类型字体的功能以及用于创建各种对象的其他方法。"
type: docs
weight: 41
url: /zh/java/com.aspose.font/fontfactory/
---
**Inheritance:**
java.lang.Object
```
public class FontFactory
```

包含打开不同类型字体的功能以及用于创建各种对象的其他方法。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [FontFactory()](#FontFactory--) | 构造函数 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | 打开字体，使用 FontDefinition 对象。 |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | 打开字体，使用字体类型和字体数据字节数组。 |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | 打开字体，使用字体类型和流源。 |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | 打开字体，使用字体类型和字体文件名。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontFactory() {#FontFactory--}
```
public FontFactory()
```


构造函数

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




### open(FontDefinition fontDefinition) {#open-com.aspose.font.FontDefinition-}
```
public Font open(FontDefinition fontDefinition)
```


打开字体，使用 FontDefinition 对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | 字体定义对象。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public Font open(FontType fontType, byte[] fontData)
```


打开字体，使用字体类型和字体数据字节数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fontData | byte[] | 用于加载字体的字节数组。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public Font open(FontType fontType, StreamSource fontStreamSource)
```


打开字体，使用字体类型和流源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体的流来源。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public Font open(FontType fontType, String fileName)
```


打开字体，使用字体类型和字体文件名。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| 文件名 | java.lang.String | 字体文件名。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
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

