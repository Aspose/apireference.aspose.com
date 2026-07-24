---
title: "System::Collections::Generic::IEnumerable::LINQ_Where メソッド"
linktitle: "LINQ_Where"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IEnumerable::LINQ_Where メソッド。C++ で指定された述語に基づいてシーケンスをフィルタリングします。"
type: docs
weight: 3100
url: /ja/cpp/system.collections.generic/ienumerable/linq_where/
---
## IEnumerable::LINQ_Where method


指定された述語に基づいてシーケンスをフィルタリングします。

```cpp
SharedPtr<IEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_Where(std::function<bool(T)> predicate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 述語 | std::function\<bool(T)> | ある条件で各要素をテストする関数。 |

### ReturnValue

フィルタリングされた要素を含む [IEnumerable](../) 。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
