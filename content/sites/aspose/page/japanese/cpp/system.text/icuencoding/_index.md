---
title: "System::Text::ICUEncoding クラス"
linktitle: "ICUEncoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::ICUEncoding クラス。ICU ベースのエンコーディング実装。内部使用のみ。 このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 2200
url: /ja/cpp/system.text/icuencoding/
---
## ICUEncoding class


ICUベースのエンコーディング実装。内部使用のみ。このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class ICUEncoding : public System::Text::Encoding
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | 文字バッファをエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI。 |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI。 |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI。 |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI。 |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const String\&) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | バイトバッファをデコードするために必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | バイトバッファをデコードするために必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | バイトバッファをデコードするために必要な文字数を取得します。 |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| [GetDecoder](./getdecoder/)() override | このオブジェクトにリクエストを転送するデコーダーを取得します。 |
| [GetEncoder](./getencoder/)() override | このオブジェクトにリクエストを転送するエンコーダーを取得します。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 指定された文字数をエンコードするために必要な最大バイト数を取得します。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 指定されたバイト数をデコードするために必要な最大文字数を取得します。 |
| [GetPreamble](./getpreamble/)() override | エンコーディングを示すバイト列（例: BOM）を返します。 |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | コンストラクタ。 |
| [operator==](./operator==/)(const ICUEncoding\&) const | コードページを使用してエンコーディングを比較します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | デフォルトのコードページ値です。 |
## 参照

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
