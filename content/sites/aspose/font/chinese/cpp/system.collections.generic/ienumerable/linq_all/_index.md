---
title: "System::Collections::Generic::IEnumerable::LINQ_All method"
linktitle: "LINQ_All"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IEnumerable::LINQ_All method. 确定序列中的所有元素是否满足 C++ 中的条件。"
type: docs
weight: 700
url: /zh/cpp/system.collections.generic/ienumerable/linq_all/
---
## IEnumerable::LINQ_All method


确定序列的所有元素是否满足条件。

```cpp
bool System::Collections::Generic::IEnumerable<T>::LINQ_All(std::function<bool(T)> predicate)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 谓词 | std::function\<bool(T)> | 用于测试每个元素是否满足条件的函数。 |

### ReturnValue

如果源序列的每个元素都通过指定谓词的测试，或序列为空，则为 true；否则为 false。

## 另见

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
