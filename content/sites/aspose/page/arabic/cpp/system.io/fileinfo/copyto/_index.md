---
title: "System::IO::FileInfo::CopyTo طريقة"
linktitle: "CopyTo"
second_title: "Aspose.Page لـ C++"
description: "System::IO::FileInfo::CopyTo طريقة. ينسخ الملف الممثل بواسطة الكائن الحالي إلى الموقع المحدد. إذا كان ملف الوجهة موجودًا بالفعل، فإن النسخ يفشل في C++."
type: docs
weight: 300
url: /ar/cpp/system.io/fileinfo/copyto/
---
## FileInfo::CopyTo(const String\&) method


ينسخ الملف الذي يمثله الكائن الحالي إلى الموقع المحدد. إذا كان الملف الهدف موجودًا بالفعل، سيفشل النسخ.

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| destFileName | const String\& | اسم ملف الوجهة |

### ReturnValue

كائن [FileInfo](../) يمثل النسخة

## انظر أيضًا

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::CopyTo(const String\&, bool) method


ينسخ الملف الذي يمثله الكائن الحالي إلى الموقع المحدد. يحدد معلمة ما إذا كان يجب استبدال الملف الهدف الموجود.

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName, bool overwrite)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| destFileName | const String\& | اسم ملف الوجهة |
| استبدال | bool | صحيح إذا كان يجب استبدال ملف الوجهة الموجود، خطأ إذا يجب أن يفشل النسخ إذا كان ملف الوجهة موجودًا بالفعل |

### ReturnValue

كائن [FileInfo](../) يمثل النسخة

## انظر أيضًا

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
