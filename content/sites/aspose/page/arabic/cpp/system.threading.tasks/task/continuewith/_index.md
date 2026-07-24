---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Tasks::Task::ContinueWith method. ينشئ متابعة تُنفّذ عندما تكتمل المهمة في C++."
type: docs
weight: 700
url: /ar/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


ينشئ استمرارًا يتم تنفيذه عندما تنتهي المهمة.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) للتنفيذ عندما تكتمل هذه المهمة |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
