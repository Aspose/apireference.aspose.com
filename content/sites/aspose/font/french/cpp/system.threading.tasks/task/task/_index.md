---
title: "constructeur System::Threading::Tasks::Task::Task"
linktitle: "Tâche"
second_title: "Aspose.Font pour C++"
description: "constructeur System::Threading::Tasks::Task::Task. Constructeur interne pour créer des tâches non initialisées en C++."
type: docs
weight: 100
url: /fr/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


Constructeur interne pour créer des tâches non initialisées.

```cpp
System::Threading::Tasks::Task::Task()
```

## Voir aussi

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


Construit un [Task](../) avec une action d'état et un objet d'état.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | L'action à exécuter (accepte l'objet d'état) |
| état | const SharedPtr\<Object\>\& | Objet d'état défini par l'utilisateur passé à l'action |

## Voir aussi

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


Construit un [Task](../) avec une action d'état, un état et un jeton d'annulation.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | L'action à exécuter (accepte l'objet d'état) |
| état | const SharedPtr\<Object\>\& | Objet d'état défini par l'utilisateur passé à l'action |
| cancellationToken | const CancellationToken\& | Jeton pour surveiller les demandes d'annulation |

## Voir aussi

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&) constructor


Construit un [Task](../) avec une action à exécuter.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| action | const Action<>\& | L'action à exécuter de manière asynchrone |

## Voir aussi

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


Construit un [Task](../) avec une action et un jeton d'annulation.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| action | const Action<>\& | L'action à exécuter de manière asynchrone |
| cancellationToken | const CancellationToken\& | Jeton pour surveiller les demandes d'annulation |

## Voir aussi

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
