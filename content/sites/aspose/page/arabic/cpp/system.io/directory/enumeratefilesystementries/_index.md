---
title: "System::IO::Directory::EnumerateFileSystemEntries طريقة"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::Directory::EnumerateFileSystemEntries. يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | المسار الكامل أو النسبي إلى الدليل المراد البحث فيه |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل المحدد فقط أم في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد |

### ReturnValue

مجموعة القابلة للتعداد من المسارات الكاملة للملفات والأدلة التي تم العثور عليها والتي تطابق **searchPattern**

## انظر أيضًا

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
