---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule method"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule 方法。构造一个 AdjustmentRule 类的实例，该实例表示使用指定参数描述的时间调整规则（C++）。"
type: docs
weight: 1000
url: /zh/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


构造一个 [AdjustmentRule](../) 类的实例，该实例表示使用指定参数描述的时间调整规则。

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| date_start | DateTime | 调整规则生效的日期和时间。 |
| date_end | DateTime | 调整规则停止生效的日期和时间。 |
| daylight_delta | TimeSpan | 时区形成夏令时所需的时间量。 |
| daylight_transition_start | const TransitionTime\& | 关于从夏令时转换为标准时间的信息。 |
| daylight_transition_end | const TransitionTime\& | 关于从标准时间转换为夏令时的信息。 |

### ReturnValue

一个 [AdjustmentRule](../) 类的实例，表示所描述的时区调整规则。

## 另见

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


构造一个 [AdjustmentRule](../) 类的实例，该实例表示使用指定参数描述的时间调整规则。

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| date_start | DateTime | 调整规则生效的日期和时间。 |
| date_end | DateTime | 调整规则停止生效的日期和时间。 |
| daylight_delta | TimeSpan | 时区形成夏令时所需的时间量。 |
| daylight_transition_start | const TransitionTime\& | 关于从夏令时转换为标准时间的信息。 |
| daylight_transition_end | const TransitionTime\& | 关于从标准时间转换为夏令时的信息。 |
| base_utc_offset_delta | TimeSpan | 默认 UTC 偏移的增量。 |
| no_daylight_transitions | bool | 指定调整规则是否假设进行夏令时转换。 |

### ReturnValue

一个 [AdjustmentRule](../) 类的实例，表示所描述的时区调整规则。

## 另见

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
