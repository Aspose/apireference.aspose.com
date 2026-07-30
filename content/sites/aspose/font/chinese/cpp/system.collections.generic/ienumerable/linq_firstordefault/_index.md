---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault method"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault 方法。返回序列的第一个元素，如果序列为空则返回默认值（在 C++ 中）。"
type: docs
weight: 1600
url: /zh/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


返回序列的第一个元素，如果序列为空则返回默认值。

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

序列中的第一个元素，或在序列为空时返回默认构造的值。

## 另见

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


返回满足条件的序列的第一个元素，如果未找到此类元素则返回默认值。

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 谓词 | std::function\<bool(T)> | 用于测试每个元素是否满足条件的函数。 |

### ReturnValue

如果 source 为空或没有元素通过谓词指定的测试，则返回 default(T)；否则返回 source 中第一个通过谓词测试的元素。

## 另见

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
