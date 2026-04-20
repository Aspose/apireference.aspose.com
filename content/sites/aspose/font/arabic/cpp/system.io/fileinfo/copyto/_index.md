---
title: "System::IO::FileInfo::CopyTo طريقة"
linktitle: "CopyTo"
second_title: "Aspose.Font لـ C++"
description: "System::IO::FileInfo::CopyTo طريقة. ينسخ الملف الذي تمثله الكائن الحالي إلى الموقع المحدد. إذا كان ملف الوجهة موجودًا بالفعل، فإن النسخ يفشل في C++."
type: docs
weight: 300
url: /ar/cpp/system.io/fileinfo/copyto/
---
## FileInfo::CopyTo(const String\&) method


ينسخ الملف الذي يمثله الكائن الحالي إلى الموقع المحدد. إذا كان ملف الوجهة موجودًا بالفعل، فإن النسخ سيفشل.

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| destFileName | const String\& | اسم ملف الوجهة |

### ReturnValue

كائن [FileInfo](../) يمثل النسخة

## انظر أيضًا

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileInfo::CopyTo(const String\&, bool) method


ينسخ الملف الذي يمثله الكائن الحالي إلى الموقع المحدد. يحدد معلمة ما إذا كان يجب استبدال ملف الوجهة الموجود.

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName, bool overwrite)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| destFileName | const String\& | اسم ملف الوجهة |
| الكتابة فوق | bool | صحيح إذا كان يجب الكتابة فوق ملف الوجهة الموجود، خطأ إذا يجب أن يفشل النسخ إذا كان ملف الوجهة موجودًا بالفعل |

### ReturnValue

كائن [FileInfo](../) يمثل النسخة

## انظر أيضًا

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
