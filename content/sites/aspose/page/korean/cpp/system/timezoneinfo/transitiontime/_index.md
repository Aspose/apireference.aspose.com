---
title: "System::TimeZoneInfo::TransitionTime 클래스"
linktitle: "TransitionTime"
second_title: "C++용 Aspose.Page"
description: "System::TimeZoneInfo::TransitionTime 클래스. C++에서 RTTI 정보."
type: docs
weight: 3400
url: /ko/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


RTTI 정보.

```cpp
class TransitionTime
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | [TransitionTime](./) 클래스의 인스턴스를 생성합니다. 이 클래스는 고정 날짜 규칙(특정 월의 특정 일에 발생하는 시간 변경)을 나타냅니다. |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | [TransitionTime](./) 클래스의 인스턴스를 생성합니다. 이 클래스는 부동 날짜 규칙(특정 월의 특정 주의 특정 일에 발생하는 시간 변경)을 나타냅니다. |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | [TransitionTime](./) 클래스의 인스턴스를 생성합니다. 지정된 매개변수로 설명된 시간 변경을 나타냅니다. |
| [get_Day](./get_day/)() const | 시간 변경이 발생하는 요일의 서수 번호를 반환합니다. |
| [get_DayOfWeek](./get_dayofweek/)() const | 시간 변경이 발생하는 요일을 나타내는 값을 반환합니다. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | 시간 변경이 고정 날짜 및 시간에 발생하는지, 부동 날짜 및 시간에 발생하는지를 나타내는 값을 반환합니다. |
| [get_Month](./get_month/)() const | 시간 변경이 발생하는 연도의 월에 대한 서수 번호를 반환합니다. |
| [get_TimeOfDay](./get_timeofday/)() const | 시간 변경이 발생하는 특정 시간을 나타내는 [DateTime](../../datetime/) 객체를 반환합니다. |
| [get_Week](./get_week/)() const | 시간 변경이 발생하는 월의 주에 대한 서수 번호를 반환합니다. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | 기본 생성자. 내부 사용 전용. |
## 비고


시간대의 시간 변경에 대한 정보를 제공합니다.
## 또 보기

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
