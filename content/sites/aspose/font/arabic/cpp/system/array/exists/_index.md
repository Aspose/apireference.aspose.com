---
title: "System::Array::Exists طريقة"
linktitle: "Exists"
second_title: "Aspose.Font لـ C++"
description: "System::Array::Exists طريقة. يحدد ما إذا كان كائن Array المحدد يحتوي على عنصر يفي بمتطلبات الدالة الشرطية المحددة في C++."
type: docs
weight: 5000
url: /ar/cpp/system/array/exists/
---
## Array::Exists method


يحدد ما إذا كان كائن [Array](../) المحدد يحتوي على عنصر يفي بمتطلبات الدالة الشرطية المحددة.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | المصفوفة للبحث عن العنصر فيها |
| مطابقة | std::function\<bool(T)> | كائن الدالة الذي يحدد المتطلبات ويتحقق مما إذا كان العنصر يفي بها |

### ReturnValue

صحيح إذا كان **arr** يحتوي على عنصر يفي بالمتطلبات المحددة بواسطة **match**

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
