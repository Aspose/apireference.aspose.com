---
title: "System::Collections::Generic::_KeyCollection クラス"
linktitle: "_KeyCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::_KeyCollection クラス。Dictionary のキーのコレクションです。コレクションを参照するだけで、何もコピーしません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


[Dictionary](../dictionary/) のキーのコレクションです。コレクションを参照するだけで、何もコピーしません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | 指定された辞書を参照するコレクションを初期化します。 |
| [Contains](./contains/)(const TKey\&) const override | アイテムがコンテナに存在するかチェックします。 |
| [GetEnumerator](./getenumerator/)() override | キーを反復する列挙子を取得します。 |
| [idx_get](./idx_get/)(int) const override | [IList](../ilist/) メソッドを実装しています。サポートされていません。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [TKey](./tkey/) | キーの種類です。 |

## 参照

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
