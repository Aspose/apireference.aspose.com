---
title: "طريقة System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::MakeYieldEnumerable. تنشئ IEnumerable من دالة yield في C++."
type: docs
weight: 25300
url: /ar/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


ينشئ IEnumerable من دالة yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العناصر في التسلسل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | دالة العائد للتنفيذ |

### ReturnValue

مؤشر مشترك إلى الـ IEnumerable

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
