---
title: "System::Collections::Generic::IEnumerable::LINQ_Select 方法"
linktitle: "LINQ_Select"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Collections::Generic::IEnumerable 类的 LINQ_Select 方法。"
type: docs
weight: 2600
url: /zh/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## 另见

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

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


通过结合元素的索引，将序列的每个元素转换为新形式。

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| 参数 | 描述 |
| --- | --- |
| ResultType | 由 **selector** 返回的值的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | 一个转换函数。 |

### ReturnValue

一个包含 **selector** 函数返回的元素的 [IEnumerable](../)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


转换序列的元素。

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| 参数 | 描述 |
| --- | --- |
| ResultType | 由 **selector** 返回的值的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | 一个转换函数。 |

### ReturnValue

一个包含 **selector** 函数返回的元素的 [IEnumerable](../)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
