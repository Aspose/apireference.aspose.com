---
title: "System::Collections::Generic::_ValueList クラス"
linktitle: "_ValueList"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::_ValueList クラス。dictionary''s の値のリストを実装します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


dictionary の値のリストを実装します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| パラメーター | 説明 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | 指定された辞書を参照するコレクションを初期化します。 |
| virtual [idx_get](./idx_get/)(int) const | 指定された位置の値を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [TValue](./tvalue/) | 値型です。 |

## 参照

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
