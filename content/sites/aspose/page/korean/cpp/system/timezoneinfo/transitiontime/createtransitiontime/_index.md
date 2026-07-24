---
title: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime 메서드"
linktitle: "CreateTransitionTime"
second_title: "C++용 Aspose.Page"
description: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime 메서드. C++에서 지정된 매개변수로 설명된 시간 변경을 나타내는 TransitionTime 클래스의 인스턴스를 생성합니다."
type: docs
weight: 1200
url: /ko/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


지정된 매개변수로 설명된 시간 변경을 나타내는 [TransitionTime](../) 클래스의 인스턴스를 생성합니다.

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| time_of_day | DateTime | 시간 변경이 발생하는 특정 시간. |
| 월 | int | 시간 변경이 발생하는 연도의 월. |
| week | int | 시간 변경이 발생하는 해당 월의 주. |
| 일 | int | 시간 변경이 발생하는 날짜. |
| day_of_week | DayOfWeek | 시간 변경이 발생하는 요일. |
| is_fixed_date_rule | bool | 시간 변경이 고정된 날짜와 시간에 발생하는지 혹은 가변적인 날짜와 시간에 발생하는지를 나타내는 값. |

### ReturnValue

[TransitionTime](../) 클래스의 인스턴스로, 설명된 시간 변경을 나타냅니다.

## 또 보기

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
