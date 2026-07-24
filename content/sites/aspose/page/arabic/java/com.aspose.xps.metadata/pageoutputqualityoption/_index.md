---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يعرف خيارات ميزة PageOutputQuality."
type: docs
weight: 10
url: /ar/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

يحدد  PageOutputQuality  خيارات الميزة.
## الحقول

| حقل | الوصف |
| --- | --- |
| [Automatic](#Automatic) | يحدد النية للإخراج التلقائي (يسمح للعميل باختيار الإعدادات الأفضل تلقائيًا). |
| [Draft](#Draft) | يحدد النية لإخراج مسودة (متوازن لنصوص ورسومات بجودة مسودة). |
| [Fax](#Fax) | يحدد النية لإخراج الفاكس (متوازن لجودة الفاكس القياسية). |
| [High](#High) | يحدد النية لإخراج عالي الجودة (متوازن لنصوص ورسومات عالية الجودة). |
| [Normal](#Normal) | يحدد الهدف للإخراج العادي (متوازن للحصول على نص ورسومات ذات جودة جيدة). |
| [Photographic](#Photographic) | يحدد الهدف للإخراج الفوتوغرافي (يجب أن تكون الصور بأعلى جودة). |
| [Text](#Text) | يحدد الهدف لإخراج النص فقط (قد تكون الرسومات ذات جودة ضعيفة أو لا تُخرج على الإطلاق). |
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
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


يحدد النية للإخراج التلقائي (يسمح للعميل باختيار الإعدادات الأفضل تلقائيًا).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


يحدد النية لإخراج مسودة (متوازن لنصوص ورسومات بجودة مسودة).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


يحدد النية لإخراج الفاكس (متوازن لجودة الفاكس القياسية).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


يحدد النية لإخراج عالي الجودة (متوازن لنصوص ورسومات عالية الجودة).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


يحدد الهدف للإخراج العادي (متوازن للحصول على نص ورسومات ذات جودة جيدة).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


يحدد الهدف للإخراج الفوتوغرافي (يجب أن تكون الصور بأعلى جودة).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


يحدد الهدف لإخراج النص فقط (قد تكون الرسومات ذات جودة ضعيفة أو لا تُخرج على الإطلاق).

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

