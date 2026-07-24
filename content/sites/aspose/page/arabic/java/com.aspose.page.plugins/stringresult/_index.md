---
title: "StringResult"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يمثل نتيجة العملية على شكل سلسلة."
type: docs
weight: 19
url: /ar/java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

يمثل نتيجة العملية على شكل سلسلة.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | يُنشئ نسخة جديدة من StringResult باستخدام سلسلة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | يحصل على البيانات الخام. |
| [getText()](#getText--) | يرجع تمثيلًا نصيًا للنتيجة. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | يشير إلى ما إذا كانت النتيجة مصفوفة بايتات. |
| [isFile()](#isFile--) | يشير إلى ما إذا كانت النتيجة مسارًا إلى ملف إخراج. |
| [isStream()](#isStream--) | يشير إلى ما إذا كانت النتيجة مسارًا إلى ملف إخراج. |
| [isString()](#isString--) | يشير إلى ما إذا كانت النتيجة سلسلة نصية. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | يحاول تحويل النتيجة إلى ملف. |
| [toStream()](#toStream--) | يحاول تحويل النتيجة إلى كائن تدفق. |
| [toString()](#toString--) | يحاول تحويل النتيجة إلى سلسلة. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


يُنشئ نسخة جديدة من StringResult باستخدام سلسلة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| النتيجة | java.lang.String | سلسلة تمثل النتيجة |

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
### getText() {#getText--}
```
public final String getText()
```


يرجع تمثيلًا نصيًا للنتيجة.

**Returns:**
java.lang.String
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


يشير إلى ما إذا كانت النتيجة مسارًا إلى ملف إخراج.

**Returns:**
boolean - true إذا كانت النتيجة كائن تدفق؛ وإلا false.
### isString() {#isString--}
```
public final boolean isString()
```


يشير إلى ما إذا كانت النتيجة سلسلة نصية.

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


يحاول تحويل النتيجة إلى سلسلة.

**Returns:**
java.lang.String - سلسلة تمثل محتوى النص إذا كانت النتيجة سلسلة؛ وإلا تُعيد base.ToString().
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

