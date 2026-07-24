---
title: "Property"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "الفئة التي تنفذ خاصية تذكرة الطباعة."
type: docs
weight: 143
url: /ar/java/com.aspose.xps.metadata/property/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem), [com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem), [com.aspose.xps.metadata.IPropertyItem](../../com.aspose.xps.metadata/ipropertyitem)
```
public class Property extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem, IOptionItem, IScoredPropertyItem, IPropertyItem
```

فئة تنفّذ خاصية تذكرة الطباعة. الفئة التي تنفّذ خاصية PrintTicket الشائعة. الفئة الأساسية لجميع الخصائص المعرفة في المخطط. عنصر Property يعلن عن جهاز أو تنسيق وظيفة أو أي خاصية ذات صلة يُعطى اسمها بواسطة سمة الاسم. يُستخدم عنصر Value لتعيين قيمة للـ Property. يمكن أن تكون الـ Property معقدة، وربما تحتوي على خصائص فرعية متعددة. كما تُمثَّل الخصائص الفرعية بعناصر Property. https://docs.microsoft.com/en-us/windows/win32/printdocs/property
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [Property(String name, Property property, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-) | ينشئ مثيلًا جديدًا. |
| [Property(String name, Value value, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-) | ينشئ مثيلًا جديدًا. |
## الطرق

| طريقة | الوصف |
| --- | --- |
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
### Property(String name, Property property, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Property property, IPropertyItem[] items)
```


ينشئ مثيلًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String | اسم خاصية. |
| property | [Property](../../com.aspose.xps.metadata/property) | مثيل Property إلزامي. |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | مصفوفة عشوائية من مثيلات IPropertyItem. يجب أن يكون كل منها إما مثيل Property أو مثيل Value. |

### Property(String name, Value value, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Value value, IPropertyItem[] items)
```


ينشئ مثيلًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String | اسم خاصية. |
| value | [Value](../../com.aspose.xps.metadata/value) | مثال إلزامي لـ Value. |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | مصفوفة عشوائية من مثيلات IPropertyItem. يجب أن يكون كل منها إما مثيل Property أو مثيل Value. |

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

