---
title: "System::Threading::Tasks::ResultTask::ContinueWith méthode"
linktitle: "ContinueWith"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith méthode. Crée une continuation qui s'exécute lorsque la tâche de résultat se termine en C++."
type: docs
weight: 400
url: /fr/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith(const Action\<RTaskPtr\<T\>\>\&) method


Crée une continuation qui s'exécute lorsque la tâche de résultat se termine.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) à exécuter lorsque cette tâche se termine, en recevant cette tâche de résultat |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Remarques



L'action de continuation reçoit ce [ResultTask](../) pour accéder à la valeur du résultat

## Voir aussi

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Action\<TaskPtr\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<RTaskPtr\<T\>, TNewResult\>\&) method


Crée une continuation qui s'exécute lorsque la tâche de résultat se termine.

```cpp
template<typename TNewResult> RTaskPtr<TNewResult> System::Threading::Tasks::ResultTask<T>::ContinueWith(const Func<RTaskPtr<T>, TNewResult> &continuationFunction)
```


| Paramètre | Description |
| --- | --- |
| TNewResult | Type de résultat de la continuation de tâche |

| Paramètre | Type | Description |
| --- | --- | --- |
| continuationFunction | const Func\<RTaskPtr\<T\>, TNewResult\>\& | Fonction pour obtenir le résultat de continuation lorsque cette tâche se termine, en recevant cette tâche de résultat |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation
## Remarques



La fonction de continuation reçoit ce [ResultTask](../) pour accéder à la valeur du résultat

## Voir aussi

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


Crée une continuation qui s'exécute lorsque la tâche se termine.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Task::ContinueWith(const Func<TaskPtr, TResult> &continuationFunction)
```


| Paramètre | Description |
| --- | --- |
| TResult | Un type de résultat de tâche |

| Paramètre | Type | Description |
| --- | --- | --- |
| continuationFunction | const Func\<TaskPtr, TResult\>\& | Fonction pour obtenir le résultat lorsque cette tâche se termine |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation

## Voir aussi

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
