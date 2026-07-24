---
title: "System::IO::DirectoryInfo::EnumerateFiles طريقة"
linktitle: "EnumerateFiles"
second_title: "Aspose.Page لـ C++"
description: "System::IO::DirectoryInfo::EnumerateFiles طريقة. تُرجع مجموعة قابلة للتعداد تحتوي على جميع الملفات الموجودة في الدليل الذي يمثله الكائن الحالي في C++."
type: docs
weight: 600
url: /ar/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


يرجع مجموعة قابلة للتعداد تحتوي على جميع الملفات الموجودة في الدليل الذي يمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


يبحث عن الملفات التي تلبي معايير البحث المحددة في الدليل الذي يمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط اسم الملفات للبحث عنها |

### ReturnValue

مجموعة قابلة للتعداد من المؤشرات المشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل الملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


يبحث عن الملفات التي تلبي معايير البحث المحددة إما في الدليل الذي يمثله الكائن الحالي أو في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط اسم الملفات للبحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل الذي يمثله الكائن الحالي فقط أم في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي |

### ReturnValue

مجموعة قابلة للتعداد من المؤشرات المشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل الملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
