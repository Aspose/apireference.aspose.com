---
title: "طريقة System::Array::FindIndex"
linktitle: "FindIndex"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Array::FindIndex. تبحث عن أول عنصر في المصفوفة المحددة يحقق شروط الدالة الشرطية المحددة في C++."
type: docs
weight: 5300
url: /ar/cpp/system/array/findindex/
---
## Array::FindIndex method


يبحث عن أول عنصر في المصفوفة المحددة يفي بشروط الدالة الشرطية المحددة.

```cpp
static int System::Array<T>::FindIndex(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) للبحث عن عنصر في |
| مطابقة | System::Predicate\<T\> | دالة شرطية تحدد الشروط لمطابقة عناصر المصفوفة |

### ReturnValue

فهرس أول عنصر في المصفوفة يحقق الشروط المحددة بواسطة الدالة الشرطية، وإلا -1

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
