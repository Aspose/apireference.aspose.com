---
title: "System::Threading::Tasks::Task::ContinueWith metodo"
linktitle: "ContinueWith"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::Task::ContinueWith metodo. Crea una continuazione che viene eseguita quando il task è completato in C++."
type: docs
weight: 800
url: /it/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith(const Action\<TaskPtr\>\&) method


Crea una continuazione che viene eseguita quando il task completa.

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
* Library [Aspose.Font for C++](../../../)
## Task::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


Crea una continuazione che viene eseguita quando il task completa.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Task::ContinueWith(const Func<TaskPtr, TResult> &continuationFunction)
```


| Parametro | Descrizione |
| --- | --- |
| TResult | Un tipo di risultato del task |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continuationFunction | const Func\<TaskPtr, TResult\>\& | Funzione per ottenere il risultato quando questo task termina |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation

## Vedi anche

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
