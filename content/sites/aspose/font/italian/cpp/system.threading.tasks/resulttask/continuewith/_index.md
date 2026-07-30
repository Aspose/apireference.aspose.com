---
title: "Metodo System::Threading::Tasks::ResultTask::ContinueWith"
linktitle: "ContinueWith"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith metodo. Crea una continuazione che viene eseguita quando il result task è completato in C++."
type: docs
weight: 400
url: /it/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith(const Action\<RTaskPtr\<T\>\>\&) method


Crea una continuazione che viene eseguita quando il task di risultato completa.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) da eseguire quando questo task è completato, ricevendo questo result task |

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
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Action\<TaskPtr\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<RTaskPtr\<T\>, TNewResult\>\&) method


Crea una continuazione che viene eseguita quando il task di risultato completa.

```cpp
template<typename TNewResult> RTaskPtr<TNewResult> System::Threading::Tasks::ResultTask<T>::ContinueWith(const Func<RTaskPtr<T>, TNewResult> &continuationFunction)
```


| Parametro | Descrizione |
| --- | --- |
| TNewResult | Tipo di risultato della continuazione del task |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continuationFunction | const Func\<RTaskPtr\<T\>, TNewResult\>\& | Funzione per ottenere il risultato della continuazione quando questo task è completato, ricevendo questo result task |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation
## Osservazioni



La funzione di continuazione riceve questo [ResultTask](../) per accedere al valore del risultato

## Vedi anche

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
