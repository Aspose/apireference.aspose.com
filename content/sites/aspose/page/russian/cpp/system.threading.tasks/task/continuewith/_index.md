---
title: "System::Threading::Tasks::Task::ContinueWith метод"
linktitle: "ContinueWith"
second_title: "Aspose.Page для C++"
description: "System::Threading::Tasks::Task::ContinueWith метод. Создаёт продолжение, которое выполняется после завершения задачи в C++."
type: docs
weight: 700
url: /ru/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Создаёт продолжение, которое выполняется, когда задача завершается.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) для выполнения, когда эта задача завершится |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## См. также

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
