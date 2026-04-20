---
title: "System::IO::DirectoryInfo::EnumerateFiles method"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font لـ C++"
description: "System::IO::DirectoryInfo::EnumerateFiles method. يُرجِع مجموعة قابلة للتعداد تحتوي على جميع الملفات الموجودة في المجلد الممثل بالكائن الحالي في C++."
type: docs
weight: 600
url: /ar/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


يرجع مجموعة قابلة للتعداد تحتوي على جميع الملفات الموجودة في الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


يبحث عن الملفات التي تلبي معايير البحث المحددة في الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات التي يتم البحث عنها |

### ReturnValue

المجموعة القابلة للتعداد من المؤشرات المشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل الملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


يبحث عن الملفات التي تلبي معايير البحث المحددة إما في الدليل الذي تمثله الكائن الحالي أو في شجرة الملفات الكاملة التي جذورها الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للملفات التي يتم البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في المجلد الممثل بالكائن الحالي فقط أو في شجرة المجلدات الكاملة المتجذرة في المجلد الممثل بالكائن الحالي |

### ReturnValue

المجموعة القابلة للتعداد من المؤشرات المشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل الملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
