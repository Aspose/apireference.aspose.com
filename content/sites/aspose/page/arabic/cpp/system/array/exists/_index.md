---
title: "طريقة System::Array::Exists"
linktitle: "Exists"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Array::Exists. تحدد ما إذا كان كائن Array المحدد يحتوي على عنصر يفي بمتطلبات الدالة الشرطية المحددة في C++."
type: docs
weight: 5000
url: /ar/cpp/system/array/exists/
---
## Array::Exists method


تحدد ما إذا كان كائن [Array](../) المحدد يحتوي على عنصر يفي بمتطلبات الدالة الشرطية المحددة.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | المصفوفة التي يُبحث فيها عن العنصر |
| مطابقة | std::function\<bool(T)> | كائن الدالة الذي يحدد المتطلبات ويتحقق مما إذا كان العنصر يفي بها |

### ReturnValue

صحيح إذا كان **arr** يحتوي على عنصر يفي بالمتطلبات المحددة بواسطة **match**

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
