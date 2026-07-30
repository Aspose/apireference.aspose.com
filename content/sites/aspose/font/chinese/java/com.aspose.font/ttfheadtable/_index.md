---
title: "TtfHeadTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的 head 表。"
type: docs
weight: 99
url: /zh/java/com.aspose.font/ttfheadtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHeadTable extends TtfTableBase
```

表示 TTF 字体文件的 "head" 表。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | 获取 uint32 checkSumAdjustment。 |
| [getClass()](#getClass--) |  |
| [getCreated()](#getCreated--) | 获取 longDateTime 创建的国际日期。 |
| [getFlags()](#getFlags--) | 获取 uint16 flags。 |
| [getFontDirectionHint()](#getFontDirectionHint--) | 获取 int16 fontDirectionHint。0 混合方向的字形；1 仅强左到右的字形；2 类似 1 但也包含中性字形；-1 仅强右到左的字形；-2 类似 -1 但也包含中性字形。 |
| [getFontRevision()](#getFontRevision--) | 获取 由字体制造商设置的 fixed fontRevision。 |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | 获取 int16 glyphDataFormat，0 表示当前格式。 |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | 获取 int16 indexToLocFormat，0 表示短偏移，1 表示长偏移。 |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | 获取 uint16 lowestRecPPEM，最小可读像素大小。 |
| [getMacStyle()](#getMacStyle--) | 获取 uint16 macStyle。 |
| [getMagicNumber()](#getMagicNumber--) | 获取 uint32 magicNumber，设置为 0x5F0F3CF5。 |
| [getModified()](#getModified--) | 获取 longDateTime 修改的国际日期。 |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [getUnitsPerEM()](#getUnitsPerEM--) | 获取 uint16 unitsPerEM，范围从 64 到 16384。 |
| [getVersion()](#getVersion--) | Fixed 版本 0x00010000（如果为 version 1.0）。 |
| [getXMax()](#getXMax--) | 获取所有字形边界框的 FWord xMax。 |
| [getXMin()](#getXMin--) | 获取所有字形边界框的 FWord xMin。 |
| [getYMax()](#getYMax--) | 获取所有字形边界框的 FWord yMax。 |
| [getYMin()](#getYMin--) | 获取所有字形边界框的 FWord yMin。 |
| [hashCode()](#hashCode--) |  |
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
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


获取 uint32 checkSumAdjustment。计算方法：将其设为 0，计算 'head' 表的校验和并放入表目录，按 uint32 对整个字体求和，然后存储 B1B0AFBA - sum。'head' 表的校验和不会出错。这样即可。

**Returns:**
long - Uint32 checkSumAdjustment。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreated() {#getCreated--}
```
public Date getCreated()
```


获取 longDateTime 创建的国际日期。

**Returns:**
java.util.Date - LongDateTime 创建的国际日期。
### getFlags() {#getFlags--}
```
public int getFlags()
```


获取 uint16 flags。

**Returns:**
int - UInt16 flags。
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


获取 int16 fontDirectionHint。0 混合方向的字形；1 仅强左到右的字形；2 类似 1 但也包含中性字形；-1 仅强右到左的字形；-2 类似 -1 但也包含中性字形。

**Returns:**
short - Int16 fontDirectionHint。
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


获取 由字体制造商设置的 fixed fontRevision。

**Returns:**
float - Fixed fontRevision 由字体制造商设置。
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


获取 int16 glyphDataFormat，0 表示当前格式。

**Returns:**
short - Int16 glyphDataFormat 0 表示当前格式。
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


获取 int16 indexToLocFormat，0 表示短偏移，1 表示长偏移。

**Returns:**
short - Int16 indexToLocFormat 0 表示短偏移，1 表示长偏移。
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


获取 uint16 lowestRecPPEM，最小可读像素大小。

**Returns:**
int - UInt16 lowestRecPPEM 最小可读像素尺寸。
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


获取 uint16 macStyle。

**Returns:**
int - UInt16 macStyle。
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


获取 uint32 magicNumber，设置为 0x5F0F3CF5。

**Returns:**
long - UInt32 magicNumber 设置为 0x5F0F3CF5。
### getModified() {#getModified--}
```
public Date getModified()
```


获取 longDateTime 修改的国际日期。

**Returns:**
java.util.Date - LongDateTime 已修改的国际日期。
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


获取 uint16 unitsPerEM，范围从 64 到 16384。

**Returns:**
long - UInt16 unitsPerEM 范围从 64 到 16384。
### getVersion() {#getVersion--}
```
public float getVersion()
```


Fixed 版本 0x00010000（如果为 version 1.0）。

**Returns:**
float - 固定版本 0x00010000（如果 version 1.0）。
### getXMax() {#getXMax--}
```
public short getXMax()
```


获取所有字形边界框的 FWord xMax。

**Returns:**
short - FWord xMax 用于所有字形边界框。
### getXMin() {#getXMin--}
```
public short getXMin()
```


获取所有字形边界框的 FWord xMin。

**Returns:**
short - FWord xMin 用于所有字形边界框。
### getYMax() {#getYMax--}
```
public short getYMax()
```


获取所有字形边界框的 FWord yMax。

**Returns:**
short - FWord yMax 用于所有字形边界框。
### getYMin() {#getYMin--}
```
public short getYMin()
```


获取所有字形边界框的 FWord yMin。

**Returns:**
short - FWord yMin 用于所有字形边界框。
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

