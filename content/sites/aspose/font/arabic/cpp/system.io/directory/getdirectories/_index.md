---
title: "System::IO::Directory::GetDirectories طريقة"
linktitle: "GetDirectories"
second_title: "Aspose.Font لـ C++"
description: "System::IO::Directory::GetDirectories طريقة. يبحث عن الأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد في C++."
type: docs
weight: 1000
url: /ar/cpp/system.io/directory/getdirectories/
---
## Directory::GetDirectories method


يبحث عن الأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد.

```cpp
static ArrayPtr<String> System::IO::Directory::GetDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | المسار الكامل أو النسبي إلى الدليل المراد البحث فيه |
| searchPattern | const String\& | نمط الاسم للمجلدات التي يتم البحث عنها |
| searchOption | SearchOption | يحدد ما إذا كان يجب إجراء البحث في الدليل المحدد فقط أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد |

### ReturnValue

مصفوفة من المسارات الكاملة للأدلة التي تم العثور عليها والتي تتطابق أسماؤها مع **searchPattern**

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
