---
title: "System::IO::DirectoryInfo::GetDirectories طريقة"
linktitle: "GetDirectories"
second_title: "Aspose.Page لـ C++"
description: "System::IO::DirectoryInfo::GetDirectories طريقة. تُرجع مصفوفة تحتوي على مؤشرات مشتركة إلى كائنات DirectoryInfo تمثل جميع الأدلة الموجودة في الدليل الذي يمثله الكائن الحالي في C++."
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
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


يبحث عن الأدلة التي تلبي معايير البحث المحددة في الدليل الذي تمثله الكائن الحالي.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط اسم الأدلة للبحث عنها |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [DirectoryInfo](../) تمثل الأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


يبحث عن الأدلة التي تلبي معايير البحث المحددة إما في الدليل الذي تمثله الكائن الحالي أو في شجرة الأدلة الكاملة المتجذرة في الدليل الذي تمثله الكائن الحالي.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط اسم الأدلة للبحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل الذي يمثله الكائن الحالي فقط أم في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي |

### ReturnValue

مصفوفة من المؤشرات المشتركة إلى كائنات [DirectoryInfo](../) تمثل الأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
