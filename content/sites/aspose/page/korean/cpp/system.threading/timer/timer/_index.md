---
title: "System::Threading::Timer::Timer 생성자"
linktitle: "Timer"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Timer::Timer 생성자. C++에서 생성자입니다."
type: docs
weight: 100
url: /ko/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


생성자.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | TimerCallback | 타이머에 의해 호출되는 함수. |

## 또 보기

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


생성자.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | TimerCallback | 타이머에 의해 호출되는 함수. |
| 상태 | const System::SharedPtr\<System::Object\>\& | 콜백 함수 인수. |
| dueTime | int64_t | [Timeout](../../timeout/) 첫 번째 콜백 함수 호출 전까지, 밀리초 단위; 음수 값은 생성 후 타이머를 예약하지 않으며 나중에 다시 예약할 수 있습니다. |
| period | int64_t | [Timeout](../../timeout/) 연속적인 콜백 함수 호출 사이, 밀리초 단위; 0 이하 값은 타이머가 한 번만 실행됨을 의미합니다. |

## 또 보기

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


생성자.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | TimerCallback | 타이머에 의해 호출되는 함수. |
| 상태 | const System::SharedPtr\<System::Object\>\& | 콜백 함수 인수. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) 첫 번째 콜백 함수 호출 전; 음수 값은 생성 후 타이머를 예약하지 않으며 나중에 다시 예약할 수 있습니다. |
| period | System::TimeSpan | [Timeout](../../timeout/) 연속적인 콜백 함수 호출 사이; 0 이하 값은 타이머가 한 번만 실행됨을 의미합니다. |

## 또 보기

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
