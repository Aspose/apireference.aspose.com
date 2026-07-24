---
title: "ميزة"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "الفئة التي تُغلف ميزة مخطط طباعة شائعة."
type: docs
weight: 38
url: /ar/java/com.aspose.xps.metadata/feature/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Feature extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem
```

الفئة التي تُغلف ميزة مخطط الطباعة العامة. الفئة الأساسية لجميع الميزات المعرفة بالمخطط. عنصر  Feature  يحتوي على قائمة كاملة بعناصر  Option  و  Property  التي تصف بالكامل سمة الجهاز أو إعداد تنسيق المهمة أو أي خاصية ذات صلة أخرى. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [Feature(String name, Option option, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-) | ينشئ مثيل ميزة PrintTicket جديد. |
| [Feature(String name, Feature feature, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-) | ينشئ مثيل ميزة PrintTicket جديد. |
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
### Feature(String name, Option option, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Option option, IFeatureItem[] items)
```


ينشئ مثيل ميزة PrintTicket جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String | اسم ميزة. |
| option | [Option](../../com.aspose.xps.metadata/option) | مثيل  Option  مطلوب. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | مصفوفة عشوائية من  IFeatureItem  مثيلات. يجب أن يكون كل منها إما  Feature  أو  Option  أو مثيل  Property . |

### Feature(String name, Feature feature, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Feature feature, IFeatureItem[] items)
```


ينشئ مثيل ميزة PrintTicket جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String | اسم الميزة. |
| feature | [Feature](../../com.aspose.xps.metadata/feature) | مثال مطلوب لميزة Feature. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | مصفوفة عشوائية من مثيلات Property. يجب أن يكون كل عنصر إما Feature أو Option أو Property. |

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

