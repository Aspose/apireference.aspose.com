---
title: "System::Threading::Tasks::ResultTask classe"
linktitle: "ResultTask"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::ResultTask classe. Une spécialisation de Task qui renvoie une valeur de résultat à la fin de l'exécution en C++."
type: docs
weight: 400
url: /fr/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Une spécialisation de [Task](../task/) qui renvoie une valeur de résultat à la fin de l'exécution.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Paramètre | Description |
| --- | --- |
| T | Le type de la valeur de résultat renvoyée par la tâche |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Complete](./complete/)(const T\&) | Définit la valeur de résultat pour la tâche et la termine. |
| [ConfigureAwait](./configureawait/)(bool) const | Configure la façon dont les await sur cette tâche de résultat doivent se comporter concernant la capture du contexte. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Crée une continuation qui s'exécute lorsque la tâche de résultat se termine. |
| [ContinueWith](./continuewith/)(const Func\<RTaskPtr\<T\>, TNewResult\>\&) | Crée une continuation qui s'exécute lorsque la tâche de résultat se termine. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Crée une continuation qui s'exécute lorsque la tâche se termine. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | Crée une continuation qui s'exécute lorsque la tâche se termine. |
| [get_Result](./get_result/)() | Obtient le résultat de l'opération asynchrone. |
| [GetAwaiter](./getawaiter/)() const | Obtient un awaiter pour cette tâche de résultat à utiliser avec Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Construit un [ResultTask](./) avec une fonction qui renvoie une valeur. |
| [ResultTask](./resulttask/)() | Implémentation interne. Pas pour le code utilisateur. |
| [ResultTask](./resulttask/)(const T\&) | Constructeur interne pour créer des tâches de résultat avec un résultat spécifié. |
| [set_Result](./set_result/)(const T\&) | Définit la valeur de résultat pour la tâche. |
## Remarques



Représente une opération asynchrone qui produit un résultat, similaire à [System.Threading.Tasks.Task<TResult>](../task/) dans .NET
## Voir aussi

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
