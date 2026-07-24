---
title: "طريقة System::MakeYieldEnumerator"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::MakeYieldEnumerator. تُنشئ IEnumerator من دالة yield في C++."
type: docs
weight: 25400
url: /ar/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


ينشئ IEnumerator من دالة yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العناصر في التسلسل |

| Parameter | Type | الوصف |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | دالة العائد للتنفيذ |

### ReturnValue

مؤشر مشترك إلى IEnumerator

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
