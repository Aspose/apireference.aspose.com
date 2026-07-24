---
title: "BeforeSavingEventArgs"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يحدد الفئة الأساسية للوسائط الخاصة بمختلف أحداث before-saving."
type: docs
weight: 11
url: /ar/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

يحدد الفئة الأساسية للوسائط الخاصة بمختلف أحداث before-saving.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | يعيد رقم الصفحة المطلق الحالي عبر جميع المستندات داخل حزمة XPS. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | يعيد رقم المستند الحالي داخل حزمة XPS. |
| [getElementAPI()](#getElementAPI--) | يعيد API التعديل للعنصر الذي على وشك الحفظ. |
| [getOutputPageNumber()](#getOutputPageNumber--) | يعيد رقم الإخراج الحالي. |
| [getRelativePageNumber()](#getRelativePageNumber--) | يعيد رقم الصفحة الحالي بالنسبة إلى المستند الحالي داخل حزمة XPS. |
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
منطقي
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


يعيد رقم الصفحة المطلق الحالي عبر جميع المستندات داخل حزمة XPS.

**Returns:**
int - رقم الصفحة المطلق الحالي عبر جميع المستندات داخل حزمة XPS.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


يعيد رقم المستند الحالي داخل حزمة XPS.

**Returns:**
int - رقم المستند الحالي داخل حزمة XPS.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


يعيد API التعديل للعنصر الذي على وشك الحفظ.

**Returns:**
T - API التعديل للعنصر الذي على وشك الحفظ.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


يعيد رقم الإخراج الحالي. يختلف عن **AbsolutePageNumber** إذا تم تحديد خيار الحفظ **PageNumbers**.

**Returns:**
int - رقم الإخراج الحالي.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


يعيد رقم الصفحة الحالي بالنسبة إلى المستند الحالي داخل حزمة XPS.

**Returns:**
int - رقم الصفحة الحالي بالنسبة إلى المستند الحالي داخل حزمة XPS.
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

