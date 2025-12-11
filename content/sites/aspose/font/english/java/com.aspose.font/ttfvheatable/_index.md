---
title: TtfVheaTable
second_title: Aspose.Font for Java API Reference
description: Represents hhea table of the TTF Font file.
type: docs
weight: 111
url: /java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

Represents "hhea" table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | Gets AdvanceHeightMax. |
| [getAscent()](#getAscent--) | Gets Ascent. |
| [getCaretOffset()](#getCaretOffset--) | Gets CaretOffset. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Gets CaretSlopeRise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Gets CaretSlopeRun. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | Gets Descent. |
| [getLineGap()](#getLineGap--) | Gets LineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Gets MetricDataFormat. |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | Gets MinBottomSideBearing. |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | Gets MinTopSideBearing. |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | Gets MetricDataFormat. |
| [getOffset()](#getOffset--) | Gets offset from beginning of sfnt. |
| [getTag()](#getTag--) | Gets table tag. |
| [getTtfTables()](#getTtfTables--) | Reference to TTF table repository. |
| [getVersion()](#getVersion--) | Gets Version number of the vertical header table. |
| [getYMaxExtent()](#getYMaxExtent--) | Gets \_yMaxExtent. |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


Gets AdvanceHeightMax. The maximum advance height measurement in FUnits found in the font.

**Returns:**
short - The AdvanceHeightMax.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Gets Ascent. Distance in FUnits from the centerline to the previous line\\u2019s \_descent.

**Returns:**
short - The Ascent.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Gets CaretOffset.

**Returns:**
short - The CaretOffset.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Gets CaretSlopeRise.

**Returns:**
short - The CaretSlopeRise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Gets CaretSlopeRun.

**Returns:**
short - The CaretSlopeRun.
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


Gets Descent. Distance in FUnits from the centerline to the next line\\u2019s \_ascent.

**Returns:**
short - The Descent.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Gets LineGap. The vertical typographic gap for this font.

**Returns:**
short - The LineGap.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Gets MetricDataFormat.

**Returns:**
short - The MetricDataFormat.
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


Gets MinBottomSideBearing. The minimum bottom sidebearing measurement found in the font, in FUnits.

**Returns:**
short - The MinBottomSideBearing.
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


Gets MinTopSideBearing. The minimum top sidebearing measurement found in the font, in FUnits.

**Returns:**
short - The MinTopSideBearing.
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


Gets MetricDataFormat. Number of advance heights in the vertical metrics table.

**Returns:**
int - The MetricDataFormat.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset from beginning of sfnt.

**Returns:**
long - Offset from beginning of sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - The tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Reference to TTF table repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


Gets Version number of the vertical header table.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


Gets \_yMaxExtent.

**Returns:**
short - The \_yMaxExtent.
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

