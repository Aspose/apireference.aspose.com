---
title: "System::Threading::Tasks::Task::ContinueWith 方法"
linktitle: "ContinueWith"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::Task::ContinueWith 方法。创建一个在任务完成时执行的延续（C++）。"
type: docs
weight: 700
url: /zh/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


创建一个在任务完成时执行的后续操作。

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) 在此任务完成时执行 |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
