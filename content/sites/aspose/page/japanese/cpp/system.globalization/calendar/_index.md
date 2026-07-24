---
title: "System::Globalization::Calendar クラス"
linktitle: "カレンダー"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::Calendar クラス。日付の処理、計算、書式設定などを定義するカレンダーです。セッター操作は読み取り専用でないオブジェクトでのみ有効です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこのタイプのインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | 時間点に日数を加算します。 |
| virtual [AddHours](./addhours/)(DateTime, int) const | 時間点に時間を加算します。 |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | 時間点にミリ秒を加算します。 |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | 時間点に分を加算します。 |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | 時間点に月を加算します。 |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | 時間点に秒を加算します。 |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | 時間点に週を加算します。 |
| virtual [AddYears](./addyears/)(DateTime, int) const | 時間点に年を加算します。 |
| [Calendar](./calendar/)(const Calendar\&) | RTTI 情報。 |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | アルゴリズムのタイプを取得します。 |
| [get_CurrentEra](./get_currentera/)() const | 現在の時代のインデックスを取得します。 |
| [get_CurrentEraValue](./get_currenteravalue/)() const | 現在の時代の値を取得します。 |
| virtual [get_Eras](./get_eras/)() const | カレンダーに存在する元号の一覧を取得します。 |
| virtual [get_ID](./get_id/)() const | カレンダー識別子を取得します。 |
| [get_IsReadOnly](./get_isreadonly/)() const | カレンダーが読み取り専用かどうかを確認します。 |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | カレンダーがサポートする最大の時点。 |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | カレンダーがサポートする最小の時点。 |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | 2 桁で表現できる最終年を取得します。 |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | 指定された時点の月の日を取得します。 |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | 指定された時点の曜日を取得します。 |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | 指定された時点の年の日を取得します。 |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 特定の月の日数を取得します。 |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | 特定の月の日数を取得します。 |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | 特定の年の日数を取得します。 |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | 特定の年の日数を取得します。 |
| virtual [GetEra](./getera/)(DateTime) const | 指定された時点の元号を取得します。 |
| virtual [GetHour](./gethour/)(DateTime) const | 指定された時間点の時間を取得します。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 指定された年の閏月を取得します。 |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | 指定された年の閏月を取得します。 |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | 指定された時間点のミリ秒を取得します。 |
| virtual [GetMinute](./getminute/)(DateTime) const | 指定された時間点の分を取得します。 |
| virtual [GetMonth](./getmonth/)(DateTime) const | 指定された時点の月を取得します。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | 指定された年の月数を取得します。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | 指定された年の月数を取得します。 |
| virtual [GetSecond](./getsecond/)(DateTime) const | 指定された時間点の秒を取得します。 |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | 指定された時間点の年の週番号を取得します。 |
| virtual [GetYear](./getyear/)(DateTime) const | 指定された時点の年を取得します。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 日がうるう年かどうかをチェックします。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | 日がうるう年かどうかをチェックします。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 月がうるう月かどうかをチェックします。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | 月がうるう月かどうかをチェックします。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 年がうるう年かどうかをチェックします。 |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | 年がうるう年かどうかをチェックします。 |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | 年、月、日、時代の値を確認します。 |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | カレンダーの読み取り専用バージョンを取得します。 |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | 2 桁で表現できる最終年を設定します。 |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | コンポーネントから [DateTime](../../system/datetime/) オブジェクトを構築します。 |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | コンポーネントから [DateTime](../../system/datetime/) オブジェクトを構築します。 |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | TwoDigitYearMax プロパティを使用して、年を 4 桁の年に変換します。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
