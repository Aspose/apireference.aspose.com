---
title: "System::Globalization::UmAlQuraCalendar クラス"
linktitle: "UmAlQuraCalendar"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::UmAlQuraCalendar クラス。Um Al Qura カレンダー。実装されていません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション障害が発生する可能性があります。常にこのクラスを System::SmartPtr ポインタでラップし、C++ の関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 3000
url: /ja/cpp/system.globalization/umalquracalendar/
---
## UmAlQuraCalendar class


Um Al Qura カレンダー。実装されていません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション障害が発生する可能性があります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際にそのポインタを使用してください。

```cpp
class UmAlQuraCalendar : public System::Globalization::Calendar
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
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 指定された年の閏月を取得します。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI 情報。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 日がうるう年かどうかをチェックします。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 日がうるう年かどうかをチェックします。 |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | 月がうるう月かどうかをチェックします。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 月がうるう月かどうかをチェックします。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 年がうるう年かどうかをチェックします。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 年がうるう年かどうかをチェックします。 |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | 2 桁で表現できる最終年を設定します。 |
| [UmAlQuraCalendar](./umalquracalendar/)() | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [UmAlQuraEra](./umalquraera/) | 現在の UmAlQura 時代。 |
## 参照

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
