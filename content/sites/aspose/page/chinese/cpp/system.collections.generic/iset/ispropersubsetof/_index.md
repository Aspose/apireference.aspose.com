---
title: "System::Collections::Generic::ISet::IsProperSubsetOf 方法"
linktitle: "IsProperSubsetOf"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::ISet::IsProperSubsetOf 方法。检查当前集合是否是另一个容器的严格子集，在 C++ 中。"
type: docs
weight: 400
url: /zh/cpp/system.collections.generic/iset/ispropersubsetof/
---
## ISet::IsProperSubsetOf method


检查当前集合是否是其他容器的严格子集。

```cpp
virtual bool System::Collections::Generic::ISet<T>::IsProperSubsetOf(IEnumerablePtr other)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 其他 | IEnumerablePtr | 用于检查的上位集合。 |

### ReturnValue

如果当前集合的所有元素都存在于 **other** 中且 **other** 的元素数量多于当前集合，则返回 true；否则返回 false。

## 另见

* Typedef [IEnumerablePtr](../ienumerableptr/)
* Class [ISet](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
