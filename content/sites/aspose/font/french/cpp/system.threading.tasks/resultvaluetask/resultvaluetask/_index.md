---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask constructeur"
linktitle: "ResultValueTask"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask constructeur. Construit un ResultValueTask vide et non initialisé en C++."
type: docs
weight: 100
url: /fr/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


Construit un [ResultValueTask](../) vide et non initialisé.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## Remarques



La tâche n'est pas terminée et ne contient aucun résultat. Tenter d'obtenir le résultat lèvera une exception.

## Voir aussi

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


Construit un [ResultValueTask](../) à partir d'un pointeur partagé vers un [ResultTask<T>](../../resulttask/).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tâche | const RTaskPtr\<T\>\& | La tâche à encapsuler. Peut être nulle pour une tâche vide. |
## Remarques



Le [ResultValueTask](../) représentera l'état et le résultat de la tâche fournie.

## Voir aussi

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


Construit un [ResultValueTask](../) terminé avec le résultat spécifié.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| résultat | const T\& | La valeur du résultat à encapsuler dans une tâche terminée. |
## Remarques



Cela crée une tâche terminée avec succès qui renvoie immédiatement la valeur.

## Voir aussi

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
