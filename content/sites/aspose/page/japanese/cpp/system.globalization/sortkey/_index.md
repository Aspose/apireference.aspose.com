---
title: "System::Globalization::SortKey クラス"
linktitle: "SortKey"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::SortKey クラス。文字列をソートキーにマッピングします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2200
url: /ja/cpp/system.globalization/sortkey/
---
## SortKey class


文字列をソートキーにマッピングします。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class SortKey : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | 2つのソートキーを比較します。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 指定されたオブジェクトが現在の [SortKey](./) オブジェクトと等しいかどうかを確認します。 |
| virtual [get_KeyData](./get_keydata/)() | 現在のオブジェクトを表すバイト配列を取得します。 |
| virtual [get_OriginalString](./get_originalstring/)() | このオブジェクトの作成に使用された元の文字列を取得します。 |
| [GetHashCode](./gethashcode/)() const override | 現在の [SortKey](./) オブジェクトのハッシュコードを取得します。 |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | 現在のオブジェクトを文字列表現に変換します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
