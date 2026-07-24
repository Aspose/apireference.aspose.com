---
title: "System::TimeZoneInfo::TransitionTime クラス"
linktitle: "TransitionTime"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeZoneInfo::TransitionTime クラス。C++ の RTTI 情報です。"
type: docs
weight: 3400
url: /ja/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


RTTI 情報。

```cpp
class TransitionTime
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | [TransitionTime](./) クラスのインスタンスを作成します。これは特定の月の特定の日に発生する固定日付ルール（時刻変更）を表します。 |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | [TransitionTime](./) クラスのインスタンスを作成します。これは特定の月の特定の週の特定の日に発生する浮動日付ルール（時刻変更）を表します。 |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | [TransitionTime](./) クラスのインスタンスを作成します。これは指定されたパラメーターで記述された時刻変更を表します。 |
| [get_Day](./get_day/)() const | 時刻変更が発生する曜日の序数を返します。 |
| [get_DayOfWeek](./get_dayofweek/)() const | 時刻変更が発生する曜日を表す値を返します。 |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | 時刻変更が固定日付時刻で発生するか、浮動日付時刻で発生するかを示す値を返します。 |
| [get_Month](./get_month/)() const | 時刻変更が発生する年の月の序数を返します。 |
| [get_TimeOfDay](./get_timeofday/)() const | 時刻変更が発生する特定の時刻を表す [DateTime](../../datetime/) オブジェクトを返します。 |
| [get_Week](./get_week/)() const | 時刻変更が発生する月の週の序数を返します。 |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | デフォルトコンストラクタ。内部使用専用。 |
## 備考


タイムゾーン内の時刻変更に関する情報を提供します。
## 参照

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
