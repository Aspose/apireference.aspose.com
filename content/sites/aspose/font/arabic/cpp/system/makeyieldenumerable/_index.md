---
title: "طريقة System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::MakeYieldEnumerable. تُنشئ IEnumerable من دالة yield في C++."
type: docs
weight: 25400
url: /ar/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


ينشئ IEnumerable من دالة yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| معامل | الوصف |
| --- | --- |
| T | نوع العناصر في التسلسل |

| معامل | نوع | الوصف |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | دالة الـ yield للتنفيذ |

### ReturnValue

مؤشر مشترك إلى IEnumerable

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
