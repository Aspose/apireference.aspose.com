---
title: "JobPrimaryCoverBack.CoverBackOption"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يصف خيارات ميزة JobPrimaryCoverBack."
type: docs
weight: 10
url: /ar/java/com.aspose.xps.metadata/jobprimarycoverback.coverbackoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverBack.CoverBackOption extends Option
```

يصف خيارات ميزة  JobPrimaryCoverBack .
## الحقول

| حقل | الوصف |
| --- | --- |
| [BlankCover](#BlankCover) | يحدد أنه يجب طباعة ورقة غلاف فارغة. |
| [NoCover](#NoCover) | يحدد عدم إخراج أي غلاف. |
| [PrintBack](#PrintBack) | يحدد أن الغلاف المشار إليه بـ \"CoverBackSource\" يجب طباعته على الجانب الخلفي من ورقة الغلاف. |
| [PrintBoth](#PrintBoth) | يحدد أن الغلاف المشار إليه بـ \"CoverBackSource\" قد يُطبع على أي من جانبي ورقة الغلاف. |
| [PrintFront](#PrintFront) | يحدد أن الغلاف المشار إليه بـ \"CoverBackSource\" يجب طباعته على الجانب الأمامي من ورقة الغلاف. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذا الخيار. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | يحصل على اسم العنصر. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverBack.CoverBackOption BlankCover
```


يحدد أنه يجب طباعة ورقة غلاف فارغة.

### NoCover {#NoCover}
```
public static final JobPrimaryCoverBack.CoverBackOption NoCover
```


يحدد عدم إخراج أي غلاف.

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBack
```


يحدد أن الغلاف المشار إليه بـ \"CoverBackSource\" يجب طباعته على الجانب الخلفي من ورقة الغلاف. إذا لم يتم تحديد عنصر  JobPrimaryCoverBackSource   ParameterInit ، يجب تجاهل هذا الخيار.

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBoth
```


يحدد أن الغلاف المشار إليه بـ \"CoverBackSource\" قد يُطبع على أي من جانبي ورقة الغلاف. إذا لم يتم تحديد عنصر  JobPrimaryCoverBackSource   ParameterInit ، يجب تجاهل هذا الخيار.

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintFront
```


يحدد أن الغلاف المشار إليه بـ \"CoverBackSource\" يجب طباعته على الجانب الأمامي من ورقة الغلاف. إذا لم يتم تحديد عنصر  JobPrimaryCoverBackSource   ParameterInit ، يجب تجاهل هذا الخيار.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذا الخيار. يجب أن يكون كل عنصر إما مثال ScoredProperty أو مثال Property.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | قائمة العناصر للإضافة. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getName() {#getName--}
```
public String getName()
```


يحصل على اسم العنصر.

**Returns:**
java.lang.String
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

