---
title: "TtfPostTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的 post 表"
type: docs
weight: 107
url: /zh/java/com.aspose.font/ttfposttable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfPostTable extends TtfTableBase
```

表示 "post" 表的 TTF 字体文件
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | 通过字形名称获取字形索引数组 |
| [getClass()](#getClass--) |  |
| [getFormat()](#getFormat--) | 获取此表的固定格式（版本）。 |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | 通过字形名称获取字形索引。 |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | 通过字形索引获取字形名称。 |
| [getItalicAngle()](#getItalicAngle--) | 获取 fixed italicAngle（以度为单位的斜体角度）。 |
| [getMaxMemType1()](#getMaxMemType1--) | 获取 uint32 maxMemType1（当 TrueType Font 以 Type 1 Font 下载时的最大内存使用量）。 |
| [getMaxMemType42()](#getMaxMemType42--) | 获取 uint32 maxMemType42（当 TrueType font 以 Type 42 Font 下载时的最大内存使用量）。 |
| [getMinMemType1()](#getMinMemType1--) | 获取 uint32 minMemType1（当 TrueType Font 以 Type 1 Font 下载时的最小内存使用量）。 |
| [getMinMemType42()](#getMinMemType42--) | 获取 uint32 minMemType42（当 TrueType font 以 Type 42 Font 下载时的最小内存使用量）。 |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getTableFormat()](#getTableFormat--) | 获取 fixed format（此表的版本）。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [getUnderlinePosition()](#getUnderlinePosition--) | 获取 FWord underlinePosition（下划线位置）。 |
| [getUnderlineThickness()](#getUnderlineThickness--) | 获取 FWord underlineThickness（下划线粗细）。 |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | 指示此字体文件中的字形未提供 PostScript 名称信息。 |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | 获取 uint32 isFixedPitch。若字体是比例间距则为 0，若字体不是比例间距（即等宽）则为非零。 |
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
### getAllGlyphIndexesForGlyphName(String glyphName) {#getAllGlyphIndexesForGlyphName-java.lang.String-}
```
public long[] getAllGlyphIndexesForGlyphName(String glyphName)
```


通过字形名称获取字形索引数组

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | java.lang.String | 字形名称 |

**Returns:**
long[] - 字形索引数组
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFormat() {#getFormat--}
```
public float getFormat()
```


获取此表的固定格式（版本）。

**Returns:**
float - Fixed format（此表的版本）。
### getGlyphIndex(String glyphName) {#getGlyphIndex-java.lang.String-}
```
public long getGlyphIndex(String glyphName)
```


通过字形名称获取字形索引。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | java.lang.String | 字形名称。 |

**Returns:**
long - 字形索引。当此字体文件的字形未提供 PostScript 名称信息时，返回索引 0，即未定义字形或 ".notdef" 字形。
### getGlyphName(long glyphIndex) {#getGlyphName-long-}
```
public String getGlyphName(long glyphIndex)
```


通过字形索引获取字形名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphIndex | long | 字形索引。 |

**Returns:**
java.lang.String - 字形名称。当此字体文件的字形未提供 PostScript 名称信息时，返回 null。
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


获取 fixed italicAngle（以度为单位的斜体角度）。

**Returns:**
float - Fixed italicAngle（以度为单位的斜体角度）。
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


获取 uint32 maxMemType1（当 TrueType Font 以 Type 1 Font 下载时的最大内存使用量）。

**Returns:**
long - UInt32 maxMemType1（当 TrueType Font 以 Type 1 Font 下载时的最大内存使用量）。
### getMaxMemType42() {#getMaxMemType42--}
```
public long getMaxMemType42()
```


获取 uint32 maxMemType42（当 TrueType font 以 Type 42 Font 下载时的最大内存使用量）。

**Returns:**
long - UInt32 maxMemType42（当 TrueType font 以 Type 42 Font 下载时的最大内存使用量）。
### getMinMemType1() {#getMinMemType1--}
```
public long getMinMemType1()
```


获取 uint32 minMemType1（当 TrueType Font 以 Type 1 Font 下载时的最小内存使用量）。

**Returns:**
long - UInt32 minMemType1（当 TrueType Font 以 Type 1 Font 下载时的最小内存使用量）。
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


获取 uint32 minMemType42（当 TrueType font 以 Type 42 Font 下载时的最小内存使用量）。

**Returns:**
long - UInt32 minMemType42（当 TrueType font 以 Type 42 Font 下载时的最小内存使用量）。
### getOffset() {#getOffset--}
```
public long getOffset()
```


获取自 sfnt 开始的偏移量。

**Returns:**
long - 自 sfnt 开始的偏移量。
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


获取 fixed format（此表的版本）。使用对象 Version16Dot16 的属性 MajorNumber 和 MinorNUmber（十六进制表示）来检测使用的版本。

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
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
### getUnderlinePosition() {#getUnderlinePosition--}
```
public short getUnderlinePosition()
```


获取 FWord underlinePosition（下划线位置）。

**Returns:**
short - FWord underlinePosition（下划线位置）。
### getUnderlineThickness() {#getUnderlineThickness--}
```
public short getUnderlineThickness()
```


获取 FWord underlineThickness（下划线粗细）。

**Returns:**
short - FWord underlineThickness（下划线粗细）。
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


指示此字体文件中的字形未提供 PostScript 名称信息。

**Returns:**
boolean - 若此字体文件的字形未提供 PostScript 名称信息则为 True，否则为 False。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public long isFixedPitch()
```


获取 uint32 isFixedPitch。若字体是比例间距则为 0，若字体不是比例间距（即等宽）则为非零。

**Returns:**
long - UInt32 isFixedPitch。若字体是比例间距则为 0，若字体不是比例间距（即等宽）则为非零。
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

