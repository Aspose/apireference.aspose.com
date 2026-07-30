---
title: "System::IO::DirectoryInfo::GetFiles method"
linktitle: "GetFiles"
second_title: "Aspose.Font لـ C++"
description: "System::IO::DirectoryInfo::GetFiles method. يُرجِع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات FileInfo تمثل جميع المجلدات الموجودة في المجلد الممثل بالكائن الحالي في C++."
type: docs
weight: 1300
url: /ar/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


يُرجِع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل جميع المجلدات الموجودة في المجلد الممثل بالكائن الحالي.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


يبحث عن الملفات التي تلبي معايير البحث المحددة في الدليل الذي تمثله الكائن الحالي.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات التي يتم البحث عنها |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل الملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


يبحث عن الملفات التي تلبي معايير البحث المحددة إما في الدليل الذي تمثله الكائن الحالي أو في شجرة الملفات الكاملة التي جذورها الدليل الذي تمثله الكائن الحالي.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات التي يتم البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في المجلد الممثل بالكائن الحالي فقط أو في شجرة المجلدات الكاملة المتجذرة في المجلد الممثل بالكائن الحالي |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل الملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
