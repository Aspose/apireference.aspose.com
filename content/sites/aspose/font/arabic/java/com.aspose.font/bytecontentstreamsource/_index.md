---
title: "ByteContentStreamSource"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل مصدر تدفق يعتمد على _content stream."
type: docs
weight: 17
url: /ar/java/com.aspose.font/bytecontentstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class ByteContentStreamSource extends StreamSource
```

يمثل مصدر تدفق يعتمد على تدفق \_content.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [ByteContentStreamSource(byte[] fileContent)](#ByteContentStreamSource-byte---) | يقوم بتهيئة كائن  ByteContentStreamSource  جديد. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ كائن ByteContentStreamSource. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | يعيد تدفق ملف الخط. |
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
### ByteContentStreamSource(byte[] fileContent) {#ByteContentStreamSource-byte---}
```
public ByteContentStreamSource(byte[] fileContent)
```


يقوم بتهيئة كائن  ByteContentStreamSource  جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fileContent | byte[] | بايتات الملف. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


ينسخ كائن ByteContentStreamSource.

**Returns:**
java.lang.Object
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
public InputStream getFontStream()
```


يعيد تدفق ملف الخط. لا تنس إغلاق التدفق بعد الاستخدام.

**Returns:**
java.io.InputStream - تدفق ملف الخط.
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

