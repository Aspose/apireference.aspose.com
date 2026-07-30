---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy 方法"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Collections::Generic::IEnumerable 类的 LINQ_GroupBy 方法。"
type: docs
weight: 1700
url: /zh/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>, System::Func\<Source, Element\>) method




```cpp
template<typename Key,typename Element> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Element>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate, System::Func<Source, Element> elementSelector)
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


对序列的元素进行分组。

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| 参数 | 描述 |
| --- | --- |
| Key | 由 keyPredicate 返回的键的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | 用于提取每个元素键的函数。 |

### ReturnValue

一个包含对象序列和键的 [IEnumerable](../)

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>, System::Func\<T, Element\>) method


对序列的元素进行分组。

```cpp
template<typename Key,typename Element> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, Element>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate, System::Func<T, Element> elementSelector)
```


| 参数 | 描述 |
| --- | --- |
| Key | 由 keyPredicate 返回的键的类型 |
| Element | elementSelector 返回的元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | 用于提取每个元素键的函数。 |
| elementSelector | System::Func\<T, Element\> | 用于提取每个元素值键的函数。 |

### ReturnValue

一个包含对象序列和键的 [IEnumerable](../)

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
