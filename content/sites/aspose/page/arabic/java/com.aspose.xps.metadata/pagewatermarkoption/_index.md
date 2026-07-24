---
title: "PageWatermark.PageWatermarkOption"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يصف خيارات ميزات PageWatermark."
type: docs
weight: 12
url: /ar/java/com.aspose.xps.metadata/pagewatermark.pagewatermarkoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem](../../com.aspose.xps.metadata/ipagewatermarkitem)
```
public static final class PageWatermark.PageWatermarkOption extends Option implements PageWatermark.IPageWatermarkItem
```

يصف خيارات ميزات **PageWatermark**.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)](#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | ينشئ مثيلًا جديدًا. |
| [PageWatermarkOption(PageWatermark.PageWatermarkOption option)](#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-) | ينسخ هذا المثيل من الخيار. |
## الحقول

| حقل | الوصف |
| --- | --- |
| [Text](#Text) | يحدد علامة مائية نصية فقط. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذا الخيار. |
| [add(PageWatermark.IPageWatermarkOptionItem[] items)](#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | يضيف مصفوفة من مثيلات  IPageWatermarkOptionItem  إلى الخيار. |
| [clone()](#clone--) | ينسخ هذا المثيل من الخيار. |
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
### PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items) {#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)
```


ينشئ مثيلًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| optionName | java.lang.String | اسم خيار. |
| items | [IPageWatermarkOptionItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkoptionitem) | مصفوفة عشوائية من مثيلات  IPageWatermarkOptionItem . |

### PageWatermarkOption(PageWatermark.PageWatermarkOption option) {#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-}
```
public PageWatermarkOption(PageWatermark.PageWatermarkOption option)
```


ينسخ هذا المثيل من الخيار.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| option | [PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) | كائن للاستنساخ. |

### Text {#Text}
```
public static PageWatermark.PageWatermarkOption Text
```


يحدد علامة مائية نصية فقط.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذا الخيار. يجب أن يكون كل عنصر إما مثال ScoredProperty أو مثال Property.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | قائمة العناصر للإضافة. |

### add(PageWatermark.IPageWatermarkOptionItem[] items) {#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermark.PageWatermarkOption add(PageWatermark.IPageWatermarkOptionItem[] items)
```


يضيف مصفوفة من مثيلات  IPageWatermarkOptionItem  إلى الخيار.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| items | [IPageWatermarkOptionItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkoptionitem) | مصفوفة عشوائية من مثيلات  IPageWatermarkOptionItem . |

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - This options instance.
### clone() {#clone--}
```
public PageWatermark.PageWatermarkOption clone()
```


ينسخ هذا الكائن الخيار. الاختصار إلى مُنشئ الاستنساخ.

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - The clone of this option instance.
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

