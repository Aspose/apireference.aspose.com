---
title: "System::Char クラス"
linktitle: "Char"
second_title: "C++ 用 Aspose.Page"
description: "System::Char クラス。UTF-16 コード単位で表現される文字の操作メソッドを提供します。これはインスタンスサービスを持たない静的型です。C++ ではいかなる手段でもこのクラスのインスタンスを作成すべきではありません。"
type: docs
weight: 1200
url: /ja/cpp/system/char/
---
## Char class


UTF-16 コード単位で表現された文字の操作メソッドを提供します。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成してはいけません。

```cpp
class Char
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | UTF-32 コード単位を [System::String](../string/) クラスのインスタンスに変換します。 |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | 指定された UTF-16 サロゲートペアを UTF-32 コード単位に変換します。 |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | 文字列内の指定された位置にある UTF-16 エンコードされた文字またはサロゲートペアの値を UTF-32 コード単位に変換します。 |
| static [GetNumericValue](./getnumericvalue/)(char_t) | 指定された UTF-16 文字を倍精度浮動小数点数値に変換します。 |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | 指定された文字の Unicode カテゴリを表す値を返します。 |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | 指定された文字が ASCII の空白文字として分類されるかどうかを判定します。 |
| static [IsControl](./iscontrol/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が Unicode 制御文字として分類されるかどうかを判定します。 |
| static [IsControl](./iscontrol/)(char_t) | 指定された文字が Unicode 制御文字として分類されるかどうかを判定します。 |
| static [IsDigit](./isdigit/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が十進数字として分類されるかどうかを判定します。 |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | 指定された文字列内の指定インデックスにある文字が十進数字として分類されるかどうかを判定します。 |
| static [IsDigit](./isdigit/)(char_t) | 指定された文字が十進数字として分類されるかどうかを判定します。 |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | 指定された文字列内の指定インデックスにある文字が UTF-16 の上位サロゲートコード単位かどうかを判定します。 |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が上位サロゲートかどうかを判定します。 |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | 指定された文字が上位サロゲートかどうかを判定します。 |
| static [IsLetter](./isletter/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が Unicode の文字として分類されるかどうかを判定します。 |
| static [IsLetter](./isletter/)(char_t) | 指定された文字が Unicode の文字として分類されるかどうかを判定します。 |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が Unicode の文字または十進数字として分類されるかどうかを判定します。 |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | 指定された文字が Unicode の文字または十進数字として分類されるかどうかを判定します。 |
| static [IsLower](./islower/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が小文字として分類されるかどうかを判定します。 |
| static [IsLower](./islower/)(char_t) | 指定された文字が小文字として分類されるかどうかを判定します。 |
| static [IsLower](./islower/)(const String\&, int) | 指定された文字列内の指定インデックスにある文字が小文字として分類されるかどうかを判定します。 |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が下位サロゲートかどうかを判定します。 |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | 指定された文字が下位サロゲートかどうかを判定します。 |
| static [IsNumber](./isnumber/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が数値として分類されるかどうかを判定します。 |
| static [IsNumber](./isnumber/)(char_t) | 指定された文字が数値として分類されるかどうかを判定します。 |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | 指定された文字バッファ内の指定インデックスにある文字が句読点文字として分類されるかどうかを判定します。 |
| static [IsPunctuation](./ispunctuation/)(char_t) | 指定された文字が句読点文字として分類されるかどうかを判定します。 |
| static [IsSeparator](./isseparator/)(const char_t *, int) | 指定された文字バッファの指定インデックスにある文字が区切り文字として分類されるかどうかを判断します。 |
| static [IsSeparator](./isseparator/)(char_t) | 指定された文字が区切り文字として分類されるかどうかを判断します。 |
| static [IsSurrogate](./issurrogate/)(char_t) | 指定された文字が UTF-16 サロゲートコード単位かどうかを判断します。 |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | 指定された文字列の指定インデックスにある文字が UTF-16 サロゲートコード単位かどうかを判断します。 |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | 指定された 2 つの文字が UTF-16 サロゲートペアかどうかを判断します。 |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | 指定された文字バッファ内の連続する 2 文字がサロゲートペアかどうかを判断します。 |
| static [IsSymbol](./issymbol/)(const char_t *, int) | 指定された文字バッファの指定インデックスにある文字が記号文字として分類されるかどうかを判断します。 |
| static [IsSymbol](./issymbol/)(char_t) | 指定された文字が記号文字として分類されるかどうかを判断します。 |
| static [IsUpper](./isupper/)(const String\&, int) | 指定された文字列の指定インデックスにある文字が大文字として分類されるかどうかを判断します。 |
| static [IsUpper](./isupper/)(const char_t *, int) | 指定された文字バッファの指定インデックスにある文字が大文字として分類されるかどうかを判断します。 |
| static [IsUpper](./isupper/)(char_t) | 指定された文字が大文字として分類されるかどうかを判断します。 |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | 指定された文字バッファの指定インデックスにある文字が空白文字として分類されるかどうかを判断します。 |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | 指定された文字が空白文字として分類されるかどうかを判断します。 |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | 指定された文字列の指定インデックスにある文字が空白文字として分類されるかどうかを判断します。 |
| static [Parse](./parse/)(const String\&) | 指定された文字列の最初で唯一の文字を char_t 値に変換します。 |
| static [ToLower](./tolower/)(char_t) | 指定された文字を小文字に変換します。 |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | 指定された文字を小文字に変換します。 |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | 指定された文字を小文字に変換します。 |
| static [ToUpper](./toupper/)(char_t) | 指定された文字を大文字に変換します。 |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | 指定された文字を大文字に変換します。 |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | 指定された文字を大文字に変換します。 |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | 単一文字からなる文字列を UTF-16 文字に変換しようとします。この関数は、入力文字列が null でなく、長さがちょうど 1 文字である場合にのみ成功します。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
