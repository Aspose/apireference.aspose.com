---
title: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule 方法"
linktitle: "CreateFloatingDateRule"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule 方法。构造一个 TransitionTime 类的实例，表示浮动日期规则（在特定月份的特定星期的特定日期发生的时间更改）（在 C++ 中）。"
type: docs
weight: 1100
url: /zh/cpp/system/timezoneinfo/transitiontime/createfloatingdaterule/
---
## TransitionTime::CreateFloatingDateRule method


构造一个 [TransitionTime](../) 类的实例，表示浮动日期规则（在特定月份的特定星期的特定日期发生的时间更改）。

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule(DateTime time_of_day, int month, int week, DayOfWeek day_of_week)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| time_of_day | DateTime | 时间更改发生的具体时间。 |
| 月份 | int | 时间更改发生的月份。 |
| week | int | 时间更改发生的当月第几周。 |
| day_of_week | DayOfWeek | 时间更改发生的星期几。 |

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
