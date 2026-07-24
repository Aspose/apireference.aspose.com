---
title: "System::Globalization::GregorianCalendar クラス"
linktitle: "GregorianCalendar"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::GregorianCalendar クラス。グレゴリオ暦。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ の関数への引数としてこのポインタを使用してください。"
type: docs
weight: 1000
url: /ja/cpp/system.globalization/gregoriancalendar/
---
## GregorianCalendar class


グレゴリオ暦。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数への引数としてこのポインタを使用してください。

```cpp
class GregorianCalendar : public System::Globalization::Calendar
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 情報。 |
| [get_AlgorithmType](./get_algorithmtype/)() const override | アルゴリズムのタイプを取得します。 |
| virtual [get_CalendarType](./get_calendartype/)() const | グレゴリオ暦のタイプを取得します。 |
| [get_Eras](./get_eras/)() const override | カレンダーに存在する元号の一覧を取得します。 |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | カレンダーがサポートする最大の時点。 |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | カレンダーがサポートする最小の時点。 |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | 指定された時点の月の日を取得します。 |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | 指定された時点の曜日を取得します。 |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | 指定された時点の年の日を取得します。 |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | 特定の月の日数を取得します。 |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 特定の月の日数を取得します。 |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | 特定の年の日数を取得します。 |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | 特定の年の日数を取得します。 |
| static [GetDefaultInstance](./getdefaultinstance/)() | デフォルトのグレゴリオ暦インスタンスを取得します。 |
| [GetEra](./getera/)(DateTime) const override | 指定された時点の元号を取得します。 |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 指定された年の閏月を取得します。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 指定された年の閏月を取得します。 |
| [GetMonth](./getmonth/)(DateTime) const override | 指定された時点の月を取得します。 |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | 指定された年の月数を取得します。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI 情報。 |
| [GetYear](./getyear/)(DateTime) const override | 指定された時点の年を取得します。 |
| [GregorianCalendar](./gregoriancalendar/)(GregorianCalendarTypes) | 特定のグレゴリオ暦を構築します。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 日がうるう年かどうかをチェックします。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 日がうるう年かどうかをチェックします。 |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | 月がうるう月かどうかをチェックします。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 月がうるう月かどうかをチェックします。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 年がうるう年かどうかをチェックします。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 年がうるう年かどうかをチェックします。 |
| virtual [set_CalendarType](./set_calendartype/)(GregorianCalendarTypes) | グレゴリオ暦のタイプを設定します。 |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | コンポーネントから [DateTime](../../system/datetime/) オブジェクトを構築します。 |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | コンポーネントから [DateTime](../../system/datetime/) オブジェクトを構築します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [ADEra](./adera/) | 現在の元号。 |
## 参照

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
