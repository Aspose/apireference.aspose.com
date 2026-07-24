---
title: "System::Collections::Generic::IEnumerable::LINQ_All method"
linktitle: "LINQ_All"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::Generic::IEnumerable::LINQ_All method. يحدد ما إذا كانت جميع عناصر التسلسل تحقق شرطًا في C++."
type: docs
weight: 700
url: /ar/cpp/system.collections.generic/ienumerable/linq_all/
---
## IEnumerable::LINQ_All method


يحدد ما إذا كانت جميع عناصر التسلسل تلبي شرطًا.

```cpp
bool System::Collections::Generic::IEnumerable<T>::LINQ_All(std::function<bool(T)> predicate)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دالة شرط | std::function\<bool(T)> | دالة لاختبار كل عنصر وفق شرط. |

### ReturnValue

true إذا مر كل عنصر من تسلسل المصدر بالاختبار في الدالة المحددة، أو إذا كان التسلسل فارغًا؛ وإلا، false.

## انظر أيضًا

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
