---
title: "System::Threading::Tasks::ResultTask::ContinueWith metodo"
linktitle: "ContinueWith"
second_title: "Aspose.Page per C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith method. Crea una continuazione che viene eseguita quando il task di risultato termina in C++."
type: docs
weight: 300
url: /it/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Crea una continuazione che viene eseguita quando il result task completa.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) da eseguire quando questo task termina, ricevendo questo task di risultato |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Osservazioni



L'azione di continuazione riceve questo [ResultTask](../) per accedere al valore del risultato

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
