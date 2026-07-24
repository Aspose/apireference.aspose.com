---
title: "System::Threading::Timer::Timer 构造函数"
linktitle: "Timer"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Timer::Timer 构造函数。C++ 中的构造函数。"
type: docs
weight: 100
url: /zh/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


构造函数。

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 回调 | TimerCallback | 计时器调用的函数。 |

## 另见

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


构造函数。

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 回调 | TimerCallback | 计时器调用的函数。 |
| 状态 | const System::SharedPtr\<System::Object\>\& | 回调函数参数。 |
| dueTime | int64_t | [Timeout](../../timeout/) 在首次回调函数调用之前的时间，单位为毫秒；负值在创建后不会调度定时器，以便稍后重新调度。 |
| period | int64_t | [Timeout](../../timeout/) 连续回调函数调用之间的间隔，单位为毫秒；非正值表示定时器只应执行一次。 |

## 另见

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


构造函数。

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 回调 | TimerCallback | 计时器调用的函数。 |
| 状态 | const System::SharedPtr\<System::Object\>\& | 回调函数参数。 |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) 在首次回调函数调用之前的时间；负值在创建后不会调度定时器，以便稍后重新调度。 |
| period | System::TimeSpan | [Timeout](../../timeout/) 连续回调函数调用之间的间隔；非正值表示定时器只应执行一次。 |

## 另见

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
