---
title: "JobPrimaryBannerSheet"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يصف ورقة الشعار التي سيتم إخراجها للوظيفة."
type: docs
weight: 64
url: /ar/java/com.aspose.xps.metadata/jobprimarybannersheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobPrimaryBannerSheet extends Feature implements IJobPrintTicketItem
```

يصف ورقة الشعار التي سيتم إخراجها للوظيفة. يجب إخراج ورقة الشعار باستخدام حجم الصفحة الافتراضي PageMediaSize واستخدام نوع وسائط الصفحة الافتراضي PageMediaType. يجب عزل ورقة الشعار عن باقي الوظيفة. هذا يعني أن أي خيارات إنهاء أو معالجة (مثل JobDuplexAllDocumentsContiguously أو JobStapleAllDocuments أو JobBindAllDocuments) يجب ألا تشمل ورقة الشعار. يجب أن تكون ورقة الشعار هي الورقة الأولى في الوظيفة.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options)](#JobPrimaryBannerSheet-com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption...-) | ينشئ مثيلًا جديدًا. |
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
### JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options) {#JobPrimaryBannerSheet-com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption...-}
```
public JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options)
```


ينشئ مثيلًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [BannerSheetOption\[\]](../../com.aspose.xps.metadata/bannersheetoption) | مصفوفة من الخيارات الخاصة بالميزة. |

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

