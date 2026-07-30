---
title: "TtfVheaTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的 hhea 表。"
type: docs
weight: 112
url: /zh/java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

表示 "hhea" 表的 TTF 字体文件。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | 获取 AdvanceHeightMax。 |
| [getAscent()](#getAscent--) | 获取上升高度。 |
| [getCaretOffset()](#getCaretOffset--) | 获取插入符号偏移。 |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | 获取插入符号斜率上升。 |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | 获取插入符号斜率运行。 |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | 获取下降高度。 |
| [getLineGap()](#getLineGap--) | 获取行间距。 |
| [getMetricDataFormat()](#getMetricDataFormat--) | 获取度量数据格式。 |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | 获取最小底部侧边距。 |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | 获取最小顶部侧边距。 |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | 获取度量数据格式。 |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [getVersion()](#getVersion--) | 获取垂直标题表的版本号。 |
| [getYMaxExtent()](#getYMaxExtent--) | 获取 \_yMaxExtent。 |
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
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


获取 AdvanceHeightMax。字体中以 FUnits 为单位的最大前进高度测量值。

**Returns:**
short - AdvanceHeightMax。
### getAscent() {#getAscent--}
```
public short getAscent()
```


获取上升。以 FUnits 为单位的距离，从中心线到前一行\\u2019s \\_descent。

**Returns:**
short - 上升。
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


获取插入符号偏移。

**Returns:**
short - 插入符号偏移。
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


获取插入符号斜率上升。

**Returns:**
short - 插入符号斜率上升。
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


获取插入符号斜率运行。

**Returns:**
short - 插入符号斜率运行。
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


获取下降。以 FUnits 为单位的距离，从中心线到下一行\\u2019s \\_ascent。

**Returns:**
short - 下降。
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


获取行间距。此字体的垂直排版间隙。

**Returns:**
short - 行间距。
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


获取度量数据格式。

**Returns:**
short - 度量数据格式。
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


获取最小底部侧边距。字体中以 FUnits 为单位的最小底部侧边距测量值。

**Returns:**
short - 最小底部侧边距。
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


获取 MinTopSideBearing。 在字体中找到的最小顶部侧边距测量值，单位为 FUnits。

**Returns:**
short - 该 MinTopSideBearing。
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


获取 MetricDataFormat。 垂直度量表中的前进高度数量。

**Returns:**
int - 该 MetricDataFormat。
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
java.lang.String - 该标签。
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


指向 TTF 表仓库的引用。

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


获取垂直标题表的版本号。

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


获取 \_yMaxExtent。

**Returns:**
short - 该 \_yMaxExtent。
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

