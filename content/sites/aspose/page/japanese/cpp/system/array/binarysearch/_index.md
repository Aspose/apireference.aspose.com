---
title: "System::Array::BinarySearch メソッド"
linktitle: "BinarySearch"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::BinarySearch メソッド。C++ のソート済み配列で二分探索を実行します。"
type: docs
weight: 4600
url: /ja/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


ソート済み配列で二分探索を実行します。

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | 検索を実行するソート済み配列 |
| 項目 | const T\& | 検索対象の項目 |

### ReturnValue

検索された項目が見つかった場合はそのインデックスを、見つからなかった場合は負の整数を返します。その負の整数は、検索項目より大きい次の項目のインデックスのビット単位の補数、または、より大きい項目が存在しない場合は配列の要素数のビット単位の補数です。

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


未実装です。

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
