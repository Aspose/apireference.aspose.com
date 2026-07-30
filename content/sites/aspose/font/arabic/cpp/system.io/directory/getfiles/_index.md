---
title: "طريقة System::IO::Directory::GetFiles"
linktitle: "GetFiles"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::Directory::GetFiles. تبحث عن الملفات التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد في C++."
type: docs
weight: 1200
url: /ar/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


يبحث عن الملفات التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | المسار الكامل أو النسبي إلى الدليل المراد البحث فيه |
| searchPattern | const String\& | نمط الاسم للملفات التي يتم البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل المحدد فقط أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد |

### ReturnValue

مصفوفة من المسارات الكاملة للملفات التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
