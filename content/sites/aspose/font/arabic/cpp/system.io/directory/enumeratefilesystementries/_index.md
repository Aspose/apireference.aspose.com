---
title: "طريقة System::IO::Directory::EnumerateFileSystemEntries"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::Directory::EnumerateFileSystemEntries. تبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | المسار الكامل أو النسبي إلى الدليل المراد البحث فيه |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل المحدد فقط أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد |

### ReturnValue

مجموعة قابلة للتعداد من المسارات الكاملة للملفات والأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
