---
title: "DocumentNUp"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يصف الإخراج وتنسيق صفحات منطقية متعددة إلى ورقة مادية واحدة."
type: docs
weight: 28
url: /ar/java/com.aspose.xps.metadata/documentnup/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentNUp extends NUp implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

يصف المخرجات وتنسيق عدة صفحات منطقية على ورقة مادية واحدة. يتم تجميع كل مستند بشكل منفصل.  DocumentNUp  و  JobNUpAllDocumentsContiguously  متنافيان. يعود إلى السائق تحديد كيفية معالجة القيود بين هاتين الكلمتين المفتاحيتين. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [DocumentNUp(NUp.INUpItem[] items)](#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-) | ينشئ مثيلًا جديدًا. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذه الميزة. |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | يضيف خيارًا مع قيمة خاصية متدرجة PagesPerSheet. |
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
### DocumentNUp(NUp.INUpItem[] items) {#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-}
```
public DocumentNUp(NUp.INUpItem[] items)
```


ينشئ مثيلًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| items | [INUpItem\[\]](../../com.aspose.xps.metadata/inupitem) | مصفوفة من العناصر الخاصة بالميزة. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذه الميزة. يجب أن يكون كل عنصر إما Feature أو Option أو Property.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | قائمة العناصر للإضافة. |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public DocumentNUp addPagesPerSheetOption(int value)
```


يضيف خيارًا مع قيمة خاصية متدرجة PagesPerSheet. يحدد عدد الصفحات المنطقية لكل ورقة مادية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
|  | القيمة | int | A |

```
PagesPerSheet
```

قيمة خاصية مُقيمة. يمكن أن تكون المجموعة المدعومة أي مجموعة من الأعداد الصحيحة مثل \{1,2,4,6,8,9,16\}. |

**Returns:**
[DocumentNUp](../../com.aspose.xps.metadata/documentnup) - This feature instance.
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

