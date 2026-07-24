---
title: "System::Threading::Tasks::ResultTask::ContinueWith méthode"
linktitle: "ContinueWith"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Threading::Tasks::ResultTask::ContinueWith. Crée une continuation qui s'exécute lorsque la tâche de résultat se termine en C++."
type: docs
weight: 300
url: /fr/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


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
* Library [Aspose.Page for C++](../../../)
