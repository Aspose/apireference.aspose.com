---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page para C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Crea una continuación que se ejecuta cuando la tarea se completa en C++."
type: docs
weight: 700
url: /es/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Crea una continuación que se ejecuta cuando la tarea se completa.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) para ejecutar cuando esta tarea se completa |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Ver también

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
