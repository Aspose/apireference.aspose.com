---
title: "System::Threading::Tasks::WaitAny méthode"
linktitle: "AttendreN'importeLequel"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::WaitAny méthode. Attend que l'un des objets Task fournis termine son exécution en C++."
type: docs
weight: 2200
url: /fr/cpp/system.threading.tasks/waitany/
---
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&) method


Attend que l'un des objets [Task](../task/) fournis termine son exécution.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Un tableau d'instances [Task](../task/) sur lesquelles attendre. |

### ReturnValue

L'index de la tâche terminée dans le tableau des tâches.

## Voir aussi

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


Attend que l'un des objets [Task](../task/) fournis termine son exécution.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Un tableau d'instances [Task](../task/) sur lesquelles attendre. |
| cancellationToken | const CancellationToken\& | Un [CancellationToken](../../system.threading/cancellationtoken/) à observer pendant l'attente de la fin des tâches. |

### ReturnValue

L'index de la tâche terminée dans le tableau des tâches.

## Voir aussi

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
