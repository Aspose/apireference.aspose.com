---
title: "System::Threading::Tasks::Task classe"
linktitle: "Task"
second_title: "Aspose.Page pour C++"
description: "System::Threading::Tasks::Task classe. Représente une opération asynchrone qui peut être attendue et composée avec d'autres tâches en C++."
type: docs
weight: 300
url: /fr/cpp/system.threading.tasks/task/
---
## Task class


Représente une opération asynchrone qui peut être attendue et composée avec d'autres tâches.

```cpp
class Task : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | Active la tâche pour son exécution sur un planificateur. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | Ajoute une action de continuation à exécuter lors de l'achèvement. |
| [Complete](./complete/)() | Marque la tâche comme terminée et finalise la tâche. |
| [ConfigureAwait](./configureawait/)(bool) const | Configure la façon dont les attentes sur cette tâche doivent se comporter concernant la capture du contexte. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Crée une continuation qui s'exécute lorsque la tâche se termine. |
| [Dispose](./dispose/)() override | Libère les ressources associées à la tâche. |
| [Execute](./execute/)() | Exécute la fonction de la tâche. |
| [get_AsyncState](./get_asyncstate/)() const | Obtient l'objet d'état défini par l'utilisateur associé à la tâche. |
| static [get_CompletedTask](./get_completedtask/)() | Obtient une tâche terminée (singleton) |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | Obtient l'ID de la tâche. |
| [get_IsCanceled](./get_iscanceled/)() const | Obtient si la tâche s'est terminée en raison d'une annulation. |
| [get_IsCompleted](./get_iscompleted/)() const | Obtient si la tâche est terminée. |
| [get_IsFaulted](./get_isfaulted/)() const | Obtient si la tâche s'est terminée en raison d'une exception non gérée. |
| [get_Scheduler](./get_scheduler/)() const | Obtient le planificateur associé à cette tâche. |
| [get_Status](./get_status/)() const | Obtient l'état actuel de la tâche. |
| [GetAwaiter](./getawaiter/)() const | Obtient un awaiter pour cette tâche à utiliser avec Await. |
| [RunSynchronously](./runsynchronously/)() | Exécute la tâche de manière synchrone sur le thread actuel. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Exécute la tâche de manière synchrone en utilisant le planificateur spécifié. |
| [set_Function](./set_function/)(const FunctionT\&) | Définit la fonction interne à exécuter. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | Définit le planificateur associé à cette tâche. |
| [set_Status](./set_status/)(TaskStatus) | Définit l'état de la tâche. |
| [Start](./start/)() | Démarre l'exécution de la tâche en utilisant le planificateur par défaut. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Démarre l'exécution de la tâche en utilisant le planificateur spécifié. |
| [Task](./task/)(const Action<>\&) | Construit un [Task](./) avec une action à exécuter. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Construit un [Task](./) avec une action et un jeton d'annulation. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Construit un [Task](./) avec une action avec état et un objet d'état. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Construit un [Task](./) avec une action avec état, un état et un jeton d'annulation. |
| [Task](./task/)() | Constructeur interne pour créer des tâches non initialisées. |
| [Wait](./wait/)(const CancellationToken\&) const | Attend que la tâche se termine avec prise en charge de l'annulation. |
| [Wait](./wait/)() const | Attend que la tâche se termine. |
| [~Task](./~task/)() | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [FunctionT](./functiont/) | Implémentation interne. Pas pour le code utilisateur. |
## Remarques


Fournit une implémentation C++ similaire à [System.Threading.Tasks.Task](./) en .NET, prenant en charge l'annulation, les continuations et les modèles async/await.
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
