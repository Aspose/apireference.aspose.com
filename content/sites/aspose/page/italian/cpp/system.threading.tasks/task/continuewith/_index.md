---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page per C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Crea una continuazione che viene eseguita quando il task è completato in C++."
type: docs
weight: 700
url: /it/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Crea una continuazione che viene eseguita quando il task si completa.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) da eseguire quando questo task è completato |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
