---
title: "System::Collections::Generic::_net_binnary_search 方法"
linktitle: "_net_binnary_search"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::_net_binnary_search 方法。实现对随机访问容器的二分搜索。针对智能指针的特化。使用 C++ 中的 System::Object::CompareTo 方法。"
type: docs
weight: 4900
url: /zh/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


实现对随机访问容器的二分搜索。针对智能指针的特化。使用 System::Object::CompareTo 方法。

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | 描述 |
| --- | --- |
| containerT | STL 风格的容器模板类型，具有两个模板参数：元素类型和分配器类型。 |
| T | 元素类型。 |
| Allocator | 分配器类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 容器 | const containterT\<T, Allocator\>\& | 要搜索的容器。 |
| 索引 | int | 搜索范围的起始索引。 |
| count | int | 搜索范围的长度。 |
| value | T | 要查找的值。 |

### ReturnValue

如果找到，则为下一个元素的索引；否则，为搜索停止时索引的补数。

## 另见

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


在随机访问容器中实现二分搜索。针对值类型的特化。使用 CompareTo 方法。

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | 描述 |
| --- | --- |
| containerT | STL 风格的容器模板类型，具有两个模板参数：元素类型和分配器类型。 |
| T | 元素类型。 |
| Allocator | 分配器类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 容器 | const containterT\<T, Allocator\>\& | 要搜索的容器。 |
| 索引 | int | 搜索范围的起始索引。 |
| count | int | 搜索范围的长度。 |
| value | T | 要查找的值。 |

### ReturnValue

如果找到，则为下一个元素的索引；否则，为搜索停止时索引的补数。

## 另见

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


在随机访问容器中实现二分搜索。针对标量类型的特化。使用大于和小于运算符比较元素。

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | 描述 |
| --- | --- |
| containerT | STL 风格的容器模板类型，具有两个模板参数：元素类型和分配器类型。 |
| T | 元素类型。 |
| Allocator | 分配器类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 容器 | const containterT\<T, Allocator\>\& | 要搜索的容器。 |
| 索引 | int | 搜索范围的起始索引。 |
| count | int | 搜索范围的长度。 |
| value | T | 要查找的值。 |

### ReturnValue

如果找到，则为下一个元素的索引；否则，为搜索停止时索引的补数。

## 另见

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


在随机访问容器中实现二分搜索。

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parameter | 描述 |
| --- | --- |
| containerT | STL 风格的容器模板类型，具有两个模板参数：元素类型和分配器类型。 |
| T | 元素类型。 |
| Allocator | 分配器类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 容器 | const containterT\<T, Allocator\>\& | 要搜索的容器。 |
| 索引 | int | 搜索范围的起始索引。 |
| count | int | 搜索范围的长度。 |
| value | T | 要查找的值。 |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) 对象。 |

### ReturnValue

如果找到，则为下一个元素的索引；否则，为搜索停止时索引的补数。

## 另见

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
