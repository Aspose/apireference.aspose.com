---
title: "System::Threading::Tasks::WaitAll method"
linktitle: "WaitAll"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::WaitAll 方法。等待所有提供的 Task 对象在 C++ 中完成执行。"
type: docs
weight: 2000
url: /zh/cpp/system.threading.tasks/waitall/
---
## System::Threading::Tasks::WaitAll(const ArrayPtr\<TaskPtr\>\&) method


等待所有提供的 [Task](../task/) 对象完成执行。

```cpp
void System::Threading::Tasks::WaitAll(const ArrayPtr<TaskPtr> &tasks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | 一个需要等待的 [Task](../task/) 实例数组。 |

## 另见

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAll(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


等待所有提供的 [Task](../task/) 对象完成执行。

```cpp
void System::Threading::Tasks::WaitAll(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | 一个需要等待的 [Task](../task/) 实例数组。 |
| cancellationToken | const CancellationToken\& | 在等待任务完成期间要观察的 [CancellationToken](../../system.threading/cancellationtoken/)。 |

## 另见

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
