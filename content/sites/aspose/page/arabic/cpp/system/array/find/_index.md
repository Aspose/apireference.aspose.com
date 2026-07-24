---
title: "طريقة System::Array::Find"
linktitle: "بحث"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Array::Find. تبحث عن أول عنصر في المصفوفة المحددة يحقق شروط المتنبئ المحدد في C++."
type: docs
weight: 5100
url: /ar/cpp/system/array/find/
---
## Array::Find method


يبحث عن أول عنصر في المصفوفة المحددة يفي بشروط الشرط المحدد.

```cpp
static T System::Array<T>::Find(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) للبحث عن عنصر في |
| مطابقة | System::Predicate\<T\> | متنبئ يحدد الشروط لمطابقة عناصر المصفوفة ضدها |

### ReturnValue

نسخة من العنصر الأول في المصفوفة الذي يحقق الشروط المحددة بواسطة المتنبئ، وإلا القيمة الافتراضية من النوع T

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
