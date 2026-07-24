---
title: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule メソッド"
linktitle: "CreateFloatingDateRule"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule メソッド。C++ で、特定の月の特定の週の特定の日に発生する時刻変更を表す浮動日付ルールを表す TransitionTime クラスのインスタンスを構築します。"
type: docs
weight: 1100
url: /ja/cpp/system/timezoneinfo/transitiontime/createfloatingdaterule/
---
## TransitionTime::CreateFloatingDateRule method


浮動日付ルール（特定の月の特定の週の特定の日に発生する時刻変更）を表す [TransitionTime](../) クラスのインスタンスを構築します。

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule(DateTime time_of_day, int month, int week, DayOfWeek day_of_week)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| time_of_day | DateTime | 時刻変更が発生する特定の時間。 |
| 月 | int | 時刻変更が発生する年の月。 |
| week | int | 時刻変更が発生する月の週。 |
| day_of_week | DayOfWeek | 時刻変更が発生する曜日。 |

### ReturnValue

記述された時刻変更を表す [TransitionTime](../) クラスのインスタンス。

## 参照

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
