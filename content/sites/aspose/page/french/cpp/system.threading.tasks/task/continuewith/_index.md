---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page pour C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Crée une continuation qui s'exécute lorsque la tâche se termine en C++."
type: docs
weight: 700
url: /fr/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Crée une continuation qui s'exécute lorsque la tâche se termine.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) à exécuter lorsque cette tâche se termine |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Voir aussi

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
