---
title: "System::Collections::Generic::SortedList クラス"
linktitle: "SortedList"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::SortedList クラス。FlatMap 構造体をラップしたソートリストです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 4200
url: /ja/cpp/system.collections.generic/sortedlist/
---
## SortedList class


FlatMap 構造体をラップしたソートリストです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
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
| [get_Capacity](./get_capacity/)() const | 現在のリスト容量を取得します。 |
| virtual [get_Keys](./get_keys/)() const | キーコレクションにアクセスします。 |
| virtual [get_Values](./get_values/)() const | 値コレクションにアクセスします。 |
| [GetEnumerator](./getenumerator/)() override | 現在のリストを反復する列挙子を取得します。 |
| [IndexOfKey](./indexofkey/)(TKey) const | 特定のキーを検索します。 |
| [IndexOfValue](./indexofvalue/)(TValue) const | 特定の値を検索します。 |
| [rbegin](./rbegin/)() | コレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [rbegin](./rbegin/)() const | const 修飾されたコレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [RemoveAt](./removeat/)(int) | 指定された位置の項目を削除します。 |
| [rend](./rend/)() | コレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [rend](./rend/)() const | const 修飾されたコレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [set_Capacity](./set_capacity/)(int) | 現在のリストの容量を設定します。 |
| [SortedList](./sortedlist/)() | 空のリストを構築します。 |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | 空のリストを構築します。 |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | コピーコンストラクタ。 |
| [SortedList](./sortedlist/)(const map_t\&) | コピーコンストラクタ。 |
| [SortedList](./sortedlist/)(int) | 空のリストを構築します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | const 逆イテレータ型。 |
| [IEnumerablePtr](./ienumerableptr/) | 同じペア型のコレクションです。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 型。 |
| [iterator](./iterator/) | イテレータ型。 |
| [KeyCollection](./keycollection/) | キーコレクションの型です。 |
| [KVPair](./kvpair/) | キーと値のペア型です。 |
| [map_t](./map_t/) | 基礎となるデータ型。 |
| [Ptr](./ptr/) | ポインタ型。 |
| [reverse_iterator](./reverse_iterator/) | 逆イテレータ型。 |
| [this_t](./this_t/) | このタイプ。 |
| [ValueCollection](./valuecollection/) | 値コレクションの型です。 |

## 参照

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
