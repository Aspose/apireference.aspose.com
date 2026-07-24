---
title: "System::Collections::Generic::List::Sort method"
linktitle: "排序"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::List::Sort 方法。使用默认比较器对列表中的元素进行排序（在 C++ 中）。"
type: docs
weight: 4400
url: /zh/cpp/system.collections.generic/list/sort/
---
## List::Sort() method


使用默认比较器对列表中的元素进行排序。

```cpp
void System::Collections::Generic::List<T>::Sort()
```

## 另见

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(Comparison\<T\>, bool) method


对列表中的元素进行排序。

```cpp
void System::Collections::Generic::List<T>::Sort(Comparison<T> comparison, bool)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| comparison | Comparison\<T\> | [Comparison](../../../system/comparison/) 用于使用。 |

## 另见

* Class [Comparison](../../../system/comparison/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


对列表中的元素进行排序。

```cpp
void System::Collections::Generic::List<T>::Sort(const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 比较器 | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | 要使用的比较器。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) method


对列表切片中的元素进行排序。

```cpp
void System::Collections::Generic::List<T>::Sort(int index, int count, SharedPtr<System::Collections::Generic::IComparer<T>> comparator)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int | 切片起始索引。 |
| count | int | 切片大小。 |
| 比较器 | SharedPtr\<System::Collections::Generic::IComparer\<T\>\> | 要使用的比较器。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
