---
title: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime メソッド"
linktitle: "CreateTransitionTime"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime メソッド。C++ で指定されたパラメータで記述された時間変更を表す TransitionTime クラスのインスタンスを作成します。"
type: docs
weight: 1200
url: /ja/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


[TransitionTime](../) クラスのインスタンスを作成します。このインスタンスは、指定されたパラメータで記述された時間変更を表します。

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| time_of_day | DateTime | 時刻変更が発生する特定の時間。 |
| 月 | int | 時刻変更が発生する年の月。 |
| week | int | 時刻変更が発生する月の週。 |
| 日 | int | 時間変更が発生する日。 |
| day_of_week | DayOfWeek | 時刻変更が発生する曜日。 |
| is_fixed_date_rule | bool | 時間変更が固定の日付と時刻で発生するか、可変の日付と時刻で発生するかを示す値。 |

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
