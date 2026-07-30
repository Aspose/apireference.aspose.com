---
title: "System::Threading::Timer::Timer 构造函数"
linktitle: "Timer"
second_title: "Aspose.Font 适用于 C++"
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


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | TimerCallback | 计时器调用的函数。 |

## 另见

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


构造函数。

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | TimerCallback | 计时器调用的函数。 |
| state | const System::SharedPtr\<System::Object\>\& | 回调函数参数。 |
| dueTime | int64_t | 首次调用回调函数之前的 [Timeout](../../timeout/)，单位为毫秒；负值不会在创建后安排计时器，因此可以稍后重新安排。 |
| period | int64_t | [Timeout](../../timeout/) 在回调函数连续调用之间的时间（毫秒）；非正值表示计时器只会执行一次。 |

## 另见

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


构造函数。

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | TimerCallback | 计时器调用的函数。 |
| state | const System::SharedPtr\<System::Object\>\& | 回调函数参数。 |
| dueTime | System::TimeSpan | 首次调用回调函数之前的 [Timeout](../../timeout/)；负值不会在创建后安排计时器，因此可以稍后重新安排。 |
| period | System::TimeSpan | [Timeout](../../timeout/) 在回调函数连续调用之间的时间；非正值表示计时器只会执行一次。 |

## 另见

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
