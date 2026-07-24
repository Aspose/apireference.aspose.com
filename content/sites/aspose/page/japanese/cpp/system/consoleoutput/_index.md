---
title: "System::ConsoleOutput クラス"
linktitle: "ConsoleOutput"
second_title: "C++ 用 Aspose.Page"
description: "System::ConsoleOutput クラス。標準出力ストリームを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1500
url: /ja/cpp/system/consoleoutput/
---
## ConsoleOutput class


標準出力ストリームを表します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。実行時エラーやアサーション違反の原因になります。このクラスは常に [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | 常に ASCII エンコーディングを返します。 |
| [Write](./write/)(bool) override | 指定された bool 値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | 指定されたオブジェクトの文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(char_t) override | 指定された文字値を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(Decimal) override | [Decimal](../decimal/) 値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(double) override | 倍精度浮動小数点値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(int32_t) override | 32 ビット整数値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(int64_t) override | 64 ビット整数値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(float) override | 単精度浮動小数点値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(const String\&) override | 指定された文字列オブジェクトを、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(uint32_t) override | 符号なし 32 ビット整数値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(uint64_t) override | 符号なし 64 ビット整数値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | 指定された文字配列の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 指定された文字配列の範囲の値の文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(const char_t *) override | 指定された C 文字列を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(const TypeInfo\&) override | [TypeInfo](../typeinfo/) オブジェクトの文字列表現を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | 現在の行終端子を、現在のオブジェクトが表す出力ストリームに出力します。 |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | 指定されたオブジェクトの文字列表現に現在の行終端子を付加して、現在のオブジェクトが表す出力ストリームに出力します。 |
| [WriteLine](./writeline/)(bool) override | 指定された bool 値の文字列表現に現在の行終端子を付加して、現在のオブジェクトが表す出力ストリームに出力します。 |
| [WriteLine](./writeline/)(char_t) override | 指定された文字値に現在の行終端子を付加して、現在のオブジェクトが表す出力ストリームに出力します。 |
| [WriteLine](./writeline/)(Decimal) override | [Decimal](../decimal/) 値の文字列表現に現在の行終端子を付加して、現在のオブジェクトが表す出力ストリームに出力します。 |
| [WriteLine](./writeline/)(double) override | 倍精度浮動小数点値の文字列表現に現在の行終端子を付加して、現在のオブジェクトが表す出力ストリームに出力します。 |
| [WriteLine](./writeline/)(int) override | 32 ビット整数値の文字列表現に現在の行終端子を付加して、現在のオブジェクトが表す出力ストリームに出力します。 |
| [WriteLine](./writeline/)(int64_t) override | 64 ビット整数値の文字列表現に現在の行終端子を付加して、現在のオブジェクトが表す出力ストリームに出力します。 |
| [WriteLine](./writeline/)(float) override | 現在のオブジェクトが表す出力ストリームに、単精度浮動小数点値の文字列表現を現在の行終端子と共に出力します。 |
| [WriteLine](./writeline/)(const String\&) override | 現在のオブジェクトが表す出力ストリームに、指定された文字列オブジェクトを現在の行終端子と共に出力します。 |
| [WriteLine](./writeline/)(uint32_t) override | 現在のオブジェクトが表す出力ストリームに、符号なし 32 ビット整数値の文字列表現を現在の行終端子と共に出力します。 |
| [WriteLine](./writeline/)(uint64_t) override | 現在のオブジェクトが表す出力ストリームに、符号なし 64 ビット整数値の文字列表現を現在の行終端子と共に出力します。 |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | 現在のオブジェクトが表す出力ストリームに、指定された文字配列の文字列表現を現在の行終端子と共に出力します。 |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 現在のオブジェクトが表す出力ストリームに、指定された文字配列の値の範囲の文字列表現を現在の行終端子と共に出力します。 |
| [WriteLine](./writeline/)(const char_t *) override | 現在のオブジェクトが表す出力ストリームに、指定された C 文字列を現在の行終端子と共に出力します。 |
| [WriteLine](./writeline/)(const TypeInfo\&) override | 現在のオブジェクトが表す出力ストリームに、指定された [TypeInfo](../typeinfo/) オブジェクトの文字列表現を現在の行終端子と共に出力します。 |
| [WriteLine](./writeline/)(const char *) |  |
## 参照

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
