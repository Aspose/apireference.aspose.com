---
title: "System::Collections::Generic::IEnumerable::LINQ_Max 方法"
linktitle: "LINQ_Max"
second_title: "Aspose.Font 适用于 C++"
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
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


对通用序列的每个元素调用转换函数，并返回最大结果值。

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| 参数 | 描述 |
| --- | --- |
| ResultType | selector 返回的值的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | 一个用于对每个元素进行转换的函数。 |

### ReturnValue

序列中的最大值。

## 另见

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
