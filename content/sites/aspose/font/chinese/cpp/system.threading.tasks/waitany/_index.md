---
title: "System::Threading::Tasks::WaitAny 方法"
linktitle: "WaitAny"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::WaitAny 方法。 在 C++ 中，等待提供的任何 Task 对象完成执行。"
type: docs
weight: 2200
url: /zh/cpp/system.threading.tasks/waitany/
---
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&) method


等待提供的任意 [Task](../task/) 对象完成执行。

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | 一个需要等待的 [Task](../task/) 实例数组。 |

### ReturnValue

已完成任务在 tasks 数组中的索引。

## 另见

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


等待提供的任意 [Task](../task/) 对象完成执行。

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | 一个需要等待的 [Task](../task/) 实例数组。 |
| cancellationToken | const CancellationToken\& | 在等待任务完成期间要观察的 [CancellationToken](../../system.threading/cancellationtoken/)。 |

### ReturnValue

已完成任务在 tasks 数组中的索引。

## 另见

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
