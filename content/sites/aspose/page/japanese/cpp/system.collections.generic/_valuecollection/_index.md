---
title: "System::Collections::Generic::_ValueCollection クラス"
linktitle: "_ValueCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::_ValueCollection クラス。Dictionary の値のコレクションです。コレクションを参照し、何もコピーしません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


[Dictionary](../dictionary/) の値のコレクションです。コレクションを参照し、何もコピーしません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | 指定された辞書を参照するコレクションを初期化します。 |
| [Contains](./contains/)(const TValue\&) const override | アイテムがコンテナに存在するかチェックします。 |
| [GetEnumerator](./getenumerator/)() override | 値を反復する列挙子を取得します。 |
| [idx_get](./idx_get/)(int) const override | [IList](../ilist/) メソッドを実装しています。サポートされていません。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [TValue](./tvalue/) | 値型です。 |

## 参照

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
