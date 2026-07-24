---
title: "System::Globalization::HebrewCalendar クラス"
linktitle: "HebrewCalendar"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::HebrewCalendar クラス。ヘブライ暦。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際はそのポインタを使用してください。"
type: docs
weight: 1100
url: /ja/cpp/system.globalization/hebrewcalendar/
---
## HebrewCalendar class


ヘブライ暦。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際はそのポインタを使用してください。

```cpp
class HebrewCalendar : public System::Globalization::Calendar
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 情報。 |
| [get_AlgorithmType](./get_algorithmtype/)() const override | アルゴリズムのタイプを取得します。 |
| [get_Eras](./get_eras/)() const override | カレンダーに存在する元号の一覧を取得します。 |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | カレンダーがサポートする最大の時点。 |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | カレンダーがサポートする最小の時点。 |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | 指定された時点の曜日を取得します。 |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | 特定の月の日数を取得します。 |
| [GetEra](./getera/)(DateTime) const override | 指定された時点の元号を取得します。 |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 指定された年の閏月を取得します。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI 情報。 |
| [GetMonth](./getmonth/)(DateTime) const override | 指定された時点の月を取得します。 |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | 指定された年の月数を取得します。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | 指定された年の月数を取得します。 |
| [HebrewCalendar](./hebrewcalendar/)() | コンストラクタ。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 日がうるう年かどうかをチェックします。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 日がうるう年かどうかをチェックします。 |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | 月がうるう月かどうかをチェックします。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 月がうるう月かどうかをチェックします。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 年がうるう年かどうかをチェックします。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 年がうるう年かどうかをチェックします。 |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | 2 桁で表現できる最終年を設定します。 |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | コンポーネントから [DateTime](../../system/datetime/) オブジェクトを構築します。 |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | コンポーネントから [DateTime](../../system/datetime/) オブジェクトを構築します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [HebrewEra](./hebrewera/) | 現在のヘブライ暦の時代。 |
## 参照

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
