---
title: "System::Text::UnicodeEncoding クラス"
linktitle: "UnicodeEncoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::UnicodeEncoding クラス。Unicode エンコーディング。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際はそのポインタを使用してください。"
type: docs
weight: 2500
url: /ja/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Unicode エンコーディング。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | エンコーディングオブジェクトをクローンします。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | エンコーディングを比較します。 |
| [GetHashCode](./gethashcode/)() const override | エンコーディングのハッシュを作成します。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 指定された文字数をエンコードするために必要な最大バイト数を取得します。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 指定されたバイト数をデコードするために必要な最大文字数を取得します。 |
| [GetPreamble](./getpreamble/)() override | エンコーディングを示すバイト列（例: BOM）を返します。 |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | コードページとフラグでエンコーディングを比較します。 |
| [UnicodeEncoding](./unicodeencoding/)() | コンストラクタ。 |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | コンストラクタ。 |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | ビッグエンディアンのコードページ番号です。 |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | デフォルトのコードページ値です。 |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | リトルエンディアンのコードページ番号です。 |
## 参照

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
