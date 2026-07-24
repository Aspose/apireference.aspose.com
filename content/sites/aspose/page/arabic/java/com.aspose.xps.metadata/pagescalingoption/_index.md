---
title: "PageScaling.PageScalingOption"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يصف خيارات ميزات PageScaling."
type: docs
weight: 10
url: /ar/java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

يصف خيارات ميزات  PageScaling .
## الحقول

| حقل | الوصف |
| --- | --- |
| [Custom](#Custom) | يحدد أنه يجب تطبيق تحجيم مخصص على حجم وسائط التطبيق. |
| [CustomSquare](#CustomSquare) | يحدد أنه يجب تطبيق تحجيم مربع مخصص على حجم وسائط التطبيق. |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | يحدد أنه يجب تحجيم حجم الزحف للتطبيق إلى PageImageableSize مع الحفاظ على نسبة العرض إلى الارتفاع. |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | يحدد أنه يجب تحجيم حجم محتوى التطبيق إلى PageImageableSize مع الحفاظ على نسبة العرض إلى الارتفاع. |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | يحدد أنه يجب تحجيم حجم وسائط التطبيق إلى PageImageableSize مع الحفاظ على نسبة العرض إلى الارتفاع. |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | يحدد أنه يجب تحجيم حجم وسائط التطبيق إلى PageMediaSize مع الحفاظ على نسبة العرض إلى الارتفاع. |
| [None](#None) | يحدد أنه لا يجب تطبيق أي تحجيم. |
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
### Custom {#Custom}
```
public static PageScaling.PageScalingOption Custom
```


يحدد أنه يجب تطبيق تحجيم مخصص على حجم وسائط التطبيق.

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


يحدد أنه يجب تطبيق تحجيم مربع مخصص على حجم وسائط التطبيق.

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```


يحدد أنه يجب تحجيم حجم الزحف للتطبيق إلى PageImageableSize مع الحفاظ على نسبة العرض إلى الارتفاع.

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```


يحدد أنه يجب تحجيم حجم محتوى التطبيق إلى PageImageableSize مع الحفاظ على نسبة العرض إلى الارتفاع.

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```


يحدد أنه يجب تحجيم حجم وسائط التطبيق إلى PageImageableSize مع الحفاظ على نسبة العرض إلى الارتفاع.

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```


يحدد أنه يجب تحجيم حجم وسائط التطبيق إلى PageMediaSize مع الحفاظ على نسبة العرض إلى الارتفاع.

### None {#None}
```
public static PageScaling.PageScalingOption None
```


يحدد أنه لا يجب تطبيق أي تحجيم.

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

