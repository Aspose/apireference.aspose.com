---
title: "طريقة System::Collections::Generic::IEnumerable::LINQ_Min"
linktitle: "LINQ_Min"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام طريقة LINQ_Min من فئة System::Collections::Generic::IEnumerable في C++."
type: docs
weight: 2100
url: /ar/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## انظر أيضًا

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


يستدعي دالة تحويل على كل عنصر في تسلسل عام ويعيد القيمة الدنيا الناتجة.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| Parameter | الوصف |
| --- | --- |
| ResultType | نوع القيمة التي تُرجعها selector. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | دالة تحويل لتطبيقها على كل عنصر. |

### ReturnValue

القيمة الدنيا في التسلسل.

## انظر أيضًا

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
