---
title: "StreamSource"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يحدد طريقة للحصول على تدفق ملف عند الحاجة."
type: docs
weight: 74
url: /ar/java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

يحدد طريقة للحصول على تدفق ملف عند الحاجة.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [StreamSource()](#StreamSource--) | يُهيئ نسخة مصدر الدفق. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ كائن مصدر الدفق. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | يعيد دفق الخط. |
| [getOffset()](#getOffset--) | يحصل على الإزاحة داخل المصدر. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | قد يمنع الورثة إغلاق الدفق. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffset(long value)](#setOffset-long-) | يضبط الإزاحة داخل المصدر. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


يُهيئ نسخة مصدر الدفق.

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


ينسخ كائن مصدر الدفق.

**Returns:**
java.lang.Object - نسخة من كائن مصدر الدفق.
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
### getFontStream() {#getFontStream--}
```
public abstract InputStream getFontStream()
```


يعيد دفق الخط.

**Returns:**
java.io.InputStream - دفق الخط.
### getOffset() {#getOffset--}
```
public long getOffset()
```


يحصل على الإزاحة داخل المصدر.

**Returns:**
long - الإزاحة داخل المصدر.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


قد يمنع الورثة إغلاق الدفق. يُعيد true إذا كان مصدر الدفق يرغب في إغلاق الدفق بعد الاستخدام. وإلا يُعيد false.

**Returns:**
boolean - True إذا كان مصدر الدفق يرغب في إغلاق الدفق بعد الاستخدام، وإلا false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


يضبط الإزاحة داخل المصدر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | long | الإزاحة داخل المصدر. |

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

