---
title: "System::Linq::IOrderedEnumerable::LINQ_ThenBy メソッド"
linktitle: "LINQ_ThenBy"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Linq::IOrderedEnumerable クラスの LINQ_ThenBy メソッドを使用する方法。"
type: docs
weight: 300
url: /ja/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


キーに従ってシーケンス内の要素を昇順で追加的に並べ替えます。

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| パラメーター | 説明 |
| --- | --- |
| Key | keySelector が返すキーの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | 各要素からキーを抽出する関数。 |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
