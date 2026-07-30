---
title: "System::Threading::Tasks::ValueTask classe"
linktitle: "ValueTask"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::ValueTask classe. Fournit un résultat awaitable d'une opération asynchrone en C++."
type: docs
weight: 800
url: /fr/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


Fournit un résultat attendable d'une opération asynchrone.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AsTask](./astask/)() const | Convertit ce [ValueTask](./) en un pointeur partagé vers [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | Configure un awaiter pour cette tâche. |
| [Equals](./equals/)(ValueTask) override | Détermine si cette instance est égale à une autre instance de [ValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Détermine si cette instance est égale à un autre objet. |
| [get_IsCanceled](./get_iscanceled/)() const | Obtient une valeur indiquant si la tâche s'est terminée en raison d'une annulation. |
| [get_IsCompleted](./get_iscompleted/)() const | Obtient une valeur indiquant si la tâche est terminée. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Obtient une valeur indiquant si la tâche s'est terminée avec succès. |
| [get_IsFaulted](./get_isfaulted/)() const | Obtient une valeur indiquant si la tâche s'est terminée à cause d'une exception non gérée. |
| [GetAwaiter](./getawaiter/)() const | Obtient un awaiter pour cette tâche afin de prendre en charge les expressions await. |
| [operator!=](./operator!=/)(const ValueTask\&) const | Opérateur d'inégalité pour [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | Opérateur d'égalité pour [ValueTask](./). |
| [ValueTask](./valuetask/)() | Construit un [ValueTask](./) vide et non initialisé. |
| [ValueTask](./valuetask/)(const TaskPtr\&) | Construit un [ValueTask](./) à partir d'un pointeur partagé vers un [Task](../task/). |
## Voir aussi

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
