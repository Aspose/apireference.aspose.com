---
title: "TtfStatTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: 
type: docs
weight: 109
url: /ar/java/com.aspose.font/ttfstattable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfStatTable extends TtfTableBase
```
## الطرق

| طريقة | الوصف |
| --- | --- |
| [addAxisRecord(AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.AxisRecord-) | يضيف بنية سجل المحور إلى الجدول. |
| [addAxisValueTable(AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.AxisValueTableBase-) | يضيف بنية جدول قيمة المحور إلى الجدول. |
| [clearAxisRecords()](#clearAxisRecords--) | يزيل جميع سجلات المحور من الجدول. |
| [clearAxisValueTables()](#clearAxisValueTables--) | يزيل جميع جداول قيم المحور من الجدول. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisRecords()](#getAxisRecords--) | يعيد مصفوفة محاور التصميم. |
| [getAxisValueCount()](#getAxisValueCount--) | يعيد عدد جداول قيم المحور. |
| [getAxisValueTables()](#getAxisValueTables--) | يعيد مصفوفة من جداول قيم المحور. |
| [getClass()](#getClass--) |  |
| [getDesignAxisCount()](#getDesignAxisCount--) | يعيد عدد سجلات المحور. |
| [getElidedFallbackName()](#getElidedFallbackName--) | المواصفة: الاسم المستخدم كبديل عندما ينتج إسقاط الأسماء إلى نموذج خط معين اسمًا فرعيًا يحتوي فقط على عناصر يمكن حذفها. |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | المواصفة: معرّف الاسم المستخدم كبديل عندما ينتج إسقاط الأسماء إلى نموذج خط معين اسمًا فرعيًا يحتوي فقط على عناصر يمكن حذفها. |
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
### addAxisRecord(AxisRecord axisRecord) {#addAxisRecord-com.aspose.font.AxisRecord-}
```
public void addAxisRecord(AxisRecord axisRecord)
```


يضيف بنية سجل المحور إلى الجدول.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | بنية AxisRecord |

### addAxisValueTable(AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.AxisValueTableBase-}
```
public void addAxisValueTable(AxisValueTableBase axisValueTable)
```


يضيف بنية جدول قيمة المحور إلى الجدول.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | بنية جدول قيمة المحور |

### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


يزيل جميع سجلات المحور من الجدول.

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


يزيل جميع جداول قيم المحور من الجدول.

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
### getAxisRecords() {#getAxisRecords--}
```
public AxisRecord[] getAxisRecords()
```


يعيد مصفوفة محاور التصميم. مصفوفة المحاور هي مصفوفة من البنى من نوع سجل المحور. المواصفة: سجل المحور يوفر معلومات حول محور تصميم واحد.

**Returns:**
com.aspose.font.AxisRecord[] - مصفوفة محاور التصميم.
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


يعيد عدد جداول قيم المحور.

**Returns:**
int - عدد جداول قيم المحور.
### getAxisValueTables() {#getAxisValueTables--}
```
public AxisValueTableBase[] getAxisValueTables()
```


يعيد مصفوفة من جداول قيم المحور. المواصفة: جداول قيم المحور توفر تفاصيل حول قيمة سمة نمطية محددة على محور معين من تباين التصميم، أو مزيج من قيم محاور تباين التصميم، والعلاقة بين تلك القيم والملصقات المستخدمة كعناصر في الأسماء الفرعية.

**Returns:**
com.aspose.font.AxisValueTableBase[] - مصفوفة جداول قيم المحور.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDesignAxisCount() {#getDesignAxisCount--}
```
public int getDesignAxisCount()
```


يعيد عدد سجلات المحور. المواصفة: في خط يحتوي على جدول 'fvar'، يجب أن تكون هذه القيمة أكبر من أو تساوي قيمة axisCount في جدول 'fvar'. في جميع الخطوط، يجب أن تكون أكبر من الصفر إذا كان axisValueCount أكبر من الصفر.

**Returns:**
int - عدد سجلات المحور.
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


المواصفة: الاسم المستخدم كبديل عندما ينتج إسقاط الأسماء إلى نموذج خط معين اسمًا فرعيًا يحتوي فقط على عناصر يمكن حذفها.

**Returns:**
java.lang.String - الاسم المستخدم كاحتياطي عندما ينتج إسقاط الأسماء إلى نموذج خط معين اسمًا فرعيًا يحتوي فقط على عناصر قابلة للحذف.
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


المواصفة: معرّف الاسم المستخدم كبديل عندما ينتج إسقاط الأسماء إلى نموذج خط معين اسمًا فرعيًا يحتوي فقط على عناصر يمكن حذفها.

**Returns:**
int - معرّف الاسم.
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

