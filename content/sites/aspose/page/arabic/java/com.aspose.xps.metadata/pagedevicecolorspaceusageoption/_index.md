---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يصف خيارات ميزة PageDeviceColorSpaceUsage."
type: docs
weight: 10
url: /ar/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

يصف خيارات ميزة  PageDeviceColorSpaceUsage .
## الحقول

| حقل | الوصف |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | إذا قرر الجهاز أن الملف التعريفي المحدد بواسطة المعامل PageDeviceColorSpaceProfileURI يمكن استخدامه كملف تعريف مساحة ألوان الجهاز، فسيتم اعتبار جميع العناصر التي تستخدم نفس الملف التعريفي بأنها محددة بالفعل في مساحة ألوان الجهاز. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | إذا كان الملف التعريفي المحدد بواسطة المعامل PageDeviceColorSpaceProfileURI يحتوي على عدد من القنوات يطابق عدد الألوان الأساسية للجهاز، يجب أن يُستخدم بدلاً من إدارة الألوان الداخلية للجهاز لجميع العناصر. |
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
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


إذا كان الجهاز يحدد أن الملف التعريفي المحدد بواسطة المعامل PageDeviceColorSpaceProfileURI يمكن استخدامه كملف تعريف مساحة ألوان الجهاز، فسيتم اعتبار جميع العناصر التي تستخدم نفس الملف التعريفي كأنها محددة بالفعل في مساحة ألوان الجهاز. يجب على جميع العناصر الأخرى استخدام الملف التعريفي المحدد لذلك العنصر. إذا لم يكن يمكن استخدام الملف التعريفي كملف تعريف مساحة ألوان الجهاز، يجب إدارة ألوان العناصر التي تستخدم الملف التعريفي مثل أي عنصر آخر يستخدم ملف الألوان.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


إذا كان الملف التعريفي المحدد بواسطة المعامل PageDeviceColorSpaceProfileURI يحتوي على عدد من القنوات يطابق عدد الألوان الأساسية للجهاز، يجب استخدامه بدلاً من إدارة الألوان الداخلية للجهاز لجميع العناصر. تُفترض أن العناصر التي تستخدم هذا الملف التعريفي تكون في مساحة ألوان الجهاز ولن يتم إدارة ألوانها لاحقًا.

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

