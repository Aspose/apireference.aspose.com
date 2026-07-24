---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending メソッド"
linktitle: "LINQ_OrderByDescending"
second_title: "C++ 用 Aspose.Page"
description: "C++で System::Collections::Generic::IEnumerable クラスの LINQ_OrderByDescending メソッドを使用する方法。"
type: docs
weight: 2400
url: /ja/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


keySelectorで選択されたキー値に従って、シーケンスの要素を降順にソートします。

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| パラメーター | 説明 |
| --- | --- |
| keySelector | 要素からキーを抽出する関数です。 |

### ReturnValue

キーの降順で要素がソートされた IOrderedEnumerable です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
