---
title: "System::Collections::Generic::IEnumerable::LINQ_All method"
linktitle: "LINQ_All"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IEnumerable::LINQ_All method. C++ においてシーケンスのすべての要素が条件を満たすかどうかを判定します。"
type: docs
weight: 700
url: /ja/cpp/system.collections.generic/ienumerable/linq_all/
---
## IEnumerable::LINQ_All method


シーケンスのすべての要素が条件を満たすかどうかを判定します。

```cpp
bool System::Collections::Generic::IEnumerable<T>::LINQ_All(std::function<bool(T)> predicate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 述語 | std::function\<bool(T)> | 条件をテストするための各要素に対する関数。 |

### ReturnValue

指定された述語でソースシーケンスのすべての要素がテストに合格するか、シーケンスが空の場合は true、そうでなければ false。

## 参照

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
