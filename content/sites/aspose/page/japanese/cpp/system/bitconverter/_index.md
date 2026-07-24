---
title: "System::BitConverter クラス"
linktitle: "BitConverter"
second_title: "C++ 用 Aspose.Page"
description: "System::BitConverter クラス。バイト列と値型との相互変換を行うメソッドを含みます。これはインスタンスを持たない静的型です。C++ ではいかなる方法でもインスタンスを作成すべきではありません。"
type: docs
weight: 500
url: /ja/cpp/system/bitconverter/
---
## BitConverter class


バイト列と値型との相互変換を行うメソッドを含みます。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成してはいけません。

```cpp
class BitConverter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | 現在のアーキテクチャのエンディアンを示します。 |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | 指定された倍精度浮動小数点値の2進表現と等しい 64 ビット整数値を返します。 |
| static [GetBytes](./getbytes/)(bool) | 指定されたブール値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(char_t) | 指定された char_t 値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(int16_t) | 指定された 16 ビット整数値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(int) | 指定された 32 ビット整数値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(int64_t) | 指定された 64 ビット整数値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(uint16_t) | 指定された符号なし 16 ビット整数値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(uint32_t) | 指定された符号なし 32 ビット整数値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(uint64_t) | 指定された符号なし 64 ビット整数値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(float) | 指定された単精度浮動小数点値をバイト配列に変換します。 |
| static [GetBytes](./getbytes/)(double) | 指定された倍精度浮動小数点値をバイト配列に変換します。 |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | value と等価な倍精度浮動小数点値を返します。 |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定配列の 1 バイトをブール値に変換します。 |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定配列の 1 バイトをブール値に変換します。 |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定配列の 2 バイトを char_t 値に変換します。 |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定配列の 2 バイトを char_t 値に変換します。 |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の8バイトを、倍精度浮動小数点値に変換します。 |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の8バイトを、倍精度浮動小数点値に変換します。 |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の2バイトを、16ビット整数値に変換します。 |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の2バイトを、16ビット整数値に変換します。 |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の4バイトを、32ビット整数値に変換します。 |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の4バイトを、32ビット整数値に変換します。 |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の8バイトを、64ビット整数値に変換します。 |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の8バイトを、64ビット整数値に変換します。 |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の4バイトを、単精度浮動小数点値に変換します。 |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の4バイトを、単精度浮動小数点値に変換します。 |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | 指定されたバイト配列のすべての値を16進数文字列表現に変換します。16進表記で使用する文字の大文字小文字や、隣接するバイトのペア間に挿入される区切り文字は、対応する引数で指定できます。 |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始して、指定されたバイト配列の値を16進数文字列表現に変換します。 |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | 指定されたバイト配列の値の範囲を16進数文字列表現に変換します。 |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の2バイトを、符号なし16ビット整数値に変換します。 |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の2バイトを、符号なし16ビット整数値に変換します。 |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の4バイトを、符号なし32ビット整数値に変換します。 |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の4バイトを、符号なし32ビット整数値に変換します。 |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の8バイトを、符号なし64ビット整数値に変換します。 |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 指定されたインデックスから開始する指定された配列の8バイトを、符号なし64ビット整数値に変換します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | 現在のアーキテクチャのエンディアンを示します。リトルエンディアンの場合は true、そうでない場合は false です。 |
## 備考



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // 印刷する値を作成します。
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // 値とそのバイトを出力します。
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
