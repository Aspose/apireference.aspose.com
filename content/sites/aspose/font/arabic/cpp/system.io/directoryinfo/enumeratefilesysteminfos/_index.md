---
title: "طريقة System::IO::DirectoryInfo::EnumerateFileSystemInfos"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::DirectoryInfo::EnumerateFileSystemInfos. تُرجع مجموعة قابلة للتعداد تحتوي على جميع الملفات والمجلدات الموجودة في الدليل الذي يمثله الكائن الحالي في C++."
type: docs
weight: 700
url: /ar/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


يرجع مجموعة قابلة للتعداد تحتوي على جميع الملفات والأدلة الموجودة في الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة في الدليل الذي يمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |

### ReturnValue

مجموعة قابلة للتعداد من المؤشرات المشتركة إلى كائنات [FileSystemInfo](../../filesysteminfo/) التي تمثل الملفات والمجلدات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل الذي يمثله الكائن الحالي أو في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في المجلد الممثل بالكائن الحالي فقط أو في شجرة المجلدات الكاملة المتجذرة في المجلد الممثل بالكائن الحالي |

### ReturnValue

مجموعة قابلة للتعداد من المؤشرات المشتركة إلى كائنات [FileSystemInfo](../../filesysteminfo/) التي تمثل الملفات والمجلدات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
