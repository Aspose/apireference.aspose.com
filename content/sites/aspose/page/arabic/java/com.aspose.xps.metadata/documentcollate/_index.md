---
title: "DocumentCollate"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يصف خصائص التجميع للإخراج."
type: docs
weight: 17
url: /ar/java/com.aspose.xps.metadata/documentcollate/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Collate](../../com.aspose.xps.metadata/collate)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentCollate extends Collate implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

يصف خصائص التجميع للإخراج. جميع الصفحات في كل مستند فردي يتم تجميعها. DocumentCollate و JobCollateAlldocuments متنافيان. سلوك وتنفيذ ما إذا كان يتم تنفيذ كلا هذين الكلمتين المفتاحيتين أو أحدهما فقط يُترك إلى برنامج التشغيل. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [DocumentCollate(Collate.CollateOption[] options)](#DocumentCollate-com.aspose.xps.metadata.Collate.CollateOption...-) | ينشئ مثيلًا جديدًا. |
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
### DocumentCollate(Collate.CollateOption[] options) {#DocumentCollate-com.aspose.xps.metadata.Collate.CollateOption...-}
```
public DocumentCollate(Collate.CollateOption[] options)
```


ينشئ مثيلًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [CollateOption\[\]](../../com.aspose.xps.metadata/collateoption) | مصفوفة من الخيارات الخاصة بالميزة. |

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

