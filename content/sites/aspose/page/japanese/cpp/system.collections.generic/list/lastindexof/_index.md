---
title: "System::Collections::Generic::List::LastIndexOf メソッド"
linktitle: "LastIndexOf"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::List::LastIndexOf メソッド。指定されたオブジェクトを検索し、C++ のリスト全体で最後に出現する位置のゼロベースインデックスを返します。"
type: docs
weight: 3400
url: /ja/cpp/system.collections.generic/list/lastindexof/
---
## List::LastIndexOf(const T\&) const method


指定されたオブジェクトを検索し、リスト全体で最後に出現した位置のゼロベースインデックスを返します。

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 項目 | const T\& | リスト内で検索するオブジェクト |

### ReturnValue

見つかった場合、[List](../) 全体で項目が最後に出現する位置のゼロベースインデックス。見つからない場合は -1。

## 参照

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::LastIndexOf(const T\&, int32_t) const method


指定されたオブジェクトを検索し、最初の要素から指定されたインデックスまで拡張する [List](../) の要素範囲内で最後に出現する位置のゼロベースインデックスを返します。

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item, int32_t index) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 項目 | const T\& | リスト内で検索するオブジェクト |
| インデックス | int32_t | 後方検索の開始インデックス（ゼロベース）。 |

### ReturnValue

見つかった場合、最初の要素から index まで拡張する [List](../) の要素範囲内で項目が最後に出現する位置のゼロベースインデックス。見つからない場合は -1。

## 参照

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::LastIndexOf(const T\&, int32_t, int32_t) const method


指定されたオブジェクトを検索し、指定された要素数を含み、指定されたインデックスで終了する [List](../) の要素範囲内で最後に出現する位置のゼロベースインデックスを返します。

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item, int32_t index, int32_t count) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| item | const T\& | [List](../) 内で検索するオブジェクト |
| インデックス | int32_t | 後方検索の開始インデックス（ゼロベース）。 |
| count | int32_t | 検索対象セクションの要素数。 |

### ReturnValue

見つかった場合、count 個の要素を含み index で終了する [List](../) の要素範囲内で項目が最後に出現する位置のゼロベースインデックス。見つからない場合は -1。

## 参照

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
