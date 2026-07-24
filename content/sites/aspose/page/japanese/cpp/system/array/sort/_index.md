---
title: "System::Array::Sort メソッド"
linktitle: "ソート"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::Sort メソッド。キーを含む配列と対応するアイテムの配列の 2 つを、キー配列の値に基づいてソートします。キー配列の要素は C++ の operator< で比較されます。"
type: docs
weight: 5800
url: /ja/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


キーを含む配列と対応する項目を含むもう一つの配列の二つを、キー配列の値に基づいてソートします。その要素は operator< を使用して比較されます。

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| パラメーター | 説明 |
| --- | --- |
| TKey | **keys** 配列の要素の型 |
| TValue | **items** 配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) にキー値が含まれています |
| items | const ArrayPtr\<TValue\>\& | [Array](../) に **keys** 配列のキー値にマップされたアイテムが含まれています |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


キーを含む配列と対応する項目を含むもう一つの配列の二つを、キー配列の値に基づいてソートします。その要素はデフォルトの比較子を使用して比較されます。

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| パラメーター | 説明 |
| --- | --- |
| TKey | **keys** 配列の要素の型 |
| TValue | **items** 配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) にキー値が含まれています |
| items | const ArrayPtr\<TValue\>\& | [Array](../) に **keys** 配列のキー値にマップされたアイテムが含まれています |
| インデックス | int | ソートする範囲の開始位置を示すインデックス |
| length | int | ソートする範囲内の要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


デフォルトの比較子を使用して、指定された配列の要素をソートします。

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 対象配列 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


指定された比較子を使用して、指定された配列の要素をソートします。

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 対象配列 |
| 比較子 | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | 配列の要素を比較するために使用される IComparer<T> オブジェクト |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


未実装です。

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


デフォルトの比較子を使用して、指定された配列の要素範囲をソートします。

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 対象配列 |
| startIndex | int | ソートする要素範囲の開始位置を示すインデックス |
| count | int | ソートする要素範囲のサイズ |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
