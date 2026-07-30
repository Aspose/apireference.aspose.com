---
title: "AxisRecord"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل بنية سجل المحور."
type: docs
weight: 10
url: /ar/java/com.aspose.font/axisrecord/
---
**Inheritance:**
java.lang.Object
```
public class AxisRecord
```

يمثل بنية Axis Record. Spec: سجل المحور يوفر معلومات حول محور تصميم واحد.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [AxisRecord(String tag, int axisNameId, int axisOrdering)](#AxisRecord-java.lang.String-int-int-) | منشئ |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisNameId()](#getAxisNameId--) | يعيد حقل axisNameID. |
| [getAxisOrdering()](#getAxisOrdering--) | يعيد حقل axisOrdering. |
| [getClass()](#getClass--) |  |
| [getTag()](#getTag--) | يعيد tag يحدد محور التباين التصميمي. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisRecord(String tag, int axisNameId, int axisOrdering) {#AxisRecord-java.lang.String-int-int-}
```
public AxisRecord(String tag, int axisNameId, int axisOrdering)
```


منشئ

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| tag | java.lang.String | Tag، spec: علامة تحدد محور التباين التصميمي |
| axisNameId | int | معرف الاسم للمدخلات في جدول 'name' التي توفر سلسلة عرض لهذا المحور |
| axisOrdering | int | القيمة التي يمكن للتطبيقات استخدامها لتحديد الترتيب الأساسي لأسماء الوجوه، أو لترتيب التسميات عند تكوين أسماء العائلة أو الوجوه. |

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
### getAxisNameId() {#getAxisNameId--}
```
public int getAxisNameId()
```


يعيد حقل axisNameID. Spec: حقل axisNameID يوفر معرف اسم يمكن استخدامه للحصول على سلاسل من جدول 'name' يمكن استخدامها للإشارة إلى المحور في واجهات المستخدم للتطبيق.

**Returns:**
int - حقل axisNameID.
### getAxisOrdering() {#getAxisOrdering--}
```
public int getAxisOrdering()
```


يعيد حقل axisOrdering. Spec: قيمة يمكن للتطبيقات استخدامها لتحديد الترتيب الأساسي لأسماء الوجوه، أو لترتيب التسميات عند تكوين أسماء العائلة أو الوجوه.

**Returns:**
int - حقل axisOrdering.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTag() {#getTag--}
```
public String getTag()
```


يعيد tag يحدد محور التباين التصميمي. Spec: كل سجل محور يحتوي على tag يحدد المحور. يجب أن تتبع قيم Tag القواعد الخاصة بوسوم المحور الموضحة في سجل وسوم محور التباين التصميمي OpenType.

**Returns:**
java.lang.String - tag يحدد محور التباين التصميمي.
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

