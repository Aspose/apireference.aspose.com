---
title: "AxisValueTableFormat2"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل تنسيق جدول قيمة المحور 2"
type: docs
weight: 14
url: /ar/java/com.aspose.font/axisvaluetableformat2/
---
**Inheritance:**
java.lang.Object، [com.aspose.font.AxisValueTableBase](../../com.aspose.font/axisvaluetablebase)
```
public class AxisValueTableFormat2 extends AxisValueTableBase
```

يمثل تنسيق جدول قيمة المحور 2
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue)](#AxisValueTableFormat2-int-int-int-float-float-float-) | منشئ |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisIndex()](#getAxisIndex--) | يحصل على الفهرس Zero-base في مصفوفة axis record التي تحدد محور design variation الذي ينطبق عليه axis value table. |
| [getClass()](#getClass--) |  |
| [getFlags()](#getFlags--) | يحصل على حقل أعلام جدول قيم المحور. |
| [getFormat()](#getFormat--) | يحصل على معرف التنسيق (رقم الإصدار). |
| [getNominalValue()](#getNominalValue--) | قيمة عددية اسمية |
| [getRangeMaxValue()](#getRangeMaxValue--) | القيمة القصوى لنطاق مرتبط بمعرف الاسم المحدد. |
| [getRangeMinValue()](#getRangeMinValue--) | القيمة الدنيا لنطاق مرتبط بمعرف الاسم المحدد. |
| [getValueName()](#getValueName--) | يحصل على الاسم من جدول 'name' الذي يوفر سلسلة عرض لهذه قيمة السمة. |
| [getValueNameId()](#getValueNameId--) | يحصل على معرف الاسم للمدخلات في جدول 'name' الذي يوفر سلسلة عرض لهذه قيمة السمة. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue) {#AxisValueTableFormat2-int-int-int-float-float-float-}
```
public AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue)
```


منشئ

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الأعلام | int | الأعلام |
| valueNameId | int | معرف الاسم للمدخلات في جدول 'name' الذي يوفر سلسلة عرض لهذه قيمة السمة |
| axisIndex | int | المواصفة: فهرس Zero-base في مصفوفة سجلات المحور التي تحدد محور التباين التصميمي الذي ينطبق عليه جدول قيم المحور. يجب أن يكون أقل من designAxisCount. |
| nominalValue | float | القيمة الرقمية الاسمية لهذه القيمة السمة. |
| rangeMinValue | float | القيمة الدنيا لنطاق مرتبط بمعرف الاسم المحدد. |
| rangeMaxValue | float | القيمة القصوى لنطاق مرتبط بمعرف الاسم المحدد. |

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
### getAxisIndex() {#getAxisIndex--}
```
public int getAxisIndex()
```


يحصل على الفهرس Zero-base في مصفوفة axis record التي تحدد محور design variation الذي ينطبق عليه axis value table.

**Returns:**
int - الفهرس القاعدي الصفري في مصفوفة سجلات المحور التي تحدد محور تنوع التصميم الذي ينطبق عليه جدول قيم المحور.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFlags() {#getFlags--}
```
public int getFlags()
```


يحصل على حقل أعلام جدول قيم المحور.

**Returns:**
int - حقل أعلام جدول قيم المحور.
### getFormat() {#getFormat--}
```
public int getFormat()
```


يحصل على معرف التنسيق (رقم الإصدار).

**Returns:**
int - معرف التنسيق (رقم الإصدار).
### getNominalValue() {#getNominalValue--}
```
public float getNominalValue()
```


قيمة عددية اسمية

**Returns:**
float - قيمة رقمية اسمية
### getRangeMaxValue() {#getRangeMaxValue--}
```
public float getRangeMaxValue()
```


القيمة القصوى لنطاق مرتبط بمعرف الاسم المحدد.

**Returns:**
float - القيمة القصوى لنطاق مرتبط بمعرف الاسم المحدد.
### getRangeMinValue() {#getRangeMinValue--}
```
public float getRangeMinValue()
```


القيمة الدنيا لنطاق مرتبط بمعرف الاسم المحدد.

**Returns:**
float - القيمة الدنيا لنطاق مرتبط بمعرف الاسم المحدد.
### getValueName() {#getValueName--}
```
public String getValueName()
```


يحصل على الاسم من جدول 'name' الذي يوفر سلسلة عرض لهذه قيمة السمة.

**Returns:**
java.lang.String - الاسم من جدول 'name' الذي يوفر سلسلة عرض لهذه القيمة السمة.
### getValueNameId() {#getValueNameId--}
```
public int getValueNameId()
```


يحصل على معرف الاسم للمدخلات في جدول 'name' الذي يوفر سلسلة عرض لهذه قيمة السمة.

**Returns:**
int - معرّف الاسم للمدخلات في جدول 'name' الذي يوفر سلسلة عرض لهذه القيمة السمة.
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

