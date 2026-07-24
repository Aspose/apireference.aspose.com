---
title: "System::Array::BinarySearch 方法"
linktitle: "BinarySearch"
second_title: "Aspose.Page 适用于 C++"
description: "System::Array::BinarySearch 方法。对已排序的 C++ 数组执行二分查找。"
type: docs
weight: 4600
url: /zh/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


在已排序的数组中执行二分查找。

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | 用于执行搜索的已排序数组 |
| item | const T\& | 要搜索的项 |

### ReturnValue

如果找到则返回搜索项的索引；否则返回一个负整数，该负整数是下一个大于搜索项的索引的按位取反，或者如果不存在更大的项，则是数组元素数量的按位取反。

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


未实现。

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
