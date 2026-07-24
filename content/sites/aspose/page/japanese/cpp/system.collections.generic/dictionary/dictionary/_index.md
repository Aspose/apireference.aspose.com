---
title: "System::Collections::Generic::Dictionary::Dictionary コンストラクタ"
linktitle: "Dictionary"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::Dictionary::Dictionary コンストラクタ. C++ で空のディクショナリを作成します。"
type: docs
weight: 100
url: /ja/cpp/system.collections.generic/dictionary/dictionary/
---
## Dictionary::Dictionary() constructor


空の Dictionary を作成します。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary()
```

## 参照

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const map_t\&) constructor


map からデータをコピーします。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const map_t &map)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| map | const map_t\& | コピー元のマップ。 |

## 参照

* Typedef [map_t](../map_t/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) constructor


コピーコンストラクタ。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | [Dictionary](../) をコピー元にします。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


コピーコンストラクタ。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | ソースディクショナリ。 |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) オブジェクトを使用します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


空の Dictionary を作成します。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) を使用します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(int) constructor


事前に割り当てられた Dictionary を作成することに対応するオーバーロードです。実際には割り当てを行いません。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 容量 | int | 割り当てる容量; 無視されます。 |

## 参照

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## Dictionary::Dictionary(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


空の Dictionary を作成します。

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| capacity | int | [Dictionary](../) の作成後の容量; 無視されます。 |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) を使用します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
