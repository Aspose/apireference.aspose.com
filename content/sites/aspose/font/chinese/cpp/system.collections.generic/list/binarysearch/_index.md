---
title: "System::Collections::Generic::List::BinarySearch 方法"
linktitle: "BinarySearch"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::List::BinarySearch 方法。在 C++ 中的已排序列表中查找项。"
type: docs
weight: 800
url: /zh/cpp/system.collections.generic/list/binarysearch/
---
## List::BinarySearch(const T\&) const method


在已排序的列表中查找项目。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(const T &item) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 项 | const T\& | 要查找的项。 |

### ReturnValue

已排序列表中项的索引，或最近索引的补数。

## 另见

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## List::BinarySearch(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const method


在已排序的列表中查找项目。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(const T &item, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 项 | const T\& | 要查找的项。 |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../../comparer/) 使用。 |

### ReturnValue

已排序列表中项的索引，或最近索引的补数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## List::BinarySearch(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const method


在已排序的列表中查找项目。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(int index, int count, const T &item, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 范围起始。 |
| count | int | 范围大小。 |
| 项 | const T\& | 要查找的项。 |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../../comparer/) 使用。 |

### ReturnValue

已排序列表中项的索引，或最近索引的补数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
