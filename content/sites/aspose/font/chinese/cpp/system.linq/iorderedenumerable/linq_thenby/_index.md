---
title: "System::Linq::IOrderedEnumerable::LINQ_ThenBy 方法"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Linq::IOrderedEnumerable 类的 LINQ_ThenBy 方法。"
type: docs
weight: 300
url: /zh/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


根据键对序列中的元素执行后续的升序排序。

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| 参数 | 描述 |
| --- | --- |
| Key | keySelector 返回的键的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | 用于从每个元素中提取键的函数。 |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
