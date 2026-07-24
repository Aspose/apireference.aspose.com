---
title: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule 메서드"
linktitle: "CreateFloatingDateRule"
second_title: "C++용 Aspose.Page"
description: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule 메서드. 특정 월의 특정 주의 특정 요일에 발생하는 시간 변경을 나타내는 플로팅 날짜 규칙을 표현하는 TransitionTime 클래스의 인스턴스를 C++에서 생성합니다."
type: docs
weight: 1100
url: /ko/cpp/system/timezoneinfo/transitiontime/createfloatingdaterule/
---
## TransitionTime::CreateFloatingDateRule method


[TransitionTime](../) 클래스를 생성하여 플로팅 날짜 규칙(특정 월의 특정 주의 특정 요일에 발생하는 시간 변경)을 나타냅니다.

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule(DateTime time_of_day, int month, int week, DayOfWeek day_of_week)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| time_of_day | DateTime | 시간 변경이 발생하는 특정 시간. |
| 월 | int | 시간 변경이 발생하는 연도의 월. |
| week | int | 시간 변경이 발생하는 해당 월의 주. |
| day_of_week | DayOfWeek | 시간 변경이 발생하는 요일. |

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
