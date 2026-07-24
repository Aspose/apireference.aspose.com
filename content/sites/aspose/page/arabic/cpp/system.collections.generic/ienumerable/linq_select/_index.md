---
title: "System::Collections::Generic::IEnumerable::LINQ_Select طريقة"
linktitle: "LINQ_Select"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام طريقة LINQ_Select من فئة System::Collections::Generic::IEnumerable في C++."
type: docs
weight: 2600
url: /ar/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


يحوّل كل عنصر في تسلسل إلى شكل جديد من خلال دمج فهرس العنصر.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| Parameter | الوصف |
| --- | --- |
| ResultType | نوع القيمة التي تُرجعها **selector**. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | دالة تحويل. |

### ReturnValue

[IEnumerable](../) يحتوي على العناصر التي تُرجعها الدالة **selector**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


يحوّل عناصر تسلسل.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| Parameter | الوصف |
| --- | --- |
| ResultType | نوع القيمة التي تُرجعها **selector**. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | دالة تحويل. |

### ReturnValue

[IEnumerable](../) يحتوي على العناصر التي تُرجعها الدالة **selector**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
