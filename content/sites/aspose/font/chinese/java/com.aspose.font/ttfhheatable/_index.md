---
title: "TtfHheaTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的 hhea 表。"
type: docs
weight: 100
url: /zh/java/com.aspose.font/ttfhheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHheaTable extends TtfTableBase
```

表示 "hhea" 表的 TTF 字体文件。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceWidthMax()](#getAdvanceWidthMax--) | 获取 uFWord advanceWidthMax 必须与水平度量保持一致。 |
| [getAscent()](#getAscent--) | 获取上升值。 |
| [getCaretOffset()](#getCaretOffset--) | 获取插入符号的偏移量。 |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | 获取插入符号倾斜上升。 |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | 获取插入符号倾斜水平。 |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | 获取下降值。 |
| [getLineGap()](#getLineGap--) | 获取行间距。 |
| [getMetricDataFormat()](#getMetricDataFormat--) | 获取度量数据的格式。 |
| [getMinLeftSideBearing()](#getMinLeftSideBearing--) | 获取 MinLeftSideBearing 值。 |
| [getMinRightSideBearing()](#getMinRightSideBearing--) | 获取 MinRightSideBearing 值。 |
| [getNumOfLongHorMetrics()](#getNumOfLongHorMetrics--) | 获取 uint16 numOfLongHorMetrics，度量表中前进宽度的数量。 |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [getVersion()](#getVersion--) | 获取版本。 |
| [getXMaxExtent()](#getXMaxExtent--) | 获取 XMaxExtent 值。 |
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
### getAdvanceWidthMax() {#getAdvanceWidthMax--}
```
public int getAdvanceWidthMax()
```


获取 uFWord advanceWidthMax 必须与水平度量保持一致。

**Returns:**
int - uFWord advanceWidthMax 必须与水平度量保持一致。
### getAscent() {#getAscent--}
```
public short getAscent()
```


获取上升值。

**Returns:**
short - 上升值。
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


获取插入符号的偏移量。

**Returns:**
short - 插入符号的偏移量。
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


获取插入符号倾斜上升。

**Returns:**
short - 插入符号倾斜上升。
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


获取插入符号倾斜水平。

**Returns:**
short - 插入符号倾斜水平。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDescent() {#getDescent--}
```
public short getDescent()
```


获取下降值。

**Returns:**
short - 下沉。
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


获取行间距。

**Returns:**
short - 行间距。
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


获取度量数据的格式。

**Returns:**
short - 度量数据的格式。
### getMinLeftSideBearing() {#getMinLeftSideBearing--}
```
public short getMinLeftSideBearing()
```


获取 MinLeftSideBearing 值。

**Returns:**
short - 最小左侧间距值。
### getMinRightSideBearing() {#getMinRightSideBearing--}
```
public short getMinRightSideBearing()
```


获取 MinRightSideBearing 值。

**Returns:**
short - 最小右侧间距值。
### getNumOfLongHorMetrics() {#getNumOfLongHorMetrics--}
```
public int getNumOfLongHorMetrics()
```


获取 uint16 numOfLongHorMetrics，度量表中前进宽度的数量。

**Returns:**
int - UInt16 numOfLongHorMetrics 度量表中前进宽度的数量。
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
### getVersion() {#getVersion--}
```
public float getVersion()
```


获取版本。

**Returns:**
float - 表格格式版本。
### getXMaxExtent() {#getXMaxExtent--}
```
public short getXMaxExtent()
```


获取 XMaxExtent 值。

**Returns:**
short - XMaxExtent 值。
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

