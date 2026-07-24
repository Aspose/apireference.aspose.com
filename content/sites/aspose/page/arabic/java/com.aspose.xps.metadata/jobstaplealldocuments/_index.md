---
title: "JobStapleAllDocuments"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يصف خصائص التثبيت للمخرجات."
type: docs
weight: 72
url: /ar/java/com.aspose.xps.metadata/jobstaplealldocuments/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Staple](../../com.aspose.xps.metadata/staple)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobStapleAllDocuments extends Staple implements IJobPrintTicketItem
```

يصف خصائص التجليد للإخراج. جميع المستندات في المهمة مُجَمعَة معًا بالتجليد. الكلمات المفتاحية  JobStapleAllDocuments  و  DocumentStaple  متعارضة ولا يمكن استخدامها معًا. يعود للبرنامج التعريفي (السائق) تحديد كيفية معالجة القيود بين هذه الكلمات المفتاحية. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobstaplealldocuments
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [JobStapleAllDocuments(Staple.StapleOption[] options)](#JobStapleAllDocuments-com.aspose.xps.metadata.Staple.StapleOption...-) | ينشئ مثيلًا جديدًا. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذه الميزة. |
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
### JobStapleAllDocuments(Staple.StapleOption[] options) {#JobStapleAllDocuments-com.aspose.xps.metadata.Staple.StapleOption...-}
```
public JobStapleAllDocuments(Staple.StapleOption[] options)
```


ينشئ مثيلًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [StapleOption\[\]](../../com.aspose.xps.metadata/stapleoption) | مصفوفة من الخيارات الخاصة بالميزة. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذه الميزة. يجب أن يكون كل عنصر إما Feature أو Option أو Property.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | قائمة العناصر للإضافة. |

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

