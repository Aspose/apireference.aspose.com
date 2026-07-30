---
title: "Type1Encoding"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 Type1 字体编码。"
type: docs
weight: 114
url: /zh/java/com.aspose.font/type1encoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class Type1Encoding implements IFontEncoding, ISupportsNameAddressing
```

表示 Type1 字体编码。
## 方法

| 方法 | 描述 |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | 将 Gid 解码为 unicode。 |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | 参数化解码方法。 |
| [encode(long gid, long charCode)](#encode-long-long-) | 对字形进行编码。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | 返回名称到字符代码编码的映射。 |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | 将 Gid 解码为 Unicode。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | 返回 Unicode 对应的 GlyphId。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，属于 ( GlyphStringId ) 类的实例。TTF 的 id 是整数索引，属于 ( GlyphUInt32Id ) 类的实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCode | long | 用于获取字形标识符的字符代码。 |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


参数化解码方法。不支持 Type1 字体类型。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | 不支持 Type1 字体类型。 |
| charCode | long | 不支持 Type1 字体类型。 |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Not supported for Type1 Font type.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


对字形进行编码。对于 TTF 字体，字符代码是 unicode。不支持 Type1 字体类型。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| gid | long | 字形 ID。 |
| charCode | long | 与 glyph id 关联的字符代码。 |

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
### getNameToCharCodeIndex() {#getNameToCharCodeIndex--}
```
public NameToCodeMap getNameToCharCodeIndex()
```


返回名称到字符代码编码的映射。注意：字符代码不是 unicode。字符代码是字体编码\"table\"中的字符索引。

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


将 Gid 解码为 Unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，属于 ( GlyphStringId ) 类的实例。TTF 的 id 是整数索引，属于 ( GlyphUInt32Id ) 类的实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | 要解码的符号的 Glyph 标识符。 |

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


返回 Unicode 对应的 GlyphId。如果字体不包含该 Unicode 的字形，则返回 notdef。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，属于 ( GlyphStringId ) 类的实例。TTF 的 id 是整数索引，属于 ( GlyphUInt32Id ) 类的实例。

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

