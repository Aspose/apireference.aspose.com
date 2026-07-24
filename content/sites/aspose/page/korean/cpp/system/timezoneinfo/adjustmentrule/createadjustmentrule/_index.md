---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule 메서드"
linktitle: "CreateAdjustmentRule"
second_title: "C++용 Aspose.Page"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule 메서드. 지정된 매개변수로 설명된 시간 조정 규칙을 나타내는 AdjustmentRule 클래스의 인스턴스를 C++에서 생성합니다."
type: docs
weight: 1000
url: /ko/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


지정된 매개변수로 설명된 시간 조정 규칙을 나타내는 [AdjustmentRule](../) 클래스의 인스턴스를 생성합니다.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| date_start | DateTime | 조정 규칙이 적용되는 날짜와 시간. |
| date_end | DateTime | 조정 규칙이 더 이상 적용되지 않는 날짜와 시간. |
| daylight_delta | TimeSpan | 시간대의 일광 절약 시간을 형성하는 데 필요한 시간 양. |
| daylight_transition_start | const TransitionTime\& | 일광 절약 시간에서 표준 시간으로 전환에 대한 정보. |
| daylight_transition_end | const TransitionTime\& | 표준 시간에서 일광 절약 시간으로 전환에 대한 정보. |

### ReturnValue

설명된 시간대 조정 규칙을 나타내는 [AdjustmentRule](../) 클래스의 인스턴스.

## 또 보기

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


지정된 매개변수로 설명된 시간 조정 규칙을 나타내는 [AdjustmentRule](../) 클래스의 인스턴스를 생성합니다.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| date_start | DateTime | 조정 규칙이 적용되는 날짜와 시간. |
| date_end | DateTime | 조정 규칙이 더 이상 적용되지 않는 날짜와 시간. |
| daylight_delta | TimeSpan | 시간대의 일광 절약 시간을 형성하는 데 필요한 시간 양. |
| daylight_transition_start | const TransitionTime\& | 일광 절약 시간에서 표준 시간으로 전환에 대한 정보. |
| daylight_transition_end | const TransitionTime\& | 표준 시간에서 일광 절약 시간으로 전환에 대한 정보. |
| base_utc_offset_delta | TimeSpan | 기본 UTC 오프셋으로부터의 차이. |
| no_daylight_transitions | bool | 조정 규칙이 일광 절약 시간 전환을 가정하는지 지정합니다. |

### ReturnValue

설명된 시간대 조정 규칙을 나타내는 [AdjustmentRule](../) 클래스의 인스턴스.

## 또 보기

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
