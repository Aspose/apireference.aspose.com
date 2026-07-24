---
title: "طريقة System::IO::DirectoryInfo::EnumerateDirectories"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::DirectoryInfo::EnumerateDirectories. تُرجِع مجموعة قابلة للتعداد تحتوي على جميع الأدلة الموجودة في الدليل الذي يمثله الكائن الحالي في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


يعيد مجموعة قابلة للتعداد تحتوي على جميع الأدلة الموجودة في الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


يبحث عن الأدلة التي تلبي معايير البحث المحددة في الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط اسم الأدلة للبحث عنها |

### ReturnValue

مجموعة القابلة للتعداد من المؤشرات المشتركة إلى كائنات [DirectoryInfo](../) تمثل الأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


يبحث عن الأدلة التي تلبي معايير البحث المحددة إما في الدليل الذي تمثله الكائن الحالي أو في شجرة الأدلة الكاملة المتجذرة في الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط اسم الأدلة للبحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل الذي يمثله الكائن الحالي فقط أم في شجرة الأدلة الكاملة المتجذرة في الدليل الذي يمثله الكائن الحالي |

### ReturnValue

مجموعة القابلة للتعداد من المؤشرات المشتركة إلى كائنات [DirectoryInfo](../) تمثل الأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
