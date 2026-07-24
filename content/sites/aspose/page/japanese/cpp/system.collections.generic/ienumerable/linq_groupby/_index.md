---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy メソッド"
linktitle: "LINQ_GroupBy"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Collections::Generic::IEnumerable クラスの LINQ_GroupBy メソッドを使用する方法。"
type: docs
weight: 1700
url: /ja/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


シーケンスの要素をグループ化します。

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| パラメーター | 説明 |
| --- | --- |
| Key | keyPredicate が返すキーの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | 各要素からキーを抽出する関数。 |

### ReturnValue

オブジェクトのシーケンスとキーを含む [IEnumerable](../)です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
