---
title: "Version16Dot16"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل نوع البيانات Version16Dot16"
type: docs
weight: 118
url: /ar/java/com.aspose.font/version16dot16/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Version16Dot16 implements Cloneable
```

يمثل نوع البيانات Version16Dot16
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [Version16Dot16()](#Version16Dot16--) | منشئ |
| [Version16Dot16(int majorNumber, int minorNumber)](#Version16Dot16-int-int-) | منشئ |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [clone()](#clone--) | إنشاء نسخة من كائن  Version16Dot16 . |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMajorNumber()](#getMajorNumber--) | يحصل على رقم الإصدار الرئيسي. |
| [getMinorNumber()](#getMinorNumber--) | يحصل على رقم الإصدار الفرعي. |
| [getRawBytes()](#getRawBytes--) | يحصل على جميع البتات الخام لرقم إصدار Version16Dot16 كمصفوفة بايت بحجم 4 بايت. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMajorNumber(int value)](#setMajorNumber-int-) | يضبط رقم الإصدار الرئيسي. |
| [setMinorNumber(int value)](#setMinorNumber-int-) | يضبط رقم الإصدار الفرعي. |
| [toString()](#toString--) | إرجاع قيمة الإصدار كسلسلة منسقة على سبيل المثال \"0.5\", \"1.1\", \"3.0\" إلخ. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Version16Dot16() {#Version16Dot16--}
```
public Version16Dot16()
```


منشئ

### Version16Dot16(int majorNumber, int minorNumber) {#Version16Dot16-int-int-}
```
public Version16Dot16(int majorNumber, int minorNumber)
```


منشئ

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| majorNumber | int | رقم الإصدار الرئيسي |
| minorNumber | int | رقم الإصدار الفرعي |

### clone() {#clone--}
```
public Object clone()
```


إنشاء نسخة من كائن  Version16Dot16 .

**Returns:**
java.lang.Object - كائن من النوع  Version16Dot16
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
### getMajorNumber() {#getMajorNumber--}
```
public int getMajorNumber()
```


يحصل على رقم الإصدار الرئيسي. القيمة لها معنى فقط في التدوين السداسي عشري، على سبيل المثال الإصدار 0.5 لـ 'maxp' في ملفات الخط الفعلية هو 4 بايت: \\{0, 0, 80, 0\\}، والذي له تمثيل سداسي عشري 0x00005000. بعد قراءة هذا الإصدار من ملف الخط، سيكون رقم الإصدار الرئيسي والفرعي للكائن  Version16Dot16  هو 0 و 20480 على التوالي. وهذه القيم في الشكل السداسي العشري هي 0x0000 و 0x5000.

**Returns:**
int - رقم الإصدار الرئيسي.
### getMinorNumber() {#getMinorNumber--}
```
public int getMinorNumber()
```


يحصل على رقم الإصدار الفرعي. القيمة لها معنى فقط في التدوين السداسي عشري، على سبيل المثال الإصدار 0.5 لـ 'maxp' في ملفات الخط الفعلية هو 4 بايت: \\{0, 0, 80, 0\\}، والذي له تمثيل سداسي عشري 0x00005000. بعد قراءة هذا الإصدار من ملف الخط، سيكون رقم الإصدار الرئيسي والفرعي للكائن  Version16Dot16  هو 0 و 20480 على التوالي. وهذه القيم في الشكل السداسي العشري هي 0x0000 و 0x5000.

**Returns:**
int - رقم الإصدار الفرعي.
### getRawBytes() {#getRawBytes--}
```
public byte[] getRawBytes()
```


يحصل على جميع البتات الخام لرقم إصدار Version16Dot16 كمصفوفة بايت بحجم 4 بايت.

**Returns:**
byte[] - جميع البتات الخام لرقم إصدار Version16Dot16 كمصفوفة بايت بحجم 4 بايت.
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




### setMajorNumber(int value) {#setMajorNumber-int-}
```
public void setMajorNumber(int value)
```


يضبط رقم الإصدار الرئيسي. القيمة لها معنى فقط في التدوين السداسي عشري، على سبيل المثال الإصدار 0.5 لـ 'maxp' في ملفات الخط الفعلية هو 4 بايت: \\{0, 0, 80, 0\\}، والذي له تمثيل سداسي عشري 0x00005000. بعد قراءة هذا الإصدار من ملف الخط، سيكون رقم الإصدار الرئيسي والفرعي للكائن  Version16Dot16  هو 0 و 20480 على التوالي. وهذه القيم في الشكل السداسي العشري هي 0x0000 و 0x5000.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | int | رقم الإصدار الرئيسي. |

### setMinorNumber(int value) {#setMinorNumber-int-}
```
public void setMinorNumber(int value)
```


يضبط رقم الإصدار الفرعي. القيمة لها معنى فقط في التدوين السداسي عشري، على سبيل المثال الإصدار 0.5 لـ 'maxp' في ملفات الخط الفعلية هو 4 بايت: \\{0, 0, 80, 0\\}، والذي له تمثيل سداسي عشري 0x00005000. بعد قراءة هذا الإصدار من ملف الخط، سيكون رقم الإصدار الرئيسي والفرعي للكائن  Version16Dot16  هو 0 و 20480 على التوالي. وهذه القيم في الشكل السداسي العشري هي 0x0000 و 0x5000.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | int | رقم الإصدار الفرعي. |

### toString() {#toString--}
```
public String toString()
```


إرجاع قيمة الإصدار كسلسلة منسقة على سبيل المثال \"0.5\", \"1.1\", \"3.0\" إلخ.

**Returns:**
java.lang.String - كائن من النوع  String
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

