---
title: "System::IO::DirectoryInfo::GetFiles طريقة"
linktitle: "GetFiles"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::DirectoryInfo::GetFiles. تُرجِع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات FileInfo تمثل جميع الأدلة الموجودة في الدليل الذي يمثله الكائن الحالي في C++."
type: docs
weight: 1300
url: /ar/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


تُرجِع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل جميع الأدلة الموجودة في الدليل الذي يمثله الكائن الحالي.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


يبحث عن الملفات التي تلبي معايير البحث المحددة في الدليل الذي يمثله الكائن الحالي.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط اسم الملفات للبحث عنها |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل الملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


يبحث عن الملفات التي تلبي معايير البحث المحددة إما في الدليل الذي يمثله الكائن الحالي أو في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط اسم الملفات للبحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل الذي يمثله الكائن الحالي فقط أم في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [FileInfo](../../fileinfo/) تمثل الملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
