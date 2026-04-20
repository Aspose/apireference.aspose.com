---
title: "System::IO::DirectoryInfo::EnumerateDirectories method"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::DirectoryInfo::EnumerateDirectories. تُرجع مجموعة قابلة للتعداد تحتوي على جميع الأدلة الموجودة في الدليل الذي يمثله الكائن الحالي في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


يرجع مجموعة قابلة للتعداد تحتوي على جميع الأدلة الموجودة في الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


يبحث عن الأدلة التي تلبي معايير البحث المحددة في الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للمجلدات التي يتم البحث عنها |

### ReturnValue

مجموعة قابلة للتعداد من المؤشرات المشتركة إلى كائنات [DirectoryInfo](../) التي تمثل الأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


يبحث عن الأدلة التي تلبي معايير البحث المحددة إما في الدليل الذي تمثله الكائن الحالي أو في شجرة الأدلة الكاملة التي جذورها الدليل الذي تمثله الكائن الحالي.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| searchPattern | const String\& | نمط الاسم للمجلدات التي يتم البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في المجلد الممثل بالكائن الحالي فقط أو في شجرة المجلدات الكاملة المتجذرة في المجلد الممثل بالكائن الحالي |

### ReturnValue

مجموعة قابلة للتعداد من المؤشرات المشتركة إلى كائنات [DirectoryInfo](../) التي تمثل الأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
