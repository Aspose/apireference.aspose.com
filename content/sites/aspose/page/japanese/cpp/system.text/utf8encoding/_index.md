---
title: "System::Text::UTF8Encoding クラス"
linktitle: "UTF8Encoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::UTF8Encoding クラス。UTF-8 エンコーディング。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ の関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 2800
url: /ja/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


UTF-8 エンコーディング。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | エンコーディングオブジェクトをクローンします。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | オブジェクトと比較します。 |
| [GetHashCode](./gethashcode/)() const override | エンコーディングのハッシュコードを取得します。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 指定された文字数をエンコードするために必要な最大バイト数を取得します。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 指定されたバイト数をデコードするために必要な最大文字数を取得します。 |
| [GetPreamble](./getpreamble/)() override | コードページのプレアンブルを取得します。 |
| [operator==](./operator==/)(const UTF8Encoding\&) const | エンコーディングのパラメータを比較します。 |
| [UTF8Encoding](./utf8encoding/)() | コンストラクタ。 |
| [UTF8Encoding](./utf8encoding/)(bool) | コンストラクタ。 |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | デフォルトのコードページ値です。 |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | RTTI 情報。 |
## 参照

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
