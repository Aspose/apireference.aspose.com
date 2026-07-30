---
title: "TtfEncodingParameters"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل معلمات ترميز TTF."
type: docs
weight: 93
url: /ar/java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

يمثل معلمات ترميز TTF. يجب استخدامه لطلب ترميز محدد من خط TTF.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | يُهيئ نسخة جديدة من فئة TtfEncodingParameters. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPlatformId()](#getPlatformId--) | احصل على قيمة PlatformId. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | يحصل على قيمة PlatformSpecificId. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setPlatformId(int value)](#setPlatformId-int-) | يضبط قيمة PlatformId. |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | يضبط قيمة PlatformSpecificId. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


يُهيئ نسخة جديدة من فئة TtfEncodingParameters. يأخذ معرف المنصة (Platform Id) ومعرف الترميز الخاص بالمنصة كمعاملات. تُستخدم هذه المعاملات لطلب جدول فرعي خاص من CMap من جدول CMap الرئيسي للخط، راجع جدول 'CMap', 'name' في مواصفات ملف خط OpenType.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| platformId | int | معرف المنصة. |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


احصل على قيمة PlatformId.

**Returns:**
int - قيمة PlatformId.
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


يحصل على قيمة PlatformSpecificId.

**Returns:**
int - قيمة PlatformSpecificId.
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




### setPlatformId(int value) {#setPlatformId-int-}
```
public void setPlatformId(int value)
```


يضبط قيمة PlatformId.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | int | قيمة PlatformId. |

### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


يضبط قيمة PlatformSpecificId.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | int | قيمة PlatformSpecificId. |

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

