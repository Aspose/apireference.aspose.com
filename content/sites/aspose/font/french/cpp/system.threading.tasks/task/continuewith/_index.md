---
title: "System::Threading::Tasks::Task::ContinueWith méthode"
linktitle: "ContinueWith"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::Task::ContinueWith méthode. Crée une continuation qui s'exécute lorsque la tâche se termine en C++."
type: docs
weight: 800
url: /fr/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith(const Action\<TaskPtr\>\&) method


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
* Library [Aspose.Font for C++](../../../)
## Task::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


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
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
