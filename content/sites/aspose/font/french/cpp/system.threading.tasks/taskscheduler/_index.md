---
title: "Classe System::Threading::Tasks::TaskScheduler"
linktitle: "TaskScheduler"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::Tasks::TaskScheduler. Représente un objet qui gère le travail de bas niveau consistant à mettre en file d'attente des tâches sur des threads en C++."
type: docs
weight: 700
url: /fr/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


Représente un objet qui gère le travail de bas niveau de mise en file d'attente des tâches sur les threads.

```cpp
class TaskScheduler : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | Crée un [TaskScheduler](./) associé au thread actuel. |
| static [get_Current](./get_current/)() | Obtient le [TaskScheduler](./) associé à la tâche en cours d'exécution. |
| static [get_Default](./get_default/)() | Obtient l'instance par défaut de [TaskScheduler](./) fournie par le framework. |
| [get_Id](./get_id/)() const | Obtient l'ID unique de ce [TaskScheduler](./). |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | Indique le niveau maximal de concurrence que ce [TaskScheduler](./) peut prendre en charge. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
