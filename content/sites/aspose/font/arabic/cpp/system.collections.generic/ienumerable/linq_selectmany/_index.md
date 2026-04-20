---
title: "طريقة System::Collections::Generic::IEnumerable::LINQ_SelectMany"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام طريقة LINQ_SelectMany الخاصة بفئة System::Collections::Generic::IEnumerable في C++."
type: docs
weight: 2700
url: /ar/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


يُسقط كل عنصر من التسلسل ويجمع التسلسلات الناتجة في تسلسل واحد.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| معامل | الوصف |
| --- | --- |
| ResultType | نوع القيمة التي تُرجعها **selector**. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | دالة تحويل. |

### ReturnValue

[IEnumerable](../) يحتوي على نتيجة استدعاء دالة إسقاط من واحد إلى متعدد على كل عنصر من التسلسل المدخل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
