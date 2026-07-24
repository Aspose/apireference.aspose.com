---
title: "System::Text::Encoding クラス"
linktitle: "Encoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::Encoding クラス。C++ におけるエンコーディングサービスです。"
type: docs
weight: 1600
url: /ja/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Clone](./clone/)() | エンコーディングオブジェクトをクローンします。 |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | 2 つのエンコーディング間でバイトを変換します。 |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | 2 つのエンコーディング間でバイトを変換します。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | エンコーディングを比較します。 |
| static [get_ASCII](./get_ascii/)() | ASCII エンコーディングを取得します。 |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | 標準のビッグエンディアン Unicode エンコーディングオブジェクトを取得します。 |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | 標準のビッグエンディアン UTF-32 エンコーディングオブジェクトを取得します。 |
| virtual [get_BodyName](./get_bodyname/)() | メールエージェント本文に対応したエンコーディング名を取得します。 |
| virtual [get_CodePage](./get_codepage/)() | [Windows](../../system.windows/) のコードページ ID を取得します。 |
| [get_DecoderFallback](./get_decoderfallback/)() const | デコーダーのフォールバックを取得します。 |
| static [get_Default](./get_default/)() | デフォルトのエンコーディングを取得します。 |
| [get_EncoderFallback](./get_encoderfallback/)() const | エンコーダーのフォールバックを取得します。 |
| virtual [get_EncodingName](./get_encodingname/)() | 人間が読みやすいエンコーディング名を取得します。 |
| virtual [get_HeaderName](./get_headername/)() | メールエージェントヘッダーと互換性のあるエンコーディング名を取得します。 |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | エンコーディングがブラウザーでコンテンツを表示するために使用できるかどうかをチェックします。 |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | エンコーディングがブラウザーでコンテンツを保存するために使用できるかどうかをチェックします。 |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | エンコーディングがメールクライアントでコンテンツを表示するために使用できるかどうかをチェックします。 |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | エンコーディングがメールクライアントでコンテンツを保存するために使用できるかどうかをチェックします。 |
| [get_IsReadOnly](./get_isreadonly/)() | エンコーディングが読み取り専用かどうかをチェックします。 |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | エンコーディングがシングルバイトかどうかをチェックします。 |
| static [get_Latin1](./get_latin1/)() | Latin1 エンコーディングを取得します。内部使用のみ。 |
| static [get_Unicode](./get_unicode/)() | 標準の Unicode エンコーディングオブジェクトを取得します。 |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | 標準の UTF-7 エンコーディングオブジェクトを取得します。 |
| static [get_UTF8](./get_utf8/)() | 標準の UTF-8 エンコーディングオブジェクトを取得します。 |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | 内部専用で、クラスライブラリによって使用されます：マークなしおよび入力検証なし。 |
| virtual [get_WebName](./get_webname/)() | IANA 互換のエンコーディング名を取得します。 |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | [Windows](../../system.windows/) のコードページ ID を取得します。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(const String\&) | 文字列をエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | 文字バッファをエンコードするために必要な文字数を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const String\&) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | 文字バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | バイトバッファをデコードするために必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | バイトバッファをデコードするために必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | バイトバッファをデコードするために必要な文字数を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | バイトバッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetDecoder](./getdecoder/)() | このオブジェクトにリクエストを転送するデコーダーを取得します。 |
| virtual [GetEncoder](./getencoder/)() | このオブジェクトにリクエストを転送するエンコーダーを取得します。 |
| static [GetEncoding](./getencoding/)(const String\&) | 名前でエンコーディングを取得します。 |
| static [GetEncoding](./getencoding/)(int) | コードページでエンコーディングを取得します。 |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | コードページでエンコーディングを取得します。 |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | 名前でエンコーディングを取得します。 |
| static [GetEncodings](./getencodings/)() | 既知のエンコーディングのリストを取得します。 |
| [GetHashCode](./gethashcode/)() const override | エンコーディングのハッシュを作成します。 |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | 指定された文字数をエンコードするために必要な最大バイト数を取得します。 |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | 指定されたバイト数をデコードするために必要な最大文字数を取得します。 |
| virtual [GetPreamble](./getpreamble/)() | エンコーディングを示すバイト列（例: BOM）を返します。 |
| virtual [GetString](./getstring/)(uint8_t *, int) | バイトバッファを文字列にデコードします。 |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | バイトバッファを文字列にデコードします。 |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | バイトバッファを文字列にデコードします。 |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | バイトバッファを文字列にデコードします。 |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | バイトバッファを文字列にデコードします。 |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | バイトバッファを文字列にデコードします。 |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | バイトバッファを文字列にデコードします。 |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | デコーダのフォールバックを設定します。 |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | エンコーダのフォールバックを設定します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | デフォルトのコードページ値です。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | RTTI。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
