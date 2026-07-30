---
title: "Méthode System::Threading::Tasks::Delay"
linktitle: "Délai"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::Tasks::Delay. Crée une tâche qui se termine après un délai temporel en C++."
type: docs
weight: 1000
url: /fr/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


Crée une tâche qui se termine après un délai temporel.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| millisecondsDelay | int32_t | Le nombre de millisecondes à attendre avant de terminer la tâche renvoyée, ou -1 pour attendre indéfiniment. |

### ReturnValue

Une tâche qui représente le délai temporel.

## Voir aussi

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method


Crée une tâche qui se termine après un délai temporel et qui peut être annulée.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| millisecondsDelay | int32_t | Le nombre de millisecondes à attendre avant de terminer la tâche renvoyée, ou -1 pour attendre indéfiniment. |
| cancellationToken | const CancellationToken\& | Le jeton d'annulation qui peut être utilisé pour annuler le délai. |

### ReturnValue

Une tâche qui représente le délai temporel.

## Voir aussi

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
