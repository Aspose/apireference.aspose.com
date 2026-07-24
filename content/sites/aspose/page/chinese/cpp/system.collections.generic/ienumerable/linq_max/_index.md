---
title: "System::Collections::Generic::IEnumerable::LINQ_Max 方法"
linktitle: "LINQ_Max"
second_title: "Aspose.Page 适用于 C++"
description: "如何在 C++ 中使用 System::Collections::Generic::IEnumerable 类的 LINQ_Max 方法。"
type: docs
weight: 2000
url: /zh/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## 另见

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


对通用序列的每个元素调用转换函数，并返回结果中的最大值。

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parameter | 描述 |
| --- | --- |
| ResultType | 选择器返回的值的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | 对每个元素应用的转换函数。 |

### ReturnValue

序列中的最大值。

## 另见

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
