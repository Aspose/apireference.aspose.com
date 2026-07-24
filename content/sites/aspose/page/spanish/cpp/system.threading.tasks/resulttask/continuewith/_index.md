---
title: "System::Threading::Tasks::ResultTask::ContinueWith método"
linktitle: "ContinueWith"
second_title: "Aspose.Page para C++"
description: "Método System::Threading::Tasks::ResultTask::ContinueWith. Crea una continuación que se ejecuta cuando la tarea de resultado se completa en C++."
type: docs
weight: 300
url: /es/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Crea una continuación que se ejecuta cuando la tarea de resultado se completa.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) para ejecutar cuando esta tarea se completa, recibiendo esta tarea de resultado |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Observaciones



La acción de continuación recibe este [ResultTask](../) para acceder al valor del resultado

## Ver también

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
