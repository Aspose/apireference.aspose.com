---
title: "System::Collections::Generic::IEnumerable::LINQ_Aggregate 方法"
linktitle: "LINQ_Aggregate"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::IEnumerable::LINQ_Aggregate 方法。在 C++ 中对序列应用累加函数。"
type: docs
weight: 600
url: /zh/cpp/system.collections.generic/ienumerable/linq_aggregate/
---
## IEnumerable::LINQ_Aggregate method


在序列上应用累加函数。

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_Aggregate(const Func<T, T, T> &func)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| func | const Func\<T, T, T\>\& | 在每个元素上调用的累加函数。 |

### ReturnValue

最终的累加器值。

## 另见

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
