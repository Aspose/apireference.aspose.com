---
title: "System::Collections::Generic::List::BinarySearch メソッド"
linktitle: "BinarySearch"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::List::BinarySearch メソッド。C++ のソート済みリストで項目を検索します。"
type: docs
weight: 800
url: /ja/cpp/system.collections.generic/list/binarysearch/
---
## List::BinarySearch(const T\&) const method


ソート済みリスト内で項目を検索します。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(const T &item) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 項目 | const T\& | 検索対象の項目。 |

### ReturnValue

ソート済みリスト内の項目のインデックス、または最も近いインデックスの補数。

## 参照

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::BinarySearch(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const method


ソート済みリスト内で項目を検索します。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(const T &item, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 項目 | const T\& | 検索対象の項目。 |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../../comparer/) を使用します。 |

### ReturnValue

ソート済みリスト内の項目のインデックス、または最も近いインデックスの補数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::BinarySearch(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const method


ソート済みリスト内で項目を検索します。

```cpp
int System::Collections::Generic::List<T>::BinarySearch(int index, int count, const T &item, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 範囲の開始位置。 |
| count | int | 範囲のサイズ。 |
| 項目 | const T\& | 検索対象の項目。 |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../../comparer/) を使用します。 |

### ReturnValue

ソート済みリスト内の項目のインデックス、または最も近いインデックスの補数。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
