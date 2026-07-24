---
title: "System::Threading::Timer::Change 메서드"
linktitle: "변경"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Timer::Change 메서드. C++에서 타이머를 다시 예약하거나 취소합니다."
type: docs
weight: 200
url: /ko/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


타이머를 다시 예약하거나 취소합니다.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) 다음 콜백 함수 호출 전까지, 밀리초 단위; 음수 값은 타이머가 예약되어 있어도 취소합니다. |
| period | int64_t | [Timeout](../../timeout/) 연속적인 콜백 함수 호출 사이, 밀리초 단위; 0 이하 값은 타이머가 한 번만 실행됨을 의미합니다. |

## 또 보기

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


타이머를 다시 예약하거나 취소합니다.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) 다음 콜백 함수 호출 전; 음수 값은 타이머가 예약되어 있어도 취소합니다. |
| period | System::TimeSpan | [Timeout](../../timeout/) 연속적인 콜백 함수 호출 사이; 0 이하 값은 타이머가 한 번만 실행됨을 의미합니다. |

## 또 보기

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
