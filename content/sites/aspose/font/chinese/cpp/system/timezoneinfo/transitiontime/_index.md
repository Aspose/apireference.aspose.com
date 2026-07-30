---
title: "System::TimeZoneInfo::TransitionTime 类"
linktitle: "TransitionTime"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeZoneInfo::TransitionTime 类。C++ 中的 RTTI 信息。"
type: docs
weight: 3400
url: /zh/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


RTTI 信息。

```cpp
class TransitionTime
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | 构造一个 [TransitionTime](./) 类的实例，表示固定日期规则（在特定月份的特定日期发生的时间变更）。 |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | 构造一个 [TransitionTime](./) 类的实例，表示浮动日期规则（在特定月份的特定星期的特定日期发生的时间变更）。 |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | 构造一个 [TransitionTime](./) 类的实例，表示使用指定参数描述的时间变更。 |
| [get_Day](./get_day/)() const | 返回时间变更发生的星期几的序号。 |
| [get_DayOfWeek](./get_dayofweek/)() const | 返回表示时间变更发生的星期几的值。 |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | 返回指示时间变更是发生在固定日期时间还是浮动日期时间的值。 |
| [get_Month](./get_month/)() const | 返回时间变更发生的月份的序号。 |
| [get_TimeOfDay](./get_timeofday/)() const | 返回一个表示时间变更发生的具体时间的 [DateTime](../../datetime/) 对象。 |
| [get_Week](./get_week/)() const | 返回时间变更发生的月份第几周的序号。 |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | 默认构造函数。供内部使用。 |
## 备注


提供有关时区中时间变更的信息。
## 另见

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
