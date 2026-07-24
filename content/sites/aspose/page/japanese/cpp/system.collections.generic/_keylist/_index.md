---
title: "System::Collections::Generic::_KeyList クラス"
linktitle: "_KeyList"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::_KeyList クラス。dictionary''s のキーのリストを実装します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 200
url: /ja/cpp/system.collections.generic/_keylist/
---
## _KeyList class


dictionary のキーのリストを実装します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| パラメーター | 説明 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | 指定された辞書を参照するコレクションを初期化します。 |
| [Contains](./contains/)(const TKey\&) const override | 指定されたキーがコレクションに存在するか確認します。 |
| [idx_get](./idx_get/)(int) const override | 指定された位置のキーを取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [TKey](./tkey/) | キーの種類です。 |

## 参照

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
