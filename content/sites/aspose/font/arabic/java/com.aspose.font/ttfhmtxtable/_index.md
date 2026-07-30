---
title: "TtfHmtxTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول hmtx لملف خط TTF."
type: docs
weight: 101
url: /ar/java/com.aspose.font/ttfhmtxtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHmtxTable extends TtfTableBase
```

يمثل جدول "hmtx" لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalAdvanceWidth()](#getAdditionalAdvanceWidth--) | في جدول hmtx قد تكون هناك حالات يكون فيها العدد الإجمالي للرموز غير مساوي لـ hhea.numberOfHMetrics. |
| [getClass()](#getClass--) |  |
| [getHMetrics()](#getHMetrics--) | يحصل على المقاييس الأفقية. |
| [getLeftSidebearings()](#getLeftSidebearings--) | يحصل على التحملات الجانبية اليسرى. |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
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
### getAdditionalAdvanceWidth() {#getAdditionalAdvanceWidth--}
```
public int getAdditionalAdvanceWidth()
```


في جدول hmtx قد تكون هناك حالات يكون فيها العدد الإجمالي للرموز غير مساوي لـ hhea.numberOfHMetrics. لهذه الحالات يحتوي جدول hmtx على مصفوفة إضافية 'leftSideBearing' التي تتطابق مع الخاصية LeftSidebearings. لكن الرموز ذات الفهارس من hhea.numOfLongHorMetrics إلى maxp.numGlyphs لها أيضًا عرض. وهذه العروض وفقًا للمواصفات الخاصة بجدول hmtx لها القيم التالية: "هنا يُفترض أن يكون advanceWidth هو نفسه advanceWidth للمدخل الأخير أعلاه".

**Returns:**
int - عرض إضافي متقدم.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHMetrics() {#getHMetrics--}
```
public TtfHmtxTable.MetricList getHMetrics()
```


يحصل على المقاييس الأفقية.

**Returns:**
[MetricList](../../com.aspose.font/metriclist) - Horizontal metrics.
### getLeftSidebearings() {#getLeftSidebearings--}
```
public short[] getLeftSidebearings()
```


يحصل على التحملات الجانبية اليسرى.

**Returns:**
short[] - التحملات الجانبية اليسرى.
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

