---
title: "System::Threading::Timer::Change 方法"
linktitle: "更改"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Timer::Change 方法。重新调度或取消计时器（在 C++ 中）。"
type: docs
weight: 200
url: /zh/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


重新调度或取消计时器。

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) 在下一次调用回调函数之前的时间（毫秒）；负值即使计时器已被调度也会取消计时器。 |
| period | int64_t | [Timeout](../../timeout/) 在回调函数连续调用之间的时间（毫秒）；非正值表示计时器只会执行一次。 |

## 另见

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


重新调度或取消计时器。

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) 在下一次调用回调函数之前的时间；负值即使计时器已被调度也会取消计时器。 |
| period | System::TimeSpan | [Timeout](../../timeout/) 在回调函数连续调用之间的时间；非正值表示计时器只会执行一次。 |

## 另见

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
