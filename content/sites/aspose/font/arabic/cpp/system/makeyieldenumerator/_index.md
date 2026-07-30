---
title: "طريقة System::MakeYieldEnumerator"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::MakeYieldEnumerator. تنشئ IEnumerator من دالة yield في C++."
type: docs
weight: 25500
url: /ar/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


ينشئ IEnumerator من دالة yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| معامل | الوصف |
| --- | --- |
| T | نوع العناصر في التسلسل |

| معامل | نوع | الوصف |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | دالة الـ yield للتنفيذ |

### ReturnValue

مؤشر مشترك إلى IEnumerator

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
