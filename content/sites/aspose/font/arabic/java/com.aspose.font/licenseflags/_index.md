---
title: "LicenseFlags"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل غلافًا مساعدًا لأعلام التضمين من حقل جدول OS/2 fsType."
type: docs
weight: 59
url: /ar/java/com.aspose.font/licenseflags/
---
**Inheritance:**
java.lang.Object
```
public class LicenseFlags
```

يمثل غلافًا مساعدًا لأعلام التضمين من جدول 'OS/2' (الحقل fsType).
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFSType()](#getFSType--) | يحصل على قيمة fsType الخام من جدول OS/2 أو 0 إذا لم يكن هذا الحقل موجودًا في الجدول. |
| [hashCode()](#hashCode--) |  |
| [isBitmapOnlyEmbedding()](#isBitmapOnlyEmbedding--) | يكشف ما إذا كان fsType يسمح بالتضمين BitmapOnly. |
| [isEditableEmbedding()](#isEditableEmbedding--) | يكشف ما إذا كان fsType يسمح بالتضمين Editable. |
| [isFSTypeAbsent()](#isFSTypeAbsent--) | يرجع true إذا كان علم fsType غير موجود في جدول 'OS/2'. |
| [isInstallableEmbedding()](#isInstallableEmbedding--) | يكشف ما إذا كان fsType هو التضمين Installable. |
| [isNoSubsettingEmbedding()](#isNoSubsettingEmbedding--) | يكشف ما إذا كان fsType يسمح بالتضمين NoSubsetting. |
| [isPreviewAndPrintEmbedding()](#isPreviewAndPrintEmbedding--) | يكشف ما إذا كان fsType يسمح بالتضمين Preview and Print. |
| [isReservedType()](#isReservedType--) | يكشف ما إذا كان البت المحجوز (bit 0) مُعيّنًا لـ fsType. |
| [isRestrictedLicenseEmbedding()](#isRestrictedLicenseEmbedding--) | يكشف ما إذا كان fsType هو التضمين Restricted License. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getFSType() {#getFSType--}
```
public int getFSType()
```


يحصل على قيمة fsType الخام من جدول OS/2 أو 0 إذا لم يكن هذا الحقل موجودًا في الجدول.

**Returns:**
int - قيمة fsType الخام من جدول OS/2 أو 0 إذا لم يكن هذا الحقل موجودًا في الجدول.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isBitmapOnlyEmbedding() {#isBitmapOnlyEmbedding--}
```
public boolean isBitmapOnlyEmbedding()
```


يكشف ما إذا كان fsType يسمح بالتضمين BitmapOnly.

**Returns:**
boolean - يكشف ما إذا كان fsType يسمح بالتضمين BitmapOnly.
### isEditableEmbedding() {#isEditableEmbedding--}
```
public boolean isEditableEmbedding()
```


يكشف ما إذا كان fsType يسمح بالتضمين Editable.

**Returns:**
منطقي - يكتشف ما إذا كان fsType يسمح بالتضمين القابل للتحرير.
### isFSTypeAbsent() {#isFSTypeAbsent--}
```
public boolean isFSTypeAbsent()
```


يرجع true إذا كان علم fsType غير موجود في جدول 'OS/2'.

**Returns:**
منطقي - صحيح إذا كانت علامة fsType غير موجودة في جدول 'OS/2'.
### isInstallableEmbedding() {#isInstallableEmbedding--}
```
public boolean isInstallableEmbedding()
```


يكشف ما إذا كان fsType هو التضمين Installable.

**Returns:**
منطقي - يكتشف ما إذا كان fsType هو تضمين قابل للتثبيت.
### isNoSubsettingEmbedding() {#isNoSubsettingEmbedding--}
```
public boolean isNoSubsettingEmbedding()
```


يكشف ما إذا كان fsType يسمح بالتضمين NoSubsetting.

**Returns:**
منطقي - يكتشف ما إذا كان fsType يسمح بتضمين بدون تقطيع.
### isPreviewAndPrintEmbedding() {#isPreviewAndPrintEmbedding--}
```
public boolean isPreviewAndPrintEmbedding()
```


يكشف ما إذا كان fsType يسمح بالتضمين Preview and Print.

**Returns:**
منطقي - يكتشف ما إذا كان fsType يسمح بتضمين المعاينة والطباعة.
### isReservedType() {#isReservedType--}
```
public boolean isReservedType()
```


يكشف ما إذا كان البت المحجوز (bit 0) مُعيّنًا لـ fsType.

**Returns:**
منطقي - يكتشف ما إذا كان البت المحجوز (البت 0) مضبوطًا لـ fsType.
### isRestrictedLicenseEmbedding() {#isRestrictedLicenseEmbedding--}
```
public boolean isRestrictedLicenseEmbedding()
```


يكشف ما إذا كان fsType هو التضمين Restricted License.

**Returns:**
منطقي - يكتشف ما إذا كان fsType هو تضمين برخصة مقيدة.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

