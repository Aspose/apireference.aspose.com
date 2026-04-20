---
title: "طريقة System::StringComparer::Create"
linktitle: "Create"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::StringComparer::Create. تُنشئ مقارنًا خاصًا بالثقافة في C++."
type: docs
weight: 100
url: /ar/cpp/system/stringcomparer/create/
---
## StringComparer::Create method


ينشئ مُقارنًا خاصًا بالثقافة.

```cpp
static StringComparerPtr System::StringComparer::Create(const System::SharedPtr<System::Globalization::CultureInfo> &culture, bool ignoreCase)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الثقافة | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | الثقافة لإنشاء المقارن لها. |
| ignoreCase | bool | ما إذا كان المقارن يجب أن يتجاهل حالة الأحرف. |

### ReturnValue

مؤشر إلى كائن المقارن الذي تم إنشاؤه حديثًا.

## انظر أيضًا

* Typedef [StringComparerPtr](../../stringcomparerptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [StringComparer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
