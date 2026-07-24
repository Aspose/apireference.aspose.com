---
title: "System::Globalization::ChineseLunisolarCalendar クラス"
linktitle: "ChineseLunisolarCalendar"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::ChineseLunisolarCalendar クラス。中国の太陰太陽暦。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、関数への引数としてこのポインタを使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.globalization/chineselunisolarcalendar/
---
## ChineseLunisolarCalendar class


中国の太陰太陽暦。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数への引数としてこのポインタを使用してください。

```cpp
class ChineseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ChineseLunisolarCalendar](./chineselunisolarcalendar/)() | デフォルトコンストラクタ。 |
| [Clone](./clone/)() override | RTTI 情報。 |
| [get_Eras](./get_eras/)() const override | カレンダーに存在する元号の一覧を取得します。 |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | カレンダーがサポートする最大の時点。 |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | カレンダーがサポートする最小の時点。 |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | 特定の月の日数を取得します。 |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 特定の月の日数を取得します。 |
| [GetEra](./getera/)(DateTime) const override | 指定された時点の元号を取得します。 |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 指定された年の閏月を取得します。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 指定された年の閏月を取得します。 |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | 指定された年の月数を取得します。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI 情報。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 日がうるう年かどうかをチェックします。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 日がうるう年かどうかをチェックします。 |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | 月がうるう月かどうかをチェックします。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 月がうるう月かどうかをチェックします。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 年がうるう年かどうかをチェックします。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 年がうるう年かどうかをチェックします。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [ChineseEra](./chineseera/) | 現在の中国の元号。 |
## 参照

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
