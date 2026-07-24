---
title: "System::IO::TextWriter クラス"
linktitle: "TextWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::TextWriter クラス。文字シーケンスを書き込むライターを表すクラスの基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてそのポインタを使用してください。"
type: docs
weight: 2700
url: /ja/cpp/system.io/textwriter/
---
## TextWriter class


文字シーケンスを書き込むライターを表すクラスの基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてそのポインタを使用してください。

```cpp
class TextWriter : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Close](./close/)() | ストリームを閉じ、取得したリソースを解放します。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが使用しているすべてのリソースを解放し、基になるストリームを閉じます。 |
| virtual [Flush](./flush/)() | バッファの内容を基になるストリームにフラッシュします。 |
| virtual [get_Encoding](./get_encoding/)() | 現在使用されているエンコーディングを返します。 |
| virtual [get_FormatProvider](./get_formatprovider/)() const | 現在使用されている [IFormatProvider](../../system/iformatprovider/) オブジェクトを返します。 |
| [get_FormatProvider](./get_formatprovider/)() | 現在使用されている [IFormatProvider](../../system/iformatprovider/) オブジェクトを返します。 |
| virtual [get_NewLine](./get_newline/)() const | 改行文字列を返します。 |
| [get_NewLine](./get_newline/)() | 改行文字列を返します。 |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | 行終端文字列を設定します。 |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | 指定されたオブジェクトの文字列表現を書き込みます。 |
| virtual [Write](./write/)(bool) | 指定されたブール値の文字列表現を書き込みます。 |
| virtual [Write](./write/)(char_t) | 指定された文字を書き込みます。 |
| virtual [Write](./write/)(Decimal) | 指定された [Decimal](../../system/decimal/) オブジェクトの文字列表現を書き込みます。 |
| virtual [Write](./write/)(double) | 指定された倍精度浮動小数点値の文字列表現を書き込みます。 |
| virtual [Write](./write/)(int) | 指定された 32 ビット整数値の文字列表現を書き込みます。 |
| virtual [Write](./write/)(int64_t) | 指定された 64 ビット整数値の文字列表現を書き込みます。 |
| virtual [Write](./write/)(float) | 指定された単精度浮動小数点値の文字列表現を書き込みます。 |
| virtual [Write](./write/)(const String\&) | 指定された文字列を書き込みます。 |
| virtual [Write](./write/)(uint32_t) | 指定された符号なし 32 ビット整数値の文字列表現を書き込みます。 |
| virtual [Write](./write/)(uint64_t) | 指定された符号なし 64 ビット整数値の文字列表現を書き込みます。 |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | 指定された配列のすべての文字を書き込みます。 |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 指定された文字配列から指定された UTF-16 文字のサブレンジを書き込みます。 |
| virtual [Write](./write/)(const char_t *) | 指定された c-string を書き込みます。 |
| virtual [Write](./write/)(const TypeInfo\&) | 指定された [TypeInfo](../../system/typeinfo/) オブジェクトの文字列表現を書き込みます。 |
| [Write](./write/)(const String\&, const TArgs\&...) | 指定された書式に従ってフォーマットされた値を書き込みます。 |
| virtual [WriteLine](./writeline/)() | 行終端文字を書き込みます。 |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | 指定されたオブジェクトの文字列表現を書き込み、続いて行終端文字を書き込みます。 |
| virtual [WriteLine](./writeline/)(bool) | 指定されたブール値の文字列表現を書き込み、続いて行終端文字を書き込みます。 |
| virtual [WriteLine](./writeline/)(char_t) | 指定された文字を書き込み、続いて行終端文字を書き込みます。 |
| virtual [WriteLine](./writeline/)(Decimal) | 指定された [Decimal](../../system/decimal/) オブジェクトの文字列表現を書き込み、続いて行終端文字を書き込みます。 |
| virtual [WriteLine](./writeline/)(double) | 指定された倍精度浮動小数点値の文字列表現を書き込み、続いて行終端文字を書き込みます。 |
| virtual [WriteLine](./writeline/)(int) | 指定された 32 ビット整数値の文字列表現を書き込み、続いて行終端文字を書き込みます。 |
| virtual [WriteLine](./writeline/)(int64_t) | 指定された 64 ビット整数値の文字列表現を書き込み、続いて行終端文字を書き込みます。 |
| virtual [WriteLine](./writeline/)(float) | 指定された単精度浮動小数点値の文字列表現を書き込み、続けて改行文字をストリームに書き込みます。 |
| virtual [WriteLine](./writeline/)(const String\&) | 指定された文字列を書き込み、続けて改行文字をストリームに書き込みます。 |
| virtual [WriteLine](./writeline/)(uint32_t) | 指定された符号なし 32 ビット整数値の文字列表現を書き込み、続けて改行文字をストリームに書き込みます。 |
| virtual [WriteLine](./writeline/)(uint64_t) | 指定された符号なし 64 ビット整数値の文字列表現を書き込み、続けて改行文字をストリームに書き込みます。 |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | 指定された配列のすべての文字を書き込み、続けて改行文字をストリームに書き込みます。 |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 指定された文字配列から指定された UTF-16 文字のサブレンジを書き込み、続けて改行文字をストリームに書き込みます。 |
| virtual [WriteLine](./writeline/)(const char_t *) | 指定された C 文字列を書き込み、続けて改行文字をストリームに書き込みます。 |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | 指定された [TypeInfo](../../system/typeinfo/) オブジェクトの文字列表現を書き込み、続けて改行文字をストリームに書き込みます。 |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | 指定された形式に従って書式設定された指定値を書き込み、続けて改行文字をストリームに書き込みます。 |
| virtual [~TextWriter](./~textwriter/)() | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスへの共有ポインタのエイリアスです。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
