---
title: "Option"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "الفئة التي تُنفّذ خيار PrintTicket الشائع."
type: docs
weight: 76
url: /ar/java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

الفئة التي تُنفّذ خيار PrintTicket الشائع. الفئة الأساسية لجميع الخيارات المعرفة بالمخطط. يحتوي عنصر Option على جميع عناصر Property و ScoredProperty المرتبطة بهذا الخيار. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | ينشئ مثيلًا جديدًا لخيار PrintTicket. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | ينشئ مثيلًا جديدًا لخيار PrintTicket. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | ينشئ مثيلًا مستنسخًا للخيار. |
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
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


ينشئ مثيلًا جديدًا لخيار PrintTicket.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String | اسم خيار عشوائي. |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | مصفوفة عشوائية من مثيلات IOptionItem. يجب أن يكون كل منها إما ScoredProperty أو Property. |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


ينشئ مثيلًا جديدًا لخيار PrintTicket.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | مصفوفة عشوائية من مثيلات IOptionItem. يجب أن يكون كل منها إما ScoredProperty أو Property. |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


ينشئ مثيلًا مستنسخًا للخيار.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | مثيل خيار للاستنساخ. |

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

