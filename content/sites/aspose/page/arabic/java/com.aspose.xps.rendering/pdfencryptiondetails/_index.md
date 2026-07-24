---
title: "PdfEncryptionDetails"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يحتوي على تفاصيل لتشفير PDF."
type: docs
weight: 13
url: /ar/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

يحتوي على تفاصيل لتشفير PDF.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | يُنشئ مثيلاً جديداً من الفئة PdfEncryptionDetailsCore . |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | يعيد وضع التشفير. |
| [getOwnerPassword()](#getOwnerPassword--) | يعيد كلمة مرور المالك. |
| [getPermissions()](#getPermissions--) | يعيد الأذونات. |
| [getUserPassword()](#getUserPassword--) | يعيد كلمة مرور المستخدم. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | يضبط وضع التشفير. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | يضبط كلمة مرور المالك. |
| [setPermissions(int value)](#setPermissions-int-) | يضبط الأذونات. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | يضبط كلمة مرور المستخدم. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


يُنشئ مثيلاً جديداً من الفئة PdfEncryptionDetailsCore .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| userPassword | java.lang.String | كلمة مرور المستخدم. |
| ownerPassword | java.lang.String | كلمة مرور المالك. |
| permissions | int | الأذونات. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | خوارزمية التشفير. |

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
### getEncryptionAlgorithm() {#getEncryptionAlgorithm--}
```
public PdfEncryptionAlgorithm getEncryptionAlgorithm()
```


يعيد وضع التشفير.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


يعيد كلمة مرور المالك.

فتح المستند باستخدام كلمة مرور المالك الصحيحة (مع افتراض أنها ليست هي نفسها كلمة مرور المستخدم) يتيح وصولاً كاملاً (كمالك) إلى المستند. هذا الوصول غير المحدود يشمل القدرة على تغيير كلمات مرور المستند\u2019s وأذونات الوصول.

**Returns:**
java.lang.String - كلمة مرور المالك.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


يعيد الأذونات.

**Returns:**
int - الأذونات.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


يعيد كلمة مرور المستخدم.

فتح المستند باستخدام كلمة مرور المستخدم الصحيحة (أو فتح مستند لا يحتوي على كلمة مرور للمستخدم) يسمح بتنفيذ عمليات إضافية وفقًا لأذونات وصول المستخدم المحددة في قاموس تشفير المستند.

**Returns:**
java.lang.String - كلمة مرور المستخدم.
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




### setEncryptionAlgorithm(PdfEncryptionAlgorithm value) {#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public void setEncryptionAlgorithm(PdfEncryptionAlgorithm value)
```


يضبط وضع التشفير.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | خوارزمية التشفير. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


يضبط كلمة مرور المالك.

فتح المستند باستخدام كلمة مرور المالك الصحيحة (مع افتراض أنها ليست هي نفسها كلمة مرور المستخدم) يتيح وصولاً كاملاً (كمالك) إلى المستند. هذا الوصول غير المحدود يشمل القدرة على تغيير كلمات مرور المستند\u2019s وأذونات الوصول.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | كلمة مرور المالك. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


يضبط الأذونات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | int | الأذونات. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


يضبط كلمة مرور المستخدم.

فتح المستند باستخدام كلمة مرور المستخدم الصحيحة (أو فتح مستند لا يحتوي على كلمة مرور للمستخدم) يسمح بتنفيذ عمليات إضافية وفقًا لأذونات وصول المستخدم المحددة في قاموس تشفير المستند.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | كلمة مرور المستخدم. |

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

