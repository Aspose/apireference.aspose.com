---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos طريقة"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Page لـ C++"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos طريقة. تُرجع مجموعة قابلة للتعداد تحتوي على جميع الملفات والدلائل الموجودة في الدليل الممثل بواسطة الكائن الحالي في C++."
type: docs
weight: 700
url: /ar/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


يرجع مجموعة قابلة للتعداد تحتوي على جميع الملفات والأدلة الموجودة في الدليل الذي يمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة في الدليل الذي يمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |

### ReturnValue

مجموعة القابلة للتعداد من المؤشرات المشتركة إلى كائنات [FileSystemInfo](../../filesysteminfo/) التي تمثل الملفات والدلائل التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل الذي يمثله الكائن الحالي أو في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل الذي يمثله الكائن الحالي فقط أم في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي |

### ReturnValue

مجموعة القابلة للتعداد من المؤشرات المشتركة إلى كائنات [FileSystemInfo](../../filesysteminfo/) التي تمثل الملفات والدلائل التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
