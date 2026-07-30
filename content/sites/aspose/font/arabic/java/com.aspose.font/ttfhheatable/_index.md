---
title: "TtfHheaTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول hhea لملف الخط TTF."
type: docs
weight: 100
url: /ar/java/com.aspose.font/ttfhheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHheaTable extends TtfTableBase
```

يمثل جدول "hhea" لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceWidthMax()](#getAdvanceWidthMax--) | يحصل على uFWord advanceWidthMax يجب أن يكون متسقًا مع المقاييس الأفقية. |
| [getAscent()](#getAscent--) | يحصل على الصعود. |
| [getCaretOffset()](#getCaretOffset--) | يحصل على إزاحة caret. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | يحصل على ارتفاع انحدار caret. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | يحصل على امتداد انحدار caret. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | يحصل على النزول. |
| [getLineGap()](#getLineGap--) | يحصل على الفجوة بين السطور. |
| [getMetricDataFormat()](#getMetricDataFormat--) | يحصل على تنسيق بيانات المقاييس. |
| [getMinLeftSideBearing()](#getMinLeftSideBearing--) | يحصل على قيمة MinLeftSideBearing. |
| [getMinRightSideBearing()](#getMinRightSideBearing--) | يحصل على قيمة MinRightSideBearing. |
| [getNumOfLongHorMetrics()](#getNumOfLongHorMetrics--) | يحصل على uint16 numOfLongHorMetrics عدد عرض التقدم في جدول المقاييس. |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [getVersion()](#getVersion--) | يحصل على الإصدار. |
| [getXMaxExtent()](#getXMaxExtent--) | يحصل على قيمة XMaxExtent. |
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
### getAdvanceWidthMax() {#getAdvanceWidthMax--}
```
public int getAdvanceWidthMax()
```


يحصل على uFWord advanceWidthMax يجب أن يكون متسقًا مع المقاييس الأفقية.

**Returns:**
int - uFWord advanceWidthMax يجب أن يكون متسقًا مع المقاييس الأفقية.
### getAscent() {#getAscent--}
```
public short getAscent()
```


يحصل على الصعود.

**Returns:**
short - ال ascent.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


يحصل على إزاحة caret.

**Returns:**
short - ال offset of the caret.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


يحصل على ارتفاع انحدار caret.

**Returns:**
short - ال caret slop rise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


يحصل على امتداد انحدار caret.

**Returns:**
short - ال caret slop run.
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


يحصل على النزول.

**Returns:**
short - النزول.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


يحصل على الفجوة بين السطور.

**Returns:**
short - الفجوة بين السطور.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


يحصل على تنسيق بيانات المقاييس.

**Returns:**
short - تنسيق بيانات المقاييس.
### getMinLeftSideBearing() {#getMinLeftSideBearing--}
```
public short getMinLeftSideBearing()
```


يحصل على قيمة MinLeftSideBearing.

**Returns:**
short - قيمة MinLeftSideBearing.
### getMinRightSideBearing() {#getMinRightSideBearing--}
```
public short getMinRightSideBearing()
```


يحصل على قيمة MinRightSideBearing.

**Returns:**
short - قيمة MinRightSideBearing.
### getNumOfLongHorMetrics() {#getNumOfLongHorMetrics--}
```
public int getNumOfLongHorMetrics()
```


يحصل على uint16 numOfLongHorMetrics عدد عرض التقدم في جدول المقاييس.

**Returns:**
int - UInt16 numOfLongHorMetrics عدد عرض التقدم في جدول المقاييس.
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
java.lang.String - علامة الجدول.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


مرجع إلى مستودع جدول TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public float getVersion()
```


يحصل على الإصدار.

**Returns:**
float - نسخة تنسيق الجدول.
### getXMaxExtent() {#getXMaxExtent--}
```
public short getXMaxExtent()
```


يحصل على قيمة XMaxExtent.

**Returns:**
short - قيمة XMaxExtent.
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

