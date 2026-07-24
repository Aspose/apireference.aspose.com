---
title: "System::Array::CopyTo 方法"
linktitle: "CopyTo"
second_title: "Aspose.Page 适用于 C++"
description: "System::Array::CopyTo 方法。将当前数组的所有元素复制到指定的目标数组中。元素从 C++ 中由 arrayIndex 参数指定的索引开始插入到目标数组。"
type: docs
weight: 900
url: /zh/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


将当前数组的所有元素复制到指定的目标数组。元素从由 arrayIndex 参数指定的索引开始插入到目标数组中。

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | 目标数组 |
| arrayIndex | int | 目标数组中的索引，指定插入复制项目的起始位置 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


将当前数组的所有元素复制到指定的目标数组。元素从由 dstIndex 参数指定的索引开始插入到目标数组中。

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | 描述 |
| --- | --- |
| DstType | 目标数组中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| dstIndex | int64_t | 目标数组中的索引，指定插入复制项目的起始位置 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


将当前数组中从指定位置开始的指定数量的元素复制到指定的目标数组。元素从由 dstIndex 参数指定的索引开始插入到目标数组中。

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | 描述 |
| --- | --- |
| DstType | 目标数组中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| srcIndex | int64_t | 源数组中的索引，指定开始复制项目的位置 |
| dstIndex | int64_t | 目标数组中的索引，指定插入复制项目的起始位置 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


将当前数组的所有元素复制到指定的目标数组视图。元素从由 dstIndex 参数指定的索引开始插入到目标数组视图中。

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | 描述 |
| --- | --- |
| DstType | 目标数组视图中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | 目标数组视图 |
| dstIndex | int64_t | 在目标数组视图中开始插入复制项的索引 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


将当前数组中从指定位置开始的指定数量的元素复制到指定的目标数组视图。元素从由 dstIndex 参数指定的索引开始插入到目标数组视图中。

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | 描述 |
| --- | --- |
| DstType | 目标数组视图中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | 目标数组视图 |
| srcIndex | int64_t | 源数组中的索引，指定开始复制项目的位置 |
| dstIndex | int64_t | 在目标数组视图中开始插入复制项的索引 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
