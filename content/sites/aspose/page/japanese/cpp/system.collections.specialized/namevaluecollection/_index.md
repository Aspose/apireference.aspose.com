---
title: "System::Collections::Specialized::NameValueCollection クラス"
linktitle: "NameValueCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Specialized::NameValueCollection クラス。キーまたはインデックスでアクセスできる、関連付けられた String キーと String 値のコレクション（C++）。"
type: docs
weight: 200
url: /ja/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


キーまたはインデックスでアクセスできる、関連付けられた [String](../../system/string/) キーと [String](../../system/string/) 値のコレクション。

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const String\&) override | [ICollection](../../system.collections/icollection/) メソッドをオーバーライド - 未実装。 |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | 指定された [NameValueCollection](./) のエントリを現在のコレクションにコピーします。 |
| virtual [Add](./add/)(const String\&, const String\&) | 指定された名前と値でエントリを追加します。 |
| [Clear](./clear/)() override | すべての要素を削除します。 |
| [Contains](./contains/)(const String\&) const override | アイテムがコレクションに存在するか確認します。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | コレクション要素を既存の配列要素にコピーします。 |
| virtual [Get](./get/)(const String\&) | 指定されたキーに関連付けられた値を取得します。 |
| virtual [get_AllKeys](./get_allkeys/)() | すべてのキーを取得します。 |
| [get_Count](./get_count/)() const override | キーと値のペアの数を取得します。 |
| virtual [get_Keys](./get_keys/)() | すべてのキーを取得します。 |
| [GetEnumerator](./getenumerator/)() override | コレクションを反復処理するための列挙子を取得します。 |
| virtual [GetValues](./getvalues/)(const String\&) | 指定されたキーに関連付けられた値を取得します。 |
| [HasKeys](./haskeys/)() | [NameValueCollection](./) が null でないキーを含むかどうかを示す値を取得します。 |
| [idx_get](./idx_get/)(const String\&) | 指定されたインデックスの値を取得します。 |
| [idx_set](./idx_set/)(const String\&, const String\&) | エントリの値を設定します。 |
| [NameValueCollection](./namevaluecollection/)() | 空の [NameValueCollection](./) クラスの新しいインスタンスを初期化します。 |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | 指定された [NameValueCollection](./) から新しい [NameValueCollection](./) にエントリをコピーします。 |
| [Remove](./remove/)(const String\&) override | 特定の項目を削除します。 |
| virtual [Set](./set/)(const String\&, const String\&) | エントリの値を設定します。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## 参照

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
