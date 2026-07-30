---
title: "Constructeur System::Threading::Tasks::ValueTask::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Threading::Tasks::ValueTask::ValueTask. Construit un ValueTask vide et non initialisé en C++."
type: docs
weight: 100
url: /fr/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Construit un [ValueTask](../) vide et non initialisé.

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Remarques



La tâche n'est pas terminée et ne contient aucun résultat. Tenter d'obtenir le résultat lèvera une exception.

## Voir aussi

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Construit un [ValueTask](../) à partir d'un pointeur partagé vers un [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tâche | const TaskPtr\& | La tâche à encapsuler. Peut être nulle pour une tâche vide. |
## Remarques



Le [ValueTask](../) représentera l'état de la tâche fournie.

## Voir aussi

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
