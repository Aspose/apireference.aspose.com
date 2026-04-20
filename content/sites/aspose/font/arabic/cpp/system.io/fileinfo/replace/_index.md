---
title: "System::IO::FileInfo::Replace طريقة"
linktitle: "استبدال"
second_title: "Aspose.Font لـ C++"
description: "System::IO::FileInfo::Replace طريقة. يستبدل محتويات ملف الوجهة المحدد بالملف الذي تمثله كائن FileInfo الحالي ويُنشئ نسخة احتياطية من الملف المستبدل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.io/fileinfo/replace/
---
## FileInfo::Replace(const String\&, const String\&) method


يستبدل محتويات ملف الوجهة المحدد بالملف الذي تمثله كائن [FileInfo](../) الحالي ويُنشئ نسخة احتياطية من الملف المستبدل.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| destinationFileName | const String\& | اسم الملف المراد استبداله |
| destinationBackupFileName | const String\& | اسم ملف النسخة الاحتياطية |

### ReturnValue

كائن FileInfor يمثل الملف المشار إليه بواسطة **destinationFileName**

## انظر أيضًا

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileInfo::Replace(const String\&, const String\&, bool) method


يستبدل محتويات ملف الوجهة المحدد بالملف الذي تمثله كائن [FileInfo](../) الحالي ويُنشئ نسخة احتياطية من الملف المستبدل.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| destinationFileName | const String\& | اسم الملف المراد استبداله |
| destinationBackupFileName | const String\& | اسم ملف النسخة الاحتياطية |
| ignoreMetadataErrors | bool | يحدد ما إذا كان يجب تجاهل أخطاء الدمج من الملف المستبدل إلى ملف الاستبدال (true) أو لا (false) |

### ReturnValue

كائن FileInfor يمثل الملف المشار إليه بواسطة **destinationFileName**

## انظر أيضًا

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
