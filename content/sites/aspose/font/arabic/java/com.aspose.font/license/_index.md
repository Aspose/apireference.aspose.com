---
title: "License"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يوفر طرقًا لتراخيص المكوّن."
type: docs
weight: 58
url: /ar/java/com.aspose.font/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

يوفر طرقًا لتراخيص المكوّن.

في هذا المثال، سيتم محاولة العثور على ملف ترخيص يُدعى MyLicense.lic في المجلد الذي يحتوي على المكوّن، وفي المجلد الذي يحتوي على التجميع المستدعي، وفي مجلد التجميع الرئيسي، ثم في الموارد المدمجة للتجميع المستدعي.

License license = new License();
license.setLicense(\"MyLicense.lic\");
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [License()](#License--) | يقوم بتهيئة نسخة جديدة من هذه الفئة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | يُرخص المكوّن. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | يُرخص المكوّن. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


يقوم بتهيئة نسخة جديدة من هذه الفئة.

في هذا المثال، سيتم محاولة العثور على ملف ترخيص يُدعى MyLicense.lic في المجلد الذي يحتوي على المكوّن، وفي المجلد الذي يحتوي على التجميع المستدعي، وفي مجلد التجميع الرئيسي، ثم في الموارد المدمجة للتجميع المستدعي.

License license = new License();
license.setLicense(\"MyLicense.lic\");

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




### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


يُرخص المكوّن.

دفق يحتوي على الترخيص.

استخدم هذه الطريقة لتحميل ترخيص من دفق.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | java.io.InputStream | دفق الترخيص |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


يُرخص المكوّن.

يحاول العثور على الترخيص في المواقع التالية:

1. مسار صريح.

2. مجلد ملف jar الخاص بالمكوّن.

في هذا المثال، سيتم محاولة العثور على ملف ترخيص يُدعى MyLicense.lic في المجلد الذي يحتوي على المكوّن، وفي المجلد الذي يحتوي على التجميع المستدعي، وفي مجلد التجميع الرئيسي، ثم في الموارد المدمجة للتجميع المستدعي.

License license = new License();
license.setLicense(\"MyLicense.lic\");

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| licenseName | java.lang.String | يمكن أن يكون اسم ملف كامل أو مختصر أو اسم مورد مدمج. استخدم سلسلة فارغة للتبديل إلى وضع التقييم. |

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

