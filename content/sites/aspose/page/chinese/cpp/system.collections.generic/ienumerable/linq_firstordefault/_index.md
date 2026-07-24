---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault 方法"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault 方法。返回序列的第一个元素，如果序列为空则返回默认值（C++）。"
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

序列中的第一个元素，若序列为空则为默认构造的值。

## 另见

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


返回满足条件的序列的第一个元素，如果未找到则返回默认值。

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 谓词 | std::function\\<bool(T)> | 用于测试每个元素是否满足条件的函数。 |

### ReturnValue

如果源为空或没有元素通过谓词指定的测试，则返回 default(T)；否则返回源中第一个通过谓词测试的元素。

## 另见

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
