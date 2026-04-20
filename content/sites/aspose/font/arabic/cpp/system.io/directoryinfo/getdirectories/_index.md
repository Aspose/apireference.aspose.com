---
title: "طريقة System::IO::DirectoryInfo::GetDirectories"
linktitle: "GetDirectories"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::DirectoryInfo::GetDirectories. تُرجع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات DirectoryInfo تمثل جميع الأدلة الموجودة في الدليل الذي يمثله الكائن الحالي في C++."
type: docs
weight: 1200
url: /ar/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


تُرجع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات [DirectoryInfo](../) تمثل جميع الأدلة الموجودة في الدليل الذي يمثله الكائن الحالي.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


يبحث عن الأدلة التي تلبي معايير البحث المحددة في الدليل الذي تمثله الكائن الحالي.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للمجلدات التي يتم البحث عنها |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [DirectoryInfo](../) تمثل المجلدات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


يبحث عن الأدلة التي تلبي معايير البحث المحددة إما في الدليل الذي تمثله الكائن الحالي أو في شجرة الأدلة الكاملة التي جذورها الدليل الذي تمثله الكائن الحالي.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للمجلدات التي يتم البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في المجلد الممثل بالكائن الحالي فقط أو في شجرة المجلدات الكاملة المتجذرة في المجلد الممثل بالكائن الحالي |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [DirectoryInfo](../) تمثل المجلدات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
