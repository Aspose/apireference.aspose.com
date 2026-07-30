---
title: "TtfVheaTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول hhea لملف الخط TTF."
type: docs
weight: 112
url: /ar/java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

يمثل جدول "hhea" لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | يحصل على AdvanceHeightMax. |
| [getAscent()](#getAscent--) | يحصل على Ascent. |
| [getCaretOffset()](#getCaretOffset--) | يحصل على CaretOffset. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | يحصل على CaretSlopeRise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | يحصل على CaretSlopeRun. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | يحصل على Descent. |
| [getLineGap()](#getLineGap--) | يحصل على LineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | يحصل على MetricDataFormat. |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | يحصل على MinBottomSideBearing. |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | يحصل على MinTopSideBearing. |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | يحصل على MetricDataFormat. |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [getVersion()](#getVersion--) | يحصل على رقم الإصدار لجدول الرأس العمودي. |
| [getYMaxExtent()](#getYMaxExtent--) | يحصل على \_yMaxExtent. |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


يحصل على AdvanceHeightMax. الحد الأقصى لقياس ارتفاع التقدم بوحدات FUnits الموجود في الخط.

**Returns:**
short - الـ AdvanceHeightMax.
### getAscent() {#getAscent--}
```
public short getAscent()
```


يحصل على Ascent. المسافة بوحدات FUnits من الخط المركزي إلى \_descent للخط السابق\\u2019s.

**Returns:**
short - الـ Ascent.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


يحصل على CaretOffset.

**Returns:**
short - الـ CaretOffset.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


يحصل على CaretSlopeRise.

**Returns:**
short - الـ CaretSlopeRise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


يحصل على CaretSlopeRun.

**Returns:**
short - الـ CaretSlopeRun.
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


يحصل على Descent. المسافة بوحدات FUnits من الخط المركزي إلى \_ascent للخط التالي\\u2019s.

**Returns:**
short - الـ Descent.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


يحصل على LineGap. الفجوة الطباعة العمودية لهذا الخط.

**Returns:**
short - الـ LineGap.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


يحصل على MetricDataFormat.

**Returns:**
short - الـ MetricDataFormat.
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


يحصل على MinBottomSideBearing. الحد الأدنى لقياس الجانب السفلي الموجود في الخط، بوحدات FUnits.

**Returns:**
short - الـ MinBottomSideBearing.
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


يحصل على MinTopSideBearing. الحد الأدنى لقياس sidebearing العلوي الموجود في الخط، بوحدات FUnits.

**Returns:**
short - ال MinTopSideBearing.
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


يحصل على MetricDataFormat. عدد ارتفاعات التقدم في جدول المقاييس العمودية.

**Returns:**
int - ال MetricDataFormat.
### getOffset() {#getOffset--}
```
public long getOffset()
```


يحصل على الإزاحة من بداية sfnt.

**Returns:**
long - إزاحة من بداية sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


يحصل على علامة الجدول.

**Returns:**
java.lang.String - الـ tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


مرجع إلى مستودع جدول TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


يحصل على رقم الإصدار لجدول الرأس العمودي.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


يحصل على \_yMaxExtent.

**Returns:**
short - ال \_yMaxExtent.
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

