---
title: "PageDestinationColorProfileURI"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يحدد إشارة URI نسبية إلى ملف تعريف ICC موجود في مستند XPS."
type: docs
weight: 93
url: /ar/java/com.aspose.xps.metadata/pagedestinationcolorprofileuri/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageDestinationColorProfileURI extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

يحدد مرجع URI نسبي لملف تعريف ICC موجود في مستند XPS. يعتمد معالجة هذا الخيار على إعداد ميزة PageDeviceColorSpaceUsage. يُفترض أن جميع العناصر التي تستخدم هذا الملف موجودة بالفعل في مساحة اللون المناسبة للجهاز، ولن يتم إدارة اللون لها في برنامج التشغيل أو الجهاز. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedestinationcolorprofileuri
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [PageDestinationColorProfileURI(String value)](#PageDestinationColorProfileURI-java.lang.String-) | ينشئ مثيلًا جديدًا. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | للقيم النصية، يحدد أقصر وأطول سلسلة. |
| [getMinLength()](#getMinLength--) | للقيم النصية، يحدد أقصر سلسلة مسموح بها. |
| [getName()](#getName--) | يحصل على اسم العنصر. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageDestinationColorProfileURI(String value) {#PageDestinationColorProfileURI-java.lang.String-}
```
public PageDestinationColorProfileURI(String value)
```


ينشئ مثيلًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | قيمة المعلمة. |

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
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


للقيم النصية، يحدد أقصر وأطول سلسلة.

**Returns:**
int - أطول سلسلة مسموح بها.
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


للقيم النصية، يحدد أقصر سلسلة مسموح بها.

**Returns:**
int - أقصر سلسلة مسموح بها.
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

