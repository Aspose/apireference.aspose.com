---
title: "طريقة System::Collections::Generic::IEnumerable::LINQ_Select"
linktitle: "LINQ_Select"
second_title: "Aspose.Font لـ C++"
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
* Library [Aspose.Font for C++](../../../)
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
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


يحوّل كل عنصر من التسلسل إلى شكل جديد باستخدام فهرس العنصر.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| معامل | الوصف |
| --- | --- |
| ResultType | نوع القيمة التي تُرجعها **selector**. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | دالة تحويل. |

### ReturnValue

مجموعة [IEnumerable](../) التي تحتوي على العناصر التي تُرجعها الدالة **selector**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


يحوّل عناصر التسلسل.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| معامل | الوصف |
| --- | --- |
| ResultType | نوع القيمة التي تُرجعها **selector**. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | دالة تحويل. |

### ReturnValue

مجموعة [IEnumerable](../) التي تحتوي على العناصر التي تُرجعها الدالة **selector**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
