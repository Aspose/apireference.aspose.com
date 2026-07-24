---
title: "System::Threading::Tasks::Delay 方法"
linktitle: "延迟"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::Delay 方法。创建一个在 C++ 中经过时间延迟后完成的任务。"
type: docs
weight: 700
url: /zh/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


创建一个在时间延迟后完成的任务。

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| millisecondsDelay | int32_t | 在完成返回的任务之前等待的毫秒数，或使用 -1 表示无限期等待。 |

### ReturnValue

表示时间延迟的任务。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method




```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
