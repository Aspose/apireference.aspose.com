---
title: "System::Threading::Tasks::Run méthode"
linktitle: "Exécuter"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::Run méthode. Met en file d'attente le travail spécifié pour s'exécuter dans le pool de threads et renvoie un handle de Task pour ce travail en C++."
type: docs
weight: 1600
url: /fr/cpp/system.threading.tasks/run/
---
## System::Threading::Tasks::Run(const Action<>\&) method


Met en file d'attente le travail spécifié pour s'exécuter dans le pool de threads et renvoie un handle de [Task](../task/) pour ce travail.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| action | const Action<>\& | Le travail à exécuter de manière asynchrone. |

### ReturnValue

Un [Task](../task/) qui représente le travail mis en file d'attente pour s'exécuter dans le pool de threads.

## Voir aussi

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Action<>\&, const CancellationToken\&) method


Met en file d'attente le travail spécifié pour s'exécuter dans le pool de threads et renvoie un handle de [Task](../task/) pour ce travail.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action, const CancellationToken &cancellationToken)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| action | const Action<>\& | Le travail à exécuter de manière asynchrone. |
| cancellationToken | const CancellationToken\& | Un jeton d'annulation qui peut être utilisé pour annuler le travail s'il n'a pas encore commencé. |

### ReturnValue

Un [Task](../task/) qui représente le travail mis en file d'attente pour s'exécuter dans le pool de threads.

## Voir aussi

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TaskPtr\>\&) method


Met en file d'attente le travail spécifié pour s'exécuter dans le pool de threads et renvoie un proxy pour le [Task](../task/) renvoyé par la fonction.

```cpp
TaskPtr System::Threading::Tasks::Run(const Func<TaskPtr> &function)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| function | const Func\<TaskPtr\>\& | Le travail à exécuter de manière asynchrone, qui renvoie un [Task](../task/). |

### ReturnValue

Un [Task](../task/) qui représente un proxy pour le [Task](../task/) renvoyé par la fonction.

## Voir aussi

* Typedef [TaskPtr](../../system/taskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TResult\>\&) method


Met en file d'attente le travail spécifié pour s'exécuter dans le pool de threads et renvoie un handle [Task<TResult>](../task/) pour ce travail.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Run(const Func<TResult> &function)
```


| Paramètre | Description |
| --- | --- |
| TResult | Le type du résultat renvoyé par la tâche. |

| Paramètre | Type | Description |
| --- | --- | --- |
| fonction | const Func\<TResult\>\& | Le travail à exécuter de manière asynchrone. |

### ReturnValue

Un [Task<TResult>](../task/) qui représente le travail mis en file d'attente pour s'exécuter dans le pool de threads.

## Voir aussi

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
