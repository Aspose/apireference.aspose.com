---
title: "طريقة System::IO::DirectoryInfo::GetFileSystemInfos"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::DirectoryInfo::GetFileSystemInfos. تُرجع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات FileSystemInfo تمثل جميع الملفات والأدلة الموجودة في الدليل الذي يمثله الكائن الحالي في C++."
type: docs
weight: 1400
url: /ar/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


تُرجع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات [FileSystemInfo](../../filesysteminfo/) تمثل جميع الملفات والأدلة الموجودة في الدليل الذي يمثله الكائن الحالي.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة في الدليل الذي يمثله الكائن الحالي.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [FileSystemInfo](../../filesysteminfo/) تمثل الملفات والأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل الذي يمثله الكائن الحالي أو في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في المجلد الممثل بالكائن الحالي فقط أو في شجرة المجلدات الكاملة المتجذرة في المجلد الممثل بالكائن الحالي |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [FileSystemInfo](../../filesysteminfo/) تمثل الملفات والأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
