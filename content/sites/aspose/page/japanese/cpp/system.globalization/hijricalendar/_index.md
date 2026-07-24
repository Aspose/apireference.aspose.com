---
title: "System::Globalization::HijriCalendar クラス"
linktitle: "HijriCalendar"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::HijriCalendar クラス。ヒジュラ暦。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1200
url: /ja/cpp/system.globalization/hijricalendar/
---
## HijriCalendar class


ヒジュラ暦。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class HijriCalendar : public System::Globalization::Calendar
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 情報。 |
| [get_AlgorithmType](./get_algorithmtype/)() const override | アルゴリズムのタイプを取得します。 |
| [get_Eras](./get_eras/)() const override | カレンダーに存在する元号の一覧を取得します。 |
| [get_HijriAdjustment](./get_hijriadjustment/)() const | ヒジュラ調整を取得します。 |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | カレンダーがサポートする最大の時点。 |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | カレンダーがサポートする最小の時点。 |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | 指定された時点の曜日を取得します。 |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 指定された年の閏月を取得します。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI 情報。 |
| [HijriCalendar](./hijricalendar/)() | コンストラクタ。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 日がうるう年かどうかをチェックします。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 日がうるう年かどうかをチェックします。 |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | 月がうるう月かどうかをチェックします。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 月がうるう月かどうかをチェックします。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 年がうるう年かどうかをチェックします。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 年がうるう年かどうかをチェックします。 |
| [set_HijriAdjustment](./set_hijriadjustment/)(int) | ヒジュラ調整を設定します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [HijriEra](./hijriera/) | 現在のヒジュラ暦の時代。 |
## 参照

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
