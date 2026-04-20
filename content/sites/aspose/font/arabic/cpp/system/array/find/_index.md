---
title: "System::Array::Find طريقة"
linktitle: "Find"
second_title: "Aspose.Font لـ C++"
description: "System::Array::Find طريقة. يبحث عن أول عنصر في المصفوفة المحددة الذي يحقق شروط الدالة المحددة في C++."
type: docs
weight: 5100
url: /ar/cpp/system/array/find/
---
## Array::Find method


يبحث عن أول عنصر في المصفوفة المحددة يفي بشروط الدالة الشرطية المحددة.

```cpp
static T System::Array<T>::Find(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) للبحث عن عنصر في |
| مطابقة | System::Predicate\<T\> | دالة شرطية تحدد الشروط لمطابقة عناصر المصفوفة |

### ReturnValue

نسخة من أول عنصر في المصفوفة يحقق الشروط المحددة بواسطة الدالة الشرطية، وإلا القيمة الافتراضية من النوع T

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
