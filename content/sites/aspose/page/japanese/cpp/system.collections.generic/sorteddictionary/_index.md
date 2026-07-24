---
title: "System::Collections::Generic::SortedDictionary クラス"
linktitle: "SortedDictionary"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::SortedDictionary クラス。C++ におけるソート済み辞書型の前方宣言です。"
type: docs
weight: 4000
url: /ja/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


ソートされた辞書型の前方宣言です。

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| パラメーター | 説明 |
| --- | --- |
| TKey | キーの種類です。 |
| TValue | 値型です。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [crbegin](./crbegin/)() const | コレクションの最後の const 修飾要素（逆順で最初）の逆イテレータを取得します。 |
| [crend](./crend/)() const | コレクションの開始前にある存在しない const 修飾要素の逆イテレータを取得します。 |
| [get_Comparer](./get_comparer/)() const | SortedDictionary<TKey,TValue> の要素を順序付けるために使用される [IComparer<TKey>](../icomparer/) を取得します。 |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | シングルトンアクセサ関数。 |
| [GetEnumerator](./getenumerator/)() override | 現在の辞書を反復するための列挙子を取得します。 |
| [rbegin](./rbegin/)() | コレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [rbegin](./rbegin/)() const | const 修飾されたコレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [rend](./rend/)() | コレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [rend](./rend/)() const | const 修飾されたコレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [SortedDictionary](./sorteddictionary/)() | 空の辞書を構築します。 |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | 空の辞書を構築します。 |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | コピーコンストラクタ。 |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | コピーコンストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | const 逆イテレータ型。 |
| [IEnumerablePtr](./ienumerableptr/) | 同一要素のコレクションです。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 型。 |
| [iterator](./iterator/) | イテレータ型。 |
| [KeyCollection](./keycollection/) | キーコレクションの型です。 |
| [KVPair](./kvpair/) | キーと値のペアの型です。 |
| [map_t](./map_t/) | 基礎となるデータ型。 |
| [Ptr](./ptr/) | ポインタ型。 |
| [reverse_iterator](./reverse_iterator/) | 逆イテレータ型。 |
| [this_t](./this_t/) | 自身の型です。 |
| [ValueCollection](./valuecollection/) | 値コレクションの型です。 |
## 備考


STL の map をラップしたソート済み辞書クラス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

## 参照

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
