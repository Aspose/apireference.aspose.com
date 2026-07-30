---
title: "System::Array::Sort 方法"
linktitle: "排序"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::Sort 方法。对两个数组进行排序：一个包含键，另一个包含对应的项。排序依据键数组的值，键数组的元素使用 C++ 中的 operator< 进行比较。"
type: docs
weight: 5800
url: /zh/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


对两个数组进行排序，一个包含键，另一个包含相应的项，排序依据包含键的数组的值，键数组的元素使用 operator< 进行比较。

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| 参数 | 描述 |
| --- | --- |
| TKey | **keys** 数组中元素的类型 |
| TValue | **items** 数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | 包含键值的 [Array](../) |
| items | const ArrayPtr\<TValue\>\& | 包含映射到 **keys** 数组键值的项的 [Array](../) |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


对两个数组进行排序，一个包含键，另一个包含相应的项，排序依据包含键的数组的值，键数组的元素使用默认比较器进行比较。

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| 参数 | 描述 |
| --- | --- |
| TKey | **keys** 数组中元素的类型 |
| TValue | **items** 数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | 包含键值的 [Array](../) |
| items | const ArrayPtr\<TValue\>\& | 包含映射到 **keys** 数组键值的项的 [Array](../) |
| 索引 | int | 指定排序范围起始位置的索引 |
| 长度 | int | 要排序的范围内的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


使用默认比较器对指定数组中的元素进行排序。

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 目标数组 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


使用指定的比较器对指定数组中的元素进行排序。

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 目标数组 |
| 比较器 | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | 用于比较数组元素的 IComparer<T> 对象 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


未实现。

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


使用默认比较器对指定数组中一段范围的元素进行排序。

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 目标数组 |
| startIndex | int | 指定要排序的元素范围起始位置的索引 |
| count | int | 要排序的元素范围的大小 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
