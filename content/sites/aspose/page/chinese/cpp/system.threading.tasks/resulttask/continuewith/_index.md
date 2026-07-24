---
title: "System::Threading::Tasks::ResultTask::ContinueWith 方法"
linktitle: "ContinueWith"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith 方法。创建一个在结果任务完成时执行的后续操作，使用 C++。"
type: docs
weight: 300
url: /zh/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


创建一个在结果任务完成时执行的延续。

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) 在此任务完成时执行，接收此结果任务。 |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## 备注



后续操作接收此 [ResultTask](../) 以访问结果值。

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
