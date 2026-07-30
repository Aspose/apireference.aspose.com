---
title: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime 方法"
linktitle: "CreateTransitionTime"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime 方法。构造一个 TransitionTime 类的实例，表示使用指定参数描述的时间变更，用于 C++。"
type: docs
weight: 1200
url: /zh/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


构造一个 [TransitionTime](../) 类的实例，表示使用指定参数描述的时间变更。

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| time_of_day | DateTime | 时间更改发生的具体时间。 |
| 月份 | int | 时间更改发生的月份。 |
| week | int | 时间更改发生的当月第几周。 |
| 天 | int | 时间变更发生的日期。 |
| day_of_week | DayOfWeek | 时间更改发生的星期几。 |
| is_fixed_date_rule | bool | 指示时间更改是发生在固定日期和时间还是浮动日期和时间的值。 |

### ReturnValue

一个 [TransitionTime](../) 类的实例，表示所描述的时间更改。

## 另见

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
