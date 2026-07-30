---
title: "CffEncoding"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 CFF _font 编码。"
type: docs
weight: 18
url: /zh/java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

表示 CFF \_font 编码。
## 方法

| 方法 | 描述 |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | 获取传入的 charCode 的 Gid。 |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | 参数化解码方法。 |
| [encode(long gid, long charCode)](#encode-long-long-) | 对字形进行编码。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | 返回名称到字符代码编码的映射。 |
| [getNameToGidIndex()](#getNameToGidIndex--) | 返回名称到字符代码编码的映射。 |
| [getNameToSidIndex()](#getNameToSidIndex--) | 返回名称到字符代码编码的映射。 |
| [getSidName(int sid)](#getSidName-int-) | 获取指定 SID 的名称。 |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | 将 Gid 解码为 unicode。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | 将 unicode 解码并返回字形 ID。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


获取传入的 charCode 的 Gid。此方法针对 CFF CIDFonts 设计，其中 charCode 必须是有效的 CID 值。Glyph id 是字形的唯一编号，取决于 \\_font 类型。CFF 字体的 glyph id 可以是 ( GlyphStringId ) 类的实例或 ( GlyphUInt32Id ) 类的实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCode | long | 用于获取字形标识符的字符代码 (CID)。 |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to CID passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


参数化解码方法。不支持 CFF 字体类型。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | IEncodingParameters 接口的实现。 |
| charCode | long | 用于获取字形标识符的字符代码。 |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


对字形进行编码。不支持 CFF 字体类型。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| gid | long | 字形标识符 |
| charCode | long | 与字形标识符关联的 CharCode。 |

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


返回名称到字符代码编码的映射。注意：字符代码不是 Unicode。字符代码是字体编码 \"table\" 中的字符索引。

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToGidIndex() {#getNameToGidIndex--}
```
public NameToCodeMap getNameToGidIndex()
```


返回名称到字符代码编码的映射。注意：字符代码不是 Unicode。字符代码是字体编码 \"table\" 中的字符索引。

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToSidIndex() {#getNameToSidIndex--}
```
public NameToCodeMap getNameToSidIndex()
```


返回名称到字符代码编码的映射。注意：字符代码不是 Unicode。字符代码是字体编码 \"table\" 中的字符索引。

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getSidName(int sid) {#getSidName-int-}
```
public String getSidName(int sid)
```


获取指定 SID 的名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| sid | int | String 标识符。 |

**Returns:**
java.lang.String - 如果找到，则来自 String INDEX 的名称。
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于 \\_font 类型。CFF 字体的 glyph id 可以是 ( GlyphStringId ) 类的实例或 ( GlyphUInt32Id ) 类的实例。

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


将 unicode 解码并返回 glyph id。Glyph id 是字形的唯一编号，取决于 \\_font 类型。CFF 字体的 glyph id 可以是 ( GlyphStringId ) 类的实例或 ( GlyphUInt32Id ) 类的实例。

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

