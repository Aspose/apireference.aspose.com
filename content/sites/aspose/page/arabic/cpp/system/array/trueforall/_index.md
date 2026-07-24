---
title: "طريقة System::Array::TrueForAll"
linktitle: "TrueForAll"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Array::TrueForAll. تحدد ما إذا كانت جميع العناصر في المصفوفة المحددة تحقق الشروط المحددة بواسطة الدالة الشرطية المحددة في C++."
type: docs
weight: 5900
url: /ar/cpp/system/array/trueforall/
---
## Array::TrueForAll method


يحدد ما إذا كانت جميع العناصر في المصفوفة المحددة تفي بالشروط المحددة بواسطة الدالة الشرطية المحددة.

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | عناصر [Array](../) التي يجب مطابقتها مع الشروط |
| مطابقة | System::Predicate\<T\> | متنبئ يحدد الشروط لمطابقة عناصر المصفوفة ضدها |

### ReturnValue

صحيح إذا كانت جميع عناصر المصفوفة arr تحقق الشروط المحددة بواسطة الدالة الشرطية match، وإلا خطأ

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
