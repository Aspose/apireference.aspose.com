---
title: "System::Decimal クラス"
linktitle: "十進数"
second_title: "C++ 用 Aspose.Page"
description: "System::Decimal クラス。10 進数を表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 1900
url: /ja/cpp/system/decimal/
---
## Decimal class


10 進数を表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。[System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class Decimal
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | 指定された 2 つの [Decimal](./) 値を加算します。 |
| static [Ceiling](./ceiling/)(const Decimal\&) | 指定された値以上の最小の整数値を返します。 |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | 最初の [Decimal](./) オブジェクトが表す値が、2 番目の [Decimal](./) オブジェクトが表す値より小さいか、等しいか、または大きいかを判定します。 |
| [CompareTo](./compareto/)(const Decimal\&) const | 現在のオブジェクトが表す値が、指定されたオブジェクトが表す値より小さいか、等しいか、または大きいかを判定します。 |
| [Decimal](./decimal/)() | 0 を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(std::int8_t) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(std::int16_t) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(std::int32_t) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(std::int64_t) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(std::uint8_t) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(std::uint16_t) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(std::uint32_t) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(std::uint64_t) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(float) | 指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(double) | 指定された値を表すインスタンスを構築します。 |
| explicit [Decimal](./decimal/)(const std::string\&) | 文字列表現が std::string クラスのインスタンスとして指定された値を表すインスタンスを構築します。 |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | 指定されたコンポーネントから [Decimal](./) オブジェクトを構築します。 |
| [Decimal](./decimal/)(const Decimal\&) | 指定された [Decimal](./) オブジェクトと同じ数値を表す [Decimal](./) クラスのインスタンスを構築します。 |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | バイナリ表現を含む整数配列から [Decimal](./) クラスのインスタンスを作成します。 |
| [Decimal](./decimal/)(std::nullptr_t) | 常に ArgumentNullException をスローします。 |
| [Decimal](./decimal/)(const number_type\&) | 指定された値を表す [Decimal](./) クラスのインスタンスを作成します。 |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | 指定された 2 つの [Decimal](./) 値を除算します。 |
| [Equals](./equals/)(const Decimal\&) const | 現在のオブジェクトと指定されたオブジェクトが表す値が等しいかどうかを判断します。 |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 現在のオブジェクトと指定されたオブジェクトが表す値が等しいかどうかを判断します。 |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | 指定されたオブジェクトが表す値が等しいかどうかを判断します。 |
| static [Floor](./floor/)(const Decimal\&) | 指定された値以下の最大の整数値を返します。 |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) 指定された OLE 通貨値を同等の [Decimal](./) 値に変換します。実装されていません。 |
| static [GetBits](./getbits/)(const Decimal\&) | 指定された [Decimal](./) オブジェクトを、その値が表すバイナリ表現に変換します。 |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) 指定された [Decimal](./) 値をバイト配列に変換します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [GetTypeCode](./gettypecode/)() const | オブジェクトの型コードを取得します。 |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | 指定された 2 つの [Decimal](./) 値を乗算します。 |
| static [Negate](./negate/)(const Decimal\&) | 指定されたオブジェクトが表す値の否定から得られる値を表す新しい [Decimal](./) クラスのインスタンスを返します。 |
| explicit [operator bool](./operatorbool/)() const | 現在のオブジェクトが表す値をブール値に変換します。 |
| explicit [operator double](./operatordouble/)() const | 現在のオブジェクトが表す値を倍精度浮動小数点値に変換します。 |
| explicit [operator float](./operatorfloat/)() const | 現在のオブジェクトが表す値を単精度浮動小数点値に変換します。 |
| [operator!=](./operator!=/)(const Decimal\&) const | 現在のオブジェクトと指定されたオブジェクトが表す値が等しくないかどうかを判断します。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 現在のオブジェクトが表す値が 0 と異なるかどうかを判断します。 |
| [operator%](./operator%/)(const Decimal\&) const | 現在のオブジェクトと指定されたオブジェクトが表す値の剰余演算の結果となる値を表す新しい [Decimal](./) クラスのインスタンスを返します。 |
| [operator%=](./operator%=/)(const Decimal\&) | 現在のオブジェクトに、現在のオブジェクトと指定されたオブジェクトが表す値の剰余演算の結果となる新しい値を代入します。 |
| [operator*](./operator_/)(const Decimal\&) const | 現在のオブジェクトと指定されたオブジェクトが表す値の乗算結果となる値を表す新しい [Decimal](./) クラスのインスタンスを返します。 |
| [operator*=](./operator_=/)(const Decimal\&) | 現在のオブジェクトに、現在のオブジェクトと指定されたオブジェクトが表す値の乗算結果となる新しい値を代入します。 |
| [operator+](./operator+/)(const Decimal\&) const | 現在のオブジェクトと指定されたオブジェクトが表す値の合計となる値を表す新しい [Decimal](./) クラスのインスタンスを返します。 |
| [operator++](./operator++/)() | 現在のオブジェクトが表す値をインクリメントします。 |
| [operator+=](./operator+=/)(const Decimal\&) | 現在のオブジェクトに、現在のオブジェクトと指定されたオブジェクトが表す値の合計となる新しい値を代入します。 |
| [operator-](./operator-/)(const Decimal\&) const | 現在のオブジェクトが表す値から指定されたオブジェクトが表す値を減算した結果となる値を表す新しい [Decimal](./) クラスのインスタンスを返します。 |
| [operator-](./operator-/)() const | 現在のオブジェクトが表す値の否定によって得られる値を表す、[Decimal](./) クラスの新しいインスタンスを返します。 |
| [operator--](./operator--/)() | 現在のオブジェクトが表す値をデクリメントします。 |
| [operator-=](./operator-=/)(const Decimal\&) | 現在のオブジェクトが表す値から指定されたオブジェクトが表す値を減算した結果の新しい値を、現在のオブジェクトに代入します。 |
| [operator/](./operator//)(const Decimal\&) const | 現在のオブジェクトが表す値を指定されたオブジェクトが表す値で除算した結果の値を表す、[Decimal](./) クラスの新しいインスタンスを返します。 |
| [operator/=](./operator/=/)(const Decimal\&) | 現在のオブジェクトが表す値を指定されたオブジェクトが表す値で除算した結果の新しい値を、現在のオブジェクトに代入します。 |
| [operator<](./operator_/)(const Decimal\&) const | 現在のオブジェクトが表す値が、指定されたオブジェクトが表す値より小さいかどうかを判定します。 |
| [operator<=](./operator_=/)(const Decimal\&) const | 現在のオブジェクトが表す値が、指定されたオブジェクトが表す値以下かどうかを判定します。 |
| [operator=](./operator=/)(const Decimal\&) | 指定されたオブジェクトが表す値を現在のオブジェクトに代入します。 |
| [operator==](./operator==/)(const Decimal\&) const | 現在のオブジェクトと指定されたオブジェクトが表す値が等しいかどうかを判断します。 |
| [operator==](./operator==/)(std::nullptr_t) const | 現在のオブジェクトが表す値が 0 かどうかを判定します。 |
| [operator>](./operator_/)(const Decimal\&) const | 現在のオブジェクトが表す値が、指定されたオブジェクトが表す値より大きいかどうかを判定します。 |
| [operator>=](./operator_=/)(const Decimal\&) const | 現在のオブジェクトが表す値が、指定されたオブジェクトが表す値以上かどうかを判定します。 |
| static [Parse](./parse/)(const String\&) | 10 進数の文字列表現を、同等の [Decimal](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | 指定された書式設定を使用して、10 進数の文字列表現を同等の [Decimal](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 指定された書式プロバイダーを使用して、10 進数の文字列表現を同等の [Decimal](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | 指定された書式設定と書式プロバイダーを使用して、10 進数の文字列表現を同等の [Decimal](./) クラスのインスタンスに変換します。 |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | 2 つの [Decimal](./) 値を除算した後の余りを計算します。 |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | 指定された値を最も近い整数に丸めます。パラメーターは、指定された値が 2 つの最も近い数と同等に近い場合の関数の動作を指定します。 |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | 指定された小数桁数で、指定された値を最も近い値に丸めます。パラメーターは、指定された値が 2 つの最も近い数と同等に近い場合の関数の動作を指定します。 |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | 指定された 1 つの [Decimal](./) 値を別の値から減算します。 |
| static [ToByte](./tobyte/)(Decimal) | [Decimal](./) 値を符号なし 8 ビット整数値に変換します。 |
| static [ToDouble](./todouble/)(Decimal) | [Decimal](./) 値を倍精度浮動小数点数に変換します。 |
| static [ToInt16](./toint16/)(Decimal) | [Decimal](./) 値を符号付き 16 ビット整数値に変換します。 |
| static [ToInt32](./toint32/)(Decimal) | [Decimal](./) 値を符号付き 32 ビット整数値に変換します。 |
| static [ToInt64](./toint64/)(Decimal) | [Decimal](./) 値を符号付き 64 ビット整数値に変換します。 |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) 指定された [Decimal](./) 値を同等の OLE 通貨値に変換します。実装されていません。 |
| static [ToSByte](./tosbyte/)(Decimal) | [Decimal](./) の値を符号付き 8 ビット整数値に変換します。 |
| static [ToSingle](./tosingle/)(Decimal) | [Decimal](./) の値を単精度浮動小数点数に変換します。 |
| [ToStdString](./tostdstring/)() const | オブジェクトが表す値の文字列表現を含む std::string のインスタンスを返します。 |
| [ToString](./tostring/)() const | オブジェクトが表す値の文字列表現を返します。 |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 現在のオブジェクトをカルチャ固有の書式情報を使用して文字列に変換します。 |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 現在のオブジェクトを、指定された文字列書式と、指定された [IFormatProvider](../iformatprovider/) オブジェクトが提供するカルチャ固有の書式情報を使用して文字列表現に変換します。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | オブジェクトが表す値の文字列表現を返します。内部使用向けです。 |
| static [ToUInt16](./touint16/)(Decimal) | [Decimal](./) の値を符号なし 16 ビット整数値に変換します。 |
| static [ToUInt32](./touint32/)(Decimal) | [Decimal](./) の値を符号なし 32 ビット整数値に変換します。 |
| static [ToUInt64](./touint64/)(Decimal) | [Decimal](./) の値を符号なし 64 ビット整数値に変換します。 |
| static [Truncate](./truncate/)(const Decimal\&) | 指定された [Decimal](./) オブジェクトが表す値と同じ整数部を持ち、小数部がすべて破棄された値を表す [Decimal](./) オブジェクトを返します。 |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | 数値の文字列表現を含む指定された文字列を、同等の [Decimal](./) 値に変換します。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | 提供された書式情報と数値スタイルを使用して、数値の文字列表現を含む指定された文字列を同等の [Decimal](./) 値に変換します。 |
| static [Type](./type/)() | [Decimal](./) クラスの型情報を表す [TypeInfo](../typeinfo/) オブジェクトへの参照を返します。 |
| [~Decimal](./~decimal/)() | デストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [MaxValue](./maxvalue/) | [Decimal](./) クラスで表現できる最大の数を表します。 |
| static [MinusOne](./minusone/) | -1 の数値を表します。 |
| static [MinValue](./minvalue/) | [Decimal](./) クラスで表現できる最小の数を表します。 |
| static [One](./one/) | 1 の数値を表します。 |
| static [Zero](./zero/) | 0 の数値を表します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [number_type](./number_type/) | Detail::decimal_number_type のエイリアスです。 |
## 備考



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
