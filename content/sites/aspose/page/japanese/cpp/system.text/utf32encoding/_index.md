---
title: "System::Text::UTF32Encoding クラス"
linktitle: "UTF32Encoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::UTF32Encoding クラス。UTF-32 エンコーディング。このクラスのオブジェクトは、System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡してください。"
type: docs
weight: 2600
url: /ja/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 エンコーディング。このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | エンコーディングオブジェクトをクローンします。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | オブジェクトと比較します。 |
| [GetHashCode](./gethashcode/)() const override | エンコーディングのハッシュコードを取得します。 |
| [GetPreamble](./getpreamble/)() override | コードページのプレアンブルを取得します。 |
| [operator==](./operator==/)(const UTF32Encoding\&) const | エンコーディングのパラメータを比較します。 |
| [UTF32Encoding](./utf32encoding/)() | コンストラクタ。 |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | コンストラクタ。 |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | ビッグエンディアン UTF-32 コードページ ID に使用されるマジックナンバーです（[Windows](../../system.windows/)）。 |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | デフォルトのコードページ値です。 |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | リトルエンディアン UTF-32 コードページ ID に使用されるマジックナンバーです（[Windows](../../system.windows/)）。 |
## 参照

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
