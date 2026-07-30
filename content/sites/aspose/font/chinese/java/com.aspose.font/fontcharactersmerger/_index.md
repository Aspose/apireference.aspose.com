---
title: "FontCharactersMerger"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "声明合并不同类型字体的功能。"
type: docs
weight: 35
url: /zh/java/com.aspose.font/fontcharactersmerger/
---
**Inheritance:**
java.lang.Object
```
public abstract class FontCharactersMerger
```

声明合并不同类型字体的功能。合并操作需要一对字体。该对中的一个字体被视为主字体。这意味着许多与最终合并字体相关的特性，如度量、编码结构等，将取自该主字体。另一字体（次要）仅为最终合并字体提供字形。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPrimaryFont()](#getPrimaryFont--) | 获取主字体。 |
| [getSecondaryFont()](#getSecondaryFont--) | 获取次要字体。 |
| [hashCode()](#hashCode--) |  |
| [mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | 根据传入的字形列表合并字体。 |
| [mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | 根据传入的字符代码列表合并字体。 |
| [mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | 此方法版本旨在用于您希望显式为结果字体中的字形设置字符代码的情况。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getPrimaryFont() {#getPrimaryFont--}
```
public abstract Font getPrimaryFont()
```


获取主字体。

**Returns:**
[Font](../../com.aspose.font/font) - The primary font.
### getSecondaryFont() {#getSecondaryFont--}
```
public abstract Font getSecondaryFont()
```


获取次要字体。

**Returns:**
[Font](../../com.aspose.font/font) - The secondary font.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName) {#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-}
```
public abstract Font mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)
```


根据传入的字形列表合并字体。为每个传入的字形搜索字符代码，并将找到的字符代码与相应的字形添加到结果新字体中。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| primaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | 从主字体中获取的字形列表。 |
| secondaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | 从次要字体中获取的字形列表。 |
| newFontName | java.lang.String | 结果字体的期望名称。 |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font
### mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract Font mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)
```


根据传入的字符代码列表合并字体。要创建期望的结果字体，只需传入您想要包含到结果字体中的原始字体的符号代码。与传入代码相关的字形将自动被找到。例如，如果您想从第一个字体中包含字母 A 和 B 相关的字形，并从第二个字体中包含字母 C 和 D 相关的字形，只需这样调用此方法：`mergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")`

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| primaryFontCharCodes | int[] | 从主字体中获取的代码。 |
| secondaryFontCharCodes | int[] | 从次要字体中获取的代码。 |
| newFontName | java.lang.String | 结果字体的期望名称。 |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract Font mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)
```


此方法版本旨在用于您希望显式为结果字体中的字形设置字符代码的情况。并不要求您提供的字形代码必须包含在原始字体中。传入的代码的目的是将其与结果字体中的相应字形标识符关联。因此，处理字典参数 [code, glyph identifier] 所传入的每一对的规则是，仅从原始字体中获取字形标识符，然后将其与结果字体中的相应代码链接。当第一个字体中的某些代码与第二个字体中的相同代码冲突时，这会非常有用。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| primaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | 来自主字体的 [symbol code, glyph identifier] 对应的字典。 |
| secondaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | 来自次要字体的 [symbol code, glyph identifier] 对应的字典。 |
| newFontName | java.lang.String | 结果字体的期望名称。 |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
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

