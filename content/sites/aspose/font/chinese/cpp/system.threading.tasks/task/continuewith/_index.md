---
title: "System::Threading::Tasks::Task::ContinueWith 方法"
linktitle: "ContinueWith"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::Task::ContinueWith 方法. 创建一个在任务完成时执行的后续操作（C++）。"
type: docs
weight: 800
url: /zh/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith(const Action\<TaskPtr\>\&) method


创建一个在任务完成时执行的延续。

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | 在此任务完成时执行的 [Action](../../../system/action/) |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


创建一个在任务完成时执行的延续。

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Task::ContinueWith(const Func<TaskPtr, TResult> &continuationFunction)
```


| 参数 | 描述 |
| --- | --- |
| TResult | 任务结果的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continuationFunction | const Func\<TaskPtr, TResult\>\& | 当此任务完成时获取结果的函数 |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation

## 另见

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
