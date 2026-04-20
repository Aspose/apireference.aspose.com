---
title: "طريقة System::Collections::Generic::IEnumerable::LINQ_Max"
linktitle: "LINQ_Max"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام طريقة LINQ_Max في فئة System::Collections::Generic::IEnumerable بلغة C++."
type: docs
weight: 2000
url: /ar/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## انظر أيضًا

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


ينفّذ دالة تحويل على كل عنصر من تسلسل عام ويعيد القيمة القصوى الناتجة.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| معامل | الوصف |
| --- | --- |
| ResultType | نوع القيمة التي تُرجعها الدالة selector. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | دالة تحويل لتطبيقها على كل عنصر. |

### ReturnValue

القيمة القصوى في التسلسل.

## انظر أيضًا

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
