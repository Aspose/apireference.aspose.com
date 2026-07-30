---
title: "GlyphId"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示字体中可用的字形 ID。"
type: docs
weight: 50
url: /zh/java/com.aspose.font/glyphid/
---
**Inheritance:**
java.lang.Object
```
public abstract class GlyphId
```

表示字体中可用的字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ( GlyphStringId ) 类的实例。TTF 的 ID 是整数索引，属于 ( GlyphUInt32Id ) 类的实例。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | 如果两个字形 ID 不相等则返回 true。 |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | 返回对象的哈希码。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | 如果两个字形 ID 相等则返回 true。 |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | 如果两个字形 ID 不相等则返回 true。 |
| [toGlyphStringId()](#toGlyphStringId--) | 虚拟转换为 GlyphStringId。 |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | 虚拟转换为 GlyphUInt32Id。 |
| [toString()](#toString--) | 返回字形 ID 的字符串表示。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


如果两个字形 ID 不相等则返回 true。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | java.lang.Object | 用于比较的字形标识符。 |

**Returns:**
boolean - 比较结果。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


返回对象的哈希码。

**Returns:**
int - 对象的哈希码。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(GlyphId obj1, Object obj2) {#op-Equality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Equality(GlyphId obj1, Object obj2)
```


如果两个字形 ID 相等则返回 true。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | 用于比较的第一个 glyph 标识符。 |
| obj2 | java.lang.Object | 用于比较的第二个 glyph 标识符。 |

**Returns:**
boolean - 比较结果。
### op_Inequality(GlyphId obj1, Object obj2) {#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Inequality(GlyphId obj1, Object obj2)
```


如果两个字形 ID 不相等则返回 true。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | 用于比较的第一个 glyph 标识符。 |
| obj2 | java.lang.Object | 用于比较的第二个 glyph 标识符。 |

**Returns:**
boolean - 比较结果。
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


对 GlyphStringId 的虚拟强制转换。GlyphStringId 重写以返回实例。

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


虚拟转换为 GlyphUInt32Id。GlyphUInt32Id 重写以返回实例。

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public abstract String toString()
```


返回字形 ID 的字符串表示。

**Returns:**
java.lang.String - 字形标识符
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

