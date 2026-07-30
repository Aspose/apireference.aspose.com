---
title: "TtfEncoding"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体编码。"
type: docs
weight: 92
url: /zh/java/com.aspose.font/ttfencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding)
```
public class TtfEncoding implements IFontEncoding
```

表示 TTF 字体编码。
## 方法

| 方法 | 描述 |
| --- | --- |
| [decodeToGid(long unicode)](#decodeToGid-long-) | TTF Font 的 DecodeToGlyphId 实现会查找 unicode 表并返回 unicode 字符的字形 ID。 |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | 参数化版本允许使用特定的 CMap 表（非 unicode）。 |
| [encode(long gid, long charCode)](#encode-long-long-) | 对字形进行编码。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [gidToUnicode(GlyphId glyphId)](#gidToUnicode-com.aspose.font.GlyphId-) | 将字形 ID 解码为 unicode。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | 将 unicode 解码并返回字形 ID。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long unicode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long unicode)
```


TTF Font 的 DecodeToGlyphId 实现会查找 unicode 表并返回 unicode 字符的字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ( GlyphStringId ) 类的实例。TTF 的 ID 是整数索引，属于 ( GlyphUInt32Id ) 类的实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | long | 用于获取字形标识符的字符代码。 |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


参数化版本允许使用特定的 CMap 表（非 unicode）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | IEncodingParameters 接口的实现。 |
| charCode | long | 用于获取字形标识符的字符代码。 |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


对字形进行编码。对于 TTF 字体，字符代码是 unicode。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| gid | long | 字形标识符。 |
| charCode | long | 字符代码。 |

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
### gidToUnicode(GlyphId glyphId) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId glyphId)
```


将字形 ID 解码为 unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ( GlyphStringId ) 类的实例。TTF 的 ID 是整数索引，属于 ( GlyphUInt32Id ) 类的实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | 要解码的符号的 Glyph 标识符。 |

**Returns:**
long - 与传入的 glyph id 相关的 Unicode 值。
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
### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


将 unicode 解码并返回字形 ID。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | long | 用于获取字形标识符的 Unicode。 |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
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

