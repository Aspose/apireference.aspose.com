---
title: "ByteArrayResult"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يمثل نتيجة العملية على شكل مصفوفة من البايتات."
type: docs
weight: 11
url: /ar/java/com.aspose.page.plugins/bytearrayresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public class ByteArrayResult implements IOperationResult
```

يمثل نتيجة العملية على شكل مصفوفة من البايتات.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [ByteArrayResult(byte[][] data)](#ByteArrayResult-byte-----) | يُنشئ نسخة جديدة باستخدام مصفوفة من مصفوفات البايت. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | يحصل على البيانات الخام. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | يشير إلى ما إذا كانت النتيجة مصفوفة بايتات. |
| [isFile()](#isFile--) | يشير إلى ما إذا كانت النتيجة مسارًا إلى ملف إخراج. |
| [isStream()](#isStream--) | يشير إلى ما إذا كان الناتج هو تدفق إخراج. |
| [isString()](#isString--) | يشير إلى ما إذا كان الناتج هو سلسلة نصية. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | يحاول تحويل النتيجة إلى ملف. |
| [toStream()](#toStream--) | يحاول تحويل النتيجة إلى كائن تدفق. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ByteArrayResult(byte[][] data) {#ByteArrayResult-byte-----}
```
public ByteArrayResult(byte[][] data)
```


يُنشئ نسخة جديدة باستخدام مصفوفة من مصفوفات البايت.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| البيانات | byte[][] | مصفوفة من مصفوفات البايت. تُستخدم لتحويل المستند إلى صورة. تحتوي مصفوفة البايت الواحدة على بايتات صورة صفحة واحدة. |

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
### getData() {#getData--}
```
public final Object getData()
```


يحصل على البيانات الخام.

**Returns:**
java.lang.Object - كائن يمثل بيانات الإخراج.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


يشير إلى ما إذا كانت النتيجة مصفوفة بايتات.

**Returns:**
boolean - true إذا كانت النتيجة مصفوفة بايتات؛ وإلا false.
### isFile() {#isFile--}
```
public final boolean isFile()
```


يشير إلى ما إذا كانت النتيجة مسارًا إلى ملف إخراج.

**Returns:**
boolean - true إذا كانت النتيجة ملفًا؛ وإلا false.
### isStream() {#isStream--}
```
public final boolean isStream()
```


يشير إلى ما إذا كان الناتج هو تدفق إخراج.

**Returns:**
boolean - true إذا كانت النتيجة كائن تدفق؛ وإلا false.
### isString() {#isString--}
```
public final boolean isString()
```


يشير إلى ما إذا كان الناتج هو سلسلة نصية.

**Returns:**
boolean - true إذا كانت النتيجة سلسلة نصية؛ وإلا false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


يحاول تحويل النتيجة إلى ملف.

**Returns:**
java.lang.String - سلسلة تمثل المسار إلى ملف الإخراج إذا كانت النتيجة ملفًا؛ وإلا null.
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


يحاول تحويل النتيجة إلى كائن تدفق.

**Returns:**
java.io.OutputStream - كائن تدفق يمثل بيانات الإخراج إذا كانت النتيجة تدفقًا؛ وإلا null.
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

