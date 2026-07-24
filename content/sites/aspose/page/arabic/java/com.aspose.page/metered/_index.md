---
title: "Metered"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يوفر طرقًا لتعيين المفتاح المقيس."
type: docs
weight: 15
url: /ar/java/com.aspose.page/metered/
---
**Inheritance:**
java.lang.Object
```
public final class Metered
```

يوفر طرقًا لتعيين المفتاح المقيس.

--------------------

في هذا المثال، سيتم محاولة تعيين المفتاح العام والخاص القائم على القياس.

```
The component jar file:
  
 	Metered matered = new Metered();
 	matered.setMeteredKey("PublicKey", "PrivateKey");
```
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [Metered()](#Metered--) | ينشئ مثيلاً جديداً لهذه الفئة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [clearMeteredLicense()](#clearMeteredLicense--) | ينظف الترخيص القائم على القياس |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [flush()](#flush--) | يفرغ بيانات العد على الخادم. |
| [getClass()](#getClass--) |  |
| [getConsumptionCredit()](#getConsumptionCredit--) | يحصل على رصيد الاستهلاك |
| [getConsumptionQuantity()](#getConsumptionQuantity--) | يحصل على حجم ملف الاستهلاك |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String-) | يضبط المفتاح العام والخاص المقيس |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Metered() {#Metered--}
```
public Metered()
```


ينشئ مثيلاً جديداً لهذه الفئة.

### clearMeteredLicense() {#clearMeteredLicense--}
```
public static void clearMeteredLicense()
```


ينظف الترخيص القائم على القياس

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
### flush() {#flush--}
```
public static void flush()
```


يفرغ بيانات العد على الخادم. يُستخدم فقط لأغراض التصحيح.

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConsumptionCredit() {#getConsumptionCredit--}
```
public static double getConsumptionCredit()
```


يحصل على رصيد الاستهلاك

**Returns:**
double - كمية الاستهلاك
### getConsumptionQuantity() {#getConsumptionQuantity--}
```
public static double getConsumptionQuantity()
```


يحصل على حجم ملف الاستهلاك

**Returns:**
double - كمية الاستهلاك
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




### setMeteredKey(String publicKey, String privateKey) {#setMeteredKey-java.lang.String-java.lang.String-}
```
public void setMeteredKey(String publicKey, String privateKey)
```


يضبط المفتاح العام والخاص المقيس

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| publicKey | java.lang.String | المفتاح العام |
| privateKey | java.lang.String | المفتاح الخاص |

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

