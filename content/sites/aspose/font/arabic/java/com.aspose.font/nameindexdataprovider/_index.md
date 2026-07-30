---
title: "NameIndexDataProvider"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يوفر إعدادات شائعة لخطوط CFF."
type: docs
weight: 68
url: /ar/java/com.aspose.font/nameindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class NameIndexDataProvider implements ICffIndexDataProvider
```

يوفر إعدادات شائعة لخطوط CFF.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [NameIndexDataProvider()](#NameIndexDataProvider--) |  |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [addName(String name)](#addName-java.lang.String-) | يضيف اسم خط إلى بنية Name INDEX. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | يحصل على اسم الخط عند الفهرس المحدد. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | يحصل على عدد الكائنات في بنية CFF INDEX. |
| [getName(int index)](#getName-int-) | يحصل على اسم الخط عند الفهرس المحدد. |
| [getRawBytes()](#getRawBytes--) | يحصل على جميع بايتات بنية CFF INDEX. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeName(int index)](#removeName-int-) | يزيل الاسم عند الفهرس المحدد. |
| [set(int index, String name)](#set-int-java.lang.String-) | يحدد اسم الخط عند الفهرس المحدد. |
| [setName(String name, int index)](#setName-java.lang.String-int-) | يضبط اسم الخط عند الفهرس المحدد. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NameIndexDataProvider() {#NameIndexDataProvider--}
```
public NameIndexDataProvider()
```


### addName(String name) {#addName-java.lang.String-}
```
public abstract void addName(String name)
```


يضيف اسم خط إلى بنية Name INDEX. استخدم هذه الطريقة بحذر لأن كل اسم خط في بنية CFF Name INDEX يجب أن يكون له بنية DICT مطابقة في فهرس Top DICT وفقًا لمواصفة CFF.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String |  |

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
### get(int index) {#get-int-}
```
public abstract String get(int index)
```


يحصل على اسم الخط عند الفهرس المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | فهرس الخط. |

**Returns:**
java.lang.String - اسم الخط.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public abstract int getCount()
```


يحصل على عدد الكائنات في بنية CFF INDEX.

**Returns:**
int
### getName(int index) {#getName-int-}
```
public abstract String getName(int index)
```


يحصل على اسم الخط عند الفهرس المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | فهرس الخط. |

**Returns:**
java.lang.String - اسم الخط.
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


يحصل على جميع بايتات بنية CFF INDEX.

**Returns:**
byte[] - بايتات بنية CFF INDEX
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




### removeName(int index) {#removeName-int-}
```
public abstract void removeName(int index)
```


يزيل الاسم عند الفهرس المحدد. استخدم هذه الطريقة بحذر لأن كل اسم خط في بنية CFF Name INDEX يجب أن يكون له بنية DICT مطابقة في فهرس Top DICT وفقًا لمواصفة CFF.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | فهرس الخط. |

### set(int index, String name) {#set-int-java.lang.String-}
```
public abstract void set(int index, String name)
```


يحدد اسم الخط عند الفهرس المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | فهرس الخط. |
| الاسم | java.lang.String | اسم الخط. |

### setName(String name, int index) {#setName-java.lang.String-int-}
```
public abstract void setName(String name, int index)
```


يضبط اسم الخط عند الفهرس المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم | java.lang.String | اسم الخط. |
| فهرس | int | فهرس الخط. |

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

