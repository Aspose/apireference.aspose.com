---
title: "StringIndexDataProvider"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يعلن عن وظيفة للوصول إلى بنية فهرس السلسلة CFF."
type: docs
weight: 75
url: /ar/java/com.aspose.font/stringindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class StringIndexDataProvider implements ICffIndexDataProvider
```

يعلن عن وظيفة للوصول إلى بنية فهرس السلسلة CFF.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [StringIndexDataProvider()](#StringIndexDataProvider--) |  |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [addString(String value)](#addString-java.lang.String-) | يضيف السلسلة إلى بنية CFF String INDEX. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | يحصل/يضبط السلسلة في الفهرس المحدد. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | عدد الكائنات في بنية CFF INDEX. |
| [getRawBytes()](#getRawBytes--) | يحصل على جميع بايتات بنية CFF INDEX. |
| [getString(int index)](#getString-int-) | يحصل على السلسلة في الفهرس المحدد من بنية CFF String INDEX. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeString(int index)](#removeString-int-) | يزيل السلسلة من بنية CFF String Index عند الفهرس المحدد. |
| [set(int index, String value)](#set-int-java.lang.String-) |  |
| [setString(String value, int index)](#setString-java.lang.String-int-) | يضبط السلسلة في بنية CFF String Index عند الفهرس المحدد. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringIndexDataProvider() {#StringIndexDataProvider--}
```
public StringIndexDataProvider()
```


### addString(String value) {#addString-java.lang.String-}
```
public abstract void addString(String value)
```


يضيف السلسلة إلى بنية CFF String INDEX.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | قيمة السلسلة |

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


يحصل/يضبط السلسلة في الفهرس المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | فهرس السلسلة، الفهرس يعني رقم ترتيبي في بنية CFF INDEX، وليس SID |

**Returns:**
java.lang.String - سلسلة
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


عدد الكائنات في بنية CFF INDEX.

**Returns:**
int
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


يحصل على جميع بايتات بنية CFF INDEX.

**Returns:**
byte[] - بايتات بنية CFF INDEX
### getString(int index) {#getString-int-}
```
public abstract String getString(int index)
```


يحصل على السلسلة في الفهرس المحدد من بنية CFF String INDEX.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | فهرس السلسلة، الفهرس يعني رقم ترتيبي في بنية CFF INDEX، وليس SID |

**Returns:**
java.lang.String - سلسلة
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




### removeString(int index) {#removeString-int-}
```
public abstract void removeString(int index)
```


يزيل السلسلة من بنية CFF String Index عند الفهرس المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | فهرس السلسلة، الفهرس يعني رقم ترتيبي في بنية CFF INDEX، وليس SID |

### set(int index, String value) {#set-int-java.lang.String-}
```
public abstract void set(int index, String value)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int |  |
| القيمة | java.lang.String |  |

### setString(String value, int index) {#setString-java.lang.String-int-}
```
public abstract void setString(String value, int index)
```


يضبط السلسلة في بنية CFF String Index عند الفهرس المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | قيمة السلسلة |
| فهرس | int | فهرس السلسلة، الفهرس يعني رقم ترتيبي في بنية CFF INDEX، وليس SID |

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

