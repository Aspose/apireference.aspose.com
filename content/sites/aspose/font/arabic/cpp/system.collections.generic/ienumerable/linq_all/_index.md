---
title: "System::Collections::Generic::IEnumerable::LINQ_All method"
linktitle: "LINQ_All"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::IEnumerable::LINQ_All method. يحدد ما إذا كانت جميع عناصر التسلسل تلبي شرطًا في C++."
type: docs
weight: 700
url: /ar/cpp/system.collections.generic/ienumerable/linq_all/
---
## IEnumerable::LINQ_All method


يحدد ما إذا كانت جميع عناصر التسلسل تفي بشرط.

```cpp
bool System::Collections::Generic::IEnumerable<T>::LINQ_All(std::function<bool(T)> predicate)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| predicate | std::function\<bool(T)> | دالة لاختبار كل عنصر وفق شرط. |

### ReturnValue

true إذا مر كل عنصر من تسلسل المصدر بالاختبار في الدالة المحددة، أو إذا كان التسلسل فارغًا؛ وإلا، false.

## انظر أيضًا

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
