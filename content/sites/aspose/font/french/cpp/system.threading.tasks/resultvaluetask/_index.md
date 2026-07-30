---
title: "Classe System::Threading::Tasks::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::Tasks::ResultValueTask. Représente un type hybride similaire à une tâche qui peut encapsuler soit une valeur de résultat directe, soit un ResultTask<T> en C++."
type: docs
weight: 500
url: /fr/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Représente un type hybride similaire à une tâche qui peut encapsuler soit une valeur de résultat directe, soit un [ResultTask<T>](../resulttask/).

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Paramètre | Description |
| --- | --- |
| T | Le type du résultat produit par la tâche. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [AsTask](./astask/)() const | Convertit ce [ResultValueTask](./) en un pointeur partagé vers [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Configure un awaiter pour cette tâche. |
| [Equals](./equals/)(ResultValueTask) override | Détermine si cette instance est égale à une autre instance de [ResultValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Détermine si cette instance est égale à un autre objet. |
| [get_IsCanceled](./get_iscanceled/)() const | Obtient une valeur indiquant si la tâche s'est terminée en raison d'une annulation. |
| [get_IsCompleted](./get_iscompleted/)() const | Obtient une valeur indiquant si la tâche est terminée. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Obtient une valeur indiquant si la tâche s'est terminée avec succès. |
| [get_IsFaulted](./get_isfaulted/)() const | Obtient une valeur indiquant si la tâche s'est terminée à cause d'une exception non gérée. |
| [get_Result](./get_result/)() | Obtient le résultat de la tâche terminée. |
| [GetAwaiter](./getawaiter/)() const | Obtient un awaiter pour cette tâche afin de prendre en charge les expressions await. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Opérateur d'inégalité pour [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Opérateur d'égalité pour [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Construit un [ResultValueTask](./) vide et non initialisé. |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Construit un [ResultValueTask](./) terminé avec le résultat spécifié. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Construit un [ResultValueTask](./) à partir d'un pointeur partagé vers un [ResultTask<T>](../resulttask/). |
## Remarques


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Voir aussi

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
