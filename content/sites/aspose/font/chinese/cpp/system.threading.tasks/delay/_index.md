---
title: "System::Threading::Tasks::Delay 方法"
linktitle: "Delay"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::Delay 方法。创建一个在 C++ 中在时间延迟后完成的任务。"
type: docs
weight: 1000
url: /zh/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


创建一个在时间延迟后完成的任务。

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| millisecondsDelay | int32_t | 在完成返回的任务之前等待的毫秒数，或 -1 表示无限等待。 |

### ReturnValue

表示时间延迟的任务。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method


创建一个在时间延迟后完成且可被取消的任务。

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| millisecondsDelay | int32_t | 在完成返回的任务之前等待的毫秒数，或 -1 表示无限等待。 |
| cancellationToken | const CancellationToken\& | 可用于取消延迟的取消令牌。 |

### ReturnValue

表示时间延迟的任务。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
