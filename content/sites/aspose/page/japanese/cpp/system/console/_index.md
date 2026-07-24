---
title: "System::Console class"
linktitle: "Console"
second_title: "C++ 用 Aspose.Page"
description: "System::Console クラス。標準出力ストリームへデータを出力するためのメソッドを提供します。これはインスタンスサービスを持たない静的型です。C++ ではいかなる手段でもインスタンスを作成すべきではありません。"
type: docs
weight: 1400
url: /ja/cpp/system/console/
---
## Console class


標準出力ストリームへデータを出力するメソッドを提供します。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成してはいけません。

```cpp
class Console
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Beep](./beep/)() | 未実装です。 |
| static [get_Error](./get_error/)() | 標準エラーストリームを表すオブジェクトを指す共有ポインタを返します。 |
| static [get_In](./get_in/)() | 標準入力ストリームを表すオブジェクトを指す共有ポインタを返します。 |
| static [get_Out](./get_out/)() | 標準出力ストリームを表すオブジェクトを指す共有ポインタを返します。 |
| static [Mute](./mute/)(bool) | 標準出力ストリームをミュートまたはミュート解除します。 |
| static [ReadKey](./readkey/)() | 未実装です。 |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | 指定されたオブジェクトをクラスの Error プロパティに割り当てます。 |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | In プロパティを指定された TextReader オブジェクトに設定します。 |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | 指定されたオブジェクトをクラスの Out プロパティに割り当てます。 |
| static [Write](./write/)(const SharedPtr\<T\>\&) | 指定されたオブジェクトの文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(bool) | bool 値の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(char_t) | 指定された文字値を標準出力ストリームに出力します。 |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | 指定された文字配列の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(const Decimal\&) | 標準出力ストリームに [Decimal](../decimal/) 値の文字列表現を出力します。 |
| static [Write](./write/)(double) | 倍精度浮動小数点値の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(float) | 単精度浮動小数点値の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(int32_t) | 32 ビット整数値の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(int64_t) | 64 ビット整数値の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(const String\&) | 指定された文字列オブジェクトを標準出力ストリームに出力します。 |
| static [Write](./write/)(const char_t *) | 指定された C 文字列を標準出力ストリームに出力します。 |
| static [Write](./write/)(const TypeInfo\&) | 標準出力ストリームに [TypeInfo](../typeinfo/) 値の文字列表現を出力します。 |
| static [Write](./write/)(uint32_t) | 符号なし 32 ビット整数値の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(uint64_t) | 符号なし 64 ビット整数値の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 指定された文字配列の指定された範囲の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(const String\&, Args\&&...) | 指定された書式に従ってフォーマットされた指定引数の文字列表現を標準出力ストリームに出力します。 |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | 現在の行終端文字を標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | 指定されたオブジェクトの文字列表現を現在の行終端文字とともに標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(bool) | bool 値の文字列表現を現在の行終端文字とともに標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(char_t) | 指定された文字値を現在の行終端文字とともに標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | 指定された文字配列の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const Decimal\&) | [Decimal](../decimal/) の値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(double) | 倍精度浮動小数点値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(float) | 単精度浮動小数点値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(int32_t) | 32 ビット整数値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(int64_t) | 64 ビット整数値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const String\&) | 指定された文字列オブジェクトを、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const char_t *) | 指定された C 文字列を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const TypeInfo\&) | [TypeInfo](../typeinfo/) の値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(uint32_t) | 符号なし 32 ビット整数値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(uint64_t) | 符号なし 64 ビット整数値の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | 指定された文字配列の指定された範囲の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const Exception\&) | 指定された [Exception](../exception/) オブジェクトの文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | 指定された書式に従ってフォーマットされた指定引数の文字列表現を、現在の行終端子を付加して標準出力ストリームに出力します。 |
| static [WriteLine](./writeline/)(const char *) |  |
## 備考



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // hello メッセージを出力します。
  Console::WriteLine(u"Hello, world!");

  // 'std::array' クラスのインスタンスを作成します。
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // 配列の要素を出力します。
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
