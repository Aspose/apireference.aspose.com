---
title: "System::Threading::Timer::Change 方法"
linktitle: "更改"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Timer::Change 方法。在 C++ 中重新调度或取消定时器。"
type: docs
weight: 200
url: /zh/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


重新调度或取消计时器。

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) 在下一次回调函数调用之前的时间，单位为毫秒；负值即使已调度也会取消定时器。 |
| period | int64_t | [Timeout](../../timeout/) 连续回调函数调用之间的间隔，单位为毫秒；非正值表示定时器只应执行一次。 |

## 另见

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


重新调度或取消计时器。

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) 在下一次回调函数调用之前的时间；负值即使已调度也会取消定时器。 |
| period | System::TimeSpan | [Timeout](../../timeout/) 连续回调函数调用之间的间隔；非正值表示定时器只应执行一次。 |

## 另见

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
