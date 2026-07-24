---
title: "System::Collections::Generic::_net_binnary_search メソッド"
linktitle: "_net_binnary_search"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::_net_binnary_search メソッド。ランダムアクセスコンテナで二分探索を実装します。スマートポインタ用の特殊化です。C++ で System::Object::CompareTo メソッドを使用します。"
type: docs
weight: 4900
url: /ja/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


ランダムアクセスコンテナで二分探索を実装します。スマートポインタ用の特殊化です。System::Object::CompareTo メソッドを使用します。

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| パラメーター | 説明 |
| --- | --- |
| containerT | 要素型とアロケータ型の 2 つのテンプレート引数を持つ STL 形式のコンテナテンプレート型です。 |
| T | 要素型。 |
| Allocator | Allocator 型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コンテナ | const containterT\<T, Allocator\>\& | 検索対象のコンテナです。 |
| インデックス | int | 検索範囲の開始インデックスです。 |
| count | int | 検索範囲の長さです。 |
| value | T | 検索する値。 |

### ReturnValue

見つかった場合は次の要素のインデックス、見つからなかった場合は検索が停止したインデックスの補数。

## 参照

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


ランダムアクセスコンテナで二分探索を実装します。値型の特殊化です。CompareTo メソッドを使用します。

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| パラメーター | 説明 |
| --- | --- |
| containerT | 要素型とアロケータ型の 2 つのテンプレート引数を持つ STL 形式のコンテナテンプレート型です。 |
| T | 要素型。 |
| Allocator | Allocator 型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コンテナ | const containterT\<T, Allocator\>\& | 検索対象のコンテナです。 |
| インデックス | int | 検索範囲の開始インデックスです。 |
| count | int | 検索範囲の長さです。 |
| value | T | 検索する値。 |

### ReturnValue

見つかった場合は次の要素のインデックス、見つからなかった場合は検索が停止したインデックスの補数。

## 参照

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


ランダムアクセスコンテナで二分探索を実装します。スカラー型の特殊化です。要素を大なり・小なり演算子で比較します。

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| パラメーター | 説明 |
| --- | --- |
| containerT | 要素型とアロケータ型の 2 つのテンプレート引数を持つ STL 形式のコンテナテンプレート型です。 |
| T | 要素型。 |
| Allocator | Allocator 型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コンテナ | const containterT\<T, Allocator\>\& | 検索対象のコンテナです。 |
| インデックス | int | 検索範囲の開始インデックスです。 |
| count | int | 検索範囲の長さです。 |
| value | T | 検索する値。 |

### ReturnValue

見つかった場合は次の要素のインデックス、見つからなかった場合は検索が停止したインデックスの補数。

## 参照

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


ランダムアクセスコンテナで二分探索を実装します。

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| パラメーター | 説明 |
| --- | --- |
| containerT | 要素型とアロケータ型の 2 つのテンプレート引数を持つ STL 形式のコンテナテンプレート型です。 |
| T | 要素型。 |
| Allocator | Allocator 型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コンテナ | const containterT\<T, Allocator\>\& | 検索対象のコンテナです。 |
| インデックス | int | 検索範囲の開始インデックスです。 |
| count | int | 検索範囲の長さです。 |
| value | T | 検索する値。 |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) オブジェクト。 |

### ReturnValue

見つかった場合は次の要素のインデックス、見つからなかった場合は検索が停止したインデックスの補数。

## 参照

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
