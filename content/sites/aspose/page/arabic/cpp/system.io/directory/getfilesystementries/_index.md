---
title: "System::IO::Directory::GetFileSystemEntries طريقة"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Page لـ C++"
description: "System::IO::Directory::GetFileSystemEntries طريقة. يبحث عن الملفات والأدلة التي تُطابق معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد في C++."
type: docs
weight: 1300
url: /ar/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | المسار الكامل أو النسبي إلى الدليل المراد البحث فيه |
| searchPattern | const String\& | نمط الاسم للملفات والأدلة المراد البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل المحدد فقط أم في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد |

### ReturnValue

مصفوفة من المسارات الكاملة للملفات والأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
