---
title: "System::Collections::Generic::IEnumerable::LINQ_Aggregate 方法"
linktitle: "LINQ_Aggregate"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IEnumerable::LINQ_Aggregate 方法。对序列在 C++ 中应用累加函数。"
type: docs
weight: 600
url: /zh/cpp/system.collections.generic/ienumerable/linq_aggregate/
---
## IEnumerable::LINQ_Aggregate method


对序列应用累加函数。

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_Aggregate(const Func<T, T, T> &func)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 函数 | const Func\<T, T, T\>\& | 将在每个元素上调用的累加函数。 |

### ReturnValue

最终的累加器值。

## 另见

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
