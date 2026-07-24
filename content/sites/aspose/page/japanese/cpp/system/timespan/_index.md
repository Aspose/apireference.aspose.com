---
title: "System::TimeSpan クラス"
linktitle: "TimeSpan"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeSpan クラス。時間間隔を表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 6100
url: /ja/cpp/system/timespan/
---
## TimeSpan class


時間間隔を表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。[System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class TimeSpan
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | 現在のオブジェクトと指定されたオブジェクトが表す時間間隔の合計を表す、[TimeSpan](./) クラスの新しいインスタンスを返します。 |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | [TimeSpan](./) オブジェクトを 2 つ比較します。 |
| [CompareTo](./compareto/)(TimeSpan) const | 現在のオブジェクトと指定されたオブジェクトを比較します。 |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | 現在のオブジェクトと指定されたオブジェクトを比較します。 |
| [Duration](./duration/)() const | 現在のオブジェクトの絶対値となる値を持つ、新しい [TimeSpan](./) オブジェクトのインスタンスを返します。 |
| [Equals](./equals/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔が、指定されたオブジェクトが表す時間間隔と等しいかどうかを判定します。 |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 現在のオブジェクトが表す時間間隔が、指定されたオブジェクトが表す時間間隔と等しいかどうかを判定します。 |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | 指定されたオブジェクトが同じ時間間隔を表す場合は true を返し、そうでない場合は false を返します。 |
| static [FromDays](./fromdays/)(double) | 指定された間隔を表す新しい [TimeSpan](./) オブジェクトを返します。 |
| static [FromHours](./fromhours/)(double) | 指定された間隔を表す新しい [TimeSpan](./) オブジェクトを返します。 |
| static [FromMilliseconds](./frommilliseconds/)(double) | 指定された間隔を表す新しい [TimeSpan](./) オブジェクトを返します。 |
| static [FromMinutes](./fromminutes/)(double) | 指定された間隔を表す新しい [TimeSpan](./) オブジェクトを返します。 |
| static [FromSeconds](./fromseconds/)(double) | 指定された間隔を表す新しい [TimeSpan](./) オブジェクトを返します。 |
| static [FromTicks](./fromticks/)(int64_t) | 指定された間隔を表す新しい [TimeSpan](./) オブジェクトを返します。 |
| [get_Days](./get_days/)() const | 現在の [TimeSpan](./) オブジェクトが表す時間間隔の日数コンポーネントを返します。 |
| [get_Hours](./get_hours/)() const | 現在の [TimeSpan](./) オブジェクトが表す時間間隔の時間コンポーネントを返します。 |
| [get_Milliseconds](./get_milliseconds/)() const | 現在の [TimeSpan](./) オブジェクトが表す時間間隔のミリ秒コンポーネントを返します。 |
| [get_Minutes](./get_minutes/)() const | 現在の [TimeSpan](./) オブジェクトが表す時間間隔の分コンポーネントを返します。 |
| [get_Seconds](./get_seconds/)() const | 現在の [TimeSpan](./) オブジェクトが表す時間間隔の秒コンポーネントを返します。 |
| [get_Ticks](./get_ticks/)() const | 現在の [TimeSpan](./) オブジェクトが表す時間間隔を構成する 100 ナノ秒間隔の数を返します。 |
| [get_TotalDays](./get_totaldays/)() const | 現在の [TimeSpan](./) オブジェクトの値を、整数部と小数部の「日」単位で返します。 |
| [get_TotalHours](./get_totalhours/)() const | 現在の [TimeSpan](./) オブジェクトの値を、整数部と小数部の「時間」単位で返します。 |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | 現在の [TimeSpan](./) オブジェクトの値を、整数部と小数部のミリ秒単位で返します。 |
| [get_TotalMinutes](./get_totalminutes/)() const | 現在の [TimeSpan](./) オブジェクトの値を、整数部と小数部の分単位で返します。 |
| [get_TotalSeconds](./get_totalseconds/)() const | 現在の [TimeSpan](./) オブジェクトの値を、整数部と小数部の秒単位で返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | 現在の [TimeSpan](./) オブジェクトが表す値の符号反転を表す新しい [TimeSpan](./) オブジェクトのインスタンスを返します。 |
| [operator!=](./operator!=/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔が、指定されたオブジェクトが表す時間間隔と等しくないかどうかを判定します。 |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | 現在のオブジェクトと指定されたオブジェクトが表す時間間隔の合計を表す、[TimeSpan](./) クラスの新しいインスタンスを返します。 |
| [operator+](./operator+/)() const | 自身を返します。 |
| [operator+=](./operator+=/)(TimeSpan) | 現在のオブジェクトと指定されたオブジェクトが表す時間間隔の合計を、現在のオブジェクトに代入します。 |
| [operator-](./operator-/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔から指定されたオブジェクトが表す時間間隔を減算した結果の時間間隔を表す新しい [TimeSpan](./) クラスのインスタンスを返します。 |
| [operator-](./operator-/)() const | 現在の [TimeSpan](./) オブジェクトが表す値の符号反転を表す新しい [TimeSpan](./) オブジェクトのインスタンスを返します。 |
| [operator-=](./operator-=/)(TimeSpan) | 現在のオブジェクトが表す時間間隔から指定されたオブジェクトが表す時間間隔を減算した結果の時間間隔を、現在のオブジェクトに代入します。 |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔が、指定されたオブジェクトが表す時間間隔より短いかどうかを判定します。 |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔が、指定されたオブジェクトが表す時間間隔以下（短いまたは等しい）かどうかを判定します。 |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | 指定された [TimeSpan](./) オブジェクトが表す時間間隔を、現在の [TimeSpan](./) オブジェクトに設定します。 |
| [operator==](./operator==/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔が、指定されたオブジェクトが表す時間間隔と等しいかどうかを判定します。 |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔が、指定されたオブジェクトが表す時間間隔より長いかどうかを判定します。 |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔が、指定されたオブジェクトが表す時間間隔以上であるかどうかを判断します。 |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 文字列を同等の[TimeSpan](./)オブジェクトに変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 文字列を、指定された書式プロバイダーを使用して同等の[TimeSpan](./)オブジェクトに変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | 文字列を、指定された書式、書式プロバイダー、およびスタイルを使用して同等の[TimeSpan](./)オブジェクトに変換します。 |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | 文字列を、指定された書式、書式プロバイダー、そしてスタイルを使用して同等の[TimeSpan](./)オブジェクトに変換します。 |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | 現在のオブジェクトが表す時間間隔から指定されたオブジェクトが表す時間間隔を減算した結果の時間間隔を表す新しい [TimeSpan](./) クラスのインスタンスを返します。 |
| [TimeSpan](./timespan/)() | ゼロの時間間隔を表す[TimeSpan](./)オブジェクトを作成します。 |
| explicit [TimeSpan](./timespan/)(int64_t) | 指定された時間間隔を表す[TimeSpan](./)クラスのインスタンスを作成します。 |
| [TimeSpan](./timespan/)(int, int, int) | 指定された時間、分、秒の合計に等しい時間間隔を表す[TimeSpan](./)クラスのインスタンスを作成します。 |
| [TimeSpan](./timespan/)(int, int, int, int, int) | 指定された時間、分、秒、ミリ秒の合計に等しい時間間隔を表す[TimeSpan](./)クラスのインスタンスを作成します。 |
| [TimeSpan](./timespan/)(const TimeSpan\&) | 指定された[TimeSpan](./)オブジェクトが表す時間間隔と等しい時間間隔を表す[TimeSpan](./)オブジェクトを作成します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す時間間隔の文字列表現を返します。 |
| [ToString](./tostring/)(const String\&) const | 現在のオブジェクトの値を、指定された書式を使用して同等の文字列表現に変換します。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 現在のオブジェクトの値を、指定された書式と書式プロバイダーを使用して同等の文字列表現に変換します。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | 文字列を同等の[TimeSpan](./)オブジェクトに変換し、変換結果を返します。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 文字列を、指定された書式プロバイダーを使用して同等の[TimeSpan](./)オブジェクトに変換し、変換結果を返します。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 文字列を、指定された書式と書式プロバイダーを使用して同等の[TimeSpan](./)オブジェクトに変換し、変換結果を返します。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | 文字列を、指定された書式、書式プロバイダー、スタイルを使用して同等の[TimeSpan](./)オブジェクトに変換し、変換結果を返します。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | 文字列を、指定された書式、書式プロバイダー、スタイルを使用して同等の[TimeSpan](./)オブジェクトに変換し、変換結果を返します。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 文字列を、指定された書式と書式プロバイダーを使用して同等の[TimeSpan](./)オブジェクトに変換し、変換結果を返します。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | [TimeSpan](./)構造体を表す[TypeInfo](../typeinfo/)オブジェクトを返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [MaxValue](./maxvalue/) | 最長の可能な間隔を表す[TimeSpan](./)オブジェクトです。 |
| static [MinValue](./minvalue/) | /// 最短の可能な間隔を表す[TimeSpan](./)オブジェクトです。 |
| static constexpr [TicksPerDay](./ticksperday/) | 1日（24時間）の100ナノ秒間隔の数です。 |
| static constexpr [TicksPerHour](./ticksperhour/) | 1時間の100ナノ秒間隔の数です。 |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | 1ミリ秒の100ナノ秒間隔の数です。 |
| static constexpr [TicksPerMinute](./ticksperminute/) | 1分あたりの100ナノ秒間隔の数。 |
| static constexpr [TicksPerSecond](./tickspersecond/) | 1秒あたりの100ナノ秒間隔の数。 |
| static [Zero](./zero/) | ゼロ間隔を表す [TimeSpan](./) オブジェクト。 |
## 備考



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
