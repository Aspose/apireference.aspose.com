---
title: "System::Array::FindAll طريقة"
linktitle: "FindAll"
second_title: "Aspose.Page لـ C++"
description: "System::Array::FindAll طريقة. تسترجع جميع العناصر التي تطابق الشروط المحددة بواسطة الدالة الشرطية المحددة في C++."
type: docs
weight: 5200
url: /ar/cpp/system/array/findall/
---
## Array::FindAll method


يسترجع جميع العناصر التي تطابق الشروط المحددة بواسطة الشرط المحدد.

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) للبحث عن عناصر في |
| مطابقة | System::Predicate\<T\> | متنبئ يحدد الشروط لمطابقة عناصر المصفوفة ضدها |

### ReturnValue

مصفوفة [Array](../) تحتوي على جميع العناصر التي تطابق الشروط المحددة بواسطة الدالة الشرطية المحددة، إذا وجدت؛ وإلا، مصفوفة [Array](../) فارغة.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
