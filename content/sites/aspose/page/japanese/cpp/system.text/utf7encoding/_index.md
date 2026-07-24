---
title: "System::Text::UTF7Encoding クラス"
linktitle: "UTF7Encoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::UTF7Encoding クラス。UTF-7 エンコーディング。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡してください。"
type: docs
weight: 2700
url: /ja/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


UTF-7 エンコーディング。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | エンコーディングオブジェクトをクローンします。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | オブジェクトと比較します。 |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | 文字バッファをエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(const String\&) | 文字列をエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const String\&) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | バイトバッファをデコードするために必要な文字数を取得します。 |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | バイトバッファをデコードするために必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | バイトバッファをデコードするために必要な文字数を取得します。 |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | バイトバッファをデコードした結果得られる文字列を取得します。 |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| [GetDecoder](./getdecoder/)() override | このオブジェクトにリクエストを転送するデコーダーを取得します。 |
| [GetEncoder](./getencoder/)() override | このオブジェクトにリクエストを転送するエンコーダーを取得します。 |
| [GetHashCode](./gethashcode/)() const override | エンコーディングのハッシュコードを取得します。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 指定された文字数をエンコードするために必要な最大バイト数を取得します。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 指定されたバイト数をデコードするために必要な最大文字数を取得します。 |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | バイトバッファを文字列にデコードします。 |
| virtual [GetString](./getstring/)(uint8_t *, int) | バイトバッファを文字列にデコードします。 |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | バイトバッファを文字列にデコードします。 |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | バイトバッファを文字列にデコードします。 |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | バイトバッファを文字列にデコードします。 |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | バイトバッファを文字列にデコードします。 |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | バイトバッファを文字列にデコードします。 |
| [operator==](./operator==/)(const UTF7Encoding\&) const | エンコーディングのパラメータを比較します。 |
| [UTF7Encoding](./utf7encoding/)() | コンストラクタ。 |
| [UTF7Encoding](./utf7encoding/)(bool) | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | デフォルトのコードページ値です。 |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | UTF-7 コードページ ID に使用される [Windows](../../system.windows/) のマジックナンバーです。 |
## 参照

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
