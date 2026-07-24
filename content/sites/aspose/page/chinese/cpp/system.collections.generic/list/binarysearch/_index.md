---
title: "System::Collections::Generic::List::BinarySearch 方法"
linktitle: "BinarySearch"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::List::BinarySearch 方法。用于在 C++ 中的已排序列表中查找项。"
type: docs
weight: 800
url: /zh/cpp/system.collections.generic/list/binarysearch/
---
## List::BinarySearch(const T\&) const method


在已排序的列表中查找项目。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(const T &item) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| item | const T\& | 要查找的项。 |

### ReturnValue

已排序列表中项的索引，或最近索引的补数。

## 另见

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::BinarySearch(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const method


在已排序的列表中查找项目。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(const T &item, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| item | const T\& | 要查找的项。 |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | 要使用的 [Comparer](../../comparer/)。 |

### ReturnValue

已排序列表中项的索引，或最近索引的补数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::BinarySearch(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const method


在已排序的列表中查找项目。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(int index, int count, const T &item, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int | 范围起始。 |
| count | int | 范围大小。 |
| item | const T\& | 要查找的项。 |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | 要使用的 [Comparer](../../comparer/)。 |

### ReturnValue

已排序列表中项的索引，或最近索引的补数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
